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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="mr_dump($arg1, $arg2, $arg3, (int (*)(struct net*, struct notifier_block*, struct netlink_ext_ack*))$arg4, (struct mr_table* (*)(struct net*, struct mr_table*))$arg5, $arg6)")
    public static int mr_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, @Unsigned short family, Ptr<?> rules_dump, Ptr<?> mr_iter, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mr_fill_mroute(Ptr<mr_table> mrt, Ptr<SkDefinitions.sk_buff> skb, Ptr<mr_mfc> c, Ptr<runtime.rtmsg> rtm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mr_mfc_find_any(Ptr<mr_table> mrt, int vifi, Ptr<?> hasharg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mr_mfc_find_any_parent(Ptr<mr_table> mrt, int vifi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mr_mfc_find_parent(Ptr<mr_table> mrt, Ptr<?> hasharg, int parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mr_mfc_seq_idx(Ptr<runtime.net> net2, Ptr<mr_mfc_iter> it, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mr_mfc_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mr_rtm_dumproute($arg1, $arg2, (struct mr_table* (*)(struct net*, struct mr_table*))$arg3, (int (*)(struct mr_table*, struct sk_buff*, unsigned int, unsigned int, struct mr_mfc*, int, int))$arg4, $arg5, $arg6)")
    public static int mr_rtm_dumproute(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<?> iter2, Ptr<?> fill, Ptr<@OriginalName(value="spinlock_t") runtime.spinlock> lock, Ptr<FibDefinitions.fib_dump_filter> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mr_table_alloc($arg1, $arg2, $arg3, (void (*)(struct timer_list*))$arg4, (void (*)(struct mr_table*, struct net*))$arg5)")
    public static Ptr<mr_table> mr_table_alloc(Ptr<runtime.net> net2, @Unsigned int id, Ptr<mr_table_ops> ops, Ptr<?> expire_func, Ptr<?> table_set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mr_table_dump($arg1, $arg2, $arg3, (int (*)(struct mr_table*, struct sk_buff*, unsigned int, unsigned int, struct mr_mfc*, int, int))$arg4, $arg5, $arg6)")
    public static int mr_table_dump(Ptr<mr_table> mrt, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<?> fill, Ptr<@OriginalName(value="spinlock_t") runtime.spinlock> lock, Ptr<FibDefinitions.fib_dump_filter> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mr_vif_seq_idx(Ptr<runtime.net> net2, Ptr<mr_vif_iter> iter2, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mr_vif_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mr_mfc_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mr_mfc_iter")
    @NotUsableInJava
    public static class mr_mfc_iter
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public Ptr<mr_table> mrt;
        public Ptr<ListDefinitions.list_head> cache;
        public Ptr<@OriginalName(value="spinlock_t") runtime.spinlock> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct mr_vif_iter")
    @NotUsableInJava
    public static class mr_vif_iter
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public Ptr<mr_table> mrt;
        public int ct;
    }

    @Type(noCCodeGeneration=true, cType="struct mr_table")
    @NotUsableInJava
    public static class mr_table
    extends Struct {
        public ListDefinitions.list_head list;
        public misc.possible_net_t net;
        public mr_table_ops ops;
        public @Unsigned int id;
        public Ptr<runtime.sock> mroute_sk;
        public TimerDefinitions.timer_list ipmr_expire_timer;
        public ListDefinitions.list_head mfc_unres_queue;
        public misc.vif_device @Size(value=32) [] vif_table;
        public runtime.rhltable mfc_hash;
        public ListDefinitions.list_head mfc_cache_list;
        public int maxvif;
        public AtomicDefinitions.atomic_t cache_resolve_queue_len;
        public boolean mroute_do_assert;
        public boolean mroute_do_pim;
        public boolean mroute_do_wrvifwhole;
        public int mroute_reg_vif_num;
    }

    @Type(noCCodeGeneration=true, cType="struct mr_table_ops")
    @NotUsableInJava
    public static class mr_table_ops
    extends Struct {
        public Ptr<RhashtableDefinitions.rhashtable_params> rht_params;
        public Ptr<?> cmparg_any;
    }

    @Type(noCCodeGeneration=true, cType="struct mr_mfc")
    @NotUsableInJava
    public static class mr_mfc
    extends Struct {
        public misc.rhlist_head mnode;
        public @Unsigned short mfc_parent;
        public int mfc_flags;
        public misc.mfc_un_of_mr_mfc mfc_un;
        public ListDefinitions.list_head list;
        public misc.callback_head rcu;
        public Ptr<?> free;
    }
}

