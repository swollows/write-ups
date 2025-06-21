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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.TcDefinitions;
import me.bechberger.ebpf.runtime.VlanDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FlowDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__flow_hash_from_keys($arg1, (const struct {\n  long long unsigned int key[2];\n}*)$arg2)")
    public static @Unsigned int __flow_hash_from_keys(Ptr<flow_keys> keys, Ptr<misc.siphash_key_t> keyval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<flow_action_cookie> flow_action_cookie_create(Ptr<?> data, @Unsigned int len, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void flow_action_cookie_destroy(Ptr<flow_action_cookie> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_block_cb_alloc($arg1, $arg2, $arg3, (void (*)(void*))$arg4)")
    public static Ptr<flow_block_cb> flow_block_cb_alloc(Ptr<?> cb, Ptr<?> cb_ident, Ptr<?> cb_priv, Ptr<?> release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int flow_block_cb_decref(Ptr<flow_block_cb> block_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void flow_block_cb_free(Ptr<flow_block_cb> block_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void flow_block_cb_incref(Ptr<flow_block_cb> block_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean flow_block_cb_is_busy(Ptr<?> cb, Ptr<?> cb_ident, Ptr<ListDefinitions.list_head> driver_block_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<flow_block_cb> flow_block_cb_lookup(Ptr<flow_block> block, Ptr<?> cb, Ptr<?> cb_ident) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> flow_block_cb_priv(Ptr<flow_block_cb> block_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int flow_block_cb_setup_simple(Ptr<flow_block_offload> f, Ptr<ListDefinitions.list_head> driver_block_list, Ptr<?> cb, Ptr<?> cb_ident, Ptr<?> cb_priv, boolean ingress_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int flow_dissector_bpf_prog_attach_check(Ptr<runtime.net> net2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_get_u32_dst((const struct flow_keys*)$arg1)")
    public static @Unsigned @OriginalName(value="__be32") int flow_get_u32_dst(Ptr<flow_keys> flow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_get_u32_src((const struct flow_keys*)$arg1)")
    public static @Unsigned @OriginalName(value="__be32") int flow_get_u32_src(Ptr<flow_keys> flow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int flow_hash_from_keys(Ptr<flow_keys> keys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_hash_from_keys_seed($arg1, (const struct {\n  long long unsigned int key[2];\n}*)$arg2)")
    public static @Unsigned int flow_hash_from_keys_seed(Ptr<flow_keys> keys, Ptr<misc.siphash_key_t> keyval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_indr_block_cb_alloc($arg1, $arg2, $arg3, (void (*)(void*))$arg4, $arg5, $arg6, $arg7, $arg8, $arg9, (void (*)(struct flow_block_cb*))$arg10)")
    public static Ptr<flow_block_cb> flow_indr_block_cb_alloc(Ptr<?> cb, Ptr<?> cb_ident, Ptr<?> cb_priv, Ptr<?> release, Ptr<flow_block_offload> bo, Ptr<NetDefinitions.net_device> dev, Ptr<runtime.Qdisc> sch, Ptr<?> data, Ptr<?> indr_cb_priv, Ptr<?> cleanup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean flow_indr_dev_exists() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int flow_indr_dev_register(Ptr<?> cb, Ptr<?> cb_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_indr_dev_setup_offload($arg1, $arg2, $arg3, $arg4, $arg5, (void (*)(struct flow_block_cb*))$arg6)")
    public static int flow_indr_dev_setup_offload(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.Qdisc> sch, TcDefinitions.tc_setup_type type2, Ptr<?> data, Ptr<flow_block_offload> bo, Ptr<?> cleanup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_indr_dev_unregister($arg1, $arg2, (void (*)(void*))$arg3)")
    public static void flow_indr_dev_unregister(Ptr<?> cb, Ptr<?> cb_priv, Ptr<?> release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<flow_rule> flow_rule_alloc(@Unsigned int num_actions) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_arp((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_arp(Ptr<flow_rule> rule, Ptr<flow_match_arp> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_basic((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_basic(Ptr<flow_rule> rule, Ptr<flow_match_basic> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_control((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_control(Ptr<flow_rule> rule, Ptr<flow_match_control> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_ct((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_ct(Ptr<flow_rule> rule, Ptr<flow_match_ct> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_cvlan((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_cvlan(Ptr<flow_rule> rule, Ptr<flow_match_vlan> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_enc_control((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_enc_control(Ptr<flow_rule> rule, Ptr<flow_match_control> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_enc_ip((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_enc_ip(Ptr<flow_rule> rule, Ptr<flow_match_ip> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_enc_ipv4_addrs((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_enc_ipv4_addrs(Ptr<flow_rule> rule, Ptr<flow_match_ipv4_addrs> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_enc_ipv6_addrs((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_enc_ipv6_addrs(Ptr<flow_rule> rule, Ptr<flow_match_ipv6_addrs> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_enc_keyid((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_enc_keyid(Ptr<flow_rule> rule, Ptr<flow_match_enc_keyid> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_enc_opts((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_enc_opts(Ptr<flow_rule> rule, Ptr<flow_match_enc_opts> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_enc_ports((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_enc_ports(Ptr<flow_rule> rule, Ptr<flow_match_ports> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_eth_addrs((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_eth_addrs(Ptr<flow_rule> rule, Ptr<flow_match_eth_addrs> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_icmp((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_icmp(Ptr<flow_rule> rule, Ptr<flow_match_icmp> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_ip((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_ip(Ptr<flow_rule> rule, Ptr<flow_match_ip> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_ipsec((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_ipsec(Ptr<flow_rule> rule, Ptr<flow_match_ipsec> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_ipv4_addrs((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_ipv4_addrs(Ptr<flow_rule> rule, Ptr<flow_match_ipv4_addrs> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_ipv6_addrs((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_ipv6_addrs(Ptr<flow_rule> rule, Ptr<flow_match_ipv6_addrs> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_l2tpv3((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_l2tpv3(Ptr<flow_rule> rule, Ptr<flow_match_l2tpv3> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_meta((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_meta(Ptr<flow_rule> rule, Ptr<flow_match_meta> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_mpls((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_mpls(Ptr<flow_rule> rule, Ptr<flow_match_mpls> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_ports((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_ports(Ptr<flow_rule> rule, Ptr<flow_match_ports> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_ports_range((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_ports_range(Ptr<flow_rule> rule, Ptr<flow_match_ports_range> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_pppoe((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_pppoe(Ptr<flow_rule> rule, Ptr<flow_match_pppoe> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_tcp((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_tcp(Ptr<flow_rule> rule, Ptr<flow_match_tcp> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_rule_match_vlan((const struct flow_rule*)$arg1, $arg2)")
    public static void flow_rule_match_vlan(Ptr<flow_rule> rule, Ptr<flow_match_vlan> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_limit_cpu_sysctl((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int flow_limit_cpu_sysctl(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_limit_table_len_sysctl((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int flow_limit_table_len_sysctl(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_dissector_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int flow_dissector_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)flow_dissector_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> flow_dissector_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="flow_dissector_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean flow_dissector_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct flow_indir_dev_info")
    @NotUsableInJava
    public static class flow_indir_dev_info
    extends Struct {
        public Ptr<?> data;
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<runtime.Qdisc> sch;
        public TcDefinitions.tc_setup_type type;
        public Ptr<?> cleanup;
        public ListDefinitions.list_head list;
        public flow_block_command command;
        public flow_block_binder_type binder_type;
        public Ptr<ListDefinitions.list_head> cb_list;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_indr_dev")
    @NotUsableInJava
    public static class flow_indr_dev
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> cb;
        public Ptr<?> cb_priv;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_l2tpv3")
    @NotUsableInJava
    public static class flow_match_l2tpv3
    extends Struct {
        public Ptr<flow_dissector_key_l2tpv3> key;
        public Ptr<flow_dissector_key_l2tpv3> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_pppoe")
    @NotUsableInJava
    public static class flow_match_pppoe
    extends Struct {
        public Ptr<flow_dissector_key_pppoe> key;
        public Ptr<flow_dissector_key_pppoe> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_ct")
    @NotUsableInJava
    public static class flow_match_ct
    extends Struct {
        public Ptr<flow_dissector_key_ct> key;
        public Ptr<flow_dissector_key_ct> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_enc_opts")
    @NotUsableInJava
    public static class flow_match_enc_opts
    extends Struct {
        public Ptr<flow_dissector_key_enc_opts> key;
        public Ptr<flow_dissector_key_enc_opts> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_enc_keyid")
    @NotUsableInJava
    public static class flow_match_enc_keyid
    extends Struct {
        public Ptr<flow_dissector_key_keyid> key;
        public Ptr<flow_dissector_key_keyid> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_mpls")
    @NotUsableInJava
    public static class flow_match_mpls
    extends Struct {
        public Ptr<flow_dissector_key_mpls> key;
        public Ptr<flow_dissector_key_mpls> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_ipsec")
    @NotUsableInJava
    public static class flow_match_ipsec
    extends Struct {
        public Ptr<flow_dissector_key_ipsec> key;
        public Ptr<flow_dissector_key_ipsec> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_icmp")
    @NotUsableInJava
    public static class flow_match_icmp
    extends Struct {
        public Ptr<flow_dissector_key_icmp> key;
        public Ptr<flow_dissector_key_icmp> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_ports_range")
    @NotUsableInJava
    public static class flow_match_ports_range
    extends Struct {
        public Ptr<flow_dissector_key_ports_range> key;
        public Ptr<flow_dissector_key_ports_range> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_control")
    @NotUsableInJava
    public static class flow_match_control
    extends Struct {
        public Ptr<flow_dissector_key_control> key;
        public Ptr<flow_dissector_key_control> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_basic")
    @NotUsableInJava
    public static class flow_match_basic
    extends Struct {
        public Ptr<flow_dissector_key_basic> key;
        public Ptr<flow_dissector_key_basic> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_meta")
    @NotUsableInJava
    public static class flow_match_meta
    extends Struct {
        public Ptr<flow_dissector_key_meta> key;
        public Ptr<flow_dissector_key_meta> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_ports_range")
    @NotUsableInJava
    public static class flow_dissector_key_ports_range
    extends Struct {
        @InlineUnion(value=34063)
        public @InlineUnion(value=34063) flow_dissector_key_ports tp;
        @InlineUnion(value=34063)
        public  @InlineUnion(value=34063) AnonDefinitions.anon_member_of_anon_member_of_flow_dissector_key_ports_range anon0$1;
    }

    @Type(noCCodeGeneration=true, cType="struct _flow_keys_digest_data")
    @NotUsableInJava
    public static class _flow_keys_digest_data
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short n_proto;
        public char ip_proto;
        public char padding;
        public @Unsigned @OriginalName(value="__be32") int ports;
        public @Unsigned @OriginalName(value="__be32") int src;
        public @Unsigned @OriginalName(value="__be32") int dst;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_keys_digest")
    @NotUsableInJava
    public static class flow_keys_digest
    extends Struct {
        public char @Size(value=16) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key")
    @NotUsableInJava
    public static class flow_dissector_key
    extends Struct {
        public flow_dissector_key_id key_id;
        public @Unsigned long offset;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_cfm")
    @NotUsableInJava
    public static class flow_dissector_key_cfm
    extends Struct {
        public char mdl_ver;
        public char opcode;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_ipsec")
    @NotUsableInJava
    public static class flow_dissector_key_ipsec
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int spi;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_l2tpv3")
    @NotUsableInJava
    public static class flow_dissector_key_l2tpv3
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int session_id;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_pppoe")
    @NotUsableInJava
    public static class flow_dissector_key_pppoe
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short session_id;
        public @Unsigned @OriginalName(value="__be16") short ppp_proto;
        public @Unsigned @OriginalName(value="__be16") short type;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_num_of_vlans")
    @NotUsableInJava
    public static class flow_dissector_key_num_of_vlans
    extends Struct {
        public char num_of_vlans;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_hash")
    @NotUsableInJava
    public static class flow_dissector_key_hash
    extends Struct {
        public @Unsigned int hash;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_ct")
    @NotUsableInJava
    public static class flow_dissector_key_ct
    extends Struct {
        public @Unsigned short ct_state;
        public @Unsigned short ct_zone;
        public @Unsigned int ct_mark;
        public @Unsigned int @Size(value=4) [] ct_labels;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_meta")
    @NotUsableInJava
    public static class flow_dissector_key_meta
    extends Struct {
        public int ingress_ifindex;
        public @Unsigned short ingress_iftype;
        public char l2_miss;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_enc_opts")
    @NotUsableInJava
    public static class flow_dissector_key_enc_opts
    extends Struct {
        public char @Size(value=255) [] data;
        public char len;
        public @Unsigned int dst_opt_type;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_mpls")
    @NotUsableInJava
    public static class flow_dissector_key_mpls
    extends Struct {
        public flow_dissector_mpls_lse @Size(value=7) [] ls;
        public char used_lses;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_mpls_lse")
    @NotUsableInJava
    public static class flow_dissector_mpls_lse
    extends Struct {
        public @Unsigned int mpls_ttl;
        public @Unsigned int mpls_bos;
        public @Unsigned int mpls_tc;
        public @Unsigned int mpls_label;
    }

    @Type(noCCodeGeneration=true, cType="enum flow_dissect_ret")
    public static enum flow_dissect_ret implements Enum<flow_dissect_ret>,
    TypedEnum<flow_dissect_ret, Integer>
    {
        FLOW_DISSECT_RET_OUT_GOOD,
        FLOW_DISSECT_RET_OUT_BAD,
        FLOW_DISSECT_RET_PROTO_AGAIN,
        FLOW_DISSECT_RET_IPPROTO_AGAIN,
        FLOW_DISSECT_RET_CONTINUE;

    }

    @Type(noCCodeGeneration=true, cType="enum flow_dissector_ctrl_flags")
    public static enum flow_dissector_ctrl_flags implements Enum<flow_dissector_ctrl_flags>,
    TypedEnum<flow_dissector_ctrl_flags, Integer>
    {
        FLOW_DIS_IS_FRAGMENT,
        FLOW_DIS_FIRST_FRAG,
        FLOW_DIS_F_TUNNEL_CSUM,
        FLOW_DIS_F_TUNNEL_DONT_FRAGMENT,
        FLOW_DIS_F_TUNNEL_OAM,
        FLOW_DIS_F_TUNNEL_CRIT_OPT,
        FLOW_DIS_ENCAPSULATION;

    }

    @Type(noCCodeGeneration=true, cType="struct flow_keys_basic")
    @NotUsableInJava
    public static class flow_keys_basic
    extends Struct {
        public flow_dissector_key_control control;
        public flow_dissector_key_basic basic;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_keys")
    @NotUsableInJava
    public static class flow_keys
    extends Struct {
        public flow_dissector_key_control control;
        public flow_dissector_key_basic basic;
        public flow_dissector_key_tags tags;
        public flow_dissector_key_vlan vlan;
        public flow_dissector_key_vlan cvlan;
        public flow_dissector_key_keyid keyid;
        public flow_dissector_key_ports ports;
        public flow_dissector_key_icmp icmp;
        public flow_dissector_key_addrs addrs;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_icmp")
    @NotUsableInJava
    public static class flow_dissector_key_icmp
    extends Struct {
        public AnonDefinitions.anon_member_of_flow_dissector_key_icmp anon0;
        public @Unsigned short id;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_addrs")
    @NotUsableInJava
    public static class flow_dissector_key_addrs
    extends Struct {
        @InlineUnion(value=25645)
        public @InlineUnion(value=25645) flow_dissector_key_ipv4_addrs v4addrs;
        @InlineUnion(value=25645)
        public @InlineUnion(value=25645) flow_dissector_key_ipv6_addrs v6addrs;
        @InlineUnion(value=25645)
        public @InlineUnion(value=25645) flow_dissector_key_tipc tipckey;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_tipc")
    @NotUsableInJava
    public static class flow_dissector_key_tipc
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int key;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_keyid")
    @NotUsableInJava
    public static class flow_dissector_key_keyid
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int keyid;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_tags")
    @NotUsableInJava
    public static class flow_dissector_key_tags
    extends Struct {
        public @Unsigned int flow_label;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_basic")
    @NotUsableInJava
    public static class flow_dissector_key_basic
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short n_proto;
        public char ip_proto;
        public char padding;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_control")
    @NotUsableInJava
    public static class flow_dissector_key_control
    extends Struct {
        public @Unsigned short thoff;
        public @Unsigned short addr_type;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_offload_action")
    @NotUsableInJava
    public static class flow_offload_action
    extends Struct {
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
        public misc.offload_act_command command;
        public flow_action_id id;
        public @Unsigned int index;
        public @Unsigned long cookie;
        public flow_stats stats;
        public flow_action action;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_block_cb")
    @NotUsableInJava
    public static class flow_block_cb
    extends Struct {
        public ListDefinitions.list_head driver_list;
        public ListDefinitions.list_head list;
        public Ptr<?> cb;
        public Ptr<?> cb_ident;
        public Ptr<?> cb_priv;
        public Ptr<?> release;
        public flow_block_indr indr;
        public @Unsigned int refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_block_indr")
    @NotUsableInJava
    public static class flow_block_indr
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<runtime.Qdisc> sch;
        public flow_block_binder_type binder_type;
        public Ptr<?> data;
        public Ptr<?> cb_priv;
        public Ptr<?> cleanup;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_block_offload")
    @NotUsableInJava
    public static class flow_block_offload
    extends Struct {
        public flow_block_command command;
        public flow_block_binder_type binder_type;
        public boolean block_shared;
        public boolean unlocked_driver_cb;
        public Ptr<runtime.net> net;
        public Ptr<flow_block> block;
        public ListDefinitions.list_head cb_list;
        public Ptr<ListDefinitions.list_head> driver_block_list;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
        public Ptr<runtime.Qdisc> sch;
        public Ptr<ListDefinitions.list_head> cb_list_head;
    }

    @Type(noCCodeGeneration=true, cType="enum flow_block_binder_type")
    public static enum flow_block_binder_type implements Enum<flow_block_binder_type>,
    TypedEnum<flow_block_binder_type, Integer>
    {
        FLOW_BLOCK_BINDER_TYPE_UNSPEC,
        FLOW_BLOCK_BINDER_TYPE_CLSACT_INGRESS,
        FLOW_BLOCK_BINDER_TYPE_CLSACT_EGRESS,
        FLOW_BLOCK_BINDER_TYPE_RED_EARLY_DROP,
        FLOW_BLOCK_BINDER_TYPE_RED_MARK;

    }

    @Type(noCCodeGeneration=true, cType="enum flow_block_command")
    public static enum flow_block_command implements Enum<flow_block_command>,
    TypedEnum<flow_block_command, Integer>
    {
        FLOW_BLOCK_BIND,
        FLOW_BLOCK_UNBIND;

    }

    @Type(noCCodeGeneration=true, cType="struct flow_cls_offload")
    @NotUsableInJava
    public static class flow_cls_offload
    extends Struct {
        public flow_cls_common_offload common;
        public flow_cls_command command;
        public boolean use_act_stats;
        public @Unsigned long cookie;
        public Ptr<flow_rule> rule;
        public flow_stats stats;
        public @Unsigned int classid;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_cls_common_offload")
    @NotUsableInJava
    public static class flow_cls_common_offload
    extends Struct {
        public @Unsigned int chain_index;
        public @Unsigned @OriginalName(value="__be16") short protocol;
        public @Unsigned int prio;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
    }

    @Type(noCCodeGeneration=true, cType="enum flow_cls_command")
    public static enum flow_cls_command implements Enum<flow_cls_command>,
    TypedEnum<flow_cls_command, Integer>
    {
        FLOW_CLS_REPLACE,
        FLOW_CLS_DESTROY,
        FLOW_CLS_STATS,
        FLOW_CLS_TMPLT_CREATE,
        FLOW_CLS_TMPLT_DESTROY;

    }

    @Type(noCCodeGeneration=true, cType="struct flow_stats")
    @NotUsableInJava
    public static class flow_stats
    extends Struct {
        public @Unsigned long pkts;
        public @Unsigned long bytes;
        public @Unsigned long drops;
        public @Unsigned long lastused;
        public flow_action_hw_stats used_hw_stats;
        public boolean used_hw_stats_valid;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_rule")
    @NotUsableInJava
    public static class flow_rule
    extends Struct {
        public flow_match match;
        public flow_action action;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_action")
    @NotUsableInJava
    public static class flow_action
    extends Struct {
        public @Unsigned int num_entries;
        public flow_action_entry @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_action_entry")
    @NotUsableInJava
    public static class flow_action_entry
    extends Struct {
        public flow_action_id id;
        public @Unsigned int hw_index;
        public @Unsigned long cookie;
        public @Unsigned long miss_cookie;
        public flow_action_hw_stats hw_stats;
        public @OriginalName(value="action_destr") Ptr<?> destructor;
        public Ptr<?> destructor_priv;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) @Unsigned int chain_index;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) Ptr<NetDefinitions.net_device> dev;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) VlanDefinitions.vlan_of_anon_member_of_flow_action_entry vlan;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) VlanDefinitions.vlan_push_eth_of_anon_member_of_flow_action_entry vlan_push_eth;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) misc.mangle_of_anon_member_of_flow_action_entry mangle;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) Ptr<IpDefinitions.ip_tunnel_info> tunnel;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) @Unsigned int csum_flags;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) @Unsigned int mark;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) @Unsigned short ptype;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) @Unsigned short rx_queue;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) @Unsigned int priority;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) QueueDefinitions.queue_of_anon_member_of_flow_action_entry queue;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) misc.sample_of_anon_member_of_flow_action_entry sample;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) misc.police_of_anon_member_of_flow_action_entry police;
        @InlineUnion(value=21126)
        public  @InlineUnion(value=21126) CtDefinitions.ct_of_anon_member_of_flow_action_entry ct;
        @InlineUnion(value=21126)
        public  @InlineUnion(value=21126) CtDefinitions.ct_metadata_of_anon_member_of_flow_action_entry ct_metadata;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) misc.mpls_push_of_anon_member_of_flow_action_entry mpls_push;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) misc.mpls_pop_of_anon_member_of_flow_action_entry mpls_pop;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) misc.mpls_mangle_of_anon_member_of_flow_action_entry mpls_mangle;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) misc.gate_of_anon_member_of_flow_action_entry gate;
        @InlineUnion(value=21126)
        public @InlineUnion(value=21126) misc.pppoe_of_anon_member_of_flow_action_entry pppoe;
        public Ptr<flow_action_cookie> user_cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_action_cookie")
    @NotUsableInJava
    public static class flow_action_cookie
    extends Struct {
        public @Unsigned int cookie_len;
        public char @Size(value=0) [] cookie;
    }

    @Type(noCCodeGeneration=true, cType="enum flow_action_hw_stats")
    public static enum flow_action_hw_stats implements Enum<flow_action_hw_stats>,
    TypedEnum<flow_action_hw_stats, Integer>
    {
        FLOW_ACTION_HW_STATS_IMMEDIATE,
        FLOW_ACTION_HW_STATS_DELAYED,
        FLOW_ACTION_HW_STATS_ANY,
        FLOW_ACTION_HW_STATS_DISABLED,
        FLOW_ACTION_HW_STATS_DONT_CARE;

    }

    @Type(noCCodeGeneration=true, cType="enum flow_action_mangle_base")
    public static enum flow_action_mangle_base implements Enum<flow_action_mangle_base>,
    TypedEnum<flow_action_mangle_base, Integer>
    {
        FLOW_ACT_MANGLE_UNSPEC,
        FLOW_ACT_MANGLE_HDR_TYPE_ETH,
        FLOW_ACT_MANGLE_HDR_TYPE_IP4,
        FLOW_ACT_MANGLE_HDR_TYPE_IP6,
        FLOW_ACT_MANGLE_HDR_TYPE_TCP,
        FLOW_ACT_MANGLE_HDR_TYPE_UDP;

    }

    @Type(noCCodeGeneration=true, cType="enum flow_action_id")
    public static enum flow_action_id implements Enum<flow_action_id>,
    TypedEnum<flow_action_id, Integer>
    {
        FLOW_ACTION_ACCEPT,
        FLOW_ACTION_DROP,
        FLOW_ACTION_TRAP,
        FLOW_ACTION_GOTO,
        FLOW_ACTION_REDIRECT,
        FLOW_ACTION_MIRRED,
        FLOW_ACTION_REDIRECT_INGRESS,
        FLOW_ACTION_MIRRED_INGRESS,
        FLOW_ACTION_VLAN_PUSH,
        FLOW_ACTION_VLAN_POP,
        FLOW_ACTION_VLAN_MANGLE,
        FLOW_ACTION_TUNNEL_ENCAP,
        FLOW_ACTION_TUNNEL_DECAP,
        FLOW_ACTION_MANGLE,
        FLOW_ACTION_ADD,
        FLOW_ACTION_CSUM,
        FLOW_ACTION_MARK,
        FLOW_ACTION_PTYPE,
        FLOW_ACTION_PRIORITY,
        FLOW_ACTION_RX_QUEUE_MAPPING,
        FLOW_ACTION_WAKE,
        FLOW_ACTION_QUEUE,
        FLOW_ACTION_SAMPLE,
        FLOW_ACTION_POLICE,
        FLOW_ACTION_CT,
        FLOW_ACTION_CT_METADATA,
        FLOW_ACTION_MPLS_PUSH,
        FLOW_ACTION_MPLS_POP,
        FLOW_ACTION_MPLS_MANGLE,
        FLOW_ACTION_GATE,
        FLOW_ACTION_PPPOE_PUSH,
        FLOW_ACTION_JUMP,
        FLOW_ACTION_PIPE,
        FLOW_ACTION_VLAN_PUSH_ETH,
        FLOW_ACTION_VLAN_POP_ETH,
        FLOW_ACTION_CONTINUE,
        NUM_FLOW_ACTIONS;

    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_tcp")
    @NotUsableInJava
    public static class flow_match_tcp
    extends Struct {
        public Ptr<flow_dissector_key_tcp> key;
        public Ptr<flow_dissector_key_tcp> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_ports")
    @NotUsableInJava
    public static class flow_match_ports
    extends Struct {
        public Ptr<flow_dissector_key_ports> key;
        public Ptr<flow_dissector_key_ports> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_ip")
    @NotUsableInJava
    public static class flow_match_ip
    extends Struct {
        public Ptr<flow_dissector_key_ip> key;
        public Ptr<flow_dissector_key_ip> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_ipv6_addrs")
    @NotUsableInJava
    public static class flow_match_ipv6_addrs
    extends Struct {
        public Ptr<flow_dissector_key_ipv6_addrs> key;
        public Ptr<flow_dissector_key_ipv6_addrs> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_ipv4_addrs")
    @NotUsableInJava
    public static class flow_match_ipv4_addrs
    extends Struct {
        public Ptr<flow_dissector_key_ipv4_addrs> key;
        public Ptr<flow_dissector_key_ipv4_addrs> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_arp")
    @NotUsableInJava
    public static class flow_match_arp
    extends Struct {
        public Ptr<flow_dissector_key_arp> key;
        public Ptr<flow_dissector_key_arp> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_vlan")
    @NotUsableInJava
    public static class flow_match_vlan
    extends Struct {
        public Ptr<flow_dissector_key_vlan> key;
        public Ptr<flow_dissector_key_vlan> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match_eth_addrs")
    @NotUsableInJava
    public static class flow_match_eth_addrs
    extends Struct {
        public Ptr<flow_dissector_key_eth_addrs> key;
        public Ptr<flow_dissector_key_eth_addrs> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_match")
    @NotUsableInJava
    public static class flow_match
    extends Struct {
        public Ptr<flow_dissector> dissector;
        public Ptr<?> mask;
        public Ptr<?> key;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector")
    @NotUsableInJava
    public static class flow_dissector
    extends Struct {
        public @Unsigned long used_keys;
        public @Unsigned short @Size(value=33) [] offset;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_ip")
    @NotUsableInJava
    public static class flow_dissector_key_ip
    extends Struct {
        public char tos;
        public char ttl;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_tcp")
    @NotUsableInJava
    public static class flow_dissector_key_tcp
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short flags;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_eth_addrs")
    @NotUsableInJava
    public static class flow_dissector_key_eth_addrs
    extends Struct {
        public char @Size(value=6) [] dst;
        public char @Size(value=6) [] src;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_ports")
    @NotUsableInJava
    public static class flow_dissector_key_ports
    extends Struct {
        @InlineUnion(value=21078)
        public @InlineUnion(value=21078) @Unsigned @OriginalName(value="__be32") int ports;
        @InlineUnion(value=21078)
        public  @InlineUnion(value=21078) AnonDefinitions.anon_member_of_anon_member_of_flow_dissector_key_ports anon0$1;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_arp")
    @NotUsableInJava
    public static class flow_dissector_key_arp
    extends Struct {
        public @Unsigned int sip;
        public @Unsigned int tip;
        public char op;
        public char @Size(value=6) [] sha;
        public char @Size(value=6) [] tha;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_ipv6_addrs")
    @NotUsableInJava
    public static class flow_dissector_key_ipv6_addrs
    extends Struct {
        public In6Definitions.in6_addr src;
        public In6Definitions.in6_addr dst;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_ipv4_addrs")
    @NotUsableInJava
    public static class flow_dissector_key_ipv4_addrs
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int src;
        public @Unsigned @OriginalName(value="__be32") int dst;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_dissector_key_vlan")
    @NotUsableInJava
    public static class flow_dissector_key_vlan
    extends Struct {
        @InlineUnion(value=21072)
        public  @InlineUnion(value=21072) AnonDefinitions.anon_member_of_anon_member_of_flow_dissector_key_vlan anon0$0;
        @InlineUnion(value=21072)
        public @InlineUnion(value=21072) @Unsigned @OriginalName(value="__be16") short vlan_tci;
        public @Unsigned @OriginalName(value="__be16") short vlan_tpid;
        public @Unsigned @OriginalName(value="__be16") short vlan_eth_type;
        public @Unsigned short padding;
    }

    @Type(noCCodeGeneration=true, cType="struct flow_block")
    @NotUsableInJava
    public static class flow_block
    extends Struct {
        public ListDefinitions.list_head cb_list;
    }

    @Type(noCCodeGeneration=true, cType="enum flow_action_hw_stats_bit")
    public static enum flow_action_hw_stats_bit implements Enum<flow_action_hw_stats_bit>,
    TypedEnum<flow_action_hw_stats_bit, Integer>
    {
        FLOW_ACTION_HW_STATS_IMMEDIATE_BIT,
        FLOW_ACTION_HW_STATS_DELAYED_BIT,
        FLOW_ACTION_HW_STATS_DISABLED_BIT,
        FLOW_ACTION_HW_STATS_NUM_BITS;

    }

    @Type(noCCodeGeneration=true, cType="struct { spinlock lock; _Bool stopped; _Bool tco_stopped; }")
    @NotUsableInJava
    public static class flow_of_tty_struct
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public boolean stopped;
        public boolean tco_stopped;
    }

    @Type(noCCodeGeneration=true, cType="enum flow_dissector_key_id")
    public static enum flow_dissector_key_id implements Enum<flow_dissector_key_id>,
    TypedEnum<flow_dissector_key_id, Integer>
    {
        FLOW_DISSECTOR_KEY_CONTROL,
        FLOW_DISSECTOR_KEY_BASIC,
        FLOW_DISSECTOR_KEY_IPV4_ADDRS,
        FLOW_DISSECTOR_KEY_IPV6_ADDRS,
        FLOW_DISSECTOR_KEY_PORTS,
        FLOW_DISSECTOR_KEY_PORTS_RANGE,
        FLOW_DISSECTOR_KEY_ICMP,
        FLOW_DISSECTOR_KEY_ETH_ADDRS,
        FLOW_DISSECTOR_KEY_TIPC,
        FLOW_DISSECTOR_KEY_ARP,
        FLOW_DISSECTOR_KEY_VLAN,
        FLOW_DISSECTOR_KEY_FLOW_LABEL,
        FLOW_DISSECTOR_KEY_GRE_KEYID,
        FLOW_DISSECTOR_KEY_MPLS_ENTROPY,
        FLOW_DISSECTOR_KEY_ENC_KEYID,
        FLOW_DISSECTOR_KEY_ENC_IPV4_ADDRS,
        FLOW_DISSECTOR_KEY_ENC_IPV6_ADDRS,
        FLOW_DISSECTOR_KEY_ENC_CONTROL,
        FLOW_DISSECTOR_KEY_ENC_PORTS,
        FLOW_DISSECTOR_KEY_MPLS,
        FLOW_DISSECTOR_KEY_TCP,
        FLOW_DISSECTOR_KEY_IP,
        FLOW_DISSECTOR_KEY_CVLAN,
        FLOW_DISSECTOR_KEY_ENC_IP,
        FLOW_DISSECTOR_KEY_ENC_OPTS,
        FLOW_DISSECTOR_KEY_META,
        FLOW_DISSECTOR_KEY_CT,
        FLOW_DISSECTOR_KEY_HASH,
        FLOW_DISSECTOR_KEY_NUM_OF_VLANS,
        FLOW_DISSECTOR_KEY_PPPOE,
        FLOW_DISSECTOR_KEY_L2TPV3,
        FLOW_DISSECTOR_KEY_CFM,
        FLOW_DISSECTOR_KEY_IPSEC,
        FLOW_DISSECTOR_KEY_MAX;

    }
}

