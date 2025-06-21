/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CpuacctDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cpuacct_percpu_seq_show(Ptr<SeqDefinitions.seq_file> m, cpuacct_stat_index index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuacct_account_field(Ptr<TaskDefinitions.task_struct> tsk, int index2, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuacct_all_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> V) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuacct_charge(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long cputime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cpuacct_cpuusage_read(Ptr<cpuacct> ca, int cpu2, cpuacct_stat_index index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> cpuacct_css_alloc(Ptr<CgroupDefinitions.cgroup_subsys_state> parent_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuacct_css_free(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuacct_percpu_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> V) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuacct_percpu_sys_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> V) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuacct_percpu_user_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> V) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuacct_stats_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cpuacct")
    @NotUsableInJava
    public static class cpuacct
    extends Struct {
        public CgroupDefinitions.cgroup_subsys_state css;
        public Ptr<@Unsigned Long> cpuusage;
        public Ptr<KernelDefinitions.kernel_cpustat> cpustat;
    }

    @Type(noCCodeGeneration=true, cType="enum cpuacct_stat_index")
    public static enum cpuacct_stat_index implements Enum<cpuacct_stat_index>,
    TypedEnum<cpuacct_stat_index, Integer>
    {
        CPUACCT_STAT_USER,
        CPUACCT_STAT_SYSTEM,
        CPUACCT_STAT_NSTATS;

    }
}

