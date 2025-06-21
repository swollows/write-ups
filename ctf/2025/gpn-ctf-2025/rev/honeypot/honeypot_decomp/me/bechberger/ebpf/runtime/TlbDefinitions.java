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
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TlbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tlb_is_not_lazy(int cpu2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tlb_batch_free_encoded_pages(Ptr<MmuDefinitions.mmu_gather_batch> batch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __tlb_remove_folio_pages(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<runtime.page> page2, @Unsigned int nr_pages, boolean delay_rmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __tlb_remove_page_size(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<runtime.page> page2, boolean delay_rmap, int page_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_finish_mmu(Ptr<MmuDefinitions.mmu_gather> tlb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_flush_mmu(Ptr<MmuDefinitions.mmu_gather> tlb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_flush_rmap_batch(Ptr<MmuDefinitions.mmu_gather_batch> batch2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_flush_rmaps(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_gather_mmu(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_gather_mmu_fullmm(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tlb_next_batch(Ptr<MmuDefinitions.mmu_gather> tlb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_remove_table(Ptr<MmuDefinitions.mmu_gather> tlb, Ptr<?> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_remove_table_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_remove_table_smp_sync(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tlb_remove_table_sync_one() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum tlb_flush_reason")
    public static enum tlb_flush_reason implements Enum<tlb_flush_reason>,
    TypedEnum<tlb_flush_reason, Integer>
    {
        TLB_FLUSH_ON_TASK_SWITCH,
        TLB_REMOTE_SHOOTDOWN,
        TLB_LOCAL_SHOOTDOWN,
        TLB_LOCAL_MM_SHOOTDOWN,
        TLB_REMOTE_SEND_IPI,
        NR_TLB_FLUSH_REASONS;

    }

    @Type(noCCodeGeneration=true, cType="struct tlb_state_shared")
    @NotUsableInJava
    public static class tlb_state_shared
    extends Struct {
        public boolean is_lazy;
    }

    @Type(noCCodeGeneration=true, cType="struct _tlb_table")
    @NotUsableInJava
    public static class _tlb_table
    extends Struct {
        public char descriptor;
        public char tlb_type;
        public @Unsigned int entries;
        public char @Size(value=128) [] info;
    }

    @Type(noCCodeGeneration=true, cType="struct tlb_state")
    @NotUsableInJava
    public static class tlb_state
    extends Struct {
        public Ptr<MmDefinitions.mm_struct> loaded_mm;
        @InlineUnion(value=3882)
        public @InlineUnion(value=3882) Ptr<MmDefinitions.mm_struct> last_user_mm;
        @InlineUnion(value=3882)
        public @InlineUnion(value=3882) @Unsigned long last_user_mm_spec;
        public @Unsigned short loaded_mm_asid;
        public @Unsigned short next_asid;
        public boolean invalidate_other;
        public @Unsigned short user_pcid_flush_mask;
        public @Unsigned long cr4;
        public tlb_context @Size(value=6) [] ctxs;
    }

    @Type(noCCodeGeneration=true, cType="struct tlb_context")
    @NotUsableInJava
    public static class tlb_context
    extends Struct {
        public @Unsigned long ctx_id;
        public @Unsigned long tlb_gen;
    }

    @Type(noCCodeGeneration=true, cType="enum tlb_infos")
    public static enum tlb_infos implements Enum<tlb_infos>,
    TypedEnum<tlb_infos, Integer>
    {
        ENTRIES,
        NR_INFO;

    }
}

