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
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.CdromDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.IwDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KeyctlDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.MsgDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.OldDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SerialDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class CompatDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_arch_ptrace(Ptr<TaskDefinitions.task_struct> child, @OriginalName(value="compat_long_t") int request2, @Unsigned @OriginalName(value="compat_ulong_t") int caddr, @Unsigned @OriginalName(value="compat_ulong_t") int cdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_blk_trace_setup(Ptr<RequestDefinitions.request_queue> q, String name, @Unsigned @OriginalName(value="dev_t") int dev, Ptr<BlockDefinitions.block_device> bdev, String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_core_sys_select(int n, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> inp, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> outp, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> exp, Ptr<runtime.timespec64> end_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_do_msg_fill(Ptr<?> dest, Ptr<MsgDefinitions.msg_msg> msg, @Unsigned long bufsz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_drm_getclient(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_drm_getstats(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_drm_getunique(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_drm_mode_addfb2(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_drm_setunique(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_drm_update_draw(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_drm_version(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_drm_wait_vblank(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_ksys_msgctl(int msqid, int cmd, Ptr<?> uptr, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_ksys_msgrcv(int msqid, @Unsigned @OriginalName(value="compat_uptr_t") int msgp, @OriginalName(value="compat_ssize_t") int msgsz, @OriginalName(value="compat_long_t") int msgtyp, int msgflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_ksys_msgsnd(int msqid, @Unsigned @OriginalName(value="compat_uptr_t") int msgp, @OriginalName(value="compat_ssize_t") int msgsz, int msgflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_ksys_old_msgctl(int msqid, int cmd, Ptr<?> uptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_raw_ioctl(Ptr<runtime.sock> sk, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_sock_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_sock_ioctl_trans(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_standard_call(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.iwreq> iwr, @Unsigned int cmd, Ptr<IwDefinitions.iw_request_info> info2, @OriginalName(value="iw_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_wext_handle_ioctl(Ptr<runtime.net> net2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __compat_save_altstack(Ptr<@OriginalName(value="compat_stack_t") compat_sigaltstack> uss, @Unsigned long sp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_blkdev_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_i2cdev_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_ipv6_get_msfilter(Ptr<runtime.sock> sk, misc.sockptr_t optval, misc.sockptr_t optlen, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_ipv6_mcast_join_leave(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_ipv6_set_mcast_msfilter(Ptr<runtime.sock> sk, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_ksys_old_semctl(int semid, int semnum, int cmd, int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_ksys_semctl(int semid, int semnum, int cmd, int arg2, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="compat_ksys_semtimedop($arg1, $arg2, $arg3, (const struct old_timespec32*)$arg4)")
    public static long compat_ksys_semtimedop(int semid, Ptr<runtime.sembuf> tsems, @Unsigned int nsops, Ptr<OldDefinitions.old_timespec32> timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="compat_restore_altstack((const compat_sigaltstack*)$arg1)")
    public static int compat_restore_altstack(Ptr<@OriginalName(value="compat_stack_t") compat_sigaltstack> uss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void compat_start_thread(Ptr<PtDefinitions.pt_regs> regs, @Unsigned int new_ip, @Unsigned int new_sp, boolean x32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="compat_filldir($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static boolean compat_filldir(Ptr<misc.dir_context> ctx, String name, int namlen, @OriginalName(value="loff_t") long offset, @Unsigned long ino, @Unsigned int d_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="compat_fillonedir($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static boolean compat_fillonedir(Ptr<misc.dir_context> ctx, String name, int namlen, @OriginalName(value="loff_t") long offset, @Unsigned long ino, @Unsigned int d_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="compat_get_bitmap($arg1, (const unsigned int*)$arg2, $arg3)")
    public static long compat_get_bitmap(Ptr<@Unsigned Long> mask, Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> umask, @Unsigned long bitmap_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_ksys_old_shmctl(int shmid, int cmd, Ptr<?> uptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_ksys_shmctl(int shmid, int cmd, Ptr<?> uptr, int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="compat_only_sysfs_link_entry_to_kobj($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static int compat_only_sysfs_link_entry_to_kobj(Ptr<runtime.kobject> kobj, Ptr<runtime.kobject> target_kobj, String target_name, String symlink_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_ptrace_request(Ptr<TaskDefinitions.task_struct> child, @OriginalName(value="compat_long_t") int request2, @Unsigned @OriginalName(value="compat_ulong_t") int addr2, @Unsigned @OriginalName(value="compat_ulong_t") int data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_put_bitmap(Ptr<@Unsigned @OriginalName(value="compat_ulong_t") Integer> umask, Ptr<@Unsigned Long> mask, @Unsigned long bitmap_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_rawv6_ioctl(Ptr<runtime.sock> sk, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_tty_tiocgserial(Ptr<TtyDefinitions.tty_struct> tty, Ptr<SerialDefinitions.serial_struct32> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_tty_tiocsserial(Ptr<TtyDefinitions.tty_struct> tty, Ptr<SerialDefinitions.serial_struct32> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_arch_setup_additional_pages(Ptr<LinuxDefinitions.linux_binprm> bprm, int uses_interp, boolean x32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_ioctl_preallocate(Ptr<runtime.file> file2, int mode, Ptr<misc.space_resv_32> argp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_ip_get_mcast_msfilter(Ptr<runtime.sock> sk, misc.sockptr_t optval, misc.sockptr_t optlen, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_ip_mcast_join_leave(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_ip_set_mcast_msfilter(Ptr<runtime.sock> sk, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_keyctl_dh_compute(Ptr<KeyctlDefinitions.keyctl_dh_params> params, String buffer, @Unsigned long buflen, Ptr<compat_keyctl_kdf_params> kdf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_ksys_ipc(@Unsigned int call, int first, int second, @Unsigned int third, @Unsigned @OriginalName(value="compat_uptr_t") int ptr, @Unsigned int fifth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int compat_private_call(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.iwreq> iwr, @Unsigned int cmd, Ptr<IwDefinitions.iw_request_info> info2, @OriginalName(value="iw_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long compat_ptr_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sioc_vif_req")
    @NotUsableInJava
    public static class compat_sioc_vif_req
    extends Struct {
        public @Unsigned @OriginalName(value="vifi_t") short vifi;
        public @Unsigned @OriginalName(value="compat_ulong_t") int icount;
        public @Unsigned @OriginalName(value="compat_ulong_t") int ocount;
        public @Unsigned @OriginalName(value="compat_ulong_t") int ibytes;
        public @Unsigned @OriginalName(value="compat_ulong_t") int obytes;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sioc_sg_req")
    @NotUsableInJava
    public static class compat_sioc_sg_req
    extends Struct {
        public InDefinitions.in_addr src;
        public InDefinitions.in_addr grp;
        public @Unsigned @OriginalName(value="compat_ulong_t") int pktcnt;
        public @Unsigned @OriginalName(value="compat_ulong_t") int bytecnt;
        public @Unsigned @OriginalName(value="compat_ulong_t") int wrong_if;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ethtool_rxnfc")
    @NotUsableInJava
    public static class compat_ethtool_rxnfc
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int flow_type;
        public @Unsigned @OriginalName(value="compat_u64") long data;
        public compat_ethtool_rx_flow_spec fs;
        public @Unsigned int rule_cnt;
        public @Unsigned int @Size(value=0) [] rule_locs;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ethtool_rx_flow_spec")
    @NotUsableInJava
    public static class compat_ethtool_rx_flow_spec
    extends Struct {
        public @Unsigned int flow_type;
        public EthtoolDefinitions.ethtool_flow_union h_u;
        public EthtoolDefinitions.ethtool_flow_ext h_ext;
        public EthtoolDefinitions.ethtool_flow_union m_u;
        public EthtoolDefinitions.ethtool_flow_ext m_ext;
        public @Unsigned @OriginalName(value="compat_u64") long ring_cookie;
        public @Unsigned int location;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_cdrom_read_audio")
    @NotUsableInJava
    public static class compat_cdrom_read_audio
    extends Struct {
        public CdromDefinitions.cdrom_addr addr;
        public char addr_format;
        public @OriginalName(value="compat_int_t") int nframes;
        public @Unsigned @OriginalName(value="compat_caddr_t") int buf;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_hpet_info")
    @NotUsableInJava
    public static class compat_hpet_info
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int hi_ireqfreq;
        public @Unsigned @OriginalName(value="compat_ulong_t") int hi_flags;
        public @Unsigned short hi_hpet;
        public @Unsigned short hi_timer;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_shm_info")
    @NotUsableInJava
    public static class compat_shm_info
    extends Struct {
        public @OriginalName(value="compat_int_t") int used_ids;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_tot;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_rss;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_swp;
        public @Unsigned @OriginalName(value="compat_ulong_t") int swap_attempts;
        public @Unsigned @OriginalName(value="compat_ulong_t") int swap_successes;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_shminfo64")
    @NotUsableInJava
    public static class compat_shminfo64
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int shmmax;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shmmin;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shmmni;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shmseg;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shmall;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused1;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused2;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused3;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused4;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_shmid_ds")
    @NotUsableInJava
    public static class compat_shmid_ds
    extends Struct {
        public compat_ipc_perm shm_perm;
        public int shm_segsz;
        public @OriginalName(value="old_time32_t") int shm_atime;
        public @OriginalName(value="old_time32_t") int shm_dtime;
        public @OriginalName(value="old_time32_t") int shm_ctime;
        public @Unsigned @OriginalName(value="compat_ipc_pid_t") short shm_cpid;
        public @Unsigned @OriginalName(value="compat_ipc_pid_t") short shm_lpid;
        public @Unsigned short shm_nattch;
        public @Unsigned short shm_unused;
        public @Unsigned @OriginalName(value="compat_uptr_t") int shm_unused2;
        public @Unsigned @OriginalName(value="compat_uptr_t") int shm_unused3;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_shmid64_ds")
    @NotUsableInJava
    public static class compat_shmid64_ds
    extends Struct {
        public compat_ipc64_perm shm_perm;
        public @Unsigned @OriginalName(value="compat_size_t") int shm_segsz;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_atime;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_atime_high;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_dtime;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_dtime_high;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_ctime;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_ctime_high;
        public @OriginalName(value="compat_pid_t") int shm_cpid;
        public @OriginalName(value="compat_pid_t") int shm_lpid;
        public @Unsigned @OriginalName(value="compat_ulong_t") int shm_nattch;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused4;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused5;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_fs_quota_stat")
    @NotUsableInJava
    public static class compat_fs_quota_stat
    extends Struct {
        public byte qs_version;
        public @Unsigned short qs_flags;
        public byte qs_pad;
        public compat_fs_qfilestat qs_uquota;
        public compat_fs_qfilestat qs_gquota;
        public @Unsigned @OriginalName(value="compat_uint_t") int qs_incoredqs;
        public @OriginalName(value="compat_int_t") int qs_btimelimit;
        public @OriginalName(value="compat_int_t") int qs_itimelimit;
        public @OriginalName(value="compat_int_t") int qs_rtbtimelimit;
        public @Unsigned short qs_bwarnlimit;
        public @Unsigned short qs_iwarnlimit;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_fs_qfilestat")
    @NotUsableInJava
    public static class compat_fs_qfilestat
    extends Struct {
        public @Unsigned @OriginalName(value="compat_u64") long dqb_bhardlimit;
        public @Unsigned @OriginalName(value="compat_u64") long qfs_nblks;
        public @Unsigned @OriginalName(value="compat_uint_t") int qfs_nextents;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_if_dqblk")
    @NotUsableInJava
    public static class compat_if_dqblk
    extends Struct {
        public @Unsigned @OriginalName(value="compat_u64") long dqb_bhardlimit;
        public @Unsigned @OriginalName(value="compat_u64") long dqb_bsoftlimit;
        public @Unsigned @OriginalName(value="compat_u64") long dqb_curspace;
        public @Unsigned @OriginalName(value="compat_u64") long dqb_ihardlimit;
        public @Unsigned @OriginalName(value="compat_u64") long dqb_isoftlimit;
        public @Unsigned @OriginalName(value="compat_u64") long dqb_curinodes;
        public @Unsigned @OriginalName(value="compat_u64") long dqb_btime;
        public @Unsigned @OriginalName(value="compat_u64") long dqb_itime;
        public @Unsigned @OriginalName(value="compat_uint_t") int dqb_valid;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_elf_prstatus")
    @NotUsableInJava
    public static class compat_elf_prstatus
    extends Struct {
        public compat_elf_prstatus_common common;
        public  @OriginalName(value="compat_elf_gregset_t") UserDefinitions.user_regs_struct pr_reg;
        public @OriginalName(value="compat_int_t") int pr_fpvalid;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_elf_prpsinfo")
    @NotUsableInJava
    public static class compat_elf_prpsinfo
    extends Struct {
        public char pr_state;
        public char pr_sname;
        public char pr_zomb;
        public char pr_nice;
        public @Unsigned @OriginalName(value="compat_ulong_t") int pr_flag;
        public @Unsigned @OriginalName(value="__compat_uid_t") short pr_uid;
        public @Unsigned @OriginalName(value="__compat_gid_t") short pr_gid;
        public @OriginalName(value="compat_pid_t") int pr_pid;
        public @OriginalName(value="compat_pid_t") int pr_ppid;
        public @OriginalName(value="compat_pid_t") int pr_pgrp;
        public @OriginalName(value="compat_pid_t") int pr_sid;
        public char @Size(value=16) [] pr_fname;
        public char @Size(value=80) [] pr_psargs;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_elf_prstatus_common")
    @NotUsableInJava
    public static class compat_elf_prstatus_common
    extends Struct {
        public compat_elf_siginfo pr_info;
        public short pr_cursig;
        public @Unsigned @OriginalName(value="compat_ulong_t") int pr_sigpend;
        public @Unsigned @OriginalName(value="compat_ulong_t") int pr_sighold;
        public @OriginalName(value="compat_pid_t") int pr_pid;
        public @OriginalName(value="compat_pid_t") int pr_ppid;
        public @OriginalName(value="compat_pid_t") int pr_pgrp;
        public @OriginalName(value="compat_pid_t") int pr_sid;
        public OldDefinitions.old_timeval32 pr_utime;
        public OldDefinitions.old_timeval32 pr_stime;
        public OldDefinitions.old_timeval32 pr_cutime;
        public OldDefinitions.old_timeval32 pr_cstime;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_elf_siginfo")
    @NotUsableInJava
    public static class compat_elf_siginfo
    extends Struct {
        public @OriginalName(value="compat_int_t") int si_signo;
        public @OriginalName(value="compat_int_t") int si_code;
        public @OriginalName(value="compat_int_t") int si_errno;
    }

    @Type(noCCodeGeneration=true, cType="struct __compat_aio_sigset")
    @NotUsableInJava
    public static class __compat_aio_sigset
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int sigmask;
        public @Unsigned @OriginalName(value="compat_size_t") int sigsetsize;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_getdents_callback")
    @NotUsableInJava
    public static class compat_getdents_callback
    extends Struct {
        public misc.dir_context ctx;
        public Ptr<compat_linux_dirent> current_dir;
        public int prev_reclen;
        public int count;
        public int error;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_linux_dirent")
    @NotUsableInJava
    public static class compat_linux_dirent
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int d_ino;
        public @Unsigned @OriginalName(value="compat_ulong_t") int d_off;
        public @Unsigned short d_reclen;
        public char @Size(value=0) [] d_name;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_readdir_callback")
    @NotUsableInJava
    public static class compat_readdir_callback
    extends Struct {
        public misc.dir_context ctx;
        public Ptr<compat_old_linux_dirent> dirent;
        public int result;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_old_linux_dirent")
    @NotUsableInJava
    public static class compat_old_linux_dirent
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int d_ino;
        public @Unsigned @OriginalName(value="compat_ulong_t") int d_offset;
        public @Unsigned short d_namlen;
        public char @Size(value=0) [] d_name;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_resume_swap_area")
    @NotUsableInJava
    public static class compat_resume_swap_area
    extends Struct {
        public @OriginalName(value="compat_loff_t") long offset;
        public @Unsigned int dev;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sioc_mif_req6")
    @NotUsableInJava
    public static class compat_sioc_mif_req6
    extends Struct {
        public @Unsigned @OriginalName(value="mifi_t") short mifi;
        public @Unsigned @OriginalName(value="compat_ulong_t") int icount;
        public @Unsigned @OriginalName(value="compat_ulong_t") int ocount;
        public @Unsigned @OriginalName(value="compat_ulong_t") int ibytes;
        public @Unsigned @OriginalName(value="compat_ulong_t") int obytes;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sioc_sg_req6")
    @NotUsableInJava
    public static class compat_sioc_sg_req6
    extends Struct {
        public misc.sockaddr_in6 src;
        public misc.sockaddr_in6 grp;
        public @Unsigned @OriginalName(value="compat_ulong_t") int pktcnt;
        public @Unsigned @OriginalName(value="compat_ulong_t") int bytecnt;
        public @Unsigned @OriginalName(value="compat_ulong_t") int wrong_if;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_loop_info")
    @NotUsableInJava
    public static class compat_loop_info
    extends Struct {
        public @OriginalName(value="compat_int_t") int lo_number;
        public @Unsigned @OriginalName(value="compat_dev_t") short lo_device;
        public @Unsigned @OriginalName(value="compat_ulong_t") int lo_inode;
        public @Unsigned @OriginalName(value="compat_dev_t") short lo_rdevice;
        public @OriginalName(value="compat_int_t") int lo_offset;
        public @OriginalName(value="compat_int_t") int lo_encrypt_type;
        public @OriginalName(value="compat_int_t") int lo_encrypt_key_size;
        public @OriginalName(value="compat_int_t") int lo_flags;
        public char @Size(value=64) [] lo_name;
        public char @Size(value=32) [] lo_encrypt_key;
        public @Unsigned @OriginalName(value="compat_ulong_t") int @Size(value=2) [] lo_init;
        public char @Size(value=4) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_hd_geometry")
    @NotUsableInJava
    public static class compat_hd_geometry
    extends Struct {
        public char heads;
        public char sectors;
        public @Unsigned short cylinders;
        public @Unsigned int start;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_blkpg_ioctl_arg")
    @NotUsableInJava
    public static class compat_blkpg_ioctl_arg
    extends Struct {
        public @OriginalName(value="compat_int_t") int op;
        public @OriginalName(value="compat_int_t") int flags;
        public @OriginalName(value="compat_int_t") int datalen;
        public @Unsigned @OriginalName(value="compat_caddr_t") int data;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_semid_ds")
    @NotUsableInJava
    public static class compat_semid_ds
    extends Struct {
        public compat_ipc_perm sem_perm;
        public @OriginalName(value="old_time32_t") int sem_otime;
        public @OriginalName(value="old_time32_t") int sem_ctime;
        public @Unsigned @OriginalName(value="compat_uptr_t") int sem_base;
        public @Unsigned @OriginalName(value="compat_uptr_t") int sem_pending;
        public @Unsigned @OriginalName(value="compat_uptr_t") int sem_pending_last;
        public @Unsigned @OriginalName(value="compat_uptr_t") int undo;
        public @Unsigned short sem_nsems;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_semid64_ds")
    @NotUsableInJava
    public static class compat_semid64_ds
    extends Struct {
        public compat_ipc64_perm sem_perm;
        public @Unsigned @OriginalName(value="compat_ulong_t") int sem_otime;
        public @Unsigned @OriginalName(value="compat_ulong_t") int sem_otime_high;
        public @Unsigned @OriginalName(value="compat_ulong_t") int sem_ctime;
        public @Unsigned @OriginalName(value="compat_ulong_t") int sem_ctime_high;
        public @Unsigned @OriginalName(value="compat_ulong_t") int sem_nsems;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused3;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused4;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_dirent")
    @NotUsableInJava
    public static class compat_dirent
    extends Struct {
        public @Unsigned int d_ino;
        public @OriginalName(value="compat_off_t") int d_off;
        public @Unsigned short d_reclen;
        public char @Size(value=256) [] d_name;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_old_sigaction")
    @NotUsableInJava
    public static class compat_old_sigaction
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int sa_handler;
        public @Unsigned @OriginalName(value="compat_old_sigset_t") int sa_mask;
        public @Unsigned @OriginalName(value="compat_ulong_t") int sa_flags;
        public @Unsigned @OriginalName(value="compat_uptr_t") int sa_restorer;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sigaction")
    @NotUsableInJava
    public static class compat_sigaction
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int sa_handler;
        public @Unsigned @OriginalName(value="compat_ulong_t") int sa_flags;
        public @Unsigned @OriginalName(value="compat_uptr_t") int sa_restorer;
        public compat_sigset_t sa_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sigaltstack")
    @NotUsableInJava
    public static class compat_sigaltstack
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int ss_sp;
        public int ss_flags;
        public @Unsigned @OriginalName(value="compat_size_t") int ss_size;
    }

    @Type(noCCodeGeneration=true, cType="struct __compat_iw_event")
    @NotUsableInJava
    public static class __compat_iw_event
    extends Struct {
        public @Unsigned short len;
        public @Unsigned short cmd;
        @InlineUnion(value=34936)
        public @InlineUnion(value=34936) @Unsigned @OriginalName(value="compat_caddr_t") int pointer;
        @InlineUnion(value=34936)
        public  @InlineUnion(value=34936) AnonDefinitions.anon_member_of_anon_member_of___compat_iw_event anon2$1;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_in6_rtmsg")
    @NotUsableInJava
    public static class compat_in6_rtmsg
    extends Struct {
        public In6Definitions.in6_addr rtmsg_dst;
        public In6Definitions.in6_addr rtmsg_src;
        public In6Definitions.in6_addr rtmsg_gateway;
        public @Unsigned int rtmsg_type;
        public @Unsigned short rtmsg_dst_len;
        public @Unsigned short rtmsg_src_len;
        public @Unsigned int rtmsg_metric;
        public @Unsigned int rtmsg_info;
        public @Unsigned int rtmsg_flags;
        public int rtmsg_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_rtentry")
    @NotUsableInJava
    public static class compat_rtentry
    extends Struct {
        public @Unsigned int rt_pad1;
        public runtime.sockaddr rt_dst;
        public runtime.sockaddr rt_gateway;
        public runtime.sockaddr rt_genmask;
        public @Unsigned short rt_flags;
        public short rt_pad2;
        public @Unsigned int rt_pad3;
        public char rt_tos;
        public char rt_class;
        public short rt_pad4;
        public short rt_metric;
        public @Unsigned @OriginalName(value="compat_uptr_t") int rt_dev;
        public @Unsigned int rt_mtu;
        public @Unsigned int rt_window;
        public @Unsigned short rt_irtt;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_cmsghdr")
    @NotUsableInJava
    public static class compat_cmsghdr
    extends Struct {
        public @Unsigned @OriginalName(value="compat_size_t") int cmsg_len;
        public @OriginalName(value="compat_int_t") int cmsg_level;
        public @OriginalName(value="compat_int_t") int cmsg_type;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ifconf")
    @NotUsableInJava
    public static class compat_ifconf
    extends Struct {
        public @OriginalName(value="compat_int_t") int ifc_len;
        public @Unsigned @OriginalName(value="compat_caddr_t") int ifcbuf;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_mmsghdr")
    @NotUsableInJava
    public static class compat_mmsghdr
    extends Struct {
        public compat_msghdr msg_hdr;
        public @Unsigned @OriginalName(value="compat_uint_t") int msg_len;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_msghdr")
    @NotUsableInJava
    public static class compat_msghdr
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int msg_name;
        public @OriginalName(value="compat_int_t") int msg_namelen;
        public @Unsigned @OriginalName(value="compat_uptr_t") int msg_iov;
        public @Unsigned @OriginalName(value="compat_size_t") int msg_iovlen;
        public @Unsigned @OriginalName(value="compat_uptr_t") int msg_control;
        public @Unsigned @OriginalName(value="compat_size_t") int msg_controllen;
        public @Unsigned @OriginalName(value="compat_uint_t") int msg_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ifreq")
    @NotUsableInJava
    public static class compat_ifreq
    extends Struct {
        public misc.ifr_ifrn_of_compat_ifreq_and_ifr_ifrn_of_ifreq_and_ifr_ifrn_of_iwreq ifr_ifrn;
        public misc.ifr_ifru_of_compat_ifreq ifr_ifru;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_if_settings")
    @NotUsableInJava
    public static class compat_if_settings
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int size;
        public @Unsigned @OriginalName(value="compat_uptr_t") int ifs_ifsu;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ifmap")
    @NotUsableInJava
    public static class compat_ifmap
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int mem_start;
        public @Unsigned @OriginalName(value="compat_ulong_t") int mem_end;
        public @Unsigned short base_addr;
        public char irq;
        public char dma;
        public char port;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_cdrom_generic_command")
    @NotUsableInJava
    public static class compat_cdrom_generic_command
    extends Struct {
        public char @Size(value=12) [] cmd;
        public @Unsigned @OriginalName(value="compat_caddr_t") int buffer;
        public @Unsigned @OriginalName(value="compat_uint_t") int buflen;
        public @OriginalName(value="compat_int_t") int stat;
        public @Unsigned @OriginalName(value="compat_caddr_t") int sense;
        public char data_direction;
        public char @Size(value=3) [] pad;
        public @OriginalName(value="compat_int_t") int quiet;
        public @OriginalName(value="compat_int_t") int timeout;
        public @Unsigned @OriginalName(value="compat_caddr_t") int unused;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_msgbuf")
    @NotUsableInJava
    public static class compat_msgbuf
    extends Struct {
        public @OriginalName(value="compat_long_t") int mtype;
        public char @Size(value=1) [] mtext;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_msqid_ds")
    @NotUsableInJava
    public static class compat_msqid_ds
    extends Struct {
        public compat_ipc_perm msg_perm;
        public @Unsigned @OriginalName(value="compat_uptr_t") int msg_first;
        public @Unsigned @OriginalName(value="compat_uptr_t") int msg_last;
        public @OriginalName(value="old_time32_t") int msg_stime;
        public @OriginalName(value="old_time32_t") int msg_rtime;
        public @OriginalName(value="old_time32_t") int msg_ctime;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_lcbytes;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_lqbytes;
        public @Unsigned short msg_cbytes;
        public @Unsigned short msg_qnum;
        public @Unsigned short msg_qbytes;
        public @Unsigned @OriginalName(value="compat_ipc_pid_t") short msg_lspid;
        public @Unsigned @OriginalName(value="compat_ipc_pid_t") short msg_lrpid;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ipc_perm")
    @NotUsableInJava
    public static class compat_ipc_perm
    extends Struct {
        public @OriginalName(value="key_t") int key;
        public @Unsigned @OriginalName(value="__compat_uid_t") short uid;
        public @Unsigned @OriginalName(value="__compat_gid_t") short gid;
        public @Unsigned @OriginalName(value="__compat_uid_t") short cuid;
        public @Unsigned @OriginalName(value="__compat_gid_t") short cgid;
        public @Unsigned @OriginalName(value="compat_mode_t") short mode;
        public @Unsigned short seq;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_msqid64_ds")
    @NotUsableInJava
    public static class compat_msqid64_ds
    extends Struct {
        public compat_ipc64_perm msg_perm;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_stime;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_stime_high;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_rtime;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_rtime_high;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_ctime;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_ctime_high;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_cbytes;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_qnum;
        public @Unsigned @OriginalName(value="compat_ulong_t") int msg_qbytes;
        public @OriginalName(value="compat_pid_t") int msg_lspid;
        public @OriginalName(value="compat_pid_t") int msg_lrpid;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused4;
        public @Unsigned @OriginalName(value="compat_ulong_t") int __unused5;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ipc64_perm")
    @NotUsableInJava
    public static class compat_ipc64_perm
    extends Struct {
        public @OriginalName(value="compat_key_t") int key;
        public @Unsigned @OriginalName(value="__compat_uid32_t") int uid;
        public @Unsigned @OriginalName(value="__compat_gid32_t") int gid;
        public @Unsigned @OriginalName(value="__compat_uid32_t") int cuid;
        public @Unsigned @OriginalName(value="__compat_gid32_t") int cgid;
        public @Unsigned @OriginalName(value="compat_mode_t") short mode;
        public char @Size(value=2) [] __pad1;
        public @Unsigned @OriginalName(value="compat_ushort_t") short seq;
        public @Unsigned @OriginalName(value="compat_ushort_t") short __pad2;
        public @Unsigned @OriginalName(value="compat_ulong_t") int unused1;
        public @Unsigned @OriginalName(value="compat_ulong_t") int unused2;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_iovec")
    @NotUsableInJava
    public static class compat_iovec
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int iov_base;
        public @Unsigned @OriginalName(value="compat_size_t") int iov_len;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sigset_argpack")
    @NotUsableInJava
    public static class compat_sigset_argpack
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int p;
        public @Unsigned @OriginalName(value="compat_size_t") int size;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sel_arg_struct")
    @NotUsableInJava
    public static class compat_sel_arg_struct
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int n;
        public @Unsigned @OriginalName(value="compat_uptr_t") int inp;
        public @Unsigned @OriginalName(value="compat_uptr_t") int outp;
        public @Unsigned @OriginalName(value="compat_uptr_t") int exp;
        public @Unsigned @OriginalName(value="compat_uptr_t") int tvp;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int sig[2]; }")
    @NotUsableInJava
    public static class compat_sigset_t
    extends Struct {
        public @Unsigned @OriginalName(value="compat_sigset_word") int @Size(value=2) [] sig;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_flock64")
    @NotUsableInJava
    public static class compat_flock64
    extends Struct {
        public short l_type;
        public short l_whence;
        public @OriginalName(value="compat_loff_t") long l_start;
        public @OriginalName(value="compat_loff_t") long l_len;
        public @OriginalName(value="compat_pid_t") int l_pid;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_flock")
    @NotUsableInJava
    public static class compat_flock
    extends Struct {
        public short l_type;
        public short l_whence;
        public @OriginalName(value="compat_off_t") int l_start;
        public @OriginalName(value="compat_off_t") int l_len;
        public @OriginalName(value="compat_pid_t") int l_pid;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_stat")
    @NotUsableInJava
    public static class compat_stat
    extends Struct {
        public @Unsigned int st_dev;
        public @Unsigned @OriginalName(value="compat_ino_t") int st_ino;
        public @Unsigned @OriginalName(value="compat_mode_t") short st_mode;
        public @Unsigned @OriginalName(value="compat_nlink_t") short st_nlink;
        public @Unsigned @OriginalName(value="__compat_uid_t") short st_uid;
        public @Unsigned @OriginalName(value="__compat_gid_t") short st_gid;
        public @Unsigned int st_rdev;
        public @Unsigned int st_size;
        public @Unsigned int st_blksize;
        public @Unsigned int st_blocks;
        public @Unsigned int st_atime;
        public @Unsigned int st_atime_nsec;
        public @Unsigned int st_mtime;
        public @Unsigned int st_mtime_nsec;
        public @Unsigned int st_ctime;
        public @Unsigned int st_ctime_nsec;
        public @Unsigned int __unused4;
        public @Unsigned int __unused5;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_blk_user_trace_setup")
    @NotUsableInJava
    public static class compat_blk_user_trace_setup
    extends Struct {
        public char @Size(value=32) [] name;
        public @Unsigned short act_mask;
        public @Unsigned int buf_size;
        public @Unsigned int buf_nr;
        public @Unsigned @OriginalName(value="compat_u64") long start_lba;
        public @Unsigned @OriginalName(value="compat_u64") long end_lba;
        public @Unsigned int pid;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_kexec_segment")
    @NotUsableInJava
    public static class compat_kexec_segment
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int buf;
        public @Unsigned @OriginalName(value="compat_size_t") int bufsz;
        public @Unsigned @OriginalName(value="compat_ulong_t") int mem;
        public @Unsigned @OriginalName(value="compat_size_t") int memsz;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sysinfo")
    @NotUsableInJava
    public static class compat_sysinfo
    extends Struct {
        public int uptime;
        public @Unsigned int @Size(value=3) [] loads;
        public @Unsigned int totalram;
        public @Unsigned int freeram;
        public @Unsigned int sharedram;
        public @Unsigned int bufferram;
        public @Unsigned int totalswap;
        public @Unsigned int freeswap;
        public @Unsigned short procs;
        public @Unsigned short pad;
        public @Unsigned int totalhigh;
        public @Unsigned int freehigh;
        public @Unsigned int mem_unit;
        public char @Size(value=8) [] _f;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_rusage")
    @NotUsableInJava
    public static class compat_rusage
    extends Struct {
        public OldDefinitions.old_timeval32 ru_utime;
        public OldDefinitions.old_timeval32 ru_stime;
        public @OriginalName(value="compat_long_t") int ru_maxrss;
        public @OriginalName(value="compat_long_t") int ru_ixrss;
        public @OriginalName(value="compat_long_t") int ru_idrss;
        public @OriginalName(value="compat_long_t") int ru_isrss;
        public @OriginalName(value="compat_long_t") int ru_minflt;
        public @OriginalName(value="compat_long_t") int ru_majflt;
        public @OriginalName(value="compat_long_t") int ru_nswap;
        public @OriginalName(value="compat_long_t") int ru_inblock;
        public @OriginalName(value="compat_long_t") int ru_oublock;
        public @OriginalName(value="compat_long_t") int ru_msgsnd;
        public @OriginalName(value="compat_long_t") int ru_msgrcv;
        public @OriginalName(value="compat_long_t") int ru_nsignals;
        public @OriginalName(value="compat_long_t") int ru_nvcsw;
        public @OriginalName(value="compat_long_t") int ru_nivcsw;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_rlimit")
    @NotUsableInJava
    public static class compat_rlimit
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int rlim_cur;
        public @Unsigned @OriginalName(value="compat_ulong_t") int rlim_max;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_tms")
    @NotUsableInJava
    public static class compat_tms
    extends Struct {
        public @OriginalName(value="compat_clock_t") int tms_utime;
        public @OriginalName(value="compat_clock_t") int tms_stime;
        public @OriginalName(value="compat_clock_t") int tms_cutime;
        public @OriginalName(value="compat_clock_t") int tms_cstime;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_iw_point")
    @NotUsableInJava
    public static class compat_iw_point
    extends Struct {
        public @Unsigned @OriginalName(value="compat_caddr_t") int pointer;
        public @Unsigned short length;
        public @Unsigned short flags;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_group_filter")
    @NotUsableInJava
    public static class compat_group_filter
    extends Struct {
        @InlineUnion(value=25436)
        public  @InlineUnion(value=25436) AnonDefinitions.anon_member_of_anon_member_of_compat_group_filter anon0$0;
        @InlineUnion(value=25436)
        public  @InlineUnion(value=25436) AnonDefinitions.anon_member_of_anon_member_of_compat_group_filter anon0$1;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_group_source_req")
    @NotUsableInJava
    public static class compat_group_source_req
    extends Struct {
        public @Unsigned int gsr_interface;
        public KernelDefinitions.__kernel_sockaddr_storage gsr_group;
        public KernelDefinitions.__kernel_sockaddr_storage gsr_source;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_group_req")
    @NotUsableInJava
    public static class compat_group_req
    extends Struct {
        public @Unsigned int gr_interface;
        public KernelDefinitions.__kernel_sockaddr_storage gr_group;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sock_fprog")
    @NotUsableInJava
    public static class compat_sock_fprog
    extends Struct {
        public @Unsigned short len;
        public @Unsigned @OriginalName(value="compat_uptr_t") int filter;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sg_req_info")
    @NotUsableInJava
    public static class compat_sg_req_info
    extends Struct {
        public char req_state;
        public char orphan;
        public char sg_io_owned;
        public char problem;
        public int pack_id;
        public @Unsigned @OriginalName(value="compat_uptr_t") int usr_ptr;
        public @Unsigned int duration;
        public int unused;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sg_io_hdr")
    @NotUsableInJava
    public static class compat_sg_io_hdr
    extends Struct {
        public @OriginalName(value="compat_int_t") int interface_id;
        public @OriginalName(value="compat_int_t") int dxfer_direction;
        public char cmd_len;
        public char mx_sb_len;
        public @Unsigned short iovec_count;
        public @Unsigned @OriginalName(value="compat_uint_t") int dxfer_len;
        public @Unsigned @OriginalName(value="compat_uint_t") int dxferp;
        public @Unsigned @OriginalName(value="compat_uptr_t") int cmdp;
        public @Unsigned @OriginalName(value="compat_uptr_t") int sbp;
        public @Unsigned @OriginalName(value="compat_uint_t") int timeout;
        public @Unsigned @OriginalName(value="compat_uint_t") int flags;
        public @OriginalName(value="compat_int_t") int pack_id;
        public @Unsigned @OriginalName(value="compat_uptr_t") int usr_ptr;
        public char status;
        public char masked_status;
        public char msg_status;
        public char sb_len_wr;
        public @Unsigned short host_status;
        public @Unsigned short driver_status;
        public @OriginalName(value="compat_int_t") int resid;
        public @Unsigned @OriginalName(value="compat_uint_t") int duration;
        public @Unsigned @OriginalName(value="compat_uint_t") int info;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_unimapdesc")
    @NotUsableInJava
    public static class compat_unimapdesc
    extends Struct {
        public @Unsigned short entry_ct;
        public @Unsigned @OriginalName(value="compat_caddr_t") int entries;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_console_font_op")
    @NotUsableInJava
    public static class compat_console_font_op
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uint_t") int op;
        public @Unsigned @OriginalName(value="compat_uint_t") int flags;
        public @Unsigned @OriginalName(value="compat_uint_t") int width;
        public @Unsigned @OriginalName(value="compat_uint_t") int height;
        public @Unsigned @OriginalName(value="compat_uint_t") int charcount;
        public @Unsigned @OriginalName(value="compat_caddr_t") int data;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_siginfo")
    @NotUsableInJava
    public static class compat_siginfo
    extends Struct {
        public int si_signo;
        public int si_errno;
        public int si_code;
        public misc._sifields_of_compat_siginfo_and__sifields_of_compat_siginfo_t _sifields;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_keyctl_kdf_params")
    @NotUsableInJava
    public static class compat_keyctl_kdf_params
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int hashname;
        public @Unsigned @OriginalName(value="compat_uptr_t") int otherinfo;
        public @Unsigned int otherinfolen;
        public @Unsigned int @Size(value=8) [] __spare;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_mq_attr")
    @NotUsableInJava
    public static class compat_mq_attr
    extends Struct {
        public @OriginalName(value="compat_long_t") int mq_flags;
        public @OriginalName(value="compat_long_t") int mq_maxmsg;
        public @OriginalName(value="compat_long_t") int mq_msgsize;
        public @OriginalName(value="compat_long_t") int mq_curmsgs;
        public @OriginalName(value="compat_long_t") int @Size(value=4) [] __reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ipc_kludge")
    @NotUsableInJava
    public static class compat_ipc_kludge
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int msgp;
        public @OriginalName(value="compat_long_t") int msgtyp;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ext4_new_group_input")
    @NotUsableInJava
    public static class compat_ext4_new_group_input
    extends Struct {
        public @Unsigned int group;
        public @Unsigned @OriginalName(value="compat_u64") long block_bitmap;
        public @Unsigned @OriginalName(value="compat_u64") long inode_bitmap;
        public @Unsigned @OriginalName(value="compat_u64") long inode_table;
        public @Unsigned int blocks_count;
        public @Unsigned short reserved_blocks;
        public @Unsigned short unused;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_statfs64")
    @NotUsableInJava
    public static class compat_statfs64
    extends Struct {
        public @Unsigned int f_type;
        public @Unsigned int f_bsize;
        public @Unsigned long f_blocks;
        public @Unsigned long f_bfree;
        public @Unsigned long f_bavail;
        public @Unsigned long f_files;
        public @Unsigned long f_ffree;
        public KernelDefinitions.__kernel_fsid_t f_fsid;
        public @Unsigned int f_namelen;
        public @Unsigned int f_frsize;
        public @Unsigned int f_flags;
        public @Unsigned int @Size(value=4) [] f_spare;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_ustat")
    @NotUsableInJava
    public static class compat_ustat
    extends Struct {
        public @OriginalName(value="compat_daddr_t") int f_tfree;
        public @Unsigned @OriginalName(value="compat_ino_t") int f_tinode;
        public char @Size(value=6) [] f_fname;
        public char @Size(value=6) [] f_fpack;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_statfs")
    @NotUsableInJava
    public static class compat_statfs
    extends Struct {
        public int f_type;
        public int f_bsize;
        public int f_blocks;
        public int f_bfree;
        public int f_bavail;
        public int f_files;
        public int f_ffree;
        public  @OriginalName(value="compat_fsid_t") KernelDefinitions.__kernel_fsid_t f_fsid;
        public int f_namelen;
        public int f_frsize;
        public int f_flags;
        public int @Size(value=4) [] f_spare;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_sigevent")
    @NotUsableInJava
    public static class compat_sigevent
    extends Struct {
        public @OriginalName(value="compat_sigval_t") compat_sigval sigev_value;
        public @OriginalName(value="compat_int_t") int sigev_signo;
        public @OriginalName(value="compat_int_t") int sigev_notify;
        public misc._sigev_un_of_compat_sigevent _sigev_un;
    }

    @Type(noCCodeGeneration=true, cType="union compat_sigval")
    @NotUsableInJava
    public static class compat_sigval
    extends Union {
        public @OriginalName(value="compat_int_t") int sival_int;
        public @Unsigned @OriginalName(value="compat_uptr_t") int sival_ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_robust_list")
    @NotUsableInJava
    public static class compat_robust_list
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int next;
    }

    @Type(noCCodeGeneration=true, cType="struct compat_robust_list_head")
    @NotUsableInJava
    public static class compat_robust_list_head
    extends Struct {
        public compat_robust_list list;
        public @OriginalName(value="compat_long_t") int futex_offset;
        public @Unsigned @OriginalName(value="compat_uptr_t") int list_op_pending;
    }
}

