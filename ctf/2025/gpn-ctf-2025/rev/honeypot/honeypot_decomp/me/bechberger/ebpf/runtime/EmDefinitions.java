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
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void em_check_capacity_update() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_compute_costs(Ptr<runtime.device> dev, Ptr<em_perf_state> table, Ptr<em_data_callback> cb, int nr_states, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<em_perf_domain> em_cpu_get(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void em_cpufreq_update_efficiencies(Ptr<runtime.device> dev, Ptr<em_perf_state> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_create_pd(Ptr<runtime.device> dev, int nr_states, Ptr<em_data_callback> cb, Ptr<@OriginalName(value="cpumask_t") runtime.cpumask> cpus, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_cost_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_cost_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_cpus_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_cpus_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void em_debug_create_pd(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_flags_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_flags_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_frequency_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_frequency_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_inefficiency_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_inefficiency_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_performance_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_performance_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_power_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_debug_power_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void em_destroy_table_rcu(Ptr<misc.callback_head> rp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_dev_compute_costs(Ptr<runtime.device> dev, Ptr<em_perf_state> table, int nr_states) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_dev_register_perf_domain(Ptr<runtime.device> dev, @Unsigned int nr_states, Ptr<em_data_callback> cb, Ptr<@OriginalName(value="cpumask_t") runtime.cpumask> cpus, boolean microwatts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void em_dev_unregister_perf_domain(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_dev_update_chip_binning(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int em_dev_update_perf_domain(Ptr<runtime.device> dev, Ptr<em_perf_table> new_table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<em_perf_domain> em_pd_get(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<em_perf_table> em_table_alloc(Ptr<em_perf_domain> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<em_perf_table> em_table_dup(Ptr<em_perf_domain> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void em_table_free(Ptr<em_perf_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void em_update_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int comptag; unsigned int errdetect; unsigned int is_port; unsigned int ltlerrdet; unsigned int padding[12]; }")
    @NotUsableInJava
    public static class em_of_rio_pw_msg
    extends Struct {
        public @Unsigned int comptag;
        public @Unsigned int errdetect;
        public @Unsigned int is_port;
        public @Unsigned int ltlerrdet;
        public @Unsigned int @Size(value=12) [] padding;
    }

    @Type(noCCodeGeneration=true, cType="struct em_dbg_info")
    @NotUsableInJava
    public static class em_dbg_info
    extends Struct {
        public Ptr<em_perf_domain> pd;
        public int ps_id;
    }

    @Type(noCCodeGeneration=true, cType="struct em_data_callback")
    @NotUsableInJava
    public static class em_data_callback
    extends Struct {
        public Ptr<?> active_power;
        public Ptr<?> get_cost;
    }

    @Type(noCCodeGeneration=true, cType="struct em_perf_domain")
    @NotUsableInJava
    public static class em_perf_domain
    extends Struct {
        public Ptr<em_perf_table> em_table;
        public int nr_perf_states;
        public @Unsigned long flags;
        public @Unsigned long @Size(value=0) [] cpus;
    }

    @Type(noCCodeGeneration=true, cType="struct em_perf_table")
    @NotUsableInJava
    public static class em_perf_table
    extends Struct {
        public misc.callback_head rcu;
        public runtime.kref kref;
        public em_perf_state @Size(value=0) [] state;
    }

    @Type(noCCodeGeneration=true, cType="struct em_perf_state")
    @NotUsableInJava
    public static class em_perf_state
    extends Struct {
        public @Unsigned long performance;
        public @Unsigned long frequency;
        public @Unsigned long power;
        public @Unsigned long cost;
        public @Unsigned long flags;
    }
}

