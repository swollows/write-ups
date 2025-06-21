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
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.CalipsoDefinitions;
import me.bechberger.ebpf.runtime.CipsoDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class NetlblDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AuditDefinitions.audit_buffer> netlbl_audit_start_common(int type2, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cipsov4_add(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cipsov4_add_common(Ptr<GenlDefinitions.genl_info> info2, Ptr<CipsoDefinitions.cipso_v4_doi> doi_def) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cipsov4_add_std(Ptr<GenlDefinitions.genl_info> info2, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cipsov4_genl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cipsov4_list(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cipsov4_listall(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cipsov4_listall_cb(Ptr<CipsoDefinitions.cipso_v4_doi> doi_def, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cipsov4_remove(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cipsov4_remove_cb(Ptr<netlbl_dom_map> entry, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_netlink_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_af4list_add(Ptr<netlbl_af4list> entry, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_af4list_audit_addr($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void netlbl_af4list_audit_addr(Ptr<AuditDefinitions.audit_buffer> audit_buf, int src, String dev, @Unsigned @OriginalName(value="__be32") int addr2, @Unsigned @OriginalName(value="__be32") int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<netlbl_af4list> netlbl_af4list_remove(@Unsigned @OriginalName(value="__be32") int addr2, @Unsigned @OriginalName(value="__be32") int mask, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_af4list_remove_entry(Ptr<netlbl_af4list> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<netlbl_af4list> netlbl_af4list_search(@Unsigned @OriginalName(value="__be32") int addr2, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<netlbl_af4list> netlbl_af4list_search_exact(@Unsigned @OriginalName(value="__be32") int addr2, @Unsigned @OriginalName(value="__be32") int mask, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_af6list_add(Ptr<netlbl_af6list> entry, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_af6list_audit_addr($arg1, $arg2, (const u8*)$arg3, (const struct in6_addr*)$arg4, (const struct in6_addr*)$arg5)")
    public static void netlbl_af6list_audit_addr(Ptr<AuditDefinitions.audit_buffer> audit_buf, int src, String dev, Ptr<In6Definitions.in6_addr> addr2, Ptr<In6Definitions.in6_addr> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_af6list_remove((const struct in6_addr*)$arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static Ptr<netlbl_af6list> netlbl_af6list_remove(Ptr<In6Definitions.in6_addr> addr2, Ptr<In6Definitions.in6_addr> mask, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_af6list_remove_entry(Ptr<netlbl_af6list> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_af6list_search((const struct in6_addr*)$arg1, $arg2)")
    public static Ptr<netlbl_af6list> netlbl_af6list_search(Ptr<In6Definitions.in6_addr> addr2, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_af6list_search_exact((const struct in6_addr*)$arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static Ptr<netlbl_af6list> netlbl_af6list_search_exact(Ptr<In6Definitions.in6_addr> addr2, Ptr<In6Definitions.in6_addr> mask, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_domhsh_add(Ptr<netlbl_dom_map> entry, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_domhsh_add_default(Ptr<netlbl_dom_map> entry, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_domhsh_audit_add(Ptr<netlbl_dom_map> entry, Ptr<netlbl_af4list> addr4, Ptr<netlbl_af6list> addr6, int result, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_domhsh_free_entry(Ptr<misc.callback_head> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_getentry((const u8*)$arg1, $arg2)")
    public static Ptr<netlbl_dom_map> netlbl_domhsh_getentry(String domain, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_getentry_af4((const u8*)$arg1, $arg2)")
    public static Ptr<netlbl_dommap_def> netlbl_domhsh_getentry_af4(String domain, @Unsigned @OriginalName(value="__be32") int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_getentry_af6((const u8*)$arg1, (const struct in6_addr*)$arg2)")
    public static Ptr<netlbl_dommap_def> netlbl_domhsh_getentry_af6(String domain, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_hash((const u8*)$arg1)")
    public static @Unsigned int netlbl_domhsh_hash(String key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_domhsh_init(@Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_remove((const u8*)$arg1, $arg2, $arg3)")
    public static int netlbl_domhsh_remove(String domain, @Unsigned short family, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_remove_af4((const u8*)$arg1, (const struct in_addr*)$arg2, (const struct in_addr*)$arg3, $arg4)")
    public static int netlbl_domhsh_remove_af4(String domain, Ptr<InDefinitions.in_addr> addr2, Ptr<InDefinitions.in_addr> mask, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_remove_af6((const u8*)$arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static int netlbl_domhsh_remove_af6(String domain, Ptr<In6Definitions.in6_addr> addr2, Ptr<In6Definitions.in6_addr> mask, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_domhsh_remove_default(@Unsigned short family, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_domhsh_remove_entry(Ptr<netlbl_dom_map> entry, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_search((const u8*)$arg1, $arg2)")
    public static Ptr<netlbl_dom_map> netlbl_domhsh_search(String domain, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_search_def((const u8*)$arg1, $arg2)")
    public static Ptr<netlbl_dom_map> netlbl_domhsh_search_def(String domain, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_validate((const struct netlbl_dom_map*)$arg1)")
    public static int netlbl_domhsh_validate(Ptr<netlbl_dom_map> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_domhsh_walk($arg1, $arg2, (int (*)(struct netlbl_dom_map*, void*))$arg3, $arg4)")
    public static int netlbl_domhsh_walk(Ptr<@Unsigned Integer> skip_bkt, Ptr<@Unsigned Integer> skip_chain, Ptr<?> callback2, Ptr<?> cb_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_add(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_add_common(Ptr<GenlDefinitions.genl_info> info2, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_adddef(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_genl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_listall(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_listall_cb(Ptr<netlbl_dom_map> entry, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_listdef(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_listentry(Ptr<SkDefinitions.sk_buff> skb, Ptr<netlbl_dom_map> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_protocols(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_remove(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_removedef(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_mgmt_version(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<netlbl_lsm_catmap> _netlbl_catmap_getnode(Ptr<Ptr<netlbl_lsm_catmap>> catmap, @Unsigned int offset, @Unsigned int cm_flags, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AuditDefinitions.audit_buffer> netlbl_audit_start(int type2, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_bitmap_setbit(String bitmap2, @Unsigned int bit, char state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_bitmap_walk((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int netlbl_bitmap_walk(String bitmap2, @Unsigned int bitmap_len, @Unsigned int offset, char state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_cache_add((const struct sk_buff*)$arg1, $arg2, (const struct netlbl_lsm_secattr*)$arg3)")
    public static int netlbl_cache_add(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_cache_invalidate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_calipso_add(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_calipso_genl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_calipso_list(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_calipso_listall(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_calipso_listall_cb(Ptr<CalipsoDefinitions.calipso_doi> doi_def, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct netlbl_calipso_ops*)netlbl_calipso_ops_register((const struct netlbl_calipso_ops*)$arg1))")
    public static Ptr<netlbl_calipso_ops> netlbl_calipso_ops_register(Ptr<netlbl_calipso_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_calipso_remove(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_calipso_remove_cb(Ptr<netlbl_dom_map> entry, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_catmap_getlong(Ptr<netlbl_lsm_catmap> catmap, Ptr<@Unsigned Integer> offset, Ptr<@Unsigned Long> bitmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_catmap_setbit(Ptr<Ptr<netlbl_lsm_catmap>> catmap, @Unsigned int bit, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_catmap_setlong(Ptr<Ptr<netlbl_lsm_catmap>> catmap, @Unsigned int offset, @Unsigned long bitmap2, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_catmap_setrng(Ptr<Ptr<netlbl_lsm_catmap>> catmap, @Unsigned int start, @Unsigned int end, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_catmap_walk(Ptr<netlbl_lsm_catmap> catmap, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_catmap_walkrng(Ptr<netlbl_lsm_catmap> catmap, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cfg_calipso_add(Ptr<CalipsoDefinitions.calipso_doi> doi_def, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_cfg_calipso_del(@Unsigned int doi, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_cfg_calipso_map_add($arg1, (const u8*)$arg2, (const struct in6_addr*)$arg3, (const struct in6_addr*)$arg4, $arg5)")
    public static int netlbl_cfg_calipso_map_add(@Unsigned int doi, String domain, Ptr<In6Definitions.in6_addr> addr2, Ptr<In6Definitions.in6_addr> mask, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_cfg_cipsov4_add(Ptr<CipsoDefinitions.cipso_v4_doi> doi_def, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_cfg_cipsov4_del(@Unsigned int doi, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_cfg_cipsov4_map_add($arg1, (const u8*)$arg2, (const struct in_addr*)$arg3, (const struct in_addr*)$arg4, $arg5)")
    public static int netlbl_cfg_cipsov4_map_add(@Unsigned int doi, String domain, Ptr<InDefinitions.in_addr> addr2, Ptr<InDefinitions.in_addr> mask, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_cfg_map_del((const u8*)$arg1, $arg2, (const void*)$arg3, (const void*)$arg4, $arg5)")
    public static int netlbl_cfg_map_del(String domain, @Unsigned short family, Ptr<?> addr2, Ptr<?> mask, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_cfg_unlbl_map_add((const u8*)$arg1, $arg2, (const void*)$arg3, (const void*)$arg4, $arg5)")
    public static int netlbl_cfg_unlbl_map_add(String domain, @Unsigned short family, Ptr<?> addr2, Ptr<?> mask, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_cfg_unlbl_static_add($arg1, (const u8*)$arg2, (const void*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static int netlbl_cfg_unlbl_static_add(Ptr<runtime.net> net2, String dev_name, Ptr<?> addr2, Ptr<?> mask, @Unsigned short family, @Unsigned int secid, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_cfg_unlbl_static_del($arg1, (const u8*)$arg2, (const void*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int netlbl_cfg_unlbl_static_del(Ptr<runtime.net> net2, String dev_name, Ptr<?> addr2, Ptr<?> mask, @Unsigned short family, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_conn_setattr($arg1, $arg2, (const struct netlbl_lsm_secattr*)$arg3)")
    public static int netlbl_conn_setattr(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> addr2, Ptr<netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_req_delattr(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_req_setattr($arg1, (const struct netlbl_lsm_secattr*)$arg2)")
    public static int netlbl_req_setattr(Ptr<RequestDefinitions.request_sock> req2, Ptr<netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean netlbl_sk_lock_check(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_skbuff_err(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, int error, int gateway) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_skbuff_getattr((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static int netlbl_skbuff_getattr(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_skbuff_setattr($arg1, $arg2, (const struct netlbl_lsm_secattr*)$arg3)")
    public static int netlbl_skbuff_setattr(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_sock_delattr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_sock_getattr(Ptr<runtime.sock> sk, Ptr<netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_sock_setattr($arg1, $arg2, (const struct netlbl_lsm_secattr*)$arg3, $arg4)")
    public static int netlbl_sock_setattr(Ptr<runtime.sock> sk, @Unsigned short family, Ptr<netlbl_lsm_secattr> secattr, boolean sk_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_accept(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_unlabel_acceptflg_set(char value, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_addrinfo_get(Ptr<GenlDefinitions.genl_info> info2, Ptr<Ptr<?>> addr2, Ptr<Ptr<?>> mask, Ptr<@Unsigned Integer> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_defconf() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_genl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_unlabel_getattr((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static int netlbl_unlabel_getattr(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_init(@Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_list(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_staticadd(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_staticadddef(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_staticlist(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_unlabel_staticlist_gen($arg1, (const struct netlbl_unlhsh_iface*)$arg2, (const struct netlbl_unlhsh_addr4*)$arg3, (const struct netlbl_unlhsh_addr6*)$arg4, $arg5)")
    public static int netlbl_unlabel_staticlist_gen(@Unsigned int cmd, Ptr<netlbl_unlhsh_iface> iface, Ptr<netlbl_unlhsh_addr4> addr4, Ptr<netlbl_unlhsh_addr6> addr6, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_staticlistdef(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_staticremove(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlabel_staticremovedef(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_unlhsh_add($arg1, (const u8*)$arg2, (const void*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static int netlbl_unlhsh_add(Ptr<runtime.net> net2, String dev_name, Ptr<?> addr2, Ptr<?> mask, @Unsigned int addr_len, @Unsigned int secid, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netlbl_unlhsh_free_iface(Ptr<misc.callback_head> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netlbl_unlhsh_netdev_handler(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netlbl_unlhsh_remove($arg1, (const u8*)$arg2, (const void*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int netlbl_unlhsh_remove(Ptr<runtime.net> net2, String dev_name, Ptr<?> addr2, Ptr<?> mask, @Unsigned int addr_len, Ptr<netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<netlbl_unlhsh_iface> netlbl_unlhsh_search_iface(int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_calipso_doiwalk_arg")
    @NotUsableInJava
    public static class netlbl_calipso_doiwalk_arg
    extends Struct {
        public Ptr<NetlinkDefinitions.netlink_callback> nl_cb;
        public Ptr<SkDefinitions.sk_buff> skb;
        public @Unsigned int seq;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_domhsh_tbl")
    @NotUsableInJava
    public static class netlbl_domhsh_tbl
    extends Struct {
        public Ptr<ListDefinitions.list_head> tbl;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_domaddr6_map")
    @NotUsableInJava
    public static class netlbl_domaddr6_map
    extends Struct {
        public netlbl_dommap_def def;
        public netlbl_af6list list;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_domaddr4_map")
    @NotUsableInJava
    public static class netlbl_domaddr4_map
    extends Struct {
        public netlbl_dommap_def def;
        public netlbl_af4list list;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_domhsh_walk_arg")
    @NotUsableInJava
    public static class netlbl_domhsh_walk_arg
    extends Struct {
        public Ptr<netlbl_audit> audit_info;
        public @Unsigned int doi;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_cipsov4_doiwalk_arg")
    @NotUsableInJava
    public static class netlbl_cipsov4_doiwalk_arg
    extends Struct {
        public Ptr<NetlinkDefinitions.netlink_callback> nl_cb;
        public Ptr<SkDefinitions.sk_buff> skb;
        public @Unsigned int seq;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_unlhsh_walk_arg")
    @NotUsableInJava
    public static class netlbl_unlhsh_walk_arg
    extends Struct {
        public Ptr<NetlinkDefinitions.netlink_callback> nl_cb;
        public Ptr<SkDefinitions.sk_buff> skb;
        public @Unsigned int seq;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_unlhsh_iface")
    @NotUsableInJava
    public static class netlbl_unlhsh_iface
    extends Struct {
        public int ifindex;
        public ListDefinitions.list_head addr4_list;
        public ListDefinitions.list_head addr6_list;
        public @Unsigned int valid;
        public ListDefinitions.list_head list;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_unlhsh_addr6")
    @NotUsableInJava
    public static class netlbl_unlhsh_addr6
    extends Struct {
        public @Unsigned int secid;
        public netlbl_af6list list;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_unlhsh_addr4")
    @NotUsableInJava
    public static class netlbl_unlhsh_addr4
    extends Struct {
        public @Unsigned int secid;
        public netlbl_af4list list;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_unlhsh_tbl")
    @NotUsableInJava
    public static class netlbl_unlhsh_tbl
    extends Struct {
        public Ptr<ListDefinitions.list_head> tbl;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_dom_map")
    @NotUsableInJava
    public static class netlbl_dom_map
    extends Struct {
        public String domain;
        public netlbl_dommap_def def;
        public @Unsigned short family;
        public @Unsigned int valid;
        public ListDefinitions.list_head list;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_dommap_def")
    @NotUsableInJava
    public static class netlbl_dommap_def
    extends Struct {
        public @Unsigned int type;
        @InlineUnion(value=26997)
        public @InlineUnion(value=26997) Ptr<netlbl_domaddr_map> addrsel;
        @InlineUnion(value=26997)
        public @InlineUnion(value=26997) Ptr<CipsoDefinitions.cipso_v4_doi> cipso;
        @InlineUnion(value=26997)
        public @InlineUnion(value=26997) Ptr<CalipsoDefinitions.calipso_doi> calipso;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_domaddr_map")
    @NotUsableInJava
    public static class netlbl_domaddr_map
    extends Struct {
        public ListDefinitions.list_head list4;
        public ListDefinitions.list_head list6;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_af6list")
    @NotUsableInJava
    public static class netlbl_af6list
    extends Struct {
        public In6Definitions.in6_addr addr;
        public In6Definitions.in6_addr mask;
        public @Unsigned int valid;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_af4list")
    @NotUsableInJava
    public static class netlbl_af4list
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int addr;
        public @Unsigned @OriginalName(value="__be32") int mask;
        public @Unsigned int valid;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_calipso_ops")
    @NotUsableInJava
    public static class netlbl_calipso_ops
    extends Struct {
        public Ptr<?> doi_add;
        public Ptr<?> doi_free;
        public Ptr<?> doi_remove;
        public Ptr<?> doi_getdef;
        public Ptr<?> doi_putdef;
        public Ptr<?> doi_walk;
        public Ptr<?> sock_getattr;
        public Ptr<?> sock_setattr;
        public Ptr<?> sock_delattr;
        public Ptr<?> req_setattr;
        public Ptr<?> req_delattr;
        public Ptr<?> opt_getattr;
        public Ptr<?> skbuff_optptr;
        public Ptr<?> skbuff_setattr;
        public Ptr<?> skbuff_delattr;
        public Ptr<?> cache_invalidate;
        public Ptr<?> cache_add;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_audit")
    @NotUsableInJava
    public static class netlbl_audit
    extends Struct {
        public @Unsigned int secid;
        public misc.kuid_t loginuid;
        public @Unsigned int sessionid;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_lsm_secattr")
    @NotUsableInJava
    public static class netlbl_lsm_secattr
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int type;
        public String domain;
        public Ptr<netlbl_lsm_cache> cache;
        public misc.attr_of_netlbl_lsm_secattr attr;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_lsm_catmap")
    @NotUsableInJava
    public static class netlbl_lsm_catmap
    extends Struct {
        public @Unsigned int startbit;
        public @Unsigned long @Size(value=4) [] bitmap;
        public Ptr<netlbl_lsm_catmap> next;
    }

    @Type(noCCodeGeneration=true, cType="struct netlbl_lsm_cache")
    @NotUsableInJava
    public static class netlbl_lsm_cache
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public Ptr<?> free;
        public Ptr<?> data;
    }
}

