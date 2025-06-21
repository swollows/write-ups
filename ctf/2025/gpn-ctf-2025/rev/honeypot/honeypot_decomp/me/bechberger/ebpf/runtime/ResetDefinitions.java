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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
import me.bechberger.ebpf.runtime.NDefinitions;
import me.bechberger.ebpf.runtime.OfDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.StatDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ResetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_buffer_flags(Ptr<NDefinitions.n_tty_data> ldata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_simple_assert(Ptr<reset_controller_dev> rcdev, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_simple_deassert(Ptr<reset_controller_dev> rcdev, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_simple_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_simple_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_simple_reset(Ptr<reset_controller_dev> rcdev, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_simple_status(Ptr<reset_controller_dev> rcdev, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_simple_update(Ptr<reset_controller_dev> rcdev, @Unsigned long id, boolean _assert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_struct_pages(Ptr<runtime.page> start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_thread_features() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __reset_isolation_pfn(Ptr<runtime.zone> zone2, @Unsigned long pfn, boolean check_source, boolean check_target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __reset_isolation_suitable(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_batch_size(Ptr<LruDefinitions.lru_gen_mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_chelsio_generic_dev(Ptr<PciDefinitions.pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_ctrl_pos(Ptr<runtime.lruvec> lruvec2, int type2, boolean carryover) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_hinic_vf_dev(Ptr<PciDefinitions.pci_dev> pdev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_hung_task_detector() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_intel_82599_sfp_virtfn(Ptr<PciDefinitions.pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_isolation_suitable(Ptr< @OriginalName(value="pg_data_t") misc.pglist_data> pgdat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_ivb_igd(Ptr<PciDefinitions.pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __reset_stat_session(Ptr<StatDefinitions.stat_session> session) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_all_zones_managed_pages() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_idmap_scratch(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_palette(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_partition_data(Ptr<runtime.cpuset> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> reset_per_cpu_data(Ptr<misc.per_cpu_dm_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="reset_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long reset_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_terminal(Ptr<VcDefinitions.vc_data> vc2, int do_clear) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __reset_control_bulk_get(Ptr<runtime.device> dev, int num_rstcs, Ptr<reset_control_bulk_data> rstcs, boolean shared, boolean optional, boolean acquired) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__reset_control_get($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<reset_control> __reset_control_get(Ptr<runtime.device> dev, String id, int index2, boolean shared, boolean optional, boolean acquired) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<reset_control> __reset_control_get_internal(Ptr<reset_controller_dev> rcdev, @Unsigned int index2, boolean shared, boolean acquired) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __reset_control_put_internal(Ptr<reset_control> rstc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_acquire(Ptr<reset_control> rstc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_assert(Ptr<reset_control> rstc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_bulk_acquire(int num_rstcs, Ptr<reset_control_bulk_data> rstcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_bulk_assert(int num_rstcs, Ptr<reset_control_bulk_data> rstcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_bulk_deassert(int num_rstcs, Ptr<reset_control_bulk_data> rstcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_control_bulk_put(int num_rstcs, Ptr<reset_control_bulk_data> rstcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_control_bulk_release(int num_rstcs, Ptr<reset_control_bulk_data> rstcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_bulk_reset(int num_rstcs, Ptr<reset_control_bulk_data> rstcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_deassert(Ptr<reset_control> rstc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_get_count(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_control_put(Ptr<reset_control> rstc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_rearm(Ptr<reset_control> rstc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_control_release(Ptr<reset_control> rstc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_reset(Ptr<reset_control> rstc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_control_status(Ptr<reset_control> rstc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_controller_add_lookup(Ptr<reset_control_lookup> lookup, @Unsigned int num_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reset_controller_register(Ptr<reset_controller_dev> rcdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_controller_unregister(Ptr<reset_controller_dev> rcdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_disabled_cpu_buffer(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_early_page_tables() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_idle_masks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long reset_method_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="reset_method_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long reset_method_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reset_vc(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct reset_simple_devdata")
    @NotUsableInJava
    public static class reset_simple_devdata
    extends Struct {
        public @Unsigned int reg_offset;
        public @Unsigned int nr_resets;
        public boolean active_low;
        public boolean status_active_low;
    }

    @Type(noCCodeGeneration=true, cType="struct reset_simple_data")
    @NotUsableInJava
    public static class reset_simple_data
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<?> membase;
        public reset_controller_dev rcdev;
        public boolean active_low;
        public boolean status_active_low;
        public @Unsigned int reset_us;
    }

    @Type(noCCodeGeneration=true, cType="struct reset_control_bulk_devres")
    @NotUsableInJava
    public static class reset_control_bulk_devres
    extends Struct {
        public int num_rstcs;
        public Ptr<reset_control_bulk_data> rstcs;
    }

    @Type(noCCodeGeneration=true, cType="struct reset_gpio_lookup")
    @NotUsableInJava
    public static class reset_gpio_lookup
    extends Struct {
        public OfDefinitions.of_phandle_args of_args;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct reset_control_array")
    @NotUsableInJava
    public static class reset_control_array
    extends Struct {
        public reset_control base;
        public @Unsigned int num_rstcs;
        public Ptr<reset_control> @Size(value=0) [] rstc;
    }

    @Type(noCCodeGeneration=true, cType="struct reset_control_lookup")
    @NotUsableInJava
    public static class reset_control_lookup
    extends Struct {
        public ListDefinitions.list_head list;
        public String provider;
        public @Unsigned int index;
        public String dev_id;
        public String con_id;
    }

    @Type(noCCodeGeneration=true, cType="struct reset_controller_dev")
    @NotUsableInJava
    public static class reset_controller_dev
    extends Struct {
        public Ptr<reset_control_ops> ops;
        public Ptr<runtime.module> owner;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head reset_control_head;
        public Ptr<runtime.device> dev;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public Ptr<OfDefinitions.of_phandle_args> of_args;
        public int of_reset_n_cells;
        public Ptr<?> of_xlate;
        public @Unsigned int nr_resets;
    }

    @Type(noCCodeGeneration=true, cType="struct reset_control_ops")
    @NotUsableInJava
    public static class reset_control_ops
    extends Struct {
        public Ptr<?> reset;
        public Ptr<?> _assert;
        public Ptr<?> deassert;
        public Ptr<?> status;
    }

    @Type(noCCodeGeneration=true, cType="struct reset_control")
    @NotUsableInJava
    public static class reset_control
    extends Struct {
        public Ptr<reset_controller_dev> rcdev;
        public ListDefinitions.list_head list;
        public @Unsigned int id;
        public runtime.kref refcnt;
        public boolean acquired;
        public boolean shared;
        public boolean array;
        public AtomicDefinitions.atomic_t deassert_count;
        public AtomicDefinitions.atomic_t triggered_count;
    }

    @Type(noCCodeGeneration=true, cType="struct reset_control_bulk_data")
    @NotUsableInJava
    public static class reset_control_bulk_data
    extends Struct {
        public String id;
        public Ptr<reset_control> rstc;
    }
}

