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
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class DlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_rebuild_rd_accounting() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_update_tasks_root_domain(Ptr<runtime.cpuset> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dl_server_attach_root(Ptr<SchedDefinitions.sched_dl_entity> dl_se, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_add_task_root_domain(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dl_bw_alloc(int cpu2, @Unsigned long dl_bw2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dl_bw_check_overflow(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dl_bw_cpus(int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_bw_free(int cpu2, @Unsigned long dl_bw2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dl_bw_manage(dl_bw_request req2, int cpu2, @Unsigned long dl_bw2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_clear_root_domain(Ptr<misc.root_domain> rd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dl_cpuset_cpumask_can_shrink((const struct cpumask*)$arg1, (const struct cpumask*)$arg2)")
    public static int dl_cpuset_cpumask_can_shrink(Ptr<runtime.cpumask> cur, Ptr<runtime.cpumask> trial) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dl_param_changed($arg1, (const struct sched_attr*)$arg2)")
    public static boolean dl_param_changed(Ptr<TaskDefinitions.task_struct> p, Ptr<SchedDefinitions.sched_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_rq_change_utilization(Ptr<runtime.rq> rq2, Ptr<SchedDefinitions.sched_dl_entity> dl_se, @Unsigned long new_bw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dl_scaled_delta_exec(Ptr<runtime.rq> rq2, Ptr<SchedDefinitions.sched_dl_entity> dl_se, long delta_exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dl_server_apply_params(Ptr<SchedDefinitions.sched_dl_entity> dl_se, @Unsigned long runtime2, @Unsigned long period, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_server_init(Ptr<SchedDefinitions.sched_dl_entity> dl_se, Ptr<runtime.rq> rq2, @OriginalName(value="dl_server_has_tasks_f") Ptr<?> has_tasks, @OriginalName(value="dl_server_pick_f") Ptr<?> pick_task) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_server_start(Ptr<SchedDefinitions.sched_dl_entity> dl_se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_server_stop(Ptr<SchedDefinitions.sched_dl_entity> dl_se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart dl_server_timer(Ptr<runtime.hrtimer> timer, Ptr<SchedDefinitions.sched_dl_entity> dl_se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_server_update(Ptr<SchedDefinitions.sched_dl_entity> dl_se, long delta_exec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dl_server_update_idle_time(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dl_task_check_affinity($arg1, (const struct cpumask*)$arg2)")
    public static int dl_task_check_affinity(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rq> dl_task_offline_migration(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart dl_task_timer(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union { short unsigned int dad; short unsigned int len; }")
    @NotUsableInJava
    public static class dl_of_ct_data_and_dl_of_ct_data_s
    extends Union {
        public @Unsigned @OriginalName(value="ush") short dad;
        public @Unsigned @OriginalName(value="ush") short len;
    }

    @Type(noCCodeGeneration=true, cType="enum dl_param")
    public static enum dl_param implements Enum<dl_param>,
    TypedEnum<dl_param, Integer>
    {
        DL_RUNTIME,
        DL_PERIOD;

    }

    @Type(noCCodeGeneration=true, cType="enum dl_bw_request")
    public static enum dl_bw_request implements Enum<dl_bw_request>,
    TypedEnum<dl_bw_request, Integer>
    {
        dl_bw_req_check_overflow,
        dl_bw_req_alloc,
        dl_bw_req_free;

    }

    @Type(noCCodeGeneration=true, cType="struct dl_rq")
    @NotUsableInJava
    public static class dl_rq
    extends Struct {
        public RbDefinitions.rb_root_cached root;
        public @Unsigned int dl_nr_running;
        public misc.earliest_dl_of_dl_rq earliest_dl;
        public boolean overloaded;
        public RbDefinitions.rb_root_cached pushable_dl_tasks_root;
        public @Unsigned long running_bw;
        public @Unsigned long this_bw;
        public @Unsigned long extra_bw;
        public @Unsigned long max_bw;
        public @Unsigned long bw_ratio;
    }

    @Type(noCCodeGeneration=true, cType="struct dl_bw")
    @NotUsableInJava
    public static class dl_bw
    extends Struct {
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned long bw;
        public @Unsigned long total_bw;
    }

    @Type(noCCodeGeneration=true, cType="enum dl_dev_state")
    public static enum dl_dev_state implements Enum<dl_dev_state>,
    TypedEnum<dl_dev_state, Integer>
    {
        DL_DEV_NO_DRIVER,
        DL_DEV_PROBING,
        DL_DEV_DRIVER_BOUND,
        DL_DEV_UNBINDING;

    }
}

