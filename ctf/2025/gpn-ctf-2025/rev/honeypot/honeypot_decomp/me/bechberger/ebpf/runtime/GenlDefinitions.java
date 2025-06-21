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
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NlaDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class GenlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __genl_sk_priv_get(Ptr<genl_family> family, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_allocate_reserve_groups(int n_groups, Ptr<Integer> first_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_bind(Ptr<runtime.net> net2, int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_cmd_full_to_split($arg1, (const struct genl_family*)$arg2, (const struct genl_ops*)$arg3, $arg4)")
    public static int genl_cmd_full_to_split(Ptr<genl_split_ops> op, Ptr<genl_family> family, Ptr<genl_ops> full, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_ctrl_event($arg1, (const struct genl_family*)$arg2, (const struct genl_multicast_group*)$arg3, $arg4)")
    public static int genl_ctrl_event(int event2, Ptr<genl_family> family, Ptr<genl_multicast_group> grp, int grp_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_done(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_family_rcv_msg((const struct genl_family*)$arg1, $arg2, $arg3, $arg4)")
    public static int genl_family_rcv_msg(Ptr<genl_family> family, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_family_rcv_msg_doit((const struct genl_family*)$arg1, $arg2, $arg3, $arg4, (const struct genl_split_ops*)$arg5, $arg6, $arg7)")
    public static int genl_family_rcv_msg_doit(Ptr<genl_family> family, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<genl_split_ops> ops, int hdrlen, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_family_rcv_msg_dumpit((const struct genl_family*)$arg1, $arg2, $arg3, $arg4, (const struct genl_split_ops*)$arg5, $arg6, $arg7)")
    public static int genl_family_rcv_msg_dumpit(Ptr<genl_family> family, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<genl_split_ops> ops, int hdrlen, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_get_cmd($arg1, $arg2, (const struct genl_family*)$arg3, $arg4)")
    public static int genl_get_cmd(@Unsigned int cmd, char flags, Ptr<genl_family> family, Ptr<genl_split_ops> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genl_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_notify((const struct genl_family*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static void genl_notify(Ptr<genl_family> family, Ptr<SkDefinitions.sk_buff> skb, Ptr<genl_info> info2, @Unsigned int group, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_op_from_full((const struct genl_family*)$arg1, $arg2, $arg3)")
    public static void genl_op_from_full(Ptr<genl_family> family, @Unsigned int i, Ptr<genl_ops> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_op_from_small((const struct genl_family*)$arg1, $arg2, $arg3)")
    public static void genl_op_from_small(Ptr<genl_family> family, @Unsigned int i, Ptr<genl_ops> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genl_op_from_split(Ptr<genl_op_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean genl_op_iter_next(Ptr<genl_op_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genl_pernet_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_pernet_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genl_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_rcv_msg(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_register_family(Ptr<genl_family> family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genl_release(Ptr<runtime.sock> sk, Ptr<@Unsigned Long> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> genl_sk_priv_get(Ptr<genl_family> family, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_sk_privs_free((const struct genl_family*)$arg1)")
    public static void genl_sk_privs_free(Ptr<genl_family> family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_split_op_check((const struct genl_split_ops*)$arg1)")
    public static boolean genl_split_op_check(Ptr<genl_split_ops> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_start(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genl_unbind(Ptr<runtime.net> net2, int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void genl_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_unregister_family((const struct genl_family*)$arg1)")
    public static int genl_unregister_family(Ptr<genl_family> family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int genl_validate_assign_mc_groups(Ptr<genl_family> family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="genl_validate_ops((const struct genl_family*)$arg1)")
    public static int genl_validate_ops(Ptr<genl_family> family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct genlmsghdr")
    @NotUsableInJava
    public static class genlmsghdr
    extends Struct {
        public char cmd;
        public char version;
        public @Unsigned short reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct genl_start_context")
    @NotUsableInJava
    public static class genl_start_context
    extends Struct {
        public Ptr<genl_family> family;
        public Ptr<runtime.nlmsghdr> nlh;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
        public Ptr<genl_split_ops> ops;
        public int hdrlen;
    }

    @Type(noCCodeGeneration=true, cType="struct genl_op_iter")
    @NotUsableInJava
    public static class genl_op_iter
    extends Struct {
        public Ptr<genl_family> family;
        public genl_split_ops doit;
        public genl_split_ops dumpit;
        public int cmd_idx;
        public int entry_idx;
        public @Unsigned int cmd;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct genl_dumpit_info")
    @NotUsableInJava
    public static class genl_dumpit_info
    extends Struct {
        public genl_split_ops op;
        public genl_info info;
    }

    @Type(noCCodeGeneration=true, cType="enum genl_validate_flags")
    public static enum genl_validate_flags implements Enum<genl_validate_flags>,
    TypedEnum<genl_validate_flags, Integer>
    {
        GENL_DONT_VALIDATE_STRICT,
        GENL_DONT_VALIDATE_DUMP,
        GENL_DONT_VALIDATE_DUMP_STRICT;

    }

    @Type(noCCodeGeneration=true, cType="struct genl_small_ops")
    @NotUsableInJava
    public static class genl_small_ops
    extends Struct {
        public Ptr<?> doit;
        public Ptr<?> dumpit;
        public char cmd;
        public char internal_flags;
        public char flags;
        public char validate;
    }

    @Type(noCCodeGeneration=true, cType="struct genl_ops")
    @NotUsableInJava
    public static class genl_ops
    extends Struct {
        public Ptr<?> doit;
        public Ptr<?> start;
        public Ptr<?> dumpit;
        public Ptr<?> done;
        public Ptr<NlaDefinitions.nla_policy> policy;
        public @Unsigned int maxattr;
        public char cmd;
        public char internal_flags;
        public char flags;
        public char validate;
    }

    @Type(noCCodeGeneration=true, cType="struct genl_info")
    @NotUsableInJava
    public static class genl_info
    extends Struct {
        public @Unsigned int snd_seq;
        public @Unsigned int snd_portid;
        public Ptr<genl_family> family;
        public Ptr<runtime.nlmsghdr> nlhdr;
        public Ptr<genlmsghdr> genlhdr;
        public Ptr<Ptr<runtime.nlattr>> attrs;
        public misc.possible_net_t _net;
        public Ptr<?> @Size(value=2) [] user_ptr;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
    }

    @Type(noCCodeGeneration=true, cType="struct genl_split_ops")
    @NotUsableInJava
    public static class genl_split_ops
    extends Struct {
        @InlineUnion(value=8298)
        public  @InlineUnion(value=8298) AnonDefinitions.anon_member_of_anon_member_of_genl_split_ops anon0$0;
        @InlineUnion(value=8298)
        public  @InlineUnion(value=8298) AnonDefinitions.anon_member_of_anon_member_of_genl_split_ops anon0$1;
        public Ptr<NlaDefinitions.nla_policy> policy;
        public @Unsigned int maxattr;
        public char cmd;
        public char internal_flags;
        public char flags;
        public char validate;
    }

    @Type(noCCodeGeneration=true, cType="struct genl_family")
    @NotUsableInJava
    public static class genl_family
    extends Struct {
        public @Unsigned int hdrsize;
        public char @Size(value=16) [] name;
        public @Unsigned int version;
        public @Unsigned int maxattr;
        public char netnsok;
        public char parallel_ops;
        public char n_ops;
        public char n_small_ops;
        public char n_split_ops;
        public char n_mcgrps;
        public char resv_start_op;
        public Ptr<NlaDefinitions.nla_policy> policy;
        public Ptr<?> pre_doit;
        public Ptr<?> post_doit;
        public Ptr<?> bind;
        public Ptr<?> unbind;
        public Ptr<genl_ops> ops;
        public Ptr<genl_small_ops> small_ops;
        public Ptr<genl_split_ops> split_ops;
        public Ptr<genl_multicast_group> mcgrps;
        public Ptr<runtime.module> module;
        public @Unsigned long sock_priv_size;
        public Ptr<?> sock_priv_init;
        public Ptr<?> sock_priv_destroy;
        public int id;
        public @Unsigned int mcgrp_offset;
        public Ptr<runtime.xarray> sock_privs;
    }

    @Type(noCCodeGeneration=true, cType="struct genl_multicast_group")
    @NotUsableInJava
    public static class genl_multicast_group
    extends Struct {
        public char @Size(value=16) [] name;
        public char flags;
    }
}

