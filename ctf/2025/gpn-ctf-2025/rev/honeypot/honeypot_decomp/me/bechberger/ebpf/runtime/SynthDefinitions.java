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
import me.bechberger.ebpf.runtime.DynDefinitions;
import me.bechberger.ebpf.runtime.DyneventDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SynthDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__synth_event_add_val((const u8*)$arg1, $arg2, $arg3)")
    public static int __synth_event_add_val(String field_name, @Unsigned long val, Ptr<synth_event_trace_state> trace_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__synth_event_gen_cmd_start($arg1, (const u8*)$arg2, $arg3, $arg4_)")
    public static int __synth_event_gen_cmd_start(Ptr<DyneventDefinitions.dynevent_cmd> cmd, String name, Ptr<runtime.module> mod, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __synth_event_show(Ptr<SeqDefinitions.seq_file> m, Ptr<synth_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="synth_event_add_field($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int synth_event_add_field(Ptr<DyneventDefinitions.dynevent_cmd> cmd, String type2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="synth_event_add_field_str($arg1, (const u8*)$arg2)")
    public static int synth_event_add_field_str(Ptr<DyneventDefinitions.dynevent_cmd> cmd, String type_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_add_fields(Ptr<DyneventDefinitions.dynevent_cmd> cmd, Ptr<synth_field_desc> fields, @Unsigned int n_fields) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_add_next_val(@Unsigned long val, Ptr<synth_event_trace_state> trace_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="synth_event_add_val((const u8*)$arg1, $arg2, $arg3)")
    public static int synth_event_add_val(String field_name, @Unsigned long val, Ptr<synth_event_trace_state> trace_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_check_arg_fn(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void synth_event_cmd_init(Ptr<DyneventDefinitions.dynevent_cmd> cmd, String buf, int maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="synth_event_create((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int synth_event_create(String name, Ptr<synth_field_desc> fields, @Unsigned int n_fields, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_define_fields(Ptr<TraceDefinitions.trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="synth_event_delete((const u8*)$arg1)")
    public static int synth_event_delete(String event_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="synth_event_gen_cmd_array_start($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int synth_event_gen_cmd_array_start(Ptr<DyneventDefinitions.dynevent_cmd> cmd, String name, Ptr<runtime.module> mod, Ptr<synth_field_desc> fields, @Unsigned int n_fields) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean synth_event_is_busy(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="synth_event_match((const u8*)$arg1, (const u8*)$arg2, $arg3, (const u8**)$arg4, $arg5)")
    public static boolean synth_event_match(String system, String event2, int argc, Ptr<String> argv, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_release(Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_run_command(Ptr<DyneventDefinitions.dynevent_cmd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_show(Ptr<SeqDefinitions.seq_file> m, Ptr<DynDefinitions.dyn_event> ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_trace(Ptr<TraceDefinitions.trace_event_file> file2, @Unsigned int n_vals, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_trace_array(Ptr<TraceDefinitions.trace_event_file> file2, Ptr<@Unsigned Long> vals, @Unsigned int n_vals) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_trace_end(Ptr<synth_event_trace_state> trace_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_event_trace_start(Ptr<TraceDefinitions.trace_event_file> file2, Ptr<synth_event_trace_state> trace_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_events_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_events_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="synth_events_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long synth_events_write(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)synth_field_fmt($arg1))")
    public static String synth_field_fmt(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_field_size(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int synth_field_string_size(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct synth_trace_event")
    @NotUsableInJava
    public static class synth_trace_event
    extends Struct {
        public TraceDefinitions.trace_entry ent;
        public TraceDefinitions.trace_synth_field @Size(value=0) [] fields;
    }

    @Type(noCCodeGeneration=true, cType="struct synth_event_trace_state")
    @NotUsableInJava
    public static class synth_event_trace_state
    extends Struct {
        public TraceDefinitions.trace_event_buffer fbuffer;
        public Ptr<synth_trace_event> entry;
        public Ptr<TraceDefinitions.trace_buffer> buffer;
        public Ptr<synth_event> event;
        public @Unsigned int cur_field;
        public @Unsigned int n_u64;
        public boolean disabled;
        public boolean add_next;
        public boolean add_name;
    }

    @Type(noCCodeGeneration=true, cType="struct synth_field_desc")
    @NotUsableInJava
    public static class synth_field_desc
    extends Struct {
        public String type;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct synth_field")
    @NotUsableInJava
    public static class synth_field
    extends Struct {
        public String type;
        public String name;
        public @Unsigned long size;
        public @Unsigned int offset;
        public @Unsigned int field_pos;
        public boolean is_signed;
        public boolean is_string;
        public boolean is_dynamic;
        public boolean is_stack;
    }

    @Type(noCCodeGeneration=true, cType="struct synth_event")
    @NotUsableInJava
    public static class synth_event
    extends Struct {
        public DynDefinitions.dyn_event devent;
        public int ref;
        public String name;
        public Ptr<Ptr<synth_field>> fields;
        public @Unsigned int n_fields;
        public Ptr<Ptr<synth_field>> dynamic_fields;
        public @Unsigned int n_dynamic_fields;
        public @Unsigned int n_u64;
        public TraceDefinitions.trace_event_class _class;
        public TraceDefinitions.trace_event_call call;
        public Ptr<runtime.tracepoint> tp;
        public Ptr<runtime.module> mod;
    }
}

