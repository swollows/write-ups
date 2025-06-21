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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class StopDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_kthread(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_nmi() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stop_on_next(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_per_cpu_kthreads() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_sync_thread(Ptr<runtime.mddev> mddev2, boolean locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_this_handle(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stop_trace_on_warning(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __stop_tx_rs485(Ptr<runtime.uart_8250_port> p, @Unsigned long stop_delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_object(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __stop_tty(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_self(Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_this_cpu(Ptr<?> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_tty(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stop_core_cpuslocked(@Unsigned int cpu2, @OriginalName(value="cpu_stop_fn_t") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stop_machine($arg1, $arg2, (const struct cpumask*)$arg3)")
    public static int stop_machine(@OriginalName(value="cpu_stop_fn_t") Ptr<?> fn, Ptr<?> data, Ptr<runtime.cpumask> cpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stop_machine_cpuslocked($arg1, $arg2, (const struct cpumask*)$arg3)")
    public static int stop_machine_cpuslocked(@OriginalName(value="cpu_stop_fn_t") Ptr<?> fn, Ptr<?> data, Ptr<runtime.cpumask> cpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stop_machine_from_inactive_cpu($arg1, $arg2, (const struct cpumask*)$arg3)")
    public static int stop_machine_from_inactive_cpu(@OriginalName(value="cpu_stop_fn_t") Ptr<?> fn, Ptr<?> data, Ptr<runtime.cpumask> cpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_machine_park(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stop_machine_unpark(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stop_machine_yield((const struct cpumask*)$arg1)")
    public static void stop_machine_yield(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stop_one_cpu(@Unsigned int cpu2, @OriginalName(value="cpu_stop_fn_t") Ptr<?> fn, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean stop_one_cpu_nowait(@Unsigned int cpu2, @OriginalName(value="cpu_stop_fn_t") Ptr<?> fn, Ptr<?> arg2, Ptr<CpuDefinitions.cpu_stop_work> work_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stop_two_cpus(@Unsigned int cpu1, @Unsigned int cpu2, @OriginalName(value="cpu_stop_fn_t") Ptr<?> fn, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct stop_event_data")
    @NotUsableInJava
    public static class stop_event_data
    extends Struct {
        public Ptr<PerfDefinitions.perf_event> event;
        public @Unsigned int restart;
    }
}

