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
import javax.lang.model.element.Modifier;

public final class FieldSpec {
    public final TypeName type;
    public final String name;
    public final CodeBlock javadoc;
    public final List<AnnotationSpec> annotations;
    public final Set<Modifier> modifiers;
    public final CodeBlock initializer;

    private FieldSpec(Builder builder) {
        this.type = Util.checkNotNull(builder.type, "type == null", new Object[0]);
        this.name = Util.checkNotNull(builder.name, "name == null", new Object[0]);
        this.javadoc = builder.javadoc.build();
        this.annotations = Util.immutableList(builder.annotations);
        this.modifiers = Util.immutableSet(builder.modifiers);
        this.initializer = builder.initializer == null ? CodeBlock.builder().build() : builder.initializer;
    }

    public boolean hasModifier(Modifier modifier) {
        return this.modifiers.contains((Object)modifier);
    }

    void emit(CodeWriter codeWriter, Set<Modifier> implicitModifiers) throws IOException {
        codeWriter.emitJavadoc(this.javadoc);
        codeWriter.emitAnnotations(this.annotations, false);
        codeWriter.emitModifiers(this.modifiers, implicitModifiers);
        codeWriter.emit("$T $L", this.type, this.name);
        if (!this.initializer.isEmpty()) {
            codeWriter.emit(" = ");
            codeWriter.emit(this.initializer);
        }
        codeWriter.emit(";\n");
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
            this.emit(codeWriter, Collections.emptySet());
            return out.toString();
        } catch (IOException e) {
            throw new AssertionError();
        }
    }

    public static Builder builder(TypeName type2, String name, Modifier ... modifiers) {
        Util.checkNotNull(type2, "type == null", new Object[0]);
        Util.checkArgument(SourceVersion.isName(name), "not a valid name: %s", name);
        return new Builder(type2, name).addModifiers(modifiers);
    }

    public static Builder builder(Type type2, String name, Modifier ... modifiers) {
        return FieldSpec.builder(TypeName.get(type2), name, modifiers);
    }

    public Builder toBuilder() {
        Builder builder = new Builder(this.type, this.name);
        builder.javadoc.add(this.javadoc);
        builder.annotations.addAll(this.annotations);
        builder.modifiers.addAll(this.modifiers);
        builder.initializer = this.initializer.isEmpty() ? null : this.initializer;
        return builder;
    }

    public static final class Builder {
        private final TypeName type;
        private final String name;
        private final CodeBlock.Builder javadoc = CodeBlock.builder();
        private CodeBlock initializer = null;
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

        public Builder initializer(String format, Object ... args) {
            return this.initializer(CodeBlock.of(format, args));
        }

        public Builder initializer(CodeBlock codeBlock) {
            Util.checkState(this.initializer == null, "initializer was already set", new Object[0]);
            this.initializer = Util.checkNotNull(codeBlock, "codeBlock == null", new Object[0]);
            return this;
        }

        public FieldSpec build() {
            return new FieldSpec(this);
        }
    }
}

