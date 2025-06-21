/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.QdiscDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FifoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Qdisc> fifo_create_dflt(Ptr<runtime.Qdisc> sch, Ptr<QdiscDefinitions.Qdisc_ops> ops, @Unsigned int limit, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fifo_destroy(Ptr<runtime.Qdisc> sch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fifo_dump(Ptr<runtime.Qdisc> sch, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fifo_hd_dump(Ptr<runtime.Qdisc> sch, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fifo_hd_init(Ptr<runtime.Qdisc> sch, Ptr<runtime.nlattr> opt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fifo_init(Ptr<runtime.Qdisc> sch, Ptr<runtime.nlattr> opt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fifo_set_limit(Ptr<runtime.Qdisc> q, @Unsigned int limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fifo_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { union { struct __kfifo kfifo; u8 *type; const u8*; u8 (*rectype)[0]; u8 *ptr; const u8*; }; u8 buf[16]; }")
    @NotUsableInJava
    public static class fifo_of_kgdb_nmi_tty_priv
    extends Struct {
        @InlineUnion(value=64539)
        public  @InlineUnion(value=64539) runtime.__kfifo kfifo;
        @InlineUnion(value=64539)
        public @InlineUnion(value=64539) String type;
        @InlineUnion(value=64539)
        public @InlineUnion(value=64539) String const_type;
        @InlineUnion(value=64539)
        public @InlineUnion(value=64539) Ptr<char @Size(value=0) []> rectype;
        @InlineUnion(value=64539)
        public @InlineUnion(value=64539) String ptr;
        @InlineUnion(value=64539)
        public @InlineUnion(value=64539) String ptr_const;
        public char @Size(value=16) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct { s8 enable; }")
    @NotUsableInJava
    public static class fifo_int_enable_of_anon_member_of_ec_params_motion_sense
    extends Struct {
        public @OriginalName(value="int8_t") byte enable;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int max_data_vector; }")
    @NotUsableInJava
    public static class fifo_read_of_anon_member_of_ec_params_motion_sense
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int max_data_vector;
    }

    @Type(noCCodeGeneration=true, cType="struct { union { struct __kfifo kfifo; struct memory_failure_entry *type; const struct memory_failure_entry*; u8 (*rectype)[0]; struct memory_failure_entry *ptr; const struct memory_failure_entry*; }; struct memory_failure_entry buf[16]; }")
    @NotUsableInJava
    public static class fifo_of_memory_failure_cpu
    extends Struct {
        @InlineUnion(value=29807)
        public  @InlineUnion(value=29807) runtime.__kfifo kfifo;
        @InlineUnion(value=29807)
        public @InlineUnion(value=29807) Ptr<MemoryDefinitions.memory_failure_entry> type;
        @InlineUnion(value=29807)
        public @InlineUnion(value=29807) Ptr<MemoryDefinitions.memory_failure_entry> const_type;
        @InlineUnion(value=29807)
        public @InlineUnion(value=29807) Ptr<char @Size(value=0) []> rectype;
        @InlineUnion(value=29807)
        public @InlineUnion(value=29807) Ptr<MemoryDefinitions.memory_failure_entry> ptr;
        @InlineUnion(value=29807)
        public @InlineUnion(value=29807) Ptr<MemoryDefinitions.memory_failure_entry> ptr_const;
        public MemoryDefinitions.memory_failure_entry @Size(value=16) [] buf;
    }
}

