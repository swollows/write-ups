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
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TimerlatDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __timerlat_dump_stack(Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<TraceDefinitions.trace_stack> fstack, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timerlat_dump_stack(@Unsigned long latency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timerlat_fd_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long timerlat_fd_read(Ptr<runtime.file> file2, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timerlat_fd_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart timerlat_irq(Ptr<runtime.hrtimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timerlat_main(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int timerlat_tracer_init(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timerlat_tracer_reset(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timerlat_tracer_start(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void timerlat_tracer_stop(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct timerlat_sample")
    @NotUsableInJava
    public static class timerlat_sample
    extends Struct {
        public @Unsigned long timer_latency;
        public @Unsigned int seqnum;
        public int context;
    }

    @Type(noCCodeGeneration=true, cType="struct timerlat_variables")
    @NotUsableInJava
    public static class timerlat_variables
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> kthread;
        public runtime.hrtimer timer;
        public @Unsigned long rel_period;
        public @Unsigned long abs_period;
        public boolean tracing_thread;
        public @Unsigned long count;
        public boolean uthread_migrate;
    }

    @Type(noCCodeGeneration=true, cType="struct timerlat_entry")
    @NotUsableInJava
    public static class timerlat_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public @Unsigned int seqnum;
        public int context;
        public @Unsigned long timer_latency;
    }
}

