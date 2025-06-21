/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.Util;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.StreamSupport;
import javax.lang.model.element.Element;
import javax.lang.model.type.TypeMirror;

public final class CodeBlock {
    private static final Pattern NAMED_ARGUMENT = Pattern.compile("\\$(?<argumentName>[\\w_]+):(?<typeChar>[\\w]).*");
    private static final Pattern LOWERCASE = Pattern.compile("[a-z]+[\\w_]*");
    final List<String> formatParts;
    final List<Object> args;

    private CodeBlock(Builder builder) {
        this.formatParts = Util.immutableList(builder.formatParts);
        this.args = Util.immutableList(builder.args);
    }

    public boolean isEmpty() {
        return this.formatParts.isEmpty();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        return this.toString().equals(o.toString());
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        try {
            new CodeWriter(out).emit(this);
            return out.toString();
        } catch (IOException e) {
            throw new AssertionError();
        }
    }

    public static CodeBlock of(String format, Object ... args) {
        return new Builder().add(format, args).build();
    }

    public static CodeBlock join(Iterable<CodeBlock> codeBlocks, String separator) {
        return StreamSupport.stream(codeBlocks.spliterator(), false).collect(CodeBlock.joining(separator));
    }

    public static Collector<CodeBlock, ?, CodeBlock> joining(String separator) {
        return Collector.of(() -> new CodeBlockJoiner(separator, CodeBlock.builder()), CodeBlockJoiner::add, CodeBlockJoiner::merge, CodeBlockJoiner::join, new Collector.Characteristics[0]);
    }

    public static Collector<CodeBlock, ?, CodeBlock> joining(String separator, String prefix, String suffix) {
        Builder builder = CodeBlock.builder().add("$N", prefix);
        return Collector.of(() -> new CodeBlockJoiner(separator, builder), CodeBlockJoiner::add, CodeBlockJoiner::merge, (A joiner) -> {
            builder.add(CodeBlock.of("$N", suffix));
            return joiner.join();
        }, new Collector.Characteristics[0]);
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.formatParts.addAll(this.formatParts);
        builder.args.addAll(this.args);
        return builder;
    }

    private static final class CodeBlockJoiner {
        private final String delimiter;
        private final Builder builder;
        private boolean first = true;

        CodeBlockJoiner(String delimiter, Builder builder) {
            this.delimiter = delimiter;
            this.builder = builder;
        }

        CodeBlockJoiner add(CodeBlock codeBlock) {
            if (!this.first) {
                this.builder.add(this.delimiter, new Object[0]);
            }
            this.first = false;
            this.builder.add(codeBlock);
            return this;
        }

        CodeBlockJoiner merge(CodeBlockJoiner other) {
            CodeBlock otherBlock = other.builder.build();
            if (!otherBlock.isEmpty()) {
                this.add(otherBlock);
            }
            return this;
        }

        CodeBlock join() {
            return this.builder.build();
        }
    }

    public static final class Builder {
        final List<String> formatParts = new ArrayList<String>();
        final List<Object> args = new ArrayList<Object>();

        private Builder() {
        }

        public boolean isEmpty() {
            return this.formatParts.isEmpty();
        }

        public Builder addNamed(String format, Map<String, ?> arguments) {
            int p = 0;
            for (String argument : arguments.keySet()) {
                Util.checkArgument(LOWERCASE.matcher(argument).matches(), "argument '%s' must start with a lowercase character", argument);
            }
            while (p < format.length()) {
                int nextP = format.indexOf("$", p);
                if (nextP == -1) {
                    this.formatParts.add(format.substring(p));
                    break;
                }
                if (p != nextP) {
                    this.formatParts.add(format.substring(p, nextP));
                    p = nextP;
                }
                Matcher matcher = null;
                int colon = format.indexOf(58, p);
                if (colon != -1) {
                    int endIndex = Math.min(colon + 2, format.length());
                    matcher = NAMED_ARGUMENT.matcher(format.substring(p, endIndex));
                }
                if (matcher != null && matcher.lookingAt()) {
                    String argumentName = matcher.group("argumentName");
                    Util.checkArgument(arguments.containsKey(argumentName), "Missing named argument for $%s", argumentName);
                    char formatChar = matcher.group("typeChar").charAt(0);
                    this.addArgument(format, formatChar, arguments.get(argumentName));
                    this.formatParts.add("$" + formatChar);
                    p += matcher.regionEnd();
                    continue;
                }
                Util.checkArgument(p < format.length() - 1, "dangling $ at end", new Object[0]);
                Util.checkArgument(this.isNoArgPlaceholder(format.charAt(p + 1)), "unknown format $%s at %s in '%s'", Character.valueOf(format.charAt(p + 1)), p + 1, format);
                this.formatParts.add(format.substring(p, p + 2));
                p += 2;
            }
            return this;
        }

