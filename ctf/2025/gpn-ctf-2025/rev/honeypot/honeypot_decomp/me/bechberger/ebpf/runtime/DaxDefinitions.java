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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IomapDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XaDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DaxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__dax_driver_register($arg1, $arg2, (const u8*)$arg3)")
    public static int __dax_driver_register(Ptr<dax_device_driver> dax_drv, Ptr<runtime.module> module2, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_bus_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int dax_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_bus_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_bus_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_bus_uevent((const struct device*)$arg1, $arg2)")
    public static int dax_bus_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_driver_unregister(Ptr<dax_device_driver> dax_drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_mapping_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_region_unregister(Ptr<?> region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short dax_region_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dax_invalidate_entry(Ptr<misc.address_space> mapping, @Unsigned long index2, boolean trunc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_add_host(Ptr<dax_device> dax_dev, Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dax_alive(Ptr<dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> dax_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dax_copy_from_iter(Ptr<dax_device> dax_dev, @Unsigned long pgoff, Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dax_copy_to_iter(Ptr<dax_device> dax_dev, @Unsigned long pgoff, Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_core_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_core_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_dedupe_file_range_compare($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct iomap_ops*)$arg7)")
    public static int dax_dedupe_file_range_compare(Ptr<runtime.inode> src, @OriginalName(value="loff_t") long srcoff, Ptr<runtime.inode> dst, @OriginalName(value="loff_t") long dstoff, @OriginalName(value="loff_t") long len, Ptr<@OriginalName(value="bool") Boolean> same, Ptr<IomapDefinitions.iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_delete_mapping_entry(Ptr<misc.address_space> mapping, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_destroy_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dax_direct_access(Ptr<dax_device> dax_dev, @Unsigned long pgoff, long nr_pages, dax_access_mode mode, Ptr<Ptr<?>> kaddr, Ptr< @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_disassociate_entry(Ptr<?> entry, Ptr<misc.address_space> mapping, boolean trunc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_fault_cow_page($arg1, (const struct iomap_iter*)$arg2)")
    public static @Unsigned @OriginalName(value="vm_fault_t") int dax_fault_cow_page(Ptr<VmDefinitions.vm_fault> vmf, Ptr<IomapDefinitions.iomap_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_fault_iter($arg1, (const struct iomap_iter*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned @OriginalName(value="vm_fault_t") int dax_fault_iter(Ptr<VmDefinitions.vm_fault> vmf, Ptr<IomapDefinitions.iomap_iter> iter2, Ptr< @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfnp, Ptr<XaDefinitions.xa_state> xas, Ptr<Ptr<?>> entry, boolean pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_file_unshare($arg1, $arg2, $arg3, (const struct iomap_ops*)$arg4)")
    public static int dax_file_unshare(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long len, Ptr<IomapDefinitions.iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int dax_finish_sync_fault(Ptr<VmDefinitions.vm_fault> vmf, @Unsigned int order,  @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_flush(Ptr<dax_device> dax_dev, Ptr<?> addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_fs_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dax_get_private(Ptr<dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dax_holder(Ptr<dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_holder_notify_failure(Ptr<dax_device> dax_dev, @Unsigned long off, @Unsigned long len, int mf_flags2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> dax_inode(Ptr<dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_insert_entry($arg1, $arg2, (const struct iomap_iter*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<?> dax_insert_entry(Ptr<XaDefinitions.xa_state> xas, Ptr<VmDefinitions.vm_fault> vmf, Ptr<IomapDefinitions.iomap_iter> iter2, Ptr<?> entry,  @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int dax_insert_pfn_mkwrite(Ptr<VmDefinitions.vm_fault> vmf,  @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_invalidate_mapping_entry_sync(Ptr<misc.address_space> mapping, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_iomap_copy_around($arg1, $arg2, $arg3, (const struct iomap*)$arg4, $arg5)")
    public static int dax_iomap_copy_around(@OriginalName(value="loff_t") long pos, @Unsigned @OriginalName(value="uint64_t") long length, @Unsigned long align_size, Ptr<runtime.iomap> srcmap, Ptr<?> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_iomap_direct_access((const struct iomap*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int dax_iomap_direct_access(Ptr<runtime.iomap> iomap2, @OriginalName(value="loff_t") long pos, @Unsigned long size, Ptr<Ptr<?>> kaddr, Ptr< @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfnp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_iomap_fault($arg1, $arg2, $arg3, $arg4, (const struct iomap_ops*)$arg5)")
    public static @Unsigned @OriginalName(value="vm_fault_t") int dax_iomap_fault(Ptr<VmDefinitions.vm_fault> vmf, @Unsigned int order, Ptr< @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfnp, Ptr<Integer> iomap_errp, Ptr<IomapDefinitions.iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_iomap_iter((const struct iomap_iter*)$arg1, $arg2)")
    public static @OriginalName(value="loff_t") long dax_iomap_iter(Ptr<IomapDefinitions.iomap_iter> iomi, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_iomap_pmd_fault($arg1, $arg2, (const struct iomap_ops*)$arg3)")
    public static @Unsigned @OriginalName(value="vm_fault_t") int dax_iomap_pmd_fault(Ptr<VmDefinitions.vm_fault> vmf, Ptr< @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfnp, Ptr<IomapDefinitions.iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_iomap_pte_fault($arg1, $arg2, $arg3, (const struct iomap_ops*)$arg4)")
    public static @Unsigned @OriginalName(value="vm_fault_t") int dax_iomap_pte_fault(Ptr<VmDefinitions.vm_fault> vmf, Ptr< @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfnp, Ptr<Integer> iomap_errp, Ptr<IomapDefinitions.iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_iomap_rw($arg1, $arg2, (const struct iomap_ops*)$arg3)")
    public static @OriginalName(value="ssize_t") long dax_iomap_rw(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<IomapDefinitions.iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> dax_layout_busy_page(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> dax_layout_busy_page_range(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dax_entry_t") long dax_lock_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dax_entry_t") long dax_lock_mapping_entry(Ptr<misc.address_space> mapping, @Unsigned long index2, Ptr<Ptr<runtime.page>> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_pmd_load_hole($arg1, $arg2, (const struct iomap_iter*)$arg3, $arg4)")
    public static @Unsigned @OriginalName(value="vm_fault_t") int dax_pmd_load_hole(Ptr<XaDefinitions.xa_state> xas, Ptr<VmDefinitions.vm_fault> vmf, Ptr<IomapDefinitions.iomap_iter> iter2, Ptr<Ptr<?>> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long dax_range_compare_iter(Ptr<IomapDefinitions.iomap_iter> it_src, Ptr<IomapDefinitions.iomap_iter> it_dest, @Unsigned long len, Ptr<@OriginalName(value="bool") Boolean> same) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_read_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_read_unlock(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dax_recovery_write(Ptr<dax_device> dax_dev, @Unsigned long pgoff, Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_remap_file_range_prep($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct iomap_ops*)$arg7)")
    public static int dax_remap_file_range_prep(Ptr<runtime.file> file_in, @OriginalName(value="loff_t") long pos_in, Ptr<runtime.file> file_out, @OriginalName(value="loff_t") long pos_out, Ptr<@OriginalName(value="loff_t") Long> len, @Unsigned int remap_flags, Ptr<IomapDefinitions.iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_remove_host(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dax_seed_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_set(Ptr<runtime.inode> inode2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dax_synchronous(Ptr<dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_test(Ptr<runtime.inode> inode2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_truncate_page($arg1, $arg2, $arg3, (const struct iomap_ops*)$arg4)")
    public static int dax_truncate_page(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, Ptr<@OriginalName(value="bool") Boolean> did_zero, Ptr<IomapDefinitions.iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_unlock_entry(Ptr<XaDefinitions.xa_state> xas, Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_unlock_folio(Ptr<runtime.folio> folio2, @Unsigned @OriginalName(value="dax_entry_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_unlock_mapping_entry(Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned @OriginalName(value="dax_entry_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_wake_entry(Ptr<XaDefinitions.xa_state> xas, Ptr<?> entry, dax_wake_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dax_write_cache(Ptr<dax_device> dax_dev, boolean wc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dax_write_cache_enabled(Ptr<dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_writeback_mapping_range(Ptr<misc.address_space> mapping, Ptr<dax_device> dax_dev, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_writeback_one(Ptr<XaDefinitions.xa_state> xas, Ptr<dax_device> dax_dev, Ptr<misc.address_space> mapping, Ptr<?> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dax_zero_page_range(Ptr<dax_device> dax_dev, @Unsigned long pgoff, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dax_zero_range($arg1, $arg2, $arg3, $arg4, (const struct iomap_ops*)$arg5)")
    public static int dax_zero_range(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long len, Ptr<@OriginalName(value="bool") Boolean> did_zero, Ptr<IomapDefinitions.iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dax_id")
    @NotUsableInJava
    public static class dax_id
    extends Struct {
        public ListDefinitions.list_head list;
        public char @Size(value=30) [] dev_name;
    }

    @Type(noCCodeGeneration=true, cType="struct dax_device_driver")
    @NotUsableInJava
    public static class dax_device_driver
    extends Struct {
        public DeviceDefinitions.device_driver drv;
        public ListDefinitions.list_head ids;
        public dax_driver_type type;
        public Ptr<?> probe;
        public Ptr<?> remove;
    }

    @Type(noCCodeGeneration=true, cType="enum dax_driver_type")
    public static enum dax_driver_type implements Enum<dax_driver_type>,
    TypedEnum<dax_driver_type, Integer>
    {
        DAXDRV_KMEM_TYPE,
        DAXDRV_DEVICE_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="struct dax_mapping")
    @NotUsableInJava
    public static class dax_mapping
    extends Struct {
        public runtime.device dev;
        public int range_id;
        public int id;
    }

    @Type(noCCodeGeneration=true, cType="struct dax_region")
    @NotUsableInJava
    public static class dax_region
    extends Struct {
        public int id;
        public int target_node;
        public runtime.kref kref;
        public Ptr<runtime.device> dev;
        public @Unsigned int align;
        public runtime.ida ida;
        public runtime.resource res;
        public Ptr<runtime.device> seed;
        public Ptr<runtime.device> youngest;
    }

    @Type(noCCodeGeneration=true, cType="enum dax_device_flags")
    public static enum dax_device_flags implements Enum<dax_device_flags>,
    TypedEnum<dax_device_flags, Integer>
    {
        DAXDEV_ALIVE,
        DAXDEV_WRITE_CACHE,
        DAXDEV_SYNC,
        DAXDEV_NOCACHE,
        DAXDEV_NOMC;

    }

    @Type(noCCodeGeneration=true, cType="struct dax_holder_operations")
    @NotUsableInJava
    public static class dax_holder_operations
    extends Struct {
        public Ptr<?> notify_failure;
    }

    @Type(noCCodeGeneration=true, cType="struct dax_device")
    @NotUsableInJava
    public static class dax_device
    extends Struct {
        public runtime.inode inode;
        public runtime.cdev cdev;
        public Ptr<?> _private;
        public @Unsigned long flags;
        public Ptr<dax_operations> ops;
        public Ptr<?> holder_data;
        public Ptr<dax_holder_operations> holder_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct dax_operations")
    @NotUsableInJava
    public static class dax_operations
    extends Struct {
        public Ptr<?> direct_access;
        public Ptr<?> dax_supported;
        public Ptr<?> zero_page_range;
        public Ptr<?> recovery_write;
    }

    @Type(noCCodeGeneration=true, cType="enum dax_wake_mode")
    public static enum dax_wake_mode implements Enum<dax_wake_mode>,
    TypedEnum<dax_wake_mode, Integer>
    {
        WAKE_ALL,
        WAKE_NEXT;

    }

    @Type(noCCodeGeneration=true, cType="enum dax_access_mode")
    public static enum dax_access_mode implements Enum<dax_access_mode>,
    TypedEnum<dax_access_mode, Integer>
    {
        DAX_ACCESS,
        DAX_RECOVERY_WRITE;

    }
}

