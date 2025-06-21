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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TrieDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __trie_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> trie_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trie_check_btf((const struct bpf_map*)$arg1, (const struct btf*)$arg2, (const struct btf_type*)$arg3, (const struct btf_type*)$arg4)")
    public static int trie_check_btf(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.btf> btf2, Ptr<BtfDefinitions.btf_type> key_type2, Ptr<BtfDefinitions.btf_type> value_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long trie_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> _key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trie_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trie_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> _key, Ptr<?> _next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> trie_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> _key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trie_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long trie_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long trie_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> _key, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct trie_stat")
    @NotUsableInJava
    public static class trie_stat
    extends Struct {
        public @Unsigned int totdepth;
        public @Unsigned int maxdepth;
        public @Unsigned int tnodes;
        public @Unsigned int leaves;
        public @Unsigned int nullpointers;
        public @Unsigned int prefixes;
        public @Unsigned int @Size(value=32) [] nodesizes;
    }

    @Type(noCCodeGeneration=true, cType="struct trie_use_stats")
    @NotUsableInJava
    public static class trie_use_stats
    extends Struct {
        public @Unsigned int gets;
        public @Unsigned int backtrack;
        public @Unsigned int semantic_match_passed;
        public @Unsigned int semantic_match_miss;
        public @Unsigned int null_node_hit;
        public @Unsigned int resize_node_skipped;
    }
}

