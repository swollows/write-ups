/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PreemptDefinitions {
    public static final int preempt_dynamic_undefined = -1;
    public static final int preempt_dynamic_none = 0;
    public static final int preempt_dynamic_voluntary = 1;
    public static final int preempt_dynamic_full = 2;

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean preempt_model_full() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean preempt_model_none() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean preempt_model_voluntary() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void preempt_notifier_dec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void preempt_notifier_inc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void preempt_notifier_register(Ptr<preempt_notifier> notifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void preempt_notifier_unregister(Ptr<preempt_notifier> notifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void preempt_schedule() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void preempt_schedule_irq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void preempt_schedule_notrace() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void preempt_schedule_notrace_thunk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void preempt_schedule_thunk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum preempt_dynamic")
    public static enum preempt_dynamic implements Enum<preempt_dynamic>,
    TypedEnum<preempt_dynamic, Integer>
    {
        preempt_dynamic_undefined,
        preempt_dynamic_none,
        preempt_dynamic_voluntary,
        preempt_dynamic_full;

    }

    @Type(noCCodeGeneration=true, cType="struct preempt_notifier")
    @NotUsableInJava
    public static class preempt_notifier
    extends Struct {
        public misc.hlist_node link;
        public Ptr<preempt_ops> ops;
    }

    @Type(noCCodeGeneration=true, cType="struct preempt_ops")
    @NotUsableInJava
    public static class preempt_ops
    extends Struct {
        public Ptr<?> sched_in;
        public Ptr<?> sched_out;
    }
}

