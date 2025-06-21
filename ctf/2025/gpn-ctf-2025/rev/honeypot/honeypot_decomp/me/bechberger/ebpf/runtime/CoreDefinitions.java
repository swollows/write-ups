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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CoreDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_guest_switch_msr> core_guest_get_msrs(Ptr<Integer> nr, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_kernel_text(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void core_pmu_enable_all(int added) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void core_pmu_enable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_pmu_hw_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_sys_select(int n, Ptr< @OriginalName(value="fd_set") KernelDefinitions.__kernel_fd_set> inp, Ptr< @OriginalName(value="fd_set") KernelDefinitions.__kernel_fd_set> outp, Ptr< @OriginalName(value="fd_set") KernelDefinitions.__kernel_fd_set> exp, Ptr<runtime.timespec64> end_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_get_max_pstate(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_get_max_pstate_physical(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_get_min_pstate(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_get_scaling() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_get_turbo_pstate(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long core_get_val(Ptr<runtime.cpudata> cpudata2, int pstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void core_restore_code() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long core_cpus_list_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long core_cpus_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_frequency_transition(Ptr<misc.powernow_k8_data> data, @Unsigned int reqfid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long core_id_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean core_sched_before_stub(Ptr<TaskDefinitions.task_struct> a, Ptr<TaskDefinitions.task_struct> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long core_siblings_list_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long core_siblings_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_voltage_post_transition(Ptr<misc.powernow_k8_data> data, @Unsigned int reqvid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int core_voltage_pre_transition(Ptr<misc.powernow_k8_data> data, @Unsigned int reqvid, @Unsigned int reqfid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct core_name")
    @NotUsableInJava
    public static class core_name
    extends Struct {
        public String corename;
        public int used;
        public int size;
    }

    @Type(noCCodeGeneration=true, cType="struct core_text")
    @NotUsableInJava
    public static class core_text
    extends Struct {
        public @Unsigned long base;
        public @Unsigned long end;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct core_vma_metadata")
    @NotUsableInJava
    public static class core_vma_metadata
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned long flags;
        public @Unsigned long dump_size;
        public @Unsigned long pgoff;
        public Ptr<runtime.file> file;
    }

    @Type(noCCodeGeneration=true, cType="struct core_state")
    @NotUsableInJava
    public static class core_state
    extends Struct {
        public AtomicDefinitions.atomic_t nr_threads;
        public core_thread dumper;
        public runtime.completion startup;
    }

    @Type(noCCodeGeneration=true, cType="struct core_thread")
    @NotUsableInJava
    public static class core_thread
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr<core_thread> next;
    }
}

