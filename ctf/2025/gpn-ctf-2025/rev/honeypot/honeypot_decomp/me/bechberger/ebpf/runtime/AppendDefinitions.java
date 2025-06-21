/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BootDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FilterDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class AppendDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="append_printf($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static int append_printf(Ptr<String> bufp, String end, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int append_trace_fprobe(Ptr<TraceDefinitions.trace_fprobe> tf, Ptr<TraceDefinitions.trace_fprobe> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int append_trace_kprobe(Ptr<TraceDefinitions.trace_kprobe> tk, Ptr<TraceDefinitions.trace_kprobe> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __append_e820_table(Ptr<BootDefinitions.boot_e820_entry> entries, @Unsigned int nr_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned @OriginalName(value="Elf64_Word") Integer> append_elf_note(Ptr<@Unsigned @OriginalName(value="Elf64_Word") Integer> buf, String name, @Unsigned int type2, Ptr<?> data, @Unsigned long data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int append_hash(Ptr<Ptr<FtraceDefinitions.ftrace_hash>> hash2, Ptr<FtraceDefinitions.ftrace_hash> new_hash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FtraceDefinitions.ftrace_hash> append_hashes(Ptr<FtraceDefinitions.ftrace_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="append_kcore_note($arg1, $arg2, (const u8*)$arg3, $arg4, (const void*)$arg5, $arg6)")
    public static void append_kcore_note(String notes, Ptr<@Unsigned Long> i, String name, @Unsigned int type2, Ptr<?> desc, @Unsigned long descsz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int append_trace_uprobe(Ptr<TraceDefinitions.trace_uprobe> tu, Ptr<TraceDefinitions.trace_uprobe> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void append_filter_err(Ptr<TraceDefinitions.trace_array> tr, Ptr<FilterDefinitions.filter_parse_error> pe, Ptr<EventDefinitions.event_filter> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="append_ordered_lsm($arg1, (const u8*)$arg2)")
    public static void append_ordered_lsm(Ptr<LsmDefinitions.lsm_info> lsm, String from) {
        throw new MethodIsBPFRelatedFunction();
    }
}

