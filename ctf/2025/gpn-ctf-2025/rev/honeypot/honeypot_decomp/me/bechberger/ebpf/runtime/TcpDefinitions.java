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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.ReadDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SavedDefinitions;
import me.bechberger.ebpf.runtime.ScmDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.TaskletDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TypeDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class TcpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcp_cleanup_rbuf(Ptr<runtime.sock> sk, int copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcp_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__tcp_md5_do_add($arg1, (const union tcp_ao_addr*)$arg2, $arg3, $arg4, $arg5, $arg6, (const u8*)$arg7, $arg8, $arg9)")
    public static int __tcp_md5_do_add(Ptr<runtime.sock> sk, Ptr<tcp_ao_addr> addr2, int family, char prefixlen, int l3index, char flags, Ptr<Character> newkey, char newkeylen, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__tcp_md5_do_lookup((const struct sock*)$arg1, $arg2, (const union tcp_ao_addr*)$arg3, $arg4, $arg5)")
    public static Ptr<tcp_md5sig_key> __tcp_md5_do_lookup(Ptr<runtime.sock> sk, int l3index, Ptr<tcp_ao_addr> addr2, int family, boolean any_l3index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcp_sock_set_cork(Ptr<runtime.sock> sk, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcp_sock_set_nodelay(Ptr<runtime.sock> sk, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcp_sock_set_quickack(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcp_v4_send_check(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be32") int daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_abort(Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_add_backlog(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<SkbDefinitions.skb_drop_reason> reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_bpf_bypass_getsockopt(int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_check_oom((const struct sock*)$arg1, $arg2)")
    public static boolean tcp_check_oom(Ptr<runtime.sock> sk, int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_cleanup_rbuf(Ptr<runtime.sock> sk, int copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_cleanup_ulp(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_clear_md5_list(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_clock_ts(boolean usec_ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_disconnect(Ptr<runtime.sock> sk, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_done(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_downgrade_zcopy_pure(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_enter_memory_pressure(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_filter(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_free_fastopen_req(Ptr<tcp_sock> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_get_available_ulp(String buf, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tcp_get_idx(Ptr<SeqDefinitions.seq_file> seq, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_get_info(Ptr<runtime.sock> sk, Ptr<tcp_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_get_info_chrono_stats((const struct tcp_sock*)$arg1, $arg2)")
    public static void tcp_get_info_chrono_stats(Ptr<tcp_sock> tp, Ptr<tcp_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_get_timestamping_opt_stats((const struct sock*)$arg1, (const struct sk_buff*)$arg2, (const struct sk_buff*)$arg3)")
    public static Ptr<SkDefinitions.sk_buff> tcp_get_timestamping_opt_stats(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> orig_skb, Ptr<SkDefinitions.sk_buff> ack_skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_getsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_inbound_hash($arg1, (const struct request_sock*)$arg2, (const struct sk_buff*)$arg3, (const void*)$arg4, (const void*)$arg5, $arg6, $arg7, $arg8)")
    public static SkbDefinitions.skb_drop_reason tcp_inbound_hash(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> saddr, Ptr<?> daddr, int family, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_init_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_inq_hint(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ioctl(Ptr<runtime.sock> sk, int cmd, Ptr<Integer> karg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_ld_RTO_revert(Ptr<runtime.sock> sk, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_leave_memory_pressure(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_mark_push(Ptr<tcp_sock> tp, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_md5_add_sigpool() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_md5_alloc_sigpool() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_md5_do_add($arg1, (const union tcp_ao_addr*)$arg2, $arg3, $arg4, $arg5, $arg6, (const u8*)$arg7, $arg8)")
    public static int tcp_md5_do_add(Ptr<runtime.sock> sk, Ptr<tcp_ao_addr> addr2, int family, char prefixlen, int l3index, char flags, Ptr<Character> newkey, char newkeylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_md5_do_del($arg1, (const union tcp_ao_addr*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int tcp_md5_do_del(Ptr<runtime.sock> sk, Ptr<tcp_ao_addr> addr2, int family, char prefixlen, int l3index, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_md5_do_lookup_exact((const struct sock*)$arg1, (const union tcp_ao_addr*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<tcp_md5sig_key> tcp_md5_do_lookup_exact(Ptr<runtime.sock> sk, Ptr<tcp_ao_addr> addr2, int family, char prefixlen, int l3index, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_md5_hash_key($arg1, (const struct tcp_md5sig_key*)$arg2)")
    public static int tcp_md5_hash_key(Ptr<tcp_sigpool> hp, Ptr<tcp_md5sig_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_md5_key_copy($arg1, (const union tcp_ao_addr*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int tcp_md5_key_copy(Ptr<runtime.sock> sk, Ptr<tcp_ao_addr> addr2, int family, char prefixlen, int l3index, Ptr<tcp_md5sig_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_md5_release_sigpool() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_md5sig_info_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_mmap(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_orphan_count_sum() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_orphan_update(Ptr<TimerDefinitions.timer_list> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_peek_len(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int tcp_poll(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_push(Ptr<runtime.sock> sk, int flags, int mss_now, int nonagle, int size_goal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_read_done(Ptr<runtime.sock> sk, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_read_skb(Ptr<runtime.sock> sk, @OriginalName(value="skb_read_actor_t") Ptr<?> recv_actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_read_sock(Ptr<runtime.sock> sk, Ptr<ReadDefinitions.read_descriptor_t> desc, @OriginalName(value="sk_read_actor_t") Ptr<?> recv_actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp_recv_skb(Ptr<runtime.sock> sk, @Unsigned int seq, Ptr<@Unsigned Integer> off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_recv_timestamp($arg1, (const struct sock*)$arg2, $arg3)")
    public static void tcp_recv_timestamp(Ptr<runtime.msghdr> msg, Ptr<runtime.sock> sk, Ptr<ScmDefinitions.scm_timestamping_internal> tss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_recvmsg_dmabuf($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4, $arg5)")
    public static int tcp_recvmsg_dmabuf(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int offset, Ptr<runtime.msghdr> msg, int remaining_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_recvmsg_locked(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<ScmDefinitions.scm_timestamping_internal> tss, Ptr<Integer> cmsg_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_register_ulp(Ptr<tcp_ulp_ops> ulp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_remove_empty_skb(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_repair_options_est(Ptr<runtime.sock> sk, misc.sockptr_t optbuf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_req_err(Ptr<runtime.sock> sk, @Unsigned int seq, boolean abort) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tcp_seek_last_pos(Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_send_mss(Ptr<runtime.sock> sk, Ptr<Integer> size_goal, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sendmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sendmsg_fastopen(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<Integer> copied, @Unsigned long size, Ptr<misc.ubuf_info> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sendmsg_locked(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tcp_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tcp_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_set_rcvlowat(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_set_state(Ptr<runtime.sock> sk, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_set_ulp($arg1, (const u8*)$arg2)")
    public static int tcp_set_ulp(Ptr<runtime.sock> sk, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_set_window_clamp(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_shutdown(Ptr<runtime.sock> sk, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sk_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sk_exit_batch(Ptr<ListDefinitions.list_head> net_exit_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sk_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_skb_entail(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sock_set_cork(Ptr<runtime.sock> sk, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sock_set_keepcnt(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sock_set_keepidle(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sock_set_keepidle_locked(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sock_set_keepintvl(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sock_set_nodelay(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sock_set_quickack(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sock_set_syncnt(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sock_set_user_timeout(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_splice_data_recv(Ptr<ReadDefinitions.read_descriptor_t> rd_desc, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int offset, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_splice_eof(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tcp_splice_read(Ptr<runtime.socket> sock2, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp_stream_alloc_skb(Ptr<runtime.sock> sk, @Unsigned @OriginalName(value="gfp_t") int gfp, boolean force_schedule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_stream_memory_free((const struct sock*)$arg1, $arg2)")
    public static boolean tcp_stream_memory_free(Ptr<runtime.sock> sk, int wake) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_twsk_unique(Ptr<runtime.sock> sk, Ptr<runtime.sock> sktw, Ptr<?> twp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_unregister_ulp(Ptr<tcp_ulp_ops> ulp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_update_recv_tstamps(Ptr<SkDefinitions.sk_buff> skb, Ptr<ScmDefinitions.scm_timestamping_internal> tss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_update_ulp($arg1, $arg2, (void (*)(struct sock*))$arg3)")
    public static void tcp_update_ulp(Ptr<runtime.sock> sk, Ptr<runtime.proto> proto2, Ptr<?> write_space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_ao_sign_reset((const struct sock*)$arg1, $arg2, (const struct tcp_ao_hdr*)$arg3, $arg4, $arg5, $arg6)")
    public static boolean tcp_v4_ao_sign_reset(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcp_ao_hdr> aoh, Ptr<IpDefinitions.ip_reply_arg> arg2, Ptr<runtime.tcphdr> reply, Ptr<@Unsigned @OriginalName(value="__be32") Integer> reply_options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_conn_request(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v4_destroy_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_do_rcv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_early_demux(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_err(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_fill_cb($arg1, (const struct iphdr*)$arg2, (const struct tcphdr*)$arg3)")
    public static void tcp_v4_fill_cb(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.iphdr> iph, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short tcp_v4_get_syncookie(Ptr<runtime.sock> sk, Ptr<runtime.iphdr> iph, Ptr<runtime.tcphdr> th, Ptr<@Unsigned Integer> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v4_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_init_seq((const struct sk_buff*)$arg1)")
    public static @Unsigned int tcp_v4_init_seq(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_init_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_init_ts_off((const struct net*)$arg1, (const struct sk_buff*)$arg2)")
    public static @Unsigned int tcp_v4_init_ts_off(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_md5_hash_hdr($arg1, (const struct tcp_md5sig_key*)$arg2, $arg3, $arg4, (const struct tcphdr*)$arg5)")
    public static int tcp_v4_md5_hash_hdr(String md5_hash, Ptr<tcp_md5sig_key> key2, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int saddr, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_md5_hash_headers($arg1, $arg2, $arg3, (const struct tcphdr*)$arg4, $arg5)")
    public static int tcp_v4_md5_hash_headers(Ptr<tcp_sigpool> hp, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int saddr, Ptr<runtime.tcphdr> th, int nbytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_md5_hash_skb($arg1, (const struct tcp_md5sig_key*)$arg2, (const struct sock*)$arg3, (const struct sk_buff*)$arg4)")
    public static int tcp_v4_md5_hash_skb(String md5_hash, Ptr<tcp_md5sig_key> key2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_md5_lookup((const struct sock*)$arg1, (const struct sock*)$arg2)")
    public static Ptr<tcp_md5sig_key> tcp_v4_md5_lookup(Ptr<runtime.sock> sk, Ptr<runtime.sock> addr_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v4_mtu_reduced(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_parse_md5_keys(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_pre_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v4_reqsk_destructor(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_reqsk_send_ack((const struct sock*)$arg1, $arg2, $arg3)")
    public static void tcp_v4_reqsk_send_ack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v4_restore_cb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_route_req((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<DstDefinitions.dst_entry> tcp_v4_route_req(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl, Ptr<RequestDefinitions.request_sock> req2, @Unsigned int tw_isn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_send_ack((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11, $arg12)")
    public static void tcp_v4_send_ack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int seq, @Unsigned int ack, @Unsigned int win, @Unsigned int tsval, @Unsigned int tsecr, int oif, Ptr<tcp_key> key2, int reply_flags, char tos, @Unsigned int txhash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v4_send_check(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_send_reset((const struct sock*)$arg1, $arg2, $arg3)")
    public static void tcp_v4_send_reset(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, SkDefinitions.sk_rst_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_send_synack((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int tcp_v4_send_synack(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.flowi> fl, Ptr<RequestDefinitions.request_sock> req2, Ptr<tcp_fastopen_cookie> foc, tcp_synack_type synack_type, Ptr<SkDefinitions.sk_buff> syn_skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_syn_recv_sock((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<runtime.sock> tcp_v4_syn_recv_sock(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2, Ptr<DstDefinitions.dst_entry> dst, Ptr<RequestDefinitions.request_sock> req_unhash, Ptr<@OriginalName(value="bool") Boolean> own_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v4_timewait_ack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_ao_calc_key($arg1, $arg2, (const struct in6_addr*)$arg3, (const struct in6_addr*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int tcp_v6_ao_calc_key(Ptr<tcp_ao_key> mkt, Ptr<Character> key2, Ptr<In6Definitions.in6_addr> saddr, Ptr<In6Definitions.in6_addr> daddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be16") short dport, @Unsigned @OriginalName(value="__be32") int sisn, @Unsigned @OriginalName(value="__be32") int disn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_ao_calc_key_rsk(Ptr<tcp_ao_key> mkt, Ptr<Character> key2, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_ao_calc_key_sk($arg1, $arg2, (const struct sock*)$arg3, $arg4, $arg5, $arg6)")
    public static int tcp_v6_ao_calc_key_sk(Ptr<tcp_ao_key> mkt, Ptr<Character> key2, Ptr<runtime.sock> sk, @Unsigned @OriginalName(value="__be32") int sisn, @Unsigned @OriginalName(value="__be32") int disn, boolean send2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_ao_calc_key_skb($arg1, $arg2, (const struct sk_buff*)$arg3, $arg4, $arg5)")
    public static int tcp_v6_ao_calc_key_skb(Ptr<tcp_ao_key> mkt, Ptr<Character> key2, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int sisn, @Unsigned @OriginalName(value="__be32") int disn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_ao_hash_pseudoheader($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static int tcp_v6_ao_hash_pseudoheader(Ptr<tcp_sigpool> hp, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr, int nbytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_ao_hash_skb($arg1, $arg2, (const struct sock*)$arg3, (const struct sk_buff*)$arg4, (const u8*)$arg5, $arg6, $arg7)")
    public static int tcp_v6_ao_hash_skb(String ao_hash, Ptr<tcp_ao_key> key2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<Character> tkey, int hash_offset, @Unsigned int sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_ao_lookup((const struct sock*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<tcp_ao_key> tcp_v6_ao_lookup(Ptr<runtime.sock> sk, Ptr<runtime.sock> addr_sk, int sndid, int rcvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_ao_lookup_rsk((const struct sock*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<tcp_ao_key> tcp_v6_ao_lookup_rsk(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, int sndid, int rcvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_ao_synack_hash($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4, $arg5, $arg6)")
    public static int tcp_v6_ao_synack_hash(String ao_hash, Ptr<tcp_ao_key> ao_key, Ptr<RequestDefinitions.request_sock> req2, Ptr<SkDefinitions.sk_buff> skb, int hash_offset, @Unsigned int sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_conn_request(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_do_rcv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v6_early_demux(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_err(Ptr<SkDefinitions.sk_buff> skb, Ptr<Inet6Definitions.inet6_skb_parm> opt, char type2, char code2, int offset, @Unsigned @OriginalName(value="__be32") int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_fill_cb($arg1, (const struct ipv6hdr*)$arg2, (const struct tcphdr*)$arg3)")
    public static void tcp_v6_fill_cb(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.ipv6hdr> hdr, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short tcp_v6_get_syncookie(Ptr<runtime.sock> sk, Ptr<runtime.ipv6hdr> iph, Ptr<runtime.tcphdr> th, Ptr<@Unsigned Integer> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_init_seq((const struct sk_buff*)$arg1)")
    public static @Unsigned int tcp_v6_init_seq(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_init_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_init_ts_off((const struct net*)$arg1, (const struct sk_buff*)$arg2)")
    public static @Unsigned int tcp_v6_init_ts_off(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_md5_hash_skb($arg1, (const struct tcp_md5sig_key*)$arg2, (const struct sock*)$arg3, (const struct sk_buff*)$arg4)")
    public static int tcp_v6_md5_hash_skb(String md5_hash, Ptr<tcp_md5sig_key> key2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_md5_lookup((const struct sock*)$arg1, (const struct sock*)$arg2)")
    public static Ptr<tcp_md5sig_key> tcp_v6_md5_lookup(Ptr<runtime.sock> sk, Ptr<runtime.sock> addr_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v6_mtu_reduced(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_parse_ao(Ptr<runtime.sock> sk, int cmd, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_parse_md5_keys(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_pre_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v6_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v6_reqsk_destructor(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_reqsk_send_ack((const struct sock*)$arg1, $arg2, $arg3)")
    public static void tcp_v6_reqsk_send_ack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v6_restore_cb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_route_req((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<DstDefinitions.dst_entry> tcp_v6_route_req(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl, Ptr<RequestDefinitions.request_sock> req2, @Unsigned int tw_isn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v6_send_check(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_send_reset((const struct sock*)$arg1, $arg2, $arg3)")
    public static void tcp_v6_send_reset(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, SkDefinitions.sk_rst_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_send_response((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11, $arg12, $arg13, $arg14)")
    public static void tcp_v6_send_response(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int seq, @Unsigned int ack, @Unsigned int win, @Unsigned int tsval, @Unsigned int tsecr, int oif, int rst, char tclass, @Unsigned @OriginalName(value="__be32") int label, @Unsigned int priority, @Unsigned int txhash, Ptr<tcp_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_send_synack((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int tcp_v6_send_synack(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.flowi> fl, Ptr<RequestDefinitions.request_sock> req2, Ptr<tcp_fastopen_cookie> foc, tcp_synack_type synack_type, Ptr<SkDefinitions.sk_buff> syn_skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v6_syn_recv_sock((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<runtime.sock> tcp_v6_syn_recv_sock(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2, Ptr<DstDefinitions.dst_entry> dst, Ptr<RequestDefinitions.request_sock> req_unhash, Ptr<@OriginalName(value="bool") Boolean> own_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_v6_timewait_ack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_wmem_schedule(Ptr<runtime.sock> sk, int copy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_write_queue_purge(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_xa_pool_commit_locked(Ptr<runtime.sock> sk, Ptr<tcp_xa_pool> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_zerocopy_vm_insert_batch(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<Ptr<runtime.page>> pages, @Unsigned int pages_to_map, Ptr<@Unsigned Long> address, Ptr<@Unsigned Integer> length, Ptr<@Unsigned Integer> seq, Ptr<tcp_zerocopy_receive> zc, @Unsigned int total_bytes_to_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__tcp_ao_do_lookup((const struct sock*)$arg1, $arg2, (const union tcp_ao_addr*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static Ptr<tcp_ao_key> __tcp_ao_do_lookup(Ptr<runtime.sock> sk, int l3index, Ptr<tcp_ao_addr> addr2, int family, char prefix, int sndid, int rcvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__tcp_ao_key_cmp((const struct tcp_ao_key*)$arg1, $arg2, (const union tcp_ao_addr*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int __tcp_ao_key_cmp(Ptr<tcp_ao_key> key2, int l3index, Ptr<tcp_ao_addr> addr2, char prefixlen, int family, int sndid, int rcvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcp_push_pending_frames(Ptr<runtime.sock> sk, @Unsigned int cur_mss, int nonagle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tcp_retransmit_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __tcp_select_window(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcp_send_ack(Ptr<runtime.sock> sk, @Unsigned int rcv_nxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tcp_transmit_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int clone_it, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int rcv_nxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_adjust_pcount($arg1, (const struct sk_buff*)$arg2, $arg3)")
    public static void tcp_adjust_pcount(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int decr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_add_cmd(Ptr<runtime.sock> sk, @Unsigned short family, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcp_ao_info> tcp_ao_alloc_info(@Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_cache_traffic_keys((const struct sock*)$arg1, $arg2, $arg3)")
    public static int tcp_ao_cache_traffic_keys(Ptr<runtime.sock> sk, Ptr<tcp_ao_info> ao, Ptr<tcp_ao_key> ao_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_calc_key_skb($arg1, $arg2, (const struct sk_buff*)$arg3, $arg4, $arg5, $arg6)")
    public static int tcp_ao_calc_key_skb(Ptr<tcp_ao_key> mkt, Ptr<Character> key2, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int sisn, @Unsigned @OriginalName(value="__be32") int disn, int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_calc_traffic_key(Ptr<tcp_ao_key> mkt, Ptr<Character> key2, Ptr<?> ctx, @Unsigned int len, Ptr<tcp_sigpool> hp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_ao_compute_sne(@Unsigned int next_sne, @Unsigned int next_seq, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_ao_connect_init(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_copy_all_matching((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int tcp_ao_copy_all_matching(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk, Ptr<RequestDefinitions.request_sock> req2, Ptr<SkDefinitions.sk_buff> skb, int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_copy_mkts_to_user(Ptr<tcp_ao_info> ao_info, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_del_cmd(Ptr<runtime.sock> sk, @Unsigned short family, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_ao_destroy_sock(Ptr<runtime.sock> sk, boolean twsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_do_lookup((const struct sock*)$arg1, $arg2, (const union tcp_ao_addr*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<tcp_ao_key> tcp_ao_do_lookup(Ptr<runtime.sock> sk, int l3index, Ptr<tcp_ao_addr> addr2, int family, int sndid, int rcvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_ao_established(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcp_ao_key> tcp_ao_established_key(Ptr<tcp_ao_info> ao, int sndid, int rcvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_ao_finish_connect(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_get_mkts(Ptr<runtime.sock> sk, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_get_repair(Ptr<runtime.sock> sk, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_get_sock_info(Ptr<runtime.sock> sk, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_hash_hdr($arg1, $arg2, $arg3, (const u8*)$arg4, (const union tcp_ao_addr*)$arg5, (const union tcp_ao_addr*)$arg6, (const struct tcphdr*)$arg7, $arg8)")
    public static int tcp_ao_hash_hdr(@Unsigned short family, String ao_hash, Ptr<tcp_ao_key> key2, Ptr<Character> tkey, Ptr<tcp_ao_addr> daddr, Ptr<tcp_ao_addr> saddr, Ptr<runtime.tcphdr> th, @Unsigned int sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_hash_skb($arg1, $arg2, $arg3, (const struct sock*)$arg4, (const struct sk_buff*)$arg5, (const u8*)$arg6, $arg7, $arg8)")
    public static int tcp_ao_hash_skb(@Unsigned short family, String ao_hash, Ptr<tcp_ao_key> key2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<Character> tkey, int hash_offset, @Unsigned int sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_ignore_icmp((const struct sock*)$arg1, $arg2, $arg3, $arg4)")
    public static boolean tcp_ao_ignore_icmp(Ptr<runtime.sock> sk, int family, int type2, int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_inbound_lookup($arg1, (const struct sock*)$arg2, (const struct sk_buff*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<tcp_ao_key> tcp_ao_inbound_lookup(@Unsigned short family, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int sndid, int rcvid, int l3index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_ao_info_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_key_cmp((const struct tcp_ao_key*)$arg1, $arg2, (const union tcp_ao_addr*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int tcp_ao_key_cmp(Ptr<tcp_ao_key> key2, int l3index, Ptr<tcp_ao_addr> addr2, char prefixlen, int family, int sndid, int rcvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_ao_key_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_parse_crypto(Ptr<tcp_ao_add> cmd, Ptr<tcp_ao_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_prepare_reset((const struct sock*)$arg1, $arg2, (const struct tcp_ao_hdr*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10)")
    public static int tcp_ao_prepare_reset(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcp_ao_hdr> aoh, int l3index, @Unsigned int seq, Ptr<Ptr<tcp_ao_key>> key2, Ptr<String> traffic_key, Ptr<@OriginalName(value="bool") Boolean> allocated_traffic_key, Ptr<Character> keyid, Ptr<@Unsigned Integer> sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_set_repair(Ptr<runtime.sock> sk, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_syncookie($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4)")
    public static void tcp_ao_syncookie(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_ao_time_wait(Ptr<tcp_timewait_sock> tcptw, Ptr<tcp_sock> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_transmit_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcp_ao_key> key2, Ptr<runtime.tcphdr> th, Ptr<Character> hash_location) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ao_verify_hash((const struct sock*)$arg1, (const struct sk_buff*)$arg2, $arg3, $arg4, (const struct tcp_ao_hdr*)$arg5, $arg6, $arg7, $arg8, $arg9, $arg10)")
    public static SkbDefinitions.skb_drop_reason tcp_ao_verify_hash(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<tcp_ao_info> info2, Ptr<tcp_ao_hdr> aoh, Ptr<tcp_ao_key> key2, Ptr<Character> traffic_key, Ptr<Character> phash, @Unsigned int sne, int l3index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_ao_verify_ipv6(Ptr<runtime.sock> sk, Ptr<tcp_ao_add> cmd, Ptr<Ptr<tcp_ao_addr>> paddr, Ptr<@Unsigned Short> family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_assign_congestion_control(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ca_find((const u8*)$arg1)")
    public static Ptr<tcp_congestion_ops> tcp_ca_find(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ca_find_autoload((const u8*)$arg1)")
    public static Ptr<tcp_congestion_ops> tcp_ca_find_autoload(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcp_congestion_ops> tcp_ca_find_key(@Unsigned int key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ca_get_key_by_name((const u8*)$arg1, $arg2)")
    public static @Unsigned int tcp_ca_get_key_by_name(String name, Ptr<@OriginalName(value="bool") Boolean> ecn_ca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String tcp_ca_get_name_by_key(@Unsigned int key2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_chrono_start($arg1, (const enum tcp_chrono)$arg2)")
    public static void tcp_chrono_start(Ptr<runtime.sock> sk, tcp_chrono type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_chrono_stop($arg1, (const enum tcp_chrono)$arg2)")
    public static void tcp_chrono_stop(Ptr<runtime.sock> sk, tcp_chrono type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_cleanup_congestion_control(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_clone_payload(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> to, int probe_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_cong_avoid_ai(Ptr<tcp_sock> tp, @Unsigned int w, @Unsigned int acked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_congestion_default() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_connect(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_connect_init(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_connect_queue_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_current_mss(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_cwnd_restart(Ptr<runtime.sock> sk, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_cwnd_validate(Ptr<runtime.sock> sk, boolean is_cwnd_limited) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_delack_max((const struct sock*)$arg1)")
    public static @Unsigned int tcp_delack_max(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_established_options(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcp_out_options> opts, Ptr<tcp_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_event_new_data_sent(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_fragment(Ptr<runtime.sock> sk, tcp_queue tcp_queue2, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len, @Unsigned int mss_now, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fragment_tstamp(Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff> skb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_get_allowed_congestion_control(String buf, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_get_available_congestion_control(String buf, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> tcp_get_cookie_sock(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_get_default_congestion_control(Ptr<runtime.net> net2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_inbound_ao_hash($arg1, (const struct sk_buff*)$arg2, $arg3, (const struct request_sock*)$arg4, $arg5, (const struct tcp_ao_hdr*)$arg6)")
    public static SkbDefinitions.skb_drop_reason tcp_inbound_ao_hash(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<RequestDefinitions.request_sock> req2, int l3index, Ptr<tcp_ao_hdr> aoh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_init_congestion_control(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_init_tso_segs(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mss_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_make_synack((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<SkDefinitions.sk_buff> tcp_make_synack(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst, Ptr<RequestDefinitions.request_sock> req2, Ptr<tcp_fastopen_cookie> foc, tcp_synack_type synack_type, Ptr<SkDefinitions.sk_buff> syn_skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_mss_to_mtu(Ptr<runtime.sock> sk, int mss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_mstamp_refresh(Ptr<tcp_sock> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_mtu_probe(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_mtu_to_mss(Ptr<runtime.sock> sk, int pmtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_mtup_init(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_newreno_mark_lost(Ptr<runtime.sock> sk, boolean snd_una_advanced) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_options_write($arg1, $arg2, (const struct tcp_request_sock*)$arg3, $arg4, $arg5)")
    public static void tcp_options_write(Ptr<runtime.tcphdr> th, Ptr<tcp_sock> tp, Ptr<tcp_request_sock> tcprsk, Ptr<tcp_out_options> opts, Ptr<tcp_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart tcp_pace_kick(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_parse_ao(Ptr<runtime.sock> sk, int cmd, @Unsigned short family, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_push_one(Ptr<runtime.sock> sk, @Unsigned int mss_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rack_advance(Ptr<tcp_sock> tp, char sacked, @Unsigned int end_seq, @Unsigned long xmit_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rack_detect_loss(Ptr<runtime.sock> sk, Ptr<@Unsigned Integer> reo_timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_rack_mark_lost(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rack_reo_timeout(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_rack_skb_timeout(Ptr<tcp_sock> tp, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int reo_wnd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rack_update_reo_wnd(Ptr<runtime.sock> sk, Ptr<misc.rate_sample> rs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_register_congestion_control(Ptr<tcp_congestion_ops> ca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_release_cb(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_reno_cong_avoid(Ptr<runtime.sock> sk, @Unsigned int ack, @Unsigned int acked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_reno_ssthresh(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_reno_undo_cwnd(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_retrans_try_collapse(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> to, int space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_retransmit_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_rtx_synack((const struct sock*)$arg1, $arg2)")
    public static int tcp_rtx_synack(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_schedule_loss_probe(Ptr<runtime.sock> sk, boolean advancing_rto) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_select_initial_window((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void tcp_select_initial_window(Ptr<runtime.sock> sk, int __space, @Unsigned int mss, Ptr<@Unsigned Integer> rcv_wnd, Ptr<@Unsigned Integer> __window_clamp, int wscale_ok, Ptr<Character> rcv_wscale, @Unsigned int init_rcv_wnd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_send_ack(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_send_active_reset(Ptr<runtime.sock> sk, @Unsigned @OriginalName(value="gfp_t") int priority, SkDefinitions.sk_rst_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_send_delayed_ack(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_send_fin(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_send_loss_probe(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_send_probe0(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_send_syn_data(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> syn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_send_synack(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_send_window_probe(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_set_allowed_congestion_control(String val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_set_ca_state($arg1, (const u8)$arg2)")
    public static void tcp_set_ca_state(Ptr<runtime.sock> sk, char ca_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_set_congestion_control($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int tcp_set_congestion_control(Ptr<runtime.sock> sk, String name, boolean load, boolean cap_net_admin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_set_default_congestion_control($arg1, (const u8*)$arg2)")
    public static int tcp_set_default_congestion_control(Ptr<runtime.net> net2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tcp_sigpool_algo(@Unsigned int id, String buf, @Unsigned long buf_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_sigpool_alloc_ahash((const u8*)$arg1, $arg2)")
    public static int tcp_sigpool_alloc_ahash(String alg, @Unsigned long scratch_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sigpool_end(Ptr<tcp_sigpool> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sigpool_get(@Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_sigpool_hash_skb_data($arg1, (const struct sk_buff*)$arg2, $arg3)")
    public static int tcp_sigpool_hash_skb_data(Ptr<tcp_sigpool> hp, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int header_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sigpool_release(@Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_sigpool_start(@Unsigned int id, Ptr<tcp_sigpool> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_skb_can_collapse((const struct sk_buff*)$arg1, (const struct sk_buff*)$arg2)")
    public static boolean tcp_skb_can_collapse(Ptr<SkDefinitions.sk_buff> to, Ptr<SkDefinitions.sk_buff> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_skb_collapse_tstamp($arg1, (const struct sk_buff*)$arg2)")
    public static void tcp_skb_collapse_tstamp(Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff> next_skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_slow_start(Ptr<tcp_sock> tp, @Unsigned int acked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_syn_options(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcp_out_options> opts, Ptr<tcp_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_synack_options((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, (const struct tcp_key*)$arg6, $arg7, $arg8, $arg9)")
    public static @Unsigned int tcp_synack_options(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, @Unsigned int mss, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcp_out_options> opts, Ptr<tcp_key> key2, Ptr<tcp_fastopen_cookie> foc, tcp_synack_type synack_type, Ptr<SkDefinitions.sk_buff> syn_skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_sync_mss(Ptr<runtime.sock> sk, @Unsigned int pmtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_tasklet_func(Ptr<TaskletDefinitions.tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_tasklet_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_trim_head(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_tso_segs(Ptr<runtime.sock> sk, @Unsigned int mss_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_tsq_handler(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_tsq_write(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_unregister_congestion_control(Ptr<tcp_congestion_ops> ca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_update_congestion_control(Ptr<tcp_congestion_ops> ca, Ptr<tcp_congestion_ops> old_ca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_update_skb_after_send(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned long prior_wstamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_ao_calc_key(Ptr<tcp_ao_key> mkt, Ptr<Character> key2, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be16") short dport, @Unsigned @OriginalName(value="__be32") int sisn, @Unsigned @OriginalName(value="__be32") int disn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_ao_calc_key_rsk(Ptr<tcp_ao_key> mkt, Ptr<Character> key2, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_ao_calc_key_sk($arg1, $arg2, (const struct sock*)$arg3, $arg4, $arg5, $arg6)")
    public static int tcp_v4_ao_calc_key_sk(Ptr<tcp_ao_key> mkt, Ptr<Character> key2, Ptr<runtime.sock> sk, @Unsigned @OriginalName(value="__be32") int sisn, @Unsigned @OriginalName(value="__be32") int disn, boolean send2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_ao_hash_skb($arg1, $arg2, (const struct sock*)$arg3, (const struct sk_buff*)$arg4, (const u8*)$arg5, $arg6, $arg7)")
    public static int tcp_v4_ao_hash_skb(String ao_hash, Ptr<tcp_ao_key> key2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<Character> tkey, int hash_offset, @Unsigned int sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_ao_lookup((const struct sock*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<tcp_ao_key> tcp_v4_ao_lookup(Ptr<runtime.sock> sk, Ptr<runtime.sock> addr_sk, int sndid, int rcvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_ao_lookup_rsk((const struct sock*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<tcp_ao_key> tcp_v4_ao_lookup_rsk(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, int sndid, int rcvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_v4_ao_synack_hash($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4, $arg5, $arg6)")
    public static int tcp_v4_ao_synack_hash(String ao_hash, Ptr<tcp_ao_key> ao_key, Ptr<RequestDefinitions.request_sock> req2, Ptr<SkDefinitions.sk_buff> skb, int hash_offset, @Unsigned int sne) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_v4_parse_ao(Ptr<runtime.sock> sk, int cmd, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_validate_congestion_control(Ptr<tcp_congestion_ops> ca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_wfree(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_write_wakeup(Ptr<runtime.sock> sk, int mib) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_write_xmit(Ptr<runtime.sock> sk, @Unsigned int mss_now, int nonagle, int push_one, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_xmit_probe_skb(Ptr<runtime.sock> sk, int urgent, int mib) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_xmit_retransmit_queue(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tcp_ack_snd_check(Ptr<runtime.sock> sk, int ofo_possible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__tcp_ecn_check_ce($arg1, (const struct sk_buff*)$arg2)")
    public static void __tcp_ecn_check_ce(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_abort_override(Ptr<runtime.sock> ssk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ack($arg1, (const struct sk_buff*)$arg2, $arg3)")
    public static int tcp_ack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ack_tstamp($arg1, $arg2, (const struct sk_buff*)$arg3, $arg4)")
    public static void tcp_ack_tstamp(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff> ack_skb, @Unsigned int prior_snd_una) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ack_update_rtt($arg1, (const int)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static boolean tcp_ack_update_rtt(Ptr<runtime.sock> sk, int flag, long seq_rtt_us, long sack_rtt_us, long ca_rtt_us, Ptr<misc.rate_sample> rs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_add_reno_sack(Ptr<runtime.sock> sk, int num_dupack, boolean ece_ack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_bpf_clone((const struct sock*)$arg1, $arg2)")
    public static void tcp_bpf_clone(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_bpf_push(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_msg> msg, @Unsigned int apply_bytes, int flags, boolean uncharge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_bpf_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_bpf_recvmsg_parser(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_bpf_send_verdict(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_psock> psock, Ptr<SkDefinitions.sk_msg> msg, Ptr<Integer> copied, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_bpf_sendmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_bpf_sendmsg_redir(Ptr<runtime.sock> sk, boolean ingress, Ptr<SkDefinitions.sk_msg> msg, @Unsigned int bytes, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_bpf_update_proto(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_psock> psock, boolean restore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_bpf_v4_build_proto() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_ca_openreq_child($arg1, (const struct dst_entry*)$arg2)")
    public static void tcp_ca_openreq_child(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_check_dsack($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static boolean tcp_check_dsack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> ack_skb, Ptr<tcp_sack_block_wire> sp, int num_sacks, @Unsigned int prior_snd_una, Ptr<tcp_sacktag_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> tcp_check_req(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2, boolean fastopen, Ptr<@OriginalName(value="bool") Boolean> req_stolen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_check_sack_reordering($arg1, (const unsigned int)$arg2, (const int)$arg3)")
    public static void tcp_check_sack_reordering(Ptr<runtime.sock> sk, @Unsigned int low_seq, int ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_check_space(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason tcp_child_process(Ptr<runtime.sock> parent, Ptr<runtime.sock> child, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_clean_rtx_queue($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int tcp_clean_rtx_queue(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> ack_skb, @Unsigned int prior_fack, @Unsigned int prior_snd_una, Ptr<tcp_sacktag_state> sack, boolean ece_ack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_clear_retrans(Ptr<tcp_sock> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_collapse(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff_head> list, Ptr<RbDefinitions.rb_root> root, Ptr<SkDefinitions.sk_buff> head, Ptr<SkDefinitions.sk_buff> tail, @Unsigned int start, @Unsigned int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp_collapse_one(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff_head> list, Ptr<RbDefinitions.rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_conn_request($arg1, (const struct tcp_request_sock_ops*)$arg2, $arg3, $arg4)")
    public static int tcp_conn_request(Ptr<RequestDefinitions.request_sock_ops> rsk_ops, Ptr<tcp_request_sock_ops> af_ops, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_create_openreq_child((const struct sock*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.sock> tcp_create_openreq_child(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_cwnd_reduction(Ptr<runtime.sock> sk, int newly_acked_sacked, int newly_lost, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_data_queue(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_data_queue_ofo(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_data_ready(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_do_parse_auth_options((const struct tcphdr*)$arg1, (const u8**)$arg2, (const u8**)$arg3)")
    public static int tcp_do_parse_auth_options(Ptr<runtime.tcphdr> th, Ptr<Ptr<Character>> md5_hash, Ptr<Ptr<Character>> ao_hash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_done_with_error(Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_dsack_extend(Ptr<runtime.sock> sk, @Unsigned int seq, @Unsigned int end_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_eat_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_enter_cwr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_enter_loss(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_enter_recovery(Ptr<runtime.sock> sk, boolean ece_ack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_event_data_recv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_active_detect_blackhole(Ptr<runtime.sock> sk, boolean expired) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_active_disable(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_active_disable_ofo_check(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_fastopen_active_should_disable(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_add_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_fastopen_cookie_check(Ptr<runtime.sock> sk, Ptr<@Unsigned Short> mss, Ptr<tcp_fastopen_cookie> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_fastopen_cookie_gen_check(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, Ptr<SkDefinitions.sk_buff> syn, Ptr<tcp_fastopen_cookie> orig, Ptr<tcp_fastopen_cookie> valid_foc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> tcp_fastopen_create_child(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_ctx_destroy(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_ctx_free(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_fastopen_defer_connect(Ptr<runtime.sock> sk, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_destroy_cipher(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_fastopen_get_cipher(Ptr<runtime.net> net2, Ptr<InetDefinitions.inet_connection_sock> icsk, Ptr<@Unsigned Long> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_init_key_once(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_fastopen_reset_cipher(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<?> primary_key, Ptr<?> backup_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_fastretrans_alert($arg1, (const unsigned int)$arg2, $arg3, $arg4, $arg5)")
    public static void tcp_fastretrans_alert(Ptr<runtime.sock> sk, @Unsigned int prior_snd_una, int num_dupack, Ptr<Integer> ack_flag, Ptr<Integer> rexmit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fin(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_finish_connect(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_get_syncookie_mss($arg1, (const struct tcp_request_sock_ops*)$arg2, $arg3, $arg4)")
    public static @Unsigned short tcp_get_syncookie_mss(Ptr<RequestDefinitions.request_sock_ops> rsk_ops, Ptr<tcp_request_sock_ops> af_ops, Ptr<runtime.sock> sk, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_grow_window($arg1, (const struct sk_buff*)$arg2, $arg3)")
    public static void tcp_grow_window(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, boolean adjust) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_identify_packet_loss(Ptr<runtime.sock> sk, Ptr<Integer> ack_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_init_cwnd((const struct tcp_sock*)$arg1, (const struct dst_entry*)$arg2)")
    public static @Unsigned int tcp_init_cwnd(Ptr<tcp_sock> tp, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_init_transfer(Ptr<runtime.sock> sk, int bpf_op, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_initialize_rcv_mss(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_is_ulp_esp(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_mark_head_lost(Ptr<runtime.sock> sk, int packets, int mark_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_mark_skb_lost(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_match_skb_to_sack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int start_seq, @Unsigned int end_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_md5_twsk_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_msg_wait_data(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_psock> psock, long timeo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tcp_newly_delivered(Ptr<runtime.sock> sk, @Unsigned int prior_delivered, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_non_congestion_loss_retransmit(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_ofo_queue(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_oow_rate_limited($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4)")
    public static boolean tcp_oow_rate_limited(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, int mib_idx, Ptr<@Unsigned Integer> last_oow_ack_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_openreq_init_rwin($arg1, (const struct sock*)$arg2, (const struct dst_entry*)$arg3)")
    public static void tcp_openreq_init_rwin(Ptr<RequestDefinitions.request_sock> req2, Ptr<runtime.sock> sk_listener, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_parse_fastopen_option($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static void tcp_parse_fastopen_option(int len, String cookie, boolean syn, Ptr<tcp_fastopen_cookie> foc, boolean exp_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_parse_mss_option((const struct tcphdr*)$arg1, $arg2)")
    public static @Unsigned short tcp_parse_mss_option(Ptr<runtime.tcphdr> th, @Unsigned short user_mss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_parse_options((const struct net*)$arg1, (const struct sk_buff*)$arg2, $arg3, $arg4, $arg5)")
    public static void tcp_parse_options(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcp_options_received> opt_rx, int estab, Ptr<tcp_fastopen_cookie> foc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_plb_check_rehash(Ptr<runtime.sock> sk, Ptr<tcp_plb_state> plb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_plb_update_state((const struct sock*)$arg1, $arg2, (const int)$arg3)")
    public static void tcp_plb_update_state(Ptr<runtime.sock> sk, Ptr<tcp_plb_state> plb, int cong_ratio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_plb_update_state_upon_rto(Ptr<runtime.sock> sk, Ptr<tcp_plb_state> plb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_process_tlp_ack(Ptr<runtime.sock> sk, @Unsigned int ack, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_prune_ofo_queue($arg1, (const struct sk_buff*)$arg2)")
    public static boolean tcp_prune_ofo_queue(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> in_skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_queue_rcv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<@OriginalName(value="bool") Boolean> fragstolen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rbtree_insert(Ptr<RbDefinitions.rb_root> root, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rcv_established(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_rcv_fastopen_synack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> synack, Ptr<tcp_fastopen_cookie> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rcv_sne_update(Ptr<tcp_sock> tp, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rcv_space_adjust(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_rcv_spurious_retrans($arg1, (const struct sk_buff*)$arg2)")
    public static void tcp_rcv_spurious_retrans(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason tcp_rcv_state_process(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rcv_synrecv_state_fastopen(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_rcv_synsent_state_process($arg1, $arg2, (const struct tcphdr*)$arg3)")
    public static int tcp_rcv_synsent_state_process(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rearm_rto(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_release_cb_override(Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_reqsk_record_syn((const struct sock*)$arg1, $arg2, (const struct sk_buff*)$arg3)")
    public static void tcp_reqsk_record_syn(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_reset(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rtt_estimator(Ptr<runtime.sock> sk, long mrtt_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sack_compress_send_ack(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sack_new_ofo_skb(Ptr<runtime.sock> sk, @Unsigned int seq, @Unsigned int end_seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char tcp_sacktag_one(Ptr<runtime.sock> sk, Ptr<tcp_sacktag_state> state2, char sacked, @Unsigned int start_seq, @Unsigned int end_seq, int dup_sack, int pcount, @Unsigned long xmit_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp_sacktag_walk(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk, Ptr<tcp_sack_block> next_dup, Ptr<tcp_sacktag_state> state2, @Unsigned int start_seq, @Unsigned int end_seq, boolean dup_sack_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_sacktag_write_queue($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4)")
    public static int tcp_sacktag_write_queue(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> ack_skb, @Unsigned int prior_snd_una, Ptr<tcp_sacktag_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_send_challenge_ack(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_send_dupack($arg1, (const struct sk_buff*)$arg2)")
    public static void tcp_send_dupack(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_send_rcvq(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp_shift_skb_data(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcp_sacktag_state> state2, @Unsigned int start_seq, @Unsigned int end_seq, boolean dup_sack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_shifted_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> prev, Ptr<SkDefinitions.sk_buff> skb, Ptr<tcp_sacktag_state> state2, @Unsigned int pcount, int shifted, int mss, boolean dup_sack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_simple_retransmit(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_skb_shift(Ptr<SkDefinitions.sk_buff> to, Ptr<SkDefinitions.sk_buff> from, int pcount, int shiftlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_sndbuf_expand(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_syn_flood_action($arg1, (const u8*)$arg2)")
    public static boolean tcp_syn_flood_action(Ptr<runtime.sock> sk, String proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_synack_rtt_meas(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_time_wait(Ptr<runtime.sock> sk, int state2, int timeo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_timewait_state_process($arg1, $arg2, (const struct tcphdr*)$arg3, $arg4)")
    public static tcp_tw_status tcp_timewait_state_process(Ptr<InetDefinitions.inet_timewait_sock> tw, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.tcphdr> th, Ptr<@Unsigned Integer> tw_isn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_try_coalesce(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> to, Ptr<SkDefinitions.sk_buff> from, Ptr<@OriginalName(value="bool") Boolean> fragstolen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_try_fastopen($arg1, $arg2, $arg3, $arg4, (const struct dst_entry*)$arg5)")
    public static Ptr<runtime.sock> tcp_try_fastopen(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2, Ptr<tcp_fastopen_cookie> foc, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_try_keep_open(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_try_rmem_schedule(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_try_to_open(Ptr<runtime.sock> sk, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_try_undo_loss(Ptr<runtime.sock> sk, boolean frto_undo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_try_undo_recovery(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_twsk_destructor(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_twsk_purge(Ptr<ListDefinitions.list_head> net_exit_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_undo_cwnd_reduction(Ptr<runtime.sock> sk, boolean unmark_loss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_update_pacing_rate(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_urg($arg1, $arg2, (const struct tcphdr*)$arg3)")
    public static void tcp_urg(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_validate_incoming($arg1, $arg2, (const struct tcphdr*)$arg3, $arg4)")
    public static boolean tcp_validate_incoming(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.tcphdr> th, int syn_inerr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_xmit_recovery(Ptr<runtime.sock> sk, int rexmit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__tcp_get_metrics((const struct inetpeer_addr*)$arg1, (const struct inetpeer_addr*)$arg2, $arg3, $arg4)")
    public static Ptr<tcp_metrics_block> __tcp_get_metrics(Ptr<misc.inetpeer_addr> saddr, Ptr<misc.inetpeer_addr> daddr, Ptr<runtime.net> net2, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_clamp_probe0_to_user_timeout((const struct sock*)$arg1, $arg2)")
    public static @Unsigned int tcp_clamp_probe0_to_user_timeout(Ptr<runtime.sock> sk, @Unsigned int when) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart tcp_compressed_ack_kick(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_delack_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_delack_timer_handler(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_cache_get(Ptr<runtime.sock> sk, Ptr<@Unsigned Short> mss, Ptr<tcp_fastopen_cookie> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_fastopen_cache_set(Ptr<runtime.sock> sk, @Unsigned short mss, Ptr<tcp_fastopen_cookie> cookie, boolean syn_lost, @Unsigned short try_exp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tcp_metrics_block> tcp_get_metrics(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst, boolean create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_gro_complete(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp_gro_lookup(Ptr<ListDefinitions.list_head> head, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.tcphdr> tcp_gro_pull_header(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp_gro_receive(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp_gso_segment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_init_metrics(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_init_xmit_timers(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_keepalive_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_metrics_fill_info(Ptr<SkDefinitions.sk_buff> msg, Ptr<tcp_metrics_block> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_metrics_flush_all(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_metrics_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_metrics_nl_cmd_del(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_metrics_nl_cmd_get(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_metrics_nl_dump(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_net_metrics_exit_batch(Ptr<ListDefinitions.list_head> net_exit_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_out_of_resources(Ptr<runtime.sock> sk, boolean do_reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tcp_peer_is_proven(Ptr<RequestDefinitions.request_sock> req2, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_probe_timer(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rate_check_app_limited(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rate_gen(Ptr<runtime.sock> sk, @Unsigned int delivered, @Unsigned int lost, boolean is_sack_reneg, Ptr<misc.rate_sample> rs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rate_skb_delivered(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.rate_sample> rs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_rate_skb_sent(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_retransmit_timer(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_set_keepalive(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcp_syn_ack_timeout((const struct request_sock*)$arg1)")
    public static void tcp_syn_ack_timeout(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_update_metrics(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp_write_timeout(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_write_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp_write_timer_handler(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_plb_state")
    @NotUsableInJava
    public static class tcp_plb_state
    extends Struct {
        public char consec_cong_rounds;
        public char unused;
        public @Unsigned int pause_until;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_sacktag_state")
    @NotUsableInJava
    public static class tcp_sacktag_state
    extends Struct {
        public @Unsigned long first_sackt;
        public @Unsigned long last_sackt;
        public @Unsigned int reord;
        public @Unsigned int sack_delivered;
        public int flag;
        public @Unsigned int mss_now;
        public Ptr<misc.rate_sample> rate;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_ca_ack_event_flags")
    public static enum tcp_ca_ack_event_flags implements Enum<tcp_ca_ack_event_flags>,
    TypedEnum<tcp_ca_ack_event_flags, Integer>
    {
        CA_ACK_SLOWPATH,
        CA_ACK_WIN_UPDATE,
        CA_ACK_ECE;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_sack_block_wire")
    @NotUsableInJava
    public static class tcp_sack_block_wire
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int start_seq;
        public @Unsigned @OriginalName(value="__be32") int end_seq;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_fastopen_client_fail")
    public static enum tcp_fastopen_client_fail implements Enum<tcp_fastopen_client_fail>,
    TypedEnum<tcp_fastopen_client_fail, Integer>
    {
        TFO_STATUS_UNSPEC,
        TFO_COOKIE_UNAVAILABLE,
        TFO_DATA_NOT_ACKED,
        TFO_SYN_RETRANSMITTED;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ao_repair")
    @NotUsableInJava
    public static class tcp_ao_repair
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int snt_isn;
        public @Unsigned @OriginalName(value="__be32") int rcv_isn;
        public @Unsigned int snd_sne;
        public @Unsigned int rcv_sne;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ao_getsockopt")
    @NotUsableInJava
    public static class tcp_ao_getsockopt
    extends Struct {
        public KernelDefinitions.__kernel_sockaddr_storage addr;
        public char @Size(value=64) [] alg_name;
        public char @Size(value=80) [] key;
        public @Unsigned int nkeys;
        public @Unsigned short is_current;
        public @Unsigned short is_rnext;
        public @Unsigned short get_all;
        public @Unsigned short reserved;
        public char sndid;
        public char rcvid;
        public char prefix;
        public char maclen;
        public char keyflags;
        public char keylen;
        public int ifindex;
        public @Unsigned long pkt_good;
        public @Unsigned long pkt_bad;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ao_info_opt")
    @NotUsableInJava
    public static class tcp_ao_info_opt
    extends Struct {
        public @Unsigned int set_current;
        public @Unsigned int set_rnext;
        public @Unsigned int ao_required;
        public @Unsigned int set_counters;
        public @Unsigned int accept_icmps;
        public @Unsigned int reserved;
        public @Unsigned short reserved2;
        public char current_key;
        public char rnext;
        public @Unsigned long pkt_good;
        public @Unsigned long pkt_bad;
        public @Unsigned long pkt_key_not_found;
        public @Unsigned long pkt_ao_required;
        public @Unsigned long pkt_dropped_icmp;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ao_del")
    @NotUsableInJava
    public static class tcp_ao_del
    extends Struct {
        public KernelDefinitions.__kernel_sockaddr_storage addr;
        public int ifindex;
        public @Unsigned int set_current;
        public @Unsigned int set_rnext;
        public @Unsigned int del_async;
        public @Unsigned int reserved;
        public @Unsigned short reserved2;
        public char prefix;
        public char sndid;
        public char rcvid;
        public char current_key;
        public char rnext;
        public char keyflags;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ao_add")
    @NotUsableInJava
    public static class tcp_ao_add
    extends Struct {
        public KernelDefinitions.__kernel_sockaddr_storage addr;
        public char @Size(value=64) [] alg_name;
        public int ifindex;
        public @Unsigned int set_current;
        public @Unsigned int set_rnext;
        public @Unsigned int reserved;
        public @Unsigned short reserved2;
        public char prefix;
        public char sndid;
        public char rcvid;
        public char maclen;
        public char keyflags;
        public char keylen;
        public char @Size(value=80) [] key;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_out_options")
    @NotUsableInJava
    public static class tcp_out_options
    extends Struct {
        public @Unsigned short options;
        public @Unsigned short mss;
        public char ws;
        public char num_sack_blocks;
        public char hash_size;
        public char bpf_opt_len;
        public Ptr<Character> hash_location;
        public @Unsigned int tsval;
        public @Unsigned int tsecr;
        public Ptr<tcp_fastopen_cookie> fastopen_cookie;
        public MptcpDefinitions.mptcp_out_options mptcp;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_queue")
    public static enum tcp_queue implements Enum<tcp_queue>,
    TypedEnum<tcp_queue, Integer>
    {
        TCP_FRAG_IN_WRITE_QUEUE,
        TCP_FRAG_IN_RTX_QUEUE;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_key")
    @NotUsableInJava
    public static class tcp_key
    extends Struct {
        @InlineUnion(value=34433)
        public  @InlineUnion(value=34433) AnonDefinitions.anon_member_of_anon_member_of_tcp_key anon0$0;
        @InlineUnion(value=34433)
        public @InlineUnion(value=34433) Ptr<tcp_md5sig_key> md5_key;
        public TypeDefinitions.type_of_tcp_key type;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_iter_state")
    @NotUsableInJava
    public static class tcp_iter_state
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public tcp_seq_states state;
        public Ptr<runtime.sock> syn_wait_sk;
        public int bucket;
        public int offset;
        public int sbucket;
        public int num;
        public @OriginalName(value="loff_t") long last_pos;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_seq_afinfo")
    @NotUsableInJava
    public static class tcp_seq_afinfo
    extends Struct {
        public @Unsigned @OriginalName(value="sa_family_t") short family;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_seq_states")
    public static enum tcp_seq_states implements Enum<tcp_seq_states>,
    TypedEnum<tcp_seq_states, Integer>
    {
        TCP_SEQ_STATE_LISTENING,
        TCP_SEQ_STATE_ESTABLISHED;

    }

    @Type(noCCodeGeneration=true, cType="enum tcp_tw_status")
    public static enum tcp_tw_status implements Enum<tcp_tw_status>,
    TypedEnum<tcp_tw_status, Integer>
    {
        TCP_TW_SUCCESS,
        TCP_TW_RST,
        TCP_TW_ACK,
        TCP_TW_SYN;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_md5sig")
    @NotUsableInJava
    public static class tcp_md5sig
    extends Struct {
        public KernelDefinitions.__kernel_sockaddr_storage tcpm_addr;
        public char tcpm_flags;
        public char tcpm_prefixlen;
        public @Unsigned short tcpm_keylen;
        public int tcpm_ifindex;
        public char @Size(value=80) [] tcpm_key;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_xa_pool")
    @NotUsableInJava
    public static class tcp_xa_pool
    extends Struct {
        public char max;
        public char idx;
        public @Unsigned int @Size(value=17) [] tokens;
        public @Unsigned @OriginalName(value="netmem_ref") long @Size(value=17) [] netmems;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_splice_state")
    @NotUsableInJava
    public static class tcp_splice_state
    extends Struct {
        public Ptr<PipeDefinitions.pipe_inode_info> pipe;
        public @Unsigned long len;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_chrono")
    public static enum tcp_chrono implements Enum<tcp_chrono>,
    TypedEnum<tcp_chrono, Integer>
    {
        TCP_CHRONO_UNSPEC,
        TCP_CHRONO_BUSY,
        TCP_CHRONO_RWND_LIMITED,
        TCP_CHRONO_SNDBUF_LIMITED,
        __TCP_CHRONO_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_sigpool")
    @NotUsableInJava
    public static class tcp_sigpool
    extends Struct {
        public Ptr<?> scratch;
        public Ptr<misc.ahash_request> req;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ao_hdr")
    @NotUsableInJava
    public static class tcp_ao_hdr
    extends Struct {
        public char kind;
        public char length;
        public char keyid;
        public char rnext_keyid;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_zerocopy_receive")
    @NotUsableInJava
    public static class tcp_zerocopy_receive
    extends Struct {
        public @Unsigned long address;
        public @Unsigned int length;
        public @Unsigned int recv_skip_hint;
        public @Unsigned int inq;
        public int err;
        public @Unsigned long copybuf_address;
        public int copybuf_len;
        public @Unsigned int flags;
        public @Unsigned long msg_control;
        public @Unsigned long msg_controllen;
        public @Unsigned int msg_flags;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_info")
    @NotUsableInJava
    public static class tcp_info
    extends Struct {
        public char tcpi_state;
        public char tcpi_ca_state;
        public char tcpi_retransmits;
        public char tcpi_probes;
        public char tcpi_backoff;
        public char tcpi_options;
        public char tcpi_snd_wscale;
        public char tcpi_rcv_wscale;
        public char tcpi_delivery_rate_app_limited;
        public char tcpi_fastopen_client_fail;
        public @Unsigned int tcpi_rto;
        public @Unsigned int tcpi_ato;
        public @Unsigned int tcpi_snd_mss;
        public @Unsigned int tcpi_rcv_mss;
        public @Unsigned int tcpi_unacked;
        public @Unsigned int tcpi_sacked;
        public @Unsigned int tcpi_lost;
        public @Unsigned int tcpi_retrans;
        public @Unsigned int tcpi_fackets;
        public @Unsigned int tcpi_last_data_sent;
        public @Unsigned int tcpi_last_ack_sent;
        public @Unsigned int tcpi_last_data_recv;
        public @Unsigned int tcpi_last_ack_recv;
        public @Unsigned int tcpi_pmtu;
        public @Unsigned int tcpi_rcv_ssthresh;
        public @Unsigned int tcpi_rtt;
        public @Unsigned int tcpi_rttvar;
        public @Unsigned int tcpi_snd_ssthresh;
        public @Unsigned int tcpi_snd_cwnd;
        public @Unsigned int tcpi_advmss;
        public @Unsigned int tcpi_reordering;
        public @Unsigned int tcpi_rcv_rtt;
        public @Unsigned int tcpi_rcv_space;
        public @Unsigned int tcpi_total_retrans;
        public @Unsigned long tcpi_pacing_rate;
        public @Unsigned long tcpi_max_pacing_rate;
        public @Unsigned long tcpi_bytes_acked;
        public @Unsigned long tcpi_bytes_received;
        public @Unsigned int tcpi_segs_out;
        public @Unsigned int tcpi_segs_in;
        public @Unsigned int tcpi_notsent_bytes;
        public @Unsigned int tcpi_min_rtt;
        public @Unsigned int tcpi_data_segs_in;
        public @Unsigned int tcpi_data_segs_out;
        public @Unsigned long tcpi_delivery_rate;
        public @Unsigned long tcpi_busy_time;
        public @Unsigned long tcpi_rwnd_limited;
        public @Unsigned long tcpi_sndbuf_limited;
        public @Unsigned int tcpi_delivered;
        public @Unsigned int tcpi_delivered_ce;
        public @Unsigned long tcpi_bytes_sent;
        public @Unsigned long tcpi_bytes_retrans;
        public @Unsigned int tcpi_dsack_dups;
        public @Unsigned int tcpi_reord_seen;
        public @Unsigned int tcpi_rcv_ooopack;
        public @Unsigned int tcpi_snd_wnd;
        public @Unsigned int tcpi_rcv_wnd;
        public @Unsigned int tcpi_rehash;
        public @Unsigned short tcpi_total_rto;
        public @Unsigned short tcpi_total_rto_recoveries;
        public @Unsigned int tcpi_total_rto_time;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_repair_window")
    @NotUsableInJava
    public static class tcp_repair_window
    extends Struct {
        public @Unsigned int snd_wl1;
        public @Unsigned int snd_wnd;
        public @Unsigned int max_window;
        public @Unsigned int rcv_wnd;
        public @Unsigned int rcv_wup;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_repair_opt")
    @NotUsableInJava
    public static class tcp_repair_opt
    extends Struct {
        public @Unsigned int opt_code;
        public @Unsigned int opt_val;
    }

    @Type(noCCodeGeneration=true, cType="union tcp_cc_info")
    @NotUsableInJava
    public static class tcp_cc_info
    extends Union {
        public misc.tcpvegas_info vegas;
        public tcp_dctcp_info dctcp;
        public tcp_bbr_info bbr;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_bbr_info")
    @NotUsableInJava
    public static class tcp_bbr_info
    extends Struct {
        public @Unsigned int bbr_bw_lo;
        public @Unsigned int bbr_bw_hi;
        public @Unsigned int bbr_min_rtt;
        public @Unsigned int bbr_pacing_gain;
        public @Unsigned int bbr_cwnd_gain;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_dctcp_info")
    @NotUsableInJava
    public static class tcp_dctcp_info
    extends Struct {
        public @Unsigned short dctcp_enabled;
        public @Unsigned short dctcp_ce_state;
        public @Unsigned int dctcp_alpha;
        public @Unsigned int dctcp_ab_ecn;
        public @Unsigned int dctcp_ab_tot;
    }

    @Type(noCCodeGeneration=true, cType="union tcp_word_hdr")
    @NotUsableInJava
    public static class tcp_word_hdr
    extends Union {
        public runtime.tcphdr hdr;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=5) [] words;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_skb_cb_sacked_flags")
    public static enum tcp_skb_cb_sacked_flags implements Enum<tcp_skb_cb_sacked_flags>,
    TypedEnum<tcp_skb_cb_sacked_flags, Integer>
    {
        TCPCB_SACKED_ACKED,
        TCPCB_SACKED_RETRANS,
        TCPCB_LOST,
        TCPCB_TAGBITS,
        TCPCB_REPAIRED,
        TCPCB_EVER_RETRANS,
        TCPCB_RETRANS;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_metrics_block")
    @NotUsableInJava
    public static class tcp_metrics_block
    extends Struct {
        public Ptr<tcp_metrics_block> tcpm_next;
        public Ptr<runtime.net> tcpm_net;
        public misc.inetpeer_addr tcpm_saddr;
        public misc.inetpeer_addr tcpm_daddr;
        public @Unsigned long tcpm_stamp;
        public @Unsigned int tcpm_lock;
        public @Unsigned int @Size(value=5) [] tcpm_vals;
        public tcp_fastopen_metrics tcpm_fastopen;
        public misc.callback_head callback_head;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_fastopen_metrics")
    @NotUsableInJava
    public static class tcp_fastopen_metrics
    extends Struct {
        public @Unsigned short mss;
        public @Unsigned short syn_loss;
        public @Unsigned short try_exp;
        public @Unsigned long last_syn_loss;
        public tcp_fastopen_cookie cookie;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_metric_index")
    public static enum tcp_metric_index implements Enum<tcp_metric_index>,
    TypedEnum<tcp_metric_index, Integer>
    {
        TCP_METRIC_RTT,
        TCP_METRIC_RTTVAR,
        TCP_METRIC_SSTHRESH,
        TCP_METRIC_CWND,
        TCP_METRIC_REORDERING,
        TCP_METRIC_RTT_US,
        TCP_METRIC_RTTVAR_US,
        __TCP_METRIC_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum tcp_ca_state")
    public static enum tcp_ca_state implements Enum<tcp_ca_state>,
    TypedEnum<tcp_ca_state, Integer>
    {
        TCP_CA_Open,
        TCP_CA_Disorder,
        TCP_CA_CWR,
        TCP_CA_Recovery,
        TCP_CA_Loss;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_skb_cb")
    @NotUsableInJava
    public static class tcp_skb_cb
    extends Struct {
        public @Unsigned int seq;
        public @Unsigned int end_seq;
        @InlineUnion(value=23731)
        public  @InlineUnion(value=23731) AnonDefinitions.anon_member_of_anon_member_of_tcp_skb_cb anon2$0;
        public char tcp_flags;
        public char sacked;
        public char ip_dsfield;
        public char txstamp_ack;
        public char eor;
        public char has_rxtstamp;
        public char unused;
        public @Unsigned int ack_seq;
        @InlineUnion(value=23734)
        public  @InlineUnion(value=23734) TxDefinitions.tx_of_anon_member_of_tcp_skb_cb tx;
        @InlineUnion(value=23734)
        public  @InlineUnion(value=23734) AnonDefinitions.anon_member_of_ipfrag_skb_cb_and_header_of_anon_member_of_tcp_skb_cb_and_header_of_sock_exterr_skb header;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_synack_type")
    public static enum tcp_synack_type implements Enum<tcp_synack_type>,
    TypedEnum<tcp_synack_type, Integer>
    {
        TCP_SYNACK_NORMAL,
        TCP_SYNACK_FASTOPEN,
        TCP_SYNACK_COOKIE;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ao_key")
    @NotUsableInJava
    public static class tcp_ao_key
    extends Struct {
        public misc.hlist_node node;
        public tcp_ao_addr addr;
        public char @Size(value=80) [] key;
        public @Unsigned int tcp_sigpool_id;
        public @Unsigned int digest_size;
        public int l3index;
        public char prefixlen;
        public char family;
        public char keylen;
        public char keyflags;
        public char sndid;
        public char rcvid;
        public char maclen;
        public misc.callback_head rcu;
        public misc.atomic64_t pkt_good;
        public misc.atomic64_t pkt_bad;
        public char @Size(value=0) [] traffic_keys;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ao_counters")
    @NotUsableInJava
    public static class tcp_ao_counters
    extends Struct {
        public misc.atomic64_t pkt_good;
        public misc.atomic64_t pkt_bad;
        public misc.atomic64_t key_not_found;
        public misc.atomic64_t ao_required;
        public misc.atomic64_t dropped_icmp;
    }

    @Type(noCCodeGeneration=true, cType="union tcp_ao_addr")
    @NotUsableInJava
    public static class tcp_ao_addr
    extends Union {
        public InDefinitions.in_addr a4;
        public In6Definitions.in6_addr a6;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_md5sig_key")
    @NotUsableInJava
    public static class tcp_md5sig_key
    extends Struct {
        public misc.hlist_node node;
        public char keylen;
        public char family;
        public char prefixlen;
        public char flags;
        public tcp_ao_addr addr;
        public int l3index;
        public char @Size(value=80) [] key;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_timewait_sock")
    @NotUsableInJava
    public static class tcp_timewait_sock
    extends Struct {
        public InetDefinitions.inet_timewait_sock tw_sk;
        public @Unsigned int tw_rcv_wnd;
        public @Unsigned int tw_ts_offset;
        public @Unsigned int tw_ts_recent;
        public @Unsigned int tw_last_oow_ack_time;
        public int tw_ts_recent_stamp;
        public @Unsigned int tw_tx_delay;
        public Ptr<tcp_md5sig_key> tw_md5_key;
        public Ptr<tcp_ao_info> ao_info;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_fastopen_request")
    @NotUsableInJava
    public static class tcp_fastopen_request
    extends Struct {
        public tcp_fastopen_cookie cookie;
        public Ptr<runtime.msghdr> data;
        public @Unsigned long size;
        public int copied;
        public Ptr<misc.ubuf_info> uarg;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ao_info")
    @NotUsableInJava
    public static class tcp_ao_info
    extends Struct {
        public misc.hlist_head head;
        public Ptr<tcp_ao_key> current_key;
        public Ptr<tcp_ao_key> rnext_key;
        public tcp_ao_counters counters;
        public @Unsigned int ao_required;
        public @Unsigned int accept_icmps;
        public @Unsigned int __unused;
        public @Unsigned @OriginalName(value="__be32") int lisn;
        public @Unsigned @OriginalName(value="__be32") int risn;
        public @Unsigned int snd_sne;
        public @Unsigned int rcv_sne;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_md5sig_info")
    @NotUsableInJava
    public static class tcp_md5sig_info
    extends Struct {
        public misc.hlist_head head;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_fastopen_cookie")
    @NotUsableInJava
    public static class tcp_fastopen_cookie
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long @Size(value=2) [] val;
        public @OriginalName(value="s8") byte len;
        public boolean exp;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_sock_af_ops")
    @NotUsableInJava
    public static class tcp_sock_af_ops
    extends Struct {
        public Ptr<?> md5_lookup;
        public Ptr<?> calc_md5_hash;
        public Ptr<?> md5_parse;
        public Ptr<?> ao_parse;
        public Ptr<?> ao_lookup;
        public Ptr<?> ao_calc_key_sk;
        public Ptr<?> calc_ao_hash;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_sock")
    @NotUsableInJava
    public static class tcp_sock
    extends Struct {
        public InetDefinitions.inet_connection_sock inet_conn;
        public char @Size(value=0) [] __cacheline_group_begin__tcp_sock_read_tx;
        public @Unsigned int max_window;
        public @Unsigned int rcv_ssthresh;
        public @Unsigned int reordering;
        public @Unsigned int notsent_lowat;
        public @Unsigned short gso_segs;
        public Ptr<SkDefinitions.sk_buff> lost_skb_hint;
        public Ptr<SkDefinitions.sk_buff> retransmit_skb_hint;
        public char @Size(value=0) [] __cacheline_group_end__tcp_sock_read_tx;
        public char @Size(value=0) [] __cacheline_group_begin__tcp_sock_read_txrx;
        public @Unsigned int tsoffset;
        public @Unsigned int snd_wnd;
        public @Unsigned int mss_cache;
        public @Unsigned int snd_cwnd;
        public @Unsigned int prr_out;
        public @Unsigned int lost_out;
        public @Unsigned int sacked_out;
        public @Unsigned short tcp_header_len;
        public char scaling_ratio;
        public char chrono_type;
        public char repair;
        public char tcp_usec_ts;
        public char is_sack_reneg;
        public char is_cwnd_limited;
        public char @Size(value=0) [] __cacheline_group_end__tcp_sock_read_txrx;
        public char @Size(value=0) [] __cacheline_group_begin__tcp_sock_read_rx;
        public @Unsigned int copied_seq;
        public @Unsigned int rcv_tstamp;
        public @Unsigned int snd_wl1;
        public @Unsigned int tlp_high_seq;
        public @Unsigned int rttvar_us;
        public @Unsigned int retrans_out;
        public @Unsigned short advmss;
        public @Unsigned short urg_data;
        public @Unsigned int lost;
        public runtime.minmax rtt_min;
        public RbDefinitions.rb_root out_of_order_queue;
        public @Unsigned int snd_ssthresh;
        public char recvmsg_inq;
        public char @Size(value=0) [] __cacheline_group_end__tcp_sock_read_rx;
        public char @Size(value=0) [] __cacheline_group_begin__tcp_sock_write_tx;
        public @Unsigned int segs_out;
        public @Unsigned int data_segs_out;
        public @Unsigned long bytes_sent;
        public @Unsigned int snd_sml;
        public @Unsigned int chrono_start;
        public @Unsigned int @Size(value=3) [] chrono_stat;
        public @Unsigned int write_seq;
        public @Unsigned int pushed_seq;
        public @Unsigned int lsndtime;
        public @Unsigned int mdev_us;
        public @Unsigned int rtt_seq;
        public @Unsigned long tcp_wstamp_ns;
        public ListDefinitions.list_head tsorted_sent_queue;
        public Ptr<SkDefinitions.sk_buff> highest_sack;
        public char ecn_flags;
        public char @Size(value=0) [] __cacheline_group_end__tcp_sock_write_tx;
        public char @Size(value=0) [] __cacheline_group_begin__tcp_sock_write_txrx;
        public @Unsigned @OriginalName(value="__be32") int pred_flags;
        public @Unsigned long tcp_clock_cache;
        public @Unsigned long tcp_mstamp;
        public @Unsigned int rcv_nxt;
        public @Unsigned int snd_nxt;
        public @Unsigned int snd_una;
        public @Unsigned int window_clamp;
        public @Unsigned int srtt_us;
        public @Unsigned int packets_out;
        public @Unsigned int snd_up;
        public @Unsigned int delivered;
        public @Unsigned int delivered_ce;
        public @Unsigned int app_limited;
        public @Unsigned int rcv_wnd;
        public tcp_options_received rx_opt;
        public char nonagle;
        public char rate_app_limited;
        public char @Size(value=0) [] __cacheline_group_end__tcp_sock_write_txrx;
        public char @Size(value=0) [] __cacheline_group_begin__tcp_sock_write_rx;
        public @Unsigned long bytes_received;
        public @Unsigned int segs_in;
        public @Unsigned int data_segs_in;
        public @Unsigned int rcv_wup;
        public @Unsigned int max_packets_out;
        public @Unsigned int cwnd_usage_seq;
        public @Unsigned int rate_delivered;
        public @Unsigned int rate_interval_us;
        public @Unsigned int rcv_rtt_last_tsecr;
        public @Unsigned long first_tx_mstamp;
        public @Unsigned long delivered_mstamp;
        public @Unsigned long bytes_acked;
        public misc.rcv_rtt_est_of_tcp_sock rcv_rtt_est;
        public misc.rcvq_space_of_tcp_sock rcvq_space;
        public char @Size(value=0) [] __cacheline_group_end__tcp_sock_write_rx;
        public @Unsigned int dsack_dups;
        public @Unsigned int compressed_ack_rcv_nxt;
        public ListDefinitions.list_head tsq_node;
        public tcp_rack rack;
        public char compressed_ack;
        public char dup_ack_counter;
        public char tlp_retrans;
        public char unused;
        public char thin_lto;
        public char fastopen_connect;
        public char fastopen_no_cookie;
        public char fastopen_client_fail;
        public char frto;
        public char repair_queue;
        public char save_syn;
        public char syn_data;
        public char syn_fastopen;
        public char syn_fastopen_exp;
        public char syn_fastopen_ch;
        public char syn_data_acked;
        public char keepalive_probes;
        public @Unsigned int tcp_tx_delay;
        public @Unsigned int mdev_max_us;
        public @Unsigned int reord_seen;
        public @Unsigned int snd_cwnd_cnt;
        public @Unsigned int snd_cwnd_clamp;
        public @Unsigned int snd_cwnd_used;
        public @Unsigned int snd_cwnd_stamp;
        public @Unsigned int prior_cwnd;
        public @Unsigned int prr_delivered;
        public @Unsigned int last_oow_ack_time;
        public runtime.hrtimer pacing_timer;
        public runtime.hrtimer compressed_ack_timer;
        public Ptr<SkDefinitions.sk_buff> ooo_last_skb;
        public tcp_sack_block @Size(value=1) [] duplicate_sack;
        public tcp_sack_block @Size(value=4) [] selective_acks;
        public tcp_sack_block @Size(value=4) [] recv_sack_cache;
        public int lost_cnt_hint;
        public @Unsigned int prior_ssthresh;
        public @Unsigned int high_seq;
        public @Unsigned int retrans_stamp;
        public @Unsigned int undo_marker;
        public int undo_retrans;
        public @Unsigned long bytes_retrans;
        public @Unsigned int total_retrans;
        public @Unsigned int rto_stamp;
        public @Unsigned short total_rto;
        public @Unsigned short total_rto_recoveries;
        public @Unsigned int total_rto_time;
        public @Unsigned int urg_seq;
        public @Unsigned int keepalive_time;
        public @Unsigned int keepalive_intvl;
        public int linger2;
        public char bpf_sock_ops_cb_flags;
        public char bpf_chg_cc_inprogress;
        public @Unsigned short timeout_rehash;
        public @Unsigned int rcv_ooopack;
        public misc.mtu_probe_of_tcp_sock mtu_probe;
        public @Unsigned int plb_rehash;
        public @Unsigned int mtu_info;
        public boolean is_mptcp;
        public boolean syn_smc;
        public Ptr<?> smc_hs_congested;
        public Ptr<tcp_sock_af_ops> af_specific;
        public Ptr<tcp_md5sig_info> md5sig_info;
        public Ptr<tcp_ao_info> ao_info;
        public Ptr<tcp_fastopen_request> fastopen_req;
        public Ptr<RequestDefinitions.request_sock> fastopen_rsk;
        public Ptr<SavedDefinitions.saved_syn> saved_syn;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_rack")
    @NotUsableInJava
    public static class tcp_rack
    extends Struct {
        public @Unsigned long mstamp;
        public @Unsigned int rtt_us;
        public @Unsigned int end_seq;
        public @Unsigned int last_delivered;
        public char reo_wnd_steps;
        public char reo_wnd_persist;
        public char dsack_seen;
        public char advanced;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_request_sock_ops")
    @NotUsableInJava
    public static class tcp_request_sock_ops
    extends Struct {
        public @Unsigned short mss_clamp;
        public Ptr<?> req_md5_lookup;
        public Ptr<?> calc_md5_hash;
        public Ptr<?> ao_lookup;
        public Ptr<?> ao_calc_key;
        public Ptr<?> ao_synack_hash;
        public Ptr<?> cookie_init_seq;
        public Ptr<?> route_req;
        public Ptr<?> init_seq;
        public Ptr<?> init_ts_off;
        public Ptr<?> send_synack;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_request_sock")
    @NotUsableInJava
    public static class tcp_request_sock
    extends Struct {
        public InetDefinitions.inet_request_sock req;
        public Ptr<tcp_request_sock_ops> af_specific;
        public @Unsigned long snt_synack;
        public boolean tfo_listener;
        public boolean is_mptcp;
        public boolean req_usec_ts;
        public boolean drop_req;
        public @Unsigned int txhash;
        public @Unsigned int rcv_isn;
        public @Unsigned int snt_isn;
        public @Unsigned int ts_off;
        public @Unsigned int last_oow_ack_time;
        public @Unsigned int rcv_nxt;
        public char syn_tos;
        public char ao_keyid;
        public char ao_rcv_next;
        public boolean used_tcp_ao;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_options_received")
    @NotUsableInJava
    public static class tcp_options_received
    extends Struct {
        public int ts_recent_stamp;
        public @Unsigned int ts_recent;
        public @Unsigned int rcv_tsval;
        public @Unsigned int rcv_tsecr;
        public @Unsigned short saw_tstamp;
        public @Unsigned short tstamp_ok;
        public @Unsigned short dsack;
        public @Unsigned short wscale_ok;
        public @Unsigned short sack_ok;
        public @Unsigned short smc_ok;
        public @Unsigned short snd_wscale;
        public @Unsigned short rcv_wscale;
        public char saw_unknown;
        public char unused;
        public char num_sacks;
        public @Unsigned short user_mss;
        public @Unsigned short mss_clamp;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_sack_block")
    @NotUsableInJava
    public static class tcp_sack_block
    extends Struct {
        public @Unsigned int start_seq;
        public @Unsigned int end_seq;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_ulp_ops")
    @NotUsableInJava
    public static class tcp_ulp_ops
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> init;
        public Ptr<?> update;
        public Ptr<?> release;
        public Ptr<?> get_info;
        public Ptr<?> get_info_size;
        public Ptr<?> clone;
        public char @Size(value=16) [] name;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_ca_event")
    public static enum tcp_ca_event implements Enum<tcp_ca_event>,
    TypedEnum<tcp_ca_event, Integer>
    {
        CA_EVENT_TX_START,
        CA_EVENT_CWND_RESTART,
        CA_EVENT_COMPLETE_CWR,
        CA_EVENT_LOSS,
        CA_EVENT_ECN_NO_CE,
        CA_EVENT_ECN_IS_CE;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_fastopen_context")
    @NotUsableInJava
    public static class tcp_fastopen_context
    extends Struct {
        public misc.siphash_key_t @Size(value=2) [] key;
        public int num;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum tcp_conntrack")
    public static enum tcp_conntrack implements Enum<tcp_conntrack>,
    TypedEnum<tcp_conntrack, Integer>
    {
        TCP_CONNTRACK_NONE,
        TCP_CONNTRACK_SYN_SENT,
        TCP_CONNTRACK_SYN_RECV,
        TCP_CONNTRACK_ESTABLISHED,
        TCP_CONNTRACK_FIN_WAIT,
        TCP_CONNTRACK_CLOSE_WAIT,
        TCP_CONNTRACK_LAST_ACK,
        TCP_CONNTRACK_TIME_WAIT,
        TCP_CONNTRACK_CLOSE,
        TCP_CONNTRACK_LISTEN,
        TCP_CONNTRACK_MAX,
        TCP_CONNTRACK_IGNORE,
        TCP_CONNTRACK_RETRANS,
        TCP_CONNTRACK_UNACK,
        TCP_CONNTRACK_TIMEOUT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct tcp_congestion_ops")
    @NotUsableInJava
    public static class tcp_congestion_ops
    extends Struct {
        public Ptr<?> ssthresh;
        public Ptr<?> cong_avoid;
        public Ptr<?> set_state;
        public Ptr<?> cwnd_event;
        public Ptr<?> in_ack_event;
        public Ptr<?> pkts_acked;
        public Ptr<?> min_tso_segs;
        public Ptr<?> cong_control;
        public Ptr<?> undo_cwnd;
        public Ptr<?> sndbuf_expand;
        public Ptr<?> get_info;
        public char @Size(value=16) [] name;
        public Ptr<runtime.module> owner;
        public ListDefinitions.list_head list;
        public @Unsigned int key;
        public @Unsigned int flags;
        public Ptr<?> init;
        public Ptr<?> release;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp_mib")
    @NotUsableInJava
    public static class tcp_mib
    extends Struct {
        public @Unsigned long @Size(value=16) [] mibs;
    }
}

