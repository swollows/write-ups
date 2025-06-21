/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CpuidleDefinitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.HidDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NexthopDefinitions;
import me.bechberger.ebpf.runtime.NhDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.SwitchdevDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CallDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_commit_handler(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_fib_notifier(Ptr<misc.notifier_block> nb, FibDefinitions.fib_event_type event_type, Ptr<FibDefinitions.fib_notifier_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_fib_notifiers(Ptr<runtime.net> net2, FibDefinitions.fib_event_type event_type, Ptr<FibDefinitions.fib_notifier_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_filldir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx, Ptr<runtime.fname> fname2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_filter_check_discard(Ptr<TraceDefinitions.trace_event_call> call, Ptr<?> rec, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<RingDefinitions.ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_netevent_notifiers(@Unsigned long val, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_srcu(Ptr<SrcuDefinitions.srcu_struct> ssp, Ptr<misc.callback_head> rhp, @OriginalName(value="rcu_callback_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_trace_sock_recv_length(Ptr<runtime.sock> sk, int ret, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_trace_sock_send_length(Ptr<runtime.sock> sk, int ret, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_dcbevent_notifiers(@Unsigned long val, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_direct_funcs(@Unsigned long ip, @Unsigned long pip, Ptr<FtraceDefinitions.ftrace_ops> ops, Ptr<FtraceDefinitions.ftrace_regs> fregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="call_hid_bpf_rdesc_fixup($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<Character> call_hid_bpf_rdesc_fixup(Ptr<HidDefinitions.hid_device> hdev, Ptr<Character> rdesc, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_rcu_tasks(Ptr<misc.callback_head> rhp, @OriginalName(value="rcu_callback_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_rcu_tasks_generic(Ptr<misc.callback_head> rhp, @OriginalName(value="rcu_callback_t") Ptr<?> func, Ptr<RcuDefinitions.rcu_tasks> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_rcu_tasks_generic_timer(Ptr<TimerDefinitions.timer_list> tlp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_rcu_tasks_iw_wakeup(Ptr<IrqDefinitions.irq_work> iwp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_rcu_tasks_rude(Ptr<misc.callback_head> rhp, @OriginalName(value="rcu_callback_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_rcu_tasks_trace(Ptr<misc.callback_head> rhp, @OriginalName(value="rcu_callback_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="call_timer_fn($arg1, (void (*)(struct timer_list*))$arg2, $arg3)")
    public static void call_timer_fn(Ptr<TimerDefinitions.timer_list> timer, Ptr<?> fn, @Unsigned long baseclk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __call_nexthop_res_bucket_notifiers(Ptr<runtime.net> net2, @Unsigned int nhg_id, @Unsigned short bucket_index, boolean force, Ptr<NhDefinitions.nh_info> oldi, Ptr<NhDefinitions.nh_info> newi, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __call_rcu_common(Ptr<misc.callback_head> head, @OriginalName(value="rcu_callback_t") Ptr<?> func, boolean lazy_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __call_rcu_nocb_wake(Ptr<RcuDefinitions.rcu_data> rdp, boolean was_alldone, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_blocking_lsm_notifier(LsmDefinitions.lsm_event event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_fib6_notifier(Ptr<misc.notifier_block> nb, FibDefinitions.fib_event_type event_type, Ptr<FibDefinitions.fib_notifier_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_fib6_notifiers(Ptr<runtime.net> net2, FibDefinitions.fib_event_type event_type, Ptr<FibDefinitions.fib_notifier_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_function_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean call_function_single_prep_ipi(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_netdevice_notifiers(@Unsigned long val, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_netdevice_notifiers_info(@Unsigned long val, Ptr<NetdevDefinitions.netdev_notifier_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_netdevice_register_net_notifiers(Ptr<misc.notifier_block> nb, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_netdevice_unregister_notifiers(Ptr<misc.notifier_block> nb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_nexthop_notifiers(Ptr<runtime.net> net2, NexthopDefinitions.nexthop_event_type event_type, Ptr<runtime.nexthop> nh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_rcu(Ptr<misc.callback_head> head, @OriginalName(value="rcu_callback_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_rcu_hurry(Ptr<misc.callback_head> head, @OriginalName(value="rcu_callback_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_switchdev_blocking_notifiers(@Unsigned long val, Ptr<NetDefinitions.net_device> dev, Ptr<SwitchdevDefinitions.switchdev_notifier_info> info2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_switchdev_notifiers(@Unsigned long val, Ptr<NetDefinitions.net_device> dev, Ptr<SwitchdevDefinitions.switchdev_notifier_info> info2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_trace_sched_update_nr_running(Ptr<runtime.rq> rq2, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="call_usermodehelper((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int call_usermodehelper(String path2, Ptr<String> argv, Ptr<String> envp, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_usermodehelper_exec(Ptr<misc.subprocess_info> sub_info, int wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_usermodehelper_exec_async(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_usermodehelper_exec_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="call_usermodehelper_setup((const u8*)$arg1, $arg2, $arg3, $arg4, (int (*)(struct subprocess_info*, struct cred*))$arg5, (void (*)(struct subprocess_info*))$arg6, $arg7)")
    public static Ptr<misc.subprocess_info> call_usermodehelper_setup(String path2, Ptr<String> argv, Ptr<String> envp, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> init, Ptr<?> cleanup, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_cpuidle(Ptr<CpuidleDefinitions.cpuidle_driver> drv, Ptr<CpuidleDefinitions.cpuidle_device> dev, int next_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void call_depth_return_thunk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_fib4_notifier(Ptr<misc.notifier_block> nb, FibDefinitions.fib_event_type event_type, Ptr<FibDefinitions.fib_notifier_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_fib4_notifiers(Ptr<runtime.net> net2, FibDefinitions.fib_event_type event_type, Ptr<FibDefinitions.fib_notifier_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_fib6_entry_notifiers(Ptr<runtime.net> net2, FibDefinitions.fib_event_type event_type, Ptr<Fib6Definitions.fib6_info> rt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_fib6_entry_notifiers_replace(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_fib6_multipath_entry_notifiers(Ptr<runtime.net> net2, FibDefinitions.fib_event_type event_type, Ptr<Fib6Definitions.fib6_info> rt, @Unsigned int nsiblings, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> call_get_dest(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int call_sbin_request_key(Ptr<runtime.key> authkey, Ptr<?> aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct call_function_data")
    @NotUsableInJava
    public static class call_function_data
    extends Struct {
        public Ptr<@OriginalName(value="call_single_data_t") __call_single_data> csd;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpumask;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpumask_ipi;
    }

    @Type(noCCodeGeneration=true, cType="struct __call_single_data")
    @NotUsableInJava
    public static class __call_single_data
    extends Struct {
        public __call_single_node node;
        public @OriginalName(value="smp_call_func_t") Ptr<?> func;
        public Ptr<?> info;
    }

    @Type(noCCodeGeneration=true, cType="struct __call_single_node")
    @NotUsableInJava
    public static class __call_single_node
    extends Struct {
        public misc.llist_node llist;
        @InlineUnion(value=153)
        public @InlineUnion(value=153) @Unsigned int u_flags;
        @InlineUnion(value=153)
        public @InlineUnion(value=153) AtomicDefinitions.atomic_t a_flags;
        public @Unsigned short src;
        public @Unsigned short dst;
    }
}

