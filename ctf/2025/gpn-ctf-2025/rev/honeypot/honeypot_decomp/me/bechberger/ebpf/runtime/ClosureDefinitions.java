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
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ClosureDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __closure_sync(Ptr<closure> cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __closure_sync_timeout(Ptr<closure> cl, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __closure_wake_up(Ptr<closure_waitlist> wait_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void closure_put(Ptr<closure> cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void closure_return_sync(Ptr<closure> cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void closure_sub(Ptr<closure> cl, int v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void closure_sync_fn(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean closure_wait(Ptr<closure_waitlist> waitlist, Ptr<closure> cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct closure")
    @NotUsableInJava
    public static class closure
    extends Struct {
        @InlineUnion(value=93540)
        public  @InlineUnion(value=93540) AnonDefinitions.anon_member_of_anon_member_of_closure anon0$0;
        @InlineUnion(value=93540)
        public @InlineUnion(value=93540) misc.work_struct work;
        public Ptr<closure> parent;
        public AtomicDefinitions.atomic_t remaining;
        public boolean closure_get_happened;
    }

    @Type(noCCodeGeneration=true, cType="struct closure_syncer")
    @NotUsableInJava
    public static class closure_syncer
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
        public int done;
    }

    @Type(noCCodeGeneration=true, cType="enum closure_state")
    public static enum closure_state implements Enum<closure_state>,
    TypedEnum<closure_state, Integer>
    {
        CLOSURE_BITS_START,
        CLOSURE_DESTRUCTOR,
        CLOSURE_WAITING,
        CLOSURE_RUNNING;

    }

    @Type(noCCodeGeneration=true, cType="struct closure_waitlist")
    @NotUsableInJava
    public static class closure_waitlist
    extends Struct {
        public misc.llist_head list;
    }
}

