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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.FifoDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NodeDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.SDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MemoryDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_add_physaddr_to_nid(@Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memory_block_size_bytes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_failure(@Unsigned long pfn, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_failure_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_failure_queue(@Unsigned long pfn, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_failure_queue_kick(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_failure_work_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __memory_events_show(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="atomic_long_t") misc.atomic64_t> events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memory_current_read(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_events_local_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_events_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_high_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long memory_high_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_low_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long memory_low_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long memory_lseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_map_bottom_up(@Unsigned long map_start, @Unsigned long map_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_max_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long memory_max_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_min_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long memory_min_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_numa_stat_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_oom_group_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long memory_oom_group_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_peak_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long memory_peak_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="memory_read_from_buffer($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long memory_read_from_buffer(Ptr<?> to, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<?> from, @Unsigned long available) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long memory_reclaim(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_stat_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_tier_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_tier_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_tier_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_block_add_nid(Ptr<memory_block> mem, int nid, misc.meminit_context context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_block_online(Ptr<memory_block> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_block_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_bm_clear_bit(Ptr<memory_bitmap> bm, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_bm_clear_current(Ptr<memory_bitmap> bm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_bm_create(Ptr<memory_bitmap> bm, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int safe_needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_bm_find_bit(Ptr<memory_bitmap> bm, @Unsigned long pfn, Ptr<Ptr<?>> addr2, Ptr<@Unsigned Integer> bit_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_bm_free(Ptr<memory_bitmap> bm, int clear_nosave_free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long memory_bm_next_pfn(Ptr<memory_bitmap> bm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_bm_set_bit(Ptr<memory_bitmap> bm, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_bm_test_bit(Ptr<memory_bitmap> bm, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void memory_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<memory_group> memory_group_find_by_id(int mgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_group_register(memory_group group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_group_register_dynamic(int nid, @Unsigned long unit_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_group_register_static(int nid, @Unsigned long max_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_group_unregister(int mgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_subsys_offline(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int memory_subsys_online(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct memory_initiator")
    @NotUsableInJava
    public static class memory_initiator
    extends Struct {
        public ListDefinitions.list_head node;
        public @Unsigned int processor_pxm;
        public boolean has_cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_target")
    @NotUsableInJava
    public static class memory_target
    extends Struct {
        public ListDefinitions.list_head node;
        public @Unsigned int memory_pxm;
        public @Unsigned int processor_pxm;
        public runtime.resource memregions;
        public misc.access_coordinate @Size(value=4) [] coord;
        public ListDefinitions.list_head caches;
        public NodeDefinitions.node_cache_attrs cache_attrs;
        public char @Size(value=16) [] gen_port_device_handle;
        public boolean registered;
        public boolean ext_updated;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_locality")
    @NotUsableInJava
    public static class memory_locality
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<AcpiDefinitions.acpi_hmat_locality> hmat_loc;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_dev_type")
    @NotUsableInJava
    public static class memory_dev_type
    extends Struct {
        public ListDefinitions.list_head tier_sibling;
        public ListDefinitions.list_head list;
        public int adistance;
        public misc.nodemask_t nodes;
        public runtime.kref kref;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_tier")
    @NotUsableInJava
    public static class memory_tier
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head memory_types;
        public int adistance_start;
        public runtime.device dev;
        public misc.nodemask_t lower_tier_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_stat")
    @NotUsableInJava
    public static class memory_stat
    extends Struct {
        public String name;
        public @Unsigned int idx;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_failure_cpu")
    @NotUsableInJava
    public static class memory_failure_cpu
    extends Struct {
        public FifoDefinitions.fifo_of_memory_failure_cpu fifo;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_failure_entry")
    @NotUsableInJava
    public static class memory_failure_entry
    extends Struct {
        public @Unsigned long pfn;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int flags; long long unsigned int gpa; long long unsigned int size; }")
    @NotUsableInJava
    public static class memory_fault_of_anon_member_of_kvm_run
    extends Struct {
        public @Unsigned long flags;
        public @Unsigned long gpa;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_block")
    @NotUsableInJava
    public static class memory_block
    extends Struct {
        public @Unsigned long start_section_nr;
        public @Unsigned long state;
        public int online_type;
        public int nid;
        public Ptr<runtime.zone> zone;
        public runtime.device dev;
        public Ptr<misc.vmem_altmap> altmap;
        public Ptr<memory_group> group;
        public ListDefinitions.list_head group_next;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t nr_hwpoison;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_group")
    @NotUsableInJava
    public static class memory_group
    extends Struct {
        public int nid;
        public ListDefinitions.list_head memory_blocks;
        public @Unsigned long present_kernel_pages;
        public @Unsigned long present_movable_pages;
        public boolean is_dynamic;
        @InlineUnion(value=18679)
        public @InlineUnion(value=18679) SDefinitions.s_of_anon_member_of_memory_group s;
        @InlineUnion(value=18679)
        public  @InlineUnion(value=18679) DDefinitions.d_of_anon_member_of_memory_group d;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_notify")
    @NotUsableInJava
    public static class memory_notify
    extends Struct {
        public @Unsigned long altmap_start_pfn;
        public @Unsigned long altmap_nr_pages;
        public @Unsigned long start_pfn;
        public @Unsigned long nr_pages;
        public int status_change_nid_normal;
        public int status_change_nid;
    }

    @Type(noCCodeGeneration=true, cType="struct memory_bitmap")
    @NotUsableInJava
    public static class memory_bitmap
    extends Struct {
        public ListDefinitions.list_head zones;
        public Ptr<misc.linked_page> p_list;
        public misc.bm_position cur;
    }

    @Type(noCCodeGeneration=true, cType="enum memory_type")
    public static enum memory_type implements Enum<memory_type>,
    TypedEnum<memory_type, Integer>
    {
        MEMORY_DEVICE_PRIVATE,
        MEMORY_DEVICE_COHERENT,
        MEMORY_DEVICE_FS_DAX,
        MEMORY_DEVICE_GENERIC,
        MEMORY_DEVICE_PCI_P2PDMA;

    }

    @Type(noCCodeGeneration=true, cType="struct memory_failure_stats")
    @NotUsableInJava
    public static class memory_failure_stats
    extends Struct {
        public @Unsigned long total;
        public @Unsigned long ignored;
        public @Unsigned long failed;
        public @Unsigned long delayed;
        public @Unsigned long recovered;
    }
}

