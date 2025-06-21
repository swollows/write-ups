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
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FgraphDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fgraph_cpu_init(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> fgraph_get_task_var(Ptr<fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fgraph_init_ops(Ptr<FtraceDefinitions.ftrace_ops> dst_ops2, Ptr<FtraceDefinitions.ftrace_ops> src_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fgraph_lru_release_index(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fgraph_pid_func(Ptr<FtraceDefinitions.ftrace_graph_ent> trace, Ptr<fgraph_ops> gops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fgraph_reserve_data(int idx, int size_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fgraph_retrieve_data(int idx, Ptr<Integer> size_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fgraph_update_pid_func() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fgraph_data")
    @NotUsableInJava
    public static class fgraph_data
    extends Struct {
        public Ptr<fgraph_cpu_data> cpu_data;
        public FtraceDefinitions.ftrace_graph_ent_entry ent;
        public FtraceDefinitions.ftrace_graph_ret_entry ret;
        public int failed;
        public int cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct fgraph_cpu_data")
    @NotUsableInJava
    public static class fgraph_cpu_data
    extends Struct {
        public @OriginalName(value="pid_t") int last_pid;
        public int depth;
        public int depth_irq;
        public int ignore;
        public @Unsigned long @Size(value=50) [] enter_funcs;
    }

    @Type(noCCodeGeneration=true, cType="struct fgraph_ret_regs")
    @NotUsableInJava
    public static class fgraph_ret_regs
    extends Struct {
        public @Unsigned long ax;
        public @Unsigned long dx;
        public @Unsigned long bp;
    }

    @Type(noCCodeGeneration=true, cType="struct fgraph_ops")
    @NotUsableInJava
    public static class fgraph_ops
    extends Struct {
        public @OriginalName(value="trace_func_graph_ent_t") Ptr<?> entryfunc;
        public @OriginalName(value="trace_func_graph_ret_t") Ptr<?> retfunc;
        public FtraceDefinitions.ftrace_ops ops;
        public Ptr<?> _private;
        public @OriginalName(value="trace_func_graph_ent_t") Ptr<?> saved_func;
        public int idx;
    }
}

