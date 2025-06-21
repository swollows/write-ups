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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class MsiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean msi_ext_dest_id() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_ht_cap_enabled(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> __msi_create_irq_domain(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<msi_domain_info> info2, @Unsigned int flags, Ptr<IrqDefinitions.irq_domain> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__msi_domain_alloc_irq_at($arg1, $arg2, $arg3, (const struct irq_affinity_desc*)$arg4, $arg5)")
    public static msi_map __msi_domain_alloc_irq_at(Ptr<runtime.device> dev, @Unsigned int domid, @Unsigned int index2, Ptr<IrqDefinitions.irq_affinity_desc> affdesc, Ptr<msi_instance_cookie> icookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __msi_domain_alloc_irqs(Ptr<runtime.device> dev, Ptr<IrqDefinitions.irq_domain> domain, Ptr<msi_ctrl> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __msi_domain_alloc_locked(Ptr<runtime.device> dev, Ptr<msi_ctrl> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msi_alloc_desc($arg1, $arg2, (const struct irq_affinity_desc*)$arg3)")
    public static Ptr<msi_desc> msi_alloc_desc(Ptr<runtime.device> dev, int nvec, Ptr<IrqDefinitions.irq_affinity_desc> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msi_create_device_irq_domain($arg1, $arg2, (const struct msi_domain_template*)$arg3, $arg4, $arg5, $arg6)")
    public static boolean msi_create_device_irq_domain(Ptr<runtime.device> dev, @Unsigned int domid, Ptr<msi_domain_template> template, @Unsigned int hwsize, Ptr<?> domain_data, Ptr<?> chip_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> msi_create_irq_domain(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<msi_domain_info> info2, Ptr<IrqDefinitions.irq_domain> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean msi_ctrl_valid(Ptr<runtime.device> dev, Ptr<msi_ctrl> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_device_data_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_device_destroy_sysfs(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_device_domain_alloc_wired(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int hwirq, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_device_domain_free_wired(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean msi_device_has_isolated_msi(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_device_populate_sysfs(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_domain_activate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> irq_data2, boolean early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_domain_alloc(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msi_domain_alloc_irq_at($arg1, $arg2, $arg3, (const struct irq_affinity_desc*)$arg4, $arg5)")
    public static msi_map msi_domain_alloc_irq_at(Ptr<runtime.device> dev, @Unsigned int domid, @Unsigned int index2, Ptr<IrqDefinitions.irq_affinity_desc> affdesc, Ptr<msi_instance_cookie> icookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_domain_alloc_irqs_all_locked(Ptr<runtime.device> dev, @Unsigned int domid, int nirqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_domain_alloc_irqs_range(Ptr<runtime.device> dev, @Unsigned int domid, @Unsigned int first, @Unsigned int last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_domain_alloc_irqs_range_locked(Ptr<runtime.device> dev, @Unsigned int domid, @Unsigned int first, @Unsigned int last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_deactivate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<msi_desc> msi_domain_first_desc(Ptr<runtime.device> dev, @Unsigned int domid, msi_desc_filter filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_free(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_free_descs(Ptr<runtime.device> dev, Ptr<msi_ctrl> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_free_irqs_all(Ptr<runtime.device> dev, @Unsigned int domid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_free_irqs_all_locked(Ptr<runtime.device> dev, @Unsigned int domid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_free_irqs_range(Ptr<runtime.device> dev, @Unsigned int domid, @Unsigned int first, @Unsigned int last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_free_irqs_range_locked(Ptr<runtime.device> dev, @Unsigned int domid, @Unsigned int first, @Unsigned int last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_free_locked(Ptr<runtime.device> dev, Ptr<msi_ctrl> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_free_msi_descs_range(Ptr<runtime.device> dev, @Unsigned int domid, @Unsigned int first, @Unsigned int last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int msi_domain_get_virq(Ptr<runtime.device> dev, @Unsigned int domid, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_domain_insert_msi_desc(Ptr<runtime.device> dev, @Unsigned int domid, Ptr<msi_desc> init_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="irq_hw_number_t") long msi_domain_ops_get_hwirq(Ptr<msi_domain_info> info2, Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_domain_ops_init(Ptr<IrqDefinitions.irq_domain> domain, Ptr<msi_domain_info> info2, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_domain_ops_prepare(Ptr<IrqDefinitions.irq_domain> domain, Ptr<runtime.device> dev, int nvec, Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_domain_ops_set_desc(Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2, Ptr<msi_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msi_domain_set_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int msi_domain_set_affinity(Ptr<IrqDefinitions.irq_data> irq_data2, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_domain_translate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_fwspec> fwspec, Ptr<@Unsigned @OriginalName(value="irq_hw_number_t") Long> hwirq, Ptr<@Unsigned Integer> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<msi_domain_info> msi_get_domain_info(Ptr<IrqDefinitions.irq_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_insert_desc(Ptr<runtime.device> dev, Ptr<msi_desc> desc, @Unsigned int domid, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_lock_descs(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean msi_match_device_irq_domain(Ptr<runtime.device> dev, @Unsigned int domid, IrqDefinitions.irq_domain_bus_token bus_token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long msi_mode_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<msi_desc> msi_next_desc(Ptr<runtime.device> dev, @Unsigned int domid, msi_desc_filter filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean msi_parent_init_dev_msi_info(Ptr<runtime.device> dev, Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_domain> msi_parent_domain, Ptr<msi_domain_info> msi_child_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_remove_device_irq_domain(Ptr<runtime.device> dev, @Unsigned int domid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_setup_device_data(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_sysfs_populate_desc(Ptr<runtime.device> dev, Ptr<msi_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_sysfs_remove_desc(Ptr<runtime.device> dev, Ptr<msi_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msi_unlock_descs(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long msi_bus_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msi_bus_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long msi_bus_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_capability_init(Ptr<PciDefinitions.pci_dev> dev, int nvec, Ptr<IrqDefinitions.irq_affinity> affd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PciDefinitions.pci_dev> msi_desc_to_pci_dev(Ptr<msi_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msi_set_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int msi_set_affinity(Ptr<IrqDefinitions.irq_data> irqd, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_setup_msi_desc(Ptr<PciDefinitions.pci_dev> dev, int nvec, Ptr<IrqDefinitions.irq_affinity_desc> masks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msi_verify_entries(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct msi_ctrl")
    @NotUsableInJava
    public static class msi_ctrl
    extends Struct {
        public @Unsigned int domid;
        public @Unsigned int first;
        public @Unsigned int last;
        public @Unsigned int nirqs;
    }

    @Type(noCCodeGeneration=true, cType="struct msi_dev_domain")
    @NotUsableInJava
    public static class msi_dev_domain
    extends Struct {
        public runtime.xarray store;
        public Ptr<IrqDefinitions.irq_domain> domain;
    }

    @Type(noCCodeGeneration=true, cType="struct msi_device_data")
    @NotUsableInJava
    public static class msi_device_data
    extends Struct {
        public @Unsigned long properties;
        public runtime.mutex mutex;
        public msi_dev_domain @Size(value=1) [] __domains;
        public @Unsigned long __iter_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct msi_domain_template")
    @NotUsableInJava
    public static class msi_domain_template
    extends Struct {
        public char @Size(value=48) [] name;
        public IrqDefinitions.irq_chip chip;
        public msi_domain_ops ops;
        public msi_domain_info info;
    }

    @Type(noCCodeGeneration=true, cType="struct msi_map")
    @NotUsableInJava
    public static class msi_map
    extends Struct {
        public int index;
        public int virq;
    }

    @Type(noCCodeGeneration=true, cType="enum msi_desc_filter")
    public static enum msi_desc_filter implements Enum<msi_desc_filter>,
    TypedEnum<msi_desc_filter, Integer>
    {
        MSI_DESC_ALL,
        MSI_DESC_NOTASSOCIATED,
        MSI_DESC_ASSOCIATED;

    }

    @Type(noCCodeGeneration=true, cType="enum msi_domain_ids")
    public static enum msi_domain_ids implements Enum<msi_domain_ids>,
    TypedEnum<msi_domain_ids, Integer>
    {
        MSI_DEFAULT_DOMAIN,
        MSI_MAX_DEVICE_IRQDOMAINS;

    }

    @Type(noCCodeGeneration=true, cType="struct msi_domain_info")
    @NotUsableInJava
    public static class msi_domain_info
    extends Struct {
        public @Unsigned int flags;
        public IrqDefinitions.irq_domain_bus_token bus_token;
        public @Unsigned int hwsize;
        public Ptr<msi_domain_ops> ops;
        public Ptr<IrqDefinitions.irq_chip> chip;
        public Ptr<?> chip_data;
        public @OriginalName(value="irq_flow_handler_t") Ptr<?> handler;
        public Ptr<?> handler_data;
        public String handler_name;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct msi_domain_ops")
    @NotUsableInJava
    public static class msi_domain_ops
    extends Struct {
        public Ptr<?> get_hwirq;
        public Ptr<?> msi_init;
        public Ptr<?> msi_free;
        public Ptr<?> msi_prepare;
        public Ptr<?> prepare_desc;
        public Ptr<?> set_desc;
        public Ptr<?> domain_alloc_irqs;
        public Ptr<?> domain_free_irqs;
        public Ptr<?> msi_post_free;
        public Ptr<?> msi_translate;
    }

    @Type(noCCodeGeneration=true, cType="struct msi_desc_data")
    @NotUsableInJava
    public static class msi_desc_data
    extends Struct {
        public msi_domain_cookie dcookie;
        public msi_instance_cookie icookie;
    }

    @Type(noCCodeGeneration=true, cType="union msi_domain_cookie")
    @NotUsableInJava
    public static class msi_domain_cookie
    extends Union {
        public @Unsigned long value;
        public Ptr<?> ptr;
        public Ptr<?> iobase;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 is_msix; u8 multiple; u8 multi_cap; u8 can_mask; u8 is_64; u8 is_virtual; unsigned int default_irq; }")
    @NotUsableInJava
    public static class msi_attrib_of_pci_msi_desc
    extends Struct {
        public char is_msix;
        public char multiple;
        public char multi_cap;
        public char can_mask;
        public char is_64;
        public char is_virtual;
        public @Unsigned int default_irq;
    }

    @Type(noCCodeGeneration=true, cType="struct msi_parent_ops")
    @NotUsableInJava
    public static class msi_parent_ops
    extends Struct {
        public @Unsigned int supported_flags;
        public @Unsigned int required_flags;
        public @Unsigned int bus_select_token;
        public @Unsigned int bus_select_mask;
        public String prefix;
        public Ptr<?> init_dev_msi_info;
    }

    @Type(noCCodeGeneration=true, cType="union msi_instance_cookie")
    @NotUsableInJava
    public static class msi_instance_cookie
    extends Union {
        public @Unsigned long value;
        public Ptr<?> ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct msi_msg")
    @NotUsableInJava
    public static class msi_msg
    extends Struct {
        @InlineUnion(value=3219)
        public @InlineUnion(value=3219) @Unsigned int address_lo;
        @InlineUnion(value=3219)
        public  @InlineUnion(value=3219) @OriginalName(value="arch_msi_msg_addr_lo_t") X86Definitions.x86_msi_addr_lo arch_addr_lo;
        @InlineUnion(value=3220)
        public @InlineUnion(value=3220) @Unsigned int address_hi;
        @InlineUnion(value=3220)
        public  @InlineUnion(value=3220) @OriginalName(value="arch_msi_msg_addr_hi_t") X86Definitions.x86_msi_addr_hi arch_addr_hi;
        @InlineUnion(value=3221)
        public @InlineUnion(value=3221) @Unsigned int data;
        @InlineUnion(value=3221)
        public  @InlineUnion(value=3221) @OriginalName(value="arch_msi_msg_data_t") X86Definitions.x86_msi_data arch_data;
    }

    @Type(noCCodeGeneration=true, cType="struct msi_desc")
    @NotUsableInJava
    public static class msi_desc
    extends Struct {
        public @Unsigned int irq;
        public @Unsigned int nvec_used;
        public Ptr<runtime.device> dev;
        public msi_msg msg;
        public Ptr<IrqDefinitions.irq_affinity_desc> affinity;
        public Ptr<?> iommu_cookie;
        public Ptr<DeviceDefinitions.device_attribute> sysfs_attrs;
        public Ptr<?> write_msi_msg;
        public Ptr<?> write_msi_msg_data;
        public @Unsigned short msi_index;
        @InlineUnion(value=3228)
        public @InlineUnion(value=3228) PciDefinitions.pci_msi_desc pci;
        @InlineUnion(value=3228)
        public @InlineUnion(value=3228) msi_desc_data data;
    }
}

