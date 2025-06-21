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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AsyncDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DataDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FlushDefinitions;
import me.bechberger.ebpf.runtime.FpuDefinitions;
import me.bechberger.ebpf.runtime.HvDefinitions;
import me.bechberger.ebpf.runtime.IntervalDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MsrDefinitions;
import me.bechberger.ebpf.runtime.NmiDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PmcDefinitions;
import me.bechberger.ebpf.runtime.PreemptDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PvDefinitions;
import me.bechberger.ebpf.runtime.PvclockDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class KvmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kvm_check_and_clear_guest_paused() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kvm_clock_get_cycles(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kvm_cs_enable(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kvm_get_tsc_khz() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_get_wallclock(Ptr<runtime.timespec64> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_register_clock(String txt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_restore_sched_clock_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_save_sched_clock_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kvm_sched_clock_read() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kvm_set_wallclock((const struct timespec64*)$arg1)")
    public static int kvm_set_wallclock(Ptr<runtime.timespec64> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_setup_secondary_clock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kvm_setup_vsyscall_timeinfo() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kvm_set_posted_intr_wakeup_handler((void (*)())$arg1)")
    public static void kvm_set_posted_intr_wakeup_handler(Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int __kvm_cpuid_base() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __kvm_handle_async_pf(Ptr<PtDefinitions.pt_regs> regs, @Unsigned int token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kvm_alloc_cpumask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_apic_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int kvm_arch_para_features() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int kvm_arch_para_hints() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_async_pf_task_wait_schedule(@Unsigned int token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_async_pf_task_wake(@Unsigned int token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kvm_cpu_down_prepare(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kvm_cpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int kvm_cpuid_base() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_crash_shutdown(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int kvm_detect() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_disable_host_haltpoll(Ptr<?> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_enable_host_haltpoll(Ptr<?> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kvm_flush_tlb_multi((const struct cpumask*)$arg1, (const struct flush_tlb_info*)$arg2)")
    public static void kvm_flush_tlb_multi(Ptr<runtime.cpumask> cpumask2, Ptr<FlushDefinitions.flush_tlb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_guest_apic_eoi_write() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_guest_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_guest_cpu_offline(boolean shutdown2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_guest_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_init_platform() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_io_delay() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_kick_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kvm_msi_ext_dest_id() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kvm_para_available() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_pv_guest_cpu_reboot(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kvm_pv_reboot_notify(Ptr<misc.notifier_block> nb, @Unsigned long code2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int kvm_read_and_reset_apf_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kvm_send_ipi_mask((const struct cpumask*)$arg1, $arg2)")
    public static void kvm_send_ipi_mask(Ptr<runtime.cpumask> mask, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kvm_send_ipi_mask_allbutself((const struct cpumask*)$arg1, $arg2)")
    public static void kvm_send_ipi_mask_allbutself(Ptr<runtime.cpumask> mask, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kvm_sev_es_hcall_finish(Ptr<runtime.ghcb> ghcb2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_sev_es_hcall_prepare(Ptr<runtime.ghcb> ghcb2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_sev_hc_page_enc_status(@Unsigned long pfn, int npages, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_smp_prepare_boot_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kvm_smp_send_call_func_ipi((const struct cpumask*)$arg1)")
    public static void kvm_smp_send_call_func_ipi(Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_spinlock_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kvm_steal_clock(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kvm_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kvm_wait(Ptr<Character> ptr, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct _kvm_stats_desc")
    @NotUsableInJava
    public static class _kvm_stats_desc
    extends Struct {
        public kvm_stats_desc desc;
        public char @Size(value=48) [] name;
    }

    @Type(noCCodeGeneration=true, cType="enum kvm_stat_kind")
    public static enum kvm_stat_kind implements Enum<kvm_stat_kind>,
    TypedEnum<kvm_stat_kind, Integer>
    {
        KVM_STAT_VM,
        KVM_STAT_VCPU;

    }

    @Type(noCCodeGeneration=true, cType="struct kvm_stat_data")
    @NotUsableInJava
    public static class kvm_stat_data
    extends Struct {
        public Ptr<runtime.kvm> kvm;
        public Ptr<_kvm_stats_desc> desc;
        public kvm_stat_kind kind;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_memslots")
    @NotUsableInJava
    public static class kvm_memslots
    extends Struct {
        public @Unsigned long generation;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t last_used_slot;
        public RbDefinitions.rb_root_cached hva_tree;
        public RbDefinitions.rb_root gfn_tree;
        public misc.hlist_head @Size(value=128) [] id_hash;
        public int node_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_irq_routing_table")
    @NotUsableInJava
    public static class kvm_irq_routing_table
    extends Struct {
        public int @Size(value=72) [] chip;
        public @Unsigned int nr_rt_entries;
        public misc.hlist_head @Size(value=0) [] map;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_mmio_fragment")
    @NotUsableInJava
    public static class kvm_mmio_fragment
    extends Struct {
        public @Unsigned @OriginalName(value="gpa_t") long gpa;
        public Ptr<?> data;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="enum kvm_bus")
    public static enum kvm_bus implements Enum<kvm_bus>,
    TypedEnum<kvm_bus, Integer>
    {
        KVM_MMIO_BUS,
        KVM_PIO_BUS,
        KVM_VIRTIO_CCW_NOTIFY_BUS,
        KVM_FAST_MMIO_BUS,
        KVM_NR_BUSES;

    }

    @Type(noCCodeGeneration=true, cType="struct kvm_io_bus")
    @NotUsableInJava
    public static class kvm_io_bus
    extends Struct {
        public int dev_count;
        public int ioeventfd_count;
        public kvm_io_range @Size(value=0) [] range;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_io_range")
    @NotUsableInJava
    public static class kvm_io_range
    extends Struct {
        public @Unsigned @OriginalName(value="gpa_t") long addr;
        public int len;
        public @OriginalName(value="kvm_io_device") Ptr<?> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_dirty_ring")
    @NotUsableInJava
    public static class kvm_dirty_ring
    extends Struct {
        public @Unsigned int dirty_index;
        public @Unsigned int reset_index;
        public @Unsigned int size;
        public @Unsigned int soft_limit;
        public Ptr<kvm_dirty_gfn> dirty_gfns;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_x86_nested_ops")
    @NotUsableInJava
    public static class kvm_x86_nested_ops
    extends Struct {
        public Ptr<?> leave_nested;
        public Ptr<?> is_exception_vmexit;
        public Ptr<?> check_events;
        public Ptr<?> has_events;
        public Ptr<?> triple_fault;
        public Ptr<?> get_state;
        public Ptr<?> set_state;
        public Ptr<?> get_nested_state_pages;
        public Ptr<?> write_log_dirty;
        public Ptr<?> enable_evmcs;
        public Ptr<?> get_evmcs_version;
        public Ptr<?> hv_inject_synthetic_vmexit_post_tlb_flush;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_x86_ops")
    @NotUsableInJava
    public static class kvm_x86_ops
    extends Struct {
        public String name;
        public Ptr<?> check_processor_compatibility;
        public Ptr<?> enable_virtualization_cpu;
        public Ptr<?> disable_virtualization_cpu;
        public Ptr<?> emergency_disable_virtualization_cpu;
        public Ptr<?> hardware_unsetup;
        public Ptr<?> has_emulated_msr;
        public Ptr<?> vcpu_after_set_cpuid;
        public @Unsigned int vm_size;
        public Ptr<?> vm_init;
        public Ptr<?> vm_destroy;
        public Ptr<?> vcpu_precreate;
        public Ptr<?> vcpu_create;
        public Ptr<?> vcpu_free;
        public Ptr<?> vcpu_reset;
        public Ptr<?> prepare_switch_to_guest;
        public Ptr<?> vcpu_load;
        public Ptr<?> vcpu_put;
        public Ptr<?> update_exception_bitmap;
        public Ptr<?> get_msr;
        public Ptr<?> set_msr;
        public Ptr<?> get_segment_base;
        public Ptr<?> get_segment;
        public Ptr<?> get_cpl;
        public Ptr<?> set_segment;
        public Ptr<?> get_cs_db_l_bits;
        public Ptr<?> is_valid_cr0;
        public Ptr<?> set_cr0;
        public Ptr<?> post_set_cr3;
        public Ptr<?> is_valid_cr4;
        public Ptr<?> set_cr4;
        public Ptr<?> set_efer;
        public Ptr<?> get_idt;
        public Ptr<?> set_idt;
        public Ptr<?> get_gdt;
        public Ptr<?> set_gdt;
        public Ptr<?> sync_dirty_debug_regs;
        public Ptr<?> set_dr7;
        public Ptr<?> cache_reg;
        public Ptr<?> get_rflags;
        public Ptr<?> set_rflags;
        public Ptr<?> get_if_flag;
        public Ptr<?> flush_tlb_all;
        public Ptr<?> flush_tlb_current;
        public Ptr<?> flush_remote_tlbs;
        public Ptr<?> flush_remote_tlbs_range;
        public Ptr<?> flush_tlb_gva;
        public Ptr<?> flush_tlb_guest;
        public Ptr<?> vcpu_pre_run;
        public Ptr<?> vcpu_run;
        public Ptr<?> handle_exit;
        public Ptr<?> skip_emulated_instruction;
        public Ptr<?> update_emulated_instruction;
        public Ptr<?> set_interrupt_shadow;
        public Ptr<?> get_interrupt_shadow;
        public Ptr<?> patch_hypercall;
        public Ptr<?> inject_irq;
        public Ptr<?> inject_nmi;
        public Ptr<?> inject_exception;
        public Ptr<?> cancel_injection;
        public Ptr<?> interrupt_allowed;
        public Ptr<?> nmi_allowed;
        public Ptr<?> get_nmi_mask;
        public Ptr<?> set_nmi_mask;
        public Ptr<?> is_vnmi_pending;
        public Ptr<?> set_vnmi_pending;
        public Ptr<?> enable_nmi_window;
        public Ptr<?> enable_irq_window;
        public Ptr<?> update_cr8_intercept;
        public boolean x2apic_icr_is_split;
        public @Unsigned long required_apicv_inhibits;
        public boolean allow_apicv_in_x2apic_without_x2apic_virtualization;
        public Ptr<?> refresh_apicv_exec_ctrl;
        public Ptr<?> hwapic_irr_update;
        public Ptr<?> hwapic_isr_update;
        public Ptr<?> load_eoi_exitmap;
        public Ptr<?> set_virtual_apic_mode;
        public Ptr<?> set_apic_access_page_addr;
        public Ptr<?> deliver_interrupt;
        public Ptr<?> sync_pir_to_irr;
        public Ptr<?> set_tss_addr;
        public Ptr<?> set_identity_map_addr;
        public Ptr<?> get_mt_mask;
        public Ptr<?> load_mmu_pgd;
        public Ptr<?> has_wbinvd_exit;
        public Ptr<?> get_l2_tsc_offset;
        public Ptr<?> get_l2_tsc_multiplier;
        public Ptr<?> write_tsc_offset;
        public Ptr<?> write_tsc_multiplier;
        public Ptr<?> get_exit_info;
        public Ptr<?> check_intercept;
        public Ptr<?> handle_exit_irqoff;
        public int cpu_dirty_log_size;
        public Ptr<?> update_cpu_dirty_logging;
        public Ptr<kvm_x86_nested_ops> nested_ops;
        public Ptr<?> vcpu_blocking;
        public Ptr<?> vcpu_unblocking;
        public Ptr<?> pi_update_irte;
        public Ptr<?> pi_start_assignment;
        public Ptr<?> apicv_pre_state_restore;
        public Ptr<?> apicv_post_state_restore;
        public Ptr<?> dy_apicv_has_pending_interrupt;
        public Ptr<?> set_hv_timer;
        public Ptr<?> cancel_hv_timer;
        public Ptr<?> setup_mce;
        public Ptr<?> smi_allowed;
        public Ptr<?> enter_smm;
        public Ptr<?> leave_smm;
        public Ptr<?> enable_smi_window;
        public Ptr<?> dev_get_attr;
        public Ptr<?> mem_enc_ioctl;
        public Ptr<?> mem_enc_register_region;
        public Ptr<?> mem_enc_unregister_region;
        public Ptr<?> vm_copy_enc_context_from;
        public Ptr<?> vm_move_enc_context_from;
        public Ptr<?> guest_memory_reclaimed;
        public Ptr<?> get_feature_msr;
        public Ptr<?> check_emulate_instruction;
        public Ptr<?> apic_init_signal_blocked;
        public Ptr<?> enable_l2_tlb_flush;
        public Ptr<?> migrate_timers;
        public Ptr<?> msr_filter_changed;
        public Ptr<?> complete_emulated_msr;
        public Ptr<?> vcpu_deliver_sipi_vector;
        public Ptr<?> vcpu_get_apicv_inhibit_reasons;
        public Ptr<?> get_untagged_addr;
        public Ptr<?> alloc_apic_backing_page;
        public Ptr<?> gmem_prepare;
        public Ptr<?> gmem_invalidate;
        public Ptr<?> private_max_mapping_level;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_stat")
    @NotUsableInJava
    public static class kvm_vcpu_stat
    extends Struct {
        public kvm_vcpu_stat_generic generic;
        public @Unsigned long pf_taken;
        public @Unsigned long pf_fixed;
        public @Unsigned long pf_emulate;
        public @Unsigned long pf_spurious;
        public @Unsigned long pf_fast;
        public @Unsigned long pf_mmio_spte_created;
        public @Unsigned long pf_guest;
        public @Unsigned long tlb_flush;
        public @Unsigned long invlpg;
        public @Unsigned long exits;
        public @Unsigned long io_exits;
        public @Unsigned long mmio_exits;
        public @Unsigned long signal_exits;
        public @Unsigned long irq_window_exits;
        public @Unsigned long nmi_window_exits;
        public @Unsigned long l1d_flush;
        public @Unsigned long halt_exits;
        public @Unsigned long request_irq_exits;
        public @Unsigned long irq_exits;
        public @Unsigned long host_state_reload;
        public @Unsigned long fpu_reload;
        public @Unsigned long insn_emulation;
        public @Unsigned long insn_emulation_fail;
        public @Unsigned long hypercalls;
        public @Unsigned long irq_injections;
        public @Unsigned long nmi_injections;
        public @Unsigned long req_event;
        public @Unsigned long nested_run;
        public @Unsigned long directed_yield_attempted;
        public @Unsigned long directed_yield_successful;
        public @Unsigned long preemption_reported;
        public @Unsigned long preemption_other;
        public @Unsigned long guest_mode;
        public @Unsigned long notify_window_exits;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vm_stat")
    @NotUsableInJava
    public static class kvm_vm_stat
    extends Struct {
        public kvm_vm_stat_generic generic;
        public @Unsigned long mmu_shadow_zapped;
        public @Unsigned long mmu_pte_write;
        public @Unsigned long mmu_pde_zapped;
        public @Unsigned long mmu_flooded;
        public @Unsigned long mmu_recycled;
        public @Unsigned long mmu_cache_miss;
        public @Unsigned long mmu_unsync;
        @InlineUnion(value=27742)
        public  @InlineUnion(value=27742) AnonDefinitions.anon_member_of_anon_member_of_kvm_vm_stat anon8$0;
        @InlineUnion(value=27742)
        public @InlineUnion(value=27742) misc.atomic64_t @Size(value=3) [] pages;
        public @Unsigned long nx_lpage_splits;
        public @Unsigned long max_mmu_page_hash_collisions;
        public @Unsigned long max_mmu_rmap_size;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_arch")
    @NotUsableInJava
    public static class kvm_arch
    extends Struct {
        public @Unsigned long n_used_mmu_pages;
        public @Unsigned long n_requested_mmu_pages;
        public @Unsigned long n_max_mmu_pages;
        public @Unsigned int indirect_shadow_pages;
        public char mmu_valid_gen;
        public char vm_type;
        public boolean has_private_mem;
        public boolean has_protected_state;
        public boolean pre_fault_allowed;
        public misc.hlist_head @Size(value=4096) [] mmu_page_hash;
        public ListDefinitions.list_head active_mmu_pages;
        public ListDefinitions.list_head zapped_obsolete_pages;
        public ListDefinitions.list_head possible_nx_huge_pages;
        public kvm_page_track_notifier_head track_notifier_head;
        public  @OriginalName(value="spinlock_t") runtime.spinlock mmu_unsync_pages_lock;
        public @Unsigned long shadow_mmio_value;
        public Ptr<IommuDefinitions.iommu_domain> iommu_domain;
        public boolean iommu_noncoherent;
        public AtomicDefinitions.atomic_t noncoherent_dma_count;
        public AtomicDefinitions.atomic_t assigned_device_count;
        public @OriginalName(value="kvm_pic") Ptr<?> vpic;
        public @OriginalName(value="kvm_ioapic") Ptr<?> vioapic;
        public @OriginalName(value="kvm_pit") Ptr<?> vpit;
        public AtomicDefinitions.atomic_t vapics_in_nmi_mode;
        public runtime.mutex apic_map_lock;
        public Ptr<kvm_apic_map> apic_map;
        public AtomicDefinitions.atomic_t apic_map_dirty;
        public boolean apic_access_memslot_enabled;
        public boolean apic_access_memslot_inhibited;
        public misc.rw_semaphore apicv_update_lock;
        public @Unsigned long apicv_inhibit_reasons;
        public @Unsigned @OriginalName(value="gpa_t") long wall_clock;
        public boolean mwait_in_guest;
        public boolean hlt_in_guest;
        public boolean pause_in_guest;
        public boolean cstate_in_guest;
        public @Unsigned long irq_sources_bitmap;
        public long kvmclock_offset;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock tsc_write_lock;
        public @Unsigned long last_tsc_nsec;
        public @Unsigned long last_tsc_write;
        public @Unsigned int last_tsc_khz;
        public @Unsigned long last_tsc_offset;
        public @Unsigned long cur_tsc_nsec;
        public @Unsigned long cur_tsc_write;
        public @Unsigned long cur_tsc_offset;
        public @Unsigned long cur_tsc_generation;
        public int nr_vcpus_matched_tsc;
        public @Unsigned int default_tsc_khz;
        public boolean user_set_tsc;
        public @Unsigned long apic_bus_cycle_ns;
        public @OriginalName(value="seqcount_raw_spinlock_t") misc.seqcount_raw_spinlock pvclock_sc;
        public boolean use_master_clock;
        public @Unsigned long master_kernel_ns;
        public @Unsigned long master_cycle_now;
        public DelayedDefinitions.delayed_work kvmclock_update_work;
        public DelayedDefinitions.delayed_work kvmclock_sync_work;
        public kvm_xen_hvm_config xen_hvm_config;
        public misc.hlist_head mask_notifier_list;
        public kvm_hv hyperv;
        public kvm_xen xen;
        public boolean backwards_tsc_observed;
        public boolean boot_vcpu_runs_old_kvmclock;
        public @Unsigned int bsp_vcpu_id;
        public @Unsigned long disabled_quirks;
        public kvm_irqchip_mode irqchip_mode;
        public char nr_reserved_ioapic_pins;
        public boolean disabled_lapic_found;
        public boolean x2apic_format;
        public boolean x2apic_broadcast_quirk_disabled;
        public boolean guest_can_read_msr_platform_info;
        public boolean exception_payload_enabled;
        public boolean triple_fault_event;
        public boolean bus_lock_detection_enabled;
        public boolean enable_pmu;
        public @Unsigned int notify_window;
        public @Unsigned int notify_vmexit_flags;
        public boolean exit_on_emulation_error;
        public @Unsigned int user_space_msr_mask;
        public Ptr<kvm_x86_msr_filter> msr_filter;
        public @Unsigned int hypercall_exit_enabled;
        public boolean sgx_provisioning_allowed;
        public Ptr<kvm_x86_pmu_event_filter> pmu_event_filter;
        public Ptr<misc.vhost_task> nx_huge_page_recovery_thread;
        public @Unsigned long nx_huge_page_last;
        public misc.atomic64_t tdp_mmu_pages;
        public ListDefinitions.list_head tdp_mmu_roots;
        public  @OriginalName(value="spinlock_t") runtime.spinlock tdp_mmu_pages_lock;
        public boolean shadow_root_allocated;
        public boolean external_write_tracking_enabled;
        public @Unsigned @OriginalName(value="hpa_t") long hv_root_tdp;
        public  @OriginalName(value="spinlock_t") runtime.spinlock hv_root_tdp_lock;
        public Ptr<HvDefinitions.hv_partition_assist_pg> hv_pa_pg;
        public @Unsigned int max_vcpu_ids;
        public boolean disable_nx_huge_pages;
        public kvm_mmu_memory_cache split_shadow_page_cache;
        public kvm_mmu_memory_cache split_page_header_cache;
        public kvm_mmu_memory_cache split_desc_cache;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_x86_pmu_event_filter")
    @NotUsableInJava
    public static class kvm_x86_pmu_event_filter
    extends Struct {
        public @Unsigned int action;
        public @Unsigned int nevents;
        public @Unsigned int fixed_counter_bitmap;
        public @Unsigned int flags;
        public @Unsigned int nr_includes;
        public @Unsigned int nr_excludes;
        public Ptr<@Unsigned Long> includes;
        public Ptr<@Unsigned Long> excludes;
        public @Unsigned long @Size(value=0) [] events;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_x86_msr_filter")
    @NotUsableInJava
    public static class kvm_x86_msr_filter
    extends Struct {
        public char count;
        public boolean default_allow;
        public MsrDefinitions.msr_bitmap_range @Size(value=16) [] ranges;
    }

    @Type(noCCodeGeneration=true, cType="enum kvm_irqchip_mode")
    public static enum kvm_irqchip_mode implements Enum<kvm_irqchip_mode>,
    TypedEnum<kvm_irqchip_mode, Integer>
    {
        KVM_IRQCHIP_NONE,
        KVM_IRQCHIP_KERNEL,
        KVM_IRQCHIP_SPLIT;

    }

    @Type(noCCodeGeneration=true, cType="struct kvm_xen")
    @NotUsableInJava
    public static class kvm_xen
    extends Struct {
        public runtime.mutex xen_lock;
        public @Unsigned int xen_version;
        public boolean long_mode;
        public boolean runstate_update_flag;
        public char upcall_vector;
        public misc.gfn_to_pfn_cache shinfo_cache;
        public runtime.idr evtchn_ports;
        public @Unsigned long @Size(value=64) [] poll_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_hv")
    @NotUsableInJava
    public static class kvm_hv
    extends Struct {
        public runtime.mutex hv_lock;
        public @Unsigned long hv_guest_os_id;
        public @Unsigned long hv_hypercall;
        public @Unsigned long hv_tsc_page;
        public HvDefinitions.hv_tsc_page_status hv_tsc_page_status;
        public @Unsigned long @Size(value=5) [] hv_crash_param;
        public @Unsigned long hv_crash_ctl;
        public misc.ms_hyperv_tsc_page tsc_ref;
        public runtime.idr conn_to_evt;
        public @Unsigned long hv_reenlightenment_control;
        public @Unsigned long hv_tsc_emulation_control;
        public @Unsigned long hv_tsc_emulation_status;
        public @Unsigned long hv_invtsc_control;
        public AtomicDefinitions.atomic_t num_mismatched_vp_indexes;
        public @Unsigned int synic_auto_eoi_used;
        public kvm_hv_syndbg hv_syndbg;
        public boolean xsaves_xsavec_checked;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_hv_syndbg")
    @NotUsableInJava
    public static class kvm_hv_syndbg
    extends Struct {
        public misc.control_of_kvm_hv_syndbg control;
        public @Unsigned long options;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_apic_map")
    @NotUsableInJava
    public static class kvm_apic_map
    extends Struct {
        public misc.callback_head rcu;
        public kvm_apic_logical_mode logical_mode;
        public @Unsigned int max_apic_id;
        @InlineUnion(value=27713)
        public @InlineUnion(value=27713) @OriginalName(value="kvm_lapic") Ptr<?> @Size(value=8) [] xapic_flat_map;
        @InlineUnion(value=27713)
        public @InlineUnion(value=27713) @OriginalName(value="kvm_lapic") Ptr<?> @Size(value=64) [] xapic_cluster_map;
        public @OriginalName(value="kvm_lapic") Ptr<?> @Size(value=0) [] phys_map;
    }

    @Type(noCCodeGeneration=true, cType="enum kvm_apic_logical_mode")
    public static enum kvm_apic_logical_mode implements Enum<kvm_apic_logical_mode>,
    TypedEnum<kvm_apic_logical_mode, Integer>
    {
        KVM_APIC_MODE_SW_DISABLED,
        KVM_APIC_MODE_XAPIC_CLUSTER,
        KVM_APIC_MODE_XAPIC_FLAT,
        KVM_APIC_MODE_X2APIC,
        KVM_APIC_MODE_MAP_DISABLED;

    }

    @Type(noCCodeGeneration=true, cType="struct kvm_arch_memory_slot")
    @NotUsableInJava
    public static class kvm_arch_memory_slot
    extends Struct {
        public Ptr<kvm_rmap_head> @Size(value=3) [] rmap;
        public Ptr<kvm_lpage_info> @Size(value=2) [] lpage_info;
        public Ptr<@Unsigned Short> gfn_write_track;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_lpage_info")
    @NotUsableInJava
    public static class kvm_lpage_info
    extends Struct {
        public int disallow_lpage;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_arch")
    @NotUsableInJava
    public static class kvm_vcpu_arch
    extends Struct {
        public @Unsigned long @Size(value=17) [] regs;
        public @Unsigned int regs_avail;
        public @Unsigned int regs_dirty;
        public @Unsigned long cr0;
        public @Unsigned long cr0_guest_owned_bits;
        public @Unsigned long cr2;
        public @Unsigned long cr3;
        public @Unsigned long cr4;
        public @Unsigned long cr4_guest_owned_bits;
        public @Unsigned long cr4_guest_rsvd_bits;
        public @Unsigned long cr8;
        public @Unsigned int host_pkru;
        public @Unsigned int pkru;
        public @Unsigned int hflags;
        public @Unsigned long efer;
        public @Unsigned long apic_base;
        public @OriginalName(value="kvm_lapic") Ptr<?> apic;
        public boolean load_eoi_exitmap_pending;
        public @Unsigned long @Size(value=4) [] ioapic_handled_vectors;
        public @Unsigned long apic_attention;
        public @OriginalName(value="int32_t") int apic_arb_prio;
        public int mp_state;
        public @Unsigned long ia32_misc_enable_msr;
        public @Unsigned long smbase;
        public @Unsigned long smi_count;
        public boolean at_instruction_boundary;
        public boolean tpr_access_reporting;
        public boolean xfd_no_write_intercept;
        public @Unsigned long ia32_xss;
        public @Unsigned long microcode_version;
        public @Unsigned long arch_capabilities;
        public @Unsigned long perf_capabilities;
        public Ptr<kvm_mmu> mmu;
        public kvm_mmu root_mmu;
        public kvm_mmu guest_mmu;
        public kvm_mmu nested_mmu;
        public Ptr<kvm_mmu> walk_mmu;
        public kvm_mmu_memory_cache mmu_pte_list_desc_cache;
        public kvm_mmu_memory_cache mmu_shadow_page_cache;
        public kvm_mmu_memory_cache mmu_shadowed_info_cache;
        public kvm_mmu_memory_cache mmu_page_header_cache;
        public FpuDefinitions.fpu_guest guest_fpu;
        public @Unsigned long xcr0;
        public @Unsigned long guest_supported_xcr0;
        public kvm_pio_request pio;
        public Ptr<?> pio_data;
        public Ptr<?> sev_pio_data;
        public @Unsigned int sev_pio_count;
        public char event_exit_inst_len;
        public boolean exception_from_userspace;
        public kvm_queued_exception exception;
        public kvm_queued_exception exception_vmexit;
        public kvm_queued_interrupt interrupt;
        public int halt_request;
        public int cpuid_nent;
        public Ptr<kvm_cpuid_entry2> cpuid_entries;
        public kvm_hypervisor_cpuid kvm_cpuid;
        public boolean is_amd_compatible;
        public misc.governed_features_of_kvm_vcpu_arch governed_features;
        public @Unsigned long reserved_gpa_bits;
        public int maxphyaddr;
        public @OriginalName(value="x86_emulate_ctxt") Ptr<?> emulate_ctxt;
        public boolean emulate_regs_need_sync_to_vcpu;
        public boolean emulate_regs_need_sync_from_vcpu;
        public Ptr<?> complete_userspace_io;
        public @Unsigned @OriginalName(value="gpa_t") long time;
        public PvclockDefinitions.pvclock_vcpu_time_info hv_clock;
        public @Unsigned int hw_tsc_khz;
        public misc.gfn_to_pfn_cache pv_time;
        public boolean pvclock_set_guest_stopped_request;
        public misc.st_of_kvm_vcpu_arch st;
        public @Unsigned long l1_tsc_offset;
        public @Unsigned long tsc_offset;
        public @Unsigned long last_guest_tsc;
        public @Unsigned long last_host_tsc;
        public @Unsigned long tsc_offset_adjustment;
        public @Unsigned long this_tsc_nsec;
        public @Unsigned long this_tsc_write;
        public @Unsigned long this_tsc_generation;
        public boolean tsc_catchup;
        public boolean tsc_always_catchup;
        public @OriginalName(value="s8") byte virtual_tsc_shift;
        public @Unsigned int virtual_tsc_mult;
        public @Unsigned int virtual_tsc_khz;
        public long ia32_tsc_adjust_msr;
        public @Unsigned long msr_ia32_power_ctl;
        public @Unsigned long l1_tsc_scaling_ratio;
        public @Unsigned long tsc_scaling_ratio;
        public AtomicDefinitions.atomic_t nmi_queued;
        public @Unsigned int nmi_pending;
        public boolean nmi_injected;
        public boolean smi_pending;
        public char handling_intr_from_guest;
        public kvm_mtrr mtrr_state;
        public @Unsigned long pat;
        public @Unsigned int switch_db_regs;
        public @Unsigned long @Size(value=4) [] db;
        public @Unsigned long dr6;
        public @Unsigned long dr7;
        public @Unsigned long @Size(value=4) [] eff_db;
        public @Unsigned long guest_debug_dr7;
        public @Unsigned long msr_platform_info;
        public @Unsigned long msr_misc_features_enables;
        public @Unsigned long mcg_cap;
        public @Unsigned long mcg_status;
        public @Unsigned long mcg_ctl;
        public @Unsigned long mcg_ext_ctl;
        public Ptr<@Unsigned Long> mce_banks;
        public Ptr<@Unsigned Long> mci_ctl2_banks;
        public @Unsigned long mmio_gva;
        public @Unsigned int mmio_access;
        public @Unsigned @OriginalName(value="gfn_t") long mmio_gfn;
        public @Unsigned long mmio_gen;
        public kvm_pmu pmu;
        public @Unsigned long singlestep_rip;
        public boolean hyperv_enabled;
        public Ptr<kvm_vcpu_hv> hyperv;
        public kvm_vcpu_xen xen;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> wbinvd_dirty_mask;
        public @Unsigned long last_retry_eip;
        public @Unsigned long last_retry_addr;
        public misc.apf_of_kvm_vcpu_arch apf;
        public misc.osvw_of_kvm_vcpu_arch osvw;
        public PvDefinitions.pv_eoi_of_kvm_vcpu_arch pv_eoi;
        public @Unsigned long msr_kvm_poll_control;
        public PvDefinitions.pv_of_kvm_vcpu_arch pv;
        public int pending_ioapic_eoi;
        public int pending_external_vector;
        public boolean preempted_in_kernel;
        public boolean l1tf_flush_l1d;
        public int last_vmentry_cpu;
        public @Unsigned long msr_hwcr;
        public PvDefinitions.pv_cpuid_of_kvm_vcpu_arch pv_cpuid;
        public boolean guest_state_protected;
        public boolean pdptrs_from_userspace;
        public @Unsigned @OriginalName(value="hpa_t") long hv_root_tdp;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_queued_interrupt")
    @NotUsableInJava
    public static class kvm_queued_interrupt
    extends Struct {
        public boolean injected;
        public boolean soft;
        public char nr;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_queued_exception")
    @NotUsableInJava
    public static class kvm_queued_exception
    extends Struct {
        public boolean pending;
        public boolean injected;
        public boolean has_error_code;
        public char vector;
        public @Unsigned int error_code;
        public @Unsigned long payload;
        public boolean has_payload;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_xen")
    @NotUsableInJava
    public static class kvm_vcpu_xen
    extends Struct {
        public @Unsigned long hypercall_rip;
        public @Unsigned int current_runstate;
        public char upcall_vector;
        public misc.gfn_to_pfn_cache vcpu_info_cache;
        public misc.gfn_to_pfn_cache vcpu_time_info_cache;
        public misc.gfn_to_pfn_cache runstate_cache;
        public misc.gfn_to_pfn_cache runstate2_cache;
        public @Unsigned long last_steal;
        public @Unsigned long runstate_entry_time;
        public @Unsigned long @Size(value=4) [] runstate_times;
        public @Unsigned long evtchn_pending_sel;
        public @Unsigned int vcpu_id;
        public @Unsigned int timer_virq;
        public @Unsigned long timer_expires;
        public AtomicDefinitions.atomic_t timer_pending;
        public runtime.hrtimer timer;
        public int poll_evtchn;
        public TimerDefinitions.timer_list poll_timer;
        public kvm_hypervisor_cpuid cpuid;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_hypervisor_cpuid")
    @NotUsableInJava
    public static class kvm_hypervisor_cpuid
    extends Struct {
        public @Unsigned int base;
        public @Unsigned int limit;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_hv")
    @NotUsableInJava
    public static class kvm_vcpu_hv
    extends Struct {
        public Ptr<kvm_vcpu> vcpu;
        public @Unsigned int vp_index;
        public @Unsigned long hv_vapic;
        public long runtime_offset;
        public kvm_vcpu_hv_synic synic;
        public kvm_hyperv_exit exit;
        public kvm_vcpu_hv_stimer @Size(value=4) [] stimer;
        public @Unsigned long @Size(value=1) [] stimer_pending_bitmap;
        public boolean enforce_cpuid;
        public misc.cpuid_cache_of_kvm_vcpu_hv cpuid_cache;
        public kvm_vcpu_hv_tlb_flush_fifo @Size(value=2) [] tlb_flush_fifo;
        public @Unsigned long @Size(value=64) [] sparse_banks;
        public HvDefinitions.hv_vp_assist_page vp_assist_page;
        public misc.nested_of_kvm_vcpu_hv nested;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_hv_tlb_flush_fifo")
    @NotUsableInJava
    public static class kvm_vcpu_hv_tlb_flush_fifo
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock write_lock;
        public misc.entries_of_kvm_vcpu_hv_tlb_flush_fifo entries;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_hv_synic")
    @NotUsableInJava
    public static class kvm_vcpu_hv_synic
    extends Struct {
        public @Unsigned long version;
        public @Unsigned long control;
        public @Unsigned long msg_page;
        public @Unsigned long evt_page;
        public misc.atomic64_t @Size(value=16) [] sint;
        public AtomicDefinitions.atomic_t @Size(value=16) [] sint_to_gsi;
        public @Unsigned long @Size(value=4) [] auto_eoi_bitmap;
        public @Unsigned long @Size(value=4) [] vec_bitmap;
        public boolean active;
        public boolean dont_zero_synic_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_hv_stimer")
    @NotUsableInJava
    public static class kvm_vcpu_hv_stimer
    extends Struct {
        public runtime.hrtimer timer;
        public int index;
        public HvDefinitions.hv_stimer_config config;
        public @Unsigned long count;
        public @Unsigned long exp_time;
        public HvDefinitions.hv_message msg;
        public boolean msg_pending;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_mtrr")
    @NotUsableInJava
    public static class kvm_mtrr
    extends Struct {
        public @Unsigned long @Size(value=16) [] var;
        public @Unsigned long fixed_64k;
        public @Unsigned long @Size(value=2) [] fixed_16k;
        public @Unsigned long @Size(value=8) [] fixed_4k;
        public @Unsigned long deftype;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_pmu")
    @NotUsableInJava
    public static class kvm_pmu
    extends Struct {
        public char version;
        public @Unsigned int nr_arch_gp_counters;
        public @Unsigned int nr_arch_fixed_counters;
        public @Unsigned int available_event_types;
        public @Unsigned long fixed_ctr_ctrl;
        public @Unsigned long fixed_ctr_ctrl_rsvd;
        public @Unsigned long global_ctrl;
        public @Unsigned long global_status;
        public @Unsigned long @Size(value=2) [] counter_bitmask;
        public @Unsigned long global_ctrl_rsvd;
        public @Unsigned long global_status_rsvd;
        public @Unsigned long reserved_bits;
        public @Unsigned long raw_event_mask;
        public kvm_pmc @Size(value=8) [] gp_counters;
        public kvm_pmc @Size(value=3) [] fixed_counters;
        @InlineUnion(value=27666)
        public @InlineUnion(value=27666) @Unsigned long @Size(value=1) [] reprogram_pmi;
        @InlineUnion(value=27666)
        public @InlineUnion(value=27666) misc.atomic64_t __reprogram_pmi;
        public @Unsigned long @Size(value=1) [] all_valid_pmc_idx;
        public @Unsigned long @Size(value=1) [] pmc_in_use;
        public @Unsigned long ds_area;
        public @Unsigned long pebs_enable;
        public @Unsigned long pebs_enable_rsvd;
        public @Unsigned long pebs_data_cfg;
        public @Unsigned long pebs_data_cfg_rsvd;
        public @Unsigned long host_cross_mapped_mask;
        public boolean need_cleanup;
        public char event_count;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_pmc")
    @NotUsableInJava
    public static class kvm_pmc
    extends Struct {
        public PmcDefinitions.pmc_type type;
        public char idx;
        public boolean is_paused;
        public boolean intr;
        public @Unsigned long counter;
        public @Unsigned long emulated_counter;
        public @Unsigned long eventsel;
        public Ptr<PerfDefinitions.perf_event> perf_event;
        public Ptr<kvm_vcpu> vcpu;
        public @Unsigned long current_config;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu")
    @NotUsableInJava
    public static class kvm_vcpu
    extends Struct {
        public Ptr<runtime.kvm> kvm;
        public PreemptDefinitions.preempt_notifier preempt_notifier;
        public int cpu;
        public int vcpu_id;
        public int vcpu_idx;
        public int ____srcu_idx;
        public int mode;
        public @Unsigned long requests;
        public @Unsigned long guest_debug;
        public runtime.mutex mutex;
        public Ptr<kvm_run> run;
        public runtime.rcuwait wait;
        public Ptr<runtime.pid> pid;
        public int sigset_active;
        public misc.sigset_t sigset;
        public @Unsigned int halt_poll_ns;
        public boolean valid_wakeup;
        public int mmio_needed;
        public int mmio_read_completed;
        public int mmio_is_write;
        public int mmio_cur_fragment;
        public int mmio_nr_fragments;
        public kvm_mmio_fragment @Size(value=2) [] mmio_fragments;
        public AsyncDefinitions.async_pf_of_kvm_vcpu async_pf;
        public misc.spin_loop_of_kvm_vcpu spin_loop;
        public boolean wants_to_run;
        public boolean preempted;
        public boolean ready;
        public boolean scheduled_out;
        public kvm_vcpu_arch arch;
        public kvm_vcpu_stat stat;
        public char @Size(value=48) [] stats_id;
        public kvm_dirty_ring dirty_ring;
        public Ptr<kvm_memory_slot> last_used_slot;
        public @Unsigned long last_used_slot_gen;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_mmu")
    @NotUsableInJava
    public static class kvm_mmu
    extends Struct {
        public Ptr<?> get_guest_pgd;
        public Ptr<?> get_pdptr;
        public Ptr<?> page_fault;
        public Ptr<?> inject_page_fault;
        public Ptr<?> gva_to_gpa;
        public Ptr<?> sync_spte;
        public kvm_mmu_root_info root;
        public kvm_cpu_role cpu_role;
        public kvm_mmu_page_role root_role;
        public @Unsigned int pkru_mask;
        public kvm_mmu_root_info @Size(value=3) [] prev_roots;
        public char @Size(value=16) [] permissions;
        public Ptr<@Unsigned Long> pae_root;
        public Ptr<@Unsigned Long> pml4_root;
        public Ptr<@Unsigned Long> pml5_root;
        public misc.rsvd_bits_validate shadow_zero_check;
        public misc.rsvd_bits_validate guest_rsvd_check;
        public @Unsigned long @Size(value=4) [] pdptrs;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_mmu_root_info")
    @NotUsableInJava
    public static class kvm_mmu_root_info
    extends Struct {
        public @Unsigned @OriginalName(value="gpa_t") long pgd;
        public @Unsigned @OriginalName(value="hpa_t") long hpa;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_pio_request")
    @NotUsableInJava
    public static class kvm_pio_request
    extends Struct {
        public @Unsigned long linear_rip;
        public @Unsigned long count;
        public int in;
        public int port;
        public int size;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_rmap_head")
    @NotUsableInJava
    public static class kvm_rmap_head
    extends Struct {
        public @Unsigned long val;
    }

    @Type(noCCodeGeneration=true, cType="union kvm_cpu_role")
    @NotUsableInJava
    public static class kvm_cpu_role
    extends Union {
        public @Unsigned long as_u64;
        public AnonDefinitions.anon_member_of_kvm_cpu_role anon1;
    }

    @Type(noCCodeGeneration=true, cType="union kvm_mmu_extended_role")
    @NotUsableInJava
    public static class kvm_mmu_extended_role
    extends Union {
        public @Unsigned int word;
        public AnonDefinitions.anon_member_of_kvm_mmu_extended_role anon1;
    }

    @Type(noCCodeGeneration=true, cType="union kvm_mmu_page_role")
    @NotUsableInJava
    public static class kvm_mmu_page_role
    extends Union {
        public @Unsigned int word;
        public AnonDefinitions.anon_member_of_kvm_mmu_page_role anon1;
    }

    @Type(noCCodeGeneration=true, cType="enum kvm_reg")
    public static enum kvm_reg implements Enum<kvm_reg>,
    TypedEnum<kvm_reg, Integer>
    {
        VCPU_REGS_RAX,
        VCPU_REGS_RCX,
        VCPU_REGS_RDX,
        VCPU_REGS_RBX,
        VCPU_REGS_RSP,
        VCPU_REGS_RBP,
        VCPU_REGS_RSI,
        VCPU_REGS_RDI,
        VCPU_REGS_R8,
        VCPU_REGS_R9,
        VCPU_REGS_R10,
        VCPU_REGS_R11,
        VCPU_REGS_R12,
        VCPU_REGS_R13,
        VCPU_REGS_R14,
        VCPU_REGS_R15,
        VCPU_REGS_RIP,
        NR_VCPU_REGS,
        VCPU_EXREG_PDPTR,
        VCPU_EXREG_CR0,
        VCPU_EXREG_CR3,
        VCPU_EXREG_CR4,
        VCPU_EXREG_RFLAGS,
        VCPU_EXREG_SEGMENTS,
        VCPU_EXREG_EXIT_INFO_1,
        VCPU_EXREG_EXIT_INFO_2;

    }

    @Type(noCCodeGeneration=true, cType="struct kvm_page_track_notifier_head")
    @NotUsableInJava
    public static class kvm_page_track_notifier_head
    extends Struct {
        public SrcuDefinitions.srcu_struct track_srcu;
        public misc.hlist_head track_notifier_list;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_stat_generic")
    @NotUsableInJava
    public static class kvm_vcpu_stat_generic
    extends Struct {
        public @Unsigned long halt_successful_poll;
        public @Unsigned long halt_attempted_poll;
        public @Unsigned long halt_poll_invalid;
        public @Unsigned long halt_wakeup;
        public @Unsigned long halt_poll_success_ns;
        public @Unsigned long halt_poll_fail_ns;
        public @Unsigned long halt_wait_ns;
        public @Unsigned long @Size(value=32) [] halt_poll_success_hist;
        public @Unsigned long @Size(value=32) [] halt_poll_fail_hist;
        public @Unsigned long @Size(value=32) [] halt_wait_hist;
        public @Unsigned long blocking;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vm_stat_generic")
    @NotUsableInJava
    public static class kvm_vm_stat_generic
    extends Struct {
        public @Unsigned long remote_tlb_flush;
        public @Unsigned long remote_tlb_flush_requests;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_mmu_memory_cache")
    @NotUsableInJava
    public static class kvm_mmu_memory_cache
    extends Struct {
        public @Unsigned @OriginalName(value="gfp_t") int gfp_zero;
        public @Unsigned @OriginalName(value="gfp_t") int gfp_custom;
        public @Unsigned long init_value;
        public Ptr<KmemDefinitions.kmem_cache> kmem_cache;
        public int capacity;
        public int nobjs;
        public Ptr<Ptr<?>> objects;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_memory_slot")
    @NotUsableInJava
    public static class kvm_memory_slot
    extends Struct {
        public misc.hlist_node @Size(value=2) [] id_node;
        public IntervalDefinitions.interval_tree_node @Size(value=2) [] hva_node;
        public RbDefinitions.rb_node @Size(value=2) [] gfn_node;
        public @Unsigned @OriginalName(value="gfn_t") long base_gfn;
        public @Unsigned long npages;
        public Ptr<@Unsigned Long> dirty_bitmap;
        public kvm_arch_memory_slot arch;
        public @Unsigned long userspace_addr;
        public @Unsigned int flags;
        public short id;
        public @Unsigned short as_id;
        public misc.gmem_of_kvm_memory_slot gmem;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_stats_desc")
    @NotUsableInJava
    public static class kvm_stats_desc
    extends Struct {
        public @Unsigned int flags;
        public short exponent;
        public @Unsigned short size;
        public @Unsigned int offset;
        public @Unsigned int bucket_size;
        public char @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_dirty_gfn")
    @NotUsableInJava
    public static class kvm_dirty_gfn
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int slot;
        public @Unsigned long offset;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_enc_region")
    @NotUsableInJava
    public static class kvm_enc_region
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_coalesced_mmio_ring")
    @NotUsableInJava
    public static class kvm_coalesced_mmio_ring
    extends Struct {
        public @Unsigned int first;
        public @Unsigned int last;
        public kvm_coalesced_mmio @Size(value=0) [] coalesced_mmio;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_coalesced_mmio")
    @NotUsableInJava
    public static class kvm_coalesced_mmio
    extends Struct {
        public @Unsigned long phys_addr;
        public @Unsigned int len;
        @InlineUnion(value=27586)
        public @InlineUnion(value=27586) @Unsigned int pad;
        @InlineUnion(value=27586)
        public @InlineUnion(value=27586) @Unsigned int pio;
        public char @Size(value=8) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_run")
    @NotUsableInJava
    public static class kvm_run
    extends Struct {
        public char request_interrupt_window;
        public char immediate_exit__unsafe;
        public char @Size(value=6) [] padding1;
        public @Unsigned int exit_reason;
        public char ready_for_interrupt_injection;
        public char if_flag;
        public @Unsigned short flags;
        public @Unsigned long cr8;
        public @Unsigned long apic_base;
        @InlineUnion(value=27583)
        public  @InlineUnion(value=27583) HwDefinitions.hw_of_anon_member_of_kvm_run hw;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.fail_entry_of_anon_member_of_kvm_run fail_entry;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.ex_of_anon_member_of_kvm_run ex;
        @InlineUnion(value=27583)
        public  @InlineUnion(value=27583) IoDefinitions.io_of_anon_member_of_kvm_run io;
        @InlineUnion(value=27583)
        public  @InlineUnion(value=27583) DebugDefinitions.debug_of_anon_member_of_kvm_run debug;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.iocsr_io_of_anon_member_of_kvm_run_and_mmio_of_anon_member_of_kvm_run mmio;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.iocsr_io_of_anon_member_of_kvm_run_and_mmio_of_anon_member_of_kvm_run iocsr_io;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.hypercall_of_anon_member_of_kvm_run hypercall;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.tpr_access_of_anon_member_of_kvm_run tpr_access;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.s390_sieic_of_anon_member_of_kvm_run s390_sieic;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) @Unsigned long s390_reset_flags;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.s390_ucontrol_of_anon_member_of_kvm_run s390_ucontrol;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.dcr_of_anon_member_of_kvm_run dcr;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.internal_of_anon_member_of_kvm_run internal;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.emulation_failure_of_anon_member_of_kvm_run emulation_failure;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.osi_of_anon_member_of_kvm_run osi;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.papr_hcall_of_anon_member_of_kvm_run papr_hcall;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.s390_tsch_of_anon_member_of_kvm_run s390_tsch;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.epr_of_anon_member_of_kvm_run epr;
        @InlineUnion(value=27583)
        public  @InlineUnion(value=27583) SystemDefinitions.system_event_of_anon_member_of_kvm_run system_event;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.s390_stsi_of_anon_member_of_kvm_run s390_stsi;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.eoi_of_anon_member_of_kvm_run eoi;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) kvm_hyperv_exit hyperv;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.arm_nisv_of_anon_member_of_kvm_run arm_nisv;
        @InlineUnion(value=27583)
        public  @InlineUnion(value=27583) MsrDefinitions.msr_of_anon_member_of_kvm_run msr;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) kvm_xen_exit xen;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.riscv_sbi_of_anon_member_of_kvm_run riscv_sbi;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) misc.riscv_csr_of_anon_member_of_kvm_run riscv_csr;
        @InlineUnion(value=27583)
        public  @InlineUnion(value=27583) NotifyDefinitions.notify_of_anon_member_of_kvm_run_and_v2_of_jailhouse_setup_data notify;
        @InlineUnion(value=27583)
        public  @InlineUnion(value=27583) MemoryDefinitions.memory_fault_of_anon_member_of_kvm_run memory_fault;
        @InlineUnion(value=27583)
        public @InlineUnion(value=27583) char @Size(value=256) [] padding;
        public @Unsigned long kvm_valid_regs;
        public @Unsigned long kvm_dirty_regs;
        public SDefinitions.s_of_kvm_run s;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_xen_exit")
    @NotUsableInJava
    public static class kvm_xen_exit
    extends Struct {
        public @Unsigned int type;
        public UDefinitions.u_of_kvm_xen_exit u;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_hyperv_exit")
    @NotUsableInJava
    public static class kvm_hyperv_exit
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int pad1;
        public UDefinitions.u_of_kvm_hyperv_exit u;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_xen_hvm_config")
    @NotUsableInJava
    public static class kvm_xen_hvm_config
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int msr;
        public @Unsigned long blob_addr_32;
        public @Unsigned long blob_addr_64;
        public char blob_size_32;
        public char blob_size_64;
        public char @Size(value=30) [] pad2;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_nested_state")
    @NotUsableInJava
    public static class kvm_nested_state
    extends Struct {
        public @Unsigned short flags;
        public @Unsigned short format;
        public @Unsigned int size;
        public misc.hdr_of_kvm_nested_state hdr;
        public DataDefinitions.data_of_kvm_nested_state data;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_svm_nested_state_hdr")
    @NotUsableInJava
    public static class kvm_svm_nested_state_hdr
    extends Struct {
        public @Unsigned long vmcb_pa;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_svm_nested_state_data")
    @NotUsableInJava
    public static class kvm_svm_nested_state_data
    extends Struct {
        public char @Size(value=4096) [] vmcb12;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vmx_nested_state_hdr")
    @NotUsableInJava
    public static class kvm_vmx_nested_state_hdr
    extends Struct {
        public @Unsigned long vmxon_pa;
        public @Unsigned long vmcs12_pa;
        public misc.smm_of_kvm_vmx_nested_state_hdr smm;
        public @Unsigned short pad;
        public @Unsigned int flags;
        public @Unsigned long preemption_timer_deadline;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vmx_nested_state_data")
    @NotUsableInJava
    public static class kvm_vmx_nested_state_data
    extends Struct {
        public char @Size(value=4096) [] vmcs12;
        public char @Size(value=4096) [] shadow_vmcs12;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_sync_regs")
    @NotUsableInJava
    public static class kvm_sync_regs
    extends Struct {
        public kvm_regs regs;
        public kvm_sregs sregs;
        public kvm_vcpu_events events;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_events")
    @NotUsableInJava
    public static class kvm_vcpu_events
    extends Struct {
        public misc.exception_of_kvm_vcpu_events exception;
        public misc.interrupt_of_kvm_vcpu_events interrupt;
        public NmiDefinitions.nmi_of_kvm_vcpu_events nmi;
        public @Unsigned int sipi_vector;
        public @Unsigned int flags;
        public misc.smi_of_kvm_vcpu_events smi;
        public misc.triple_fault_of_kvm_vcpu_events triple_fault;
        public char @Size(value=26) [] reserved;
        public char exception_has_payload;
        public @Unsigned long exception_payload;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_debug_exit_arch")
    @NotUsableInJava
    public static class kvm_debug_exit_arch
    extends Struct {
        public @Unsigned int exception;
        public @Unsigned int pad;
        public @Unsigned long pc;
        public @Unsigned long dr6;
        public @Unsigned long dr7;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_cpuid_entry2")
    @NotUsableInJava
    public static class kvm_cpuid_entry2
    extends Struct {
        public @Unsigned int function;
        public @Unsigned int index;
        public @Unsigned int flags;
        public @Unsigned int eax;
        public @Unsigned int ebx;
        public @Unsigned int ecx;
        public @Unsigned int edx;
        public @Unsigned int @Size(value=3) [] padding;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_sregs")
    @NotUsableInJava
    public static class kvm_sregs
    extends Struct {
        public kvm_segment cs;
        public kvm_segment ds;
        public kvm_segment es;
        public kvm_segment fs;
        public kvm_segment gs;
        public kvm_segment ss;
        public kvm_segment tr;
        public kvm_segment ldt;
        public kvm_dtable gdt;
        public kvm_dtable idt;
        public @Unsigned long cr0;
        public @Unsigned long cr2;
        public @Unsigned long cr3;
        public @Unsigned long cr4;
        public @Unsigned long cr8;
        public @Unsigned long efer;
        public @Unsigned long apic_base;
        public @Unsigned long @Size(value=4) [] interrupt_bitmap;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_dtable")
    @NotUsableInJava
    public static class kvm_dtable
    extends Struct {
        public @Unsigned long base;
        public @Unsigned short limit;
        public @Unsigned short @Size(value=3) [] padding;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_segment")
    @NotUsableInJava
    public static class kvm_segment
    extends Struct {
        public @Unsigned long base;
        public @Unsigned int limit;
        public @Unsigned short selector;
        public char type;
        public char present;
        public char dpl;
        public char db;
        public char s;
        public char l;
        public char g;
        public char avl;
        public char unusable;
        public char padding;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_regs")
    @NotUsableInJava
    public static class kvm_regs
    extends Struct {
        public @Unsigned long rax;
        public @Unsigned long rbx;
        public @Unsigned long rcx;
        public @Unsigned long rdx;
        public @Unsigned long rsi;
        public @Unsigned long rdi;
        public @Unsigned long rsp;
        public @Unsigned long rbp;
        public @Unsigned long r8;
        public @Unsigned long r9;
        public @Unsigned long r10;
        public @Unsigned long r11;
        public @Unsigned long r12;
        public @Unsigned long r13;
        public @Unsigned long r14;
        public @Unsigned long r15;
        public @Unsigned long rip;
        public @Unsigned long rflags;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_task_sleep_head")
    @NotUsableInJava
    public static class kvm_task_sleep_head
    extends Struct {
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public misc.hlist_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_task_sleep_node")
    @NotUsableInJava
    public static class kvm_task_sleep_node
    extends Struct {
        public misc.hlist_node link;
        public misc.swait_queue_head wq;
        public @Unsigned int token;
        public int cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_vcpu_pv_apf_data")
    @NotUsableInJava
    public static class kvm_vcpu_pv_apf_data
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int token;
        public char @Size(value=56) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct kvm_steal_time")
    @NotUsableInJava
    public static class kvm_steal_time
    extends Struct {
        public @Unsigned long steal;
        public @Unsigned int version;
        public @Unsigned int flags;
        public char preempted;
        public char @Size(value=3) [] u8_pad;
        public @Unsigned int @Size(value=11) [] pad;
    }
}

