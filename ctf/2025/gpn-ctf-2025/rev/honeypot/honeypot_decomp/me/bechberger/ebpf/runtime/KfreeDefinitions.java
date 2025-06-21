/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.ShrinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KfreeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfree_link(Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kfree_skb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfree_rcu_batch_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfree_rcu_monitor(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfree_rcu_scheduler_running() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kfree_rcu_shrink_count(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kfree_rcu_shrink_scan(Ptr<runtime.shrinker> shrink, Ptr<ShrinkDefinitions.shrink_control> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfree_rcu_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfree_skb_list_reason(Ptr<SkDefinitions.sk_buff> segs, SkbDefinitions.skb_drop_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfree_skb_partial(Ptr<SkDefinitions.sk_buff> skb, boolean head_stolen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfree_skbmem(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfree_strarray(Ptr<String> array, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfree_const((const void*)$arg1)")
    public static void kfree_const(Ptr<?> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfree_sensitive((const void*)$arg1)")
    public static void kfree_sensitive(Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kfree_rcu_cpu")
    @NotUsableInJava
    public static class kfree_rcu_cpu
    extends Struct {
        public Ptr<misc.callback_head> head;
        public @Unsigned long head_gp_snap;
        public AtomicDefinitions.atomic_t head_count;
        public ListDefinitions.list_head @Size(value=2) [] bulk_head;
        public AtomicDefinitions.atomic_t @Size(value=2) [] bulk_count;
        public kfree_rcu_cpu_work @Size(value=2) [] krw_arr;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public DelayedDefinitions.delayed_work monitor_work;
        public boolean initialized;
        public DelayedDefinitions.delayed_work page_cache_work;
        public AtomicDefinitions.atomic_t backoff_page_cache_fill;
        public AtomicDefinitions.atomic_t work_in_progress;
        public runtime.hrtimer hrtimer;
        public misc.llist_head bkvcache;
        public int nr_bkv_objs;
    }

    @Type(noCCodeGeneration=true, cType="struct kfree_rcu_cpu_work")
    @NotUsableInJava
    public static class kfree_rcu_cpu_work
    extends Struct {
        public RcuDefinitions.rcu_work rcu_work;
        public Ptr<misc.callback_head> head_free;
        public RcuDefinitions.rcu_gp_oldstate head_free_gp_snap;
        public ListDefinitions.list_head @Size(value=2) [] bulk_head_free;
        public Ptr<kfree_rcu_cpu> krcp;
    }
}

