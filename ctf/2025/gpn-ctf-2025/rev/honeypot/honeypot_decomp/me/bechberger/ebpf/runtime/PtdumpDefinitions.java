/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PtdumpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptdump_debugfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptdump_hole(@Unsigned long addr2, @Unsigned long next, int depth, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptdump_p4d_entry(Ptr<misc.p4d_t> p4d, @Unsigned long addr2, @Unsigned long next, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptdump_pgd_entry(Ptr<misc.pgd_t> pgd, @Unsigned long addr2, @Unsigned long next, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptdump_pmd_entry(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long next, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptdump_pte_entry(Ptr<PteDefinitions.pte_t> pte, @Unsigned long addr2, @Unsigned long next, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptdump_pud_entry(Ptr<PudDefinitions.pud_t> pud, @Unsigned long addr2, @Unsigned long next, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptdump_walk_pgd(Ptr<ptdump_state> st2, Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptdump_walk_pgd_level(Ptr<SeqDefinitions.seq_file> m, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ptdump_walk_pgd_level_checkwx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ptdump_walk_pgd_level_core(Ptr<SeqDefinitions.seq_file> m, Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.pgd_t> pgd, boolean checkwx, boolean dmesg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptdump_walk_pgd_level_debugfs(Ptr<SeqDefinitions.seq_file> m, Ptr<MmDefinitions.mm_struct> mm, boolean user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptdump_walk_user_pgd_level_checkwx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ptdump_state")
    @NotUsableInJava
    public static class ptdump_state
    extends Struct {
        public Ptr<?> note_page;
        public Ptr<?> effective_prot;
        public Ptr<ptdump_range> range;
    }

    @Type(noCCodeGeneration=true, cType="struct ptdump_range")
    @NotUsableInJava
    public static class ptdump_range
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
    }
}

