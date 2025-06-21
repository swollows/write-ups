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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class OsnoiseDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int osnoise_arch_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void osnoise_arch_unregister() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int osnoise_cpu_die(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int osnoise_cpu_init(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long osnoise_cpus_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="osnoise_cpus_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long osnoise_cpus_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int osnoise_hook_events() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void osnoise_hotplug_workfn(Ptr<misc.work_struct> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int osnoise_main(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int osnoise_options_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="osnoise_options_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long osnoise_options_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int osnoise_register_instance(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void osnoise_sleep(boolean skip_period) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void osnoise_trace_irq_entry(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="osnoise_trace_irq_exit($arg1, (const u8*)$arg2)")
    public static void osnoise_trace_irq_exit(int id, String desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int osnoise_tracer_init(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void osnoise_tracer_reset(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void osnoise_tracer_start(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void osnoise_tracer_stop(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void osnoise_unregister_instance(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int osnoise_workload_start() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void osnoise_workload_stop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct osnoise_data")
    @NotUsableInJava
    public static class osnoise_data
    extends Struct {
        public @Unsigned long sample_period;
        public @Unsigned long sample_runtime;
        public @Unsigned long stop_tracing;
        public @Unsigned long stop_tracing_total;
        public @Unsigned long timerlat_period;
        public @Unsigned long print_stack;
        public int timerlat_tracer;
        public boolean tainted;
    }

    @Type(noCCodeGeneration=true, cType="struct osnoise_sample")
    @NotUsableInJava
    public static class osnoise_sample
    extends Struct {
        public @Unsigned long runtime;
        public @Unsigned long noise;
        public @Unsigned long max_sample;
        public int hw_count;
        public int nmi_count;
        public int irq_count;
        public int softirq_count;
        public int thread_count;
    }

    @Type(noCCodeGeneration=true, cType="struct osnoise_variables")
    @NotUsableInJava
    public static class osnoise_variables
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> kthread;
        public boolean sampling;
        public @OriginalName(value="pid_t") int pid;
        public misc.osn_nmi nmi;
        public misc.osn_irq irq;
        public misc.osn_softirq softirq;
        public misc.osn_thread thread;
        public LocalDefinitions.local_t int_counter;
    }

    @Type(noCCodeGeneration=true, cType="struct osnoise_instance")
    @NotUsableInJava
    public static class osnoise_instance
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<TraceDefinitions.trace_array> tr;
    }

    @Type(noCCodeGeneration=true, cType="enum osnoise_options_index")
    public static enum osnoise_options_index implements Enum<osnoise_options_index>,
    TypedEnum<osnoise_options_index, Integer>
    {
        OSN_DEFAULTS,
        OSN_WORKLOAD,
        OSN_PANIC_ON_STOP,
        OSN_PREEMPT_DISABLE,
        OSN_IRQ_DISABLE,
        OSN_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct osnoise_entry")
    @NotUsableInJava
    public static class osnoise_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public @Unsigned long noise;
        public @Unsigned long runtime;
        public @Unsigned long max_sample;
        public @Unsigned int hw_count;
        public @Unsigned int nmi_count;
        public @Unsigned int irq_count;
        public @Unsigned int softirq_count;
        public @Unsigned int thread_count;
    }
}

