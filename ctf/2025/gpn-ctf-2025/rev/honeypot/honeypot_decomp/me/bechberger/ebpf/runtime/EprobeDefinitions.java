/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DynDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EprobeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __eprobe_trace_func(Ptr<eprobe_data> edata, Ptr<?> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eprobe_dyn_event_create((const u8*)$arg1)")
    public static int eprobe_dyn_event_create(String raw_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean eprobe_dyn_event_is_busy(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eprobe_dyn_event_match((const u8*)$arg1, (const u8*)$arg2, $arg3, (const u8**)$arg4, $arg5)")
    public static boolean eprobe_dyn_event_match(String system, String event2, int argc, Ptr<String> argv, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eprobe_dyn_event_release(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eprobe_dyn_event_show(Ptr<SeqDefinitions.seq_file> m, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eprobe_event_define_fields(Ptr<TraceDefinitions.trace_event_call> event_call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eprobe_register(Ptr<TraceDefinitions.trace_event_call> event2, TraceDefinitions.trace_reg type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eprobe_trigger_cmd_parse(Ptr<EventDefinitions.event_command> cmd_ops, Ptr<TraceDefinitions.trace_event_file> file2, String glob, String cmd, String param_and_filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eprobe_trigger_free(Ptr<EventDefinitions.event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eprobe_trigger_func(Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> rbe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_trigger_ops> eprobe_trigger_get_ops(String cmd, String param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eprobe_trigger_init(Ptr<EventDefinitions.event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eprobe_trigger_print(Ptr<SeqDefinitions.seq_file> m, Ptr<EventDefinitions.event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eprobe_trigger_reg_func(String glob, Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eprobe_trigger_unreg_func(String glob, Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct eprobe_data")
    @NotUsableInJava
    public static class eprobe_data
    extends Struct {
        public Ptr<TraceDefinitions.trace_event_file> file;
        public Ptr<TraceDefinitions.trace_eprobe> ep;
    }

    @Type(noCCodeGeneration=true, cType="struct eprobe_trace_entry_head")
    @NotUsableInJava
    public static class eprobe_trace_entry_head
    extends Struct {
        public TraceDefinitions.trace_entry ent;
    }
}

