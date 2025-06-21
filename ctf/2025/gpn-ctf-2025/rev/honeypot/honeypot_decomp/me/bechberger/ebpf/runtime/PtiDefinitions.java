/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class PtiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.pgd_t __pti_set_user_pgtbl(Ptr<misc.pgd_t> pgdp, misc.pgd_t pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pti_check_boottime_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pti_clone_kernel_text() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pti_clone_p4d(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pti_clone_user_shared() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pti_finalize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pti_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pti_parse_cmdline(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pti_parse_cmdline_nopti(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pti_print_if_insecure((const u8*)$arg1)")
    public static void pti_print_if_insecure(String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.p4d_t> pti_user_pagetable_walk_p4d(@Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PmdDefinitions.pmd_t> pti_user_pagetable_walk_pmd(@Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> pti_user_pagetable_walk_pte(@Unsigned long address, boolean late_text) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum pti_clone_level")
    public static enum pti_clone_level implements Enum<pti_clone_level>,
    TypedEnum<pti_clone_level, Integer>
    {
        PTI_CLONE_PMD,
        PTI_CLONE_PTE;

    }

    @Type(noCCodeGeneration=true, cType="enum pti_mode")
    public static enum pti_mode implements Enum<pti_mode>,
    TypedEnum<pti_mode, Integer>
    {
        PTI_AUTO,
        PTI_FORCE_OFF,
        PTI_FORCE_ON;

    }
}

