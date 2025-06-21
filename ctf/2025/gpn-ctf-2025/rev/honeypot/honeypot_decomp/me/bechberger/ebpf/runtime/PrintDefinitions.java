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
import me.bechberger.ebpf.runtime.ActionDefinitions;
import me.bechberger.ebpf.runtime.ArrayDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DlDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PcieDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.RtDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TickDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WakeupDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PrintDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __print_cand_cache(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<Ptr<BpfDefinitions.bpf_cand_cache>> cache, int cache_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_bad_pte(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, PteDefinitions.pte_t pte, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_cfs_stats(Ptr<SeqDefinitions.seq_file> m, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_event_info(Ptr<ArrayDefinitions.array_buffer> buf, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_fentry_event(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_fexit_event(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_hex_dump((const u8*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7, $arg8)")
    public static void print_hex_dump(String level, String prefix_str, int prefix_type, int rowsize, int groupsize, Ptr<?> buf, @Unsigned long len, boolean ascii) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_insn_state($arg1, (const struct bpf_func_state*)$arg2)")
    public static void print_insn_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_irq_desc(@Unsigned int irq, Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_kprobe_event(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_kretprobe_event(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_liveness(Ptr<BpfDefinitions.bpf_verifier_env> env, BpfDefinitions.bpf_reg_liveness live) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_modules() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_one_line(Ptr<TraceDefinitions.trace_iterator> iter2, boolean classic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_osnoise_headers(Ptr<SeqDefinitions.seq_file> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_out_mtrr_range_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_reg_state($arg1, (const struct bpf_func_state*)$arg2, (const struct bpf_reg_state*)$arg3)")
    public static void print_reg_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> state2, Ptr<BpfDefinitions.bpf_reg_state> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_scalar_ranges($arg1, (const struct bpf_reg_state*)$arg2, (const u8**)$arg3)")
    public static void print_scalar_ranges(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, Ptr<String> sep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_section(String level, String text, Ptr<Character> addr2, @Unsigned int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_slab_info((const struct slab*)$arg1)")
    public static void print_slab_info(Ptr<runtime.slab> slab2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_synth_event(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)print_tainted())")
    public static String print_tainted() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_tainted_seq(Ptr<SeqDefinitions.seq_buf> s2, boolean verbose) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)print_tainted_verbose())")
    public static String print_tainted_verbose() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_timerlat_headers(Ptr<SeqDefinitions.seq_file> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_trace_fmt(Ptr<TraceDefinitions.trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_trace_header(Ptr<SeqDefinitions.seq_file> m, Ptr<TraceDefinitions.trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_trace_line(Ptr<TraceDefinitions.trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_tracking(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_trailer(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2, Ptr<Character> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_unknown_bootoptions() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_verifier_state($arg1, (const struct bpf_func_state*)$arg2, $arg3)")
    public static void print_verifier_state(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> state2, boolean print_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_vma_addr(String prefix, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __print_mce(Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_cfs_group_stats(Ptr<SeqDefinitions.seq_file> m, int cpu2, Ptr<TaskDefinitions.task_group> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_cfs_rq(Ptr<SeqDefinitions.seq_file> m, int cpu2, Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_dl_rq(Ptr<SeqDefinitions.seq_file> m, int cpu2, Ptr<DlDefinitions.dl_rq> dl_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_eprobe_event(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_ip_ins((const u8*)$arg1, (const u8*)$arg2)")
    public static void print_ip_ins(String fmt, String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_mce(Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_numa_stats(Ptr<SeqDefinitions.seq_file> m, int node2, @Unsigned long tsf, @Unsigned long tpf, @Unsigned long gsf, @Unsigned long gpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_rec(Ptr<SeqDefinitions.seq_file> m, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_rt_rq(Ptr<SeqDefinitions.seq_file> m, int cpu2, Ptr<RtDefinitions.rt_rq> rt_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_syscall_enter(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_syscall_exit(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_tickdevice(Ptr<SeqDefinitions.seq_file> m, Ptr<TickDefinitions.tick_device> td2, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_uprobe_event(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_wakeup_source_stats(Ptr<SeqDefinitions.seq_file> m, Ptr<WakeupDefinitions.wakeup_source> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __print_tlp_header(Ptr<PciDefinitions.pci_dev> dev, Ptr<PcieDefinitions.pcie_tlp_log> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_array(Ptr<TraceDefinitions.trace_iterator> iter2, Ptr<?> pos, Ptr<FtraceDefinitions.ftrace_event_field> field) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_bool($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void print_bool(String str, String pfx, @Unsigned long check, @Unsigned long bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_bpf_insn((const struct bpf_insn_cbs*)$arg1, (const struct bpf_insn*)$arg2, $arg3)")
    public static void print_bpf_insn(Ptr<BpfDefinitions.bpf_insn_cbs> cbs, Ptr<BpfDefinitions.bpf_insn> insn2, boolean allow_ptr_leaks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_cpu_stall(@Unsigned long gps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_cpu_stall_info(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_cpu_stat_info(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_daily_error_info(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_err_info((const u8*)$arg1, $arg2, $arg3)")
    public static void print_err_info(String pfx, char err_type, @Unsigned long check) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_event_fields(Ptr<TraceDefinitions.trace_iterator> iter2, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_event_filter(Ptr<TraceDefinitions.trace_event_file> file2, Ptr<TraceDefinitions.trace_seq> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_graph_comment(Ptr<TraceDefinitions.trace_seq> s2, Ptr<TraceDefinitions.trace_entry> ent, Ptr<TraceDefinitions.trace_iterator> iter2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_graph_entry(Ptr<FtraceDefinitions.ftrace_graph_ent_entry> field, Ptr<TraceDefinitions.trace_seq> s2, Ptr<TraceDefinitions.trace_iterator> iter2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_graph_function(Ptr<TraceDefinitions.trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_graph_function_event(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static print_line_t print_graph_function_flags(Ptr<TraceDefinitions.trace_iterator> iter2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_graph_headers(Ptr<SeqDefinitions.seq_file> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_graph_headers_flags(Ptr<SeqDefinitions.seq_file> s2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_graph_irq(Ptr<TraceDefinitions.trace_iterator> iter2, @Unsigned long addr2, TraceDefinitions.trace_type type2, int cpu2, @OriginalName(value="pid_t") int pid2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_graph_proc(Ptr<TraceDefinitions.trace_seq> s2, @OriginalName(value="pid_t") int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_graph_prologue(Ptr<TraceDefinitions.trace_iterator> iter2, Ptr<TraceDefinitions.trace_seq> s2, int type2, @Unsigned long addr2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_graph_retval(Ptr<TraceDefinitions.trace_seq> s2, @Unsigned long retval, boolean leaf, Ptr<?> func, boolean hex_format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_local_APIC(Ptr<?> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_mp_irq_info(Ptr<misc.mpc_intsrc> mp_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_other_cpu_stall(@Unsigned long gp_seq, @Unsigned long gps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_subsystem_event_filter(Ptr<EventDefinitions.event_subsystem> system, Ptr<TraceDefinitions.trace_seq> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_action_spec(Ptr<SeqDefinitions.seq_file> m, Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<ActionDefinitions.action_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_basics(Ptr<misc.powernow_k8_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_constraints_debug(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_cpu_info(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long print_cpu_modalias(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long print_cpus_enabled(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long print_cpus_isolated(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long print_cpus_kernel_max(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long print_cpus_nohz_full(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long print_cpus_offline(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_device_status(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_dl_stats(Ptr<SeqDefinitions.seq_file> m, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_entries(Ptr<SeqDefinitions.seq_file> m, Ptr<HistDefinitions.hist_trigger_data> hist_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_filtered($arg1, $arg2, (const u8*)$arg3)")
    public static int print_filtered(String buf, @Unsigned long len, String info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_fixed($arg1, $arg2, (const u8*)$arg3)")
    public static void print_fixed(@Unsigned int base, @Unsigned int step, Ptr<@OriginalName(value="mtrr_type") Character> types) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_fixed_last() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_ipi_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_mtrr_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_rt_stats(Ptr<SeqDefinitions.seq_file> m, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_scx_info((const u8*)$arg1, $arg2)")
    public static void print_scx_info(String log_lvl, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_size($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void print_size(Ptr<DrmDefinitions.drm_printer> p, String stat2, String region2, @Unsigned long sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_stop_info((const u8*)$arg1, $arg2)")
    public static void print_stop_info(String log_lvl, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_char(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_s16(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_s32(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_s64(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_s8(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_string(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_symbol(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_u16(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_u32(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_u64(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_u8(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_x16(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_x32(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_x64(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int print_type_x8(Ptr<TraceDefinitions.trace_seq> s2, Ptr<?> data, Ptr<?> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="print_worker_info((const u8*)$arg1, $arg2)")
    public static void print_worker_info(String log_lvl, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void print_xstate_feature(@Unsigned long xstate_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct print_entry")
    @NotUsableInJava
    public static class print_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public @Unsigned long ip;
        public char @Size(value=0) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="enum print_line_t")
    public static enum print_line_t implements Enum<print_line_t>,
    TypedEnum<print_line_t, Integer>
    {
        TRACE_TYPE_PARTIAL_LINE,
        TRACE_TYPE_HANDLED,
        TRACE_TYPE_UNHANDLED,
        TRACE_TYPE_NO_CONSUME;

    }
}

