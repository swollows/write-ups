/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.type;

import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

public class TypeUtils {
    private final Types types;
    private final Elements elements;

    public TypeUtils(Types types, Elements elements) {
        this.types = types;
        this.elements = elements;
    }

    public TypeMirror getTypeMirror(Class<?> klass) {
        return this.elements.getTypeElement(klass.getCanonicalName()).asType();
    }

    public boolean hasSuperClass(Element element, Class<?> klass) {
        return this.types.isSameType(((TypeElement)element).getSuperclass(), this.getTypeMirror(klass));
    }

    public boolean hasClassIgnoringTypeParameters(Element element, String klass) {
        return this.types.erasure(element.asType()).toString().equals(klass);
    }

    public boolean hasSameSuperclassIgnoringTypeParameters(Element element, Class<?> klass) {
        return this.types.isSameType(this.types.erasure(((TypeElement)element).getSuperclass()), this.types.erasure(this.getTypeMirror(klass)));
    }

    public boolean implementsInterface(Element element, Class<?> klass) {
        return ((TypeElement)element).getInterfaces().stream().anyMatch(t -> this.types.isSameType((TypeMirror)t, this.getTypeMirror(klass)));
    }

    public boolean implementsInterfaceIgnoringTypeParameters(Element element, Class<?> klass) {
        TypeMirror erasedKlass = this.types.erasure(this.getTypeMirror(klass));
        return ((TypeElement)element).getInterfaces().stream().anyMatch(t -> this.types.isSameType(this.types.erasure((TypeMirror)t), erasedKlass));
    }
}

