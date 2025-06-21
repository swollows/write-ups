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
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NhDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NlaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nla_put_nh_group(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nexthop> nh, @Unsigned int op_flags, Ptr<@Unsigned Integer> resp_op_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nla_put_nh_group_res(Ptr<SkDefinitions.sk_buff> skb, Ptr<NhDefinitions.nh_group> nhg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nla_put_nh_group_stats(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nexthop> nh, @Unsigned int op_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nla_parse($arg1, $arg2, (const struct nlattr*)$arg3, $arg4, (const struct nla_policy*)$arg5, $arg6, $arg7)")
    public static int __nla_parse(Ptr<Ptr<runtime.nlattr>> tb, int maxtype, Ptr<runtime.nlattr> head, int len, Ptr<nla_policy> policy, @Unsigned int validate, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nla_put($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static void __nla_put(Ptr<SkDefinitions.sk_buff> skb, int attrtype, int attrlen, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nla_put_64bit($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static void __nla_put_64bit(Ptr<SkDefinitions.sk_buff> skb, int attrtype, int attrlen, Ptr<?> data, int padattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nla_put_nohdr($arg1, $arg2, (const void*)$arg3)")
    public static void __nla_put_nohdr(Ptr<SkDefinitions.sk_buff> skb, int attrlen, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nlattr> __nla_reserve(Ptr<SkDefinitions.sk_buff> skb, int attrtype, int attrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nlattr> __nla_reserve_64bit(Ptr<SkDefinitions.sk_buff> skb, int attrtype, int attrlen, int padattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __nla_reserve_nohdr(Ptr<SkDefinitions.sk_buff> skb, int attrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nla_validate((const struct nlattr*)$arg1, $arg2, $arg3, (const struct nla_policy*)$arg4, $arg5, $arg6)")
    public static int __nla_validate(Ptr<runtime.nlattr> head, int len, int maxtype, Ptr<nla_policy> policy, @Unsigned int validate, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nla_validate_parse((const struct nlattr*)$arg1, $arg2, $arg3, (const struct nla_policy*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int __nla_validate_parse(Ptr<runtime.nlattr> head, int len, int maxtype, Ptr<nla_policy> policy, @Unsigned int validate, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<Ptr<runtime.nlattr>> tb, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_append($arg1, $arg2, (const void*)$arg3)")
    public static int nla_append(Ptr<SkDefinitions.sk_buff> skb, int attrlen, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_find((const struct nlattr*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.nlattr> nla_find(Ptr<runtime.nlattr> head, int len, int attrtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_get_range_signed((const struct nla_policy*)$arg1, $arg2)")
    public static void nla_get_range_signed(Ptr<nla_policy> pt2, Ptr<NetlinkDefinitions.netlink_range_validation_signed> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_get_range_unsigned((const struct nla_policy*)$arg1, $arg2)")
    public static void nla_get_range_unsigned(Ptr<nla_policy> pt2, Ptr<NetlinkDefinitions.netlink_range_validation> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_memcmp((const struct nlattr*)$arg1, (const void*)$arg2, $arg3)")
    public static int nla_memcmp(Ptr<runtime.nlattr> nla, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_memcpy($arg1, (const struct nlattr*)$arg2, $arg3)")
    public static int nla_memcpy(Ptr<?> dest, Ptr<runtime.nlattr> src, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_policy_len((const struct nla_policy*)$arg1, $arg2)")
    public static int nla_policy_len(Ptr<nla_policy> p, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_put($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static int nla_put(Ptr<SkDefinitions.sk_buff> skb, int attrtype, int attrlen, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_put_64bit($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int nla_put_64bit(Ptr<SkDefinitions.sk_buff> skb, int attrtype, int attrlen, Ptr<?> data, int padattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nla_put_ifalias(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_put_nohdr($arg1, $arg2, (const void*)$arg3)")
    public static int nla_put_nohdr(Ptr<SkDefinitions.sk_buff> skb, int attrlen, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nlattr> nla_reserve(Ptr<SkDefinitions.sk_buff> skb, int attrtype, int attrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nlattr> nla_reserve_64bit(Ptr<SkDefinitions.sk_buff> skb, int attrtype, int attrlen, int padattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> nla_reserve_nohdr(Ptr<SkDefinitions.sk_buff> skb, int attrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_strcmp((const struct nlattr*)$arg1, (const u8*)$arg2)")
    public static int nla_strcmp(Ptr<runtime.nlattr> nla, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_strdup((const struct nlattr*)$arg1, $arg2)")
    public static String nla_strdup(Ptr<runtime.nlattr> nla, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_strscpy($arg1, (const struct nlattr*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long nla_strscpy(String dst, Ptr<runtime.nlattr> nla, @Unsigned long dstsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nla_validate_range_unsigned((const struct nla_policy*)$arg1, (const struct nlattr*)$arg2, $arg3, $arg4)")
    public static int nla_validate_range_unsigned(Ptr<nla_policy> pt2, Ptr<runtime.nlattr> nla, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, @Unsigned int validate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum nla_policy_validation")
    public static enum nla_policy_validation implements Enum<nla_policy_validation>,
    TypedEnum<nla_policy_validation, Integer>
    {
        NLA_VALIDATE_NONE,
        NLA_VALIDATE_RANGE,
        NLA_VALIDATE_RANGE_WARN_TOO_LONG,
        NLA_VALIDATE_MIN,
        NLA_VALIDATE_MAX,
        NLA_VALIDATE_MASK,
        NLA_VALIDATE_RANGE_PTR,
        NLA_VALIDATE_FUNCTION;

    }

    @Type(noCCodeGeneration=true, cType="struct nla_bitfield32")
    @NotUsableInJava
    public static class nla_bitfield32
    extends Struct {
        public @Unsigned int value;
        public @Unsigned int selector;
    }

    @Type(noCCodeGeneration=true, cType="struct nla_policy")
    @NotUsableInJava
    public static class nla_policy
    extends Struct {
        public char type;
        public char validation_type;
        public @Unsigned short len;
        @InlineUnion(value=6057)
        public @InlineUnion(value=6057) @Unsigned short strict_start_type;
        @InlineUnion(value=6057)
        public @InlineUnion(value=6057) @Unsigned int bitfield32_valid;
        @InlineUnion(value=6057)
        public @InlineUnion(value=6057) @Unsigned int mask;
        @InlineUnion(value=6057)
        public @InlineUnion(value=6057) String reject_message;
        @InlineUnion(value=6057)
        public @InlineUnion(value=6057) Ptr<nla_policy> nested_policy;
        @InlineUnion(value=6057)
        public @InlineUnion(value=6057) Ptr<NetlinkDefinitions.netlink_range_validation> range;
        @InlineUnion(value=6057)
        public @InlineUnion(value=6057) Ptr<NetlinkDefinitions.netlink_range_validation_signed> range_signed;
        @InlineUnion(value=6057)
        public  @InlineUnion(value=6057) AnonDefinitions.anon_member_of_anon_member_of_nla_policy anon3$7;
        @InlineUnion(value=6057)
        public @InlineUnion(value=6057) Ptr<?> validate;
    }
}

