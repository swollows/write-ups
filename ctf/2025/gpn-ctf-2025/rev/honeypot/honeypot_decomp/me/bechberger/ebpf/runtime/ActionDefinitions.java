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
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.SynthDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TracingDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ActionDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int action_result(@Unsigned long pfn, misc.mf_action_page_type type2, misc.mf_result result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long action_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="action_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long action_store(Ptr<runtime.mddev> mddev2, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int action_create(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<action_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void action_data_destroy(Ptr<action_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int action_parse(Ptr<TraceDefinitions.trace_array> tr, String str, Ptr<action_data> data, misc.handler_id handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int action_threshold_ops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int action_threshold_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void action_trace(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TracingDefinitions.tracing_map_elt> elt, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> rbe, Ptr<?> key2, Ptr<action_data> data, Ptr<@Unsigned Long> var_ref_vals) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct action_cache")
    @NotUsableInJava
    public static class action_cache
    extends Struct {
        public @Unsigned long @Size(value=8) [] allow_native;
        public @Unsigned long @Size(value=8) [] allow_compat;
    }

    @Type(noCCodeGeneration=true, cType="struct action_gate_entry")
    @NotUsableInJava
    public static class action_gate_entry
    extends Struct {
        public char gate_state;
        public @Unsigned int interval;
        public int ipv;
        public int maxoctets;
    }

    @Type(noCCodeGeneration=true, cType="struct action_devres")
    @NotUsableInJava
    public static class action_devres
    extends Struct {
        public Ptr<?> data;
        public Ptr<?> action;
    }

    @Type(noCCodeGeneration=true, cType="enum action_t")
    public static enum action_t implements Enum<action_t>,
    TypedEnum<action_t, Integer>
    {
        nmi_act_kdump,
        nmi_act_dump,
        nmi_act_ips,
        nmi_act_kdb,
        nmi_act_kgdb,
        nmi_act_health,
        nmi_act_max;

    }

    @Type(noCCodeGeneration=true, cType="enum action_id")
    public static enum action_id implements Enum<action_id>,
    TypedEnum<action_id, Integer>
    {
        ACTION_SAVE,
        ACTION_TRACE,
        ACTION_SNAPSHOT;

    }

    @Type(noCCodeGeneration=true, cType="struct action_data")
    @NotUsableInJava
    public static class action_data
    extends Struct {
        public misc.handler_id handler;
        public action_id action;
        public String action_name;
        public @OriginalName(value="action_fn_t") Ptr<?> fn;
        public @Unsigned int n_params;
        public String @Size(value=64) [] params;
        public @Unsigned int @Size(value=64) [] var_ref_idx;
        public Ptr<SynthDefinitions.synth_event> synth_event;
        public boolean use_trace_keyword;
        public String synth_event_name;
        @InlineUnion(value=8608)
        public  @InlineUnion(value=8608) MatchDefinitions.match_data_of_anon_member_of_action_data match_data;
        @InlineUnion(value=8608)
        public  @InlineUnion(value=8608) TrackDefinitions.track_data_of_anon_member_of_action_data track_data;
    }
}

