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
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FilemapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_migrate_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> dst, Ptr<runtime.folio> src, MigrateDefinitions.migrate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> filemap_get_incore_folio(Ptr<misc.address_space> mapping, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filemap_write_page(Ptr<runtime.bitmap> bitmap2, @Unsigned long pg_index, boolean wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean filemap_dirty_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __filemap_add_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2, @Unsigned long index2, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<Ptr<?>> shadowp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __filemap_fdatawait_range(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long end_byte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __filemap_fdatawrite_range(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int sync_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> __filemap_get_folio(Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned @OriginalName(value="fgf_t") int fgp_flags, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __filemap_remove_folio(Ptr<runtime.folio> folio2, Ptr<?> shadow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __filemap_set_wb_err(Ptr<misc.address_space> mapping, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_add_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2, @Unsigned long index2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> filemap_alloc_folio_noprof(@Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filemap_cachestat(Ptr<misc.address_space> mapping, @Unsigned long first_index, @Unsigned long last_index, Ptr<cachestat> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_check_errors(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int filemap_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_fdatawait_keep_errors(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_fdatawait_range(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long end_byte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_fdatawait_range_keep_errors(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long end_byte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_fdatawrite(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_fdatawrite_range(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_fdatawrite_wbc(Ptr<misc.address_space> mapping, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_flush(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filemap_free_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> filemap_get_entry(Ptr<misc.address_space> mapping, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int filemap_get_folios(Ptr<misc.address_space> mapping, Ptr<@Unsigned Long> start, @Unsigned long end, Ptr<FolioDefinitions.folio_batch> fbatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int filemap_get_folios_contig(Ptr<misc.address_space> mapping, Ptr<@Unsigned Long> start, @Unsigned long end, Ptr<FolioDefinitions.folio_batch> fbatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int filemap_get_folios_tag(Ptr<misc.address_space> mapping, Ptr<@Unsigned Long> start, @Unsigned long end, @Unsigned @OriginalName(value="xa_mark_t") int tag, Ptr<FolioDefinitions.folio_batch> fbatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_get_pages(Ptr<runtime.kiocb> iocb2, @Unsigned long count, Ptr<FolioDefinitions.folio_batch> fbatch, boolean need_uptodate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filemap_get_read_batch(Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned long max, Ptr<FolioDefinitions.folio_batch> fbatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_invalidate_inode(Ptr<runtime.inode> inode2, boolean flush, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filemap_invalidate_lock_two(Ptr<misc.address_space> mapping1, Ptr<misc.address_space> mapping2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_invalidate_pages(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @OriginalName(value="loff_t") long end, boolean nowait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filemap_invalidate_unlock_two(Ptr<misc.address_space> mapping1, Ptr<misc.address_space> mapping2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int filemap_map_pages(Ptr<VmDefinitions.vm_fault> vmf, @Unsigned long start_pgoff, @Unsigned long end_pgoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean filemap_map_pmd(Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> folio2, @Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int filemap_page_mkwrite(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean filemap_range_has_page(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long end_byte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean filemap_range_has_writeback(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long end_byte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filemap_read(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2, @OriginalName(value="ssize_t") long already_read) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_read_folio(Ptr<runtime.file> file2, Ptr<?> filler, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean filemap_release_folio(Ptr<runtime.folio> folio2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filemap_remove_folio(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filemap_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filemap_unaccount_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_update_page(Ptr<runtime.kiocb> iocb2, Ptr<misc.address_space> mapping, @Unsigned long count, Ptr<runtime.folio> folio2, boolean need_uptodate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filemap_write_and_wait_range(Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long lend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cachestat")
    @NotUsableInJava
    public static class cachestat
    extends Struct {
        public @Unsigned long nr_cache;
        public @Unsigned long nr_dirty;
        public @Unsigned long nr_writeback;
        public @Unsigned long nr_evicted;
        public @Unsigned long nr_recently_evicted;
    }
}

