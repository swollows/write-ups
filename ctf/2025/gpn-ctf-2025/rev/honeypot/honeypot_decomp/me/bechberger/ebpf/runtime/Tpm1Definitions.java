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
import me.bechberger.ebpf.runtime.CapDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TpmDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Tpm1Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm1_auto_startup(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tpm1_calc_ordinal_duration(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int ordinal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm1_do_selftest(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm1_get_pcr_allocation(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm1_get_random(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<Character> dest, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm1_get_timeouts(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm1_getcap($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long tpm1_getcap(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int subcap_id, Ptr<CapDefinitions.cap_t> cap, String desc, @Unsigned long min_cap_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm1_pcr_extend($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static int tpm1_pcr_extend(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int pcr_idx, Ptr<Character> hash2, String log_msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm1_pcr_read(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int pcr_idx, Ptr<Character> res_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm1_pm_suspend(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int tpm_suspend_pcr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm1_ascii_bios_measurements_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm1_binary_bios_measurements_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tpm1_bios_measurements_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tpm1_bios_measurements_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm1_bios_measurements_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tpm1_get_random_out")
    @NotUsableInJava
    public static class tpm1_get_random_out
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int rng_data_len;
        public char @Size(value=128) [] rng_data;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm1_version2")
    @NotUsableInJava
    public static class tpm1_version2
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short tag;
        public tpm1_version version;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm1_version")
    @NotUsableInJava
    public static class tpm1_version
    extends Struct {
        public char major;
        public char minor;
        public char rev_major;
        public char rev_minor;
    }
}

