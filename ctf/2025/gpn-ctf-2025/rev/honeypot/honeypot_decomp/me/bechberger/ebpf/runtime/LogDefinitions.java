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
import me.bechberger.ebpf.runtime.CperDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LogDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __log_error(@Unsigned int bank, @Unsigned long status, @Unsigned long addr2, @Unsigned long misc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean _log_error_deferred(@Unsigned int bank, @Unsigned int misc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void log_and_reset_block(Ptr<misc.threshold_block> block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long log_zero_flags_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void log_arm_hw_error(Ptr<CperDefinitions.cper_sec_proc_arm> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void log_buf_add_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String log_buf_addr_get() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int log_buf_len_get() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int log_buf_len_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void log_buf_len_update(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void log_buf_vmcoreinfo_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="log_non_standard_event((const struct {\n  u8 b[16];\n}*)$arg1, (const struct {\n  u8 b[16];\n}*)$arg2, (const u8*)$arg3, (const u8)$arg4, (const u8*)$arg5, (const unsigned int)$arg6)")
    public static void log_non_standard_event(Ptr<@OriginalName(value="guid_t") misc.uuid_t> sec_type, Ptr<@OriginalName(value="guid_t") misc.uuid_t> fru_id, String fru_text, char sev, Ptr<Character> err, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 level; u8 logflags; }")
    @NotUsableInJava
    public static class log_of_u_of_nf_loginfo
    extends Struct {
        public @OriginalName(value="u_int8_t") char level;
        public @OriginalName(value="u_int8_t") char logflags;
    }
}

