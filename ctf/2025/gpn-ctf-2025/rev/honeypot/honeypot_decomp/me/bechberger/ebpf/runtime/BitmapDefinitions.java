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
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class BitmapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_list_string($arg1, $arg2, (const long unsigned int*)$arg3, $arg4, (const u8*)$arg5)")
    public static String bitmap_list_string(String buf, String end, Ptr<@Unsigned Long> bitmap2, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_parse((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int bitmap_parse(String start, @Unsigned int buflen, Ptr<@Unsigned Long> maskp, int nmaskbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_parse_user((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int bitmap_parse_user(String ubuf, @Unsigned int ulen, Ptr<@Unsigned Long> maskp, int nmaskbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_parselist((const u8*)$arg1, $arg2, $arg3)")
    public static int bitmap_parselist(String buf, Ptr<@Unsigned Long> maskp, int nmaskbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_parselist_user((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int bitmap_parselist_user(String ubuf, @Unsigned int ulen, Ptr<@Unsigned Long> maskp, int nmaskbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_print_bitmask_to_buf($arg1, (const long unsigned int*)$arg2, $arg3, $arg4, $arg5)")
    public static int bitmap_print_bitmask_to_buf(String buf, Ptr<@Unsigned Long> maskp, int nmaskbits, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_print_list_to_buf($arg1, (const long unsigned int*)$arg2, $arg3, $arg4, $arg5)")
    public static int bitmap_print_list_to_buf(String buf, Ptr<@Unsigned Long> maskp, int nmaskbits, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_print_to_buf($arg1, $arg2, (const long unsigned int*)$arg3, $arg4, $arg5, $arg6)")
    public static int bitmap_print_to_buf(boolean list, String buf, Ptr<@Unsigned Long> maskp, int nmaskbits, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_print_to_pagebuf($arg1, $arg2, (const long unsigned int*)$arg3, $arg4)")
    public static int bitmap_print_to_pagebuf(boolean list, String buf, Ptr<@Unsigned Long> maskp, int nmaskbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bitmap_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_string($arg1, $arg2, (const long unsigned int*)$arg3, $arg4, (const u8*)$arg5)")
    public static String bitmap_string(String buf, String end, Ptr<@Unsigned Long> bitmap2, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bitmap> __bitmap_create(Ptr<runtime.mddev> mddev2, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bitmap_end_sync(Ptr<runtime.bitmap> bitmap2, @Unsigned @OriginalName(value="sector_t") long offset, Ptr<@Unsigned @OriginalName(value="sector_t") Long> blocks, boolean aborted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bitmap_resize(Ptr<runtime.bitmap> bitmap2, @Unsigned @OriginalName(value="sector_t") long blocks, int chunksize, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bitmap_unplug(Ptr<runtime.bitmap> bitmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_close_sync(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_cond_end_sync(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="sector_t") long sector, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bitmap_copy_from_slot(Ptr<runtime.mddev> mddev2, int slot2, Ptr<@Unsigned @OriginalName(value="sector_t") Long> low, Ptr<@Unsigned @OriginalName(value="sector_t") Long> high, boolean clear_bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bitmap_create(Ptr<runtime.mddev> mddev2, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_daemon_work(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_destroy(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_dirty_bits(Ptr<runtime.mddev> mddev2, @Unsigned long s2, @Unsigned long e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bitmap_enabled(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_end_sync(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="sector_t") long offset, Ptr<@Unsigned @OriginalName(value="sector_t") Long> blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_endwrite(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned long sectors, boolean success, boolean behind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_flush(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bitmap_get_from_slot(Ptr<runtime.mddev> mddev2, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bitmap_get_stats(Ptr<?> data, Ptr<MdDefinitions.md_bitmap_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bitmap_load(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_print_sb(Ptr<runtime.bitmap> bitmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bitmap_resize(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="sector_t") long blocks, int chunksize, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_set_pages(Ptr<?> data, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean bitmap_start_sync(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="sector_t") long offset, Ptr<@Unsigned @OriginalName(value="sector_t") Long> blocks, boolean degraded) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bitmap_startwrite(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned long sectors, boolean behind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_sync_with_cluster(Ptr<runtime.mddev> mddev2, @Unsigned @OriginalName(value="sector_t") long old_lo, @Unsigned @OriginalName(value="sector_t") long old_hi, @Unsigned @OriginalName(value="sector_t") long new_lo, @Unsigned @OriginalName(value="sector_t") long new_hi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_unplug(Ptr<runtime.mddev> mddev2, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_update_sb(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_wait_behind_writes(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bitmap_write_all(Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_and($arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, $arg4)")
    public static boolean __bitmap_and(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_andnot($arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, $arg4)")
    public static boolean __bitmap_andnot(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bitmap_clear(Ptr<@Unsigned Long> map2, @Unsigned int start, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_complement($arg1, (const long unsigned int*)$arg2, $arg3)")
    public static void __bitmap_complement(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> src, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_equal((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3)")
    public static boolean __bitmap_equal(Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_intersects((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3)")
    public static boolean __bitmap_intersects(Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_or($arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, $arg4)")
    public static void __bitmap_or(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_or_equal((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, $arg4)")
    public static boolean __bitmap_or_equal(Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, Ptr<@Unsigned Long> bitmap3, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_replace($arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, (const long unsigned int*)$arg4, $arg5)")
    public static void __bitmap_replace(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> old, Ptr<@Unsigned Long> _new, Ptr<@Unsigned Long> mask, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bitmap_set(Ptr<@Unsigned Long> map2, @Unsigned int start, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_shift_left($arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static void __bitmap_shift_left(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> src, @Unsigned int shift, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_shift_right($arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static void __bitmap_shift_right(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> src, @Unsigned int shift, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_subset((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3)")
    public static boolean __bitmap_subset(Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_weight((const long unsigned int*)$arg1, $arg2)")
    public static @Unsigned int __bitmap_weight(Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_weight_and((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3)")
    public static @Unsigned int __bitmap_weight_and(Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_weight_andnot((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3)")
    public static @Unsigned int __bitmap_weight_andnot(Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__bitmap_xor($arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, $arg4)")
    public static void __bitmap_xor(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> bitmap1, Ptr<@Unsigned Long> bitmap2, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> bitmap_alloc(@Unsigned int nbits, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> bitmap_alloc_node(@Unsigned int nbits, @Unsigned @OriginalName(value="gfp_t") int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_bitremap($arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, $arg4)")
    public static int bitmap_bitremap(int oldbit, Ptr<@Unsigned Long> old, Ptr<@Unsigned Long> _new, int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bitmap_clear_ll(Ptr<@Unsigned Long> map2, @Unsigned long start, @Unsigned long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_cut($arg1, (const long unsigned int*)$arg2, $arg3, $arg4, $arg5)")
    public static void bitmap_cut(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> src, @Unsigned int first, @Unsigned int cut, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long bitmap_find_next_zero_area_off(Ptr<@Unsigned Long> map2, @Unsigned long size, @Unsigned long start, @Unsigned int nr, @Unsigned long align_mask, @Unsigned long align_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_fold($arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static void bitmap_fold(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> orig, @Unsigned int sz, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_free((const long unsigned int*)$arg1)")
    public static void bitmap_free(Ptr<@Unsigned Long> bitmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_from_arr32($arg1, (const unsigned int*)$arg2, $arg3)")
    public static void bitmap_from_arr32(Ptr<@Unsigned Long> bitmap2, Ptr<@Unsigned Integer> buf, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_onto($arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, $arg4)")
    public static void bitmap_onto(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> orig, Ptr<@Unsigned Long> relmap, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_pos_to_ord((const long unsigned int*)$arg1, $arg2, $arg3)")
    public static int bitmap_pos_to_ord(Ptr<@Unsigned Long> buf, @Unsigned int pos, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_remap($arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, (const long unsigned int*)$arg4, $arg5)")
    public static void bitmap_remap(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> src, Ptr<@Unsigned Long> old, Ptr<@Unsigned Long> _new, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bitmap_to_arr32($arg1, (const long unsigned int*)$arg2, $arg3)")
    public static void bitmap_to_arr32(Ptr<@Unsigned Integer> buf, Ptr<@Unsigned Long> bitmap2, @Unsigned int nbits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> bitmap_zalloc(@Unsigned int nbits, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> bitmap_zalloc_node(@Unsigned int nbits, @Unsigned @OriginalName(value="gfp_t") int flags, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct bitmap_unplug_work")
    @NotUsableInJava
    public static class bitmap_unplug_work
    extends Struct {
        public misc.work_struct work;
        public Ptr<runtime.bitmap> bitmap;
        public Ptr<runtime.completion> done;
    }

    @Type(noCCodeGeneration=true, cType="enum bitmap_page_attr")
    public static enum bitmap_page_attr implements Enum<bitmap_page_attr>,
    TypedEnum<bitmap_page_attr, Integer>
    {
        BITMAP_PAGE_DIRTY,
        BITMAP_PAGE_PENDING,
        BITMAP_PAGE_NEEDWRITE;

    }

    @Type(noCCodeGeneration=true, cType="struct bitmap_storage")
    @NotUsableInJava
    public static class bitmap_storage
    extends Struct {
        public Ptr<runtime.file> file;
        public Ptr<runtime.page> sb_page;
        public @Unsigned long sb_index;
        public Ptr<Ptr<runtime.page>> filemap;
        public Ptr<@Unsigned Long> filemap_attr;
        public @Unsigned long file_pages;
        public @Unsigned long bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct bitmap_counts")
    @NotUsableInJava
    public static class bitmap_counts
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<bitmap_page> bp;
        public @Unsigned long pages;
        public @Unsigned long missing_pages;
        public @Unsigned long chunkshift;
        public @Unsigned long chunks;
    }

    @Type(noCCodeGeneration=true, cType="struct bitmap_page")
    @NotUsableInJava
    public static class bitmap_page
    extends Struct {
        public String map;
        public @Unsigned int hijacked;
        public @Unsigned int pending;
        public @Unsigned int count;
    }

    @Type(noCCodeGeneration=true, cType="struct bitmap_super_s")
    @NotUsableInJava
    public static class bitmap_super_s
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int magic;
        public @Unsigned @OriginalName(value="__le32") int version;
        public char @Size(value=16) [] uuid;
        public @Unsigned @OriginalName(value="__le64") long events;
        public @Unsigned @OriginalName(value="__le64") long events_cleared;
        public @Unsigned @OriginalName(value="__le64") long sync_size;
        public @Unsigned @OriginalName(value="__le32") int state;
        public @Unsigned @OriginalName(value="__le32") int chunksize;
        public @Unsigned @OriginalName(value="__le32") int daemon_sleep;
        public @Unsigned @OriginalName(value="__le32") int write_behind;
        public @Unsigned @OriginalName(value="__le32") int sectors_reserved;
        public @Unsigned @OriginalName(value="__le32") int nodes;
        public char @Size(value=64) [] cluster_name;
        public char @Size(value=120) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="enum bitmap_state")
    public static enum bitmap_state implements Enum<bitmap_state>,
    TypedEnum<bitmap_state, Integer>
    {
        BITMAP_STALE,
        BITMAP_WRITE_ERROR,
        BITMAP_HOSTENDIAN;

    }

    @Type(noCCodeGeneration=true, cType="struct bitmap_operations")
    @NotUsableInJava
    public static class bitmap_operations
    extends Struct {
        public Ptr<?> enabled;
        public Ptr<?> create;
        public Ptr<?> resize;
        public Ptr<?> load;
        public Ptr<?> destroy;
        public Ptr<?> flush;
        public Ptr<?> write_all;
        public Ptr<?> dirty_bits;
        public Ptr<?> unplug;
        public Ptr<?> daemon_work;
        public Ptr<?> wait_behind_writes;
        public Ptr<?> startwrite;
        public Ptr<?> endwrite;
        public Ptr<?> start_sync;
        public Ptr<?> end_sync;
        public Ptr<?> cond_end_sync;
        public Ptr<?> close_sync;
        public Ptr<?> update_sb;
        public Ptr<?> get_stats;
        public Ptr<?> sync_with_cluster;
        public Ptr<?> get_from_slot;
        public Ptr<?> copy_from_slot;
        public Ptr<?> set_pages;
        public Ptr<?> free;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct file *file; long long int offset; long unsigned int space; long long int default_offset; long unsigned int default_space; struct mutex mutex; long unsigned int chunksize; long unsigned int daemon_sleep; long unsigned int max_write_behind; int external; int nodes; u8 cluster_name[64]; }")
    @NotUsableInJava
    public static class bitmap_info_of_mddev
    extends Struct {
        public Ptr<runtime.file> file;
        public @OriginalName(value="loff_t") long offset;
        public @Unsigned long space;
        public @OriginalName(value="loff_t") long default_offset;
        public @Unsigned long default_space;
        public runtime.mutex mutex;
        public @Unsigned long chunksize;
        public @Unsigned long daemon_sleep;
        public @Unsigned long max_write_behind;
        public int external;
        public int nodes;
        public char @Size(value=64) [] cluster_name;
    }
}

