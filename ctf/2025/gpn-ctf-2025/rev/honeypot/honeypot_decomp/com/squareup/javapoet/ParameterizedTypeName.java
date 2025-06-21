/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;
import com.squareup.javapoet.Util;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ParameterizedTypeName
extends TypeName {
    private final ParameterizedTypeName enclosingType;
    public final ClassName rawType;
    public final List<TypeName> typeArguments;

    ParameterizedTypeName(ParameterizedTypeName enclosingType, ClassName rawType, List<TypeName> typeArguments) {
        this(enclosingType, rawType, typeArguments, new ArrayList<AnnotationSpec>());
    }

    private ParameterizedTypeName(ParameterizedTypeName enclosingType, ClassName rawType, List<TypeName> typeArguments, List<AnnotationSpec> annotations) {
        super(annotations);
        this.rawType = Util.checkNotNull(rawType, "rawType == null", new Object[0]).annotated((List)annotations);
        this.enclosingType = enclosingType;
        this.typeArguments = Util.immutableList(typeArguments);
        Util.checkArgument(!this.typeArguments.isEmpty() || enclosingType != null, "no type arguments: %s", rawType);
        for (TypeName typeArgument : this.typeArguments) {
            Util.checkArgument(!typeArgument.isPrimitive() && typeArgument != VOID, "invalid type parameter: %s", typeArgument);
        }
    }

    @Override
    public ParameterizedTypeName annotated(List<AnnotationSpec> annotations) {
        return new ParameterizedTypeName(this.enclosingType, this.rawType, this.typeArguments, this.concatAnnotations(annotations));
    }

    @Override
    public TypeName withoutAnnotations() {
        return new ParameterizedTypeName(this.enclosingType, this.rawType.withoutAnnotations(), this.typeArguments, new ArrayList<AnnotationSpec>());
    }

    @Override
    CodeWriter emit(CodeWriter out) throws IOException {
        if (this.enclosingType != null) {
            this.enclosingType.emit(out);
            out.emit(".");
            if (this.isAnnotated()) {
                out.emit(" ");
                this.emitAnnotations(out);
            }
            out.emit(this.rawType.simpleName());
        } else {
            this.rawType.emit(out);
        }
        if (!this.typeArguments.isEmpty()) {
            out.emitAndIndent("<");
            boolean firstParameter = true;
            for (TypeName parameter : this.typeArguments) {
                if (!firstParameter) {
                    out.emitAndIndent(", ");
                }
                parameter.emit(out);
                firstParameter = false;
            }
            out.emitAndIndent(">");
        }
        return out;
    }

    public ParameterizedTypeName nestedClass(String name) {
        Util.checkNotNull(name, "name == null", new Object[0]);
        return new ParameterizedTypeName(this, this.rawType.nestedClass(name), new ArrayList<TypeName>(), new ArrayList<AnnotationSpec>());
    }

    public ParameterizedTypeName nestedClass(String name, List<TypeName> typeArguments) {
        Util.checkNotNull(name, "name == null", new Object[0]);
        return new ParameterizedTypeName(this, this.rawType.nestedClass(name), typeArguments, new ArrayList<AnnotationSpec>());
    }

    public static ParameterizedTypeName get(ClassName rawType, TypeName ... typeArguments) {
        return new ParameterizedTypeName(null, rawType, Arrays.asList(typeArguments));
    }

    public static ParameterizedTypeName get(Class<?> rawType, Type ... typeArguments) {
        return new ParameterizedTypeName(null, ClassName.get(rawType), ParameterizedTypeName.list(typeArguments));
    }

    public static ParameterizedTypeName get(ParameterizedType type2) {
        return ParameterizedTypeName.get(type2, new LinkedHashMap<Type, TypeVariableName>());
    }

    static ParameterizedTypeName get(ParameterizedType type2, Map<Type, TypeVariableName> map2) {
        ClassName rawType = ClassName.get((Class)type2.getRawType());
        ParameterizedType ownerType = type2.getOwnerType() instanceof ParameterizedType && !Modifier.isStatic(((Class)type2.getRawType()).getModifiers()) ? (ParameterizedType)type2.getOwnerType() : null;
        List<TypeName> typeArguments = TypeName.list(type2.getActualTypeArguments(), map2);
        return ownerType != null ? ParameterizedTypeName.get(ownerType, map2).nestedClass(rawType.simpleName(), typeArguments) : new ParameterizedTypeName(null, rawType, typeArguments);
    }
}

