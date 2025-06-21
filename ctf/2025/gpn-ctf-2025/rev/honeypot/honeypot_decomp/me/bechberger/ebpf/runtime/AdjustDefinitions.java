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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.IocDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MapDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AdjustDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adjust_dual(Ptr<Integer> begin, int step, Ptr<Integer> end, int eq, int mu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adjust_for_msb_right_quirk(Ptr<@Unsigned Long> to_write, Ptr<Integer> box_start_bit, Ptr<Integer> box_end_bit, Ptr<Character> box_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __adjust_resource(Ptr<runtime.resource> res, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adjust_bridge_window(Ptr<PciDefinitions.pci_dev> bridge, Ptr<runtime.resource> res, Ptr<ListDefinitions.list_head> add_list, @Unsigned @OriginalName(value="resource_size_t") long new_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adjust_dev_dax_range(Ptr<DevDefinitions.dev_dax> dev_dax2, Ptr<runtime.resource> res, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adjust_present_page_count(Ptr<runtime.page> page2, Ptr<MemoryDefinitions.memory_group> group, long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adjust_range_if_pmd_sharing_possible(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<@Unsigned Long> start, Ptr<@Unsigned Long> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adjust_range_page_size_mask(Ptr<MapDefinitions.map_range> mr, int nr_range) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adjust_resource(Ptr<runtime.resource> res, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adjust_insn_aux_data(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn_aux_data> new_data, Ptr<BpfDefinitions.bpf_prog> new_prog, @Unsigned int off, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long adjust_inuse_and_calc_cost(Ptr<IocDefinitions.ioc_gq> iocg, @Unsigned long vtime2, @Unsigned long abs_cost, Ptr<IocDefinitions.ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adjust_jiffies_till_sched_qs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adjust_jmp_off(Ptr<BpfDefinitions.bpf_prog> prog, @Unsigned int tgt_idx, @Unsigned int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="adjust_ptr_min_max_vals($arg1, $arg2, $arg3, (const struct bpf_reg_state*)$arg4)")
    public static int adjust_ptr_min_max_vals(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2, Ptr<BpfDefinitions.bpf_reg_state> ptr_reg, Ptr<BpfDefinitions.bpf_reg_state> off_reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adjust_reg_min_max_vals(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adjust_scalar_min_max_vals(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_insn> insn2, Ptr<BpfDefinitions.bpf_reg_state> dst_reg, BpfDefinitions.bpf_reg_state src_reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int adjust_subprog_starts_after_remove(Ptr<BpfDefinitions.bpf_verifier_env> env, @Unsigned int off, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void adjust_managed_page_count(Ptr<runtime.page> page2, long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct adjust_trip_data")
    @NotUsableInJava
    public static class adjust_trip_data
    extends Struct {
        public Ptr<AcpiDefinitions.acpi_thermal> tz;
        public @Unsigned int event;
    }
}

