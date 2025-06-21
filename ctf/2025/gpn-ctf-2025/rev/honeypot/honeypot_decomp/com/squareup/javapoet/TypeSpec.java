/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;
import com.squareup.javapoet.Util;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementFilter;

public final class TypeSpec {
    public final Kind kind;
    public final String name;
    public final CodeBlock anonymousTypeArguments;
    public final CodeBlock javadoc;
    public final List<AnnotationSpec> annotations;
    public final Set<Modifier> modifiers;
    public final List<TypeVariableName> typeVariables;
    public final TypeName superclass;
    public final List<TypeName> superinterfaces;
    public final Map<String, TypeSpec> enumConstants;
    public final List<FieldSpec> fieldSpecs;
    public final CodeBlock staticBlock;
    public final CodeBlock initializerBlock;
    public final List<MethodSpec> methodSpecs;
    public final List<TypeSpec> typeSpecs;
    final Set<String> nestedTypesSimpleNames;
    public final List<Element> originatingElements;
    public final Set<String> alwaysQualifiedNames;

    private TypeSpec(Builder builder) {
        this.kind = builder.kind;
        this.name = builder.name;
        this.anonymousTypeArguments = builder.anonymousTypeArguments;
        this.javadoc = builder.javadoc.build();
        this.annotations = Util.immutableList(builder.annotations);
        this.modifiers = Util.immutableSet(builder.modifiers);
        this.typeVariables = Util.immutableList(builder.typeVariables);
        this.superclass = builder.superclass;
        this.superinterfaces = Util.immutableList(builder.superinterfaces);
        this.enumConstants = Util.immutableMap(builder.enumConstants);
        this.fieldSpecs = Util.immutableList(builder.fieldSpecs);
        this.staticBlock = builder.staticBlock.build();
        this.initializerBlock = builder.initializerBlock.build();
        this.methodSpecs = Util.immutableList(builder.methodSpecs);
        this.typeSpecs = Util.immutableList(builder.typeSpecs);
        this.alwaysQualifiedNames = Util.immutableSet(builder.alwaysQualifiedNames);
        this.nestedTypesSimpleNames = new HashSet<String>(builder.typeSpecs.size());
        ArrayList<Element> originatingElementsMutable = new ArrayList<Element>();
        originatingElementsMutable.addAll(builder.originatingElements);
        for (TypeSpec typeSpec : builder.typeSpecs) {
            this.nestedTypesSimpleNames.add(typeSpec.name);
            originatingElementsMutable.addAll(typeSpec.originatingElements);
        }
        this.originatingElements = Util.immutableList(originatingElementsMutable);
    }

    private TypeSpec(TypeSpec type2) {
        assert (type2.anonymousTypeArguments == null);
        this.kind = type2.kind;
        this.name = type2.name;
        this.anonymousTypeArguments = null;
        this.javadoc = type2.javadoc;
        this.annotations = Collections.emptyList();
        this.modifiers = Collections.emptySet();
        this.typeVariables = Collections.emptyList();
        this.superclass = null;
        this.superinterfaces = Collections.emptyList();
        this.enumConstants = Collections.emptyMap();
        this.fieldSpecs = Collections.emptyList();
        this.staticBlock = type2.staticBlock;
        this.initializerBlock = type2.initializerBlock;
        this.methodSpecs = Collections.emptyList();
        this.typeSpecs = Collections.emptyList();
        this.originatingElements = Collections.emptyList();
        this.nestedTypesSimpleNames = Collections.emptySet();
        this.alwaysQualifiedNames = Collections.emptySet();
    }

    public boolean hasModifier(Modifier modifier) {
        return this.modifiers.contains((Object)modifier);
    }

    public static Builder classBuilder(String name) {
        return new Builder(Kind.CLASS, Util.checkNotNull(name, "name == null", new Object[0]), null);
    }

    public static Builder classBuilder(ClassName className) {
        return TypeSpec.classBuilder(Util.checkNotNull(className, "className == null", new Object[0]).simpleName());
    }

    public static Builder interfaceBuilder(String name) {
        return new Builder(Kind.INTERFACE, Util.checkNotNull(name, "name == null", new Object[0]), null);
    }

