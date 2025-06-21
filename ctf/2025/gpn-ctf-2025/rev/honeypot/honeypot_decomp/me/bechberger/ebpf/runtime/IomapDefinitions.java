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
import me.bechberger.ebpf.runtime.AioDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SubmitDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IomapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__iomap_dio_rw($arg1, $arg2, (const struct iomap_ops*)$arg3, (const struct iomap_dio_ops*)$arg4, $arg5, $arg6, $arg7)")
    public static Ptr<iomap_dio> __iomap_dio_rw(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<iomap_ops> ops, Ptr<iomap_dio_ops> dops, @Unsigned int dio_flags, Ptr<?> _private, @Unsigned long done_before) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_dio_bio_end_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_dio_bio_iter((const struct iomap_iter*)$arg1, $arg2)")
    public static @OriginalName(value="loff_t") long iomap_dio_bio_iter(Ptr<iomap_iter> iter2, Ptr<iomap_dio> dio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iomap_dio_complete(Ptr<iomap_dio> dio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_dio_complete_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iomap_dio_deferred_complete(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iomap_dio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_dio_inline_iter((const struct iomap_iter*)$arg1, $arg2)")
    public static @OriginalName(value="loff_t") long iomap_dio_inline_iter(Ptr<iomap_iter> iomi, Ptr<iomap_dio> dio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_dio_rw($arg1, $arg2, (const struct iomap_ops*)$arg3, (const struct iomap_dio_ops*)$arg4, $arg5, $arg6, $arg7)")
    public static @OriginalName(value="ssize_t") long iomap_dio_rw(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<iomap_ops> ops, Ptr<iomap_dio_ops> dops, @Unsigned int dio_flags, Ptr<?> _private, @Unsigned long done_before) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_dio_submit_bio((const struct iomap_iter*)$arg1, $arg2, $arg3, $arg4)")
    public static void iomap_dio_submit_bio(Ptr<iomap_iter> iter2, Ptr<iomap_dio> dio2, Ptr<runtime.bio> bio2, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_dio_zero((const struct iomap_iter*)$arg1, $arg2, $arg3, $arg4)")
    public static int iomap_dio_zero(Ptr<iomap_iter> iter2, Ptr<iomap_dio> dio2, @OriginalName(value="loff_t") long pos, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_bmap($arg1, $arg2, (const struct iomap_ops*)$arg3)")
    public static @Unsigned @OriginalName(value="sector_t") long iomap_bmap(Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="sector_t") long bno, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_fiemap($arg1, $arg2, $arg3, $arg4, (const struct iomap_ops*)$arg5)")
    public static int iomap_fiemap(Ptr<runtime.inode> inode2, Ptr<misc.fiemap_extent_info> fi, @Unsigned long start, @Unsigned long len, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iomap_iter_advance(Ptr<iomap_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_iter_done(Ptr<iomap_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_swapfile_activate($arg1, $arg2, $arg3, (const struct iomap_ops*)$arg4)")
    public static int iomap_swapfile_activate(Ptr<SwapDefinitions.swap_info_struct> sis, Ptr<runtime.file> swap_file, Ptr<@Unsigned @OriginalName(value="sector_t") Long> pagespan, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iomap_swapfile_add_extent(Ptr<iomap_swapfile_info> isi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_swapfile_fail($arg1, (const u8*)$arg2)")
    public static int iomap_swapfile_fail(Ptr<iomap_swapfile_info> isi, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_swapfile_iter((const struct iomap_iter*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="loff_t") long iomap_swapfile_iter(Ptr<iomap_iter> iter2, Ptr<runtime.iomap> iomap2, Ptr<iomap_swapfile_info> isi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_to_bh($arg1, $arg2, $arg3, (const struct iomap*)$arg4)")
    public static int iomap_to_bh(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="sector_t") long block, Ptr<BufferDefinitions.buffer_head> bh, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_to_fiemap($arg1, (const struct iomap*)$arg2, $arg3)")
    public static int iomap_to_fiemap(Ptr<misc.fiemap_extent_info> fi, Ptr<runtime.iomap> iomap2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_seek_data($arg1, $arg2, (const struct iomap_ops*)$arg3)")
    public static @OriginalName(value="loff_t") long iomap_seek_data(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_seek_hole($arg1, $arg2, (const struct iomap_ops*)$arg3)")
    public static @OriginalName(value="loff_t") long iomap_seek_hole(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__iomap_write_begin((const struct iomap_iter*)$arg1, $arg2, $arg3, $arg4)")
    public static int __iomap_write_begin(Ptr<iomap_iter> iter2, @OriginalName(value="loff_t") long pos, @Unsigned long len, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_adjust_read_range(Ptr<runtime.inode> inode2, Ptr<runtime.folio> folio2, Ptr<@OriginalName(value="loff_t") Long> pos, @OriginalName(value="loff_t") long length, Ptr<@Unsigned Long> offp, Ptr<@Unsigned Long> lenp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iomap_buffered_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean iomap_dirty_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_file_buffered_write($arg1, $arg2, (const struct iomap_ops*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long iomap_file_buffered_write(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> i, Ptr<iomap_ops> ops, Ptr<?> _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_file_unshare($arg1, $arg2, $arg3, (const struct iomap_ops*)$arg4)")
    public static int iomap_file_unshare(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long len, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int iomap_finish_ioend(Ptr<iomap_ioend> ioend, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_finish_ioends(Ptr<iomap_ioend> ioend, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> iomap_get_folio(Ptr<iomap_iter> iter2, @OriginalName(value="loff_t") long pos, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_invalidate_folio(Ptr<runtime.folio> folio2, @Unsigned long offset, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_ioend_compare($arg1, (const struct list_head*)$arg2, (const struct list_head*)$arg3)")
    public static int iomap_ioend_compare(Ptr<?> priv, Ptr<ListDefinitions.list_head> a, Ptr<ListDefinitions.list_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_ioend_try_merge(Ptr<iomap_ioend> ioend, Ptr<ListDefinitions.list_head> more_ioends) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean iomap_is_partially_uptodate(Ptr<runtime.folio> folio2, @Unsigned long from, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_page_mkwrite($arg1, (const struct iomap_ops*)$arg2)")
    public static @Unsigned @OriginalName(value="vm_fault_t") int iomap_page_mkwrite(Ptr<VmDefinitions.vm_fault> vmf, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_read_end_io(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_read_folio($arg1, (const struct iomap_ops*)$arg2)")
    public static int iomap_read_folio(Ptr<runtime.folio> folio2, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_read_folio_sync($arg1, $arg2, $arg3, $arg4, (const struct iomap*)$arg5)")
    public static int iomap_read_folio_sync(@OriginalName(value="loff_t") long block_start, Ptr<runtime.folio> folio2, @Unsigned long poff, @Unsigned long plen, Ptr<runtime.iomap> iomap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_read_inline_data((const struct iomap_iter*)$arg1, $arg2)")
    public static int iomap_read_inline_data(Ptr<iomap_iter> iter2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_readahead($arg1, (const struct iomap_ops*)$arg2)")
    public static void iomap_readahead(Ptr<misc.readahead_control> rac, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_readpage_iter((const struct iomap_iter*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="loff_t") long iomap_readpage_iter(Ptr<iomap_iter> iter2, Ptr<iomap_readpage_ctx> ctx, @OriginalName(value="loff_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean iomap_release_folio(Ptr<runtime.folio> folio2, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_set_range_uptodate(Ptr<runtime.folio> folio2, @Unsigned long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_sort_ioends(Ptr<ListDefinitions.list_head> ioend_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iomap_submit_ioend(Ptr<iomap_writepage_ctx> wpc, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_truncate_page($arg1, $arg2, $arg3, (const struct iomap_ops*)$arg4)")
    public static int iomap_truncate_page(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, Ptr<@OriginalName(value="bool") Boolean> did_zero, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iomap_write_begin(Ptr<iomap_iter> iter2, @OriginalName(value="loff_t") long pos, @Unsigned long len, Ptr<Ptr<runtime.folio>> foliop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_write_delalloc_release(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long end_byte, @Unsigned int flags, Ptr<runtime.iomap> iomap2, @OriginalName(value="iomap_punch_t") Ptr<?> punch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_write_delalloc_scan(Ptr<runtime.inode> inode2, Ptr<@OriginalName(value="loff_t") Long> punch_start_byte, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long end_byte, Ptr<runtime.iomap> iomap2, @OriginalName(value="iomap_punch_t") Ptr<?> punch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean iomap_write_end(Ptr<iomap_iter> iter2, @OriginalName(value="loff_t") long pos, @Unsigned long len, @Unsigned long copied, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long iomap_write_iter(Ptr<iomap_iter> iter2, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iomap_writepage_end_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iomap_writepage_map(Ptr<iomap_writepage_ctx> wpc, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iomap_writepage_map_blocks(Ptr<iomap_writepage_ctx> wpc, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<runtime.folio> folio2, Ptr<runtime.inode> inode2, @Unsigned long pos, @Unsigned int dirty_len, Ptr<@Unsigned Integer> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_writepages($arg1, $arg2, $arg3, (const struct iomap_writeback_ops*)$arg4)")
    public static int iomap_writepages(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc, Ptr<iomap_writepage_ctx> wpc, Ptr<iomap_writeback_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long iomap_zero_iter(Ptr<iomap_iter> iter2, Ptr<@OriginalName(value="bool") Boolean> did_zero, Ptr<@OriginalName(value="bool") Boolean> range_dirty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iomap_zero_range($arg1, $arg2, $arg3, $arg4, (const struct iomap_ops*)$arg5)")
    public static int iomap_zero_range(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long len, Ptr<@OriginalName(value="bool") Boolean> did_zero, Ptr<iomap_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_swapfile_info")
    @NotUsableInJava
    public static class iomap_swapfile_info
    extends Struct {
        public runtime.iomap iomap;
        public Ptr<SwapDefinitions.swap_info_struct> sis;
        public @Unsigned @OriginalName(value="uint64_t") long lowest_ppage;
        public @Unsigned @OriginalName(value="uint64_t") long highest_ppage;
        public @Unsigned long nr_pages;
        public int nr_extents;
        public Ptr<runtime.file> file;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_dio")
    @NotUsableInJava
    public static class iomap_dio
    extends Struct {
        public Ptr<runtime.kiocb> iocb;
        public Ptr<iomap_dio_ops> dops;
        public @OriginalName(value="loff_t") long i_size;
        public @OriginalName(value="loff_t") long size;
        public AtomicDefinitions.atomic_t ref;
        public @Unsigned int flags;
        public int error;
        public @Unsigned long done_before;
        public boolean wait_for_completion;
        @InlineUnion(value=30116)
        public @InlineUnion(value=30116) SubmitDefinitions.submit_of_anon_member_of_iomap_dio submit;
        @InlineUnion(value=30116)
        public @InlineUnion(value=30116) AioDefinitions.aio_of_anon_member_of_iomap_dio aio;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_dio_ops")
    @NotUsableInJava
    public static class iomap_dio_ops
    extends Struct {
        public Ptr<?> end_io;
        public Ptr<?> submit_io;
        public Ptr<BioDefinitions.bio_set> bio_set;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_readpage_ctx")
    @NotUsableInJava
    public static class iomap_readpage_ctx
    extends Struct {
        public Ptr<runtime.folio> cur_folio;
        public boolean cur_folio_in_bio;
        public Ptr<runtime.bio> bio;
        public Ptr<misc.readahead_control> rac;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_folio_state")
    @NotUsableInJava
    public static class iomap_folio_state
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock state_lock;
        public @Unsigned int read_bytes_pending;
        public AtomicDefinitions.atomic_t write_bytes_pending;
        public @Unsigned long @Size(value=0) [] state;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_writepage_ctx")
    @NotUsableInJava
    public static class iomap_writepage_ctx
    extends Struct {
        public runtime.iomap iomap;
        public Ptr<iomap_ioend> ioend;
        public Ptr<iomap_writeback_ops> ops;
        public @Unsigned int nr_folios;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_writeback_ops")
    @NotUsableInJava
    public static class iomap_writeback_ops
    extends Struct {
        public Ptr<?> map_blocks;
        public Ptr<?> prepare_ioend;
        public Ptr<?> discard_folio;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_ioend")
    @NotUsableInJava
    public static class iomap_ioend
    extends Struct {
        public ListDefinitions.list_head io_list;
        public @Unsigned short io_type;
        public @Unsigned short io_flags;
        public Ptr<runtime.inode> io_inode;
        public @Unsigned long io_size;
        public @OriginalName(value="loff_t") long io_offset;
        public @Unsigned @OriginalName(value="sector_t") long io_sector;
        public runtime.bio io_bio;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_iter")
    @NotUsableInJava
    public static class iomap_iter
    extends Struct {
        public Ptr<runtime.inode> inode;
        public @OriginalName(value="loff_t") long pos;
        public @Unsigned long len;
        public long processed;
        public @Unsigned int flags;
        public runtime.iomap iomap;
        public runtime.iomap srcmap;
        public Ptr<?> _private;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_folio_ops")
    @NotUsableInJava
    public static class iomap_folio_ops
    extends Struct {
        public Ptr<?> get_folio;
        public Ptr<?> put_folio;
        public Ptr<?> iomap_valid;
    }

    @Type(noCCodeGeneration=true, cType="struct iomap_ops")
    @NotUsableInJava
    public static class iomap_ops
    extends Struct {
        public Ptr<?> iomap_begin;
        public Ptr<?> iomap_end;
    }
}

