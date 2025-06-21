/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KlistDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_class_dev_get(Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_class_dev_put(Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_children_get(Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_children_put(Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_add_before(Ptr<klist_node> n, Ptr<klist_node> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_add_behind(Ptr<klist_node> n, Ptr<klist_node> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_add_head(Ptr<klist_node> n, Ptr<runtime.klist> k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_add_tail(Ptr<klist_node> n, Ptr<runtime.klist> k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_del(Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_devices_get(Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_devices_put(Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="klist_init($arg1, (void (*)(struct klist_node*))$arg2, (void (*)(struct klist_node*))$arg3)")
    public static void klist_init(Ptr<runtime.klist> k, Ptr<?> get, Ptr<?> put) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_iter_exit(Ptr<klist_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_iter_init(Ptr<runtime.klist> k, Ptr<klist_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_iter_init_node(Ptr<runtime.klist> k, Ptr<klist_iter> i, Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<klist_node> klist_next(Ptr<klist_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klist_node_attached(Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<klist_node> klist_prev(Ptr<klist_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_put(Ptr<klist_node> n, boolean kill) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klist_remove(Ptr<klist_node> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct klist_waiter")
    @NotUsableInJava
    public static class klist_waiter
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<klist_node> node;
        public Ptr<TaskDefinitions.task_struct> process;
        public int woken;
    }

    @Type(noCCodeGeneration=true, cType="struct klist_iter")
    @NotUsableInJava
    public static class klist_iter
    extends Struct {
        public Ptr<runtime.klist> i_klist;
        public Ptr<klist_node> i_cur;
    }

    @Type(noCCodeGeneration=true, cType="struct klist_node")
    @NotUsableInJava
    public static class klist_node
    extends Struct {
        public Ptr<?> n_klist;
        public ListDefinitions.list_head n_node;
        public runtime.kref n_ref;
    }
}

