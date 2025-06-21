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
import me.bechberger.ebpf.runtime.NetlblDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EbitmapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ebitmap_init(Ptr<runtime.ebitmap> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ebitmap_and($arg1, (const struct ebitmap*)$arg2, (const struct ebitmap*)$arg3)")
    public static int ebitmap_and(Ptr<runtime.ebitmap> dst, Ptr<runtime.ebitmap> e1, Ptr<runtime.ebitmap> e2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ebitmap_cache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ebitmap_cmp((const struct ebitmap*)$arg1, (const struct ebitmap*)$arg2)")
    public static int ebitmap_cmp(Ptr<runtime.ebitmap> e1, Ptr<runtime.ebitmap> e2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ebitmap_contains((const struct ebitmap*)$arg1, (const struct ebitmap*)$arg2, $arg3)")
    public static int ebitmap_contains(Ptr<runtime.ebitmap> e1, Ptr<runtime.ebitmap> e2, @Unsigned int last_e2bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ebitmap_cpy($arg1, (const struct ebitmap*)$arg2)")
    public static int ebitmap_cpy(Ptr<runtime.ebitmap> dst, Ptr<runtime.ebitmap> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ebitmap_destroy(Ptr<runtime.ebitmap> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ebitmap_hash((const struct ebitmap*)$arg1, $arg2)")
    public static @Unsigned int ebitmap_hash(Ptr<runtime.ebitmap> e, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ebitmap_netlbl_export(Ptr<runtime.ebitmap> ebmap, Ptr<Ptr<NetlblDefinitions.netlbl_lsm_catmap>> catmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ebitmap_netlbl_import(Ptr<runtime.ebitmap> ebmap, Ptr<NetlblDefinitions.netlbl_lsm_catmap> catmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ebitmap_read(Ptr<runtime.ebitmap> e, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ebitmap_set_bit(Ptr<runtime.ebitmap> e, @Unsigned int bit, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ebitmap_write((const struct ebitmap*)$arg1, $arg2)")
    public static int ebitmap_write(Ptr<runtime.ebitmap> e, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ebitmap_node")
    @NotUsableInJava
    public static class ebitmap_node
    extends Struct {
        public Ptr<ebitmap_node> next;
        public @Unsigned long @Size(value=6) [] maps;
        public @Unsigned int startbit;
    }
}

