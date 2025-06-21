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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rb_free_aux(Ptr<PerfDefinitions.perf_buffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_buffer> rb_alloc(int nr_pages, long watermark, int cpu2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rb_alloc_aux(Ptr<PerfDefinitions.perf_buffer> rb, Ptr<PerfDefinitions.perf_event> event2, @Unsigned long pgoff, int nr_pages, long watermark, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_free(Ptr<PerfDefinitions.perf_buffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_free_aux(Ptr<PerfDefinitions.perf_buffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rb_simple_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rb_simple_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long rb_simple_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rb_allocate_pages(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer, long nr_pages, Ptr<ListDefinitions.list_head> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__rb_erase_color($arg1, $arg2, (void (*)(struct rb_node*, struct rb_node*))$arg3)")
    public static void __rb_erase_color(Ptr<rb_node> parent, Ptr<rb_root> root, Ptr<?> augment_rotate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rb_inc_dec_mapped(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer, boolean inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__rb_insert_augmented($arg1, $arg2, (void (*)(struct rb_node*, struct rb_node*))$arg3)")
    public static void __rb_insert_augmented(Ptr<rb_node> node2, Ptr<rb_root> root, Ptr<?> augment_rotate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rb_map_vma(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RingDefinitions.ring_buffer_event> __rb_reserve_next(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer, Ptr<rb_event_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_advance_iter(Ptr<RingDefinitions.ring_buffer_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_advance_reader(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RingDefinitions.ring_buffer_per_cpu> rb_allocate_cpu_buffer(Ptr<TraceDefinitions.trace_buffer> buffer, long nr_pages, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RingDefinitions.ring_buffer_event> rb_buffer_peek(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer, Ptr<@Unsigned Long> ts, Ptr<@Unsigned Long> lost_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_check_pages(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_commit(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_erase(Ptr<rb_node> node2, Ptr<rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rb_first((const struct rb_root*)$arg1)")
    public static Ptr<rb_node> rb_first(Ptr<rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rb_first_postorder((const struct rb_root*)$arg1)")
    public static Ptr<rb_node> rb_first_postorder(Ptr<rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_free_cpu_buffer(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_free_rcu(Ptr<misc.callback_head> callback_head2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_page> rb_get_reader_page(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rb_handle_head_page(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer, Ptr<BufferDefinitions.buffer_page> tail_page, Ptr<BufferDefinitions.buffer_page> next_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_insert_color(Ptr<rb_node> node2, Ptr<rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RingDefinitions.ring_buffer_event> rb_iter_head_event(Ptr<RingDefinitions.ring_buffer_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RingDefinitions.ring_buffer_event> rb_iter_peek(Ptr<RingDefinitions.ring_buffer_iter> iter2, Ptr<@Unsigned Long> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_iter_reset(Ptr<RingDefinitions.ring_buffer_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rb_last((const struct rb_root*)$arg1)")
    public static Ptr<rb_node> rb_last(Ptr<rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_meta_init_text_addr(Ptr<RingDefinitions.ring_buffer_meta> meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_meta_validate_events(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RingDefinitions.ring_buffer_event> rb_move_tail(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer, @Unsigned long tail, Ptr<rb_event_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rb_next((const struct rb_node*)$arg1)")
    public static Ptr<rb_node> rb_next(Ptr<rb_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rb_next_postorder((const struct rb_node*)$arg1)")
    public static Ptr<rb_node> rb_next_postorder(Ptr<rb_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rb_per_cpu_empty(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rb_prev((const struct rb_node*)$arg1)")
    public static Ptr<rb_node> rb_prev(Ptr<rb_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_range_meta_init(Ptr<TraceDefinitions.trace_buffer> buffer, int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rb_remove_pages(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_replace_node(Ptr<rb_node> victim, Ptr<rb_node> _new, Ptr<rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_replace_node_rcu(Ptr<rb_node> victim, Ptr<rb_node> _new, Ptr<rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_reset_cpu(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_page> rb_set_head_page(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_update_meta_page(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_update_pages(Ptr<RingDefinitions.ring_buffer_per_cpu> cpu_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rb_wait_once(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rb_wake_up_waiters(Ptr<IrqDefinitions.irq_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rb_watermark_hit(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2, int full) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct rb_root_cached tree; struct list_head list; }")
    @NotUsableInJava
    public static class rb_of_drm_gpuvm
    extends Struct {
        public rb_root_cached tree;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct rb_node node; struct list_head entry; long long unsigned int __subtree_last; }")
    @NotUsableInJava
    public static class rb_of_drm_gpuva
    extends Struct {
        public rb_node node;
        public ListDefinitions.list_head entry;
        public @Unsigned long __subtree_last;
    }

    @Type(noCCodeGeneration=true, cType="struct rb_list")
    @NotUsableInJava
    public static class rb_list
    extends Struct {
        public rb_root root;
        public ListDefinitions.list_head head;
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct rb_augment_callbacks")
    @NotUsableInJava
    public static class rb_augment_callbacks
    extends Struct {
        public Ptr<?> propagate;
        public Ptr<?> copy;
        public Ptr<?> rotate;
    }

    @Type(noCCodeGeneration=true, cType="struct rb_wait_data")
    @NotUsableInJava
    public static class rb_wait_data
    extends Struct {
        public Ptr<rb_irq_work> irq_work;
        public int seq;
    }

    @Type(noCCodeGeneration=true, cType="struct rb_time_struct")
    @NotUsableInJava
    public static class rb_time_struct
    extends Struct {
        public misc.local64_t time;
    }

    @Type(noCCodeGeneration=true, cType="struct rb_event_info")
    @NotUsableInJava
    public static class rb_event_info
    extends Struct {
        public @Unsigned long ts;
        public @Unsigned long delta;
        public @Unsigned long before;
        public @Unsigned long after;
        public @Unsigned long length;
        public Ptr<BufferDefinitions.buffer_page> tail_page;
        public int add_timestamp;
    }

    @Type(noCCodeGeneration=true, cType="struct rb_irq_work")
    @NotUsableInJava
    public static class rb_irq_work
    extends Struct {
        public IrqDefinitions.irq_work work;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waiters;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head full_waiters;
        public AtomicDefinitions.atomic_t seq;
        public boolean waiters_pending;
        public boolean full_waiters_pending;
        public boolean wakeup_full;
    }

    @Type(noCCodeGeneration=true, cType="struct rb_root_cached")
    @NotUsableInJava
    public static class rb_root_cached
    extends Struct {
        public rb_root rb_root;
        public Ptr<rb_node> rb_leftmost;
    }

    @Type(noCCodeGeneration=true, cType="struct rb_root")
    @NotUsableInJava
    public static class rb_root
    extends Struct {
        public Ptr<rb_node> rb_node;
    }

    @Type(noCCodeGeneration=true, cType="struct rb_node")
    @NotUsableInJava
    public static class rb_node
    extends Struct {
        public @Unsigned long __rb_parent_color;
        public Ptr<rb_node> rb_right;
        public Ptr<rb_node> rb_left;
    }
}

