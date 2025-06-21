/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.X86Definitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class TopologyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int topology_gidnid_map(int nodeid, @Unsigned int gidnid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="topology_span_sane($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static boolean topology_span_sane(Ptr<SchedDefinitions.sched_domain_topology_level> tl, Ptr<runtime.cpumask> cpu_map, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void topology_apply_cmdline_limits_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int topology_get_logical_id(@Unsigned int apicid, X86Definitions.x86_topology_domains at_level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int topology_hotplug_apic(@Unsigned int apic_id, @Unsigned int acpi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void topology_hotunplug_apic(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void topology_init_possible_cpus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void topology_register_apic(@Unsigned int apic_id, @Unsigned int acpi_id, boolean present) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void topology_register_boot_apic(@Unsigned int apic_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void topology_reset_possible_cpus_up() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int topology_unit_count(@Unsigned int apicid, X86Definitions.x86_topology_domains which_units, X86Definitions.x86_topology_domains at_level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int topology_add_dev(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short topology_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int topology_remove_dev(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void topology_set_dom(Ptr<misc.topo_scan> tscan, X86Definitions.x86_topology_domains dom, @Unsigned int shift, @Unsigned int ncpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int topology_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }
}

