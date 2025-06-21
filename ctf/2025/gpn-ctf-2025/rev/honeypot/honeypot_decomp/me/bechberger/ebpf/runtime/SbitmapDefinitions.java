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
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SbitmapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sbitmap_queue_get(Ptr<sbitmap_queue> sbq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __sbitmap_queue_get_batch(Ptr<sbitmap_queue> sbq, int nr_tags, Ptr<@Unsigned Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__sbitmap_weight((const struct sbitmap*)$arg1, $arg2)")
    public static @Unsigned int __sbitmap_weight(Ptr<runtime.sbitmap> sb, boolean set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_add_wait_queue(Ptr<sbitmap_queue> sbq, Ptr<misc.sbq_wait_state> ws, Ptr<misc.sbq_wait> sbq_wait2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sbitmap_any_bit_set((const struct sbitmap*)$arg1)")
    public static boolean sbitmap_any_bit_set(Ptr<runtime.sbitmap> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_bitmap_show(Ptr<runtime.sbitmap> sb, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_del_wait_queue(Ptr<misc.sbq_wait> sbq_wait2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sbitmap_find_bit(Ptr<runtime.sbitmap> sb, @Unsigned int depth, @Unsigned int index2, @Unsigned int alloc_hint, boolean wrap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_finish_wait(Ptr<sbitmap_queue> sbq, Ptr<misc.sbq_wait_state> ws, Ptr<misc.sbq_wait> sbq_wait2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sbitmap_get(Ptr<runtime.sbitmap> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sbitmap_get_shallow(Ptr<runtime.sbitmap> sb, @Unsigned long shallow_depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sbitmap_init_node(Ptr<runtime.sbitmap> sb, @Unsigned int depth, int shift, @Unsigned @OriginalName(value="gfp_t") int flags, int node2, boolean round_robin, boolean alloc_hint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_prepare_to_wait(Ptr<sbitmap_queue> sbq, Ptr<misc.sbq_wait_state> ws, Ptr<misc.sbq_wait> sbq_wait2, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_queue_clear(Ptr<sbitmap_queue> sbq, @Unsigned int nr, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_queue_clear_batch(Ptr<sbitmap_queue> sbq, int offset, Ptr<Integer> tags, int nr_tags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sbitmap_queue_get_shallow(Ptr<sbitmap_queue> sbq, @Unsigned int shallow_depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sbitmap_queue_init_node(Ptr<sbitmap_queue> sbq, @Unsigned int depth, int shift, boolean round_robin, @Unsigned @OriginalName(value="gfp_t") int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_queue_min_shallow_depth(Ptr<sbitmap_queue> sbq, @Unsigned int min_shallow_depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_queue_recalculate_wake_batch(Ptr<sbitmap_queue> sbq, @Unsigned int users) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_queue_resize(Ptr<sbitmap_queue> sbq, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_queue_show(Ptr<sbitmap_queue> sbq, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_queue_wake_all(Ptr<sbitmap_queue> sbq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_queue_wake_up(Ptr<sbitmap_queue> sbq, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_resize(Ptr<runtime.sbitmap> sb, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sbitmap_show(Ptr<runtime.sbitmap> sb, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sbitmap_weight((const struct sbitmap*)$arg1)")
    public static @Unsigned int sbitmap_weight(Ptr<runtime.sbitmap> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sbitmap_queue")
    @NotUsableInJava
    public static class sbitmap_queue
    extends Struct {
        public runtime.sbitmap sb;
        public @Unsigned int wake_batch;
        public AtomicDefinitions.atomic_t wake_index;
        public Ptr<misc.sbq_wait_state> ws;
        public AtomicDefinitions.atomic_t ws_active;
        public @Unsigned int min_shallow_depth;
        public AtomicDefinitions.atomic_t completion_cnt;
        public AtomicDefinitions.atomic_t wakeup_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct sbitmap_word")
    @NotUsableInJava
    public static class sbitmap_word
    extends Struct {
        public @Unsigned long word;
        public @Unsigned long cleared;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock swap_lock;
    }
}

