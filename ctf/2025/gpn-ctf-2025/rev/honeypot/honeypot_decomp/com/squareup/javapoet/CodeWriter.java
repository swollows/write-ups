/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.LineWrapper;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import com.squareup.javapoet.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Modifier;

final class CodeWriter {
    private static final String NO_PACKAGE = new String();
    private final String indent;
    private final LineWrapper out;
    private int indentLevel;
    private boolean javadoc = false;
    private boolean comment = false;
    private String packageName = NO_PACKAGE;
    private final List<TypeSpec> typeSpecStack = new ArrayList<TypeSpec>();
    private final Set<String> staticImportClassNames;
    private final Set<String> staticImports;
    private final Set<String> alwaysQualify;
    private final Map<String, ClassName> importedTypes;
    private final Map<String, ClassName> importableTypes = new LinkedHashMap<String, ClassName>();
    private final Set<String> referencedNames = new LinkedHashSet<String>();
    private final Multiset<String> currentTypeVariables = new Multiset();
    private boolean trailingNewline;
    int statementLine = -1;

    CodeWriter(Appendable out) {
        this(out, "  ", Collections.emptySet(), Collections.emptySet());
    }

    CodeWriter(Appendable out, String indent, Set<String> staticImports, Set<String> alwaysQualify) {
        this(out, indent, Collections.emptyMap(), staticImports, alwaysQualify);
    }

    CodeWriter(Appendable out, String indent, Map<String, ClassName> importedTypes, Set<String> staticImports, Set<String> alwaysQualify) {
        this.out = new LineWrapper(out, indent, 100);
        this.indent = Util.checkNotNull(indent, "indent == null", new Object[0]);
        this.importedTypes = Util.checkNotNull(importedTypes, "importedTypes == null", new Object[0]);
        this.staticImports = Util.checkNotNull(staticImports, "staticImports == null", new Object[0]);
        this.alwaysQualify = Util.checkNotNull(alwaysQualify, "alwaysQualify == null", new Object[0]);
        this.staticImportClassNames = new LinkedHashSet<String>();
        for (String signature : staticImports) {
            this.staticImportClassNames.add(signature.substring(0, signature.lastIndexOf(46)));
        }
    }

    public Map<String, ClassName> importedTypes() {
        return this.importedTypes;
    }

    public CodeWriter indent() {
        return this.indent(1);
    }

    public CodeWriter indent(int levels) {
        this.indentLevel += levels;
        return this;
    }

    public CodeWriter unindent() {
        return this.unindent(1);
    }

    public CodeWriter unindent(int levels) {
        Util.checkArgument(this.indentLevel - levels >= 0, "cannot unindent %s from %s", levels, this.indentLevel);
        this.indentLevel -= levels;
        return this;
    }

    public CodeWriter pushPackage(String packageName) {
        Util.checkState(this.packageName == NO_PACKAGE, "package already set: %s", this.packageName);
        this.packageName = Util.checkNotNull(packageName, "packageName == null", new Object[0]);
        return this;
    }

    public CodeWriter popPackage() {
        Util.checkState(this.packageName != NO_PACKAGE, "package not set", new Object[0]);
        this.packageName = NO_PACKAGE;
        return this;
    }

    public CodeWriter pushType(TypeSpec type2) {
        this.typeSpecStack.add(type2);
        return this;
    }

    public CodeWriter popType() {
        this.typeSpecStack.remove(this.typeSpecStack.size() - 1);
        return this;
    }

    public void emitComment(CodeBlock codeBlock) throws IOException {
        this.trailingNewline = true;
        this.comment = true;
        try {
            this.emit(codeBlock);
            this.emit("\n");
        } finally {
            this.comment = false;
        }
    }

    public void emitJavadoc(CodeBlock javadocCodeBlock) throws IOException {
        if (javadocCodeBlock.isEmpty()) {
            return;
        }
        this.emit("/**\n");
        this.javadoc = true;
        try {
            this.emit(javadocCodeBlock, true);
        } finally {
            this.javadoc = false;
        }
        this.emit(" */\n");
    }

    public void emitAnnotations(List<AnnotationSpec> annotations, boolean inline) throws IOException {
        for (AnnotationSpec annotationSpec : annotations) {
            annotationSpec.emit(this, inline);
            this.emit(inline ? " " : "\n");
        }
    }

    public void emitModifiers(Set<Modifier> modifiers, Set<Modifier> implicitModifiers) throws IOException {
        if (modifiers.isEmpty()) {
            return;
        }
        for (Modifier modifier : EnumSet.copyOf(modifiers)) {
            if (implicitModifiers.contains((Object)modifier)) continue;
            this.emitAndIndent(modifier.name().toLowerCase(Locale.US));
            this.emitAndIndent(" ");
        }
    }

    public void emitModifiers(Set<Modifier> modifiers) throws IOException {
        this.emitModifiers(modifiers, Collections.emptySet());
    }

