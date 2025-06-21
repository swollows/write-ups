/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AvtabDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avtab_alloc(Ptr<runtime.avtab> h, @Unsigned int nrules) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="avtab_alloc_dup($arg1, (const struct avtab*)$arg2)")
    public static int avtab_alloc_dup(Ptr<runtime.avtab> _new, Ptr<runtime.avtab> orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avtab_cache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avtab_destroy(Ptr<runtime.avtab> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avtab_init(Ptr<runtime.avtab> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="avtab_insert_node($arg1, $arg2, (const struct avtab_key*)$arg3, (const struct avtab_datum*)$arg4)")
    public static Ptr<avtab_node> avtab_insert_node(Ptr<runtime.avtab> h, Ptr<Ptr<avtab_node>> dst, Ptr<avtab_key> key2, Ptr<avtab_datum> datum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="avtab_insert_nonunique($arg1, (const struct avtab_key*)$arg2, (const struct avtab_datum*)$arg3)")
    public static Ptr<avtab_node> avtab_insert_nonunique(Ptr<runtime.avtab> h, Ptr<avtab_key> key2, Ptr<avtab_datum> datum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="avtab_insertf($arg1, (const struct avtab_key*)$arg2, (const struct avtab_datum*)$arg3, $arg4)")
    public static int avtab_insertf(Ptr<runtime.avtab> a, Ptr<avtab_key> k, Ptr<avtab_datum> d, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avtab_read(Ptr<runtime.avtab> a, Ptr<?> fp, Ptr<runtime.policydb> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="avtab_read_item($arg1, $arg2, $arg3, (int (*)(struct avtab*, const struct avtab_key*, const struct avtab_datum*, void*))$arg4, $arg5)")
    public static int avtab_read_item(Ptr<runtime.avtab> a, Ptr<?> fp, Ptr<runtime.policydb> pol, Ptr<?> insertf, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="avtab_search_node($arg1, (const struct avtab_key*)$arg2)")
    public static Ptr<avtab_node> avtab_search_node(Ptr<runtime.avtab> h, Ptr<avtab_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<avtab_node> avtab_search_node_next(Ptr<avtab_node> node2, @Unsigned short specified) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avtab_write(Ptr<runtime.policydb> p, Ptr<runtime.avtab> a, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="avtab_write_item($arg1, (const struct avtab_node*)$arg2, $arg3)")
    public static int avtab_write_item(Ptr<runtime.policydb> p, Ptr<avtab_node> cur, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct avtab_node")
    @NotUsableInJava
    public static class avtab_node
    extends Struct {
        public avtab_key key;
        public avtab_datum datum;
        public Ptr<avtab_node> next;
    }

    @Type(noCCodeGeneration=true, cType="struct avtab_datum")
    @NotUsableInJava
    public static class avtab_datum
    extends Struct {
        public UDefinitions.u_of_avtab_datum u;
    }

    @Type(noCCodeGeneration=true, cType="struct avtab_extended_perms")
    @NotUsableInJava
    public static class avtab_extended_perms
    extends Struct {
        public char specified;
        public char driver;
        public misc.extended_perms_data perms;
    }

    @Type(noCCodeGeneration=true, cType="struct avtab_key")
    @NotUsableInJava
    public static class avtab_key
    extends Struct {
        public @Unsigned short source_type;
        public @Unsigned short target_type;
        public @Unsigned short target_class;
        public @Unsigned short specified;
    }
}

