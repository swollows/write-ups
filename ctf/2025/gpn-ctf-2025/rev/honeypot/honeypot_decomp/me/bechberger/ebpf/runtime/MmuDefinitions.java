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
import me.bechberger.ebpf.runtime.IntervalDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MmuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__mmu_interval_notifier_insert($arg1, $arg2, $arg3, $arg4, $arg5, (const struct mmu_interval_notifier_ops*)$arg6)")
    public static int __mmu_interval_notifier_insert(Ptr<mmu_interval_notifier> interval_sub, Ptr<MmDefinitions.mm_struct> mm, Ptr<mmu_notifier_subscriptions> subscriptions, @Unsigned long start, @Unsigned long length, Ptr<mmu_interval_notifier_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mmu_notifier_arch_invalidate_secondary_tlbs(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmu_notifier_clear_flush_young(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmu_notifier_clear_young(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mmu_notifier_invalidate_range_end(Ptr<mmu_notifier_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmu_notifier_invalidate_range_start(Ptr<mmu_notifier_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmu_notifier_register(Ptr<mmu_notifier> subscription, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mmu_notifier_release(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mmu_notifier_subscriptions_destroy(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmu_notifier_test_young(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmu_interval_notifier_insert($arg1, $arg2, $arg3, $arg4, (const struct mmu_interval_notifier_ops*)$arg5)")
    public static int mmu_interval_notifier_insert(Ptr<mmu_interval_notifier> interval_sub, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long length, Ptr<mmu_interval_notifier_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmu_interval_notifier_insert_locked($arg1, $arg2, $arg3, $arg4, (const struct mmu_interval_notifier_ops*)$arg5)")
    public static int mmu_interval_notifier_insert_locked(Ptr<mmu_interval_notifier> interval_sub, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long length, Ptr<mmu_interval_notifier_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmu_interval_notifier_remove(Ptr<mmu_interval_notifier> interval_sub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mmu_interval_read_begin(Ptr<mmu_interval_notifier> interval_sub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmu_notifier_free_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmu_notifier_get_locked((const struct mmu_notifier_ops*)$arg1, $arg2)")
    public static Ptr<mmu_notifier> mmu_notifier_get_locked(Ptr<mmu_notifier_ops> ops, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmu_notifier_invalidate_range_end(Ptr<mmu_notifier_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmu_notifier_invalidate_range_start(Ptr<mmu_notifier_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmu_notifier_put(Ptr<mmu_notifier> subscription) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmu_notifier_register(Ptr<mmu_notifier> subscription, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmu_notifier_synchronize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmu_notifier_unregister(Ptr<mmu_notifier> subscription, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mmu_notifier_subscriptions")
    @NotUsableInJava
    public static class mmu_notifier_subscriptions
    extends Struct {
        public misc.hlist_head list;
        public boolean has_itree;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned long invalidate_seq;
        public @Unsigned long active_invalidate_ranges;
        public RbDefinitions.rb_root_cached itree;
        public  @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wq;
        public misc.hlist_head deferred_list;
    }

    @Type(noCCodeGeneration=true, cType="struct mmu_notifier")
    @NotUsableInJava
    public static class mmu_notifier
    extends Struct {
        public misc.hlist_node hlist;
        public Ptr<mmu_notifier_ops> ops;
        public Ptr<MmDefinitions.mm_struct> mm;
        public misc.callback_head rcu;
        public @Unsigned int users;
    }

    @Type(noCCodeGeneration=true, cType="struct mmu_notifier_ops")
    @NotUsableInJava
    public static class mmu_notifier_ops
    extends Struct {
        public Ptr<?> release;
        public Ptr<?> clear_flush_young;
        public Ptr<?> clear_young;
        public Ptr<?> test_young;
        public Ptr<?> invalidate_range_start;
        public Ptr<?> invalidate_range_end;
        public Ptr<?> arch_invalidate_secondary_tlbs;
        public Ptr<?> alloc_notifier;
        public Ptr<?> free_notifier;
    }

    @Type(noCCodeGeneration=true, cType="struct mmu_interval_notifier")
    @NotUsableInJava
    public static class mmu_interval_notifier
    extends Struct {
        public IntervalDefinitions.interval_tree_node interval_tree;
        public Ptr<mmu_interval_notifier_ops> ops;
        public Ptr<MmDefinitions.mm_struct> mm;
        public misc.hlist_node deferred_item;
        public @Unsigned long invalidate_seq;
    }

    @Type(noCCodeGeneration=true, cType="struct mmu_interval_notifier_ops")
    @NotUsableInJava
    public static class mmu_interval_notifier_ops
    extends Struct {
        public Ptr<?> invalidate;
    }

    @Type(noCCodeGeneration=true, cType="struct mmu_notifier_range")
    @NotUsableInJava
    public static class mmu_notifier_range
    extends Struct {
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned int flags;
        public mmu_notifier_event event;
        public Ptr<?> owner;
    }

    @Type(noCCodeGeneration=true, cType="enum mmu_notifier_event")
    public static enum mmu_notifier_event implements Enum<mmu_notifier_event>,
    TypedEnum<mmu_notifier_event, Integer>
    {
        MMU_NOTIFY_UNMAP,
        MMU_NOTIFY_CLEAR,
        MMU_NOTIFY_PROTECTION_VMA,
        MMU_NOTIFY_PROTECTION_PAGE,
        MMU_NOTIFY_SOFT_DIRTY,
        MMU_NOTIFY_RELEASE,
        MMU_NOTIFY_MIGRATE,
        MMU_NOTIFY_EXCLUSIVE;

    }

    @Type(noCCodeGeneration=true, cType="struct mmu_update")
    @NotUsableInJava
    public static class mmu_update
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long ptr;
        public @Unsigned @OriginalName(value="uint64_t") long val;
    }

    @Type(noCCodeGeneration=true, cType="struct mmu_gather_batch")
    @NotUsableInJava
    public static class mmu_gather_batch
    extends Struct {
        public Ptr<mmu_gather_batch> next;
        public @Unsigned int nr;
        public @Unsigned int max;
        public @OriginalName(value="encoded_page") Ptr<?> @Size(value=0) [] encoded_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct mmu_table_batch")
    @NotUsableInJava
    public static class mmu_table_batch
    extends Struct {
        public misc.callback_head rcu;
        public @Unsigned int nr;
        public Ptr<?> @Size(value=0) [] tables;
    }

    @Type(noCCodeGeneration=true, cType="struct mmu_gather")
    @NotUsableInJava
    public static class mmu_gather
    extends Struct {
        public Ptr<MmDefinitions.mm_struct> mm;
        public Ptr<mmu_table_batch> batch;
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned int fullmm;
        public @Unsigned int need_flush_all;
        public @Unsigned int freed_tables;
        public @Unsigned int delayed_rmap;
        public @Unsigned int cleared_ptes;
        public @Unsigned int cleared_pmds;
        public @Unsigned int cleared_puds;
        public @Unsigned int cleared_p4ds;
        public @Unsigned int vma_exec;
        public @Unsigned int vma_huge;
        public @Unsigned int vma_pfn;
        public @Unsigned int batch_count;
        public Ptr<mmu_gather_batch> active;
        public mmu_gather_batch local;
        public Ptr<runtime.page> @Size(value=8) [] __pages;
    }
}

