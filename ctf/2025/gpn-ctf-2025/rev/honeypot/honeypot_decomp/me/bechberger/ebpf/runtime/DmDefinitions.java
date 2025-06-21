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
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.KobjectDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MapDefinitions;
import me.bechberger.ebpf.runtime.MempoolDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PrDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.TargetDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dm_stat_clear(Ptr<dm_stat> s2, @Unsigned long idx_start, @Unsigned long idx_end, boolean init_tmp_percpu_totals) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dm_stat_init_temporary_percpu_totals(Ptr<dm_stat_shared> shared, Ptr<dm_stat> s2, @Unsigned long x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_calculate_queue_limits(Ptr<dm_table> t, Ptr<QueueDefinitions.queue_limits> limits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_consume_args(Ptr<dm_arg_set> as, @Unsigned int num_args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_destroy_crypto_profile(Ptr<BlkDefinitions.blk_crypto_profile> profile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_devt_from_path((const u8*)$arg1, $arg2)")
    public static int dm_devt_from_path(String path2, Ptr<@Unsigned @OriginalName(value="dev_t") Integer> dev_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_get_device($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int dm_get_device(Ptr<dm_target> ti, String path2, @Unsigned @OriginalName(value="blk_mode_t") int mode, Ptr<Ptr<dm_dev>> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dm_io_client> dm_io_client_create() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_io_client_destroy(Ptr<dm_io_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_io_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_io_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dm_jiffies_to_msec64(Ptr<dm_stat> s2, @Unsigned long j) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_keyslot_evict($arg1, (const struct blk_crypto_key*)$arg2, $arg3)")
    public static int dm_keyslot_evict(Ptr<BlkDefinitions.blk_crypto_profile> profile, Ptr<BlkDefinitions.blk_crypto_key> key2, @Unsigned int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_keyslot_evict_callback(Ptr<dm_target> ti, Ptr<dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dm_kvzalloc(@Unsigned long alloc_size, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_put_device(Ptr<dm_target> ti, Ptr<dm_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_read_arg((const struct dm_arg*)$arg1, $arg2, $arg3, $arg4)")
    public static int dm_read_arg(Ptr<dm_arg> arg2, Ptr<dm_arg_set> arg_set, Ptr<@Unsigned Integer> value, Ptr<String> error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_read_arg_group((const struct dm_arg*)$arg1, $arg2, $arg3, $arg4)")
    public static int dm_read_arg_group(Ptr<dm_arg> arg2, Ptr<dm_arg_set> arg_set, Ptr<@Unsigned Integer> value, Ptr<String> error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_set_device_limits(Ptr<dm_target> ti, Ptr<dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dm_shift_arg($arg1))")
    public static String dm_shift_arg(Ptr<dm_arg_set> as) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_split_args(Ptr<Integer> argc, Ptr<Ptr<String>> argvp, String input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_stat_for_entry(Ptr<dm_stat> s2, @Unsigned long entry, int idx, @Unsigned @OriginalName(value="sector_t") long len, Ptr<dm_stats_aux> stats_aux, boolean end, @Unsigned long duration_jiffies) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_stat_free(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_stat_round(Ptr<dm_stat> s2, Ptr<dm_stat_shared> shared, Ptr<dm_stat_percpu> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_statistics_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_statistics_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_stats_account_io(Ptr<dm_stats> stats, @Unsigned long bi_rw, @Unsigned @OriginalName(value="sector_t") long bi_sector, @Unsigned int bi_sectors, boolean end, @Unsigned long start_time, Ptr<dm_stats_aux> stats_aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_stats_cleanup(Ptr<dm_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_stats_delete(Ptr<dm_stats> stats, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_stats_init(Ptr<dm_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_stats_list($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int dm_stats_list(Ptr<dm_stats> stats, String program, String result, @Unsigned int maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_stats_message(Ptr<misc.mapped_device> md, @Unsigned int argc, Ptr<String> argv, String result, @Unsigned int maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_stats_print(Ptr<dm_stats> stats, int id, @Unsigned long idx_start, @Unsigned long idx_len, boolean clear, String result, @Unsigned int maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_table_add_target($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int dm_table_add_target(Ptr<dm_table> t, String type2, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, String params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_table_alloc_md_mempools(Ptr<dm_table> t, Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dm_table_bio_based(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_table_complete(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_table_construct_crypto_profile(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_table_create(Ptr<Ptr<dm_table>> result, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int num_targets, Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_table_destroy(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_table_determine_type(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dm_table_device_name($arg1))")
    public static String dm_table_device_name(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_table_event(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_table_event_callback($arg1, (void (*)(void*))$arg2, $arg3)")
    public static void dm_table_event_callback(Ptr<dm_table> t, Ptr<?> fn, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dm_target> dm_table_find_target(Ptr<dm_table> t, @Unsigned @OriginalName(value="sector_t") long sector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> dm_table_get_devices(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dm_target> dm_table_get_immutable_target(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TargetDefinitions.target_type> dm_table_get_immutable_target_type(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.mapped_device> dm_table_get_md(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="blk_mode_t") int dm_table_get_mode(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long dm_table_get_size(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static dm_queue_mode dm_table_get_type(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dm_target> dm_table_get_wildcard_target(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dm_table_has_no_data_devices(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_table_postsuspend_targets(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_table_presuspend_targets(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_table_presuspend_undo_targets(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dm_table_request_based(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_table_resume_targets(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_table_run_md_queue_async(Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_table_set_restrictions(Ptr<dm_table> t, Ptr<RequestDefinitions.request_queue> q, Ptr<QueueDefinitions.queue_limits> limits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_table_set_type(Ptr<dm_table> t, dm_queue_mode type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dm_table_supports_dax(Ptr<dm_table> t, @OriginalName(value="iterate_devices_callout_fn") Ptr<?> iterate_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dm_attr_rq_based_seq_io_merge_deadline_show(Ptr<misc.mapped_device> md, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_attr_rq_based_seq_io_merge_deadline_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long dm_attr_rq_based_seq_io_merge_deadline_store(Ptr<misc.mapped_device> md, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dm_get_reserved_rq_based_ios() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_ima_alloc_and_copy_device_data(Ptr<misc.mapped_device> md, Ptr<String> device_data, @Unsigned int num_targets, boolean noio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_ima_alloc_and_copy_name_uuid(Ptr<misc.mapped_device> md, Ptr<String> dev_name, Ptr<String> dev_uuid, boolean noio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_ima_measure_on_device_remove(Ptr<misc.mapped_device> md, boolean remove_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_ima_measure_on_device_rename(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_ima_measure_on_device_resume(Ptr<misc.mapped_device> md, boolean swap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_ima_measure_on_table_clear(Ptr<misc.mapped_device> md, boolean new_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_ima_measure_on_table_load(Ptr<dm_table> table, @Unsigned int status_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_ima_reset_data(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dm_kcopyd_client> dm_kcopyd_client_create(Ptr<dm_kcopyd_throttle> throttle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_kcopyd_client_destroy(Ptr<dm_kcopyd_client> kc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_kcopyd_client_flush(Ptr<dm_kcopyd_client> kc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_kcopyd_copy(Ptr<dm_kcopyd_client> kc, Ptr<dm_io_region> from, @Unsigned int num_dests, Ptr<dm_io_region> dests, @Unsigned int flags, @OriginalName(value="dm_kcopyd_notify_fn") Ptr<?> fn, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_kcopyd_do_callback(Ptr<?> j, int read_err, @Unsigned long write_err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_kcopyd_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_kcopyd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dm_kcopyd_prepare_callback(Ptr<dm_kcopyd_client> kc, @OriginalName(value="dm_kcopyd_notify_fn") Ptr<?> fn, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_kcopyd_zero(Ptr<dm_kcopyd_client> kc, @Unsigned int num_dests, Ptr<dm_io_region> dests, @Unsigned int flags, @OriginalName(value="dm_kcopyd_notify_fn") Ptr<?> fn, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_linear_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_linear_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_mq_cleanup_mapped_device(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_mq_init_request(Ptr<BlkDefinitions.blk_mq_tag_set> set, Ptr<runtime.request> rq2, @Unsigned int hctx_idx, @Unsigned int numa_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_mq_init_request_queue(Ptr<misc.mapped_device> md, Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_mq_kick_requeue_list(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_mq_queue_rq($arg1, (const struct blk_mq_queue_data*)$arg2)")
    public static @OriginalName(value="blk_status_t") char dm_mq_queue_rq(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<BlkDefinitions.blk_mq_queue_data> bd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_request_based(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_requeue_original_request(Ptr<dm_rq_target_io> tio, boolean delay_requeue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_rq_bio_constructor(Ptr<runtime.bio> bio2, Ptr<runtime.bio> bio_orig, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_softirq_done(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_start_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_stop_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dm_destroy(Ptr<misc.mapped_device> md, boolean wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __dm_get_module_param(Ptr<@Unsigned Integer> module_param, @Unsigned int def, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dm_io_complete(Ptr<dm_io> io2, boolean first_stage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dm_pr_preempt(Ptr<dm_target> ti, Ptr<dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dm_pr_read_keys(Ptr<dm_target> ti, Ptr<dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dm_pr_read_reservation(Ptr<dm_target> ti, Ptr<dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dm_pr_register(Ptr<dm_target> ti, Ptr<dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dm_pr_release(Ptr<dm_target> ti, Ptr<dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dm_pr_reserve(Ptr<dm_target> ti, Ptr<dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dm_resume(Ptr<misc.mapped_device> md, Ptr<dm_table> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dm_suspend(Ptr<misc.mapped_device> md, Ptr<dm_table> map2, @Unsigned int suspend_flags, @Unsigned int task_state, int dmf_suspended_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_accept_partial_bio(Ptr<runtime.bio> bio2, @Unsigned int n_sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> dm_bio_from_per_bio_data(Ptr<?> data, @Unsigned long data_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_bio_get_target_bio_nr((const struct bio*)$arg1)")
    public static @Unsigned int dm_bio_get_target_bio_nr(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_blk_close(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_blk_getgeo(Ptr<BlockDefinitions.block_device> bdev, Ptr<misc.hd_geometry> geo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_blk_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_blk_open(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="blk_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_blk_report_zones(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned int nr_zones, @OriginalName(value="report_zones_cb") Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_cancel_deferred_remove(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dm_compat_ctl_ioctl(Ptr<runtime.file> file2, @Unsigned @OriginalName(value="uint") int command, @Unsigned @OriginalName(value="ulong") long u) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_copy_name_and_uuid(Ptr<misc.mapped_device> md, String name, String uuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_create(int minor, Ptr<Ptr<misc.mapped_device>> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dm_ctl_ioctl(Ptr<runtime.file> file2, @Unsigned @OriginalName(value="uint") int command, @Unsigned @OriginalName(value="ulong") long u) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dm_dax_direct_access(Ptr<DaxDefinitions.dax_device> dax_dev, @Unsigned long pgoff, long nr_pages, DaxDefinitions.dax_access_mode mode, Ptr<Ptr<?>> kaddr, Ptr<@OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dm_dax_recovery_write(Ptr<DaxDefinitions.dax_device> dax_dev, @Unsigned long pgoff, Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_dax_zero_page_range(Ptr<DaxDefinitions.dax_device> dax_dev, @Unsigned long pgoff, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_deferred_remove() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_deleting_md(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_destroy(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_destroy_immediate(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_device_count_zones_cb(Ptr<BlkDefinitions.blk_zone> zone2, @Unsigned int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dm_device_name($arg1))")
    public static String dm_device_name(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.gendisk> dm_disk(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_early_create(Ptr<dm_ioctl> dmi, Ptr<Ptr<dm_target_spec>> spec_array, Ptr<String> target_params_array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_free_md_mempools(Ptr<dm_md_mempools> pools) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_get(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int dm_get_event_nr(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.mapped_device> dm_get_from_kobject(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_get_geometry(Ptr<misc.mapped_device> md, Ptr<misc.hd_geometry> geo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TargetDefinitions.target_type> dm_get_immutable_target_type(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dm_table> dm_get_live_table(Ptr<misc.mapped_device> md, Ptr<Integer> srcu_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.mapped_device> dm_get_md(@Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static dm_queue_mode dm_get_md_type(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dm_get_mdptr(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dm_get_reserved_bio_based_ios() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_get_table_device(Ptr<misc.mapped_device> md, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="blk_mode_t") int mode, Ptr<Ptr<dm_dev>> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_hash_insert((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static int dm_hash_insert(String name, String uuid, Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_hash_remove_all(boolean keep_open_devices, boolean mark_deferred, boolean only_deferred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_hash_rename($arg1, (const u8*)$arg2)")
    public static Ptr<misc.mapped_device> dm_hash_rename(Ptr<dm_ioctl> param2, String _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_hold(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_interface_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_interface_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_internal_resume(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_internal_resume_fast(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_internal_suspend_fast(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_internal_suspend_noflush(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_io_acct(Ptr<dm_io> io2, boolean end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_io_rewind(Ptr<dm_io> io2, Ptr<BioDefinitions.bio_set> bs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_io_set_error(Ptr<dm_io> io2, @OriginalName(value="blk_status_t") char error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dm_is_zone_write(Ptr<misc.mapped_device> md, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_issue_global_event() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kobject> dm_kobject(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_kobject_uevent(Ptr<misc.mapped_device> md, KobjectDefinitions.kobject_action action, @Unsigned int cookie, boolean need_resize_uevent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_lock_for_deletion(Ptr<misc.mapped_device> md, boolean mark_deferred, boolean only_deferred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_lock_md_type(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="uint32_t") int dm_next_uevent_seq(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_noflush_suspending(Ptr<dm_target> ti) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_open_count(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dm_per_bio_data(Ptr<runtime.bio> bio2, @Unsigned long data_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int dm_poll(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_poll_bio(Ptr<runtime.bio> bio2, Ptr<IoDefinitions.io_comp_batch> iob, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_post_suspending(Ptr<dm_target> ti) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_pr_clear(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_pr_preempt(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long old_key, @Unsigned long new_key, PrDefinitions.pr_type type2, boolean abort) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_pr_read_keys(Ptr<BlockDefinitions.block_device> bdev, Ptr<PrDefinitions.pr_keys> keys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_pr_read_reservation(Ptr<BlockDefinitions.block_device> bdev, Ptr<PrDefinitions.pr_held_reservation> rsv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_pr_register(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long old_key, @Unsigned long new_key, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_pr_release(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long key2, PrDefinitions.pr_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_pr_reserve(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long key2, PrDefinitions.pr_type type2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_prepare_ioctl(Ptr<misc.mapped_device> md, Ptr<Integer> srcu_idx, Ptr<Ptr<BlockDefinitions.block_device>> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_put(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_put_live_table(Ptr<misc.mapped_device> md, int srcu_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_put_table_device(Ptr<misc.mapped_device> md, Ptr<dm_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_report_zones(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long sector, Ptr<dm_report_zones_args> args, @Unsigned int nr_zones) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_report_zones_cb(Ptr<BlkDefinitions.blk_zone> zone2, @Unsigned int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_resume(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_revalidate_zones(Ptr<dm_table> t, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_set_geometry(Ptr<misc.mapped_device> md, Ptr<misc.hd_geometry> geo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_set_md_type(Ptr<misc.mapped_device> md, dm_queue_mode type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_set_mdptr(Ptr<misc.mapped_device> md, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_set_target_max_io_len(Ptr<dm_target> ti, @Unsigned @OriginalName(value="sector_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_set_zones_restrictions(Ptr<dm_table> t, Ptr<RequestDefinitions.request_queue> q, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_setup_md_queue(Ptr<misc.mapped_device> md, Ptr<dm_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_split_and_process_bio(Ptr<misc.mapped_device> md, Ptr<dm_table> map2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_start_io_acct(Ptr<dm_io> io2, Ptr<runtime.bio> clone) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dm_start_time_ns_from_clone(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_submit_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_submit_bio_remap(Ptr<runtime.bio> clone, Ptr<runtime.bio> tgt_clone) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_suspend(Ptr<misc.mapped_device> md, @Unsigned int suspend_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_suspended(Ptr<dm_target> ti) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_suspended_internally_md(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_suspended_md(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dm_table> dm_swap_table(Ptr<misc.mapped_device> md, Ptr<dm_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_sync_table(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_test_deferred_remove_flag(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_uevent_add(Ptr<misc.mapped_device> md, Ptr<ListDefinitions.list_head> elist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_unlock_md_type(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_wait_event(Ptr<misc.mapped_device> md, int event_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_wait_for_bios_completion(Ptr<misc.mapped_device> md, @Unsigned int task_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_wait_for_completion(Ptr<misc.mapped_device> md, @Unsigned int task_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_wq_requeue_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_wq_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_zone_endio(Ptr<dm_io> io2, Ptr<runtime.bio> clone) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_zone_get_reset_bitmap(Ptr<misc.mapped_device> md, Ptr<dm_table> t, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned int nr_zones, Ptr<@Unsigned Long> need_reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_zone_need_reset_cb(Ptr<BlkDefinitions.blk_zone> zone2, @Unsigned int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dm_attr_name_show(Ptr<misc.mapped_device> md, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dm_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dm_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dm_attr_suspended_show(Ptr<misc.mapped_device> md, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dm_attr_use_blk_mq_show(Ptr<misc.mapped_device> md, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dm_attr_uuid_show(Ptr<misc.mapped_device> md, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_audit_log_bio((const u8*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static void dm_audit_log_bio(String dm_msg_prefix, String op, Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="sector_t") long sector, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_audit_log_ti($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void dm_audit_log_ti(int audit_type2, String dm_msg_prefix, String op, Ptr<dm_target> ti, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_get_target_type((const u8*)$arg1)")
    public static Ptr<TargetDefinitions.target_type> dm_get_target_type(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_init_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_kobject_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String dm_parse_device_entry(Ptr<dm_device> dev, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String dm_parse_table_entry(Ptr<dm_device> dev, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_path_uevent($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void dm_path_uevent(dm_uevent_type event_type, Ptr<dm_target> ti, String path2, @Unsigned int nr_valid_paths) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_put_target_type(Ptr<TargetDefinitions.target_type> tt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_register_target(Ptr<TargetDefinitions.target_type> tt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_send_uevents(Ptr<ListDefinitions.list_head> events, Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_stripe_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_stripe_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_sysfs_exit(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_sysfs_init(Ptr<misc.mapped_device> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_target_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_target_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dm_target_iterate((void (*)(struct target_type*, void*))$arg1, $arg2)")
    public static int dm_target_iterate(Ptr<?> iter_func, Ptr<?> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_uevent_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dm_uevent_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dm_unregister_target(Ptr<TargetDefinitions.target_type> tt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dm_hw_stat_delta")
    @NotUsableInJava
    public static class dm_hw_stat_delta
    extends Struct {
        public @Unsigned long last_rx;
        public @Unsigned long last_drop_val;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_file")
    @NotUsableInJava
    public static class dm_file
    extends Struct {
        public @Unsigned int global_event_nr;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_target_msg")
    @NotUsableInJava
    public static class dm_target_msg
    extends Struct {
        public @Unsigned long sector;
        public char @Size(value=0) [] message;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_target_versions")
    @NotUsableInJava
    public static class dm_target_versions
    extends Struct {
        public @Unsigned int next;
        public @Unsigned int @Size(value=3) [] version;
        public char @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_name_list")
    @NotUsableInJava
    public static class dm_name_list
    extends Struct {
        public @Unsigned long dev;
        public @Unsigned int next;
        public char @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_target_deps")
    @NotUsableInJava
    public static class dm_target_deps
    extends Struct {
        public @Unsigned int count;
        public @Unsigned int padding;
        public @Unsigned long @Size(value=0) [] dev;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_pr")
    @NotUsableInJava
    public static class dm_pr
    extends Struct {
        public @Unsigned long old_key;
        public @Unsigned long new_key;
        public @Unsigned int flags;
        public boolean abort;
        public boolean fail_early;
        public int ret;
        public PrDefinitions.pr_type type;
        public Ptr<PrDefinitions.pr_keys> read_keys;
        public Ptr<PrDefinitions.pr_held_reservation> rsv;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_zone_resource_limits")
    @NotUsableInJava
    public static class dm_zone_resource_limits
    extends Struct {
        public @Unsigned int mapped_nr_seq_zones;
        public Ptr<QueueDefinitions.queue_limits> lim;
        public boolean reliable_limits;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_device_zone_count")
    @NotUsableInJava
    public static class dm_device_zone_count
    extends Struct {
        public @Unsigned @OriginalName(value="sector_t") long start;
        public @Unsigned @OriginalName(value="sector_t") long len;
        public @Unsigned int total_nr_seq_zones;
        public @Unsigned int target_nr_seq_zones;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_verity_digest")
    @NotUsableInJava
    public static class dm_verity_digest
    extends Struct {
        public String alg;
        public Ptr<Character> digest;
        public @Unsigned long digest_len;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_rq_target_io")
    @NotUsableInJava
    public static class dm_rq_target_io
    extends Struct {
        public Ptr<misc.mapped_device> md;
        public Ptr<dm_target> ti;
        public Ptr<runtime.request> orig;
        public Ptr<runtime.request> clone;
        public KthreadDefinitions.kthread_work work;
        public @OriginalName(value="blk_status_t") char error;
        public MapDefinitions.map_info info;
        public dm_stats_aux stats_aux;
        public @Unsigned long duration_jiffies;
        public @Unsigned int n_sectors;
        public @Unsigned int completed;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_rq_clone_bio_info")
    @NotUsableInJava
    public static class dm_rq_clone_bio_info
    extends Struct {
        public Ptr<runtime.bio> orig;
        public Ptr<dm_rq_target_io> tio;
        public runtime.bio clone;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_kcopyd_client")
    @NotUsableInJava
    public static class dm_kcopyd_client
    extends Struct {
        public Ptr<PageDefinitions.page_list> pages;
        public @Unsigned int nr_reserved_pages;
        public @Unsigned int nr_free_pages;
        public @Unsigned int sub_job_size;
        public Ptr<dm_io_client> io_client;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head destroyq;
        public @OriginalName(value="mempool_t") MempoolDefinitions.mempool_s job_pool;
        public Ptr<WorkqueueDefinitions.workqueue_struct> kcopyd_wq;
        public misc.work_struct kcopyd_work;
        public Ptr<dm_kcopyd_throttle> throttle;
        public AtomicDefinitions.atomic_t nr_jobs;
        public @OriginalName(value="spinlock_t") runtime.spinlock job_lock;
        public ListDefinitions.list_head callback_jobs;
        public ListDefinitions.list_head complete_jobs;
        public ListDefinitions.list_head io_jobs;
        public ListDefinitions.list_head pages_jobs;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_kcopyd_throttle")
    @NotUsableInJava
    public static class dm_kcopyd_throttle
    extends Struct {
        public @Unsigned int throttle;
        public @Unsigned int num_io_jobs;
        public @Unsigned int io_period;
        public @Unsigned int total_period;
        public @Unsigned int last_jiffies;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_stat")
    @NotUsableInJava
    public static class dm_stat
    extends Struct {
        public ListDefinitions.list_head list_entry;
        public int id;
        public @Unsigned int stat_flags;
        public @Unsigned long n_entries;
        public @Unsigned @OriginalName(value="sector_t") long start;
        public @Unsigned @OriginalName(value="sector_t") long end;
        public @Unsigned @OriginalName(value="sector_t") long step;
        public @Unsigned int n_histogram_entries;
        public Ptr<@Unsigned Long> histogram_boundaries;
        public String program_id;
        public String aux_data;
        public misc.callback_head callback_head;
        public @Unsigned long shared_alloc_size;
        public @Unsigned long percpu_alloc_size;
        public @Unsigned long histogram_alloc_size;
        public Ptr<dm_stat_percpu> @Size(value=8192) [] stat_percpu;
        public dm_stat_shared @Size(value=0) [] stat_shared;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_stat_shared")
    @NotUsableInJava
    public static class dm_stat_shared
    extends Struct {
        public AtomicDefinitions.atomic_t @Size(value=2) [] in_flight;
        public @Unsigned long stamp;
        public dm_stat_percpu tmp;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_stat_percpu")
    @NotUsableInJava
    public static class dm_stat_percpu
    extends Struct {
        public @Unsigned long @Size(value=2) [] sectors;
        public @Unsigned long @Size(value=2) [] ios;
        public @Unsigned long @Size(value=2) [] merges;
        public @Unsigned long @Size(value=2) [] ticks;
        public @Unsigned long @Size(value=2) [] io_ticks;
        public @Unsigned long io_ticks_total;
        public @Unsigned long time_in_queue;
        public Ptr<@Unsigned Long> histogram;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_stats_last_position")
    @NotUsableInJava
    public static class dm_stats_last_position
    extends Struct {
        public @Unsigned @OriginalName(value="sector_t") long last_sector;
        public @Unsigned int last_rw;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_io_client")
    @NotUsableInJava
    public static class dm_io_client
    extends Struct {
        public @OriginalName(value="mempool_t") MempoolDefinitions.mempool_s pool;
        public BioDefinitions.bio_set bios;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_io_request")
    @NotUsableInJava
    public static class dm_io_request
    extends Struct {
        public @Unsigned @OriginalName(value="blk_opf_t") int bi_opf;
        public dm_io_memory mem;
        public dm_io_notify notify;
        public Ptr<dm_io_client> client;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_io_notify")
    @NotUsableInJava
    public static class dm_io_notify
    extends Struct {
        public @OriginalName(value="io_notify_fn") Ptr<?> fn;
        public Ptr<?> context;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_io_memory")
    @NotUsableInJava
    public static class dm_io_memory
    extends Struct {
        public dm_io_mem_type type;
        public @Unsigned int offset;
        public misc.ptr_of_dm_io_memory ptr;
    }

    @Type(noCCodeGeneration=true, cType="enum dm_io_mem_type")
    public static enum dm_io_mem_type implements Enum<dm_io_mem_type>,
    TypedEnum<dm_io_mem_type, Integer>
    {
        DM_IO_PAGE_LIST,
        DM_IO_BIO,
        DM_IO_VMA,
        DM_IO_KMEM;

    }

    @Type(noCCodeGeneration=true, cType="struct dm_io_region")
    @NotUsableInJava
    public static class dm_io_region
    extends Struct {
        public Ptr<BlockDefinitions.block_device> bdev;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned @OriginalName(value="sector_t") long count;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_crypto_profile")
    @NotUsableInJava
    public static class dm_crypto_profile
    extends Struct {
        public BlkDefinitions.blk_crypto_profile profile;
        public Ptr<misc.mapped_device> md;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_dev_internal")
    @NotUsableInJava
    public static class dm_dev_internal
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public Ptr<dm_dev> dm_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_arg")
    @NotUsableInJava
    public static class dm_arg
    extends Struct {
        public @Unsigned int min;
        public @Unsigned int max;
        public String error;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_arg_set")
    @NotUsableInJava
    public static class dm_arg_set
    extends Struct {
        public @Unsigned int argc;
        public Ptr<String> argv;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_sysfs_attr")
    @NotUsableInJava
    public static class dm_sysfs_attr
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_target_io")
    @NotUsableInJava
    public static class dm_target_io
    extends Struct {
        public @Unsigned short magic;
        public @Unsigned @OriginalName(value="blk_short_t") short flags;
        public @Unsigned int target_bio_nr;
        public Ptr<dm_io> io;
        public Ptr<dm_target> ti;
        public Ptr<@Unsigned Integer> len_ptr;
        public @Unsigned @OriginalName(value="sector_t") long old_sector;
        public runtime.bio clone;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_io")
    @NotUsableInJava
    public static class dm_io
    extends Struct {
        public @Unsigned short magic;
        public @Unsigned @OriginalName(value="blk_short_t") short flags;
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned long start_time;
        public Ptr<?> data;
        public Ptr<dm_io> next;
        public dm_stats_aux stats_aux;
        public @OriginalName(value="blk_status_t") char status;
        public AtomicDefinitions.atomic_t io_count;
        public Ptr<misc.mapped_device> md;
        public Ptr<runtime.bio> orig_bio;
        public @Unsigned int sector_offset;
        public @Unsigned int sectors;
        public dm_target_io tio;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_md_mempools")
    @NotUsableInJava
    public static class dm_md_mempools
    extends Struct {
        public BioDefinitions.bio_set bs;
        public BioDefinitions.bio_set io_bs;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_kobject_holder")
    @NotUsableInJava
    public static class dm_kobject_holder
    extends Struct {
        public runtime.kobject kobj;
        public runtime.completion completion;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_ima_measurements")
    @NotUsableInJava
    public static class dm_ima_measurements
    extends Struct {
        public dm_ima_device_table_metadata active_table;
        public dm_ima_device_table_metadata inactive_table;
        public @Unsigned int dm_version_str_len;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_ima_device_table_metadata")
    @NotUsableInJava
    public static class dm_ima_device_table_metadata
    extends Struct {
        public String device_metadata;
        public @Unsigned int device_metadata_len;
        public @Unsigned int num_targets;
        public String hash;
        public @Unsigned int hash_len;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_stats_aux")
    @NotUsableInJava
    public static class dm_stats_aux
    extends Struct {
        public boolean merged;
        public @Unsigned long duration_ns;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_stats")
    @NotUsableInJava
    public static class dm_stats
    extends Struct {
        public runtime.mutex mutex;
        public ListDefinitions.list_head list;
        public Ptr<dm_stats_last_position> last;
        public boolean precise_timestamps;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_table")
    @NotUsableInJava
    public static class dm_table
    extends Struct {
        public Ptr<misc.mapped_device> md;
        public dm_queue_mode type;
        public @Unsigned int depth;
        public @Unsigned int @Size(value=16) [] counts;
        public Ptr<@Unsigned @OriginalName(value="sector_t") Long> @Size(value=16) [] index;
        public @Unsigned int num_targets;
        public @Unsigned int num_allocated;
        public Ptr<@Unsigned @OriginalName(value="sector_t") Long> highs;
        public Ptr<dm_target> targets;
        public Ptr<TargetDefinitions.target_type> immutable_target_type;
        public boolean integrity_supported;
        public boolean singleton;
        public boolean flush_bypasses_map;
        public @Unsigned @OriginalName(value="blk_mode_t") int mode;
        public ListDefinitions.list_head devices;
        public misc.rw_semaphore devices_lock;
        public Ptr<?> event_fn;
        public Ptr<?> event_context;
        public Ptr<dm_md_mempools> mempools;
        public Ptr<BlkDefinitions.blk_crypto_profile> crypto_profile;
    }

    @Type(noCCodeGeneration=true, cType="enum dm_queue_mode")
    public static enum dm_queue_mode implements Enum<dm_queue_mode>,
    TypedEnum<dm_queue_mode, Integer>
    {
        DM_TYPE_NONE,
        DM_TYPE_BIO_BASED,
        DM_TYPE_REQUEST_BASED,
        DM_TYPE_DAX_BIO_BASED;

    }

    @Type(noCCodeGeneration=true, cType="struct dm_uevent")
    @NotUsableInJava
    public static class dm_uevent
    extends Struct {
        public Ptr<misc.mapped_device> md;
        public KobjectDefinitions.kobject_action action;
        public KobjDefinitions.kobj_uevent_env ku_env;
        public ListDefinitions.list_head elist;
        public char @Size(value=128) [] name;
        public char @Size(value=129) [] uuid;
    }

    @Type(noCCodeGeneration=true, cType="enum dm_uevent_type")
    public static enum dm_uevent_type implements Enum<dm_uevent_type>,
    TypedEnum<dm_uevent_type, Integer>
    {
        DM_UEVENT_PATH_FAILED,
        DM_UEVENT_PATH_REINSTATED;

    }

    @Type(noCCodeGeneration=true, cType="struct dm_dev")
    @NotUsableInJava
    public static class dm_dev
    extends Struct {
        public Ptr<BlockDefinitions.block_device> bdev;
        public Ptr<runtime.file> bdev_file;
        public Ptr<DaxDefinitions.dax_device> dax_dev;
        public @Unsigned @OriginalName(value="blk_mode_t") int mode;
        public char @Size(value=16) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_report_zones_args")
    @NotUsableInJava
    public static class dm_report_zones_args
    extends Struct {
        public Ptr<dm_target> tgt;
        public @Unsigned @OriginalName(value="sector_t") long next_sector;
        public Ptr<?> orig_data;
        public @OriginalName(value="report_zones_cb") Ptr<?> orig_cb;
        public @Unsigned int zone_idx;
        public @Unsigned @OriginalName(value="sector_t") long start;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_target")
    @NotUsableInJava
    public static class dm_target
    extends Struct {
        public Ptr<dm_table> table;
        public Ptr<TargetDefinitions.target_type> type;
        public @Unsigned @OriginalName(value="sector_t") long begin;
        public @Unsigned @OriginalName(value="sector_t") long len;
        public @Unsigned @OriginalName(value="uint32_t") int max_io_len;
        public @Unsigned int num_flush_bios;
        public @Unsigned int num_discard_bios;
        public @Unsigned int num_secure_erase_bios;
        public @Unsigned int num_write_zeroes_bios;
        public @Unsigned int per_io_data_size;
        public Ptr<?> _private;
        public String error;
        public boolean flush_supported;
        public boolean discards_supported;
        public boolean zone_reset_all_supported;
        public boolean max_discard_granularity;
        public boolean limit_swap_bios;
        public boolean emulate_zone_append;
        public boolean accounts_remapped_io;
        public boolean needs_bio_set_dev;
        public boolean flush_bypasses_map;
        public boolean mempool_needs_integrity;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_device")
    @NotUsableInJava
    public static class dm_device
    extends Struct {
        public dm_ioctl dmi;
        public Ptr<dm_target_spec> @Size(value=256) [] table;
        public String @Size(value=256) [] target_args_array;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_target_spec")
    @NotUsableInJava
    public static class dm_target_spec
    extends Struct {
        public @Unsigned long sector_start;
        public @Unsigned long length;
        public int status;
        public @Unsigned int next;
        public char @Size(value=16) [] target_type;
    }

    @Type(noCCodeGeneration=true, cType="struct dm_ioctl")
    @NotUsableInJava
    public static class dm_ioctl
    extends Struct {
        public @Unsigned int @Size(value=3) [] version;
        public @Unsigned int data_size;
        public @Unsigned int data_start;
        public @Unsigned int target_count;
        public int open_count;
        public @Unsigned int flags;
        public @Unsigned int event_nr;
        public @Unsigned int padding;
        public @Unsigned long dev;
        public char @Size(value=128) [] name;
        public char @Size(value=129) [] uuid;
        public char @Size(value=7) [] data;
    }
}

