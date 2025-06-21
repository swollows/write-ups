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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BackingDefinitions;
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BlkifDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.ElevatorDefinitions;
import me.bechberger.ebpf.runtime.ElvDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PrintDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.SbitmapDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkcipherDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class BlkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__blk_add_trace($arg1, $arg2, $arg3, (const unsigned int)$arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static void __blk_add_trace(Ptr<blk_trace> bt, @Unsigned @OriginalName(value="sector_t") long sector, int bytes, @Unsigned @OriginalName(value="blk_opf_t") int opf, @Unsigned int what, int error, int pdu_len, Ptr<?> pdu_data, @Unsigned long cgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.gendisk> __blk_alloc_disk(Ptr<QueueDefinitions.queue_limits> lim, int node2, Ptr<LockDefinitions.lock_class_key> lkclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __blk_crypto_bio_prep(Ptr<Ptr<runtime.bio>> bio_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_crypto_free_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blk_crypto_rq_bio_prep(Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char __blk_crypto_rq_get_keyslot(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_crypto_rq_put_keyslot(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __blk_mark_disk_dead(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blk_mq_debugfs_rq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __blk_throtl_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__blk_trace_note_message($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void __blk_trace_note_message(Ptr<blk_trace> bt, Ptr<CgroupDefinitions.cgroup_subsys_state> css, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blk_trace_remove(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blk_trace_setup(Ptr<RequestDefinitions.request_queue> q, String name, @Unsigned @OriginalName(value="dev_t") int dev, Ptr<BlockDefinitions.block_device> bdev, String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_driver_data(Ptr<runtime.request> rq2, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_bio_backmerge(Ptr<?> ignore, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_bio_bounce(Ptr<?> ignore, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_bio_complete(Ptr<?> ignore, Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_bio_frontmerge(Ptr<?> ignore, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_bio_queue(Ptr<?> ignore, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_bio_remap(Ptr<?> ignore, Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_getrq(Ptr<?> ignore, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_plug(Ptr<?> ignore, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_rq(Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error, @Unsigned int nr_bytes, @Unsigned int what, @Unsigned long cgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_rq_complete(Ptr<?> ignore, Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error, @Unsigned int nr_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_rq_insert(Ptr<?> ignore, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_rq_issue(Ptr<?> ignore, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_rq_merge(Ptr<?> ignore, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_rq_remap(Ptr<?> ignore, Ptr<runtime.request> rq2, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="sector_t") long from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_rq_requeue(Ptr<?> ignore, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_split(Ptr<?> ignore, Ptr<runtime.bio> bio2, @Unsigned int pdu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_trace_unplug(Ptr<?> ignore, Ptr<RequestDefinitions.request_queue> q, @Unsigned int depth, boolean explicit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> blk_alloc_discard_bio(Ptr<BlockDefinitions.block_device> bdev, Ptr<@Unsigned @OriginalName(value="sector_t") Long> sector, Ptr<@Unsigned @OriginalName(value="sector_t") Long> nr_sects, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_alloc_ext_minor() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_create_buf_file_callback((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<runtime.dentry> blk_create_buf_file_callback(String filename2, Ptr<runtime.dentry> parent, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<misc.rchan_buf> buf, Ptr<Integer> is_global) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_config_supported($arg1, (const struct blk_crypto_config*)$arg2)")
    public static boolean blk_crypto_config_supported(Ptr<BlockDefinitions.block_device> bdev, Ptr<blk_crypto_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_config_supported_natively($arg1, (const struct blk_crypto_config*)$arg2)")
    public static boolean blk_crypto_config_supported_natively(Ptr<BlockDefinitions.block_device> bdev, Ptr<blk_crypto_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_evict_key($arg1, (const struct blk_crypto_key*)$arg2)")
    public static void blk_crypto_evict_key(Ptr<BlockDefinitions.block_device> bdev, Ptr<blk_crypto_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_init_key($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int blk_crypto_init_key(Ptr<blk_crypto_key> blk_key, Ptr<Character> raw_key, blk_crypto_mode_num crypto_mode, @Unsigned int dun_bytes, @Unsigned int data_unit_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_start_using_key($arg1, (const struct blk_crypto_key*)$arg2)")
    public static int blk_crypto_start_using_key(Ptr<BlockDefinitions.block_device> bdev, Ptr<blk_crypto_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_dropped_read(Ptr<runtime.file> filp, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_fill_rwbs(String rwbs, @Unsigned @OriginalName(value="blk_opf_t") int opf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_flags_show($arg1, (const long unsigned int)$arg2, (const u8**)$arg3, $arg4)")
    public static int blk_flags_show(Ptr<SeqDefinitions.seq_file> m, @Unsigned long flags, Ptr<String> flag_name, int flag_name_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_flush_integrity() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_free_ext_minor(@Unsigned int minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_ioc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_log_action($arg1, (const u8*)$arg2, $arg3)")
    public static void blk_log_action(Ptr<TraceDefinitions.trace_iterator> iter2, String act, boolean has_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_log_action_classic($arg1, (const u8*)$arg2, $arg3)")
    public static void blk_log_action_classic(Ptr<TraceDefinitions.trace_iterator> iter2, String act, boolean has_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_log_dump_pdu($arg1, (const struct trace_entry*)$arg2, $arg3)")
    public static void blk_log_dump_pdu(Ptr<TraceDefinitions.trace_seq> s2, Ptr<TraceDefinitions.trace_entry> ent, boolean has_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_log_generic($arg1, (const struct trace_entry*)$arg2, $arg3)")
    public static void blk_log_generic(Ptr<TraceDefinitions.trace_seq> s2, Ptr<TraceDefinitions.trace_entry> ent, boolean has_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_log_plug($arg1, (const struct trace_entry*)$arg2, $arg3)")
    public static void blk_log_plug(Ptr<TraceDefinitions.trace_seq> s2, Ptr<TraceDefinitions.trace_entry> ent, boolean has_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_log_remap($arg1, (const struct trace_entry*)$arg2, $arg3)")
    public static void blk_log_remap(Ptr<TraceDefinitions.trace_seq> s2, Ptr<TraceDefinitions.trace_entry> ent, boolean has_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_log_split($arg1, (const struct trace_entry*)$arg2, $arg3)")
    public static void blk_log_split(Ptr<TraceDefinitions.trace_seq> s2, Ptr<TraceDefinitions.trace_entry> ent, boolean has_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_log_unplug($arg1, (const struct trace_entry*)$arg2, $arg3)")
    public static void blk_log_unplug(Ptr<TraceDefinitions.trace_seq> s2, Ptr<TraceDefinitions.trace_entry> ent, boolean has_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_log_with_error($arg1, (const struct trace_entry*)$arg2, $arg3)")
    public static void blk_log_with_error(Ptr<TraceDefinitions.trace_seq> s2, Ptr<TraceDefinitions.trace_entry> ent, boolean has_cg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mark_disk_dead(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_ctx_sysfs_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_debugfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_register(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_register_hctx(Ptr<RequestDefinitions.request_queue> q, Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_register_hctxs(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_register_rqos(Ptr<RqDefinitions.rq_qos> rqos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_register_sched(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_register_sched_hctx(Ptr<RequestDefinitions.request_queue> q, Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_debugfs_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_debugfs_rq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_debugfs_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_tags_show(Ptr<SeqDefinitions.seq_file> m, Ptr<blk_mq_tags> tags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_unregister_hctx(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_unregister_hctxs(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_unregister_rqos(Ptr<RqDefinitions.rq_qos> rqos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_unregister_sched(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_debugfs_unregister_sched_hctx(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_mq_debugfs_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long blk_mq_debugfs_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_hctx_kobj_init(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_mq_hw_sysfs_cpus_show(Ptr<blk_mq_hw_ctx> hctx, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_mq_hw_sysfs_nr_reserved_tags_show(Ptr<blk_mq_hw_ctx> hctx, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_mq_hw_sysfs_nr_tags_show(Ptr<blk_mq_hw_ctx> hctx, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_hw_sysfs_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_mq_hw_sysfs_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_pci_map_queues(Ptr<blk_mq_queue_map> qmap, Ptr<PciDefinitions.pci_dev> pdev, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short blk_mq_queue_attr_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_register_hctx(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_sysfs_deinit(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_sysfs_init(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_sysfs_register(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_sysfs_register_hctxs(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_sysfs_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_sysfs_unregister(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_sysfs_unregister_hctxs(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_msg_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long blk_msg_write(Ptr<runtime.file> filp, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_queue_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_register_queue(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_register_tracepoints() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_remove_buf_file_callback(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_report_disk_dead(Ptr<runtime.gendisk> disk, boolean surprise) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_request_module(@Unsigned @OriginalName(value="dev_t") int devt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_subbuf_start_callback(Ptr<misc.rchan_buf> buf, Ptr<?> subbuf, Ptr<?> prev_subbuf, @Unsigned long prev_padding) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_throtl_cancel_bios(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_throtl_dispatch_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_throtl_exit(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_throtl_init(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t blk_trace_event_print(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t blk_trace_event_print_binary(Ptr<TraceDefinitions.trace_iterator> iter2, int flags, Ptr<TraceDefinitions.trace_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_trace_free(Ptr<RequestDefinitions.request_queue> q, Ptr<blk_trace> bt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_trace_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned int cmd, String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_trace_remove(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long blk_trace_request_get_cgid(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_trace_setup(Ptr<RequestDefinitions.request_queue> q, String name, @Unsigned @OriginalName(value="dev_t") int dev, Ptr<BlockDefinitions.block_device> bdev, String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_trace_setup_queue(Ptr<RequestDefinitions.request_queue> q, Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_trace_shutdown(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_trace_start(Ptr<blk_trace> bt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_trace_startstop(Ptr<RequestDefinitions.request_queue> q, int start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_tracer_init(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_tracer_print_header(Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrintDefinitions.print_line_t blk_tracer_print_line(Ptr<TraceDefinitions.trace_iterator> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_tracer_reset(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_tracer_set_flag(Ptr<TraceDefinitions.trace_array> tr, @Unsigned int old_flags, @Unsigned int bit, int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_tracer_start(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_tracer_stop(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_unregister_queue(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blk_bios_map_sg(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2, Ptr<runtime.scatterlist> sglist, Ptr<Ptr<runtime.scatterlist>> sg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blk_mq_get_tag(Ptr<blk_mq_alloc_data> data, Ptr<SbitmapDefinitions.sbitmap_queue> bt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_mq_tag_busy(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_mq_tag_idle(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blk_rq_map_sg(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, Ptr<runtime.scatterlist> sglist, Ptr<Ptr<runtime.scatterlist>> last_sg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_account_io_merge_bio(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_add_partitions(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_apply_bdi_limits(Ptr<BackingDefinitions.backing_dev_info> bdi, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static BioDefinitions.bio_merge_status blk_attempt_bio_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2, @Unsigned int nr_segs, boolean sched_allow_merge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_attempt_plug_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2, @Unsigned int nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_attempt_req_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, Ptr<runtime.request> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_bio_list_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<ListDefinitions.list_head> list, Ptr<runtime.bio> bio2, @Unsigned int nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_cgroup_bio_start(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_cgroup_congested() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_cmd_complete(Ptr<IoDefinitions.io_uring_cmd> cmd, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_crypto_fallback_alloc_cipher_req(Ptr<blk_crypto_keyslot> slot2, Ptr<Ptr<SkcipherDefinitions.skcipher_request>> ciph_req_ret, Ptr<CryptoDefinitions.crypto_wait> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_crypto_fallback_bio_prep(Ptr<Ptr<runtime.bio>> bio_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> blk_crypto_fallback_clone_bio(Ptr<runtime.bio> bio_src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_fallback_decrypt_bio(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_fallback_decrypt_endio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_crypto_fallback_encrypt_bio(Ptr<Ptr<runtime.bio>> bio_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_fallback_encrypt_endio(Ptr<runtime.bio> enc_bio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_fallback_evict_key((const struct blk_crypto_key*)$arg1)")
    public static int blk_crypto_fallback_evict_key(Ptr<blk_crypto_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_fallback_evict_keyslot(@Unsigned int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_crypto_fallback_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_fallback_keyslot_evict($arg1, (const struct blk_crypto_key*)$arg2, $arg3)")
    public static int blk_crypto_fallback_keyslot_evict(Ptr<blk_crypto_profile> profile, Ptr<blk_crypto_key> key2, @Unsigned int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_fallback_keyslot_program($arg1, (const struct blk_crypto_key*)$arg2, $arg3)")
    public static int blk_crypto_fallback_keyslot_program(Ptr<blk_crypto_profile> profile, Ptr<blk_crypto_key> key2, @Unsigned int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_crypto_fallback_start_using_mode(blk_crypto_mode_num mode_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_ia_range_nr_sectors_show(Ptr<blk_independent_access_range> iar, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_ia_range_sector_show(Ptr<blk_independent_access_range> iar, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_ia_range_sysfs_nop_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_ia_range_sysfs_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_ia_ranges_sysfs_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_integrity_complete(Ptr<runtime.request> rq2, @Unsigned int nr_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_integrity_generate(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_integrity_prepare(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_integrity_verify(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_ioctl_discard(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_all_tag_iter(Ptr<blk_mq_tags> tags, Ptr<?> fn, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> blk_mq_find_and_get_req(Ptr<blk_mq_tags> tags, @Unsigned int bitnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_free_tags(Ptr<blk_mq_tags> tags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int blk_mq_get_tag(Ptr<blk_mq_alloc_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long blk_mq_get_tags(Ptr<blk_mq_alloc_data> data, int nr_tags, Ptr<@Unsigned Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_init_bitmaps(Ptr<SbitmapDefinitions.sbitmap_queue> bitmap_tags, Ptr<SbitmapDefinitions.sbitmap_queue> breserved_tags, @Unsigned int queue_depth, @Unsigned int reserved, int node2, int alloc_policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<blk_mq_tags> blk_mq_init_tags(@Unsigned int total_tags, @Unsigned int reserved_tags, int node2, int alloc_policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_put_tag(Ptr<blk_mq_tags> tags, Ptr<blk_mq_ctx> ctx, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_put_tags(Ptr<blk_mq_tags> tags, Ptr<Integer> tag_array, int nr_tags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_queue_tag_busy_iter(Ptr<RequestDefinitions.request_queue> q, Ptr<?> fn, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_sched_try_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2, @Unsigned int nr_segs, Ptr<Ptr<runtime.request>> merged_request) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_tag_resize_shared_tags(Ptr<blk_mq_tag_set> set, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_tag_update_depth(Ptr<blk_mq_hw_ctx> hctx, Ptr<Ptr<blk_mq_tags>> tagsptr, @Unsigned int tdepth, boolean can_grow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_tag_update_sched_shared_tags(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_tag_wakeup_all(Ptr<blk_mq_tags> tags, boolean include_reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_tagset_busy_iter(Ptr<blk_mq_tag_set> tagset, Ptr<?> fn, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_tagset_count_completed_rqs(Ptr<runtime.request> rq2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_tagset_wait_completed_request(Ptr<blk_mq_tag_set> tagset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int blk_mq_unique_tag(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> blk_next_bio(Ptr<runtime.bio> bio2, Ptr<BlockDefinitions.block_device> bdev, @Unsigned int nr_pages, @Unsigned @OriginalName(value="blk_opf_t") int opf, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_pm_runtime_init(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_post_runtime_resume(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_post_runtime_suspend(Ptr<RequestDefinitions.request_queue> q, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_pre_runtime_resume(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_pre_runtime_suspend(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_queue_rq_timeout(Ptr<RequestDefinitions.request_queue> q, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int blk_recalc_rq_segments(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_revalidate_disk_zones(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_revalidate_zone_cb(Ptr<blk_zone> zone2, @Unsigned int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_rq_merge_ok(Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_rq_set_mixed_merge(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_set_default_limits(Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_set_queue_depth(Ptr<RequestDefinitions.request_queue> q, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_set_stacking_limits(Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_stack_limits(Ptr<QueueDefinitions.queue_limits> t, Ptr<QueueDefinitions.queue_limits> b, @Unsigned @OriginalName(value="sector_t") long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ElvDefinitions.elv_merge blk_try_merge(Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_validate_limits(Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)blk_zone_cond_str($arg1))")
    public static String blk_zone_cond_str(blk_zone_cond zone_cond) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_zone_plug_bio(Ptr<runtime.bio> bio2, @Unsigned int nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_zone_wplug_bio_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_zone_wplug_handle_reset_or_finish(Ptr<runtime.bio> bio2, @Unsigned int wp_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_zone_wplug_handle_write(Ptr<runtime.bio> bio2, @Unsigned int nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_zone_wplug_prepare_bio(Ptr<blk_zone_wplug> zwplug, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_zone_wplug_report_zone_cb(Ptr<blk_zone> zone2, @Unsigned int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_zone_write_plug_bio_endio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_zone_write_plug_bio_merged(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_zone_write_plug_finish_request(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_zone_write_plug_init_request(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_flush_plug(Ptr<blk_plug> plug, boolean from_schedule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __blk_freeze_queue_start(Ptr<RequestDefinitions.request_queue> q, Ptr<TaskDefinitions.task_struct> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.gendisk> __blk_mq_alloc_disk(Ptr<blk_mq_tag_set> set, Ptr<QueueDefinitions.queue_limits> lim, Ptr<?> queuedata, Ptr<LockDefinitions.lock_class_key> lkclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __blk_mq_alloc_driver_tag(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __blk_mq_alloc_map_and_rqs(Ptr<blk_mq_tag_set> set, int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> __blk_mq_alloc_requests(Ptr<blk_mq_alloc_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> __blk_mq_alloc_requests_batch(Ptr<blk_mq_alloc_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_mq_complete_request_remote(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_mq_end_request(Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_mq_free_map_and_rqs(Ptr<blk_mq_tag_set> set, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_mq_free_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char __blk_mq_issue_directly(Ptr<blk_mq_hw_ctx> hctx, Ptr<runtime.request> rq2, boolean last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_mq_requeue_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __blk_mq_unfreeze_queue(Ptr<RequestDefinitions.request_queue> q, boolean force_atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_mq_update_nr_hw_queues(Ptr<blk_mq_tag_set> set, int nr_hw_queues) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_account_io_completion(Ptr<runtime.request> req2, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_account_io_done(Ptr<runtime.request> req2, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_account_io_start(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_rq_to_plug(Ptr<blk_plug> plug, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RequestDefinitions.request_queue> blk_alloc_queue(Ptr<QueueDefinitions.queue_limits> lim, int node_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<blk_plug_cb> blk_check_plugged(@OriginalName(value="blk_plug_cb_fn") Ptr<?> unplug, Ptr<?> data, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_clear_pm_only(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_complete_reqs(Ptr<misc.llist_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_crypto_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short blk_crypto_mode_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blk_crypto_mode_show(Ptr<blk_crypto_profile> profile, Ptr<blk_crypto_attr> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_crypto_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_crypto_sysfs_register(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_sysfs_unregister(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_done_softirq() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_dump_rq_flags(Ptr<runtime.request> rq2, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static RqDefinitions.rq_end_io_ret blk_end_sync_rq(Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char blk_execute_rq(Ptr<runtime.request> rq2, boolean at_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_execute_rq_nowait(Ptr<runtime.request> rq2, boolean at_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_finish_plug(Ptr<blk_plug> plug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_free_queue_rcu(Ptr<misc.callback_head> callback_head2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_freeze_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_freeze_queue_start(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_freeze_queue_start_non_owner(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_get_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_hctx_poll(Ptr<RequestDefinitions.request_queue> q, Ptr<blk_mq_hw_ctx> hctx, Ptr<IoDefinitions.io_comp_batch> iob, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char blk_insert_cloned_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_io_schedule() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_iocost_init(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_lld_busy(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<blk_mq_hw_ctx> blk_mq_alloc_and_init_hctx(Ptr<blk_mq_tag_set> set, Ptr<RequestDefinitions.request_queue> q, int hctx_idx, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.gendisk> blk_mq_alloc_disk_for_queue(Ptr<RequestDefinitions.request_queue> q, Ptr<LockDefinitions.lock_class_key> lkclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<blk_mq_hw_ctx> blk_mq_alloc_hctx(Ptr<RequestDefinitions.request_queue> q, Ptr<blk_mq_tag_set> set, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<blk_mq_tags> blk_mq_alloc_map_and_rqs(Ptr<blk_mq_tag_set> set, @Unsigned int hctx_idx, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RequestDefinitions.request_queue> blk_mq_alloc_queue(Ptr<blk_mq_tag_set> set, Ptr<QueueDefinitions.queue_limits> lim, Ptr<?> queuedata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> blk_mq_alloc_request(Ptr<RequestDefinitions.request_queue> q, @Unsigned @OriginalName(value="blk_opf_t") int opf, @Unsigned @OriginalName(value="blk_mq_req_flags_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> blk_mq_alloc_request_hctx(Ptr<RequestDefinitions.request_queue> q, @Unsigned @OriginalName(value="blk_opf_t") int opf, @Unsigned @OriginalName(value="blk_mq_req_flags_t") int flags, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_alloc_rqs(Ptr<blk_mq_tag_set> set, Ptr<blk_mq_tags> tags, @Unsigned int hctx_idx, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_alloc_set_map_and_rqs(Ptr<blk_mq_tag_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_mq_alloc_sq_tag_set($arg1, (const struct blk_mq_ops*)$arg2, $arg3, $arg4)")
    public static int blk_mq_alloc_sq_tag_set(Ptr<blk_mq_tag_set> set, Ptr<blk_mq_ops> ops, @Unsigned int queue_depth, @Unsigned int set_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_alloc_tag_set(Ptr<blk_mq_tag_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_cancel_work_sync(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_check_expired(Ptr<runtime.request> rq2, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_check_inflight(Ptr<runtime.request> rq2, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_commit_rqs(Ptr<blk_mq_hw_ctx> hctx, int queued, boolean from_schedule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_complete_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_complete_request_remote(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_delay_kick_requeue_list(Ptr<RequestDefinitions.request_queue> q, @Unsigned long msecs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_delay_run_hw_queue(Ptr<blk_mq_hw_ctx> hctx, @Unsigned long msecs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_delay_run_hw_queues(Ptr<RequestDefinitions.request_queue> q, @Unsigned long msecs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> blk_mq_dequeue_from_ctx(Ptr<blk_mq_hw_ctx> hctx, Ptr<blk_mq_ctx> start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_destroy_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_dispatch_plug_list(Ptr<blk_plug> plug, boolean from_sched) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_dispatch_rq_list(Ptr<blk_mq_hw_ctx> hctx, Ptr<ListDefinitions.list_head> list, @Unsigned int nr_budgets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_dispatch_wake(Ptr<@OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry> wait, @Unsigned int mode, int flags, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_end_request(Ptr<runtime.request> rq2, @OriginalName(value="blk_status_t") char error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_end_request_batch(Ptr<IoDefinitions.io_comp_batch> iob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_exit_hctx(Ptr<RequestDefinitions.request_queue> q, Ptr<blk_mq_tag_set> set, Ptr<blk_mq_hw_ctx> hctx, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_exit_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_finish_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_flush_busy_ctxs(Ptr<blk_mq_hw_ctx> hctx, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_flush_plug_list(Ptr<blk_plug> plug, boolean from_schedule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_free_map_and_rqs(Ptr<blk_mq_tag_set> set, Ptr<blk_mq_tags> tags, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_free_plug_rqs(Ptr<blk_plug> plug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_free_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_free_rq_map(Ptr<blk_mq_tags> tags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_free_rqs(Ptr<blk_mq_tag_set> set, Ptr<blk_mq_tags> tags, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_free_tag_set(Ptr<blk_mq_tag_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_freeze_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_freeze_queue_wait(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_freeze_queue_wait_timeout(Ptr<RequestDefinitions.request_queue> q, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_get_budget_and_tag(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_get_hctx_node(Ptr<blk_mq_tag_set> set, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_handle_expired(Ptr<runtime.request> rq2, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_has_request(Ptr<runtime.request> rq2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_hctx_has_pending(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_hctx_mark_pending(Ptr<blk_mq_hw_ctx> hctx, Ptr<blk_mq_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_hctx_notify_dead(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_hctx_notify_offline(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_hctx_notify_online(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int blk_mq_in_flight(Ptr<RequestDefinitions.request_queue> q, Ptr<BlockDefinitions.block_device> part) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_in_flight_rw(Ptr<RequestDefinitions.request_queue> q, Ptr<BlockDefinitions.block_device> part, Ptr<@Unsigned Integer> inflight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_init_allocated_queue(Ptr<blk_mq_tag_set> set, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_init_hctx(Ptr<RequestDefinitions.request_queue> q, Ptr<blk_mq_tag_set> set, Ptr<blk_mq_hw_ctx> hctx, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_insert_request(Ptr<runtime.request> rq2, @Unsigned @OriginalName(value="blk_insert_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_insert_requests(Ptr<blk_mq_hw_ctx> hctx, Ptr<blk_mq_ctx> ctx, Ptr<ListDefinitions.list_head> list, boolean run_queue_async) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_kick_requeue_list(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_map_swqueue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_mark_tag_wait(Ptr<blk_mq_hw_ctx> hctx, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_plug_issue_direct(Ptr<blk_plug> plug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_poll(Ptr<RequestDefinitions.request_queue> q, @Unsigned @OriginalName(value="blk_qc_t") int cookie, Ptr<IoDefinitions.io_comp_batch> iob, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_put_rq_ref(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_queue_inflight(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_quiesce_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_quiesce_queue_nowait(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_quiesce_tagset(Ptr<blk_mq_tag_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_realloc_hw_ctxs(Ptr<blk_mq_tag_set> set, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_realloc_tag_set_tags(Ptr<blk_mq_tag_set> set, int new_nr_hw_queues) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_release(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char blk_mq_request_issue_directly(Ptr<runtime.request> rq2, boolean last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_requeue_request(Ptr<runtime.request> rq2, boolean kick_requeue_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_requeue_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int blk_mq_rq_cpu(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_rq_inflight(Ptr<runtime.request> rq2, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_run_hw_queue(Ptr<blk_mq_hw_ctx> hctx, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_run_hw_queues(Ptr<RequestDefinitions.request_queue> q, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_run_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_start_hw_queue(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_start_hw_queues(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_start_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_start_stopped_hw_queue(Ptr<blk_mq_hw_ctx> hctx, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_start_stopped_hw_queues(Ptr<RequestDefinitions.request_queue> q, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_stop_hw_queue(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_stop_hw_queues(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_submit_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_timeout_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_try_issue_directly(Ptr<blk_mq_hw_ctx> hctx, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_try_issue_list_directly(Ptr<blk_mq_hw_ctx> hctx, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_unfreeze_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_unfreeze_queue_non_owner(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_unquiesce_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_unquiesce_tagset(Ptr<blk_mq_tag_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_update_nr_hw_queues(Ptr<blk_mq_tag_set> set, int nr_hw_queues) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_update_nr_requests(Ptr<RequestDefinitions.request_queue> q, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_update_queue_map(Ptr<blk_mq_tag_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_update_tag_set_shared(Ptr<blk_mq_tag_set> set, boolean shared) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_wait_quiesce_done(Ptr<blk_mq_tag_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_wake_waiters(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)blk_op_str($arg1))")
    public static String blk_op_str(misc.req_op op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_put_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_queue_enter(Ptr<RequestDefinitions.request_queue> q, @Unsigned @OriginalName(value="blk_mq_req_flags_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_queue_exit(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_queue_flag_clear(@Unsigned int flag, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_queue_flag_set(@Unsigned int flag, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_queue_start_drain(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_queue_usage_counter_release(Ptr<PercpuDefinitions.percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_rq_cur_bytes((const struct request*)$arg1)")
    public static int blk_rq_cur_bytes(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_rq_init(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_rq_is_poll(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_rq_poll(Ptr<runtime.request> rq2, Ptr<IoDefinitions.io_comp_batch> iob, @Unsigned int poll_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_rq_prep_clone($arg1, $arg2, $arg3, $arg4, (int (*)(struct bio*, struct bio*, void*))$arg5, $arg6)")
    public static int blk_rq_prep_clone(Ptr<runtime.request> rq2, Ptr<runtime.request> rq_src, Ptr<BioDefinitions.bio_set> bs, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<?> bio_ctr, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_rq_timed_out_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_rq_unprep_clone(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_set_pm_only(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_softirq_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_start_plug(Ptr<blk_plug> plug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_start_plug_nr_ios(Ptr<blk_plug> plug, @Unsigned short nr_ios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_status_to_errno(@OriginalName(value="blk_status_t") char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)blk_status_to_str($arg1))")
    public static String blk_status_to_str(@OriginalName(value="blk_status_t") char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_steal_bios(Ptr<BioDefinitions.bio_list> list, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_sync_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_timeout_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_update_request(Ptr<runtime.request> req2, @OriginalName(value="blk_status_t") char error, @Unsigned int nr_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__blk_crypto_cfg_supported($arg1, (const struct blk_crypto_config*)$arg2)")
    public static boolean __blk_crypto_cfg_supported(Ptr<blk_crypto_profile> profile, Ptr<blk_crypto_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__blk_crypto_evict_key($arg1, (const struct blk_crypto_key*)$arg2)")
    public static int __blk_crypto_evict_key(Ptr<blk_crypto_profile> profile, Ptr<blk_crypto_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blk_mq_do_dispatch_sched(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blk_mq_sched_dispatch_requests(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blk_mq_sched_restart(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_abort_request(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_add_timer(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<blk_flush_queue> blk_alloc_flush_queue(int node2, int cmd_size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<blk_queue_stats> blk_alloc_queue_stats() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_get_keyslot($arg1, (const struct blk_crypto_key*)$arg2, $arg3)")
    public static @OriginalName(value="blk_status_t") char blk_crypto_get_keyslot(Ptr<blk_crypto_profile> profile, Ptr<blk_crypto_key> key2, Ptr<Ptr<blk_crypto_keyslot>> slot_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_has_capabilities((const struct blk_crypto_profile*)$arg1, (const struct blk_crypto_profile*)$arg2)")
    public static boolean blk_crypto_has_capabilities(Ptr<blk_crypto_profile> target, Ptr<blk_crypto_profile> reference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_intersect_capabilities($arg1, (const struct blk_crypto_profile*)$arg2)")
    public static void blk_crypto_intersect_capabilities(Ptr<blk_crypto_profile> parent, Ptr<blk_crypto_profile> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int blk_crypto_keyslot_index(Ptr<blk_crypto_keyslot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_profile_destroy(Ptr<blk_crypto_profile> profile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_profile_destroy_callback(Ptr<?> profile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_crypto_profile_init(Ptr<blk_crypto_profile> profile, @Unsigned int num_slots) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_put_keyslot(Ptr<blk_crypto_keyslot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_crypto_register(Ptr<blk_crypto_profile> profile, Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_crypto_reprogram_all_keys(Ptr<blk_crypto_profile> profile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_crypto_update_capabilities($arg1, (const struct blk_crypto_profile*)$arg2)")
    public static void blk_crypto_update_capabilities(Ptr<blk_crypto_profile> dst, Ptr<blk_crypto_profile> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_flush_complete_seq(Ptr<runtime.request> rq2, Ptr<blk_flush_queue> fq, @Unsigned int seq, @OriginalName(value="blk_status_t") char error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_free_flush_queue(Ptr<blk_flush_queue> fq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_free_queue_stats(Ptr<blk_queue_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_insert_flush(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_integrity_merge_bio(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> req2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_integrity_merge_rq(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> req2, Ptr<runtime.request> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)blk_integrity_profile_name($arg1))")
    public static String blk_integrity_profile_name(Ptr<blk_integrity> bi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_lookup_devt((const u8*)$arg1, $arg2)")
    public static @Unsigned @OriginalName(value="dev_t") int blk_lookup_devt(String name, int partno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_do_dispatch_ctx(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_exit_sched(Ptr<RequestDefinitions.request_queue> q, Ptr<ElevatorDefinitions.elevator_queue> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_hctx_set_fq_lock_class(Ptr<blk_mq_hw_ctx> hctx, Ptr<LockDefinitions.lock_class_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_hw_queue_to_node(Ptr<blk_mq_queue_map> qmap, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_mq_init_sched(Ptr<RequestDefinitions.request_queue> q, Ptr<ElevatorDefinitions.elevator_type> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_map_queues(Ptr<blk_mq_queue_map> qmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_sched_bio_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2, @Unsigned int nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_sched_dispatch_requests(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_sched_free_rqs(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_sched_mark_restart_hctx(Ptr<blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_sched_tags_teardown(Ptr<RequestDefinitions.request_queue> q, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean blk_mq_sched_try_insert_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, Ptr<ListDefinitions.list_head> free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_mq_virtio_map_queues(Ptr<blk_mq_queue_map> qmap, Ptr<VirtioDefinitions.virtio_device> vdev, int first_vec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_rq_append_bio(Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_rq_count_integrity_sg(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_rq_integrity_map_user(Ptr<runtime.request> rq2, Ptr<?> ubuf, @OriginalName(value="ssize_t") long bytes, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> blk_rq_map_bio_alloc(Ptr<runtime.request> rq2, @Unsigned int nr_vecs, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_rq_map_integrity_sg(Ptr<runtime.request> rq2, Ptr<runtime.scatterlist> sglist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_rq_map_kern(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, Ptr<?> kbuf, @Unsigned int len, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_rq_map_user(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, Ptr<RqDefinitions.rq_map_data> map_data, Ptr<?> ubuf, @Unsigned long len, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_rq_map_user_iov($arg1, $arg2, $arg3, (const struct iov_iter*)$arg4, $arg5)")
    public static int blk_rq_map_user_iov(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> rq2, Ptr<RqDefinitions.rq_map_data> map_data, Ptr<IovDefinitions.iov_iter> iter2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_rq_stat_add(Ptr<blk_rq_stat> stat2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_rq_stat_init(Ptr<blk_rq_stat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_rq_stat_sum(Ptr<blk_rq_stat> dst, Ptr<blk_rq_stat> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long blk_rq_timeout(@Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_rq_unmap_user(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_stat_add(Ptr<runtime.request> rq2, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_stat_add_callback(Ptr<RequestDefinitions.request_queue> q, Ptr<blk_stat_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blk_stat_alloc_callback((void (*)(struct blk_stat_callback*))$arg1, (int (*)(const struct request*))$arg2, $arg3, $arg4)")
    public static Ptr<blk_stat_callback> blk_stat_alloc_callback(Ptr<?> timer_fn, Ptr<?> bucket_fn, @Unsigned int buckets, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_stat_disable_accounting(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_stat_enable_accounting(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_stat_free_callback(Ptr<blk_stat_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_stat_free_callback_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_stat_remove_callback(Ptr<RequestDefinitions.request_queue> q, Ptr<blk_stat_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blk_stat_timer_fn(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blk_timeout_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct blk_crypto_attr")
    @NotUsableInJava
    public static class blk_crypto_attr
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_crypto_kobj")
    @NotUsableInJava
    public static class blk_crypto_kobj
    extends Struct {
        public runtime.kobject kobj;
        public Ptr<blk_crypto_profile> profile;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_qe_pair")
    @NotUsableInJava
    public static class blk_mq_qe_pair
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<RequestDefinitions.request_queue> q;
        public Ptr<ElevatorDefinitions.elevator_type> type;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_expired_data")
    @NotUsableInJava
    public static class blk_expired_data
    extends Struct {
        public boolean has_timedout_rq;
        public @Unsigned long next;
        public @Unsigned long timeout_start;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_rq_wait")
    @NotUsableInJava
    public static class blk_rq_wait
    extends Struct {
        public runtime.completion done;
        public @OriginalName(value="blk_status_t") char ret;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_plug_cb")
    @NotUsableInJava
    public static class blk_plug_cb
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="blk_plug_cb_fn") Ptr<?> callback;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="union blk_crypto_iv")
    @NotUsableInJava
    public static class blk_crypto_iv
    extends Union {
        public @Unsigned @OriginalName(value="__le64") long @Size(value=4) [] dun;
        public char @Size(value=32) [] bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_crypto_fallback_keyslot")
    @NotUsableInJava
    public static class blk_crypto_fallback_keyslot
    extends Struct {
        public blk_crypto_mode_num crypto_mode;
        public Ptr<CryptoDefinitions.crypto_skcipher> @Size(value=5) [] tfms;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_revalidate_zone_args")
    @NotUsableInJava
    public static class blk_revalidate_zone_args
    extends Struct {
        public Ptr<runtime.gendisk> disk;
        public Ptr<@Unsigned Long> conv_zones_bitmap;
        public @Unsigned int nr_zones;
        public @Unsigned int zone_capacity;
        public @Unsigned int last_zone_capacity;
        public @Unsigned @OriginalName(value="sector_t") long sector;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_zone_wplug")
    @NotUsableInJava
    public static class blk_zone_wplug
    extends Struct {
        public misc.hlist_node node;
        public ListDefinitions.list_head link;
        public AtomicDefinitions.atomic_t ref;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int flags;
        public @Unsigned int zone_no;
        public @Unsigned int wp_offset;
        public BioDefinitions.bio_list bio_list;
        public misc.work_struct bio_work;
        public misc.callback_head callback_head;
        public Ptr<runtime.gendisk> disk;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_zone_range")
    @NotUsableInJava
    public static class blk_zone_range
    extends Struct {
        public @Unsigned long sector;
        public @Unsigned long nr_sectors;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_zone_report")
    @NotUsableInJava
    public static class blk_zone_report
    extends Struct {
        public @Unsigned long sector;
        public @Unsigned int nr_zones;
        public @Unsigned int flags;
        public blk_zone @Size(value=0) [] zones;
    }

    @Type(noCCodeGeneration=true, cType="enum blk_zone_report_flags")
    public static enum blk_zone_report_flags implements Enum<blk_zone_report_flags>,
    TypedEnum<blk_zone_report_flags, Integer>
    {
        BLK_ZONE_REP_CAPACITY;

    }

    @Type(noCCodeGeneration=true, cType="struct blk_integrity_iter")
    @NotUsableInJava
    public static class blk_integrity_iter
    extends Struct {
        public Ptr<?> prot_buf;
        public Ptr<?> data_buf;
        public @Unsigned @OriginalName(value="sector_t") long seed;
        public @Unsigned int data_size;
        public @Unsigned short interval;
        public String disk_name;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_ia_range_sysfs_entry")
    @NotUsableInJava
    public static class blk_ia_range_sysfs_entry
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_iou_cmd")
    @NotUsableInJava
    public static class blk_iou_cmd
    extends Struct {
        public int res;
        public boolean nowait;
    }

    @Type(noCCodeGeneration=true, cType="enum blk_zone_cond")
    public static enum blk_zone_cond implements Enum<blk_zone_cond>,
    TypedEnum<blk_zone_cond, Integer>
    {
        BLK_ZONE_COND_NOT_WP,
        BLK_ZONE_COND_EMPTY,
        BLK_ZONE_COND_IMP_OPEN,
        BLK_ZONE_COND_EXP_OPEN,
        BLK_ZONE_COND_CLOSED,
        BLK_ZONE_COND_READONLY,
        BLK_ZONE_COND_FULL,
        BLK_ZONE_COND_OFFLINE;

    }

    @Type(noCCodeGeneration=true, cType="enum blk_zone_type")
    public static enum blk_zone_type implements Enum<blk_zone_type>,
    TypedEnum<blk_zone_type, Integer>
    {
        BLK_ZONE_TYPE_CONVENTIONAL,
        BLK_ZONE_TYPE_SEQWRITE_REQ,
        BLK_ZONE_TYPE_SEQWRITE_PREF;

    }

    @Type(noCCodeGeneration=true, cType="struct blk_crypto_mode")
    @NotUsableInJava
    public static class blk_crypto_mode
    extends Struct {
        public String name;
        public String cipher_str;
        public @Unsigned int keysize;
        public @Unsigned int ivsize;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_major_name")
    @NotUsableInJava
    public static class blk_major_name
    extends Struct {
        public Ptr<blk_major_name> next;
        public int major;
        public char @Size(value=16) [] name;
        public Ptr<?> probe;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_hw_ctx_sysfs_entry")
    @NotUsableInJava
    public static class blk_mq_hw_ctx_sysfs_entry
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_user_trace_setup")
    @NotUsableInJava
    public static class blk_user_trace_setup
    extends Struct {
        public char @Size(value=32) [] name;
        public @Unsigned short act_mask;
        public @Unsigned int buf_size;
        public @Unsigned int buf_nr;
        public @Unsigned long start_lba;
        public @Unsigned long end_lba;
        public @Unsigned int pid;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_io_trace_remap")
    @NotUsableInJava
    public static class blk_io_trace_remap
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int device_from;
        public @Unsigned @OriginalName(value="__be32") int device_to;
        public @Unsigned @OriginalName(value="__be64") long sector_from;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_io_trace")
    @NotUsableInJava
    public static class blk_io_trace
    extends Struct {
        public @Unsigned int magic;
        public @Unsigned int sequence;
        public @Unsigned long time;
        public @Unsigned long sector;
        public @Unsigned int bytes;
        public @Unsigned int action;
        public @Unsigned int pid;
        public @Unsigned int device;
        public @Unsigned int cpu;
        public @Unsigned short error;
        public @Unsigned short pdu_len;
    }

    @Type(noCCodeGeneration=true, cType="enum blk_default_limits")
    public static enum blk_default_limits implements Enum<blk_default_limits>,
    TypedEnum<blk_default_limits, Integer>
    {
        BLK_MAX_SEGMENTS,
        BLK_SAFE_MAX_SECTORS,
        BLK_MAX_SEGMENT_SIZE,
        BLK_SEG_BOUNDARY_MASK;

    }

    @Type(noCCodeGeneration=true, cType="struct blk_shadow")
    @NotUsableInJava
    public static class blk_shadow
    extends Struct {
        public BlkifDefinitions.blkif_request req;
        public Ptr<runtime.request> request;
        public Ptr<Ptr<runtime.grant>> grants_used;
        public Ptr<Ptr<runtime.grant>> indirect_grants;
        public Ptr<runtime.scatterlist> sg;
        public @Unsigned int num_sg;
        public blk_req_status status;
        public @Unsigned long associated_id;
    }

    @Type(noCCodeGeneration=true, cType="enum blk_req_status")
    public static enum blk_req_status implements Enum<blk_req_status>,
    TypedEnum<blk_req_status, Integer>
    {
        REQ_PROCESSING,
        REQ_WAITING,
        REQ_DONE,
        REQ_ERROR,
        REQ_EOPNOTSUPP;

    }

    @Type(noCCodeGeneration=true, cType="struct blk_crypto_keyslot")
    @NotUsableInJava
    public static class blk_crypto_keyslot
    extends Struct {
        public AtomicDefinitions.atomic_t slot_refs;
        public ListDefinitions.list_head idle_slot_node;
        public misc.hlist_node hash_node;
        public Ptr<blk_crypto_key> key;
        public Ptr<blk_crypto_profile> profile;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_crypto_ll_ops")
    @NotUsableInJava
    public static class blk_crypto_ll_ops
    extends Struct {
        public Ptr<?> keyslot_program;
        public Ptr<?> keyslot_evict;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_crypto_profile")
    @NotUsableInJava
    public static class blk_crypto_profile
    extends Struct {
        public blk_crypto_ll_ops ll_ops;
        public @Unsigned int max_dun_bytes_supported;
        public @Unsigned int @Size(value=5) [] modes_supported;
        public Ptr<runtime.device> dev;
        public @Unsigned int num_slots;
        public misc.rw_semaphore lock;
        public LockDefinitions.lock_class_key lockdep_key;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head idle_slots_wait_queue;
        public ListDefinitions.list_head idle_slots;
        public  @OriginalName(value="spinlock_t") runtime.spinlock idle_slots_lock;
        public Ptr<misc.hlist_head> slot_hashtable;
        public @Unsigned int log_slot_ht_size;
        public Ptr<blk_crypto_keyslot> slots;
    }

    @Type(noCCodeGeneration=true, cType="enum blk_integrity_flags")
    public static enum blk_integrity_flags implements Enum<blk_integrity_flags>,
    TypedEnum<blk_integrity_flags, Integer>
    {
        BLK_INTEGRITY_NOVERIFY,
        BLK_INTEGRITY_NOGENERATE,
        BLK_INTEGRITY_DEVICE_CAPABLE,
        BLK_INTEGRITY_REF_TAG,
        BLK_INTEGRITY_STACKED;

    }

    @Type(noCCodeGeneration=true, cType="struct blk_stat_callback")
    @NotUsableInJava
    public static class blk_stat_callback
    extends Struct {
        public ListDefinitions.list_head list;
        public TimerDefinitions.timer_list timer;
        public Ptr<blk_rq_stat> cpu_stat;
        public Ptr<?> bucket_fn;
        public @Unsigned int buckets;
        public Ptr<blk_rq_stat> stat;
        public Ptr<?> timer_fn;
        public Ptr<?> data;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_queue_stats")
    @NotUsableInJava
    public static class blk_queue_stats
    extends Struct {
        public ListDefinitions.list_head callbacks;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public int accounting;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_rq_stat")
    @NotUsableInJava
    public static class blk_rq_stat
    extends Struct {
        public @Unsigned long mean;
        public @Unsigned long min;
        public @Unsigned long max;
        public @Unsigned int nr_samples;
        public @Unsigned long batch;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_debugfs_attr")
    @NotUsableInJava
    public static class blk_mq_debugfs_attr
    extends Struct {
        public String name;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public Ptr<?> show;
        public Ptr<?> write;
        public Ptr<SeqDefinitions.seq_operations> seq_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_alloc_data")
    @NotUsableInJava
    public static class blk_mq_alloc_data
    extends Struct {
        public Ptr<RequestDefinitions.request_queue> q;
        public @Unsigned @OriginalName(value="blk_mq_req_flags_t") int flags;
        public @Unsigned int shallow_depth;
        public @Unsigned @OriginalName(value="blk_opf_t") int cmd_flags;
        public @Unsigned @OriginalName(value="req_flags_t") int rq_flags;
        public @Unsigned int nr_tags;
        public Ptr<Ptr<runtime.request>> cached_rq;
        public Ptr<blk_mq_ctx> ctx;
        public Ptr<blk_mq_hw_ctx> hctx;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_ctxs")
    @NotUsableInJava
    public static class blk_mq_ctxs
    extends Struct {
        public runtime.kobject kobj;
        public Ptr<blk_mq_ctx> queue_ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_queue_data")
    @NotUsableInJava
    public static class blk_mq_queue_data
    extends Struct {
        public Ptr<runtime.request> rq;
        public boolean last;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_queue_map")
    @NotUsableInJava
    public static class blk_mq_queue_map
    extends Struct {
        public Ptr<@Unsigned Integer> mq_map;
        public @Unsigned int nr_queues;
        public @Unsigned int queue_offset;
    }

    @Type(noCCodeGeneration=true, cType="enum blk_eh_timer_return")
    public static enum blk_eh_timer_return implements Enum<blk_eh_timer_return>,
    TypedEnum<blk_eh_timer_return, Integer>
    {
        BLK_EH_DONE,
        BLK_EH_RESET_TIMER;

    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_hw_ctx")
    @NotUsableInJava
    public static class blk_mq_hw_ctx
    extends Struct {
        public AnonDefinitions.anon_member_of_blk_mq_hw_ctx anon0;
        public DelayedDefinitions.delayed_work run_work;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpumask;
        public int next_cpu;
        public int next_cpu_batch;
        public @Unsigned long flags;
        public Ptr<?> sched_data;
        public Ptr<RequestDefinitions.request_queue> queue;
        public Ptr<blk_flush_queue> fq;
        public Ptr<?> driver_data;
        public runtime.sbitmap ctx_map;
        public Ptr<blk_mq_ctx> dispatch_from;
        public @Unsigned int dispatch_busy;
        public @Unsigned short type;
        public @Unsigned short nr_ctx;
        public Ptr<Ptr<blk_mq_ctx>> ctxs;
        public  @OriginalName(value="spinlock_t") runtime.spinlock dispatch_wait_lock;
        public @OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry dispatch_wait;
        public AtomicDefinitions.atomic_t wait_index;
        public Ptr<blk_mq_tags> tags;
        public Ptr<blk_mq_tags> sched_tags;
        public @Unsigned int numa_node;
        public @Unsigned int queue_num;
        public AtomicDefinitions.atomic_t nr_active;
        public misc.hlist_node cpuhp_online;
        public misc.hlist_node cpuhp_dead;
        public runtime.kobject kobj;
        public Ptr<runtime.dentry> debugfs_dir;
        public Ptr<runtime.dentry> sched_debugfs_dir;
        public ListDefinitions.list_head hctx_list;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_tag_set")
    @NotUsableInJava
    public static class blk_mq_tag_set
    extends Struct {
        public Ptr<blk_mq_ops> ops;
        public blk_mq_queue_map @Size(value=3) [] map;
        public @Unsigned int nr_maps;
        public @Unsigned int nr_hw_queues;
        public @Unsigned int queue_depth;
        public @Unsigned int reserved_tags;
        public @Unsigned int cmd_size;
        public int numa_node;
        public @Unsigned int timeout;
        public @Unsigned int flags;
        public Ptr<?> driver_data;
        public Ptr<Ptr<blk_mq_tags>> tags;
        public Ptr<blk_mq_tags> shared_tags;
        public runtime.mutex tag_list_lock;
        public ListDefinitions.list_head tag_list;
        public Ptr<SrcuDefinitions.srcu_struct> srcu;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_flush_queue")
    @NotUsableInJava
    public static class blk_flush_queue
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock mq_flush_lock;
        public @Unsigned int flush_pending_idx;
        public @Unsigned int flush_running_idx;
        public @OriginalName(value="blk_status_t") char rq_status;
        public @Unsigned long flush_pending_since;
        public ListDefinitions.list_head @Size(value=2) [] flush_queue;
        public @Unsigned long flush_data_in_flight;
        public Ptr<runtime.request> flush_rq;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_trace")
    @NotUsableInJava
    public static class blk_trace
    extends Struct {
        public int trace_state;
        public Ptr<runtime.rchan> rchan;
        public Ptr<@Unsigned Long> sequence;
        public String msg_data;
        public @Unsigned short act_mask;
        public @Unsigned long start_lba;
        public @Unsigned long end_lba;
        public @Unsigned int pid;
        public @Unsigned int dev;
        public Ptr<runtime.dentry> dir;
        public ListDefinitions.list_head running_list;
        public AtomicDefinitions.atomic_t dropped;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_tags")
    @NotUsableInJava
    public static class blk_mq_tags
    extends Struct {
        public @Unsigned int nr_tags;
        public @Unsigned int nr_reserved_tags;
        public @Unsigned int active_queues;
        public SbitmapDefinitions.sbitmap_queue bitmap_tags;
        public SbitmapDefinitions.sbitmap_queue breserved_tags;
        public Ptr<Ptr<runtime.request>> rqs;
        public Ptr<Ptr<runtime.request>> static_rqs;
        public ListDefinitions.list_head page_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_ctx")
    @NotUsableInJava
    public static class blk_mq_ctx
    extends Struct {
        public AnonDefinitions.anon_member_of_blk_mq_ctx anon0;
        public @Unsigned int cpu;
        public @Unsigned short @Size(value=3) [] index_hw;
        public Ptr<blk_mq_hw_ctx> @Size(value=3) [] hctxs;
        public Ptr<RequestDefinitions.request_queue> queue;
        public Ptr<blk_mq_ctxs> ctxs;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_crypto_key")
    @NotUsableInJava
    public static class blk_crypto_key
    extends Struct {
        public blk_crypto_config crypto_cfg;
        public @Unsigned int data_unit_size_bits;
        public @Unsigned int size;
        public char @Size(value=64) [] raw;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_crypto_config")
    @NotUsableInJava
    public static class blk_crypto_config
    extends Struct {
        public blk_crypto_mode_num crypto_mode;
        public @Unsigned int data_unit_size;
        public @Unsigned int dun_bytes;
    }

    @Type(noCCodeGeneration=true, cType="enum blk_crypto_mode_num")
    public static enum blk_crypto_mode_num implements Enum<blk_crypto_mode_num>,
    TypedEnum<blk_crypto_mode_num, Integer>
    {
        BLK_ENCRYPTION_MODE_INVALID,
        BLK_ENCRYPTION_MODE_AES_256_XTS,
        BLK_ENCRYPTION_MODE_AES_128_CBC_ESSIV,
        BLK_ENCRYPTION_MODE_ADIANTUM,
        BLK_ENCRYPTION_MODE_SM4_XTS,
        BLK_ENCRYPTION_MODE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum blk_unique_id")
    public static enum blk_unique_id implements Enum<blk_unique_id>,
    TypedEnum<blk_unique_id, Integer>
    {
        BLK_UID_T10,
        BLK_UID_EUI64,
        BLK_UID_NAA;

    }

    @Type(noCCodeGeneration=true, cType="struct blk_mq_ops")
    @NotUsableInJava
    public static class blk_mq_ops
    extends Struct {
        public Ptr<?> queue_rq;
        public Ptr<?> commit_rqs;
        public Ptr<?> queue_rqs;
        public Ptr<?> get_budget;
        public Ptr<?> put_budget;
        public Ptr<?> set_rq_budget_token;
        public Ptr<?> get_rq_budget_token;
        public Ptr<?> timeout;
        public Ptr<?> poll;
        public Ptr<?> complete;
        public Ptr<?> init_hctx;
        public Ptr<?> exit_hctx;
        public Ptr<?> init_request;
        public Ptr<?> exit_request;
        public Ptr<?> cleanup_rq;
        public Ptr<?> busy;
        public Ptr<?> map_queues;
        public Ptr<?> show_rq;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_independent_access_range")
    @NotUsableInJava
    public static class blk_independent_access_range
    extends Struct {
        public runtime.kobject kobj;
        public @Unsigned @OriginalName(value="sector_t") long sector;
        public @Unsigned @OriginalName(value="sector_t") long nr_sectors;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_independent_access_ranges")
    @NotUsableInJava
    public static class blk_independent_access_ranges
    extends Struct {
        public runtime.kobject kobj;
        public boolean sysfs_registered;
        public @Unsigned int nr_ia_ranges;
        public blk_independent_access_range @Size(value=0) [] ia_range;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_integrity")
    @NotUsableInJava
    public static class blk_integrity
    extends Struct {
        public char flags;
        public blk_integrity_checksum csum_type;
        public char tuple_size;
        public char pi_offset;
        public char interval_exp;
        public char tag_size;
    }

    @Type(noCCodeGeneration=true, cType="enum blk_integrity_checksum")
    public static enum blk_integrity_checksum implements Enum<blk_integrity_checksum>,
    TypedEnum<blk_integrity_checksum, Boolean>
    {
        BLK_INTEGRITY_CSUM_NONE,
        BLK_INTEGRITY_CSUM_IP,
        BLK_INTEGRITY_CSUM_CRC,
        BLK_INTEGRITY_CSUM_CRC64;

    }

    @Type(noCCodeGeneration=true, cType="struct blk_zone")
    @NotUsableInJava
    public static class blk_zone
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long len;
        public @Unsigned long wp;
        public char type;
        public char cond;
        public char non_seq;
        public char reset;
        public char @Size(value=4) [] resv;
        public @Unsigned long capacity;
        public char @Size(value=24) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_holder_ops")
    @NotUsableInJava
    public static class blk_holder_ops
    extends Struct {
        public Ptr<?> mark_dead;
        public Ptr<?> sync;
        public Ptr<?> freeze;
        public Ptr<?> thaw;
    }

    @Type(noCCodeGeneration=true, cType="struct blk_plug")
    @NotUsableInJava
    public static class blk_plug
    extends Struct {
        public Ptr<runtime.request> mq_list;
        public Ptr<runtime.request> cached_rq;
        public @Unsigned long cur_ktime;
        public @Unsigned short nr_ios;
        public @Unsigned short rq_count;
        public boolean multiple_queues;
        public boolean has_elevator;
        public ListDefinitions.list_head cb_list;
    }
}

