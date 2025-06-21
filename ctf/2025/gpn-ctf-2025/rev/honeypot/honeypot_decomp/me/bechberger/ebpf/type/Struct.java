/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import me.bechberger.ebpf.type.BPFType;

public class Struct {
    private List<BPFType.InlineUnion> inlineUnions = new ArrayList<BPFType.InlineUnion>();

    public String toString() {
        return this.getClass().getName() + "{" + Arrays.stream(this.getClass().getDeclaredFields()).map(f -> {
            try {
                f.setAccessible(true);
                return f.getName() + " = " + String.valueOf(f.get(this));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.joining(", ")) + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Struct that = (Struct)obj;
        return Arrays.stream(obj.getClass().getDeclaredFields()).allMatch(f -> {
            try {
                f.setAccessible(true);
                return Objects.equals(f.get(this), f.get(that));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public int hashCode() {
        return Arrays.stream(this.getClass().getDeclaredFields()).map(f -> {
            try {
                return Objects.hashCode(f.get(this));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }).reduce(1, (a, b) -> 31 * a + b);
    }
}

