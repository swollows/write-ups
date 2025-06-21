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
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PosixDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __posix_acl_chmod(Ptr<Ptr<posix_acl>> acl, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __posix_acl_create(Ptr<Ptr<posix_acl>> acl, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __posix_cpu_timer_get(Ptr<KDefinitions.k_itimer> timer, Ptr<runtime.itimerspec64> itp, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<posix_acl> posix_acl_alloc(int count, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_acl_chmod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_acl_clone((const struct posix_acl*)$arg1, $arg2)")
    public static Ptr<posix_acl> posix_acl_clone(Ptr<posix_acl> acl, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_acl_create(Ptr<runtime.inode> dir, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode, Ptr<Ptr<posix_acl>> default_acl, Ptr<Ptr<posix_acl>> acl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_acl_create_masq(Ptr<posix_acl> acl, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_acl_equiv_mode((const struct posix_acl*)$arg1, $arg2)")
    public static int posix_acl_equiv_mode(Ptr<posix_acl> acl, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<posix_acl> posix_acl_from_mode(@Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_acl_from_xattr($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<posix_acl> posix_acl_from_xattr(Ptr<UserDefinitions.user_namespace> userns, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_acl_init(Ptr<posix_acl> acl, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_acl_listxattr(Ptr<runtime.inode> inode2, Ptr<String> buffer, Ptr<@OriginalName(value="ssize_t") Long> remaining_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_acl_permission($arg1, $arg2, (const struct posix_acl*)$arg3, $arg4)")
    public static int posix_acl_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<posix_acl> acl, int want) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_acl_to_xattr($arg1, (const struct posix_acl*)$arg2, $arg3, $arg4)")
    public static int posix_acl_to_xattr(Ptr<UserDefinitions.user_namespace> user_ns, Ptr<posix_acl> acl, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_acl_update_mode(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode_p, Ptr<Ptr<posix_acl>> acl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_acl_valid($arg1, (const struct posix_acl*)$arg2)")
    public static int posix_acl_valid(Ptr<UserDefinitions.user_namespace> user_ns, Ptr<posix_acl> acl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean posix_acl_xattr_list(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_cpu_clock_get((const int)$arg1, $arg2)")
    public static int posix_cpu_clock_get(@OriginalName(value="clockid_t") int clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_cpu_clock_getres((const int)$arg1, $arg2)")
    public static int posix_cpu_clock_getres(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_cpu_clock_set((const int)$arg1, (const struct timespec64*)$arg2)")
    public static int posix_cpu_clock_set(@OriginalName(value="clockid_t") int clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_cpu_nsleep((const int)$arg1, $arg2, (const struct timespec64*)$arg3)")
    public static int posix_cpu_nsleep(@OriginalName(value="clockid_t") int which_clock, int flags, Ptr<runtime.timespec64> rqtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long posix_cpu_nsleep_restart(Ptr<misc.restart_block> restart_block2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_cpu_timer_create(Ptr<KDefinitions.k_itimer> new_timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_cpu_timer_del(Ptr<KDefinitions.k_itimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_cpu_timer_get(Ptr<KDefinitions.k_itimer> timer, Ptr<runtime.itimerspec64> itp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_cpu_timer_rearm(Ptr<KDefinitions.k_itimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_cpu_timer_set(Ptr<KDefinitions.k_itimer> timer, int timer_flags, Ptr<runtime.itimerspec64> _new, Ptr<runtime.itimerspec64> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_cpu_timer_wait_running(Ptr<KDefinitions.k_itimer> timr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_cpu_timers_exit(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_cpu_timers_exit_group(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_cpu_timers_work(Ptr<misc.callback_head> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_cputimers_group_init(Ptr<posix_cputimers> pct, @Unsigned long cpu_limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_cputimers_init_work() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long posix_clock_compat_ioctl(Ptr<runtime.file> fp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long posix_clock_ioctl(Ptr<runtime.file> fp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_clock_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int posix_clock_poll(Ptr<runtime.file> fp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long posix_clock_read(Ptr<runtime.file> fp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_clock_register(Ptr<posix_clock> clk2, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_clock_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_clock_unregister(Ptr<posix_clock> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_xattr_acl((const u8*)$arg1)")
    public static int posix_xattr_acl(String xattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_clock_realtime_adj((const int)$arg1, $arg2)")
    public static int posix_clock_realtime_adj(@OriginalName(value="clockid_t") int which_clock, Ptr<KernelDefinitions.__kernel_timex> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_clock_realtime_set((const int)$arg1, (const struct timespec64*)$arg2)")
    public static int posix_clock_realtime_set(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_get_boottime_ktime((const int)$arg1)")
    public static @OriginalName(value="ktime_t") long posix_get_boottime_ktime(@OriginalName(value="clockid_t") int which_clock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_get_boottime_timespec((const int)$arg1, $arg2)")
    public static int posix_get_boottime_timespec(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="posix_get_coarse_res((const int)$arg1, $arg2)")
    public static int posix_get_coarse_res(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_get_hrtimer_res(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_get_monotonic_coarse(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long posix_get_monotonic_ktime(@OriginalName(value="clockid_t") int which_clock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_get_monotonic_raw(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_get_monotonic_timespec(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_get_realtime_coarse(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long posix_get_realtime_ktime(@OriginalName(value="clockid_t") int which_clock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_get_realtime_timespec(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long posix_get_tai_ktime(@OriginalName(value="clockid_t") int which_clock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_get_tai_timespec(@OriginalName(value="clockid_t") int which_clock, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_lock_file(Ptr<runtime.file> filp, Ptr<FileDefinitions.file_lock> fl, Ptr<FileDefinitions.file_lock> conflock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_lock_inode(Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lock> request2, Ptr<FileDefinitions.file_lock> conflock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean posix_locks_conflict(Ptr<FileDefinitions.file_lock_core> caller_flc, Ptr<FileDefinitions.file_lock_core> sys_flc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_test_lock(Ptr<runtime.file> filp, Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart posix_timer_fn(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int posix_timer_queue_signal(Ptr<KDefinitions.k_itimer> timr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_timer_set_common(Ptr<KDefinitions.k_itimer> timer, Ptr<runtime.itimerspec64> new_setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void posix_timer_unhash_and_free(Ptr<KDefinitions.k_itimer> tmr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct posix_clock_desc")
    @NotUsableInJava
    public static class posix_clock_desc
    extends Struct {
        public Ptr<runtime.file> fp;
        public Ptr<posix_clock> clk;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_acl_xattr_header")
    @NotUsableInJava
    public static class posix_acl_xattr_header
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int a_version;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_acl_xattr_entry")
    @NotUsableInJava
    public static class posix_acl_xattr_entry
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short e_tag;
        public @Unsigned @OriginalName(value="__le16") short e_perm;
        public @Unsigned @OriginalName(value="__le32") int e_id;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_clock_context")
    @NotUsableInJava
    public static class posix_clock_context
    extends Struct {
        public Ptr<posix_clock> clk;
        public Ptr<?> private_clkdata;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_clock")
    @NotUsableInJava
    public static class posix_clock
    extends Struct {
        public posix_clock_operations ops;
        public runtime.cdev cdev;
        public Ptr<runtime.device> dev;
        public misc.rw_semaphore rwsem;
        public boolean zombie;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_clock_operations")
    @NotUsableInJava
    public static class posix_clock_operations
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<?> clock_adjtime;
        public Ptr<?> clock_gettime;
        public Ptr<?> clock_getres;
        public Ptr<?> clock_settime;
        public Ptr<?> ioctl;
        public Ptr<?> open;
        public Ptr<?> poll;
        public Ptr<?> release;
        public Ptr<?> read;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_msg_tree_node")
    @NotUsableInJava
    public static class posix_msg_tree_node
    extends Struct {
        public RbDefinitions.rb_node rb_node;
        public ListDefinitions.list_head msg_list;
        public int priority;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_acl_entry")
    @NotUsableInJava
    public static class posix_acl_entry
    extends Struct {
        public short e_tag;
        public @Unsigned short e_perm;
        @InlineUnion(value=6610)
        public @InlineUnion(value=6610) misc.kuid_t e_uid;
        @InlineUnion(value=6610)
        public @InlineUnion(value=6610) misc.kgid_t e_gid;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_acl")
    @NotUsableInJava
    public static class posix_acl
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct a_refcount;
        public misc.callback_head a_rcu;
        public @Unsigned int a_count;
        public posix_acl_entry @Size(value=0) [] a_entries;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_cputimers_work")
    @NotUsableInJava
    public static class posix_cputimers_work
    extends Struct {
        public misc.callback_head work;
        public runtime.mutex mutex;
        public @Unsigned int scheduled;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_cputimers")
    @NotUsableInJava
    public static class posix_cputimers
    extends Struct {
        public posix_cputimer_base @Size(value=3) [] bases;
        public @Unsigned int timers_active;
        public @Unsigned int expiry_active;
    }

    @Type(noCCodeGeneration=true, cType="struct posix_cputimer_base")
    @NotUsableInJava
    public static class posix_cputimer_base
    extends Struct {
        public @Unsigned long nextevt;
        public misc.timerqueue_head tqhead;
    }
}

