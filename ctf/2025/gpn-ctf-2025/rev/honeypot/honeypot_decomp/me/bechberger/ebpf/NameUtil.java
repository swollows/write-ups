/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf;

public class NameUtil {
    public static String toSnakeCase(String name) {
        return name.replaceAll("([a-z0-9])([A-Z])", "$1_$2");
    }

    public static String toConstantCase(String name) {
        return NameUtil.toSnakeCase(name).toUpperCase();
    }
}

