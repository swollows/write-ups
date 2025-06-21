/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class SwapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short swap_cgroup_cmpxchg(misc.swp_entry_t ent, @Unsigned short old, @Unsigned short _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short swap_cgroup_record(misc.swp_entry_t ent, @Unsigned short id, @Unsigned int nr_ents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_cgroup_swapoff(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_cgroup_swapon(int type2, @Unsigned long max_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_ex(Ptr<?> a, Ptr<?> b, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_pte_batch(Ptr<PteDefinitions.pte_t> start_ptep, int max_nr, PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> swap_cache_get_folio(misc.swp_entry_t entry, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> swap_cluster_readahead(misc.swp_entry_t entry, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<runtime.mempolicy> mpol, @Unsigned long ilx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long swap_current_read(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_events_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_high_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long swap_high_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_init_sysfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_max_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long swap_max_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_peak_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long swap_peak_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_read_page(Ptr<swap_map_handle> handle, Ptr<?> buf, Ptr<misc.hib_bio_batch> hb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> swap_vma_readahead(misc.swp_entry_t targ_entry, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<runtime.mempolicy> mpol, @Unsigned long targ_ilx, Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_write_page(Ptr<swap_map_handle> handle, Ptr<?> buf, Ptr<misc.hib_bio_batch> hb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_buf_le16(Ptr<@Unsigned Short> buf, @Unsigned int buf_words) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __swap_count(misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __swap_duplicate(misc.swp_entry_t entry, char usage, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __swap_entries_free(Ptr<swap_info_struct> si, misc.swp_entry_t entry, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char __swap_entry_free_locked(Ptr<swap_info_struct> si, @Unsigned long offset, char usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __swap_read_unplug(Ptr<swap_iocb> sio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __swap_writepage(Ptr<runtime.folio> folio2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<swap_info_struct> _swap_info_get(misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean swap_count_continued(Ptr<swap_info_struct> si, @Unsigned long offset, char count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_discard_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_do_scheduled_discard(Ptr<swap_info_struct> si) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_duplicate(misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_entry_range_free(Ptr<swap_info_struct> si, misc.swp_entry_t entry, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long swap_folio_sector(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_free_nr(misc.swp_entry_t entry, int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long swap_inode_boot_loader(Ptr<SuperDefinitions.super_block> sb, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_inode_data(Ptr<runtime.inode> inode1, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_names(Ptr<runtime.dentry> dentry2, Ptr<runtime.dentry> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> swap_next(Ptr<SeqDefinitions.seq_file> swap, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_range_alloc(Ptr<swap_info_struct> si, @Unsigned long offset, @Unsigned int nr_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_read_folio(Ptr<runtime.folio> folio2, Ptr<Ptr<swap_iocb>> plug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_read_folio_bdev_sync(Ptr<runtime.folio> folio2, Ptr<swap_info_struct> sis) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_read_folio_fs(Ptr<runtime.folio> folio2, Ptr<Ptr<swap_iocb>> plug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean swap_read_folio_zeromap(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_reclaim_full_clusters(Ptr<swap_info_struct> si, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_reclaim_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_shmem_alloc(misc.swp_entry_t entry, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_show(Ptr<SeqDefinitions.seq_file> swap, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> swap_start(Ptr<SeqDefinitions.seq_file> swap, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_stop(Ptr<SeqDefinitions.seq_file> swap, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_swapcount(Ptr<swap_info_struct> si, misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_type_of(@Unsigned @OriginalName(value="dev_t") int device2, @Unsigned @OriginalName(value="sector_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_users_ref_free(Ptr<PercpuDefinitions.percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_write_unplug(Ptr<swap_iocb> sio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swap_writepage(Ptr<runtime.page> page2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_writepage_bdev_sync(Ptr<runtime.folio> folio2, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<swap_info_struct> sis) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_writepage_fs(Ptr<runtime.folio> folio2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swap_zeromap_folio_set(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct swap_slots_cache")
    @NotUsableInJava
    public static class swap_slots_cache
    extends Struct {
        public boolean lock_initialized;
        public runtime.mutex alloc_lock;
        public Ptr<misc.swp_entry_t> slots;
        public int nr;
        public int cur;
        public  @OriginalName(value="spinlock_t") runtime.spinlock free_lock;
        public Ptr<misc.swp_entry_t> slots_ret;
        public int n_ret;
    }

    @Type(noCCodeGeneration=true, cType="struct swap_map_handle")
    @NotUsableInJava
    public static class swap_map_handle
    extends Struct {
        public Ptr<swap_map_page> cur;
        public Ptr<swap_map_page_list> maps;
        public @Unsigned @OriginalName(value="sector_t") long cur_swap;
        public @Unsigned @OriginalName(value="sector_t") long first_sector;
        public @Unsigned int k;
        public @Unsigned long reqd_free_pages;
        public @Unsigned int crc32;
    }

    @Type(noCCodeGeneration=true, cType="struct swap_map_page_list")
    @NotUsableInJava
    public static class swap_map_page_list
    extends Struct {
        public Ptr<swap_map_page> map;
        public Ptr<swap_map_page_list> next;
    }

    @Type(noCCodeGeneration=true, cType="struct swap_map_page")
    @NotUsableInJava
    public static class swap_map_page
    extends Struct {
        public @Unsigned @OriginalName(value="sector_t") long @Size(value=511) [] entries;
        public @Unsigned @OriginalName(value="sector_t") long next_swap;
    }

    @Type(noCCodeGeneration=true, cType="struct swap_cgroup")
    @NotUsableInJava
    public static class swap_cgroup
    extends Struct {
        public @Unsigned short id;
    }

    @Type(noCCodeGeneration=true, cType="struct swap_cgroup_ctrl")
    @NotUsableInJava
    public static class swap_cgroup_ctrl
    extends Struct {
        public Ptr<Ptr<runtime.page>> map;
        public @Unsigned long length;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct swap_extent")
    @NotUsableInJava
    public static class swap_extent
    extends Struct {
        public RbDefinitions.rb_node rb_node;
        public @Unsigned long start_page;
        public @Unsigned long nr_pages;
        public @Unsigned @OriginalName(value="sector_t") long start_block;
    }

    @Type(noCCodeGeneration=true, cType="union swap_header")
    @NotUsableInJava
    public static class swap_header
    extends Union {
        public misc.magic_of_swap_header magic;
        public misc.info_of_swap_header info;
    }

    @Type(noCCodeGeneration=true, cType="struct swap_iocb")
    @NotUsableInJava
    public static class swap_iocb
    extends Struct {
        public runtime.kiocb iocb;
        public BioDefinitions.bio_vec @Size(value=32) [] bvec;
        public int pages;
        public int len;
    }

    @Type(noCCodeGeneration=true, cType="struct swap_cluster_info")
    @NotUsableInJava
    public static class swap_cluster_info
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned short count;
        public char flags;
        public char order;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct swap_info_struct")
    @NotUsableInJava
    public static class swap_info_struct
    extends Struct {
        public PercpuDefinitions.percpu_ref users;
        public @Unsigned long flags;
        public short prio;
        public misc.plist_node list;
        public byte type;
        public @Unsigned int max;
        public String swap_map;
        public Ptr<@Unsigned Long> zeromap;
        public Ptr<swap_cluster_info> cluster_info;
        public ListDefinitions.list_head free_clusters;
        public ListDefinitions.list_head full_clusters;
        public ListDefinitions.list_head @Size(value=10) [] nonfull_clusters;
        public ListDefinitions.list_head @Size(value=10) [] frag_clusters;
        public @Unsigned int @Size(value=10) [] frag_cluster_nr;
        public @Unsigned int lowest_bit;
        public @Unsigned int highest_bit;
        public @Unsigned int pages;
        public @Unsigned int inuse_pages;
        public @Unsigned int cluster_next;
        public @Unsigned int cluster_nr;
        public Ptr<@Unsigned Integer> cluster_next_cpu;
        public Ptr<PercpuDefinitions.percpu_cluster> percpu_cluster;
        public RbDefinitions.rb_root swap_extent_root;
        public Ptr<BlockDefinitions.block_device> bdev;
        public Ptr<runtime.file> swap_file;
        public runtime.completion comp;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock cont_lock;
        public misc.work_struct discard_work;
        public misc.work_struct reclaim_work;
        public ListDefinitions.list_head discard_clusters;
        public misc.plist_node @Size(value=0) [] avail_lists;
    }
}

