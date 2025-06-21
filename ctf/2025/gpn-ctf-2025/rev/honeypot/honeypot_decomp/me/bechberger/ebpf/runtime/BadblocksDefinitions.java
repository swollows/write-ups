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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BadblocksDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _badblocks_check(Ptr<runtime.badblocks> bb, @Unsigned @OriginalName(value="sector_t") long s2, int sectors, Ptr<@Unsigned @OriginalName(value="sector_t") Long> first_bad, Ptr<Integer> bad_sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _badblocks_clear(Ptr<runtime.badblocks> bb, @Unsigned @OriginalName(value="sector_t") long s2, int sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _badblocks_set(Ptr<runtime.badblocks> bb, @Unsigned @OriginalName(value="sector_t") long s2, int sectors, int acknowledged) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int badblocks_check(Ptr<runtime.badblocks> bb, @Unsigned @OriginalName(value="sector_t") long s2, int sectors, Ptr<@Unsigned @OriginalName(value="sector_t") Long> first_bad, Ptr<Integer> bad_sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int badblocks_clear(Ptr<runtime.badblocks> bb, @Unsigned @OriginalName(value="sector_t") long s2, int sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void badblocks_exit(Ptr<runtime.badblocks> bb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int badblocks_init(Ptr<runtime.badblocks> bb, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int badblocks_set(Ptr<runtime.badblocks> bb, @Unsigned @OriginalName(value="sector_t") long s2, int sectors, int acknowledged) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long badblocks_show(Ptr<runtime.badblocks> bb, String page2, int unack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="badblocks_store($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long badblocks_store(Ptr<runtime.badblocks> bb, String page2, @Unsigned long len, int unack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct badblocks_context")
    @NotUsableInJava
    public static class badblocks_context
    extends Struct {
        public @Unsigned @OriginalName(value="sector_t") long start;
        public @Unsigned @OriginalName(value="sector_t") long len;
        public int ack;
    }
}

