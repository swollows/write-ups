/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BitmapDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SerialDefinitions;
import me.bechberger.ebpf.runtime.SyncDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __md_set_array_info(Ptr<runtime.mddev> mddev2, Ptr<?> argp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __md_stop(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __md_stop_writes(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_account_bio(Ptr<runtime.mddev> mddev2, Ptr<Ptr<runtime.bio>> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_add_new_disk(Ptr<runtime.mddev> mddev2, Ptr<misc.mdu_disk_info_s> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mddev> md_alloc(@Unsigned @OriginalName(value="dev_t") int dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_allow_write(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long md_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="md_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long md_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String page2, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_autodetect_dev(@Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_autostart_arrays(int part) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int md_check_events(Ptr<runtime.gendisk> disk, @Unsigned int clearing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_check_no_bitmap(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_check_recovery(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean md_choose_sync_action(Ptr<runtime.mddev> mddev2, Ptr<Integer> spares) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_clear_update_mitigation() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_cluster_stop(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_compat_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_do_sync(Ptr<md_thread> thread) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_done_sync(Ptr<runtime.mddev> mddev2, int blocks, int ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_end_clone_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_end_flush(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_error(Ptr<runtime.mddev> mddev2, Ptr<md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<md_rdev> md_find_rdev_nr_rcu(Ptr<runtime.mddev> mddev2, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<md_rdev> md_find_rdev_rcu(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_finish_reshape(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean md_flush_request(Ptr<runtime.mddev> mddev2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_free_cloned_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_free_disk(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_frozen_sync_thread(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_getgeo(Ptr<BlockDefinitions.block_device> bdev, Ptr<misc.hd_geometry> geo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean md_handle_request(Ptr<runtime.mddev> mddev2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_idle_sync_thread(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<md_rdev> md_import_device(@Unsigned @OriginalName(value="dev_t") int newdev, int super_format, int super_minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_init_stacking_limits(Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_integrity_register(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_kick_rdev_from_array(Ptr<md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_kobj_release(Ptr<runtime.kobject> ko) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_new_event() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_notify_reboot(Ptr<misc.notifier_block> _this, @Unsigned long code2, Ptr<?> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_open(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="blk_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_probe(@Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_rdev_clear(Ptr<md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_rdev_init(Ptr<md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_reap_sync_thread(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="md_register_thread((void (*)(struct md_thread*))$arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<md_thread> md_register_thread(Ptr<?> run, Ptr<runtime.mddev> mddev2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_release(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_reload_sb(Ptr<runtime.mddev> mddev2, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_run(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_safemode_timeout(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_sb_equal(Ptr<@OriginalName(value="mdp_super_t") misc.mdp_superblock_s> sb1, Ptr<@OriginalName(value="mdp_super_t") misc.mdp_superblock_s> sb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> md_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_seq_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> md_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_set_array_info(Ptr<runtime.mddev> mddev2, Ptr<misc.mdu_array_info_s> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_set_array_sectors(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="sector_t") long array_sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_set_read_only(Ptr<BlockDefinitions.block_device> bdev, boolean ro) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_set_readonly(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_setup_cluster(Ptr<runtime.mddev> mddev2, int nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean md_spares_need_change(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_start(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_start_sync(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_stop(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_stop_writes(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_submit_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_submit_discard_bio(Ptr<runtime.mddev> mddev2, Ptr<md_rdev> rdev, Ptr<runtime.bio> bio2, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_super_wait(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_super_write(Ptr<runtime.mddev> mddev2, Ptr<md_rdev> rdev, @Unsigned @OriginalName(value="sector_t") long sector, int size, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static SyncDefinitions.sync_action md_sync_action(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="md_sync_action_by_name((const u8*)$arg1)")
    public static SyncDefinitions.sync_action md_sync_action_by_name(String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)md_sync_action_name($arg1))")
    public static String md_sync_action_name(SyncDefinitions.sync_action action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long md_sync_position(Ptr<runtime.mddev> mddev2, SyncDefinitions.sync_action action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_unfrozen_sync_thread(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_unregister_thread(Ptr<runtime.mddev> mddev2, Ptr<Ptr<md_thread>> threadp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_update_sb(Ptr<runtime.mddev> mddev2, int force_change) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_wait_for_blocked_rdev(Ptr<md_rdev> rdev, Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_wakeup_thread(Ptr<md_thread> thread) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_write_end(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_write_inc(Ptr<runtime.mddev> mddev2, Ptr<runtime.bio> bi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_write_start(Ptr<runtime.mddev> mddev2, Ptr<runtime.bio> bi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_bitmap_checkpage(Ptr<BitmapDefinitions.bitmap_counts> bitmap2, @Unsigned long page2, int create, int no_hijack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_bitmap_count_page(Ptr<BitmapDefinitions.bitmap_counts> bitmap2, @Unsigned @OriginalName(value="sector_t") long offset, int inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_bitmap_file_clear_bit(Ptr<runtime.bitmap> bitmap2, @Unsigned @OriginalName(value="sector_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_bitmap_file_set_bit(Ptr<runtime.bitmap> bitmap2, @Unsigned @OriginalName(value="sector_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_bitmap_file_unmap(Ptr<BitmapDefinitions.bitmap_storage> store) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_bitmap_free(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned @OriginalName(value="bitmap_counter_t") Short> md_bitmap_get_counter(Ptr<BitmapDefinitions.bitmap_counts> bitmap2, @Unsigned @OriginalName(value="sector_t") long offset, Ptr<@Unsigned @OriginalName(value="sector_t") Long> blocks, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_bitmap_init_from_disk(Ptr<runtime.bitmap> bitmap2, @Unsigned @OriginalName(value="sector_t") long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_bitmap_new_disk_sb(Ptr<runtime.bitmap> bitmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_bitmap_read_sb(Ptr<runtime.bitmap> bitmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_bitmap_set_memory_bits(Ptr<runtime.bitmap> bitmap2, @Unsigned @OriginalName(value="sector_t") long offset, int needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_bitmap_unplug_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_bitmap_wait_writes(Ptr<runtime.bitmap> bitmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_run_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int md_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void md_setup_drive(Ptr<md_setup_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct md_setup_args")
    @NotUsableInJava
    public static class md_setup_args
    extends Struct {
        public int minor;
        public int partitioned;
        public int level;
        public int chunk;
        public String device_names;
    }

    @Type(noCCodeGeneration=true, cType="struct md_bitmap_stats")
    @NotUsableInJava
    public static class md_bitmap_stats
    extends Struct {
        public @Unsigned long events_cleared;
        public int behind_writes;
        public boolean behind_wait;
        public @Unsigned long missing_pages;
        public @Unsigned long file_pages;
        public @Unsigned long sync_size;
        public @Unsigned long pages;
        public Ptr<runtime.file> file;
    }

    @Type(noCCodeGeneration=true, cType="struct md_io_clone")
    @NotUsableInJava
    public static class md_io_clone
    extends Struct {
        public Ptr<runtime.mddev> mddev;
        public Ptr<runtime.bio> orig_bio;
        public @Unsigned long start_time;
        public runtime.bio bio_clone;
    }

    @Type(noCCodeGeneration=true, cType="struct md_sysfs_entry")
    @NotUsableInJava
    public static class md_sysfs_entry
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="enum md_ro_state")
    public static enum md_ro_state implements Enum<md_ro_state>,
    TypedEnum<md_ro_state, Integer>
    {
        MD_RDWR,
        MD_RDONLY,
        MD_AUTO_READ,
        MD_MAX_STATE;

    }

    @Type(noCCodeGeneration=true, cType="struct md_thread")
    @NotUsableInJava
    public static class md_thread
    extends Struct {
        public Ptr<?> run;
        public Ptr<runtime.mddev> mddev;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wqueue;
        public @Unsigned long flags;
        public Ptr<TaskDefinitions.task_struct> tsk;
        public @Unsigned long timeout;
        public Ptr<?> _private;
    }

    @Type(noCCodeGeneration=true, cType="struct md_personality")
    @NotUsableInJava
    public static class md_personality
    extends Struct {
        public String name;
        public int level;
        public ListDefinitions.list_head list;
        public Ptr<runtime.module> owner;
        public Ptr<?> make_request;
        public Ptr<?> run;
        public Ptr<?> start;
        public Ptr<?> free;
        public Ptr<?> status;
        public Ptr<?> error_handler;
        public Ptr<?> hot_add_disk;
        public Ptr<?> hot_remove_disk;
        public Ptr<?> spare_active;
        public Ptr<?> sync_request;
        public Ptr<?> resize;
        public Ptr<?> size;
        public Ptr<?> check_reshape;
        public Ptr<?> start_reshape;
        public Ptr<?> finish_reshape;
        public Ptr<?> update_reshape_pos;
        public Ptr<?> prepare_suspend;
        public Ptr<?> quiesce;
        public Ptr<?> takeover;
        public Ptr<?> change_consistency_policy;
    }

    @Type(noCCodeGeneration=true, cType="struct md_rdev")
    @NotUsableInJava
    public static class md_rdev
    extends Struct {
        public ListDefinitions.list_head same_set;
        public @Unsigned @OriginalName(value="sector_t") long sectors;
        public Ptr<runtime.mddev> mddev;
        public int last_events;
        public Ptr<BlockDefinitions.block_device> meta_bdev;
        public Ptr<BlockDefinitions.block_device> bdev;
        public Ptr<runtime.file> bdev_file;
        public Ptr<runtime.page> sb_page;
        public Ptr<runtime.page> bb_page;
        public int sb_loaded;
        public @Unsigned long sb_events;
        public @Unsigned @OriginalName(value="sector_t") long data_offset;
        public @Unsigned @OriginalName(value="sector_t") long new_data_offset;
        public @Unsigned @OriginalName(value="sector_t") long sb_start;
        public int sb_size;
        public int preferred_minor;
        public runtime.kobject kobj;
        public @Unsigned long flags;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head blocked_wait;
        public int desc_nr;
        public int raid_disk;
        public int new_raid_disk;
        public int saved_raid_disk;
        @InlineUnion(value=33298)
        public @InlineUnion(value=33298) @Unsigned @OriginalName(value="sector_t") long recovery_offset;
        @InlineUnion(value=33298)
        public @InlineUnion(value=33298) @Unsigned @OriginalName(value="sector_t") long journal_tail;
        public AtomicDefinitions.atomic_t nr_pending;
        public AtomicDefinitions.atomic_t read_errors;
        public @OriginalName(value="time64_t") long last_read_error;
        public AtomicDefinitions.atomic_t corrected_errors;
        public Ptr<SerialDefinitions.serial_in_rdev> serial;
        public Ptr<KernfsDefinitions.kernfs_node> sysfs_state;
        public Ptr<KernfsDefinitions.kernfs_node> sysfs_unack_badblocks;
        public Ptr<KernfsDefinitions.kernfs_node> sysfs_badblocks;
        public runtime.badblocks badblocks;
        public misc.ppl_of_md_rdev ppl;
    }

    @Type(noCCodeGeneration=true, cType="struct md_cluster_operations")
    @NotUsableInJava
    public static class md_cluster_operations
    extends Struct {
        public Ptr<?> join;
        public Ptr<?> leave;
        public Ptr<?> slot_number;
        public Ptr<?> resync_info_update;
        public Ptr<?> resync_start_notify;
        public Ptr<?> resync_status_get;
        public Ptr<?> resync_info_get;
        public Ptr<?> metadata_update_start;
        public Ptr<?> metadata_update_finish;
        public Ptr<?> metadata_update_cancel;
        public Ptr<?> resync_start;
        public Ptr<?> resync_finish;
        public Ptr<?> area_resyncing;
        public Ptr<?> add_new_disk;
        public Ptr<?> add_new_disk_cancel;
        public Ptr<?> new_disk_ack;
        public Ptr<?> remove_disk;
        public Ptr<?> load_bitmaps;
        public Ptr<?> gather_bitmaps;
        public Ptr<?> resize_bitmaps;
        public Ptr<?> lock_all_bitmaps;
        public Ptr<?> unlock_all_bitmaps;
        public Ptr<?> update_size;
    }
}

