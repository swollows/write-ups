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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RingDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_doorbell_for_active_rings(Ptr<XhciDefinitions.xhci_hcd> xhci, @Unsigned int slot_id, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TraceDefinitions.trace_buffer> __ring_buffer_alloc(@Unsigned long size, @Unsigned int flags, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TraceDefinitions.trace_buffer> __ring_buffer_alloc_range(@Unsigned long size, @Unsigned int flags, int order, @Unsigned long start, @Unsigned long range_size, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_data_read_page> ring_buffer_alloc_read_page(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_attach(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_buffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_bytes_cpu(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_change_overwrite(Ptr<TraceDefinitions.trace_buffer> buffer, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_commit_overrun_cpu(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ring_buffer_event> ring_buffer_consume(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2, Ptr<@Unsigned Long> ts, Ptr<@Unsigned Long> lost_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_discard_commit(Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_dropped_events_cpu(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ring_buffer_empty(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_entries(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_entries_cpu(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ring_buffer_event_data(Ptr<ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ring_buffer_event_length(Ptr<ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_event_time_stamp(Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_free(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_free_read_page(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2, Ptr<BufferDefinitions.buffer_data_read_page> data_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_buffer> ring_buffer_get(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_iter_advance(Ptr<ring_buffer_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ring_buffer_iter_dropped(Ptr<ring_buffer_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_iter_empty(Ptr<ring_buffer_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ring_buffer_event> ring_buffer_iter_peek(Ptr<ring_buffer_iter> iter2, Ptr<@Unsigned Long> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_iter_reset(Ptr<ring_buffer_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ring_buffer_last_boot_delta(Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<Long> text, Ptr<Long> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ring_buffer_event> ring_buffer_lock_reserve(Ptr<TraceDefinitions.trace_buffer> buffer, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_map(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_map_get_reader(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_max_event_size(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_meta_seq_init(Ptr<runtime.file> file2, Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_nest_end(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_nest_start(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_normalize_time_stamp(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2, Ptr<@Unsigned Long> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_nr_dirty_pages(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_oldest_event_ts(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_overrun_cpu(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_overruns(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ring_buffer_event> ring_buffer_peek(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2, Ptr<@Unsigned Long> ts, Ptr<@Unsigned Long> lost_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int ring_buffer_poll_wait(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2, Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> poll_table, int full) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_print_entry_header(Ptr<TraceDefinitions.trace_seq> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_print_page_header(Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<TraceDefinitions.trace_seq> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_put(Ptr<PerfDefinitions.perf_buffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_read_events_cpu(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_read_finish(Ptr<ring_buffer_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_read_page(Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<BufferDefinitions.buffer_data_read_page> data_page, @Unsigned long len, int cpu2, int full) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ring_buffer_read_page_data(Ptr<BufferDefinitions.buffer_data_read_page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ring_buffer_iter> ring_buffer_read_prepare(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_read_prepare_sync() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_read_start(Ptr<ring_buffer_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_record_disable(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_record_disable_cpu(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_record_enable(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_record_enable_cpu(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ring_buffer_record_is_on(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ring_buffer_record_is_set_on(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_record_off(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_record_on(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_reset(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_reset_cpu(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_reset_online_cpus(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_resize(Ptr<TraceDefinitions.trace_buffer> buffer, @Unsigned long size, int cpu_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ring_buffer_set_clock($arg1, (long long unsigned int (*)())$arg2)")
    public static void ring_buffer_set_clock(Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> clock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_set_time_stamp_abs(Ptr<TraceDefinitions.trace_buffer> buffer, boolean abs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_size(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_subbuf_order_get(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_subbuf_order_set(Ptr<TraceDefinitions.trace_buffer> buffer, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_subbuf_size_get(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ring_buffer_time_stamp(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ring_buffer_time_stamp_abs(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_unlock_commit(Ptr<TraceDefinitions.trace_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_unmap(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_wait(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2, int full, @OriginalName(value="ring_buffer_cond_fn") Ptr<?> cond, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ring_buffer_wake_waiters(Ptr<TraceDefinitions.trace_buffer> buffer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ring_buffer_write(Ptr<TraceDefinitions.trace_buffer> buffer, @Unsigned long length, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ring_buffer_per_cpu")
    @NotUsableInJava
    public static class ring_buffer_per_cpu
    extends Struct {
        public int cpu;
        public AtomicDefinitions.atomic_t record_disabled;
        public AtomicDefinitions.atomic_t resize_disabled;
        public Ptr<TraceDefinitions.trace_buffer> buffer;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock reader_lock;
        public  @OriginalName(value="arch_spinlock_t") runtime.qspinlock lock;
        public LockDefinitions.lock_class_key lock_key;
        public Ptr<BufferDefinitions.buffer_data_page> free_page;
        public @Unsigned long nr_pages;
        public @Unsigned int current_context;
        public Ptr<ListDefinitions.list_head> pages;
        public Ptr<BufferDefinitions.buffer_page> head_page;
        public Ptr<BufferDefinitions.buffer_page> tail_page;
        public Ptr<BufferDefinitions.buffer_page> commit_page;
        public Ptr<BufferDefinitions.buffer_page> reader_page;
        public @Unsigned long lost_events;
        public @Unsigned long last_overrun;
        public @Unsigned long nest;
        public LocalDefinitions.local_t entries_bytes;
        public LocalDefinitions.local_t entries;
        public LocalDefinitions.local_t overrun;
        public LocalDefinitions.local_t commit_overrun;
        public LocalDefinitions.local_t dropped_events;
        public LocalDefinitions.local_t committing;
        public LocalDefinitions.local_t commits;
        public LocalDefinitions.local_t pages_touched;
        public LocalDefinitions.local_t pages_lost;
        public LocalDefinitions.local_t pages_read;
        public long last_pages_touch;
        public @Unsigned long shortest_full;
        public @Unsigned long read;
        public @Unsigned long read_bytes;
        public  @OriginalName(value="rb_time_t") RbDefinitions.rb_time_struct write_stamp;
        public  @OriginalName(value="rb_time_t") RbDefinitions.rb_time_struct before_stamp;
        public @Unsigned long @Size(value=5) [] event_stamp;
        public @Unsigned long read_stamp;
        public @Unsigned long pages_removed;
        public @Unsigned int mapped;
        public @Unsigned int user_mapped;
        public runtime.mutex mapping_lock;
        public Ptr<@Unsigned Long> subbuf_ids;
        public Ptr<TraceDefinitions.trace_buffer_meta> meta_page;
        public Ptr<ring_buffer_meta> ring_meta;
        public long nr_pages_to_update;
        public ListDefinitions.list_head new_pages;
        public misc.work_struct update_pages_work;
        public runtime.completion update_done;
        public RbDefinitions.rb_irq_work irq_work;
    }

    @Type(noCCodeGeneration=true, cType="struct ring_buffer_meta")
    @NotUsableInJava
    public static class ring_buffer_meta
    extends Struct {
        public int magic;
        public int struct_size;
        public @Unsigned long text_addr;
        public @Unsigned long data_addr;
        public @Unsigned long first_buffer;
        public @Unsigned long head_buffer;
        public @Unsigned long commit_buffer;
        public @Unsigned int subbuf_size;
        public @Unsigned int nr_subbufs;
        public int @Size(value=0) [] buffers;
    }

    @Type(noCCodeGeneration=true, cType="struct ring_buffer_iter")
    @NotUsableInJava
    public static class ring_buffer_iter
    extends Struct {
        public Ptr<ring_buffer_per_cpu> cpu_buffer;
        public @Unsigned long head;
        public @Unsigned long next_event;
        public Ptr<BufferDefinitions.buffer_page> head_page;
        public Ptr<BufferDefinitions.buffer_page> cache_reader_page;
        public @Unsigned long cache_read;
        public @Unsigned long cache_pages_removed;
        public @Unsigned long read_stamp;
        public @Unsigned long page_stamp;
        public Ptr<ring_buffer_event> event;
        public @Unsigned long event_size;
        public int missed_events;
    }

    @Type(noCCodeGeneration=true, cType="enum ring_buffer_flags")
    public static enum ring_buffer_flags implements Enum<ring_buffer_flags>,
    TypedEnum<ring_buffer_flags, Integer>
    {
        RB_FL_OVERWRITE;

    }

    @Type(noCCodeGeneration=true, cType="enum ring_buffer_type")
    public static enum ring_buffer_type implements Enum<ring_buffer_type>,
    TypedEnum<ring_buffer_type, Integer>
    {
        RINGBUF_TYPE_DATA_TYPE_LEN_MAX,
        RINGBUF_TYPE_PADDING,
        RINGBUF_TYPE_TIME_EXTEND,
        RINGBUF_TYPE_TIME_STAMP;

    }

    @Type(noCCodeGeneration=true, cType="struct ring_buffer_event")
    @NotUsableInJava
    public static class ring_buffer_event
    extends Struct {
        public @Unsigned int type_len;
        public @Unsigned int time_delta;
        public @Unsigned int @Size(value=0) [] array;
    }
}

