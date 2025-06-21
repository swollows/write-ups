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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BalloonDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> balloon_page_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> balloon_page_dequeue(Ptr<balloon_dev_info> b_dev_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balloon_page_enqueue(Ptr<balloon_dev_info> b_dev_info, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balloon_page_enqueue_one(Ptr<balloon_dev_info> b_dev_info, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean balloon_page_isolate(Ptr<runtime.page> page2, @Unsigned @OriginalName(value="isolate_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long balloon_page_list_dequeue(Ptr<balloon_dev_info> b_dev_info, Ptr<ListDefinitions.list_head> pages, @Unsigned long n_req_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long balloon_page_list_enqueue(Ptr<balloon_dev_info> b_dev_info, Ptr<ListDefinitions.list_head> pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balloon_page_migrate(Ptr<runtime.page> newpage, Ptr<runtime.page> page2, MigrateDefinitions.migrate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balloon_page_putback(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balloon_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balloon_init_watcher(Ptr<misc.notifier_block> notifier, @Unsigned long event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> balloon_retrieve(boolean require_lowmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balloon_set_new_target(@Unsigned long target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balloon_thread(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int balloon_wait_finish() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void balloon_ack(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct balloon_stats")
    @NotUsableInJava
    public static class balloon_stats
    extends Struct {
        public @Unsigned long current_pages;
        public @Unsigned long target_pages;
        public @Unsigned long target_unpopulated;
        public @Unsigned long balloon_low;
        public @Unsigned long balloon_high;
        public @Unsigned long total_pages;
        public @Unsigned long schedule_delay;
        public @Unsigned long max_schedule_delay;
        public @Unsigned long retry_count;
        public @Unsigned long max_retry_count;
    }

    @Type(noCCodeGeneration=true, cType="struct balloon_dev_info")
    @NotUsableInJava
    public static class balloon_dev_info
    extends Struct {
        public @Unsigned long isolated_pages;
        public  @OriginalName(value="spinlock_t") runtime.spinlock pages_lock;
        public ListDefinitions.list_head pages;
        public Ptr<?> migratepage;
    }
}

