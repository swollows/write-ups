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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NvdimmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nd_btt_arena_is_valid(Ptr<nd_btt> nd_btt2, Ptr<misc.btt_sb> _super) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> nd_btt_create(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_btt_probe(Ptr<runtime.device> dev, Ptr<nd_namespace_common> ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_btt_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_btt_version(Ptr<nd_btt> nd_btt2, Ptr<nd_namespace_common> ndns, Ptr<misc.btt_sb> btt_sb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long nd_pmem_available_dpa(Ptr<nd_region> nd_region2, Ptr<nd_mapping> nd_mapping2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long nd_pmem_max_contiguous_dpa(Ptr<nd_region> nd_region2, Ptr<nd_mapping> nd_mapping2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_region_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_notify(Ptr<runtime.device> dev, NvdimmDefinitions.nvdimm_event event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_region_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __nd_label_validate(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nd_alloc_stack(Ptr<runtime.nameidata> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<nd_dax> nd_dax_alloc(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> nd_dax_create(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_dax_probe(Ptr<runtime.device> dev, Ptr<nd_namespace_common> ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_dax_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_jump_link((const struct path*)$arg1)")
    public static int nd_jump_link(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_jump_root(Ptr<runtime.nameidata> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<nd_namespace_label> nd_label_active(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_label_active_count(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int nd_label_alloc_slot(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_label_copy(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd, Ptr<nd_namespace_index> dst, Ptr<nd_namespace_index> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_label_data_init(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nd_label_free_slot(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd, @Unsigned int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_label_gen_id($arg1, (const struct {\n  u8 b[16];\n}*)$arg2, $arg3)")
    public static String nd_label_gen_id(Ptr<nd_label_id> label_id, Ptr<misc.uuid_t> uuid, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_label_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int nd_label_nfree(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_label_reserve_dpa(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_label_write_index(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd, int index2, @Unsigned int seq, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_pmem_namespace_label_update(Ptr<nd_region> nd_region2, Ptr<nd_namespace_pmem> nspm, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct {\n  u8 b[16];\n}*)nd_dev_to_uuid($arg1))")
    public static Ptr<misc.uuid_t> nd_dev_to_uuid(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long nd_fletcher64(Ptr<?> addr2, @Unsigned long len, boolean le) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nd_is_uuid_unique(Ptr<runtime.device> dev, Ptr<misc.uuid_t> uuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_namespace_label_update(Ptr<nd_region> nd_region2, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_namespace_pmem_set_resource(Ptr<nd_region> nd_region2, Ptr<nd_namespace_pmem> nspm, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<nd_pfn> nd_pfn_alloc(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_pfn_clear_memmap_errors(Ptr<nd_pfn> nd_pfn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> nd_pfn_create(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> nd_pfn_devinit(Ptr<nd_pfn> nd_pfn2, Ptr<nd_namespace_common> ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_pfn_init(Ptr<nd_pfn> nd_pfn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_pfn_probe(Ptr<runtime.device> dev, Ptr<nd_namespace_common> ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_pfn_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_pfn_validate($arg1, (const u8*)$arg2)")
    public static int nd_pfn_validate(Ptr<nd_pfn> nd_pfn2, String sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_create_btt_seed(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_create_dax_seed(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_create_ns_seed(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_create_pfn_seed(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_region_register_namespaces(Ptr<nd_region> nd_region2, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_size_select_show($arg1, (const long unsigned int*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long nd_size_select_show(@Unsigned long current_size, Ptr<@Unsigned Long> supported, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_size_select_store($arg1, (const u8*)$arg2, $arg3, (const long unsigned int*)$arg4)")
    public static @OriginalName(value="ssize_t") long nd_size_select_store(Ptr<runtime.device> dev, String buf, Ptr<@Unsigned Long> current_size, Ptr<@Unsigned Long> supported) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_uuid_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int nd_uuid_store(Ptr<runtime.device> dev, Ptr<Ptr<misc.uuid_t>> uuid_out, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __nd_attach_ndns(Ptr<runtime.device> dev, Ptr<nd_namespace_common> attach, Ptr<Ptr<nd_namespace_common>> _ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __nd_detach_ndns(Ptr<runtime.device> dev, Ptr<Ptr<nd_namespace_common>> _ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __nd_device_register(Ptr<runtime.device> dev, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nd_driver_register($arg1, $arg2, (const u8*)$arg3)")
    public static int __nd_driver_register(Ptr<nd_device_driver> nd_drv, Ptr<runtime.module> owner, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __nd_ioctl(Ptr<NvdimmDefinitions.nvdimm_bus> nvdimm_bus2, Ptr<runtime.nvdimm> nvdimm2, int read_only, @Unsigned int ioctl_cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_async_device_register(Ptr<?> d, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_async_device_unregister(Ptr<?> d, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nd_attach_ndns(Ptr<runtime.device> dev, Ptr<nd_namespace_common> attach, Ptr<Ptr<nd_namespace_common>> _ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_bus_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_bus_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct nd_cmd_desc*)nd_cmd_bus_desc($arg1))")
    public static Ptr<nd_cmd_desc> nd_cmd_bus_desc(int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct nd_cmd_desc*)nd_cmd_dimm_desc($arg1))")
    public static Ptr<nd_cmd_desc> nd_cmd_dimm_desc(int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_cmd_in_size($arg1, $arg2, (const struct nd_cmd_desc*)$arg3, $arg4, $arg5)")
    public static @Unsigned int nd_cmd_in_size(Ptr<runtime.nvdimm> nvdimm2, int cmd, Ptr<nd_cmd_desc> desc, int idx, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_cmd_out_size($arg1, $arg2, (const struct nd_cmd_desc*)$arg3, $arg4, (const unsigned int*)$arg5, (const unsigned int*)$arg6, $arg7)")
    public static @Unsigned int nd_cmd_out_size(Ptr<runtime.nvdimm> nvdimm2, int cmd, Ptr<nd_cmd_desc> desc, int idx, Ptr<@Unsigned Integer> in_field, Ptr<@Unsigned Integer> out_field, @Unsigned long remainder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_detach_ndns(Ptr<runtime.device> dev, Ptr<Ptr<nd_namespace_common>> _ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_device_notify(Ptr<runtime.device> dev, NvdimmDefinitions.nvdimm_event event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_device_register(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_device_register_sync(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_device_unregister(Ptr<runtime.device> dev, nd_async_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long nd_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2, nd_ioctl_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_mapping_free_labels(Ptr<nd_mapping> nd_mapping2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_namespace_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long nd_namespace_store(Ptr<runtime.device> dev, Ptr<Ptr<nd_namespace_common>> _ndns, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_ns_forget_poison_check(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short nd_numa_attr_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_pmem_forget_poison_check(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int nd_region_acquire_lane(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_region_activate(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_advance_seeds(Ptr<nd_region> nd_region2, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long nd_region_allocatable_dpa(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long nd_region_available_dpa(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_region_conflict(Ptr<nd_region> nd_region2, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nd_region_create($arg1, $arg2, (const struct device_type*)$arg3, (const u8*)$arg4)")
    public static Ptr<nd_region> nd_region_create(Ptr<NvdimmDefinitions.nvdimm_bus> nvdimm_bus2, Ptr<nd_region_desc> ndr_desc, Ptr<DeviceDefinitions.device_type> dev_type2, String caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> nd_region_dev(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long nd_region_interleave_set_altcookie(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long nd_region_interleave_set_cookie(Ptr<nd_region> nd_region2, Ptr<nd_namespace_index> nsindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> nd_region_provider_data(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_region_release_lane(Ptr<nd_region> nd_region2, @Unsigned int lane) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nd_region_to_nstype(Ptr<nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long nd_sb_checksum(Ptr<nd_gen_sb> nd_gen_sb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nd_synchronize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct btt")
    @NotUsableInJava
    public static class btt
    extends Struct {
        public Ptr<runtime.gendisk> btt_disk;
        public ListDefinitions.list_head arena_list;
        public Ptr<runtime.dentry> debugfs_dir;
        public Ptr<nd_btt> nd_btt;
        public @Unsigned long nlba;
        public @Unsigned long rawsize;
        public @Unsigned int lbasize;
        public @Unsigned int sector_size;
        public Ptr<nd_region> nd_region;
        public runtime.mutex init_lock;
        public int init_state;
        public int num_arenas;
        public Ptr<runtime.badblocks> phys_bb;
    }

    @Type(noCCodeGeneration=true, cType="enum nd_label_flags")
    public static enum nd_label_flags implements Enum<nd_label_flags>,
    TypedEnum<nd_label_flags, Integer>
    {
        ND_LABEL_REAP;

    }

    @Type(noCCodeGeneration=true, cType="struct nd_namespace_pmem")
    @NotUsableInJava
    public static class nd_namespace_pmem
    extends Struct {
        public nd_namespace_io nsio;
        public @Unsigned long lbasize;
        public String alt_name;
        public Ptr<misc.uuid_t> uuid;
        public int id;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_msg")
    @NotUsableInJava
    public static class nd_msg
    extends Struct {
        public runtime.icmp6hdr icmph;
        public In6Definitions.in6_addr target;
        public char @Size(value=0) [] opt;
    }

    @Type(noCCodeGeneration=true, cType="enum nd_driver_flags")
    public static enum nd_driver_flags implements Enum<nd_driver_flags>,
    TypedEnum<nd_driver_flags, Integer>
    {
        ND_DRIVER_DIMM,
        ND_DRIVER_REGION_PMEM,
        ND_DRIVER_REGION_BLK,
        ND_DRIVER_NAMESPACE_IO,
        ND_DRIVER_NAMESPACE_PMEM,
        ND_DRIVER_DAX_PMEM;

    }

    @Type(noCCodeGeneration=true, cType="struct nd_label_id")
    @NotUsableInJava
    public static class nd_label_id
    extends Struct {
        public char @Size(value=50) [] id;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_cmd_get_config_data_hdr")
    @NotUsableInJava
    public static class nd_cmd_get_config_data_hdr
    extends Struct {
        public @Unsigned int in_offset;
        public @Unsigned int in_length;
        public @Unsigned int status;
        public char @Size(value=0) [] out_buf;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_gen_sb")
    @NotUsableInJava
    public static class nd_gen_sb
    extends Struct {
        public char @Size(value=4088) [] reserved;
        public @Unsigned @OriginalName(value="__le64") long checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_label_ent")
    @NotUsableInJava
    public static class nd_label_ent
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long flags;
        public Ptr<nd_namespace_label> label;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_region_data")
    @NotUsableInJava
    public static class nd_region_data
    extends Struct {
        public int ns_count;
        public int ns_active;
        public @Unsigned int hints_shift;
        public Ptr<?> @Size(value=0) [] flush_wpq;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_namespace_label")
    @NotUsableInJava
    public static class nd_namespace_label
    extends Struct {
        @InlineUnion(value=19379)
        public  @InlineUnion(value=19379) NvdimmDefinitions.nvdimm_cxl_label cxl;
        @InlineUnion(value=19379)
        public  @InlineUnion(value=19379) NvdimmDefinitions.nvdimm_efi_label efi;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_namespace_index")
    @NotUsableInJava
    public static class nd_namespace_index
    extends Struct {
        public char @Size(value=16) [] sig;
        public char @Size(value=3) [] flags;
        public char labelsize;
        public @Unsigned @OriginalName(value="__le32") int seq;
        public @Unsigned @OriginalName(value="__le64") long myoff;
        public @Unsigned @OriginalName(value="__le64") long mysize;
        public @Unsigned @OriginalName(value="__le64") long otheroff;
        public @Unsigned @OriginalName(value="__le64") long labeloff;
        public @Unsigned @OriginalName(value="__le32") int nslot;
        public @Unsigned @OriginalName(value="__le16") short major;
        public @Unsigned @OriginalName(value="__le16") short minor;
        public @Unsigned @OriginalName(value="__le64") long checksum;
        public char @Size(value=0) [] free;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_region_desc")
    @NotUsableInJava
    public static class nd_region_desc
    extends Struct {
        public Ptr<runtime.resource> res;
        public Ptr<nd_mapping_desc> mapping;
        public @Unsigned short num_mappings;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> attr_groups;
        public Ptr<nd_interleave_set> nd_set;
        public Ptr<?> provider_data;
        public int num_lanes;
        public int numa_node;
        public int target_node;
        public @Unsigned long flags;
        public int memregion;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public Ptr<?> flush;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_mapping_desc")
    @NotUsableInJava
    public static class nd_mapping_desc
    extends Struct {
        public Ptr<runtime.nvdimm> nvdimm;
        public @Unsigned long start;
        public @Unsigned long size;
        public int position;
    }

    @Type(noCCodeGeneration=true, cType="enum nd_ioctl_mode")
    public static enum nd_ioctl_mode implements Enum<nd_ioctl_mode>,
    TypedEnum<nd_ioctl_mode, Integer>
    {
        BUS_IOCTL,
        DIMM_IOCTL;

    }

    @Type(noCCodeGeneration=true, cType="enum nd_async_mode")
    public static enum nd_async_mode implements Enum<nd_async_mode>,
    TypedEnum<nd_async_mode, Integer>
    {
        ND_SYNC,
        ND_ASYNC;

    }

    @Type(noCCodeGeneration=true, cType="struct nd_dax")
    @NotUsableInJava
    public static class nd_dax
    extends Struct {
        public nd_pfn nd_pfn;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_pfn_sb")
    @NotUsableInJava
    public static class nd_pfn_sb
    extends Struct {
        public char @Size(value=16) [] signature;
        public char @Size(value=16) [] uuid;
        public char @Size(value=16) [] parent_uuid;
        public @Unsigned @OriginalName(value="__le32") int flags;
        public @Unsigned @OriginalName(value="__le16") short version_major;
        public @Unsigned @OriginalName(value="__le16") short version_minor;
        public @Unsigned @OriginalName(value="__le64") long dataoff;
        public @Unsigned @OriginalName(value="__le64") long npfns;
        public @Unsigned @OriginalName(value="__le32") int mode;
        public @Unsigned @OriginalName(value="__le32") int start_pad;
        public @Unsigned @OriginalName(value="__le32") int end_trunc;
        public @Unsigned @OriginalName(value="__le32") int align;
        public @Unsigned @OriginalName(value="__le32") int page_size;
        public @Unsigned @OriginalName(value="__le16") short page_struct_size;
        public char @Size(value=3994) [] padding;
        public @Unsigned @OriginalName(value="__le64") long checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_pfn")
    @NotUsableInJava
    public static class nd_pfn
    extends Struct {
        public int id;
        public Ptr<misc.uuid_t> uuid;
        public runtime.device dev;
        public @Unsigned long align;
        public @Unsigned long npfns;
        public nd_pfn_mode mode;
        public Ptr<nd_pfn_sb> pfn_sb;
        public Ptr<nd_namespace_common> ndns;
    }

    @Type(noCCodeGeneration=true, cType="enum nd_pfn_mode")
    public static enum nd_pfn_mode implements Enum<nd_pfn_mode>,
    TypedEnum<nd_pfn_mode, Integer>
    {
        PFN_MODE_NONE,
        PFN_MODE_RAM,
        PFN_MODE_PMEM;

    }

    @Type(noCCodeGeneration=true, cType="struct nd_btt")
    @NotUsableInJava
    public static class nd_btt
    extends Struct {
        public runtime.device dev;
        public Ptr<nd_namespace_common> ndns;
        public Ptr<btt> btt;
        public @Unsigned long lbasize;
        public @Unsigned long size;
        public Ptr<misc.uuid_t> uuid;
        public int id;
        public int initial_offset;
        public @Unsigned short version_major;
        public @Unsigned short version_minor;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_mapping")
    @NotUsableInJava
    public static class nd_mapping
    extends Struct {
        public Ptr<runtime.nvdimm> nvdimm;
        public @Unsigned long start;
        public @Unsigned long size;
        public int position;
        public ListDefinitions.list_head labels;
        public runtime.mutex lock;
        public Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_percpu_lane")
    @NotUsableInJava
    public static class nd_percpu_lane
    extends Struct {
        public int count;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_namespace_io")
    @NotUsableInJava
    public static class nd_namespace_io
    extends Struct {
        public nd_namespace_common common;
        public runtime.resource res;
        public @Unsigned @OriginalName(value="resource_size_t") long size;
        public Ptr<?> addr;
        public runtime.badblocks bb;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_namespace_common")
    @NotUsableInJava
    public static class nd_namespace_common
    extends Struct {
        public int force_raw;
        public runtime.device dev;
        public Ptr<runtime.device> claim;
        public NvdimmDefinitions.nvdimm_claim_class claim_class;
        public Ptr<?> rw_bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_device_driver")
    @NotUsableInJava
    public static class nd_device_driver
    extends Struct {
        public DeviceDefinitions.device_driver drv;
        public @Unsigned long type;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
        public Ptr<?> notify;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_cmd_pkg")
    @NotUsableInJava
    public static class nd_cmd_pkg
    extends Struct {
        public @Unsigned long nd_family;
        public @Unsigned long nd_command;
        public @Unsigned int nd_size_in;
        public @Unsigned int nd_size_out;
        public @Unsigned int @Size(value=9) [] nd_reserved2;
        public @Unsigned int nd_fw_size;
        public char @Size(value=0) [] nd_payload;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_cmd_clear_error")
    @NotUsableInJava
    public static class nd_cmd_clear_error
    extends Struct {
        public @Unsigned long address;
        public @Unsigned long length;
        public @Unsigned int status;
        public char @Size(value=4) [] reserved;
        public @Unsigned long cleared;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_cmd_ars_cap")
    @NotUsableInJava
    public static class nd_cmd_ars_cap
    extends Struct {
        public @Unsigned long address;
        public @Unsigned long length;
        public @Unsigned int status;
        public @Unsigned int max_ars_out;
        public @Unsigned int clear_err_unit;
        public @Unsigned short flags;
        public @Unsigned short reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_cmd_vendor_hdr")
    @NotUsableInJava
    public static class nd_cmd_vendor_hdr
    extends Struct {
        public @Unsigned int opcode;
        public @Unsigned int in_length;
        public char @Size(value=0) [] in_buf;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_cmd_set_config_hdr")
    @NotUsableInJava
    public static class nd_cmd_set_config_hdr
    extends Struct {
        public @Unsigned int in_offset;
        public @Unsigned int in_length;
        public char @Size(value=0) [] in_buf;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_cmd_get_config_size")
    @NotUsableInJava
    public static class nd_cmd_get_config_size
    extends Struct {
        public @Unsigned int status;
        public @Unsigned int config_size;
        public @Unsigned int max_xfer;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_region")
    @NotUsableInJava
    public static class nd_region
    extends Struct {
        public runtime.device dev;
        public runtime.ida ns_ida;
        public runtime.ida btt_ida;
        public runtime.ida pfn_ida;
        public runtime.ida dax_ida;
        public @Unsigned long flags;
        public Ptr<runtime.device> ns_seed;
        public Ptr<runtime.device> btt_seed;
        public Ptr<runtime.device> pfn_seed;
        public Ptr<runtime.device> dax_seed;
        public @Unsigned long align;
        public @Unsigned short ndr_mappings;
        public @Unsigned long ndr_size;
        public @Unsigned long ndr_start;
        public int id;
        public int num_lanes;
        public int ro;
        public int numa_node;
        public int target_node;
        public Ptr<?> provider_data;
        public Ptr<KernfsDefinitions.kernfs_node> bb_state;
        public runtime.badblocks bb;
        public Ptr<nd_interleave_set> nd_set;
        public Ptr<nd_percpu_lane> lane;
        public Ptr<?> flush;
        public nd_mapping @Size(value=0) [] mapping;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_interleave_set")
    @NotUsableInJava
    public static class nd_interleave_set
    extends Struct {
        public @Unsigned long cookie1;
        public @Unsigned long cookie2;
        public @Unsigned long altcookie;
        public  @OriginalName(value="guid_t") misc.uuid_t type_guid;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_cmd_desc")
    @NotUsableInJava
    public static class nd_cmd_desc
    extends Struct {
        public int in_num;
        public int out_num;
        public @Unsigned int @Size(value=5) [] in_sizes;
        public int @Size(value=5) [] out_sizes;
    }

    @Type(noCCodeGeneration=true, cType="struct nd_opt_hdr")
    @NotUsableInJava
    public static class nd_opt_hdr
    extends Struct {
        public char nd_opt_type;
        public char nd_opt_len;
    }
}

