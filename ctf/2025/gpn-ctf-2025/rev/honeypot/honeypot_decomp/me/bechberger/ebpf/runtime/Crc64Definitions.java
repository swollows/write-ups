/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Crc64Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="crc64_be($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long crc64_be(@Unsigned long crc, Ptr<?> p, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc64_rocksoft((const u8*)$arg1, $arg2)")
    public static @Unsigned long crc64_rocksoft(String buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc64_rocksoft_generic($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long crc64_rocksoft_generic(@Unsigned long crc, Ptr<?> p, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crc64_rocksoft_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc64_rocksoft_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc64_rocksoft_notify(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crc64_rocksoft_rehash(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc64_rocksoft_transform_show($arg1, (const struct kernel_param*)$arg2)")
    public static int crc64_rocksoft_transform_show(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc64_rocksoft_update($arg1, (const u8*)$arg2, $arg3)")
    public static @Unsigned long crc64_rocksoft_update(@Unsigned long crc, String buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crc64_rocksoft_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc64_rocksoft_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct crc64_pi_tuple")
    @NotUsableInJava
    public static class crc64_pi_tuple
    extends Struct {
        public @Unsigned @OriginalName(value="__be64") long guard_tag;
        public @Unsigned @OriginalName(value="__be16") short app_tag;
        public char @Size(value=6) [] ref_tag;
    }
}

