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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.CperDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.DynDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.GnttabDefinitions;
import me.bechberger.ebpf.runtime.JumpDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LoopDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.PushDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.RethookDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UprobeDefinitions;
import me.bechberger.ebpf.runtime.VdsoDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ArchDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_add_memory(int nid, @Unsigned long start, @Unsigned long size, Ptr<misc.mhp_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_apei_enable_cmcff(Ptr<AcpiDefinitions.acpi_hest_header> hest_hdr, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_apei_report_mem_error(int sev, Ptr<CperDefinitions.cper_sec_mem_err> mem_err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_asym_cpu_priority(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arch_bpf_stack_walk((_Bool (*)(void*, long long unsigned int, long long unsigned int, long long unsigned int))$arg1, $arg2)")
    public static void arch_bpf_stack_walk(Ptr<?> consume_fn, Ptr<?> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_cpuhp_cleanup_dead_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_cpuhp_cleanup_kick_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_cpuhp_init_parallel_bringup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_cpuhp_sync_state_poll() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int arch_crash_get_elfcorehdr_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_crash_handle_hotplug_event(Ptr<runtime.kimage> image, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_crash_hotplug_support(Ptr<runtime.kimage> image, @Unsigned long kexec_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int arch_dynirq_lower_bound(@Unsigned int from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_early_ioapic_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_enter_lazy_mmu_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_ftrace_trampoline_free(Ptr<FtraceDefinitions.ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> arch_ftrace_trampoline_func(Ptr<FtraceDefinitions.ftrace_ops> ops, Ptr<DynDefinitions.dyn_ftrace> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_ftrace_update_code(int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_ftrace_update_trampoline(Ptr<FtraceDefinitions.ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_get_random_longs(Ptr<@Unsigned Long> v, @Unsigned long max_longs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_get_random_seed_longs(Ptr<@Unsigned Long> v, @Unsigned long max_longs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_is_platform_page(@Unsigned long paddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_leave_lazy_mmu_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_memory_failure(@Unsigned long pfn, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_mmap_rnd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int arch_mod_section_prepend(Ptr<runtime.module> mod, @Unsigned int section) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short arch_node_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_pick_mmap_layout(Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.rlimit> rlim_stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_post_acpi_subsys_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_prctl_spec_ctrl_get(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long which) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_prctl_spec_ctrl_set(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long which, @Unsigned long ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_prepare_kprobe_ftrace(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_proc_pid_thread_features(Ptr<SeqDefinitions.seq_file> m, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long arch_ptrace(Ptr<TaskDefinitions.task_struct> child, long request2, @Unsigned long addr2, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_remove_memory(@Unsigned long start, @Unsigned long size, Ptr<misc.vmem_altmap> altmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_reserve_mem_area(@Unsigned @OriginalName(value="acpi_physical_address") long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_resume_nosmt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_seccomp_spec_mitigate(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_smt_update() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_stack_walk(@OriginalName(value="stack_trace_consume_fn") Ptr<?> consume_entry, Ptr<?> cookie, Ptr<TaskDefinitions.task_struct> task2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_stack_walk_reliable(@OriginalName(value="stack_trace_consume_fn") Ptr<?> consume_entry, Ptr<?> cookie, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arch_stack_walk_user($arg1, $arg2, (const struct pt_regs*)$arg3)")
    public static void arch_stack_walk_user(@OriginalName(value="stack_trace_consume_fn") Ptr<?> consume_entry, Ptr<?> cookie, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_thaw_secondary_cpus_begin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_thaw_secondary_cpus_end() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_tlbbatch_flush(Ptr<arch_tlbflush_unmap_batch> batch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_touch_nmi_watchdog() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)arch_vma_name($arg1))")
    public static String arch_vma_name(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="kprobe_opcode_t") Character> arch_adjust_kprobe_addr(@Unsigned long addr2, @Unsigned long offset, Ptr<@OriginalName(value="bool") Boolean> on_func_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_cpuhp_kick_ap_alive(@Unsigned int cpu2, Ptr<TaskDefinitions.task_struct> tidle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_crash_save_vmcoreinfo() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_disable_smp_support() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_dup_mmap(Ptr<MmDefinitions.mm_struct> oldmm, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_dup_task_struct(Ptr<TaskDefinitions.task_struct> dst, Ptr<TaskDefinitions.task_struct> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arch_ftrace_match_adjust($arg1, (const u8*)$arg2)")
    public static String arch_ftrace_match_adjust(String str, String search2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_ftrace_ops_list_func(@Unsigned long ip, @Unsigned long parent_ip, Ptr<FtraceDefinitions.ftrace_ops> op, Ptr<FtraceDefinitions.ftrace_regs> fregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static runtime.range arch_get_mappable_range() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String arch_get_platform_mac_address() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_hugetlb_valid_size(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_invalidate_pmem(Ptr<?> addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_irq_stat() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_irq_stat_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_irq_work_raise() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arch_kexec_apply_relocations_add($arg1, $arg2, (const elf64_shdr*)$arg3, (const elf64_shdr*)$arg4)")
    public static int arch_kexec_apply_relocations_add(Ptr<misc.purgatory_info> pi, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> section, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> relsec, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> symtabsec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_kexec_post_alloc_pages(Ptr<?> vaddr, @Unsigned int pages, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_kexec_pre_free_pages(Ptr<?> vaddr, @Unsigned int pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_kexec_protect_crashkres() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_kexec_unprotect_crashkres() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_kimage_file_post_load_cleanup(Ptr<runtime.kimage> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_kprobe_get_kallsym(Ptr<@Unsigned Integer> symnum, Ptr<@Unsigned Long> value, String type2, String sym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_max_swapfile_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_phys_wc_add(@Unsigned long base, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_phys_wc_del(int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_phys_wc_index(int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_populate_kprobe_blacklist() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_release_task_struct(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_remove_reservations(Ptr<runtime.resource> avail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_report_meminfo(Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_show_interrupts(Ptr<SeqDefinitions.seq_file> p, int prec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_syscall_addr(int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arch_syscall_match_sym_name((const u8*)$arg1, (const u8*)$arg2)")
    public static boolean arch_syscall_match_sym_name(String sym, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_task_cache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_update_cpu_topology() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_uprobe_abort_xol(Ptr<arch_uprobe> auprobe, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_uprobe_analyze_insn(Ptr<arch_uprobe> auprobe, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_uprobe_exception_notify(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_uprobe_post_xol(Ptr<arch_uprobe> auprobe, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_uprobe_pre_xol(Ptr<arch_uprobe> auprobe, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_uprobe_skip_sstep(Ptr<arch_uprobe> auprobe, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> arch_uprobe_trampoline(Ptr<@Unsigned Long> psize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_uprobe_xol_was_trapped(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_uretprobe_hijack_return_addr(@Unsigned long trampoline_vaddr, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_uretprobe_is_alive(Ptr<misc.return_instance> ret, misc.rp_check ctx, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_within_kprobe_blacklist(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_xen_unpopulated_init(Ptr<Ptr<runtime.resource>> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int arch_acpi_add_auto_dep(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_align_stack(@Unsigned long sp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_apei_report_x86_error(Ptr<CperDefinitions.cper_ia_proc_ctx> ctx_info, @Unsigned long lapic_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_bp_generic_fields(int x86_len, int x86_type, Ptr<Integer> gen_len, Ptr<Integer> gen_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_check_bp_in_kernelspace(Ptr<arch_hw_breakpoint> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_cpu_idle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_cpu_idle_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_cpu_idle_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_do_signal_or_restart(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_early_irq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_efi_call_virt_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_efi_call_virt_teardown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_enable_hybrid_capacity_scale() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int arch_freq_get_on_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const const u8**)arch_get_ima_policy())")
    public static Ptr<String> arch_get_ima_policy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_gnttab_init(@Unsigned long nr_shared, @Unsigned long nr_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_gnttab_map_shared(Ptr<@Unsigned Long> frames, @Unsigned long nr_gframes, @Unsigned long max_nr_gframes, Ptr<Ptr<?>> __shared) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_gnttab_map_status(Ptr<@Unsigned @OriginalName(value="uint64_t") Long> frames, @Unsigned long nr_gframes, @Unsigned long max_nr_gframes, Ptr<Ptr<@Unsigned @OriginalName(value="grant_status_t") Short>> __shared) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_gnttab_unmap(Ptr<?> shared, @Unsigned long nr_gframes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_gnttab_valloc(Ptr<GnttabDefinitions.gnttab_vm_area> area, @Unsigned int nr_frames) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_hibernation_header_restore(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_hibernation_header_save(Ptr<?> addr2, @Unsigned int max_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_ima_get_secureboot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_install_hw_breakpoint(Ptr<PerfDefinitions.perf_event> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_jump_entry_size(Ptr<JumpDefinitions.jump_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_jump_label_transform(Ptr<JumpDefinitions.jump_entry> entry, JumpDefinitions.jump_label_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_jump_label_transform_apply() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_jump_label_transform_queue(Ptr<JumpDefinitions.jump_entry> entry, JumpDefinitions.jump_label_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_kdebugfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_match_cpu_phys_id(int cpu2, @Unsigned long phys_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_memremap_can_ram_remap(@Unsigned @OriginalName(value="resource_size_t") long phys_addr, @Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_mon_domain_online(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_mon_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_probe_nr_irqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_randomize_brk(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_scale_cpu_capacity(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_scale_freq_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_set_cpu_capacity(int cpu2, @Unsigned long cap, @Unsigned long max_cap, @Unsigned long cap_freq, @Unsigned long base_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_set_max_freq_ratio(boolean turbo_disabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_setup_new_exec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_sort_irqchip_probe(Ptr<AcpiDefinitions.acpi_probe_entry> ap_head, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_suspend_disable_irqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_suspend_enable_irqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_uninstall_hw_breakpoint(Ptr<PerfDefinitions.perf_event> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_uprobe_copy_ixol(Ptr<runtime.page> page2, @Unsigned long vaddr, Ptr<?> src, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_uprobe_ignore(Ptr<arch_uprobe> aup, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_wb_cache_pmem(Ptr<?> addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __arch_override_mprotect_pkey(Ptr<VmDefinitions.vm_area_struct> vma, int prot, int pkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__arch_prepare_bpf_trampoline($arg1, $arg2, $arg3, $arg4, (const struct btf_func_model*)$arg5, $arg6, $arg7, $arg8)")
    public static int __arch_prepare_bpf_trampoline(Ptr<BpfDefinitions.bpf_tramp_image> im, Ptr<?> rw_image, Ptr<?> rw_image_end, Ptr<?> image, Ptr<BtfDefinitions.btf_func_model> m, @Unsigned int flags, Ptr<BpfDefinitions.bpf_tramp_links> tlinks, Ptr<?> func_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> arch_alloc_bpf_trampoline(@Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_arm_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arch_bpf_trampoline_size((const struct btf_func_model*)$arg1, $arg2, $arg3, $arg4)")
    public static int arch_bpf_trampoline_size(Ptr<BtfDefinitions.btf_func_model> m, @Unsigned int flags, Ptr<BpfDefinitions.bpf_tramp_links> tlinks, Ptr<?> func_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_check_optimized_kprobe(Ptr<misc.optimized_kprobe> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_check_zapped_pmd(Ptr<VmDefinitions.vm_area_struct> vma, PmdDefinitions.pmd_t pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_check_zapped_pte(Ptr<VmDefinitions.vm_area_struct> vma, PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_check_zapped_pud(Ptr<VmDefinitions.vm_area_struct> vma, PudDefinitions.pud_t pud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_copy_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_cpu_finalize_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_cpu_idle_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_cpu_idle_prepare() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_cpu_is_hotpluggable(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_disarm_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_free_bpf_trampoline(Ptr<?> image, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_get_memory_phys_device(@Unsigned long start_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_get_unmapped_area(Ptr<runtime.file> filp, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long arch_get_unmapped_area_topdown(Ptr<runtime.file> filp, @Unsigned long addr0, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VdsoDefinitions.vdso_data> arch_get_vdso_data(Ptr<?> vvar_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_haltpoll_disable(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_haltpoll_enable(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_init_kprobes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_io_free_memtype_wc(@Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_io_reserve_memtype_wc(@Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_optimize_kprobes(Ptr<ListDefinitions.list_head> oplist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_perf_nmi_is_available() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_perf_update_userpage(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_event_mmap_page> userpg, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_prepare_bpf_dispatcher(Ptr<?> image, Ptr<?> buf, Ptr<Long> funcs, int num_funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arch_prepare_bpf_trampoline($arg1, $arg2, $arg3, (const struct btf_func_model*)$arg4, $arg5, $arg6, $arg7)")
    public static int arch_prepare_bpf_trampoline(Ptr<BpfDefinitions.bpf_tramp_image> im, Ptr<?> image, Ptr<?> image_end, Ptr<BtfDefinitions.btf_func_model> m, @Unsigned int flags, Ptr<BpfDefinitions.bpf_tramp_links> tlinks, Ptr<?> func_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_prepare_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_prepare_optimized_kprobe(Ptr<misc.optimized_kprobe> op, Ptr<runtime.kprobe> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_protect_bpf_trampoline(Ptr<?> image, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_register_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_remove_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_remove_optimized_kprobe(Ptr<misc.optimized_kprobe> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_restore_msi_irqs(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_rethook_fixup_return(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long correct_ret_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_rethook_prepare(Ptr<RethookDefinitions.rethook_node> rh, Ptr<PtDefinitions.pt_regs> regs, boolean mcount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_rethook_trampoline_callback(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_set_user_pkey_access(Ptr<TaskDefinitions.task_struct> tsk, int pkey, @Unsigned long init_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_setup_additional_pages(Ptr<LinuxDefinitions.linux_binprm> bprm, int uses_interp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_static_call_transform(Ptr<?> site, Ptr<?> tramp, Ptr<?> func, boolean tail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean arch_syscall_is_vdso_sigreturn(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_trampoline_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arch_trigger_cpumask_backtrace((const cpumask*)$arg1, $arg2)")
    public static void arch_trigger_cpumask_backtrace(Ptr<@OriginalName(value="cpumask_t") runtime.cpumask> mask, int exclude_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_unoptimize_kprobe(Ptr<misc.optimized_kprobe> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_unoptimize_kprobes(Ptr<ListDefinitions.list_head> oplist, Ptr<ListDefinitions.list_head> done_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arch_unregister_cpu(int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arch_within_optimized_kprobe(Ptr<misc.optimized_kprobe> op, Ptr<@OriginalName(value="kprobe_opcode_t") Character> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct arch_init_data")
    @NotUsableInJava
    public static class arch_init_data
    extends Struct {
        public DrmDefinitions.drm_privacy_screen_lookup lookup;
        public Ptr<?> detect;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_hybrid_cpu_scale")
    @NotUsableInJava
    public static class arch_hybrid_cpu_scale
    extends Struct {
        public @Unsigned long capacity;
        public @Unsigned long freq_ratio;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_lbr_state")
    @NotUsableInJava
    public static class arch_lbr_state
    extends Struct {
        public @Unsigned long lbr_ctl;
        public @Unsigned long lbr_depth;
        public @Unsigned long ler_from;
        public @Unsigned long ler_to;
        public @Unsigned long ler_info;
        public misc.lbr_entry @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_elf_state")
    @NotUsableInJava
    public static class arch_elf_state
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct arch_mbm_state")
    @NotUsableInJava
    public static class arch_mbm_state
    extends Struct {
        public @Unsigned long chunks;
        public @Unsigned long prev_msr;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_io_reserve_memtype_wc_devres")
    @NotUsableInJava
    public static class arch_io_reserve_memtype_wc_devres
    extends Struct {
        public @Unsigned @OriginalName(value="resource_size_t") long start;
        public @Unsigned @OriginalName(value="resource_size_t") long size;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_optimized_insn")
    @NotUsableInJava
    public static class arch_optimized_insn
    extends Struct {
        public @OriginalName(value="kprobe_opcode_t") char @Size(value=4) [] copied_insn;
        public Ptr<@OriginalName(value="kprobe_opcode_t") Character> insn;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct __arch_relative_insn")
    @NotUsableInJava
    public static class __arch_relative_insn
    extends Struct {
        public char op;
        public int raddr;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_specific_insn")
    @NotUsableInJava
    public static class arch_specific_insn
    extends Struct {
        public Ptr<@OriginalName(value="kprobe_opcode_t") Character> insn;
        public @Unsigned int boostable;
        public char size;
        @InlineUnion(value=4150)
        public @InlineUnion(value=4150) char opcode;
        @InlineUnion(value=4150)
        public @InlineUnion(value=4150) misc.jcc_of_anon_member_of_arch_specific_insn jcc;
        @InlineUnion(value=4150)
        public @InlineUnion(value=4150) LoopDefinitions.loop_of_anon_member_of_arch_specific_insn loop;
        @InlineUnion(value=4150)
        public @InlineUnion(value=4150) misc.indirect_of_anon_member_of_arch_specific_insn indirect;
        public int rel32;
        public Ptr<?> emulate_op;
        public int tp_len;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_vcpu_info")
    @NotUsableInJava
    public static class arch_vcpu_info
    extends Struct {
        public @Unsigned long cr2;
        public @Unsigned long pad;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_shared_info")
    @NotUsableInJava
    public static class arch_shared_info
    extends Struct {
        public @Unsigned long max_pfn;
        public @Unsigned @OriginalName(value="xen_pfn_t") long pfn_to_mfn_frame_list_list;
        public @Unsigned long nmi_reason;
        public @Unsigned long p2m_cr3;
        public @Unsigned long p2m_vaddr;
        public @Unsigned long p2m_generation;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_vdso_data")
    @NotUsableInJava
    public static class arch_vdso_data
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct arch_hw_breakpoint")
    @NotUsableInJava
    public static class arch_hw_breakpoint
    extends Struct {
        public @Unsigned long address;
        public @Unsigned long mask;
        public char len;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_uprobe_task")
    @NotUsableInJava
    public static class arch_uprobe_task
    extends Struct {
        public @Unsigned long saved_scratch_register;
        public @Unsigned int saved_trap_nr;
        public @Unsigned int saved_tf;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_uprobe")
    @NotUsableInJava
    public static class arch_uprobe
    extends Struct {
        @InlineUnion(value=595)
        public @InlineUnion(value=595) char @Size(value=16) [] insn;
        @InlineUnion(value=595)
        public @InlineUnion(value=595) char @Size(value=16) [] ixol;
        public Ptr<UprobeDefinitions.uprobe_xol_ops> ops;
        @InlineUnion(value=599)
        public @InlineUnion(value=599) misc.branch_of_anon_member_of_arch_uprobe branch;
        @InlineUnion(value=599)
        public @InlineUnion(value=599) misc.defparam_of_anon_member_of_arch_uprobe defparam;
        @InlineUnion(value=599)
        public @InlineUnion(value=599) PushDefinitions.push_of_anon_member_of_arch_uprobe push;
    }

    @Type(noCCodeGeneration=true, cType="struct arch_tlbflush_unmap_batch")
    @NotUsableInJava
    public static class arch_tlbflush_unmap_batch
    extends Struct {
        public runtime.cpumask cpumask;
    }
}

