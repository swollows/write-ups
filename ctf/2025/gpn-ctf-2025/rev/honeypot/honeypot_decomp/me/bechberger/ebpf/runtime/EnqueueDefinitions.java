/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class EnqueueDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __enqueue_entity(Ptr<misc.cfs_rq> cfs_rq2, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_entity(Ptr<misc.cfs_rq> cfs_rq2, Ptr<SchedDefinitions.sched_entity> se, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_task_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_hugetlb_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_task_stop(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_timer(Ptr<TimerDefinitions.timer_base> base, Ptr<TimerDefinitions.timer_list> timer, @Unsigned int idx, @Unsigned long bucket_expiry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int enqueue_hrtimer(Ptr<runtime.hrtimer> timer, Ptr<HrtimerDefinitions.hrtimer_clock_base> base, HrtimerDefinitions.hrtimer_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_task(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int enqueue_to_backlog(Ptr<SkDefinitions.sk_buff> skb, int cpu2, Ptr<@Unsigned Integer> qtail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_dl_entity(Ptr<SchedDefinitions.sched_dl_entity> dl_se, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_pushable_dl_task(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_pushable_task(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_stub(Ptr<TaskDefinitions.task_struct> p, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_task_dl(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_task_rt(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void enqueue_task_scx(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }
}

