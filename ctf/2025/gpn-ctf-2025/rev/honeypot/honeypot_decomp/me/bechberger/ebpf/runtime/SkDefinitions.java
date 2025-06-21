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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlblDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.SctpDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.StrpDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TlsDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_fullsock((const struct sock*)$arg1)")
    public static boolean sk_fullsock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_stream_error(Ptr<runtime.sock> sk, int flags, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_stream_kill_queues(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_stream_wait_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_stream_wait_connect(Ptr<runtime.sock> sk, Ptr<Long> timeo_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_stream_wait_memory(Ptr<runtime.sock> sk, Ptr<Long> timeo_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_stream_write_space(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sk_backlog_rcv(Ptr<runtime.sock> sk, Ptr<sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sk_destruct(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> __sk_dst_check(Ptr<runtime.sock> sk, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sk_flush_backlog(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sk_free(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sk_mem_raise_allocated(Ptr<runtime.sock> sk, int size, int amt, int kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sk_mem_reclaim(Ptr<runtime.sock> sk, int amount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sk_mem_reduce_allocated(Ptr<runtime.sock> sk, int amount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sk_mem_schedule(Ptr<runtime.sock> sk, int size, int kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__sk_receive_skb($arg1, $arg2, (const int)$arg3, $arg4, $arg5)")
    public static int __sk_receive_skb(Ptr<runtime.sock> sk, Ptr<sk_buff> skb, int nested, @Unsigned int trim_cap, boolean refcounted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> sk_alloc(Ptr<runtime.net> net2, int family, @Unsigned @OriginalName(value="gfp_t") int priority, Ptr<runtime.proto> prot, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sk_busy_loop_end(Ptr<?> p, @Unsigned long start_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_capable((const struct sock*)$arg1, $arg2)")
    public static boolean sk_capable(Ptr<runtime.sock> sk, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_clear_memalloc(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_clone_lock((const struct sock*)$arg1, (const unsigned int)$arg2)")
    public static Ptr<runtime.sock> sk_clone_lock(Ptr<runtime.sock> sk, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_common_release(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> sk_dst_check(Ptr<runtime.sock> sk, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_error_report(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_forced_mem_schedule(Ptr<runtime.sock> sk, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_free(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_free_unlock_clone(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_get_meminfo((const struct sock*)$arg1, $arg2)")
    public static void sk_get_meminfo(Ptr<runtime.sock> sk, Ptr<@Unsigned Integer> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_getsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_ioctl(Ptr<runtime.sock> sk, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_leave_memory_pressure(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_mc_loop((const struct sock*)$arg1)")
    public static boolean sk_mc_loop(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_net_capable((const struct sock*)$arg1, $arg2)")
    public static boolean sk_net_capable(Ptr<runtime.sock> sk, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_ns_capable((const struct sock*)$arg1, $arg2, $arg3)")
    public static boolean sk_ns_capable(Ptr<runtime.sock> sk, Ptr<UserDefinitions.user_namespace> user_ns, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sk_page_frag_refill(Ptr<runtime.sock> sk, Ptr<PageDefinitions.page_frag> pfrag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> sk_prot_alloc(Ptr<runtime.proto> prot, @Unsigned @OriginalName(value="gfp_t") int priority, int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_reset_timer(Ptr<runtime.sock> sk, Ptr<TimerDefinitions.timer_list> timer, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_send_sigurg(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_set_memalloc(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_set_peek_off(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_setup_caps(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_stop_timer(Ptr<runtime.sock> sk, Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_stop_timer_sync(Ptr<runtime.sock> sk, Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_wait_data($arg1, $arg2, (const struct sk_buff*)$arg3)")
    public static int sk_wait_data(Ptr<runtime.sock> sk, Ptr<Long> timeo, Ptr<sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sk_msg_free(Ptr<runtime.sock> sk, Ptr<sk_msg> msg, @Unsigned int i, boolean charge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sk_msg_free_partial(Ptr<runtime.sock> sk, Ptr<sk_msg> msg, @Unsigned int bytes, boolean charge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_msg_alloc(Ptr<runtime.sock> sk, Ptr<sk_msg> msg, int len, int elem_first_coalesce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_msg_clone(Ptr<runtime.sock> sk, Ptr<sk_msg> dst, Ptr<sk_msg> src, @Unsigned int off, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_msg_free(Ptr<runtime.sock> sk, Ptr<sk_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_msg_free_elem(Ptr<runtime.sock> sk, Ptr<sk_msg> msg, @Unsigned int i, boolean charge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_msg_free_nocharge(Ptr<runtime.sock> sk, Ptr<sk_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_msg_free_partial(Ptr<runtime.sock> sk, Ptr<sk_msg> msg, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_msg_free_partial_nocharge(Ptr<runtime.sock> sk, Ptr<sk_msg> msg, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sk_msg_is_readable(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_msg_memcopy_from_iter(Ptr<runtime.sock> sk, Ptr<IovDefinitions.iov_iter> from, Ptr<sk_msg> msg, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_msg_recvmsg(Ptr<runtime.sock> sk, Ptr<sk_psock> psock, Ptr<runtime.msghdr> msg, int len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_msg_return(Ptr<runtime.sock> sk, Ptr<sk_msg> msg, int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_msg_return_zero(Ptr<runtime.sock> sk, Ptr<sk_msg> msg, int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_msg_trim(Ptr<runtime.sock> sk, Ptr<sk_msg> msg, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_msg_zerocopy_from_iter(Ptr<runtime.sock> sk, Ptr<IovDefinitions.iov_iter> from, Ptr<sk_msg> msg, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_backlog(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_destroy(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_drop(Ptr<runtime.sock> sk, Ptr<sk_psock> psock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sk_psock> sk_psock_init(Ptr<runtime.sock> sk, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_init_strp(Ptr<runtime.sock> sk, Ptr<sk_psock> psock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sk_psock_link> sk_psock_link_pop(Ptr<sk_psock> psock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_msg_verdict(Ptr<runtime.sock> sk, Ptr<sk_psock> psock, Ptr<sk_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_skb_ingress_enqueue(Ptr<sk_buff> skb, @Unsigned int off, @Unsigned int len, Ptr<sk_psock> psock, Ptr<runtime.sock> sk, Ptr<sk_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_skb_ingress_self(Ptr<sk_psock> psock, Ptr<sk_buff> skb, @Unsigned int off, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_skb_redirect(Ptr<sk_psock> from, Ptr<sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_start_strp(Ptr<runtime.sock> sk, Ptr<sk_psock> psock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_start_verdict(Ptr<runtime.sock> sk, Ptr<sk_psock> psock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_stop(Ptr<sk_psock> psock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_stop_strp(Ptr<runtime.sock> sk, Ptr<sk_psock> psock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_stop_verdict(Ptr<runtime.sock> sk, Ptr<sk_psock> psock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_strp_data_ready(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_strp_parse(Ptr<runtime.strparser> strp, Ptr<sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_strp_read(Ptr<runtime.strparser> strp, Ptr<sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_strp_read_done(Ptr<runtime.strparser> strp, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_tls_strp_read(Ptr<sk_psock> psock, Ptr<sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_verdict_apply(Ptr<sk_psock> psock, Ptr<sk_buff> skb, int verdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_verdict_data_ready(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_psock_verdict_recv(Ptr<runtime.sock> sk, Ptr<sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_psock_write_space(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_skb_reason_drop(Ptr<runtime.sock> sk, Ptr<sk_buff> skb, SkbDefinitions.skb_drop_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sk_attach_prog(Ptr<BpfDefinitions.bpf_prog> prog, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__sk_queue_drop_skb($arg1, $arg2, $arg3, $arg4, (void (*)(struct sock*, struct sk_buff*))$arg5)")
    public static int __sk_queue_drop_skb(Ptr<runtime.sock> sk, Ptr<sk_buff_head> sk_queue, Ptr<sk_buff> skb, @Unsigned int flags, Ptr<?> destructor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_attach_bpf(@Unsigned int ufd, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_attach_filter(Ptr<SockDefinitions.sock_fprog> fprog, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_detach_filter(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sk_filter_charge(Ptr<runtime.sock> sk, Ptr<sk_filter> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)sk_filter_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> sk_filter_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_filter_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean sk_filter_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_filter_release_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_filter_trim_cap(Ptr<runtime.sock> sk, Ptr<sk_buff> skb, @Unsigned int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_filter_uncharge(Ptr<runtime.sock> sk, Ptr<sk_filter> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_get_filter(Ptr<runtime.sock> sk, misc.sockptr_t optval, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> sk_lookup(Ptr<runtime.net> net2, Ptr<BpfDefinitions.bpf_sock_tuple> tuple, int dif, int sdif, char family, char proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_lookup_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int sk_lookup_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)sk_lookup_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> sk_lookup_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_lookup_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean sk_lookup_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_msg_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int sk_msg_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)sk_msg_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> sk_msg_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_msg_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean sk_msg_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_reuseport_attach_bpf(@Unsigned int ufd, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_reuseport_attach_filter(Ptr<SockDefinitions.sock_fprog> fprog, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_reuseport_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int sk_reuseport_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)sk_reuseport_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> sk_reuseport_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_reuseport_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean sk_reuseport_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sk_reuseport_load_bytes(@Unsigned long reuse_kern, @Unsigned long offset, @Unsigned long to, @Unsigned long len, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sk_reuseport_load_bytes_relative(@Unsigned long reuse_kern, @Unsigned long offset, @Unsigned long to, @Unsigned long len, @Unsigned long start_header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sk_reuseport_prog_free(Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sk_select_reuseport(@Unsigned long reuse_kern, @Unsigned long map2, @Unsigned long key2, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sk_skb_adjust_room(@Unsigned long skb, @Unsigned long len_diff, @Unsigned long mode, @Unsigned long flags, @Unsigned long __ur_1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sk_skb_change_head(@Unsigned long skb, @Unsigned long head_room, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sk_skb_change_tail(@Unsigned long skb, @Unsigned long new_len, @Unsigned long flags, @Unsigned long __ur_1, @Unsigned long __ur_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_skb_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int sk_skb_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)sk_skb_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> sk_skb_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_skb_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean sk_skb_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sk_skb_prologue($arg1, $arg2, (const struct bpf_prog*)$arg3)")
    public static int sk_skb_prologue(Ptr<BpfDefinitions.bpf_insn> insn_buf, boolean direct_write, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sk_skb_pull_data(@Unsigned long skb, @Unsigned long len, @Unsigned long __ur_1, @Unsigned long __ur_2, @Unsigned long __ur_3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sk_udp_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum sk_psock_state_bits")
    public static enum sk_psock_state_bits implements Enum<sk_psock_state_bits>,
    TypedEnum<sk_psock_state_bits, Integer>
    {
        SK_PSOCK_TX_ENABLED,
        SK_PSOCK_RX_STRP_ENABLED;

    }

    @Type(noCCodeGeneration=true, cType="enum __sk_action")
    public static enum __sk_action implements Enum<__sk_action>,
    TypedEnum<__sk_action, Integer>
    {
        __SK_DROP,
        __SK_PASS,
        __SK_REDIRECT,
        __SK_NONE;

    }

    @Type(noCCodeGeneration=true, cType="struct sk_buff__safe_rcu_or_null")
    @NotUsableInJava
    public static class sk_buff__safe_rcu_or_null
    extends Struct {
        public Ptr<runtime.sock> sk;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_buff_fclones")
    @NotUsableInJava
    public static class sk_buff_fclones
    extends Struct {
        public sk_buff skb1;
        public sk_buff skb2;
        public  @OriginalName(value="refcount_t") misc.refcount_struct fclone_ref;
    }

    @Type(noCCodeGeneration=true, cType="enum sk_pacing")
    public static enum sk_pacing implements Enum<sk_pacing>,
    TypedEnum<sk_pacing, Integer>
    {
        SK_PACING_NONE,
        SK_PACING_NEEDED,
        SK_PACING_FQ;

    }

    @Type(noCCodeGeneration=true, cType="struct sk_psock_link")
    @NotUsableInJava
    public static class sk_psock_link
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<BpfDefinitions.bpf_map> map;
        public Ptr<?> link_raw;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_psock_work_state")
    @NotUsableInJava
    public static class sk_psock_work_state
    extends Struct {
        public @Unsigned int len;
        public @Unsigned int off;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_psock_progs")
    @NotUsableInJava
    public static class sk_psock_progs
    extends Struct {
        public Ptr<BpfDefinitions.bpf_prog> msg_parser;
        public Ptr<BpfDefinitions.bpf_prog> stream_parser;
        public Ptr<BpfDefinitions.bpf_prog> stream_verdict;
        public Ptr<BpfDefinitions.bpf_prog> skb_verdict;
        public Ptr<BpfDefinitions.bpf_link> msg_parser_link;
        public Ptr<BpfDefinitions.bpf_link> stream_parser_link;
        public Ptr<BpfDefinitions.bpf_link> stream_verdict_link;
        public Ptr<BpfDefinitions.bpf_link> skb_verdict_link;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_msg")
    @NotUsableInJava
    public static class sk_msg
    extends Struct {
        public sk_msg_sg sg;
        public Ptr<?> data;
        public Ptr<?> data_end;
        public @Unsigned int apply_bytes;
        public @Unsigned int cork_bytes;
        public @Unsigned int flags;
        public Ptr<sk_buff> skb;
        public Ptr<runtime.sock> sk_redir;
        public Ptr<runtime.sock> sk;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_msg_sg")
    @NotUsableInJava
    public static class sk_msg_sg
    extends Struct {
        public @Unsigned int start;
        public @Unsigned int curr;
        public @Unsigned int end;
        public @Unsigned int size;
        public @Unsigned int copybreak;
        public @Unsigned long @Size(value=1) [] copy;
        public runtime.scatterlist @Size(value=19) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_skb_cb")
    @NotUsableInJava
    public static class sk_skb_cb
    extends Struct {
        public char @Size(value=20) [] data;
        public char @Size(value=4) [] pad;
        public StrpDefinitions._strp_msg strp;
        public TlsDefinitions.tls_msg tls;
        public @Unsigned long temp_reg;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_psock")
    @NotUsableInJava
    public static class sk_psock
    extends Struct {
        public Ptr<runtime.sock> sk;
        public Ptr<runtime.sock> sk_redir;
        public @Unsigned int apply_bytes;
        public @Unsigned int cork_bytes;
        public @Unsigned int eval;
        public boolean redir_ingress;
        public Ptr<sk_msg> cork;
        public sk_psock_progs progs;
        public runtime.strparser strp;
        public sk_buff_head ingress_skb;
        public ListDefinitions.list_head ingress_msg;
        public  @OriginalName(value="spinlock_t") runtime.spinlock ingress_lock;
        public @Unsigned long state;
        public ListDefinitions.list_head link;
        public  @OriginalName(value="spinlock_t") runtime.spinlock link_lock;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public Ptr<?> saved_unhash;
        public Ptr<?> saved_destroy;
        public Ptr<?> saved_close;
        public Ptr<?> saved_write_space;
        public Ptr<?> saved_data_ready;
        public Ptr<?> psock_update_sk_prot;
        public Ptr<runtime.proto> sk_proto;
        public runtime.mutex work_mutex;
        public sk_psock_work_state work_state;
        public DelayedDefinitions.delayed_work work;
        public Ptr<runtime.sock> sk_pair;
        public RcuDefinitions.rcu_work rwork;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_reuseport_kern")
    @NotUsableInJava
    public static class sk_reuseport_kern
    extends Struct {
        public Ptr<sk_buff> skb;
        public Ptr<runtime.sock> sk;
        public Ptr<runtime.sock> selected_sk;
        public Ptr<runtime.sock> migrating_sk;
        public Ptr<?> data_end;
        public @Unsigned int hash;
        public @Unsigned int reuseport_id;
        public boolean bind_inany;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_reuseport_md")
    @NotUsableInJava
    public static class sk_reuseport_md
    extends Struct {
        @InlineUnion(value=23481)
        public @InlineUnion(value=23481) Ptr<?> data;
        @InlineUnion(value=23482)
        public @InlineUnion(value=23482) Ptr<?> data_end;
        public @Unsigned int len;
        public @Unsigned int eth_protocol;
        public @Unsigned int ip_protocol;
        public @Unsigned int bind_inany;
        public @Unsigned int hash;
        @InlineUnion(value=23464)
        public @InlineUnion(value=23464) Ptr<BpfDefinitions.bpf_sock> sk;
        @InlineUnion(value=23484)
        public @InlineUnion(value=23484) Ptr<BpfDefinitions.bpf_sock> migrating_sk;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_msg_md")
    @NotUsableInJava
    public static class sk_msg_md
    extends Struct {
        @InlineUnion(value=23481)
        public @InlineUnion(value=23481) Ptr<?> data;
        @InlineUnion(value=23482)
        public @InlineUnion(value=23482) Ptr<?> data_end;
        public @Unsigned int family;
        public @Unsigned int remote_ip4;
        public @Unsigned int local_ip4;
        public @Unsigned int @Size(value=4) [] remote_ip6;
        public @Unsigned int @Size(value=4) [] local_ip6;
        public @Unsigned int remote_port;
        public @Unsigned int local_port;
        public @Unsigned int size;
        @InlineUnion(value=23464)
        public @InlineUnion(value=23464) Ptr<BpfDefinitions.bpf_sock> sk;
    }

    @Type(noCCodeGeneration=true, cType="enum sk_action")
    public static enum sk_action implements Enum<sk_action>,
    TypedEnum<sk_action, Integer>
    {
        SK_DROP,
        SK_PASS;

    }

    @Type(noCCodeGeneration=true, cType="struct __sk_buff")
    @NotUsableInJava
    public static class __sk_buff
    extends Struct {
        public @Unsigned int len;
        public @Unsigned int pkt_type;
        public @Unsigned int mark;
        public @Unsigned int queue_mapping;
        public @Unsigned int protocol;
        public @Unsigned int vlan_present;
        public @Unsigned int vlan_tci;
        public @Unsigned int vlan_proto;
        public @Unsigned int priority;
        public @Unsigned int ingress_ifindex;
        public @Unsigned int ifindex;
        public @Unsigned int tc_index;
        public @Unsigned int @Size(value=5) [] cb;
        public @Unsigned int hash;
        public @Unsigned int tc_classid;
        public @Unsigned int data;
        public @Unsigned int data_end;
        public @Unsigned int napi_id;
        public @Unsigned int family;
        public @Unsigned int remote_ip4;
        public @Unsigned int local_ip4;
        public @Unsigned int @Size(value=4) [] remote_ip6;
        public @Unsigned int @Size(value=4) [] local_ip6;
        public @Unsigned int remote_port;
        public @Unsigned int local_port;
        public @Unsigned int data_meta;
        @InlineUnion(value=23461)
        public @InlineUnion(value=23461) Ptr<BpfDefinitions.bpf_flow_keys> flow_keys;
        public @Unsigned long tstamp;
        public @Unsigned int wire_len;
        public @Unsigned int gso_segs;
        @InlineUnion(value=23464)
        public @InlineUnion(value=23464) Ptr<BpfDefinitions.bpf_sock> sk;
        public @Unsigned int gso_size;
        public char tstamp_type;
        public @Unsigned long hwtstamp;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_security_struct")
    @NotUsableInJava
    public static class sk_security_struct
    extends Struct {
        public misc.nlbl_state_of_sk_security_struct nlbl_state;
        public Ptr<NetlblDefinitions.netlbl_lsm_secattr> nlbl_secattr;
        public @Unsigned int sid;
        public @Unsigned int peer_sid;
        public @Unsigned short sclass;
        public SctpDefinitions.sctp_assoc_state_of_sk_security_struct sctp_assoc_state;
    }

    @Type(noCCodeGeneration=true, cType="enum sk_rst_reason")
    public static enum sk_rst_reason implements Enum<sk_rst_reason>,
    TypedEnum<sk_rst_reason, Integer>
    {
        SK_RST_REASON_NOT_SPECIFIED,
        SK_RST_REASON_NO_SOCKET,
        SK_RST_REASON_TCP_INVALID_ACK_SEQUENCE,
        SK_RST_REASON_TCP_RFC7323_PAWS,
        SK_RST_REASON_TCP_TOO_OLD_ACK,
        SK_RST_REASON_TCP_ACK_UNSENT_DATA,
        SK_RST_REASON_TCP_FLAGS,
        SK_RST_REASON_TCP_OLD_ACK,
        SK_RST_REASON_TCP_ABORT_ON_DATA,
        SK_RST_REASON_TCP_TIMEWAIT_SOCKET,
        SK_RST_REASON_INVALID_SYN,
        SK_RST_REASON_TCP_ABORT_ON_CLOSE,
        SK_RST_REASON_TCP_ABORT_ON_LINGER,
        SK_RST_REASON_TCP_ABORT_ON_MEMORY,
        SK_RST_REASON_TCP_STATE,
        SK_RST_REASON_TCP_KEEPALIVE_TIMEOUT,
        SK_RST_REASON_TCP_DISCONNECT_WITH_DATA,
        SK_RST_REASON_MPTCP_RST_EUNSPEC,
        SK_RST_REASON_MPTCP_RST_EMPTCP,
        SK_RST_REASON_MPTCP_RST_ERESOURCE,
        SK_RST_REASON_MPTCP_RST_EPROHIBIT,
        SK_RST_REASON_MPTCP_RST_EWQ2BIG,
        SK_RST_REASON_MPTCP_RST_EBADPERF,
        SK_RST_REASON_MPTCP_RST_EMIDDLEBOX,
        SK_RST_REASON_ERROR,
        SK_RST_REASON_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct { struct { int counter; } rmem_alloc; int len; struct sk_buff *head; struct sk_buff *tail; }")
    @NotUsableInJava
    public static class sk_backlog_of_sock
    extends Struct {
        public AtomicDefinitions.atomic_t rmem_alloc;
        public int len;
        public Ptr<sk_buff> head;
        public Ptr<sk_buff> tail;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_filter")
    @NotUsableInJava
    public static class sk_filter
    extends Struct {
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public misc.callback_head rcu;
        public Ptr<BpfDefinitions.bpf_prog> prog;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_buff_head")
    @NotUsableInJava
    public static class sk_buff_head
    extends Struct {
        @InlineUnion(value=2569)
        public  @InlineUnion(value=2569) AnonDefinitions.anon_member_of_anon_member_of_sk_buff_head anon0$0;
        @InlineUnion(value=2569)
        public @InlineUnion(value=2569) sk_buff_list list;
        public @Unsigned int qlen;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_buff_list")
    @NotUsableInJava
    public static class sk_buff_list
    extends Struct {
        public Ptr<sk_buff> next;
        public Ptr<sk_buff> prev;
    }

    @Type(noCCodeGeneration=true, cType="struct sk_buff")
    @NotUsableInJava
    public static class sk_buff
    extends Struct {
        @InlineUnion(value=2574)
        public  @InlineUnion(value=2574) AnonDefinitions.anon_member_of_anon_member_of_sk_buff anon0$0;
        @InlineUnion(value=2574)
        public  @InlineUnion(value=2574) RbDefinitions.rb_node rbnode;
        @InlineUnion(value=2574)
        public  @InlineUnion(value=2574) ListDefinitions.list_head list;
        @InlineUnion(value=2574)
        public  @InlineUnion(value=2574) misc.llist_node ll_node;
        public Ptr<runtime.sock> sk;
        @InlineUnion(value=2575)
        public @InlineUnion(value=2575) @OriginalName(value="ktime_t") long tstamp;
        @InlineUnion(value=2575)
        public @InlineUnion(value=2575) @Unsigned long skb_mstamp_ns;
        public char @Size(value=48) [] cb;
        @InlineUnion(value=2577)
        public  @InlineUnion(value=2577) AnonDefinitions.anon_member_of_anon_member_of_sk_buff anon4$0;
        @InlineUnion(value=2577)
        public  @InlineUnion(value=2577) ListDefinitions.list_head tcp_tsorted_anchor;
        @InlineUnion(value=2577)
        public @InlineUnion(value=2577) @Unsigned long _sk_redir;
        public @Unsigned long _nfct;
        public @Unsigned int len;
        public @Unsigned int data_len;
        public @Unsigned short mac_len;
        public @Unsigned short hdr_len;
        public @Unsigned short queue_mapping;
        public char @Size(value=0) [] __cloned_offset;
        public char cloned;
        public char nohdr;
        public char fclone;
        public char peeked;
        public char head_frag;
        public char pfmemalloc;
        public char pp_recycle;
        public char active_extensions;
        @InlineUnion(value=2586)
        public  @InlineUnion(value=2586) AnonDefinitions.anon_member_of_anon_member_of_sk_buff_and_headers_of_anon_member_of_sk_buff anon20$0;
        @InlineUnion(value=2586)
        public  @InlineUnion(value=2586) AnonDefinitions.anon_member_of_anon_member_of_sk_buff_and_headers_of_anon_member_of_sk_buff headers;
        public @Unsigned @OriginalName(value="sk_buff_data_t") int tail;
        public @Unsigned @OriginalName(value="sk_buff_data_t") int end;
        public String head;
        public String data;
        public @Unsigned int truesize;
        public  @OriginalName(value="refcount_t") misc.refcount_struct users;
        public Ptr<SkbDefinitions.skb_ext> extensions;
    }
}

