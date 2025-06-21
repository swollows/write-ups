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
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class GnetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ___gnet_stats_copy_basic(Ptr<gnet_dump> d, Ptr<gnet_stats_basic_sync> cpu2, Ptr<gnet_stats_basic_sync> b, int type2, boolean running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnet_stats_add_basic(Ptr<gnet_stats_basic_sync> bstats, Ptr<gnet_stats_basic_sync> cpu2, Ptr<gnet_stats_basic_sync> b, boolean running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gnet_stats_add_queue($arg1, (const struct gnet_stats_queue*)$arg2, (const struct gnet_stats_queue*)$arg3)")
    public static void gnet_stats_add_queue(Ptr<gnet_stats_queue> qstats, Ptr<gnet_stats_queue> cpu2, Ptr<gnet_stats_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gnet_stats_basic_sync_init(Ptr<gnet_stats_basic_sync> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnet_stats_copy_app(Ptr<gnet_dump> d, Ptr<?> st2, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnet_stats_copy_basic(Ptr<gnet_dump> d, Ptr<gnet_stats_basic_sync> cpu2, Ptr<gnet_stats_basic_sync> b, boolean running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnet_stats_copy_basic_hw(Ptr<gnet_dump> d, Ptr<gnet_stats_basic_sync> cpu2, Ptr<gnet_stats_basic_sync> b, boolean running) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnet_stats_copy_queue(Ptr<gnet_dump> d, Ptr<gnet_stats_queue> cpu_q, Ptr<gnet_stats_queue> q, @Unsigned int qlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnet_stats_copy_rate_est(Ptr<gnet_dump> d, Ptr<Ptr<NetDefinitions.net_rate_estimator>> rate_est) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnet_stats_finish_copy(Ptr<gnet_dump> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnet_stats_start_copy(Ptr<SkDefinitions.sk_buff> skb, int type2, Ptr<@OriginalName(value="spinlock_t") runtime.spinlock> lock, Ptr<gnet_dump> d, int padattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gnet_stats_start_copy_compat(Ptr<SkDefinitions.sk_buff> skb, int type2, int tc_stats_type, int xstats_type, Ptr<@OriginalName(value="spinlock_t") runtime.spinlock> lock, Ptr<gnet_dump> d, int padattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct gnet_estimator")
    @NotUsableInJava
    public static class gnet_estimator
    extends Struct {
        public byte interval;
        public char ewma_log;
    }

    @Type(noCCodeGeneration=true, cType="struct gnet_stats_rate_est64")
    @NotUsableInJava
    public static class gnet_stats_rate_est64
    extends Struct {
        public @Unsigned long bps;
        public @Unsigned long pps;
    }

    @Type(noCCodeGeneration=true, cType="struct gnet_stats_rate_est")
    @NotUsableInJava
    public static class gnet_stats_rate_est
    extends Struct {
        public @Unsigned int bps;
        public @Unsigned int pps;
    }

    @Type(noCCodeGeneration=true, cType="struct gnet_stats_basic")
    @NotUsableInJava
    public static class gnet_stats_basic
    extends Struct {
        public @Unsigned long bytes;
        public @Unsigned int packets;
    }

    @Type(noCCodeGeneration=true, cType="struct gnet_dump")
    @NotUsableInJava
    public static class gnet_dump
    extends Struct {
        public Ptr<@OriginalName(value="spinlock_t") runtime.spinlock> lock;
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<runtime.nlattr> tail;
        public int compat_tc_stats;
        public int compat_xstats;
        public int padattr;
        public Ptr<?> xstats;
        public int xstats_len;
        public TcDefinitions.tc_stats tc_stats;
    }

    @Type(noCCodeGeneration=true, cType="struct gnet_stats_basic_sync")
    @NotUsableInJava
    public static class gnet_stats_basic_sync
    extends Struct {
        public misc.u64_stats_t bytes;
        public misc.u64_stats_t packets;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="struct gnet_stats_queue")
    @NotUsableInJava
    public static class gnet_stats_queue
    extends Struct {
        public @Unsigned int qlen;
        public @Unsigned int backlog;
        public @Unsigned int drops;
        public @Unsigned int requeues;
        public @Unsigned int overlimits;
    }
}

