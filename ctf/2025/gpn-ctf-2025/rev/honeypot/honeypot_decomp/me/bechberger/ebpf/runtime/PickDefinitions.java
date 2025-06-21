/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class PickDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SchedDefinitions.sched_entity> __pick_first_entity(Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SchedDefinitions.sched_entity> __pick_last_entity(Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> __pick_next_task_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SchedDefinitions.sched_entity> __pick_root_entity(Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SchedDefinitions.sched_entity> pick_eevdf(Ptr<misc.cfs_rq> cfs_rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_next_task_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_task_fair(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pick_link($arg1, $arg2, $arg3, $arg4))")
    public static String pick_link(Ptr<runtime.nameidata> nd, Ptr<runtime.path> link2, Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_task_stop(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> __pick_next_task(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_next_task(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> prev, Ptr<RqDefinitions.rq_flags> rf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_next_pushable_dl_task(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_next_pushable_task(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_task_dl(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_task_idle(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_task_rt(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pick_task_scx(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

