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
import me.bechberger.ebpf.runtime.BootDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SmeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sme_early_enc_dec(@Unsigned @OriginalName(value="resource_size_t") long paddr, @Unsigned long size, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sme_early_map_unmap_mem(Ptr<?> vaddr, @Unsigned long size, boolean map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_early_decrypt(@Unsigned @OriginalName(value="resource_size_t") long paddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_early_encrypt(@Unsigned @OriginalName(value="resource_size_t") long paddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_early_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_map_bootdata(String real_mode_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_unmap_bootdata(String real_mode_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sme_map_range(Ptr<sme_populate_pgd_data> ppd, @Unsigned @OriginalName(value="pmdval_t") long pmd_flags, @Unsigned @OriginalName(value="pteval_t") long pte_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_clear_pgd(Ptr<sme_populate_pgd_data> ppd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_enable(Ptr<BootDefinitions.boot_params> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_encrypt_execute() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_encrypt_kernel(Ptr<BootDefinitions.boot_params> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sme_pgtable_calc(@Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sme_populate_pgd(Ptr<sme_populate_pgd_data> ppd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PudDefinitions.pud_t> sme_prepare_pgd(Ptr<sme_populate_pgd_data> ppd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sme_populate_pgd_data")
    @NotUsableInJava
    public static class sme_populate_pgd_data
    extends Struct {
        public Ptr<?> pgtable_area;
        public Ptr<misc.pgd_t> pgd;
        public @Unsigned @OriginalName(value="pmdval_t") long pmd_flags;
        public @Unsigned @OriginalName(value="pteval_t") long pte_flags;
        public @Unsigned long paddr;
        public @Unsigned long vaddr;
        public @Unsigned long vaddr_end;
    }
}

