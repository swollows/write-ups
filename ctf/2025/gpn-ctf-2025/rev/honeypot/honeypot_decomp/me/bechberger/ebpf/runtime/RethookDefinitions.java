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
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RethookDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __rethook_find_ret_addr(Ptr<TaskDefinitions.task_struct> tsk, Ptr<Ptr<misc.llist_node>> cur) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rethook> rethook_alloc(Ptr<?> data, @OriginalName(value="rethook_handler_t") Ptr<?> handler, int size, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long rethook_find_ret_addr(Ptr<TaskDefinitions.task_struct> tsk, @Unsigned long frame, Ptr<Ptr<misc.llist_node>> cur) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rethook_fini_pool(Ptr<misc.objpool_head> head, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rethook_flush_task(Ptr<TaskDefinitions.task_struct> tk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rethook_free(Ptr<runtime.rethook> rh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rethook_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rethook_hook(Ptr<rethook_node> node2, Ptr<PtDefinitions.pt_regs> regs, boolean mcount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rethook_init_node(Ptr<?> nod, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rethook_recycle(Ptr<rethook_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rethook_stop(Ptr<runtime.rethook> rh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long rethook_trampoline_handler(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<rethook_node> rethook_try_get(Ptr<runtime.rethook> rh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rethook_node")
    @NotUsableInJava
    public static class rethook_node
    extends Struct {
        public misc.callback_head rcu;
        public misc.llist_node llist;
        public Ptr<runtime.rethook> rethook;
        public @Unsigned long ret_addr;
        public @Unsigned long frame;
    }
}

