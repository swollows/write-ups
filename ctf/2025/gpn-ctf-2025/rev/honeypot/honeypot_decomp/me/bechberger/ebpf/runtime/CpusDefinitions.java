/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class CpusDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpus_read_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpus_read_trylock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpus_read_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpus_write_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpus_write_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpus_ctrl_write(Ptr<runtime.rdtgroup> rdtgrp, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> newmask, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> tmpmask, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> tmpmask1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpus_mon_write(Ptr<runtime.rdtgroup> rdtgrp, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> newmask, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> tmpmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpus_equal_capacity(int this_cpu, int that_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpus_share_cache(int this_cpu, int that_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpus_share_resources(int this_cpu, int that_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpus_dont_share(int cpu0, int cpu1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpus_share_numa(int cpu0, int cpu1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpus_share_smt(int cpu0, int cpu1) {
        throw new MethodIsBPFRelatedFunction();
    }
}