    public static Builder interfaceBuilder(ClassName className) {
        return TypeSpec.interfaceBuilder(Util.checkNotNull(className, "className == null", new Object[0]).simpleName());
    }

    public static Builder enumBuilder(String name) {
        return new Builder(Kind.ENUM, Util.checkNotNull(name, "name == null", new Object[0]), null);
    }

    public static Builder enumBuilder(ClassName className) {
        return TypeSpec.enumBuilder(Util.checkNotNull(className, "className == null", new Object[0]).simpleName());
    }

    public static Builder anonymousClassBuilder(String typeArgumentsFormat, Object ... args) {
        return TypeSpec.anonymousClassBuilder(CodeBlock.of(typeArgumentsFormat, args));
    }

    public static Builder anonymousClassBuilder(CodeBlock typeArguments) {
        return new Builder(Kind.CLASS, null, typeArguments);
    }

    public static Builder annotationBuilder(String name) {
        return new Builder(Kind.ANNOTATION, Util.checkNotNull(name, "name == null", new Object[0]), null);
    }

    public static Builder annotationBuilder(ClassName className) {
        return TypeSpec.annotationBuilder(Util.checkNotNull(className, "className == null", new Object[0]).simpleName());
    }

    public Builder toBuilder() {
        Builder builder = new Builder(this.kind, this.name, this.anonymousTypeArguments);
        builder.javadoc.add(this.javadoc);
        builder.annotations.addAll(this.annotations);
        builder.modifiers.addAll(this.modifiers);
        builder.typeVariables.addAll(this.typeVariables);
        builder.superclass = this.superclass;
        builder.superinterfaces.addAll(this.superinterfaces);
        builder.enumConstants.putAll(this.enumConstants);
        builder.fieldSpecs.addAll(this.fieldSpecs);
        builder.methodSpecs.addAll(this.methodSpecs);
        builder.typeSpecs.addAll(this.typeSpecs);
        builder.initializerBlock.add(this.initializerBlock);
        builder.staticBlock.add(this.staticBlock);
        builder.originatingElements.addAll(this.originatingElements);
        builder.alwaysQualifiedNames.addAll(this.alwaysQualifiedNames);
        return builder;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void emit(CodeWriter codeWriter, String enumName, Set<Modifier> implicitModifiers) throws IOException {
        int previousStatementLine = codeWriter.statementLine;
        codeWriter.statementLine = -1;
        try {
            if (enumName != null) {
                codeWriter.emitJavadoc(this.javadoc);
                codeWriter.emitAnnotations(this.annotations, false);
                codeWriter.emit("$L", enumName);
                if (!this.anonymousTypeArguments.formatParts.isEmpty()) {
                    codeWriter.emit("(");
                    codeWriter.emit(this.anonymousTypeArguments);
                    codeWriter.emit(")");
                }
                if (this.fieldSpecs.isEmpty() && this.methodSpecs.isEmpty() && this.typeSpecs.isEmpty()) {
                    return;
                }
                codeWriter.emit(" {\n");
            } else if (this.anonymousTypeArguments != null) {
                TypeName supertype = !this.superinterfaces.isEmpty() ? this.superinterfaces.get(0) : this.superclass;
                codeWriter.emit("new $T(", supertype);
                codeWriter.emit(this.anonymousTypeArguments);
                codeWriter.emit(") {\n");
            } else {
                boolean firstType;
                List<Object> implementsTypes;
                List<TypeName> extendsTypes;
                codeWriter.pushType(new TypeSpec(this));
                codeWriter.emitJavadoc(this.javadoc);
                codeWriter.emitAnnotations(this.annotations, false);
                codeWriter.emitModifiers(this.modifiers, Util.union(implicitModifiers, this.kind.asMemberModifiers));
                if (this.kind == Kind.ANNOTATION) {
                    codeWriter.emit("$L $L", "@interface", this.name);
                } else {
                    codeWriter.emit("$L $L", this.kind.name().toLowerCase(Locale.US), this.name);
                }
                codeWriter.emitTypeVariables(this.typeVariables);
                if (this.kind == Kind.INTERFACE) {
                    extendsTypes = this.superinterfaces;
                    implementsTypes = Collections.emptyList();
                } else {
                    extendsTypes = this.superclass.equals(ClassName.OBJECT) ? Collections.emptyList() : Collections.singletonList(this.superclass);
                    implementsTypes = this.superinterfaces;
                }
                if (!extendsTypes.isEmpty()) {
                    codeWriter.emit(" extends");
                    firstType = true;
                    for (TypeName typeName : extendsTypes) {
                        if (!firstType) {
                            codeWriter.emit(",");
                        }
                        codeWriter.emit(" $T", typeName);
                        firstType = false;
                    }
                }
                if (!implementsTypes.isEmpty()) {
                    codeWriter.emit(" implements");
                    firstType = true;
                    for (TypeName typeName : implementsTypes) {
                        if (!firstType) {
                            codeWriter.emit(",");
                        }
                        codeWriter.emit(" $T", typeName);
                        firstType = false;
                    }
                }
                codeWriter.popType();
                codeWriter.emit(" {\n");
            }
            codeWriter.pushType(this);
            codeWriter.indent();
            boolean firstMember = true;
            Iterator<Map.Entry<String, TypeSpec>> i = this.enumConstants.entrySet().iterator();
            while (i.hasNext()) {
                Map.Entry<String, TypeSpec> enumConstant = i.next();
                if (!firstMember) {
                    codeWriter.emit("\n");
                }
                enumConstant.getValue().emit(codeWriter, enumConstant.getKey(), Collections.emptySet());
                firstMember = false;
                if (i.hasNext()) {
                    codeWriter.emit(",\n");
                    continue;
                }
                if (!(this.fieldSpecs.isEmpty() && this.methodSpecs.isEmpty() && this.typeSpecs.isEmpty())) {
                    codeWriter.emit(";\n");
                    continue;
                }
                codeWriter.emit("\n");
            }
            for (FieldSpec fieldSpec : this.fieldSpecs) {
                if (!fieldSpec.hasModifier(Modifier.STATIC)) continue;
                if (!firstMember) {
                    codeWriter.emit("\n");
                }
                fieldSpec.emit(codeWriter, this.kind.implicitFieldModifiers);
                firstMember = false;
            }
            if (!this.staticBlock.isEmpty()) {
                if (!firstMember) {
                    codeWriter.emit("\n");
                }
                codeWriter.emit(this.staticBlock);
                firstMember = false;
            }
            for (FieldSpec fieldSpec : this.fieldSpecs) {
                if (fieldSpec.hasModifier(Modifier.STATIC)) continue;
                if (!firstMember) {
                    codeWriter.emit("\n");
                }
                fieldSpec.emit(codeWriter, this.kind.implicitFieldModifiers);
                firstMember = false;
            }
            if (!this.initializerBlock.isEmpty()) {
                if (!firstMember) {
                    codeWriter.emit("\n");
                }
                codeWriter.emit(this.initializerBlock);
                firstMember = false;
            }
            for (MethodSpec methodSpec : this.methodSpecs) {
                if (!methodSpec.isConstructor()) continue;
                if (!firstMember) {
                    codeWriter.emit("\n");
                }
                methodSpec.emit(codeWriter, this.name, this.kind.implicitMethodModifiers);
                firstMember = false;
            }
            for (MethodSpec methodSpec : this.methodSpecs) {
                if (methodSpec.isConstructor()) continue;
                if (!firstMember) {
                    codeWriter.emit("\n");
                }
                methodSpec.emit(codeWriter, this.name, this.kind.implicitMethodModifiers);
                firstMember = false;
            }
            for (TypeSpec typeSpec : this.typeSpecs) {
                if (!firstMember) {
                    codeWriter.emit("\n");
                }
                typeSpec.emit(codeWriter, null, this.kind.implicitTypeModifiers);
                firstMember = false;
            }
            codeWriter.unindent();
            codeWriter.popType();
            codeWriter.popTypeVariables(this.typeVariables);
            codeWriter.emit("}");
            if (enumName == null && this.anonymousTypeArguments == null) {
                codeWriter.emit("\n");
            }
        } finally {
            codeWriter.statementLine = previousStatementLine;
        }
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
            this.emit(codeWriter, null, Collections.emptySet());
            return out.toString();
        } catch (IOException e) {
            throw new AssertionError();
        }
    }

