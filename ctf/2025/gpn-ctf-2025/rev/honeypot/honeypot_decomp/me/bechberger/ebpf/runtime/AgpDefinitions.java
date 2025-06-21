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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AgpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_add_bridge(Ptr<agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<agp_bridge_data> agp_alloc_bridge() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<agp_bridge_data> agp_backend_acquire(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_backend_initialize(Ptr<agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_backend_release(Ptr<agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_intel_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_intel_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="agp_intel_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int agp_intel_probe(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_intel_remove(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_intel_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_put_bridge(Ptr<agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_remove_bridge(Ptr<agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_setup(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_amd64_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_amd64_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_amd64_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="agp_amd64_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int agp_amd64_probe(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_amd64_remove(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_amd64_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_aperture_valid(@Unsigned long aper, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_alloc_page_array(@Unsigned long size, Ptr<agp_memory> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<agp_memory> agp_allocate_memory(Ptr<agp_bridge_data> bridge, @Unsigned long page_count, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_bind_memory(Ptr<agp_memory> curr, @OriginalName(value="off_t") long pg_start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int agp_collect_device_status(Ptr<agp_bridge_data> bridge, @Unsigned int requested_mode, @Unsigned int bridge_agpstat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_copy_info(Ptr<agp_bridge_data> bridge, Ptr<agp_kern_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<agp_memory> agp_create_memory(int scratch_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_device_command(@Unsigned int bridge_agpstat, boolean agp_v3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_enable(Ptr<agp_bridge_data> bridge, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_free_key(int key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_free_memory(Ptr<agp_memory> curr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<agp_memory> agp_generic_alloc_by_type(@Unsigned long page_count, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> agp_generic_alloc_page(Ptr<agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_generic_alloc_pages(Ptr<agp_bridge_data> bridge, Ptr<agp_memory> mem, @Unsigned long num_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<agp_memory> agp_generic_alloc_user(@Unsigned long page_count, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_generic_create_gatt_table(Ptr<agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_generic_destroy_page(Ptr<runtime.page> page2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_generic_destroy_pages(Ptr<agp_memory> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_generic_enable(Ptr<agp_bridge_data> bridge, @Unsigned int requested_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<agp_bridge_data> agp_generic_find_bridge(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_generic_free_by_type(Ptr<agp_memory> curr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_generic_free_gatt_table(Ptr<agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_generic_insert_memory(Ptr<agp_memory> mem, @OriginalName(value="off_t") long pg_start, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long agp_generic_mask_memory(Ptr<agp_bridge_data> bridge, @Unsigned @OriginalName(value="dma_addr_t") long addr2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_generic_remove_memory(Ptr<agp_memory> mem, @OriginalName(value="off_t") long pg_start, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_generic_type_to_mask_type(Ptr<agp_bridge_data> bridge, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_get_key() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_num_entries() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_unbind_memory(Ptr<agp_memory> curr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_v2_parse_one(Ptr<@Unsigned Integer> requested_mode, Ptr<@Unsigned Integer> bridge_agpstat, Ptr<@Unsigned Integer> vga_agpstat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_v3_parse_one(Ptr<@Unsigned Integer> requested_mode, Ptr<@Unsigned Integer> bridge_agpstat, Ptr<@Unsigned Integer> vga_agpstat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_via_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_via_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="agp_via_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int agp_via_probe(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void agp_via_remove(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int agp_via_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct agp_device_ids")
    @NotUsableInJava
    public static class agp_device_ids
    extends Struct {
        public @Unsigned short device_id;
        public misc.chipset_type chipset;
        public String chipset_name;
        public Ptr<?> chipset_setup;
    }

    @Type(noCCodeGeneration=true, cType="struct agp_bridge_driver")
    @NotUsableInJava
    public static class agp_bridge_driver
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<?> aperture_sizes;
        public int num_aperture_sizes;
        public misc.aper_size_type size_type;
        public boolean cant_use_aperture;
        public boolean needs_scratch_page;
        public Ptr<misc.gatt_mask> masks;
        public Ptr<?> fetch_size;
        public Ptr<?> configure;
        public Ptr<?> agp_enable;
        public Ptr<?> cleanup;
        public Ptr<?> tlb_flush;
        public Ptr<?> mask_memory;
        public Ptr<?> cache_flush;
        public Ptr<?> create_gatt_table;
        public Ptr<?> free_gatt_table;
        public Ptr<?> insert_memory;
        public Ptr<?> remove_memory;
        public Ptr<?> alloc_by_type;
        public Ptr<?> free_by_type;
        public Ptr<?> agp_alloc_page;
        public Ptr<?> agp_alloc_pages;
        public Ptr<?> agp_destroy_page;
        public Ptr<?> agp_destroy_pages;
        public Ptr<?> agp_type_to_mask_type;
    }

    @Type(noCCodeGeneration=true, cType="struct agp_bridge_data")
    @NotUsableInJava
    public static class agp_bridge_data
    extends Struct {
        public Ptr<agp_version> version;
        public Ptr<agp_bridge_driver> driver;
        public Ptr<VmDefinitions.vm_operations_struct> vm_ops;
        public Ptr<?> previous_size;
        public Ptr<?> current_size;
        public Ptr<?> dev_private_data;
        public Ptr<PciDefinitions.pci_dev> dev;
        public Ptr<@Unsigned Integer> gatt_table;
        public Ptr<@Unsigned Integer> gatt_table_real;
        public @Unsigned long scratch_page;
        public Ptr<runtime.page> scratch_page_page;
        public @Unsigned @OriginalName(value="dma_addr_t") long scratch_page_dma;
        public @Unsigned long gart_bus_addr;
        public @Unsigned long gatt_bus_addr;
        public @Unsigned int mode;
        public Ptr<@Unsigned Long> key_list;
        public AtomicDefinitions.atomic_t current_memory_agp;
        public AtomicDefinitions.atomic_t agp_in_use;
        public int max_memory_agp;
        public int aperture_size_idx;
        public int capndx;
        public int flags;
        public char major_version;
        public char minor_version;
        public ListDefinitions.list_head list;
        public @Unsigned int apbase_config;
        public ListDefinitions.list_head mapped_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock mapped_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct agp_memory")
    @NotUsableInJava
    public static class agp_memory
    extends Struct {
        public Ptr<agp_memory> next;
        public Ptr<agp_memory> prev;
        public Ptr<agp_bridge_data> bridge;
        public Ptr<Ptr<runtime.page>> pages;
        public @Unsigned long page_count;
        public int key;
        public int num_scratch_pages;
        public @OriginalName(value="off_t") long pg_start;
        public @Unsigned int type;
        public @Unsigned int physical;
        public boolean is_bound;
        public boolean is_flushed;
        public ListDefinitions.list_head mapped_list;
        public Ptr<runtime.scatterlist> sg_list;
        public int num_sg;
    }

    @Type(noCCodeGeneration=true, cType="struct agp_kern_info")
    @NotUsableInJava
    public static class agp_kern_info
    extends Struct {
        public agp_version version;
        public Ptr<PciDefinitions.pci_dev> device;
        public misc.chipset_type chipset;
        public @Unsigned long mode;
        public @Unsigned long aper_base;
        public @Unsigned long aper_size;
        public int max_memory;
        public int current_memory;
        public boolean cant_use_aperture;
        public @Unsigned long page_mask;
        public Ptr<VmDefinitions.vm_operations_struct> vm_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct agp_version")
    @NotUsableInJava
    public static class agp_version
    extends Struct {
        public @Unsigned short major;
        public @Unsigned short minor;
    }
}

