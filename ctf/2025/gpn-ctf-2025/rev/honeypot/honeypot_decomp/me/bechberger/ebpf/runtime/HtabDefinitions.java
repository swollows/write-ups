/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class HtabDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __htab_lru_percpu_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags, boolean onallcpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__htab_map_lookup_and_delete_batch($arg1, (const union bpf_attr*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int __htab_map_lookup_and_delete_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr, boolean do_delete, boolean is_lru_map, boolean is_percpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __htab_map_lookup_and_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, boolean is_lru_map, boolean is_percpu, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __htab_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __htab_percpu_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags, boolean onallcpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void htab_free_elems(Ptr<BpfDefinitions.bpf_htab> htab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void htab_free_prealloced_fields(Ptr<BpfDefinitions.bpf_htab> htab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void htab_free_prealloced_timers_and_wq(Ptr<BpfDefinitions.bpf_htab> htab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_lock_bucket((const struct bpf_htab*)$arg1, $arg2, $arg3, $arg4)")
    public static int htab_lock_bucket(Ptr<BpfDefinitions.bpf_htab> htab, Ptr<runtime.bucket> b, @Unsigned int hash2, Ptr<@Unsigned Long> pflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long htab_lru_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean htab_lru_map_delete_node(Ptr<?> arg2, Ptr<BpfDefinitions.bpf_lru_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_lru_map_gen_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_insn> insn_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_lru_map_lookup_and_delete_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int htab_lru_map_lookup_and_delete_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_lru_map_lookup_and_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_lru_map_lookup_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int htab_lru_map_lookup_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> htab_lru_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> htab_lru_map_lookup_elem_sys(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long htab_lru_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_lru_percpu_map_lookup_and_delete_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int htab_lru_percpu_map_lookup_and_delete_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_lru_percpu_map_lookup_and_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_lru_percpu_map_lookup_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int htab_lru_percpu_map_lookup_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> htab_lru_percpu_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> htab_lru_percpu_map_lookup_percpu_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long htab_lru_percpu_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> htab_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_map_alloc_check(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long htab_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void htab_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void htab_map_free_timers_and_wq(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_map_gen_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_insn> insn_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_map_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_map_hash((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned int htab_map_hash(Ptr<?> key2, @Unsigned int key_len, @Unsigned int hashrnd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_map_lookup_and_delete_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int htab_map_lookup_and_delete_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_map_lookup_and_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_map_lookup_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int htab_map_lookup_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> htab_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long htab_map_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void htab_map_seq_show_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long htab_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> htab_of_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void htab_of_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_of_map_gen_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_insn> insn_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> htab_of_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_percpu_map_gen_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_insn> insn_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_percpu_map_lookup_and_delete_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int htab_percpu_map_lookup_and_delete_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int htab_percpu_map_lookup_and_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="htab_percpu_map_lookup_batch($arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int htab_percpu_map_lookup_batch(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> htab_percpu_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> htab_percpu_map_lookup_percpu_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void htab_percpu_map_seq_show_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long htab_percpu_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct htab_elem")
    @NotUsableInJava
    public static class htab_elem
    extends Struct {
        @InlineUnion(value=62113)
        public @InlineUnion(value=62113) misc.hlist_nulls_node hash_node;
        @InlineUnion(value=62113)
        public  @InlineUnion(value=62113) AnonDefinitions.anon_member_of_anon_member_of_htab_elem anon0$1;
        @InlineUnion(value=62114)
        public @InlineUnion(value=62114) Ptr<?> ptr_to_pptr;
        @InlineUnion(value=62114)
        public @InlineUnion(value=62114) BpfDefinitions.bpf_lru_node lru_node;
        public @Unsigned int hash;
        public char @Size(value=0) [] key;
    }
}

