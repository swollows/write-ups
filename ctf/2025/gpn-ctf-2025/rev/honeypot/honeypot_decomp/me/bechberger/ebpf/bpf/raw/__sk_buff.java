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

public class __sk_buff {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("len"), Lib.C_INT.withName("pkt_type"), Lib.C_INT.withName("mark"), Lib.C_INT.withName("queue_mapping"), Lib.C_INT.withName("protocol"), Lib.C_INT.withName("vlan_present"), Lib.C_INT.withName("vlan_tci"), Lib.C_INT.withName("vlan_proto"), Lib.C_INT.withName("priority"), Lib.C_INT.withName("ingress_ifindex"), Lib.C_INT.withName("ifindex"), Lib.C_INT.withName("tc_index"), MemoryLayout.sequenceLayout((long)5L, (MemoryLayout)Lib.C_INT).withName("cb"), Lib.C_INT.withName("hash"), Lib.C_INT.withName("tc_classid"), Lib.C_INT.withName("data"), Lib.C_INT.withName("data_end"), Lib.C_INT.withName("napi_id"), Lib.C_INT.withName("family"), Lib.C_INT.withName("remote_ip4"), Lib.C_INT.withName("local_ip4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("remote_ip6"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("local_ip6"), Lib.C_INT.withName("remote_port"), Lib.C_INT.withName("local_port"), Lib.C_INT.withName("data_meta"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("flow_keys")}).withName("$anon$6270:2"), Lib.C_LONG_LONG.withName("tstamp"), Lib.C_INT.withName("wire_len"), Lib.C_INT.withName("gso_segs"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("sk")}).withName("$anon$6274:2"), Lib.C_INT.withName("gso_size"), Lib.C_CHAR.withName("tstamp_type"), MemoryLayout.paddingLayout((long)3L), Lib.C_LONG_LONG.withName("hwtstamp")}).withName("__sk_buff");
    private static final ValueLayout.OfInt len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"len")});
    private static final long len$OFFSET = 0L;
    private static final ValueLayout.OfInt pkt_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pkt_type")});
    private static final long pkt_type$OFFSET = 4L;
    private static final ValueLayout.OfInt mark$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mark")});
    private static final long mark$OFFSET = 8L;
    private static final ValueLayout.OfInt queue_mapping$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"queue_mapping")});
    private static final long queue_mapping$OFFSET = 12L;
    private static final ValueLayout.OfInt protocol$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"protocol")});
    private static final long protocol$OFFSET = 16L;
    private static final ValueLayout.OfInt vlan_present$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"vlan_present")});
    private static final long vlan_present$OFFSET = 20L;
    private static final ValueLayout.OfInt vlan_tci$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"vlan_tci")});
    private static final long vlan_tci$OFFSET = 24L;
    private static final ValueLayout.OfInt vlan_proto$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"vlan_proto")});
    private static final long vlan_proto$OFFSET = 28L;
    private static final ValueLayout.OfInt priority$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"priority")});
    private static final long priority$OFFSET = 32L;
    private static final ValueLayout.OfInt ingress_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ingress_ifindex")});
    private static final long ingress_ifindex$OFFSET = 36L;
    private static final ValueLayout.OfInt ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ifindex")});
    private static final long ifindex$OFFSET = 40L;
    private static final ValueLayout.OfInt tc_index$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tc_index")});
    private static final long tc_index$OFFSET = 44L;
    private static final SequenceLayout cb$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cb")});
    private static final long cb$OFFSET = 48L;
    private static long[] cb$DIMS = new long[]{5L};
    private static final VarHandle cb$ELEM_HANDLE = cb$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt hash$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hash")});
    private static final long hash$OFFSET = 68L;
    private static final ValueLayout.OfInt tc_classid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tc_classid")});
    private static final long tc_classid$OFFSET = 72L;
    private static final ValueLayout.OfInt data$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data")});
    private static final long data$OFFSET = 76L;
    private static final ValueLayout.OfInt data_end$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_end")});
    private static final long data_end$OFFSET = 80L;
    private static final ValueLayout.OfInt napi_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"napi_id")});
    private static final long napi_id$OFFSET = 84L;
    private static final ValueLayout.OfInt family$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"family")});
    private static final long family$OFFSET = 88L;
    private static final ValueLayout.OfInt remote_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"remote_ip4")});
    private static final long remote_ip4$OFFSET = 92L;
    private static final ValueLayout.OfInt local_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"local_ip4")});
    private static final long local_ip4$OFFSET = 96L;
    private static final SequenceLayout remote_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"remote_ip6")});
    private static final long remote_ip6$OFFSET = 100L;
    private static long[] remote_ip6$DIMS = new long[]{4L};
    private static final VarHandle remote_ip6$ELEM_HANDLE = remote_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final SequenceLayout local_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"local_ip6")});
    private static final long local_ip6$OFFSET = 116L;
    private static long[] local_ip6$DIMS = new long[]{4L};
    private static final VarHandle local_ip6$ELEM_HANDLE = local_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt remote_port$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"remote_port")});
    private static final long remote_port$OFFSET = 132L;
    private static final ValueLayout.OfInt local_port$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"local_port")});
    private static final long local_port$OFFSET = 136L;
    private static final ValueLayout.OfInt data_meta$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_meta")});
    private static final long data_meta$OFFSET = 140L;
    private static final AddressLayout flow_keys$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6270:2"), MemoryLayout.PathElement.groupElement((String)"flow_keys")});
    private static final long flow_keys$OFFSET = 144L;
    private static final ValueLayout.OfLong tstamp$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tstamp")});
    private static final long tstamp$OFFSET = 152L;
    private static final ValueLayout.OfInt wire_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"wire_len")});
    private static final long wire_len$OFFSET = 160L;
    private static final ValueLayout.OfInt gso_segs$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"gso_segs")});
    private static final long gso_segs$OFFSET = 164L;
    private static final AddressLayout sk$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6274:2"), MemoryLayout.PathElement.groupElement((String)"sk")});
    private static final long sk$OFFSET = 168L;
    private static final ValueLayout.OfInt gso_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"gso_size")});
    private static final long gso_size$OFFSET = 176L;
    private static final ValueLayout.OfByte tstamp_type$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tstamp_type")});
    private static final long tstamp_type$OFFSET = 180L;
    private static final ValueLayout.OfLong hwtstamp$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hwtstamp")});
    private static final long hwtstamp$OFFSET = 184L;

    __sk_buff() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt len$layout() {
        return len$LAYOUT;
    }

    public static final long len$offset() {
        return 0L;
    }

    public static int len(MemorySegment struct) {
        return struct.get(len$LAYOUT, 0L);
    }

    public static void len(MemorySegment struct, int fieldValue) {
        struct.set(len$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt pkt_type$layout() {
        return pkt_type$LAYOUT;
    }

    public static final long pkt_type$offset() {
        return 4L;
    }

    public static int pkt_type(MemorySegment struct) {
        return struct.get(pkt_type$LAYOUT, 4L);
    }

    public static void pkt_type(MemorySegment struct, int fieldValue) {
        struct.set(pkt_type$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt mark$layout() {
        return mark$LAYOUT;
    }

    public static final long mark$offset() {
        return 8L;
    }

    public static int mark(MemorySegment struct) {
        return struct.get(mark$LAYOUT, 8L);
    }

    public static void mark(MemorySegment struct, int fieldValue) {
        struct.set(mark$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt queue_mapping$layout() {
        return queue_mapping$LAYOUT;
    }

    public static final long queue_mapping$offset() {
        return 12L;
    }

    public static int queue_mapping(MemorySegment struct) {
        return struct.get(queue_mapping$LAYOUT, 12L);
    }

    public static void queue_mapping(MemorySegment struct, int fieldValue) {
        struct.set(queue_mapping$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt protocol$layout() {
        return protocol$LAYOUT;
    }

    public static final long protocol$offset() {
        return 16L;
    }

    public static int protocol(MemorySegment struct) {
        return struct.get(protocol$LAYOUT, 16L);
    }

    public static void protocol(MemorySegment struct, int fieldValue) {
        struct.set(protocol$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt vlan_present$layout() {
        return vlan_present$LAYOUT;
    }

    public static final long vlan_present$offset() {
        return 20L;
    }

    public static int vlan_present(MemorySegment struct) {
        return struct.get(vlan_present$LAYOUT, 20L);
    }

    public static void vlan_present(MemorySegment struct, int fieldValue) {
        struct.set(vlan_present$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt vlan_tci$layout() {
        return vlan_tci$LAYOUT;
    }

    public static final long vlan_tci$offset() {
        return 24L;
    }

    public static int vlan_tci(MemorySegment struct) {
        return struct.get(vlan_tci$LAYOUT, 24L);
    }

    public static void vlan_tci(MemorySegment struct, int fieldValue) {
        struct.set(vlan_tci$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt vlan_proto$layout() {
        return vlan_proto$LAYOUT;
    }

    public static final long vlan_proto$offset() {
        return 28L;
    }

    public static int vlan_proto(MemorySegment struct) {
        return struct.get(vlan_proto$LAYOUT, 28L);
    }

    public static void vlan_proto(MemorySegment struct, int fieldValue) {
        struct.set(vlan_proto$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt priority$layout() {
        return priority$LAYOUT;
    }

    public static final long priority$offset() {
        return 32L;
    }

    public static int priority(MemorySegment struct) {
        return struct.get(priority$LAYOUT, 32L);
    }

    public static void priority(MemorySegment struct, int fieldValue) {
        struct.set(priority$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt ingress_ifindex$layout() {
        return ingress_ifindex$LAYOUT;
    }

    public static final long ingress_ifindex$offset() {
        return 36L;
    }

    public static int ingress_ifindex(MemorySegment struct) {
        return struct.get(ingress_ifindex$LAYOUT, 36L);
    }

    public static void ingress_ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ingress_ifindex$LAYOUT, 36L, fieldValue);
    }

    public static final ValueLayout.OfInt ifindex$layout() {
        return ifindex$LAYOUT;
    }

    public static final long ifindex$offset() {
        return 40L;
    }

    public static int ifindex(MemorySegment struct) {
        return struct.get(ifindex$LAYOUT, 40L);
    }

    public static void ifindex(MemorySegment struct, int fieldValue) {
        struct.set(ifindex$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt tc_index$layout() {
        return tc_index$LAYOUT;
    }

    public static final long tc_index$offset() {
        return 44L;
    }

    public static int tc_index(MemorySegment struct) {
        return struct.get(tc_index$LAYOUT, 44L);
    }

    public static void tc_index(MemorySegment struct, int fieldValue) {
        struct.set(tc_index$LAYOUT, 44L, fieldValue);
    }

    public static final SequenceLayout cb$layout() {
        return cb$LAYOUT;
    }

    public static final long cb$offset() {
        return 48L;
    }

    public static MemorySegment cb(MemorySegment struct) {
        return struct.asSlice(48L, cb$LAYOUT.byteSize());
    }

    public static void cb(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)48L, (long)cb$LAYOUT.byteSize());
    }

    public static long[] cb$dimensions() {
        return cb$DIMS;
    }

    public static int cb(MemorySegment struct, long index0) {
        return cb$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void cb(MemorySegment struct, long index0, int fieldValue) {
        cb$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt hash$layout() {
        return hash$LAYOUT;
    }

    public static final long hash$offset() {
        return 68L;
    }

    public static int hash(MemorySegment struct) {
        return struct.get(hash$LAYOUT, 68L);
    }

    public static void hash(MemorySegment struct, int fieldValue) {
        struct.set(hash$LAYOUT, 68L, fieldValue);
    }

    public static final ValueLayout.OfInt tc_classid$layout() {
        return tc_classid$LAYOUT;
    }

    public static final long tc_classid$offset() {
        return 72L;
    }

    public static int tc_classid(MemorySegment struct) {
        return struct.get(tc_classid$LAYOUT, 72L);
    }

    public static void tc_classid(MemorySegment struct, int fieldValue) {
        struct.set(tc_classid$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt data$layout() {
        return data$LAYOUT;
    }

    public static final long data$offset() {
        return 76L;
    }

    public static int data(MemorySegment struct) {
        return struct.get(data$LAYOUT, 76L);
    }

    public static void data(MemorySegment struct, int fieldValue) {
        struct.set(data$LAYOUT, 76L, fieldValue);
    }

    public static final ValueLayout.OfInt data_end$layout() {
        return data_end$LAYOUT;
    }

    public static final long data_end$offset() {
        return 80L;
    }

    public static int data_end(MemorySegment struct) {
        return struct.get(data_end$LAYOUT, 80L);
    }

    public static void data_end(MemorySegment struct, int fieldValue) {
        struct.set(data_end$LAYOUT, 80L, fieldValue);
    }

    public static final ValueLayout.OfInt napi_id$layout() {
        return napi_id$LAYOUT;
    }

    public static final long napi_id$offset() {
        return 84L;
    }

    public static int napi_id(MemorySegment struct) {
        return struct.get(napi_id$LAYOUT, 84L);
    }

    public static void napi_id(MemorySegment struct, int fieldValue) {
        struct.set(napi_id$LAYOUT, 84L, fieldValue);
    }

    public static final ValueLayout.OfInt family$layout() {
        return family$LAYOUT;
    }

    public static final long family$offset() {
        return 88L;
    }

    public static int family(MemorySegment struct) {
        return struct.get(family$LAYOUT, 88L);
    }

    public static void family(MemorySegment struct, int fieldValue) {
        struct.set(family$LAYOUT, 88L, fieldValue);
    }

    public static final ValueLayout.OfInt remote_ip4$layout() {
        return remote_ip4$LAYOUT;
    }

    public static final long remote_ip4$offset() {
        return 92L;
    }

    public static int remote_ip4(MemorySegment struct) {
        return struct.get(remote_ip4$LAYOUT, 92L);
    }

    public static void remote_ip4(MemorySegment struct, int fieldValue) {
        struct.set(remote_ip4$LAYOUT, 92L, fieldValue);
    }

    public static final ValueLayout.OfInt local_ip4$layout() {
        return local_ip4$LAYOUT;
    }

    public static final long local_ip4$offset() {
        return 96L;
    }

    public static int local_ip4(MemorySegment struct) {
        return struct.get(local_ip4$LAYOUT, 96L);
    }

    public static void local_ip4(MemorySegment struct, int fieldValue) {
        struct.set(local_ip4$LAYOUT, 96L, fieldValue);
    }

    public static final SequenceLayout remote_ip6$layout() {
        return remote_ip6$LAYOUT;
    }

    public static final long remote_ip6$offset() {
        return 100L;
    }

    public static MemorySegment remote_ip6(MemorySegment struct) {
        return struct.asSlice(100L, remote_ip6$LAYOUT.byteSize());
    }

    public static void remote_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)100L, (long)remote_ip6$LAYOUT.byteSize());
    }

    public static long[] remote_ip6$dimensions() {
        return remote_ip6$DIMS;
    }

    public static int remote_ip6(MemorySegment struct, long index0) {
        return remote_ip6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void remote_ip6(MemorySegment struct, long index0, int fieldValue) {
        remote_ip6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final SequenceLayout local_ip6$layout() {
        return local_ip6$LAYOUT;
    }

    public static final long local_ip6$offset() {
        return 116L;
    }

    public static MemorySegment local_ip6(MemorySegment struct) {
        return struct.asSlice(116L, local_ip6$LAYOUT.byteSize());
    }

    public static void local_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)116L, (long)local_ip6$LAYOUT.byteSize());
    }

    public static long[] local_ip6$dimensions() {
        return local_ip6$DIMS;
    }

    public static int local_ip6(MemorySegment struct, long index0) {
        return local_ip6$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void local_ip6(MemorySegment struct, long index0, int fieldValue) {
        local_ip6$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt remote_port$layout() {
        return remote_port$LAYOUT;
    }

    public static final long remote_port$offset() {
        return 132L;
    }

    public static int remote_port(MemorySegment struct) {
        return struct.get(remote_port$LAYOUT, 132L);
    }

    public static void remote_port(MemorySegment struct, int fieldValue) {
        struct.set(remote_port$LAYOUT, 132L, fieldValue);
    }

    public static final ValueLayout.OfInt local_port$layout() {
        return local_port$LAYOUT;
    }

    public static final long local_port$offset() {
        return 136L;
    }

    public static int local_port(MemorySegment struct) {
        return struct.get(local_port$LAYOUT, 136L);
    }

    public static void local_port(MemorySegment struct, int fieldValue) {
        struct.set(local_port$LAYOUT, 136L, fieldValue);
    }

    public static final ValueLayout.OfInt data_meta$layout() {
        return data_meta$LAYOUT;
    }

    public static final long data_meta$offset() {
        return 140L;
    }

    public static int data_meta(MemorySegment struct) {
        return struct.get(data_meta$LAYOUT, 140L);
    }

    public static void data_meta(MemorySegment struct, int fieldValue) {
        struct.set(data_meta$LAYOUT, 140L, fieldValue);
    }

    public static final AddressLayout flow_keys$layout() {
        return flow_keys$LAYOUT;
    }

    public static final long flow_keys$offset() {
        return 144L;
    }

    public static MemorySegment flow_keys(MemorySegment struct) {
        return struct.get(flow_keys$LAYOUT, 144L);
    }

    public static void flow_keys(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(flow_keys$LAYOUT, 144L, fieldValue);
    }

    public static final ValueLayout.OfLong tstamp$layout() {
        return tstamp$LAYOUT;
    }

    public static final long tstamp$offset() {
        return 152L;
    }

    public static long tstamp(MemorySegment struct) {
        return struct.get(tstamp$LAYOUT, 152L);
    }

    public static void tstamp(MemorySegment struct, long fieldValue) {
        struct.set(tstamp$LAYOUT, 152L, fieldValue);
    }

    public static final ValueLayout.OfInt wire_len$layout() {
        return wire_len$LAYOUT;
    }

    public static final long wire_len$offset() {
        return 160L;
    }

    public static int wire_len(MemorySegment struct) {
        return struct.get(wire_len$LAYOUT, 160L);
    }

    public static void wire_len(MemorySegment struct, int fieldValue) {
        struct.set(wire_len$LAYOUT, 160L, fieldValue);
    }

    public static final ValueLayout.OfInt gso_segs$layout() {
        return gso_segs$LAYOUT;
    }

    public static final long gso_segs$offset() {
        return 164L;
    }

    public static int gso_segs(MemorySegment struct) {
        return struct.get(gso_segs$LAYOUT, 164L);
    }

    public static void gso_segs(MemorySegment struct, int fieldValue) {
        struct.set(gso_segs$LAYOUT, 164L, fieldValue);
    }

    public static final AddressLayout sk$layout() {
        return sk$LAYOUT;
    }

    public static final long sk$offset() {
        return 168L;
    }

    public static MemorySegment sk(MemorySegment struct) {
        return struct.get(sk$LAYOUT, 168L);
    }

    public static void sk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sk$LAYOUT, 168L, fieldValue);
    }

    public static final ValueLayout.OfInt gso_size$layout() {
        return gso_size$LAYOUT;
    }

    public static final long gso_size$offset() {
        return 176L;
    }

    public static int gso_size(MemorySegment struct) {
        return struct.get(gso_size$LAYOUT, 176L);
    }

    public static void gso_size(MemorySegment struct, int fieldValue) {
        struct.set(gso_size$LAYOUT, 176L, fieldValue);
    }

    public static final ValueLayout.OfByte tstamp_type$layout() {
        return tstamp_type$LAYOUT;
    }

    public static final long tstamp_type$offset() {
        return 180L;
    }

    public static byte tstamp_type(MemorySegment struct) {
        return struct.get(tstamp_type$LAYOUT, 180L);
    }

    public static void tstamp_type(MemorySegment struct, byte fieldValue) {
        struct.set(tstamp_type$LAYOUT, 180L, fieldValue);
    }

    public static final ValueLayout.OfLong hwtstamp$layout() {
        return hwtstamp$LAYOUT;
    }

    public static final long hwtstamp$offset() {
        return 184L;
    }

    public static long hwtstamp(MemorySegment struct) {
        return struct.get(hwtstamp$LAYOUT, 184L);
    }

    public static void hwtstamp(MemorySegment struct, long fieldValue) {
        struct.set(hwtstamp$LAYOUT, 184L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(__sk_buff.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return __sk_buff.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)__sk_buff.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)__sk_buff.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return __sk_buff.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(__sk_buff.layout().byteSize() * elementCount, arena, cleanup);
    }
}

