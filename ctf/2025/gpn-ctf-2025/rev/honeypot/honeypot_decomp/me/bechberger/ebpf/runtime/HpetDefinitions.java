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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class HpetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="_hpet_print_config((const u8*)$arg1, $arg2)")
    public static void _hpet_print_config(String function, int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_clkevt_legacy_resume(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_clkevt_msi_resume(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_clkevt_set_next_event(@Unsigned long delta, Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_clkevt_set_state_oneshot(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_clkevt_set_state_periodic(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_clkevt_set_state_shutdown(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_cpuhp_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_cpuhp_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_insert_resource() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_mask_rtc_irq_bit(@Unsigned long bit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_msi_free(Ptr<IrqDefinitions.irq_domain> domain, Ptr<MsiDefinitions.msi_domain_info> info2, @Unsigned int virq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_msi_init(Ptr<IrqDefinitions.irq_domain> domain, Ptr<MsiDefinitions.msi_domain_info> info2, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn hpet_msi_interrupt_handler(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_msi_mask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_msi_unmask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_msi_write_msg(Ptr<IrqDefinitions.irq_data> data, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int hpet_readl(@Unsigned int a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_register_irq_handler(@OriginalName(value="rtc_irq_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_reserve_platform_timers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_restart_counter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_resume_counter(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_rtc_dropped_irq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn hpet_rtc_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_rtc_timer_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_select_clockevents() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_set_alarm_time(char hrs, char min, char sec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_set_periodic_freq(@Unsigned long freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_set_rtc_irq_bit(@Unsigned long bit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_time_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hpet_unregister_irq_handler(@OriginalName(value="rtc_irq_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __hpet_calibrate(Ptr<hpets> hpetp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_acpi_add(Ptr<AcpiDefinitions.acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_alloc(Ptr<hpet_data> hdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long hpet_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_fasync(int fd2, Ptr<runtime.file> file2, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn hpet_interrupt(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long hpet_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_ioctl_common(Ptr<hpet_dev> devp, @Unsigned int cmd, @Unsigned long arg2, Ptr<hpet_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_ioctl_ieon(Ptr<hpet_dev> devp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_mmap_enable(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int hpet_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hpet_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hpet_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int hpet_resources(Ptr<AcpiDefinitions.acpi_resource> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hpet")
    @NotUsableInJava
    public static class hpet
    extends Struct {
        public @Unsigned long hpet_cap;
        public @Unsigned long res0;
        public @Unsigned long hpet_config;
        public @Unsigned long res1;
        public @Unsigned long hpet_isr;
        public @Unsigned long @Size(value=25) [] res2;
        public misc._u0_of_hpet _u0;
        public @Unsigned long res3;
        public hpet_timer @Size(value=0) [] hpet_timers;
    }

    @Type(noCCodeGeneration=true, cType="struct hpets")
    @NotUsableInJava
    public static class hpets
    extends Struct {
        public Ptr<hpets> hp_next;
        public Ptr<hpet> hp_hpet;
        public @Unsigned long hp_hpet_phys;
        public @Unsigned long hp_tick_freq;
        public @Unsigned long hp_delta;
        public @Unsigned int hp_ntimer;
        public @Unsigned int hp_which;
        public hpet_dev @Size(value=0) [] hp_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct hpet_dev")
    @NotUsableInJava
    public static class hpet_dev
    extends Struct {
        public Ptr<hpets> hd_hpets;
        public Ptr<hpet> hd_hpet;
        public Ptr<hpet_timer> hd_timer;
        public @Unsigned long hd_ireqfreq;
        public @Unsigned long hd_irqdata;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head hd_waitqueue;
        public Ptr<misc.fasync_struct> hd_async_queue;
        public @Unsigned int hd_flags;
        public @Unsigned int hd_irq;
        public @Unsigned int hd_hdwirq;
        public char @Size(value=7) [] hd_name;
    }

    @Type(noCCodeGeneration=true, cType="struct hpet_timer")
    @NotUsableInJava
    public static class hpet_timer
    extends Struct {
        public @Unsigned long hpet_config;
        public misc._u1_of_hpet_timer _u1;
        public @Unsigned long @Size(value=2) [] hpet_fsb;
    }

    @Type(noCCodeGeneration=true, cType="struct hpet_info")
    @NotUsableInJava
    public static class hpet_info
    extends Struct {
        public @Unsigned long hi_ireqfreq;
        public @Unsigned long hi_flags;
        public @Unsigned short hi_hpet;
        public @Unsigned short hi_timer;
    }

    @Type(noCCodeGeneration=true, cType="union hpet_lock")
    @NotUsableInJava
    public static class hpet_lock
    extends Union {
        public AnonDefinitions.anon_member_of_hpet_lock anon0;
        public @Unsigned long lockval;
    }

    @Type(noCCodeGeneration=true, cType="struct hpet_base")
    @NotUsableInJava
    public static class hpet_base
    extends Struct {
        public @Unsigned int nr_channels;
        public @Unsigned int nr_clockevents;
        public @Unsigned int boot_cfg;
        public Ptr<hpet_channel> channels;
    }

    @Type(noCCodeGeneration=true, cType="struct hpet_channel")
    @NotUsableInJava
    public static class hpet_channel
    extends Struct {
        public misc.clock_event_device evt;
        public @Unsigned int num;
        public @Unsigned int cpu;
        public @Unsigned int irq;
        public @Unsigned int in_use;
        public hpet_mode mode;
        public @Unsigned int boot_cfg;
        public char @Size(value=10) [] name;
    }

    @Type(noCCodeGeneration=true, cType="enum hpet_mode")
    public static enum hpet_mode implements Enum<hpet_mode>,
    TypedEnum<hpet_mode, Integer>
    {
        HPET_MODE_UNUSED,
        HPET_MODE_LEGACY,
        HPET_MODE_CLOCKEVT,
        HPET_MODE_DEVICE;

    }

    @Type(noCCodeGeneration=true, cType="struct hpet_data")
    @NotUsableInJava
    public static class hpet_data
    extends Struct {
        public @Unsigned long hd_phys_address;
        public Ptr<?> hd_address;
        public @Unsigned short hd_nirqs;
        public @Unsigned int hd_state;
        public @Unsigned int @Size(value=32) [] hd_irq;
    }

    @Type(noCCodeGeneration=true, cType="struct hpet_scope")
    @NotUsableInJava
    public static class hpet_scope
    extends Struct {
        public Ptr<IntelDefinitions.intel_iommu> iommu;
        public char id;
        public @Unsigned int bus;
        public @Unsigned int devfn;
    }
}

