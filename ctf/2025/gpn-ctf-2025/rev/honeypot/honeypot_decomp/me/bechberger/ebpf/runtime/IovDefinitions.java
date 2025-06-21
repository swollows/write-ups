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
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IovDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iov_resources_unassigned(Ptr<PciDefinitions.pci_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __iov_iter_get_pages_alloc(Ptr<iov_iter> i, Ptr<Ptr<Ptr<runtime.page>>> pages, @Unsigned long maxsize, @Unsigned int maxpages, Ptr<@Unsigned Long> start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iov_iter_advance(Ptr<iov_iter> i, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iov_iter_alignment((const struct iov_iter*)$arg1)")
    public static @Unsigned long iov_iter_alignment(Ptr<iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iov_iter_bvec($arg1, $arg2, (const struct bio_vec*)$arg3, $arg4, $arg5)")
    public static void iov_iter_bvec(Ptr<iov_iter> i, @Unsigned int direction, Ptr<BioDefinitions.bio_vec> bvec, @Unsigned long nr_segs, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iov_iter_discard(Ptr<iov_iter> i, @Unsigned int direction, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iov_iter_extract_pages(Ptr<iov_iter> i, Ptr<Ptr<Ptr<runtime.page>>> pages, @Unsigned long maxsize, @Unsigned int maxpages, @Unsigned @OriginalName(value="iov_iter_extraction_t") int extraction_flags, Ptr<@Unsigned Long> offset0) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iov_iter_folio_queue($arg1, $arg2, (const struct folio_queue*)$arg3, $arg4, $arg5, $arg6)")
    public static void iov_iter_folio_queue(Ptr<iov_iter> i, @Unsigned int direction, Ptr<FolioDefinitions.folio_queue> folioq, @Unsigned int first_slot, @Unsigned int offset, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iov_iter_gap_alignment((const struct iov_iter*)$arg1)")
    public static @Unsigned long iov_iter_gap_alignment(Ptr<iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iov_iter_get_pages2(Ptr<iov_iter> i, Ptr<Ptr<runtime.page>> pages, @Unsigned long maxsize, @Unsigned int maxpages, Ptr<@Unsigned Long> start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iov_iter_get_pages_alloc2(Ptr<iov_iter> i, Ptr<Ptr<Ptr<runtime.page>>> pages, @Unsigned long maxsize, Ptr<@Unsigned Long> start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iov_iter_init($arg1, $arg2, (const struct iovec*)$arg3, $arg4, $arg5)")
    public static void iov_iter_init(Ptr<iov_iter> i, @Unsigned int direction, Ptr<runtime.iovec> iov, @Unsigned long nr_segs, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iov_iter_is_aligned((const struct iov_iter*)$arg1, $arg2, $arg3)")
    public static boolean iov_iter_is_aligned(Ptr<iov_iter> i, @Unsigned int addr_mask, @Unsigned int len_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iov_iter_kvec($arg1, $arg2, (const struct kvec*)$arg3, $arg4, $arg5)")
    public static void iov_iter_kvec(Ptr<iov_iter> i, @Unsigned int direction, Ptr<runtime.kvec> kvec2, @Unsigned long nr_segs, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iov_iter_npages((const struct iov_iter*)$arg1, $arg2)")
    public static int iov_iter_npages(Ptr<iov_iter> i, int maxpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iov_iter_restore(Ptr<iov_iter> i, Ptr<iov_iter_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iov_iter_revert(Ptr<iov_iter> i, @Unsigned long unroll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iov_iter_single_seg_count((const struct iov_iter*)$arg1)")
    public static @Unsigned long iov_iter_single_seg_count(Ptr<iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iov_iter_xarray(Ptr<iov_iter> i, @Unsigned int direction, Ptr<runtime.xarray> xarray2, @OriginalName(value="loff_t") long start, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iov_iter_zero(@Unsigned long bytes, Ptr<iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct iov_iter_state")
    @NotUsableInJava
    public static class iov_iter_state
    extends Struct {
        public @Unsigned long iov_offset;
        public @Unsigned long count;
        public @Unsigned long nr_segs;
    }

    @Type(noCCodeGeneration=true, cType="struct iov_iter")
    @NotUsableInJava
    public static class iov_iter
    extends Struct {
        public char iter_type;
        public boolean nofault;
        public boolean data_source;
        public @Unsigned long iov_offset;
        @InlineUnion(value=969)
        public  @InlineUnion(value=969) runtime.iovec __ubuf_iovec;
        @InlineUnion(value=969)
        public  @InlineUnion(value=969) AnonDefinitions.anon_member_of_anon_member_of_iov_iter anon4$1;
        @InlineUnion(value=970)
        public @InlineUnion(value=970) @Unsigned long nr_segs;
        @InlineUnion(value=970)
        public @InlineUnion(value=970) char folioq_slot;
        @InlineUnion(value=970)
        public @InlineUnion(value=970) @OriginalName(value="loff_t") long xarray_start;
    }
}

