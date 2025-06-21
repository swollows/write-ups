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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.LwtunnelDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Ioam6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ioam6_fill_trace_data(Ptr<SkDefinitions.sk_buff> skb, Ptr<ioam6_namespace> ns, Ptr<ioam6_trace_hdr> trace, Ptr<ioam6_schema> sc, char sclen, boolean is_input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioam6_event(ioam6_event_type type2, Ptr<runtime.net> net2, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<?> opt, @Unsigned int opt_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioam6_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioam6_fill_trace_data(Ptr<SkDefinitions.sk_buff> skb, Ptr<ioam6_namespace> ns, Ptr<ioam6_trace_hdr> trace, boolean is_input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioam6_free_ns(Ptr<?> ptr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioam6_free_sc(Ptr<?> ptr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_addns(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_addsc(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_delns(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_delsc(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_dumpns(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_dumpns_done(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_dumpns_start(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_dumpsc(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_dumpsc_done(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_dumpsc_start(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_genl_ns_set_schema(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioam6_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ioam6_ns_cmpfn($arg1, (const void*)$arg2)")
    public static int ioam6_ns_cmpfn(Ptr<RhashtableDefinitions.rhashtable_compare_arg> arg2, Ptr<?> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ioam6_sc_cmpfn($arg1, (const void*)$arg2)")
    public static int ioam6_sc_cmpfn(Ptr<RhashtableDefinitions.rhashtable_compare_arg> arg2, Ptr<?> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ioam6_build_state($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int ioam6_build_state(Ptr<runtime.net> net2, Ptr<runtime.nlattr> nla, @Unsigned int family, Ptr<?> cfg, Ptr<Ptr<LwtunnelDefinitions.lwtunnel_state>> ts, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioam6_destroy_state(Ptr<LwtunnelDefinitions.lwtunnel_state> lwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_do_encap(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<ioam6_lwt_encap> tuninfo, boolean has_tunsrc, Ptr<In6Definitions.in6_addr> tunsrc, Ptr<In6Definitions.in6_addr> tundst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_do_inline(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<ioam6_lwt_encap> tuninfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_encap_cmp(Ptr<LwtunnelDefinitions.lwtunnel_state> a, Ptr<LwtunnelDefinitions.lwtunnel_state> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_encap_nlsize(Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_fill_encap_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioam6_iptunnel_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_iptunnel_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioam6_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ioam6_validate_trace_hdr(Ptr<ioam6_trace_hdr> trace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum ioam6_event_attr")
    public static enum ioam6_event_attr implements Enum<ioam6_event_attr>,
    TypedEnum<ioam6_event_attr, Integer>
    {
        IOAM6_EVENT_ATTR_UNSPEC,
        IOAM6_EVENT_ATTR_TRACE_NAMESPACE,
        IOAM6_EVENT_ATTR_TRACE_NODELEN,
        IOAM6_EVENT_ATTR_TRACE_TYPE,
        IOAM6_EVENT_ATTR_TRACE_DATA,
        __IOAM6_EVENT_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct ioam6_lwt")
    @NotUsableInJava
    public static class ioam6_lwt
    extends Struct {
        public DstDefinitions.dst_cache cache;
        public ioam6_lwt_freq freq;
        public AtomicDefinitions.atomic_t pkt_cnt;
        public char mode;
        public boolean has_tunsrc;
        public In6Definitions.in6_addr tunsrc;
        public In6Definitions.in6_addr tundst;
        public ioam6_lwt_encap tuninfo;
    }

    @Type(noCCodeGeneration=true, cType="struct ioam6_lwt_freq")
    @NotUsableInJava
    public static class ioam6_lwt_freq
    extends Struct {
        public @Unsigned int k;
        public @Unsigned int n;
    }

    @Type(noCCodeGeneration=true, cType="struct ioam6_lwt_encap")
    @NotUsableInJava
    public static class ioam6_lwt_encap
    extends Struct {
        public Ipv6Definitions.ipv6_opt_hdr eh;
        public char @Size(value=2) [] pad;
        public ioam6_hdr ioamh;
        public ioam6_trace_hdr traceh;
    }

    @Type(noCCodeGeneration=true, cType="struct ioam6_schema")
    @NotUsableInJava
    public static class ioam6_schema
    extends Struct {
        public misc.rhash_head head;
        public misc.callback_head rcu;
        public Ptr<ioam6_namespace> ns;
        public @Unsigned int id;
        public int len;
        public @Unsigned @OriginalName(value="__be32") int hdr;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ioam6_namespace")
    @NotUsableInJava
    public static class ioam6_namespace
    extends Struct {
        public misc.rhash_head head;
        public misc.callback_head rcu;
        public Ptr<ioam6_schema> schema;
        public @Unsigned @OriginalName(value="__be16") short id;
        public @Unsigned @OriginalName(value="__be32") int data;
        public @Unsigned @OriginalName(value="__be64") long data_wide;
    }

    @Type(noCCodeGeneration=true, cType="enum ioam6_event_type")
    public static enum ioam6_event_type implements Enum<ioam6_event_type>,
    TypedEnum<ioam6_event_type, Integer>
    {
        IOAM6_EVENT_UNSPEC,
        IOAM6_EVENT_TRACE;

    }

    @Type(noCCodeGeneration=true, cType="struct ioam6_trace_hdr")
    @NotUsableInJava
    public static class ioam6_trace_hdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short namespace_id;
        public char overflow;
        public char nodelen;
        public char remlen;
        @InlineUnion(value=25856)
        public @InlineUnion(value=25856) @Unsigned @OriginalName(value="__be32") int type_be32;
        @InlineUnion(value=25856)
        public  @InlineUnion(value=25856) TypeDefinitions.type_of_anon_member_of_ioam6_trace_hdr type;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ioam6_hdr")
    @NotUsableInJava
    public static class ioam6_hdr
    extends Struct {
        public char opt_type;
        public char opt_len;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="struct ioam6_pernet_data")
    @NotUsableInJava
    public static class ioam6_pernet_data
    extends Struct {
        public runtime.mutex lock;
        public runtime.rhashtable namespaces;
        public runtime.rhashtable schemas;
    }
}

