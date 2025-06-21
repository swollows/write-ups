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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DynDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dyn_event_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dyn_event_register(Ptr<dyn_event_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dyn_event_release((const u8*)$arg1, $arg2)")
    public static int dyn_event_release(String raw_command, Ptr<dyn_event_operations> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dyn_event_seq_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dyn_event_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dyn_event_seq_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dyn_event_seq_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dyn_event_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dyn_event_write(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dyn_events_release_all(Ptr<dyn_event_operations> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dyn_ftrace")
    @NotUsableInJava
    public static class dyn_ftrace
    extends Struct {
        public @Unsigned long ip;
        public @Unsigned long flags;
        public dyn_arch_ftrace arch;
    }

    @Type(noCCodeGeneration=true, cType="struct dyn_arch_ftrace")
    @NotUsableInJava
    public static class dyn_arch_ftrace
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct dyn_event")
    @NotUsableInJava
    public static class dyn_event
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<dyn_event_operations> ops;
    }

    @Type(noCCodeGeneration=true, cType="struct dyn_event_operations")
    @NotUsableInJava
    public static class dyn_event_operations
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> create;
        public Ptr<?> show;
        public Ptr<?> is_busy;
        public Ptr<?> free;
        public Ptr<?> match;
    }
}

