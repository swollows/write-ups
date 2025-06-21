/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.DeflateDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.MapDefinitions;
import me.bechberger.ebpf.runtime.OpenDefinitions;
import me.bechberger.ebpf.runtime.ProtoDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class BuildDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="build_change_hat((const struct cred*)$arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<AaDefinitions.aa_label> build_change_hat(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, String name, boolean sibling) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int build_detached_freelist(Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned long size, Ptr<Ptr<?>> p, Ptr<misc.detached_freelist> df) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void build_inv_iommu_pages(Ptr<IommuDefinitions.iommu_cmd> cmd, @Unsigned long address, @Unsigned long size, @Unsigned short domid, @Unsigned @OriginalName(value="ioasid_t") int pasid, boolean gn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void build_inv_irt(Ptr<IommuDefinitions.iommu_cmd> cmd, @Unsigned short devid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="build_merkle_tree($arg1, (const struct merkle_tree_params*)$arg2, $arg3)")
    public static int build_merkle_tree(Ptr<runtime.file> filp, Ptr<misc.merkle_tree_params> params, Ptr<Character> root_hash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="build_open_flags((const struct open_how*)$arg1, $arg2)")
    public static int build_open_flags(Ptr<OpenDefinitions.open_how> how, Ptr<OpenDefinitions.open_flags> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="build_pivotroot((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, $arg4, (const struct path*)$arg5, $arg6)")
    public static Ptr<AaDefinitions.aa_label> build_pivotroot(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, Ptr<runtime.path> new_path, String new_buffer, Ptr<runtime.path> old_path, String old_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void build_balance_mask(Ptr<SchedDefinitions.sched_domain> sd, Ptr<SchedDefinitions.sched_group> sg2, Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SchedDefinitions.sched_group> build_group_from_child_sched_domain(Ptr<SchedDefinitions.sched_domain> sd, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int build_overlap_sched_groups(Ptr<SchedDefinitions.sched_domain> sd, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="build_perf_domains((const struct cpumask*)$arg1)")
    public static boolean build_perf_domains(Ptr<runtime.cpumask> cpu_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="build_sched_domains((const struct cpumask*)$arg1, $arg2)")
    public static int build_sched_domains(Ptr<runtime.cpumask> cpu_map, Ptr<SchedDefinitions.sched_domain_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int build_sched_groups(Ptr<SchedDefinitions.sched_domain> sd, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__build_flow_key((const struct net*)$arg1, $arg2, (const struct sock*)$arg3, (const struct iphdr*)$arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static void __build_flow_key(Ptr<runtime.net> net2, Ptr<runtime.flowi4> fl4, Ptr<runtime.sock> sk, Ptr<runtime.iphdr> iph, int oif, char tos, char prot, @Unsigned int mark, int flow_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __build_skb(Ptr<?> data, @Unsigned int frag_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __build_skb_around(Ptr<SkDefinitions.sk_buff> skb, Ptr<?> data, @Unsigned int frag_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char build_attr(Ptr<VcDefinitions.vc_data> vc2, char _color, VcDefinitions.vc_intensity _intensity, boolean _blink, boolean _underline, boolean _reverse, boolean _italic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MapDefinitions.map_info> build_map_info(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long offset, boolean is_register) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="build_protos($arg1, $arg2, (const struct proto*)$arg3, (const struct proto_ops*)$arg4)")
    public static void build_protos(Ptr<runtime.proto> espintcp_prot, Ptr<ProtoDefinitions.proto_ops> espintcp_ops, Ptr<runtime.proto> orig_prot, Ptr<ProtoDefinitions.proto_ops> orig_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> build_skb(Ptr<?> data, @Unsigned int frag_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> build_skb_around(Ptr<SkDefinitions.sk_buff> skb, Ptr<?> data, @Unsigned int frag_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void build_socket_tables() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void build_tree(Ptr<DeflateDefinitions.deflate_state> s2, Ptr<misc.tree_desc_s> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void build_uv_gr_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __build_all_zonelists(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void build_all_zonelists(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void build_all_zonelists_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int build_id_parse(Ptr<VmDefinitions.vm_area_struct> vma, String build_id, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="build_id_parse_buf((const void*)$arg1, $arg2, $arg3)")
    public static int build_id_parse_buf(Ptr<?> buf, String build_id, @Unsigned int buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int build_id_parse_nofault(Ptr<VmDefinitions.vm_area_struct> vma, String build_id, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void build_zonelists(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int build_zonerefs_node(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat, Ptr<runtime.zoneref> zonerefs) {
        throw new MethodIsBPFRelatedFunction();
    }
}

