/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeVariableName;
import com.squareup.javapoet.Util;
import com.squareup.javapoet.WildcardTypeName;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.SimpleTypeVisitor8;

public class TypeName {
    public static final TypeName VOID = new TypeName("void");
    public static final TypeName BOOLEAN = new TypeName("boolean");
    public static final TypeName BYTE = new TypeName("byte");
    public static final TypeName SHORT = new TypeName("short");
    public static final TypeName INT = new TypeName("int");
    public static final TypeName LONG = new TypeName("long");
    public static final TypeName CHAR = new TypeName("char");
    public static final TypeName FLOAT = new TypeName("float");
    public static final TypeName DOUBLE = new TypeName("double");
    public static final ClassName OBJECT = ClassName.get("java.lang", "Object", new String[0]);
    private static final ClassName BOXED_VOID = ClassName.get("java.lang", "Void", new String[0]);
    private static final ClassName BOXED_BOOLEAN = ClassName.get("java.lang", "Boolean", new String[0]);
    private static final ClassName BOXED_BYTE = ClassName.get("java.lang", "Byte", new String[0]);
    private static final ClassName BOXED_SHORT = ClassName.get("java.lang", "Short", new String[0]);
    private static final ClassName BOXED_INT = ClassName.get("java.lang", "Integer", new String[0]);
    private static final ClassName BOXED_LONG = ClassName.get("java.lang", "Long", new String[0]);
    private static final ClassName BOXED_CHAR = ClassName.get("java.lang", "Character", new String[0]);
    private static final ClassName BOXED_FLOAT = ClassName.get("java.lang", "Float", new String[0]);
    private static final ClassName BOXED_DOUBLE = ClassName.get("java.lang", "Double", new String[0]);
    private final String keyword;
    public final List<AnnotationSpec> annotations;
    private String cachedString;

    private TypeName(String keyword) {
        this(keyword, new ArrayList<AnnotationSpec>());
    }

    private TypeName(String keyword, List<AnnotationSpec> annotations) {
        this.keyword = keyword;
        this.annotations = Util.immutableList(annotations);
    }

    TypeName(List<AnnotationSpec> annotations) {
        this(null, annotations);
    }

    public final TypeName annotated(AnnotationSpec ... annotations) {
        return this.annotated(Arrays.asList(annotations));
    }

    public TypeName annotated(List<AnnotationSpec> annotations) {
        Util.checkNotNull(annotations, "annotations == null", new Object[0]);
        return new TypeName(this.keyword, this.concatAnnotations(annotations));
    }

    public TypeName withoutAnnotations() {
        return new TypeName(this.keyword);
    }

    protected final List<AnnotationSpec> concatAnnotations(List<AnnotationSpec> annotations) {
        ArrayList<AnnotationSpec> allAnnotations = new ArrayList<AnnotationSpec>(this.annotations);
        allAnnotations.addAll(annotations);
        return allAnnotations;
    }

    public boolean isAnnotated() {
        return !this.annotations.isEmpty();
    }

    public boolean isPrimitive() {
        return this.keyword != null && this != VOID;
    }

    public boolean isBoxedPrimitive() {
        return this.equals(BOXED_BOOLEAN) || this.equals(BOXED_BYTE) || this.equals(BOXED_SHORT) || this.equals(BOXED_INT) || this.equals(BOXED_LONG) || this.equals(BOXED_CHAR) || this.equals(BOXED_FLOAT) || this.equals(BOXED_DOUBLE);
    }

    public TypeName box() {
        if (this.keyword == null) {
            return this;
        }
        if (this == VOID) {
            return BOXED_VOID;
        }
        if (this == BOOLEAN) {
            return BOXED_BOOLEAN;
        }
        if (this == BYTE) {
            return BOXED_BYTE;
        }
        if (this == SHORT) {
            return BOXED_SHORT;
        }
        if (this == INT) {
            return BOXED_INT;
        }
        if (this == LONG) {
            return BOXED_LONG;
        }
        if (this == CHAR) {
            return BOXED_CHAR;
        }
        if (this == FLOAT) {
            return BOXED_FLOAT;
        }
        if (this == DOUBLE) {
            return BOXED_DOUBLE;
        }
        throw new AssertionError((Object)this.keyword);
    }

