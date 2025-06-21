/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KallsymsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int kallsyms_expand_symbol(@Unsigned int off, String result, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kallsyms_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)kallsyms_lookup($arg1, $arg2, $arg3, $arg4, $arg5))")
    public static String kallsyms_lookup(@Unsigned long addr2, Ptr<@Unsigned Long> symbolsize, Ptr<@Unsigned Long> offset, Ptr<String> modname, String namebuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kallsyms_lookup_buildid($arg1, $arg2, $arg3, $arg4, (const u8**)$arg5, $arg6)")
    public static int kallsyms_lookup_buildid(@Unsigned long addr2, Ptr<@Unsigned Long> symbolsize, Ptr<@Unsigned Long> offset, Ptr<String> modname, Ptr<String> modbuildid, String namebuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kallsyms_lookup_name((const u8*)$arg1)")
    public static @Unsigned long kallsyms_lookup_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kallsyms_lookup_names((const u8*)$arg1, $arg2, $arg3)")
    public static int kallsyms_lookup_names(String name, Ptr<@Unsigned Integer> start, Ptr<@Unsigned Integer> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kallsyms_lookup_size_offset(@Unsigned long addr2, Ptr<@Unsigned Long> symbolsize, Ptr<@Unsigned Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kallsyms_on_each_match_symbol((int (*)(void*, long unsigned int))$arg1, (const u8*)$arg2, $arg3)")
    public static int kallsyms_on_each_match_symbol(Ptr<?> fn, String name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kallsyms_on_each_symbol((int (*)(void*, const u8*, long unsigned int))$arg1, $arg2)")
    public static int kallsyms_on_each_symbol(Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kallsyms_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kallsyms_sym_address(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kallsyms_symbol_complete(String prefix_name, int max_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kallsyms_symbol_next(String prefix_name, int flag, int buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kallsyms_callback($arg1, (const u8*)$arg2, $arg3)")
    public static int kallsyms_callback(Ptr<?> data, String name, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kallsyms_show_value((const struct cred*)$arg1)")
    public static boolean kallsyms_show_value(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kallsyms_data")
    @NotUsableInJava
    public static class kallsyms_data
    extends Struct {
        public Ptr<@Unsigned Long> addrs;
        public Ptr<String> syms;
        public @Unsigned long cnt;
        public @Unsigned long found;
    }
}

