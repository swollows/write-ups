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
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EmDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.OppDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DevfreqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<devfreq_event_dev> devfreq_event_add_edev(Ptr<runtime.device> dev, Ptr<devfreq_event_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_event_disable_edev(Ptr<devfreq_event_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_event_enable_edev(Ptr<devfreq_event_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devfreq_event_get_edev_by_phandle($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<devfreq_event_dev> devfreq_event_get_edev_by_phandle(Ptr<runtime.device> dev, String phandle_name, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devfreq_event_get_edev_count($arg1, (const u8*)$arg2)")
    public static int devfreq_event_get_edev_count(Ptr<runtime.device> dev, String phandle_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_event_get_event(Ptr<devfreq_event_dev> edev, Ptr<devfreq_event_data> edata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_event_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean devfreq_event_is_enabled(Ptr<devfreq_event_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_event_release_edev(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_event_remove_edev(Ptr<devfreq_event_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_event_reset_event(Ptr<devfreq_event_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_event_set_event(Ptr<devfreq_event_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_powersave_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_powersave_func(Ptr<runtime.devfreq> df, Ptr<@Unsigned Long> freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_powersave_handler(Ptr<runtime.devfreq> devfreq2, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_powersave_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ThermalDefinitions.thermal_cooling_device> devfreq_cooling_em_register(Ptr<runtime.devfreq> df, Ptr<devfreq_cooling_power> dfc_power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_cooling_gen_tables(Ptr<devfreq_cooling_device> dfc, int num_opps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_cooling_get_cur_state(Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, Ptr<@Unsigned Long> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_cooling_get_max_state(Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, Ptr<@Unsigned Long> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_cooling_get_requested_power(Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, Ptr<@Unsigned Integer> power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_cooling_power2state(Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned int power, Ptr<@Unsigned Long> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ThermalDefinitions.thermal_cooling_device> devfreq_cooling_register(Ptr<runtime.devfreq> df) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_cooling_set_cur_state(Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_cooling_state2power(Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, @Unsigned long state2, Ptr<@Unsigned Integer> power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_cooling_unregister(Ptr<ThermalDefinitions.thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_simple_ondemand_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_simple_ondemand_func(Ptr<runtime.devfreq> df, Ptr<@Unsigned Long> freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_simple_ondemand_handler(Ptr<runtime.devfreq> devfreq2, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_simple_ondemand_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_userspace_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_userspace_func(Ptr<runtime.devfreq> df, Ptr<@Unsigned Long> freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_userspace_handler(Ptr<runtime.devfreq> devfreq2, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_userspace_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_passive_event_handler(Ptr<runtime.devfreq> devfreq2, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_passive_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_passive_get_target_freq(Ptr<runtime.devfreq> devfreq2, Ptr<@Unsigned Long> freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_passive_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_passive_notifier_call(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_performance_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_performance_func(Ptr<runtime.devfreq> df, Ptr<@Unsigned Long> freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_performance_handler(Ptr<runtime.devfreq> devfreq2, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_performance_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devfreq_add_device($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<runtime.devfreq> devfreq_add_device(Ptr<runtime.device> dev, Ptr<devfreq_dev_profile> profile, String governor_name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_add_governor(Ptr<devfreq_governor> governor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.devfreq> devfreq_get_devfreq_by_node(Ptr<DeviceDefinitions.device_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devfreq_get_devfreq_by_phandle($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<runtime.devfreq> devfreq_get_devfreq_by_phandle(Ptr<runtime.device> dev, String phandle_name, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_get_freq_range(Ptr<runtime.devfreq> devfreq2, Ptr<@Unsigned Long> min_freq, Ptr<@Unsigned Long> max_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_monitor(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_monitor_resume(Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_monitor_start(Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_monitor_stop(Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_monitor_suspend(Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_notifier_call(Ptr<misc.notifier_block> nb, @Unsigned long type2, Ptr<?> devp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevDefinitions.dev_pm_opp> devfreq_recommended_opp(Ptr<runtime.device> dev, Ptr<@Unsigned Long> freq, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_register_notifier(Ptr<runtime.devfreq> devfreq2, Ptr<misc.notifier_block> nb, @Unsigned int list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_register_opp_notifier(Ptr<runtime.device> dev, Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_remove_device(Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_remove_governor(Ptr<devfreq_governor> governor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_resume_device(Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_set_target(Ptr<runtime.devfreq> devfreq2, @Unsigned long new_freq, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_summary_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_summary_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_suspend_device(Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_unregister_notifier(Ptr<runtime.devfreq> devfreq2, Ptr<misc.notifier_block> nb, @Unsigned int list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_unregister_opp_notifier(Ptr<runtime.device> dev, Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devfreq_update_interval(Ptr<runtime.devfreq> devfreq2, Ptr<@Unsigned Integer> delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_update_status(Ptr<runtime.devfreq> devfreq2, @Unsigned long freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devfreq_update_target(Ptr<runtime.devfreq> devfreq2, @Unsigned long freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_cpu_data")
    @NotUsableInJava
    public static class devfreq_cpu_data
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<runtime.device> dev;
        public @Unsigned int first_cpu;
        public Ptr<OppDefinitions.opp_table> opp_table;
        public @Unsigned int cur_freq;
        public @Unsigned int min_freq;
        public @Unsigned int max_freq;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_simple_ondemand_data")
    @NotUsableInJava
    public static class devfreq_simple_ondemand_data
    extends Struct {
        public @Unsigned int upthreshold;
        public @Unsigned int downdifferential;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_cooling_device")
    @NotUsableInJava
    public static class devfreq_cooling_device
    extends Struct {
        public Ptr<ThermalDefinitions.thermal_cooling_device> cdev;
        public ThermalDefinitions.thermal_cooling_device_ops cooling_ops;
        public Ptr<runtime.devfreq> devfreq;
        public @Unsigned long cooling_state;
        public Ptr<@Unsigned Integer> freq_table;
        public @Unsigned long max_state;
        public Ptr<devfreq_cooling_power> power_ops;
        public @Unsigned int res_util;
        public int capped_state;
        public DevDefinitions.dev_pm_qos_request req_max_freq;
        public Ptr<EmDefinitions.em_perf_domain> em_pd;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_event_ops")
    @NotUsableInJava
    public static class devfreq_event_ops
    extends Struct {
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> reset;
        public Ptr<?> set_event;
        public Ptr<?> get_event;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_event_data")
    @NotUsableInJava
    public static class devfreq_event_data
    extends Struct {
        public @Unsigned long load_count;
        public @Unsigned long total_count;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_event_desc")
    @NotUsableInJava
    public static class devfreq_event_desc
    extends Struct {
        public String name;
        public @Unsigned int event_type;
        public Ptr<?> driver_data;
        public Ptr<devfreq_event_ops> ops;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_event_dev")
    @NotUsableInJava
    public static class devfreq_event_dev
    extends Struct {
        public ListDefinitions.list_head node;
        public runtime.device dev;
        public runtime.mutex lock;
        public @Unsigned int enable_count;
        public Ptr<devfreq_event_desc> desc;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_notifier_devres")
    @NotUsableInJava
    public static class devfreq_notifier_devres
    extends Struct {
        public Ptr<runtime.devfreq> devfreq;
        public Ptr<misc.notifier_block> nb;
        public @Unsigned int list;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_cooling_power")
    @NotUsableInJava
    public static class devfreq_cooling_power
    extends Struct {
        public Ptr<?> get_real_power;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_passive_data")
    @NotUsableInJava
    public static class devfreq_passive_data
    extends Struct {
        public Ptr<runtime.devfreq> parent;
        public Ptr<?> get_target_freq;
        public devfreq_parent_dev_type parent_type;
        public Ptr<runtime.devfreq> _this;
        public misc.notifier_block nb;
        public ListDefinitions.list_head cpu_data_list;
    }

    @Type(noCCodeGeneration=true, cType="enum devfreq_parent_dev_type")
    public static enum devfreq_parent_dev_type implements Enum<devfreq_parent_dev_type>,
    TypedEnum<devfreq_parent_dev_type, Integer>
    {
        DEVFREQ_PARENT_DEV,
        CPUFREQ_PARENT_DEV;

    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_freqs")
    @NotUsableInJava
    public static class devfreq_freqs
    extends Struct {
        public @Unsigned long old;
        public @Unsigned long _new;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_governor")
    @NotUsableInJava
    public static class devfreq_governor
    extends Struct {
        public ListDefinitions.list_head node;
        public char @Size(value=16) [] name;
        public @Unsigned long attrs;
        public @Unsigned long flags;
        public Ptr<?> get_target_freq;
        public Ptr<?> event_handler;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_stats")
    @NotUsableInJava
    public static class devfreq_stats
    extends Struct {
        public @Unsigned int total_trans;
        public Ptr<@Unsigned Integer> trans_table;
        public Ptr<@Unsigned Long> time_in_state;
        public @Unsigned long last_update;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_dev_profile")
    @NotUsableInJava
    public static class devfreq_dev_profile
    extends Struct {
        public @Unsigned long initial_freq;
        public @Unsigned int polling_ms;
        public devfreq_timer timer;
        public Ptr<?> target;
        public Ptr<?> get_dev_status;
        public Ptr<?> get_cur_freq;
        public Ptr<?> exit;
        public Ptr<@Unsigned Long> freq_table;
        public @Unsigned int max_state;
        public boolean is_cooling_device;
    }

    @Type(noCCodeGeneration=true, cType="struct devfreq_dev_status")
    @NotUsableInJava
    public static class devfreq_dev_status
    extends Struct {
        public @Unsigned long total_time;
        public @Unsigned long busy_time;
        public @Unsigned long current_frequency;
        public Ptr<?> private_data;
    }

    @Type(noCCodeGeneration=true, cType="enum devfreq_timer")
    public static enum devfreq_timer implements Enum<devfreq_timer>,
    TypedEnum<devfreq_timer, Integer>
    {
        DEVFREQ_TIMER_DEFERRABLE,
        DEVFREQ_TIMER_DELAYED,
        DEVFREQ_TIMER_NUM;

    }
}

