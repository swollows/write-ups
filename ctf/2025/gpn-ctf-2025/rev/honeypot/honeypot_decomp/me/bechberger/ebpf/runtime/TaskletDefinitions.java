/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TaskletDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tasklet_schedule(Ptr<tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tasklet_hi_schedule(Ptr<tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tasklet_schedule(Ptr<tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tasklet_schedule_common(Ptr<tasklet_struct> t, Ptr<tasklet_head> headp, @Unsigned int softirq_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tasklet_action() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tasklet_action_common(Ptr<tasklet_head> tl_head, @Unsigned int softirq_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tasklet_clear_sched(Ptr<tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tasklet_hi_action() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tasklet_init($arg1, (void (*)(long unsigned int))$arg2, $arg3)")
    public static void tasklet_init(Ptr<tasklet_struct> t, Ptr<?> func, @Unsigned long data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tasklet_kill(Ptr<tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tasklet_setup($arg1, (void (*)(struct tasklet_struct*))$arg2)")
    public static void tasklet_setup(Ptr<tasklet_struct> t, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tasklet_unlock(Ptr<tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tasklet_unlock_spin_wait(Ptr<tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tasklet_unlock_wait(Ptr<tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tasklet_head")
    @NotUsableInJava
    public static class tasklet_head
    extends Struct {
        public Ptr<tasklet_struct> head;
        public Ptr<Ptr<tasklet_struct>> tail;
    }

    @Type(noCCodeGeneration=true, cType="struct tasklet_struct")
    @NotUsableInJava
    public static class tasklet_struct
    extends Struct {
        public Ptr<tasklet_struct> next;
        public @Unsigned long state;
        public AtomicDefinitions.atomic_t count;
        public boolean use_callback;
        @InlineUnion(value=6236)
        public @InlineUnion(value=6236) Ptr<?> func;
        @InlineUnion(value=6236)
        public @InlineUnion(value=6236) Ptr<?> callback;
        public @Unsigned long data;
    }
}

