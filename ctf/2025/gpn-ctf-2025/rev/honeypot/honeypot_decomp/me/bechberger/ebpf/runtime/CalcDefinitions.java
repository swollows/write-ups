/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.ImaDefinitions;
import me.bechberger.ebpf.runtime.IocDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class CalcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_global_load() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_global_load_tick(Ptr<runtime.rq> this_rq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long calc_load_fold_active(Ptr<runtime.rq> this_rq, long adjust) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long calc_load_n(@Unsigned long load, @Unsigned long exp, @Unsigned long active, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_load_nohz_remote(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_load_nohz_start() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_load_nohz_stop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PciDefinitions.pci_p2pdma_map_type calc_map_type_and_dist(Ptr<PciDefinitions.pci_dev> provider, Ptr<PciDefinitions.pci_dev> client, Ptr<Integer> dist, boolean verbose) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_mode_timings(int xres, int yres, int refresh, Ptr<FbDefinitions.fb_videomode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calc_wheel_index(@Unsigned long expires, @Unsigned long clk2, Ptr<@Unsigned Long> bucket_expiry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calc_buffer_shash_tfm((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static int calc_buffer_shash_tfm(Ptr<?> buf, @OriginalName(value="loff_t") long size, Ptr<ImaDefinitions.ima_digest_data> hash2, Ptr<CryptoDefinitions.crypto_shash> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_lcoefs(@Unsigned long bps, @Unsigned long seqiops, @Unsigned long randiops, Ptr<@Unsigned Long> page2, Ptr<@Unsigned Long> seqio, Ptr<@Unsigned Long> randio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_mmioh_map(misc.mmioh_arch index2, int min_pnode, int max_pnode, int shift, @Unsigned long base, int m_io, int n_io) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_vtime_cost_builtin(Ptr<runtime.bio> bio2, Ptr<IocDefinitions.ioc_gq> iocg, boolean is_merge, Ptr<@Unsigned Long> costp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int calc_checksum(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calc_timer_values(Ptr<PerfDefinitions.perf_event> event2, Ptr<@Unsigned Long> now, Ptr<@Unsigned Long> enabled, Ptr<@Unsigned Long> running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long calc_tpm2_event_size(Ptr<misc.tcg_pcr_event2_head> event2, Ptr<misc.tcg_pcr_event> event_header2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

