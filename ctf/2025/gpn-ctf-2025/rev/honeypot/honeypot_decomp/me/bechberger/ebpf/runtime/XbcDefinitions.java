/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class XbcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="xbc_make_cmdline((const u8*)$arg1)")
    public static String xbc_make_cmdline(String key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xbc_node> xbc_node_get_subkey(Ptr<xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xbc_snprint_cmdline(String buf, @Unsigned long size, Ptr<xbc_node> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xbc_add_key(String k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xbc_node> __xbc_add_sibling(String data, @Unsigned @OriginalName(value="uint32_t") int flag, boolean head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xbc_close_brace(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xbc_parse_keys(String k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xbc_parse_value(Ptr<String> __v, Ptr<String> __n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _xbc_exit(boolean early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xbc_node> xbc_add_child(String data, @Unsigned @OriginalName(value="uint32_t") int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xbc_alloc_mem(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xbc_free_mem(Ptr<?> addr2, @Unsigned long size, boolean early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xbc_get_info(Ptr<Integer> node_size, Ptr<@Unsigned Long> data_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xbc_init((const u8*)$arg1, $arg2, (const u8**)$arg3, $arg4)")
    public static int xbc_init(String data, @Unsigned long size, Ptr<String> emsg, Ptr<Integer> epos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xbc_node_compose_key_after(Ptr<xbc_node> root, Ptr<xbc_node> node2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)xbc_node_find_next_key_value($arg1, $arg2))")
    public static String xbc_node_find_next_key_value(Ptr<xbc_node> root, Ptr<Ptr<xbc_node>> leaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xbc_node> xbc_node_find_next_leaf(Ptr<xbc_node> root, Ptr<xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xbc_node_find_subkey($arg1, (const u8*)$arg2)")
    public static Ptr<xbc_node> xbc_node_find_subkey(Ptr<xbc_node> parent, String key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)xbc_node_find_value($arg1, (const u8*)$arg2, $arg3))")
    public static String xbc_node_find_value(Ptr<xbc_node> parent, String key2, Ptr<Ptr<xbc_node>> vnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xbc_node> xbc_node_get_child(Ptr<xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)xbc_node_get_data($arg1))")
    public static String xbc_node_get_data(Ptr<xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xbc_node> xbc_node_get_next(Ptr<xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xbc_node> xbc_node_get_parent(Ptr<xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xbc_node_index(Ptr<xbc_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xbc_parse_key(Ptr<String> k, String n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xbc_parse_kv(Ptr<String> k, String v, int op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xbc_parse_tree() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xbc_node> xbc_root_node() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xbc_verify_tree() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xbc_node")
    @NotUsableInJava
    public static class xbc_node
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short next;
        public @Unsigned @OriginalName(value="uint16_t") short child;
        public @Unsigned @OriginalName(value="uint16_t") short parent;
        public @Unsigned @OriginalName(value="uint16_t") short data;
    }
}

