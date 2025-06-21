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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CtxDefinitions {
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_SOCKET_FILTER = 0;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_SCHED_CLS = 1;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_SCHED_ACT = 2;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_XDP = 3;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_CGROUP_SKB = 4;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_CGROUP_SOCK = 5;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_CGROUP_SOCK_ADDR = 6;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_LWT_IN = 7;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_LWT_OUT = 8;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_LWT_XMIT = 9;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_LWT_SEG6LOCAL = 10;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_SOCK_OPS = 11;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_SK_SKB = 12;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_SK_MSG = 13;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_FLOW_DISSECTOR = 14;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_KPROBE = 15;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_TRACEPOINT = 16;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_PERF_EVENT = 17;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_RAW_TRACEPOINT = 18;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_RAW_TRACEPOINT_WRITABLE = 19;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_TRACING = 20;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_CGROUP_DEVICE = 21;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_CGROUP_SYSCTL = 22;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_CGROUP_SOCKOPT = 23;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_SK_REUSEPORT = 24;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_SK_LOOKUP = 25;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_STRUCT_OPS = 26;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_EXT = 27;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_LSM = 28;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_SYSCALL = 29;
    public static final @Unsigned int __ctx_convertBPF_PROG_TYPE_NETFILTER = 30;
    public static final @Unsigned int __ctx_convert_unused = 31;

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ctx_default_rq_list_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ctx_default_rq_list_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ctx_default_rq_list_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ctx_poll_rq_list_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ctx_poll_rq_list_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ctx_poll_rq_list_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ctx_read_rq_list_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ctx_read_rq_list_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ctx_read_rq_list_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ctx_flush_and_put(Ptr<IoDefinitions.io_ring_ctx> ctx, Ptr<IoDefinitions.io_tw_state> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_event> ctx_event_to_rotate(Ptr<PerfDefinitions.perf_event_pmu_context> pmu_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ctx_resched(Ptr<PerfDefinitions.perf_cpu_context> cpuctx, Ptr<PerfDefinitions.perf_event_context> task_ctx, Ptr<runtime.pmu> pmu2, EventDefinitions.event_type_t event_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ctx_sched_in(Ptr<PerfDefinitions.perf_event_context> ctx, Ptr<runtime.pmu> pmu2, EventDefinitions.event_type_t event_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ctx_sched_out(Ptr<PerfDefinitions.perf_event_context> ctx, Ptr<runtime.pmu> pmu2, EventDefinitions.event_type_t event_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ctx_rq_wait")
    @NotUsableInJava
    public static class ctx_rq_wait
    extends Struct {
        public runtime.completion comp;
        public AtomicDefinitions.atomic_t count;
    }

    @Type(noCCodeGeneration=true, cType="struct ctx_switch_entry")
    @NotUsableInJava
    public static class ctx_switch_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public @Unsigned int prev_pid;
        public @Unsigned int next_pid;
        public @Unsigned int next_cpu;
        public char prev_prio;
        public char prev_state;
        public char next_prio;
        public char next_state;
    }

    @Type(noCCodeGeneration=true, cType="enum __ctx_convert")
    public static enum __ctx_convert implements Enum<__ctx_convert>,
    TypedEnum<__ctx_convert, Integer>
    {
        __ctx_convertBPF_PROG_TYPE_SOCKET_FILTER,
        __ctx_convertBPF_PROG_TYPE_SCHED_CLS,
        __ctx_convertBPF_PROG_TYPE_SCHED_ACT,
        __ctx_convertBPF_PROG_TYPE_XDP,
        __ctx_convertBPF_PROG_TYPE_CGROUP_SKB,
        __ctx_convertBPF_PROG_TYPE_CGROUP_SOCK,
        __ctx_convertBPF_PROG_TYPE_CGROUP_SOCK_ADDR,
        __ctx_convertBPF_PROG_TYPE_LWT_IN,
        __ctx_convertBPF_PROG_TYPE_LWT_OUT,
        __ctx_convertBPF_PROG_TYPE_LWT_XMIT,
        __ctx_convertBPF_PROG_TYPE_LWT_SEG6LOCAL,
        __ctx_convertBPF_PROG_TYPE_SOCK_OPS,
        __ctx_convertBPF_PROG_TYPE_SK_SKB,
        __ctx_convertBPF_PROG_TYPE_SK_MSG,
        __ctx_convertBPF_PROG_TYPE_FLOW_DISSECTOR,
        __ctx_convertBPF_PROG_TYPE_KPROBE,
        __ctx_convertBPF_PROG_TYPE_TRACEPOINT,
        __ctx_convertBPF_PROG_TYPE_PERF_EVENT,
        __ctx_convertBPF_PROG_TYPE_RAW_TRACEPOINT,
        __ctx_convertBPF_PROG_TYPE_RAW_TRACEPOINT_WRITABLE,
        __ctx_convertBPF_PROG_TYPE_TRACING,
        __ctx_convertBPF_PROG_TYPE_CGROUP_DEVICE,
        __ctx_convertBPF_PROG_TYPE_CGROUP_SYSCTL,
        __ctx_convertBPF_PROG_TYPE_CGROUP_SOCKOPT,
        __ctx_convertBPF_PROG_TYPE_SK_REUSEPORT,
        __ctx_convertBPF_PROG_TYPE_SK_LOOKUP,
        __ctx_convertBPF_PROG_TYPE_STRUCT_OPS,
        __ctx_convertBPF_PROG_TYPE_EXT,
        __ctx_convertBPF_PROG_TYPE_LSM,
        __ctx_convertBPF_PROG_TYPE_SYSCALL,
        __ctx_convertBPF_PROG_TYPE_NETFILTER,
        __ctx_convert_unused;

    }

    @Type(noCCodeGeneration=true, cType="enum ctx_state")
    public static enum ctx_state implements Enum<ctx_state>,
    TypedEnum<ctx_state, Integer>
    {
        CT_STATE_DISABLED,
        CT_STATE_KERNEL,
        CT_STATE_IDLE,
        CT_STATE_USER,
        CT_STATE_GUEST,
        CT_STATE_MAX;

    }
}