    public static final class Builder {
        private final Kind kind;
        private final String name;
        private final CodeBlock anonymousTypeArguments;
        private final CodeBlock.Builder javadoc = CodeBlock.builder();
        private TypeName superclass = ClassName.OBJECT;
        private final CodeBlock.Builder staticBlock = CodeBlock.builder();
        private final CodeBlock.Builder initializerBlock = CodeBlock.builder();
        public final Map<String, TypeSpec> enumConstants = new LinkedHashMap<String, TypeSpec>();
        public final List<AnnotationSpec> annotations = new ArrayList<AnnotationSpec>();
        public final List<Modifier> modifiers = new ArrayList<Modifier>();
        public final List<TypeVariableName> typeVariables = new ArrayList<TypeVariableName>();
        public final List<TypeName> superinterfaces = new ArrayList<TypeName>();
        public final List<FieldSpec> fieldSpecs = new ArrayList<FieldSpec>();
        public final List<MethodSpec> methodSpecs = new ArrayList<MethodSpec>();
        public final List<TypeSpec> typeSpecs = new ArrayList<TypeSpec>();
        public final List<Element> originatingElements = new ArrayList<Element>();
        public final Set<String> alwaysQualifiedNames = new LinkedHashSet<String>();

        private Builder(Kind kind, String name, CodeBlock anonymousTypeArguments) {
            Util.checkArgument(name == null || SourceVersion.isName(name), "not a valid name: %s", name);
            this.kind = kind;
            this.name = name;
            this.anonymousTypeArguments = anonymousTypeArguments;
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
            Util.checkNotNull(annotationSpec, "annotationSpec == null", new Object[0]);
            this.annotations.add(annotationSpec);
            return this;
        }

