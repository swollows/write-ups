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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.PrDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BlkdevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blkdev_issue_discard(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="sector_t") long nr_sects, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<Ptr<runtime.bio>> biop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blkdev_issue_write_zeroes(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="sector_t") long nr_sects, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<Ptr<runtime.bio>> biop, @Unsigned int flags, @Unsigned @OriginalName(value="sector_t") long limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blkdev_issue_zero_pages(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="sector_t") long nr_sects, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<Ptr<runtime.bio>> biop, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __blkdev_issue_zeroout(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="sector_t") long nr_sects, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, Ptr<Ptr<runtime.bio>> biop, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkdev_flush_mapping(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlockDefinitions.block_device> blkdev_get_no_open(@Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_get_whole(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_issue_discard(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="sector_t") long nr_sects, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_issue_secure_erase(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="sector_t") long nr_sects, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_issue_zeroout(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="sector_t") long nr_sects, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkdev_put_no_open(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkdev_put_whole(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkdev_show(Ptr<SeqDefinitions.seq_file> seqf, @OriginalName(value="off_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_bszset(Ptr<runtime.file> file2, @Unsigned @OriginalName(value="blk_mode_t") int mode, Ptr<Integer> argp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_cmd_discard(Ptr<IoDefinitions.io_uring_cmd> cmd, Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="uint64_t") long start, @Unsigned @OriginalName(value="uint64_t") long len, boolean nowait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_common_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int cmd, @Unsigned long arg2, Ptr<?> argp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_compat_ptr_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_copy_zone_to_user(Ptr<BlkDefinitions.blk_zone> zone2, @Unsigned int idx, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long blkdev_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_pr_preempt(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, Ptr<PrDefinitions.pr_preempt> arg2, boolean abort) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_report_zones(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned int nr_zones, @OriginalName(value="report_zones_cb") Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_report_zones_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_uring_cmd(Ptr<IoDefinitions.io_uring_cmd> cmd, @Unsigned int issue_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_zone_mgmt(Ptr<BlockDefinitions.block_device> bdev, misc.req_op op, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="sector_t") long nr_sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_zone_mgmt_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_zone_reset_all(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __blkdev_direct_IO(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<BlockDefinitions.block_device> bdev, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __blkdev_direct_IO_async(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<BlockDefinitions.block_device> bdev, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __blkdev_direct_IO_simple(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<BlockDefinitions.block_device> bdev, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkdev_bio_end_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkdev_bio_end_io_async(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blkdev_direct_IO(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long blkdev_fallocate(Ptr<runtime.file> file2, int mode, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_fsync(Ptr<runtime.file> filp, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_get_block(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long iblock, Ptr<BufferDefinitions.buffer_head> bh, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_iomap_begin(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long length, @Unsigned int flags, Ptr<runtime.iomap> iomap2, Ptr<runtime.iomap> srcmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long blkdev_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_read_folio(Ptr<runtime.file> file2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blkdev_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkdev_readahead(Ptr<misc.readahead_control> rac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_write_begin(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long blkdev_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_writepages(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkdev_issue_flush(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct blkdev_dio")
    @NotUsableInJava
    public static class blkdev_dio
    extends Struct {
        @InlineUnion(value=92940)
        public @InlineUnion(value=92940) Ptr<runtime.kiocb> iocb;
        @InlineUnion(value=92940)
        public @InlineUnion(value=92940) Ptr<TaskDefinitions.task_struct> waiter;
        public @Unsigned long size;
        public AtomicDefinitions.atomic_t ref;
        public @Unsigned int flags;
        public runtime.bio bio;
    }
}

