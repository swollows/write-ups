/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IccDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __icc_enable(Ptr<icc_path> path2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_disable(Ptr<icc_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_enable(Ptr<icc_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="icc_get($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static Ptr<icc_path> icc_get(Ptr<runtime.device> dev, String src, String dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)icc_get_name($arg1))")
    public static String icc_get_name(Ptr<icc_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_graph_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_graph_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="icc_link_create($arg1, (const int)$arg2)")
    public static int icc_link_create(Ptr<icc_node> node2, int dst_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icc_node_add(Ptr<icc_node> node2, Ptr<icc_provider> provider) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<icc_node> icc_node_create(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<icc_node> icc_node_create_nolock(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icc_node_del(Ptr<icc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icc_node_destroy(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_nodes_remove(Ptr<icc_provider> provider) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icc_provider_deregister(Ptr<icc_provider> provider) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icc_provider_init(Ptr<icc_provider> provider) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_provider_register(Ptr<icc_provider> provider) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icc_put(Ptr<icc_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_set_bw(Ptr<icc_path> path2, @Unsigned int avg_bw, @Unsigned int peak_bw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icc_set_tag(Ptr<icc_path> path2, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_std_aggregate(Ptr<icc_node> node2, @Unsigned int tag, @Unsigned int avg_bw, @Unsigned int peak_bw, Ptr<@Unsigned Integer> agg_avg, Ptr<@Unsigned Integer> agg_peak) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_summary_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_summary_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icc_sync_state(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="icc_bulk_disable($arg1, (const struct icc_bulk_data*)$arg2)")
    public static void icc_bulk_disable(int num_paths, Ptr<icc_bulk_data> paths) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="icc_bulk_enable($arg1, (const struct icc_bulk_data*)$arg2)")
    public static int icc_bulk_enable(int num_paths, Ptr<icc_bulk_data> paths) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void icc_bulk_put(int num_paths, Ptr<icc_bulk_data> paths) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="icc_bulk_set_bw($arg1, (const struct icc_bulk_data*)$arg2)")
    public static int icc_bulk_set_bw(int num_paths, Ptr<icc_bulk_data> paths) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int icc_debugfs_client_init(Ptr<runtime.dentry> icc_dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct icc_req")
    @NotUsableInJava
    public static class icc_req
    extends Struct {
        public misc.hlist_node req_node;
        public Ptr<icc_node> node;
        public Ptr<runtime.device> dev;
        public boolean enabled;
        public @Unsigned int tag;
        public @Unsigned int avg_bw;
        public @Unsigned int peak_bw;
    }

    @Type(noCCodeGeneration=true, cType="struct icc_provider")
    @NotUsableInJava
    public static class icc_provider
    extends Struct {
        public ListDefinitions.list_head provider_list;
        public ListDefinitions.list_head nodes;
        public Ptr<?> set;
        public Ptr<?> aggregate;
        public Ptr<?> pre_aggregate;
        public Ptr<?> get_bw;
        public Ptr<?> xlate;
        public Ptr<?> xlate_extended;
        public Ptr<runtime.device> dev;
        public int users;
        public boolean inter_set;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct icc_onecell_data")
    @NotUsableInJava
    public static class icc_onecell_data
    extends Struct {
        public @Unsigned int num_nodes;
        public Ptr<icc_node> @Size(value=0) [] nodes;
    }

    @Type(noCCodeGeneration=true, cType="struct icc_node")
    @NotUsableInJava
    public static class icc_node
    extends Struct {
        public int id;
        public String name;
        public Ptr<Ptr<icc_node>> links;
        public @Unsigned long num_links;
        public Ptr<icc_provider> provider;
        public ListDefinitions.list_head node_list;
        public ListDefinitions.list_head search_list;
        public Ptr<icc_node> reverse;
        public char is_traversed;
        public misc.hlist_head req_list;
        public @Unsigned int avg_bw;
        public @Unsigned int peak_bw;
        public @Unsigned int init_avg;
        public @Unsigned int init_peak;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct icc_node_data")
    @NotUsableInJava
    public static class icc_node_data
    extends Struct {
        public Ptr<icc_node> node;
        public @Unsigned int tag;
    }

    @Type(noCCodeGeneration=true, cType="struct icc_path")
    @NotUsableInJava
    public static class icc_path
    extends Struct {
        public String name;
        public @Unsigned long num_nodes;
        public icc_req @Size(value=0) [] reqs;
    }

    @Type(noCCodeGeneration=true, cType="struct icc_bulk_devres")
    @NotUsableInJava
    public static class icc_bulk_devres
    extends Struct {
        public Ptr<icc_bulk_data> paths;
        public int num_paths;
    }

    @Type(noCCodeGeneration=true, cType="struct icc_bulk_data")
    @NotUsableInJava
    public static class icc_bulk_data
    extends Struct {
        public Ptr<icc_path> path;
        public String name;
        public @Unsigned int avg_bw;
        public @Unsigned int peak_bw;
    }
}

