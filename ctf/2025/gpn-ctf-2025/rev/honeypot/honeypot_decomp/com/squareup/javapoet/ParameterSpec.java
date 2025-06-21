/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.Util;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.VariableElement;

public final class ParameterSpec {
    public final String name;
    public final List<AnnotationSpec> annotations;
    public final Set<Modifier> modifiers;
    public final TypeName type;
    public final CodeBlock javadoc;

    private ParameterSpec(Builder builder) {
        this.name = Util.checkNotNull(builder.name, "name == null", new Object[0]);
        this.annotations = Util.immutableList(builder.annotations);
        this.modifiers = Util.immutableSet(builder.modifiers);
        this.type = Util.checkNotNull(builder.type, "type == null", new Object[0]);
        this.javadoc = builder.javadoc.build();
    }

    public boolean hasModifier(Modifier modifier) {
        return this.modifiers.contains((Object)modifier);
    }

    void emit(CodeWriter codeWriter, boolean varargs) throws IOException {
        codeWriter.emitAnnotations(this.annotations, true);
        codeWriter.emitModifiers(this.modifiers);
        if (varargs) {
            TypeName.asArray(this.type).emit(codeWriter, true);
        } else {
            this.type.emit(codeWriter);
        }
        codeWriter.emit(" $L", this.name);
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
            this.emit(codeWriter, false);
            return out.toString();
        } catch (IOException e) {
            throw new AssertionError();
        }
    }

    public static ParameterSpec get(VariableElement element) {
        Util.checkArgument(element.getKind().equals((Object)ElementKind.PARAMETER), "element is not a parameter", new Object[0]);
        TypeName type2 = TypeName.get(element.asType());
        String name = element.getSimpleName().toString();
        return ParameterSpec.builder(type2, name, new Modifier[0]).addModifiers(element.getModifiers()).build();
    }

    static List<ParameterSpec> parametersOf(ExecutableElement method) {
        ArrayList<ParameterSpec> result = new ArrayList<ParameterSpec>();
        for (VariableElement variableElement : method.getParameters()) {
            result.add(ParameterSpec.get(variableElement));
        }
        return result;
    }

    private static boolean isValidParameterName(String name) {
        if (name.endsWith(".this")) {
            return SourceVersion.isIdentifier(name.substring(0, name.length() - ".this".length()));
        }
        return name.equals("this") || SourceVersion.isName(name);
    }

    public static Builder builder(TypeName type2, String name, Modifier ... modifiers) {
        Util.checkNotNull(type2, "type == null", new Object[0]);
        Util.checkArgument(ParameterSpec.isValidParameterName(name), "not a valid name: %s", name);
        return new Builder(type2, name).addModifiers(modifiers);
    }

    public static Builder builder(Type type2, String name, Modifier ... modifiers) {
        return ParameterSpec.builder(TypeName.get(type2), name, modifiers);
    }

    public Builder toBuilder() {
        return this.toBuilder(this.type, this.name);
    }

    Builder toBuilder(TypeName type2, String name) {
        Builder builder = new Builder(type2, name);
        builder.annotations.addAll(this.annotations);
        builder.modifiers.addAll(this.modifiers);
        return builder;
    }

    public static final class Builder {
        private final TypeName type;
        private final String name;
        private final CodeBlock.Builder javadoc = CodeBlock.builder();
        public final List<AnnotationSpec> annotations = new ArrayList<AnnotationSpec>();
        public final List<Modifier> modifiers = new ArrayList<Modifier>();

        private Builder(TypeName type2, String name) {
            this.type = type2;
            this.name = name;
        }

        public Builder addJavadoc(String format, Object ... args) {
            this.javadoc.add(format, args);
            return this;
        }

        public Builder addJavadoc(CodeBlock block) {
            this.javadoc.add(block);
            return this;
        }

        public Builder addAnnotations(Iterable<AnnotationSpec> annotationSpecs) {
            Util.checkArgument(annotationSpecs != null, "annotationSpecs == null", new Object[0]);
            for (AnnotationSpec annotationSpec : annotationSpecs) {
                this.annotations.add(annotationSpec);
            }
            return this;
        }

        public Builder addAnnotation(AnnotationSpec annotationSpec) {
            this.annotations.add(annotationSpec);
            return this;
        }

        public Builder addAnnotation(ClassName annotation) {
            this.annotations.add(AnnotationSpec.builder(annotation).build());
            return this;
        }

        public Builder addAnnotation(Class<?> annotation) {
            return this.addAnnotation(ClassName.get(annotation));
        }

        public Builder addModifiers(Modifier ... modifiers) {
            Collections.addAll(this.modifiers, modifiers);
            return this;
        }

        public Builder addModifiers(Iterable<Modifier> modifiers) {
            Util.checkNotNull(modifiers, "modifiers == null", new Object[0]);
            for (Modifier modifier : modifiers) {
                if (!modifier.equals((Object)Modifier.FINAL)) {
                    throw new IllegalStateException("unexpected parameter modifier: " + (Object)((Object)modifier));
                }
                this.modifiers.add(modifier);
            }
            return this;
        }

        public ParameterSpec build() {
            return new ParameterSpec(this);
        }
    }
}

