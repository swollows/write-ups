/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RtcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="rtc_add_group($arg1, (const struct attribute_group*)$arg2)")
    public static int rtc_add_group(Ptr<rtc_device> rtc, Ptr<AttributeDefinitions.attribute_group> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtc_add_groups($arg1, (const struct attribute_group**)$arg2)")
    public static int rtc_add_groups(Ptr<rtc_device> rtc, Ptr<Ptr<AttributeDefinitions.attribute_group>> grps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short rtc_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char rtc_cmos_read(char addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_cmos_write(char val, char addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct attribute_group**)rtc_get_dev_attribute_groups())")
    public static Ptr<Ptr<AttributeDefinitions.attribute_group>> rtc_get_dev_attribute_groups() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtc_str($arg1, $arg2, (const struct rtc_time*)$arg3, $arg4, (const u8*)$arg5)")
    public static String rtc_str(String buf, String end, Ptr<rtc_time> tm2, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long rtc_dev_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_dev_fasync(int fd2, Ptr<runtime.file> file2, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long rtc_dev_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_dev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int rtc_dev_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_dev_prepare(Ptr<rtc_device> rtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rtc_dev_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_dev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int rtc_handler(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_wake_off(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_wake_on(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<rtc_device> rtc_allocate_device() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_month_days(@Unsigned int month, @Unsigned int year) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_proc_add_device(Ptr<rtc_device> rtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_proc_del_device(Ptr<rtc_device> rtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_proc_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_time64_to_tm(@OriginalName(value="time64_t") long time, Ptr<rtc_time> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long rtc_tm_to_ktime(rtc_time tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="time64_t") long rtc_tm_to_time64(Ptr<rtc_time> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_valid_tm(Ptr<rtc_time> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_year_days(@Unsigned int day, @Unsigned int month, @Unsigned int year) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rtc_read_alarm(Ptr<rtc_device> rtc, Ptr<rtc_wkalrm> alarm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rtc_read_time(Ptr<rtc_device> rtc, Ptr<rtc_time> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rtc_set_alarm(Ptr<rtc_device> rtc, Ptr<rtc_wkalrm> alarm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_add_offset(Ptr<rtc_device> rtc, Ptr<rtc_time> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_aie_update_irq(Ptr<rtc_device> rtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_alarm_disable(Ptr<rtc_device> rtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_alarm_irq_enable(Ptr<rtc_device> rtc, @Unsigned int enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_class_close(Ptr<rtc_device> rtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtc_class_open((const u8*)$arg1)")
    public static Ptr<rtc_device> rtc_class_open(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_handle_legacy_irq(Ptr<rtc_device> rtc, int num, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_initialize_alarm(Ptr<rtc_device> rtc, Ptr<rtc_wkalrm> alarm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_irq_set_freq(Ptr<rtc_device> rtc, int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_irq_set_state(Ptr<rtc_device> rtc, int enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart rtc_pie_update_irq(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_read_alarm(Ptr<rtc_device> rtc, Ptr<rtc_wkalrm> alarm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_read_offset(Ptr<rtc_device> rtc, Ptr<Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_read_time(Ptr<rtc_device> rtc, Ptr<rtc_time> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_set_alarm(Ptr<rtc_device> rtc, Ptr<rtc_wkalrm> alarm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_set_offset(Ptr<rtc_device> rtc, long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_set_time(Ptr<rtc_device> rtc, Ptr<rtc_time> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_timer_cancel(Ptr<rtc_device> rtc, Ptr<rtc_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_timer_do_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_timer_enqueue(Ptr<rtc_device> rtc, Ptr<rtc_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtc_timer_init($arg1, (void (*)(struct rtc_device*))$arg2, $arg3)")
    public static void rtc_timer_init(Ptr<rtc_timer> timer, Ptr<?> f, Ptr<rtc_device> rtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_timer_remove(Ptr<rtc_device> rtc, Ptr<rtc_timer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_timer_start(Ptr<rtc_device> rtc, Ptr<rtc_timer> timer, @OriginalName(value="ktime_t") long expires, @OriginalName(value="ktime_t") long period) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_uie_update_irq(Ptr<rtc_device> rtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtc_update_irq(Ptr<rtc_device> rtc, @Unsigned long num, @Unsigned long events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_update_irq_enable(Ptr<rtc_device> rtc, @Unsigned int enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtc_valid_range(Ptr<rtc_device> rtc, Ptr<rtc_time> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rtc_device")
    @NotUsableInJava
    public static class rtc_device
    extends Struct {
        public runtime.device dev;
        public Ptr<runtime.module> owner;
        public int id;
        public Ptr<rtc_class_ops> ops;
        public runtime.mutex ops_lock;
        public runtime.cdev char_dev;
        public @Unsigned long flags;
        public @Unsigned long irq_data;
        public  @OriginalName(value="spinlock_t") runtime.spinlock irq_lock;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head irq_queue;
        public Ptr<misc.fasync_struct> async_queue;
        public int irq_freq;
        public int max_user_freq;
        public misc.timerqueue_head timerqueue;
        public rtc_timer aie_timer;
        public rtc_timer uie_rtctimer;
        public runtime.hrtimer pie_timer;
        public int pie_enabled;
        public misc.work_struct irqwork;
        public @Unsigned long set_offset_nsec;
        public @Unsigned long @Size(value=1) [] features;
        public @OriginalName(value="time64_t") long range_min;
        public @Unsigned @OriginalName(value="timeu64_t") long range_max;
        public @Unsigned @OriginalName(value="timeu64_t") long alarm_offset_max;
        public @OriginalName(value="time64_t") long start_secs;
        public @OriginalName(value="time64_t") long offset_secs;
        public boolean set_start_time;
    }

    @Type(noCCodeGeneration=true, cType="struct rtc_timer")
    @NotUsableInJava
    public static class rtc_timer
    extends Struct {
        public misc.timerqueue_node node;
        public @OriginalName(value="ktime_t") long period;
        public Ptr<?> func;
        public Ptr<rtc_device> rtc;
        public int enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct rtc_class_ops")
    @NotUsableInJava
    public static class rtc_class_ops
    extends Struct {
        public Ptr<?> ioctl;
        public Ptr<?> read_time;
        public Ptr<?> set_time;
        public Ptr<?> read_alarm;
        public Ptr<?> set_alarm;
        public Ptr<?> proc;
        public Ptr<?> alarm_irq_enable;
        public Ptr<?> read_offset;
        public Ptr<?> set_offset;
        public Ptr<?> param_get;
        public Ptr<?> param_set;
    }

    @Type(noCCodeGeneration=true, cType="struct rtc_param")
    @NotUsableInJava
    public static class rtc_param
    extends Struct {
        public @Unsigned long param;
        @InlineUnion(value=7726)
        public @InlineUnion(value=7726) @Unsigned long uvalue;
        @InlineUnion(value=7726)
        public @InlineUnion(value=7726) long svalue;
        @InlineUnion(value=7726)
        public @InlineUnion(value=7726) @Unsigned long ptr;
        public @Unsigned int index;
        public @Unsigned int __pad;
    }

    @Type(noCCodeGeneration=true, cType="struct rtc_wkalrm")
    @NotUsableInJava
    public static class rtc_wkalrm
    extends Struct {
        public char enabled;
        public char pending;
        public rtc_time time;
    }

    @Type(noCCodeGeneration=true, cType="struct rtc_time")
    @NotUsableInJava
    public static class rtc_time
    extends Struct {
        public int tm_sec;
        public int tm_min;
        public int tm_hour;
        public int tm_mday;
        public int tm_mon;
        public int tm_year;
        public int tm_wday;
        public int tm_yday;
        public int tm_isdst;
    }
}

