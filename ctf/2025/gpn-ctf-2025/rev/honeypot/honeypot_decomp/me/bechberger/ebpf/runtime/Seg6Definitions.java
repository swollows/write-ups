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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.LwtunnelDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PcpuDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.ShashDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Seg6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="seg6_build_state($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int seg6_build_state(Ptr<runtime.net> net2, Ptr<runtime.nlattr> nla, @Unsigned int family, Ptr<?> cfg, Ptr<Ptr<LwtunnelDefinitions.lwtunnel_state>> ts, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_destroy_state(Ptr<LwtunnelDefinitions.lwtunnel_state> lwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_do_srh(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_do_srh_encap(Ptr<SkDefinitions.sk_buff> skb, Ptr<Ipv6Definitions.ipv6_sr_hdr> osrh, int proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_do_srh_encap_red(Ptr<SkDefinitions.sk_buff> skb, Ptr<Ipv6Definitions.ipv6_sr_hdr> osrh, int proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_do_srh_inline(Ptr<SkDefinitions.sk_buff> skb, Ptr<Ipv6Definitions.ipv6_sr_hdr> osrh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_encap_cmp(Ptr<LwtunnelDefinitions.lwtunnel_state> a, Ptr<LwtunnelDefinitions.lwtunnel_state> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_encap_nlsize(Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_fill_encap_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_input_core(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_input_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_iptunnel_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_iptunnel_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_output_core(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__seg6_end_dt_vrf_build($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int __seg6_end_dt_vrf_build(Ptr<seg6_local_lwt> slwt, Ptr<?> cfg, @Unsigned short family, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean seg6_bpf_has_valid_srh(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seg6_end_dt46_build($arg1, (const void*)$arg2, $arg3)")
    public static int seg6_end_dt46_build(Ptr<seg6_local_lwt> slwt, Ptr<?> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seg6_end_dt4_build($arg1, (const void*)$arg2, $arg3)")
    public static int seg6_end_dt4_build(Ptr<seg6_local_lwt> slwt, Ptr<?> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seg6_end_dt6_build($arg1, (const void*)$arg2, $arg3)")
    public static int seg6_end_dt6_build(Ptr<seg6_local_lwt> slwt, Ptr<?> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_genl_dumphmac(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_genl_dumphmac_done(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_genl_dumphmac_start(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_genl_get_tunsrc(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_genl_set_tunsrc(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_genl_sethmac(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ipv6Definitions.ipv6_sr_hdr> seg6_get_srh(Ptr<SkDefinitions.sk_buff> skb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_icmp_srh(Ptr<SkDefinitions.sk_buff> skb, Ptr<Inet6Definitions.inet6_skb_parm> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seg6_local_build_state($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int seg6_local_build_state(Ptr<runtime.net> net2, Ptr<runtime.nlattr> nla, @Unsigned int family, Ptr<?> cfg, Ptr<Ptr<LwtunnelDefinitions.lwtunnel_state>> ts, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_local_cmp_encap(Ptr<LwtunnelDefinitions.lwtunnel_state> a, Ptr<LwtunnelDefinitions.lwtunnel_state> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_local_destroy_state(Ptr<LwtunnelDefinitions.lwtunnel_state> lwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_local_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_local_fill_encap(Ptr<SkDefinitions.sk_buff> skb, Ptr<LwtunnelDefinitions.lwtunnel_state> lwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_local_get_encap_size(Ptr<LwtunnelDefinitions.lwtunnel_state> lwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_local_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_local_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_local_input_core(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_lookup_any_nexthop(Ptr<SkDefinitions.sk_buff> skb, Ptr<In6Definitions.in6_addr> nhaddr, @Unsigned int tbl_id, boolean local_delivery) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_lookup_nexthop(Ptr<SkDefinitions.sk_buff> skb, Ptr<In6Definitions.in6_addr> nhaddr, @Unsigned int tbl_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seg6_next_csid_advance_arg($arg1, (const struct seg6_flavors_info*)$arg2)")
    public static void seg6_next_csid_advance_arg(Ptr<In6Definitions.in6_addr> addr2, Ptr<seg6_flavors_info> finfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean seg6_pop_srh(Ptr<SkDefinitions.sk_buff> skb, int srhoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean seg6_validate_srh(Ptr<Ipv6Definitions.ipv6_sr_hdr> srh, int len, boolean reduced) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_free_hi(Ptr<?> ptr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seg6_hmac_cmpfn($arg1, (const void*)$arg2)")
    public static int seg6_hmac_cmpfn(Ptr<RhashtableDefinitions.rhashtable_compare_arg> arg2, Ptr<?> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_hmac_compute(Ptr<seg6_hmac_info> hinfo, Ptr<Ipv6Definitions.ipv6_sr_hdr> hdr, Ptr<In6Definitions.in6_addr> saddr, Ptr<Character> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_hmac_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_hmac_info_add(Ptr<runtime.net> net2, @Unsigned int key2, Ptr<seg6_hmac_info> hinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_hmac_info_del(Ptr<runtime.net> net2, @Unsigned int key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<seg6_hmac_info> seg6_hmac_info_lookup(Ptr<runtime.net> net2, @Unsigned int key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_hmac_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_hmac_init_algo() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seg6_hmac_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_hmac_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean seg6_hmac_validate_skb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seg6_push_hmac(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> saddr, Ptr<Ipv6Definitions.ipv6_sr_hdr> srh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_hmac_algo")
    @NotUsableInJava
    public static class seg6_hmac_algo
    extends Struct {
        public char alg_id;
        public char @Size(value=64) [] name;
        public Ptr<Ptr<CryptoDefinitions.crypto_shash>> tfms;
        public Ptr<Ptr<ShashDefinitions.shash_desc>> shashs;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_action_param")
    @NotUsableInJava
    public static class seg6_action_param
    extends Struct {
        public Ptr<?> parse;
        public Ptr<?> put;
        public Ptr<?> cmp;
        public Ptr<?> destroy;
    }

    @Type(noCCodeGeneration=true, cType="enum seg6_local_flv_action")
    public static enum seg6_local_flv_action implements Enum<seg6_local_flv_action>,
    TypedEnum<seg6_local_flv_action, Integer>
    {
        SEG6_LOCAL_FLV_ACT_UNSPEC,
        SEG6_LOCAL_FLV_ACT_END,
        SEG6_LOCAL_FLV_ACT_PSP,
        SEG6_LOCAL_FLV_ACT_USP,
        SEG6_LOCAL_FLV_ACT_USD,
        __SEG6_LOCAL_FLV_ACT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum seg6_local_pktinfo")
    public static enum seg6_local_pktinfo implements Enum<seg6_local_pktinfo>,
    TypedEnum<seg6_local_pktinfo, Integer>
    {
        SEG6_LOCAL_PKTINFO_NOHDR,
        SEG6_LOCAL_PKTINFO_SL_ZERO,
        SEG6_LOCAL_PKTINFO_SL_ONE,
        SEG6_LOCAL_PKTINFO_SL_MORE,
        __SEG6_LOCAL_PKTINFO_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct seg6_local_counters")
    @NotUsableInJava
    public static class seg6_local_counters
    extends Struct {
        public @Unsigned long packets;
        public @Unsigned long bytes;
        public @Unsigned long errors;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_end_dt_info")
    @NotUsableInJava
    public static class seg6_end_dt_info
    extends Struct {
        public seg6_end_dt_mode mode;
        public Ptr<runtime.net> net;
        public int vrf_ifindex;
        public int vrf_table;
        public @Unsigned short family;
    }

    @Type(noCCodeGeneration=true, cType="enum seg6_end_dt_mode")
    public static enum seg6_end_dt_mode implements Enum<seg6_end_dt_mode>,
    TypedEnum<seg6_end_dt_mode, Integer>
    {
        DT_INVALID_MODE,
        DT_LEGACY_MODE,
        DT_VRF_MODE;

    }

    @Type(noCCodeGeneration=true, cType="struct seg6_flavors_info")
    @NotUsableInJava
    public static class seg6_flavors_info
    extends Struct {
        public @Unsigned int flv_ops;
        public char lcblock_bits;
        public char lcnode_func_bits;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_action_desc")
    @NotUsableInJava
    public static class seg6_action_desc
    extends Struct {
        public int action;
        public @Unsigned long attrs;
        public @Unsigned long optattrs;
        public Ptr<?> input;
        public int static_headroom;
        public seg6_local_lwtunnel_ops slwt_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_local_lwt")
    @NotUsableInJava
    public static class seg6_local_lwt
    extends Struct {
        public int action;
        public Ptr<Ipv6Definitions.ipv6_sr_hdr> srh;
        public int table;
        public InDefinitions.in_addr nh4;
        public In6Definitions.in6_addr nh6;
        public int iif;
        public int oif;
        public BpfDefinitions.bpf_lwt_prog bpf;
        public seg6_end_dt_info dt_info;
        public seg6_flavors_info flv_info;
        public Ptr<PcpuDefinitions.pcpu_seg6_local_counters> pcpu_counters;
        public int headroom;
        public Ptr<seg6_action_desc> desc;
        public @Unsigned long parsed_optattrs;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_local_lwtunnel_ops")
    @NotUsableInJava
    public static class seg6_local_lwtunnel_ops
    extends Struct {
        public Ptr<?> build_state;
        public Ptr<?> destroy_state;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_hmac_info")
    @NotUsableInJava
    public static class seg6_hmac_info
    extends Struct {
        public misc.rhash_head node;
        public misc.callback_head rcu;
        public @Unsigned int hmackeyid;
        public char @Size(value=64) [] secret;
        public char slen;
        public char alg_id;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_lwt")
    @NotUsableInJava
    public static class seg6_lwt
    extends Struct {
        public DstDefinitions.dst_cache cache;
        public seg6_iptunnel_encap @Size(value=0) [] tuninfo;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_iptunnel_encap")
    @NotUsableInJava
    public static class seg6_iptunnel_encap
    extends Struct {
        public int mode;
        public Ipv6Definitions.ipv6_sr_hdr @Size(value=0) [] srh;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_bpf_srh_state")
    @NotUsableInJava
    public static class seg6_bpf_srh_state
    extends Struct {
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p bh_lock;
        public Ptr<Ipv6Definitions.ipv6_sr_hdr> srh;
        public @Unsigned short hdrlen;
        public boolean valid;
    }

    @Type(noCCodeGeneration=true, cType="struct seg6_pernet_data")
    @NotUsableInJava
    public static class seg6_pernet_data
    extends Struct {
        public runtime.mutex lock;
        public Ptr<In6Definitions.in6_addr> tun_src;
        public runtime.rhashtable hmac_infos;
    }
}

