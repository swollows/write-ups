/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Utf8Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="utf8_to_utf32((const u8*)$arg1, $arg2, $arg3)")
    public static int utf8_to_utf32(Ptr<Character> s2, int inlen, Ptr<@Unsigned @OriginalName(value="unicode_t") Integer> pu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="utf8_casefold((const struct unicode_map*)$arg1, (const struct qstr*)$arg2, $arg3, $arg4)")
    public static int utf8_casefold(Ptr<misc.unicode_map> um, Ptr<runtime.qstr> str, String dest, @Unsigned long dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="utf8_casefold_hash((const struct unicode_map*)$arg1, (const void*)$arg2, $arg3)")
    public static int utf8_casefold_hash(Ptr<misc.unicode_map> um, Ptr<?> salt2, Ptr<runtime.qstr> str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.unicode_map> utf8_load(@Unsigned int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="utf8_normalize((const struct unicode_map*)$arg1, (const struct qstr*)$arg2, $arg3, $arg4)")
    public static int utf8_normalize(Ptr<misc.unicode_map> um, Ptr<runtime.qstr> str, String dest, @Unsigned long dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="utf8_strncasecmp((const struct unicode_map*)$arg1, (const struct qstr*)$arg2, (const struct qstr*)$arg3)")
    public static int utf8_strncasecmp(Ptr<misc.unicode_map> um, Ptr<runtime.qstr> s1, Ptr<runtime.qstr> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="utf8_strncasecmp_folded((const struct unicode_map*)$arg1, (const struct qstr*)$arg2, (const struct qstr*)$arg3)")
    public static int utf8_strncasecmp_folded(Ptr<misc.unicode_map> um, Ptr<runtime.qstr> cf, Ptr<runtime.qstr> s1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="utf8_strncmp((const struct unicode_map*)$arg1, (const struct qstr*)$arg2, (const struct qstr*)$arg3)")
    public static int utf8_strncmp(Ptr<misc.unicode_map> um, Ptr<runtime.qstr> s1, Ptr<runtime.qstr> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void utf8_unload(Ptr<misc.unicode_map> um) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="utf8_validate((const struct unicode_map*)$arg1, (const struct qstr*)$arg2)")
    public static int utf8_validate(Ptr<misc.unicode_map> um, Ptr<runtime.qstr> str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct utf8_table")
    @NotUsableInJava
    public static class utf8_table
    extends Struct {
        public int cmask;
        public int cval;
        public int shift;
        public long lmask;
        public long lval;
    }

    @Type(noCCodeGeneration=true, cType="enum utf8_normalization")
    public static enum utf8_normalization implements Enum<utf8_normalization>,
    TypedEnum<utf8_normalization, Integer>
    {
        UTF8_NFDI,
        UTF8_NFDICF,
        UTF8_NMAX;

    }
}

