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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VmeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __vme_register_driver_bus(Ptr<vme_driver> drv, Ptr<vme_bridge> bridge, @Unsigned int ndevs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vme_alloc_consistent(Ptr<vme_resource> resource2, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_bus_error_handler(Ptr<vme_bridge> bridge, @Unsigned long address, int am) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vme_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int vme_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_bus_num(Ptr<vme_dev> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_bus_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_bus_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_check_window(Ptr<vme_bridge> bridge, @Unsigned int aspace, @Unsigned long vme_base, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_dma_free(Ptr<vme_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_dma_free_attribute(Ptr<vme_dma_attr> attributes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_dma_list_add(Ptr<vme_dma_list> list, Ptr<vme_dma_attr> src, Ptr<vme_dma_attr> dest, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_dma_list_exec(Ptr<vme_dma_list> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_dma_list_free(Ptr<vme_dma_list> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_dma_attr> vme_dma_pattern_attribute(@Unsigned int pattern, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_dma_attr> vme_dma_pci_attribute(@Unsigned @OriginalName(value="dma_addr_t") long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_resource> vme_dma_request(Ptr<vme_dev> vdev, @Unsigned int route) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_dma_attr> vme_dma_vme_attribute(@Unsigned long address, @Unsigned int aspace, @Unsigned int cycle, @Unsigned int dwidth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_free_consistent(Ptr<vme_resource> resource2, @Unsigned long size, Ptr<?> vaddr, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vme_get_size(Ptr<vme_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_bridge> vme_init_bridge(Ptr<vme_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_irq_free(Ptr<vme_dev> vdev, int level, int statid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_irq_generate(Ptr<vme_dev> vdev, int level, int statid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_irq_handler(Ptr<vme_bridge> bridge, int level, int statid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vme_irq_request($arg1, $arg2, $arg3, (void (*)(int, int, void*))$arg4, $arg5)")
    public static int vme_irq_request(Ptr<vme_dev> vdev, int level, int statid, Ptr<?> callback2, Ptr<?> priv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vme_lm_attach($arg1, $arg2, (void (*)(void*))$arg3, $arg4)")
    public static int vme_lm_attach(Ptr<vme_resource> resource2, int monitor, Ptr<?> callback2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_lm_count(Ptr<vme_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_lm_detach(Ptr<vme_resource> resource2, int monitor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_lm_free(Ptr<vme_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_lm_get(Ptr<vme_resource> resource2, Ptr<@Unsigned Long> lm_base, Ptr<@Unsigned Integer> aspace, Ptr<@Unsigned Integer> cycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_resource> vme_lm_request(Ptr<vme_dev> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_lm_set(Ptr<vme_resource> resource2, @Unsigned long lm_base, @Unsigned int aspace, @Unsigned int cycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_master_free(Ptr<vme_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_master_get(Ptr<vme_resource> resource2, Ptr<Integer> enabled, Ptr<@Unsigned Long> vme_base, Ptr<@Unsigned Long> size, Ptr<@Unsigned Integer> aspace, Ptr<@Unsigned Integer> cycle, Ptr<@Unsigned Integer> dwidth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_master_mmap(Ptr<vme_resource> resource2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vme_master_read(Ptr<vme_resource> resource2, Ptr<?> buf, @Unsigned long count, @OriginalName(value="loff_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_resource> vme_master_request(Ptr<vme_dev> vdev, @Unsigned int address, @Unsigned int cycle, @Unsigned int dwidth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int vme_master_rmw(Ptr<vme_resource> resource2, @Unsigned int mask, @Unsigned int compare, @Unsigned int swap, @OriginalName(value="loff_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_master_set(Ptr<vme_resource> resource2, int enabled, @Unsigned long vme_base, @Unsigned long size, @Unsigned int aspace, @Unsigned int cycle, @Unsigned int dwidth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vme_master_write(Ptr<vme_resource> resource2, Ptr<?> buf, @Unsigned long count, @OriginalName(value="loff_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_dma_list> vme_new_dma_list(Ptr<vme_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_register_bridge(Ptr<vme_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_register_driver(Ptr<vme_driver> drv, @Unsigned int ndevs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_error_handler> vme_register_error_handler(Ptr<vme_bridge> bridge, @Unsigned int aspace, @Unsigned long address, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_slave_free(Ptr<vme_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_slave_get(Ptr<vme_resource> resource2, Ptr<Integer> enabled, Ptr<@Unsigned Long> vme_base, Ptr<@Unsigned Long> size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> buf_base, Ptr<@Unsigned Integer> aspace, Ptr<@Unsigned Integer> cycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vme_resource> vme_slave_request(Ptr<vme_dev> vdev, @Unsigned int address, @Unsigned int cycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_slave_set(Ptr<vme_resource> resource2, int enabled, @Unsigned long vme_base, @Unsigned long size, @Unsigned @OriginalName(value="dma_addr_t") long buf_base, @Unsigned int aspace, @Unsigned int cycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vme_slot_num(Ptr<vme_dev> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_unregister_bridge(Ptr<vme_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_unregister_driver(Ptr<vme_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vme_unregister_error_handler(Ptr<vme_error_handler> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vme_irq")
    @NotUsableInJava
    public static class vme_irq
    extends Struct {
        public int count;
        public vme_callback @Size(value=256) [] callback;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_callback")
    @NotUsableInJava
    public static class vme_callback
    extends Struct {
        public Ptr<?> func;
        public Ptr<?> priv_data;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_error_handler")
    @NotUsableInJava
    public static class vme_error_handler
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned long first_error;
        public @Unsigned int aspace;
        public @Unsigned int num_errors;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_lm_resource")
    @NotUsableInJava
    public static class vme_lm_resource
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<vme_bridge> parent;
        public runtime.mutex mtx;
        public int locked;
        public int number;
        public int monitors;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_dma_resource")
    @NotUsableInJava
    public static class vme_dma_resource
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<vme_bridge> parent;
        public runtime.mutex mtx;
        public int locked;
        public int number;
        public ListDefinitions.list_head pending;
        public ListDefinitions.list_head running;
        public @Unsigned int route_attr;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_dma_list")
    @NotUsableInJava
    public static class vme_dma_list
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<vme_dma_resource> parent;
        public ListDefinitions.list_head entries;
        public runtime.mutex mtx;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_dma_vme")
    @NotUsableInJava
    public static class vme_dma_vme
    extends Struct {
        public @Unsigned long address;
        public @Unsigned int aspace;
        public @Unsigned int cycle;
        public @Unsigned int dwidth;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_dma_pci")
    @NotUsableInJava
    public static class vme_dma_pci
    extends Struct {
        public @Unsigned @OriginalName(value="dma_addr_t") long address;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_dma_pattern")
    @NotUsableInJava
    public static class vme_dma_pattern
    extends Struct {
        public @Unsigned int pattern;
        public @Unsigned int type;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_slave_resource")
    @NotUsableInJava
    public static class vme_slave_resource
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<vme_bridge> parent;
        public runtime.mutex mtx;
        public int locked;
        public int number;
        public @Unsigned int address_attr;
        public @Unsigned int cycle_attr;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_master_resource")
    @NotUsableInJava
    public static class vme_master_resource
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<vme_bridge> parent;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public int locked;
        public int number;
        public @Unsigned int address_attr;
        public @Unsigned int cycle_attr;
        public @Unsigned int width_attr;
        public runtime.resource bus_resource;
        public Ptr<?> kern_base;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_driver")
    @NotUsableInJava
    public static class vme_driver
    extends Struct {
        public String name;
        public Ptr<?> match;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public DeviceDefinitions.device_driver driver;
        public ListDefinitions.list_head devices;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_bridge")
    @NotUsableInJava
    public static class vme_bridge
    extends Struct {
        public char @Size(value=16) [] name;
        public int num;
        public ListDefinitions.list_head master_resources;
        public ListDefinitions.list_head slave_resources;
        public ListDefinitions.list_head dma_resources;
        public ListDefinitions.list_head lm_resources;
        public ListDefinitions.list_head vme_error_handlers;
        public ListDefinitions.list_head devices;
        public Ptr<runtime.device> parent;
        public Ptr<?> driver_priv;
        public ListDefinitions.list_head bus_list;
        public vme_irq @Size(value=7) [] irq;
        public runtime.mutex irq_mtx;
        public Ptr<?> slave_get;
        public Ptr<?> slave_set;
        public Ptr<?> master_get;
        public Ptr<?> master_set;
        public Ptr<?> master_read;
        public Ptr<?> master_write;
        public Ptr<?> master_rmw;
        public Ptr<?> dma_list_add;
        public Ptr<?> dma_list_exec;
        public Ptr<?> dma_list_empty;
        public Ptr<?> irq_set;
        public Ptr<?> irq_generate;
        public Ptr<?> lm_set;
        public Ptr<?> lm_get;
        public Ptr<?> lm_attach;
        public Ptr<?> lm_detach;
        public Ptr<?> slot_get;
        public Ptr<?> alloc_consistent;
        public Ptr<?> free_consistent;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_dev")
    @NotUsableInJava
    public static class vme_dev
    extends Struct {
        public int num;
        public Ptr<vme_bridge> bridge;
        public runtime.device dev;
        public ListDefinitions.list_head drv_list;
        public ListDefinitions.list_head bridge_list;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_resource")
    @NotUsableInJava
    public static class vme_resource
    extends Struct {
        public vme_resource_type type;
        public Ptr<ListDefinitions.list_head> entry;
    }

    @Type(noCCodeGeneration=true, cType="struct vme_dma_attr")
    @NotUsableInJava
    public static class vme_dma_attr
    extends Struct {
        public @Unsigned int type;
        public Ptr<?> _private;
    }

    @Type(noCCodeGeneration=true, cType="enum vme_resource_type")
    public static enum vme_resource_type implements Enum<vme_resource_type>,
    TypedEnum<vme_resource_type, Integer>
    {
        VME_MASTER,
        VME_SLAVE,
        VME_DMA,
        VME_LM;

    }
}

