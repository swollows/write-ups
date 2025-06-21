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
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class HwlatDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwlat_cpu_die(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwlat_cpu_init(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hwlat_hotplug_workfn(Ptr<misc.work_struct> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwlat_mode_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hwlat_mode_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long hwlat_mode_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwlat_tracer_init(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hwlat_tracer_reset(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hwlat_tracer_start(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hwlat_tracer_stop(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hwlat_data")
    @NotUsableInJava
    public static class hwlat_data
    extends Struct {
        public runtime.mutex lock;
        public @Unsigned long count;
        public @Unsigned long sample_window;
        public @Unsigned long sample_width;
        public int thread_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct hwlat_sample")
    @NotUsableInJava
    public static class hwlat_sample
    extends Struct {
        public @Unsigned long seqnum;
        public @Unsigned long duration;
        public @Unsigned long outer_duration;
        public @Unsigned long nmi_total_ts;
        public runtime.timespec64 timestamp;
        public int nmi_count;
        public int count;
    }

    @Type(noCCodeGeneration=true, cType="struct hwlat_kthread_data")
    @NotUsableInJava
    public static class hwlat_kthread_data
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> kthread;
        public @Unsigned long nmi_ts_start;
        public @Unsigned long nmi_total_ts;
        public int nmi_count;
        public int nmi_cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct hwlat_entry")
    @NotUsableInJava
    public static class hwlat_entry
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public @Unsigned long duration;
        public @Unsigned long outer_duration;
        public @Unsigned long nmi_total_ts;
        public runtime.timespec64 timestamp;
        public @Unsigned int nmi_count;
        public @Unsigned int seqnum;
        public @Unsigned int count;
    }
}

