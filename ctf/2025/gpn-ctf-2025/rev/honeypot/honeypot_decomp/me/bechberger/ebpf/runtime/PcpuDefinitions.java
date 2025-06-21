/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.MacsecDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PcpuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_free_vm_areas(Ptr<Ptr<VmDefinitions.vm_struct>> vms, int nr_vms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcpu_get_vm_areas((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static Ptr<Ptr<VmDefinitions.vm_struct>> pcpu_get_vm_areas(Ptr<@Unsigned Long> offsets, Ptr<@Unsigned Long> sizes, int nr_vms, @Unsigned long align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_copy_value(Ptr<BpfDefinitions.bpf_htab> htab, Ptr<?> pptr, Ptr<?> value, boolean onallcpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_init_value(Ptr<BpfDefinitions.bpf_htab> htab, Ptr<?> pptr, Ptr<?> value, boolean onallcpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcpu_freelist_node> ___pcpu_freelist_pop(Ptr<pcpu_freelist> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcpu_freelist_node> ___pcpu_freelist_pop_nmi(Ptr<pcpu_freelist> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ___pcpu_freelist_push_nmi(Ptr<pcpu_freelist> s2, Ptr<pcpu_freelist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pcpu_chunk_move(Ptr<pcpu_chunk> chunk, int slot2, boolean move_front) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcpu_freelist_node> __pcpu_freelist_pop(Ptr<pcpu_freelist> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pcpu_freelist_push(Ptr<pcpu_freelist> s2, Ptr<pcpu_freelist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pcpu_map_pages(@Unsigned long addr2, Ptr<Ptr<runtime.page>> pages, int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pcpu_size_to_slot(int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcpu_alloc_info> pcpu_alloc_alloc_info(int nr_groups, int nr_units) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_alloc_area(Ptr<pcpu_chunk> chunk, int alloc_bits, @Unsigned long align, int start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcpu_chunk> pcpu_alloc_chunk(@Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcpu_chunk> pcpu_alloc_first_chunk(@Unsigned long tmp_addr, int map_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pcpu_alloc_noprof(@Unsigned long size, @Unsigned long align, boolean reserved, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_balance_free(boolean empty_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_balance_populated() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_balance_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_block_refresh_hint(Ptr<pcpu_chunk> chunk, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_block_update(Ptr<pcpu_block_md> block, int start, int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_block_update_hint_alloc(Ptr<pcpu_chunk> chunk, int bit_off, int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_block_update_hint_free(Ptr<pcpu_chunk> chunk, int bit_off, int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcpu_alloc_info> pcpu_build_alloc_info(@Unsigned long reserved_size, @Unsigned long dyn_size, @Unsigned long atom_size, Ptr<?> cpu_distance_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_chunk_depopulated(Ptr<pcpu_chunk> chunk, int page_start, int page_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_chunk_populated(Ptr<pcpu_chunk> chunk, int page_start, int page_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_chunk_refresh_hint(Ptr<pcpu_chunk> chunk, boolean full_scan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_chunk_relocate(Ptr<pcpu_chunk> chunk, int oslot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcpu_chunk_slot((const struct pcpu_chunk*)$arg1)")
    public static int pcpu_chunk_slot(Ptr<pcpu_chunk> chunk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcpu_chunk> pcpu_create_chunk(@Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pcpu_dev_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcpu_dump_alloc_info((const u8*)$arg1, (const struct pcpu_alloc_info*)$arg2)")
    public static void pcpu_dump_alloc_info(String lvl, Ptr<pcpu_alloc_info> ai) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_embed_first_chunk(@Unsigned long reserved_size, @Unsigned long dyn_size, @Unsigned long atom_size, Ptr<?> cpu_distance_fn, Ptr<?> cpu_to_nd_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pcpu_fc_alloc(@Unsigned int cpu2, @Unsigned long size, @Unsigned long align, Ptr<?> cpu_to_nd_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_find_block_fit(Ptr<pcpu_chunk> chunk, int alloc_bits, @Unsigned long align, boolean pop_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_free_alloc_info(Ptr<pcpu_alloc_info> ai) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_free_area(Ptr<pcpu_chunk> chunk, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_freelist_destroy(Ptr<pcpu_freelist> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_freelist_init(Ptr<pcpu_freelist> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcpu_freelist_node> pcpu_freelist_pop(Ptr<pcpu_freelist> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_freelist_populate(Ptr<pcpu_freelist> s2, Ptr<?> buf, @Unsigned int elem_size, @Unsigned int nr_elems) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_freelist_push(Ptr<pcpu_freelist> s2, Ptr<pcpu_freelist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_init_md_blocks(Ptr<pcpu_chunk> chunk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_map_pages(Ptr<pcpu_chunk> chunk, Ptr<Ptr<runtime.page>> pages, int page_start, int page_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pcpu_mem_zalloc(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_next_fit_region(Ptr<pcpu_chunk> chunk, int alloc_bits, int align, Ptr<Integer> bit_off, Ptr<Integer> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_next_md_free_region(Ptr<pcpu_chunk> chunk, Ptr<Integer> bit_off, Ptr<Integer> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pcpu_nr_pages() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pcpu_obj_full_size(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_page_first_chunk(@Unsigned long reserved_size, Ptr<?> cpu_to_nd_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_populate_chunk(Ptr<pcpu_chunk> chunk, int page_start, int page_end, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_populate_pte(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_post_unmap_tlb_flush(Ptr<pcpu_chunk> chunk, int page_start, int page_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_reclaim_populated() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcpu_setup_first_chunk((const struct pcpu_alloc_info*)$arg1, $arg2)")
    public static void pcpu_setup_first_chunk(Ptr<pcpu_alloc_info> ai, Ptr<?> base_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcpu_unmap_pages(Ptr<pcpu_chunk> chunk, Ptr<Ptr<runtime.page>> pages, int page_start, int page_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_cpu_distance(@Unsigned int from, @Unsigned int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcpu_cpu_to_node(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_chunk")
    @NotUsableInJava
    public static class pcpu_chunk
    extends Struct {
        public ListDefinitions.list_head list;
        public int free_bytes;
        public pcpu_block_md chunk_md;
        public Ptr<@Unsigned Long> bound_map;
        public Ptr<?> base_addr;
        public Ptr<@Unsigned Long> alloc_map;
        public Ptr<pcpu_block_md> md_blocks;
        public Ptr<?> data;
        public boolean immutable;
        public boolean isolated;
        public int start_offset;
        public int end_offset;
        public Ptr<misc.pcpuobj_ext> obj_exts;
        public int nr_pages;
        public int nr_populated;
        public int nr_empty_pop_pages;
        public @Unsigned long @Size(value=0) [] populated;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_block_md")
    @NotUsableInJava
    public static class pcpu_block_md
    extends Struct {
        public int scan_hint;
        public int scan_hint_start;
        public int contig_hint;
        public int contig_hint_start;
        public int left_free;
        public int right_free;
        public int first_free;
        public int nr_bits;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_alloc_info")
    @NotUsableInJava
    public static class pcpu_alloc_info
    extends Struct {
        public @Unsigned long static_size;
        public @Unsigned long reserved_size;
        public @Unsigned long dyn_size;
        public @Unsigned long unit_size;
        public @Unsigned long atom_size;
        public @Unsigned long alloc_size;
        public @Unsigned long __ai_size;
        public int nr_groups;
        public pcpu_group_info @Size(value=0) [] groups;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_group_info")
    @NotUsableInJava
    public static class pcpu_group_info
    extends Struct {
        public int nr_units;
        public @Unsigned long base_offset;
        public Ptr<@Unsigned Integer> cpu_map;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_seg6_local_counters")
    @NotUsableInJava
    public static class pcpu_seg6_local_counters
    extends Struct {
        public misc.u64_stats_t packets;
        public misc.u64_stats_t bytes;
        public misc.u64_stats_t errors;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_gen_cookie")
    @NotUsableInJava
    public static class pcpu_gen_cookie
    extends Struct {
        public LocalDefinitions.local_t nesting;
        public @Unsigned long last;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_freelist")
    @NotUsableInJava
    public static class pcpu_freelist
    extends Struct {
        public Ptr<pcpu_freelist_head> freelist;
        public pcpu_freelist_head extralist;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_freelist_node")
    @NotUsableInJava
    public static class pcpu_freelist_node
    extends Struct {
        public Ptr<pcpu_freelist_node> next;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_freelist_head")
    @NotUsableInJava
    public static class pcpu_freelist_head
    extends Struct {
        public Ptr<pcpu_freelist_node> first;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_tx_sc_stats")
    @NotUsableInJava
    public static class pcpu_tx_sc_stats
    extends Struct {
        public MacsecDefinitions.macsec_tx_sc_stats stats;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_rx_sc_stats")
    @NotUsableInJava
    public static class pcpu_rx_sc_stats
    extends Struct {
        public MacsecDefinitions.macsec_rx_sc_stats stats;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_dstats")
    @NotUsableInJava
    public static class pcpu_dstats
    extends Struct {
        public misc.u64_stats_t rx_packets;
        public misc.u64_stats_t rx_bytes;
        public misc.u64_stats_t rx_drops;
        public misc.u64_stats_t tx_packets;
        public misc.u64_stats_t tx_bytes;
        public misc.u64_stats_t tx_drops;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_sw_netstats")
    @NotUsableInJava
    public static class pcpu_sw_netstats
    extends Struct {
        public misc.u64_stats_t rx_packets;
        public misc.u64_stats_t rx_bytes;
        public misc.u64_stats_t tx_packets;
        public misc.u64_stats_t tx_bytes;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_lstats")
    @NotUsableInJava
    public static class pcpu_lstats
    extends Struct {
        public misc.u64_stats_t packets;
        public misc.u64_stats_t bytes;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="enum pcpu_fc")
    public static enum pcpu_fc implements Enum<pcpu_fc>,
    TypedEnum<pcpu_fc, Integer>
    {
        PCPU_FC_AUTO,
        PCPU_FC_EMBED,
        PCPU_FC_PAGE,
        PCPU_FC_NR;

    }

    @Type(noCCodeGeneration=true, cType="struct pcpu_hot")
    @NotUsableInJava
    public static class pcpu_hot
    extends Struct {
        @InlineUnion(value=2310)
        public  @InlineUnion(value=2310) AnonDefinitions.anon_member_of_anon_member_of_pcpu_hot anon0$0;
        @InlineUnion(value=2310)
        public @InlineUnion(value=2310) char @Size(value=64) [] pad;
    }
}

