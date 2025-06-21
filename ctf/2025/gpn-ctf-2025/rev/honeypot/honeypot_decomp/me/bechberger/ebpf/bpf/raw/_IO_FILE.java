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
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.foreign.ValueLayout$OfShort
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
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

public class _IO_FILE {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("_flags"), MemoryLayout.paddingLayout((long)4L), Lib.C_POINTER.withName("_IO_read_ptr"), Lib.C_POINTER.withName("_IO_read_end"), Lib.C_POINTER.withName("_IO_read_base"), Lib.C_POINTER.withName("_IO_write_base"), Lib.C_POINTER.withName("_IO_write_ptr"), Lib.C_POINTER.withName("_IO_write_end"), Lib.C_POINTER.withName("_IO_buf_base"), Lib.C_POINTER.withName("_IO_buf_end"), Lib.C_POINTER.withName("_IO_save_base"), Lib.C_POINTER.withName("_IO_backup_base"), Lib.C_POINTER.withName("_IO_save_end"), Lib.C_POINTER.withName("_markers"), Lib.C_POINTER.withName("_chain"), Lib.C_INT.withName("_fileno"), MemoryLayout.paddingLayout((long)3L), MemoryLayout.sequenceLayout((long)1L, (MemoryLayout)Lib.C_CHAR).withName("_short_backupbuf"), Lib.C_LONG.withName("_old_offset"), Lib.C_SHORT.withName("_cur_column"), Lib.C_CHAR.withName("_vtable_offset"), MemoryLayout.sequenceLayout((long)1L, (MemoryLayout)Lib.C_CHAR).withName("_shortbuf"), MemoryLayout.paddingLayout((long)4L), Lib.C_POINTER.withName("_lock"), Lib.C_LONG.withName("_offset"), Lib.C_POINTER.withName("_codecvt"), Lib.C_POINTER.withName("_wide_data"), Lib.C_POINTER.withName("_freeres_list"), Lib.C_POINTER.withName("_freeres_buf"), Lib.C_POINTER.withName("_prevchain"), Lib.C_INT.withName("_mode"), MemoryLayout.sequenceLayout((long)20L, (MemoryLayout)Lib.C_CHAR).withName("_unused2")}).withName("_IO_FILE");
    private static final ValueLayout.OfInt _flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_flags")});
    private static final long _flags$OFFSET = 0L;
    private static final AddressLayout _IO_read_ptr$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_read_ptr")});
    private static final long _IO_read_ptr$OFFSET = 8L;
    private static final AddressLayout _IO_read_end$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_read_end")});
    private static final long _IO_read_end$OFFSET = 16L;
    private static final AddressLayout _IO_read_base$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_read_base")});
    private static final long _IO_read_base$OFFSET = 24L;
    private static final AddressLayout _IO_write_base$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_write_base")});
    private static final long _IO_write_base$OFFSET = 32L;
    private static final AddressLayout _IO_write_ptr$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_write_ptr")});
    private static final long _IO_write_ptr$OFFSET = 40L;
    private static final AddressLayout _IO_write_end$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_write_end")});
    private static final long _IO_write_end$OFFSET = 48L;
    private static final AddressLayout _IO_buf_base$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_buf_base")});
    private static final long _IO_buf_base$OFFSET = 56L;
    private static final AddressLayout _IO_buf_end$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_buf_end")});
    private static final long _IO_buf_end$OFFSET = 64L;
    private static final AddressLayout _IO_save_base$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_save_base")});
    private static final long _IO_save_base$OFFSET = 72L;
    private static final AddressLayout _IO_backup_base$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_backup_base")});
    private static final long _IO_backup_base$OFFSET = 80L;
    private static final AddressLayout _IO_save_end$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_IO_save_end")});
    private static final long _IO_save_end$OFFSET = 88L;
    private static final AddressLayout _markers$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_markers")});
    private static final long _markers$OFFSET = 96L;
    private static final AddressLayout _chain$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_chain")});
    private static final long _chain$OFFSET = 104L;
    private static final ValueLayout.OfInt _fileno$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_fileno")});
    private static final long _fileno$OFFSET = 112L;
    private static final SequenceLayout _short_backupbuf$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_short_backupbuf")});
    private static final long _short_backupbuf$OFFSET = 119L;
    private static long[] _short_backupbuf$DIMS = new long[]{1L};
    private static final VarHandle _short_backupbuf$ELEM_HANDLE = _short_backupbuf$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfLong _old_offset$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_old_offset")});
    private static final long _old_offset$OFFSET = 120L;
    private static final ValueLayout.OfShort _cur_column$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_cur_column")});
    private static final long _cur_column$OFFSET = 128L;
    private static final ValueLayout.OfByte _vtable_offset$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_vtable_offset")});
    private static final long _vtable_offset$OFFSET = 130L;
    private static final SequenceLayout _shortbuf$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_shortbuf")});
    private static final long _shortbuf$OFFSET = 131L;
    private static long[] _shortbuf$DIMS = new long[]{1L};
    private static final VarHandle _shortbuf$ELEM_HANDLE = _shortbuf$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final AddressLayout _lock$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_lock")});
    private static final long _lock$OFFSET = 136L;
    private static final ValueLayout.OfLong _offset$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_offset")});
    private static final long _offset$OFFSET = 144L;
    private static final AddressLayout _codecvt$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_codecvt")});
    private static final long _codecvt$OFFSET = 152L;
    private static final AddressLayout _wide_data$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_wide_data")});
    private static final long _wide_data$OFFSET = 160L;
    private static final AddressLayout _freeres_list$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_freeres_list")});
    private static final long _freeres_list$OFFSET = 168L;
    private static final AddressLayout _freeres_buf$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_freeres_buf")});
    private static final long _freeres_buf$OFFSET = 176L;
    private static final AddressLayout _prevchain$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_prevchain")});
    private static final long _prevchain$OFFSET = 184L;
    private static final ValueLayout.OfInt _mode$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_mode")});
    private static final long _mode$OFFSET = 192L;
    private static final SequenceLayout _unused2$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"_unused2")});
    private static final long _unused2$OFFSET = 196L;
    private static long[] _unused2$DIMS = new long[]{20L};
    private static final VarHandle _unused2$ELEM_HANDLE = _unused2$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});

    _IO_FILE() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt _flags$layout() {
        return _flags$LAYOUT;
    }

    public static final long _flags$offset() {
        return 0L;
    }

    public static int _flags(MemorySegment struct) {
        return struct.get(_flags$LAYOUT, 0L);
    }

    public static void _flags(MemorySegment struct, int fieldValue) {
        struct.set(_flags$LAYOUT, 0L, fieldValue);
    }

    public static final AddressLayout _IO_read_ptr$layout() {
        return _IO_read_ptr$LAYOUT;
    }

    public static final long _IO_read_ptr$offset() {
        return 8L;
    }

    public static MemorySegment _IO_read_ptr(MemorySegment struct) {
        return struct.get(_IO_read_ptr$LAYOUT, 8L);
    }

    public static void _IO_read_ptr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_read_ptr$LAYOUT, 8L, fieldValue);
    }

    public static final AddressLayout _IO_read_end$layout() {
        return _IO_read_end$LAYOUT;
    }

    public static final long _IO_read_end$offset() {
        return 16L;
    }

    public static MemorySegment _IO_read_end(MemorySegment struct) {
        return struct.get(_IO_read_end$LAYOUT, 16L);
    }

    public static void _IO_read_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_read_end$LAYOUT, 16L, fieldValue);
    }

    public static final AddressLayout _IO_read_base$layout() {
        return _IO_read_base$LAYOUT;
    }

    public static final long _IO_read_base$offset() {
        return 24L;
    }

    public static MemorySegment _IO_read_base(MemorySegment struct) {
        return struct.get(_IO_read_base$LAYOUT, 24L);
    }

    public static void _IO_read_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_read_base$LAYOUT, 24L, fieldValue);
    }

    public static final AddressLayout _IO_write_base$layout() {
        return _IO_write_base$LAYOUT;
    }

    public static final long _IO_write_base$offset() {
        return 32L;
    }

    public static MemorySegment _IO_write_base(MemorySegment struct) {
        return struct.get(_IO_write_base$LAYOUT, 32L);
    }

    public static void _IO_write_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_write_base$LAYOUT, 32L, fieldValue);
    }

    public static final AddressLayout _IO_write_ptr$layout() {
        return _IO_write_ptr$LAYOUT;
    }

    public static final long _IO_write_ptr$offset() {
        return 40L;
    }

    public static MemorySegment _IO_write_ptr(MemorySegment struct) {
        return struct.get(_IO_write_ptr$LAYOUT, 40L);
    }

    public static void _IO_write_ptr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_write_ptr$LAYOUT, 40L, fieldValue);
    }

    public static final AddressLayout _IO_write_end$layout() {
        return _IO_write_end$LAYOUT;
    }

    public static final long _IO_write_end$offset() {
        return 48L;
    }

    public static MemorySegment _IO_write_end(MemorySegment struct) {
        return struct.get(_IO_write_end$LAYOUT, 48L);
    }

    public static void _IO_write_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_write_end$LAYOUT, 48L, fieldValue);
    }

    public static final AddressLayout _IO_buf_base$layout() {
        return _IO_buf_base$LAYOUT;
    }

    public static final long _IO_buf_base$offset() {
        return 56L;
    }

    public static MemorySegment _IO_buf_base(MemorySegment struct) {
        return struct.get(_IO_buf_base$LAYOUT, 56L);
    }

    public static void _IO_buf_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_buf_base$LAYOUT, 56L, fieldValue);
    }

    public static final AddressLayout _IO_buf_end$layout() {
        return _IO_buf_end$LAYOUT;
    }

    public static final long _IO_buf_end$offset() {
        return 64L;
    }

    public static MemorySegment _IO_buf_end(MemorySegment struct) {
        return struct.get(_IO_buf_end$LAYOUT, 64L);
    }

    public static void _IO_buf_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_buf_end$LAYOUT, 64L, fieldValue);
    }

    public static final AddressLayout _IO_save_base$layout() {
        return _IO_save_base$LAYOUT;
    }

    public static final long _IO_save_base$offset() {
        return 72L;
    }

    public static MemorySegment _IO_save_base(MemorySegment struct) {
        return struct.get(_IO_save_base$LAYOUT, 72L);
    }

    public static void _IO_save_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_save_base$LAYOUT, 72L, fieldValue);
    }

    public static final AddressLayout _IO_backup_base$layout() {
        return _IO_backup_base$LAYOUT;
    }

    public static final long _IO_backup_base$offset() {
        return 80L;
    }

    public static MemorySegment _IO_backup_base(MemorySegment struct) {
        return struct.get(_IO_backup_base$LAYOUT, 80L);
    }

    public static void _IO_backup_base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_backup_base$LAYOUT, 80L, fieldValue);
    }

    public static final AddressLayout _IO_save_end$layout() {
        return _IO_save_end$LAYOUT;
    }

    public static final long _IO_save_end$offset() {
        return 88L;
    }

    public static MemorySegment _IO_save_end(MemorySegment struct) {
        return struct.get(_IO_save_end$LAYOUT, 88L);
    }

    public static void _IO_save_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_IO_save_end$LAYOUT, 88L, fieldValue);
    }

    public static final AddressLayout _markers$layout() {
        return _markers$LAYOUT;
    }

    public static final long _markers$offset() {
        return 96L;
    }

    public static MemorySegment _markers(MemorySegment struct) {
        return struct.get(_markers$LAYOUT, 96L);
    }

    public static void _markers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_markers$LAYOUT, 96L, fieldValue);
    }

    public static final AddressLayout _chain$layout() {
        return _chain$LAYOUT;
    }

    public static final long _chain$offset() {
        return 104L;
    }

    public static MemorySegment _chain(MemorySegment struct) {
        return struct.get(_chain$LAYOUT, 104L);
    }

    public static void _chain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_chain$LAYOUT, 104L, fieldValue);
    }

    public static final ValueLayout.OfInt _fileno$layout() {
        return _fileno$LAYOUT;
    }

    public static final long _fileno$offset() {
        return 112L;
    }

    public static int _fileno(MemorySegment struct) {
        return struct.get(_fileno$LAYOUT, 112L);
    }

    public static void _fileno(MemorySegment struct, int fieldValue) {
        struct.set(_fileno$LAYOUT, 112L, fieldValue);
    }

    public static final SequenceLayout _short_backupbuf$layout() {
        return _short_backupbuf$LAYOUT;
    }

    public static final long _short_backupbuf$offset() {
        return 119L;
    }

    public static MemorySegment _short_backupbuf(MemorySegment struct) {
        return struct.asSlice(119L, _short_backupbuf$LAYOUT.byteSize());
    }

    public static void _short_backupbuf(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)119L, (long)_short_backupbuf$LAYOUT.byteSize());
    }

    public static long[] _short_backupbuf$dimensions() {
        return _short_backupbuf$DIMS;
    }

    public static byte _short_backupbuf(MemorySegment struct, long index0) {
        return _short_backupbuf$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void _short_backupbuf(MemorySegment struct, long index0, byte fieldValue) {
        _short_backupbuf$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfLong _old_offset$layout() {
        return _old_offset$LAYOUT;
    }

    public static final long _old_offset$offset() {
        return 120L;
    }

    public static long _old_offset(MemorySegment struct) {
        return struct.get(_old_offset$LAYOUT, 120L);
    }

    public static void _old_offset(MemorySegment struct, long fieldValue) {
        struct.set(_old_offset$LAYOUT, 120L, fieldValue);
    }

    public static final ValueLayout.OfShort _cur_column$layout() {
        return _cur_column$LAYOUT;
    }

    public static final long _cur_column$offset() {
        return 128L;
    }

    public static short _cur_column(MemorySegment struct) {
        return struct.get(_cur_column$LAYOUT, 128L);
    }

    public static void _cur_column(MemorySegment struct, short fieldValue) {
        struct.set(_cur_column$LAYOUT, 128L, fieldValue);
    }

    public static final ValueLayout.OfByte _vtable_offset$layout() {
        return _vtable_offset$LAYOUT;
    }

    public static final long _vtable_offset$offset() {
        return 130L;
    }

    public static byte _vtable_offset(MemorySegment struct) {
        return struct.get(_vtable_offset$LAYOUT, 130L);
    }

    public static void _vtable_offset(MemorySegment struct, byte fieldValue) {
        struct.set(_vtable_offset$LAYOUT, 130L, fieldValue);
    }

    public static final SequenceLayout _shortbuf$layout() {
        return _shortbuf$LAYOUT;
    }

    public static final long _shortbuf$offset() {
        return 131L;
    }

    public static MemorySegment _shortbuf(MemorySegment struct) {
        return struct.asSlice(131L, _shortbuf$LAYOUT.byteSize());
    }

    public static void _shortbuf(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)131L, (long)_shortbuf$LAYOUT.byteSize());
    }

    public static long[] _shortbuf$dimensions() {
        return _shortbuf$DIMS;
    }

    public static byte _shortbuf(MemorySegment struct, long index0) {
        return _shortbuf$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void _shortbuf(MemorySegment struct, long index0, byte fieldValue) {
        _shortbuf$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final AddressLayout _lock$layout() {
        return _lock$LAYOUT;
    }

    public static final long _lock$offset() {
        return 136L;
    }

    public static MemorySegment _lock(MemorySegment struct) {
        return struct.get(_lock$LAYOUT, 136L);
    }

    public static void _lock(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_lock$LAYOUT, 136L, fieldValue);
    }

    public static final ValueLayout.OfLong _offset$layout() {
        return _offset$LAYOUT;
    }

    public static final long _offset$offset() {
        return 144L;
    }

    public static long _offset(MemorySegment struct) {
        return struct.get(_offset$LAYOUT, 144L);
    }

    public static void _offset(MemorySegment struct, long fieldValue) {
        struct.set(_offset$LAYOUT, 144L, fieldValue);
    }

    public static final AddressLayout _codecvt$layout() {
        return _codecvt$LAYOUT;
    }

    public static final long _codecvt$offset() {
        return 152L;
    }

    public static MemorySegment _codecvt(MemorySegment struct) {
        return struct.get(_codecvt$LAYOUT, 152L);
    }

    public static void _codecvt(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_codecvt$LAYOUT, 152L, fieldValue);
    }

    public static final AddressLayout _wide_data$layout() {
        return _wide_data$LAYOUT;
    }

    public static final long _wide_data$offset() {
        return 160L;
    }

    public static MemorySegment _wide_data(MemorySegment struct) {
        return struct.get(_wide_data$LAYOUT, 160L);
    }

    public static void _wide_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_wide_data$LAYOUT, 160L, fieldValue);
    }

    public static final AddressLayout _freeres_list$layout() {
        return _freeres_list$LAYOUT;
    }

    public static final long _freeres_list$offset() {
        return 168L;
    }

    public static MemorySegment _freeres_list(MemorySegment struct) {
        return struct.get(_freeres_list$LAYOUT, 168L);
    }

    public static void _freeres_list(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_freeres_list$LAYOUT, 168L, fieldValue);
    }

    public static final AddressLayout _freeres_buf$layout() {
        return _freeres_buf$LAYOUT;
    }

    public static final long _freeres_buf$offset() {
        return 176L;
    }

    public static MemorySegment _freeres_buf(MemorySegment struct) {
        return struct.get(_freeres_buf$LAYOUT, 176L);
    }

    public static void _freeres_buf(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_freeres_buf$LAYOUT, 176L, fieldValue);
    }

    public static final AddressLayout _prevchain$layout() {
        return _prevchain$LAYOUT;
    }

    public static final long _prevchain$offset() {
        return 184L;
    }

    public static MemorySegment _prevchain(MemorySegment struct) {
        return struct.get(_prevchain$LAYOUT, 184L);
    }

    public static void _prevchain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_prevchain$LAYOUT, 184L, fieldValue);
    }

    public static final ValueLayout.OfInt _mode$layout() {
        return _mode$LAYOUT;
    }

    public static final long _mode$offset() {
        return 192L;
    }

    public static int _mode(MemorySegment struct) {
        return struct.get(_mode$LAYOUT, 192L);
    }

    public static void _mode(MemorySegment struct, int fieldValue) {
        struct.set(_mode$LAYOUT, 192L, fieldValue);
    }

    public static final SequenceLayout _unused2$layout() {
        return _unused2$LAYOUT;
    }

    public static final long _unused2$offset() {
        return 196L;
    }

    public static MemorySegment _unused2(MemorySegment struct) {
        return struct.asSlice(196L, _unused2$LAYOUT.byteSize());
    }

    public static void _unused2(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)196L, (long)_unused2$LAYOUT.byteSize());
    }

    public static long[] _unused2$dimensions() {
        return _unused2$DIMS;
    }

    public static byte _unused2(MemorySegment struct, long index0) {
        return _unused2$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void _unused2(MemorySegment struct, long index0, byte fieldValue) {
        _unused2$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(_IO_FILE.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return _IO_FILE.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)_IO_FILE.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)_IO_FILE.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return _IO_FILE.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(_IO_FILE.layout().byteSize() * elementCount, arena, cleanup);
    }
}

