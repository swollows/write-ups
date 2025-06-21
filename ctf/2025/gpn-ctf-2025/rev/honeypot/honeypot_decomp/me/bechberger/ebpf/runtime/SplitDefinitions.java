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
import me.bechberger.ebpf.runtime.CacheDefinitions;
import me.bechberger.ebpf.runtime.HfiDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.TraceprobeDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmaDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SplitDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __split_large_page(Ptr<misc.cpa_data> cpa, Ptr<PteDefinitions.pte_t> kpte, @Unsigned long address, Ptr<runtime.page> base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __split_vma(Ptr<VmaDefinitions.vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, int new_below) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int split_fs_names(String page2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void split_page_memcg(Ptr<runtime.page> head, int old_order, int new_order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __split_huge_page(Ptr<runtime.page> page2, Ptr<ListDefinitions.list_head> list, @Unsigned long end, @Unsigned int new_order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __split_huge_pmd(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long address, boolean freeze, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __split_huge_pmd_locked(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long haddr, boolean freeze) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __split_huge_pud(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<PudDefinitions.pud_t> pud, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __split_huge_zero_page_pmd(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long haddr, Ptr<PmdDefinitions.pmd_t> pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __split_lock_reenable(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __split_lock_reenable_unlock(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long split_deferred_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long split_failed_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int split_folio_to_list(Ptr<runtime.folio> folio2, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int split_huge_page_to_list_to_order(Ptr<runtime.page> page2, Ptr<ListDefinitions.list_head> list, @Unsigned int new_order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void split_huge_pages_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int split_huge_pages_debugfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="split_huge_pages_in_file((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int split_huge_pages_in_file(String file_path, @Unsigned long off_start, @Unsigned long off_end, @Unsigned int new_order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int split_huge_pages_pid(int pid2, @Unsigned long vaddr_start, @Unsigned long vaddr_end, @Unsigned int new_order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="split_huge_pages_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long split_huge_pages_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void split_huge_pmd_address(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, boolean freeze, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void split_huge_pmd_locked(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, Ptr<PmdDefinitions.pmd_t> pmd, boolean freeze, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void split_large_buddy(Ptr<runtime.zone> zone2, Ptr<runtime.page> page2, @Unsigned long pfn, int order, @OriginalName(value="fpi_t") int fpi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean split_lock_verify_msr(boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void split_lock_warn(@Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int split_next_field(String varname, Ptr<String> next_field, Ptr<TraceprobeDefinitions.traceprobe_parse_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void split_page(Ptr<runtime.page> page2, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long split_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long split_underused_thp_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="split_underused_thp_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long split_underused_thp_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { union hfi_capabilities capabilities; unsigned int table_pages; unsigned int __reserved; int index; }")
    @NotUsableInJava
    public static class split_of_cpuid6_edx
    extends Struct {
        public HfiDefinitions.hfi_capabilities capabilities;
        public @Unsigned int table_pages;
        public @Unsigned int __reserved;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 performance; u8 energy_efficiency; u8 __reserved; }")
    @NotUsableInJava
    public static class split_of_hfi_capabilities
    extends Struct {
        public char performance;
        public char energy_efficiency;
        public char __reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int number_of_sets; }")
    @NotUsableInJava
    public static class split_of__cpuid4_leaf_ecx
    extends Struct {
        public @Unsigned int number_of_sets;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int coherency_line_size; unsigned int physical_line_partition; unsigned int ways_of_associativity; }")
    @NotUsableInJava
    public static class split_of__cpuid4_leaf_ebx
    extends Struct {
        public @Unsigned int coherency_line_size;
        public @Unsigned int physical_line_partition;
        public @Unsigned int ways_of_associativity;
    }

    @Type(noCCodeGeneration=true, cType="struct { enum _cache_type type; unsigned int level; unsigned int is_self_initializing; unsigned int is_fully_associative; unsigned int reserved; unsigned int num_threads_sharing; unsigned int num_cores_on_die; }")
    @NotUsableInJava
    public static class split_of__cpuid4_leaf_eax
    extends Struct {
        public CacheDefinitions._cache_type type;
        public @Unsigned int level;
        public @Unsigned int is_self_initializing;
        public @Unsigned int is_fully_associative;
        public @Unsigned int reserved;
        public @Unsigned int num_threads_sharing;
        public @Unsigned int num_cores_on_die;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int lbr_mispred; unsigned int lbr_timed_lbr; unsigned int lbr_br_type; unsigned int reserved; unsigned int lbr_counters; }")
    @NotUsableInJava
    public static class split_of_cpuid28_ecx
    extends Struct {
        public @Unsigned int lbr_mispred;
        public @Unsigned int lbr_timed_lbr;
        public @Unsigned int lbr_br_type;
        public @Unsigned int reserved;
        public @Unsigned int lbr_counters;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int lbr_cpl; unsigned int lbr_filter; unsigned int lbr_call_stack; }")
    @NotUsableInJava
    public static class split_of_cpuid28_ebx
    extends Struct {
        public @Unsigned int lbr_cpl;
        public @Unsigned int lbr_filter;
        public @Unsigned int lbr_call_stack;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int lbr_depth_mask; unsigned int reserved; unsigned int lbr_deep_c_reset; unsigned int lbr_lip; }")
    @NotUsableInJava
    public static class split_of_cpuid28_eax
    extends Struct {
        public @Unsigned int lbr_depth_mask;
        public @Unsigned int reserved;
        public @Unsigned int lbr_deep_c_reset;
        public @Unsigned int lbr_lip;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int cos_max; }")
    @NotUsableInJava
    public static class split_of_cpuid_0x10_x_edx
    extends Struct {
        public @Unsigned int cos_max;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int reserved; unsigned int noncont; }")
    @NotUsableInJava
    public static class split_of_cpuid_0x10_x_ecx
    extends Struct {
        public @Unsigned int reserved;
        public @Unsigned int noncont;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int max_delay; }")
    @NotUsableInJava
    public static class split_of_cpuid_0x10_3_eax
    extends Struct {
        public @Unsigned int max_delay;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int cbm_len; }")
    @NotUsableInJava
    public static class split_of_cpuid_0x10_1_eax
    extends Struct {
        public @Unsigned int cbm_len;
    }

    @Type(noCCodeGeneration=true, cType="enum split_lock_detect_state")
    public static enum split_lock_detect_state implements Enum<split_lock_detect_state>,
    TypedEnum<split_lock_detect_state, Integer>
    {
        sld_off,
        sld_warn,
        sld_fatal,
        sld_ratelimit;

    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int num_counters_fixed; unsigned int bit_width_fixed; unsigned int reserved1; unsigned int anythread_deprecated; unsigned int reserved2; }")
    @NotUsableInJava
    public static class split_of_cpuid10_edx
    extends Struct {
        public @Unsigned int num_counters_fixed;
        public @Unsigned int bit_width_fixed;
        public @Unsigned int reserved1;
        public @Unsigned int anythread_deprecated;
        public @Unsigned int reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int no_unhalted_core_cycles; unsigned int no_instructions_retired; unsigned int no_unhalted_reference_cycles; unsigned int no_llc_reference; unsigned int no_llc_misses; unsigned int no_branch_instruction_retired; unsigned int no_branch_misses_retired; }")
    @NotUsableInJava
    public static class split_of_cpuid10_ebx
    extends Struct {
        public @Unsigned int no_unhalted_core_cycles;
        public @Unsigned int no_instructions_retired;
        public @Unsigned int no_unhalted_reference_cycles;
        public @Unsigned int no_llc_reference;
        public @Unsigned int no_llc_misses;
        public @Unsigned int no_branch_instruction_retired;
        public @Unsigned int no_branch_misses_retired;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int version_id; unsigned int num_counters; unsigned int bit_width; unsigned int mask_length; }")
    @NotUsableInJava
    public static class split_of_cpuid10_eax
    extends Struct {
        public @Unsigned int version_id;
        public @Unsigned int num_counters;
        public @Unsigned int bit_width;
        public @Unsigned int mask_length;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int ip; long long unsigned int ip_sign_ext; long long unsigned int reserved; long long unsigned int spec; long long unsigned int valid; }")
    @NotUsableInJava
    public static class split_of_to_of_branch_entry
    extends Struct {
        public @Unsigned long ip;
        public @Unsigned long ip_sign_ext;
        public @Unsigned long reserved;
        public @Unsigned long spec;
        public @Unsigned long valid;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int ip; long long unsigned int ip_sign_ext; long long unsigned int mispredict; }")
    @NotUsableInJava
    public static class split_of_from_of_branch_entry
    extends Struct {
        public @Unsigned long ip;
        public @Unsigned long ip_sign_ext;
        public @Unsigned long mispredict;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int num_core_pmc; unsigned int lbr_v2_stack_sz; unsigned int num_df_pmc; unsigned int num_umc_pmc; }")
    @NotUsableInJava
    public static class split_of_cpuid_0x80000022_ebx
    extends Struct {
        public @Unsigned int num_core_pmc;
        public @Unsigned int lbr_v2_stack_sz;
        public @Unsigned int num_df_pmc;
        public @Unsigned int num_umc_pmc;
    }
}

