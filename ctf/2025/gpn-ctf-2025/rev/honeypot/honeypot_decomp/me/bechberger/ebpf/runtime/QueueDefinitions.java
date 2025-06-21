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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.ScmDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class QueueDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __queue_map_get(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> value, boolean delete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_add_random_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_add_random_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_add_random_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_atomic_write_boundary_sectors_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_atomic_write_max_sectors_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_atomic_write_unit_max_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_atomic_write_unit_min_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long queue_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short queue_attr_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_chunk_sectors_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_dax_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_discard_granularity_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_discard_zeroes_data_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_dma_alignment_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_feature_store($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long queue_feature_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count, @Unsigned @OriginalName(value="blk_features_t") int feature) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_fua_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_interrupt_event(Ptr<runtime.slot> p_slot, @Unsigned int event_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_io_min_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_io_opt_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_io_timeout_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_io_timeout_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_io_timeout_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_iostats_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_iostats_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_iostats_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_logical_block_size_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long queue_map_peek_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long queue_map_pop_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_active_zones_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_discard_sectors_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_max_discard_sectors_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_max_discard_sectors_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_discard_segments_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_hw_discard_sectors_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_hw_sectors_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_integrity_segments_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_open_zones_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_sectors_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_max_sectors_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_max_sectors_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_segment_size_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_segments_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_max_write_zeroes_sectors_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_nomerges_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_nomerges_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_nomerges_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_nr_zones_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_physical_block_size_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_pm_only_show(Ptr<?> data, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_poll_delay_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_poll_delay_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_poll_delay_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_poll_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_poll_stat_show(Ptr<?> data, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_poll_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_poll_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_ra_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_ra_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_ra_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_reply($arg1, (const void*)$arg2, $arg3)")
    public static int queue_reply(Ptr<ListDefinitions.list_head> queue, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_requests_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_requests_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_requests_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> queue_requeue_list_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> queue_requeue_list_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void queue_requeue_list_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_rotational_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_rotational_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_rotational_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_rq_affinity_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_rq_affinity_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_rq_affinity_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_stable_writes_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_stable_writes_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_stable_writes_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> queue_stack_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_stack_map_alloc_check(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long queue_stack_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void queue_stack_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_stack_map_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> queue_stack_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_stack_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long queue_stack_map_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long queue_stack_map_push_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long queue_stack_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_state_show(Ptr<?> data, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_state_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long queue_state_write(Ptr<?> data, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_virt_boundary_mask_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_wb_lat_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_wb_lat_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_wb_lat_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_wc_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_wc_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long queue_wc_store(Ptr<runtime.gendisk> disk, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_write_same_max_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_zone_append_max_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_zone_write_granularity_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long queue_zoned_show(Ptr<runtime.gendisk> disk, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_limits_commit_update(Ptr<RequestDefinitions.request_queue> q, Ptr<queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_limits_set(Ptr<RequestDefinitions.request_queue> q, Ptr<queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_limits_stack_bdev($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static void queue_limits_stack_bdev(Ptr<queue_limits> t, Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long offset, String pfx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean queue_limits_stack_integrity(Ptr<queue_limits> t, Ptr<queue_limits> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void queue_oom_reaper(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void queue_process(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="queue_task_work($arg1, $arg2, (void (*)(struct callback_head*))$arg3)")
    public static void queue_task_work(Ptr<runtime.mce> m, String msg, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_zone_wplugs_show(Ptr<?> data, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_command(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_command> cmd, @Unsigned int field1, @Unsigned int field2, @Unsigned int field3, @Unsigned int field4, boolean command_must_succeed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_folios_hugetlb(Ptr<PteDefinitions.pte_t> pte, @Unsigned long hmask, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void queue_folios_pmd(Ptr<PmdDefinitions.pmd_t> pmd, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_folios_pte_range(Ptr<PmdDefinitions.pmd_t> pmd, @Unsigned long addr2, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long queue_pages_range(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end, Ptr<misc.nodemask_t> nodes, @Unsigned long flags, Ptr<ListDefinitions.list_head> pagelist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_pages_test_walk(@Unsigned long start, @Unsigned long end, Ptr<MmDefinitions.mm_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void queue_set_hctx_shared(Ptr<RequestDefinitions.request_queue> q, boolean shared) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void queue_trb(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_ring> ring, boolean more_trbs_coming, @Unsigned int field1, @Unsigned int field2, @Unsigned int field3, @Unsigned int field4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __queue_delayed_work(int cpu2, Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<DelayedDefinitions.delayed_work> dwork, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __queue_work(int cpu2, Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean queue_delayed_work_on(int cpu2, Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<DelayedDefinitions.delayed_work> dwork, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_interrupt(Ptr<FuseDefinitions.fuse_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void queue_iova(Ptr<IommuDefinitions.iommu_dma_cookie> cookie, @Unsigned long pfn, @Unsigned long pages, Ptr<ListDefinitions.list_head> freelist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int queue_oob(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, Ptr<runtime.sock> other, Ptr<ScmDefinitions.scm_cookie> scm, boolean fds_sent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean queue_rcu_work(Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<RcuDefinitions.rcu_work> rwork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean queue_work_node(int node2, Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean queue_work_on(int cpu2, Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct queue_pages")
    @NotUsableInJava
    public static class queue_pages
    extends Struct {
        public Ptr<ListDefinitions.list_head> pagelist;
        public @Unsigned long flags;
        public Ptr<misc.nodemask_t> nmask;
        public @Unsigned long start;
        public @Unsigned long end;
        public Ptr<VmDefinitions.vm_area_struct> first;
        public Ptr<runtime.folio> large;
        public long nr_failed;
    }

    @Type(noCCodeGeneration=true, cType="struct queue_sysfs_entry")
    @NotUsableInJava
    public static class queue_sysfs_entry
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> load_module;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int ctx; unsigned int index; u8 vf; }")
    @NotUsableInJava
    public static class queue_of_anon_member_of_flow_action_entry
    extends Struct {
        public @Unsigned int ctx;
        public @Unsigned int index;
        public char vf;
    }

    @Type(noCCodeGeneration=true, cType="struct queue_limits")
    @NotUsableInJava
    public static class queue_limits
    extends Struct {
        public @Unsigned @OriginalName(value="blk_features_t") int features;
        public @Unsigned @OriginalName(value="blk_flags_t") int flags;
        public @Unsigned long seg_boundary_mask;
        public @Unsigned long virt_boundary_mask;
        public @Unsigned int max_hw_sectors;
        public @Unsigned int max_dev_sectors;
        public @Unsigned int chunk_sectors;
        public @Unsigned int max_sectors;
        public @Unsigned int max_user_sectors;
        public @Unsigned int max_segment_size;
        public @Unsigned int physical_block_size;
        public @Unsigned int logical_block_size;
        public @Unsigned int alignment_offset;
        public @Unsigned int io_min;
        public @Unsigned int io_opt;
        public @Unsigned int max_discard_sectors;
        public @Unsigned int max_hw_discard_sectors;
        public @Unsigned int max_user_discard_sectors;
        public @Unsigned int max_secure_erase_sectors;
        public @Unsigned int max_write_zeroes_sectors;
        public @Unsigned int max_zone_append_sectors;
        public @Unsigned int discard_granularity;
        public @Unsigned int discard_alignment;
        public @Unsigned int zone_write_granularity;
        public @Unsigned int atomic_write_hw_max;
        public @Unsigned int atomic_write_max_sectors;
        public @Unsigned int atomic_write_hw_boundary;
        public @Unsigned int atomic_write_boundary_sectors;
        public @Unsigned int atomic_write_hw_unit_min;
        public @Unsigned int atomic_write_unit_min;
        public @Unsigned int atomic_write_hw_unit_max;
        public @Unsigned int atomic_write_unit_max;
        public @Unsigned short max_segments;
        public @Unsigned short max_integrity_segments;
        public @Unsigned short max_discard_segments;
        public @Unsigned int max_open_zones;
        public @Unsigned int max_active_zones;
        public @Unsigned int dma_alignment;
        public @Unsigned int dma_pad_mask;
        public BlkDefinitions.blk_integrity integrity;
    }
}

