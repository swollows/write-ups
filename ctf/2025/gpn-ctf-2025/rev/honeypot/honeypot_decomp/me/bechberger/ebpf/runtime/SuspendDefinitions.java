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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.UhciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SuspendDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int suspend_common(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void suspend_device_irqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_hi_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="suspend_hi_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long suspend_hi_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void suspend_hv_clock_tsc(Ptr<runtime.clocksource> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_lo_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="suspend_lo_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long suspend_lo_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short suspend_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void suspend_console() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int suspend_nvs_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void suspend_nvs_free() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void suspend_nvs_restore() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int suspend_nvs_save() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int suspend_stats_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int suspend_stats_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int suspend_devices_and_enter(@OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_end_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int suspend_enter(@OriginalName(value="suspend_state_t") int state2, Ptr<@OriginalName(value="bool") Boolean> wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void suspend_rh(Ptr<UhciDefinitions.uhci_hcd> uhci, UhciDefinitions.uhci_rh_state new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="suspend_set_ops((const struct platform_suspend_ops*)$arg1)")
    public static void suspend_set_ops(Ptr<PlatformDefinitions.platform_suspend_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_start_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int suspend_test(int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int suspend_valid_only_mem(@OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__suspend_report_result((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static void __suspend_report_result(String function, Ptr<runtime.device> dev, Ptr<?> fn, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__suspend_set_state($arg1, (const struct regulator_state*)$arg2)")
    public static int __suspend_set_state(Ptr<RegulatorDefinitions.regulator_dev> rdev, Ptr<RegulatorDefinitions.regulator_state> rstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_disk_microvolts_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_disk_mode_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_disk_state_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_mem_microvolts_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_mem_mode_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_mem_state_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_standby_microvolts_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_standby_mode_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long suspend_standby_state_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct suspend_info")
    @NotUsableInJava
    public static class suspend_info
    extends Struct {
        public int cancelled;
    }

    @Type(noCCodeGeneration=true, cType="struct suspend_performance_record")
    @NotUsableInJava
    public static class suspend_performance_record
    extends Struct {
        public misc.fpdt_record_header header;
        public @Unsigned long suspend_start;
        public @Unsigned long suspend_end;
    }

    @Type(noCCodeGeneration=true, cType="struct suspend_stats")
    @NotUsableInJava
    public static class suspend_stats
    extends Struct {
        public @Unsigned int @Size(value=8) [] step_failures;
        public @Unsigned int success;
        public @Unsigned int fail;
        public int last_failed_dev;
        public char @Size(value=80) [] failed_devs;
        public int last_failed_errno;
        public int @Size(value=2) [] errno;
        public int last_failed_step;
        public @Unsigned long last_hw_sleep;
        public @Unsigned long total_hw_sleep;
        public @Unsigned long max_hw_sleep;
        public suspend_stat_step @Size(value=2) [] failed_steps;
    }

    @Type(noCCodeGeneration=true, cType="enum suspend_mode")
    public static enum suspend_mode implements Enum<suspend_mode>,
    TypedEnum<suspend_mode, Integer>
    {
        PRESUSPEND,
        PRESUSPEND_UNDO,
        POSTSUSPEND;

    }

    @Type(noCCodeGeneration=true, cType="enum suspend_stat_step")
    public static enum suspend_stat_step implements Enum<suspend_stat_step>,
    TypedEnum<suspend_stat_step, Integer>
    {
        SUSPEND_WORKING,
        SUSPEND_FREEZE,
        SUSPEND_PREPARE,
        SUSPEND_SUSPEND,
        SUSPEND_SUSPEND_LATE,
        SUSPEND_SUSPEND_NOIRQ,
        SUSPEND_RESUME_NOIRQ,
        SUSPEND_RESUME_EARLY,
        SUSPEND_RESUME;

    }
}

