/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class StatDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stat_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stat_put(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short attrtype, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> stat_seq_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> p, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stat_seq_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> stat_seq_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stat_seq_stop(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct stat_session")
    @NotUsableInJava
    public static class stat_session
    extends Struct {
        public ListDefinitions.list_head session_list;
        public Ptr<misc.tracer_stat> ts;
        public RbDefinitions.rb_root stat_root;
        public runtime.mutex stat_mutex;
        public Ptr<runtime.dentry> file;
    }

    @Type(noCCodeGeneration=true, cType="struct stat_node")
    @NotUsableInJava
    public static class stat_node
    extends Struct {
        public RbDefinitions.rb_node node;
        public Ptr<?> stat;
    }

    @Type(noCCodeGeneration=true, cType="enum stat_item")
    public static enum stat_item implements Enum<stat_item>,
    TypedEnum<stat_item, Integer>
    {
        ALLOC_FASTPATH,
        ALLOC_SLOWPATH,
        FREE_FASTPATH,
        FREE_SLOWPATH,
        FREE_FROZEN,
        FREE_ADD_PARTIAL,
        FREE_REMOVE_PARTIAL,
        ALLOC_FROM_PARTIAL,
        ALLOC_SLAB,
        ALLOC_REFILL,
        ALLOC_NODE_MISMATCH,
        FREE_SLAB,
        CPUSLAB_FLUSH,
        DEACTIVATE_FULL,
        DEACTIVATE_EMPTY,
        DEACTIVATE_TO_HEAD,
        DEACTIVATE_TO_TAIL,
        DEACTIVATE_REMOTE_FREES,
        DEACTIVATE_BYPASS,
        ORDER_FALLBACK,
        CMPXCHG_DOUBLE_CPU_FAIL,
        CMPXCHG_DOUBLE_FAIL,
        CPU_PARTIAL_ALLOC,
        CPU_PARTIAL_FREE,
        CPU_PARTIAL_NODE,
        CPU_PARTIAL_DRAIN,
        NR_SLUB_STAT_ITEMS;

    }

    @Type(noCCodeGeneration=true, cType="enum stat_group")
    public static enum stat_group implements Enum<stat_group>,
    TypedEnum<stat_group, Integer>
    {
        STAT_READ,
        STAT_WRITE,
        STAT_DISCARD,
        STAT_FLUSH,
        NR_STAT_GROUPS;

    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int bind_count; long unsigned int connect_count; long unsigned int connect_start; long unsigned int connect_time; long unsigned int sends; long unsigned int recvs; long unsigned int bad_xids; long unsigned int max_slots; long long unsigned int req_u; long long unsigned int bklog_u; long long unsigned int sending_u; long long unsigned int pending_u; }")
    @NotUsableInJava
    public static class stat_of_rpc_xprt
    extends Struct {
        public @Unsigned long bind_count;
        public @Unsigned long connect_count;
        public @Unsigned long connect_start;
        public @Unsigned long connect_time;
        public @Unsigned long sends;
        public @Unsigned long recvs;
        public @Unsigned long bad_xids;
        public @Unsigned long max_slots;
        public @Unsigned long req_u;
        public @Unsigned long bklog_u;
        public @Unsigned long sending_u;
        public @Unsigned long pending_u;
    }
}