    public void emitTypeVariables(List<TypeVariableName> typeVariables) throws IOException {
        if (typeVariables.isEmpty()) {
            return;
        }
        typeVariables.forEach(typeVariable -> this.currentTypeVariables.add(typeVariable.name));
        this.emit("<");
        boolean firstTypeVariable = true;
        for (TypeVariableName typeVariable2 : typeVariables) {
            if (!firstTypeVariable) {
                this.emit(", ");
            }
            this.emitAnnotations(typeVariable2.annotations, true);
            this.emit("$L", typeVariable2.name);
            boolean firstBound = true;
            for (TypeName bound : typeVariable2.bounds) {
                this.emit(firstBound ? " extends $T" : " & $T", bound);
                firstBound = false;
            }
            firstTypeVariable = false;
        }
        this.emit(">");
    }

    public void popTypeVariables(List<TypeVariableName> typeVariables) throws IOException {
        typeVariables.forEach(typeVariable -> this.currentTypeVariables.remove(typeVariable.name));
    }

    public CodeWriter emit(String s2) throws IOException {
        return this.emitAndIndent(s2);
    }

    public CodeWriter emit(String format, Object ... args) throws IOException {
        return this.emit(CodeBlock.of(format, args));
    }

    public CodeWriter emit(CodeBlock codeBlock) throws IOException {
        return this.emit(codeBlock, false);
    }

    public CodeWriter emit(CodeBlock codeBlock, boolean ensureTrailingNewline) throws IOException {
        int a = 0;
        ClassName deferredTypeName = null;
        ListIterator<String> partIterator = codeBlock.formatParts.listIterator();
        block26: while (partIterator.hasNext()) {
            String part;
            switch (part = partIterator.next()) {
                case "$L": {
                    this.emitLiteral(codeBlock.args.get(a++));
                    continue block26;
                }
                case "$N": {
                    this.emitAndIndent((String)codeBlock.args.get(a++));
                    continue block26;
                }
                case "$S": {
                    String string = (String)codeBlock.args.get(a++);
                    this.emitAndIndent(string != null ? Util.stringLiteralWithDoubleQuotes(string, this.indent) : "null");
                    continue block26;
                }
                case "$T": {
                    TypeName typeName = (TypeName)codeBlock.args.get(a++);
                    if (typeName instanceof ClassName && partIterator.hasNext() && !codeBlock.formatParts.get(partIterator.nextIndex()).startsWith("$")) {
                        ClassName candidate = (ClassName)typeName;
                        if (this.staticImportClassNames.contains(candidate.canonicalName)) {
                            Util.checkState(deferredTypeName == null, "pending type for static import?!", new Object[0]);
                            deferredTypeName = candidate;
                            continue block26;
                        }
                    }
                    typeName.emit(this);
                    continue block26;
                }
                case "$$": {
                    this.emitAndIndent("$");
                    continue block26;
                }
                case "$>": {
                    this.indent();
                    continue block26;
                }
                case "$<": {
                    this.unindent();
                    continue block26;
                }
                case "$[": {
                    Util.checkState(this.statementLine == -1, "statement enter $[ followed by statement enter $[", new Object[0]);
                    this.statementLine = 0;
                    continue block26;
                }
                case "$]": {
                    Util.checkState(this.statementLine != -1, "statement exit $] has no matching statement enter $[", new Object[0]);
                    if (this.statementLine > 0) {
                        this.unindent(2);
                    }
                    this.statementLine = -1;
                    continue block26;
                }
                case "$W": {
                    this.out.wrappingSpace(this.indentLevel + 2);
                    continue block26;
                }
                case "$Z": {
                    this.out.zeroWidthSpace(this.indentLevel + 2);
                    continue block26;
                }
            }
            if (deferredTypeName != null) {
                if (part.startsWith(".") && this.emitStaticImportMember(deferredTypeName.canonicalName, part)) {
                    deferredTypeName = null;
                    continue;
                }
                deferredTypeName.emit(this);
                deferredTypeName = null;
            }
            this.emitAndIndent(part);
        }
        if (ensureTrailingNewline && this.out.lastChar() != '\n') {
            this.emit("\n");
        }
        return this;
    }

    public CodeWriter emitWrappingSpace() throws IOException {
        this.out.wrappingSpace(this.indentLevel + 2);
        return this;
    }

    private static String extractMemberName(String part) {
        Util.checkArgument(Character.isJavaIdentifierStart(part.charAt(0)), "not an identifier: %s", part);
        for (int i = 1; i <= part.length(); ++i) {
            if (SourceVersion.isIdentifier(part.substring(0, i))) continue;
            return part.substring(0, i - 1);
        }
        return part;
    }

    private boolean emitStaticImportMember(String canonical, String part) throws IOException {
        String partWithoutLeadingDot = part.substring(1);
        if (partWithoutLeadingDot.isEmpty()) {
            return false;
        }
        char first = partWithoutLeadingDot.charAt(0);
        if (!Character.isJavaIdentifierStart(first)) {
            return false;
        }
        String explicit = canonical + "." + CodeWriter.extractMemberName(partWithoutLeadingDot);
        String wildcard = canonical + ".*";
        if (this.staticImports.contains(explicit) || this.staticImports.contains(wildcard)) {
            this.emitAndIndent(partWithoutLeadingDot);
            return true;
        }
        return false;
    }

