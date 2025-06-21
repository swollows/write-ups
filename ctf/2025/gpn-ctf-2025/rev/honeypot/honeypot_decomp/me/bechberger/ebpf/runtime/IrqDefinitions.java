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
import me.bechberger.ebpf.runtime.CallDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GenericDefinitions;
import me.bechberger.ebpf.runtime.IoapicDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.OfDefinitions;
import me.bechberger.ebpf.runtime.PcapDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class IrqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __irq_wake_thread(Ptr<irq_desc> desc, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_domain> irq_domain_create_sim(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, @Unsigned int num_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_create_sim_full($arg1, $arg2, (const struct irq_sim_ops*)$arg3, $arg4)")
    public static Ptr<irq_domain> irq_domain_create_sim_full(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, @Unsigned int num_irqs, Ptr<irq_sim_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_remove_sim(Ptr<irq_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_init_percpu_irqstack(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_is_level(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_pm_check_wakeup(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_pm_init_ops() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_pm_install_action(Ptr<irq_desc> desc, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_pm_remove_action(Ptr<irq_desc> desc, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_pm_syscore_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_poll_complete(Ptr<irq_poll> iop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_poll_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_poll_disable(Ptr<irq_poll> iop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_poll_enable(Ptr<irq_poll> iop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_poll_init(Ptr<irq_poll> iop, int weight, Ptr<?> poll_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_poll_sched(Ptr<irq_poll> iop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_poll_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_poll_softirq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_remapping_activate(Ptr<irq_domain> domain, Ptr<irq_data> irq_data2, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_remapping_alloc(Ptr<irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_remapping_deactivate(Ptr<irq_domain> domain, Ptr<irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_remapping_free(Ptr<irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_remapping_select(Ptr<irq_domain> d, Ptr<irq_fwspec> fwspec, irq_domain_bus_token bus_token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_safe_dev_in_sleep_domain($arg1, (const struct generic_pm_domain*)$arg2)")
    public static boolean irq_safe_dev_in_sleep_domain(Ptr<runtime.device> dev, Ptr<GenericDefinitions.generic_pm_domain> genpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_sim_domain_map(Ptr<irq_domain> domain, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_sim_domain_unmap(Ptr<irq_domain> domain, @Unsigned int virq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_sim_get_irqchip_state(Ptr<irq_data> data, misc.irqchip_irq_state which, Ptr<@OriginalName(value="bool") Boolean> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_sim_handle_irq(Ptr<irq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_sim_irqmask(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_sim_irqunmask(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_sim_release_resources(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_sim_request_resources(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_sim_set_irqchip_state(Ptr<irq_data> data, misc.irqchip_irq_state which, boolean state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_sim_set_type(Ptr<irq_data> data, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_wait_for_poll(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __irq_disable(Ptr<irq_desc> desc, boolean mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__irq_do_set_handler($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static void __irq_do_set_handler(Ptr<irq_desc> desc, @OriginalName(value="irq_flow_handler_t") Ptr<?> handle, int is_chained, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __irq_domain_activate_irq(Ptr<irq_data> irqd, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__irq_domain_alloc_fwnode($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> __irq_domain_alloc_fwnode(@Unsigned int type2, int id, String name, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__irq_domain_alloc_irqs($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct irq_affinity_desc*)$arg7)")
    public static int __irq_domain_alloc_irqs(Ptr<irq_domain> domain, int irq_base, @Unsigned int nr_irqs, int node2, Ptr<?> arg2, boolean realloc, Ptr<irq_affinity_desc> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__irq_domain_create((const struct irq_domain_info*)$arg1)")
    public static Ptr<irq_domain> __irq_domain_create(Ptr<irq_domain_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __irq_domain_deactivate_irq(Ptr<irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__irq_domain_instantiate((const struct irq_domain_info*)$arg1, $arg2, $arg3)")
    public static Ptr<irq_domain> __irq_domain_instantiate(Ptr<irq_domain_info> info2, boolean cond_alloc_descs, boolean force_associate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __irq_msi_compose_msg(Ptr<irq_cfg> cfg, Ptr<MsiDefinitions.msi_msg> msg, boolean dmar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_desc> __irq_resolve_mapping(Ptr<irq_domain> domain, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, Ptr<@Unsigned Integer> irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__irq_set_handler($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static void __irq_set_handler(@Unsigned int irq, @OriginalName(value="irq_flow_handler_t") Ptr<?> handle, int is_chained, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __irq_startup(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __irq_work_queue_local(Ptr<irq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_activate(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_activate_and_startup(Ptr<irq_desc> desc, boolean resend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_affinity_online_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_bypass_register_consumer(Ptr<irq_bypass_consumer> consumer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_bypass_register_producer(Ptr<irq_bypass_producer> producer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_bypass_unregister_consumer(Ptr<irq_bypass_consumer> consumer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_bypass_unregister_producer(Ptr<irq_bypass_producer> producer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_chip_ack_parent(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_compose_msi_msg(Ptr<irq_data> data, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_chip_disable_parent(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_chip_enable_parent(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_chip_eoi_parent(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_get_parent_state(Ptr<irq_data> data, misc.irqchip_irq_state which, Ptr<@OriginalName(value="bool") Boolean> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_chip_mask_ack_parent(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_chip_mask_parent(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_pm_get(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_pm_put(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_chip_release_resources_parent(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_request_resources_parent(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_retrigger_hierarchy(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_chip_set_affinity_parent($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int irq_chip_set_affinity_parent(Ptr<irq_data> data, Ptr<runtime.cpumask> dest, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_set_parent_state(Ptr<irq_data> data, misc.irqchip_irq_state which, boolean val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_set_type_parent(Ptr<irq_data> data, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_set_vcpu_affinity_parent(Ptr<irq_data> data, Ptr<?> vcpu_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_chip_set_wake_parent(Ptr<irq_data> data, @Unsigned int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_chip_unmask_parent(Ptr<irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_cpu_rmap_add(Ptr<CpuDefinitions.cpu_rmap> rmap, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_cpu_rmap_notify($arg1, (const cpumask*)$arg2)")
    public static void irq_cpu_rmap_notify(Ptr<irq_affinity_notify> notify, Ptr< @OriginalName(value="cpumask_t") runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_cpu_rmap_release(Ptr<runtime.kref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_cpu_rmap_remove(Ptr<CpuDefinitions.cpu_rmap> rmap, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int irq_create_fwspec_mapping(Ptr<irq_fwspec> fwspec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_create_mapping_affinity($arg1, $arg2, (const struct irq_affinity_desc*)$arg3)")
    public static @Unsigned int irq_create_mapping_affinity(Ptr<irq_domain> domain, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, Ptr<irq_affinity_desc> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_create_mapping_affinity_locked($arg1, $arg2, (const struct irq_affinity_desc*)$arg3)")
    public static @Unsigned int irq_create_mapping_affinity_locked(Ptr<irq_domain> domain, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, Ptr<irq_affinity_desc> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int irq_create_of_mapping(Ptr<OfDefinitions.of_phandle_args> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_disable(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_dispose_mapping(@Unsigned int virq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_activate_irq(Ptr<irq_data> irq_data2, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_add_legacy($arg1, $arg2, $arg3, $arg4, (const struct irq_domain_ops*)$arg5, $arg6)")
    public static Ptr<irq_domain> irq_domain_add_legacy(Ptr<DeviceDefinitions.device_node> of_node, @Unsigned int size, @Unsigned int first_irq, @Unsigned @OriginalName(value="irq_hw_number_t") long first_hwirq, Ptr<irq_domain_ops> ops, Ptr<?> host_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_alloc_irqs_hierarchy(Ptr<irq_domain> domain, @Unsigned int irq_base, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_alloc_irqs_locked($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct irq_affinity_desc*)$arg7)")
    public static int irq_domain_alloc_irqs_locked(Ptr<irq_domain> domain, int irq_base, @Unsigned int nr_irqs, int node2, Ptr<?> arg2, boolean realloc, Ptr<irq_affinity_desc> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_alloc_irqs_parent(Ptr<irq_domain> domain, @Unsigned int irq_base, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_associate(Ptr<irq_domain> domain, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_associate_locked(Ptr<irq_domain> domain, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_associate_many(Ptr<irq_domain> domain, @Unsigned int irq_base, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq_base, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_create_hierarchy($arg1, $arg2, $arg3, $arg4, (const struct irq_domain_ops*)$arg5, $arg6)")
    public static Ptr<irq_domain> irq_domain_create_hierarchy(Ptr<irq_domain> parent, @Unsigned int flags, @Unsigned int size, Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<irq_domain_ops> ops, Ptr<?> host_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_create_legacy($arg1, $arg2, $arg3, $arg4, (const struct irq_domain_ops*)$arg5, $arg6)")
    public static Ptr<irq_domain> irq_domain_create_legacy(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, @Unsigned int size, @Unsigned int first_irq, @Unsigned @OriginalName(value="irq_hw_number_t") long first_hwirq, Ptr<irq_domain_ops> ops, Ptr<?> host_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_create_simple($arg1, $arg2, $arg3, (const struct irq_domain_ops*)$arg4, $arg5)")
    public static Ptr<irq_domain> irq_domain_create_simple(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, @Unsigned int size, @Unsigned int first_irq, Ptr<irq_domain_ops> ops, Ptr<?> host_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_deactivate_irq(Ptr<irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_disconnect_hierarchy(Ptr<irq_domain> domain, @Unsigned int virq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_fix_revmap(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_free(Ptr<irq_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_free_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_free_irqs(@Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_free_irqs_common(Ptr<irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_free_irqs_hierarchy(Ptr<irq_domain> domain, @Unsigned int irq_base, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_free_irqs_parent(Ptr<irq_domain> domain, @Unsigned int irq_base, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_free_irqs_top(Ptr<irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_data> irq_domain_get_irq_data(Ptr<irq_domain> domain, @Unsigned int virq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_instantiate((const struct irq_domain_info*)$arg1)")
    public static Ptr<irq_domain> irq_domain_instantiate(Ptr<irq_domain_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_pop_irq(Ptr<irq_domain> domain, int virq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_push_irq(Ptr<irq_domain> domain, int virq, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_remove(Ptr<irq_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_reset_irq_data(Ptr<irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_set_hwirq_and_chip($arg1, $arg2, $arg3, (const struct irq_chip*)$arg4, $arg5)")
    public static int irq_domain_set_hwirq_and_chip(Ptr<irq_domain> domain, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, Ptr<irq_chip> chip, Ptr<?> chip_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_set_info($arg1, $arg2, $arg3, (const struct irq_chip*)$arg4, $arg5, $arg6, $arg7, (const u8*)$arg8)")
    public static void irq_domain_set_info(Ptr<irq_domain> domain, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, Ptr<irq_chip> chip, Ptr<?> chip_data, @OriginalName(value="irq_flow_handler_t") Ptr<?> handler, Ptr<?> handler_data, String handler_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_set_name($arg1, (const struct irq_domain_info*)$arg2)")
    public static int irq_domain_set_name(Ptr<irq_domain> domain, Ptr<irq_domain_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_translate_onecell(Ptr<irq_domain> d, Ptr<irq_fwspec> fwspec, Ptr<@Unsigned Long> out_hwirq, Ptr<@Unsigned Integer> out_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_domain_translate_twocell(Ptr<irq_domain> d, Ptr<irq_fwspec> fwspec, Ptr<@Unsigned Long> out_hwirq, Ptr<@Unsigned Integer> out_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_update_bus_token(Ptr<irq_domain> domain, irq_domain_bus_token bus_token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_xlate_onecell($arg1, $arg2, (const unsigned int*)$arg3, $arg4, $arg5, $arg6)")
    public static int irq_domain_xlate_onecell(Ptr<irq_domain> d, Ptr<DeviceDefinitions.device_node> ctrlr, Ptr<@Unsigned Integer> intspec, @Unsigned int intsize, Ptr<@Unsigned Long> out_hwirq, Ptr<@Unsigned Integer> out_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_xlate_onetwocell($arg1, $arg2, (const unsigned int*)$arg3, $arg4, $arg5, $arg6)")
    public static int irq_domain_xlate_onetwocell(Ptr<irq_domain> d, Ptr<DeviceDefinitions.device_node> ctrlr, Ptr<@Unsigned Integer> intspec, @Unsigned int intsize, Ptr<@Unsigned Long> out_hwirq, Ptr<@Unsigned Integer> out_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_xlate_twocell($arg1, $arg2, (const unsigned int*)$arg3, $arg4, $arg5, $arg6)")
    public static int irq_domain_xlate_twocell(Ptr<irq_domain> d, Ptr<DeviceDefinitions.device_node> ctrlr, Ptr<@Unsigned Integer> intspec, @Unsigned int intsize, Ptr<@Unsigned @OriginalName(value="irq_hw_number_t") Long> out_hwirq, Ptr<@Unsigned Integer> out_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_enable(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_domain> irq_find_matching_fwspec(Ptr<irq_fwspec> fwspec, irq_domain_bus_token bus_token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_fpu_usable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_domain> irq_get_default_host() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_data> irq_get_irq_data(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_migrate_all_off_this_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_modify_status(@Unsigned int irq, @Unsigned long clr, @Unsigned long set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_needs_fixup(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_percpu_disable(Ptr<irq_desc> desc, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_percpu_enable(Ptr<irq_desc> desc, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_set_chained_handler_and_data(@Unsigned int irq, @OriginalName(value="irq_flow_handler_t") Ptr<?> handle, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_set_chip($arg1, (const struct irq_chip*)$arg2)")
    public static int irq_set_chip(@Unsigned int irq, Ptr<irq_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_set_chip_and_handler_name($arg1, (const struct irq_chip*)$arg2, $arg3, (const u8*)$arg4)")
    public static void irq_set_chip_and_handler_name(@Unsigned int irq, Ptr<irq_chip> chip, @OriginalName(value="irq_flow_handler_t") Ptr<?> handle, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_chip_data(@Unsigned int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_set_default_host(Ptr<irq_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_handler_data(@Unsigned int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_irq_type(@Unsigned int irq, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_msi_desc(@Unsigned int irq, Ptr<MsiDefinitions.msi_desc> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_msi_desc_off(@Unsigned int irq_base, @Unsigned int irq_offset, Ptr<MsiDefinitions.msi_desc> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_shutdown(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_shutdown_and_deactivate(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_startup(Ptr<irq_desc> desc, boolean resend, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_work_claim(Ptr<irq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_work_init_threads() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_work_needs_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_work_queue(Ptr<irq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_work_queue_on(Ptr<irq_work> work, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_work_run() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_work_run_list(Ptr<misc.llist_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_work_single(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_work_sync(Ptr<irq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_work_tick() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__irq_alloc_descs($arg1, $arg2, $arg3, $arg4, $arg5, (const struct irq_affinity_desc*)$arg6)")
    public static int __irq_alloc_descs(int irq, @Unsigned int from, @Unsigned int cnt, int node2, Ptr<runtime.module> owner, Ptr<irq_affinity_desc> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_desc> __irq_get_desc_lock(@Unsigned int irq, Ptr<@Unsigned Long> flags, boolean bus, @Unsigned int check) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __irq_put_desc_unlock(Ptr<irq_desc> desc, @Unsigned long flags, boolean bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_affinity_hint_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_affinity_list_proc_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_affinity_list_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_affinity_list_proc_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long irq_affinity_list_proc_write(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_affinity_proc_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_affinity_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_affinity_proc_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long irq_affinity_proc_write(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_affinity_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_complete_move(Ptr<irq_cfg> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_effective_aff_list_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_effective_aff_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_evtchn_from_virq(@Unsigned int cpu2, @Unsigned int virq, Ptr<@Unsigned @OriginalName(value="evtchn_port_t") Integer> evtchn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_force_complete_move(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_free_descs(@Unsigned int from, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int irq_from_evtchn(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int irq_get_next_irq(@Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_get_percpu_devid_partition(@Unsigned int irq, Ptr<runtime.cpumask> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_insert_desc(@Unsigned int irq, Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_kobj_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_lock_sparse() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_node_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_remap_enable_fault_handling() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_remapping_cap(irq_remap_cap cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_remapping_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_remapping_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_remapping_prepare() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_remapping_reenable(int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_remapping_restore_boot_irq_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_resend_init(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_percpu_devid(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_set_percpu_devid_partition($arg1, (const struct cpumask*)$arg2)")
    public static int irq_set_percpu_devid_partition(@Unsigned int irq, Ptr<runtime.cpumask> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_spurious_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_desc> irq_to_desc(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_to_pcap(Ptr<PcapDefinitions.pcap_chip> pcap, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_unlock_sparse() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__irq_alloc_domain_generic_chips($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int __irq_alloc_domain_generic_chips(Ptr<irq_domain> d, int irqs_per_chip, int num_ct, String name, @OriginalName(value="irq_flow_handler_t") Ptr<?> handler, @Unsigned int clr, @Unsigned int set, irq_gc_flags gcflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__irq_apply_affinity_hint($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int __irq_apply_affinity_hint(@Unsigned int irq, Ptr<runtime.cpumask> m, boolean setaffinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __irq_exit_rcu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __irq_get_irqchip_state(Ptr<irq_data> data, misc.irqchip_irq_state which, Ptr<@OriginalName(value="bool") Boolean> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __irq_move_irq(Ptr<irq_data> idata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __irq_set_trigger(Ptr<irq_desc> desc, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_alloc_generic_chip((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<irq_chip_generic> irq_alloc_generic_chip(String name, int num_ct, @Unsigned int irq_base, Ptr<?> reg_base, @OriginalName(value="irq_flow_handler_t") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_matrix> irq_alloc_matrix(@Unsigned int matrix_bits, @Unsigned int alloc_start, @Unsigned int alloc_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_calc_affinity_vectors($arg1, $arg2, (const struct irq_affinity*)$arg3)")
    public static @Unsigned int irq_calc_affinity_vectors(@Unsigned int minvec, @Unsigned int maxvec, Ptr<irq_affinity> affd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_can_set_affinity(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_can_set_affinity_usr(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_check_status_bit(@Unsigned int irq, @Unsigned int bitmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_affinity_desc> irq_create_affinity_masks(@Unsigned int nvecs, Ptr<irq_affinity> affd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn irq_default_primary_handler(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_dma_fence_array_work(Ptr<irq_work> wrk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_do_set_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int irq_do_set_affinity(Ptr<irq_data> data, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_domain_alloc_generic_chips($arg1, (const struct irq_domain_chip_generic_info*)$arg2)")
    public static int irq_domain_alloc_generic_chips(Ptr<irq_domain> d, Ptr<irq_domain_chip_generic_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_domain_remove_generic_chips(Ptr<irq_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_enter_rcu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_exit_rcu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_finalize_oneshot(Ptr<irq_desc> desc, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_fixup_move_pending(Ptr<irq_desc> desc, boolean force_clear) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_force_affinity($arg1, (const struct cpumask*)$arg2)")
    public static int irq_force_affinity(@Unsigned int irq, Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn irq_forced_secondary_handler(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn irq_forced_thread_fn(Ptr<irq_desc> desc, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_ack_clr_bit(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_ack_set_bit(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_eoi(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_data> irq_gc_get_irq_data(Ptr<irq_chip_generic> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_init_mask_cache(Ptr<irq_chip_generic> gc, irq_gc_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_gc_init_ops() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_mask_clr_bit(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_mask_disable_and_ack_set(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_mask_disable_reg(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_mask_set_bit(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_noop(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_gc_set_wake(Ptr<irq_data> d, @Unsigned int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_shutdown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_gc_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_gc_unmask_enable_reg(Ptr<irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<irq_chip_generic> irq_get_domain_generic_chip(Ptr<irq_domain> d, @Unsigned int hw_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_get_irqchip_state(@Unsigned int irq, misc.irqchip_irq_state which, Ptr<@OriginalName(value="bool") Boolean> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_get_pending(Ptr<runtime.cpumask> mask, Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_has_action(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_init_generic_chip($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void irq_init_generic_chip(Ptr<irq_chip_generic> gc, String name, int num_ct, @Unsigned int irq_base, Ptr<?> reg_base, @OriginalName(value="irq_flow_handler_t") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_map_generic_chip(Ptr<irq_domain> d, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_matrix_alloc($arg1, (const struct cpumask*)$arg2, $arg3, $arg4)")
    public static int irq_matrix_alloc(Ptr<irq_matrix> m, Ptr<runtime.cpumask> msk, boolean reserved, Ptr<@Unsigned Integer> mapped_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_matrix_alloc_managed($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int irq_matrix_alloc_managed(Ptr<irq_matrix> m, Ptr<runtime.cpumask> msk, Ptr<@Unsigned Integer> mapped_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int irq_matrix_allocated(Ptr<irq_matrix> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_matrix_assign(Ptr<irq_matrix> m, @Unsigned int bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_matrix_assign_system(Ptr<irq_matrix> m, @Unsigned int bit, boolean replace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int irq_matrix_available(Ptr<irq_matrix> m, boolean cpudown) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_matrix_free(Ptr<irq_matrix> m, @Unsigned int cpu2, @Unsigned int bit, boolean managed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_matrix_offline(Ptr<irq_matrix> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_matrix_online(Ptr<irq_matrix> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_matrix_remove_managed($arg1, (const struct cpumask*)$arg2)")
    public static void irq_matrix_remove_managed(Ptr<irq_matrix> m, Ptr<runtime.cpumask> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_matrix_remove_reserved(Ptr<irq_matrix> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_matrix_reserve(Ptr<irq_matrix> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_matrix_reserve_managed($arg1, (const struct cpumask*)$arg2)")
    public static int irq_matrix_reserve_managed(Ptr<irq_matrix> m, Ptr<runtime.cpumask> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int irq_matrix_reserved(Ptr<irq_matrix> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_move_masked_irq(Ptr<irq_data> idata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn irq_nested_primary_handler(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean irq_percpu_is_enabled(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int irq_readl_be(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_remove_generic_chip(Ptr<irq_chip_generic> gc, @Unsigned int msk, @Unsigned int clr, @Unsigned int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_set_affinity($arg1, (const struct cpumask*)$arg2)")
    public static int irq_set_affinity(@Unsigned int irq, Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_set_affinity_deactivated($arg1, (const struct cpumask*)$arg2)")
    public static boolean irq_set_affinity_deactivated(Ptr<irq_data> data, Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="irq_set_affinity_locked($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int irq_set_affinity_locked(Ptr<irq_data> data, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_affinity_notifier(@Unsigned int irq, Ptr<irq_affinity_notify> notify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_irq_wake(@Unsigned int irq, @Unsigned int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_irqchip_state(@Unsigned int irq, misc.irqchip_irq_state which, boolean val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_parent(int irq, int parent_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_set_thread_affinity(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_set_vcpu_affinity(@Unsigned int irq, Ptr<?> vcpu_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_setup_affinity(Ptr<irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_setup_alt_chip(Ptr<irq_data> d, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_setup_generic_chip(Ptr<irq_chip_generic> gc, @Unsigned int msk, irq_gc_flags flags, @Unsigned int clr, @Unsigned int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long irq_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_thread(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_thread_check_affinity(Ptr<irq_desc> desc, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_thread_dtor(Ptr<misc.callback_head> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn irq_thread_fn(Ptr<irq_desc> desc, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_unmap_generic_chip(Ptr<irq_domain> d, @Unsigned int virq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int irq_update_affinity_desc(@Unsigned int irq, Ptr<irq_affinity_desc> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_wake_thread(@Unsigned int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void irq_writel_be(@Unsigned int val, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 link; short unsigned int bitmap; }")
    @NotUsableInJava
    public static class AnonymousType1701646500C50
    extends Struct {
        public char link;
        public @Unsigned short bitmap;
    }

    @Type(noCCodeGeneration=true, cType="struct irqstat")
    @NotUsableInJava
    public static class irqstat
    extends Struct {
        public @Unsigned int cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_bypass_consumer")
    @NotUsableInJava
    public static class irq_bypass_consumer
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<?> token;
        public Ptr<?> add_producer;
        public Ptr<?> del_producer;
        public Ptr<?> stop;
        public Ptr<?> start;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_bypass_producer")
    @NotUsableInJava
    public static class irq_bypass_producer
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<?> token;
        public int irq;
        public Ptr<?> add_consumer;
        public Ptr<?> del_consumer;
        public Ptr<?> stop;
        public Ptr<?> start;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_affinity_devres")
    @NotUsableInJava
    public static class irq_affinity_devres
    extends Struct {
        public @Unsigned int count;
        public @Unsigned int @Size(value=0) [] irq;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_glue")
    @NotUsableInJava
    public static class irq_glue
    extends Struct {
        public irq_affinity_notify notify;
        public Ptr<CpuDefinitions.cpu_rmap> rmap;
        public @Unsigned short index;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_override_cmp")
    @NotUsableInJava
    public static class irq_override_cmp
    extends Struct {
        public Ptr<DmiDefinitions.dmi_system_id> system;
        public char irq;
        public char triggering;
        public char polarity;
        public char shareable;
        public boolean override;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int sense; unsigned int masked; }")
    @NotUsableInJava
    public static class irq_of_sx150x_pinctrl
    extends Struct {
        public @Unsigned int sense;
        public @Unsigned int masked;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_sim_irq_ctx")
    @NotUsableInJava
    public static class irq_sim_irq_ctx
    extends Struct {
        public boolean enabled;
        public Ptr<irq_sim_work_ctx> work_ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_sim_work_ctx")
    @NotUsableInJava
    public static class irq_sim_work_ctx
    extends Struct {
        public irq_work work;
        public @Unsigned int irq_count;
        public Ptr<@Unsigned Long> pending;
        public Ptr<irq_domain> domain;
        public irq_sim_ops ops;
        public Ptr<?> user_data;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_sim_ops")
    @NotUsableInJava
    public static class irq_sim_ops
    extends Struct {
        public Ptr<?> irq_sim_irq_requested;
        public Ptr<?> irq_sim_irq_released;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_generic_chip_devres")
    @NotUsableInJava
    public static class irq_generic_chip_devres
    extends Struct {
        public Ptr<irq_chip_generic> gc;
        public @Unsigned int msk;
        public @Unsigned int clr;
        public @Unsigned int set;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_desc_devres")
    @NotUsableInJava
    public static class irq_desc_devres
    extends Struct {
        public @Unsigned int from;
        public @Unsigned int cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_devres")
    @NotUsableInJava
    public static class irq_devres
    extends Struct {
        public @Unsigned int irq;
        public Ptr<?> dev_id;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_pin_list")
    @NotUsableInJava
    public static class irq_pin_list
    extends Struct {
        public ListDefinitions.list_head list;
        public int apic;
        public int pin;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_stack")
    @NotUsableInJava
    public static class irq_stack
    extends Struct {
        public char @Size(value=16384) [] stack;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_router_handler")
    @NotUsableInJava
    public static class irq_router_handler
    extends Struct {
        public @Unsigned short vendor;
        public Ptr<?> probe;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_router")
    @NotUsableInJava
    public static class irq_router
    extends Struct {
        public String name;
        public @Unsigned short vendor;
        public @Unsigned short device;
        public Ptr<?> get;
        public Ptr<?> set;
        public Ptr<?> lvl;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_routing_table")
    @NotUsableInJava
    public static class irq_routing_table
    extends Struct {
        public @Unsigned int signature;
        public @Unsigned short version;
        public @Unsigned short size;
        public char rtr_bus;
        public char rtr_devfn;
        public @Unsigned short exclusive_irqs;
        public @Unsigned short rtr_vendor;
        public @Unsigned short rtr_device;
        public @Unsigned int miniport_data;
        public char @Size(value=11) [] rfu;
        public char checksum;
        public irq_info @Size(value=0) [] slots;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_info")
    @NotUsableInJava
    public static class irq_info
    extends Struct {
        public char bus;
        public char devfn;
        public AnonymousType1701646500C50 @Size(value=4) [] irq;
        public char slot;
        public char rfu;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_poll")
    @NotUsableInJava
    public static class irq_poll
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long state;
        public int weight;
        public Ptr<?> poll;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_domain_info")
    @NotUsableInJava
    public static class irq_domain_info
    extends Struct {
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public @Unsigned int domain_flags;
        public @Unsigned int size;
        public @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq_max;
        public int direct_max;
        public @Unsigned int hwirq_base;
        public @Unsigned int virq_base;
        public irq_domain_bus_token bus_token;
        public String name_suffix;
        public Ptr<irq_domain_ops> ops;
        public Ptr<?> host_data;
        public Ptr<irq_domain> parent;
        public Ptr<irq_domain_chip_generic_info> dgc_info;
        public Ptr<?> init;
        public Ptr<?> exit;
    }

    @Type(noCCodeGeneration=true, cType="enum irq_mode")
    public static enum irq_mode implements Enum<irq_mode>,
    TypedEnum<irq_mode, Integer>
    {
        IRQ_REMAPPING,
        IRQ_POSTING;

    }

    @Type(noCCodeGeneration=true, cType="struct irq_remap_ops")
    @NotUsableInJava
    public static class irq_remap_ops
    extends Struct {
        public int capability;
        public Ptr<?> prepare;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> reenable;
        public Ptr<?> enable_faulting;
    }

    @Type(noCCodeGeneration=true, cType="enum irq_remap_cap")
    public static enum irq_remap_cap implements Enum<irq_remap_cap>,
    TypedEnum<irq_remap_cap, Integer>
    {
        IRQ_POSTING_CAP;

    }

    @Type(noCCodeGeneration=true, cType="struct irq_remap_table")
    @NotUsableInJava
    public static class irq_remap_table
    extends Struct {
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned int min_index;
        public Ptr<@Unsigned Integer> table;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_matrix")
    @NotUsableInJava
    public static class irq_matrix
    extends Struct {
        public @Unsigned int matrix_bits;
        public @Unsigned int alloc_start;
        public @Unsigned int alloc_end;
        public @Unsigned int alloc_size;
        public @Unsigned int global_available;
        public @Unsigned int global_reserved;
        public @Unsigned int systembits_inalloc;
        public @Unsigned int total_allocated;
        public @Unsigned int online_maps;
        public Ptr<runtime.cpumap> maps;
        public Ptr<@Unsigned Long> system_map;
        public @Unsigned long @Size(value=0) [] scratch_map;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_affinity")
    @NotUsableInJava
    public static class irq_affinity
    extends Struct {
        public @Unsigned int pre_vectors;
        public @Unsigned int post_vectors;
        public @Unsigned int nr_sets;
        public @Unsigned int @Size(value=4) [] set_size;
        public Ptr<?> calc_sets;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_domain_chip_generic_info")
    @NotUsableInJava
    public static class irq_domain_chip_generic_info
    extends Struct {
        public String name;
        public @OriginalName(value="irq_flow_handler_t") Ptr<?> handler;
        public @Unsigned int irqs_per_chip;
        public @Unsigned int num_ct;
        public @Unsigned int irq_flags_to_clear;
        public @Unsigned int irq_flags_to_set;
        public irq_gc_flags gc_flags;
        public Ptr<?> init;
        public Ptr<?> exit;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_cfg")
    @NotUsableInJava
    public static class irq_cfg
    extends Struct {
        public @Unsigned int dest_apicid;
        public @Unsigned int vector;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_domain_ops")
    @NotUsableInJava
    public static class irq_domain_ops
    extends Struct {
        public Ptr<?> match;
        public Ptr<?> select;
        public Ptr<?> map;
        public Ptr<?> unmap;
        public Ptr<?> xlate;
        public Ptr<?> alloc;
        public Ptr<?> free;
        public Ptr<?> activate;
        public Ptr<?> deactivate;
        public Ptr<?> translate;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_fwspec")
    @NotUsableInJava
    public static class irq_fwspec
    extends Struct {
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public int param_count;
        public @Unsigned int @Size(value=16) [] param;
    }

    @Type(noCCodeGeneration=true, cType="enum irq_domain_bus_token")
    public static enum irq_domain_bus_token implements Enum<irq_domain_bus_token>,
    TypedEnum<irq_domain_bus_token, Integer>
    {
        DOMAIN_BUS_ANY,
        DOMAIN_BUS_WIRED,
        DOMAIN_BUS_GENERIC_MSI,
        DOMAIN_BUS_PCI_MSI,
        DOMAIN_BUS_PLATFORM_MSI,
        DOMAIN_BUS_NEXUS,
        DOMAIN_BUS_IPI,
        DOMAIN_BUS_FSL_MC_MSI,
        DOMAIN_BUS_TI_SCI_INTA_MSI,
        DOMAIN_BUS_WAKEUP,
        DOMAIN_BUS_VMD_MSI,
        DOMAIN_BUS_PCI_DEVICE_MSI,
        DOMAIN_BUS_PCI_DEVICE_MSIX,
        DOMAIN_BUS_DMAR,
        DOMAIN_BUS_AMDVI,
        DOMAIN_BUS_DEVICE_MSI,
        DOMAIN_BUS_WIRED_TO_MSI;

    }

    @Type(noCCodeGeneration=true, cType="struct irq_domain_chip_generic")
    @NotUsableInJava
    public static class irq_domain_chip_generic
    extends Struct {
        public @Unsigned int irqs_per_chip;
        public @Unsigned int num_chips;
        public @Unsigned int irq_flags_to_clear;
        public @Unsigned int irq_flags_to_set;
        public irq_gc_flags gc_flags;
        public Ptr<?> exit;
        public Ptr<irq_chip_generic> @Size(value=0) [] gc;
    }

    @Type(noCCodeGeneration=true, cType="enum irq_gc_flags")
    public static enum irq_gc_flags implements Enum<irq_gc_flags>,
    TypedEnum<irq_gc_flags, Integer>
    {
        IRQ_GC_INIT_MASK_CACHE,
        IRQ_GC_INIT_NESTED_LOCK,
        IRQ_GC_MASK_CACHE_PER_TYPE,
        IRQ_GC_NO_MASK,
        IRQ_GC_BE_IO;

    }

    @Type(noCCodeGeneration=true, cType="struct irq_chip_generic")
    @NotUsableInJava
    public static class irq_chip_generic
    extends Struct {
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public Ptr<?> reg_base;
        public Ptr<?> reg_readl;
        public Ptr<?> reg_writel;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public @Unsigned int irq_base;
        public @Unsigned int irq_cnt;
        public @Unsigned int mask_cache;
        public @Unsigned int wake_enabled;
        public @Unsigned int wake_active;
        public @Unsigned int num_ct;
        public Ptr<?> _private;
        public @Unsigned long installed;
        public @Unsigned long unused;
        public Ptr<irq_domain> domain;
        public ListDefinitions.list_head list;
        public irq_chip_type @Size(value=0) [] chip_types;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_chip_type")
    @NotUsableInJava
    public static class irq_chip_type
    extends Struct {
        public irq_chip chip;
        public irq_chip_regs regs;
        public @OriginalName(value="irq_flow_handler_t") Ptr<?> handler;
        public @Unsigned int type;
        public @Unsigned int mask_cache_priv;
        public Ptr<@Unsigned Integer> mask_cache;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_chip_regs")
    @NotUsableInJava
    public static class irq_chip_regs
    extends Struct {
        public @Unsigned long enable;
        public @Unsigned long disable;
        public @Unsigned long mask;
        public @Unsigned long ack;
        public @Unsigned long eoi;
        public @Unsigned long type;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_alloc_info")
    @NotUsableInJava
    public static class irq_alloc_info
    extends Struct {
        public irq_alloc_type type;
        public @Unsigned int flags;
        public @Unsigned int devid;
        public @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq;
        public Ptr<runtime.cpumask> mask;
        public Ptr<MsiDefinitions.msi_desc> desc;
        public Ptr<?> data;
        @InlineUnion(value=3157)
        public @InlineUnion(value=3157) IoapicDefinitions.ioapic_alloc_info ioapic;
        @InlineUnion(value=3157)
        public  @InlineUnion(value=3157) UvDefinitions.uv_alloc_info uv;
    }

    @Type(noCCodeGeneration=true, cType="enum irq_alloc_type")
    public static enum irq_alloc_type implements Enum<irq_alloc_type>,
    TypedEnum<irq_alloc_type, Integer>
    {
        X86_IRQ_ALLOC_TYPE_IOAPIC,
        X86_IRQ_ALLOC_TYPE_HPET,
        X86_IRQ_ALLOC_TYPE_PCI_MSI,
        X86_IRQ_ALLOC_TYPE_PCI_MSIX,
        X86_IRQ_ALLOC_TYPE_DMAR,
        X86_IRQ_ALLOC_TYPE_AMDVI,
        X86_IRQ_ALLOC_TYPE_UV;

    }

    @Type(noCCodeGeneration=true, cType="struct irq_chip")
    @NotUsableInJava
    public static class irq_chip
    extends Struct {
        public String name;
        public Ptr<?> irq_startup;
        public Ptr<?> irq_shutdown;
        public Ptr<?> irq_enable;
        public Ptr<?> irq_disable;
        public Ptr<?> irq_ack;
        public Ptr<?> irq_mask;
        public Ptr<?> irq_mask_ack;
        public Ptr<?> irq_unmask;
        public Ptr<?> irq_eoi;
        public Ptr<?> irq_set_affinity;
        public Ptr<?> irq_retrigger;
        public Ptr<?> irq_set_type;
        public Ptr<?> irq_set_wake;
        public Ptr<?> irq_bus_lock;
        public Ptr<?> irq_bus_sync_unlock;
        public Ptr<?> irq_suspend;
        public Ptr<?> irq_resume;
        public Ptr<?> irq_pm_shutdown;
        public Ptr<?> irq_calc_mask;
        public Ptr<?> irq_print_chip;
        public Ptr<?> irq_request_resources;
        public Ptr<?> irq_release_resources;
        public Ptr<?> irq_compose_msi_msg;
        public Ptr<?> irq_write_msi_msg;
        public Ptr<?> irq_get_irqchip_state;
        public Ptr<?> irq_set_irqchip_state;
        public Ptr<?> irq_set_vcpu_affinity;
        public Ptr<?> ipi_send_single;
        public Ptr<?> ipi_send_mask;
        public Ptr<?> irq_nmi_setup;
        public Ptr<?> irq_nmi_teardown;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_data")
    @NotUsableInJava
    public static class irq_data
    extends Struct {
        public @Unsigned int mask;
        public @Unsigned int irq;
        public @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq;
        public Ptr<irq_common_data> common;
        public Ptr<irq_chip> chip;
        public Ptr<irq_domain> domain;
        public Ptr<irq_data> parent_data;
        public Ptr<?> chip_data;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_common_data")
    @NotUsableInJava
    public static class irq_common_data
    extends Struct {
        public @Unsigned int state_use_accessors;
        public @Unsigned int node;
        public Ptr<?> handler_data;
        public Ptr<MsiDefinitions.msi_desc> msi_desc;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> affinity;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> effective_affinity;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_desc")
    @NotUsableInJava
    public static class irq_desc
    extends Struct {
        public irq_common_data irq_common_data;
        public irq_data irq_data;
        public Ptr<irqstat> kstat_irqs;
        public @OriginalName(value="irq_flow_handler_t") Ptr<?> handle_irq;
        public Ptr<runtime.irqaction> action;
        public @Unsigned int status_use_accessors;
        public @Unsigned int core_internal_state__do_not_mess_with_it;
        public @Unsigned int depth;
        public @Unsigned int wake_depth;
        public @Unsigned int tot_count;
        public @Unsigned int irq_count;
        public @Unsigned long last_unhandled;
        public @Unsigned int irqs_unhandled;
        public AtomicDefinitions.atomic_t threads_handled;
        public int threads_handled_last;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public Ptr<runtime.cpumask> percpu_enabled;
        public Ptr<runtime.cpumask> percpu_affinity;
        public Ptr<runtime.cpumask> affinity_hint;
        public Ptr<irq_affinity_notify> affinity_notify;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> pending_mask;
        public @Unsigned long threads_oneshot;
        public AtomicDefinitions.atomic_t threads_active;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait_for_threads;
        public @Unsigned int nr_actions;
        public @Unsigned int no_suspend_depth;
        public @Unsigned int cond_suspend_depth;
        public @Unsigned int force_resume_depth;
        public Ptr<ProcDefinitions.proc_dir_entry> dir;
        public misc.callback_head rcu;
        public runtime.kobject kobj;
        public runtime.mutex request_mutex;
        public int parent_irq;
        public Ptr<runtime.module> owner;
        public String name;
        public misc.hlist_node resend_node;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_affinity_desc")
    @NotUsableInJava
    public static class irq_affinity_desc
    extends Struct {
        public runtime.cpumask mask;
        public @Unsigned int is_managed;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_affinity_notify")
    @NotUsableInJava
    public static class irq_affinity_notify
    extends Struct {
        public @Unsigned int irq;
        public runtime.kref kref;
        public misc.work_struct work;
        public Ptr<?> notify;
        public Ptr<?> release;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 kvm_cpu_l1tf_flush_l1d; unsigned int __nmi_count; unsigned int apic_timer_irqs; unsigned int irq_spurious_count; unsigned int icr_read_retry_count; unsigned int kvm_posted_intr_ipis; unsigned int kvm_posted_intr_wakeup_ipis; unsigned int kvm_posted_intr_nested_ipis; unsigned int x86_platform_ipis; unsigned int apic_perf_irqs; unsigned int apic_irq_work_irqs; unsigned int irq_resched_count; unsigned int irq_call_count; unsigned int irq_tlb_count; unsigned int irq_thermal_count; unsigned int irq_threshold_count; unsigned int irq_deferred_error_count; unsigned int irq_hv_callback_count; unsigned int irq_hv_reenlightenment_count; unsigned int hyperv_stimer0_count; }")
    @NotUsableInJava
    public static class irq_cpustat_t
    extends Struct {
        public char kvm_cpu_l1tf_flush_l1d;
        public @Unsigned int __nmi_count;
        public @Unsigned int apic_timer_irqs;
        public @Unsigned int irq_spurious_count;
        public @Unsigned int icr_read_retry_count;
        public @Unsigned int kvm_posted_intr_ipis;
        public @Unsigned int kvm_posted_intr_wakeup_ipis;
        public @Unsigned int kvm_posted_intr_nested_ipis;
        public @Unsigned int x86_platform_ipis;
        public @Unsigned int apic_perf_irqs;
        public @Unsigned int apic_irq_work_irqs;
        public @Unsigned int irq_resched_count;
        public @Unsigned int irq_call_count;
        public @Unsigned int irq_tlb_count;
        public @Unsigned int irq_thermal_count;
        public @Unsigned int irq_threshold_count;
        public @Unsigned int irq_deferred_error_count;
        public @Unsigned int irq_hv_callback_count;
        public @Unsigned int irq_hv_reenlightenment_count;
        public @Unsigned int hyperv_stimer0_count;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_domain")
    @NotUsableInJava
    public static class irq_domain
    extends Struct {
        public ListDefinitions.list_head link;
        public String name;
        public Ptr<irq_domain_ops> ops;
        public Ptr<?> host_data;
        public @Unsigned int flags;
        public @Unsigned int mapcount;
        public runtime.mutex mutex;
        public Ptr<irq_domain> root;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public irq_domain_bus_token bus_token;
        public Ptr<irq_domain_chip_generic> gc;
        public Ptr<runtime.device> dev;
        public Ptr<runtime.device> pm_dev;
        public Ptr<irq_domain> parent;
        public Ptr<MsiDefinitions.msi_parent_ops> msi_parent_ops;
        public Ptr<?> exit;
        public @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq_max;
        public @Unsigned int revmap_size;
        public runtime.xarray revmap_tree;
        public Ptr<irq_data> @Size(value=0) [] revmap;
    }

    @Type(noCCodeGeneration=true, cType="struct irq_work")
    @NotUsableInJava
    public static class irq_work
    extends Struct {
        public CallDefinitions.__call_single_node node;
        public Ptr<?> func;
        public runtime.rcuwait irqwait;
    }
}

