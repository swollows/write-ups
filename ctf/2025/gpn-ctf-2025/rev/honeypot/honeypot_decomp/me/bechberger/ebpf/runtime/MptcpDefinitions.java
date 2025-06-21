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
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.ProtoDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.TcpDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MptcpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_check_push(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_clean_una(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __mptcp_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_close_ssk(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk, Ptr<mptcp_subflow_context> subflow, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_data_acked(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_destroy_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_error_report(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __mptcp_finish_join(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_init_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __mptcp_move_skb(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int offset, @Unsigned long copy_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __mptcp_move_skbs(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __mptcp_move_skbs_from_subflow(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk, Ptr<@Unsigned Integer> bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> __mptcp_nmpc_sk(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __mptcp_ofo_queue(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_push_pending(Ptr<runtime.sock> sk, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_retrans(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __mptcp_retransmit_pending_data(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_subflow_push_pending(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk, boolean first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_subflow_send_ack(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_unaccepted_force_close(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_update_rmem(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_wr_shutdown(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_ca_reset(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_cancel_work(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_check_and_set_pending(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_check_data_fin(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_check_listen_stop(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_check_send_data_fin(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int mptcp_check_writeable(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_close_ssk(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk, Ptr<mptcp_subflow_context> subflow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_close_wake_up(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_copy_inaddrs($arg1, (const struct sock*)$arg2)")
    public static void mptcp_copy_inaddrs(Ptr<runtime.sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_copy_ip_options($arg1, (const struct sock*)$arg2)")
    public static void mptcp_copy_ip_options(Ptr<runtime.sock> newsk, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_data_queue_ofo(Ptr<mptcp_sock> msk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_data_ready(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_destroy(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_destroy_common(Ptr<mptcp_sock> msk, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_disconnect(Ptr<runtime.sock> sk, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_dss_corruption(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_enter_memory_pressure(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_finish_connect(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_finish_join(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_forward_alloc_get((const struct sock*)$arg1)")
    public static int mptcp_forward_alloc_get(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_free_local_addr_list(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_get_port(Ptr<runtime.sock> sk, @Unsigned short snum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_hash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_init_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_ioctl(Ptr<runtime.sock> sk, int cmd, Ptr<Integer> karg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_ioctl_outq((const struct mptcp_sock*)$arg1, $arg2)")
    public static int mptcp_ioctl_outq(Ptr<mptcp_sock> msk, @Unsigned long v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_join_cookie_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mptcp_join_entry_hash(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_napi_poll(Ptr<NapiDefinitions.napi_struct> napi, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_pending_data_fin(Ptr<runtime.sock> sk, Ptr<@Unsigned Long> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_announce_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_remove_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_subflow_create_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_subflow_destroy_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int mptcp_poll(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_proto_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_proto_v6_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_rcv_space_adjust(Ptr<mptcp_sock> msk, int copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_rcv_space_init($arg1, (const struct sock*)$arg2)")
    public static void mptcp_rcv_space_init(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_release_cb(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_reset_tout_timer(Ptr<mptcp_sock> msk, @Unsigned long fail_tout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_retransmit_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_rfree(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_schedule_work(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_send_ack(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_sendmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_sendmsg_frag(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk, Ptr<mptcp_data_frag> dfrag, Ptr<mptcp_sendmsg_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_set_owner_r(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_set_state(Ptr<runtime.sock> sk, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_shutdown(Ptr<runtime.sock> sk, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_sk_clone_init((const struct sock*)$arg1, (const struct mptcp_options_received*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.sock> mptcp_sk_clone_init(Ptr<runtime.sock> sk, Ptr<mptcp_options_received> mp_opt, Ptr<runtime.sock> ssk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_sock_graft(Ptr<runtime.sock> sk, Ptr<runtime.socket> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_stream_accept(Ptr<runtime.socket> sock2, Ptr<runtime.socket> newsock, Ptr<ProtoDefinitions.proto_accept_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_stream_memory_free((const struct sock*)$arg1, $arg2)")
    public static boolean mptcp_stream_memory_free(Ptr<runtime.sock> sk, int wake) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_subflow_active(Ptr<mptcp_subflow_context> subflow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> mptcp_subflow_get_retrans(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> mptcp_subflow_get_send(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_subflow_process_delegated(Ptr<runtime.sock> ssk, long status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_subflow_set_active(Ptr<mptcp_subflow_context> subflow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_subflow_shutdown(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mptcp_sync_mss(Ptr<runtime.sock> sk, @Unsigned int pmtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_token_join_cookie_init_state(Ptr<mptcp_subflow_request_sock> subflow_req, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_tout_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_try_coalesce(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> to, Ptr<SkDefinitions.sk_buff> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_unhash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_update_data_checksum(Ptr<SkDefinitions.sk_buff> skb, int added) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_userspace_pm_append_new_local_addr(Ptr<mptcp_sock> msk, Ptr<mptcp_pm_addr_entry> entry, boolean needs_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_userspace_pm_delete_local_addr(Ptr<mptcp_sock> msk, Ptr<mptcp_pm_addr_entry> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_userspace_pm_dump_addr(Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_userspace_pm_get_addr(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_userspace_pm_get_local_id(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> skc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_userspace_pm_is_backup(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> skc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_userspace_pm_set_flags(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_worker(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __mptcp_expand_seq(@Unsigned long old_seq, @Unsigned long cur_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__mptcp_fastopen_gen_msk_ackseq($arg1, $arg2, (const struct mptcp_options_received*)$arg3)")
    public static void __mptcp_fastopen_gen_msk_ackseq(Ptr<mptcp_sock> msk, Ptr<mptcp_subflow_context> subflow, Ptr<mptcp_options_received> mp_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short __mptcp_make_csum(@Unsigned long data_seq, @Unsigned int subflow_seq, @Unsigned short data_len, @Unsigned @OriginalName(value="__wsum") int sum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_active_detect_blackhole(Ptr<runtime.sock> ssk, boolean expired) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_active_disable(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_active_enable(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_active_should_disable(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_allow_join_id0((const struct net*)$arg1)")
    public static int mptcp_allow_join_id0(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_close_timeout((const struct sock*)$arg1)")
    public static @Unsigned int mptcp_close_timeout(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_crypto_hmac_sha(@Unsigned long key1, @Unsigned long key2, Ptr<Character> msg, int len, Ptr<?> hmac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_crypto_key_sha(@Unsigned long key2, Ptr<@Unsigned Integer> token, Ptr<@Unsigned Long> idsn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_established_options(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> size, @Unsigned int remaining, Ptr<mptcp_out_options> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_established_options_add_addr(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> size, @Unsigned int remaining, Ptr<mptcp_out_options> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_established_options_dss(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, boolean snd_data_fin_enable, Ptr<@Unsigned Integer> size, Ptr<mptcp_out_options> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_established_options_mp(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, boolean snd_data_fin_enable, Ptr<@Unsigned Integer> size, Ptr<mptcp_out_options> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_established_options_mp_fail(Ptr<runtime.sock> sk, Ptr<@Unsigned Integer> size, @Unsigned int remaining, Ptr<mptcp_out_options> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_fastopen_subflow_synack_set_params(Ptr<mptcp_subflow_context> subflow, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_get_add_addr_timeout((const struct net*)$arg1)")
    public static @Unsigned int mptcp_get_add_addr_timeout(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_get_options((const struct sk_buff*)$arg1, $arg2)")
    public static void mptcp_get_options(Ptr<SkDefinitions.sk_buff> skb, Ptr<mptcp_options_received> mp_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_get_pm_type((const struct net*)$arg1)")
    public static int mptcp_get_pm_type(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_get_reset_option((const struct sk_buff*)$arg1)")
    public static @Unsigned @OriginalName(value="__be32") int mptcp_get_reset_option(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)mptcp_get_scheduler((const struct net*)$arg1))")
    public static String mptcp_get_scheduler(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_incoming_options(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_is_checksum_enabled((const struct net*)$arg1)")
    public static int mptcp_is_checksum_enabled(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_is_enabled((const struct net*)$arg1)")
    public static int mptcp_is_enabled(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_mib_alloc(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_parse_option((const struct sk_buff*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void mptcp_parse_option(Ptr<SkDefinitions.sk_buff> skb, String ptr, int opsize, Ptr<mptcp_options_received> mp_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_seq_show(Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_set_scheduler((const struct net*)$arg1, (const u8*)$arg2)")
    public static int mptcp_set_scheduler(Ptr<runtime.net> net2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_stale_loss_cnt((const struct net*)$arg1)")
    public static @Unsigned int mptcp_stale_loss_cnt(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_syn_options($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4)")
    public static boolean mptcp_syn_options(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> size, Ptr<mptcp_out_options> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_synack_options((const struct request_sock*)$arg1, $arg2, $arg3)")
    public static boolean mptcp_synack_options(Ptr<RequestDefinitions.request_sock> req2, Ptr<@Unsigned Integer> size, Ptr<mptcp_out_options> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_update_rcv_data_fin(Ptr<mptcp_sock> msk, @Unsigned long data_fin_seq, boolean use_64bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_write_options(Ptr<runtime.tcphdr> th, Ptr<@Unsigned @OriginalName(value="__be32") Integer> ptr, Ptr<TcpDefinitions.tcp_sock> tp, Ptr<mptcp_out_options> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__mptcp_subflow_connect($arg1, (const struct mptcp_pm_local*)$arg2, (const struct mptcp_addr_info*)$arg3)")
    public static int __mptcp_subflow_connect(Ptr<runtime.sock> sk, Ptr<mptcp_pm_local> local, Ptr<mptcp_addr_info> remote) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__mptcp_subflow_fully_established($arg1, $arg2, (const struct mptcp_options_received*)$arg3)")
    public static void __mptcp_subflow_fully_established(Ptr<mptcp_sock> msk, Ptr<mptcp_subflow_context> subflow, Ptr<mptcp_options_received> mp_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_sync_state(Ptr<runtime.sock> sk, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_can_accept_new_subflow((const struct mptcp_sock*)$arg1)")
    public static boolean mptcp_can_accept_new_subflow(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_diag_fill_info(Ptr<mptcp_sock> msk, Ptr<mptcp_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_get_available_schedulers(String buf, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_get_sub_addrs((const struct sock*)$arg1, $arg2)")
    public static void mptcp_get_sub_addrs(Ptr<runtime.sock> sk, Ptr<mptcp_subflow_addrs> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_get_subflow_data(Ptr<mptcp_subflow_data> sfd, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_getsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, Ptr<Integer> option) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_getsockopt_full_info(Ptr<mptcp_sock> msk, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_getsockopt_sol_tcp(Ptr<mptcp_sock> msk, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_getsockopt_subflow_addrs(Ptr<mptcp_sock> msk, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_getsockopt_tcpinfo(Ptr<mptcp_sock> msk, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_info2sockaddr((const struct mptcp_addr_info*)$arg1, $arg2, $arg3)")
    public static void mptcp_info2sockaddr(Ptr<mptcp_addr_info> info2, Ptr<KernelDefinitions.__kernel_sockaddr_storage> addr2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_init_sched(Ptr<mptcp_sock> msk, Ptr<mptcp_sched_ops> sched) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_add_addr_echoed($arg1, (const struct mptcp_addr_info*)$arg2)")
    public static void mptcp_pm_add_addr_echoed(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_add_addr_received((const struct sock*)$arg1, (const struct mptcp_addr_info*)$arg2)")
    public static void mptcp_pm_add_addr_received(Ptr<runtime.sock> ssk, Ptr<mptcp_addr_info> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_add_addr_send_ack(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_add_addr_signal($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static boolean mptcp_pm_add_addr_signal(Ptr<mptcp_sock> msk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int opt_size, @Unsigned int remaining, Ptr<mptcp_addr_info> addr2, Ptr<@OriginalName(value="bool") Boolean> echo2, Ptr<@OriginalName(value="bool") Boolean> drop_other_suboptions) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_addr_families_match((const struct sock*)$arg1, (const struct mptcp_addr_info*)$arg2, (const struct mptcp_addr_info*)$arg3)")
    public static boolean mptcp_pm_addr_families_match(Ptr<runtime.sock> sk, Ptr<mptcp_addr_info> loc, Ptr<mptcp_addr_info> rem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_pm_allow_new_subflow(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_announce_addr($arg1, (const struct mptcp_addr_info*)$arg2, $arg3)")
    public static int mptcp_pm_announce_addr(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> addr2, boolean echo2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_connection_closed(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_data_init(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_data_reset(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_dump_addr(Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_fully_established($arg1, (const struct sock*)$arg2)")
    public static void mptcp_pm_fully_established(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_get_addr(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_get_local_id(Ptr<mptcp_sock> msk, Ptr<SockDefinitions.sock_common> skc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_pm_is_backup(Ptr<mptcp_sock> msk, Ptr<SockDefinitions.sock_common> skc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_mp_fail_received(Ptr<runtime.sock> sk, @Unsigned long fail_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_mp_prio_received(Ptr<runtime.sock> ssk, char bkup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_new_connection($arg1, (const struct sock*)$arg2, $arg3)")
    public static void mptcp_pm_new_connection(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk, int server_side) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_remove_addr($arg1, (const struct mptcp_rm_list*)$arg2)")
    public static int mptcp_pm_remove_addr(Ptr<mptcp_sock> msk, Ptr<mptcp_rm_list> rm_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_rm_addr_received($arg1, (const struct mptcp_rm_list*)$arg2)")
    public static void mptcp_pm_rm_addr_received(Ptr<mptcp_sock> msk, Ptr<mptcp_rm_list> rm_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_pm_rm_addr_signal(Ptr<mptcp_sock> msk, @Unsigned int remaining, Ptr<mptcp_rm_list> rm_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_pm_schedule_work(Ptr<mptcp_sock> msk, mptcp_pm_status new_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_set_flags(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_subflow_check_next($arg1, (const struct mptcp_subflow_context*)$arg2)")
    public static void mptcp_pm_subflow_check_next(Ptr<mptcp_sock> msk, Ptr<mptcp_subflow_context> subflow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_subflow_chk_stale((const struct mptcp_sock*)$arg1, $arg2)")
    public static void mptcp_pm_subflow_chk_stale(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_subflow_established(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_propagate_state($arg1, $arg2, $arg3, (const struct mptcp_options_received*)$arg4)")
    public static void mptcp_propagate_state(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk, Ptr<mptcp_subflow_context> subflow, Ptr<mptcp_options_received> mp_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_put_subflow_data(Ptr<mptcp_subflow_data> sfd, String optval, @Unsigned int copied, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_register_scheduler(Ptr<mptcp_sched_ops> sched) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_release_sched(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_sched_default_get_subflow(Ptr<mptcp_sock> msk, Ptr<mptcp_sched_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_sched_find((const u8*)$arg1)")
    public static Ptr<mptcp_sched_ops> mptcp_sched_find(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_sched_get_retrans(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_sched_get_send(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_sched_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_set_rcvlowat(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_setsockopt_sol_ip_set(Ptr<mptcp_sock> msk, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_setsockopt_sol_socket(Ptr<mptcp_sock> msk, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_setsockopt_sol_socket_int(Ptr<mptcp_sock> msk, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_setsockopt_sol_socket_linger(Ptr<mptcp_sock> msk, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_setsockopt_sol_tcp(Ptr<mptcp_sock> msk, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_setsockopt_sol_tcp_congestion(Ptr<mptcp_sock> msk, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_setsockopt_v6(Ptr<mptcp_sock> msk, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_sockopt_sync_locked(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_sol_socket_sync_intval(Ptr<mptcp_sock> msk, int optname, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_space((const struct sock*)$arg1, $arg2, $arg3)")
    public static void mptcp_space(Ptr<runtime.sock> ssk, Ptr<Integer> space, Ptr<Integer> full_space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_subflow_create_socket(Ptr<runtime.sock> sk, @Unsigned short family, Ptr<Ptr<runtime.socket>> new_sock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_subflow_data_available(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_subflow_drop_ctx(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_subflow_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_subflow_init_cookie_req($arg1, (const struct sock*)$arg2, $arg3)")
    public static int mptcp_subflow_init_cookie_req(Ptr<RequestDefinitions.request_sock> req2, Ptr<runtime.sock> sk_listener, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_subflow_queue_clean(Ptr<runtime.sock> listener_sk, Ptr<runtime.sock> listener_ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_subflow_reqsk_alloc((const struct request_sock_ops*)$arg1, $arg2, $arg3)")
    public static Ptr<RequestDefinitions.request_sock> mptcp_subflow_reqsk_alloc(Ptr<RequestDefinitions.request_sock_ops> ops, Ptr<runtime.sock> sk_listener, boolean attach_listener) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_subflow_reset(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_subflow_set_scheduled(Ptr<mptcp_subflow_context> subflow, boolean scheduled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_supported_sockopt(int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_unregister_scheduler(Ptr<mptcp_sched_ops> sched) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mptcp_pm_send_ack(Ptr<mptcp_sock> msk, Ptr<mptcp_subflow_context> subflow, boolean prio, boolean backup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_addresses_equal((const struct mptcp_addr_info*)$arg1, (const struct mptcp_addr_info*)$arg2, $arg3)")
    public static boolean mptcp_addresses_equal(Ptr<mptcp_addr_info> a, Ptr<mptcp_addr_info> b, boolean use_port) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_diag_subflow_init(Ptr<TcpDefinitions.tcp_ulp_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_event($arg1, (const struct mptcp_sock*)$arg2, (const struct sock*)$arg3, $arg4)")
    public static void mptcp_event(mptcp_event_type type2, Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_event_add_subflow($arg1, (const struct sock*)$arg2)")
    public static int mptcp_event_add_subflow(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_event_addr_announced((const struct sock*)$arg1, (const struct mptcp_addr_info*)$arg2)")
    public static void mptcp_event_addr_announced(Ptr<runtime.sock> ssk, Ptr<mptcp_addr_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_event_addr_removed((const struct mptcp_sock*)$arg1, $arg2)")
    public static void mptcp_event_addr_removed(Ptr<mptcp_sock> msk, @OriginalName(value="uint8_t") char id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_event_pm_listener((const struct sock*)$arg1, $arg2)")
    public static void mptcp_event_pm_listener(Ptr<runtime.sock> ssk, mptcp_event_type event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_event_put_token_and_ssk($arg1, (const struct mptcp_sock*)$arg2, (const struct sock*)$arg3)")
    public static int mptcp_event_put_token_and_ssk(Ptr<SkDefinitions.sk_buff> skb, Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_local_address((const struct sock_common*)$arg1, $arg2)")
    public static void mptcp_local_address(Ptr<SockDefinitions.sock_common> skc, Ptr<mptcp_addr_info> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_lookup_anno_list_by_saddr((const struct mptcp_sock*)$arg1, (const struct mptcp_addr_info*)$arg2)")
    public static Ptr<mptcp_pm_add_entry> mptcp_lookup_anno_list_by_saddr(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_nl_fill_addr(Ptr<SkDefinitions.sk_buff> skb, Ptr<mptcp_pm_addr_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_nl_mcast_send(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> nlskb, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_nl_remove_id_zero_address(Ptr<runtime.net> net2, Ptr<mptcp_addr_info> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_nl_remove_subflow_and_signal_addr($arg1, (const struct mptcp_pm_addr_entry*)$arg2)")
    public static int mptcp_nl_remove_subflow_and_signal_addr(Ptr<runtime.net> net2, Ptr<mptcp_pm_addr_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_add_timer(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_alloc_anno_list($arg1, (const struct mptcp_addr_info*)$arg2)")
    public static boolean mptcp_pm_alloc_anno_list(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_create_subflow_or_signal_addr(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_del_add_timer($arg1, (const struct mptcp_addr_info*)$arg2, $arg3)")
    public static Ptr<mptcp_pm_add_entry> mptcp_pm_del_add_timer(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> addr2, boolean check_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_flush_addrs_and_subflows(Ptr<mptcp_sock> msk, Ptr<ListDefinitions.list_head> rm_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_free_anno_list(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_get_add_addr_accept_max((const struct mptcp_sock*)$arg1)")
    public static @Unsigned int mptcp_pm_get_add_addr_accept_max(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_get_add_addr_signal_max((const struct mptcp_sock*)$arg1)")
    public static @Unsigned int mptcp_pm_get_add_addr_signal_max(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_get_local_addr_max((const struct mptcp_sock*)$arg1)")
    public static @Unsigned int mptcp_pm_get_local_addr_max(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_get_subflows_max((const struct mptcp_sock*)$arg1)")
    public static @Unsigned int mptcp_pm_get_subflows_max(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_has_addr_attr_id((const struct nlattr*)$arg1, $arg2)")
    public static boolean mptcp_pm_has_addr_attr_id(Ptr<runtime.nlattr> attr2, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_add_addr_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_nl_add_addr_received(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_nl_addr_send_ack(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_append_new_local_addr(Ptr<PmDefinitions.pm_nl_pernet> pernet, Ptr<mptcp_pm_addr_entry> entry, boolean needs_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_pm_nl_check_work_pending(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_create_listen_socket(Ptr<runtime.sock> sk, Ptr<mptcp_pm_addr_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_del_addr_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_dump_addr(Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_flush_addrs_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_get_addr(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_get_addr_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_get_addr_dumpit(Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_get_limits_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_get_local_id(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> skc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_nl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_pm_nl_is_backup(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> skc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_nl_is_init_remote_addr($arg1, (const struct mptcp_addr_info*)$arg2)")
    public static boolean mptcp_pm_nl_is_init_remote_addr(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> remote) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_mp_prio_send_ack(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> addr2, Ptr<mptcp_addr_info> rem, char bkup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_nl_rm_addr_or_subflow($arg1, (const struct mptcp_rm_list*)$arg2, $arg3)")
    public static void mptcp_pm_nl_rm_addr_or_subflow(Ptr<mptcp_sock> msk, Ptr<mptcp_rm_list> rm_list, LinuxDefinitions.linux_mptcp_mib_field rm_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_set_flags(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_set_flags_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_nl_set_limits_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_nl_subflow_chk_stale((const struct mptcp_sock*)$arg1, $arg2)")
    public static void mptcp_pm_nl_subflow_chk_stale(Ptr<mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_nl_work(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_parse_addr(Ptr<runtime.nlattr> attr2, Ptr<GenlDefinitions.genl_info> info2, Ptr<mptcp_addr_info> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_pm_parse_entry(Ptr<runtime.nlattr> attr2, Ptr<GenlDefinitions.genl_info> info2, boolean require_family, Ptr<mptcp_pm_addr_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_parse_pm_addr_attr($arg1, (const struct nlattr*)$arg2, $arg3, $arg4, $arg5)")
    public static int mptcp_pm_parse_pm_addr_attr(Ptr<Ptr<runtime.nlattr>> tb, Ptr<runtime.nlattr> attr2, Ptr<GenlDefinitions.genl_info> info2, Ptr<mptcp_addr_info> addr2, boolean require_family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_pm_remove_addrs(Ptr<mptcp_sock> msk, Ptr<ListDefinitions.list_head> rm_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_remove_anno_addr($arg1, (const struct mptcp_addr_info*)$arg2, $arg3)")
    public static boolean mptcp_pm_remove_anno_addr(Ptr<mptcp_sock> msk, Ptr<mptcp_addr_info> addr2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_pm_sport_in_anno_list($arg1, (const struct sock*)$arg2)")
    public static boolean mptcp_pm_sport_in_anno_list(Ptr<mptcp_sock> msk, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_token_accept(Ptr<mptcp_subflow_request_sock> req2, Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_token_destroy(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_token_destroy_request(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mptcp_token_exists(@Unsigned int token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mptcp_sock> mptcp_token_get_sock(Ptr<runtime.net> net2, @Unsigned int token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mptcp_token_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_token_iter_next((const struct net*)$arg1, $arg2, $arg3)")
    public static Ptr<mptcp_sock> mptcp_token_iter_next(Ptr<runtime.net> net2, Ptr<Long> s_slot, Ptr<Long> s_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_token_new_connect(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mptcp_token_new_request(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mptcp_userspace_pm_active((const struct mptcp_sock*)$arg1)")
    public static boolean mptcp_userspace_pm_active(Ptr<mptcp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_full_info")
    @NotUsableInJava
    public static class mptcp_full_info
    extends Struct {
        public @Unsigned int size_tcpinfo_kernel;
        public @Unsigned int size_tcpinfo_user;
        public @Unsigned int size_sfinfo_kernel;
        public @Unsigned int size_sfinfo_user;
        public @Unsigned int num_subflows;
        public @Unsigned int size_arrays_user;
        public @Unsigned long subflow_info;
        public @Unsigned long tcp_info;
        public mptcp_info mptcp_info;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_subflow_info")
    @NotUsableInJava
    public static class mptcp_subflow_info
    extends Struct {
        public @Unsigned int id;
        public mptcp_subflow_addrs addrs;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_subflow_addrs")
    @NotUsableInJava
    public static class mptcp_subflow_addrs
    extends Struct {
        @InlineUnion(value=96567)
        public @InlineUnion(value=96567) @Unsigned @OriginalName(value="__kernel_sa_family_t") short sa_family;
        @InlineUnion(value=96567)
        public  @InlineUnion(value=96567) runtime.sockaddr sa_local;
        @InlineUnion(value=96567)
        public @InlineUnion(value=96567) misc.sockaddr_in sin_local;
        @InlineUnion(value=96567)
        public @InlineUnion(value=96567) misc.sockaddr_in6 sin6_local;
        @InlineUnion(value=96567)
        public @InlineUnion(value=96567) KernelDefinitions.__kernel_sockaddr_storage ss_local;
        @InlineUnion(value=96568)
        public  @InlineUnion(value=96568) runtime.sockaddr sa_remote;
        @InlineUnion(value=96568)
        public @InlineUnion(value=96568) misc.sockaddr_in sin_remote;
        @InlineUnion(value=96568)
        public @InlineUnion(value=96568) misc.sockaddr_in6 sin6_remote;
        @InlineUnion(value=96568)
        public @InlineUnion(value=96568) KernelDefinitions.__kernel_sockaddr_storage ss_remote;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_subflow_data")
    @NotUsableInJava
    public static class mptcp_subflow_data
    extends Struct {
        public @Unsigned int size_subflow_data;
        public @Unsigned int num_subflows;
        public @Unsigned int size_kernel;
        public @Unsigned int size_user;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_info")
    @NotUsableInJava
    public static class mptcp_info
    extends Struct {
        public char mptcpi_subflows;
        public char mptcpi_add_addr_signal;
        public char mptcpi_add_addr_accepted;
        public char mptcpi_subflows_max;
        public char mptcpi_add_addr_signal_max;
        public char mptcpi_add_addr_accepted_max;
        public @Unsigned int mptcpi_flags;
        public @Unsigned int mptcpi_token;
        public @Unsigned long mptcpi_write_seq;
        public @Unsigned long mptcpi_snd_una;
        public @Unsigned long mptcpi_rcv_nxt;
        public char mptcpi_local_addr_used;
        public char mptcpi_local_addr_max;
        public char mptcpi_csum_enabled;
        public @Unsigned int mptcpi_retransmits;
        public @Unsigned long mptcpi_bytes_retrans;
        public @Unsigned long mptcpi_bytes_sent;
        public @Unsigned long mptcpi_bytes_received;
        public @Unsigned long mptcpi_bytes_acked;
        public char mptcpi_subflows_total;
        public char @Size(value=3) [] reserved;
        public @Unsigned int mptcpi_last_data_sent;
        public @Unsigned int mptcpi_last_data_recv;
        public @Unsigned int mptcpi_last_ack_recv;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_pernet")
    @NotUsableInJava
    public static class mptcp_pernet
    extends Struct {
        public Ptr<misc.ctl_table_header> ctl_table_hdr;
        public @Unsigned int add_addr_timeout;
        public @Unsigned int blackhole_timeout;
        public @Unsigned int close_timeout;
        public @Unsigned int stale_loss_cnt;
        public AtomicDefinitions.atomic_t active_disable_times;
        public @Unsigned long active_disable_stamp;
        public char mptcp_enabled;
        public char checksum_enabled;
        public char allow_join_initial_addr_port;
        public char pm_type;
        public char @Size(value=16) [] scheduler;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_out_options")
    @NotUsableInJava
    public static class mptcp_out_options
    extends Struct {
        public @Unsigned short suboptions;
        public mptcp_rm_list rm_list;
        public char join_id;
        public char backup;
        public char reset_reason;
        public char reset_transient;
        public char csum_reqd;
        public char allow_join_id0;
        @InlineUnion(value=66377)
        public  @InlineUnion(value=66377) AnonDefinitions.anon_member_of_anon_member_of_mptcp_out_options anon8$0;
        @InlineUnion(value=66377)
        public  @InlineUnion(value=66377) AnonDefinitions.anon_member_of_anon_member_of_mptcp_out_options anon8$1;
        @InlineUnion(value=66377)
        public  @InlineUnion(value=66377) AnonDefinitions.anon_member_of_anon_member_of_mptcp_out_options anon8$2;
        @InlineUnion(value=66377)
        public  @InlineUnion(value=66377) AnonDefinitions.anon_member_of_anon_member_of_mptcp_out_options anon8$3;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_sendmsg_info")
    @NotUsableInJava
    public static class mptcp_sendmsg_info
    extends Struct {
        public int mss_now;
        public int size_goal;
        public @Unsigned short limit;
        public @Unsigned short sent;
        public @Unsigned int flags;
        public boolean data_lock_held;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_delegated_action")
    @NotUsableInJava
    public static class mptcp_delegated_action
    extends Struct {
        public NapiDefinitions.napi_struct napi;
        public ListDefinitions.list_head head;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_options_received")
    @NotUsableInJava
    public static class mptcp_options_received
    extends Struct {
        public @Unsigned long sndr_key;
        public @Unsigned long rcvr_key;
        public @Unsigned long data_ack;
        public @Unsigned long data_seq;
        public @Unsigned int subflow_seq;
        public @Unsigned short data_len;
        public @Unsigned @OriginalName(value="__sum16") short csum;
        public @Unsigned short suboptions;
        public @Unsigned int token;
        public @Unsigned int nonce;
        public @Unsigned short use_map;
        public @Unsigned short dsn64;
        public @Unsigned short data_fin;
        public @Unsigned short use_ack;
        public @Unsigned short ack64;
        public @Unsigned short mpc_map;
        public @Unsigned short reset_reason;
        public @Unsigned short reset_transient;
        public @Unsigned short echo;
        public @Unsigned short backup;
        public @Unsigned short deny_join_id0;
        public @Unsigned short __unused;
        public char join_id;
        public @Unsigned long thmac;
        public char @Size(value=20) [] hmac;
        public mptcp_addr_info addr;
        public mptcp_rm_list rm_list;
        public @Unsigned long ahmac;
        public @Unsigned long fail_seq;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_skb_cb")
    @NotUsableInJava
    public static class mptcp_skb_cb
    extends Struct {
        public @Unsigned long map_seq;
        public @Unsigned long end_seq;
        public @Unsigned int offset;
        public char has_rxtstamp;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_ext")
    @NotUsableInJava
    public static class mptcp_ext
    extends Struct {
        @InlineUnion(value=34422)
        public @InlineUnion(value=34422) @Unsigned long data_ack;
        @InlineUnion(value=34422)
        public @InlineUnion(value=34422) @Unsigned int data_ack32;
        public @Unsigned long data_seq;
        public @Unsigned int subflow_seq;
        public @Unsigned short data_len;
        public @Unsigned @OriginalName(value="__sum16") short csum;
        public char use_map;
        public char dsn64;
        public char data_fin;
        public char use_ack;
        public char ack64;
        public char mpc_map;
        public char frozen;
        public char reset_transient;
        public char reset_reason;
        public char csum_reqd;
        public char infinite_map;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_pm_add_entry")
    @NotUsableInJava
    public static class mptcp_pm_add_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public mptcp_addr_info addr;
        public char retrans_times;
        public TimerDefinitions.timer_list add_timer;
        public Ptr<mptcp_sock> sock;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_pm_addr_entry")
    @NotUsableInJava
    public static class mptcp_pm_addr_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public mptcp_addr_info addr;
        public char flags;
        public int ifindex;
        public Ptr<runtime.socket> lsk;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_pm_local")
    @NotUsableInJava
    public static class mptcp_pm_local
    extends Struct {
        public mptcp_addr_info addr;
        public char flags;
        public int ifindex;
    }

    @Type(noCCodeGeneration=true, cType="enum mptcp_addr_signal_status")
    public static enum mptcp_addr_signal_status implements Enum<mptcp_addr_signal_status>,
    TypedEnum<mptcp_addr_signal_status, Integer>
    {
        MPTCP_ADD_ADDR_SIGNAL,
        MPTCP_ADD_ADDR_ECHO,
        MPTCP_RM_ADDR_SIGNAL;

    }

    @Type(noCCodeGeneration=true, cType="enum mptcp_pm_type")
    public static enum mptcp_pm_type implements Enum<mptcp_pm_type>,
    TypedEnum<mptcp_pm_type, Integer>
    {
        MPTCP_PM_TYPE_KERNEL,
        MPTCP_PM_TYPE_USERSPACE,
        __MPTCP_PM_TYPE_NR,
        __MPTCP_PM_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum mptcp_pm_status")
    public static enum mptcp_pm_status implements Enum<mptcp_pm_status>,
    TypedEnum<mptcp_pm_status, Integer>
    {
        MPTCP_PM_ADD_ADDR_RECEIVED,
        MPTCP_PM_ADD_ADDR_SEND_ACK,
        MPTCP_PM_RM_ADDR_RECEIVED,
        MPTCP_PM_ESTABLISHED,
        MPTCP_PM_SUBFLOW_ESTABLISHED,
        MPTCP_PM_ALREADY_ESTABLISHED,
        MPTCP_PM_MPC_ENDPOINT_ACCOUNTED;

    }

    @Type(noCCodeGeneration=true, cType="enum mptcp_event_attr")
    public static enum mptcp_event_attr implements Enum<mptcp_event_attr>,
    TypedEnum<mptcp_event_attr, Integer>
    {
        MPTCP_ATTR_UNSPEC,
        MPTCP_ATTR_TOKEN,
        MPTCP_ATTR_FAMILY,
        MPTCP_ATTR_LOC_ID,
        MPTCP_ATTR_REM_ID,
        MPTCP_ATTR_SADDR4,
        MPTCP_ATTR_SADDR6,
        MPTCP_ATTR_DADDR4,
        MPTCP_ATTR_DADDR6,
        MPTCP_ATTR_SPORT,
        MPTCP_ATTR_DPORT,
        MPTCP_ATTR_BACKUP,
        MPTCP_ATTR_ERROR,
        MPTCP_ATTR_FLAGS,
        MPTCP_ATTR_TIMEOUT,
        MPTCP_ATTR_IF_IDX,
        MPTCP_ATTR_RESET_REASON,
        MPTCP_ATTR_RESET_FLAGS,
        MPTCP_ATTR_SERVER_SIDE,
        __MPTCP_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum mptcp_event_type")
    public static enum mptcp_event_type implements Enum<mptcp_event_type>,
    TypedEnum<mptcp_event_type, Integer>
    {
        MPTCP_EVENT_UNSPEC,
        MPTCP_EVENT_CREATED,
        MPTCP_EVENT_ESTABLISHED,
        MPTCP_EVENT_CLOSED,
        MPTCP_EVENT_ANNOUNCED,
        MPTCP_EVENT_REMOVED,
        MPTCP_EVENT_SUB_ESTABLISHED,
        MPTCP_EVENT_SUB_CLOSED,
        MPTCP_EVENT_SUB_PRIORITY,
        MPTCP_EVENT_LISTENER_CREATED,
        MPTCP_EVENT_LISTENER_CLOSED;

    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_mib")
    @NotUsableInJava
    public static class mptcp_mib
    extends Struct {
        public @Unsigned long @Size(value=71) [] mibs;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_subflow_request_sock")
    @NotUsableInJava
    public static class mptcp_subflow_request_sock
    extends Struct {
        public TcpDefinitions.tcp_request_sock sk;
        public @Unsigned short mp_capable;
        public @Unsigned short mp_join;
        public @Unsigned short backup;
        public @Unsigned short request_bkup;
        public @Unsigned short csum_reqd;
        public @Unsigned short allow_join_id0;
        public char local_id;
        public char remote_id;
        public @Unsigned long local_key;
        public @Unsigned long idsn;
        public @Unsigned int token;
        public @Unsigned int ssn_offset;
        public @Unsigned long thmac;
        public @Unsigned int local_nonce;
        public @Unsigned int remote_nonce;
        public Ptr<mptcp_sock> msk;
        public misc.hlist_nulls_node token_node;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_data_frag")
    @NotUsableInJava
    public static class mptcp_data_frag
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long data_seq;
        public @Unsigned short data_len;
        public @Unsigned short offset;
        public @Unsigned short overhead;
        public @Unsigned short already_sent;
        public Ptr<runtime.page> page;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_pm_data")
    @NotUsableInJava
    public static class mptcp_pm_data
    extends Struct {
        public mptcp_addr_info local;
        public mptcp_addr_info remote;
        public ListDefinitions.list_head anno_list;
        public ListDefinitions.list_head userspace_pm_local_addr_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public char addr_signal;
        public boolean server_side;
        public boolean work_pending;
        public boolean accept_addr;
        public boolean accept_subflow;
        public boolean remote_deny_join_id0;
        public char add_addr_signaled;
        public char add_addr_accepted;
        public char local_addr_used;
        public char pm_type;
        public char subflows;
        public char status;
        public @Unsigned long @Size(value=4) [] id_avail_bitmap;
        public mptcp_rm_list rm_list_tx;
        public mptcp_rm_list rm_list_rx;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_sock")
    @NotUsableInJava
    public static class mptcp_sock
    extends Struct {
        public InetDefinitions.inet_connection_sock sk;
        public @Unsigned long local_key;
        public @Unsigned long remote_key;
        public @Unsigned long write_seq;
        public @Unsigned long bytes_sent;
        public @Unsigned long snd_nxt;
        public @Unsigned long bytes_received;
        public @Unsigned long ack_seq;
        public misc.atomic64_t rcv_wnd_sent;
        public @Unsigned long rcv_data_fin_seq;
        public @Unsigned long bytes_retrans;
        public @Unsigned long bytes_consumed;
        public int rmem_fwd_alloc;
        public int snd_burst;
        public int old_wspace;
        public @Unsigned long recovery_snd_nxt;
        public @Unsigned long bytes_acked;
        public @Unsigned long snd_una;
        public @Unsigned long wnd_end;
        public @Unsigned int last_data_sent;
        public @Unsigned int last_data_recv;
        public @Unsigned int last_ack_recv;
        public @Unsigned long timer_ival;
        public @Unsigned int token;
        public int rmem_released;
        public @Unsigned long flags;
        public @Unsigned long cb_flags;
        public boolean recovery;
        public boolean can_ack;
        public boolean fully_established;
        public boolean rcv_data_fin;
        public boolean snd_data_fin_enable;
        public boolean rcv_fastclose;
        public boolean use_64bit_ack;
        public boolean csum_enabled;
        public boolean allow_infinite_fallback;
        public char pending_state;
        public char mpc_endpoint_id;
        public char recvmsg_inq;
        public char cork;
        public char nodelay;
        public char fastopening;
        public char in_accept_queue;
        public char free_first;
        public char rcvspace_init;
        public @Unsigned int notsent_lowat;
        public int keepalive_cnt;
        public int keepalive_idle;
        public int keepalive_intvl;
        public misc.work_struct work;
        public Ptr<SkDefinitions.sk_buff> ooo_last_skb;
        public RbDefinitions.rb_root out_of_order_queue;
        public SkDefinitions.sk_buff_head receive_queue;
        public ListDefinitions.list_head conn_list;
        public ListDefinitions.list_head rtx_queue;
        public Ptr<mptcp_data_frag> first_pending;
        public ListDefinitions.list_head join_list;
        public Ptr<runtime.sock> first;
        public mptcp_pm_data pm;
        public Ptr<mptcp_sched_ops> sched;
        public misc.rcvq_space_of_mptcp_sock rcvq_space;
        public char scaling_ratio;
        public @Unsigned int subflow_id;
        public @Unsigned int setsockopt_seq;
        public char @Size(value=16) [] ca_name;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_sched_ops")
    @NotUsableInJava
    public static class mptcp_sched_ops
    extends Struct {
        public Ptr<?> get_subflow;
        public char @Size(value=16) [] name;
        public Ptr<runtime.module> owner;
        public ListDefinitions.list_head list;
        public Ptr<?> init;
        public Ptr<?> release;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_subflow_context")
    @NotUsableInJava
    public static class mptcp_subflow_context
    extends Struct {
        public ListDefinitions.list_head node;
        @InlineUnion(value=27115)
        public  @InlineUnion(value=27115) AnonDefinitions.anon_member_of_anon_member_of_mptcp_subflow_context_and_reset_of_anon_member_of_mptcp_subflow_context anon1$0;
        @InlineUnion(value=27115)
        public  @InlineUnion(value=27115) AnonDefinitions.anon_member_of_anon_member_of_mptcp_subflow_context_and_reset_of_anon_member_of_mptcp_subflow_context reset;
        public ListDefinitions.list_head delegated_node;
        public @Unsigned int setsockopt_seq;
        public @Unsigned int stale_rcv_tstamp;
        public int cached_sndbuf;
        public Ptr<runtime.sock> tcp_sock;
        public Ptr<runtime.sock> conn;
        public Ptr<InetDefinitions.inet_connection_sock_af_ops> icsk_af_ops;
        public Ptr<?> tcp_state_change;
        public Ptr<?> tcp_error_report;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_sched_data")
    @NotUsableInJava
    public static class mptcp_sched_data
    extends Struct {
        public boolean reinject;
        public char subflows;
        public Ptr<mptcp_subflow_context> @Size(value=8) [] contexts;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_addr_info")
    @NotUsableInJava
    public static class mptcp_addr_info
    extends Struct {
        public char id;
        public @Unsigned @OriginalName(value="sa_family_t") short family;
        public @Unsigned @OriginalName(value="__be16") short port;
        @InlineUnion(value=27094)
        public  @InlineUnion(value=27094) InDefinitions.in_addr addr;
        @InlineUnion(value=27094)
        public  @InlineUnion(value=27094) In6Definitions.in6_addr addr6;
    }

    @Type(noCCodeGeneration=true, cType="struct mptcp_rm_list")
    @NotUsableInJava
    public static class mptcp_rm_list
    extends Struct {
        public char @Size(value=8) [] ids;
        public char nr;
    }
}

