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
import me.bechberger.ebpf.runtime.ConvertDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class SidtabDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sidtab_entry_to_string(Ptr<runtime.policydb> p, Ptr<runtime.sidtab> sidtab2, Ptr<sidtab_entry> entry, Ptr<String> scontext, Ptr<@Unsigned Integer> scontext_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sidtab_cancel_convert(Ptr<runtime.sidtab> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sidtab_context_to_sid(Ptr<runtime.sidtab> s2, Ptr<runtime.context> context2, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sidtab_convert(Ptr<runtime.sidtab> s2, Ptr<sidtab_convert_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sidtab_convert_tree(Ptr<sidtab_entry_inner> edst, Ptr<sidtab_entry_inner> esrc, Ptr<@Unsigned Integer> pos, @Unsigned int count, @Unsigned int level, Ptr<sidtab_convert_params> convert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sidtab_destroy(Ptr<runtime.sidtab> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sidtab_destroy_tree(sidtab_entry_inner entry, @Unsigned int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sidtab_entry> sidtab_do_lookup(Ptr<runtime.sidtab> s2, @Unsigned int index2, int alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sidtab_freeze_begin(Ptr<runtime.sidtab> s2, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sidtab_freeze_end(Ptr<runtime.sidtab> s2, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sidtab_hash_stats(Ptr<runtime.sidtab> sidtab2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sidtab_init(Ptr<runtime.sidtab> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sidtab_entry> sidtab_search_entry(Ptr<runtime.sidtab> s2, @Unsigned int sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sidtab_entry> sidtab_search_entry_force(Ptr<runtime.sidtab> s2, @Unsigned int sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sidtab_set_initial(Ptr<runtime.sidtab> s2, @Unsigned int sid, Ptr<runtime.context> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sidtab_sid2str_get(Ptr<runtime.sidtab> s2, Ptr<sidtab_entry> entry, Ptr<String> out, Ptr<@Unsigned Integer> out_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sidtab_sid2str_put($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void sidtab_sid2str_put(Ptr<runtime.sidtab> s2, Ptr<sidtab_entry> entry, String str, @Unsigned int str_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sidtab_str_cache")
    @NotUsableInJava
    public static class sidtab_str_cache
    extends Struct {
        public misc.callback_head rcu_member;
        public ListDefinitions.list_head lru_member;
        public Ptr<sidtab_entry> parent;
        public @Unsigned int len;
        public char @Size(value=0) [] str;
    }

    @Type(noCCodeGeneration=true, cType="struct sidtab_convert_params")
    @NotUsableInJava
    public static class sidtab_convert_params
    extends Struct {
        public Ptr<ConvertDefinitions.convert_context_args> args;
        public Ptr<runtime.sidtab> target;
    }

    @Type(noCCodeGeneration=true, cType="struct sidtab_isid_entry")
    @NotUsableInJava
    public static class sidtab_isid_entry
    extends Struct {
        public int set;
        public sidtab_entry entry;
    }

    @Type(noCCodeGeneration=true, cType="struct sidtab_node_leaf")
    @NotUsableInJava
    public static class sidtab_node_leaf
    extends Struct {
        public sidtab_entry @Size(value=39) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct sidtab_node_inner")
    @NotUsableInJava
    public static class sidtab_node_inner
    extends Struct {
        public sidtab_entry_inner @Size(value=512) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="union sidtab_entry_inner")
    @NotUsableInJava
    public static class sidtab_entry_inner
    extends Union {
        public Ptr<sidtab_node_inner> ptr_inner;
        public Ptr<sidtab_node_leaf> ptr_leaf;
    }

    @Type(noCCodeGeneration=true, cType="struct sidtab_entry")
    @NotUsableInJava
    public static class sidtab_entry
    extends Struct {
        public @Unsigned int sid;
        public @Unsigned int hash;
        public runtime.context context;
        public Ptr<sidtab_str_cache> cache;
        public misc.hlist_node list;
    }
}

