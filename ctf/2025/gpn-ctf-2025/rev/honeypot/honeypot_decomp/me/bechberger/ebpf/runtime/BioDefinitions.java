/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.MempoolDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class BioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bio_crypt_advance(Ptr<runtime.bio> bio2, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bio_crypt_clone(Ptr<runtime.bio> dst, Ptr<runtime.bio> src, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bio_crypt_free_ctx(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __bio_integrity_endio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_crypt_ctx_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bio_crypt_ctx_mergeable(Ptr<bio_crypt_ctx> bc1, @Unsigned int bc1_bytes, Ptr<bio_crypt_ctx> bc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_crypt_dun_increment(Ptr<@Unsigned Long> dun, @Unsigned int inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bio_crypt_dun_is_contiguous((const struct bio_crypt_ctx*)$arg1, $arg2, (const long long unsigned int*)$arg3)")
    public static boolean bio_crypt_dun_is_contiguous(Ptr<bio_crypt_ctx> bc, @Unsigned int bytes, Ptr<@Unsigned Long> next_dun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bio_crypt_rq_ctx_compatible(Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bio_crypt_set_ctx($arg1, (const struct blk_crypto_key*)$arg2, (const long long unsigned int*)$arg3, $arg4)")
    public static void bio_crypt_set_ctx(Ptr<runtime.bio> bio2, Ptr<BlkDefinitions.blk_crypto_key> key2, Ptr<@Unsigned Long> dun, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_get_page(Ptr<runtime.dpages> dp, Ptr<Ptr<runtime.page>> p, Ptr<@Unsigned Long> len, Ptr<@Unsigned Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_integrity_add_page(Ptr<runtime.bio> bio2, Ptr<runtime.page> page2, @Unsigned int len, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_integrity_advance(Ptr<runtime.bio> bio2, @Unsigned int bytes_done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bio_integrity_payload> bio_integrity_alloc(Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int nr_vecs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_integrity_clone(Ptr<runtime.bio> bio2, Ptr<runtime.bio> bio_src, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_integrity_copy_user(Ptr<runtime.bio> bio2, Ptr<bio_vec> bvec, int nr_vecs, @Unsigned int len, @Unsigned int direction, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_integrity_free(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_integrity_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_integrity_init_user(Ptr<runtime.bio> bio2, Ptr<bio_vec> bvec, int nr_vecs, @Unsigned int len, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_integrity_map_user(Ptr<runtime.bio> bio2, Ptr<?> ubuf, @OriginalName(value="ssize_t") long bytes, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bio_integrity_prep(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_integrity_trim(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_integrity_unmap_user(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_integrity_unpin_bvec(Ptr<bio_vec> bv, int nr_vecs, boolean dirty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_integrity_verify_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_next_page(Ptr<runtime.dpages> dp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_post_read_processing(Ptr<bio_post_read_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bio_add_page(Ptr<runtime.bio> bio2, Ptr<runtime.page> page2, @Unsigned int len, @Unsigned int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bio_advance(Ptr<runtime.bio> bio2, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bio_clone(Ptr<runtime.bio> bio2, Ptr<runtime.bio> bio_src, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bio_iov_iter_get_pages(Ptr<runtime.bio> bio2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bio_release_pages(Ptr<runtime.bio> bio2, boolean mark_dirty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bio_add_folio(Ptr<runtime.bio> bio2, Ptr<runtime.folio> folio2, @Unsigned long len, @Unsigned long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_add_folio_nofail(Ptr<runtime.bio> bio2, Ptr<runtime.folio> folio2, @Unsigned long len, @Unsigned long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_add_hw_folio(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2, Ptr<runtime.folio> folio2, @Unsigned long len, @Unsigned long offset, @Unsigned int max_sectors, Ptr<@OriginalName(value="bool") Boolean> same_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_add_hw_page(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2, Ptr<runtime.page> page2, @Unsigned int len, @Unsigned int offset, @Unsigned int max_sectors, Ptr<@OriginalName(value="bool") Boolean> same_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_add_page(Ptr<runtime.bio> bio2, Ptr<runtime.page> page2, @Unsigned int len, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_add_pc_page(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2, Ptr<runtime.page> page2, @Unsigned int len, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_add_zone_append_page(Ptr<runtime.bio> bio2, Ptr<runtime.page> page2, @Unsigned int len, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> bio_alloc_bioset(Ptr<BlockDefinitions.block_device> bdev, @Unsigned short nr_vecs, @Unsigned @OriginalName(value="blk_opf_t") int opf, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<bio_set> bs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_alloc_cache_prune(Ptr<bio_alloc_cache> cache, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> bio_alloc_clone(Ptr<BlockDefinitions.block_device> bdev, Ptr<runtime.bio> bio_src, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<bio_set> bs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_alloc_irq_cache_splice(Ptr<bio_alloc_cache> cache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_alloc_rescue(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_associate_blkg(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_associate_blkg_from_css(Ptr<runtime.bio> bio2, Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static bio_merge_status bio_attempt_back_merge(Ptr<runtime.request> req2, Ptr<runtime.bio> bio2, @Unsigned int nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static bio_merge_status bio_attempt_discard_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> req2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static bio_merge_status bio_attempt_front_merge(Ptr<runtime.request> req2, Ptr<runtime.bio> bio2, @Unsigned int nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_await_chain(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> bio_blkcg_css(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_chain(Ptr<runtime.bio> bio2, Ptr<runtime.bio> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> bio_chain_and_submit(Ptr<runtime.bio> prev, Ptr<runtime.bio> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_chain_endio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_check_pages_dirty(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_clone_blkg_association(Ptr<runtime.bio> dst, Ptr<runtime.bio> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_cmd_bio_end_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_copy_data(Ptr<runtime.bio> dst, Ptr<runtime.bio> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_copy_data_iter(Ptr<runtime.bio> dst, Ptr<misc.bvec_iter> dst_iter, Ptr<runtime.bio> src, Ptr<misc.bvec_iter> src_iter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_cpu_dead(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_crypt_do_front_merge(Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_dirty_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_endio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_free(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_free_pages(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_init(Ptr<runtime.bio> bio2, Ptr<BlockDefinitions.block_device> bdev, Ptr<bio_vec> table, @Unsigned short max_vecs, @Unsigned @OriginalName(value="blk_opf_t") int opf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_init_clone(Ptr<BlockDefinitions.block_device> bdev, Ptr<runtime.bio> bio2, Ptr<runtime.bio> bio_src, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_iov_bvec_set(Ptr<runtime.bio> bio2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_iov_iter_get_pages(Ptr<runtime.bio> bio2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> bio_kmalloc(@Unsigned short nr_vecs, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_put(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_reset(Ptr<runtime.bio> bio2, Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_opf_t") int opf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_set_pages_dirty(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> bio_split(Ptr<runtime.bio> bio2, int sectors, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<bio_set> bs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bio_split_discard($arg1, (const struct queue_limits*)$arg2, $arg3)")
    public static Ptr<runtime.bio> bio_split_discard(Ptr<runtime.bio> bio2, Ptr<QueueDefinitions.queue_limits> lim, Ptr<@Unsigned Integer> nsegs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bio_split_rw($arg1, (const struct queue_limits*)$arg2, $arg3)")
    public static Ptr<runtime.bio> bio_split_rw(Ptr<runtime.bio> bio2, Ptr<QueueDefinitions.queue_limits> lim, Ptr<@Unsigned Integer> nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bio_split_rw_at($arg1, (const struct queue_limits*)$arg2, $arg3, $arg4)")
    public static int bio_split_rw_at(Ptr<runtime.bio> bio2, Ptr<QueueDefinitions.queue_limits> lim, Ptr<@Unsigned Integer> segs, @Unsigned int max_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> bio_split_to_limits(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bio_split_write_zeroes($arg1, (const struct queue_limits*)$arg2, $arg3)")
    public static Ptr<runtime.bio> bio_split_write_zeroes(Ptr<runtime.bio> bio2, Ptr<QueueDefinitions.queue_limits> lim, Ptr<@Unsigned Integer> nsegs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bio_split_zone_append($arg1, (const struct queue_limits*)$arg2, $arg3)")
    public static Ptr<runtime.bio> bio_split_zone_append(Ptr<runtime.bio> bio2, Ptr<QueueDefinitions.queue_limits> lim, Ptr<@Unsigned Integer> nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> bio_submit_split(Ptr<runtime.bio> bio2, int split_sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_trim(Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned @OriginalName(value="sector_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_uninit(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_wait_end_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bio_will_gap(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> prev_rq, Ptr<runtime.bio> prev, Ptr<runtime.bio> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bio_queue_enter(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_end_io_acct_remapped(Ptr<runtime.bio> bio2, @Unsigned long start_time, Ptr<BlockDefinitions.block_device> orig_bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_poll(Ptr<runtime.bio> bio2, Ptr<IoDefinitions.io_comp_batch> iob, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bio_start_io_acct(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<bio_map_data> bio_alloc_map_data(Ptr<IovDefinitions.iov_iter> data, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_associate_blkg_from_page(Ptr<runtime.bio> bio2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_copy_from_iter(Ptr<runtime.bio> bio2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> bio_copy_kern(Ptr<RequestDefinitions.request_queue> q, Ptr<?> data, @Unsigned int len, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int reading) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_copy_kern_endio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_copy_kern_endio_read(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_copy_user_iov(Ptr<runtime.request> rq2, Ptr<RqDefinitions.rq_map_data> map_data, Ptr<IovDefinitions.iov_iter> iter2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bio_map_kern_endio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bio_map_user_iov(Ptr<runtime.request> rq2, Ptr<IovDefinitions.iov_iter> iter2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct bio_fallback_crypt_ctx")
    @NotUsableInJava
    public static class bio_fallback_crypt_ctx
    extends Struct {
        public bio_crypt_ctx crypt_ctx;
        public misc.bvec_iter crypt_iter;
        @InlineUnion(value=63438)
        public  @InlineUnion(value=63438) AnonDefinitions.anon_member_of_anon_member_of_bio_fallback_crypt_ctx anon2$0;
        @InlineUnion(value=63438)
        public  @InlineUnion(value=63438) AnonDefinitions.anon_member_of_anon_member_of_bio_fallback_crypt_ctx anon2$1;
    }

    @Type(noCCodeGeneration=true, cType="enum bio_merge_status")
    public static enum bio_merge_status implements Enum<bio_merge_status>,
    TypedEnum<bio_merge_status, Integer>
    {
        BIO_MERGE_OK,
        BIO_MERGE_NONE,
        BIO_MERGE_FAILED;

    }

    @Type(noCCodeGeneration=true, cType="struct bio_slab")
    @NotUsableInJava
    public static class bio_slab
    extends Struct {
        public Ptr<KmemDefinitions.kmem_cache> slab;
        public @Unsigned int slab_ref;
        public @Unsigned int slab_size;
        public char @Size(value=8) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct bio_alloc_cache")
    @NotUsableInJava
    public static class bio_alloc_cache
    extends Struct {
        public Ptr<runtime.bio> free_list;
        public Ptr<runtime.bio> free_list_irq;
        public @Unsigned int nr;
        public @Unsigned int nr_irq;
    }

    @Type(noCCodeGeneration=true, cType="struct bio_post_read_ctx")
    @NotUsableInJava
    public static class bio_post_read_ctx
    extends Struct {
        public Ptr<runtime.bio> bio;
        public misc.work_struct work;
        public @Unsigned int cur_step;
        public @Unsigned int enabled_steps;
    }

    @Type(noCCodeGeneration=true, cType="enum bio_post_read_step")
    public static enum bio_post_read_step implements Enum<bio_post_read_step>,
    TypedEnum<bio_post_read_step, Integer>
    {
        STEP_INITIAL,
        STEP_DECRYPT,
        STEP_VERITY,
        STEP_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct bio_map_data")
    @NotUsableInJava
    public static class bio_map_data
    extends Struct {
        public boolean is_our_pages;
        public boolean is_null_mapped;
        public IovDefinitions.iov_iter iter;
        public runtime.iovec @Size(value=0) [] iov;
    }

    @Type(noCCodeGeneration=true, cType="struct bio_integrity_payload")
    @NotUsableInJava
    public static class bio_integrity_payload
    extends Struct {
        public Ptr<runtime.bio> bip_bio;
        public misc.bvec_iter bip_iter;
        public @Unsigned short bip_vcnt;
        public @Unsigned short bip_max_vcnt;
        public @Unsigned short bip_flags;
        public misc.bvec_iter bio_iter;
        public misc.work_struct bip_work;
        public Ptr<bio_vec> bip_vec;
        public bio_vec @Size(value=0) [] bip_inline_vecs;
    }

    @Type(noCCodeGeneration=true, cType="struct bio_crypt_ctx")
    @NotUsableInJava
    public static class bio_crypt_ctx
    extends Struct {
        public Ptr<BlkDefinitions.blk_crypto_key> bc_key;
        public @Unsigned long @Size(value=4) [] bc_dun;
    }

    @Type(noCCodeGeneration=true, cType="struct bio_set")
    @NotUsableInJava
    public static class bio_set
    extends Struct {
        public Ptr<KmemDefinitions.kmem_cache> bio_slab;
        public @Unsigned int front_pad;
        public Ptr<bio_alloc_cache> cache;
        public @OriginalName(value="mempool_t") MempoolDefinitions.mempool_s bio_pool;
        public @OriginalName(value="mempool_t") MempoolDefinitions.mempool_s bvec_pool;
        public @OriginalName(value="mempool_t") MempoolDefinitions.mempool_s bio_integrity_pool;
        public @OriginalName(value="mempool_t") MempoolDefinitions.mempool_s bvec_integrity_pool;
        public @Unsigned int back_pad;
        public  @OriginalName(value="spinlock_t") runtime.spinlock rescue_lock;
        public bio_list rescue_list;
        public misc.work_struct rescue_work;
        public Ptr<WorkqueueDefinitions.workqueue_struct> rescue_workqueue;
        public misc.hlist_node cpuhp_dead;
    }

    @Type(noCCodeGeneration=true, cType="struct bio_issue")
    @NotUsableInJava
    public static class bio_issue
    extends Struct {
        public @Unsigned long value;
    }

    @Type(noCCodeGeneration=true, cType="struct bio_vec")
    @NotUsableInJava
    public static class bio_vec
    extends Struct {
        public Ptr<runtime.page> bv_page;
        public @Unsigned int bv_len;
        public @Unsigned int bv_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct bio_list")
    @NotUsableInJava
    public static class bio_list
    extends Struct {
        public Ptr<runtime.bio> head;
        public Ptr<runtime.bio> tail;
    }
}

