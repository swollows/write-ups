/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.AddressLayout
 *  java.lang.foreign.Arena
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.SegmentAllocator
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class bpf_prog_load_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_INT.withName("attempts"), Lib.C_INT.withName("expected_attach_type"), Lib.C_INT.withName("prog_btf_fd"), Lib.C_INT.withName("prog_flags"), Lib.C_INT.withName("prog_ifindex"), Lib.C_INT.withName("kern_version"), Lib.C_INT.withName("attach_btf_id"), Lib.C_INT.withName("attach_prog_fd"), Lib.C_INT.withName("attach_btf_obj_fd"), MemoryLayout.paddingLayout((long)4L), Lib.C_POINTER.withName("fd_array"), Lib.C_POINTER.withName("func_info"), Lib.C_INT.withName("func_info_cnt"), Lib.C_INT.withName("func_info_rec_size"), Lib.C_POINTER.withName("line_info"), Lib.C_INT.withName("line_info_cnt"), Lib.C_INT.withName("line_info_rec_size"), Lib.C_INT.withName("log_level"), Lib.C_INT.withName("log_size"), Lib.C_POINTER.withName("log_buf"), Lib.C_INT.withName("log_true_size"), Lib.C_INT.withName("token_fd")}).withName("bpf_prog_load_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final ValueLayout.OfInt attempts$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attempts")});
    private static final long attempts$OFFSET = 8L;
    private static final ValueLayout.OfInt expected_attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"expected_attach_type")});
    private static final long expected_attach_type$OFFSET = 12L;
    private static final ValueLayout.OfInt prog_btf_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_btf_fd")});
    private static final long prog_btf_fd$OFFSET = 16L;
    private static final ValueLayout.OfInt prog_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_flags")});
    private static final long prog_flags$OFFSET = 20L;
    private static final ValueLayout.OfInt prog_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_ifindex")});
    private static final long prog_ifindex$OFFSET = 24L;
    private static final ValueLayout.OfInt kern_version$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"kern_version")});
    private static final long kern_version$OFFSET = 28L;
    private static final ValueLayout.OfInt attach_btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_btf_id")});
    private static final long attach_btf_id$OFFSET = 32L;
    private static final ValueLayout.OfInt attach_prog_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_prog_fd")});
    private static final long attach_prog_fd$OFFSET = 36L;
    private static final ValueLayout.OfInt attach_btf_obj_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_btf_obj_fd")});
    private static final long attach_btf_obj_fd$OFFSET = 40L;
    private static final AddressLayout fd_array$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"fd_array")});
    private static final long fd_array$OFFSET = 48L;
    private static final AddressLayout func_info$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"func_info")});
    private static final long func_info$OFFSET = 56L;
    private static final ValueLayout.OfInt func_info_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"func_info_cnt")});
    private static final long func_info_cnt$OFFSET = 64L;
    private static final ValueLayout.OfInt func_info_rec_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"func_info_rec_size")});
    private static final long func_info_rec_size$OFFSET = 68L;
    private static final AddressLayout line_info$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"line_info")});
    private static final long line_info$OFFSET = 72L;
    private static final ValueLayout.OfInt line_info_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"line_info_cnt")});
    private static final long line_info_cnt$OFFSET = 80L;
    private static final ValueLayout.OfInt line_info_rec_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"line_info_rec_size")});
    private static final long line_info_rec_size$OFFSET = 84L;
    private static final ValueLayout.OfInt log_level$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"log_level")});
    private static final long log_level$OFFSET = 88L;
    private static final ValueLayout.OfInt log_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"log_size")});
    private static final long log_size$OFFSET = 92L;
    private static final AddressLayout log_buf$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"log_buf")});
    private static final long log_buf$OFFSET = 96L;
    private static final ValueLayout.OfInt log_true_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"log_true_size")});
    private static final long log_true_size$OFFSET = 104L;
    private static final ValueLayout.OfInt token_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"token_fd")});
    private static final long token_fd$OFFSET = 108L;

    bpf_prog_load_opts() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfLong sz$layout() {
        return sz$LAYOUT;
    }

    public static final long sz$offset() {
        return 0L;
    }

    public static long sz(MemorySegment struct) {
        return struct.get(sz$LAYOUT, 0L);
    }

    public static void sz(MemorySegment struct, long fieldValue) {
        struct.set(sz$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt attempts$layout() {
        return attempts$LAYOUT;
    }

    public static final long attempts$offset() {
        return 8L;
    }

    public static int attempts(MemorySegment struct) {
        return struct.get(attempts$LAYOUT, 8L);
    }

    public static void attempts(MemorySegment struct, int fieldValue) {
        struct.set(attempts$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt expected_attach_type$layout() {
        return expected_attach_type$LAYOUT;
    }

    public static final long expected_attach_type$offset() {
        return 12L;
    }

    public static int expected_attach_type(MemorySegment struct) {
        return struct.get(expected_attach_type$LAYOUT, 12L);
    }

    public static void expected_attach_type(MemorySegment struct, int fieldValue) {
        struct.set(expected_attach_type$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_btf_fd$layout() {
        return prog_btf_fd$LAYOUT;
    }

    public static final long prog_btf_fd$offset() {
        return 16L;
    }

    public static int prog_btf_fd(MemorySegment struct) {
        return struct.get(prog_btf_fd$LAYOUT, 16L);
    }

    public static void prog_btf_fd(MemorySegment struct, int fieldValue) {
        struct.set(prog_btf_fd$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_flags$layout() {
        return prog_flags$LAYOUT;
    }

    public static final long prog_flags$offset() {
        return 20L;
    }

    public static int prog_flags(MemorySegment struct) {
        return struct.get(prog_flags$LAYOUT, 20L);
    }

    public static void prog_flags(MemorySegment struct, int fieldValue) {
        struct.set(prog_flags$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_ifindex$layout() {
        return prog_ifindex$LAYOUT;
    }

    public static final long prog_ifindex$offset() {
        return 24L;
    }

    public static int prog_ifindex(MemorySegment struct) {
        return struct.get(prog_ifindex$LAYOUT, 24L);
    }

    public static void prog_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(prog_ifindex$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt kern_version$layout() {
        return kern_version$LAYOUT;
    }

    public static final long kern_version$offset() {
        return 28L;
    }

    public static int kern_version(MemorySegment struct) {
        return struct.get(kern_version$LAYOUT, 28L);
    }

    public static void kern_version(MemorySegment struct, int fieldValue) {
        struct.set(kern_version$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_btf_id$layout() {
        return attach_btf_id$LAYOUT;
    }

    public static final long attach_btf_id$offset() {
        return 32L;
    }

    public static int attach_btf_id(MemorySegment struct) {
        return struct.get(attach_btf_id$LAYOUT, 32L);
    }

    public static void attach_btf_id(MemorySegment struct, int fieldValue) {
        struct.set(attach_btf_id$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_prog_fd$layout() {
        return attach_prog_fd$LAYOUT;
    }

    public static final long attach_prog_fd$offset() {
        return 36L;
    }

    public static int attach_prog_fd(MemorySegment struct) {
        return struct.get(attach_prog_fd$LAYOUT, 36L);
    }

    public static void attach_prog_fd(MemorySegment struct, int fieldValue) {
        struct.set(attach_prog_fd$LAYOUT, 36L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_btf_obj_fd$layout() {
        return attach_btf_obj_fd$LAYOUT;
    }

    public static final long attach_btf_obj_fd$offset() {
        return 40L;
    }

    public static int attach_btf_obj_fd(MemorySegment struct) {
        return struct.get(attach_btf_obj_fd$LAYOUT, 40L);
    }

    public static void attach_btf_obj_fd(MemorySegment struct, int fieldValue) {
        struct.set(attach_btf_obj_fd$LAYOUT, 40L, fieldValue);
    }

    public static final AddressLayout fd_array$layout() {
        return fd_array$LAYOUT;
    }

    public static final long fd_array$offset() {
        return 48L;
    }

    public static MemorySegment fd_array(MemorySegment struct) {
        return struct.get(fd_array$LAYOUT, 48L);
    }

    public static void fd_array(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(fd_array$LAYOUT, 48L, fieldValue);
    }

    public static final AddressLayout func_info$layout() {
        return func_info$LAYOUT;
    }

    public static final long func_info$offset() {
        return 56L;
    }

    public static MemorySegment func_info(MemorySegment struct) {
        return struct.get(func_info$LAYOUT, 56L);
    }

    public static void func_info(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(func_info$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfInt func_info_cnt$layout() {
        return func_info_cnt$LAYOUT;
    }

    public static final long func_info_cnt$offset() {
        return 64L;
    }

    public static int func_info_cnt(MemorySegment struct) {
        return struct.get(func_info_cnt$LAYOUT, 64L);
    }

    public static void func_info_cnt(MemorySegment struct, int fieldValue) {
        struct.set(func_info_cnt$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt func_info_rec_size$layout() {
        return func_info_rec_size$LAYOUT;
    }

    public static final long func_info_rec_size$offset() {
        return 68L;
    }

    public static int func_info_rec_size(MemorySegment struct) {
        return struct.get(func_info_rec_size$LAYOUT, 68L);
    }

    public static void func_info_rec_size(MemorySegment struct, int fieldValue) {
        struct.set(func_info_rec_size$LAYOUT, 68L, fieldValue);
    }

    public static final AddressLayout line_info$layout() {
        return line_info$LAYOUT;
    }

    public static final long line_info$offset() {
        return 72L;
    }

    public static MemorySegment line_info(MemorySegment struct) {
        return struct.get(line_info$LAYOUT, 72L);
    }

    public static void line_info(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(line_info$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt line_info_cnt$layout() {
        return line_info_cnt$LAYOUT;
    }

    public static final long line_info_cnt$offset() {
        return 80L;
    }

    public static int line_info_cnt(MemorySegment struct) {
        return struct.get(line_info_cnt$LAYOUT, 80L);
    }

    public static void line_info_cnt(MemorySegment struct, int fieldValue) {
        struct.set(line_info_cnt$LAYOUT, 80L, fieldValue);
    }

    public static final ValueLayout.OfInt line_info_rec_size$layout() {
        return line_info_rec_size$LAYOUT;
    }

    public static final long line_info_rec_size$offset() {
        return 84L;
    }

    public static int line_info_rec_size(MemorySegment struct) {
        return struct.get(line_info_rec_size$LAYOUT, 84L);
    }

    public static void line_info_rec_size(MemorySegment struct, int fieldValue) {
        struct.set(line_info_rec_size$LAYOUT, 84L, fieldValue);
    }

    public static final ValueLayout.OfInt log_level$layout() {
        return log_level$LAYOUT;
    }

    public static final long log_level$offset() {
        return 88L;
    }

    public static int log_level(MemorySegment struct) {
        return struct.get(log_level$LAYOUT, 88L);
    }

    public static void log_level(MemorySegment struct, int fieldValue) {
        struct.set(log_level$LAYOUT, 88L, fieldValue);
    }

    public static final ValueLayout.OfInt log_size$layout() {
        return log_size$LAYOUT;
    }

    public static final long log_size$offset() {
        return 92L;
    }

    public static int log_size(MemorySegment struct) {
        return struct.get(log_size$LAYOUT, 92L);
    }

    public static void log_size(MemorySegment struct, int fieldValue) {
        struct.set(log_size$LAYOUT, 92L, fieldValue);
    }

    public static final AddressLayout log_buf$layout() {
        return log_buf$LAYOUT;
    }

    public static final long log_buf$offset() {
        return 96L;
    }

    public static MemorySegment log_buf(MemorySegment struct) {
        return struct.get(log_buf$LAYOUT, 96L);
    }

    public static void log_buf(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(log_buf$LAYOUT, 96L, fieldValue);
    }

    public static final ValueLayout.OfInt log_true_size$layout() {
        return log_true_size$LAYOUT;
    }

    public static final long log_true_size$offset() {
        return 104L;
    }

    public static int log_true_size(MemorySegment struct) {
        return struct.get(log_true_size$LAYOUT, 104L);
    }

    public static void log_true_size(MemorySegment struct, int fieldValue) {
        struct.set(log_true_size$LAYOUT, 104L, fieldValue);
    }

    public static final ValueLayout.OfInt token_fd$layout() {
        return token_fd$LAYOUT;
    }

    public static final long token_fd$offset() {
        return 108L;
    }

    public static int token_fd(MemorySegment struct) {
        return struct.get(token_fd$LAYOUT, 108L);
    }

    public static void token_fd(MemorySegment struct, int fieldValue) {
        struct.set(token_fd$LAYOUT, 108L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_prog_load_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_prog_load_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_prog_load_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_prog_load_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_prog_load_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_prog_load_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