        public Builder add(String format, Object ... args) {
            boolean hasRelative = false;
            boolean hasIndexed = false;
            int relativeParameterCount = 0;
            int[] indexedParameterCount = new int[args.length];
            int p = 0;
            while (p < format.length()) {
                int index2;
                char c;
                if (format.charAt(p) != '$') {
                    int nextP = format.indexOf(36, p + 1);
                    if (nextP == -1) {
                        nextP = format.length();
                    }
                    this.formatParts.add(format.substring(p, nextP));
                    p = nextP;
                    continue;
                }
                int indexStart = ++p;
                do {
                    Util.checkArgument(p < format.length(), "dangling format characters in '%s'", format);
                } while ((c = format.charAt(p++)) >= '0' && c <= '9');
                int indexEnd = p - 1;
                if (this.isNoArgPlaceholder(c)) {
                    Util.checkArgument(indexStart == indexEnd, "$$, $>, $<, $[, $], $W, and $Z may not have an index", new Object[0]);
                    this.formatParts.add("$" + c);
                    continue;
                }
                if (indexStart < indexEnd) {
                    index2 = Integer.parseInt(format.substring(indexStart, indexEnd)) - 1;
                    hasIndexed = true;
                    if (args.length > 0) {
                        int n = index2 % args.length;
                        indexedParameterCount[n] = indexedParameterCount[n] + 1;
                    }
                } else {
                    index2 = relativeParameterCount++;
                    hasRelative = true;
                }
                Util.checkArgument(index2 >= 0 && index2 < args.length, "index %d for '%s' not in range (received %s arguments)", index2 + 1, format.substring(indexStart - 1, indexEnd + 1), args.length);
                Util.checkArgument(!hasIndexed || !hasRelative, "cannot mix indexed and positional parameters", new Object[0]);
                this.addArgument(format, c, args[index2]);
                this.formatParts.add("$" + c);
            }
            if (hasRelative) {
                Util.checkArgument(relativeParameterCount >= args.length, "unused arguments: expected %s, received %s", relativeParameterCount, args.length);
            }
            if (hasIndexed) {
                ArrayList<String> unused = new ArrayList<String>();
                for (int i = 0; i < args.length; ++i) {
                    if (indexedParameterCount[i] != 0) continue;
                    unused.add("$" + (i + 1));
                }
                String s2 = unused.size() == 1 ? "" : "s";
                Util.checkArgument(unused.isEmpty(), "unused argument%s: %s", s2, String.join((CharSequence)", ", unused));
            }
            return this;
        }

        private boolean isNoArgPlaceholder(char c) {
            return c == '$' || c == '>' || c == '<' || c == '[' || c == ']' || c == 'W' || c == 'Z';
        }

        private void addArgument(String format, char c, Object arg2) {
            switch (c) {
                case 'N': {
                    this.args.add(this.argToName(arg2));
                    break;
                }
                case 'L': {
                    this.args.add(this.argToLiteral(arg2));
                    break;
                }
                case 'S': {
                    this.args.add(this.argToString(arg2));
                    break;
                }
                case 'T': {
                    this.args.add(this.argToType(arg2));
                    break;
                }
                default: {
                    throw new IllegalArgumentException(String.format("invalid format string: '%s'", format));
                }
            }
        }

        private String argToName(Object o) {
            if (o instanceof CharSequence) {
                return o.toString();
            }
            if (o instanceof ParameterSpec) {
                return ((ParameterSpec)o).name;
            }
            if (o instanceof FieldSpec) {
                return ((FieldSpec)o).name;
            }
            if (o instanceof MethodSpec) {
                return ((MethodSpec)o).name;
            }
            if (o instanceof TypeSpec) {
                return ((TypeSpec)o).name;
            }
            throw new IllegalArgumentException("expected name but was " + o);
        }

        private Object argToLiteral(Object o) {
            return o;
        }

        private String argToString(Object o) {
            return o != null ? String.valueOf(o) : null;
        }

        private TypeName argToType(Object o) {
            if (o instanceof TypeName) {
                return (TypeName)o;
            }
            if (o instanceof TypeMirror) {
                return TypeName.get((TypeMirror)o);
            }
            if (o instanceof Element) {
                return TypeName.get(((Element)o).asType());
            }
            if (o instanceof Type) {
                return TypeName.get((Type)o);
            }
            throw new IllegalArgumentException("expected type but was " + o);
        }

        public Builder beginControlFlow(String controlFlow, Object ... args) {
            this.add(controlFlow + " {\n", args);
            this.indent();
            return this;
        }

        public Builder nextControlFlow(String controlFlow, Object ... args) {
            this.unindent();
            this.add("} " + controlFlow + " {\n", args);
            this.indent();
            return this;
        }

        public Builder endControlFlow() {
            this.unindent();
            this.add("}\n", new Object[0]);
            return this;
        }

        public Builder endControlFlow(String controlFlow, Object ... args) {
            this.unindent();
            this.add("} " + controlFlow + ";\n", args);
            return this;
        }

        public Builder addStatement(String format, Object ... args) {
            this.add("$[", new Object[0]);
            this.add(format, args);
            this.add(";\n$]", new Object[0]);
            return this;
        }

        public Builder addStatement(CodeBlock codeBlock) {
            return this.addStatement("$L", codeBlock);
        }

        public Builder add(CodeBlock codeBlock) {
            this.formatParts.addAll(codeBlock.formatParts);
            this.args.addAll(codeBlock.args);
            return this;
        }

        public Builder indent() {
            this.formatParts.add("$>");
            return this;
        }

        public Builder unindent() {
            this.formatParts.add("$<");
            return this;
        }

        public Builder clear() {
            this.formatParts.clear();
            this.args.clear();
            return this;
        }

        public CodeBlock build() {
            return new CodeBlock(this);
        }
    }
}

