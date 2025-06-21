/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;

public final class AnnotationSpec {
    public final TypeName type;
    public final Map<String, List<CodeBlock>> members;

    private AnnotationSpec(Builder builder) {
        this.type = builder.type;
        this.members = Util.immutableMultimap(builder.members);
    }

    void emit(CodeWriter codeWriter, boolean inline) throws IOException {
        String memberSeparator;
        String whitespace = inline ? "" : "\n";
        String string = memberSeparator = inline ? ", " : ",\n";
        if (this.members.isEmpty()) {
            codeWriter.emit("@$T", this.type);
        } else if (this.members.size() == 1 && this.members.containsKey("value")) {
            codeWriter.emit("@$T(", this.type);
            this.emitAnnotationValues(codeWriter, whitespace, memberSeparator, this.members.get("value"));
            codeWriter.emit(")");
        } else {
            codeWriter.emit("@$T(" + whitespace, this.type);
            codeWriter.indent(2);
            Iterator<Map.Entry<String, List<CodeBlock>>> i = this.members.entrySet().iterator();
            while (i.hasNext()) {
                Map.Entry<String, List<CodeBlock>> entry = i.next();
                codeWriter.emit("$L = ", entry.getKey());
                this.emitAnnotationValues(codeWriter, whitespace, memberSeparator, entry.getValue());
                if (!i.hasNext()) continue;
                codeWriter.emit(memberSeparator);
            }
            codeWriter.unindent(2);
            codeWriter.emit(whitespace + ")");
        }
    }

    private void emitAnnotationValues(CodeWriter codeWriter, String whitespace, String memberSeparator, List<CodeBlock> values) throws IOException {
        if (values.size() == 1) {
            codeWriter.indent(2);
            codeWriter.emit(values.get(0));
            codeWriter.unindent(2);
            return;
        }
        codeWriter.emit("{" + whitespace);
        codeWriter.indent(2);
        boolean first = true;
        for (CodeBlock codeBlock : values) {
            if (!first) {
                codeWriter.emit(memberSeparator);
            }
            codeWriter.emit(codeBlock);
            first = false;
        }
        codeWriter.unindent(2);
        codeWriter.emit(whitespace + "}");
    }

    public static AnnotationSpec get(Annotation annotation) {
        return AnnotationSpec.get(annotation, false);
    }

    public static AnnotationSpec get(Annotation annotation, boolean includeDefaultValues) {
        Builder builder = AnnotationSpec.builder(annotation.annotationType());
        try {
            Method[] methods = annotation.annotationType().getDeclaredMethods();
            Arrays.sort(methods, Comparator.comparing(Method::getName));
            for (Method method : methods) {
                Object value = method.invoke(annotation, new Object[0]);
                if (!includeDefaultValues && Objects.deepEquals(value, method.getDefaultValue())) continue;
                if (value.getClass().isArray()) {
                    for (int i = 0; i < Array.getLength(value); ++i) {
                        builder.addMemberForValue(method.getName(), Array.get(value, i));
                    }
                    continue;
                }
                if (value instanceof Annotation) {
                    builder.addMember(method.getName(), "$L", AnnotationSpec.get((Annotation)value));
                    continue;
                }
                builder.addMemberForValue(method.getName(), value);
            }
        } catch (Exception e) {
            throw new RuntimeException("Reflecting " + annotation + " failed!", e);
        }
        return builder.build();
    }

    public static AnnotationSpec get(AnnotationMirror annotation) {
        TypeElement element = (TypeElement)annotation.getAnnotationType().asElement();
        Builder builder = AnnotationSpec.builder(ClassName.get(element));
        Visitor visitor = new Visitor(builder);
        for (ExecutableElement executableElement : annotation.getElementValues().keySet()) {
            String name = executableElement.getSimpleName().toString();
            AnnotationValue value = annotation.getElementValues().get(executableElement);
            value.accept(visitor, name);
        }
        return builder.build();
    }

    public static Builder builder(ClassName type2) {
        Util.checkNotNull(type2, "type == null", new Object[0]);
        return new Builder(type2);
    }

    public static Builder builder(Class<?> type2) {
        return AnnotationSpec.builder(ClassName.get(type2));
    }

    public Builder toBuilder() {
        Builder builder = new Builder(this.type);
        for (Map.Entry<String, List<CodeBlock>> entry : this.members.entrySet()) {
            builder.members.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return builder;
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
            CodeWriter codeWriter = new CodeWriter(out);
            codeWriter.emit("$L", this);
            return out.toString();
        } catch (IOException e) {
            throw new AssertionError();
        }
    }

    private static class Visitor
    extends SimpleAnnotationValueVisitor8<Builder, String> {
        final Builder builder;

        Visitor(Builder builder) {
            super(builder);
            this.builder = builder;
        }

        @Override
        protected Builder defaultAction(Object o, String name) {
            return this.builder.addMemberForValue(name, o);
        }

        @Override
        public Builder visitAnnotation(AnnotationMirror a, String name) {
            return this.builder.addMember(name, "$L", AnnotationSpec.get(a));
        }

        @Override
        public Builder visitEnumConstant(VariableElement c, String name) {
            return this.builder.addMember(name, "$T.$L", c.asType(), c.getSimpleName());
        }

        @Override
        public Builder visitType(TypeMirror t, String name) {
            return this.builder.addMember(name, "$T.class", t);
        }

        @Override
        public Builder visitArray(List<? extends AnnotationValue> values, String name) {
            for (AnnotationValue annotationValue : values) {
                annotationValue.accept(this, name);
            }
            return this.builder;
        }
    }

    public static final class Builder {
        private final TypeName type;
        public final Map<String, List<CodeBlock>> members = new LinkedHashMap<String, List<CodeBlock>>();

        private Builder(TypeName type2) {
            this.type = type2;
        }

        public Builder addMember(String name, String format, Object ... args) {
            return this.addMember(name, CodeBlock.of(format, args));
        }

        public Builder addMember(String name, CodeBlock codeBlock) {
            List values = this.members.computeIfAbsent(name, k -> new ArrayList());
            values.add(codeBlock);
            return this;
        }

        Builder addMemberForValue(String memberName, Object value) {
            Util.checkNotNull(memberName, "memberName == null", new Object[0]);
            Util.checkNotNull(value, "value == null, constant non-null value expected for %s", memberName);
            Util.checkArgument(SourceVersion.isName(memberName), "not a valid name: %s", memberName);
            if (value instanceof Class) {
                return this.addMember(memberName, "$T.class", value);
            }
            if (value instanceof Enum) {
                return this.addMember(memberName, "$T.$L", value.getClass(), ((Enum)value).name());
            }
            if (value instanceof String) {
                return this.addMember(memberName, "$S", value);
            }
            if (value instanceof Float) {
                return this.addMember(memberName, "$Lf", value);
            }
            if (value instanceof Character) {
                return this.addMember(memberName, "'$L'", Util.characterLiteralWithoutSingleQuotes(((Character)value).charValue()));
            }
            return this.addMember(memberName, "$L", value);
        }

        public AnnotationSpec build() {
            for (String name : this.members.keySet()) {
                Util.checkNotNull(name, "name == null", new Object[0]);
                Util.checkArgument(SourceVersion.isName(name), "not a valid name: %s", name);
            }
            return new AnnotationSpec(this);
        }
    }
}

