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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NlaDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.ScmDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NetlinkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__netlink_policy_dump_write_attr($arg1, $arg2, (const struct nla_policy*)$arg3, $arg4)")
    public static int __netlink_policy_dump_write_attr(Ptr<netlink_policy_dump_state> state2, Ptr<SkDefinitions.sk_buff> skb, Ptr<NlaDefinitions.nla_policy> pt2, int nestattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_policy_dump_add_policy($arg1, (const struct nla_policy*)$arg2, $arg3)")
    public static int netlink_policy_dump_add_policy(Ptr<Ptr<netlink_policy_dump_state>> pstate, Ptr<NlaDefinitions.nla_policy> policy, @Unsigned int maxtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_policy_dump_attr_size_estimate((const struct nla_policy*)$arg1)")
    public static int netlink_policy_dump_attr_size_estimate(Ptr<NlaDefinitions.nla_policy> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_policy_dump_free(Ptr<netlink_policy_dump_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_policy_dump_get_policy_idx($arg1, (const struct nla_policy*)$arg2, $arg3)")
    public static int netlink_policy_dump_get_policy_idx(Ptr<netlink_policy_dump_state> state2, Ptr<NlaDefinitions.nla_policy> policy, @Unsigned int maxtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean netlink_policy_dump_loop(Ptr<netlink_policy_dump_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_policy_dump_write(Ptr<SkDefinitions.sk_buff> skb, Ptr<netlink_policy_dump_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_policy_dump_write_attr($arg1, (const struct nla_policy*)$arg2, $arg3)")
    public static int netlink_policy_dump_write_attr(Ptr<SkDefinitions.sk_buff> skb, Ptr<NlaDefinitions.nla_policy> pt2, int nestattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netlink_change_ngroups(Ptr<runtime.sock> sk, @Unsigned int groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netlink_clear_multicast_users(Ptr<runtime.sock> ksk, @Unsigned int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netlink_create(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netlink_deliver_tap(Ptr<SkDefinitions.sk_buff> skb, Ptr<netlink_tap_net> nn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__netlink_dump_start($arg1, $arg2, (const struct nlmsghdr*)$arg3, $arg4)")
    public static int __netlink_dump_start(Ptr<runtime.sock> ssk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<netlink_dump_control> control) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> __netlink_kernel_create(Ptr<runtime.net> net2, int unit, Ptr<runtime.module> module2, Ptr<netlink_kernel_cfg> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> __netlink_lookup(Ptr<netlink_table> table, @Unsigned int portid, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__netlink_ns_capable((const struct netlink_skb_parms*)$arg1, $arg2, $arg3)")
    public static boolean __netlink_ns_capable(Ptr<netlink_skb_parms> nsp, Ptr<UserDefinitions.user_namespace> user_ns, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netlink_sendskb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __netlink_seq_next(Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_ack($arg1, $arg2, $arg3, (const struct netlink_ext_ack*)$arg4)")
    public static void netlink_ack(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, int err, Ptr<netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_ack_tlv_fill($arg1, (const struct nlmsghdr*)$arg2, $arg3, (const struct netlink_ext_ack*)$arg4)")
    public static void netlink_ack_tlv_fill(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, int err, Ptr<netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_ack_tlv_len($arg1, $arg2, (const struct netlink_ext_ack*)$arg3)")
    public static @Unsigned long netlink_ack_tlv_len(Ptr<netlink_sock> nlk, int err, Ptr<netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_add_tap(Ptr<netlink_tap> nt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> netlink_alloc_large_skb(@Unsigned int size, int broadcast) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_attachskb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<Long> timeo, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_autobind(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_broadcast(Ptr<runtime.sock> ssk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, @Unsigned int group, @Unsigned @OriginalName(value="gfp_t") int allocation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_broadcast_filtered(Ptr<runtime.sock> ssk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, @Unsigned int group, @Unsigned @OriginalName(value="gfp_t") int allocation, @OriginalName(value="netlink_filter_fn") Ptr<?> filter, Ptr<?> filter_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_capable((const struct sk_buff*)$arg1, $arg2)")
    public static boolean netlink_capable(Ptr<SkDefinitions.sk_buff> skb, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_change_ngroups(Ptr<runtime.sock> sk, @Unsigned int groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_compare($arg1, (const void*)$arg2)")
    public static int netlink_compare(Ptr<RhashtableDefinitions.rhashtable_compare_arg> arg2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_compare_arg_init(Ptr<netlink_compare_arg> arg2, Ptr<runtime.net> net2, @Unsigned int portid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int alen, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_create(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_data_ready(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_detachskb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_dump(Ptr<runtime.sock> sk, boolean lock_taken) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_dump_done(Ptr<netlink_sock> nlk, Ptr<SkDefinitions.sk_buff> skb, Ptr<netlink_callback> cb, Ptr<netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_getname(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int peer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> netlink_getsockbyfilp(Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_getsockopt(Ptr<runtime.socket> sock2, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_has_listeners(Ptr<runtime.sock> sk, @Unsigned int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_hash((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned int netlink_hash(Ptr<?> data, @Unsigned int len, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_insert(Ptr<runtime.sock> sk, @Unsigned int portid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_kernel_release(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_net_capable((const struct sk_buff*)$arg1, $arg2)")
    public static boolean netlink_net_capable(Ptr<SkDefinitions.sk_buff> skb, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_ns_capable((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static boolean netlink_ns_capable(Ptr<SkDefinitions.sk_buff> skb, Ptr<UserDefinitions.user_namespace> user_ns, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_overrun(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_proto_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_rcv_skb($arg1, (int (*)(struct sk_buff*, struct nlmsghdr*, struct netlink_ext_ack*))$arg2)")
    public static int netlink_rcv_skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_realloc_groups(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_register_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_release(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_remove_tap(Ptr<netlink_tap> nt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_sendskb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> netlink_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> netlink_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> posp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_set_err(Ptr<runtime.sock> ssk, @Unsigned int portid, @Unsigned int group, int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_setsockopt(Ptr<runtime.socket> sock2, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_skb_destructor(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_skb_set_owner_r(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_sock_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean netlink_strict_get_check(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_table_grab() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_table_ungrab() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_tap_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlink_to_full_skb((const struct sk_buff*)$arg1, $arg2)")
    public static Ptr<SkDefinitions.sk_buff> netlink_to_full_skb(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> netlink_trim(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="gfp_t") int allocation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_undo_bind(int group, @Unsigned long groups, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_unicast(Ptr<runtime.sock> ssk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, int nonblock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlink_unregister_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_update_listeners(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_update_socket_mc(Ptr<netlink_sock> nlk, @Unsigned int group, int is_new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlink_update_subscriptions(Ptr<runtime.sock> sk, @Unsigned int subscriptions) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { const struct nla_policy*; unsigned int maxtype; }")
    @NotUsableInJava
    public static class AnonymousType1527906606C60
    extends Struct {
        public Ptr<NlaDefinitions.nla_policy> policy;
        public @Unsigned int maxtype;
    }

    @Type(noCCodeGeneration=true, cType="struct listeners")
    @NotUsableInJava
    public static class listeners
    extends Struct {
        public misc.callback_head rcu;
        public @Unsigned long @Size(value=0) [] masks;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_policy_dump_state")
    @NotUsableInJava
    public static class netlink_policy_dump_state
    extends Struct {
        public @Unsigned int policy_idx;
        public @Unsigned int attr_idx;
        public @Unsigned int n_alloc;
        public AnonymousType1527906606C60 @Size(value=0) [] policies;
    }

    @Type(noCCodeGeneration=true, cType="enum netlink_policy_type_attr")
    public static enum netlink_policy_type_attr implements Enum<netlink_policy_type_attr>,
    TypedEnum<netlink_policy_type_attr, Integer>
    {
        NL_POLICY_TYPE_ATTR_UNSPEC,
        NL_POLICY_TYPE_ATTR_TYPE,
        NL_POLICY_TYPE_ATTR_MIN_VALUE_S,
        NL_POLICY_TYPE_ATTR_MAX_VALUE_S,
        NL_POLICY_TYPE_ATTR_MIN_VALUE_U,
        NL_POLICY_TYPE_ATTR_MAX_VALUE_U,
        NL_POLICY_TYPE_ATTR_MIN_LENGTH,
        NL_POLICY_TYPE_ATTR_MAX_LENGTH,
        NL_POLICY_TYPE_ATTR_POLICY_IDX,
        NL_POLICY_TYPE_ATTR_POLICY_MAXTYPE,
        NL_POLICY_TYPE_ATTR_BITFIELD32_MASK,
        NL_POLICY_TYPE_ATTR_PAD,
        NL_POLICY_TYPE_ATTR_MASK,
        __NL_POLICY_TYPE_ATTR_MAX,
        NL_POLICY_TYPE_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum netlink_attribute_type")
    public static enum netlink_attribute_type implements Enum<netlink_attribute_type>,
    TypedEnum<netlink_attribute_type, Integer>
    {
        NL_ATTR_TYPE_INVALID,
        NL_ATTR_TYPE_FLAG,
        NL_ATTR_TYPE_U8,
        NL_ATTR_TYPE_U16,
        NL_ATTR_TYPE_U32,
        NL_ATTR_TYPE_U64,
        NL_ATTR_TYPE_S8,
        NL_ATTR_TYPE_S16,
        NL_ATTR_TYPE_S32,
        NL_ATTR_TYPE_S64,
        NL_ATTR_TYPE_BINARY,
        NL_ATTR_TYPE_STRING,
        NL_ATTR_TYPE_NUL_STRING,
        NL_ATTR_TYPE_NESTED,
        NL_ATTR_TYPE_NESTED_ARRAY,
        NL_ATTR_TYPE_BITFIELD32,
        NL_ATTR_TYPE_SINT,
        NL_ATTR_TYPE_UINT;

    }

    @Type(noCCodeGeneration=true, cType="struct netlink_set_err_data")
    @NotUsableInJava
    public static class netlink_set_err_data
    extends Struct {
        public Ptr<runtime.sock> exclude_sk;
        public @Unsigned int portid;
        public @Unsigned int group;
        public int code;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_broadcast_data")
    @NotUsableInJava
    public static class netlink_broadcast_data
    extends Struct {
        public Ptr<runtime.sock> exclude_sk;
        public Ptr<runtime.net> net;
        public @Unsigned int portid;
        public @Unsigned int group;
        public int failure;
        public int delivery_failure;
        public int congested;
        public int delivered;
        public @Unsigned @OriginalName(value="gfp_t") int allocation;
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<SkDefinitions.sk_buff> skb2;
        public Ptr<?> tx_filter;
        public Ptr<?> tx_data;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_compare_arg")
    @NotUsableInJava
    public static class netlink_compare_arg
    extends Struct {
        public misc.possible_net_t pnet;
        public @Unsigned int portid;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_tap_net")
    @NotUsableInJava
    public static class netlink_tap_net
    extends Struct {
        public ListDefinitions.list_head netlink_tap_all;
        public runtime.mutex netlink_tap_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_table")
    @NotUsableInJava
    public static class netlink_table
    extends Struct {
        public runtime.rhashtable hash;
        public misc.hlist_head mc_list;
        public Ptr<listeners> listeners;
        public @Unsigned int flags;
        public @Unsigned int groups;
        public Ptr<runtime.mutex> cb_mutex;
        public Ptr<runtime.module> module;
        public Ptr<?> bind;
        public Ptr<?> unbind;
        public Ptr<?> release;
        public int registered;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_sock")
    @NotUsableInJava
    public static class netlink_sock
    extends Struct {
        public runtime.sock sk;
        public @Unsigned long flags;
        public @Unsigned int portid;
        public @Unsigned int dst_portid;
        public @Unsigned int dst_group;
        public @Unsigned int subscriptions;
        public @Unsigned int ngroups;
        public Ptr<@Unsigned Long> groups;
        public @Unsigned long state;
        public @Unsigned long max_recvmsg_len;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public boolean bound;
        public boolean cb_running;
        public int dump_done_errno;
        public netlink_callback cb;
        public runtime.mutex nl_cb_mutex;
        public Ptr<?> netlink_rcv;
        public Ptr<?> netlink_bind;
        public Ptr<?> netlink_unbind;
        public Ptr<?> netlink_release;
        public Ptr<runtime.module> module;
        public misc.rhash_head node;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_tap")
    @NotUsableInJava
    public static class netlink_tap
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<runtime.module> module;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_notify")
    @NotUsableInJava
    public static class netlink_notify
    extends Struct {
        public Ptr<runtime.net> net;
        public @Unsigned int portid;
        public int protocol;
    }

    @Type(noCCodeGeneration=true, cType="enum netlink_skb_flags")
    public static enum netlink_skb_flags implements Enum<netlink_skb_flags>,
    TypedEnum<netlink_skb_flags, Integer>
    {
        NETLINK_SKB_DST;

    }

    @Type(noCCodeGeneration=true, cType="struct netlink_dump_control")
    @NotUsableInJava
    public static class netlink_dump_control
    extends Struct {
        public Ptr<?> start;
        public Ptr<?> dump;
        public Ptr<?> done;
        public Ptr<netlink_ext_ack> extack;
        public Ptr<?> data;
        public Ptr<runtime.module> module;
        public @Unsigned int min_dump_alloc;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_kernel_cfg")
    @NotUsableInJava
    public static class netlink_kernel_cfg
    extends Struct {
        public @Unsigned int groups;
        public @Unsigned int flags;
        public Ptr<?> input;
        public Ptr<?> bind;
        public Ptr<?> unbind;
        public Ptr<?> release;
    }

    @Type(noCCodeGeneration=true, cType="enum netlink_validation")
    public static enum netlink_validation implements Enum<netlink_validation>,
    TypedEnum<netlink_validation, Integer>
    {
        NL_VALIDATE_LIBERAL,
        NL_VALIDATE_TRAILING,
        NL_VALIDATE_MAXTYPE,
        NL_VALIDATE_UNSPEC,
        NL_VALIDATE_STRICT_ATTRS,
        NL_VALIDATE_NESTED;

    }

    @Type(noCCodeGeneration=true, cType="struct netlink_skb_parms")
    @NotUsableInJava
    public static class netlink_skb_parms
    extends Struct {
        public ScmDefinitions.scm_creds creds;
        public @Unsigned int portid;
        public @Unsigned int dst_group;
        public @Unsigned int flags;
        public Ptr<runtime.sock> sk;
        public boolean nsid_is_set;
        public int nsid;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_range_validation_signed")
    @NotUsableInJava
    public static class netlink_range_validation_signed
    extends Struct {
        public long min;
        public long max;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_range_validation")
    @NotUsableInJava
    public static class netlink_range_validation
    extends Struct {
        public @Unsigned long min;
        public @Unsigned long max;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_callback")
    @NotUsableInJava
    public static class netlink_callback
    extends Struct {
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<runtime.nlmsghdr> nlh;
        public Ptr<?> dump;
        public Ptr<?> done;
        public Ptr<?> data;
        public Ptr<runtime.module> module;
        public Ptr<netlink_ext_ack> extack;
        public @Unsigned short family;
        public @Unsigned short answer_flags;
        public @Unsigned int min_dump_alloc;
        public @Unsigned int prev_seq;
        public @Unsigned int seq;
        public int flags;
        public boolean strict_check;
        @InlineUnion(value=5663)
        public @InlineUnion(value=5663) char @Size(value=48) [] ctx;
        @InlineUnion(value=5663)
        public @InlineUnion(value=5663) long @Size(value=6) [] args;
    }

    @Type(noCCodeGeneration=true, cType="struct netlink_ext_ack")
    @NotUsableInJava
    public static class netlink_ext_ack
    extends Struct {
        public String _msg;
        public Ptr<runtime.nlattr> bad_attr;
        public Ptr<NlaDefinitions.nla_policy> policy;
        public Ptr<runtime.nlattr> miss_nest;
        public @Unsigned short miss_type;
        public char @Size(value=20) [] cookie;
        public char cookie_len;
        public char @Size(value=80) [] _msg_buf;
    }
}

