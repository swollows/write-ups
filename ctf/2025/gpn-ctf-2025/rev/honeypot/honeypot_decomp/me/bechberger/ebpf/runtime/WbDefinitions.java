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
import me.bechberger.ebpf.runtime.BackingDefinitions;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class WbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __wb_calc_thresh(Ptr<misc.dirty_throttle_control> dtc, @Unsigned long thresh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __wb_update_bandwidth(Ptr<misc.dirty_throttle_control> gdtc, Ptr<misc.dirty_throttle_control> mdtc, boolean update_ratelimit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long wb_calc_thresh(Ptr<BdiDefinitions.bdi_writeback> wb, @Unsigned long thresh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long wb_do_writeback(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_domain_exit(Ptr<wb_domain> dom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wb_domain_init(Ptr<wb_domain> dom, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_io_lists_depopulated(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wb_io_lists_populated(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean wb_over_bg_thresh(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_position_ratio(Ptr<misc.dirty_throttle_control> dtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_queue_work(Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_start_background_writeback(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_start_writeback(Ptr<BdiDefinitions.bdi_writeback> wb, wb_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_timer_fn(Ptr<BlkDefinitions.blk_stat_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_update_bandwidth(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_update_dirty_ratelimit(Ptr<misc.dirty_throttle_control> dtc, @Unsigned long dirtied, @Unsigned long elapsed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_wait_for_completion(Ptr<wb_completion> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_wakeup(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_wakeup_delayed(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long wb_writeback(Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_writeout_inc(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_blkcg_offline(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BdiDefinitions.bdi_writeback> wb_get_create(Ptr<BackingDefinitions.backing_dev_info> bdi, Ptr<CgroupDefinitions.cgroup_subsys_state> memcg_css, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BdiDefinitions.bdi_writeback> wb_get_lookup(Ptr<BackingDefinitions.backing_dev_info> bdi, Ptr<CgroupDefinitions.cgroup_subsys_state> memcg_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int wb_init(Ptr<BdiDefinitions.bdi_writeback> wb, Ptr<BackingDefinitions.backing_dev_info> bdi, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_memcg_offline(Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_shutdown(Ptr<BdiDefinitions.bdi_writeback> wb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void wb_update_bandwidth_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct wb_writeback_work")
    @NotUsableInJava
    public static class wb_writeback_work
    extends Struct {
        public long nr_pages;
        public Ptr<SuperDefinitions.super_block> sb;
        public WritebackDefinitions.writeback_sync_modes sync_mode;
        public @Unsigned int tagged_writepages;
        public @Unsigned int for_kupdate;
        public @Unsigned int range_cyclic;
        public @Unsigned int for_background;
        public @Unsigned int for_sync;
        public @Unsigned int auto_free;
        public wb_reason reason;
        public ListDefinitions.list_head list;
        public Ptr<wb_completion> done;
    }

    @Type(noCCodeGeneration=true, cType="struct wb_lock_cookie")
    @NotUsableInJava
    public static class wb_lock_cookie
    extends Struct {
        public boolean locked;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct wb_stats")
    @NotUsableInJava
    public static class wb_stats
    extends Struct {
        public @Unsigned long nr_dirty;
        public @Unsigned long nr_io;
        public @Unsigned long nr_more_io;
        public @Unsigned long nr_dirty_time;
        public @Unsigned long nr_writeback;
        public @Unsigned long nr_reclaimable;
        public @Unsigned long nr_dirtied;
        public @Unsigned long nr_written;
        public @Unsigned long dirty_thresh;
        public @Unsigned long wb_thresh;
    }

    @Type(noCCodeGeneration=true, cType="enum wb_state")
    public static enum wb_state implements Enum<wb_state>,
    TypedEnum<wb_state, Integer>
    {
        WB_registered,
        WB_writeback_running,
        WB_has_dirty_io,
        WB_start_all;

    }

    @Type(noCCodeGeneration=true, cType="enum wb_stat_item")
    public static enum wb_stat_item implements Enum<wb_stat_item>,
    TypedEnum<wb_stat_item, Integer>
    {
        WB_RECLAIMABLE,
        WB_WRITEBACK,
        WB_DIRTIED,
        WB_WRITTEN,
        NR_WB_STAT_ITEMS;

    }

    @Type(noCCodeGeneration=true, cType="struct wb_domain")
    @NotUsableInJava
    public static class wb_domain
    extends Struct {
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.fprop_global completions;
        public TimerDefinitions.timer_list period_timer;
        public @Unsigned long period_time;
        public @Unsigned long dirty_limit_tstamp;
        public @Unsigned long dirty_limit;
    }

    @Type(noCCodeGeneration=true, cType="struct wb_completion")
    @NotUsableInJava
    public static class wb_completion
    extends Struct {
        public AtomicDefinitions.atomic_t cnt;
        public Ptr<@OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> waitq;
    }

    @Type(noCCodeGeneration=true, cType="enum wb_reason")
    public static enum wb_reason implements Enum<wb_reason>,
    TypedEnum<wb_reason, Integer>
    {
        WB_REASON_BACKGROUND,
        WB_REASON_VMSCAN,
        WB_REASON_SYNC,
        WB_REASON_PERIODIC,
        WB_REASON_LAPTOP_TIMER,
        WB_REASON_FS_FREE_SPACE,
        WB_REASON_FORKER_THREAD,
        WB_REASON_FOREIGN_FLUSH,
        WB_REASON_MAX;

    }
}

