/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.FilterDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SelectDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long select_estimate_accuracy(Ptr<runtime.timespec64> tv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_idle_capacity(Ptr<TaskDefinitions.task_struct> p, Ptr<SchedDefinitions.sched_domain> sd, int target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_idle_cpu(Ptr<TaskDefinitions.task_struct> p, Ptr<SchedDefinitions.sched_domain> sd, boolean has_idle_core, int target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_idle_sibling(Ptr<TaskDefinitions.task_struct> p, int prev, int target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_task_rq_fair(Ptr<TaskDefinitions.task_struct> p, int prev_cpu, int wake_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_task_rq_stop(Ptr<TaskDefinitions.task_struct> p, int cpu2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_bus_fmt_recursive(Ptr<DrmDefinitions.drm_bridge> first_bridge, Ptr<DrmDefinitions.drm_bridge> cur_bridge, Ptr<DrmDefinitions.drm_crtc_state> crtc_state, Ptr<DrmDefinitions.drm_connector_state> conn_state, @Unsigned int out_bus_fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static FilterDefinitions.filter_pred_fn select_comparison_fn(FilterDefinitions.filter_op_ids op, int field_size, int field_is_signed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_fallback_rq(int cpu2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void select_idle_routine() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="select_pmem_id($arg1, (const struct {\n  u8 b[16];\n}*)$arg2)")
    public static int select_pmem_id(Ptr<NdDefinitions.nd_region> nd_region2, Ptr<misc.uuid_t> pmem_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="select_target_cpu((const struct cpumask*)$arg1)")
    public static @Unsigned int select_target_cpu(Ptr<runtime.cpumask> dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static DDefinitions.d_walk_ret select_collect(Ptr<?> _data, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static DDefinitions.d_walk_ret select_collect2(Ptr<?> _data, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_cpu_stub(Ptr<TaskDefinitions.task_struct> p, int prev_cpu, @Unsigned long wake_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_task_rq_dl(Ptr<TaskDefinitions.task_struct> p, int cpu2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_task_rq_idle(Ptr<TaskDefinitions.task_struct> p, int cpu2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_task_rq_rt(Ptr<TaskDefinitions.task_struct> p, int cpu2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int select_task_rq_scx(Ptr<TaskDefinitions.task_struct> p, int prev_cpu, int wake_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct select_data")
    @NotUsableInJava
    public static class select_data
    extends Struct {
        public Ptr<runtime.dentry> start;
        @InlineUnion(value=10009)
        public @InlineUnion(value=10009) long found;
        @InlineUnion(value=10009)
        public @InlineUnion(value=10009) Ptr<runtime.dentry> victim;
        public ListDefinitions.list_head dispose;
    }
}

