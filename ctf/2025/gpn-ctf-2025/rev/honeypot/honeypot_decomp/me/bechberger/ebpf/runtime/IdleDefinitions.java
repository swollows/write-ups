/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CpuidleDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class IdleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idle_states_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idle_states_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idle_dummy(Ptr<?> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_inject_fn(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_inject_get_duration(Ptr<idle_inject_device> ii_dev, Ptr<@Unsigned Integer> run_duration_us, Ptr<@Unsigned Integer> idle_duration_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idle_inject_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<idle_inject_device> idle_inject_register(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="idle_inject_register_full($arg1, (_Bool (*)())$arg2)")
    public static Ptr<idle_inject_device> idle_inject_register_full(Ptr<runtime.cpumask> cpumask2, Ptr<?> update) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_inject_set_duration(Ptr<idle_inject_device> ii_dev, @Unsigned int run_duration_us, @Unsigned int idle_duration_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_inject_set_latency(Ptr<idle_inject_device> ii_dev, @Unsigned int latency_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_inject_setup(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idle_inject_should_run(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idle_inject_start(Ptr<idle_inject_device> ii_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_inject_stop(Ptr<idle_inject_device> ii_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart idle_inject_timer_fn(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_inject_unregister(Ptr<idle_inject_device> ii_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_inject_wakeup(Ptr<idle_inject_device> ii_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int idle_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_task_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_cull_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> idle_task(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> idle_thread_get(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_thread_set_boot_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_threads_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void idle_worker_timeout(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct idle_inject_device")
    @NotUsableInJava
    public static class idle_inject_device
    extends Struct {
        public runtime.hrtimer timer;
        public @Unsigned int idle_duration_us;
        public @Unsigned int run_duration_us;
        public @Unsigned int latency_us;
        public Ptr<?> update;
        public @Unsigned long @Size(value=0) [] cpumask;
    }

    @Type(noCCodeGeneration=true, cType="struct idle_inject_thread")
    @NotUsableInJava
    public static class idle_inject_thread
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> tsk;
        public int should_run;
    }

    @Type(noCCodeGeneration=true, cType="struct idle_cpu")
    @NotUsableInJava
    public static class idle_cpu
    extends Struct {
        public Ptr<CpuidleDefinitions.cpuidle_state> state_table;
        public @Unsigned long auto_demotion_disable_flags;
        public boolean byt_auto_demotion_disable_flag;
        public boolean disable_promotion_to_c1e;
        public boolean use_acpi;
    }

    @Type(noCCodeGeneration=true, cType="enum idle_boot_override")
    public static enum idle_boot_override implements Enum<idle_boot_override>,
    TypedEnum<idle_boot_override, Integer>
    {
        IDLE_NO_OVERRIDE,
        IDLE_HALT,
        IDLE_NOMWAIT,
        IDLE_POLL;

    }

    @Type(noCCodeGeneration=true, cType="struct idle_timer")
    @NotUsableInJava
    public static class idle_timer
    extends Struct {
        public runtime.hrtimer timer;
        public int done;
    }
}

