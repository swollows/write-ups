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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CpuidleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_disable_device(Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_disabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_enable_device(Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_enter(Ptr<cpuidle_driver> drv, Ptr<cpuidle_device> dev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_enter_s2idle(Ptr<cpuidle_driver> drv, Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_enter_state(Ptr<cpuidle_device> dev, Ptr<cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_find_deepest_state(Ptr<cpuidle_driver> drv, Ptr<cpuidle_device> dev, @Unsigned long latency_limit_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_install_idle_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpuidle_not_available(Ptr<cpuidle_driver> drv, Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_pause() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_pause_and_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_play_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpuidle_poll_time(Ptr<cpuidle_driver> drv, Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_reflect(Ptr<cpuidle_device> dev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpuidle_register($arg1, (const const struct cpumask*)$arg2)")
    public static int cpuidle_register(Ptr<cpuidle_driver> drv, Ptr<runtime.cpumask> coupled_cpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_register_device(Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_resume_and_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_select(Ptr<cpuidle_driver> drv, Ptr<cpuidle_device> dev, Ptr<@OriginalName(value="bool") Boolean> stop_tick) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_uninstall_idle_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_unregister(Ptr<cpuidle_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_unregister_device(Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_use_deepest_state(@Unsigned long latency_limit_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_add_device_sysfs(Ptr<cpuidle_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_add_interface() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_add_state_sysfs(Ptr<cpuidle_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_add_sysfs(Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpuidle_find_governor((const u8*)$arg1)")
    public static Ptr<cpuidle_governor> cpuidle_find_governor(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long cpuidle_governor_latency_req(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_register_governor(Ptr<cpuidle_governor> gov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_remove_device_sysfs(Ptr<cpuidle_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_remove_interface(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_remove_sysfs(Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpuidle_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpuidle_state_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpuidle_state_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long cpuidle_state_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_state_sysfs_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpuidle_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long cpuidle_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_switch_governor(Ptr<cpuidle_governor> gov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_sysfs_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_poll_state_init(Ptr<cpuidle_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_driver_state_disabled(Ptr<cpuidle_driver> drv, int idx, boolean disable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cpuidle_driver> cpuidle_get_cpu_driver(Ptr<cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cpuidle_driver> cpuidle_get_driver() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_idle_call() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuidle_register_driver(Ptr<cpuidle_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_setup_broadcast_timer(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuidle_unregister_driver(Ptr<cpuidle_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cpuidle_state_attr")
    @NotUsableInJava
    public static class cpuidle_state_attr
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct cpuidle_attr")
    @NotUsableInJava
    public static class cpuidle_attr
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct cpuidle_device_kobj")
    @NotUsableInJava
    public static class cpuidle_device_kobj
    extends Struct {
        public Ptr<cpuidle_device> dev;
        public runtime.completion kobj_unregister;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct cpuidle_state_kobj")
    @NotUsableInJava
    public static class cpuidle_state_kobj
    extends Struct {
        public Ptr<cpuidle_state> state;
        public Ptr<cpuidle_state_usage> state_usage;
        public runtime.completion kobj_unregister;
        public runtime.kobject kobj;
        public Ptr<cpuidle_device> device;
    }

    @Type(noCCodeGeneration=true, cType="struct cpuidle_governor")
    @NotUsableInJava
    public static class cpuidle_governor
    extends Struct {
        public char @Size(value=16) [] name;
        public ListDefinitions.list_head governor_list;
        public @Unsigned int rating;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> select;
        public Ptr<?> reflect;
    }

    @Type(noCCodeGeneration=true, cType="struct cpuidle_driver")
    @NotUsableInJava
    public static class cpuidle_driver
    extends Struct {
        public String name;
        public Ptr<runtime.module> owner;
        public @Unsigned int bctimer;
        public cpuidle_state @Size(value=10) [] states;
        public int state_count;
        public int safe_state_index;
        public Ptr<runtime.cpumask> cpumask;
        public String governor;
    }

    @Type(noCCodeGeneration=true, cType="struct cpuidle_device")
    @NotUsableInJava
    public static class cpuidle_device
    extends Struct {
        public @Unsigned int registered;
        public @Unsigned int enabled;
        public @Unsigned int poll_time_limit;
        public @Unsigned int cpu;
        public @OriginalName(value="ktime_t") long next_hrtimer;
        public int last_state_idx;
        public @Unsigned long last_residency_ns;
        public @Unsigned long poll_limit_ns;
        public @Unsigned long forced_idle_latency_limit_ns;
        public cpuidle_state_usage @Size(value=10) [] states_usage;
        public Ptr<cpuidle_state_kobj> @Size(value=10) [] kobjs;
        public @OriginalName(value="cpuidle_driver_kobj") Ptr<?> kobj_driver;
        public Ptr<cpuidle_device_kobj> kobj_dev;
        public ListDefinitions.list_head device_list;
    }

    @Type(noCCodeGeneration=true, cType="struct cpuidle_state")
    @NotUsableInJava
    public static class cpuidle_state
    extends Struct {
        public char @Size(value=16) [] name;
        public char @Size(value=32) [] desc;
        public long exit_latency_ns;
        public long target_residency_ns;
        public @Unsigned int flags;
        public @Unsigned int exit_latency;
        public int power_usage;
        public @Unsigned int target_residency;
        public Ptr<?> enter;
        public Ptr<?> enter_dead;
        public Ptr<?> enter_s2idle;
    }

    @Type(noCCodeGeneration=true, cType="struct cpuidle_state_usage")
    @NotUsableInJava
    public static class cpuidle_state_usage
    extends Struct {
        public @Unsigned long disable;
        public @Unsigned long usage;
        public @Unsigned long time_ns;
        public @Unsigned long above;
        public @Unsigned long below;
        public @Unsigned long rejected;
        public @Unsigned long s2idle_usage;
        public @Unsigned long s2idle_time;
    }
}

