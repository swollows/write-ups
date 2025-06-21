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
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.ProbeDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TraceprobeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int traceprobe_define_arg_fields(Ptr<TraceDefinitions.trace_event_call> event_call, @Unsigned long offset, Ptr<TraceDefinitions.trace_probe> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="traceprobe_expand_dentry_args($arg1, (const u8**)$arg2, $arg3)")
    public static int traceprobe_expand_dentry_args(int argc, Ptr<String> argv, Ptr<String> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8**)traceprobe_expand_meta_args($arg1, (const u8**)$arg2, $arg3, $arg4, $arg5, $arg6))")
    public static Ptr<String> traceprobe_expand_meta_args(int argc, Ptr<String> argv, Ptr<Integer> new_argc, String buf, int bufsize, Ptr<traceprobe_parse_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void traceprobe_finish_parse(Ptr<traceprobe_parse_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void traceprobe_free_probe_arg(Ptr<ProbeDefinitions.probe_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int traceprobe_get_entry_data_size(Ptr<TraceDefinitions.trace_probe> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="traceprobe_parse_event_name((const u8**)$arg1, (const u8**)$arg2, $arg3, $arg4)")
    public static int traceprobe_parse_event_name(Ptr<String> pevent, Ptr<String> pgroup, String buf, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="traceprobe_parse_probe_arg($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int traceprobe_parse_probe_arg(Ptr<TraceDefinitions.trace_probe> tp, int i, String arg2, Ptr<traceprobe_parse_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="traceprobe_parse_probe_arg_body((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int traceprobe_parse_probe_arg_body(String argv, Ptr<@OriginalName(value="ssize_t") Long> size, Ptr<ProbeDefinitions.probe_arg> parg, Ptr<traceprobe_parse_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int traceprobe_set_print_fmt(Ptr<TraceDefinitions.trace_probe> tp, ProbeDefinitions.probe_print_type ptype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int traceprobe_split_symbol_offset(String symbol, Ptr<Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int traceprobe_update_arg(Ptr<ProbeDefinitions.probe_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct traceprobe_parse_context")
    @NotUsableInJava
    public static class traceprobe_parse_context
    extends Struct {
        public Ptr<TraceDefinitions.trace_event_call> event;
        public String funcname;
        public Ptr<BtfDefinitions.btf_type> proto;
        public Ptr<BtfDefinitions.btf_param> params;
        public int nr_params;
        public Ptr<runtime.btf> btf;
        public Ptr<BtfDefinitions.btf_type> last_type;
        public @Unsigned int last_bitoffs;
        public @Unsigned int last_bitsize;
        public Ptr<TraceDefinitions.trace_probe> tp;
        public @Unsigned int flags;
        public int offset;
    }
}

