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
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WakeDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RtDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rt_mutex_futex_trylock(Ptr<rt_mutex_base> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __rt_mutex_futex_unlock(Ptr<rt_mutex_base> lock, Ptr<rt_wake_q_head> wqh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__rt_mutex_init($arg1, (const u8*)$arg2, $arg3)")
    public static void __rt_mutex_init(Ptr<rt_mutex> lock, String name, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rt_mutex_start_proxy_lock(Ptr<rt_mutex_base> lock, Ptr<rt_mutex_waiter> waiter, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_adjust_pi(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_mutex_adjust_prio_chain(Ptr<TaskDefinitions.task_struct> task2, misc.rtmutex_chainwalk chwalk, Ptr<rt_mutex_base> orig_lock, Ptr<rt_mutex_base> next_lock, Ptr<rt_mutex_waiter> orig_waiter, Ptr<TaskDefinitions.task_struct> top_task) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_base_init(Ptr<rt_mutex_base> rtb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rt_mutex_cleanup_proxy_lock(Ptr<rt_mutex_base> lock, Ptr<rt_mutex_waiter> waiter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_mutex_futex_trylock(Ptr<rt_mutex_base> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_futex_unlock(Ptr<rt_mutex_base> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_init_proxy_locked(Ptr<rt_mutex_base> lock, Ptr<TaskDefinitions.task_struct> proxy_owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_lock(Ptr<rt_mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_mutex_lock_interruptible(Ptr<rt_mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_mutex_lock_killable(Ptr<rt_mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_postunlock(Ptr<rt_wake_q_head> wqh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_proxy_unlock(Ptr<rt_mutex_base> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_mutex_start_proxy_lock(Ptr<rt_mutex_base> lock, Ptr<rt_mutex_waiter> waiter, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_mutex_trylock(Ptr<rt_mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_unlock(Ptr<rt_mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_mutex_wait_proxy_lock(Ptr<rt_mutex_base> lock, Ptr<HrtimerDefinitions.hrtimer_sleeper> to, Ptr<rt_mutex_waiter> waiter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_fibinfo_free_cpus(Ptr<Ptr<runtime.rtable>> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_acct_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_add_uncached_list(Ptr<runtime.rtable> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_cache_flush(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rt_cache_route(Ptr<FibDefinitions.fib_nh_common> nhc, Ptr<runtime.rtable> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> rt_cache_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_cache_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> rt_cache_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_cache_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> rt_cpu_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_cpu_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> rt_cpu_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_cpu_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_del_uncached_list(Ptr<runtime.rtable> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rtable> rt_dst_alloc(Ptr<NetDefinitions.net_device> dev, @Unsigned int flags, @Unsigned short type2, boolean noxfrm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rtable> rt_dst_clone(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.rtable> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_fill_info(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int dst, @Unsigned @OriginalName(value="__be32") int src, Ptr<runtime.rtable> rt, @Unsigned int table_id, @OriginalName(value="dscp_t") char dscp, Ptr<runtime.flowi4> fl4, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, @Unsigned int seq, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_flush_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rt_genid_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_post_schedule() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_pre_schedule() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_schedule() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rt_mutex_setprio(Ptr<TaskDefinitions.task_struct> p, Ptr<TaskDefinitions.task_struct> pi_task) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rt_task_fits_capacity(Ptr<TaskDefinitions.task_struct> p, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ucontext")
    @NotUsableInJava
    public static class ucontext
    extends Struct {
        public @Unsigned long uc_flags;
        public Ptr<ucontext> uc_link;
        public  @OriginalName(value="stack_t") runtime.sigaltstack uc_stack;
        public runtime.sigcontext_64 uc_mcontext;
        public misc.sigset_t uc_sigmask;
    }

    @Type(noCCodeGeneration=true, cType="struct rt_cache_stat")
    @NotUsableInJava
    public static class rt_cache_stat
    extends Struct {
        public @Unsigned int in_slow_tot;
        public @Unsigned int in_slow_mc;
        public @Unsigned int in_no_route;
        public @Unsigned int in_brd;
        public @Unsigned int in_martian_dst;
        public @Unsigned int in_martian_src;
        public @Unsigned int out_slow_tot;
        public @Unsigned int out_slow_mc;
    }

    @Type(noCCodeGeneration=true, cType="struct rt_sigframe_ia32")
    @NotUsableInJava
    public static class rt_sigframe_ia32
    extends Struct {
        public @Unsigned int pretcode;
        public int sig;
        public @Unsigned int pinfo;
        public @Unsigned int puc;
        public @OriginalName(value="compat_siginfo_t") CompatDefinitions.compat_siginfo info;
        public misc.ucontext_ia32 uc;
        public char @Size(value=8) [] retcode;
    }

    @Type(noCCodeGeneration=true, cType="struct rt_sigframe")
    @NotUsableInJava
    public static class rt_sigframe
    extends Struct {
        public String pretcode;
        public ucontext uc;
        public runtime.siginfo info;
    }

    @Type(noCCodeGeneration=true, cType="enum rt_class_t")
    public static enum rt_class_t implements Enum<rt_class_t>,
    TypedEnum<rt_class_t, Integer>
    {
        RT_TABLE_UNSPEC,
        RT_TABLE_COMPAT,
        RT_TABLE_DEFAULT,
        RT_TABLE_MAIN,
        RT_TABLE_LOCAL,
        RT_TABLE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum rt_scope_t")
    public static enum rt_scope_t implements Enum<rt_scope_t>,
    TypedEnum<rt_scope_t, Integer>
    {
        RT_SCOPE_UNIVERSE,
        RT_SCOPE_SITE,
        RT_SCOPE_LINK,
        RT_SCOPE_HOST,
        RT_SCOPE_NOWHERE;

    }

    @Type(noCCodeGeneration=true, cType="struct rt_mutex")
    @NotUsableInJava
    public static class rt_mutex
    extends Struct {
        public rt_mutex_base rtmutex;
    }

    @Type(noCCodeGeneration=true, cType="struct { int _pid; unsigned int _uid; compat_sigval _sigval; }")
    @NotUsableInJava
    public static class _rt_of__sifields_of_compat_siginfo_and__sifields_of_compat_siginfo_t
    extends Struct {
        public @OriginalName(value="compat_pid_t") int _pid;
        public @Unsigned @OriginalName(value="__compat_uid32_t") int _uid;
        public @OriginalName(value="compat_sigval_t") CompatDefinitions.compat_sigval _sigval;
    }

    @Type(noCCodeGeneration=true, cType="struct rt_wake_q_head")
    @NotUsableInJava
    public static class rt_wake_q_head
    extends Struct {
        public WakeDefinitions.wake_q_head head;
        public Ptr<TaskDefinitions.task_struct> rtlock_task;
    }

    @Type(noCCodeGeneration=true, cType="struct rt_waiter_node")
    @NotUsableInJava
    public static class rt_waiter_node
    extends Struct {
        public RbDefinitions.rb_node entry;
        public int prio;
        public @Unsigned long deadline;
    }

    @Type(noCCodeGeneration=true, cType="struct rt_mutex_base")
    @NotUsableInJava
    public static class rt_mutex_base
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock wait_lock;
        public RbDefinitions.rb_root_cached waiters;
        public Ptr<TaskDefinitions.task_struct> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct rt_mutex_waiter")
    @NotUsableInJava
    public static class rt_mutex_waiter
    extends Struct {
        public rt_waiter_node tree;
        public rt_waiter_node pi_tree;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<rt_mutex_base> lock;
        public @Unsigned int wake_state;
        public Ptr<misc.ww_acquire_ctx> ww_ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct rt_rq")
    @NotUsableInJava
    public static class rt_rq
    extends Struct {
        public rt_prio_array active;
        public @Unsigned int rt_nr_running;
        public @Unsigned int rr_nr_running;
        public misc.highest_prio_of_rt_rq highest_prio;
        public boolean overloaded;
        public misc.plist_head pushable_tasks;
        public int rt_queued;
    }

    @Type(noCCodeGeneration=true, cType="struct rt_prio_array")
    @NotUsableInJava
    public static class rt_prio_array
    extends Struct {
        public @Unsigned long @Size(value=2) [] bitmap;
        public ListDefinitions.list_head @Size(value=100) [] queue;
    }

    @Type(noCCodeGeneration=true, cType="struct { int _pid; unsigned int _uid; sigval _sigval; }")
    @NotUsableInJava
    public static class _rt_of___sifields
    extends Struct {
        public @OriginalName(value="__kernel_pid_t") int _pid;
        public @Unsigned @OriginalName(value="__kernel_uid32_t") int _uid;
        public  @OriginalName(value="sigval_t") runtime.sigval _sigval;
    }
}

