/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.type;

import java.lang.reflect.Field;
import me.bechberger.ebpf.annotations.EnumMember;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import org.jetbrains.annotations.Nullable;

public interface Enum<T extends java.lang.Enum<T>> {
    @BuiltinBPFFunction(value="(long)($this)")
    default public long value() {
        return EnumSupport.value((java.lang.Enum)((Object)this));
    }

    @BuiltinBPFFunction(value="($arg1)")
    @Nullable
    default public T fromValue(long value) {
        return (T)EnumSupport.fromValue(this.getClass(), value);
    }

    @BuiltinBPFFunction(value="($T1)($arg1)")
    @NotUsableInJava
    public static <T extends java.lang.Enum<T>> T ofValue(long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    default public String toStr() {
        return ((java.lang.Enum)((Object)this)).name() + "(" + this.value() + ")";
    }

    public static class EnumSupport {
        public static <T extends java.lang.Enum<T>> T fromValue(Class<T> enumClass, long value) {
            java.lang.Enum[] members = (java.lang.Enum[])enumClass.getEnumConstants();
            long currentValue = 0L;
            for (java.lang.Enum t : members) {
                long val = EnumSupport.getMemberAnnotationValue(t);
                if (val != -1L) {
                    if (val == value) {
                        return (T)t;
                    }
                    currentValue = val + 1L;
                    continue;
                }
                if (currentValue == value) {
                    return (T)t;
                }
                ++currentValue;
            }
            return null;
        }

        private static <T extends java.lang.Enum<T>> long getMemberAnnotationValue(T enumMember) {
            Field field = enumMember.getClass().getDeclaredFields()[enumMember.ordinal()];
            EnumMember ann = field.getAnnotation(EnumMember.class);
            return ann == null ? -1L : ann.value();
        }

        public static <T extends java.lang.Enum<T>> long value(T enumMember) {
            long val = EnumSupport.getMemberAnnotationValue(enumMember);
            if (val != -1L) {
                return val;
            }
            java.lang.Enum[] members = (java.lang.Enum[])enumMember.getClass().getEnumConstants();
            for (int i = 0; i < enumMember.ordinal(); ++i) {
                java.lang.Enum member = members[i];
                val = EnumSupport.getMemberAnnotationValue(member);
                if (val == -1L) continue;
                return val + (long)(enumMember.ordinal() - i);
            }
            return enumMember.ordinal();
        }

        public static <T extends java.lang.Enum<T>> String toString(T enumMember) {
            return enumMember.name() + "(" + EnumSupport.value(enumMember) + ")";
        }
    }
}

