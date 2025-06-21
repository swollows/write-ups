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
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class WarnDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__warn_printk((const u8*)$arg1, $arg2_)")
    public static void __warn_printk(String fmt, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __warn_thunk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int warn_bootconfig(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long warn_count_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="warn_unsupported($arg1, (const u8*)$arg2)")
    public static int warn_unsupported(Ptr<runtime.file> file2, String op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="warn_invalid_dmar($arg1, (const u8*)$arg2)")
    public static void warn_invalid_dmar(@Unsigned long addr2, String message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__wsum") int warn_crc32c_csum_combine(@Unsigned @OriginalName(value="__wsum") int csum, @Unsigned @OriginalName(value="__wsum") int csum2, int offset, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="warn_crc32c_csum_update((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="__wsum") int warn_crc32c_csum_update(Ptr<?> buff, int len, @Unsigned @OriginalName(value="__wsum") int sum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __warn_flushing_systemwide_wq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="warn_alloc($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void warn_alloc(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<misc.nodemask_t> nodemask, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="warn_bad_vsyscall((const u8*)$arg1, $arg2, (const u8*)$arg3)")
    public static void warn_bad_vsyscall(String level, Ptr<PtDefinitions.pt_regs> regs, String message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void warn_thunk_thunk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct warn_args")
    @NotUsableInJava
    public static class warn_args
    extends Struct {
        public String fmt;
        public misc.__va_list_tag @Size(value=1) @OriginalName(value="va_list") [] args;
    }
}

