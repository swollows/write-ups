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
import me.bechberger.ebpf.runtime.AllocDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UserfaultfdDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class WakeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_userfault(Ptr<UserfaultfdDefinitions.userfaultfd_ctx> ctx, Ptr<UserfaultfdDefinitions.userfaultfd_wake_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wake_affine(Ptr<SchedDefinitions.sched_domain> sd, Ptr<TaskDefinitions.task_struct> p, int this_cpu, int prev_cpu, int sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __wake_up(Ptr<WaitDefinitions.wait_queue_head> wq_head, @Unsigned int mode, int nr_exclusive, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_bit(Ptr<WaitDefinitions.wait_queue_head> wq_head, Ptr<?> word, int bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __wake_up_common(Ptr<WaitDefinitions.wait_queue_head> wq_head, @Unsigned int mode, int nr_exclusive, int wake_flags, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_klogd(int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_locked(Ptr<WaitDefinitions.wait_queue_head> wq_head, @Unsigned int mode, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_locked_key(Ptr<WaitDefinitions.wait_queue_head> wq_head, @Unsigned int mode, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_locked_sync_key(Ptr<WaitDefinitions.wait_queue_head> wq_head, @Unsigned int mode, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_on_current_cpu(Ptr<WaitDefinitions.wait_queue_head> wq_head, @Unsigned int mode, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_pollfree(Ptr<WaitDefinitions.wait_queue_head> wq_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_sync(Ptr<WaitDefinitions.wait_queue_head> wq_head, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_sync_key(Ptr<WaitDefinitions.wait_queue_head> wq_head, @Unsigned int mode, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wake_bit_function(Ptr<WaitDefinitions.wait_queue_entry> wq_entry, @Unsigned int mode, int sync2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wake_const_ops(Ptr<misc.sem_array> sma, int semnum, Ptr<wake_q_head> wake_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long wake_lock_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wake_lock_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long wake_lock_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_oom_reaper(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long wake_unlock_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wake_unlock_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long wake_unlock_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_bit(Ptr<?> word, int bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_klogd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_klogd_work_func(Ptr<IrqDefinitions.irq_work> irq_work2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_var(Ptr<?> var) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn wake_waiting(int irq, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wake_up_parent(Ptr<TaskDefinitions.task_struct> p, Ptr<TaskDefinitions.task_struct> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wake_nocb_gp_defer($arg1, $arg2, (const u8*)$arg3)")
    public static void wake_nocb_gp_defer(Ptr<RcuDefinitions.rcu_data> rdp, int waketype, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_q_add(Ptr<wake_q_head> head, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_q_add_safe(Ptr<wake_q_head> head, Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_all_idle_cpus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_if_idle(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_new_task(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_nohz_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wake_up_process(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_q(Ptr<wake_q_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wake_up_state(Ptr<TaskDefinitions.task_struct> p, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="wake_all_kswapds($arg1, $arg2, (const struct alloc_context*)$arg3)")
    public static void wake_all_kswapds(@Unsigned int order, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<AllocDefinitions.alloc_context> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wake_exceptional_entry_func(Ptr<@OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry> wait, @Unsigned int mode, int sync2, Ptr<?> keyp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wake_page_function(Ptr<@OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry> wait, @Unsigned int mode, int sync2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_threads_waitq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wake_up_and_wait_for_irq_thread_ready(Ptr<IrqDefinitions.irq_desc> desc, Ptr<runtime.irqaction> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct wake_irq")
    @NotUsableInJava
    public static class wake_irq
    extends Struct {
        public Ptr<runtime.device> dev;
        public @Unsigned int status;
        public int irq;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct wake_q_head")
    @NotUsableInJava
    public static class wake_q_head
    extends Struct {
        public Ptr<wake_q_node> first;
        public Ptr<Ptr<wake_q_node>> lastp;
    }

    @Type(noCCodeGeneration=true, cType="struct wake_q_node")
    @NotUsableInJava
    public static class wake_q_node
    extends Struct {
        public Ptr<wake_q_node> next;
    }
}

