/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KsmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ksm_enter(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ksm_exit(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ksm_add_vma(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ksm_add_vmas(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ksm_check_stable_tree(@Unsigned long start_pfn, @Unsigned long end_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksm_del_vmas(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksm_disable(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksm_disable_merge_any(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksm_enable_merge_any(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> ksm_get_folio(Ptr<ksm_stable_node> stable_node, ksm_get_folio_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksm_madvise(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, int advice, Ptr<@Unsigned Long> vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksm_memory_callback(Ptr<misc.notifier_block> self, @Unsigned long action, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> ksm_might_need_to_copy(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ksm_process_profit(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ksm_scan_thread(Ptr<?> nothing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ksm_zero_pages_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum ksm_get_folio_flags")
    public static enum ksm_get_folio_flags implements Enum<ksm_get_folio_flags>,
    TypedEnum<ksm_get_folio_flags, Integer>
    {
        KSM_GET_FOLIO_NOLOCK,
        KSM_GET_FOLIO_LOCK,
        KSM_GET_FOLIO_TRYLOCK;

    }

    @Type(noCCodeGeneration=true, cType="enum ksm_advisor_type")
    public static enum ksm_advisor_type implements Enum<ksm_advisor_type>,
    TypedEnum<ksm_advisor_type, Integer>
    {
        KSM_ADVISOR_NONE,
        KSM_ADVISOR_SCAN_TIME;

    }

    @Type(noCCodeGeneration=true, cType="struct ksm_stable_node")
    @NotUsableInJava
    public static class ksm_stable_node
    extends Struct {
        @InlineUnion(value=9739)
        public  @InlineUnion(value=9739) RbDefinitions.rb_node node;
        @InlineUnion(value=9739)
        public  @InlineUnion(value=9739) AnonDefinitions.anon_member_of_anon_member_of_ksm_stable_node anon0$1;
        public misc.hlist_head hlist;
        @InlineUnion(value=9740)
        public @InlineUnion(value=9740) @Unsigned long kpfn;
        @InlineUnion(value=9740)
        public @InlineUnion(value=9740) @Unsigned long chain_prune_time;
        public int rmap_hlist_len;
        public int nid;
    }

    @Type(noCCodeGeneration=true, cType="struct ksm_scan")
    @NotUsableInJava
    public static class ksm_scan
    extends Struct {
        public Ptr<ksm_mm_slot> mm_slot;
        public @Unsigned long address;
        public Ptr<Ptr<ksm_rmap_item>> rmap_list;
        public @Unsigned long seqnr;
    }

    @Type(noCCodeGeneration=true, cType="struct ksm_rmap_item")
    @NotUsableInJava
    public static class ksm_rmap_item
    extends Struct {
        public Ptr<ksm_rmap_item> rmap_list;
        @InlineUnion(value=9742)
        public @InlineUnion(value=9742) Ptr<AnonDefinitions.anon_vma> anon_vma;
        @InlineUnion(value=9742)
        public @InlineUnion(value=9742) int nid;
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long address;
        public @Unsigned int oldchecksum;
        public @OriginalName(value="rmap_age_t") char age;
        public @OriginalName(value="rmap_age_t") char remaining_skips;
        @InlineUnion(value=9745)
        public  @InlineUnion(value=9745) RbDefinitions.rb_node node;
        @InlineUnion(value=9745)
        public  @InlineUnion(value=9745) AnonDefinitions.anon_member_of_anon_member_of_ksm_rmap_item anon7$1;
    }

    @Type(noCCodeGeneration=true, cType="struct ksm_mm_slot")
    @NotUsableInJava
    public static class ksm_mm_slot
    extends Struct {
        public MmDefinitions.mm_slot slot;
        public Ptr<ksm_rmap_item> rmap_list;
    }
}

