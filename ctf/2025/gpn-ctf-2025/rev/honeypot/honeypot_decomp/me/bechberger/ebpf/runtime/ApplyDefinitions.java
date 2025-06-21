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
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.IccDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.ZoneDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ApplyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__apply_relocation($arg1, (const const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static void __apply_relocation(Ptr<Character> buf, Ptr<Character> instr, @Unsigned long instrlen, Ptr<Character> repl, @Unsigned long repl_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __apply_to_page_range(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, @Unsigned long size, @OriginalName(value="pte_fn_t") Ptr<?> fn, Ptr<?> data, boolean create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apply_alternatives(Ptr<misc.alt_instr> start, Ptr<misc.alt_instr> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_constraints(Ptr<IccDefinitions.icc_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apply_fineibt(Ptr<Integer> start_retpoline, Ptr<Integer> end_retpoline, Ptr<Integer> start_cfi, Ptr<Integer> end_cfi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apply_relocation($arg1, (const const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static void apply_relocation(Ptr<Character> buf, Ptr<Character> instr, @Unsigned long instrlen, Ptr<Character> repl, @Unsigned long repl_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apply_retpolines(Ptr<Integer> start, Ptr<Integer> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apply_returns(Ptr<Integer> start, Ptr<Integer> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apply_seal_endbr(Ptr<Integer> start, Ptr<Integer> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_to_existing_page_range(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, @Unsigned long size, @OriginalName(value="pte_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_to_page_range(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, @Unsigned long size, @OriginalName(value="pte_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_to_pmd_range(Ptr<MmDefinitions.mm_struct> mm, Ptr<PudDefinitions.pud_t> pud, @Unsigned long addr2, @Unsigned long end, @OriginalName(value="pte_fn_t") Ptr<?> fn, Ptr<?> data, boolean create, Ptr<@Unsigned @OriginalName(value="pgtbl_mod_mask") Integer> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_to_pte_range(Ptr<MmDefinitions.mm_struct> mm, Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long end, @OriginalName(value="pte_fn_t") Ptr<?> fn, Ptr<?> data, boolean create, Ptr<@Unsigned @OriginalName(value="pgtbl_mod_mask") Integer> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_to_pud_range(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.p4d_t> p4d, @Unsigned long addr2, @Unsigned long end, @OriginalName(value="pte_fn_t") Ptr<?> fn, Ptr<?> data, boolean create, Ptr<@Unsigned @OriginalName(value="pgtbl_mod_mask") Integer> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apply_trace_boot_options() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_mlockall_flags(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apply_relocate_add($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int apply_relocate_add(Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs, String strtab, @Unsigned int symindex, @Unsigned int relsec, Ptr<runtime.module> me) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_vma_lock_flags(@Unsigned long start, @Unsigned long len, @Unsigned @OriginalName(value="vm_flags_t") long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.ucode_state __apply_microcode(Ptr<misc.ucode_cpu_info> uci, Ptr<misc.microcode_intel> mc, Ptr<@Unsigned Integer> cur_rev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_constraint(Ptr<DevDefinitions.dev_pm_qos_request> req2, PmDefinitions.pm_qos_req_action action, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_event_filter(Ptr<TraceDefinitions.trace_event_file> file2, String filter_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.ucode_state apply_microcode_late(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean apply_policy_zone(Ptr<runtime.mempolicy> policy, ZoneDefinitions.zone_type zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apply_subsystem_event_filter(Ptr<TraceDefinitions.trace_subsystem_dir> dir, String filter_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __apply_microcode_amd(Ptr<misc.microcode_amd> mc, @Unsigned int psize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apply_cgroup_root_flags(@Unsigned int root_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.ucode_state apply_microcode_amd(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apply_workqueue_attrs($arg1, (const struct workqueue_attrs*)$arg2)")
    public static int apply_workqueue_attrs(Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<WorkqueueDefinitions.workqueue_attrs> attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apply_wqattrs_cleanup(Ptr<apply_wqattrs_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apply_wqattrs_commit(Ptr<apply_wqattrs_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apply_wqattrs_prepare($arg1, (const struct workqueue_attrs*)$arg2, (const struct cpumask*)$arg3)")
    public static Ptr<apply_wqattrs_ctx> apply_wqattrs_prepare(Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<WorkqueueDefinitions.workqueue_attrs> attrs, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> unbound_cpumask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct apply_wqattrs_ctx")
    @NotUsableInJava
    public static class apply_wqattrs_ctx
    extends Struct {
        public Ptr<WorkqueueDefinitions.workqueue_struct> wq;
        public Ptr<WorkqueueDefinitions.workqueue_attrs> attrs;
        public ListDefinitions.list_head list;
        public Ptr<misc.pool_workqueue> dfl_pwq;
        public Ptr<misc.pool_workqueue> @Size(value=0) [] pwq_tbl;
    }
}

