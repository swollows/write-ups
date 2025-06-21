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

public class sk_reuseport_md {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("data")}).withName("$anon$6525:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("data_end")}).withName("$anon$6527:2"), Lib.C_INT.withName("len"), Lib.C_INT.withName("eth_protocol"), Lib.C_INT.withName("ip_protocol"), Lib.C_INT.withName("bind_inany"), Lib.C_INT.withName("hash"), MemoryLayout.paddingLayout((long)4L), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("sk")}).withName("$anon$6555:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("migrating_sk")}).withName("$anon$6556:2")}).withName("sk_reuseport_md");
    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6525:2"), MemoryLayout.PathElement.groupElement((String)"data")});
    private static final long data$OFFSET = 0L;
    private static final AddressLayout data_end$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6527:2"), MemoryLayout.PathElement.groupElement((String)"data_end")});
    private static final long data_end$OFFSET = 8L;
    private static final ValueLayout.OfInt len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"len")});
    private static final long len$OFFSET = 16L;
    private static final ValueLayout.OfInt eth_protocol$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"eth_protocol")});
    private static final long eth_protocol$OFFSET = 20L;
    private static final ValueLayout.OfInt ip_protocol$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ip_protocol")});
    private static final long ip_protocol$OFFSET = 24L;
    private static final ValueLayout.OfInt bind_inany$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bind_inany")});
    private static final long bind_inany$OFFSET = 28L;
    private static final ValueLayout.OfInt hash$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hash")});
    private static final long hash$OFFSET = 32L;
    private static final AddressLayout sk$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6555:2"), MemoryLayout.PathElement.groupElement((String)"sk")});
    private static final long sk$OFFSET = 40L;
    private static final AddressLayout migrating_sk$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6556:2"), MemoryLayout.PathElement.groupElement((String)"migrating_sk")});
    private static final long migrating_sk$OFFSET = 48L;

    sk_reuseport_md() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    public static final long data$offset() {
        return 0L;
    }

    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, 0L);
    }

    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, 0L, fieldValue);
    }

    public static final AddressLayout data_end$layout() {
        return data_end$LAYOUT;
    }

    public static final long data_end$offset() {
        return 8L;
    }

    public static MemorySegment data_end(MemorySegment struct) {
        return struct.get(data_end$LAYOUT, 8L);
    }

    public static void data_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data_end$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt len$layout() {
        return len$LAYOUT;
    }

    public static final long len$offset() {
        return 16L;
    }

    public static int len(MemorySegment struct) {
        return struct.get(len$LAYOUT, 16L);
    }

    public static void len(MemorySegment struct, int fieldValue) {
        struct.set(len$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt eth_protocol$layout() {
        return eth_protocol$LAYOUT;
    }

    public static final long eth_protocol$offset() {
        return 20L;
    }

    public static int eth_protocol(MemorySegment struct) {
        return struct.get(eth_protocol$LAYOUT, 20L);
    }

    public static void eth_protocol(MemorySegment struct, int fieldValue) {
        struct.set(eth_protocol$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt ip_protocol$layout() {
        return ip_protocol$LAYOUT;
    }

    public static final long ip_protocol$offset() {
        return 24L;
    }

    public static int ip_protocol(MemorySegment struct) {
        return struct.get(ip_protocol$LAYOUT, 24L);
    }

    public static void ip_protocol(MemorySegment struct, int fieldValue) {
        struct.set(ip_protocol$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt bind_inany$layout() {
        return bind_inany$LAYOUT;
    }

    public static final long bind_inany$offset() {
        return 28L;
    }

    public static int bind_inany(MemorySegment struct) {
        return struct.get(bind_inany$LAYOUT, 28L);
    }

    public static void bind_inany(MemorySegment struct, int fieldValue) {
        struct.set(bind_inany$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt hash$layout() {
        return hash$LAYOUT;
    }

    public static final long hash$offset() {
        return 32L;
    }

    public static int hash(MemorySegment struct) {
        return struct.get(hash$LAYOUT, 32L);
    }

    public static void hash(MemorySegment struct, int fieldValue) {
        struct.set(hash$LAYOUT, 32L, fieldValue);
    }

    public static final AddressLayout sk$layout() {
        return sk$LAYOUT;
    }

    public static final long sk$offset() {
        return 40L;
    }

    public static MemorySegment sk(MemorySegment struct) {
        return struct.get(sk$LAYOUT, 40L);
    }

    public static void sk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sk$LAYOUT, 40L, fieldValue);
    }

    public static final AddressLayout migrating_sk$layout() {
        return migrating_sk$LAYOUT;
    }

    public static final long migrating_sk$offset() {
        return 48L;
    }

    public static MemorySegment migrating_sk(MemorySegment struct) {
        return struct.get(migrating_sk$LAYOUT, 48L);
    }

    public static void migrating_sk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(migrating_sk$LAYOUT, 48L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(sk_reuseport_md.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return sk_reuseport_md.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)sk_reuseport_md.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)sk_reuseport_md.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return sk_reuseport_md.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(sk_reuseport_md.layout().byteSize() * elementCount, arena, cleanup);
    }
}

