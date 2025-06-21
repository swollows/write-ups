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
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BalanceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_pgdat(Ptr<@OriginalName(value="pg_data_t") misc.pglist_data> pgdat, int order, int highest_zoneidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_stop(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __balance_push_cpu_stop(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balance_callbacks(Ptr<runtime.rq> rq2, Ptr<balance_callback> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_dirty_pages(Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long pages_dirtied, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balance_dirty_pages_ratelimited(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_dirty_pages_ratelimited_flags(Ptr<misc.address_space> mapping, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balance_push(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balance_push_set(int cpu2, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balance_wb_limits(Ptr<misc.dirty_throttle_control> dtc, boolean strictlimit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_dl(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_idle(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_one(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_rt(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balance_scx(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct balance_callback")
    @NotUsableInJava
    public static class balance_callback
    extends Struct {
        public Ptr<balance_callback> next;
        public Ptr<?> func;
    }
}

