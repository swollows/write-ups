/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ArrayDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PowerDefinitions;
import me.bechberger.ebpf.runtime.SavedDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class AllocateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int allocate_actors_buffer(Ptr<PowerDefinitions.power_allocator_params> params, int num_actors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SavedDefinitions.saved_cmdlines_buffer> allocate_cmdlines_buffer(@Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void allocate_power(Ptr<ThermalDefinitions.thermal_zone_device> tz, int control_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.slab> allocate_slab(Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned @OriginalName(value="gfp_t") int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int allocate_threshold_blocks(@Unsigned int cpu2, Ptr<misc.threshold_bank> tb, @Unsigned int bank, @Unsigned int block, @Unsigned int address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int allocate_trace_buffer(Ptr<TraceDefinitions.trace_array> tr, Ptr<ArrayDefinitions.array_buffer> buf, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int allocate_trace_buffers(Ptr<TraceDefinitions.trace_array> tr, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int allocate_file_region_entries(Ptr<misc.resv_map> resv, int regions_needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FtraceDefinitions.ftrace_func_mapper> allocate_ftrace_func_mapper() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int allocate_resource(Ptr<runtime.resource> root, Ptr<runtime.resource> _new, @Unsigned @OriginalName(value="resource_size_t") long size, @Unsigned @OriginalName(value="resource_size_t") long min, @Unsigned @OriginalName(value="resource_size_t") long max, @Unsigned @OriginalName(value="resource_size_t") long align, @OriginalName(value="resource_alignf") Ptr<?> alignf, Ptr<?> alignf_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int allocate_boxes(Ptr<Ptr<IntelDefinitions.intel_uncore_type>> types, @Unsigned int die, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int allocate_fgraph_ops(Ptr<TraceDefinitions.trace_array> tr, Ptr<FtraceDefinitions.ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int allocate_cgrp_cset_links(int count, Ptr<ListDefinitions.list_head> tmp_links) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CpuDefinitions.cpu_hw_events> allocate_fake_cpuc(Ptr<runtime.pmu> event_pmu) {
        throw new MethodIsBPFRelatedFunction();
    }
}

