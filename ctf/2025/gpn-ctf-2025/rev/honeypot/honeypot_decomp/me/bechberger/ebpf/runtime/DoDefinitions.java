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
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.DxDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FutexDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.JournalDefinitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KexecDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.LandlockDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LoopDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MpageDefinitions;
import me.bechberger.ebpf.runtime.MqDefinitions;
import me.bechberger.ebpf.runtime.MqueueDefinitions;
import me.bechberger.ebpf.runtime.MsgDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NewDefinitions;
import me.bechberger.ebpf.runtime.OldDefinitions;
import me.bechberger.ebpf.runtime.OpenDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.ProtoDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.ScanDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.StaticDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimensDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.UsbdevfsDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmaDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WakeDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_getrusage(int who, Ptr<CompatDefinitions.compat_rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_ia32_clone(@Unsigned long clone_flags, @Unsigned long newsp, Ptr<Integer> parent_tidptr, @Unsigned long tls_val, Ptr<Integer> child_tidptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_ia32_fstat64(@Unsigned int fd2, Ptr<runtime.stat64> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_ia32_fstatat64($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static long __do_compat_sys_ia32_fstatat64(@Unsigned int dfd, String filename2, Ptr<runtime.stat64> statbuf, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_ia32_lstat64((const u8*)$arg1, $arg2)")
    public static long __do_compat_sys_ia32_lstat64(String filename2, Ptr<runtime.stat64> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_ia32_stat64((const u8*)$arg1, $arg2)")
    public static long __do_compat_sys_ia32_stat64(String filename2, Ptr<runtime.stat64> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_kexec_load(@Unsigned @OriginalName(value="compat_ulong_t") int entry, @Unsigned @OriginalName(value="compat_ulong_t") int nr_segments, Ptr<CompatDefinitions.compat_kexec_segment> segments, @Unsigned @OriginalName(value="compat_ulong_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_newfstat(@Unsigned int fd2, Ptr<CompatDefinitions.compat_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_newfstatat($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static long __do_compat_sys_newfstatat(@Unsigned int dfd, String filename2, Ptr<CompatDefinitions.compat_stat> statbuf, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_newlstat((const u8*)$arg1, $arg2)")
    public static long __do_compat_sys_newlstat(String filename2, Ptr<CompatDefinitions.compat_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_newstat((const u8*)$arg1, $arg2)")
    public static long __do_compat_sys_newstat(String filename2, Ptr<CompatDefinitions.compat_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_socketcall(int call, Ptr<@Unsigned Integer> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_sysinfo(Ptr<CompatDefinitions.compat_sysinfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int __do_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mount> __do_loopback(Ptr<runtime.path> old_path, int recurse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __do_splice(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> off_in, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_adjtimex(Ptr<KernelDefinitions.__kernel_timex> txc_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_adjtimex_time32(Ptr<OldDefinitions.old_timex32> utp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_capget(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> dataptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_capset($arg1, (const struct __user_cap_data_struct*)$arg2)")
    public static long __do_sys_capset(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, @OriginalName(value="cap_user_data_t") Ptr<UserDefinitions.__user_cap_data_struct> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_delete_module((const u8*)$arg1, $arg2)")
    public static long __do_sys_delete_module(String name_user, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_fsmount(int fs_fd, @Unsigned int flags, @Unsigned int attr_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_fstat(@Unsigned int fd2, Ptr<OldDefinitions.__old_kernel_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_getcwd(String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_getegid((const struct pt_regs*)$arg1)")
    public static long __do_sys_getegid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_geteuid((const struct pt_regs*)$arg1)")
    public static long __do_sys_geteuid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_getgid((const struct pt_regs*)$arg1)")
    public static long __do_sys_getgid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_gethostname(String name, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_getpgrp((const struct pt_regs*)$arg1)")
    public static long __do_sys_getpgrp(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_getpid((const struct pt_regs*)$arg1)")
    public static long __do_sys_getpid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_getppid((const struct pt_regs*)$arg1)")
    public static long __do_sys_getppid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_getpriority(int which, int who) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_getrusage(int who, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_gettid((const struct pt_regs*)$arg1)")
    public static long __do_sys_gettid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_getuid((const struct pt_regs*)$arg1)")
    public static long __do_sys_getuid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_init_module($arg1, $arg2, (const u8*)$arg3)")
    public static long __do_sys_init_module(Ptr<?> umod, @Unsigned long len, String uargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_inotify_init((const struct pt_regs*)$arg1)")
    public static long __do_sys_inotify_init(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_landlock_create_ruleset((const const struct landlock_ruleset_attr*)$arg1, (const long unsigned int)$arg2, (const unsigned int)$arg3)")
    public static long __do_sys_landlock_create_ruleset(Ptr<LandlockDefinitions.landlock_ruleset_attr> attr2, @Unsigned long size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_listmount((const struct mnt_id_req*)$arg1, $arg2, $arg3, $arg4)")
    public static long __do_sys_listmount(Ptr<MntDefinitions.mnt_id_req> req2, Ptr<@Unsigned Long> mnt_ids, @Unsigned long nr_mnt_ids, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_lstat((const u8*)$arg1, $arg2)")
    public static long __do_sys_lstat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_memfd_create((const u8*)$arg1, $arg2)")
    public static long __do_sys_memfd_create(String uname, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_move_mount($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static long __do_sys_move_mount(int from_dfd, String from_pathname, int to_dfd, String to_pathname, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_newfstat(@Unsigned int fd2, Ptr<runtime.stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_newfstatat($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static long __do_sys_newfstatat(int dfd, String filename2, Ptr<runtime.stat> statbuf, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_newlstat((const u8*)$arg1, $arg2)")
    public static long __do_sys_newlstat(String filename2, Ptr<runtime.stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_newstat((const u8*)$arg1, $arg2)")
    public static long __do_sys_newstat(String filename2, Ptr<runtime.stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_newuname(Ptr<NewDefinitions.new_utsname> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_pivot_root((const u8*)$arg1, (const u8*)$arg2)")
    public static long __do_sys_pivot_root(String new_root, String put_old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_prctl(int option, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_prlimit64($arg1, $arg2, (const struct rlimit64*)$arg3, $arg4)")
    public static long __do_sys_prlimit64(@OriginalName(value="pid_t") int pid2, @Unsigned int resource2, Ptr<rlimit64> new_rlim, Ptr<rlimit64> old_rlim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_rt_sigreturn((const struct pt_regs*)$arg1)")
    public static long __do_sys_rt_sigreturn(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_setns(int fd2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_setpgid(@OriginalName(value="pid_t") int pid2, @OriginalName(value="pid_t") int pgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_setpriority(int which, int who, int niceval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_setsid((const struct pt_regs*)$arg1)")
    public static long __do_sys_setsid(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_socketcall(int call, Ptr<@Unsigned Long> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_stat((const u8*)$arg1, $arg2)")
    public static long __do_sys_stat(String filename2, Ptr<OldDefinitions.__old_kernel_stat> statbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_statmount((const struct mnt_id_req*)$arg1, $arg2, $arg3, $arg4)")
    public static long __do_sys_statmount(Ptr<MntDefinitions.mnt_id_req> req2, Ptr<runtime.statmount> buf, @Unsigned long bufsize, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_sysinfo(Ptr<runtime.sysinfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_uname(Ptr<OldDefinitions.old_utsname> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_vhangup((const struct pt_regs*)$arg1)")
    public static long __do_sys_vhangup(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_vmsplice($arg1, (const struct iovec*)$arg2, $arg3, $arg4)")
    public static long __do_sys_vmsplice(int fd2, Ptr<runtime.iovec> uiov, @Unsigned long nr_segs, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> do_accept(Ptr<runtime.file> file2, Ptr<ProtoDefinitions.proto_accept_arg> arg2, Ptr<runtime.sockaddr> upeer_sockaddr, Ptr<Integer> upeer_addrlen, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_add_mount($arg1, $arg2, (const struct path*)$arg3, $arg4)")
    public static int do_add_mount(Ptr<runtime.mount> newmnt, Ptr<runtime.mountpoint> mp, Ptr<runtime.path> path2, int mnt_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_anonymous_page(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_blk_trace_setup(Ptr<RequestDefinitions.request_queue> q, String name, @Unsigned @OriginalName(value="dev_t") int dev, Ptr<BlockDefinitions.block_device> bdev, Ptr<BlkDefinitions.blk_user_trace_setup> buts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_compat_fcntl64(@Unsigned int fd2, @Unsigned int cmd, @Unsigned @OriginalName(value="compat_ulong_t") int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_compat_pselect(int n, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> inp, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> outp, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> exp, Ptr<?> tsp, Ptr<CompatDefinitions.compat_sigset_t> sigmask, @Unsigned @OriginalName(value="compat_size_t") int sigsetsize, PollDefinitions.poll_time_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_compat_select(int n, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> inp, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> outp, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> exp, Ptr<OldDefinitions.old_timeval32> tvp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_cpu_nanosleep((const int)$arg1, $arg2, (const struct timespec64*)$arg3)")
    public static int do_cpu_nanosleep(@OriginalName(value="clockid_t") int which_clock, int flags, Ptr<runtime.timespec64> rqtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_dentry_open($arg1, (int (*)(struct inode*, struct file*))$arg2)")
    public static int do_dentry_open(Ptr<runtime.file> f, Ptr<?> open2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_detach(Ptr<IommuDefinitions.iommu_dev_data> dev_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_direct_IO(Ptr<runtime.dio> dio2, Ptr<misc.dio_submit> sdio, Ptr<BufferDefinitions.buffer_head> map_bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_early_param($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int do_early_param(String param2, String val, String unused, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_faccessat($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static long do_faccessat(int dfd, String filename2, int mode, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_fb_ioctl(Ptr<FbDefinitions.fb_info> info2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_fb_registered(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_fbcon_takeover(int show_logo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_fchmodat($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int do_fchmodat(int dfd, String filename2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_fchownat($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int do_fchownat(int dfd, String filename2, @Unsigned @OriginalName(value="uid_t") int user, @Unsigned @OriginalName(value="gid_t") int group, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_fcntl(int fd2, @Unsigned int cmd, @Unsigned long arg2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_flush_tlb_all(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_free_callbacks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_free_init(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_ftruncate(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long length, int small) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_get_acl($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long do_get_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name, Ptr<?> kvalue, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_get_dqblk(Ptr<runtime.dquot> dquot2, Ptr<misc.qc_dqblk> di) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_get_write_access(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<JournalDefinitions.journal_head> jh, int force_copy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_getitimer(int which, Ptr<runtime.itimerspec64> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_getpgid(@OriginalName(value="pid_t") int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_handle_open(int mountdirfd, Ptr<FileDefinitions.file_handle> ufh, int open_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="irqreturn_t") runtime.irqreturn do_hvm_evtchn_intr(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_init_module(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_initcalls() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_inotify_init(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_domain> do_iommu_domain_alloc(@Unsigned int type2, Ptr<runtime.device> dev, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_journal_get_write_access(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_kernel_range_flush(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_kexec_load(@Unsigned long entry, @Unsigned long nr_segments, Ptr<KexecDefinitions.kexec_segment> segments, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_kmem_cache_create($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int do_kmem_cache_create(Ptr<KmemDefinitions.kmem_cache> s2, String name, @Unsigned int size, Ptr<KmemDefinitions.kmem_cache_args> args, @Unsigned @OriginalName(value="slab_flags_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long do_listmount(Ptr<MntDefinitions.mnt_namespace> ns, @Unsigned long mnt_parent_id, @Unsigned long last_mnt_id, Ptr<@Unsigned Long> mnt_ids, @Unsigned long nr_mnt_ids, boolean reverse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mountpoint> do_lock_mount(Ptr<runtime.path> path2, boolean beneath) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_match_mnt($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const u8*)$arg5, $arg6, $arg7, $arg8, $arg9)")
    public static int do_match_mnt(Ptr<AaDefinitions.aa_policydb> policy, @Unsigned int start, String mntpnt, String devname, String type2, @Unsigned long flags, Ptr<?> data, boolean binary, Ptr<AaDefinitions.aa_perms> perms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_md_run(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_md_stop(Ptr<runtime.mddev> mddev2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_mount((const u8*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static long do_mount(String dev_name, String dir_name, String type_page, @Unsigned long flags, Ptr<?> data_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_move_mount(Ptr<runtime.path> old_path, Ptr<runtime.path> new_path, boolean beneath) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_msg_fill(Ptr<?> dest, Ptr<MsgDefinitions.msg_msg> msg, @Unsigned long bufsz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_msgrcv($arg1, $arg2, $arg3, $arg4, $arg5, (long int (*)(void*, struct msg_msg*, long unsigned int))$arg6)")
    public static long do_msgrcv(int msqid, Ptr<?> buf, @Unsigned long bufsz, long msgtyp, int msgflg, Ptr<?> msg_handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_msgsnd(int msqid, long mtype, Ptr<?> mtext, @Unsigned long msgsz, int msgflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_new_mount($arg1, (const u8*)$arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int do_new_mount(Ptr<runtime.path> path2, String fstype, int sb_flags, int mnt_flags, String name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_numa_page(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_one_initcall(@OriginalName(value="initcall_t") Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_oops_enter_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_output_char(char c, Ptr<TtyDefinitions.tty_struct> tty, int space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_page_mkwrite(Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_pages_move($arg1, $arg2, $arg3, (const void**)$arg4, (const int*)$arg5, $arg6, $arg7)")
    public static int do_pages_move(Ptr<MmDefinitions.mm_struct> mm, misc.nodemask_t task_nodes, @Unsigned long nr_pages, Ptr<Ptr<?>> pages, Ptr<Integer> nodes, Ptr<Integer> status, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_pages_stat($arg1, $arg2, (const void**)$arg3, $arg4)")
    public static int do_pages_stat(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long nr_pages, Ptr<Ptr<?>> pages, Ptr<Integer> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_poll(Ptr<PollDefinitions.poll_list> list, Ptr<PollDefinitions.poll_wqueues> wait, Ptr<runtime.timespec64> end_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_prlimit(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned int resource2, Ptr<runtime.rlimit> new_rlim, Ptr<runtime.rlimit> old_rlim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_bulk(Ptr<UsbDefinitions.usb_dev_state> ps, Ptr<UsbdevfsDefinitions.usbdevfs_bulktransfer> bulk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_control(Ptr<UsbDefinitions.usb_dev_state> ps, Ptr<UsbdevfsDefinitions.usbdevfs_ctrltransfer> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_proc_dqstats((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int do_proc_dqstats(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_prt_fixups(Ptr<AcpiDefinitions.acpi_prt_entry> entry, Ptr<AcpiDefinitions.acpi_pci_routing_table> prt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_pselect($arg1, $arg2, $arg3, $arg4, $arg5, (const struct {\n  long unsigned int sig[1];\n}*)$arg6, $arg7, $arg8)")
    public static long do_pselect(int n, Ptr<@OriginalName(value="fd_set") KernelDefinitions.__kernel_fd_set> inp, Ptr<@OriginalName(value="fd_set") KernelDefinitions.__kernel_fd_set> outp, Ptr<@OriginalName(value="fd_set") KernelDefinitions.__kernel_fd_set> exp, Ptr<?> tsp, Ptr<misc.sigset_t> sigmask, @Unsigned long sigsetsize, PollDefinitions.poll_time_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_read_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_readlinkat($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int do_readlinkat(int dfd, String pathname, String buf, int bufsiz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_recvmmsg(int fd2, Ptr<runtime.mmsghdr> mmsg, @Unsigned int vlen, @Unsigned int flags, Ptr<runtime.timespec64> timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_region((const unsigned int)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void do_region(@Unsigned @OriginalName(value="blk_opf_t") int opf, @Unsigned int region2, Ptr<DmDefinitions.dm_io_region> where, Ptr<runtime.dpages> dp, Ptr<runtime.io> io2, @Unsigned short ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_register_memory_block_under_node(int nid, Ptr<MemoryDefinitions.memory_block> mem_blk, misc.meminit_context context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_restart_poll(Ptr<misc.restart_block> restart_block2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_scan_async(Ptr<?> _data, @Unsigned @OriginalName(value="async_cookie_t") long c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_scsi_scan_host(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_select(int n, Ptr<misc.fd_set_bits> fds, Ptr<runtime.timespec64> end_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_set_acl($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5)")
    public static int do_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name, Ptr<?> kvalue, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_set_dqblk(Ptr<runtime.dquot> dquot2, Ptr<misc.qc_dqblk> di) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_set_group(Ptr<runtime.path> from_path, Ptr<runtime.path> to_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_set_pmd(Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_setattr(@Unsigned long attr2, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_setitimer(int which, Ptr<runtime.itimerspec64> value, Ptr<runtime.itimerspec64> ovalue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_shared_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_signalfd4(int ufd, Ptr<misc.sigset_t> mask, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_sock_getsockopt(Ptr<runtime.socket> sock2, boolean compat, int level, int optname, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_sock_setsockopt(Ptr<runtime.socket> sock2, boolean compat, int level, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long do_splice(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> off_in, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long do_splice_direct(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> opos, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long do_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_sta_before_sun((const struct dmi_system_id*)$arg1)")
    public static int do_sta_before_sun(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_statmount(Ptr<runtime.kstatmount> s2, @Unsigned long mnt_id, @Unsigned long mnt_ns_id, Ptr<MntDefinitions.mnt_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_statx(int dfd, Ptr<runtime.filename> filename2, @Unsigned int flags, @Unsigned int mask, Ptr<runtime.statx> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_statx_fd(int fd2, @Unsigned int flags, @Unsigned int mask, Ptr<runtime.statx> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_swap_page(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_sync_core(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_sys_ftruncate(@Unsigned int fd2, @OriginalName(value="loff_t") long length, int small) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_sys_name_to_handle((const struct path*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static long do_sys_name_to_handle(Ptr<runtime.path> path2, Ptr<FileDefinitions.file_handle> ufh, Ptr<?> mnt_id, boolean unique_mntid, int fh_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_sys_open($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static long do_sys_open(int dfd, String filename2, int flags, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_sys_openat2($arg1, (const u8*)$arg2, $arg3)")
    public static long do_sys_openat2(int dfd, String filename2, Ptr<OpenDefinitions.open_how> how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_sys_poll(Ptr<runtime.pollfd> ufds, @Unsigned int nfds, Ptr<runtime.timespec64> end_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_sys_settimeofday64((const struct timespec64*)$arg1, (const struct timezone*)$arg2)")
    public static int do_sys_settimeofday64(Ptr<runtime.timespec64> tv, Ptr<runtime.timezone> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_sys_times(Ptr<tms> tms2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_sys_truncate((const u8*)$arg1, $arg2)")
    public static long do_sys_truncate(String pathname, @OriginalName(value="loff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_sysinfo(Ptr<runtime.sysinfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_task_stat(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2, int whole) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_tcp_getsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_tcp_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long do_tee(Ptr<runtime.file> in, Ptr<runtime.file> out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_trace_rdpmc(@Unsigned int counter, @Unsigned long val, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_trace_read_msr(@Unsigned int msr2, @Unsigned long val, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_trace_write_msr(@Unsigned int msr2, @Unsigned long val, int failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_truncate(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, @OriginalName(value="loff_t") long length, @Unsigned int time_attrs, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_umount(Ptr<runtime.mount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_wp_page(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_rt_sigreturn((const struct pt_regs*)$arg1)")
    public static long __do_compat_sys_rt_sigreturn(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_sigreturn((const struct pt_regs*)$arg1)")
    public static long __do_compat_sys_sigreturn(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __do_once_done(Ptr<@OriginalName(value="bool") Boolean> done, Ptr<StaticDefinitions.static_key_true> once_key, Ptr<@Unsigned Long> flags, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __do_once_sleepable_done(Ptr<@OriginalName(value="bool") Boolean> done, Ptr<StaticDefinitions.static_key_true> once_key, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __do_once_sleepable_start(Ptr<@OriginalName(value="bool") Boolean> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __do_once_start(Ptr<@OriginalName(value="bool") Boolean> done, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_semtimedop($arg1, $arg2, $arg3, (const struct timespec64*)$arg4, $arg5)")
    public static long __do_semtimedop(int semid, Ptr<runtime.sembuf> sops, @Unsigned int nsops, Ptr<runtime.timespec64> timeout, Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_clone(@Unsigned long clone_flags, @Unsigned long newsp, Ptr<Integer> parent_tidptr, Ptr<Integer> child_tidptr, @Unsigned long tls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_clone3(Ptr<misc.clone_args> uargs, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_fork((const struct pt_regs*)$arg1)")
    public static long __do_sys_fork(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_futex_requeue(Ptr<FutexDefinitions.futex_waitv> waiters, @Unsigned int flags, int nr_wake, int nr_requeue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_futex_waitv(Ptr<FutexDefinitions.futex_waitv> waiters, @Unsigned int nr_futexes, @Unsigned int flags, Ptr<KernelDefinitions.__kernel_timespec> timeout, @OriginalName(value="clockid_t") int clockid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_getegid16((const struct pt_regs*)$arg1)")
    public static long __do_sys_getegid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_geteuid16((const struct pt_regs*)$arg1)")
    public static long __do_sys_geteuid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_getgid16((const struct pt_regs*)$arg1)")
    public static long __do_sys_getgid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_getuid16((const struct pt_regs*)$arg1)")
    public static long __do_sys_getuid16(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_kcmp(@OriginalName(value="pid_t") int pid1, @OriginalName(value="pid_t") int pid2, int type2, @Unsigned long idx1, @Unsigned long idx2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_kexec_file_load($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static long __do_sys_kexec_file_load(int kernel_fd, int initrd_fd, @Unsigned long cmdline_len, String cmdline_ptr, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_mlockall(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_munlockall((const struct pt_regs*)$arg1)")
    public static long __do_sys_munlockall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_pause((const struct pt_regs*)$arg1)")
    public static long __do_sys_pause(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_pidfd_send_signal(int pidfd, int sig, Ptr<@OriginalName(value="siginfo_t") runtime.siginfo> info2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_pkey_alloc(@Unsigned long flags, @Unsigned long init_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_process_mrelease(int pidfd, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_reboot(int magic1, int magic2, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_restart_syscall((const struct pt_regs*)$arg1)")
    public static long __do_sys_restart_syscall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_setgroups(int gidsetsize, Ptr<@Unsigned @OriginalName(value="gid_t") Integer> grouplist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_setgroups16(int gidsetsize, Ptr<@Unsigned @OriginalName(value="old_gid_t") Short> grouplist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_sgetmask((const struct pt_regs*)$arg1)")
    public static long __do_sys_sgetmask(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_uretprobe((const struct pt_regs*)$arg1)")
    public static long __do_sys_uretprobe(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_vfork((const struct pt_regs*)$arg1)")
    public static long __do_sys_vfork(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean do_amd_gpio_irq_handler(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_arch_prctl_64(Ptr<TaskDefinitions.task_struct> task2, int option, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_attribute_container_device_trigger_safe($arg1, $arg2, (int (*)(struct attribute_container*, struct device*, struct device*))$arg3, (int (*)(struct attribute_container*, struct device*, struct device*))$arg4)")
    public static int do_attribute_container_device_trigger_safe(Ptr<runtime.device> dev, Ptr<AttributeDefinitions.attribute_container> cont, Ptr<?> fn, Ptr<?> undo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_boot_cpu(@Unsigned int apicid, int cpu2, Ptr<TaskDefinitions.task_struct> idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_clear_cpu_cap(Ptr<misc.cpuinfo_x86> c, @Unsigned int feature) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_compat_futimesat($arg1, (const u8*)$arg2, $arg3)")
    public static long do_compat_futimesat(@Unsigned int dfd, String filename2, Ptr<OldDefinitions.old_timeval32> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_compat_sigaltstack((const compat_sigaltstack*)$arg1, $arg2)")
    public static int do_compat_sigaltstack(Ptr<@OriginalName(value="compat_stack_t") CompatDefinitions.compat_sigaltstack> uss_ptr, Ptr<@OriginalName(value="compat_stack_t") CompatDefinitions.compat_sigaltstack> uoss_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_coredump((const kernel_siginfo*)$arg1)")
    public static void do_coredump(Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> siginfo2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_eventfd(@Unsigned int count, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_file_open_root((const struct path*)$arg1, (const u8*)$arg2, (const struct open_flags*)$arg3)")
    public static Ptr<runtime.file> do_file_open_root(Ptr<runtime.path> root, String name, Ptr<OpenDefinitions.open_flags> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_filp_open($arg1, $arg2, (const struct open_flags*)$arg3)")
    public static Ptr<runtime.file> do_filp_open(int dfd, Ptr<runtime.filename> pathname, Ptr<OpenDefinitions.open_flags> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_futex(Ptr<@Unsigned Integer> uaddr, int op, @Unsigned int val, Ptr<@OriginalName(value="ktime_t") Long> timeout, Ptr<@Unsigned Integer> uaddr2, @Unsigned int val2, @Unsigned int val3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_futimesat($arg1, (const u8*)$arg2, $arg3)")
    public static long do_futimesat(int dfd, String filename2, Ptr<KernelDefinitions.__kernel_old_timeval> utimes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_get_thread_area(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_id_store($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long do_id_store(Ptr<DeviceDefinitions.device_driver> drv, String buf, @Unsigned long count, misc.id_action action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_ipv6_getsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_ipv6_mcast_group_source(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_ipv6_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_kernel_power_off() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_kernel_restart(String cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_linkat(int olddfd, Ptr<runtime.filename> old, int newdfd, Ptr<runtime.filename> _new, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_machine_check(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_migrate_range(@Unsigned long start_pfn, @Unsigned long end_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_mkdirat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_mknodat(int dfd, Ptr<runtime.filename> name, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_mlock(@Unsigned long start, @Unsigned long len, @Unsigned @OriginalName(value="vm_flags_t") long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_mount_root((const u8*)$arg1, (const u8*)$arg2, (const int)$arg3, (const void*)$arg4)")
    public static int do_mount_root(String name, String fs, int flags, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_mprotect_pkey(@Unsigned long start, @Unsigned long len, @Unsigned long prot, int pkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_mseal(@Unsigned long start, @Unsigned long len_in, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_netpoll_cleanup(Ptr<runtime.netpoll> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_no_restart_syscall(Ptr<misc.restart_block> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean do_notify_parent(Ptr<TaskDefinitions.task_struct> tsk, int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_notify_parent_cldstop(Ptr<TaskDefinitions.task_struct> tsk, boolean for_ptracer, int why) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_notify_pidfd(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_open($arg1, $arg2, (const struct open_flags*)$arg3)")
    public static int do_open(Ptr<runtime.nameidata> nd, Ptr<runtime.file> file2, Ptr<OpenDefinitions.open_flags> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_pagemap_cmd(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_pagemap_scan(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_pata_set_dmamode(Ptr<AtaDefinitions.ata_port> ap, Ptr<AtaDefinitions.ata_device> adev, int isich) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_procmap_query(Ptr<ProcDefinitions.proc_maps_private> priv, Ptr<?> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_readahead(Ptr<@OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned int start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_register_framebuffer(Ptr<FbDefinitions.fb_info> fb_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_renameat2(int olddfd, Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_req_filebacked(Ptr<LoopDefinitions.loop_device> lo, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_rmdir(int dfd, Ptr<runtime.filename> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_rt_sigqueueinfo(@OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_rt_tgsigqueueinfo(@OriginalName(value="pid_t") int tgid, @OriginalName(value="pid_t") int pid2, int sig, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_semtimedop($arg1, $arg2, $arg3, (const struct timespec64*)$arg4)")
    public static long do_semtimedop(int semid, Ptr<runtime.sembuf> tsops, @Unsigned int nsops, Ptr<runtime.timespec64> timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_send_sig_info(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> p, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_send_specific(@OriginalName(value="pid_t") int tgid, @OriginalName(value="pid_t") int pid2, int sig, Ptr<KernelDefinitions.kernel_siginfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_set_thread_area(Ptr<TaskDefinitions.task_struct> p, int idx, Ptr<UserDefinitions.user_desc> u_info, int can_allocate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_sigaction(int sig, Ptr<KDefinitions.k_sigaction> act, Ptr<KDefinitions.k_sigaction> oact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_sigaltstack((const sigaltstack*)$arg1, $arg2, $arg3, $arg4)")
    public static int do_sigaltstack(Ptr<@OriginalName(value="stack_t") runtime.sigaltstack> ss, Ptr<@OriginalName(value="stack_t") runtime.sigaltstack> oss, @Unsigned long sp, @Unsigned long min_ss_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean do_signal_stop(int signr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_smart_update(Ptr<misc.sem_array> sma, Ptr<runtime.sembuf> sops, int nsops, int otime, Ptr<WakeDefinitions.wake_q_head> wake_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_smart_wakeup_zero(Ptr<misc.sem_array> sma, Ptr<runtime.sembuf> sops, int nsops, Ptr<WakeDefinitions.wake_q_head> wake_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_symlinkat(Ptr<runtime.filename> from, int newdfd, Ptr<runtime.filename> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_sysfs_unregistration() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_syslog(int type2, String buf, int len, int source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long do_timens_ktime_to_host(@OriginalName(value="clockid_t") int clockid, @OriginalName(value="ktime_t") long tim, Ptr<TimensDefinitions.timens_offsets> ns_offsets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_trace_rcu_torture_read((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static void do_trace_rcu_torture_read(String rcutorturename, Ptr<misc.callback_head> rhp, @Unsigned long secs, @Unsigned long c_old, @Unsigned long c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long do_try_to_free_pages(Ptr<runtime.zonelist> zonelist2, Ptr<ScanDefinitions.scan_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_unexpected_cp(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_unlinkat(int dfd, Ptr<runtime.filename> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_user_cp_fault(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_utimes($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static long do_utimes(int dfd, String filename2, Ptr<runtime.timespec64> times, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_vmi_align_munmap(Ptr<VmaDefinitions.vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end, Ptr<ListDefinitions.list_head> uf, boolean unlock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_vmi_munmap(Ptr<VmaDefinitions.vma_iterator> vmi, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len, Ptr<ListDefinitions.list_head> uf, boolean unlock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_wait_intr(Ptr<@OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> wq, Ptr<@OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_wait_intr_irq(Ptr<@OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> wq, Ptr<@OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_wait4(@OriginalName(value="compat_pid_t") int pid2, Ptr<@Unsigned @OriginalName(value="compat_uint_t") Integer> stat_addr, int options, Ptr<CompatDefinitions.compat_rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_waitid(int which, @OriginalName(value="compat_pid_t") int pid2, Ptr<CompatDefinitions.compat_siginfo> infop, int options, Ptr<CompatDefinitions.compat_rusage> uru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __do_set_cpus_allowed(Ptr<TaskDefinitions.task_struct> p, Ptr<misc.affinity_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_add_key((const u8*)$arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static long __do_sys_add_key(String _type, String _description, Ptr<?> _payload, @Unsigned long plen, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_brk(@Unsigned long brk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_copy_file_range(int fd_in, Ptr<@OriginalName(value="loff_t") Long> off_in, int fd_out, Ptr<@OriginalName(value="loff_t") Long> off_out, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_io_uring_enter($arg1, $arg2, $arg3, $arg4, (const void*)$arg5, $arg6)")
    public static long __do_sys_io_uring_enter(@Unsigned int fd2, @Unsigned int to_submit, @Unsigned int min_complete, @Unsigned int flags, Ptr<?> argp, @Unsigned long argsz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_ioprio_get(int which, int who) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_ioprio_set(int which, int who, int ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_keyctl(int option, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_msync(@Unsigned long start, @Unsigned long len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_process_madvise($arg1, (const struct iovec*)$arg2, $arg3, $arg4, $arg5)")
    public static long __do_sys_process_madvise(int pidfd, Ptr<runtime.iovec> vec, @Unsigned long vlen, int behavior2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_remap_file_pages(@Unsigned long start, @Unsigned long size, @Unsigned long prot, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_request_key((const u8*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static long __do_sys_request_key(String _type, String _description, String _callout_info, @OriginalName(value="key_serial_t") int destringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_set_mempolicy_home_node(@Unsigned long start, @Unsigned long len, @Unsigned long home_node, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_wait4(@OriginalName(value="pid_t") int upid2, Ptr<Integer> stat_addr, int options, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_waitid(int which, @OriginalName(value="pid_t") int upid2, Ptr<runtime.siginfo> infop, int options, Ptr<runtime.rusage> ru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_wait(Ptr<WaitDefinitions.wait_opts> wo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_arch_prctl_common(int option, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_bind_con_driver((const struct consw*)$arg1, $arg2, $arg3, $arg4)")
    public static int do_bind_con_driver(Ptr<runtime.consw> csw, int first, int last, int deflt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_blank_screen(int entering_gfx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_bpf_send_signal(Ptr<IrqDefinitions.irq_work> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_brk_flags(Ptr<VmaDefinitions.vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, @Unsigned long len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_call_rcu_ttrace(Ptr<BpfDefinitions.bpf_mem_cache> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_check(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_check_common(Ptr<BpfDefinitions.bpf_verifier_env> env, int subprog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_close_on_exec(Ptr<misc.files_struct> files) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_compat_epoll_pwait($arg1, $arg2, $arg3, $arg4, (const struct {\n  unsigned int sig[2];\n}*)$arg5, $arg6)")
    public static int do_compat_epoll_pwait(int epfd, Ptr<misc.epoll_event> events, int maxevents, Ptr<runtime.timespec64> timeout, Ptr<CompatDefinitions.compat_sigset_t> sigmask, @Unsigned @OriginalName(value="compat_size_t") int sigsetsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_con_trol(Ptr<TtyDefinitions.tty_struct> tty, Ptr<VcDefinitions.vc_data> vc2, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_con_write($arg1, (const u8*)$arg2, $arg3)")
    public static int do_con_write(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> buf, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_cvt_mode((const struct detailed_timing*)$arg1, $arg2)")
    public static void do_cvt_mode(Ptr<misc.detailed_timing> timing, Ptr<?> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_dec_rlimit_put_ucounts(Ptr<runtime.ucounts> ucounts2, Ptr<runtime.ucounts> last, misc.rlimit_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_deferred_remove(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_detailed_mode((const struct detailed_timing*)$arg1, $arg2)")
    public static void do_detailed_mode(Ptr<misc.detailed_timing> timing, Ptr<?> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_dup2(Ptr<misc.files_struct> files, Ptr<runtime.file> file2, @Unsigned int fd2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_eoi_pirq(Ptr<IrqDefinitions.irq_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_epoll_create(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_epoll_ctl(int epfd, int op, int fd2, Ptr<misc.epoll_event> epds, boolean nonblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_epoll_wait(int epfd, Ptr<misc.epoll_event> events, int maxevents, Ptr<runtime.timespec64> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_established_modes((const struct detailed_timing*)$arg1, $arg2)")
    public static void do_established_modes(Ptr<misc.detailed_timing> timing, Ptr<?> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_exit(long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_get_mempolicy(Ptr<Integer> policy, Ptr<misc.nodemask_t> nmask, @Unsigned long addr2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_group_exit(int exit_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_hdmi_vsdb_modes($arg1, (const u8*)$arg2, $arg3)")
    public static int do_hdmi_vsdb_modes(Ptr<DrmDefinitions.drm_connector> connector, Ptr<Character> db, char len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_inferred_modes((const struct detailed_timing*)$arg1, $arg2)")
    public static void do_inferred_modes(Ptr<misc.detailed_timing> timing, Ptr<?> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_init_real_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_io_getevents(@Unsigned @OriginalName(value="aio_context_t") long ctx_id, long min_nr, long nr, Ptr<IoDefinitions.io_event> events, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long do_iter_readv_writev(Ptr<runtime.file> filp, Ptr<IovDefinitions.iov_iter> iter2, Ptr<@OriginalName(value="loff_t") Long> ppos, int type2, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_madvise(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len_in, int behavior2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_mbind(@Unsigned long start, @Unsigned long len, @Unsigned short mode, @Unsigned short mode_flags, Ptr<misc.nodemask_t> nmask, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_migrate_pages($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2, (const struct {\n  long unsigned int bits[16];\n}*)$arg3, $arg4)")
    public static int do_migrate_pages(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.nodemask_t> from, Ptr<misc.nodemask_t> to, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_misc_fixups(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long do_mmap(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long prot, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags, @Unsigned long pgoff, Ptr<@Unsigned Long> populate, Ptr<ListDefinitions.list_head> uf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_mmap_read_unlock(Ptr<IrqDefinitions.irq_work> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> do_mpage_readpage(Ptr<MpageDefinitions.mpage_readpage_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_munmap(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long len, Ptr<ListDefinitions.list_head> uf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_nanosleep(Ptr<HrtimerDefinitions.hrtimer_sleeper> t, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean do_nocb_deferred_wakeup(Ptr<RcuDefinitions.rcu_data> rdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_nocb_deferred_wakeup_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_nothing(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> do_open_execat(int fd2, Ptr<runtime.filename> name, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_preadv($arg1, (const struct iovec*)$arg2, $arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long do_preadv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_pwritev($arg1, (const struct iovec*)$arg2, $arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long do_pwritev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="loff_t") long pos, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_quotactl($arg1, $arg2, $arg3, $arg4, $arg5, (const struct path*)$arg6)")
    public static int do_quotactl(Ptr<SuperDefinitions.super_block> sb, int type2, int cmd, @Unsigned @OriginalName(value="qid_t") int id, Ptr<?> addr2, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_readv($arg1, (const struct iovec*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long do_readv(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_reboot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_register_con_driver((const struct consw*)$arg1, $arg2, $arg3)")
    public static int do_register_con_driver(Ptr<runtime.consw> csw, int first, int last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_resume(Ptr<DmDefinitions.dm_ioctl> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_seccomp(@Unsigned int op, @Unsigned int flags, Ptr<?> uargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long do_sendfile(int out_fd, int in_fd, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long count, @OriginalName(value="loff_t") long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_set_cpus_allowed($arg1, (const struct cpumask*)$arg2)")
    public static void do_set_cpus_allowed(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.cpumask> new_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_set_mempolicy(@Unsigned short mode, @Unsigned short flags, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_shm_rmid(Ptr<IpcDefinitions.ipc_namespace> ns, Ptr<misc.kern_ipc_perm> ipcp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_shmat(int shmid, String shmaddr, int shmflg, Ptr<@Unsigned @OriginalName(value="ulong") Long> raddr, @Unsigned long shmlba) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long do_shrink_slab(Ptr<ShrinkDefinitions.shrink_control> shrinkctl, Ptr<runtime.shrinker> shrinker2, int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ext4Definitions.ext4_dir_entry_2> do_split(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> dir, Ptr<Ptr<BufferDefinitions.buffer_head>> bh, Ptr<DxDefinitions.dx_frame> frame, Ptr<DxDefinitions.dx_hash_info> hinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_standard_modes((const struct detailed_timing*)$arg1, $arg2)")
    public static void do_standard_modes(Ptr<misc.detailed_timing> timing, Ptr<?> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_suspend_lowlevel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_sysctl_args() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_take_over_console((const struct consw*)$arg1, $arg2, $arg3, $arg4)")
    public static int do_take_over_console(Ptr<runtime.consw> csw, int first, int last, int deflt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_task_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_tty_hangup(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_unbind_con_driver((const struct consw*)$arg1, $arg2, $arg3, $arg4)")
    public static int do_unbind_con_driver(Ptr<runtime.consw> csw, int first, int last, int deflt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_unblank_screen(int leaving_gfx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_unregister_con_driver((const struct consw*)$arg1)")
    public static int do_unregister_con_driver(Ptr<runtime.consw> csw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_update_region(Ptr<VcDefinitions.vc_data> vc2, @Unsigned long start, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_wait(Ptr<WaitDefinitions.wait_opts> wo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_writepages(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_writev($arg1, (const struct iovec*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long do_writev(@Unsigned long fd2, Ptr<runtime.iovec> vec, @Unsigned long vlen, @OriginalName(value="rwf_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_xdp_generic(Ptr<BpfDefinitions.bpf_prog> xdp_prog, Ptr<Ptr<SkDefinitions.sk_buff>> pskb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_adjtimex($arg1, (const struct timespec64*)$arg2, $arg3, $arg4)")
    public static int __do_adjtimex(Ptr<KernelDefinitions.__kernel_timex> txc, Ptr<runtime.timespec64> ts, Ptr<Integer> time_tai, Ptr<AuditDefinitions.audit_ntp_data> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_fstatfs(@Unsigned int fd2, Ptr<CompatDefinitions.compat_statfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_ioctl(@Unsigned int fd2, @Unsigned int cmd, @Unsigned @OriginalName(value="compat_ulong_t") int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_keyctl(@Unsigned int option, @Unsigned int arg2, @Unsigned int arg3, @Unsigned int arg4, @Unsigned int arg5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_mq_getsetattr($arg1, (const struct compat_mq_attr*)$arg2, $arg3)")
    public static long __do_compat_sys_mq_getsetattr(@OriginalName(value="mqd_t") int mqdes, Ptr<CompatDefinitions.compat_mq_attr> u_mqstat, Ptr<CompatDefinitions.compat_mq_attr> u_omqstat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_compat_sys_statfs((const u8*)$arg1, $arg2)")
    public static long __do_compat_sys_statfs(String pathname, Ptr<CompatDefinitions.compat_statfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_compat_sys_ustat(@Unsigned int dev, Ptr<CompatDefinitions.compat_ustat> u) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __do_fast_syscall_32(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int __do_huge_pmd_anonymous_page(Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.page> page2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __do_notify(Ptr<MqueueDefinitions.mqueue_inode_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __do_pipe_flags(Ptr<Integer> fd2, Ptr<Ptr<runtime.file>> files, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_proc_dointvec($arg1, (const struct ctl_table*)$arg2, $arg3, $arg4, $arg5, $arg6, (int (*)(_Bool*, long unsigned int*, int*, int, void*))$arg7, $arg8)")
    public static int __do_proc_dointvec(Ptr<?> tbl_data, Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<?> conv, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_proc_douintvec($arg1, (const struct ctl_table*)$arg2, $arg3, $arg4, $arg5, $arg6, (int (*)(long unsigned int*, unsigned int*, int, void*))$arg7, $arg8)")
    public static int __do_proc_douintvec(Ptr<?> tbl_data, Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<?> conv, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_proc_doulongvec_minmax($arg1, (const struct ctl_table*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int __do_proc_doulongvec_minmax(Ptr<?> data, Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long convmul, @Unsigned long convdiv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __do_softirq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_clock_adjtime((const int)$arg1, $arg2)")
    public static long __do_sys_clock_adjtime(@OriginalName(value="clockid_t") int which_clock, Ptr<KernelDefinitions.__kernel_timex> utx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_clock_adjtime32(@OriginalName(value="clockid_t") int which_clock, Ptr<OldDefinitions.old_timex32> utp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_fanotify_init(@Unsigned int flags, @Unsigned int event_f_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_flock(@Unsigned int fd2, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_fremovexattr($arg1, (const u8*)$arg2)")
    public static long __do_sys_fremovexattr(int fd2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_fsconfig($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5)")
    public static long __do_sys_fsconfig(int fd2, @Unsigned int cmd, String _key, Ptr<?> _value, int aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_fsetxattr($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static long __do_sys_fsetxattr(int fd2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_fstatfs(@Unsigned int fd2, Ptr<statfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_fstatfs64(@Unsigned int fd2, @Unsigned long sz, Ptr<statfs64> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_mq_getsetattr($arg1, (const struct mq_attr*)$arg2, $arg3)")
    public static long __do_sys_mq_getsetattr(@OriginalName(value="mqd_t") int mqdes, Ptr<MqDefinitions.mq_attr> u_mqstat, Ptr<MqDefinitions.mq_attr> u_omqstat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_mq_unlink((const u8*)$arg1)")
    public static long __do_sys_mq_unlink(String u_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_mremap(@Unsigned long addr2, @Unsigned long old_len, @Unsigned long new_len, @Unsigned long flags, @Unsigned long new_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_ni_syscall((const struct pt_regs*)$arg1)")
    public static long __do_sys_ni_syscall(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_perf_event_open(Ptr<PerfDefinitions.perf_event_attr> attr_uptr, @OriginalName(value="pid_t") int pid2, int cpu2, int group_fd, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_sched_yield((const struct pt_regs*)$arg1)")
    public static long __do_sys_sched_yield(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_statfs((const u8*)$arg1, $arg2)")
    public static long __do_sys_statfs(String pathname, Ptr<statfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_statfs64((const u8*)$arg1, $arg2, $arg3)")
    public static long __do_sys_statfs64(String pathname, @Unsigned long sz, Ptr<statfs64> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_swapoff((const u8*)$arg1)")
    public static long __do_sys_swapoff(String specialfile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_swapon((const u8*)$arg1, $arg2)")
    public static long __do_sys_swapon(String specialfile, int swap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__do_sys_sync((const struct pt_regs*)$arg1)")
    public static long __do_sys_sync(Ptr<PtDefinitions.pt_regs> __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_timerfd_create(int clockid, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __do_sys_ustat(@Unsigned int dev, Ptr<ustat> ubuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_acct_process(Ptr<misc.bsd_acct_struct> acct2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_adjtimex(Ptr<KernelDefinitions.__kernel_timex> txc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_clock_adjtime((const int)$arg1, $arg2)")
    public static int do_clock_adjtime(@OriginalName(value="clockid_t") int which_clock, Ptr<KernelDefinitions.__kernel_timex> ktx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_collect() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_compute_shiftstate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_copy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_drv_read(Ptr<?> _cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_drv_write(Ptr<?> _cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_early_exception(Ptr<PtDefinitions.pt_regs> regs, int trapnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_emergency_remount(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_emergency_remount_callback(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_enqueue_task(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, @Unsigned long enq_flags, int sticky_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_error_trap(Ptr<PtDefinitions.pt_regs> regs, long error_code, String str, @Unsigned long trapnr, int signr, int sicode, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_fanotify_mark($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static int do_fanotify_mark(int fanotify_fd, @Unsigned int flags, @Unsigned long mask, int dfd, String pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean do_fast_syscall_32(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_fsync(@Unsigned int fd2, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long do_getxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> d, Ptr<XattrDefinitions.xattr_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_header() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_huge_pmd_anonymous_page(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_huge_pmd_numa_page(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int do_huge_pmd_wp_page(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_idle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean do_int3(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_int80_emulation(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_io_accounting(Ptr<TaskDefinitions.task_struct> task2, Ptr<SeqDefinitions.seq_file> m, int whole) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_ip_getsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_ip_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_jit(Ptr<BpfDefinitions.bpf_prog> bpf_prog2, Ptr<Integer> addrs2, Ptr<Character> image, Ptr<Character> rw_image, int oldproglen, Ptr<misc.jit_context> ctx, boolean jmp_padding) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_kern_addr_fault(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long hw_error_code, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kimage> do_kimage_alloc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_loaddata_free(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_mcast_group_source(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long do_mincore(@Unsigned long addr2, @Unsigned long pages, String vec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_mq_getsetattr(int mqdes, Ptr<MqDefinitions.mq_attr> _new, Ptr<MqDefinitions.mq_attr> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_mq_notify($arg1, (const struct sigevent*)$arg2)")
    public static int do_mq_notify(@OriginalName(value="mqd_t") int mqdes, Ptr<runtime.sigevent> notification2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_mq_open((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int do_mq_open(String u_name, int oflag, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<MqDefinitions.mq_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_mq_timedreceive(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, Ptr<@Unsigned Integer> u_msg_prio, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_mq_timedsend($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int do_mq_timedsend(@OriginalName(value="mqd_t") int mqdes, String u_msg_ptr, @Unsigned long msg_len, @Unsigned int msg_prio, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_name() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_one_broadcast(Ptr<runtime.sock> sk, Ptr<NetlinkDefinitions.netlink_broadcast_data> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_pci_disable_device(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_pci_enable_device(Ptr<PciDefinitions.pci_dev> dev, int bars) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_pipe2(Ptr<Integer> fildes, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_pipe_flags(Ptr<Integer> fd2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_populate_rootfs(Ptr<?> unused, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_dointvec_conv(Ptr<@OriginalName(value="bool") Boolean> negp, Ptr<@Unsigned Long> lvalp, Ptr<Integer> valp, int write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_dointvec_jiffies_conv(Ptr<@OriginalName(value="bool") Boolean> negp, Ptr<@Unsigned Long> lvalp, Ptr<Integer> valp, int write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_dointvec_minmax_conv(Ptr<@OriginalName(value="bool") Boolean> negp, Ptr<@Unsigned Long> lvalp, Ptr<Integer> valp, int write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_dointvec_ms_jiffies_conv(Ptr<@OriginalName(value="bool") Boolean> negp, Ptr<@Unsigned Long> lvalp, Ptr<Integer> valp, int write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_dointvec_ms_jiffies_minmax_conv(Ptr<@OriginalName(value="bool") Boolean> negp, Ptr<@Unsigned Long> lvalp, Ptr<Integer> valp, int write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_dointvec_userhz_jiffies_conv(Ptr<@OriginalName(value="bool") Boolean> negp, Ptr<@Unsigned Long> lvalp, Ptr<Integer> valp, int write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_dopipe_max_size_conv(Ptr<@Unsigned Long> lvalp, Ptr<@Unsigned Integer> valp, int write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_proc_douintvec((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5, (int (*)(long unsigned int*, unsigned int*, int, void*))$arg6, $arg7)")
    public static int do_proc_douintvec(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<?> conv, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_douintvec_conv(Ptr<@Unsigned Long> lvalp, Ptr<@Unsigned Integer> valp, int write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_proc_douintvec_minmax_conv(Ptr<@Unsigned Long> lvalp, Ptr<@Unsigned Integer> valp, int write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> do_read_cache_folio(Ptr<misc.address_space> mapping, @Unsigned long index2, Ptr<?> filler, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_reset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_sched_setscheduler(@OriginalName(value="pid_t") int pid2, int policy, Ptr<SchedDefinitions.sched_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_sched_yield() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_set_master(Ptr<NetDefinitions.net_device> dev, int ifindex, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_setlink((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int do_setlink(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<runtime.ifinfomsg> ifm, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<Ptr<runtime.nlattr>> tb, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_settimeofday64((const struct timespec64*)$arg1)")
    public static int do_settimeofday64(Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_setvfinfo(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<runtime.nlattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_setxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<XattrDefinitions.xattr_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_skip() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_softirq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_spring_cleaning(Ptr<misc.ce_array> ca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_start() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_statfs64(Ptr<runtime.kstatfs> st2, Ptr<statfs64> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_statfs_native(Ptr<runtime.kstatfs> st2, Ptr<statfs> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_swap($arg1, $arg2, $arg3, $arg4, (const void*)$arg5)")
    public static void do_swap(Ptr<?> a, Ptr<?> b, @Unsigned long size, @OriginalName(value="swap_r_func_t") Ptr<?> swap_func, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_symlink() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> do_sync_mmap_readahead(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_sync_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean do_syscall_64(Ptr<PtDefinitions.pt_regs> regs, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_thaw_all(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_thaw_all_callback(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_timer(@Unsigned long ticks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_timer_create(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.sigevent> event2, Ptr<@OriginalName(value="timer_t") Integer> created_timer_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_timer_gettime(@OriginalName(value="timer_t") int timer_id, Ptr<runtime.itimerspec64> setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_timer_settime(@OriginalName(value="timer_t") int timer_id, int tmr_flags, Ptr<runtime.itimerspec64> new_spec64, Ptr<runtime.itimerspec64> old_spec64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_timerfd_gettime(int ufd, Ptr<runtime.itimerspec64> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_timerfd_settime($arg1, $arg2, (const struct itimerspec64*)$arg3, $arg4)")
    public static int do_timerfd_settime(int ufd, int flags, Ptr<runtime.itimerspec64> _new, Ptr<runtime.itimerspec64> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="do_trace_netlink_extack((const u8*)$arg1)")
    public static void do_trace_netlink_extack(String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_trap(int trapnr, int signr, String str, Ptr<PtDefinitions.pt_regs> regs, long error_code, int sicode, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_user_addr_fault(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_utime(String filename2, @OriginalName(value="time64_t") long mtime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void do_vc_no_ghcb(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long exit_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int do_vfs_ioctl(Ptr<runtime.file> filp, @Unsigned int fd2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ustat")
    @NotUsableInJava
    public static class ustat
    extends Struct {
        public @OriginalName(value="__kernel_daddr_t") int f_tfree;
        public @Unsigned long f_tinode;
        public char @Size(value=6) [] f_fname;
        public char @Size(value=6) [] f_fpack;
    }

    @Type(noCCodeGeneration=true, cType="struct tms")
    @NotUsableInJava
    public static class tms
    extends Struct {
        public @OriginalName(value="__kernel_clock_t") long tms_utime;
        public @OriginalName(value="__kernel_clock_t") long tms_stime;
        public @OriginalName(value="__kernel_clock_t") long tms_cutime;
        public @OriginalName(value="__kernel_clock_t") long tms_cstime;
    }

    @Type(noCCodeGeneration=true, cType="struct statfs")
    @NotUsableInJava
    public static class statfs
    extends Struct {
        public @OriginalName(value="__kernel_long_t") long f_type;
        public @OriginalName(value="__kernel_long_t") long f_bsize;
        public @OriginalName(value="__kernel_long_t") long f_blocks;
        public @OriginalName(value="__kernel_long_t") long f_bfree;
        public @OriginalName(value="__kernel_long_t") long f_bavail;
        public @OriginalName(value="__kernel_long_t") long f_files;
        public @OriginalName(value="__kernel_long_t") long f_ffree;
        public KernelDefinitions.__kernel_fsid_t f_fsid;
        public @OriginalName(value="__kernel_long_t") long f_namelen;
        public @OriginalName(value="__kernel_long_t") long f_frsize;
        public @OriginalName(value="__kernel_long_t") long f_flags;
        public @OriginalName(value="__kernel_long_t") long @Size(value=4) [] f_spare;
    }

    @Type(noCCodeGeneration=true, cType="struct rlimit64")
    @NotUsableInJava
    public static class rlimit64
    extends Struct {
        public @Unsigned long rlim_cur;
        public @Unsigned long rlim_max;
    }

    @Type(noCCodeGeneration=true, cType="struct statfs64")
    @NotUsableInJava
    public static class statfs64
    extends Struct {
        public @OriginalName(value="__kernel_long_t") long f_type;
        public @OriginalName(value="__kernel_long_t") long f_bsize;
        public @Unsigned long f_blocks;
        public @Unsigned long f_bfree;
        public @Unsigned long f_bavail;
        public @Unsigned long f_files;
        public @Unsigned long f_ffree;
        public KernelDefinitions.__kernel_fsid_t f_fsid;
        public @OriginalName(value="__kernel_long_t") long f_namelen;
        public @OriginalName(value="__kernel_long_t") long f_frsize;
        public @OriginalName(value="__kernel_long_t") long f_flags;
        public @OriginalName(value="__kernel_long_t") long @Size(value=4) [] f_spare;
    }

    @Type(noCCodeGeneration=true, cType="struct do_proc_douintvec_minmax_conv_param")
    @NotUsableInJava
    public static class do_proc_douintvec_minmax_conv_param
    extends Struct {
        public Ptr<@Unsigned Integer> min;
        public Ptr<@Unsigned Integer> max;
    }

    @Type(noCCodeGeneration=true, cType="struct do_proc_dointvec_minmax_conv_param")
    @NotUsableInJava
    public static class do_proc_dointvec_minmax_conv_param
    extends Struct {
        public Ptr<Integer> min;
        public Ptr<Integer> max;
    }
}

