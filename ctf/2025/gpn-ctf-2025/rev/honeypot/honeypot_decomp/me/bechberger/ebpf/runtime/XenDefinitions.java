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
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BootDefinitions;
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.FlushDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.McDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.StartDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ThreadDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.VcpuDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class XenDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__xen_send_IPI_mask((const struct cpumask*)$arg1, $arg2)")
    public static void __xen_send_IPI_mask(Ptr<runtime.cpumask> mask, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_get_gsi_from_sbdf(@Unsigned int sbdf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_get_gsi_info(Ptr<PciDefinitions.pci_dev> dev, Ptr<Integer> gsi_out, Ptr<Integer> trigger_out, Ptr<Integer> polarity_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_notify_hypervisor_extended_sleep(char sleep_state, @Unsigned int val_a, @Unsigned int val_b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_notify_hypervisor_sleep(char sleep_state, @Unsigned int pm1a_cnt, @Unsigned int pm1b_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_notify_hypervisor_state(char sleep_state, @Unsigned int val_a, @Unsigned int val_b, boolean extended) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_acpi_register_get_gsi_func(@OriginalName(value="get_gsi_from_sbdf_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_suspend_lowlevel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_alloc_ldt(Ptr<DescDefinitions.desc_struct> ldt, @Unsigned int entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_apic_eoi() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_apic_icr_read() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_apic_icr_write(@Unsigned int low, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_apic_probe_pv() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xen_apic_read(@Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_apic_write(@Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_biovec_phys_mergeable((const struct bio_vec*)$arg1, (const struct page*)$arg2)")
    public static boolean xen_biovec_phys_mergeable(Ptr<BioDefinitions.bio_vec> vec1, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_boot_params_init_edd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xen_call_function_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xen_call_function_single_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_check_mwait() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_clocksource_get_cycles(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_clocksource_read() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_cons_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_console_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_convert_trap_info((const struct desc_ptr*)$arg1, $arg2, $arg3)")
    public static @Unsigned int xen_convert_trap_info(Ptr<DescDefinitions.desc_ptr> desc, Ptr<misc.trap_info> traps, boolean full) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_copy_trap_info(Ptr<misc.trap_info> traps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_cpu_dead_pv(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xen_cpu_present_to_apicid(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_cpu_up_prepare_pv(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_cpuid(Ptr<@Unsigned Integer> ax, Ptr<@Unsigned Integer> bx, Ptr<@Unsigned Integer> cx, Ptr<@Unsigned Integer> dx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_crash_shutdown(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_cs_enable(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_do_read_msr(@Unsigned int msr2, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_do_write_msr(@Unsigned int msr2, @Unsigned int low, @Unsigned int high, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_dom0_set_legacy_features() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_domu_set_legacy_features() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_efi_config_table_is_usable((const struct {\n  u8 b[16];\n}*)$arg1, $arg2)")
    public static boolean xen_efi_config_table_is_usable(Ptr< @OriginalName(value="efi_guid_t") misc.uuid_t> guid, @Unsigned long table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_get_next_high_mono_count(Ptr<@Unsigned Integer> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_get_next_variable(Ptr<@Unsigned Long> name_size, Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr< @OriginalName(value="efi_guid_t") misc.uuid_t> vendor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_get_time(Ptr<EfiDefinitions.efi_time_t> tm2, Ptr<EfiDefinitions.efi_time_cap_t> tc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_get_variable(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr< @OriginalName(value="efi_guid_t") misc.uuid_t> vendor, Ptr<@Unsigned Integer> attr2, Ptr<@Unsigned Long> data_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_get_wakeup_time(Ptr<@OriginalName(value="efi_bool_t") Character> enabled, Ptr<@OriginalName(value="efi_bool_t") Character> pending, Ptr<EfiDefinitions.efi_time_t> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_query_capsule_caps(Ptr<Ptr<EfiDefinitions.efi_capsule_header_t>> capsules, @Unsigned long count, Ptr<@Unsigned Long> max_size, Ptr<Integer> reset_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_query_variable_info(@Unsigned int attr2, Ptr<@Unsigned Long> storage_space, Ptr<@Unsigned Long> remaining_space, Ptr<@Unsigned Long> max_variable_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_efi_reset_system(int reset_type, @Unsigned @OriginalName(value="efi_status_t") long status, @Unsigned long data_size, Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_efi_runtime_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_set_time(Ptr<EfiDefinitions.efi_time_t> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_set_variable(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr< @OriginalName(value="efi_guid_t") misc.uuid_t> vendor, @Unsigned int attr2, @Unsigned long data_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_set_wakeup_time(@OriginalName(value="efi_bool_t") char enabled, Ptr<EfiDefinitions.efi_time_t> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long xen_efi_update_capsule(Ptr<Ptr<EfiDefinitions.efi_capsule_header_t>> capsules, @Unsigned long count, @Unsigned long sg_list2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_end_context_switch(Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_evtchn_fifo_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_for_each_gfn(Ptr<Ptr<runtime.page>> pages, @Unsigned int nr_gfn, @OriginalName(value="xen_gfn_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_free_ldt(Ptr<DescDefinitions.desc_struct> ldt, @Unsigned int entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xen_get_apic_id(@Unsigned int x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_get_debugreg(int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static xen_lazy_mode xen_get_lazy_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char xen_get_nmi_reason() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_get_runstate_snapshot(Ptr<VcpuDefinitions.vcpu_runstate_info> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_get_runstate_snapshot_cpu_delta(Ptr<VcpuDefinitions.vcpu_runstate_info> res, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_get_wallclock(Ptr<runtime.timespec64> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_hvc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_hvm_console_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_init_time_ops() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_setup_cpu_clockevents() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_init_apic() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_init_capabilities() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_init_lock_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_init_spinlocks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_init_time_common() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_init_time_ops() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_invalidate_io_bitmap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xen_io_apic_read(@Unsigned int apic2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_io_delay() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_load_gdt((const struct desc_ptr*)$arg1)")
    public static void xen_load_gdt(Ptr<DescDefinitions.desc_ptr> dtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_load_gdt_boot((const struct desc_ptr*)$arg1)")
    public static void xen_load_gdt_boot(Ptr<DescDefinitions.desc_ptr> dtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_load_gs_index(@Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_load_idt((const struct desc_ptr*)$arg1)")
    public static void xen_load_idt(Ptr<DescDefinitions.desc_ptr> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_load_sp0(@Unsigned long sp0) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_load_tls(Ptr<ThreadDefinitions.thread_struct> t, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_machine_halt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_machine_power_off() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_madt_oem_check(String oem_id, String oem_table_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_manage_runstate_time(int action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_mc_batch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_mc_issue(@Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int xen_platform_pv() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pv_console_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_guest_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_init_platform() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pvclock_gtod_notify(Ptr<misc.notifier_block> nb, @Unsigned long was_set, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_qlock_kick(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_qlock_wait(Ptr<Character> _byte, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_raw_console_write((const u8*)$arg1)")
    public static void xen_raw_console_write(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_raw_printk((const u8*)$arg1, $arg2_)")
    public static void xen_raw_printk(String fmt, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_read_cr0() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_read_msr(@Unsigned int msr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_read_msr_safe(@Unsigned int msr2, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_read_wallclock(Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_remap_vma_range(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xen_reschedule_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_restart(String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_restore_time_memory_area() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_save_time_memory_area() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_sched_clock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_send_IPI_all(int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_send_IPI_allbutself(int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_send_IPI_mask((const struct cpumask*)$arg1, $arg2)")
    public static void xen_send_IPI_mask(Ptr<runtime.cpumask> mask, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_send_IPI_mask_allbutself((const struct cpumask*)$arg1, $arg2)")
    public static void xen_send_IPI_mask_allbutself(Ptr<runtime.cpumask> mask, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_send_IPI_self(int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_debugreg(int reg, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_set_ldt((const void*)$arg1, $arg2)")
    public static void xen_set_ldt(Ptr<?> addr2, @Unsigned int entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_mtrr_data() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_set_wallclock((const struct timespec64*)$arg1)")
    public static int xen_set_wallclock(Ptr<runtime.timespec64> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_cpu_clockevents() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_runstate_info(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_timer(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_vcpu_info_placement() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_smp_cpus_done(@Unsigned int max_cpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_smp_intr_free(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_smp_intr_init(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_smp_send_call_function_ipi((const struct cpumask*)$arg1)")
    public static void xen_smp_send_call_function_ipi(Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_smp_send_call_function_single_ipi(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_smp_send_reschedule(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_start_context_switch(Ptr<TaskDefinitions.task_struct> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_start_kernel(Ptr<StartDefinitions.start_info> si) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_steal_clock(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_store_tr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_teardown_timer(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_time_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_time_setup_guest() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xen_timer_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_timer_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_timerop_set_next_event(@Unsigned long delta, Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_timerop_shutdown(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_tsc_khz() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_uninit_lock_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_update_io_bitmap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_vcpu_stolen(int vcpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_vcpuop_set_next_event(@Unsigned long delta, Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_vcpuop_set_oneshot(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_vcpuop_shutdown(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_write_cr0(@Unsigned long cr0) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_write_cr4(@Unsigned long cr4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_write_gdt_entry($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void xen_write_gdt_entry(Ptr<DescDefinitions.desc_struct> dt, int entry, Ptr<?> desc, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_write_gdt_entry_boot($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void xen_write_gdt_entry_boot(Ptr<DescDefinitions.desc_struct> dt, int entry, Ptr<?> desc, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_write_idt_entry($arg1, $arg2, (const gate_struct*)$arg3)")
    public static void xen_write_idt_entry(Ptr< @OriginalName(value="gate_desc") misc.gate_struct> dt, int entrynum, Ptr< @OriginalName(value="gate_desc") misc.gate_struct> g) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_write_ldt_entry($arg1, $arg2, (const void*)$arg3)")
    public static void xen_write_ldt_entry(Ptr<DescDefinitions.desc_struct> dt, int entrynum, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_write_msr(@Unsigned int msr2, @Unsigned int low, @Unsigned int high) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_write_msr_safe(@Unsigned int msr2, @Unsigned int low, @Unsigned int high) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_xlate_map_ballooned_pages(Ptr<Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long>> gfns, Ptr<Ptr<?>> virt, @Unsigned long nr_grant_frames) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_xlate_remap_gfn_array(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> gfn, int nr, Ptr<Integer> err_ptr,  @OriginalName(value="pgprot_t") runtime.pgprot prot, @Unsigned int domid, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_xlate_unmap_gfn_range(Ptr<VmDefinitions.vm_area_struct> vma, int nr, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.multicall_space __xen_mc_entry(@Unsigned long args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xen_acpi_os_ioremap(@Unsigned @OriginalName(value="acpi_physical_address") long phys, @Unsigned @OriginalName(value="acpi_size") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_add_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_add_extra_mem(@Unsigned long start_pfn, @Unsigned long n_pfns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_add_preferred_consoles() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_add_remap_nonram(@Unsigned @OriginalName(value="phys_addr_t") long maddr, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_alloc_ballooned_pages(@Unsigned int nr_pages, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_alloc_p2m_entry(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_arch_register_cpu(int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_arch_unregister_cpu(int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_balloon_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_banner() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_build_dynamic_phys_to_machine() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_build_mfn_list_list() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_cpu_dead_hvm(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_cpu_up_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_cpu_up_prepare_hvm(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_cpuhp_setup((int (*)(unsigned int))$arg1, (int (*)(unsigned int))$arg2)")
    public static int xen_cpuhp_setup(Ptr<?> cpu_up_prepare_cb, Ptr<?> cpu_dead_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xen_debug_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_do_remap_nonram() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_emergency_restart() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_evtchn_2l_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_find_device_domain_owner(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_free_ballooned_pages(@Unsigned int nr_pages, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xen_grant_dma_alloc(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> xen_grant_dma_alloc_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, DmaDefinitions.dma_data_direction dir, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_grant_dma_free(Ptr<runtime.device> dev, @Unsigned long size, Ptr<?> vaddr, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_grant_dma_free_pages(Ptr<runtime.device> dev, @Unsigned long size, Ptr<runtime.page> vaddr, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long xen_grant_dma_map_page(Ptr<runtime.device> dev, Ptr<runtime.page> page2, @Unsigned long offset, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_grant_dma_map_sg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_grant_dma_supported(Ptr<runtime.device> dev, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_grant_dma_unmap_page(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_grant_dma_unmap_sg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_crash_shutdown(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_guest_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_guest_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_init_mem_mapping() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_init_shared_info() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_shutdown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_late_init_mcelog() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_mc_callback((void (*)(void*))$arg1, $arg2)")
    public static void xen_mc_callback(Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_mc_flush() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long xen_mce_chrdev_ioctl(Ptr<runtime.file> f, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_mce_chrdev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int xen_mce_chrdev_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long xen_mce_chrdev_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long usize, Ptr<@OriginalName(value="loff_t") Long> off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_mce_chrdev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xen_mce_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_mce_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_memory_notifier(Ptr<misc.notifier_block> nb, @Unsigned long val, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_online_page(Ptr<runtime.page> page2, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_p2m_elem_type(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_panic_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_panic_handler_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_parse_mc_debug(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_parse_no_vector_callback(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_parse_nopv(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pci_notifier(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pin_vcpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int xen_platform_hvm() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_reboot(int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_rebuild_p2m_list(Ptr<@Unsigned Long> p2m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_register_device_domain_owner(Ptr<PciDefinitions.pci_dev> dev, @Unsigned @OriginalName(value="uint16_t") short domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_reset_device((const struct pci_dev*)$arg1)")
    public static int xen_reset_device(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_running_on_version_or_later(@Unsigned int major, @Unsigned int minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_mfn_list_list() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_unmap_domain_gfn_range(Ptr<VmDefinitions.vm_area_struct> vma, int nr, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_unregister_device_domain_owner(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_vcpu_info_reset(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_vcpu_restore() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_vcpu_setup(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_virtio_restricted_mem_acc(Ptr<VirtioDefinitions.virtio_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_vmalloc_p2m_tree() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_x2apic_available() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_alloc_unpopulated_pages(@Unsigned int nr_pages, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_info> xen_allocate_irq_dynamic() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_allocate_pirq_msi(Ptr<PciDefinitions.pci_dev> dev, Ptr<MsiDefinitions.msi_desc> msidesc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_arch_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_bind_pirq_gsi_to_irq(@Unsigned int gsi, @Unsigned int pirq, int shareable, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_bind_pirq_msi_to_irq($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int xen_bind_pirq_msi_to_irq(Ptr<PciDefinitions.pci_dev> dev, Ptr<MsiDefinitions.msi_desc> msidesc, int pirq, int nvec, String name, @Unsigned @OriginalName(value="domid_t") short domid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_chk_extra_mem(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_chk_is_e820_usable($arg1, $arg2, (const u8*)$arg3)")
    public static void xen_chk_is_e820_usable(@Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long size, String component2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_clear_irq_pending(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_count_remap_pages(@Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long remap_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_cpu_init_eoi(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_dbgp_external_startup(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_dbgp_reset_prep(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_del_extra_mem(@Unsigned long start_pfn, @Unsigned long n_pfns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_destroy_irq(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_enable_syscall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_enable_sysenter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_evtchn_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_evtchn_cpu_prepare(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_evtchn_do_upcall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xen_evtchn_nr_channels() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long xen_find_free_area(@Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_force_evtchn_callback() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_foreach_remap_area((long unsigned int (*)(long unsigned int, long unsigned int, long unsigned int))$arg1)")
    public static @Unsigned long xen_foreach_remap_area(Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_free_irq(Ptr<IrqDefinitions.irq_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_free_unpopulated_pages(@Unsigned int nr_pages, Ptr<Ptr<runtime.page>> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_get_guest_ip() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_get_pages_limit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xen_guest_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_halt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_has_pv_and_legacy_disk_devices() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_has_pv_devices() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_has_pv_disk_devices() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_has_pv_nic_devices() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_post_suspend(int suspend_cancelled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_init_IRQ() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_init_irq_ops() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_inv_extra_mem() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_irq_disable_direct() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_irq_enable_direct() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_irq_from_gsi(@Unsigned int gsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_irq_info_cleanup(Ptr<IrqDefinitions.irq_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_irq_info_common_setup(Ptr<IrqDefinitions.irq_info> info2, xen_irq_type type2, @Unsigned @OriginalName(value="evtchn_port_t") int evtchn, @Unsigned short cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_info> xen_irq_init(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_irq_lateeoi(@Unsigned int irq, @Unsigned int eoi_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_irq_lateeoi_locked(Ptr<IrqDefinitions.irq_info> info2, boolean spurious) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_irq_lateeoi_worker(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_irq_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xen_irq_work_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_is_e820_reserved(@Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String xen_memory_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pcpu_down(@Unsigned @OriginalName(value="uint32_t") int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pcpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xen_pcpu_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pcpu_up(@Unsigned @OriginalName(value="uint32_t") int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pcpu_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_phys_memcpy(@Unsigned @OriginalName(value="phys_addr_t") long dest, @Unsigned @OriginalName(value="phys_addr_t") long src, @Unsigned @OriginalName(value="phys_addr_t") long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pirq_from_irq(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pmu_finish(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pmu_init(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xen_pmu_irq_handler(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_poll_irq(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_poll_irq_timeout(int irq, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_processor_present(@Unsigned @OriginalName(value="uint32_t") int acpi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_cleanup_dead_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_cpu_die(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pv_cpu_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pv_kick_ap(@Unsigned int cpu2, Ptr<TaskDefinitions.task_struct> idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_play_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_poll_sync_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_smp_config() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_smp_prepare_boot_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_smp_prepare_cpus(@Unsigned int max_cpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_stop_other_cpus(int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pvh_gnttab_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pvh_init(Ptr<BootDefinitions.boot_params> boot_params2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pvh_setup_gsi(int gsi, int trigger, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_read_cr2() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_read_cr2_direct() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_read_pmc(int counter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_remap_memory() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_resume_notifier_register(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_resume_notifier_unregister(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_safe_halt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_sanitize_proc_cap_bits(Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_save_fl_direct() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_send_IPI_one(@Unsigned int cpu2, misc.ipi_vector vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_set_default_idle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_identity_and_release_chunk(@Unsigned long start_pfn, @Unsigned long end_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_set_identity_and_remap_chunk(@Unsigned long start_pfn, @Unsigned long end_pfn, @Unsigned long remap_pfn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_set_irq_priority(@Unsigned int irq, @Unsigned int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_set_upcall_vector(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_callback_vector() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_features() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_setup_shutdown_event() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_smp_count_cpus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_smp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_smp_intr_free_pv(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_smp_intr_init_pv(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_suspend(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xen_swiotlb_alloc_coherent(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, @Unsigned @OriginalName(value="gfp_t") int flags, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_swiotlb_dma_supported(Ptr<runtime.device> hwdev, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IoDefinitions.io_tlb_pool> xen_swiotlb_find_pool(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_swiotlb_fixup(Ptr<?> buf, @Unsigned long nslabs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_swiotlb_free_coherent(Ptr<runtime.device> dev, @Unsigned long size, Ptr<?> vaddr, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long xen_swiotlb_map_page(Ptr<runtime.device> dev, Ptr<runtime.page> page2, @Unsigned long offset, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_swiotlb_map_sg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nelems, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_swiotlb_sync_sg_for_cpu(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nelems, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_swiotlb_sync_sg_for_device(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nelems, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_swiotlb_sync_single_for_cpu(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_swiotlb_sync_single_for_device(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_swiotlb_unmap_page(Ptr<runtime.device> hwdev, @Unsigned @OriginalName(value="dma_addr_t") long dev_addr, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_swiotlb_unmap_sg(Ptr<runtime.device> hwdev, Ptr<runtime.scatterlist> sgl, int nelems, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_sync_pcpus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_test_irq_pending(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_test_irq_shared(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_unplug_emulated_devices() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xen_pgd_pin(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xen_pgd_unpin(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__xen_pgd_walk($arg1, $arg2, (void (*)(struct mm_struct*, struct page*, enum pt_level))$arg3, $arg4)")
    public static void __xen_pgd_walk(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd, Ptr<?> func, @Unsigned long limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xen_pv_evtchn_do_upcall(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xen_set_p4d_hyper(Ptr<misc.p4d_t> ptr, misc.p4d_t val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xen_set_pte(Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xen_write_cr3(boolean kernel, @Unsigned long cr3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_pad_idle_cpus(@Unsigned int idle_nums) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_pad_idle_cpus_num() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_pad_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_acpi_processor_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_acpi_processor_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_acpi_processor_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_acpi_processor_resume_worker(Ptr<misc.work_struct> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_after_bootmem() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_alloc_pmd(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_alloc_pmd_init(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_alloc_pte(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_alloc_pte_init(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_alloc_pud(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_arch_post_suspend(int cancelled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_arch_pre_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_arch_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_arch_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_cleanhighmap(@Unsigned long vaddr, @Unsigned long vaddr_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_cleanmfnmap_free_pgtbl(Ptr<?> pgtbl, boolean unpin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_cleanmfnmap_p4d(Ptr<misc.p4d_t> p4d, boolean unpin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_cleanmfnmap_pud(Ptr<PudDefinitions.pud_t> pud, boolean unpin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_copy_psd_data(Ptr<AcpiDefinitions.acpi_processor> _pr, Ptr<xen_processor_performance> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xen_processor_px> xen_copy_pss_data(Ptr<AcpiDefinitions.acpi_processor> _pr, Ptr<xen_processor_performance> dst_perf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_create_contiguous_region(@Unsigned @OriginalName(value="phys_addr_t") long pstart, @Unsigned int order, @Unsigned int address_bits, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> xen_create_pci_msi_domain() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_destroy_contiguous_region(@Unsigned @OriginalName(value="phys_addr_t") long pstart, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_do_pin(@Unsigned int level, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_drop_mm_ref(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long xen_early_virt_to_phys(@Unsigned long vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static EfiDefinitions.efi_secureboot_mode xen_efi_get_secureboot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_efi_init(Ptr<BootDefinitions.boot_params> boot_params2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EfiDefinitions.efi_system_table_t> xen_efi_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_enter_lazy_mmu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_enter_mmap(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_exchange_memory(@Unsigned long extents_in, @Unsigned int order_in, Ptr<@Unsigned Long> pfns_in, @Unsigned long extents_out, @Unsigned int order_out, Ptr<@Unsigned Long> mfns_out, @Unsigned int address_bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_exit_mmap(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_extend_mmu_update((const struct mmu_update*)$arg1)")
    public static void xen_extend_mmu_update(Ptr<MmuDefinitions.mmu_update> update) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_flush_lazy_mmu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_flush_tlb() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_flush_tlb_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_flush_tlb_multi((const struct cpumask*)$arg1, (const struct flush_tlb_info*)$arg2)")
    public static void xen_flush_tlb_multi(Ptr<runtime.cpumask> cpus, Ptr<FlushDefinitions.flush_tlb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_flush_tlb_one_user(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_free_ro_pages(@Unsigned long paddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.pgd_t> xen_get_user_pgd(Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_cleanup_dead_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_exit_mmap(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_init_mmu_ops() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_msi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_hvm_setup_msi_irqs(Ptr<PciDefinitions.pci_dev> dev, int nvec, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_smp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_smp_prepare_boot_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hvm_smp_prepare_cpus(@Unsigned int max_cpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_arch_1() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_arch_2() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_arch_3() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_arch_4() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_arch_5() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_arch_6() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_arch_7() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_callback_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_console_io() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_dm_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_domctl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_event_channel_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_event_channel_op_compat() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_fpu_taskswitch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_get_debugreg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_grant_table_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_hvm_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_iret() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_kexec_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_mca() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_memory_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_mmu_update() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_mmuext_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_multicall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_nmi_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_physdev_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_physdev_op_compat() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_platform_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_sched_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_sched_op_compat() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_set_callbacks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_set_debugreg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_set_gdt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_set_segment_base() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_set_timer_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_set_trap_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_stack_switch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_sysctl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_tmem_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_update_descriptor() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_update_va_mapping() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_update_va_mapping_otherdomain() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_vcpu_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_vm_assist() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_xc_reserved_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_xen_version() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_xenoprof_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_xenpmu_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_hypercall_xsm_op() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_init_mmu_ops() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_init_vga((const struct dom0_vga_console_info*)$arg1, $arg2, $arg3)")
    public static void xen_init_vga(Ptr<misc.dom0_vga_console_info> info2, @Unsigned long size, Ptr<misc.screen_info> screen_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_initdom_restore_msi(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_initdom_setup_msi_irqs(Ptr<PciDefinitions.pci_dev> dev, int nvec, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_leave_lazy_mmu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.p4d_t xen_make_p4d(@Unsigned @OriginalName(value="p4dval_t") long p4d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.pgd_t xen_make_pgd(@Unsigned @OriginalName(value="pgdval_t") long pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PmdDefinitions.pmd_t xen_make_pmd(@Unsigned @OriginalName(value="pmdval_t") long pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PteDefinitions.pte_t xen_make_pte(@Unsigned @OriginalName(value="pteval_t") long pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PteDefinitions.pte_t xen_make_pte_init(@Unsigned @OriginalName(value="pteval_t") long pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PudDefinitions.pud_t xen_make_pud(@Unsigned @OriginalName(value="pudval_t") long pud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_mark_pinned(Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.page> page2, PtDefinitions.pt_level level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_mm_pin_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_mm_unpin_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_msi_domain_alloc_irqs(Ptr<IrqDefinitions.irq_domain> domain, Ptr<runtime.device> dev, int nvec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_msi_domain_free_irqs(Ptr<IrqDefinitions.irq_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="p4dval_t") long xen_p4d_val(misc.p4d_t p4d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_p4d_walk($arg1, $arg2, (void (*)(struct mm_struct*, struct page*, enum pt_level))$arg3, $arg4, $arg5)")
    public static void xen_p4d_walk(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.p4d_t> p4d, Ptr<?> func, boolean last, @Unsigned long limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_page_pinned(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pagetable_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pcifront_enable_irq(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_pgd_alloc(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pgd_free(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pgdval_t") long xen_pgd_val(misc.pgd_t pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pin_page(Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.page> page2, PtDefinitions.pt_level level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pmdval_t") long xen_pmd_val(PmdDefinitions.pmd_t pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_prepare_pvh() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pt_check_e820() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pte_unlock(Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pteval_t") long xen_pte_val(PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_ptep_modify_prot_commit(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PteDefinitions.pte_t xen_ptep_modify_prot_start(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PteDefinitions.pte_t> ptep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pudval_t") long xen_pud_val(PudDefinitions.pud_t pud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xen_pud_walk($arg1, $arg2, (void (*)(struct mm_struct*, struct page*, enum pt_level))$arg3, $arg4, $arg5)")
    public static void xen_pud_walk(Ptr<MmDefinitions.mm_struct> mm, Ptr<PudDefinitions.pud_t> pud, Ptr<?> func, boolean last, @Unsigned long limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_evtchn_do_upcall(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_post_suspend(int suspend_cancelled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_pre_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_pv_teardown_msi_irqs(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_read_cr3() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xen_read_phys_ulong(@Unsigned @OriginalName(value="phys_addr_t") long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_register_pirq(@Unsigned int gsi, int triggering, boolean set_pirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_release_pmd(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_release_pmd_init(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_release_pte(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_release_pte_init(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_release_ptpage(@Unsigned long pfn, @Unsigned int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_release_pud(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_relocate_p2m() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_remap_exchanged_ptes(@Unsigned long vaddr, int order, Ptr<@Unsigned Long> mfns, @Unsigned long first_mfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_remap_pfn(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> pfn, int nr, Ptr<Integer> err_ptr,  @OriginalName(value="pgprot_t") runtime.pgprot prot, @Unsigned int domid, boolean no_translate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_reserve_special_pages() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_set_callback_via(@Unsigned @OriginalName(value="uint64_t") long via) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_fixmap(@Unsigned int idx, @Unsigned @OriginalName(value="phys_addr_t") long phys,  @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_p4d(Ptr<misc.p4d_t> ptr, misc.p4d_t val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_p4d_hyper(Ptr<misc.p4d_t> ptr, misc.p4d_t val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_pmd(Ptr<PmdDefinitions.pmd_t> ptr, PmdDefinitions.pmd_t val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_pmd_hyper(Ptr<PmdDefinitions.pmd_t> ptr, PmdDefinitions.pmd_t val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_pte(Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pteval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_pte_init(Ptr<PteDefinitions.pte_t> ptep, PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_pud(Ptr<PudDefinitions.pud_t> ptr, PudDefinitions.pud_t val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_set_pud_hyper(Ptr<PudDefinitions.pud_t> ptr, PudDefinitions.pud_t val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_kernel_pagetable(Ptr<misc.pgd_t> pgd, @Unsigned long max_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_machphys_mapping() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_setup_msi_irqs(Ptr<PciDefinitions.pci_dev> dev, int nvec, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_setup_pci_msi() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_teardown_msi_irqs(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_unpin_page(Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.page> page2, PtDefinitions.pt_level level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xen_upload_processor_pm_data() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_vcpu_notify_restore(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_vcpu_notify_suspend(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xen_vmcore_pfn_is_ram(Ptr<misc.vmcore_cb> cb, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_write_cr2(@Unsigned long cr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_write_cr3(@Unsigned long cr3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_write_cr3_init(@Unsigned long cr3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xen_zap_pfn_range(@Unsigned long vaddr, @Unsigned int order, Ptr<@Unsigned Long> in_frames, Ptr<@Unsigned Long> out_frames) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum xen_irq_type")
    public static enum xen_irq_type implements Enum<xen_irq_type>,
    TypedEnum<xen_irq_type, Integer>
    {
        IRQT_UNBOUND,
        IRQT_PIRQ,
        IRQT_VIRQ,
        IRQT_IPI,
        IRQT_EVTCHN;

    }

    @Type(noCCodeGeneration=true, cType="struct xen_hvm_evtchn_upcall_vector")
    @NotUsableInJava
    public static class xen_hvm_evtchn_upcall_vector
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int vcpu;
        public @OriginalName(value="uint8_t") char vector;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_pmu_data")
    @NotUsableInJava
    public static class xen_pmu_data
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int vcpu_id;
        public @Unsigned @OriginalName(value="uint32_t") int pcpu_id;
        public @Unsigned @OriginalName(value="domid_t") short domain_id;
        public @OriginalName(value="uint8_t") char @Size(value=6) [] pad;
        public xen_pmu_arch pmu;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_pmu_arch")
    @NotUsableInJava
    public static class xen_pmu_arch
    extends Struct {
        public misc.r_of_xen_pmu_arch r;
        public @Unsigned @OriginalName(value="uint64_t") long pmu_flags;
        public misc.l_of_xen_pmu_arch l;
        public misc.c_of_xen_pmu_arch c;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_pmu_regs")
    @NotUsableInJava
    public static class xen_pmu_regs
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long ip;
        public @Unsigned @OriginalName(value="uint64_t") long sp;
        public @Unsigned @OriginalName(value="uint64_t") long flags;
        public @Unsigned @OriginalName(value="uint16_t") short cs;
        public @Unsigned @OriginalName(value="uint16_t") short ss;
        public @OriginalName(value="uint8_t") char cpl;
        public @OriginalName(value="uint8_t") char @Size(value=3) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_pmu_intel_ctxt")
    @NotUsableInJava
    public static class xen_pmu_intel_ctxt
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int fixed_counters;
        public @Unsigned @OriginalName(value="uint32_t") int arch_counters;
        public @Unsigned @OriginalName(value="uint64_t") long global_ctrl;
        public @Unsigned @OriginalName(value="uint64_t") long global_ovf_ctrl;
        public @Unsigned @OriginalName(value="uint64_t") long global_status;
        public @Unsigned @OriginalName(value="uint64_t") long fixed_ctrl;
        public @Unsigned @OriginalName(value="uint64_t") long ds_area;
        public @Unsigned @OriginalName(value="uint64_t") long pebs_enable;
        public @Unsigned @OriginalName(value="uint64_t") long debugctl;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=0) [] regs;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_pmu_cntr_pair")
    @NotUsableInJava
    public static class xen_pmu_cntr_pair
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long counter;
        public @Unsigned @OriginalName(value="uint64_t") long control;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_pmu_amd_ctxt")
    @NotUsableInJava
    public static class xen_pmu_amd_ctxt
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int counters;
        public @Unsigned @OriginalName(value="uint32_t") int ctrls;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=0) [] regs;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_memory_map")
    @NotUsableInJava
    public static class xen_memory_map
    extends Struct {
        public @Unsigned int nr_entries;
        public @OriginalName(value="__guest_handle_void") Ptr<?> buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_grant_dma_data")
    @NotUsableInJava
    public static class xen_grant_dma_data
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short backend_domid;
        public boolean broken;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_mce_log")
    @NotUsableInJava
    public static class xen_mce_log
    extends Struct {
        public char @Size(value=12) [] signature;
        public @Unsigned int len;
        public @Unsigned int next;
        public @Unsigned int flags;
        public @Unsigned int recordlen;
        public xen_mce @Size(value=32) [] entry;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_mce")
    @NotUsableInJava
    public static class xen_mce
    extends Struct {
        public @Unsigned long status;
        public @Unsigned long misc;
        public @Unsigned long addr;
        public @Unsigned long mcgstatus;
        public @Unsigned long ip;
        public @Unsigned long tsc;
        public @Unsigned long time;
        public char cpuvendor;
        public char inject_flags;
        public @Unsigned short pad;
        public @Unsigned int cpuid;
        public char cs;
        public char bank;
        public char cpu;
        public char finished;
        public @Unsigned int extcpu;
        public @Unsigned int socketid;
        public @Unsigned int apicid;
        public @Unsigned long mcgcap;
        public @Unsigned long synd;
        public @Unsigned long ipid;
        public @Unsigned long ppin;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_mc")
    @NotUsableInJava
    public static class xen_mc
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int cmd;
        public @Unsigned @OriginalName(value="uint32_t") int interface_version;
        public UDefinitions.u_of_xen_mc u;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_mc_mceinject")
    @NotUsableInJava
    public static class xen_mc_mceinject
    extends Struct {
        public @Unsigned int mceinj_cpunr;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_mc_msrinject")
    @NotUsableInJava
    public static class xen_mc_msrinject
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int mcinj_cpunr;
        public @Unsigned @OriginalName(value="uint32_t") int mcinj_flags;
        public @Unsigned @OriginalName(value="uint32_t") int mcinj_count;
        public @Unsigned @OriginalName(value="uint32_t") int _pad0;
        public misc.mcinfo_msr @Size(value=8) [] mcinj_msr;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_mc_physcpuinfo")
    @NotUsableInJava
    public static class xen_mc_physcpuinfo
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int ncpus;
        public @Unsigned @OriginalName(value="uint32_t") int _pad0;
        public @OriginalName(value="__guest_handle_mcinfo_logical_cpu") Ptr<misc.mcinfo_logical_cpu> info;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_mc_notifydomain")
    @NotUsableInJava
    public static class xen_mc_notifydomain
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short mc_domid;
        public @Unsigned @OriginalName(value="uint16_t") short mc_vcpuid;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_mc_fetch")
    @NotUsableInJava
    public static class xen_mc_fetch
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int _pad0;
        public @Unsigned @OriginalName(value="uint64_t") long fetch_id;
        public @OriginalName(value="__guest_handle_mc_info") Ptr<McDefinitions.mc_info> data;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_device_domain_owner")
    @NotUsableInJava
    public static class xen_device_domain_owner
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domain;
        public Ptr<PciDefinitions.pci_dev> dev;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="enum xen_mc_extend_args")
    public static enum xen_mc_extend_args implements Enum<xen_mc_extend_args>,
    TypedEnum<xen_mc_extend_args, Integer>
    {
        XEN_MC_XE_OK,
        XEN_MC_XE_BAD_OP,
        XEN_MC_XE_NO_SPACE;

    }

    @Type(noCCodeGeneration=true, cType="enum xen_mc_flush_reason")
    public static enum xen_mc_flush_reason implements Enum<xen_mc_flush_reason>,
    TypedEnum<xen_mc_flush_reason, Integer>
    {
        XEN_MC_FL_NONE,
        XEN_MC_FL_BATCH,
        XEN_MC_FL_ARGS,
        XEN_MC_FL_CALLBACK;

    }

    @Type(noCCodeGeneration=true, cType="struct xen_memory_region")
    @NotUsableInJava
    public static class xen_memory_region
    extends Struct {
        public @Unsigned long start_pfn;
        public @Unsigned long n_pfns;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_extraversion")
    @NotUsableInJava
    public static class xen_extraversion
    extends Struct {
        public char @Size(value=16) [] extraversion;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_remove_from_physmap")
    @NotUsableInJava
    public static class xen_remove_from_physmap
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public @Unsigned @OriginalName(value="xen_pfn_t") long gpfn;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_add_to_physmap_range")
    @NotUsableInJava
    public static class xen_add_to_physmap_range
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public @Unsigned @OriginalName(value="uint16_t") short space;
        public @Unsigned @OriginalName(value="uint16_t") short size;
        public @Unsigned @OriginalName(value="domid_t") short foreign_domid;
        public @OriginalName(value="__guest_handle_xen_ulong_t") Ptr<@Unsigned @OriginalName(value="xen_ulong_t") Long> idxs;
        public @OriginalName(value="__guest_handle_xen_pfn_t") Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> gpfns;
        public @OriginalName(value="__guest_handle_int") Ptr<Integer> errs;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_add_to_physmap")
    @NotUsableInJava
    public static class xen_add_to_physmap
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public @Unsigned @OriginalName(value="uint16_t") short size;
        public @Unsigned int space;
        public @Unsigned @OriginalName(value="xen_ulong_t") long idx;
        public @Unsigned @OriginalName(value="xen_pfn_t") long gpfn;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_page_foreign")
    @NotUsableInJava
    public static class xen_page_foreign
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public @Unsigned @OriginalName(value="grant_ref_t") int gref;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_common_irq")
    @NotUsableInJava
    public static class xen_common_irq
    extends Struct {
        public int irq;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_clock_event_device")
    @NotUsableInJava
    public static class xen_clock_event_device
    extends Struct {
        public misc.clock_event_device evt;
        public char @Size(value=16) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_msi_ops")
    @NotUsableInJava
    public static class xen_msi_ops
    extends Struct {
        public Ptr<?> setup_msi_irqs;
        public Ptr<?> teardown_msi_irqs;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_pci_frontend_ops")
    @NotUsableInJava
    public static class xen_pci_frontend_ops
    extends Struct {
        public Ptr<?> enable_msi;
        public Ptr<?> disable_msi;
        public Ptr<?> enable_msix;
        public Ptr<?> disable_msix;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_netif_rx_front_ring")
    @NotUsableInJava
    public static class xen_netif_rx_front_ring
    extends Struct {
        public @Unsigned @OriginalName(value="RING_IDX") int req_prod_pvt;
        public @Unsigned @OriginalName(value="RING_IDX") int rsp_cons;
        public @Unsigned int nr_ents;
        public Ptr<xen_netif_rx_sring> sring;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_netif_rx_sring")
    @NotUsableInJava
    public static class xen_netif_rx_sring
    extends Struct {
        public @Unsigned @OriginalName(value="RING_IDX") int req_prod;
        public @Unsigned @OriginalName(value="RING_IDX") int req_event;
        public @Unsigned @OriginalName(value="RING_IDX") int rsp_prod;
        public @Unsigned @OriginalName(value="RING_IDX") int rsp_event;
        public @OriginalName(value="uint8_t") char @Size(value=48) [] __pad;
        public xen_netif_rx_sring_entry @Size(value=0) [] ring;
    }

    @Type(noCCodeGeneration=true, cType="union xen_netif_rx_sring_entry")
    @NotUsableInJava
    public static class xen_netif_rx_sring_entry
    extends Union {
        public xen_netif_rx_request req;
        public xen_netif_rx_response rsp;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_netif_tx_front_ring")
    @NotUsableInJava
    public static class xen_netif_tx_front_ring
    extends Struct {
        public @Unsigned @OriginalName(value="RING_IDX") int req_prod_pvt;
        public @Unsigned @OriginalName(value="RING_IDX") int rsp_cons;
        public @Unsigned int nr_ents;
        public Ptr<xen_netif_tx_sring> sring;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_netif_tx_sring")
    @NotUsableInJava
    public static class xen_netif_tx_sring
    extends Struct {
        public @Unsigned @OriginalName(value="RING_IDX") int req_prod;
        public @Unsigned @OriginalName(value="RING_IDX") int req_event;
        public @Unsigned @OriginalName(value="RING_IDX") int rsp_prod;
        public @Unsigned @OriginalName(value="RING_IDX") int rsp_event;
        public @OriginalName(value="uint8_t") char @Size(value=48) [] __pad;
        public xen_netif_tx_sring_entry @Size(value=0) [] ring;
    }

    @Type(noCCodeGeneration=true, cType="union xen_netif_tx_sring_entry")
    @NotUsableInJava
    public static class xen_netif_tx_sring_entry
    extends Union {
        public xen_netif_tx_request req;
        public xen_netif_tx_response rsp;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_netif_rx_response")
    @NotUsableInJava
    public static class xen_netif_rx_response
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short id;
        public @Unsigned @OriginalName(value="uint16_t") short offset;
        public @Unsigned @OriginalName(value="uint16_t") short flags;
        public @OriginalName(value="int16_t") short status;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_netif_rx_request")
    @NotUsableInJava
    public static class xen_netif_rx_request
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short id;
        public @Unsigned @OriginalName(value="uint16_t") short pad;
        public @Unsigned @OriginalName(value="grant_ref_t") int gref;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_netif_tx_response")
    @NotUsableInJava
    public static class xen_netif_tx_response
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short id;
        public @OriginalName(value="int16_t") short status;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_netif_extra_info")
    @NotUsableInJava
    public static class xen_netif_extra_info
    extends Struct {
        public @OriginalName(value="uint8_t") char type;
        public @OriginalName(value="uint8_t") char flags;
        public UDefinitions.u_of_xen_netif_extra_info u;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_netif_tx_request")
    @NotUsableInJava
    public static class xen_netif_tx_request
    extends Struct {
        public @Unsigned @OriginalName(value="grant_ref_t") int gref;
        public @Unsigned @OriginalName(value="uint16_t") short offset;
        public @Unsigned @OriginalName(value="uint16_t") short flags;
        public @Unsigned @OriginalName(value="uint16_t") short id;
        public @Unsigned @OriginalName(value="uint16_t") short size;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_pmu_params")
    @NotUsableInJava
    public static class xen_pmu_params
    extends Struct {
        public misc.version_of_xen_pmu_params version;
        public @Unsigned @OriginalName(value="uint64_t") long val;
        public @Unsigned @OriginalName(value="uint32_t") int vcpu;
        public @Unsigned @OriginalName(value="uint32_t") int pad;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_build_id")
    @NotUsableInJava
    public static class xen_build_id
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int len;
        public char @Size(value=0) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_feature_info")
    @NotUsableInJava
    public static class xen_feature_info
    extends Struct {
        public @Unsigned int submap_idx;
        public @Unsigned @OriginalName(value="uint32_t") int submap;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_platform_parameters")
    @NotUsableInJava
    public static class xen_platform_parameters
    extends Struct {
        public @Unsigned @OriginalName(value="xen_ulong_t") long virt_start;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_compile_info")
    @NotUsableInJava
    public static class xen_compile_info
    extends Struct {
        public char @Size(value=64) [] compiler;
        public char @Size(value=16) [] compile_by;
        public char @Size(value=32) [] compile_domain;
        public char @Size(value=32) [] compile_date;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_bus_type")
    @NotUsableInJava
    public static class xen_bus_type
    extends Struct {
        public String root;
        public @Unsigned int levels;
        public Ptr<?> get_bus_id;
        public Ptr<?> probe;
        public Ptr<?> otherend_will_handle;
        public Ptr<?> otherend_changed;
        public BusDefinitions.bus_type bus;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_hvm_param")
    @NotUsableInJava
    public static class xen_hvm_param
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public @Unsigned @OriginalName(value="uint32_t") int index;
        public @Unsigned @OriginalName(value="uint64_t") long value;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_platform_op")
    @NotUsableInJava
    public static class xen_platform_op
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int cmd;
        public @Unsigned @OriginalName(value="uint32_t") int interface_version;
        public UDefinitions.u_of_xen_platform_op u;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_processor_performance")
    @NotUsableInJava
    public static class xen_processor_performance
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint32_t") int platform_limit;
        public xen_pct_register control_register;
        public xen_pct_register status_register;
        public @Unsigned @OriginalName(value="uint32_t") int state_count;
        public @OriginalName(value="__guest_handle_xen_processor_px") Ptr<xen_processor_px> states;
        public xen_psd_package domain_info;
        public @Unsigned @OriginalName(value="uint32_t") int shared_type;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_psd_package")
    @NotUsableInJava
    public static class xen_psd_package
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long num_entries;
        public @Unsigned @OriginalName(value="uint64_t") long revision;
        public @Unsigned @OriginalName(value="uint64_t") long domain;
        public @Unsigned @OriginalName(value="uint64_t") long coord_type;
        public @Unsigned @OriginalName(value="uint64_t") long num_processors;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_processor_px")
    @NotUsableInJava
    public static class xen_processor_px
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long core_frequency;
        public @Unsigned @OriginalName(value="uint64_t") long power;
        public @Unsigned @OriginalName(value="uint64_t") long transition_latency;
        public @Unsigned @OriginalName(value="uint64_t") long bus_master_latency;
        public @Unsigned @OriginalName(value="uint64_t") long control;
        public @Unsigned @OriginalName(value="uint64_t") long status;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_pct_register")
    @NotUsableInJava
    public static class xen_pct_register
    extends Struct {
        public @OriginalName(value="uint8_t") char descriptor;
        public @Unsigned @OriginalName(value="uint16_t") short length;
        public @OriginalName(value="uint8_t") char space_id;
        public @OriginalName(value="uint8_t") char bit_width;
        public @OriginalName(value="uint8_t") char bit_offset;
        public @OriginalName(value="uint8_t") char reserved;
        public @Unsigned @OriginalName(value="uint64_t") long address;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_processor_power")
    @NotUsableInJava
    public static class xen_processor_power
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int count;
        public xen_processor_flags flags;
        public @OriginalName(value="__guest_handle_xen_processor_cx") Ptr<xen_processor_cx> states;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_processor_flags")
    @NotUsableInJava
    public static class xen_processor_flags
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int bm_control;
        public @Unsigned @OriginalName(value="uint32_t") int bm_check;
        public @Unsigned @OriginalName(value="uint32_t") int has_cst;
        public @Unsigned @OriginalName(value="uint32_t") int power_setup_done;
        public @Unsigned @OriginalName(value="uint32_t") int bm_rld_set;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_processor_cx")
    @NotUsableInJava
    public static class xen_processor_cx
    extends Struct {
        public xen_power_register reg;
        public @OriginalName(value="uint8_t") char type;
        public @Unsigned @OriginalName(value="uint32_t") int latency;
        public @Unsigned @OriginalName(value="uint32_t") int power;
        public @Unsigned @OriginalName(value="uint32_t") int dpcnt;
        public @OriginalName(value="__guest_handle_xen_processor_csd") Ptr<xen_processor_csd> dp;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_processor_csd")
    @NotUsableInJava
    public static class xen_processor_csd
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int domain;
        public @Unsigned @OriginalName(value="uint32_t") int coord_type;
        public @Unsigned @OriginalName(value="uint32_t") int num;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_power_register")
    @NotUsableInJava
    public static class xen_power_register
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int space_id;
        public @Unsigned @OriginalName(value="uint32_t") int bit_width;
        public @Unsigned @OriginalName(value="uint32_t") int bit_offset;
        public @Unsigned @OriginalName(value="uint32_t") int access_size;
        public @Unsigned @OriginalName(value="uint64_t") long address;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_machphys_mapping")
    @NotUsableInJava
    public static class xen_machphys_mapping
    extends Struct {
        public @Unsigned @OriginalName(value="xen_ulong_t") long v_start;
        public @Unsigned @OriginalName(value="xen_ulong_t") long v_end;
        public @Unsigned @OriginalName(value="xen_ulong_t") long max_mfn;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_memory_exchange")
    @NotUsableInJava
    public static class xen_memory_exchange
    extends Struct {
        public xen_memory_reservation in;
        public xen_memory_reservation out;
        public @Unsigned @OriginalName(value="xen_ulong_t") long nr_exchanged;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_memory_reservation")
    @NotUsableInJava
    public static class xen_memory_reservation
    extends Struct {
        public @OriginalName(value="__guest_handle_xen_pfn_t") Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> extent_start;
        public @Unsigned @OriginalName(value="xen_ulong_t") long nr_extents;
        public @Unsigned int extent_order;
        public @Unsigned int address_bits;
        public @Unsigned @OriginalName(value="domid_t") short domid;
    }

    @Type(noCCodeGeneration=true, cType="enum xen_lazy_mode")
    public static enum xen_lazy_mode implements Enum<xen_lazy_mode>,
    TypedEnum<xen_lazy_mode, Integer>
    {
        XEN_LAZY_NONE,
        XEN_LAZY_MMU,
        XEN_LAZY_CPU;

    }

    @Type(noCCodeGeneration=true, cType="struct xen_hvm_get_mem_type")
    @NotUsableInJava
    public static class xen_hvm_get_mem_type
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public @Unsigned @OriginalName(value="uint16_t") short mem_type;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=2) [] pad;
        public @Unsigned @OriginalName(value="uint64_t") long pfn;
    }

    @Type(noCCodeGeneration=true, cType="struct xen_hvm_pagetable_dying")
    @NotUsableInJava
    public static class xen_hvm_pagetable_dying
    extends Struct {
        public @Unsigned @OriginalName(value="domid_t") short domid;
        public @Unsigned long gpa;
    }

    @Type(noCCodeGeneration=true, cType="enum xen_domain_type")
    public static enum xen_domain_type implements Enum<xen_domain_type>,
    TypedEnum<xen_domain_type, Integer>
    {
        XEN_NATIVE,
        XEN_PV_DOMAIN,
        XEN_HVM_DOMAIN;

    }
}

