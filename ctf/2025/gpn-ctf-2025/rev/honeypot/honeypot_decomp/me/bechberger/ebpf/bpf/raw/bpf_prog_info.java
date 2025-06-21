/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.SegmentAllocator
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class bpf_prog_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("type"), Lib.C_INT.withName("id"), MemoryLayout.sequenceLayout((long)8L, (MemoryLayout)Lib.C_CHAR).withName("tag"), Lib.C_INT.withName("jited_prog_len"), Lib.C_INT.withName("xlated_prog_len"), Lib.C_LONG_LONG.withName("jited_prog_insns"), Lib.C_LONG_LONG.withName("xlated_prog_insns"), Lib.C_LONG_LONG.withName("load_time"), Lib.C_INT.withName("created_by_uid"), Lib.C_INT.withName("nr_map_ids"), Lib.C_LONG_LONG.withName("map_ids"), MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("name"), Lib.C_INT.withName("ifindex"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("netns_dev"), Lib.C_LONG_LONG.withName("netns_ino"), Lib.C_INT.withName("nr_jited_ksyms"), Lib.C_INT.withName("nr_jited_func_lens"), Lib.C_LONG_LONG.withName("jited_ksyms"), Lib.C_LONG_LONG.withName("jited_func_lens"), Lib.C_INT.withName("btf_id"), Lib.C_INT.withName("func_info_rec_size"), Lib.C_LONG_LONG.withName("func_info"), Lib.C_INT.withName("nr_func_info"), Lib.C_INT.withName("nr_line_info"), Lib.C_LONG_LONG.withName("line_info"), Lib.C_LONG_LONG.withName("jited_line_info"), Lib.C_INT.withName("nr_jited_line_info"), Lib.C_INT.withName("line_info_rec_size"), Lib.C_INT.withName("jited_line_info_rec_size"), Lib.C_INT.withName("nr_prog_tags"), Lib.C_LONG_LONG.withName("prog_tags"), Lib.C_LONG_LONG.withName("run_time_ns"), Lib.C_LONG_LONG.withName("run_cnt"), Lib.C_LONG_LONG.withName("recursion_misses"), Lib.C_INT.withName("verified_insns"), Lib.C_INT.withName("attach_btf_obj_id"), Lib.C_INT.withName("attach_btf_id"), MemoryLayout.paddingLayout((long)4L)}).withName("bpf_prog_info");
    private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
    private static final long type$OFFSET = 0L;
    private static final ValueLayout.OfInt id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"id")});
    private static final long id$OFFSET = 4L;
    private static final SequenceLayout tag$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tag")});
    private static final long tag$OFFSET = 8L;
    private static long[] tag$DIMS = new long[]{8L};
    private static final VarHandle tag$ELEM_HANDLE = tag$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt jited_prog_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"jited_prog_len")});
    private static final long jited_prog_len$OFFSET = 16L;
    private static final ValueLayout.OfInt xlated_prog_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"xlated_prog_len")});
    private static final long xlated_prog_len$OFFSET = 20L;
    private static final ValueLayout.OfLong jited_prog_insns$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"jited_prog_insns")});
    private static final long jited_prog_insns$OFFSET = 24L;
    private static final ValueLayout.OfLong xlated_prog_insns$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"xlated_prog_insns")});
    private static final long xlated_prog_insns$OFFSET = 32L;
    private static final ValueLayout.OfLong load_time$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"load_time")});
    private static final long load_time$OFFSET = 40L;
    private static final ValueLayout.OfInt created_by_uid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"created_by_uid")});
    private static final long created_by_uid$OFFSET = 48L;
    private static final ValueLayout.OfInt nr_map_ids$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nr_map_ids")});
    private static final long nr_map_ids$OFFSET = 52L;
    private static final ValueLayout.OfLong map_ids$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_ids")});
    private static final long map_ids$OFFSET = 56L;
    private static final SequenceLayout name$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name")});
    private static final long name$OFFSET = 64L;
    private static long[] name$DIMS = new long[]{16L};
    private static final VarHandle name$ELEM_HANDLE = name$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
    private static final long ifindex$OFFSET = 80L;
    private static final ValueLayout.OfLong netns_dev$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"netns_dev")});
    private static final long netns_dev$OFFSET = 88L;
    private static final ValueLayout.OfLong netns_ino$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"netns_ino")});
    private static final long netns_ino$OFFSET = 96L;
    private static final ValueLayout.OfInt nr_jited_ksyms$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nr_jited_ksyms")});
    private static final long nr_jited_ksyms$OFFSET = 104L;
    private static final ValueLayout.OfInt nr_jited_func_lens$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nr_jited_func_lens")});
    private static final long nr_jited_func_lens$OFFSET = 108L;
    private static final ValueLayout.OfLong jited_ksyms$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"jited_ksyms")});
    private static final long jited_ksyms$OFFSET = 112L;
    private static final ValueLayout.OfLong jited_func_lens$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"jited_func_lens")});
    private static final long jited_func_lens$OFFSET = 120L;
    private static final ValueLayout.OfInt btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_id")});
    private static final long btf_id$OFFSET = 128L;
    private static final ValueLayout.OfInt func_info_rec_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"func_info_rec_size")});
    private static final long func_info_rec_size$OFFSET = 132L;
    private static final ValueLayout.OfLong func_info$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"func_info")});
    private static final long func_info$OFFSET = 136L;
    private static final ValueLayout.OfInt nr_func_info$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nr_func_info")});
    private static final long nr_func_info$OFFSET = 144L;
    private static final ValueLayout.OfInt nr_line_info$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nr_line_info")});
    private static final long nr_line_info$OFFSET = 148L;
    private static final ValueLayout.OfLong line_info$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"line_info")});
    private static final long line_info$OFFSET = 152L;
    private static final ValueLayout.OfLong jited_line_info$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"jited_line_info")});
    private static final long jited_line_info$OFFSET = 160L;
    private static final ValueLayout.OfInt nr_jited_line_info$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nr_jited_line_info")});
    private static final long nr_jited_line_info$OFFSET = 168L;
    private static final ValueLayout.OfInt line_info_rec_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"line_info_rec_size")});
    private static final long line_info_rec_size$OFFSET = 172L;
    private static final ValueLayout.OfInt jited_line_info_rec_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"jited_line_info_rec_size")});
    private static final long jited_line_info_rec_size$OFFSET = 176L;
    private static final ValueLayout.OfInt nr_prog_tags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"nr_prog_tags")});
    private static final long nr_prog_tags$OFFSET = 180L;
    private static final ValueLayout.OfLong prog_tags$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_tags")});
    private static final long prog_tags$OFFSET = 184L;
    private static final ValueLayout.OfLong run_time_ns$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"run_time_ns")});
    private static final long run_time_ns$OFFSET = 192L;
    private static final ValueLayout.OfLong run_cnt$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"run_cnt")});
    private static final long run_cnt$OFFSET = 200L;
    private static final ValueLayout.OfLong recursion_misses$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"recursion_misses")});
    private static final long recursion_misses$OFFSET = 208L;
    private static final ValueLayout.OfInt verified_insns$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"verified_insns")});
    private static final long verified_insns$OFFSET = 216L;
    private static final ValueLayout.OfInt attach_btf_obj_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_btf_obj_id")});
    private static final long attach_btf_obj_id$OFFSET = 220L;
    private static final ValueLayout.OfInt attach_btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_btf_id")});
    private static final long attach_btf_id$OFFSET = 224L;

    bpf_prog_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt type$layout() {
        return type$LAYOUT;
    }

    public static final long type$offset() {
        return 0L;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, 0L);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt id$layout() {
        return id$LAYOUT;
    }

    public static final long id$offset() {
        return 4L;
    }

    public static int id(MemorySegment struct) {
        return struct.get(id$LAYOUT, 4L);
    }

    public static void id(MemorySegment struct, int fieldValue) {
        struct.set(id$LAYOUT, 4L, fieldValue);
    }

    public static final SequenceLayout tag$layout() {
        return tag$LAYOUT;
    }

    public static final long tag$offset() {
        return 8L;
    }

    public static MemorySegment tag(MemorySegment struct) {
        return struct.asSlice(8L, tag$LAYOUT.byteSize());
    }

    public static void tag(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)8L, (long)tag$LAYOUT.byteSize());
    }

    public static long[] tag$dimensions() {
        return tag$DIMS;
    }

    public static byte tag(MemorySegment struct, long index0) {
        return tag$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void tag(MemorySegment struct, long index0, byte fieldValue) {
        tag$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt jited_prog_len$layout() {
        return jited_prog_len$LAYOUT;
    }

    public static final long jited_prog_len$offset() {
        return 16L;
    }

    public static int jited_prog_len(MemorySegment struct) {
        return struct.get(jited_prog_len$LAYOUT, 16L);
    }

    public static void jited_prog_len(MemorySegment struct, int fieldValue) {
        struct.set(jited_prog_len$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt xlated_prog_len$layout() {
        return xlated_prog_len$LAYOUT;
    }

    public static final long xlated_prog_len$offset() {
        return 20L;
    }

    public static int xlated_prog_len(MemorySegment struct) {
        return struct.get(xlated_prog_len$LAYOUT, 20L);
    }

    public static void xlated_prog_len(MemorySegment struct, int fieldValue) {
        struct.set(xlated_prog_len$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfLong jited_prog_insns$layout() {
        return jited_prog_insns$LAYOUT;
    }

    public static final long jited_prog_insns$offset() {
        return 24L;
    }

    public static long jited_prog_insns(MemorySegment struct) {
        return struct.get(jited_prog_insns$LAYOUT, 24L);
    }

    public static void jited_prog_insns(MemorySegment struct, long fieldValue) {
        struct.set(jited_prog_insns$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfLong xlated_prog_insns$layout() {
        return xlated_prog_insns$LAYOUT;
    }

    public static final long xlated_prog_insns$offset() {
        return 32L;
    }

    public static long xlated_prog_insns(MemorySegment struct) {
        return struct.get(xlated_prog_insns$LAYOUT, 32L);
    }

    public static void xlated_prog_insns(MemorySegment struct, long fieldValue) {
        struct.set(xlated_prog_insns$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfLong load_time$layout() {
        return load_time$LAYOUT;
    }

    public static final long load_time$offset() {
        return 40L;
    }

    public static long load_time(MemorySegment struct) {
        return struct.get(load_time$LAYOUT, 40L);
    }

    public static void load_time(MemorySegment struct, long fieldValue) {
        struct.set(load_time$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt created_by_uid$layout() {
        return created_by_uid$LAYOUT;
    }

    public static final long created_by_uid$offset() {
        return 48L;
    }

    public static int created_by_uid(MemorySegment struct) {
        return struct.get(created_by_uid$LAYOUT, 48L);
    }

    public static void created_by_uid(MemorySegment struct, int fieldValue) {
        struct.set(created_by_uid$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt nr_map_ids$layout() {
        return nr_map_ids$LAYOUT;
    }

    public static final long nr_map_ids$offset() {
        return 52L;
    }

    public static int nr_map_ids(MemorySegment struct) {
        return struct.get(nr_map_ids$LAYOUT, 52L);
    }

    public static void nr_map_ids(MemorySegment struct, int fieldValue) {
        struct.set(nr_map_ids$LAYOUT, 52L, fieldValue);
    }

    public static final ValueLayout.OfLong map_ids$layout() {
        return map_ids$LAYOUT;
    }

    public static final long map_ids$offset() {
        return 56L;
    }

    public static long map_ids(MemorySegment struct) {
        return struct.get(map_ids$LAYOUT, 56L);
    }

    public static void map_ids(MemorySegment struct, long fieldValue) {
        struct.set(map_ids$LAYOUT, 56L, fieldValue);
    }

    public static final SequenceLayout name$layout() {
        return name$LAYOUT;
    }

    public static final long name$offset() {
        return 64L;
    }

    public static MemorySegment name(MemorySegment struct) {
        return struct.asSlice(64L, name$LAYOUT.byteSize());
    }

    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)64L, (long)name$LAYOUT.byteSize());
    }

    public static long[] name$dimensions() {
        return name$DIMS;
    }

    public static byte name(MemorySegment struct, long index0) {
        return name$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void name(MemorySegment struct, long index0, byte fieldValue) {
        name$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt ifindex$layout() {
        return ifindex$LAYOUT;
    }

    public static final long ifindex$offset() {
        return 80L;
    }

    public static int ifindex(MemorySegment struct) {
        return struct.get(ifindex$LAYOUT, 80L);
    }

    public static void ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ifindex$LAYOUT, 80L, fieldValue);
    }

    public static final ValueLayout.OfLong netns_dev$layout() {
        return netns_dev$LAYOUT;
    }

    public static final long netns_dev$offset() {
        return 88L;
    }

    public static long netns_dev(MemorySegment struct) {
        return struct.get(netns_dev$LAYOUT, 88L);
    }

    public static void netns_dev(MemorySegment struct, long fieldValue) {
        struct.set(netns_dev$LAYOUT, 88L, fieldValue);
    }

    public static final ValueLayout.OfLong netns_ino$layout() {
        return netns_ino$LAYOUT;
    }

    public static final long netns_ino$offset() {
        return 96L;
    }

    public static long netns_ino(MemorySegment struct) {
        return struct.get(netns_ino$LAYOUT, 96L);
    }

    public static void netns_ino(MemorySegment struct, long fieldValue) {
        struct.set(netns_ino$LAYOUT, 96L, fieldValue);
    }

    public static final ValueLayout.OfInt nr_jited_ksyms$layout() {
        return nr_jited_ksyms$LAYOUT;
    }

    public static final long nr_jited_ksyms$offset() {
        return 104L;
    }

    public static int nr_jited_ksyms(MemorySegment struct) {
        return struct.get(nr_jited_ksyms$LAYOUT, 104L);
    }

    public static void nr_jited_ksyms(MemorySegment struct, int fieldValue) {
        struct.set(nr_jited_ksyms$LAYOUT, 104L, fieldValue);
    }

    public static final ValueLayout.OfInt nr_jited_func_lens$layout() {
        return nr_jited_func_lens$LAYOUT;
    }

    public static final long nr_jited_func_lens$offset() {
        return 108L;
    }

    public static int nr_jited_func_lens(MemorySegment struct) {
        return struct.get(nr_jited_func_lens$LAYOUT, 108L);
    }

    public static void nr_jited_func_lens(MemorySegment struct, int fieldValue) {
        struct.set(nr_jited_func_lens$LAYOUT, 108L, fieldValue);
    }

    public static final ValueLayout.OfLong jited_ksyms$layout() {
        return jited_ksyms$LAYOUT;
    }

    public static final long jited_ksyms$offset() {
        return 112L;
    }

    public static long jited_ksyms(MemorySegment struct) {
        return struct.get(jited_ksyms$LAYOUT, 112L);
    }

    public static void jited_ksyms(MemorySegment struct, long fieldValue) {
        struct.set(jited_ksyms$LAYOUT, 112L, fieldValue);
    }

    public static final ValueLayout.OfLong jited_func_lens$layout() {
        return jited_func_lens$LAYOUT;
    }

    public static final long jited_func_lens$offset() {
        return 120L;
    }

    public static long jited_func_lens(MemorySegment struct) {
        return struct.get(jited_func_lens$LAYOUT, 120L);
    }

    public static void jited_func_lens(MemorySegment struct, long fieldValue) {
        struct.set(jited_func_lens$LAYOUT, 120L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_id$layout() {
        return btf_id$LAYOUT;
    }

    public static final long btf_id$offset() {
        return 128L;
    }

    public static int btf_id(MemorySegment struct) {
        return struct.get(btf_id$LAYOUT, 128L);
    }

    public static void btf_id(MemorySegment struct, int fieldValue) {
        struct.set(btf_id$LAYOUT, 128L, fieldValue);
    }

    public static final ValueLayout.OfInt func_info_rec_size$layout() {
        return func_info_rec_size$LAYOUT;
    }

    public static final long func_info_rec_size$offset() {
        return 132L;
    }

    public static int func_info_rec_size(MemorySegment struct) {
        return struct.get(func_info_rec_size$LAYOUT, 132L);
    }

    public static void func_info_rec_size(MemorySegment struct, int fieldValue) {
        struct.set(func_info_rec_size$LAYOUT, 132L, fieldValue);
    }

    public static final ValueLayout.OfLong func_info$layout() {
        return func_info$LAYOUT;
    }

    public static final long func_info$offset() {
        return 136L;
    }

    public static long func_info(MemorySegment struct) {
        return struct.get(func_info$LAYOUT, 136L);
    }

    public static void func_info(MemorySegment struct, long fieldValue) {
        struct.set(func_info$LAYOUT, 136L, fieldValue);
    }

    public static final ValueLayout.OfInt nr_func_info$layout() {
        return nr_func_info$LAYOUT;
    }

    public static final long nr_func_info$offset() {
        return 144L;
    }

    public static int nr_func_info(MemorySegment struct) {
        return struct.get(nr_func_info$LAYOUT, 144L);
    }

    public static void nr_func_info(MemorySegment struct, int fieldValue) {
        struct.set(nr_func_info$LAYOUT, 144L, fieldValue);
    }

    public static final ValueLayout.OfInt nr_line_info$layout() {
        return nr_line_info$LAYOUT;
    }

    public static final long nr_line_info$offset() {
        return 148L;
    }

    public static int nr_line_info(MemorySegment struct) {
        return struct.get(nr_line_info$LAYOUT, 148L);
    }

    public static void nr_line_info(MemorySegment struct, int fieldValue) {
        struct.set(nr_line_info$LAYOUT, 148L, fieldValue);
    }

    public static final ValueLayout.OfLong line_info$layout() {
        return line_info$LAYOUT;
    }

    public static final long line_info$offset() {
        return 152L;
    }

    public static long line_info(MemorySegment struct) {
        return struct.get(line_info$LAYOUT, 152L);
    }

    public static void line_info(MemorySegment struct, long fieldValue) {
        struct.set(line_info$LAYOUT, 152L, fieldValue);
    }

    public static final ValueLayout.OfLong jited_line_info$layout() {
        return jited_line_info$LAYOUT;
    }

    public static final long jited_line_info$offset() {
        return 160L;
    }

    public static long jited_line_info(MemorySegment struct) {
        return struct.get(jited_line_info$LAYOUT, 160L);
    }

    public static void jited_line_info(MemorySegment struct, long fieldValue) {
        struct.set(jited_line_info$LAYOUT, 160L, fieldValue);
    }

    public static final ValueLayout.OfInt nr_jited_line_info$layout() {
        return nr_jited_line_info$LAYOUT;
    }

    public static final long nr_jited_line_info$offset() {
        return 168L;
    }

    public static int nr_jited_line_info(MemorySegment struct) {
        return struct.get(nr_jited_line_info$LAYOUT, 168L);
    }

    public static void nr_jited_line_info(MemorySegment struct, int fieldValue) {
        struct.set(nr_jited_line_info$LAYOUT, 168L, fieldValue);
    }

    public static final ValueLayout.OfInt line_info_rec_size$layout() {
        return line_info_rec_size$LAYOUT;
    }

    public static final long line_info_rec_size$offset() {
        return 172L;
    }

    public static int line_info_rec_size(MemorySegment struct) {
        return struct.get(line_info_rec_size$LAYOUT, 172L);
    }

    public static void line_info_rec_size(MemorySegment struct, int fieldValue) {
        struct.set(line_info_rec_size$LAYOUT, 172L, fieldValue);
    }

    public static final ValueLayout.OfInt jited_line_info_rec_size$layout() {
        return jited_line_info_rec_size$LAYOUT;
    }

    public static final long jited_line_info_rec_size$offset() {
        return 176L;
    }

    public static int jited_line_info_rec_size(MemorySegment struct) {
        return struct.get(jited_line_info_rec_size$LAYOUT, 176L);
    }

    public static void jited_line_info_rec_size(MemorySegment struct, int fieldValue) {
        struct.set(jited_line_info_rec_size$LAYOUT, 176L, fieldValue);
    }

    public static final ValueLayout.OfInt nr_prog_tags$layout() {
        return nr_prog_tags$LAYOUT;
    }

    public static final long nr_prog_tags$offset() {
        return 180L;
    }

    public static int nr_prog_tags(MemorySegment struct) {
        return struct.get(nr_prog_tags$LAYOUT, 180L);
    }

    public static void nr_prog_tags(MemorySegment struct, int fieldValue) {
        struct.set(nr_prog_tags$LAYOUT, 180L, fieldValue);
    }

    public static final ValueLayout.OfLong prog_tags$layout() {
        return prog_tags$LAYOUT;
    }

    public static final long prog_tags$offset() {
        return 184L;
    }

    public static long prog_tags(MemorySegment struct) {
        return struct.get(prog_tags$LAYOUT, 184L);
    }

    public static void prog_tags(MemorySegment struct, long fieldValue) {
        struct.set(prog_tags$LAYOUT, 184L, fieldValue);
    }

    public static final ValueLayout.OfLong run_time_ns$layout() {
        return run_time_ns$LAYOUT;
    }

    public static final long run_time_ns$offset() {
        return 192L;
    }

    public static long run_time_ns(MemorySegment struct) {
        return struct.get(run_time_ns$LAYOUT, 192L);
    }

    public static void run_time_ns(MemorySegment struct, long fieldValue) {
        struct.set(run_time_ns$LAYOUT, 192L, fieldValue);
    }

    public static final ValueLayout.OfLong run_cnt$layout() {
        return run_cnt$LAYOUT;
    }

    public static final long run_cnt$offset() {
        return 200L;
    }

    public static long run_cnt(MemorySegment struct) {
        return struct.get(run_cnt$LAYOUT, 200L);
    }

    public static void run_cnt(MemorySegment struct, long fieldValue) {
        struct.set(run_cnt$LAYOUT, 200L, fieldValue);
    }

    public static final ValueLayout.OfLong recursion_misses$layout() {
        return recursion_misses$LAYOUT;
    }

    public static final long recursion_misses$offset() {
        return 208L;
    }

    public static long recursion_misses(MemorySegment struct) {
        return struct.get(recursion_misses$LAYOUT, 208L);
    }

    public static void recursion_misses(MemorySegment struct, long fieldValue) {
        struct.set(recursion_misses$LAYOUT, 208L, fieldValue);
    }

    public static final ValueLayout.OfInt verified_insns$layout() {
        return verified_insns$LAYOUT;
    }

    public static final long verified_insns$offset() {
        return 216L;
    }

    public static int verified_insns(MemorySegment struct) {
        return struct.get(verified_insns$LAYOUT, 216L);
    }

    public static void verified_insns(MemorySegment struct, int fieldValue) {
        struct.set(verified_insns$LAYOUT, 216L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_btf_obj_id$layout() {
        return attach_btf_obj_id$LAYOUT;
    }

    public static final long attach_btf_obj_id$offset() {
        return 220L;
    }

    public static int attach_btf_obj_id(MemorySegment struct) {
        return struct.get(attach_btf_obj_id$LAYOUT, 220L);
    }

    public static void attach_btf_obj_id(MemorySegment struct, int fieldValue) {
        struct.set(attach_btf_obj_id$LAYOUT, 220L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_btf_id$layout() {
        return attach_btf_id$LAYOUT;
    }

    public static final long attach_btf_id$offset() {
        return 224L;
    }

    public static int attach_btf_id(MemorySegment struct) {
        return struct.get(attach_btf_id$LAYOUT, 224L);
    }

    public static void attach_btf_id(MemorySegment struct, int fieldValue) {
        struct.set(attach_btf_id$LAYOUT, 224L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_prog_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_prog_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_prog_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_prog_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_prog_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_prog_info.layout().byteSize() * elementCount, arena, cleanup);
    }
}

