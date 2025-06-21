/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.type;

import java.lang.reflect.Field;
import java.util.Map;
import me.bechberger.ebpf.type.BoxHelper;
import me.bechberger.ebpf.type.Struct;

public class Union
extends Struct {
    Map<String, Object> originalValues = null;

    public <U extends Union> U init(Map<String, Object> originalValues) {
        this.originalValues = originalValues;
        for (Map.Entry<String, Object> entry : originalValues.entrySet()) {
            Field field;
            try {
                field = this.getClass().getDeclaredField(entry.getKey());
            } catch (NoSuchFieldException e) {
                throw new RuntimeException("Field " + entry.getKey() + " does not exist", e);
            }
            Object unboxed = BoxHelper.unbox(entry.getValue(), field.getType());
            try {
                field.setAccessible(true);
                field.set(this, unboxed);
            } catch (IllegalAccessException | IllegalArgumentException e) {
                throw new IllegalArgumentException("Could not set field " + entry.getKey(), e);
            }
        }
        return (U)this;
    }
}

