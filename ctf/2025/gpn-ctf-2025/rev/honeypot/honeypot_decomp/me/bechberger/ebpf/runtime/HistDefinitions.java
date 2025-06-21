/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ActionDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TracingDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HistDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="HIST_countFast_wksp($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long HIST_countFast_wksp(Ptr<@Unsigned Integer> count, Ptr<@Unsigned Integer> maxSymbolValuePtr, Ptr<?> source, @Unsigned long sourceSize, Ptr<?> workSpace, @Unsigned long workSpaceSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HIST_count_parallel_wksp($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, (const unsigned int*)$arg6)")
    public static @Unsigned long HIST_count_parallel_wksp(Ptr<@Unsigned Integer> count, Ptr<@Unsigned Integer> maxSymbolValuePtr, Ptr<?> source, @Unsigned long sourceSize, HIST_checkInput_e check, Ptr<@Unsigned Integer> workSpace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HIST_count_simple($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static @Unsigned int HIST_count_simple(Ptr<@Unsigned Integer> count, Ptr<@Unsigned Integer> maxSymbolValuePtr, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HIST_count_wksp($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long HIST_count_wksp(Ptr<@Unsigned Integer> count, Ptr<@Unsigned Integer> maxSymbolValuePtr, Ptr<?> source, @Unsigned long sourceSize, Ptr<?> workSpace, @Unsigned long workSpaceSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int HIST_isError(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_elt_data_free(Ptr<hist_elt_data> elt_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_enable_count_trigger(Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_trigger_ops> hist_enable_get_trigger_ops(String cmd, String param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_enable_trigger(Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_enable_unreg_all(Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_err(Ptr<TraceDefinitions.trace_array> tr, char err_type, @Unsigned short err_pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)hist_field_name($arg1, $arg2))")
    public static String hist_field_name(Ptr<hist_field> field, @Unsigned int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_field_print(Ptr<SeqDefinitions.seq_file> m, Ptr<hist_field> hist_field2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hist_fn_call(Ptr<hist_field> hist_field2, Ptr<TracingDefinitions.tracing_map_elt> elt, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<RingDefinitions.ring_buffer_event> rbe, Ptr<?> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hist_register_trigger(String glob, Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hist_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hist_trigger_elt_data_alloc(Ptr<TracingDefinitions.tracing_map_elt> elt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_trigger_elt_data_free(Ptr<TracingDefinitions.tracing_map_elt> elt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_trigger_elt_data_init(Ptr<TracingDefinitions.tracing_map_elt> elt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_trigger_elt_update(Ptr<hist_trigger_data> hist_data, Ptr<TracingDefinitions.tracing_map_elt> elt, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> rbe, Ptr<@Unsigned Long> var_ref_vals) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hist_trigger_match(Ptr<EventDefinitions.event_trigger_data> data, Ptr<EventDefinitions.event_trigger_data> data_test, Ptr<EventDefinitions.event_trigger_data> named_data, boolean ignore_filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_trigger_print_key(Ptr<SeqDefinitions.seq_file> m, Ptr<hist_trigger_data> hist_data, Ptr<?> key2, Ptr<TracingDefinitions.tracing_map_elt> elt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_unreg_all(Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hist_unregister_trigger(String glob, Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum HIST_checkInput_e")
    public static enum HIST_checkInput_e implements Enum<HIST_checkInput_e>,
    TypedEnum<HIST_checkInput_e, Integer>
    {
        trustInput,
        checkMaxSymbolValue;

    }

    @Type(noCCodeGeneration=true, cType="struct hist_val_stat")
    @NotUsableInJava
    public static class hist_val_stat
    extends Struct {
        public @Unsigned long max;
        public @Unsigned long total;
    }

    @Type(noCCodeGeneration=true, cType="struct hist_var_data")
    @NotUsableInJava
    public static class hist_var_data
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<hist_trigger_data> hist_data;
    }

    @Type(noCCodeGeneration=true, cType="struct hist_elt_data")
    @NotUsableInJava
    public static class hist_elt_data
    extends Struct {
        public String comm;
        public Ptr<@Unsigned Long> var_ref_vals;
        public Ptr<String> field_var_str;
        public int n_field_var_str;
    }

    @Type(noCCodeGeneration=true, cType="struct hist_trigger_attrs")
    @NotUsableInJava
    public static class hist_trigger_attrs
    extends Struct {
        public String keys_str;
        public String vals_str;
        public String sort_key_str;
        public String name;
        public String clock;
        public boolean pause;
        public boolean cont;
        public boolean clear;
        public boolean ts_in_usecs;
        public boolean no_hitcount;
        public @Unsigned int map_bits;
        public String @Size(value=16) [] assignment_str;
        public @Unsigned int n_assignments;
        public String @Size(value=8) [] action_str;
        public @Unsigned int n_actions;
        public misc.var_defs var_defs;
    }

    @Type(noCCodeGeneration=true, cType="enum hist_field_flags")
    public static enum hist_field_flags implements Enum<hist_field_flags>,
    TypedEnum<hist_field_flags, Integer>
    {
        HIST_FIELD_FL_HITCOUNT,
        HIST_FIELD_FL_KEY,
        HIST_FIELD_FL_STRING,
        HIST_FIELD_FL_HEX,
        HIST_FIELD_FL_SYM,
        HIST_FIELD_FL_SYM_OFFSET,
        HIST_FIELD_FL_EXECNAME,
        HIST_FIELD_FL_SYSCALL,
        HIST_FIELD_FL_STACKTRACE,
        HIST_FIELD_FL_LOG2,
        HIST_FIELD_FL_TIMESTAMP,
        HIST_FIELD_FL_TIMESTAMP_USECS,
        HIST_FIELD_FL_VAR,
        HIST_FIELD_FL_EXPR,
        HIST_FIELD_FL_VAR_REF,
        HIST_FIELD_FL_CPU,
        HIST_FIELD_FL_ALIAS,
        HIST_FIELD_FL_BUCKET,
        HIST_FIELD_FL_CONST,
        HIST_FIELD_FL_PERCENT,
        HIST_FIELD_FL_GRAPH;

    }

    @Type(noCCodeGeneration=true, cType="struct hist_trigger_data")
    @NotUsableInJava
    public static class hist_trigger_data
    extends Struct {
        public Ptr<hist_field> @Size(value=22) [] fields;
        public @Unsigned int n_vals;
        public @Unsigned int n_keys;
        public @Unsigned int n_fields;
        public @Unsigned int n_vars;
        public @Unsigned int n_var_str;
        public @Unsigned int key_size;
        public TracingDefinitions.tracing_map_sort_key @Size(value=2) [] sort_keys;
        public @Unsigned int n_sort_keys;
        public Ptr<TraceDefinitions.trace_event_file> event_file;
        public Ptr<hist_trigger_attrs> attrs;
        public Ptr<TracingDefinitions.tracing_map> map;
        public boolean enable_timestamps;
        public boolean remove;
        public Ptr<hist_field> @Size(value=16) [] var_refs;
        public @Unsigned int n_var_refs;
        public Ptr<ActionDefinitions.action_data> @Size(value=8) [] actions;
        public @Unsigned int n_actions;
        public Ptr<misc.field_var> @Size(value=64) [] field_vars;
        public @Unsigned int n_field_vars;
        public @Unsigned int n_field_var_str;
        public Ptr<misc.field_var_hist> @Size(value=64) [] field_var_hists;
        public @Unsigned int n_field_var_hists;
        public Ptr<misc.field_var> @Size(value=64) [] save_vars;
        public @Unsigned int n_save_vars;
        public @Unsigned int n_save_var_str;
    }

    @Type(noCCodeGeneration=true, cType="struct hist_var")
    @NotUsableInJava
    public static class hist_var
    extends Struct {
        public String name;
        public Ptr<hist_trigger_data> hist_data;
        public @Unsigned int idx;
    }

    @Type(noCCodeGeneration=true, cType="enum hist_field_fn")
    public static enum hist_field_fn implements Enum<hist_field_fn>,
    TypedEnum<hist_field_fn, Integer>
    {
        HIST_FIELD_FN_NOP,
        HIST_FIELD_FN_VAR_REF,
        HIST_FIELD_FN_COUNTER,
        HIST_FIELD_FN_CONST,
        HIST_FIELD_FN_LOG2,
        HIST_FIELD_FN_BUCKET,
        HIST_FIELD_FN_TIMESTAMP,
        HIST_FIELD_FN_CPU,
        HIST_FIELD_FN_STRING,
        HIST_FIELD_FN_DYNSTRING,
        HIST_FIELD_FN_RELDYNSTRING,
        HIST_FIELD_FN_PSTRING,
        HIST_FIELD_FN_S64,
        HIST_FIELD_FN_U64,
        HIST_FIELD_FN_S32,
        HIST_FIELD_FN_U32,
        HIST_FIELD_FN_S16,
        HIST_FIELD_FN_U16,
        HIST_FIELD_FN_S8,
        HIST_FIELD_FN_U8,
        HIST_FIELD_FN_UMINUS,
        HIST_FIELD_FN_MINUS,
        HIST_FIELD_FN_PLUS,
        HIST_FIELD_FN_DIV,
        HIST_FIELD_FN_MULT,
        HIST_FIELD_FN_DIV_POWER2,
        HIST_FIELD_FN_DIV_NOT_POWER2,
        HIST_FIELD_FN_DIV_MULT_SHIFT,
        HIST_FIELD_FN_EXECNAME,
        HIST_FIELD_FN_STACK;

    }

    @Type(noCCodeGeneration=true, cType="struct hist_field")
    @NotUsableInJava
    public static class hist_field
    extends Struct {
        public Ptr<FtraceDefinitions.ftrace_event_field> field;
        public @Unsigned long flags;
        public @Unsigned long buckets;
        public String type;
        public Ptr<hist_field> @Size(value=2) [] operands;
        public Ptr<hist_trigger_data> hist_data;
        public hist_field_fn fn_num;
        public @Unsigned int ref;
        public @Unsigned int size;
        public @Unsigned int offset;
        public @Unsigned int is_signed;
        public hist_var var;
        public misc.field_op_id operator;
        public String system;
        public String event_name;
        public String name;
        public @Unsigned int var_ref_idx;
        public boolean read_once;
        public @Unsigned int var_str_idx;
        public @Unsigned long constant;
        public @Unsigned long div_multiplier;
    }
}

