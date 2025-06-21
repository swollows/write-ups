/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;
import com.squareup.javapoet.Util;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.ArrayType;

public final class ArrayTypeName
extends TypeName {
    public final TypeName componentType;

    private ArrayTypeName(TypeName componentType) {
        this(componentType, new ArrayList<AnnotationSpec>());
    }

    private ArrayTypeName(TypeName componentType, List<AnnotationSpec> annotations) {
        super(annotations);
        this.componentType = Util.checkNotNull(componentType, "rawType == null", new Object[0]);
    }

    @Override
    public ArrayTypeName annotated(List<AnnotationSpec> annotations) {
        return new ArrayTypeName(this.componentType, this.concatAnnotations(annotations));
    }

    @Override
    public TypeName withoutAnnotations() {
        return new ArrayTypeName(this.componentType);
    }

    @Override
    CodeWriter emit(CodeWriter out) throws IOException {
        return this.emit(out, false);
    }

    CodeWriter emit(CodeWriter out, boolean varargs) throws IOException {
        this.emitLeafType(out);
        return this.emitBrackets(out, varargs);
    }

    private CodeWriter emitLeafType(CodeWriter out) throws IOException {
        if (TypeName.asArray(this.componentType) != null) {
            return TypeName.asArray(this.componentType).emitLeafType(out);
        }
        return this.componentType.emit(out);
    }

    private CodeWriter emitBrackets(CodeWriter out, boolean varargs) throws IOException {
        if (this.isAnnotated()) {
            out.emit(" ");
            this.emitAnnotations(out);
        }
        if (TypeName.asArray(this.componentType) == null) {
            return out.emit(varargs ? "..." : "[]");
        }
        out.emit("[]");
        return TypeName.asArray(this.componentType).emitBrackets(out, varargs);
    }

    public static ArrayTypeName of(TypeName componentType) {
        return new ArrayTypeName(componentType);
    }

    public static ArrayTypeName of(Type componentType) {
        return ArrayTypeName.of(TypeName.get(componentType));
    }

    public static ArrayTypeName get(ArrayType mirror) {
        return ArrayTypeName.get(mirror, new LinkedHashMap<TypeParameterElement, TypeVariableName>());
    }

    static ArrayTypeName get(ArrayType mirror, Map<TypeParameterElement, TypeVariableName> typeVariables) {
        return new ArrayTypeName(ArrayTypeName.get(mirror.getComponentType(), typeVariables));
    }

    public static ArrayTypeName get(GenericArrayType type2) {
        return ArrayTypeName.get(type2, new LinkedHashMap<Type, TypeVariableName>());
    }

    static ArrayTypeName get(GenericArrayType type2, Map<Type, TypeVariableName> map2) {
        return ArrayTypeName.of(ArrayTypeName.get(type2.getGenericComponentType(), map2));
    }
}