        public Builder addAnnotation(ClassName annotation) {
            return this.addAnnotation(AnnotationSpec.builder(annotation).build());
        }

        public Builder addAnnotation(Class<?> annotation) {
            return this.addAnnotation(ClassName.get(annotation));
        }

        public Builder addModifiers(Modifier ... modifiers) {
            Collections.addAll(this.modifiers, modifiers);
            return this;
        }

        public Builder addTypeVariables(Iterable<TypeVariableName> typeVariables) {
            Util.checkArgument(typeVariables != null, "typeVariables == null", new Object[0]);
            for (TypeVariableName typeVariable : typeVariables) {
                this.typeVariables.add(typeVariable);
            }
            return this;
        }

        public Builder addTypeVariable(TypeVariableName typeVariable) {
            this.typeVariables.add(typeVariable);
            return this;
        }

        public Builder superclass(TypeName superclass) {
            Util.checkState(this.kind == Kind.CLASS, "only classes have super classes, not " + (Object)((Object)this.kind), new Object[0]);
            Util.checkState(this.superclass == ClassName.OBJECT, "superclass already set to " + this.superclass, new Object[0]);
            Util.checkArgument(!superclass.isPrimitive(), "superclass may not be a primitive", new Object[0]);
            this.superclass = superclass;
            return this;
        }

        public Builder superclass(Type superclass) {
            return this.superclass(superclass, true);
        }

        public Builder superclass(Type superclass, boolean avoidNestedTypeNameClashes) {
            Class<?> clazz;
            this.superclass(TypeName.get(superclass));
            if (avoidNestedTypeNameClashes && (clazz = this.getRawType(superclass)) != null) {
                this.avoidClashesWithNestedClasses(clazz);
            }
            return this;
        }

        public Builder superclass(TypeMirror superclass) {
            return this.superclass(superclass, true);
        }

        public Builder superclass(TypeMirror superclass, boolean avoidNestedTypeNameClashes) {
            this.superclass(TypeName.get(superclass));
            if (avoidNestedTypeNameClashes && superclass instanceof DeclaredType) {
                TypeElement superInterfaceElement = (TypeElement)((DeclaredType)superclass).asElement();
                this.avoidClashesWithNestedClasses(superInterfaceElement);
            }
            return this;
        }

