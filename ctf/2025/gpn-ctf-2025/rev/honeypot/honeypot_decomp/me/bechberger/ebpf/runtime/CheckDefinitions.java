/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AgpDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CdromDefinitions;
import me.bechberger.ebpf.runtime.ChargerDefinitions;
import me.bechberger.ebpf.runtime.CleanupDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EhciDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.HtabDefinitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KeyringDefinitions;
import me.bechberger.ebpf.runtime.KfenceDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.LandlockDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.QdiscDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.RegDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ToDefinitions;
import me.bechberger.ebpf.runtime.TpmDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CheckDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__check_heap_object((const void*)$arg1, $arg2, (const struct slab*)$arg3, $arg4)")
    public static void __check_heap_object(Ptr<?> ptr, @Unsigned long n, Ptr<runtime.slab> slab2, boolean to_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__check_object_size((const void*)$arg1, $arg2, $arg3)")
    public static void __check_object_size(Ptr<?> ptr, @Unsigned long n, boolean to_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __check_quirks_intel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __check_shared_memory(@Unsigned long alloc_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_access_path((const const struct landlock_ruleset*)$arg1, (const const struct path*)$arg2, $arg3)")
    public static int check_access_path(Ptr<LandlockDefinitions.landlock_ruleset> domain, Ptr<runtime.path> path2, @Unsigned @OriginalName(value="access_mask_t") short access_request) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_btf_kconfigs((const struct module*)$arg1, (const u8*)$arg2)")
    public static int check_btf_kconfigs(Ptr<runtime.module> module2, String feature) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_can_switch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_cand_cache> check_cand_cache(Ptr<BpfDefinitions.bpf_cand_cache> cands, Ptr<Ptr<BpfDefinitions.bpf_cand_cache>> cache, int cache_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static CleanupDefinitions.cleanup_prefix_rt_t check_cleanup_prefix_route(Ptr<Inet6Definitions.inet6_ifaddr> ifp, Ptr<@Unsigned Long> expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_command((const u8*)$arg1)")
    public static int check_command(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_cpu_itimer(Ptr<TaskDefinitions.task_struct> tsk, Ptr<CpuDefinitions.cpu_itimer> it, Ptr<@Unsigned Long> expires, @Unsigned long cur_time, int signo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_ctrlrecip(Ptr<UsbDefinitions.usb_dev_state> ps, @Unsigned int requesttype, @Unsigned int request2, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_dev_quirk(int num, int slot2, int func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_heap_object((const void*)$arg1, $arg2, $arg3)")
    public static void check_heap_object(Ptr<?> ptr, @Unsigned long n, boolean to_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_hwpoisoned_entry(PteDefinitions.pte_t pte, @Unsigned long addr2, short shift, @Unsigned long poisoned_pfn, Ptr<ToDefinitions.to_kill> tk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)check_igot_inode($arg1, $arg2))")
    public static String check_igot_inode(Ptr<runtime.inode> inode2,  @OriginalName(value="ext4_iget_flags") runtime.EXT4_IGET flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_init_srcu_struct(Ptr<SrcuDefinitions.srcu_struct> ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_msr(@Unsigned long msr2, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_object(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2, Ptr<?> object, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_panic_on_warn((const u8*)$arg1)")
    public static void check_panic_on_warn(String origin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_pointer($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int check_pointer(Ptr<String> buf, String end, Ptr<?> ptr, misc.printf_spec spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_port_resume_type(Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_hub> hub, int port1, int status, @Unsigned short portchange, @Unsigned short portstatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_preempt_wakeup_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int wake_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_process_timers(Ptr<TaskDefinitions.task_struct> tsk, Ptr<ListDefinitions.list_head> firing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_pte(Ptr<PageDefinitions.page_vma_mapped_walk> pvmw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_reset_of_active_ep(Ptr<UsbDefinitions.usb_device> udev, @Unsigned int epnum, String ioctl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_root_hub_suspended(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_sb_changes(Ptr<runtime.mddev> mddev2, Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_slab(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_slots() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_sparse_vm_area(Ptr<VmDefinitions.vm_struct> area, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_stack_object((const void*)$arg1, $arg2)")
    public static int check_stack_object(Ptr<?> obj, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_tick_dependency(Ptr<AtomicDefinitions.atomic_t> dep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_timer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_tylersburg_isoch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_xstate_in_sigframe(Ptr<misc.fxregs_state> fxbuf, Ptr<misc._fpx_sw_bytes> fx_sw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __check_sticky(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_all_holdout_tasks(Ptr<ListDefinitions.list_head> hop, boolean needreport, Ptr<@OriginalName(value="bool") Boolean> firstreport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_all_holdout_tasks_trace(Ptr<ListDefinitions.list_head> hop, boolean needreport, Ptr<@OriginalName(value="bool") Boolean> firstreport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_and_free_fields(Ptr<BpfDefinitions.bpf_htab> htab, Ptr<HtabDefinitions.htab_elem> elem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_canary((const struct kfence_metadata*)$arg1)")
    public static void check_canary(Ptr<KfenceDefinitions.kfence_metadata> meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_connector_changed(Ptr<DrmDefinitions.drm_connector> connector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_corruption(Ptr<misc.work_struct> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_edid(String edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_fully_established(Ptr<MptcpDefinitions.mptcp_sock> msk, Ptr<runtime.sock> ssk, Ptr<MptcpDefinitions.mptcp_subflow_context> subflow, Ptr<SkDefinitions.sk_buff> skb, Ptr<MptcpDefinitions.mptcp_options_received> mp_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_holdout_task(Ptr<TaskDefinitions.task_struct> t, boolean needreport, Ptr<@OriginalName(value="bool") Boolean> firstreport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_hotplug_memory_range(@Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_hung_task(Ptr<TaskDefinitions.task_struct> t, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_hung_uninterruptible_tasks(@Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_kill_permission(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_kprobe_address_safe(Ptr<runtime.kprobe> p, Ptr<Ptr<runtime.module>> probed_mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_lifetime(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_loop(Ptr<runtime.Qdisc> q, Ptr<runtime.Qdisc> p, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_loop_fn(Ptr<runtime.Qdisc> q, @Unsigned long cl, Ptr<QdiscDefinitions.qdisc_walker> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int check_mcfg_resource(Ptr<AcpiDefinitions.acpi_resource> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_memblock_offlined_cb(Ptr<MemoryDefinitions.memory_block> mem, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_move_unevictable_folios(Ptr<FolioDefinitions.folio_batch> fbatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_no_memblock_for_node_cb(Ptr<MemoryDefinitions.memory_block> mem, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_offline(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<?> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.parsed_partitions> check_partition(Ptr<runtime.gendisk> hd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_ram_in_range_map(@Unsigned long start_pfn, @Unsigned long nr_pages, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_stack(@Unsigned long ip, Ptr<@Unsigned Long> stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_tsc_unstable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_x2apic() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_xattrs($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, $arg7)")
    public static int check_xattrs(Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh, Ptr<Ext4Definitions.ext4_xattr_entry> entry, Ptr<?> end, Ptr<?> value_start, String function, @Unsigned int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__check_buffer_access($arg1, (const u8*)$arg2, (const struct bpf_reg_state*)$arg3, $arg4, $arg5, $arg6)")
    public static int __check_buffer_access(Ptr<BpfDefinitions.bpf_verifier_env> env, String buf_info, Ptr<BpfDefinitions.bpf_reg_state> reg, int regno, int off, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __check_limbo(Ptr<RdtDefinitions.rdt_mon_domain> d, boolean force_free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __check_mem_access(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno, int off, int size, @Unsigned int mem_size, boolean zero_size_allowed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__check_ptr_off_reg($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4)")
    public static int __check_ptr_off_reg(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, int regno, boolean fixed_off_ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __check_reg_arg(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> regs, @Unsigned int regno, RegDefinitions.reg_arg_type t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_alu_op(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_atomic(Ptr<BpfDefinitions.bpf_verifier_env> env, int insn_idx, Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_attach_btf_id(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_brk_limits(@Unsigned long addr2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_btf_line($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int check_btf_line(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_attr> attr2,  @OriginalName(value="bpfptr_t") misc.sockptr_t uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_cfg(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_cgroupfs_options(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_class_changed($arg1, $arg2, (const struct sched_class*)$arg3, $arg4)")
    public static void check_class_changed(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<SchedDefinitions.sched_class> prev_class, int oldprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_class_changing($arg1, $arg2, (const struct sched_class*)$arg3)")
    public static void check_class_changing(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<SchedDefinitions.sched_class> prev_class) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_cond_jmp_op(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2, Ptr<Integer> insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_core_relo($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int check_core_relo(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_attr> attr2,  @OriginalName(value="bpfptr_t") misc.sockptr_t uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_cpu_stall(Ptr<RcuDefinitions.rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_cpu_stall_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_early_ioremap_leak() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_enable_amd_mmconf_dmi() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_events() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_for_audio_disc($arg1, (const struct cdrom_device_ops*)$arg2)")
    public static int check_for_audio_disc(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<CdromDefinitions.cdrom_device_ops> cdo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_func_arg($arg1, $arg2, $arg3, (const struct bpf_func_proto*)$arg4, $arg5)")
    public static int check_func_arg(Ptr<BpfDefinitions.bpf_verifier_env> env, @Unsigned int arg2, Ptr<BpfDefinitions.bpf_call_arg_meta> meta, Ptr<BpfDefinitions.bpf_func_proto> fn, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_func_arg_reg_off($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4)")
    public static int check_func_arg_reg_off(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, int regno, BpfDefinitions.bpf_arg_type arg_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_func_proto((const struct bpf_func_proto*)$arg1, $arg2)")
    public static int check_func_proto(Ptr<BpfDefinitions.bpf_func_proto> fn, int func_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_helper_call(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2, Ptr<Integer> insn_idx_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_helper_mem_access(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno, int access_size, BpfDefinitions.bpf_access_type access_type, boolean zero_size_allowed, Ptr<BpfDefinitions.bpf_call_arg_meta> meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_ids(@Unsigned int old_id, @Unsigned int cur_id, Ptr<BpfDefinitions.bpf_idmap> idmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_insane_mems_config(Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_interval(Ptr<runtime.urb> urb2, Ptr<XhciDefinitions.xhci_ep_ctx> ep_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_intr_schedule(Ptr<EhciDefinitions.ehci_hcd> ehci, @Unsigned int frame, @Unsigned int uframe, Ptr<EhciDefinitions.ehci_qh> qh, Ptr<@Unsigned Integer> c_maskp, Ptr<EhciDefinitions.ehci_tt> tt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_irq_resend(Ptr<IrqDefinitions.irq_desc> desc, boolean inject) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_irq_src(Ptr<misc.mpc_intsrc> m, Ptr<Integer> nr_m_spare) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_kfunc_args(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_kfunc_call_arg_meta> meta, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_kfunc_call(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2, Ptr<Integer> insn_idx_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_kfunc_mem_size_reg(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, @Unsigned int regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_ld_abs(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_ld_imm(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_leaked_objs(Ptr<BpfDefinitions.bpf_mem_alloc> ma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_locality(Ptr<TpmDefinitions.tpm_chip> chip, int l) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_map_access(Ptr<BpfDefinitions.bpf_verifier_env> env, @Unsigned int regno, int off, int size, boolean zero_size_allowed, BpfDefinitions.bpf_access_src src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_map_access_type(Ptr<BpfDefinitions.bpf_verifier_env> env, @Unsigned int regno, int off, int size, BpfDefinitions.bpf_access_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_map_func_compatibility(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_map> map2, int func_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_map_prog_compatibility(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_max_stack_depth_subprog(Ptr<BpfDefinitions.bpf_verifier_env> env, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_mem_access(Ptr<BpfDefinitions.bpf_verifier_env> env, int insn_idx, @Unsigned int regno, int off, int bpf_size, BpfDefinitions.bpf_access_type t, int value_regno, boolean strict_alignment_once, boolean is_ldsx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_mem_cache(Ptr<BpfDefinitions.bpf_mem_cache> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_mem_reg(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, @Unsigned int regno, @Unsigned int mem_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_mem_region_access(Ptr<BpfDefinitions.bpf_verifier_env> env, @Unsigned int regno, int off, int size, @Unsigned int mem_size, boolean zero_size_allowed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_mem_size_reg(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, @Unsigned int regno, BpfDefinitions.bpf_access_type access_type, boolean zero_size_allowed, Ptr<BpfDefinitions.bpf_call_arg_meta> meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_packet_access(Ptr<BpfDefinitions.bpf_verifier_env> env, @Unsigned int regno, int off, int size, boolean zero_size_allowed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_pcc_chan(int pcc_ss_id, boolean chk_err_bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_physptr(Ptr<misc.mpf_intel> mpf, @Unsigned int early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_pseudo_btf_id(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2, Ptr<BpfDefinitions.bpf_insn_aux_data> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_ptr_alignment($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4, $arg5)")
    public static int check_ptr_alignment(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, int off, int size, boolean strict_alignment_once) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_ptr_to_btf_access(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> regs, int regno, int off, int size, BpfDefinitions.bpf_access_type atype, int value_regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_ptr_to_map_access(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> regs, int regno, int off, int size, BpfDefinitions.bpf_access_type atype, int value_regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_ptrace_options(@Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_reference_leak(Ptr<BpfDefinitions.bpf_verifier_env> env, boolean exception_exit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_reg_const_str(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, @Unsigned int regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_reg_sane_offset($arg1, (const struct bpf_reg_state*)$arg2, $arg3)")
    public static boolean check_reg_sane_offset(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, BpfDefinitions.bpf_reg_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_reg_type($arg1, $arg2, $arg3, (const unsigned int*)$arg4, $arg5)")
    public static int check_reg_type(Ptr<BpfDefinitions.bpf_verifier_env> env, @Unsigned int regno, BpfDefinitions.bpf_arg_type arg_type, Ptr<@Unsigned Integer> arg_btf_id, Ptr<BpfDefinitions.bpf_call_arg_meta> meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_return_code($arg1, $arg2, (const u8*)$arg3)")
    public static int check_return_code(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno, String reg_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_segment(@Unsigned short seg, Ptr<runtime.device> dev, String estr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_signature((volatile const void*)$arg1, (const u8*)$arg2, $arg3)")
    public static int check_signature(Ptr<?> io_addr, String signature, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_slow_task(Ptr<TaskDefinitions.task_struct> t, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_stack_access_within_bounds(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno, int off, int access_size, BpfDefinitions.bpf_access_src src, BpfDefinitions.bpf_access_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_stack_range_initialized(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno, int off, int access_size, boolean zero_size_allowed, BpfDefinitions.bpf_access_src type2, Ptr<BpfDefinitions.bpf_call_arg_meta> meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_stack_read_fixed_off(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> reg_state, int off, int size, int dst_regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_stack_write_fixed_off(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> state2, int off, int size, int value_regno, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_stack_write_var_off(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> state2, int ptr_regno, int off, int size, int value_regno, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_struct_ops_btf_id(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_subprogs(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_tsc_sync_source(Ptr<?> __cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_tsc_sync_target() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="cycles_t") long check_tsc_warp(@Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_tty_count($arg1, (const u8*)$arg2)")
    public static void check_tty_count(Ptr<TtyDefinitions.tty_struct> tty, String routine) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_via_agp3(Ptr<AgpDefinitions.agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_vma_flags(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long gup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_zeroed_user((const void*)$arg1, $arg2)")
    public static int check_zeroed_user(Ptr<?> from, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __check_for_non_generic_match(Ptr<DeviceDefinitions.device_driver> drv, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_acpi_ids(Ptr<AcpiDefinitions.acpi_processor> pr_backup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_acpi_tpm2(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.key> check_cached_key(Ptr<KeyringDefinitions.keyring_search_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_charging_duration(Ptr<ChargerDefinitions.charger_manager> cm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_dmar_capabilities(Ptr<IntelDefinitions.intel_iommu> a, Ptr<IntelDefinitions.intel_iommu> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_flush_dependency(Ptr<WorkqueueDefinitions.workqueue_struct> target_wq, Ptr<misc.work_struct> target_work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_free_space(Ptr<misc.bsd_acct_struct> acct2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int check_hotplug(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> context2, Ptr<Ptr<?>> rv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_hw_exists(Ptr<runtime.pmu> pmu2, Ptr<@Unsigned Long> cntr_mask, Ptr<@Unsigned Long> fixed_cntr_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_load_and_stores((const struct sock_filter*)$arg1, $arg2)")
    public static int check_load_and_stores(Ptr<SockDefinitions.sock_filter> filter, int flen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_modstruct_version((const struct load_info*)$arg1, $arg2)")
    public static int check_modstruct_version(Ptr<LoadDefinitions.load_info> info2, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_null_seg_clears_base(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_one_child(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_opal_support(Ptr<OpalDefinitions.opal_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_security_state(Ptr<runtime.nvdimm> nvdimm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_supported_cpu(Ptr<?> _rc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_tboot_version() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_track_val_changed(@Unsigned long track_val, @Unsigned long var_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_track_val_max(@Unsigned long track_val, @Unsigned long var_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void check_usemap_section_nr(int nid, Ptr<MemDefinitions.mem_section_usage> usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_var_refs(Ptr<HistDefinitions.hist_trigger_data> hist_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_wx_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int check_wx_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean check_xstate_against_struct(int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="check_zero_holes((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int check_zero_holes(Ptr<runtime.btf> btf2, Ptr<BtfDefinitions.btf_type> t, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct check_loop_arg")
    @NotUsableInJava
    public static class check_loop_arg
    extends Struct {
        public QdiscDefinitions.qdisc_walker w;
        public Ptr<runtime.Qdisc> p;
        public int depth;
    }

    @Type(noCCodeGeneration=true, cType="struct check_mount")
    @NotUsableInJava
    public static class check_mount
    extends Struct {
        public Ptr<runtime.vfsmount> mnt;
        public @Unsigned int mounted;
    }
}

