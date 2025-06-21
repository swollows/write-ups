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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.IoapicDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KmsgDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class HvDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_ce_set_next_event(@Unsigned long delta, Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_ce_set_oneshot(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_ce_shutdown(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_cs_enable(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ms_hyperv_tsc_page> hv_get_tsc_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hv_get_tsc_pfn() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_init_clocksource() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_init_spinlocks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_parse_nopvspin(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_qlock_kick(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_qlock_wait(Ptr<Character> _byte, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_remap_tsc_clocksource() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_remove_stimer0_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hv_setup_stimer0_handler((void (*)())$arg1)")
    public static void hv_setup_stimer0_handler(Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_stimer0_isr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="irqreturn_t") runtime.irqreturn hv_stimer0_percpu_isr(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_stimer_alloc(boolean have_percpu_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_stimer_cleanup(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_stimer_global_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_stimer_init(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_stimer_legacy_cleanup(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_stimer_legacy_init(@Unsigned int cpu2, int sint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_vcpu_is_preempted(int vcpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _hv_do_fast_hypercall16(@Unsigned long control, @Unsigned long input1, @Unsigned long input2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_apic_eoi_write() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hv_apic_icr_read() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_apic_icr_write(@Unsigned int low, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_apic_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int hv_apic_read(@Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_apic_write(@Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_cpu_die(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_cpu_init(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_is_hyperv_initialized() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_pci_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_reenlightenment_notify(Ptr<misc.work_struct> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_send_ipi_all(int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_send_ipi_allbutself(int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hv_send_ipi_mask((const struct cpumask*)$arg1, $arg2)")
    public static void hv_send_ipi_mask(Ptr<runtime.cpumask> mask, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hv_send_ipi_mask_allbutself((const struct cpumask*)$arg1, $arg2)")
    public static void hv_send_ipi_mask_allbutself(Ptr<runtime.cpumask> mask, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_send_ipi_self(int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_stimer_setup_percpu_clockev() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __hv_read_ref_counter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> hv_alloc_hyperv_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> hv_alloc_hyperv_zeroed_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_common_cpu_die(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_common_cpu_init(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_common_free() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_common_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_die_panic_notify_crash(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_free_hyperv_page(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_get_hypervisor_version(Ptr<hv_hypervisor_version_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static hv_isolation_type hv_get_isolation_type() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hv_get_msr(@Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char hv_get_nmi_reason() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hv_get_non_nested_msr(@Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hv_get_tsc_khz() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result hv_ghcb_hv_call(Ptr<runtime.ghcb> ghcb2, @Unsigned long exit_code, @Unsigned long exit_info_1, @Unsigned long exit_info_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hv_ghcb_hypercall(@Unsigned long control, Ptr<?> input, Ptr<?> output, @Unsigned int input_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_ghcb_msr_read(@Unsigned long msr2, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_ghcb_msr_write(@Unsigned long msr2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_ghcb_negotiate_protocol() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_ghcb_terminate(@Unsigned int set, @Unsigned int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_is_hibernation_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_is_isolation_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_is_private_mmio(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_isolation_type_snp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_isolation_type_tdx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_ivm_msr_read(@Unsigned long msr2, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_ivm_msr_write(@Unsigned long msr2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_kmsg_dump(Ptr<KmsgDefinitions.kmsg_dumper> dumper, Ptr<KmsgDefinitions.kmsg_dump_detail> detail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_machine_crash_shutdown(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_machine_shutdown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hv_mark_gpa_visibility($arg1, (const long long unsigned int*)$arg2, $arg3)")
    public static int hv_mark_gpa_visibility(@Unsigned short count, Ptr<@Unsigned Long> pfn, hv_mem_host_visibility visibility) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_nmi_unknown(@Unsigned int val, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_query_ext_cap(@Unsigned long cap_query) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_remove_crash_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_remove_kexec_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_remove_vmbus_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_set_msr(@Unsigned int reg, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_set_non_nested_msr(@Unsigned int reg, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hv_setup_crash_handler((void (*)(struct pt_regs*))$arg1)")
    public static void hv_setup_crash_handler(Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_setup_dma_ops(Ptr<runtime.device> dev, boolean coherent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hv_setup_kexec_handler((void (*)())$arg1)")
    public static void hv_setup_kexec_handler(Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hv_setup_vmbus_handler((void (*)())$arg1)")
    public static void hv_setup_vmbus_handler(Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_sev_es_hcall_finish(Ptr<runtime.ghcb> ghcb2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_sev_es_hcall_prepare(Ptr<runtime.ghcb> ghcb2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_smp_prepare_boot_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_smp_prepare_cpus(@Unsigned int max_cpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_snp_boot_ap(@Unsigned int cpu2, @Unsigned long start_ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hv_tdx_hypercall(@Unsigned long control, @Unsigned long param1, @Unsigned long param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_tdx_msr_read(@Unsigned long msr2, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_tdx_msr_write(@Unsigned long msr2, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_vtom_cache_flush_required() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_vtom_clear_present(@Unsigned long kbuffer, int pagecount, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_vtom_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_vtom_set_host_visibility(@Unsigned long kbuffer, int pagecount, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hv_vtom_tlb_flush_required(boolean _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static hv_device_id hv_build_pci_dev_id(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_call_add_logical_proc(int node2, @Unsigned int lp_index, @Unsigned int apic_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_call_create_vp(int node2, @Unsigned long partition_id, @Unsigned int vp_index, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_call_deposit_pages(int node2, @Unsigned long partition_id, @Unsigned int num_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> hv_create_pci_msi_domain() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_irq_compose_msi_msg(Ptr<IrqDefinitions.irq_data> data, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_map_interrupt(hv_device_id device_id, boolean level, int cpu2, int vector, Ptr<hv_interrupt_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_map_ioapic_interrupt(int ioapic_id, boolean level, int cpu2, int vector, Ptr<hv_interrupt_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hv_msi_free_irq(Ptr<IrqDefinitions.irq_domain> domain, Ptr<MsiDefinitions.msi_domain_info> info2, @Unsigned int virq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_unmap_interrupt(@Unsigned long id, Ptr<hv_interrupt_entry> old_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hv_unmap_ioapic_interrupt(int ioapic_id, Ptr<hv_interrupt_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union hv_hypervisor_version_info")
    @NotUsableInJava
    public static class hv_hypervisor_version_info
    extends Union {
        public AnonDefinitions.anon_member_of_hv_hypervisor_version_info anon0;
        public AnonDefinitions.anon_member_of_hv_hypervisor_version_info anon1;
    }

    @Type(noCCodeGeneration=true, cType="union hv_ghcb")
    @NotUsableInJava
    public static class hv_ghcb
    extends Union {
        public runtime.ghcb ghcb;
        public misc.hypercall_of_hv_ghcb hypercall;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_enable_vp_vtl")
    @NotUsableInJava
    public static class hv_enable_vp_vtl
    extends Struct {
        public @Unsigned long partition_id;
        public @Unsigned int vp_index;
        public hv_input_vtl target_vtl;
        public char mbz0;
        public @Unsigned short mbz1;
        public hv_init_vp_context vp_context;
    }

    @Type(noCCodeGeneration=true, cType="union hv_input_vtl")
    @NotUsableInJava
    public static class hv_input_vtl
    extends Union {
        public char as_uint8;
        public AnonDefinitions.anon_member_of_hv_input_vtl anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_init_vp_context")
    @NotUsableInJava
    public static class hv_init_vp_context
    extends Struct {
        public @Unsigned long rip;
        public @Unsigned long rsp;
        public @Unsigned long rflags;
        public hv_x64_segment_register cs;
        public hv_x64_segment_register ds;
        public hv_x64_segment_register es;
        public hv_x64_segment_register fs;
        public hv_x64_segment_register gs;
        public hv_x64_segment_register ss;
        public hv_x64_segment_register tr;
        public hv_x64_segment_register ldtr;
        public hv_x64_table_register idtr;
        public hv_x64_table_register gdtr;
        public @Unsigned long efer;
        public @Unsigned long cr0;
        public @Unsigned long cr3;
        public @Unsigned long cr4;
        public @Unsigned long msr_cr_pat;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_x64_table_register")
    @NotUsableInJava
    public static class hv_x64_table_register
    extends Struct {
        public @Unsigned short @Size(value=3) [] pad;
        public @Unsigned short limit;
        public @Unsigned long base;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_x64_segment_register")
    @NotUsableInJava
    public static class hv_x64_segment_register
    extends Struct {
        public @Unsigned long base;
        public @Unsigned int limit;
        public @Unsigned short selector;
        @InlineUnion(value=89585)
        public  @InlineUnion(value=89585) AnonDefinitions.anon_member_of_anon_member_of_hv_x64_segment_register anon3$0;
        @InlineUnion(value=89585)
        public @InlineUnion(value=89585) @Unsigned short attributes;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_gpa_range_for_visibility")
    @NotUsableInJava
    public static class hv_gpa_range_for_visibility
    extends Struct {
        public @Unsigned long partition_id;
        public @Unsigned int host_visibility;
        public @Unsigned int reserved0;
        public @Unsigned int reserved1;
        public @Unsigned long @Size(value=510) [] gpa_page_list;
    }

    @Type(noCCodeGeneration=true, cType="enum hv_mem_host_visibility")
    public static enum hv_mem_host_visibility implements Enum<hv_mem_host_visibility>,
    TypedEnum<hv_mem_host_visibility, Integer>
    {
        VMBUS_PAGE_NOT_VISIBLE,
        VMBUS_PAGE_VISIBLE_READ_ONLY,
        VMBUS_PAGE_VISIBLE_READ_WRITE;

    }

    @Type(noCCodeGeneration=true, cType="enum hv_isolation_type")
    public static enum hv_isolation_type implements Enum<hv_isolation_type>,
    TypedEnum<hv_isolation_type, Integer>
    {
        HV_ISOLATION_TYPE_NONE,
        HV_ISOLATION_TYPE_VBS,
        HV_ISOLATION_TYPE_SNP,
        HV_ISOLATION_TYPE_TDX;

    }

    @Type(noCCodeGeneration=true, cType="struct hv_guest_mapping_flush_list")
    @NotUsableInJava
    public static class hv_guest_mapping_flush_list
    extends Struct {
        public @Unsigned long address_space;
        public @Unsigned long flags;
        public hv_gpa_page_range @Size(value=510) [] gpa_list;
    }

    @Type(noCCodeGeneration=true, cType="union hv_gpa_page_range")
    @NotUsableInJava
    public static class hv_gpa_page_range
    extends Union {
        public @Unsigned long address_space;
        public PageDefinitions.page_of_hv_gpa_page_range page;
        public AnonDefinitions.anon_member_of_hv_gpa_page_range anon2;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_guest_mapping_flush")
    @NotUsableInJava
    public static class hv_guest_mapping_flush
    extends Struct {
        public @Unsigned long address_space;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_send_ipi_ex")
    @NotUsableInJava
    public static class hv_send_ipi_ex
    extends Struct {
        public @Unsigned int vector;
        public @Unsigned int reserved;
        public hv_vpset vp_set;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_send_ipi")
    @NotUsableInJava
    public static class hv_send_ipi
    extends Struct {
        public @Unsigned int vector;
        public @Unsigned int reserved;
        public @Unsigned long cpu_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_get_partition_id")
    @NotUsableInJava
    public static class hv_get_partition_id
    extends Struct {
        public @Unsigned long partition_id;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_tsc_emulation_status")
    @NotUsableInJava
    public static class hv_tsc_emulation_status
    extends Struct {
        public @Unsigned long inprogress;
        public @Unsigned long reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_tsc_emulation_control")
    @NotUsableInJava
    public static class hv_tsc_emulation_control
    extends Struct {
        public @Unsigned long enabled;
        public @Unsigned long reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_reenlightenment_control")
    @NotUsableInJava
    public static class hv_reenlightenment_control
    extends Struct {
        public @Unsigned long vector;
        public @Unsigned long reserved1;
        public @Unsigned long enabled;
        public @Unsigned long reserved2;
        public @Unsigned long target_vp;
    }

    @Type(noCCodeGeneration=true, cType="union hv_vp_assist_msr_contents")
    @NotUsableInJava
    public static class hv_vp_assist_msr_contents
    extends Union {
        public @Unsigned long as_uint64;
        public AnonDefinitions.anon_member_of_hv_reference_tsc_msr_and_anon_member_of_hv_vp_assist_msr_contents anon1;
    }

    @Type(noCCodeGeneration=true, cType="union hv_x64_msr_hypercall_contents")
    @NotUsableInJava
    public static class hv_x64_msr_hypercall_contents
    extends Union {
        public @Unsigned long as_uint64;
        public AnonDefinitions.anon_member_of_hv_x64_msr_hypercall_contents anon1;
    }

    @Type(noCCodeGeneration=true, cType="union hv_reference_tsc_msr")
    @NotUsableInJava
    public static class hv_reference_tsc_msr
    extends Union {
        public @Unsigned long as_uint64;
        public AnonDefinitions.anon_member_of_hv_reference_tsc_msr_and_anon_member_of_hv_vp_assist_msr_contents anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_tlb_flush_ex")
    @NotUsableInJava
    public static class hv_tlb_flush_ex
    extends Struct {
        public @Unsigned long address_space;
        public @Unsigned long flags;
        public hv_vpset hv_vp_set;
        public @Unsigned long @Size(value=0) [] gva_list;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_tlb_flush")
    @NotUsableInJava
    public static class hv_tlb_flush
    extends Struct {
        public @Unsigned long address_space;
        public @Unsigned long flags;
        public @Unsigned long processor_mask;
        public @Unsigned long @Size(value=0) [] gva_list;
    }

    @Type(noCCodeGeneration=true, cType="enum hv_tsc_page_status")
    public static enum hv_tsc_page_status implements Enum<hv_tsc_page_status>,
    TypedEnum<hv_tsc_page_status, Integer>
    {
        HV_TSC_PAGE_UNSET,
        HV_TSC_PAGE_GUEST_CHANGED,
        HV_TSC_PAGE_HOST_CHANGED,
        HV_TSC_PAGE_SET,
        HV_TSC_PAGE_BROKEN;

    }

    @Type(noCCodeGeneration=true, cType="enum hv_tlb_flush_fifos")
    public static enum hv_tlb_flush_fifos implements Enum<hv_tlb_flush_fifos>,
    TypedEnum<hv_tlb_flush_fifos, Integer>
    {
        HV_L1_TLB_FLUSH_FIFO,
        HV_L2_TLB_FLUSH_FIFO,
        HV_NR_TLB_FLUSH_FIFOS;

    }

    @Type(noCCodeGeneration=true, cType="union hv_stimer_config")
    @NotUsableInJava
    public static class hv_stimer_config
    extends Union {
        public @Unsigned long as_uint64;
        public AnonDefinitions.anon_member_of_hv_stimer_config anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_message")
    @NotUsableInJava
    public static class hv_message
    extends Struct {
        public hv_message_header header;
        public UDefinitions.u_of_hv_message u;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_message_header")
    @NotUsableInJava
    public static class hv_message_header
    extends Struct {
        public @Unsigned int message_type;
        public char payload_size;
        public hv_message_flags message_flags;
        public char @Size(value=2) [] reserved;
        @InlineUnion(value=27621)
        public @InlineUnion(value=27621) @Unsigned long sender;
        @InlineUnion(value=27621)
        public @InlineUnion(value=27621) hv_port_id port;
    }

    @Type(noCCodeGeneration=true, cType="union hv_port_id")
    @NotUsableInJava
    public static class hv_port_id
    extends Union {
        public @Unsigned int asu32;
        public UDefinitions.u_of_hv_port_id u;
    }

    @Type(noCCodeGeneration=true, cType="union hv_message_flags")
    @NotUsableInJava
    public static class hv_message_flags
    extends Union {
        public char asu8;
        public AnonDefinitions.anon_member_of_hv_message_flags anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_partition_assist_pg")
    @NotUsableInJava
    public static class hv_partition_assist_pg
    extends Struct {
        public @Unsigned int tlb_lock_count;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_vp_assist_page")
    @NotUsableInJava
    public static class hv_vp_assist_page
    extends Struct {
        public @Unsigned int apic_assist;
        public @Unsigned int reserved1;
        public @Unsigned int vtl_entry_reason;
        public @Unsigned int vtl_reserved;
        public @Unsigned long vtl_ret_x64rax;
        public @Unsigned long vtl_ret_x64rcx;
        public hv_nested_enlightenments_control nested_control;
        public char enlighten_vmentry;
        public char @Size(value=7) [] reserved2;
        public @Unsigned long current_nested_vmcs;
        public char synthetic_time_unhalted_timer_expired;
        public char @Size(value=7) [] reserved3;
        public char @Size(value=40) [] virtualization_fault_information;
        public char @Size(value=8) [] reserved4;
        public char @Size(value=256) [] intercept_message;
        public char @Size(value=256) [] vtl_ret_actions;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_nested_enlightenments_control")
    @NotUsableInJava
    public static class hv_nested_enlightenments_control
    extends Struct {
        public misc.features_of_hv_nested_enlightenments_control features;
        public misc.hypercallControls_of_hv_nested_enlightenments_control hypercallControls;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_ops")
    @NotUsableInJava
    public static class hv_ops
    extends Struct {
        public Ptr<?> get_chars;
        public Ptr<?> put_chars;
        public Ptr<?> flush;
        public Ptr<?> notifier_add;
        public Ptr<?> notifier_del;
        public Ptr<?> notifier_hangup;
        public Ptr<?> tiocmget;
        public Ptr<?> tiocmset;
        public Ptr<?> dtr_rts;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_create_vp")
    @NotUsableInJava
    public static class hv_create_vp
    extends Struct {
        public @Unsigned long partition_id;
        public @Unsigned int vp_index;
        public char @Size(value=3) [] padding;
        public char subnode_type;
        public @Unsigned long subnode_id;
        public hv_proximity_domain_info proximity_domain_info;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_output_add_logical_processor")
    @NotUsableInJava
    public static class hv_output_add_logical_processor
    extends Struct {
        public hv_lp_startup_status startup_status;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_input_add_logical_processor")
    @NotUsableInJava
    public static class hv_input_add_logical_processor
    extends Struct {
        public @Unsigned int lp_index;
        public @Unsigned int apic_id;
        public hv_proximity_domain_info proximity_domain_info;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_lp_startup_status")
    @NotUsableInJava
    public static class hv_lp_startup_status
    extends Struct {
        public @Unsigned long hv_status;
        public @Unsigned long substatus1;
        public @Unsigned long substatus2;
        public @Unsigned long substatus3;
        public @Unsigned long substatus4;
        public @Unsigned long substatus5;
        public @Unsigned long substatus6;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_proximity_domain_info")
    @NotUsableInJava
    public static class hv_proximity_domain_info
    extends Struct {
        public @Unsigned int domain_id;
        public hv_proximity_domain_flags flags;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_proximity_domain_flags")
    @NotUsableInJava
    public static class hv_proximity_domain_flags
    extends Struct {
        public @Unsigned int proximity_preferred;
        public @Unsigned int reserved;
        public @Unsigned int proximity_info_valid;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_deposit_memory")
    @NotUsableInJava
    public static class hv_deposit_memory
    extends Struct {
        public @Unsigned long partition_id;
        public @Unsigned long @Size(value=0) [] gpa_page_list;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_input_unmap_device_interrupt")
    @NotUsableInJava
    public static class hv_input_unmap_device_interrupt
    extends Struct {
        public @Unsigned long partition_id;
        public @Unsigned long device_id;
        public hv_interrupt_entry interrupt_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_output_map_device_interrupt")
    @NotUsableInJava
    public static class hv_output_map_device_interrupt
    extends Struct {
        public hv_interrupt_entry interrupt_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_input_map_device_interrupt")
    @NotUsableInJava
    public static class hv_input_map_device_interrupt
    extends Struct {
        public @Unsigned long partition_id;
        public @Unsigned long device_id;
        public @Unsigned long flags;
        public hv_interrupt_entry logical_interrupt_entry;
        public hv_device_interrupt_descriptor interrupt_descriptor;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_device_interrupt_descriptor")
    @NotUsableInJava
    public static class hv_device_interrupt_descriptor
    extends Struct {
        public @Unsigned int interrupt_type;
        public @Unsigned int trigger_mode;
        public @Unsigned int vector_count;
        public @Unsigned int reserved;
        public hv_device_interrupt_target target;
    }

    @Type(noCCodeGeneration=true, cType="enum hv_interrupt_trigger_mode")
    public static enum hv_interrupt_trigger_mode implements Enum<hv_interrupt_trigger_mode>,
    TypedEnum<hv_interrupt_trigger_mode, Integer>
    {
        HV_INTERRUPT_TRIGGER_MODE_EDGE,
        HV_INTERRUPT_TRIGGER_MODE_LEVEL;

    }

    @Type(noCCodeGeneration=true, cType="union hv_device_id")
    @NotUsableInJava
    public static class hv_device_id
    extends Union {
        public @Unsigned long as_uint64;
        public AnonDefinitions.anon_member_of_hv_device_id anon1;
        public misc.logical_of_hv_device_id logical;
        public PciDefinitions.pci_of_hv_device_id pci;
        public IoapicDefinitions.ioapic_of_hv_device_id ioapic;
        public AcpiDefinitions.acpi_of_hv_device_id acpi;
    }

    @Type(noCCodeGeneration=true, cType="union hv_pci_bus_range")
    @NotUsableInJava
    public static class hv_pci_bus_range
    extends Union {
        public @Unsigned short as_uint16;
        public AnonDefinitions.anon_member_of_hv_pci_bus_range anon1;
    }

    @Type(noCCodeGeneration=true, cType="union hv_pci_bdf")
    @NotUsableInJava
    public static class hv_pci_bdf
    extends Union {
        public @Unsigned short as_uint16;
        public AnonDefinitions.anon_member_of_hv_pci_bdf anon1;
    }

    @Type(noCCodeGeneration=true, cType="enum hv_device_type")
    public static enum hv_device_type implements Enum<hv_device_type>,
    TypedEnum<hv_device_type, Integer>
    {
        HV_DEVICE_TYPE_LOGICAL,
        HV_DEVICE_TYPE_PCI,
        HV_DEVICE_TYPE_IOAPIC,
        HV_DEVICE_TYPE_ACPI;

    }

    @Type(noCCodeGeneration=true, cType="struct hv_device_interrupt_target")
    @NotUsableInJava
    public static class hv_device_interrupt_target
    extends Struct {
        public @Unsigned int vector;
        public @Unsigned int flags;
        @InlineUnion(value=4071)
        public @InlineUnion(value=4071) @Unsigned long vp_mask;
        @InlineUnion(value=4071)
        public @InlineUnion(value=4071) hv_vpset vp_set;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_interrupt_entry")
    @NotUsableInJava
    public static class hv_interrupt_entry
    extends Struct {
        public @Unsigned int source;
        public @Unsigned int reserved1;
        @InlineUnion(value=4069)
        public @InlineUnion(value=4069) hv_msi_entry msi_entry;
        @InlineUnion(value=4069)
        public @InlineUnion(value=4069) hv_ioapic_rte ioapic_rte;
    }

    @Type(noCCodeGeneration=true, cType="union hv_ioapic_rte")
    @NotUsableInJava
    public static class hv_ioapic_rte
    extends Union {
        public @Unsigned long as_uint64;
        public AnonDefinitions.anon_member_of_hv_ioapic_rte anon1;
        public AnonDefinitions.anon_member_of_hv_ioapic_rte anon2;
    }

    @Type(noCCodeGeneration=true, cType="struct hv_vpset")
    @NotUsableInJava
    public static class hv_vpset
    extends Struct {
        public @Unsigned long format;
        public @Unsigned long valid_bank_mask;
        public @Unsigned long @Size(value=0) [] bank_contents;
    }

    @Type(noCCodeGeneration=true, cType="union hv_msi_entry")
    @NotUsableInJava
    public static class hv_msi_entry
    extends Union {
        public @Unsigned long as_uint64;
        public AnonDefinitions.anon_member_of_hv_msi_entry anon1;
    }

    @Type(noCCodeGeneration=true, cType="union hv_msi_data_register")
    @NotUsableInJava
    public static class hv_msi_data_register
    extends Union {
        public @Unsigned int as_uint32;
        public AnonDefinitions.anon_member_of_hv_msi_data_register anon1;
    }

    @Type(noCCodeGeneration=true, cType="union hv_msi_address_register")
    @NotUsableInJava
    public static class hv_msi_address_register
    extends Union {
        public @Unsigned int as_uint32;
        public AnonDefinitions.anon_member_of_hv_msi_address_register anon1;
    }

    @Type(noCCodeGeneration=true, cType="enum hv_interrupt_type")
    public static enum hv_interrupt_type implements Enum<hv_interrupt_type>,
    TypedEnum<hv_interrupt_type, Integer>
    {
        HV_X64_INTERRUPT_TYPE_FIXED,
        HV_X64_INTERRUPT_TYPE_LOWESTPRIORITY,
        HV_X64_INTERRUPT_TYPE_SMI,
        HV_X64_INTERRUPT_TYPE_REMOTEREAD,
        HV_X64_INTERRUPT_TYPE_NMI,
        HV_X64_INTERRUPT_TYPE_INIT,
        HV_X64_INTERRUPT_TYPE_SIPI,
        HV_X64_INTERRUPT_TYPE_EXTINT,
        HV_X64_INTERRUPT_TYPE_LOCALINT0,
        HV_X64_INTERRUPT_TYPE_LOCALINT1,
        HV_X64_INTERRUPT_TYPE_MAXIMUM;

    }
}

