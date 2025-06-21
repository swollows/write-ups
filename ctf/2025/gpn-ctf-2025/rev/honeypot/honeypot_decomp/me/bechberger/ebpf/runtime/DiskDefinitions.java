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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.KobjectDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DiskDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __disk_unblock_events(Ptr<runtime.gendisk> disk, boolean check_now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_add_events(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_alignment_offset_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int disk_alloc_events(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_badblocks_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="disk_badblocks_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long disk_badblocks_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_block_events(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_capability_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_check_events(Ptr<disk_events> ev, Ptr<@Unsigned Integer> clearing_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean disk_check_media_change(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_del_events(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_discard_alignment_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_event_uevent(Ptr<runtime.gendisk> disk, @Unsigned int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_events_async_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_events_poll_msecs_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="disk_events_poll_msecs_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long disk_events_poll_msecs_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="disk_events_set_dfl_poll_msecs((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int disk_events_set_dfl_poll_msecs(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_events_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_events_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_ext_range_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_flush_events(Ptr<runtime.gendisk> disk, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_force_media_change(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean disk_has_partscan(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_hidden_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean disk_live(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_range_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_release_events(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_removable_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_ro_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int disk_scan_partitions(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="blk_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> disk_seqf_next(Ptr<SeqDefinitions.seq_file> seqf, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> disk_seqf_start(Ptr<SeqDefinitions.seq_file> seqf, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_seqf_stop(Ptr<SeqDefinitions.seq_file> seqf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long disk_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="disk_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long disk_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_uevent(Ptr<runtime.gendisk> disk, KobjectDefinitions.kobject_action action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_unblock_events(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short disk_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlkDefinitions.blk_independent_access_ranges> disk_alloc_independent_access_ranges(Ptr<runtime.gendisk> disk, int nr_ia_ranges) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int disk_alloc_zone_resources(Ptr<runtime.gendisk> disk, @Unsigned int pool_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_free_zone_resources(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_free_zone_wplug_rcu(Ptr<misc.callback_head> callback_head2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlkDefinitions.blk_zone_wplug> disk_get_and_lock_zone_wplug(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlkDefinitions.blk_zone_wplug> disk_get_zone_wplug(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="sector_t") long sector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_init_zone_resources(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int disk_register_independent_access_ranges(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_remove_zone_wplug(Ptr<runtime.gendisk> disk, Ptr<BlkDefinitions.blk_zone_wplug> zwplug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_set_independent_access_ranges(Ptr<runtime.gendisk> disk, Ptr<BlkDefinitions.blk_independent_access_ranges> iars) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean disk_unlock_native_capacity(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_unregister_independent_access_ranges(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int disk_update_zone_resources(Ptr<runtime.gendisk> disk, Ptr<BlkDefinitions.blk_revalidate_zone_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_zone_wplug_abort(Ptr<BlkDefinitions.blk_zone_wplug> zwplug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_zone_wplug_set_wp_offset(Ptr<runtime.gendisk> disk, Ptr<BlkDefinitions.blk_zone_wplug> zwplug, @Unsigned int wp_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_zone_wplug_unplug_bio(Ptr<runtime.gendisk> disk, Ptr<BlkDefinitions.blk_zone_wplug> zwplug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void disk_zone_wplugs_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct disk_events")
    @NotUsableInJava
    public static class disk_events
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<runtime.gendisk> disk;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public runtime.mutex block_mutex;
        public int block;
        public @Unsigned int pending;
        public @Unsigned int clearing;
        public long poll_msecs;
        public DelayedDefinitions.delayed_work dwork;
    }

    @Type(noCCodeGeneration=true, cType="struct disk_comp_opts")
    @NotUsableInJava
    public static class disk_comp_opts
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int dictionary_size;
        public @Unsigned @OriginalName(value="__le32") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct disk_stats")
    @NotUsableInJava
    public static class disk_stats
    extends Struct {
        public @Unsigned long @Size(value=4) [] nsecs;
        public @Unsigned long @Size(value=4) [] sectors;
        public @Unsigned long @Size(value=4) [] ios;
        public @Unsigned long @Size(value=4) [] merges;
        public @Unsigned long io_ticks;
        public LocalDefinitions.local_t @Size(value=2) [] in_flight;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 device; unsigned int mbr_signature; }")
    @NotUsableInJava
    public static class disk_mbr_signature_of_u_of_xenpf_firmware_info
    extends Struct {
        public @OriginalName(value="uint8_t") char device;
        public @Unsigned @OriginalName(value="uint32_t") int mbr_signature;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 device; u8 version; short unsigned int interface_support; short unsigned int legacy_max_cylinder; u8 legacy_max_head; u8 legacy_sectors_per_track; void *edd_params; }")
    @NotUsableInJava
    public static class disk_info_of_u_of_xenpf_firmware_info
    extends Struct {
        public @OriginalName(value="uint8_t") char device;
        public @OriginalName(value="uint8_t") char version;
        public @Unsigned @OriginalName(value="uint16_t") short interface_support;
        public @Unsigned @OriginalName(value="uint16_t") short legacy_max_cylinder;
        public @OriginalName(value="uint8_t") char legacy_max_head;
        public @OriginalName(value="uint8_t") char legacy_sectors_per_track;
        public @OriginalName(value="__guest_handle_void") Ptr<?> edd_params;
    }
}

