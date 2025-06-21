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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BdevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_add(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlockDefinitions.block_device> bdev_alloc(Ptr<runtime.gendisk> disk, char partno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> bdev_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_cache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_drop(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bdev_file_open_by_dev($arg1, $arg2, $arg3, (const struct blk_holder_ops*)$arg4)")
    public static Ptr<runtime.file> bdev_file_open_by_dev(@Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="blk_mode_t") int mode, Ptr<?> holder, Ptr<BlkDefinitions.blk_holder_ops> hops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bdev_file_open_by_path((const u8*)$arg1, $arg2, $arg3, (const struct blk_holder_ops*)$arg4)")
    public static Ptr<runtime.file> bdev_file_open_by_path(String path2, @Unsigned @OriginalName(value="blk_mode_t") int mode, Ptr<?> holder, Ptr<BlkDefinitions.blk_holder_ops> hops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_fput(Ptr<runtime.file> bdev_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdev_freeze(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_mark_dead(Ptr<BlockDefinitions.block_device> bdev, boolean surprise) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bdev_name($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static String bdev_name(String buf, String end, Ptr<BlockDefinitions.block_device> bdev, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bdev_open($arg1, $arg2, $arg3, (const struct blk_holder_ops*)$arg4, $arg5)")
    public static int bdev_open(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, Ptr<?> holder, Ptr<BlkDefinitions.blk_holder_ops> hops, Ptr<runtime.file> bdev_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdev_permission(@Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="blk_mode_t") int mode, Ptr<?> holder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_release(Ptr<runtime.file> bdev_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_set_nr_sectors(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_statx(Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdev_thaw(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_unhash(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_yield_write_access(Ptr<runtime.file> bdev_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdev_add_partition(Ptr<runtime.gendisk> disk, int partno, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdev_alignment_offset(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdev_del_partition(Ptr<runtime.gendisk> disk, int partno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int bdev_discard_alignment(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdev_disk_changed(Ptr<runtime.gendisk> disk, boolean invalidate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> bdev_getblk(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long block, @Unsigned int size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bdev_resize_partition(Ptr<runtime.gendisk> disk, int partno, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bdev_end_io_acct(Ptr<BlockDefinitions.block_device> bdev, misc.req_op op, @Unsigned int sectors, @Unsigned long start_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bdev_start_io_acct(Ptr<BlockDefinitions.block_device> bdev, misc.req_op op, @Unsigned long start_time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SuperDefinitions.super_block> bdev_super_lock(Ptr<BlockDefinitions.block_device> bdev, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct bdev_inode")
    @NotUsableInJava
    public static class bdev_inode
    extends Struct {
        public BlockDefinitions.block_device bdev;
        public runtime.inode vfs_inode;
    }
}

