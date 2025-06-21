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
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MrDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Ip6mrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _ip6mr_fill_mroute(Ptr<MrDefinitions.mr_table> mrt, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, @Unsigned int seq, Ptr<MrDefinitions.mr_mfc> c, int cmd, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.mfc6_cache> ip6mr_cache_find_any(Ptr<MrDefinitions.mr_table> mrt, Ptr<In6Definitions.in6_addr> mcastgrp, @Unsigned @OriginalName(value="mifi_t") short mifi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6mr_cache_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6mr_cache_report((const struct mr_table*)$arg1, $arg2, $arg3, $arg4)")
    public static int ip6mr_cache_report(Ptr<MrDefinitions.mr_table> mrt, Ptr<SkDefinitions.sk_buff> pkt, @Unsigned @OriginalName(value="mifi_t") short mifi, int _assert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_cache_unresolved(Ptr<MrDefinitions.mr_table> mrt, @Unsigned @OriginalName(value="mifi_t") short mifi, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_compat_ioctl(Ptr<runtime.sock> sk, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6mr_destroy_unres(Ptr<MrDefinitions.mr_table> mrt, Ptr<misc.mfc6_cache> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_device_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_fib_lookup(Ptr<runtime.net> net2, Ptr<runtime.flowi6> flp6, Ptr<Ptr<MrDefinitions.mr_table>> mrt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_fill_mroute(Ptr<MrDefinitions.mr_table> mrt, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, @Unsigned int seq, Ptr<misc.mfc6_cache> c, int cmd, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_forward2(Ptr<runtime.net> net2, Ptr<MrDefinitions.mr_table> mrt, Ptr<SkDefinitions.sk_buff> skb, int vifi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_forward2_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_get_route(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.rtmsg> rtm, @Unsigned int portid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6mr_hash_cmp($arg1, (const void*)$arg2)")
    public static int ip6mr_hash_cmp(Ptr<RhashtableDefinitions.rhashtable_compare_arg> arg2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_ioctl(Ptr<runtime.sock> sk, int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_mfc_add(Ptr<runtime.net> net2, Ptr<MrDefinitions.mr_table> mrt, Ptr<mf6cctl> mfc, int mrtsock, int parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MrDefinitions.mr_table> ip6mr_mr_table_iter(Ptr<runtime.net> net2, Ptr<MrDefinitions.mr_table> mrt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6mr_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6mr_net_exit_batch(Ptr<ListDefinitions.list_head> net_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6mr_new_table_set(Ptr<MrDefinitions.mr_table> mrt, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_rtm_dumproute(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_rtm_getroute(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_rule_action(Ptr<FibDefinitions.fib_rule> rule, Ptr<runtime.flowi> flp, int flags, Ptr<FibDefinitions.fib_lookup_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_rule_compare(Ptr<FibDefinitions.fib_rule> rule, Ptr<FibDefinitions.fib_rule_hdr> frh, Ptr<Ptr<runtime.nlattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_rule_configure(Ptr<FibDefinitions.fib_rule> rule, Ptr<SkDefinitions.sk_buff> skb, Ptr<FibDefinitions.fib_rule_hdr> frh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6mr_rule_default((const struct fib_rule*)$arg1)")
    public static boolean ip6mr_rule_default(Ptr<FibDefinitions.fib_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_rule_fill(Ptr<FibDefinitions.fib_rule> rule, Ptr<SkDefinitions.sk_buff> skb, Ptr<FibDefinitions.fib_rule_hdr> frh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_rule_match(Ptr<FibDefinitions.fib_rule> rule, Ptr<runtime.flowi> flp, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_rules_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6mr_rules_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ip6mr_seq_read(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_sk_done(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_sk_ioctl(Ptr<runtime.sock> sk, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6mr_update_thresholds(Ptr<MrDefinitions.mr_table> mrt, Ptr<MrDefinitions.mr_mfc> cache, String ttls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6mr_vif_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ip6mr_vif_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6mr_vif_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mf6cctl")
    @NotUsableInJava
    public static class mf6cctl
    extends Struct {
        public misc.sockaddr_in6 mf6cc_origin;
        public misc.sockaddr_in6 mf6cc_mcastgrp;
        public @Unsigned @OriginalName(value="mifi_t") short mf6cc_parent;
        public misc.if_set mf6cc_ifset;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6mr_result")
    @NotUsableInJava
    public static class ip6mr_result
    extends Struct {
        public Ptr<MrDefinitions.mr_table> mrt;
    }
}

