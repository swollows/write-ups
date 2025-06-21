/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.Util;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.TypeMirror;

public final class TypeVariableName
extends TypeName {
    public final String name;
    public final List<TypeName> bounds;

    private TypeVariableName(String name, List<TypeName> bounds) {
        this(name, bounds, new ArrayList<AnnotationSpec>());
    }

    private TypeVariableName(String name, List<TypeName> bounds, List<AnnotationSpec> annotations) {
        super(annotations);
        this.name = Util.checkNotNull(name, "name == null", new Object[0]);
        this.bounds = bounds;
        for (TypeName bound : this.bounds) {
            Util.checkArgument(!bound.isPrimitive() && bound != VOID, "invalid bound: %s", bound);
        }
    }

    @Override
    public TypeVariableName annotated(List<AnnotationSpec> annotations) {
        return new TypeVariableName(this.name, this.bounds, annotations);
    }

    @Override
    public TypeName withoutAnnotations() {
        return new TypeVariableName(this.name, this.bounds);
    }

    public TypeVariableName withBounds(Type ... bounds) {
        return this.withBounds(TypeName.list(bounds));
    }

    public TypeVariableName withBounds(TypeName ... bounds) {
        return this.withBounds(Arrays.asList(bounds));
    }

    public TypeVariableName withBounds(List<? extends TypeName> bounds) {
        ArrayList<TypeName> newBounds = new ArrayList<TypeName>();
        newBounds.addAll(this.bounds);
        newBounds.addAll(bounds);
        return new TypeVariableName(this.name, newBounds, this.annotations);
    }

    private static TypeVariableName of(String name, List<TypeName> bounds) {
        ArrayList<TypeName> boundsNoObject = new ArrayList<TypeName>(bounds);
        boundsNoObject.remove(OBJECT);
        return new TypeVariableName(name, Collections.unmodifiableList(boundsNoObject));
    }

    @Override
    CodeWriter emit(CodeWriter out) throws IOException {
        this.emitAnnotations(out);
        return out.emitAndIndent(this.name);
    }

    public static TypeVariableName get(String name) {
        return TypeVariableName.of(name, Collections.emptyList());
    }

    public static TypeVariableName get(String name, TypeName ... bounds) {
        return TypeVariableName.of(name, Arrays.asList(bounds));
    }

    public static TypeVariableName get(String name, Type ... bounds) {
        return TypeVariableName.of(name, TypeName.list(bounds));
    }

    public static TypeVariableName get(javax.lang.model.type.TypeVariable mirror) {
        return TypeVariableName.get((TypeParameterElement)mirror.asElement());
    }

    static TypeVariableName get(javax.lang.model.type.TypeVariable mirror, Map<TypeParameterElement, TypeVariableName> typeVariables) {
        TypeParameterElement element = (TypeParameterElement)mirror.asElement();
        TypeVariableName typeVariableName = typeVariables.get(element);
        if (typeVariableName == null) {
            ArrayList<TypeName> bounds = new ArrayList<TypeName>();
            List<TypeName> visibleBounds = Collections.unmodifiableList(bounds);
            typeVariableName = new TypeVariableName(element.getSimpleName().toString(), visibleBounds);
            typeVariables.put(element, typeVariableName);
            for (TypeMirror typeMirror : element.getBounds()) {
                bounds.add(TypeName.get(typeMirror, typeVariables));
            }
            bounds.remove(OBJECT);
        }
        return typeVariableName;
    }

    public static TypeVariableName get(TypeParameterElement element) {
        String name = element.getSimpleName().toString();
        List<? extends TypeMirror> boundsMirrors = element.getBounds();
        ArrayList<TypeName> boundsTypeNames = new ArrayList<TypeName>();
        for (TypeMirror typeMirror : boundsMirrors) {
            boundsTypeNames.add(TypeName.get(typeMirror));
        }
        return TypeVariableName.of(name, boundsTypeNames);
    }

    public static TypeVariableName get(TypeVariable<?> type2) {
        return TypeVariableName.get(type2, new LinkedHashMap<Type, TypeVariableName>());
    }

    static TypeVariableName get(TypeVariable<?> type2, Map<Type, TypeVariableName> map2) {
        TypeVariableName result = map2.get(type2);
        if (result == null) {
            ArrayList<TypeName> bounds = new ArrayList<TypeName>();
            List<TypeName> visibleBounds = Collections.unmodifiableList(bounds);
            result = new TypeVariableName(type2.getName(), visibleBounds);
            map2.put(type2, result);
            for (Type bound : type2.getBounds()) {
                bounds.add(TypeName.get(bound, map2));
            }
            bounds.remove(OBJECT);
        }
        return result;
    }
}

