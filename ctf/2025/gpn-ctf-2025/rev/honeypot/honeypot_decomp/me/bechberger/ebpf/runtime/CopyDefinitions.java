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
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.ContextDefinitions;
import me.bechberger.ebpf.runtime.DeflateDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.FanotifyDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.GroupDefinitions;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MsgDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PrbDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.SquashfsDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CopyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __copy_io(@Unsigned long clone_flags, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __copy_msghdr(Ptr<runtime.msghdr> kmsg, Ptr<UserDefinitions.user_msghdr> msg, Ptr<Ptr<runtime.sockaddr>> save_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __copy_overflow(int size, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_abs(Ptr<InputDefinitions.input_dev> dev, @Unsigned int dst, @Unsigned int src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_bio_to_actor(Ptr<runtime.bio> bio2, Ptr<SquashfsDefinitions.squashfs_page_actor> actor, int offset, int req_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_cmd_to_buffer(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<IommuDefinitions.iommu_cmd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_compat_msqid_to_user(Ptr<?> buf, Ptr<misc.msqid64_ds> in, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_context_table(Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<misc.root_entry> old_re, Ptr<Ptr<ContextDefinitions.context_entry>> tbl, int bus, boolean ext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_folio_from_user($arg1, (const void*)$arg2, $arg3)")
    public static long copy_folio_from_user(Ptr<runtime.folio> dst_folio, Ptr<?> usr_src, boolean allow_pagefault) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean copy_fpstate_to_sigframe(Ptr<?> buf, Ptr<?> buf_fx, int size, @Unsigned int pkru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_from_kernel_nofault($arg1, (const void*)$arg2, $arg3)")
    public static long copy_from_kernel_nofault(Ptr<?> dst, Ptr<?> src, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_from_kernel_nofault_allowed((const void*)$arg1, $arg2)")
    public static boolean copy_from_kernel_nofault_allowed(Ptr<?> unsafe_src, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_from_read_buf((const struct tty_struct*)$arg1, $arg2, $arg3)")
    public static boolean copy_from_read_buf(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Ptr<Character>> kbp, Ptr<@Unsigned Long> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_from_sockptr_offset(Ptr<?> dst, misc.sockptr_t src, @Unsigned long offset, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_from_user_nofault($arg1, (const void*)$arg2, $arg3)")
    public static long copy_from_user_nofault(Ptr<?> dst, Ptr<?> src, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IpcDefinitions.ipc_namespace> copy_ipcs(@Unsigned long flags, Ptr<UserDefinitions.user_namespace> user_ns, Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_mnt_id_req((const struct mnt_id_req*)$arg1, $arg2)")
    public static int copy_mnt_id_req(Ptr<MntDefinitions.mnt_id_req> req2, Ptr<MntDefinitions.mnt_id_req> kreq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MntDefinitions.mnt_namespace> copy_mnt_ns(@Unsigned long flags, Ptr<MntDefinitions.mnt_namespace> ns, Ptr<UserDefinitions.user_namespace> user_ns, Ptr<FsDefinitions.fs_struct> new_fs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_mount_options((const void*)$arg1)")
    public static Ptr<?> copy_mount_options(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_msghdr_from_user(Ptr<runtime.msghdr> kmsg, Ptr<UserDefinitions.user_msghdr> umsg, Ptr<Ptr<runtime.sockaddr>> save_addr, Ptr<Ptr<runtime.iovec>> iov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_msqid_from_user(Ptr<misc.msqid64_ds> out, Ptr<?> buf, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_msqid_to_user(Ptr<?> buf, Ptr<misc.msqid64_ds> in, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_namespaces(@Unsigned long flags, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_nonpresent_pte(Ptr<MmDefinitions.mm_struct> dst_mm, Ptr<MmDefinitions.mm_struct> src_mm, Ptr<PteDefinitions.pte_t> dst_pte, Ptr<PteDefinitions.pte_t> src_pte, Ptr<VmDefinitions.vm_area_struct> dst_vma, Ptr<VmDefinitions.vm_area_struct> src_vma, @Unsigned long addr2, Ptr<Integer> rss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_ns_info_to_user((const struct mnt_namespace*)$arg1, $arg2, $arg3, $arg4)")
    public static int copy_ns_info_to_user(Ptr<MntDefinitions.mnt_namespace> mnt_ns, Ptr<MntDefinitions.mnt_ns_info> uinfo, @Unsigned long usize, Ptr<MntDefinitions.mnt_ns_info> kinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_p4d_range(Ptr<VmDefinitions.vm_area_struct> dst_vma, Ptr<VmDefinitions.vm_area_struct> src_vma, Ptr<misc.pgd_t> dst_pgd, Ptr<misc.pgd_t> src_pgd, @Unsigned long addr2, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_page_range(Ptr<VmDefinitions.vm_area_struct> dst_vma, Ptr<VmDefinitions.vm_area_struct> src_vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PidDefinitions.pid_namespace> copy_pid_ns(@Unsigned long flags, Ptr<UserDefinitions.user_namespace> user_ns, Ptr<PidDefinitions.pid_namespace> old_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_present_ptes(Ptr<VmDefinitions.vm_area_struct> dst_vma, Ptr<VmDefinitions.vm_area_struct> src_vma, Ptr<PteDefinitions.pte_t> dst_pte, Ptr<PteDefinitions.pte_t> src_pte, PteDefinitions.pte_t pte, @Unsigned long addr2, int max_nr, Ptr<Integer> rss, Ptr<Ptr<runtime.folio>> prealloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_pte_range(Ptr<VmDefinitions.vm_area_struct> dst_vma, Ptr<VmDefinitions.vm_area_struct> src_vma, Ptr<PmdDefinitions.pmd_t> dst_pmd, Ptr<PmdDefinitions.pmd_t> src_pmd, @Unsigned long addr2, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_regset_to_user($arg1, (const struct user_regset_view*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int copy_regset_to_user(Ptr<TaskDefinitions.task_struct> target, Ptr<UserDefinitions.user_regset_view> view, @Unsigned int setno, @Unsigned int offset, @Unsigned int size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_siginfo_to_external($arg1, (const kernel_siginfo*)$arg2)")
    public static void copy_siginfo_to_external(Ptr< @OriginalName(value="siginfo_t") runtime.siginfo> to, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long copy_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_subpage(@Unsigned long addr2, int idx, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_to_kernel_nofault($arg1, (const void*)$arg2, $arg3)")
    public static long copy_to_kernel_nofault(Ptr<?> dst, Ptr<?> src, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_to_user_nofault($arg1, (const void*)$arg2, $arg3)")
    public static long copy_to_user_nofault(Ptr<?> dst, Ptr<?> src, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_translation_tables(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mount> copy_tree(Ptr<runtime.mount> src_root, Ptr<runtime.dentry> dentry2, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_urb_data_to_user(Ptr<Character> userbuffer, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_user_large_folio(Ptr<runtime.folio> dst, Ptr<runtime.folio> src, @Unsigned long addr_hint, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.uts_namespace> copy_utsname(@Unsigned long flags, Ptr<UserDefinitions.user_namespace> user_ns, Ptr<misc.uts_namespace> old_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_xbc_key_value_list(String dst, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__copy_siginfo_from_user32($arg1, $arg2, (const struct compat_siginfo*)$arg3)")
    public static int __copy_siginfo_from_user32(int signo, Ptr<KernelDefinitions.kernel_siginfo> to, Ptr<CompatDefinitions.compat_siginfo> ufrom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__copy_siginfo_to_user32($arg1, (const struct kernel_siginfo*)$arg2)")
    public static int __copy_siginfo_to_user32(Ptr<CompatDefinitions.compat_siginfo> to, Ptr<KernelDefinitions.kernel_siginfo> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __copy_user_nocache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_namespace> copy_cgroup_ns(@Unsigned long flags, Ptr<UserDefinitions.user_namespace> user_ns, Ptr<CgroupDefinitions.cgroup_namespace> old_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_clone_args_from_user(Ptr<KernelDefinitions.kernel_clone_args> kargs, Ptr<misc.clone_args> uargs, @Unsigned long usize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_compat_semid_to_user(Ptr<?> buf, Ptr<misc.semid64_ds> in, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_group_source_from_sockptr(Ptr<GroupDefinitions.group_source_req> greqs, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_hugetlb_page_range(Ptr<MmDefinitions.mm_struct> dst, Ptr<MmDefinitions.mm_struct> src, Ptr<VmDefinitions.vm_area_struct> dst_vma, Ptr<VmDefinitions.vm_area_struct> src_vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_kprobe(Ptr<runtime.kprobe> ap, Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_map_value_locked(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> dst, Ptr<?> src, boolean lock_src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_mc_enhanced_fast_string() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_mc_fragile() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_mc_fragile_handle_tail(String to, String from, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_mc_to_kernel($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long copy_mc_to_kernel(Ptr<?> dst, Ptr<?> src, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_mc_to_user($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long copy_mc_to_user(Ptr<?> dst, Ptr<?> src, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_mnt_idmap(Ptr<misc.uid_gid_map> map_from, Ptr<misc.uid_gid_map> map_to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_module_elf(Ptr<runtime.module> mod, Ptr<LoadDefinitions.load_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_page_regs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> copy_process(Ptr<runtime.pid> pid2, int trace, int node2, Ptr<KernelDefinitions.kernel_clone_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_semid_from_user(Ptr<misc.semid64_ds> out, Ptr<?> buf, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_semid_to_user(Ptr<?> buf, Ptr<misc.semid64_ds> in, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_semundo(@Unsigned long clone_flags, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_sighand(@Unsigned long clone_flags, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_siginfo($arg1, (const kernel_siginfo*)$arg2)")
    public static void copy_siginfo(Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> to, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_siginfo_from_user($arg1, (const siginfo*)$arg2)")
    public static int copy_siginfo_from_user(Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> to, Ptr< @OriginalName(value="siginfo_t") runtime.siginfo> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_siginfo_from_user32($arg1, (const struct compat_siginfo*)$arg2)")
    public static int copy_siginfo_from_user32(Ptr<KernelDefinitions.kernel_siginfo> to, Ptr<CompatDefinitions.compat_siginfo> ufrom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_siginfo_to_external32($arg1, (const struct kernel_siginfo*)$arg2)")
    public static void copy_siginfo_to_external32(Ptr<CompatDefinitions.compat_siginfo> to, Ptr<KernelDefinitions.kernel_siginfo> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_siginfo_to_user($arg1, (const kernel_siginfo*)$arg2)")
    public static int copy_siginfo_to_user(Ptr< @OriginalName(value="siginfo_t") runtime.siginfo> to, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_signal(@Unsigned long clone_flags, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_string(String c, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_struct_from_sockptr(Ptr<?> dst, @Unsigned long ksize, misc.sockptr_t src, @Unsigned long usize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_sysctl_value(String dst, @Unsigned long dst_len, String src, @Unsigned long src_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.time_namespace> copy_time_ns(@Unsigned long flags, Ptr<UserDefinitions.user_namespace> user_ns, Ptr<misc.time_namespace> old_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> copy_vma(Ptr<Ptr<VmDefinitions.vm_area_struct>> vmap, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, Ptr<@OriginalName(value="bool") Boolean> need_rmap_locks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __copy_device_table(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__copy_skb_header($arg1, (const struct sk_buff*)$arg2)")
    public static void __copy_skb_header(Ptr<SkDefinitions.sk_buff> _new, Ptr<SkDefinitions.sk_buff> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__copy_user_flushcache($arg1, (const void*)$arg2, $arg3)")
    public static long __copy_user_flushcache(Ptr<?> dst, Ptr<?> src, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _copy_from_iter(Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _copy_from_iter_flushcache(Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _copy_from_iter_nocache(Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_copy_from_user($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long _copy_from_user(Ptr<?> to, Ptr<?> from, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_copy_mc_to_iter((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned long _copy_mc_to_iter(Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_copy_to_iter((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned long _copy_to_iter(Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_copy_to_user($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long _copy_to_user(Ptr<?> to, Ptr<?> from, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_block(Ptr<DeflateDefinitions.deflate_state> s2, String buf, @Unsigned int len, int header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_byte(Ptr<runtime.writer> wr, @Unsigned @OriginalName(value="uint32_t") int offs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_compat_iovec_from_user($arg1, (const struct iovec*)$arg2, $arg3)")
    public static int copy_compat_iovec_from_user(Ptr<runtime.iovec> iov, Ptr<runtime.iovec> uvec, @Unsigned int nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_compat_shmid_to_user(Ptr<?> buf, Ptr<misc.shmid64_ds> in, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_cpu_funcs(Ptr<misc.pstate_funcs> funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_creds(Ptr<TaskDefinitions.task_struct> p, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_fdtable(Ptr<runtime.fdtable> nfdt, Ptr<runtime.fdtable> ofdt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_from_early_mem(Ptr<?> dest, @Unsigned @OriginalName(value="phys_addr_t") long src, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_from_page(Ptr<runtime.page> page2, @Unsigned long vaddr, Ptr<?> dst, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_from_xfs_dqblk(Ptr<misc.qc_dqblk> dst, Ptr<FsDefinitions.fs_disk_quota> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FsDefinitions.fs_struct> copy_fs_struct(Ptr<FsDefinitions.fs_struct> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_func_state($arg1, (const struct bpf_func_state*)$arg2)")
    public static int copy_func_state(Ptr<BpfDefinitions.bpf_func_state> dst, Ptr<BpfDefinitions.bpf_func_state> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_iovec_from_user($arg1, (const struct iovec*)$arg2, $arg3)")
    public static int copy_iovec_from_user(Ptr<runtime.iovec> iov, Ptr<runtime.iovec> uiov, @Unsigned long nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_irq_alloc_info(Ptr<IrqDefinitions.irq_alloc_info> dst, Ptr<IrqDefinitions.irq_alloc_info> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.net> copy_net_ns(@Unsigned long flags, Ptr<UserDefinitions.user_namespace> user_ns, Ptr<runtime.net> old_net) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_nodes_to_user(Ptr<@Unsigned Long> mask, @Unsigned long maxnode, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_page_from_iter(Ptr<runtime.page> page2, @Unsigned long offset, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_page_from_iter_atomic(Ptr<runtime.page> page2, @Unsigned long offset, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_page_to_iter(Ptr<runtime.page> page2, @Unsigned long offset, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_page_to_iter_nofault(Ptr<runtime.page> page2, @Unsigned int offset, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_params(Ptr<DmDefinitions.dm_ioctl> user, Ptr<DmDefinitions.dm_ioctl> param_kernel, int ioctl_flags, Ptr<Ptr<DmDefinitions.dm_ioctl>> param2, Ptr<Integer> param_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_string_kernel((const u8*)$arg1, $arg2)")
    public static int copy_string_kernel(String arg2, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_strings_kernel($arg1, (const u8**)$arg2, $arg3)")
    public static int copy_strings_kernel(int argc, Ptr<String> argv, Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_thread($arg1, (const struct kernel_clone_args*)$arg2)")
    public static int copy_thread(Ptr<TaskDefinitions.task_struct> p, Ptr<KernelDefinitions.kernel_clone_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_to_if_dqblk(Ptr<misc.if_dqblk> dst, Ptr<misc.qc_dqblk> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_to_page($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void copy_to_page(Ptr<runtime.page> page2, @Unsigned long vaddr, Ptr<?> src, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_to_xfs_dqblk(Ptr<FsDefinitions.fs_disk_quota> dst, Ptr<misc.qc_dqblk> src, int type2, @Unsigned @OriginalName(value="qid_t") int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_verifier_state($arg1, (const struct bpf_verifier_state*)$arg2)")
    public static int copy_verifier_state(Ptr<BpfDefinitions.bpf_verifier_state> dst_state, Ptr<BpfDefinitions.bpf_verifier_state> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __copy_instruction(Ptr<Character> dest, Ptr<Character> src, Ptr<Character> real, Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __copy_oldmem_page(Ptr<IovDefinitions.iov_iter> iter2, @Unsigned long pfn, @Unsigned long csize, @Unsigned long offset, boolean encrypted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __copy_xstate_to_uabi_buf(runtime.membuf to, Ptr<runtime.fpstate> fpstate2, @Unsigned long xfeatures, @Unsigned int pkru_val, misc.xstate_copy_mode copy_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_bootdata(String real_mode_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_bpf_fprog_from_user(Ptr<SockDefinitions.sock_fprog> dst, misc.sockptr_t src, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean copy_data(Ptr<PrbDefinitions.prb_data_ring> data_ring, Ptr<PrbDefinitions.prb_data_blk_lpos> blk_lpos, @Unsigned short len, String buf, @Unsigned int buf_size, Ptr<@Unsigned Integer> line_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long copy_data_pages(Ptr<MemoryDefinitions.memory_bitmap> copy_bm, Ptr<MemoryDefinitions.memory_bitmap> orig_bm, Ptr<MemoryDefinitions.memory_bitmap> zero_bm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_fid_info_to_user($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6, $arg7)")
    public static int copy_fid_info_to_user(Ptr<KernelDefinitions.__kernel_fsid_t> fsid, Ptr<FanotifyDefinitions.fanotify_fh> fh, int info_type, String name, @Unsigned long name_len, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_from_buffer($arg1, $arg2, $arg3, (const void*)$arg4, (const void*)$arg5)")
    public static int copy_from_buffer(Ptr<?> dst, @Unsigned int offset, @Unsigned int size, Ptr<?> kbuf, Ptr<?> ubuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_from_user_nmi($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long copy_from_user_nmi(Ptr<?> to, Ptr<?> from, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_fsxattr_to_user((const struct fileattr*)$arg1, $arg2)")
    public static int copy_fsxattr_to_user(Ptr<runtime.fileattr> fa, Ptr<fsxattr> ufa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_huge_pmd(Ptr<MmDefinitions.mm_struct> dst_mm, Ptr<MmDefinitions.mm_struct> src_mm, Ptr<PmdDefinitions.pmd_t> dst_pmd, Ptr<PmdDefinitions.pmd_t> src_pmd, @Unsigned long addr2, Ptr<VmDefinitions.vm_area_struct> dst_vma, Ptr<VmDefinitions.vm_area_struct> src_vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_huge_pud(Ptr<MmDefinitions.mm_struct> dst_mm, Ptr<MmDefinitions.mm_struct> src_mm, Ptr<PudDefinitions.pud_t> dst_pud, Ptr<PudDefinitions.pud_t> src_pud, @Unsigned long addr2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_info_records_to_user(Ptr<FanotifyDefinitions.fanotify_event> event2, Ptr<FanotifyDefinitions.fanotify_info> info2, @Unsigned int info_mode, int pidfd, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MsgDefinitions.msg_msg> copy_msg(Ptr<MsgDefinitions.msg_msg> src, Ptr<MsgDefinitions.msg_msg> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_name(Ptr<runtime.dentry> dentry2, Ptr<runtime.dentry> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long copy_oldmem_page(Ptr<IovDefinitions.iov_iter> iter2, @Unsigned long pfn, @Unsigned long csize, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long copy_oldmem_page_encrypted(Ptr<IovDefinitions.iov_iter> iter2, @Unsigned long pfn, @Unsigned long csize, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int copy_optimized_instructions(Ptr<Character> dest, Ptr<Character> src, Ptr<Character> real) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_sigframe_from_user_to_xstate($arg1, (const void*)$arg2)")
    public static int copy_sigframe_from_user_to_xstate(Ptr<TaskDefinitions.task_struct> tsk, Ptr<?> ubuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_uabi_from_kernel_to_xstate($arg1, (const void*)$arg2, $arg3)")
    public static int copy_uabi_from_kernel_to_xstate(Ptr<runtime.fpstate> fpstate2, Ptr<?> kbuf, Ptr<@Unsigned Integer> pkru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_uabi_to_xstate($arg1, (const void*)$arg2, (const void*)$arg3, $arg4)")
    public static int copy_uabi_to_xstate(Ptr<runtime.fpstate> fpstate2, Ptr<?> kbuf, Ptr<?> ubuf, Ptr<@Unsigned Integer> pkru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="copy_workqueue_attrs($arg1, (const struct workqueue_attrs*)$arg2)")
    public static void copy_workqueue_attrs(Ptr<WorkqueueDefinitions.workqueue_attrs> to, Ptr<WorkqueueDefinitions.workqueue_attrs> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void copy_xstate_to_uabi_buf(runtime.membuf to, Ptr<TaskDefinitions.task_struct> tsk, misc.xstate_copy_mode copy_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fsxattr")
    @NotUsableInJava
    public static class fsxattr
    extends Struct {
        public @Unsigned int fsx_xflags;
        public @Unsigned int fsx_extsize;
        public @Unsigned int fsx_nextents;
        public @Unsigned int fsx_projid;
        public @Unsigned int fsx_cowextsize;
        public char @Size(value=8) [] fsx_pad;
    }

    @Type(noCCodeGeneration=true, cType="struct copy_subpage_arg")
    @NotUsableInJava
    public static class copy_subpage_arg
    extends Struct {
        public Ptr<runtime.folio> dst;
        public Ptr<runtime.folio> src;
        public Ptr<VmDefinitions.vm_area_struct> vma;
    }

    @Type(noCCodeGeneration=true, cType="struct copy_from_grant")
    @NotUsableInJava
    public static class copy_from_grant
    extends Struct {
        public Ptr<BlkDefinitions.blk_shadow> s;
        public @Unsigned int grant_idx;
        public @Unsigned int bvec_offset;
        public String bvec_data;
    }
}

