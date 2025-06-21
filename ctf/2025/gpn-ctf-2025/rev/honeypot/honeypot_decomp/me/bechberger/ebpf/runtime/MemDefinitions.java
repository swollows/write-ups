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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.BootDefinitions;
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.DeferredDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.EdacDefinitions;
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
import me.bechberger.ebpf.runtime.MemcgDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.ObjDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.QuotaDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UartDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MemDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mem_cgroup_disabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_encrypt_free_decrypted_mem() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short mem_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mem_cgroup_charge(Ptr<runtime.folio> folio2, Ptr<MmDefinitions.mm_struct> mm, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mem_cgroup_free(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mem_cgroup_try_charge_swap(Ptr<runtime.folio> folio2, misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mem_cgroup_uncharge(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mem_cgroup_uncharge_folios(Ptr<FolioDefinitions.folio_batch> folios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mem_cgroup_uncharge_swap(misc.swp_entry_t entry, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mem_cgroup> mem_cgroup_alloc(Ptr<mem_cgroup> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_attach(Ptr<CgroupDefinitions.cgroup_taskset> tset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_calculate_protection(Ptr<mem_cgroup> root, Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_cancel_charge(Ptr<mem_cgroup> memcg, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mem_cgroup_charge_skmem(Ptr<mem_cgroup> memcg, @Unsigned int nr_pages, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_commit_charge(Ptr<runtime.folio> folio2, Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> mem_cgroup_css_alloc(Ptr<CgroupDefinitions.cgroup_subsys_state> parent_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_css_free(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> mem_cgroup_css_from_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_css_offline(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mem_cgroup_css_online(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_css_released(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_css_reset(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_css_rstat_flush(Ptr<CgroupDefinitions.cgroup_subsys_state> css, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_exit(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_flush_foreign(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_flush_stats(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_flush_stats_ratelimited(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_fork(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mem_cgroup> mem_cgroup_from_id(@Unsigned short id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mem_cgroup> mem_cgroup_from_slab_obj(Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mem_cgroup> mem_cgroup_from_task(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mem_cgroup_get_max(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long mem_cgroup_get_nr_swap_pages(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mem_cgroup> mem_cgroup_get_oom_group(Ptr<TaskDefinitions.task_struct> victim, Ptr<mem_cgroup> oom_domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_handle_over_high(@Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mem_cgroup_hugetlb_try_charge(Ptr<mem_cgroup> memcg, @Unsigned @OriginalName(value="gfp_t") int gfp, long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_id_get_many(Ptr<mem_cgroup> memcg, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mem_cgroup> mem_cgroup_id_get_online(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_id_put_many(Ptr<mem_cgroup> memcg, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mem_cgroup_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mem_cgroup> mem_cgroup_iter(Ptr<mem_cgroup> root, Ptr<mem_cgroup> prev, Ptr<mem_cgroup_reclaim_cookie> reclaim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_iter_break(Ptr<mem_cgroup> root, Ptr<mem_cgroup> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mem_cgroup_kmem_disabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_migrate(Ptr<runtime.folio> old, Ptr<runtime.folio> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mem_cgroup_out_of_memory(Ptr<mem_cgroup> memcg, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_print_oom_context(Ptr<mem_cgroup> memcg, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_print_oom_group(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_print_oom_meminfo(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_replace_folio(Ptr<runtime.folio> old, Ptr<runtime.folio> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mem_cgroup_scan_tasks($arg1, (int (*)(struct task_struct*, void*))$arg2, $arg3)")
    public static void mem_cgroup_scan_tasks(Ptr<mem_cgroup> memcg, Ptr<?> fn, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mem_cgroup_shrink_node(Ptr<mem_cgroup> memcg, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, boolean noswap, Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat, Ptr<@Unsigned Long> nr_scanned) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mem_cgroup_size(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_sk_alloc(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_sk_free(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mem_cgroup_swap_full(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mem_cgroup_swap_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mem_cgroup_swapin_charge_folio(Ptr<runtime.folio> folio2, Ptr<MmDefinitions.mm_struct> mm, @Unsigned @OriginalName(value="gfp_t") int gfp, misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_swapin_uncharge_swap(misc.swp_entry_t entry, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_swapout(Ptr<runtime.folio> folio2, misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_track_foreign_dirty_slowpath(Ptr<runtime.folio> folio2, Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_uncharge_skmem(Ptr<mem_cgroup> memcg, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_update_lru_size(Ptr<runtime.lruvec> lruvec2, LruDefinitions.lru_list lru, int zid, int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mem_cgroup_usage(Ptr<mem_cgroup> memcg, boolean swap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<WbDefinitions.wb_domain> mem_cgroup_wb_domain(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_cgroup_wb_stats(Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<@Unsigned Long> pfilepages, Ptr<@Unsigned Long> pheadroom, Ptr<@Unsigned Long> pdirty, Ptr<@Unsigned Long> pwriteback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mem_cgroup_zswap_writeback_enabled(Ptr<mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mem_devnode((const struct device*)$arg1, $arg2)")
    public static String mem_devnode(Ptr<runtime.device> dev, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_encrypt_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_encrypt_setup_arch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_hotplug_begin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_hotplug_done() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mem_region_callback(Ptr<runtime.resource> res, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mem_serial_in(Ptr<UartDefinitions.uart_port> p, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_serial_out(Ptr<UartDefinitions.uart_port> p, int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mem_sleep_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mem_sleep_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long mem_sleep_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_allocator_disconnect(Ptr<?> allocator) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_map_via_hcall(Ptr<BootDefinitions.boot_params> boot_params_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mem_sleep_default_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mem_dump_obj(Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long mem_lseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mem_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mem_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mem_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mem_rw(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos, int write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mem_section_usage_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mem_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long mem_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mem_size_stats")
    @NotUsableInJava
    public static class mem_size_stats
    extends Struct {
        public @Unsigned long resident;
        public @Unsigned long shared_clean;
        public @Unsigned long shared_dirty;
        public @Unsigned long private_clean;
        public @Unsigned long private_dirty;
        public @Unsigned long referenced;
        public @Unsigned long anonymous;
        public @Unsigned long lazyfree;
        public @Unsigned long anonymous_thp;
        public @Unsigned long shmem_thp;
        public @Unsigned long file_thp;
        public @Unsigned long swap;
        public @Unsigned long shared_hugetlb;
        public @Unsigned long private_hugetlb;
        public @Unsigned long ksm;
        public @Unsigned long pss;
        public @Unsigned long pss_anon;
        public @Unsigned long pss_file;
        public @Unsigned long pss_shmem;
        public @Unsigned long pss_dirty;
        public @Unsigned long pss_locked;
        public @Unsigned long swap_pss;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_cgroup_reclaim_cookie")
    @NotUsableInJava
    public static class mem_cgroup_reclaim_cookie
    extends Struct {
        public Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat;
        public int generation;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_ctl_info")
    @NotUsableInJava
    public static class mem_ctl_info
    extends Struct {
        public runtime.device dev;
        public Ptr<BusDefinitions.bus_type> bus;
        public ListDefinitions.list_head link;
        public Ptr<runtime.module> owner;
        public @Unsigned long mtype_cap;
        public @Unsigned long edac_ctl_cap;
        public @Unsigned long edac_cap;
        public @Unsigned long scrub_cap;
        public misc.scrub_type scrub_mode;
        public Ptr<?> set_sdram_scrub_rate;
        public Ptr<?> get_sdram_scrub_rate;
        public Ptr<?> edac_check;
        public Ptr<?> ctl_page_to_phys;
        public int mc_idx;
        public Ptr<Ptr<misc.csrow_info>> csrows;
        public @Unsigned int nr_csrows;
        public @Unsigned int num_cschannel;
        public @Unsigned int n_layers;
        public Ptr<EdacDefinitions.edac_mc_layer> layers;
        public boolean csbased;
        public @Unsigned int tot_dimms;
        public Ptr<Ptr<misc.dimm_info>> dimms;
        public Ptr<runtime.device> pdev;
        public String mod_name;
        public String ctl_name;
        public String dev_name;
        public Ptr<?> pvt_info;
        public @Unsigned long start_time;
        public @Unsigned int ce_noinfo_count;
        public @Unsigned int ue_noinfo_count;
        public @Unsigned int ue_mc;
        public @Unsigned int ce_mc;
        public runtime.completion complete;
        public @OriginalName(value="mcidev_sysfs_attribute") Ptr<?> mc_driver_sysfs_attributes;
        public DelayedDefinitions.delayed_work work;
        public EdacDefinitions.edac_raw_error_desc error_desc;
        public int op_state;
        public Ptr<runtime.dentry> debugfs;
        public char @Size(value=3) [] fake_inject_layer;
        public boolean fake_inject_ue;
        public @Unsigned short fake_inject_count;
    }

    @Type(noCCodeGeneration=true, cType="enum mem_type")
    public static enum mem_type implements Enum<mem_type>,
    TypedEnum<mem_type, Integer>
    {
        MEM_EMPTY,
        MEM_RESERVED,
        MEM_UNKNOWN,
        MEM_FPM,
        MEM_EDO,
        MEM_BEDO,
        MEM_SDR,
        MEM_RDR,
        MEM_DDR,
        MEM_RDDR,
        MEM_RMBS,
        MEM_DDR2,
        MEM_FB_DDR2,
        MEM_RDDR2,
        MEM_XDR,
        MEM_DDR3,
        MEM_RDDR3,
        MEM_LRDDR3,
        MEM_LPDDR3,
        MEM_DDR4,
        MEM_RDDR4,
        MEM_LRDDR4,
        MEM_LPDDR4,
        MEM_DDR5,
        MEM_RDDR5,
        MEM_LRDDR5,
        MEM_NVDIMM,
        MEM_WIO2,
        MEM_HBM2,
        MEM_HBM3;

    }

    @Type(noCCodeGeneration=true, cType="struct mem_extent")
    @NotUsableInJava
    public static class mem_extent
    extends Struct {
        public ListDefinitions.list_head hook;
        public @Unsigned long start;
        public @Unsigned long end;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_zone_bm_rtree")
    @NotUsableInJava
    public static class mem_zone_bm_rtree
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head nodes;
        public ListDefinitions.list_head leaves;
        public @Unsigned long start_pfn;
        public @Unsigned long end_pfn;
        public Ptr<misc.rtree_node> rtree;
        public int levels;
        public @Unsigned int blocks;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_section")
    @NotUsableInJava
    public static class mem_section
    extends Struct {
        public @Unsigned long section_mem_map;
        public Ptr<mem_section_usage> usage;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_section_usage")
    @NotUsableInJava
    public static class mem_section_usage
    extends Struct {
        public misc.callback_head rcu;
        public @Unsigned long @Size(value=1) [] subsection_map;
        public @Unsigned long @Size(value=0) [] pageblock_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int addr; long long unsigned int size; long long unsigned int attr; unsigned int type; }")
    @NotUsableInJava
    public static class mem_of_xenpf_efi_info
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long addr;
        public @Unsigned @OriginalName(value="uint64_t") long size;
        public @Unsigned @OriginalName(value="uint64_t") long attr;
        public @Unsigned @OriginalName(value="uint32_t") int type;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_cgroup_per_node")
    @NotUsableInJava
    public static class mem_cgroup_per_node
    extends Struct {
        public Ptr<mem_cgroup> memcg;
        public Ptr<misc.lruvec_stats_percpu> lruvec_stats_percpu;
        public Ptr<misc.lruvec_stats> lruvec_stats;
        public Ptr<misc.shrinker_info> shrinker_info;
        public misc.cacheline_padding _pad1_;
        public runtime.lruvec lruvec;
        public misc.cacheline_padding _pad2_;
        public @Unsigned long @Size(value=25) [] lru_zone_size;
        public mem_cgroup_reclaim_iter iter;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_cgroup_reclaim_iter")
    @NotUsableInJava
    public static class mem_cgroup_reclaim_iter
    extends Struct {
        public Ptr<mem_cgroup> position;
        public AtomicDefinitions.atomic_t generation;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_cgroup_id")
    @NotUsableInJava
    public static class mem_cgroup_id
    extends Struct {
        public int id;
        public @OriginalName(value="refcount_t") misc.refcount_struct ref;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_dqinfo")
    @NotUsableInJava
    public static class mem_dqinfo
    extends Struct {
        public Ptr<QuotaDefinitions.quota_format_type> dqi_format;
        public int dqi_fmt_id;
        public ListDefinitions.list_head dqi_dirty_list;
        public @Unsigned long dqi_flags;
        public @Unsigned int dqi_bgrace;
        public @Unsigned int dqi_igrace;
        public @OriginalName(value="qsize_t") long dqi_max_spc_limit;
        public @OriginalName(value="qsize_t") long dqi_max_ino_limit;
        public Ptr<?> dqi_priv;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_dqblk")
    @NotUsableInJava
    public static class mem_dqblk
    extends Struct {
        public @OriginalName(value="qsize_t") long dqb_bhardlimit;
        public @OriginalName(value="qsize_t") long dqb_bsoftlimit;
        public @OriginalName(value="qsize_t") long dqb_curspace;
        public @OriginalName(value="qsize_t") long dqb_rsvspace;
        public @OriginalName(value="qsize_t") long dqb_ihardlimit;
        public @OriginalName(value="qsize_t") long dqb_isoftlimit;
        public @OriginalName(value="qsize_t") long dqb_curinodes;
        public @OriginalName(value="time64_t") long dqb_btime;
        public @OriginalName(value="time64_t") long dqb_itime;
    }

    @Type(noCCodeGeneration=true, cType="struct mem_cgroup")
    @NotUsableInJava
    public static class mem_cgroup
    extends Struct {
        public CgroupDefinitions.cgroup_subsys_state css;
        public mem_cgroup_id id;
        public PageDefinitions.page_counter memory;
        @InlineUnion(value=1860)
        public @InlineUnion(value=1860) PageDefinitions.page_counter swap;
        @InlineUnion(value=1860)
        public @InlineUnion(value=1860) PageDefinitions.page_counter memsw;
        public ListDefinitions.list_head memory_peaks;
        public ListDefinitions.list_head swap_peaks;
        public  @OriginalName(value="spinlock_t") runtime.spinlock peaks_lock;
        public misc.work_struct high_work;
        public @Unsigned long zswap_max;
        public boolean zswap_writeback;
        public runtime.vmpressure vmpressure;
        public boolean oom_group;
        public int swappiness;
        public CgroupDefinitions.cgroup_file events_file;
        public CgroupDefinitions.cgroup_file events_local_file;
        public CgroupDefinitions.cgroup_file swap_events_file;
        public Ptr<MemcgDefinitions.memcg_vmstats> vmstats;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=9) [] memory_events;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t @Size(value=9) [] memory_events_local;
        public @Unsigned long socket_pressure;
        public int kmemcg_id;
        public Ptr<ObjDefinitions.obj_cgroup> objcg;
        public Ptr<ObjDefinitions.obj_cgroup> orig_objcg;
        public ListDefinitions.list_head objcg_list;
        public Ptr<MemcgDefinitions.memcg_vmstats_percpu> vmstats_percpu;
        public ListDefinitions.list_head cgwb_list;
        public WbDefinitions.wb_domain cgwb_domain;
        public MemcgDefinitions.memcg_cgwb_frn @Size(value=4) [] cgwb_frn;
        public DeferredDefinitions.deferred_split deferred_split_queue;
        public LruDefinitions.lru_gen_mm_list mm_list;
        public Ptr<mem_cgroup_per_node> @Size(value=0) [] nodeinfo;
    }
}

