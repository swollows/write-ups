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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TpmDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ProbeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int probe_iommu_group(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void probe_sched_switch(Ptr<?> ignore, boolean preempt, Ptr<TaskDefinitions.task_struct> prev, Ptr<TaskDefinitions.task_struct> next, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void probe_sched_wakeup(Ptr<?> ignore, Ptr<TaskDefinitions.task_struct> wakee) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __probe_event_disable(Ptr<TraceDefinitions.trace_probe> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void probe_event_disable(Ptr<TraceDefinitions.trace_event_call> call, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int probe_event_enable(Ptr<TraceDefinitions.trace_event_call> call, Ptr<TraceDefinitions.trace_event_file> file2, @OriginalName(value="filter_func_t") Ptr<?> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void probe_page_size_mask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void probe_wakeup(Ptr<?> ignore, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void probe_wakeup_migrate_task(Ptr<?> ignore, Ptr<TaskDefinitions.task_struct> task2, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int probe_irq_mask(@Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int probe_irq_off(@Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long probe_irq_on() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int probe_itpm(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int probe_setup_port(Ptr<fintek_8250> pdata, Ptr<runtime.uart_8250_port> uart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void probe_roms() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="probe_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long probe_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fintek_8250")
    @NotUsableInJava
    public static class fintek_8250
    extends Struct {
        public @Unsigned short pid;
        public @Unsigned short base_port;
        public char index;
        public char key;
    }

    @Type(noCCodeGeneration=true, cType="enum probe_print_type")
    public static enum probe_print_type implements Enum<probe_print_type>,
    TypedEnum<probe_print_type, Integer>
    {
        PROBE_PRINT_NORMAL,
        PROBE_PRINT_RETURN,
        PROBE_PRINT_EVENT;

    }

    @Type(noCCodeGeneration=true, cType="struct probe_entry_arg")
    @NotUsableInJava
    public static class probe_entry_arg
    extends Struct {
        public Ptr<misc.fetch_insn> code;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct probe_arg")
    @NotUsableInJava
    public static class probe_arg
    extends Struct {
        public Ptr<misc.fetch_insn> code;
        public boolean dynamic;
        public @Unsigned int offset;
        public @Unsigned int count;
        public String name;
        public String comm;
        public String fmt;
        public Ptr<misc.fetch_type> type;
    }

    @Type(noCCodeGeneration=true, cType="enum probe_type")
    public static enum probe_type implements Enum<probe_type>,
    TypedEnum<probe_type, Integer>
    {
        PROBE_DEFAULT_STRATEGY,
        PROBE_PREFER_ASYNCHRONOUS,
        PROBE_FORCE_SYNCHRONOUS;

    }
}