        public Builder addSuperinterfaces(Iterable<? extends TypeName> superinterfaces) {
            Util.checkArgument(superinterfaces != null, "superinterfaces == null", new Object[0]);
            for (TypeName typeName : superinterfaces) {
                this.addSuperinterface(typeName);
            }
            return this;
        }

        public Builder addSuperinterface(TypeName superinterface) {
            Util.checkArgument(superinterface != null, "superinterface == null", new Object[0]);
            this.superinterfaces.add(superinterface);
            return this;
        }

        public Builder addSuperinterface(Type superinterface) {
            return this.addSuperinterface(superinterface, true);
        }

        public Builder addSuperinterface(Type superinterface, boolean avoidNestedTypeNameClashes) {
            Class<?> clazz;
            this.addSuperinterface(TypeName.get(superinterface));
            if (avoidNestedTypeNameClashes && (clazz = this.getRawType(superinterface)) != null) {
                this.avoidClashesWithNestedClasses(clazz);
            }
            return this;
        }

        private Class<?> getRawType(Type type2) {
            if (type2 instanceof Class) {
                return (Class)type2;
            }
            if (type2 instanceof ParameterizedType) {
                return this.getRawType(((ParameterizedType)type2).getRawType());
            }
            return null;
        }

        public Builder addSuperinterface(TypeMirror superinterface) {
            return this.addSuperinterface(superinterface, true);
        }

        public Builder addSuperinterface(TypeMirror superinterface, boolean avoidNestedTypeNameClashes) {
            this.addSuperinterface(TypeName.get(superinterface));
            if (avoidNestedTypeNameClashes && superinterface instanceof DeclaredType) {
                TypeElement superInterfaceElement = (TypeElement)((DeclaredType)superinterface).asElement();
                this.avoidClashesWithNestedClasses(superInterfaceElement);
            }
            return this;
        }

        public Builder addEnumConstant(String name) {
            return this.addEnumConstant(name, TypeSpec.anonymousClassBuilder("", new Object[0]).build());
        }

        public Builder addEnumConstant(String name, TypeSpec typeSpec) {
            this.enumConstants.put(name, typeSpec);
            return this;
        }

        public Builder addFields(Iterable<FieldSpec> fieldSpecs) {
            Util.checkArgument(fieldSpecs != null, "fieldSpecs == null", new Object[0]);
            for (FieldSpec fieldSpec : fieldSpecs) {
                this.addField(fieldSpec);
            }
            return this;
        }

        public Builder addField(FieldSpec fieldSpec) {
            this.fieldSpecs.add(fieldSpec);
            return this;
        }

        public Builder addField(TypeName type2, String name, Modifier ... modifiers) {
            return this.addField(FieldSpec.builder(type2, name, modifiers).build());
        }

        public Builder addField(Type type2, String name, Modifier ... modifiers) {
            return this.addField(TypeName.get(type2), name, modifiers);
        }

        public Builder addStaticBlock(CodeBlock block) {
            this.staticBlock.beginControlFlow("static", new Object[0]).add(block).endControlFlow();
            return this;
        }

        public Builder addInitializerBlock(CodeBlock block) {
            if (this.kind != Kind.CLASS && this.kind != Kind.ENUM) {
                throw new UnsupportedOperationException((Object)((Object)this.kind) + " can't have initializer blocks");
            }
            this.initializerBlock.add("{\n", new Object[0]).indent().add(block).unindent().add("}\n", new Object[0]);
            return this;
        }

        public Builder addMethods(Iterable<MethodSpec> methodSpecs) {
            Util.checkArgument(methodSpecs != null, "methodSpecs == null", new Object[0]);
            for (MethodSpec methodSpec : methodSpecs) {
                this.addMethod(methodSpec);
            }
            return this;
        }

        public Builder addMethod(MethodSpec methodSpec) {
            this.methodSpecs.add(methodSpec);
            return this;
        }

