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
import me.bechberger.ebpf.runtime.DynDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.ThreadDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TestDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="test_bit_le($arg1, (const void*)$arg2)")
    public static int test_bit_le(int nr, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int test_taint(@Unsigned int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int test_ti_thread_flag(Ptr<ThreadDefinitions.thread_info> ti, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int test_for_valid_rec(Ptr<DynDefinitions.dyn_ftrace> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean test_and_clear_cpu_idle(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean test_aperfmperf(int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int test_bdev_super(Ptr<SuperDefinitions.super_block> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void test_event_printk(Ptr<TraceDefinitions.trace_event_call> call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean test_intel(int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean test_irperf(int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int test_keyed_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int test_pages_isolated(@Unsigned long start_pfn, @Unsigned long end_pfn, int isol_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean test_ptsc(int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int test_single_super(Ptr<SuperDefinitions.super_block> s2, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean test_therm_status(int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="test_write_file($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long test_write_file(Ptr<PciDefinitions.pci_slot> pci_slot2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int prog_fd; unsigned int retval; unsigned int data_size_in; unsigned int data_size_out; long long unsigned int data_in; long long unsigned int data_out; unsigned int repeat; unsigned int duration; unsigned int ctx_size_in; unsigned int ctx_size_out; long long unsigned int ctx_in; long long unsigned int ctx_out; unsigned int flags; unsigned int cpu; unsigned int batch_size; }")
    @NotUsableInJava
    public static class test_of_bpf_attr
    extends Struct {
        public @Unsigned int prog_fd;
        public @Unsigned int retval;
        public @Unsigned int data_size_in;
        public @Unsigned int data_size_out;
        public @Unsigned long data_in;
        public @Unsigned long data_out;
        public @Unsigned int repeat;
        public @Unsigned int duration;
        public @Unsigned int ctx_size_in;
        public @Unsigned int ctx_size_out;
        public @Unsigned long ctx_in;
        public @Unsigned long ctx_out;
        public @Unsigned int flags;
        public @Unsigned int cpu;
        public @Unsigned int batch_size;
    }
}