    private void emitLiteral(Object o) throws IOException {
        if (o instanceof TypeSpec) {
            TypeSpec typeSpec = (TypeSpec)o;
            typeSpec.emit(this, null, Collections.emptySet());
        } else if (o instanceof AnnotationSpec) {
            AnnotationSpec annotationSpec = (AnnotationSpec)o;
            annotationSpec.emit(this, true);
        } else if (o instanceof CodeBlock) {
            CodeBlock codeBlock = (CodeBlock)o;
            this.emit(codeBlock);
        } else {
            this.emitAndIndent(String.valueOf(o));
        }
    }

    String lookupName(ClassName className) {
        String topLevelSimpleName = className.topLevelClassName().simpleName();
        if (this.currentTypeVariables.contains(topLevelSimpleName)) {
            return className.canonicalName;
        }
        boolean nameResolved = false;
        for (ClassName c = className; c != null; c = c.enclosingClassName()) {
            ClassName resolved = this.resolve(c.simpleName());
            boolean bl = nameResolved = resolved != null;
            if (resolved == null || !Objects.equals(resolved.canonicalName, c.canonicalName)) continue;
            int suffixOffset = c.simpleNames().size() - 1;
            return String.join((CharSequence)".", className.simpleNames().subList(suffixOffset, className.simpleNames().size()));
        }
        if (nameResolved) {
            return className.canonicalName;
        }
        if (Objects.equals(this.packageName, className.packageName())) {
            this.referencedNames.add(topLevelSimpleName);
            return String.join((CharSequence)".", className.simpleNames());
        }
        if (!this.javadoc) {
            this.importableType(className);
        }
        return className.canonicalName;
    }

    private void importableType(ClassName className) {
        if (className.packageName().isEmpty()) {
            return;
        }
        if (this.alwaysQualify.contains(className.simpleName)) {
            return;
        }
        ClassName topLevelClassName = className.topLevelClassName();
        String simpleName = topLevelClassName.simpleName();
        ClassName replaced = this.importableTypes.put(simpleName, topLevelClassName);
        if (replaced != null) {
            this.importableTypes.put(simpleName, replaced);
        }
    }

    private ClassName resolve(String simpleName) {
        for (int i = this.typeSpecStack.size() - 1; i >= 0; --i) {
            TypeSpec typeSpec = this.typeSpecStack.get(i);
            if (!typeSpec.nestedTypesSimpleNames.contains(simpleName)) continue;
            return this.stackClassName(i, simpleName);
        }
        if (this.typeSpecStack.size() > 0 && Objects.equals(this.typeSpecStack.get((int)0).name, simpleName)) {
            return ClassName.get(this.packageName, simpleName, new String[0]);
        }
        ClassName importedType = this.importedTypes.get(simpleName);
        if (importedType != null) {
            return importedType;
        }
        return null;
    }

    private ClassName stackClassName(int stackDepth, String simpleName) {
        ClassName className = ClassName.get(this.packageName, this.typeSpecStack.get((int)0).name, new String[0]);
        for (int i = 1; i <= stackDepth; ++i) {
            className = className.nestedClass(this.typeSpecStack.get((int)i).name);
        }
        return className.nestedClass(simpleName);
    }

    CodeWriter emitAndIndent(String s2) throws IOException {
        boolean first = true;
        for (String line2 : s2.split("\\R", -1)) {
            if (!first) {
                if ((this.javadoc || this.comment) && this.trailingNewline) {
                    this.emitIndentation();
                    this.out.append(this.javadoc ? " *" : "//");
                }
                this.out.append("\n");
                this.trailingNewline = true;
                if (this.statementLine != -1) {
                    if (this.statementLine == 0) {
                        this.indent(2);
                    }
                    ++this.statementLine;
                }
            }
            first = false;
            if (line2.isEmpty()) continue;
            if (this.trailingNewline) {
                this.emitIndentation();
                if (this.javadoc) {
                    this.out.append(" * ");
                } else if (this.comment) {
                    this.out.append("// ");
                }
            }
            this.out.append(line2);
            this.trailingNewline = false;
        }
        return this;
    }

    private void emitIndentation() throws IOException {
        for (int j = 0; j < this.indentLevel; ++j) {
            this.out.append(this.indent);
        }
    }

    Map<String, ClassName> suggestedImports() {
        LinkedHashMap<String, ClassName> result = new LinkedHashMap<String, ClassName>(this.importableTypes);
        result.keySet().removeAll(this.referencedNames);
        return result;
    }

    private static final class Multiset<T> {
        private final Map<T, Integer> map = new LinkedHashMap<T, Integer>();

        private Multiset() {
        }

        void add(T t) {
            int count = this.map.getOrDefault(t, 0);
            this.map.put(t, count + 1);
        }

        void remove(T t) {
            int count = this.map.getOrDefault(t, 0);
            if (count == 0) {
                throw new IllegalStateException(t + " is not in the multiset");
            }
            this.map.put(t, count - 1);
        }

        boolean contains(T t) {
            return this.map.getOrDefault(t, 0) > 0;
        }
    }
}

