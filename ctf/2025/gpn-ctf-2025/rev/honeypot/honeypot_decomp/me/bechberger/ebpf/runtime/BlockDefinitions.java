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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DiskDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.PrDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XzDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class BlockDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long block_ce_count_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="block_devnode((const struct device*)$arg1, $arg2, $arg3, $arg4)")
    public static String block_devnode(Ptr<runtime.device> dev, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int block_size(Ptr<block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long block_ue_count_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="block_uevent((const struct device*)$arg1, $arg2)")
    public static int block_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __block_commit_write(Ptr<runtime.folio> folio2, @Unsigned long from, @Unsigned long to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __block_write_begin(Ptr<runtime.folio> folio2, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__block_write_begin_int($arg1, $arg2, $arg3, $arg4, (const struct iomap*)$arg5)")
    public static int __block_write_begin_int(Ptr<runtime.folio> folio2, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<?> get_block, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __block_write_full_folio(Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2, Ptr<?> get_block, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void block_commit_write(Ptr<runtime.page> page2, @Unsigned int from, @Unsigned int to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean block_dirty_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void block_invalidate_folio(Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean block_is_partially_uptodate(Ptr<runtime.folio> folio2, @Unsigned long from, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int block_page_mkwrite(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<VmDefinitions.vm_fault> vmf, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ScsiDefinitions.scsi_pr_type block_pr_type_to_scsi(PrDefinitions.pr_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int block_read_full_folio(Ptr<runtime.folio> folio2, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int block_truncate_page(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long from, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int block_write_begin(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int block_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int block_write_full_folio(Ptr<runtime.folio> folio2, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<?> get_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long block_size_bytes_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int compressed; long long unsigned int uncompressed; long long unsigned int count; struct xz_dec_hash hash; }")
    @NotUsableInJava
    public static class block_of_xz_dec
    extends Struct {
        public @Unsigned @OriginalName(value="vli_type") long compressed;
        public @Unsigned @OriginalName(value="vli_type") long uncompressed;
        public @Unsigned @OriginalName(value="vli_type") long count;
        public XzDefinitions.xz_dec_hash hash;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int compressed; long long unsigned int uncompressed; unsigned int size; }")
    @NotUsableInJava
    public static class block_header_of_xz_dec
    extends Struct {
        public @Unsigned @OriginalName(value="vli_type") long compressed;
        public @Unsigned @OriginalName(value="vli_type") long uncompressed;
        public @Unsigned @OriginalName(value="uint32_t") int size;
    }

    @Type(noCCodeGeneration=true, cType="enum block_state")
    public static enum block_state implements Enum<block_state>,
    TypedEnum<block_state, Integer>
    {
        need_more,
        block_done,
        finish_started,
        finish_done;

    }

    @Type(noCCodeGeneration=true, cType="struct block_buffer")
    @NotUsableInJava
    public static class block_buffer
    extends Struct {
        public @Unsigned int filled;
        public boolean is_root_hash;
        public Ptr<Character> data;
    }

    @Type(noCCodeGeneration=true, cType="struct block_device_operations")
    @NotUsableInJava
    public static class block_device_operations
    extends Struct {
        public Ptr<?> submit_bio;
        public Ptr<?> poll_bio;
        public Ptr<?> open;
        public Ptr<?> release;
        public Ptr<?> ioctl;
        public Ptr<?> compat_ioctl;
        public Ptr<?> check_events;
        public Ptr<?> unlock_native_capacity;
        public Ptr<?> getgeo;
        public Ptr<?> set_read_only;
        public Ptr<?> free_disk;
        public Ptr<?> swap_slot_free_notify;
        public Ptr<?> report_zones;
        public Ptr<?> devnode;
        public Ptr<?> get_unique_id;
        public Ptr<runtime.module> owner;
        public Ptr<PrDefinitions.pr_ops> pr_ops;
        public Ptr<?> alternative_gpt_sector;
    }

    @Type(noCCodeGeneration=true, cType="struct block_device")
    @NotUsableInJava
    public static class block_device
    extends Struct {
        public @Unsigned @OriginalName(value="sector_t") long bd_start_sect;
        public @Unsigned @OriginalName(value="sector_t") long bd_nr_sectors;
        public Ptr<runtime.gendisk> bd_disk;
        public Ptr<RequestDefinitions.request_queue> bd_queue;
        public Ptr<DiskDefinitions.disk_stats> bd_stats;
        public @Unsigned long bd_stamp;
        public AtomicDefinitions.atomic_t __bd_flags;
        public @Unsigned @OriginalName(value="dev_t") int bd_dev;
        public Ptr<misc.address_space> bd_mapping;
        public AtomicDefinitions.atomic_t bd_openers;
        public @OriginalName(value="spinlock_t") runtime.spinlock bd_size_lock;
        public Ptr<?> bd_claiming;
        public Ptr<?> bd_holder;
        public Ptr<BlkDefinitions.blk_holder_ops> bd_holder_ops;
        public runtime.mutex bd_holder_lock;
        public int bd_holders;
        public Ptr<runtime.kobject> bd_holder_dir;
        public AtomicDefinitions.atomic_t bd_fsfreeze_count;
        public runtime.mutex bd_fsfreeze_mutex;
        public Ptr<misc.partition_meta_info> bd_meta_info;
        public int bd_writers;
        public Ptr<?> bd_security;
        public runtime.device bd_device;
    }
}

