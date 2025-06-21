/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.type;

import me.bechberger.ebpf.type.Typedef;

public abstract class TypedefBase<T>
implements Typedef<T> {
    private final T val;

    public TypedefBase(T val) {
        this.val = val;
    }

    @Override
    public T val() {
        return this.val;
    }

    public boolean equals(Object obj) {
        return obj instanceof TypedefBase ? this.val.equals(((TypedefBase)obj).val) : this.val.equals(obj);
    }

    public int hashCode() {
        return this.val.hashCode();
    }

    public String toString() {
        return this.val.toString();
    }
}

