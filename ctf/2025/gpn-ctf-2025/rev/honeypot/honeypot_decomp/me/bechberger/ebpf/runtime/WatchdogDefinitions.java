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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class WatchdogDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __watchdog_ping(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_cdev_register(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_cdev_unregister(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_core_data_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_dev_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_dev_register(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_dev_resume(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_dev_suspend(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_dev_unregister(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_enable(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int watchdog_get_status(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_hardlockup_check(@Unsigned int cpu2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_hardlockup_disable(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_hardlockup_enable(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_hardlockup_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_hardlockup_start() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_hardlockup_stop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_hardlockup_touch_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long watchdog_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_ping(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_ping_work(Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_set_last_hw_keepalive(Ptr<watchdog_device> wdd, @Unsigned int last_ping_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_start(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_stop(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_thresh_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart watchdog_timer_expired(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart watchdog_timer_fn(Ptr<runtime.hrtimer> hrtimer2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_update_worker(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean watchdog_worker_should_ping(Ptr<watchdog_core_data> wd_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="watchdog_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long watchdog_write(Ptr<runtime.file> file2, String data, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __watchdog_register_device(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_init_timeout(Ptr<watchdog_device> wdd, @Unsigned int timeout_parm, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_pm_notifier(Ptr<misc.notifier_block> nb, @Unsigned long mode, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_reboot_notifier(Ptr<misc.notifier_block> nb, @Unsigned long code2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_register_device(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_restart_notifier(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_set_restart_priority(Ptr<watchdog_device> wdd, int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_unregister_device(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_notify_pretimeout(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_pretimeout_available_governors_get(String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_pretimeout_governor_get(Ptr<watchdog_device> wdd, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="watchdog_pretimeout_governor_set($arg1, (const u8*)$arg2)")
    public static int watchdog_pretimeout_governor_set(Ptr<watchdog_device> wdd, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_register_governor(Ptr<watchdog_governor> gov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_register_pretimeout(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_unregister_governor(Ptr<watchdog_governor> gov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_unregister_pretimeout(Ptr<watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int watchdog_gov_noop_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_gov_noop_unregister() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_overflow_callback(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void watchdog_update_hrtimer_threshold(@Unsigned long period) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct watchdog_pretimeout")
    @NotUsableInJava
    public static class watchdog_pretimeout
    extends Struct {
        public Ptr<watchdog_device> wdd;
        public ListDefinitions.list_head entry;
    }

    @Type(noCCodeGeneration=true, cType="struct watchdog_core_data")
    @NotUsableInJava
    public static class watchdog_core_data
    extends Struct {
        public runtime.device dev;
        public runtime.cdev cdev;
        public Ptr<watchdog_device> wdd;
        public runtime.mutex lock;
        public @OriginalName(value="ktime_t") long last_keepalive;
        public @OriginalName(value="ktime_t") long last_hw_keepalive;
        public @OriginalName(value="ktime_t") long open_deadline;
        public runtime.hrtimer timer;
        public KthreadDefinitions.kthread_work work;
        public @Unsigned long status;
    }

    @Type(noCCodeGeneration=true, cType="struct watchdog_governor")
    @NotUsableInJava
    public static class watchdog_governor
    extends Struct {
        public char @Size(value=20) [] name;
        public Ptr<?> pretimeout;
    }

    @Type(noCCodeGeneration=true, cType="struct watchdog_device")
    @NotUsableInJava
    public static class watchdog_device
    extends Struct {
        public int id;
        public Ptr<runtime.device> parent;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> groups;
        public Ptr<watchdog_info> info;
        public Ptr<watchdog_ops> ops;
        public Ptr<watchdog_governor> gov;
        public @Unsigned int bootstatus;
        public @Unsigned int timeout;
        public @Unsigned int pretimeout;
        public @Unsigned int min_timeout;
        public @Unsigned int max_timeout;
        public @Unsigned int min_hw_heartbeat_ms;
        public @Unsigned int max_hw_heartbeat_ms;
        public misc.notifier_block reboot_nb;
        public misc.notifier_block restart_nb;
        public misc.notifier_block pm_nb;
        public Ptr<?> driver_data;
        public Ptr<watchdog_core_data> wd_data;
        public @Unsigned long status;
        public ListDefinitions.list_head deferred;
    }

    @Type(noCCodeGeneration=true, cType="struct watchdog_ops")
    @NotUsableInJava
    public static class watchdog_ops
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<?> start;
        public Ptr<?> stop;
        public Ptr<?> ping;
        public Ptr<?> status;
        public Ptr<?> set_timeout;
        public Ptr<?> set_pretimeout;
        public Ptr<?> get_timeleft;
        public Ptr<?> restart;
        public Ptr<?> ioctl;
    }

    @Type(noCCodeGeneration=true, cType="struct watchdog_info")
    @NotUsableInJava
    public static class watchdog_info
    extends Struct {
        public @Unsigned int options;
        public @Unsigned int firmware_version;
        public char @Size(value=32) [] identity;
    }
}