        public Builder addTypes(Iterable<TypeSpec> typeSpecs) {
            Util.checkArgument(typeSpecs != null, "typeSpecs == null", new Object[0]);
            for (TypeSpec typeSpec : typeSpecs) {
                this.addType(typeSpec);
            }
            return this;
        }

        public Builder addType(TypeSpec typeSpec) {
            this.typeSpecs.add(typeSpec);
            return this;
        }

        public Builder addOriginatingElement(Element originatingElement) {
            this.originatingElements.add(originatingElement);
            return this;
        }

        public Builder alwaysQualify(String ... simpleNames) {
            Util.checkArgument(simpleNames != null, "simpleNames == null", new Object[0]);
            for (String name : simpleNames) {
                Util.checkArgument(name != null, "null entry in simpleNames array: %s", Arrays.toString(simpleNames));
                this.alwaysQualifiedNames.add(name);
            }
            return this;
        }

        public Builder avoidClashesWithNestedClasses(TypeElement typeElement) {
            Util.checkArgument(typeElement != null, "typeElement == null", new Object[0]);
            for (TypeElement nestedType : ElementFilter.typesIn(typeElement.getEnclosedElements())) {
                this.alwaysQualify(nestedType.getSimpleName().toString());
            }
            TypeMirror superclass = typeElement.getSuperclass();
            if (!(superclass instanceof NoType) && superclass instanceof DeclaredType) {
                TypeElement superclassElement = (TypeElement)((DeclaredType)superclass).asElement();
                this.avoidClashesWithNestedClasses(superclassElement);
            }
            for (TypeMirror typeMirror : typeElement.getInterfaces()) {
                if (!(typeMirror instanceof DeclaredType)) continue;
                TypeElement superinterfaceElement = (TypeElement)((DeclaredType)typeMirror).asElement();
                this.avoidClashesWithNestedClasses(superinterfaceElement);
            }
            return this;
        }

        public Builder avoidClashesWithNestedClasses(Class<?> clazz) {
            Util.checkArgument(clazz != null, "clazz == null", new Object[0]);
            for (Class<?> nestedType : clazz.getDeclaredClasses()) {
                this.alwaysQualify(nestedType.getSimpleName());
            }
            Class<?> superclass = clazz.getSuperclass();
            if (superclass != null && !Object.class.equals(superclass)) {
                this.avoidClashesWithNestedClasses(superclass);
            }
            for (Class<?> superinterface : clazz.getInterfaces()) {
                this.avoidClashesWithNestedClasses(superinterface);
            }
            return this;
        }

