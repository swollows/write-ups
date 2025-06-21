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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MqueueDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class WqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_adjust_max_active(Ptr<WorkqueueDefinitions.workqueue_struct> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long wq_affinity_strict_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wq_affinity_strict_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long wq_affinity_strict_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wq_affn_dfl_get($arg1, (const struct kernel_param*)$arg2)")
    public static int wq_affn_dfl_get(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wq_affn_dfl_set((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int wq_affn_dfl_set(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long wq_affn_scope_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wq_affn_scope_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long wq_affn_scope_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_barrier_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_calc_pod_cpumask(Ptr<WorkqueueDefinitions.workqueue_attrs> attrs, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_cpu_intensive_report(@OriginalName(value="work_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long wq_cpumask_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wq_cpumask_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long wq_cpumask_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long wq_nice_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wq_nice_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long wq_nice_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wq_select_unbound_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wq_sleep(Ptr<MqueueDefinitions.mqueue_inode_info> info2, int sr, Ptr<@OriginalName(value="ktime_t") Long> timeout, Ptr<misc.ext_wait_queue> ewp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wq_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_update_node_max_active(Ptr<WorkqueueDefinitions.workqueue_struct> wq, int off_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_worker_comm(String buf, @Unsigned long size, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="work_func_t") Ptr<?> wq_worker_last_func(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_worker_running(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_worker_sleeping(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wq_worker_tick(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct wq_barrier")
    @NotUsableInJava
    public static class wq_barrier
    extends Struct {
        public misc.work_struct work;
        public runtime.completion done;
        public Ptr<TaskDefinitions.task_struct> task;
    }

    @Type(noCCodeGeneration=true, cType="struct wq_drain_dead_softirq_work")
    @NotUsableInJava
    public static class wq_drain_dead_softirq_work
    extends Struct {
        public misc.work_struct work;
        public Ptr<misc.worker_pool> pool;
        public runtime.completion done;
    }

    @Type(noCCodeGeneration=true, cType="struct wq_pod_type")
    @NotUsableInJava
    public static class wq_pod_type
    extends Struct {
        public int nr_pods;
        public Ptr<@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask>> pod_cpus;
        public Ptr<Integer> pod_node;
        public Ptr<Integer> cpu_pod;
    }

    @Type(noCCodeGeneration=true, cType="struct wq_device")
    @NotUsableInJava
    public static class wq_device
    extends Struct {
        public Ptr<WorkqueueDefinitions.workqueue_struct> wq;
        public runtime.device dev;
    }

    @Type(noCCodeGeneration=true, cType="struct wq_node_nr_active")
    @NotUsableInJava
    public static class wq_node_nr_active
    extends Struct {
        public int max;
        public AtomicDefinitions.atomic_t nr;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public ListDefinitions.list_head pending_pwqs;
    }

    @Type(noCCodeGeneration=true, cType="struct wq_flusher")
    @NotUsableInJava
    public static class wq_flusher
    extends Struct {
        public ListDefinitions.list_head list;
        public int flush_color;
        public runtime.completion done;
    }

    @Type(noCCodeGeneration=true, cType="enum wq_internal_consts")
    public static enum wq_internal_consts implements Enum<wq_internal_consts>,
    TypedEnum<wq_internal_consts, Integer>
    {
        NR_STD_WORKER_POOLS,
        UNBOUND_POOL_HASH_ORDER,
        BUSY_WORKER_HASH_ORDER,
        MAX_IDLE_WORKERS_RATIO,
        IDLE_WORKER_TIMEOUT,
        MAYDAY_INITIAL_TIMEOUT,
        MAYDAY_INTERVAL,
        CREATE_COOLDOWN,
        RESCUER_NICE_LEVEL,
        HIGHPRI_NICE_LEVEL,
        WQ_NAME_LEN,
        WORKER_ID_LEN;

    }

    @Type(noCCodeGeneration=true, cType="enum wq_consts")
    public static enum wq_consts implements Enum<wq_consts>,
    TypedEnum<wq_consts, Integer>
    {
        WQ_MAX_ACTIVE,
        WQ_UNBOUND_MAX_ACTIVE,
        WQ_DFL_ACTIVE,
        WQ_DFL_MIN_ACTIVE;

    }

    @Type(noCCodeGeneration=true, cType="enum wq_flags")
    public static enum wq_flags implements Enum<wq_flags>,
    TypedEnum<wq_flags, Integer>
    {
        WQ_BH,
        WQ_UNBOUND,
        WQ_FREEZABLE,
        WQ_MEM_RECLAIM,
        WQ_HIGHPRI,
        WQ_CPU_INTENSIVE,
        WQ_SYSFS,
        WQ_POWER_EFFICIENT,
        __WQ_DESTROYING,
        __WQ_DRAINING,
        __WQ_ORDERED,
        __WQ_LEGACY,
        __WQ_BH_ALLOWS;

    }

    @Type(noCCodeGeneration=true, cType="enum wq_affn_scope")
    public static enum wq_affn_scope implements Enum<wq_affn_scope>,
    TypedEnum<wq_affn_scope, Integer>
    {
        WQ_AFFN_DFL,
        WQ_AFFN_CPU,
        WQ_AFFN_SMT,
        WQ_AFFN_CACHE,
        WQ_AFFN_NUMA,
        WQ_AFFN_SYSTEM,
        WQ_AFFN_NR_TYPES;

    }

    @Type(noCCodeGeneration=true, cType="enum wq_misc_consts")
    public static enum wq_misc_consts implements Enum<wq_misc_consts>,
    TypedEnum<wq_misc_consts, Integer>
    {
        WORK_NR_COLORS,
        WORK_CPU_UNBOUND,
        WORK_BUSY_PENDING,
        WORK_BUSY_RUNNING,
        WORKER_DESC_LEN;

    }
}

