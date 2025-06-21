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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.FixedDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class GhesDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_edac_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_edac_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_edac_register(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_edac_report_mem_error(Ptr<misc.notifier_block> nb, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ghes_check_estatus(Ptr<ghes> ghes2, Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ghes_panic(Ptr<ghes> ghes2, Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus, @Unsigned long buf_paddr, FixedDefinitions.fixed_addresses fixmap_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ghes_print_estatus((const u8*)$arg1, (const struct acpi_hest_generic*)$arg2, (const struct acpi_hest_generic_status*)$arg3)")
    public static void __ghes_print_estatus(String pfx, Ptr<AcpiDefinitions.acpi_hest_generic> generic, Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_add_timer(Ptr<ghes> ghes2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_clear_estatus(Ptr<ghes> ghes2, Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus, @Unsigned long buf_paddr, FixedDefinitions.fixed_addresses fixmap_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_copy_tofrom_phys(Ptr<?> buffer, @Unsigned long paddr, @Unsigned int len, int from_phys, FixedDefinitions.fixed_addresses fixmap_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_defer_non_standard_event(Ptr<AcpiDefinitions.acpi_hest_generic_data> gdata, int sev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ghes_do_memory_failure(@Unsigned long physical_addr, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_estatus_cache_add(Ptr<AcpiDefinitions.acpi_hest_generic> generic, Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ghes_estatus_cache> ghes_estatus_cache_alloc(Ptr<AcpiDefinitions.acpi_hest_generic> generic, Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_estatus_cache_rcu_free(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_estatus_cached(Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_estatus_pool_init(@Unsigned int num_ghes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_estatus_pool_region_free(@Unsigned long addr2, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> ghes_get_devices() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_handle_aer(Ptr<AcpiDefinitions.acpi_hest_generic_data> gdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_in_nmi_queue_one_entry(Ptr<ghes> ghes2, FixedDefinitions.fixed_addresses fixmap_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn ghes_irq_func(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_kick_task_work(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ghes> ghes_new(Ptr<AcpiDefinitions.acpi_hest_generic> generic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_notify_hed(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_notify_nmi(@Unsigned int cmd, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_poll_func(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_probe(Ptr<PlatformDefinitions.platform_device> ghes_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_proc(Ptr<ghes> ghes2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_proc_in_irq(Ptr<IrqDefinitions.irq_work> irq_work2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_register_report_chain(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ghes_register_vendor_record_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_remove(Ptr<PlatformDefinitions.platform_device> ghes_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_unregister_report_chain(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_unregister_vendor_record_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ghes_vendor_record_work_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ghes")
    @NotUsableInJava
    public static class ghes
    extends Struct {
        @InlineUnion(value=65830)
        public @InlineUnion(value=65830) Ptr<AcpiDefinitions.acpi_hest_generic> generic;
        @InlineUnion(value=65830)
        public @InlineUnion(value=65830) Ptr<AcpiDefinitions.acpi_hest_generic_v2> generic_v2;
        public Ptr<AcpiDefinitions.acpi_hest_generic_status> estatus;
        public @Unsigned long flags;
        @InlineUnion(value=65832)
        public  @InlineUnion(value=65832) ListDefinitions.list_head list;
        @InlineUnion(value=65832)
        public  @InlineUnion(value=65832) TimerDefinitions.timer_list timer;
        @InlineUnion(value=65832)
        public @InlineUnion(value=65832) @Unsigned int irq;
        public Ptr<runtime.device> dev;
        public ListDefinitions.list_head elist;
    }

    @Type(noCCodeGeneration=true, cType="struct ghes_vendor_record_entry")
    @NotUsableInJava
    public static class ghes_vendor_record_entry
    extends Struct {
        public misc.work_struct work;
        public int error_severity;
        public char @Size(value=0) [] vendor_record;
    }

    @Type(noCCodeGeneration=true, cType="struct ghes_estatus_cache")
    @NotUsableInJava
    public static class ghes_estatus_cache
    extends Struct {
        public @Unsigned int estatus_len;
        public AtomicDefinitions.atomic_t count;
        public Ptr<AcpiDefinitions.acpi_hest_generic> generic;
        public @Unsigned long time_in;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct ghes_estatus_node")
    @NotUsableInJava
    public static class ghes_estatus_node
    extends Struct {
        public misc.llist_node llnode;
        public Ptr<AcpiDefinitions.acpi_hest_generic> generic;
        public Ptr<ghes> ghes;
        public int task_work_cpu;
        public misc.callback_head task_work;
    }

    @Type(noCCodeGeneration=true, cType="struct ghes_hw_desc")
    @NotUsableInJava
    public static class ghes_hw_desc
    extends Struct {
        public int num_dimms;
        public Ptr<misc.dimm_info> dimms;
    }

    @Type(noCCodeGeneration=true, cType="struct ghes_pvt")
    @NotUsableInJava
    public static class ghes_pvt
    extends Struct {
        public Ptr<MemDefinitions.mem_ctl_info> mci;
        public char @Size(value=400) [] other_detail;
        public char @Size(value=80) [] msg;
    }

    @Type(noCCodeGeneration=true, cType="struct ghes_arr")
    @NotUsableInJava
    public static class ghes_arr
    extends Struct {
        public Ptr<Ptr<PlatformDefinitions.platform_device>> ghes_devs;
        public @Unsigned int count;
    }
}