    public TypeName unbox() {
        if (this.keyword != null) {
            return this;
        }
        if (this.equals(BOXED_VOID)) {
            return VOID;
        }
        if (this.equals(BOXED_BOOLEAN)) {
            return BOOLEAN;
        }
        if (this.equals(BOXED_BYTE)) {
            return BYTE;
        }
        if (this.equals(BOXED_SHORT)) {
            return SHORT;
        }
        if (this.equals(BOXED_INT)) {
            return INT;
        }
        if (this.equals(BOXED_LONG)) {
            return LONG;
        }
        if (this.equals(BOXED_CHAR)) {
            return CHAR;
        }
        if (this.equals(BOXED_FLOAT)) {
            return FLOAT;
        }
        if (this.equals(BOXED_DOUBLE)) {
            return DOUBLE;
        }
        throw new UnsupportedOperationException("cannot unbox " + this);
    }

    public final boolean equals(Object o) {
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

    public final int hashCode() {
        return this.toString().hashCode();
    }

    public final String toString() {
        String result = this.cachedString;
        if (result == null) {
            try {
                StringBuilder resultBuilder = new StringBuilder();
                CodeWriter codeWriter = new CodeWriter(resultBuilder);
                this.emit(codeWriter);
                this.cachedString = result = resultBuilder.toString();
            } catch (IOException e) {
                throw new AssertionError();
            }
        }
        return result;
    }

    CodeWriter emit(CodeWriter out) throws IOException {
        if (this.keyword == null) {
            throw new AssertionError();
        }
        if (this.isAnnotated()) {
            out.emit("");
            this.emitAnnotations(out);
        }
        return out.emitAndIndent(this.keyword);
    }

    CodeWriter emitAnnotations(CodeWriter out) throws IOException {
        for (AnnotationSpec annotation : this.annotations) {
            annotation.emit(out, true);
            out.emit(" ");
        }
        return out;
    }

    public static TypeName get(TypeMirror mirror) {
        return TypeName.get(mirror, new LinkedHashMap<TypeParameterElement, TypeVariableName>());
    }

    static TypeName get(TypeMirror mirror, final Map<TypeParameterElement, TypeVariableName> typeVariables) {
        return mirror.accept(new SimpleTypeVisitor8<TypeName, Void>(){

            @Override
            public TypeName visitPrimitive(PrimitiveType t, Void p) {
                switch (t.getKind()) {
                    case BOOLEAN: {
                        return BOOLEAN;
                    }
                    case BYTE: {
                        return BYTE;
                    }
                    case SHORT: {
                        return SHORT;
                    }
                    case INT: {
                        return INT;
                    }
                    case LONG: {
                        return LONG;
                    }
                    case CHAR: {
                        return CHAR;
                    }
                    case FLOAT: {
                        return FLOAT;
                    }
                    case DOUBLE: {
                        return DOUBLE;
                    }
                }
                throw new AssertionError();
            }

            @Override
            public TypeName visitDeclared(DeclaredType t, Void p) {
                TypeName enclosing;
                ClassName rawType = ClassName.get((TypeElement)t.asElement());
                TypeMirror enclosingType = t.getEnclosingType();
                TypeName typeName = enclosing = enclosingType.getKind() != TypeKind.NONE && !t.asElement().getModifiers().contains((Object)Modifier.STATIC) ? enclosingType.accept(this, null) : null;
                if (t.getTypeArguments().isEmpty() && !(enclosing instanceof ParameterizedTypeName)) {
                    return rawType;
                }
                ArrayList<TypeName> typeArgumentNames = new ArrayList<TypeName>();
                for (TypeMirror typeMirror : t.getTypeArguments()) {
                    typeArgumentNames.add(TypeName.get(typeMirror, typeVariables));
                }
                return enclosing instanceof ParameterizedTypeName ? ((ParameterizedTypeName)enclosing).nestedClass(rawType.simpleName(), typeArgumentNames) : new ParameterizedTypeName(null, rawType, typeArgumentNames);
            }

            @Override
            public TypeName visitError(ErrorType t, Void p) {
                return this.visitDeclared((DeclaredType)t, p);
            }

            @Override
            public ArrayTypeName visitArray(ArrayType t, Void p) {
                return ArrayTypeName.get(t, (Map<TypeParameterElement, TypeVariableName>)typeVariables);
            }

            @Override
            public TypeName visitTypeVariable(javax.lang.model.type.TypeVariable t, Void p) {
                return TypeVariableName.get(t, (Map<TypeParameterElement, TypeVariableName>)typeVariables);
            }

            @Override
            public TypeName visitWildcard(WildcardType t, Void p) {
                return WildcardTypeName.get(t, (Map<TypeParameterElement, TypeVariableName>)typeVariables);
            }

            @Override
            public TypeName visitNoType(NoType t, Void p) {
                if (t.getKind() == TypeKind.VOID) {
                    return VOID;
                }
                return (TypeName)super.visitUnknown(t, p);
            }

            @Override
            protected TypeName defaultAction(TypeMirror e, Void p) {
                throw new IllegalArgumentException("Unexpected type mirror: " + e);
            }
        }, null);
    }

    public static TypeName get(Type type2) {
        return TypeName.get(type2, new LinkedHashMap<Type, TypeVariableName>());
    }

    static TypeName get(Type type2, Map<Type, TypeVariableName> map2) {
        if (type2 instanceof Class) {
            Class classType = (Class)type2;
            if (type2 == Void.TYPE) {
                return VOID;
            }
            if (type2 == Boolean.TYPE) {
                return BOOLEAN;
            }
            if (type2 == Byte.TYPE) {
                return BYTE;
            }
            if (type2 == Short.TYPE) {
                return SHORT;
            }
            if (type2 == Integer.TYPE) {
                return INT;
            }
            if (type2 == Long.TYPE) {
                return LONG;
            }
            if (type2 == Character.TYPE) {
                return CHAR;
            }
            if (type2 == Float.TYPE) {
                return FLOAT;
            }
            if (type2 == Double.TYPE) {
                return DOUBLE;
            }
            if (classType.isArray()) {
                return ArrayTypeName.of(TypeName.get(classType.getComponentType(), map2));
            }
            return ClassName.get(classType);
        }
        if (type2 instanceof ParameterizedType) {
            return ParameterizedTypeName.get((ParameterizedType)type2, map2);
        }
        if (type2 instanceof java.lang.reflect.WildcardType) {
            return WildcardTypeName.get((java.lang.reflect.WildcardType)type2, map2);
        }
        if (type2 instanceof TypeVariable) {
            return TypeVariableName.get((TypeVariable)type2, map2);
        }
        if (type2 instanceof GenericArrayType) {
            return ArrayTypeName.get((GenericArrayType)type2, map2);
        }
        throw new IllegalArgumentException("unexpected type: " + type2);
    }

    static List<TypeName> list(Type[] types) {
        return TypeName.list(types, new LinkedHashMap<Type, TypeVariableName>());
    }

    static List<TypeName> list(Type[] types, Map<Type, TypeVariableName> map2) {
        ArrayList<TypeName> result = new ArrayList<TypeName>(types.length);
        for (Type type2 : types) {
            result.add(TypeName.get(type2, map2));
        }
        return result;
    }

    static TypeName arrayComponent(TypeName type2) {
        return type2 instanceof ArrayTypeName ? ((ArrayTypeName)type2).componentType : null;
    }

    static ArrayTypeName asArray(TypeName type2) {
        return type2 instanceof ArrayTypeName ? (ArrayTypeName)type2 : null;
    }
}