        public TypeSpec build() {
            for (AnnotationSpec annotationSpec : this.annotations) {
                Util.checkNotNull(annotationSpec, "annotationSpec == null", new Object[0]);
            }
            if (!this.modifiers.isEmpty()) {
                Util.checkState(this.anonymousTypeArguments == null, "forbidden on anonymous types.", new Object[0]);
                for (Modifier modifier : this.modifiers) {
                    Util.checkArgument(modifier != null, "modifiers contain null", new Object[0]);
                }
            }
            Util.checkArgument(this.kind != Kind.ENUM || !this.enumConstants.isEmpty(), "at least one enum constant is required for %s", this.name);
            for (TypeName typeName : this.superinterfaces) {
                Util.checkArgument(typeName != null, "superinterfaces contains null", new Object[0]);
            }
            if (!this.typeVariables.isEmpty()) {
                Util.checkState(this.anonymousTypeArguments == null, "typevariables are forbidden on anonymous types.", new Object[0]);
                for (TypeVariableName typeVariableName : this.typeVariables) {
                    Util.checkArgument(typeVariableName != null, "typeVariables contain null", new Object[0]);
                }
            }
            for (Map.Entry entry : this.enumConstants.entrySet()) {
                Util.checkState(this.kind == Kind.ENUM, "%s is not enum", this.name);
                Util.checkArgument(((TypeSpec)entry.getValue()).anonymousTypeArguments != null, "enum constants must have anonymous type arguments", new Object[0]);
                Util.checkArgument(SourceVersion.isName(this.name), "not a valid enum constant: %s", this.name);
            }
            for (FieldSpec fieldSpec : this.fieldSpecs) {
                if (this.kind != Kind.INTERFACE && this.kind != Kind.ANNOTATION) continue;
                Util.requireExactlyOneOf(fieldSpec.modifiers, Modifier.PUBLIC, Modifier.PRIVATE);
                EnumSet<Modifier> check = EnumSet.of(Modifier.STATIC, Modifier.FINAL);
                Util.checkState(fieldSpec.modifiers.containsAll(check), "%s %s.%s requires modifiers %s", new Object[]{this.kind, this.name, fieldSpec.name, check});
            }
            for (MethodSpec methodSpec : this.methodSpecs) {
                if (this.kind == Kind.INTERFACE) {
                    Util.requireExactlyOneOf(methodSpec.modifiers, Modifier.ABSTRACT, Modifier.STATIC, Modifier.DEFAULT);
                    Util.requireExactlyOneOf(methodSpec.modifiers, Modifier.PUBLIC, Modifier.PRIVATE);
                } else if (this.kind == Kind.ANNOTATION) {
                    Util.checkState(methodSpec.modifiers.equals(this.kind.implicitMethodModifiers), "%s %s.%s requires modifiers %s", new Object[]{this.kind, this.name, methodSpec.name, this.kind.implicitMethodModifiers});
                }
                if (this.kind != Kind.ANNOTATION) {
                    Util.checkState(methodSpec.defaultValue == null, "%s %s.%s cannot have a default value", new Object[]{this.kind, this.name, methodSpec.name});
                }
                if (this.kind == Kind.INTERFACE) continue;
                Util.checkState(!methodSpec.hasModifier(Modifier.DEFAULT), "%s %s.%s cannot be default", new Object[]{this.kind, this.name, methodSpec.name});
            }
            for (TypeSpec typeSpec : this.typeSpecs) {
                Util.checkArgument(typeSpec.modifiers.containsAll(this.kind.implicitTypeModifiers), "%s %s.%s requires modifiers %s", new Object[]{this.kind, this.name, typeSpec.name, this.kind.implicitTypeModifiers});
            }
            boolean isAbstract = this.modifiers.contains((Object)Modifier.ABSTRACT) || this.kind != Kind.CLASS;
            for (MethodSpec methodSpec : this.methodSpecs) {
                Util.checkArgument(isAbstract || !methodSpec.hasModifier(Modifier.ABSTRACT), "non-abstract type %s cannot declare abstract method %s", this.name, methodSpec.name);
            }
            boolean bl = this.superclass.equals(ClassName.OBJECT);
            int interestingSupertypeCount = (bl ? 0 : 1) + this.superinterfaces.size();
            Util.checkArgument(this.anonymousTypeArguments == null || interestingSupertypeCount <= 1, "anonymous type has too many supertypes", new Object[0]);
            return new TypeSpec(this);
        }
    }

    public static enum Kind {
        CLASS(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet()),
        INTERFACE(Util.immutableSet(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)), Util.immutableSet(Arrays.asList(Modifier.PUBLIC, Modifier.ABSTRACT)), Util.immutableSet(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC)), Util.immutableSet(Collections.singletonList(Modifier.STATIC))),
        ENUM(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.singleton(Modifier.STATIC)),
        ANNOTATION(Util.immutableSet(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)), Util.immutableSet(Arrays.asList(Modifier.PUBLIC, Modifier.ABSTRACT)), Util.immutableSet(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC)), Util.immutableSet(Collections.singletonList(Modifier.STATIC)));

        private final Set<Modifier> implicitFieldModifiers;
        private final Set<Modifier> implicitMethodModifiers;
        private final Set<Modifier> implicitTypeModifiers;
        private final Set<Modifier> asMemberModifiers;

        private Kind(Set<Modifier> implicitFieldModifiers, Set<Modifier> implicitMethodModifiers, Set<Modifier> implicitTypeModifiers, Set<Modifier> asMemberModifiers) {
            this.implicitFieldModifiers = implicitFieldModifiers;
            this.implicitMethodModifiers = implicitMethodModifiers;
            this.implicitTypeModifiers = implicitTypeModifiers;
            this.asMemberModifiers = asMemberModifiers;
        }
    }
}

