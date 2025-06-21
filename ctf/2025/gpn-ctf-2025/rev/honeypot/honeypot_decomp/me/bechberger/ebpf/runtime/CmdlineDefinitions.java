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
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CmdlineDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cmdline_has_extra_options() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmdline_parse_core(String p, Ptr<@Unsigned Long> core, Ptr<@Unsigned Long> percent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmdline_parse_kernelcore(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmdline_parse_movablecore(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmdline_partition(Ptr<misc.parsed_partitions> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmdline_parts_setup(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmdline_find_option((const u8*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int cmdline_find_option(String cmdline, String option, String buffer, int bufsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmdline_find_option_bool((const u8*)$arg1, (const u8*)$arg2)")
    public static int cmdline_find_option_bool(String cmdline, String option) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmdline_parse_movable_node(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmdline_parse_stack_guard_gap(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmdline_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cmdline_parts")
    @NotUsableInJava
    public static class cmdline_parts
    extends Struct {
        public char @Size(value=32) [] name;
        public @Unsigned int nr_subparts;
        public Ptr<cmdline_subpart> subpart;
        public Ptr<cmdline_parts> next_parts;
    }

    @Type(noCCodeGeneration=true, cType="struct cmdline_subpart")
    @NotUsableInJava
    public static class cmdline_subpart
    extends Struct {
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="sector_t") long from;
        public @Unsigned @OriginalName(value="sector_t") long size;
        public int flags;
        public Ptr<cmdline_subpart> next_subpart;
    }
}

