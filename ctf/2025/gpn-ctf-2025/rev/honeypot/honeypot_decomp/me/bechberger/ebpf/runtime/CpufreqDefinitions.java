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
import me.bechberger.ebpf.runtime.FreqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.UpdateDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CpufreqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_dbs_data_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_dbs_governor_exit(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_dbs_governor_init(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_dbs_governor_limits(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_dbs_governor_start(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_dbs_governor_stop(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_frequency_table_cpuinfo(Ptr<cpufreq_policy> policy, Ptr<cpufreq_frequency_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_frequency_table_get_index(Ptr<cpufreq_policy> policy, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_frequency_table_verify(Ptr<cpufreq_policy_data> policy, Ptr<cpufreq_frequency_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_generic_frequency_table_verify(Ptr<cpufreq_policy_data> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_gov_powersave_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_gov_powersave_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_gov_powersave_limits(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_table_index_unsorted(Ptr<cpufreq_policy> policy, @Unsigned int target_freq, @Unsigned int relation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_table_validate_and_sort(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpufreq_add_update_util_hook($arg1, $arg2, (void (*)(struct update_util_data*, long long unsigned int, unsigned int))$arg3)")
    public static void cpufreq_add_update_util_hook(int cpu2, Ptr<UpdateDefinitions.update_util_data> data, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cpufreq_governor> cpufreq_default_governor() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cpufreq_governor> cpufreq_fallback_governor() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_frequency_table_target(Ptr<cpufreq_policy> policy, @Unsigned int target_freq, @Unsigned int relation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_gov_performance_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_gov_performance_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_gov_performance_limits(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_register_tsc_scaling() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_remove_update_util_hook(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_set_cur_state(@Unsigned int cpu2, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpufreq_this_cpu_can_update(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_gov_userspace_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_gov_userspace_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_passive_notifier_call(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_passive_register_notifier(Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_set(Ptr<cpufreq_policy> policy, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_stats_create_table(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_stats_free_table(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_stats_record_transition(Ptr<cpufreq_policy> policy, @Unsigned int new_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_stats_reset_table(Ptr<cpufreq_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_userspace_policy_exit(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_userspace_policy_init(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_userspace_policy_limits(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_userspace_policy_start(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_userspace_policy_stop(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cpufreq_driver_target(Ptr<cpufreq_policy> policy, @Unsigned int target_freq, @Unsigned int relation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cpufreq_offline(@Unsigned int cpu2, Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_add_dev(Ptr<runtime.device> dev, Ptr<misc.subsys_interface> sif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpufreq_add_device((const u8*)$arg1)")
    public static void cpufreq_add_device(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpufreq_boost_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_boost_set_sw(Ptr<cpufreq_policy> policy, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_boost_trigger_state(int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_core_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cpufreq_policy> cpufreq_cpu_acquire(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cpufreq_policy> cpufreq_cpu_get(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cpufreq_policy> cpufreq_cpu_get_raw(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_cpu_put(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_cpu_release(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_disable_fast_switch(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_driver_adjust_perf(@Unsigned int cpu2, @Unsigned long min_perf, @Unsigned long target_perf, @Unsigned long capacity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpufreq_driver_fast_switch(Ptr<cpufreq_policy> policy, @Unsigned int target_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpufreq_driver_has_adjust_perf() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpufreq_driver_resolve_freq(Ptr<cpufreq_policy> policy, @Unsigned int target_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_driver_target(Ptr<cpufreq_policy> policy, @Unsigned int target_freq, @Unsigned int relation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpufreq_driver_test_flags(@Unsigned short flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_enable_boost_support() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_enable_fast_switch(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_exit_governor(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_freq_transition_begin(Ptr<cpufreq_policy> policy, Ptr<cpufreq_freqs> freqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_freq_transition_end(Ptr<cpufreq_policy> policy, Ptr<cpufreq_freqs> freqs, int transition_failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpufreq_generic_get(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_generic_init(Ptr<cpufreq_policy> policy, Ptr<cpufreq_frequency_table> table, @Unsigned int transition_latency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_generic_suspend(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpufreq_get(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)cpufreq_get_current_driver())")
    public static String cpufreq_get_current_driver() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cpufreq_get_driver_data() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpufreq_get_hw_max_freq(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_get_policy(Ptr<cpufreq_policy> policy, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_init_governor(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_notifier_max(Ptr<misc.notifier_block> nb, @Unsigned long freq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_notifier_min(Ptr<misc.notifier_block> nb, @Unsigned long freq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_notify_transition(Ptr<cpufreq_policy> policy, Ptr<cpufreq_freqs> freqs, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cpufreq_policy> cpufreq_policy_alloc(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_policy_free(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_policy_put_kobj(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpufreq_policy_transition_delay_us(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpufreq_quick_get(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpufreq_quick_get_max(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_register_driver(Ptr<cpufreq_driver> driver_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_register_governor(Ptr<cpufreq_governor> governor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_register_notifier(Ptr<misc.notifier_block> nb, @Unsigned int list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_remove_dev(Ptr<runtime.device> dev, Ptr<misc.subsys_interface> sif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_set_policy(Ptr<cpufreq_policy> policy, Ptr<cpufreq_governor> new_gov, @Unsigned int new_pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpufreq_show_cpus((const struct cpumask*)$arg1, $arg2)")
    public static @OriginalName(value="ssize_t") long cpufreq_show_cpus(Ptr<runtime.cpumask> mask, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_start_governor(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_stop_governor(Ptr<cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpufreq_supports_freq_invariance() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_sysfs_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_unregister_driver(Ptr<cpufreq_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_unregister_governor(Ptr<cpufreq_governor> governor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpufreq_unregister_notifier(Ptr<misc.notifier_block> nb, @Unsigned int list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_update_limits(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpufreq_update_policy(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpufreq_verify_current_freq(Ptr<cpufreq_policy> policy, boolean update) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cpufreq_stats")
    @NotUsableInJava
    public static class cpufreq_stats
    extends Struct {
        public @Unsigned int total_trans;
        public @Unsigned long last_time;
        public @Unsigned int max_state;
        public @Unsigned int state_num;
        public @Unsigned int last_index;
        public Ptr<@Unsigned Long> time_in_state;
        public Ptr<@Unsigned Integer> freq_table;
        public Ptr<@Unsigned Integer> trans_table;
        public @Unsigned int reset_pending;
        public @Unsigned long reset_time;
    }

    @Type(noCCodeGeneration=true, cType="struct cpufreq_driver")
    @NotUsableInJava
    public static class cpufreq_driver
    extends Struct {
        public char @Size(value=16) [] name;
        public @Unsigned short flags;
        public Ptr<?> driver_data;
        public Ptr<?> init;
        public Ptr<?> verify;
        public Ptr<?> setpolicy;
        public Ptr<?> target;
        public Ptr<?> target_index;
        public Ptr<?> fast_switch;
        public Ptr<?> adjust_perf;
        public Ptr<?> get_intermediate;
        public Ptr<?> target_intermediate;
        public Ptr<?> get;
        public Ptr<?> update_limits;
        public Ptr<?> bios_limit;
        public Ptr<?> online;
        public Ptr<?> offline;
        public Ptr<?> exit;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> ready;
        public Ptr<Ptr<FreqDefinitions.freq_attr>> attr;
        public boolean boost_enabled;
        public Ptr<?> set_boost;
        public Ptr<?> register_em;
    }

    @Type(noCCodeGeneration=true, cType="struct cpufreq_freqs")
    @NotUsableInJava
    public static class cpufreq_freqs
    extends Struct {
        public Ptr<cpufreq_policy> policy;
        public @Unsigned int old;
        public @Unsigned int _new;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct cpufreq_policy_data")
    @NotUsableInJava
    public static class cpufreq_policy_data
    extends Struct {
        public cpufreq_cpuinfo cpuinfo;
        public Ptr<cpufreq_frequency_table> freq_table;
        public @Unsigned int cpu;
        public @Unsigned int min;
        public @Unsigned int max;
    }

    @Type(noCCodeGeneration=true, cType="struct cpufreq_frequency_table")
    @NotUsableInJava
    public static class cpufreq_frequency_table
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int driver_data;
        public @Unsigned int frequency;
    }

    @Type(noCCodeGeneration=true, cType="struct cpufreq_governor")
    @NotUsableInJava
    public static class cpufreq_governor
    extends Struct {
        public char @Size(value=16) [] name;
        public Ptr<?> init;
        public Ptr<?> exit;
        public Ptr<?> start;
        public Ptr<?> stop;
        public Ptr<?> limits;
        public Ptr<?> show_setspeed;
        public Ptr<?> store_setspeed;
        public ListDefinitions.list_head governor_list;
        public Ptr<runtime.module> owner;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct cpufreq_policy")
    @NotUsableInJava
    public static class cpufreq_policy
    extends Struct {
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpus;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> related_cpus;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> real_cpus;
        public @Unsigned int shared_type;
        public @Unsigned int cpu;
        public Ptr<runtime.clk> clk;
        public cpufreq_cpuinfo cpuinfo;
        public @Unsigned int min;
        public @Unsigned int max;
        public @Unsigned int cur;
        public @Unsigned int suspend_freq;
        public @Unsigned int policy;
        public @Unsigned int last_policy;
        public Ptr<cpufreq_governor> governor;
        public Ptr<?> governor_data;
        public char @Size(value=16) [] last_governor;
        public misc.work_struct update;
        public FreqDefinitions.freq_constraints constraints;
        public Ptr<FreqDefinitions.freq_qos_request> min_freq_req;
        public Ptr<FreqDefinitions.freq_qos_request> max_freq_req;
        public Ptr<cpufreq_frequency_table> freq_table;
        public cpufreq_table_sorting freq_table_sorted;
        public ListDefinitions.list_head policy_list;
        public runtime.kobject kobj;
        public runtime.completion kobj_unregister;
        public misc.rw_semaphore rwsem;
        public boolean fast_switch_possible;
        public boolean fast_switch_enabled;
        public boolean strict_target;
        public boolean efficiencies_available;
        public @Unsigned int transition_delay_us;
        public boolean dvfs_possible_from_any_cpu;
        public boolean boost_enabled;
        public @Unsigned int cached_target_freq;
        public @Unsigned int cached_resolved_idx;
        public boolean transition_ongoing;
        public  @OriginalName(value="spinlock_t") runtime.spinlock transition_lock;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head transition_wait;
        public Ptr<TaskDefinitions.task_struct> transition_task;
        public Ptr<cpufreq_stats> stats;
        public Ptr<?> driver_data;
        public Ptr<ThermalDefinitions.thermal_cooling_device> cdev;
        public misc.notifier_block nb_min;
        public misc.notifier_block nb_max;
    }

    @Type(noCCodeGeneration=true, cType="struct cpufreq_cpuinfo")
    @NotUsableInJava
    public static class cpufreq_cpuinfo
    extends Struct {
        public @Unsigned int max_freq;
        public @Unsigned int min_freq;
        public @Unsigned int transition_latency;
    }

    @Type(noCCodeGeneration=true, cType="enum cpufreq_table_sorting")
    public static enum cpufreq_table_sorting implements Enum<cpufreq_table_sorting>,
    TypedEnum<cpufreq_table_sorting, Integer>
    {
        CPUFREQ_TABLE_UNSORTED,
        CPUFREQ_TABLE_SORTED_ASCENDING,
        CPUFREQ_TABLE_SORTED_DESCENDING;

    }
}

