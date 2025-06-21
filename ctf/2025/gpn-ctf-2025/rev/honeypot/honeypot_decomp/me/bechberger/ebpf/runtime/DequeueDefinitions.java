/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class DequeueDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dequeue_entity(Ptr<misc.cfs_rq> cfs_rq2, Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dequeue_entities(Ptr<runtime.rq> rq2, Ptr<SchedDefinitions.sched_entity> se, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dequeue_entity(Ptr<misc.cfs_rq> cfs_rq2, Ptr<SchedDefinitions.sched_entity> se, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dequeue_task_fair(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> dequeue_hugetlb_folio_nodemask(Ptr<runtime.hstate> h, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int nid, Ptr<misc.nodemask_t> nmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> dequeue_hugetlb_folio_vma(Ptr<runtime.hstate> h, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, int avoid_reserve, long chg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dequeue_signal(Ptr<misc.sigset_t> mask, Ptr<@OriginalName(value="kernel_siginfo_t") KernelDefinitions.kernel_siginfo> info2, Ptr<PidDefinitions.pid_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dequeue_task_stop(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dequeue_task(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dequeue_dl_entity(Ptr<SchedDefinitions.sched_dl_entity> dl_se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dequeue_pushable_dl_task(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dequeue_pushable_task(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dequeue_rt_stack(Ptr<SchedDefinitions.sched_rt_entity> rt_se, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> dequeue_skb(Ptr<runtime.Qdisc> q, Ptr<@OriginalName(value="bool") Boolean> validate, Ptr<Integer> packets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dequeue_stub(Ptr<TaskDefinitions.task_struct> p, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dequeue_task_dl(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dequeue_task_idle(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dequeue_task_rt(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dequeue_task_scx(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p, int deq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }
}

