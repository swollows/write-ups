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
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.TypeMirror;

public final class WildcardTypeName
extends TypeName {
    public final List<TypeName> upperBounds;
    public final List<TypeName> lowerBounds;

    private WildcardTypeName(List<TypeName> upperBounds, List<TypeName> lowerBounds) {
        this(upperBounds, lowerBounds, new ArrayList<AnnotationSpec>());
    }

    private WildcardTypeName(List<TypeName> upperBounds, List<TypeName> lowerBounds, List<AnnotationSpec> annotations) {
        super(annotations);
        this.upperBounds = Util.immutableList(upperBounds);
        this.lowerBounds = Util.immutableList(lowerBounds);
        Util.checkArgument(this.upperBounds.size() == 1, "unexpected extends bounds: %s", upperBounds);
        for (TypeName upperBound : this.upperBounds) {
            Util.checkArgument(!upperBound.isPrimitive() && upperBound != VOID, "invalid upper bound: %s", upperBound);
        }
        for (TypeName lowerBound : this.lowerBounds) {
            Util.checkArgument(!lowerBound.isPrimitive() && lowerBound != VOID, "invalid lower bound: %s", lowerBound);
        }
    }

    @Override
    public WildcardTypeName annotated(List<AnnotationSpec> annotations) {
        return new WildcardTypeName(this.upperBounds, this.lowerBounds, this.concatAnnotations(annotations));
    }

    @Override
    public TypeName withoutAnnotations() {
        return new WildcardTypeName(this.upperBounds, this.lowerBounds);
    }

    @Override
    CodeWriter emit(CodeWriter out) throws IOException {
        if (this.lowerBounds.size() == 1) {
            return out.emit("? super $T", this.lowerBounds.get(0));
        }
        return this.upperBounds.get(0).equals(TypeName.OBJECT) ? out.emit("?") : out.emit("? extends $T", this.upperBounds.get(0));
    }

    public static WildcardTypeName subtypeOf(TypeName upperBound) {
        return new WildcardTypeName(Collections.singletonList(upperBound), Collections.emptyList());
    }

    public static WildcardTypeName subtypeOf(Type upperBound) {
        return WildcardTypeName.subtypeOf(TypeName.get(upperBound));
    }

    public static WildcardTypeName supertypeOf(TypeName lowerBound) {
        return new WildcardTypeName(Collections.singletonList(OBJECT), Collections.singletonList(lowerBound));
    }

    public static WildcardTypeName supertypeOf(Type lowerBound) {
        return WildcardTypeName.supertypeOf(TypeName.get(lowerBound));
    }

    public static TypeName get(javax.lang.model.type.WildcardType mirror) {
        return WildcardTypeName.get(mirror, new LinkedHashMap<TypeParameterElement, TypeVariableName>());
    }

    static TypeName get(javax.lang.model.type.WildcardType mirror, Map<TypeParameterElement, TypeVariableName> typeVariables) {
        TypeMirror extendsBound = mirror.getExtendsBound();
        if (extendsBound == null) {
            TypeMirror superBound = mirror.getSuperBound();
            if (superBound == null) {
                return WildcardTypeName.subtypeOf(Object.class);
            }
            return WildcardTypeName.supertypeOf(TypeName.get(superBound, typeVariables));
        }
        return WildcardTypeName.subtypeOf(TypeName.get(extendsBound, typeVariables));
    }

    public static TypeName get(WildcardType wildcardName) {
        return WildcardTypeName.get(wildcardName, new LinkedHashMap<Type, TypeVariableName>());
    }

    static TypeName get(WildcardType wildcardName, Map<Type, TypeVariableName> map2) {
        return new WildcardTypeName(WildcardTypeName.list(wildcardName.getUpperBounds(), map2), WildcardTypeName.list(wildcardName.getLowerBounds(), map2));
    }
}

