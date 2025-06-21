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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DentryDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.InodeDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.UsbdevfsDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmaDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class ProcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_allowed_congestion_control((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_allowed_congestion_control(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_boot_config_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_comm_connector(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_coredump_connector(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_cpuinfo_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create_net_data((const u8*)$arg1, $arg2, $arg3, (const struct seq_operations*)$arg4, $arg5, $arg6)")
    public static Ptr<proc_dir_entry> proc_create_net_data(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<SeqDefinitions.seq_operations> ops, @Unsigned int state_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create_net_data_write((const u8*)$arg1, $arg2, $arg3, (const struct seq_operations*)$arg4, $arg5, $arg6, $arg7)")
    public static Ptr<proc_dir_entry> proc_create_net_data_write(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<SeqDefinitions.seq_operations> ops, @OriginalName(value="proc_write_t") Ptr<?> write2, @Unsigned int state_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create_net_single((const u8*)$arg1, $arg2, $arg3, (int (*)(struct seq_file*, void*))$arg4, $arg5)")
    public static Ptr<proc_dir_entry> proc_create_net_single(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<?> show, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create_net_single_write((const u8*)$arg1, $arg2, $arg3, (int (*)(struct seq_file*, void*))$arg4, $arg5, $arg6)")
    public static Ptr<proc_dir_entry> proc_create_net_single_write(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<?> show, @OriginalName(value="proc_write_t") Ptr<?> write2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_disconnect_claim(Ptr<UsbDefinitions.usb_dev_state> ps, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_do_rointvec((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_do_rointvec(Ptr<misc.ctl_table> table, int write2, Ptr<?> buf, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_do_submiturb(Ptr<UsbDefinitions.usb_dev_state> ps, Ptr<UsbdevfsDefinitions.usbdevfs_urb> uurb, Ptr<UsbdevfsDefinitions.usbdevfs_iso_packet_desc> iso_frame_desc, Ptr<?> arg2,  @OriginalName(value="sigval_t") runtime.sigval userurb_sigval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_do_uuid((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_do_uuid(Ptr<misc.ctl_table> table, int write2, Ptr<?> buf, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_exec_connector(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_exit_connector(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_fib_multipath_hash_fields((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_fib_multipath_hash_fields(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_fib_multipath_hash_policy((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_fib_multipath_hash_policy(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_fib_multipath_hash_seed((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_fib_multipath_hash_seed(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_fill_super(Ptr<SuperDefinitions.super_block> s2, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_fork_connector(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_fs_context_free(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_genhd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_getdriver(Ptr<UsbDefinitions.usb_dev_state> ps, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_id_connector(Ptr<TaskDefinitions.task_struct> task2, int which_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_ioctl(Ptr<UsbDefinitions.usb_dev_state> ps, Ptr<UsbdevfsDefinitions.usbdevfs_ioctl> ctl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_kmsg_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_loadavg_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_net_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_net_ns_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_net_ns_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_nmi_watchdog((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_nmi_watchdog(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_ns_file((const struct file*)$arg1)")
    public static boolean proc_ns_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_statm(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_status(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_print_scsidevice(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_ptrace_connector(Ptr<TaskDefinitions.task_struct> task2, int ptrace_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_reconfigure(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_root_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int proc_root_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_root_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_root_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_root_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_scsi_host_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_scsi_host_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_scsi_host_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_scsi_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_scsi_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_scsi_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_scsi_write(Ptr<runtime.file> file2, String buf, @Unsigned long length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)proc_self_get_link($arg1, $arg2, $arg3))")
    public static String proc_self_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_self_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_setup_self(Ptr<SuperDefinitions.super_block> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_sid_connector(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_soft_watchdog((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_soft_watchdog(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_task_name(Ptr<SeqDefinitions.seq_file> m, Ptr<TaskDefinitions.task_struct> p, boolean escape) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_tcp_available_congestion_control((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_tcp_available_congestion_control(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_tcp_available_ulp((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_tcp_available_ulp(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_tcp_congestion_control((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_tcp_congestion_control(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_tcp_ehash_entries((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_tcp_ehash_entries(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_tcp_fastopen_key((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_tcp_fastopen_key(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_tfo_blackhole_detect_timeout((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_tfo_blackhole_detect_timeout(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_tgid_net_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int proc_tgid_net_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_tgid_net_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_tgid_net_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_tgid_stat(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_tid_stat(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_udp_hash_entries((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_udp_hash_entries(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_version_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_vmalloc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_watchdog((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_watchdog(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_watchdog_common($arg1, (const struct ctl_table*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int proc_watchdog_common(int which, Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_watchdog_cpumask((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_watchdog_cpumask(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_watchdog_thresh((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_watchdog_thresh(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_watchdog_update() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_available_schedulers((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_available_schedulers(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_blackhole_detect_timeout((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_blackhole_detect_timeout(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long proc_bus_pci_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long proc_bus_pci_lseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long off, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_bus_pci_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_bus_pci_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_bus_pci_read(Ptr<runtime.file> file2, String buf, @Unsigned long nbytes, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_bus_pci_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_bus_pci_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_bus_pci_write(Ptr<runtime.file> file2, String buf, @Unsigned long nbytes, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_caches_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_consoles_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_do_dev_weight((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_do_dev_weight(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_do_rss_key((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_do_rss_key(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_do_uts_string((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_do_uts_string(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dohung_task_timeout_secs((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dohung_task_timeout_secs(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_minmax_bpf_enable((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_minmax_bpf_enable(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_minmax_bpf_restricted((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_minmax_bpf_restricted(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_minmax_warn_RT_change((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_minmax_warn_RT_change(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dolongvec_minmax_bpf_restricted((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dolongvec_minmax_bpf_restricted(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dostring_coredump((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dostring_coredump(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_gid_map_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_gid_map_write(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_kcore_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_kprobes_optimization_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_kprobes_optimization_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_map_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_meminfo_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_nr_files((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_nr_files(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_projid_map_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_projid_map_write(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_resctrl_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_sched_autogroup_set_nice(Ptr<TaskDefinitions.task_struct> p, int nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_sched_autogroup_show_task(Ptr<TaskDefinitions.task_struct> p, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_sched_set_task(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_sched_show_task(Ptr<TaskDefinitions.task_struct> p, Ptr<PidDefinitions.pid_namespace> ns, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_schedstat_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_scheduler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_scheduler(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_scsi_devinfo_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_scsi_devinfo_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_scsi_devinfo_write(Ptr<runtime.file> file2, String buf, @Unsigned long length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_setgroups_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_setgroups_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_setgroups_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_setup_thread_self(Ptr<SuperDefinitions.super_block> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)proc_thread_self_get_link($arg1, $arg2, $arg3))")
    public static String proc_thread_self_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_thread_self_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_timens_set_offset(Ptr<runtime.file> file2, Ptr<TaskDefinitions.task_struct> p, Ptr<proc_timens_offset> offsets, int noffsets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_timens_show_offsets(Ptr<TaskDefinitions.task_struct> p, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_tty_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_tty_register_driver(Ptr<TtyDefinitions.tty_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_tty_unregister_driver(Ptr<TtyDefinitions.tty_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_uid_map_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_uid_map_write(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_version_signature_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__proc_create($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<proc_dir_entry> __proc_create(Ptr<Ptr<proc_dir_entry>> parent, String name, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="nlink_t") int nlink) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_proc_mkdir((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<proc_dir_entry> _proc_mkdir(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<?> data, boolean force_lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> proc_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_alloc_inum(Ptr<@Unsigned Integer> inum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_archtype_show(Ptr<SeqDefinitions.seq_file> file2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_cap_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_cap_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_cgroupstats_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_cpuset_show(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create((const u8*)$arg1, $arg2, $arg3, (const struct proc_ops*)$arg4)")
    public static Ptr<proc_dir_entry> proc_create(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<proc_ops> proc_ops2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create_data((const u8*)$arg1, $arg2, $arg3, (const struct proc_ops*)$arg4, $arg5)")
    public static Ptr<proc_dir_entry> proc_create_data(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<proc_ops> proc_ops2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create_mount_point((const u8*)$arg1)")
    public static Ptr<proc_dir_entry> proc_create_mount_point(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create_reg((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<proc_dir_entry> proc_create_reg(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<Ptr<proc_dir_entry>> parent, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create_seq_private((const u8*)$arg1, $arg2, $arg3, (const struct seq_operations*)$arg4, $arg5, $arg6)")
    public static Ptr<proc_dir_entry> proc_create_seq_private(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<SeqDefinitions.seq_operations> ops, @Unsigned int state_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_create_single_data((const u8*)$arg1, $arg2, $arg3, (int (*)(struct seq_file*, void*))$arg4, $arg5)")
    public static Ptr<proc_dir_entry> proc_create_single_data(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<?> show, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_minmax_coredump((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_minmax_coredump(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_minmax_sysadmin((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_minmax_sysadmin(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_entry_rundown(Ptr<proc_dir_entry> de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_execdomains_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_fd_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int proc_fd_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_fd_instantiate($arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.dentry> proc_fd_instantiate(Ptr<runtime.dentry> dentry2, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_fd_iterate(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_fd_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_fd_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_fdinfo_instantiate($arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.dentry> proc_fdinfo_instantiate(Ptr<runtime.dentry> dentry2, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_fdinfo_iterate(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_fdinfo_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_free_inum(@Unsigned int inum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> proc_get_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<proc_dir_entry> de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)proc_get_link($arg1, $arg2, $arg3))")
    public static String proc_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_get_parent_data((const struct inode*)$arg1)")
    public static Ptr<?> proc_get_parent_data(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int proc_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_hubbed_show(Ptr<SeqDefinitions.seq_file> file2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_hubless_show(Ptr<SeqDefinitions.seq_file> file2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_init_kmemcache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_interrupts_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_invalidate_siblings_dcache(Ptr<misc.hlist_head> inodes, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_lookup_de(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, Ptr<proc_dir_entry> de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_lookupfd(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_lookupfd_common(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, Ptr<?> instantiate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_lookupfdinfo(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_match((const u8*)$arg1, $arg2, $arg3)")
    public static int proc_match(String name, Ptr<proc_dir_entry> de, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_misc_d_delete((const struct dentry*)$arg1)")
    public static int proc_misc_d_delete(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_misc_d_revalidate(Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_mkdir((const u8*)$arg1, $arg2)")
    public static Ptr<proc_dir_entry> proc_mkdir(String name, Ptr<proc_dir_entry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_mkdir_data((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<proc_dir_entry> proc_mkdir_data(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_mkdir_mode((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<proc_dir_entry> proc_mkdir_mode(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<proc_dir_entry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_net_d_revalidate(Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_notify_change(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_nr_inodes((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_nr_inodes(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_put_link(Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_readdir_de(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx, Ptr<proc_dir_entry> de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_readfd_common(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx, Ptr<?> instantiate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_readfd_count(Ptr<runtime.inode> inode2, Ptr<@OriginalName(value="loff_t") Long> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long proc_reg_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long proc_reg_get_unmapped_area(Ptr<runtime.file> file2, @Unsigned long orig_addr, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long proc_reg_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_reg_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_reg_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int proc_reg_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> pts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_reg_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_reg_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_reg_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long proc_reg_unlocked_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_reg_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_reg_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<proc_dir_entry> proc_register(Ptr<proc_dir_entry> dir, Ptr<proc_dir_entry> dp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_remove(Ptr<proc_dir_entry> de) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_seq_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_seq_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_set_size(Ptr<proc_dir_entry> de, @OriginalName(value="loff_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_set_user(Ptr<proc_dir_entry> de, misc.kuid_t uid, misc.kgid_t gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_show_options(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_simple_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_simple_write(Ptr<runtime.file> f, String ubuf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> _pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_single_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_softirqs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_stat_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_symlink((const u8*)$arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<proc_dir_entry> proc_symlink(String name, Ptr<proc_dir_entry> parent, String dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_sys_call_handler(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, int write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_sys_compare((const struct dentry*)$arg1, $arg2, (const u8*)$arg3, (const struct qstr*)$arg4)")
    public static int proc_sys_compare(Ptr<runtime.dentry> dentry2, @Unsigned int len, String str, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_sys_delete((const struct dentry*)$arg1)")
    public static int proc_sys_delete(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_sys_evict_inode(Ptr<runtime.inode> inode2, Ptr<misc.ctl_table_header> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_sys_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int proc_sys_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_sys_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_sys_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> proc_sys_make_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.ctl_table_header> head, Ptr<misc.ctl_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_sys_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_sys_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int proc_sys_poll(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_sys_poll_notify(Ptr<misc.ctl_table_poll> poll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_sys_read(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_sys_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_sys_revalidate(Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_sys_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_sys_write(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __proc_set_tty(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _proc_do_string(String data, int maxlen, int write2, String buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_apparmor_attr_dir_iterate(Ptr<runtime.file> filp, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_apparmor_attr_dir_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_attr_dir_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_attr_dir_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_cgroup_show(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_clear_tty(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_cmdline_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_coredump_filter_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_coredump_filter_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_coredump_filter_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_cwd_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_devices_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long proc_dir_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_dma_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_dma_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_do_cad_pid((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_do_cad_pid(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_do_large_bitmap((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_do_large_bitmap(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_do_static_key((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_do_static_key(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dobool((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dobool(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_jiffies((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_jiffies(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_minmax((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_minmax(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_ms_jiffies((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_ms_jiffies(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_ms_jiffies_minmax((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_ms_jiffies_minmax(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dointvec_userhz_jiffies((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dointvec_userhz_jiffies(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dopipe_max_size((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dopipe_max_size(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dostring((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dostring(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_dou8vec_minmax((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_dou8vec_minmax(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_douintvec((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_douintvec(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_douintvec_minmax((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_douintvec_minmax(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_doulongvec_minmax((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_doulongvec_minmax(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_doulongvec_ms_jiffies_minmax((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_doulongvec_ms_jiffies_minmax(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_exe_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.path> exe_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_filesystems_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_fill_cache($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, (const void*)$arg7)")
    public static boolean proc_fill_cache(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx, String name, @Unsigned int len, Ptr<?> instantiate, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_flush_pid(Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_gid_map_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_id_map_open($arg1, $arg2, (const struct seq_operations*)$arg3)")
    public static int proc_id_map_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, Ptr<SeqDefinitions.seq_operations> seq_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_id_map_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_ipc_auto_msgmni((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_ipc_auto_msgmni(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_ipc_dointvec_minmax_orphans((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_ipc_dointvec_minmax_orphans(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_ipc_sem_dointvec((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_ipc_sem_dointvec(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> proc_key_users_next(Ptr<SeqDefinitions.seq_file> p, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> _pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_key_users_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> proc_key_users_start(Ptr<SeqDefinitions.seq_file> p, Ptr<@OriginalName(value="loff_t") Long> _pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_key_users_stop(Ptr<SeqDefinitions.seq_file> p, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> proc_keys_next(Ptr<SeqDefinitions.seq_file> p, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> _pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_keys_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> proc_keys_start(Ptr<SeqDefinitions.seq_file> p, Ptr<@OriginalName(value="loff_t") Long> _pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_keys_stop(Ptr<SeqDefinitions.seq_file> p, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_locks_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_loginuid_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_loginuid_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_loginuid_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)proc_map_files_get_link($arg1, $arg2, $arg3))")
    public static String proc_map_files_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_map_files_instantiate($arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.dentry> proc_map_files_instantiate(Ptr<runtime.dentry> dentry2, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_map_files_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_map_files_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MmDefinitions.mm_struct> proc_mem_open(Ptr<runtime.inode> inode2, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_modules_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_nr_dentry((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_nr_dentry(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_ns_dir_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_ns_dir_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)proc_ns_get_link($arg1, $arg2, $arg3))")
    public static String proc_ns_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_ns_instantiate($arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.dentry> proc_ns_instantiate(Ptr<runtime.dentry> dentry2, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_ns_readlink(Ptr<runtime.dentry> dentry2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_oom_score(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_page_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_arch_status(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_attr_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_pid_attr_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_pid_attr_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proc_pid_attr_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_pid_cmdline_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_pid_evict_inode(Ptr<proc_inode> ei) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)proc_pid_get_link($arg1, $arg2, $arg3))")
    public static String proc_pid_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_pid_instantiate($arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.dentry> proc_pid_instantiate(Ptr<runtime.dentry> dentry2, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_ksm_merging_pages(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_ksm_stat(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_limits(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_pid_lookup(Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> proc_pid_make_base_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<TaskDefinitions.task_struct> task2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> proc_pid_make_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<TaskDefinitions.task_struct> task2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_patch_state(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_personality(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_readlink(Ptr<runtime.dentry> dentry2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_schedstat(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_stack(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_syscall(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_pid_wchan(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_pident_instantiate($arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.dentry> proc_pident_instantiate(Ptr<runtime.dentry> dentry2, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_pident_lookup($arg1, $arg2, (const struct pid_entry*)$arg3, (const struct pid_entry*)$arg4)")
    public static Ptr<runtime.dentry> proc_pident_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, Ptr<PidDefinitions.pid_entry> p, Ptr<PidDefinitions.pid_entry> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_pident_readdir($arg1, $arg2, (const struct pid_entry*)$arg3, $arg4)")
    public static int proc_pident_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx, Ptr<PidDefinitions.pid_entry> ents, @Unsigned int nents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_projid_map_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proc_put_long(Ptr<Ptr<?>> buf, Ptr<@Unsigned Long> size, @Unsigned long val, boolean neg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_root_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_rt6_multipath_hash_fields((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_rt6_multipath_hash_fields(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_rt6_multipath_hash_policy((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_rt6_multipath_hash_policy(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proc_sessionid_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_setgroups_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_setgroups_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_single_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_smack_attr_dir_iterate(Ptr<runtime.file> filp, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_smack_attr_dir_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_taint((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int proc_taint(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_task_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int proc_task_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proc_task_instantiate($arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.dentry> proc_task_instantiate(Ptr<runtime.dentry> dentry2, Ptr<TaskDefinitions.task_struct> task2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_task_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_task_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_tgid_base_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_tgid_base_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_tgid_io_accounting(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> proc_tid_base_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_tid_base_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_tid_comm_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_tid_io_accounting(Ptr<SeqDefinitions.seq_file> m, Ptr<PidDefinitions.pid_namespace> ns, Ptr<runtime.pid> pid2, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_timers_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_uid_map_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proc_uptime_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct proc_maps_private")
    @NotUsableInJava
    public static class proc_maps_private
    extends Struct {
        public Ptr<runtime.inode> inode;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<MmDefinitions.mm_struct> mm;
        public VmaDefinitions.vma_iterator iter;
        public Ptr<runtime.mempolicy> task_mempolicy;
    }

    @Type(noCCodeGeneration=true, cType="struct proc_event")
    @NotUsableInJava
    public static class proc_event
    extends Struct {
        public proc_cn_event what;
        public @Unsigned int cpu;
        public @Unsigned long timestamp_ns;
        public EventDefinitions.event_data_of_proc_event event_data;
    }

    @Type(noCCodeGeneration=true, cType="struct proc_input")
    @NotUsableInJava
    public static class proc_input
    extends Struct {
        public proc_cn_mcast_op mcast_op;
        public proc_cn_event event_type;
    }

    @Type(noCCodeGeneration=true, cType="enum proc_cn_event")
    public static enum proc_cn_event implements Enum<proc_cn_event>,
    TypedEnum<proc_cn_event, Integer>
    {
        PROC_EVENT_NONE,
        PROC_EVENT_FORK,
        PROC_EVENT_EXEC,
        PROC_EVENT_UID,
        PROC_EVENT_GID,
        PROC_EVENT_SID,
        PROC_EVENT_PTRACE,
        PROC_EVENT_COMM,
        PROC_EVENT_NONZERO_EXIT,
        PROC_EVENT_COREDUMP,
        PROC_EVENT_EXIT;

    }

    @Type(noCCodeGeneration=true, cType="enum proc_cn_mcast_op")
    public static enum proc_cn_mcast_op implements Enum<proc_cn_mcast_op>,
    TypedEnum<proc_cn_mcast_op, Integer>
    {
        PROC_CN_MCAST_LISTEN,
        PROC_CN_MCAST_IGNORE;

    }

    @Type(noCCodeGeneration=true, cType="enum proc_param")
    public static enum proc_param implements Enum<proc_param>,
    TypedEnum<proc_param, Integer>
    {
        Opt_gid,
        Opt_hidepid,
        Opt_subset;

    }

    @Type(noCCodeGeneration=true, cType="struct proc_fs_context")
    @NotUsableInJava
    public static class proc_fs_context
    extends Struct {
        public Ptr<PidDefinitions.pid_namespace> pid_ns;
        public @Unsigned int mask;
        public proc_hidepid hidepid;
        public int gid;
        public proc_pidonly pidonly;
    }

    @Type(noCCodeGeneration=true, cType="enum proc_mem_force")
    public static enum proc_mem_force implements Enum<proc_mem_force>,
    TypedEnum<proc_mem_force, Integer>
    {
        PROC_MEM_FORCE_ALWAYS,
        PROC_MEM_FORCE_PTRACE,
        PROC_MEM_FORCE_NEVER;

    }

    @Type(noCCodeGeneration=true, cType="struct proc_timens_offset")
    @NotUsableInJava
    public static class proc_timens_offset
    extends Struct {
        public int clockid;
        public runtime.timespec64 val;
    }

    @Type(noCCodeGeneration=true, cType="struct proc_fs_info")
    @NotUsableInJava
    public static class proc_fs_info
    extends Struct {
        public Ptr<PidDefinitions.pid_namespace> pid_ns;
        public Ptr<runtime.dentry> proc_self;
        public Ptr<runtime.dentry> proc_thread_self;
        public misc.kgid_t pid_gid;
        public proc_hidepid hide_pid;
        public proc_pidonly pidonly;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum proc_pidonly")
    public static enum proc_pidonly implements Enum<proc_pidonly>,
    TypedEnum<proc_pidonly, Integer>
    {
        PROC_PIDONLY_OFF,
        PROC_PIDONLY_ON;

    }

    @Type(noCCodeGeneration=true, cType="enum proc_hidepid")
    public static enum proc_hidepid implements Enum<proc_hidepid>,
    TypedEnum<proc_hidepid, Integer>
    {
        HIDEPID_OFF,
        HIDEPID_NO_ACCESS,
        HIDEPID_INVISIBLE,
        HIDEPID_NOT_PTRACEABLE;

    }

    @Type(noCCodeGeneration=true, cType="struct proc_fs_opts")
    @NotUsableInJava
    public static class proc_fs_opts
    extends Struct {
        public int flag;
        public String str;
    }

    @Type(noCCodeGeneration=true, cType="struct proc_mounts")
    @NotUsableInJava
    public static class proc_mounts
    extends Struct {
        public Ptr<MntDefinitions.mnt_namespace> ns;
        public runtime.path root;
        public Ptr<?> show;
    }

    @Type(noCCodeGeneration=true, cType="struct proc_inode")
    @NotUsableInJava
    public static class proc_inode
    extends Struct {
        public Ptr<runtime.pid> pid;
        public @Unsigned int fd;
        public proc_op op;
        public Ptr<proc_dir_entry> pde;
        public Ptr<misc.ctl_table_header> sysctl;
        public Ptr<misc.ctl_table> sysctl_entry;
        public misc.hlist_node sibling_inodes;
        public Ptr<proc_ns_operations> ns_ops;
        public runtime.inode vfs_inode;
    }

    @Type(noCCodeGeneration=true, cType="union proc_op")
    @NotUsableInJava
    public static class proc_op
    extends Union {
        public Ptr<?> proc_get_link;
        public Ptr<?> proc_show;
        public int lsmid;
    }

    @Type(noCCodeGeneration=true, cType="struct proc_dir_entry")
    @NotUsableInJava
    public static class proc_dir_entry
    extends Struct {
        public AtomicDefinitions.atomic_t in_use;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public ListDefinitions.list_head pde_openers;
        public  @OriginalName(value="spinlock_t") runtime.spinlock pde_unload_lock;
        public Ptr<runtime.completion> pde_unload_completion;
        public Ptr<InodeDefinitions.inode_operations> proc_iops;
        @InlineUnion(value=10109)
        public @InlineUnion(value=10109) Ptr<proc_ops> proc_ops;
        @InlineUnion(value=10109)
        public @InlineUnion(value=10109) Ptr<FileDefinitions.file_operations> proc_dir_ops;
        public Ptr<DentryDefinitions.dentry_operations> proc_dops;
        @InlineUnion(value=10110)
        public @InlineUnion(value=10110) Ptr<SeqDefinitions.seq_operations> seq_ops;
        @InlineUnion(value=10110)
        public @InlineUnion(value=10110) Ptr<?> single_show;
        public @OriginalName(value="proc_write_t") Ptr<?> write;
        public Ptr<?> data;
        public @Unsigned int state_size;
        public @Unsigned int low_ino;
        public @Unsigned @OriginalName(value="nlink_t") int nlink;
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public @OriginalName(value="loff_t") long size;
        public Ptr<proc_dir_entry> parent;
        public RbDefinitions.rb_root subdir;
        public RbDefinitions.rb_node subdir_node;
        public String name;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public char flags;
        public char namelen;
        public char @Size(value=0) [] inline_name;
    }

    @Type(noCCodeGeneration=true, cType="struct proc_ops")
    @NotUsableInJava
    public static class proc_ops
    extends Struct {
        public @Unsigned int proc_flags;
        public Ptr<?> proc_open;
        public Ptr<?> proc_read;
        public Ptr<?> proc_read_iter;
        public Ptr<?> proc_write;
        public Ptr<?> proc_lseek;
        public Ptr<?> proc_release;
        public Ptr<?> proc_poll;
        public Ptr<?> proc_ioctl;
        public Ptr<?> proc_compat_ioctl;
        public Ptr<?> proc_mmap;
        public Ptr<?> proc_get_unmapped_area;
    }

    @Type(noCCodeGeneration=true, cType="struct proc_ns_operations")
    @NotUsableInJava
    public static class proc_ns_operations
    extends Struct {
        public String name;
        public String real_ns_name;
        public int type;
        public Ptr<?> get;
        public Ptr<?> put;
        public Ptr<?> install;
        public Ptr<?> owner;
        public Ptr<?> get_parent;
    }
}

