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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TcpDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SubflowDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __subflow_push_pending(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk, Ptr<MptcpDefinitions.mptcp_sendmsg_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_init_req_cookie_join_save((const struct mptcp_subflow_request_sock*)$arg1, $arg2)")
    public static void subflow_init_req_cookie_join_save(Ptr<MptcpDefinitions.mptcp_subflow_request_sock> subflow_req, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_add_reset_reason(Ptr<SkDefinitions.sk_buff> skb, char reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean subflow_check_data_avail(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_check_req($arg1, (const struct sock*)$arg2, $arg3)")
    public static int subflow_check_req(Ptr<RequestDefinitions.request_sock> req2, Ptr<runtime.sock> sk_listener, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MptcpDefinitions.mptcp_subflow_context> subflow_create_ctx(Ptr<runtime.sock> sk, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_data_ready(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_error_report(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_finish_connect($arg1, (const struct sk_buff*)$arg2)")
    public static void subflow_finish_connect(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int subflow_ops_init(Ptr<RequestDefinitions.request_sock_ops> subflow_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int subflow_rebuild_header(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_req_destructor(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_sched_work_if_closed(Ptr<MptcpDefinitions.mptcp_sock> msk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_state_change(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_syn_recv_sock((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<runtime.sock> subflow_syn_recv_sock(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2, Ptr<DstDefinitions.dst_entry> dst, Ptr<RequestDefinitions.request_sock> req_unhash, Ptr<@OriginalName(value="bool") Boolean> own_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_ulp_clone((const struct request_sock*)$arg1, $arg2, (const unsigned int)$arg3)")
    public static void subflow_ulp_clone(Ptr<RequestDefinitions.request_sock> req2, Ptr<runtime.sock> newsk, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int subflow_ulp_init(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_ulp_release(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int subflow_v4_conn_request(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_v4_req_destructor(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_v4_route_req((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<DstDefinitions.dst_entry> subflow_v4_route_req(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl, Ptr<RequestDefinitions.request_sock> req2, @Unsigned int tw_isn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_v4_send_synack((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int subflow_v4_send_synack(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.flowi> fl, Ptr<RequestDefinitions.request_sock> req2, Ptr<TcpDefinitions.tcp_fastopen_cookie> foc, TcpDefinitions.tcp_synack_type synack_type, Ptr<SkDefinitions.sk_buff> syn_skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int subflow_v6_conn_request(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int subflow_v6_rebuild_header(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_v6_req_destructor(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_v6_route_req((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<DstDefinitions.dst_entry> subflow_v6_route_req(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl, Ptr<RequestDefinitions.request_sock> req2, @Unsigned int tw_isn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_v6_send_synack((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int subflow_v6_send_synack(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.flowi> fl, Ptr<RequestDefinitions.request_sock> req2, Ptr<TcpDefinitions.tcp_fastopen_cookie> foc, TcpDefinitions.tcp_synack_type synack_type, Ptr<SkDefinitions.sk_buff> syn_skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void subflow_write_space(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int subflow_get_info(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="subflow_get_info_size((const struct sock*)$arg1)")
    public static @Unsigned long subflow_get_info_size(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct subflow_send_info")
    @NotUsableInJava
    public static class subflow_send_info
    extends Struct {
        public Ptr<runtime.sock> ssk;
        public @Unsigned long linger_time;
    }
}

