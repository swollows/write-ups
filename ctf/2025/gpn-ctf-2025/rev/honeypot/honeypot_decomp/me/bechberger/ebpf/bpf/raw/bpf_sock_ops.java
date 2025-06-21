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

public class bpf_sock_ops {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("op"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("args"), Lib.C_INT.withName("reply"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("replylong")}).withName("$anon$6788:2"), Lib.C_INT.withName("family"), Lib.C_INT.withName("remote_ip4"), Lib.C_INT.withName("local_ip4"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("remote_ip6"), MemoryLayout.sequenceLayout((long)4L, (MemoryLayout)Lib.C_INT).withName("local_ip6"), Lib.C_INT.withName("remote_port"), Lib.C_INT.withName("local_port"), Lib.C_INT.withName("is_fullsock"), Lib.C_INT.withName("snd_cwnd"), Lib.C_INT.withName("srtt_us"), Lib.C_INT.withName("bpf_sock_ops_cb_flags"), Lib.C_INT.withName("state"), Lib.C_INT.withName("rtt_min"), Lib.C_INT.withName("snd_ssthresh"), Lib.C_INT.withName("rcv_nxt"), Lib.C_INT.withName("snd_nxt"), Lib.C_INT.withName("snd_una"), Lib.C_INT.withName("mss_cache"), Lib.C_INT.withName("ecn_flags"), Lib.C_INT.withName("rate_delivered"), Lib.C_INT.withName("rate_interval_us"), Lib.C_INT.withName("packets_out"), Lib.C_INT.withName("retrans_out"), Lib.C_INT.withName("total_retrans"), Lib.C_INT.withName("segs_in"), Lib.C_INT.withName("data_segs_in"), Lib.C_INT.withName("segs_out"), Lib.C_INT.withName("data_segs_out"), Lib.C_INT.withName("lost_out"), Lib.C_INT.withName("sacked_out"), Lib.C_INT.withName("sk_txhash"), Lib.C_LONG_LONG.withName("bytes_received"), Lib.C_LONG_LONG.withName("bytes_acked"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("sk")}).withName("$anon$6829:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("skb_data")}).withName("$anon$6844:2"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_POINTER.withName("skb_data_end")}).withName("$anon$6845:2"), Lib.C_INT.withName("skb_len"), Lib.C_INT.withName("skb_tcp_flags"), Lib.C_LONG_LONG.withName("skb_hwtstamp")}).withName("bpf_sock_ops");
    private static final ValueLayout.OfInt op$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"op")});
    private static final long op$OFFSET = 0L;
    private static final SequenceLayout args$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6788:2"), MemoryLayout.PathElement.groupElement((String)"args")});
    private static final long args$OFFSET = 4L;
    private static long[] args$DIMS = new long[]{4L};
    private static final VarHandle args$ELEM_HANDLE = args$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt reply$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6788:2"), MemoryLayout.PathElement.groupElement((String)"reply")});
    private static final long reply$OFFSET = 4L;
    private static final SequenceLayout replylong$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6788:2"), MemoryLayout.PathElement.groupElement((String)"replylong")});
    private static final long replylong$OFFSET = 4L;
    private static long[] replylong$DIMS = new long[]{4L};
    private static final VarHandle replylong$ELEM_HANDLE = replylong$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt family$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"family")});
    private static final long family$OFFSET = 20L;
    private static final ValueLayout.OfInt remote_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"remote_ip4")});
    private static final long remote_ip4$OFFSET = 24L;
    private static final ValueLayout.OfInt local_ip4$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"local_ip4")});
    private static final long local_ip4$OFFSET = 28L;
    private static final SequenceLayout remote_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"remote_ip6")});
    private static final long remote_ip6$OFFSET = 32L;
    private static long[] remote_ip6$DIMS = new long[]{4L};
    private static final VarHandle remote_ip6$ELEM_HANDLE = remote_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final SequenceLayout local_ip6$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"local_ip6")});
    private static final long local_ip6$OFFSET = 48L;
    private static long[] local_ip6$DIMS = new long[]{4L};
    private static final VarHandle local_ip6$ELEM_HANDLE = local_ip6$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt remote_port$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"remote_port")});
    private static final long remote_port$OFFSET = 64L;
    private static final ValueLayout.OfInt local_port$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"local_port")});
    private static final long local_port$OFFSET = 68L;
    private static final ValueLayout.OfInt is_fullsock$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"is_fullsock")});
    private static final long is_fullsock$OFFSET = 72L;
    private static final ValueLayout.OfInt snd_cwnd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_cwnd")});
    private static final long snd_cwnd$OFFSET = 76L;
    private static final ValueLayout.OfInt srtt_us$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"srtt_us")});
    private static final long srtt_us$OFFSET = 80L;
    private static final ValueLayout.OfInt bpf_sock_ops_cb_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bpf_sock_ops_cb_flags")});
    private static final long bpf_sock_ops_cb_flags$OFFSET = 84L;
    private static final ValueLayout.OfInt state$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"state")});
    private static final long state$OFFSET = 88L;
    private static final ValueLayout.OfInt rtt_min$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rtt_min")});
    private static final long rtt_min$OFFSET = 92L;
    private static final ValueLayout.OfInt snd_ssthresh$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_ssthresh")});
    private static final long snd_ssthresh$OFFSET = 96L;
    private static final ValueLayout.OfInt rcv_nxt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rcv_nxt")});
    private static final long rcv_nxt$OFFSET = 100L;
    private static final ValueLayout.OfInt snd_nxt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_nxt")});
    private static final long snd_nxt$OFFSET = 104L;
    private static final ValueLayout.OfInt snd_una$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_una")});
    private static final long snd_una$OFFSET = 108L;
    private static final ValueLayout.OfInt mss_cache$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mss_cache")});
    private static final long mss_cache$OFFSET = 112L;
    private static final ValueLayout.OfInt ecn_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ecn_flags")});
    private static final long ecn_flags$OFFSET = 116L;
    private static final ValueLayout.OfInt rate_delivered$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rate_delivered")});
    private static final long rate_delivered$OFFSET = 120L;
    private static final ValueLayout.OfInt rate_interval_us$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rate_interval_us")});
    private static final long rate_interval_us$OFFSET = 124L;
    private static final ValueLayout.OfInt packets_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"packets_out")});
    private static final long packets_out$OFFSET = 128L;
    private static final ValueLayout.OfInt retrans_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"retrans_out")});
    private static final long retrans_out$OFFSET = 132L;
    private static final ValueLayout.OfInt total_retrans$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"total_retrans")});
    private static final long total_retrans$OFFSET = 136L;
    private static final ValueLayout.OfInt segs_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"segs_in")});
    private static final long segs_in$OFFSET = 140L;
    private static final ValueLayout.OfInt data_segs_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_segs_in")});
    private static final long data_segs_in$OFFSET = 144L;
    private static final ValueLayout.OfInt segs_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"segs_out")});
    private static final long segs_out$OFFSET = 148L;
    private static final ValueLayout.OfInt data_segs_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_segs_out")});
    private static final long data_segs_out$OFFSET = 152L;
    private static final ValueLayout.OfInt lost_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"lost_out")});
    private static final long lost_out$OFFSET = 156L;
    private static final ValueLayout.OfInt sacked_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sacked_out")});
    private static final long sacked_out$OFFSET = 160L;
    private static final ValueLayout.OfInt sk_txhash$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sk_txhash")});
    private static final long sk_txhash$OFFSET = 164L;
    private static final ValueLayout.OfLong bytes_received$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bytes_received")});
    private static final long bytes_received$OFFSET = 168L;
    private static final ValueLayout.OfLong bytes_acked$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bytes_acked")});
    private static final long bytes_acked$OFFSET = 176L;
    private static final AddressLayout sk$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6829:2"), MemoryLayout.PathElement.groupElement((String)"sk")});
    private static final long sk$OFFSET = 184L;
    private static final AddressLayout skb_data$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6844:2"), MemoryLayout.PathElement.groupElement((String)"skb_data")});
    private static final long skb_data$OFFSET = 192L;
    private static final AddressLayout skb_data_end$LAYOUT = (AddressLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$6845:2"), MemoryLayout.PathElement.groupElement((String)"skb_data_end")});
    private static final long skb_data_end$OFFSET = 200L;
    private static final ValueLayout.OfInt skb_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"skb_len")});
    private static final long skb_len$OFFSET = 208L;
    private static final ValueLayout.OfInt skb_tcp_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"skb_tcp_flags")});
    private static final long skb_tcp_flags$OFFSET = 212L;
    private static final ValueLayout.OfLong skb_hwtstamp$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"skb_hwtstamp")});
    private static final long skb_hwtstamp$OFFSET = 216L;

    bpf_sock_ops() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt op$layout() {
        return op$LAYOUT;
    }

    public static final long op$offset() {
        return 0L;
    }

    public static int op(MemorySegment struct) {
        return struct.get(op$LAYOUT, 0L);
    }

    public static void op(MemorySegment struct, int fieldValue) {
        struct.set(op$LAYOUT, 0L, fieldValue);
    }

    public static final SequenceLayout args$layout() {
        return args$LAYOUT;
    }

    public static final long args$offset() {
        return 4L;
    }

    public static MemorySegment args(MemorySegment struct) {
        return struct.asSlice(4L, args$LAYOUT.byteSize());
    }

    public static void args(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)args$LAYOUT.byteSize());
    }

    public static long[] args$dimensions() {
        return args$DIMS;
    }

    public static int args(MemorySegment struct, long index0) {
        return args$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void args(MemorySegment struct, long index0, int fieldValue) {
        args$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt reply$layout() {
        return reply$LAYOUT;
    }

    public static final long reply$offset() {
        return 4L;
    }

    public static int reply(MemorySegment struct) {
        return struct.get(reply$LAYOUT, 4L);
    }

    public static void reply(MemorySegment struct, int fieldValue) {
        struct.set(reply$LAYOUT, 4L, fieldValue);
    }

    public static final SequenceLayout replylong$layout() {
        return replylong$LAYOUT;
    }

    public static final long replylong$offset() {
        return 4L;
    }

    public static MemorySegment replylong(MemorySegment struct) {
        return struct.asSlice(4L, replylong$LAYOUT.byteSize());
    }

    public static void replylong(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)4L, (long)replylong$LAYOUT.byteSize());
    }

    public static long[] replylong$dimensions() {
        return replylong$DIMS;
    }

    public static int replylong(MemorySegment struct, long index0) {
        return replylong$ELEM_HANDLE.get(struct, 0L, index0);
    }

    public static void replylong(MemorySegment struct, long index0, int fieldValue) {
        replylong$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt family$layout() {
        return family$LAYOUT;
    }

    public static final long family$offset() {
        return 20L;
    }

    public static int family(MemorySegment struct) {
        return struct.get(family$LAYOUT, 20L);
    }

    public static void family(MemorySegment struct, int fieldValue) {
        struct.set(family$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt remote_ip4$layout() {
        return remote_ip4$LAYOUT;
    }

    public static final long remote_ip4$offset() {
        return 24L;
    }

    public static int remote_ip4(MemorySegment struct) {
        return struct.get(remote_ip4$LAYOUT, 24L);
    }

    public static void remote_ip4(MemorySegment struct, int fieldValue) {
        struct.set(remote_ip4$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt local_ip4$layout() {
        return local_ip4$LAYOUT;
    }

    public static final long local_ip4$offset() {
        return 28L;
    }

    public static int local_ip4(MemorySegment struct) {
        return struct.get(local_ip4$LAYOUT, 28L);
    }

    public static void local_ip4(MemorySegment struct, int fieldValue) {
        struct.set(local_ip4$LAYOUT, 28L, fieldValue);
    }

    public static final SequenceLayout remote_ip6$layout() {
        return remote_ip6$LAYOUT;
    }

    public static final long remote_ip6$offset() {
        return 32L;
    }

    public static MemorySegment remote_ip6(MemorySegment struct) {
        return struct.asSlice(32L, remote_ip6$LAYOUT.byteSize());
    }

    public static void remote_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)32L, (long)remote_ip6$LAYOUT.byteSize());
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
        return 48L;
    }

    public static MemorySegment local_ip6(MemorySegment struct) {
        return struct.asSlice(48L, local_ip6$LAYOUT.byteSize());
    }

    public static void local_ip6(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)48L, (long)local_ip6$LAYOUT.byteSize());
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
        return 64L;
    }

    public static int remote_port(MemorySegment struct) {
        return struct.get(remote_port$LAYOUT, 64L);
    }

    public static void remote_port(MemorySegment struct, int fieldValue) {
        struct.set(remote_port$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt local_port$layout() {
        return local_port$LAYOUT;
    }

    public static final long local_port$offset() {
        return 68L;
    }

    public static int local_port(MemorySegment struct) {
        return struct.get(local_port$LAYOUT, 68L);
    }

    public static void local_port(MemorySegment struct, int fieldValue) {
        struct.set(local_port$LAYOUT, 68L, fieldValue);
    }

    public static final ValueLayout.OfInt is_fullsock$layout() {
        return is_fullsock$LAYOUT;
    }

    public static final long is_fullsock$offset() {
        return 72L;
    }

    public static int is_fullsock(MemorySegment struct) {
        return struct.get(is_fullsock$LAYOUT, 72L);
    }

    public static void is_fullsock(MemorySegment struct, int fieldValue) {
        struct.set(is_fullsock$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt snd_cwnd$layout() {
        return snd_cwnd$LAYOUT;
    }

    public static final long snd_cwnd$offset() {
        return 76L;
    }

    public static int snd_cwnd(MemorySegment struct) {
        return struct.get(snd_cwnd$LAYOUT, 76L);
    }

    public static void snd_cwnd(MemorySegment struct, int fieldValue) {
        struct.set(snd_cwnd$LAYOUT, 76L, fieldValue);
    }

    public static final ValueLayout.OfInt srtt_us$layout() {
        return srtt_us$LAYOUT;
    }

    public static final long srtt_us$offset() {
        return 80L;
    }

    public static int srtt_us(MemorySegment struct) {
        return struct.get(srtt_us$LAYOUT, 80L);
    }

    public static void srtt_us(MemorySegment struct, int fieldValue) {
        struct.set(srtt_us$LAYOUT, 80L, fieldValue);
    }

    public static final ValueLayout.OfInt bpf_sock_ops_cb_flags$layout() {
        return bpf_sock_ops_cb_flags$LAYOUT;
    }

    public static final long bpf_sock_ops_cb_flags$offset() {
        return 84L;
    }

    public static int bpf_sock_ops_cb_flags(MemorySegment struct) {
        return struct.get(bpf_sock_ops_cb_flags$LAYOUT, 84L);
    }

    public static void bpf_sock_ops_cb_flags(MemorySegment struct, int fieldValue) {
        struct.set(bpf_sock_ops_cb_flags$LAYOUT, 84L, fieldValue);
    }

    public static final ValueLayout.OfInt state$layout() {
        return state$LAYOUT;
    }

    public static final long state$offset() {
        return 88L;
    }

    public static int state(MemorySegment struct) {
        return struct.get(state$LAYOUT, 88L);
    }

    public static void state(MemorySegment struct, int fieldValue) {
        struct.set(state$LAYOUT, 88L, fieldValue);
    }

    public static final ValueLayout.OfInt rtt_min$layout() {
        return rtt_min$LAYOUT;
    }

    public static final long rtt_min$offset() {
        return 92L;
    }

    public static int rtt_min(MemorySegment struct) {
        return struct.get(rtt_min$LAYOUT, 92L);
    }

    public static void rtt_min(MemorySegment struct, int fieldValue) {
        struct.set(rtt_min$LAYOUT, 92L, fieldValue);
    }

    public static final ValueLayout.OfInt snd_ssthresh$layout() {
        return snd_ssthresh$LAYOUT;
    }

    public static final long snd_ssthresh$offset() {
        return 96L;
    }

    public static int snd_ssthresh(MemorySegment struct) {
        return struct.get(snd_ssthresh$LAYOUT, 96L);
    }

    public static void snd_ssthresh(MemorySegment struct, int fieldValue) {
        struct.set(snd_ssthresh$LAYOUT, 96L, fieldValue);
    }

    public static final ValueLayout.OfInt rcv_nxt$layout() {
        return rcv_nxt$LAYOUT;
    }

    public static final long rcv_nxt$offset() {
        return 100L;
    }

    public static int rcv_nxt(MemorySegment struct) {
        return struct.get(rcv_nxt$LAYOUT, 100L);
    }

    public static void rcv_nxt(MemorySegment struct, int fieldValue) {
        struct.set(rcv_nxt$LAYOUT, 100L, fieldValue);
    }

    public static final ValueLayout.OfInt snd_nxt$layout() {
        return snd_nxt$LAYOUT;
    }

    public static final long snd_nxt$offset() {
        return 104L;
    }

    public static int snd_nxt(MemorySegment struct) {
        return struct.get(snd_nxt$LAYOUT, 104L);
    }

    public static void snd_nxt(MemorySegment struct, int fieldValue) {
        struct.set(snd_nxt$LAYOUT, 104L, fieldValue);
    }

    public static final ValueLayout.OfInt snd_una$layout() {
        return snd_una$LAYOUT;
    }

    public static final long snd_una$offset() {
        return 108L;
    }

    public static int snd_una(MemorySegment struct) {
        return struct.get(snd_una$LAYOUT, 108L);
    }

    public static void snd_una(MemorySegment struct, int fieldValue) {
        struct.set(snd_una$LAYOUT, 108L, fieldValue);
    }

    public static final ValueLayout.OfInt mss_cache$layout() {
        return mss_cache$LAYOUT;
    }

    public static final long mss_cache$offset() {
        return 112L;
    }

    public static int mss_cache(MemorySegment struct) {
        return struct.get(mss_cache$LAYOUT, 112L);
    }

    public static void mss_cache(MemorySegment struct, int fieldValue) {
        struct.set(mss_cache$LAYOUT, 112L, fieldValue);
    }

    public static final ValueLayout.OfInt ecn_flags$layout() {
        return ecn_flags$LAYOUT;
    }

    public static final long ecn_flags$offset() {
        return 116L;
    }

    public static int ecn_flags(MemorySegment struct) {
        return struct.get(ecn_flags$LAYOUT, 116L);
    }

    public static void ecn_flags(MemorySegment struct, int fieldValue) {
        struct.set(ecn_flags$LAYOUT, 116L, fieldValue);
    }

    public static final ValueLayout.OfInt rate_delivered$layout() {
        return rate_delivered$LAYOUT;
    }

    public static final long rate_delivered$offset() {
        return 120L;
    }

    public static int rate_delivered(MemorySegment struct) {
        return struct.get(rate_delivered$LAYOUT, 120L);
    }

    public static void rate_delivered(MemorySegment struct, int fieldValue) {
        struct.set(rate_delivered$LAYOUT, 120L, fieldValue);
    }

    public static final ValueLayout.OfInt rate_interval_us$layout() {
        return rate_interval_us$LAYOUT;
    }

    public static final long rate_interval_us$offset() {
        return 124L;
    }

    public static int rate_interval_us(MemorySegment struct) {
        return struct.get(rate_interval_us$LAYOUT, 124L);
    }

    public static void rate_interval_us(MemorySegment struct, int fieldValue) {
        struct.set(rate_interval_us$LAYOUT, 124L, fieldValue);
    }

    public static final ValueLayout.OfInt packets_out$layout() {
        return packets_out$LAYOUT;
    }

    public static final long packets_out$offset() {
        return 128L;
    }

    public static int packets_out(MemorySegment struct) {
        return struct.get(packets_out$LAYOUT, 128L);
    }

    public static void packets_out(MemorySegment struct, int fieldValue) {
        struct.set(packets_out$LAYOUT, 128L, fieldValue);
    }

    public static final ValueLayout.OfInt retrans_out$layout() {
        return retrans_out$LAYOUT;
    }

    public static final long retrans_out$offset() {
        return 132L;
    }

    public static int retrans_out(MemorySegment struct) {
        return struct.get(retrans_out$LAYOUT, 132L);
    }

    public static void retrans_out(MemorySegment struct, int fieldValue) {
        struct.set(retrans_out$LAYOUT, 132L, fieldValue);
    }

    public static final ValueLayout.OfInt total_retrans$layout() {
        return total_retrans$LAYOUT;
    }

    public static final long total_retrans$offset() {
        return 136L;
    }

    public static int total_retrans(MemorySegment struct) {
        return struct.get(total_retrans$LAYOUT, 136L);
    }

    public static void total_retrans(MemorySegment struct, int fieldValue) {
        struct.set(total_retrans$LAYOUT, 136L, fieldValue);
    }

    public static final ValueLayout.OfInt segs_in$layout() {
        return segs_in$LAYOUT;
    }

    public static final long segs_in$offset() {
        return 140L;
    }

    public static int segs_in(MemorySegment struct) {
        return struct.get(segs_in$LAYOUT, 140L);
    }

    public static void segs_in(MemorySegment struct, int fieldValue) {
        struct.set(segs_in$LAYOUT, 140L, fieldValue);
    }

    public static final ValueLayout.OfInt data_segs_in$layout() {
        return data_segs_in$LAYOUT;
    }

    public static final long data_segs_in$offset() {
        return 144L;
    }

    public static int data_segs_in(MemorySegment struct) {
        return struct.get(data_segs_in$LAYOUT, 144L);
    }

    public static void data_segs_in(MemorySegment struct, int fieldValue) {
        struct.set(data_segs_in$LAYOUT, 144L, fieldValue);
    }

    public static final ValueLayout.OfInt segs_out$layout() {
        return segs_out$LAYOUT;
    }

    public static final long segs_out$offset() {
        return 148L;
    }

    public static int segs_out(MemorySegment struct) {
        return struct.get(segs_out$LAYOUT, 148L);
    }

    public static void segs_out(MemorySegment struct, int fieldValue) {
        struct.set(segs_out$LAYOUT, 148L, fieldValue);
    }

    public static final ValueLayout.OfInt data_segs_out$layout() {
        return data_segs_out$LAYOUT;
    }

    public static final long data_segs_out$offset() {
        return 152L;
    }

    public static int data_segs_out(MemorySegment struct) {
        return struct.get(data_segs_out$LAYOUT, 152L);
    }

    public static void data_segs_out(MemorySegment struct, int fieldValue) {
        struct.set(data_segs_out$LAYOUT, 152L, fieldValue);
    }

    public static final ValueLayout.OfInt lost_out$layout() {
        return lost_out$LAYOUT;
    }

    public static final long lost_out$offset() {
        return 156L;
    }

    public static int lost_out(MemorySegment struct) {
        return struct.get(lost_out$LAYOUT, 156L);
    }

    public static void lost_out(MemorySegment struct, int fieldValue) {
        struct.set(lost_out$LAYOUT, 156L, fieldValue);
    }

    public static final ValueLayout.OfInt sacked_out$layout() {
        return sacked_out$LAYOUT;
    }

    public static final long sacked_out$offset() {
        return 160L;
    }

    public static int sacked_out(MemorySegment struct) {
        return struct.get(sacked_out$LAYOUT, 160L);
    }

    public static void sacked_out(MemorySegment struct, int fieldValue) {
        struct.set(sacked_out$LAYOUT, 160L, fieldValue);
    }

    public static final ValueLayout.OfInt sk_txhash$layout() {
        return sk_txhash$LAYOUT;
    }

    public static final long sk_txhash$offset() {
        return 164L;
    }

    public static int sk_txhash(MemorySegment struct) {
        return struct.get(sk_txhash$LAYOUT, 164L);
    }

    public static void sk_txhash(MemorySegment struct, int fieldValue) {
        struct.set(sk_txhash$LAYOUT, 164L, fieldValue);
    }

    public static final ValueLayout.OfLong bytes_received$layout() {
        return bytes_received$LAYOUT;
    }

    public static final long bytes_received$offset() {
        return 168L;
    }

    public static long bytes_received(MemorySegment struct) {
        return struct.get(bytes_received$LAYOUT, 168L);
    }

    public static void bytes_received(MemorySegment struct, long fieldValue) {
        struct.set(bytes_received$LAYOUT, 168L, fieldValue);
    }

    public static final ValueLayout.OfLong bytes_acked$layout() {
        return bytes_acked$LAYOUT;
    }

    public static final long bytes_acked$offset() {
        return 176L;
    }

    public static long bytes_acked(MemorySegment struct) {
        return struct.get(bytes_acked$LAYOUT, 176L);
    }

    public static void bytes_acked(MemorySegment struct, long fieldValue) {
        struct.set(bytes_acked$LAYOUT, 176L, fieldValue);
    }

    public static final AddressLayout sk$layout() {
        return sk$LAYOUT;
    }

    public static final long sk$offset() {
        return 184L;
    }

    public static MemorySegment sk(MemorySegment struct) {
        return struct.get(sk$LAYOUT, 184L);
    }

    public static void sk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sk$LAYOUT, 184L, fieldValue);
    }

    public static final AddressLayout skb_data$layout() {
        return skb_data$LAYOUT;
    }

    public static final long skb_data$offset() {
        return 192L;
    }

    public static MemorySegment skb_data(MemorySegment struct) {
        return struct.get(skb_data$LAYOUT, 192L);
    }

    public static void skb_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(skb_data$LAYOUT, 192L, fieldValue);
    }

    public static final AddressLayout skb_data_end$layout() {
        return skb_data_end$LAYOUT;
    }

    public static final long skb_data_end$offset() {
        return 200L;
    }

    public static MemorySegment skb_data_end(MemorySegment struct) {
        return struct.get(skb_data_end$LAYOUT, 200L);
    }

    public static void skb_data_end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(skb_data_end$LAYOUT, 200L, fieldValue);
    }

    public static final ValueLayout.OfInt skb_len$layout() {
        return skb_len$LAYOUT;
    }

    public static final long skb_len$offset() {
        return 208L;
    }

    public static int skb_len(MemorySegment struct) {
        return struct.get(skb_len$LAYOUT, 208L);
    }

    public static void skb_len(MemorySegment struct, int fieldValue) {
        struct.set(skb_len$LAYOUT, 208L, fieldValue);
    }

    public static final ValueLayout.OfInt skb_tcp_flags$layout() {
        return skb_tcp_flags$LAYOUT;
    }

    public static final long skb_tcp_flags$offset() {
        return 212L;
    }

    public static int skb_tcp_flags(MemorySegment struct) {
        return struct.get(skb_tcp_flags$LAYOUT, 212L);
    }

    public static void skb_tcp_flags(MemorySegment struct, int fieldValue) {
        struct.set(skb_tcp_flags$LAYOUT, 212L, fieldValue);
    }

    public static final ValueLayout.OfLong skb_hwtstamp$layout() {
        return skb_hwtstamp$LAYOUT;
    }

    public static final long skb_hwtstamp$offset() {
        return 216L;
    }

    public static long skb_hwtstamp(MemorySegment struct) {
        return struct.get(skb_hwtstamp$LAYOUT, 216L);
    }

    public static void skb_hwtstamp(MemorySegment struct, long fieldValue) {
        struct.set(skb_hwtstamp$LAYOUT, 216L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_sock_ops.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_sock_ops.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_sock_ops.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_sock_ops.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_sock_ops.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_sock_ops.layout().byteSize() * elementCount, arena, cleanup);
    }
}

