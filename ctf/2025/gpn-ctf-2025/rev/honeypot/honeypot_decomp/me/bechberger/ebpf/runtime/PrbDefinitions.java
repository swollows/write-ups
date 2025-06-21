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
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.PrintkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TpacketDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PrbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prb_calc_retire_blk_tmo(Ptr<PacketDefinitions.packet_sock> po, int blk_size_in_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prb_fill_curr_block(String curr, Ptr<TpacketDefinitions.tpacket_kbdq_core> pkc, Ptr<TpacketDefinitions.tpacket_block_desc> pbd, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prb_open_block(Ptr<TpacketDefinitions.tpacket_kbdq_core> pkc1, Ptr<TpacketDefinitions.tpacket_block_desc> pbd1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prb_retire_current_block(Ptr<TpacketDefinitions.tpacket_kbdq_core> pkc, Ptr<PacketDefinitions.packet_sock> po, @Unsigned int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prb_retire_rx_blk_timer_expired(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _prb_commit(Ptr<prb_reserved_entry> e, @Unsigned long state_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean _prb_read_valid(Ptr<PrintkDefinitions.printk_ringbuffer> rb, Ptr<@Unsigned Long> seq, Ptr<PrintkDefinitions.printk_record> r, Ptr<@Unsigned Integer> line_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prb_commit(Ptr<prb_reserved_entry> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prb_final_commit(Ptr<prb_reserved_entry> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long prb_first_seq(Ptr<PrintkDefinitions.printk_ringbuffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long prb_first_valid_seq(Ptr<PrintkDefinitions.printk_ringbuffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prb_init(Ptr<PrintkDefinitions.printk_ringbuffer> rb, String text_buf, @Unsigned int textbits, Ptr<prb_desc> descs, @Unsigned int descbits, Ptr<PrintkDefinitions.printk_info> infos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long prb_next_reserve_seq(Ptr<PrintkDefinitions.printk_ringbuffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long prb_next_seq(Ptr<PrintkDefinitions.printk_ringbuffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prb_read(Ptr<PrintkDefinitions.printk_ringbuffer> rb, @Unsigned long seq, Ptr<PrintkDefinitions.printk_record> r, Ptr<@Unsigned Integer> line_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean prb_read_valid(Ptr<PrintkDefinitions.printk_ringbuffer> rb, @Unsigned long seq, Ptr<PrintkDefinitions.printk_record> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean prb_read_valid_info(Ptr<PrintkDefinitions.printk_ringbuffer> rb, @Unsigned long seq, Ptr<PrintkDefinitions.printk_info> info2, Ptr<@Unsigned Integer> line_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int prb_record_text_space(Ptr<prb_reserved_entry> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean prb_reserve(Ptr<prb_reserved_entry> e, Ptr<PrintkDefinitions.printk_ringbuffer> rb, Ptr<PrintkDefinitions.printk_record> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean prb_reserve_in_last(Ptr<prb_reserved_entry> e, Ptr<PrintkDefinitions.printk_ringbuffer> rb, Ptr<PrintkDefinitions.printk_record> r, @Unsigned int caller_id, @Unsigned int max_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct prb_data_block")
    @NotUsableInJava
    public static class prb_data_block
    extends Struct {
        public @Unsigned long id;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct prb_reserved_entry")
    @NotUsableInJava
    public static class prb_reserved_entry
    extends Struct {
        public Ptr<PrintkDefinitions.printk_ringbuffer> rb;
        public @Unsigned long irqflags;
        public @Unsigned long id;
        public @Unsigned int text_space;
    }

    @Type(noCCodeGeneration=true, cType="struct prb_desc_ring")
    @NotUsableInJava
    public static class prb_desc_ring
    extends Struct {
        public @Unsigned int count_bits;
        public Ptr<prb_desc> descs;
        public Ptr<PrintkDefinitions.printk_info> infos;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t head_id;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t tail_id;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t last_finalized_seq;
    }

    @Type(noCCodeGeneration=true, cType="struct prb_data_ring")
    @NotUsableInJava
    public static class prb_data_ring
    extends Struct {
        public @Unsigned int size_bits;
        public String data;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t head_lpos;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t tail_lpos;
    }

    @Type(noCCodeGeneration=true, cType="struct prb_desc")
    @NotUsableInJava
    public static class prb_desc
    extends Struct {
        public @OriginalName(value="atomic_long_t") misc.atomic64_t state_var;
        public prb_data_blk_lpos text_blk_lpos;
    }

    @Type(noCCodeGeneration=true, cType="struct prb_data_blk_lpos")
    @NotUsableInJava
    public static class prb_data_blk_lpos
    extends Struct {
        public @Unsigned long begin;
        public @Unsigned long next;
    }
}

