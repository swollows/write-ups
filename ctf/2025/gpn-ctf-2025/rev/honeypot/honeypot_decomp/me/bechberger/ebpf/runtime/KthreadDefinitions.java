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
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KthreadDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kthread_bind(Ptr<TaskDefinitions.task_struct> p, @Unsigned int cpu2, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __kthread_cancel_work_sync(Ptr<kthread_work> work, boolean is_dwork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kthread_create_on_node((int (*)(void*))$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static Ptr<TaskDefinitions.task_struct> __kthread_create_on_node(Ptr<?> threadfn, Ptr<?> data, int node2, String namefmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kthread_create_worker($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<kthread_worker> __kthread_create_worker(int cpu2, @Unsigned int flags, String namefmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kthread_init_worker($arg1, (const u8*)$arg2, $arg3)")
    public static void __kthread_init_worker(Ptr<kthread_worker> worker2, String name, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kthread_parkme(Ptr<kthread> self) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kthread_queue_delayed_work(Ptr<kthread_worker> worker2, Ptr<kthread_delayed_work> dwork, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_associate_blkcg(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_bind(Ptr<TaskDefinitions.task_struct> p, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kthread_bind_mask($arg1, (const struct cpumask*)$arg2)")
    public static void kthread_bind_mask(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> kthread_blkcg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_cancel_delayed_work_sync(Ptr<kthread_delayed_work> dwork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_cancel_work_sync(Ptr<kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_complete_and_exit(Ptr<runtime.completion> comp, long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kthread_create_on_cpu((int (*)(void*))$arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<TaskDefinitions.task_struct> kthread_create_on_cpu(Ptr<?> threadfn, Ptr<?> data, @Unsigned int cpu2, String namefmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kthread_create_on_node((int (*)(void*))$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static Ptr<TaskDefinitions.task_struct> kthread_create_on_node(Ptr<?> threadfn, Ptr<?> data, int node2, String namefmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kthread_create_worker($arg1, (const u8*)$arg2, $arg3_)")
    public static Ptr<kthread_worker> kthread_create_worker(@Unsigned int flags, String namefmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kthread_create_worker_on_cpu($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static Ptr<kthread_worker> kthread_create_worker_on_cpu(int cpu2, @Unsigned int flags, String namefmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kthread_data(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_delayed_work_timer_fn(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_destroy_worker(Ptr<kthread_worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_exit(long result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_flush_work_fn(Ptr<kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_flush_worker(Ptr<kthread_worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_freezable_should_stop(Ptr<@OriginalName(value="bool") Boolean> was_frozen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kthread_func(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_insert_work(Ptr<kthread_worker> worker2, Ptr<kthread_work> work, Ptr<ListDefinitions.list_head> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_is_per_cpu(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_mod_delayed_work(Ptr<kthread_worker> worker2, Ptr<kthread_delayed_work> dwork, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kthread_park(Ptr<TaskDefinitions.task_struct> k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_parkme() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kthread_probe_data(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_queue_delayed_work(Ptr<kthread_worker> worker2, Ptr<kthread_delayed_work> dwork, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_queue_work(Ptr<kthread_worker> worker2, Ptr<kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_set_per_cpu(Ptr<TaskDefinitions.task_struct> k, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_should_park() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_should_stop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kthread_should_stop_or_park() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kthread_stop(Ptr<TaskDefinitions.task_struct> k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kthread_stop_put(Ptr<TaskDefinitions.task_struct> k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_unpark(Ptr<TaskDefinitions.task_struct> k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_unuse_mm(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kthread_use_mm(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kthread_worker_fn(Ptr<?> worker_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kthread_fn(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kthread")
    @NotUsableInJava
    public static class kthread
    extends Struct {
        public @Unsigned long flags;
        public @Unsigned int cpu;
        public int result;
        public Ptr<?> threadfn;
        public Ptr<?> data;
        public runtime.completion parked;
        public runtime.completion exited;
        public Ptr<CgroupDefinitions.cgroup_subsys_state> blkcg_css;
        public String full_name;
    }

    @Type(noCCodeGeneration=true, cType="struct kthread_flush_work")
    @NotUsableInJava
    public static class kthread_flush_work
    extends Struct {
        public kthread_work work;
        public runtime.completion done;
    }

    @Type(noCCodeGeneration=true, cType="struct kthread_create_info")
    @NotUsableInJava
    public static class kthread_create_info
    extends Struct {
        public String full_name;
        public Ptr<?> threadfn;
        public Ptr<?> data;
        public int node;
        public Ptr<TaskDefinitions.task_struct> result;
        public Ptr<runtime.completion> done;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct kthread_delayed_work")
    @NotUsableInJava
    public static class kthread_delayed_work
    extends Struct {
        public kthread_work work;
        public TimerDefinitions.timer_list timer;
    }

    @Type(noCCodeGeneration=true, cType="struct kthread_worker")
    @NotUsableInJava
    public static class kthread_worker
    extends Struct {
        public @Unsigned int flags;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public ListDefinitions.list_head work_list;
        public ListDefinitions.list_head delayed_work_list;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<kthread_work> current_work;
    }

    @Type(noCCodeGeneration=true, cType="struct kthread_work")
    @NotUsableInJava
    public static class kthread_work
    extends Struct {
        public ListDefinitions.list_head node;
        public @OriginalName(value="kthread_work_func_t") Ptr<?> func;
        public Ptr<kthread_worker> worker;
        public int canceling;
    }
}

