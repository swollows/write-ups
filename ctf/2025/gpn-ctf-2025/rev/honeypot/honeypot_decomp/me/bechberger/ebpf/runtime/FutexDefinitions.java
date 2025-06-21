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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WakeDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class FutexDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __futex_queue(Ptr<futex_q> q, Ptr<futex_hash_bucket> hb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __futex_unqueue(Ptr<futex_q> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __futex_wait(Ptr<@Unsigned Integer> uaddr, @Unsigned int flags, @Unsigned int val, Ptr<HrtimerDefinitions.hrtimer_sleeper> to, @Unsigned int bitset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __futex_wake_mark(Ptr<futex_q> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_atomic_op_inuser(@Unsigned int encoded_op, Ptr<@Unsigned Integer> uaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void futex_cleanup(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_cmpxchg_value_locked(Ptr<@Unsigned Integer> curval, Ptr<@Unsigned Integer> uaddr, @Unsigned int uval, @Unsigned int newval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void futex_exec_release(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void futex_exit_recursive(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void futex_exit_release(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_get_value_locked(Ptr<@Unsigned Integer> dest, Ptr<@Unsigned Integer> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<futex_hash_bucket> futex_hash(Ptr<futex_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<futex_hash_bucket> futex_q_lock(Ptr<futex_q> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void futex_q_unlock(Ptr<futex_hash_bucket> hb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HrtimerDefinitions.hrtimer_sleeper> futex_setup_timer(Ptr<@OriginalName(value="ktime_t") Long> time, Ptr<HrtimerDefinitions.hrtimer_sleeper> timeout, int flags, @Unsigned long range_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<futex_q> futex_top_waiter(Ptr<futex_hash_bucket> hb, Ptr<futex_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_unqueue(Ptr<futex_q> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_unqueue_multiple(Ptr<futex_vector> v, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void futex_unqueue_pi(Ptr<futex_q> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_wait(Ptr<@Unsigned Integer> uaddr, @Unsigned int flags, @Unsigned int val, Ptr<@OriginalName(value="ktime_t") Long> abs_time, @Unsigned int bitset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_wait_multiple(Ptr<futex_vector> vs, @Unsigned int count, Ptr<HrtimerDefinitions.hrtimer_sleeper> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_wait_multiple_setup(Ptr<futex_vector> vs, int count, Ptr<Integer> woken) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void futex_wait_queue(Ptr<futex_hash_bucket> hb, Ptr<futex_q> q, Ptr<HrtimerDefinitions.hrtimer_sleeper> timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long futex_wait_restart(Ptr<misc.restart_block> restart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_wait_setup(Ptr<@Unsigned Integer> uaddr, @Unsigned int val, @Unsigned int flags, Ptr<futex_q> q, Ptr<Ptr<futex_hash_bucket>> hb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_wake(Ptr<@Unsigned Integer> uaddr, @Unsigned int flags, int nr_wake, @Unsigned int bitset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void futex_wake_mark(Ptr<WakeDefinitions.wake_q_head> wake_q, Ptr<futex_q> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_wake_op(Ptr<@Unsigned Integer> uaddr1, @Unsigned int flags, Ptr<@Unsigned Integer> uaddr2, int nr_wake, int nr_wake2, int op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_parse_waitv(Ptr<futex_vector> futexv, Ptr<futex_waitv> uwaitv, @Unsigned int nr_futexes, Ptr<?> wake, Ptr<?> wake_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_requeue(Ptr<@Unsigned Integer> uaddr1, @Unsigned int flags1, Ptr<@Unsigned Integer> uaddr2, @Unsigned int flags2, int nr_wake, int nr_requeue, Ptr<@Unsigned Integer> cmpval, int requeue_pi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_wait_requeue_pi(Ptr<@Unsigned Integer> uaddr, @Unsigned int flags, @Unsigned int val, Ptr<@OriginalName(value="ktime_t") Long> abs_time, @Unsigned int bitset, Ptr<@Unsigned Integer> uaddr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_lock_pi(Ptr<@Unsigned Integer> uaddr, @Unsigned int flags, Ptr<@OriginalName(value="ktime_t") Long> time, int trylock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_lock_pi_atomic(Ptr<@Unsigned Integer> uaddr, Ptr<futex_hash_bucket> hb, Ptr<futex_key> key2, Ptr<Ptr<futex_pi_state>> ps, Ptr<TaskDefinitions.task_struct> task2, Ptr<Ptr<TaskDefinitions.task_struct>> exiting, int set_waiters) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int futex_unlock_pi(Ptr<@Unsigned Integer> uaddr, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct futex_vector")
    @NotUsableInJava
    public static class futex_vector
    extends Struct {
        public futex_waitv w;
        public futex_q q;
    }

    @Type(noCCodeGeneration=true, cType="struct futex_waitv")
    @NotUsableInJava
    public static class futex_waitv
    extends Struct {
        public @Unsigned long val;
        public @Unsigned long uaddr;
        public @Unsigned int flags;
        public @Unsigned int __reserved;
    }

    @Type(noCCodeGeneration=true, cType="enum futex_access")
    public static enum futex_access implements Enum<futex_access>,
    TypedEnum<futex_access, Integer>
    {
        FUTEX_READ,
        FUTEX_WRITE;

    }

    @Type(noCCodeGeneration=true, cType="struct futex_q")
    @NotUsableInJava
    public static class futex_q
    extends Struct {
        public misc.plist_node list;
        public Ptr<TaskDefinitions.task_struct> task;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock_ptr;
        public Ptr<?> wake;
        public Ptr<?> wake_data;
        public futex_key key;
        public Ptr<futex_pi_state> pi_state;
        public Ptr<RtDefinitions.rt_mutex_waiter> rt_waiter;
        public Ptr<futex_key> requeue_pi_key;
        public @Unsigned int bitset;
        public AtomicDefinitions.atomic_t requeue_state;
    }

    @Type(noCCodeGeneration=true, cType="struct futex_hash_bucket")
    @NotUsableInJava
    public static class futex_hash_bucket
    extends Struct {
        public AtomicDefinitions.atomic_t waiters;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.plist_head chain;
    }

    @Type(noCCodeGeneration=true, cType="union futex_key")
    @NotUsableInJava
    public static class futex_key
    extends Union {
        public misc.shared_of_futex_key shared;
        public misc.private_of_futex_key _private;
        public misc.both_of_futex_key both;
    }

    @Type(noCCodeGeneration=true, cType="struct futex_pi_state")
    @NotUsableInJava
    public static class futex_pi_state
    extends Struct {
        public ListDefinitions.list_head list;
        public RtDefinitions.rt_mutex_base pi_mutex;
        public Ptr<TaskDefinitions.task_struct> owner;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public futex_key key;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int *uaddr; unsigned int val; unsigned int flags; unsigned int bitset; long long unsigned int time; unsigned int *uaddr2; }")
    @NotUsableInJava
    public static class futex_of_anon_member_of_restart_block
    extends Struct {
        public Ptr<@Unsigned Integer> uaddr;
        public @Unsigned int val;
        public @Unsigned int flags;
        public @Unsigned int bitset;
        public @Unsigned long time;
        public Ptr<@Unsigned Integer> uaddr2;
    }
}

