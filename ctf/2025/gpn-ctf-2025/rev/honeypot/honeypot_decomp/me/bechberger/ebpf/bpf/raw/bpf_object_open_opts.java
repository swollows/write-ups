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
 *  java.lang.foreign.ValueLayout$OfBoolean
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

public class bpf_object_open_opts {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG.withName("sz"), Lib.C_POINTER.withName("object_name"), Lib.C_BOOL.withName("relaxed_maps"), MemoryLayout.paddingLayout((long)7L), Lib.C_POINTER.withName("pin_root_path"), MemoryLayout.paddingLayout((long)8L), Lib.C_POINTER.withName("kconfig"), Lib.C_POINTER.withName("btf_custom_path"), Lib.C_POINTER.withName("kernel_log_buf"), Lib.C_LONG.withName("kernel_log_size"), Lib.C_INT.withName("kernel_log_level"), MemoryLayout.paddingLayout((long)4L), Lib.C_POINTER.withName("bpf_token_path")}).withName("bpf_object_open_opts");
    private static final ValueLayout.OfLong sz$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sz")});
    private static final long sz$OFFSET = 0L;
    private static final AddressLayout object_name$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"object_name")});
    private static final long object_name$OFFSET = 8L;
    private static final ValueLayout.OfBoolean relaxed_maps$LAYOUT = (ValueLayout.OfBoolean)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"relaxed_maps")});
    private static final long relaxed_maps$OFFSET = 16L;
    private static final AddressLayout pin_root_path$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pin_root_path")});
    private static final long pin_root_path$OFFSET = 24L;
    private static final AddressLayout kconfig$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"kconfig")});
    private static final long kconfig$OFFSET = 40L;
    private static final AddressLayout btf_custom_path$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"btf_custom_path")});
    private static final long btf_custom_path$OFFSET = 48L;
    private static final AddressLayout kernel_log_buf$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"kernel_log_buf")});
    private static final long kernel_log_buf$OFFSET = 56L;
    private static final ValueLayout.OfLong kernel_log_size$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"kernel_log_size")});
    private static final long kernel_log_size$OFFSET = 64L;
    private static final ValueLayout.OfInt kernel_log_level$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"kernel_log_level")});
    private static final long kernel_log_level$OFFSET = 72L;
    private static final AddressLayout bpf_token_path$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bpf_token_path")});
    private static final long bpf_token_path$OFFSET = 80L;

    bpf_object_open_opts() {
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

    public static final AddressLayout object_name$layout() {
        return object_name$LAYOUT;
    }

    public static final long object_name$offset() {
        return 8L;
    }

    public static MemorySegment object_name(MemorySegment struct) {
        return struct.get(object_name$LAYOUT, 8L);
    }

    public static void object_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(object_name$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfBoolean relaxed_maps$layout() {
        return relaxed_maps$LAYOUT;
    }

    public static final long relaxed_maps$offset() {
        return 16L;
    }

    public static boolean relaxed_maps(MemorySegment struct) {
        return struct.get(relaxed_maps$LAYOUT, 16L);
    }

    public static void relaxed_maps(MemorySegment struct, boolean fieldValue) {
        struct.set(relaxed_maps$LAYOUT, 16L, fieldValue);
    }

    public static final AddressLayout pin_root_path$layout() {
        return pin_root_path$LAYOUT;
    }

    public static final long pin_root_path$offset() {
        return 24L;
    }

    public static MemorySegment pin_root_path(MemorySegment struct) {
        return struct.get(pin_root_path$LAYOUT, 24L);
    }

    public static void pin_root_path(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pin_root_path$LAYOUT, 24L, fieldValue);
    }

    public static final AddressLayout kconfig$layout() {
        return kconfig$LAYOUT;
    }

    public static final long kconfig$offset() {
        return 40L;
    }

    public static MemorySegment kconfig(MemorySegment struct) {
        return struct.get(kconfig$LAYOUT, 40L);
    }

    public static void kconfig(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(kconfig$LAYOUT, 40L, fieldValue);
    }

    public static final AddressLayout btf_custom_path$layout() {
        return btf_custom_path$LAYOUT;
    }

    public static final long btf_custom_path$offset() {
        return 48L;
    }

    public static MemorySegment btf_custom_path(MemorySegment struct) {
        return struct.get(btf_custom_path$LAYOUT, 48L);
    }

    public static void btf_custom_path(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(btf_custom_path$LAYOUT, 48L, fieldValue);
    }

    public static final AddressLayout kernel_log_buf$layout() {
        return kernel_log_buf$LAYOUT;
    }

    public static final long kernel_log_buf$offset() {
        return 56L;
    }

    public static MemorySegment kernel_log_buf(MemorySegment struct) {
        return struct.get(kernel_log_buf$LAYOUT, 56L);
    }

    public static void kernel_log_buf(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(kernel_log_buf$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfLong kernel_log_size$layout() {
        return kernel_log_size$LAYOUT;
    }

    public static final long kernel_log_size$offset() {
        return 64L;
    }

    public static long kernel_log_size(MemorySegment struct) {
        return struct.get(kernel_log_size$LAYOUT, 64L);
    }

    public static void kernel_log_size(MemorySegment struct, long fieldValue) {
        struct.set(kernel_log_size$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt kernel_log_level$layout() {
        return kernel_log_level$LAYOUT;
    }

    public static final long kernel_log_level$offset() {
        return 72L;
    }

    public static int kernel_log_level(MemorySegment struct) {
        return struct.get(kernel_log_level$LAYOUT, 72L);
    }

    public static void kernel_log_level(MemorySegment struct, int fieldValue) {
        struct.set(kernel_log_level$LAYOUT, 72L, fieldValue);
    }

    public static final AddressLayout bpf_token_path$layout() {
        return bpf_token_path$LAYOUT;
    }

    public static final long bpf_token_path$offset() {
        return 80L;
    }

    public static MemorySegment bpf_token_path(MemorySegment struct) {
        return struct.get(bpf_token_path$LAYOUT, 80L);
    }

    public static void bpf_token_path(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(bpf_token_path$LAYOUT, 80L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_object_open_opts.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_object_open_opts.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_object_open_opts.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_object_open_opts.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_object_open_opts.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_object_open_opts.layout().byteSize() * elementCount, arena, cleanup);
    }
}

