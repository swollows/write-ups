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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PsiDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class GroupDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void group_close_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void group_open_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long group_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int group_balance_cpu(Ptr<SchedDefinitions.sched_group> sg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void group_init(Ptr<PsiDefinitions.psi_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void group_pin_kill(Ptr<misc.hlist_head> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int group_send_sig_info(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<TaskDefinitions.task_struct> p, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="group_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long group_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__group_cpus_evenly($arg1, $arg2, $arg3, (const struct cpumask*)$arg4, $arg5, $arg6)")
    public static int __group_cpus_evenly(@Unsigned int startgrp, @Unsigned int numgrps, Ptr<@OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask>> node_to_cpumask, Ptr<runtime.cpumask> cpu_mask, Ptr<runtime.cpumask> nmsk, Ptr<runtime.cpumask> masks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.cpumask> group_cpus_evenly(@Unsigned int numgrps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void group_sched_out(Ptr<PerfDefinitions.perf_event> group_event, Ptr<PerfDefinitions.perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct group_data")
    @NotUsableInJava
    public static class group_data
    extends Struct {
        public int @Size(value=21) [] limit;
        public int @Size(value=20) [] base;
        public int @Size(value=258) [] permute;
        public int minLen;
        public int maxLen;
    }

    @Type(noCCodeGeneration=true, cType="struct group_for_pci_data")
    @NotUsableInJava
    public static class group_for_pci_data
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> pdev;
        public Ptr<IommuDefinitions.iommu_group> group;
    }

    @Type(noCCodeGeneration=true, cType="struct group_device")
    @NotUsableInJava
    public static class group_device
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.device> dev;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="enum group_type")
    public static enum group_type implements Enum<group_type>,
    TypedEnum<group_type, Integer>
    {
        group_has_spare,
        group_fully_busy,
        group_misfit_task,
        group_smt_balance,
        group_asym_packing,
        group_imbalanced,
        group_overloaded;

    }

    @Type(noCCodeGeneration=true, cType="struct group_filter")
    @NotUsableInJava
    public static class group_filter
    extends Struct {
        @InlineUnion(value=25429)
        public  @InlineUnion(value=25429) AnonDefinitions.anon_member_of_anon_member_of_group_filter anon0$0;
        @InlineUnion(value=25429)
        public  @InlineUnion(value=25429) AnonDefinitions.anon_member_of_anon_member_of_group_filter anon0$1;
    }

    @Type(noCCodeGeneration=true, cType="struct group_source_req")
    @NotUsableInJava
    public static class group_source_req
    extends Struct {
        public @Unsigned int gsr_interface;
        public KernelDefinitions.__kernel_sockaddr_storage gsr_group;
        public KernelDefinitions.__kernel_sockaddr_storage gsr_source;
    }

    @Type(noCCodeGeneration=true, cType="struct group_req")
    @NotUsableInJava
    public static class group_req
    extends Struct {
        public @Unsigned int gr_interface;
        public KernelDefinitions.__kernel_sockaddr_storage gr_group;
    }

    @Type(noCCodeGeneration=true, cType="struct __group_key")
    @NotUsableInJava
    public static class __group_key
    extends Struct {
        public int cpu;
        public Ptr<runtime.pmu> pmu;
        public Ptr<runtime.cgroup> cgroup;
    }

    @Type(noCCodeGeneration=true, cType="struct group_info")
    @NotUsableInJava
    public static class group_info
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct usage;
        public int ngroups;
        public misc.kgid_t @Size(value=0) [] gid;
    }
}

