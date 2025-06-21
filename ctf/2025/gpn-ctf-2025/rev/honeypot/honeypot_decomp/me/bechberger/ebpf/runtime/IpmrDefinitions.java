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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MrDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IpmrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_do_expire_process(Ptr<MrDefinitions.mr_table> mrt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_expire_process(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_mfc_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ipmr_mfc_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _ipmr_fill_mroute(Ptr<MrDefinitions.mr_table> mrt, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, @Unsigned int seq, Ptr<MrDefinitions.mr_mfc> c, int cmd, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_cache_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipmr_cache_report((const struct mr_table*)$arg1, $arg2, $arg3, $arg4)")
    public static int ipmr_cache_report(Ptr<MrDefinitions.mr_table> mrt, Ptr<SkDefinitions.sk_buff> pkt, @Unsigned @OriginalName(value="vifi_t") short vifi, int _assert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_cache_resolve(Ptr<runtime.net> net2, Ptr<MrDefinitions.mr_table> mrt, Ptr<misc.mfc_cache> uc, Ptr<misc.mfc_cache> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_cache_unresolved(Ptr<MrDefinitions.mr_table> mrt, @Unsigned @OriginalName(value="vifi_t") short vifi, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_compat_ioctl(Ptr<runtime.sock> sk, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_destroy_unres(Ptr<MrDefinitions.mr_table> mrt, Ptr<misc.mfc_cache> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_device_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_fib_lookup(Ptr<runtime.net> net2, Ptr<runtime.flowi4> flp4, Ptr<Ptr<MrDefinitions.mr_table>> mrt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_fill_mroute(Ptr<MrDefinitions.mr_table> mrt, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, @Unsigned int seq, Ptr<misc.mfc_cache> c, int cmd, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ipmr_fill_table(Ptr<MrDefinitions.mr_table> mrt, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ipmr_fill_vif(Ptr<MrDefinitions.mr_table> mrt, @Unsigned int vifid, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_forward_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_get_route(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be32") int daddr, Ptr<runtime.rtmsg> rtm, @Unsigned int portid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipmr_hash_cmp($arg1, (const void*)$arg2)")
    public static int ipmr_hash_cmp(Ptr<RhashtableDefinitions.rhashtable_compare_arg> arg2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipmr_init_vif_indev((const struct net_device*)$arg1)")
    public static boolean ipmr_init_vif_indev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_ioctl(Ptr<runtime.sock> sk, int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_mfc_add(Ptr<runtime.net> net2, Ptr<MrDefinitions.mr_table> mrt, Ptr<runtime.mfcctl> mfc, int mrtsock, int parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_mfc_delete(Ptr<MrDefinitions.mr_table> mrt, Ptr<runtime.mfcctl> mfc, int parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MrDefinitions.mr_table> ipmr_mr_table_iter(Ptr<runtime.net> net2, Ptr<MrDefinitions.mr_table> mrt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_net_exit_batch(Ptr<ListDefinitions.list_head> net_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MrDefinitions.mr_table> ipmr_new_table(Ptr<runtime.net> net2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_new_table_set(Ptr<MrDefinitions.mr_table> mrt, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> ipmr_new_tunnel(Ptr<runtime.net> net2, Ptr<runtime.vifctl> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_queue_xmit(Ptr<runtime.net> net2, Ptr<MrDefinitions.mr_table> mrt, int in_vifi, Ptr<SkDefinitions.sk_buff> skb, int vifi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MrDefinitions.mr_table> ipmr_rt_fib_lookup(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rtm_dumplink(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rtm_dumproute(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rtm_getroute(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rtm_route(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipmr_rtm_valid_getroute_req($arg1, (const struct nlmsghdr*)$arg2, $arg3, $arg4)")
    public static int ipmr_rtm_valid_getroute_req(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rule_action(Ptr<FibDefinitions.fib_rule> rule, Ptr<runtime.flowi> flp, int flags, Ptr<FibDefinitions.fib_lookup_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rule_compare(Ptr<FibDefinitions.fib_rule> rule, Ptr<FibDefinitions.fib_rule_hdr> frh, Ptr<Ptr<runtime.nlattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rule_configure(Ptr<FibDefinitions.fib_rule> rule, Ptr<SkDefinitions.sk_buff> skb, Ptr<FibDefinitions.fib_rule_hdr> frh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipmr_rule_default((const struct fib_rule*)$arg1)")
    public static boolean ipmr_rule_default(Ptr<FibDefinitions.fib_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rule_fill(Ptr<FibDefinitions.fib_rule> rule, Ptr<SkDefinitions.sk_buff> skb, Ptr<FibDefinitions.fib_rule_hdr> frh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rule_match(Ptr<FibDefinitions.fib_rule> rule, Ptr<runtime.flowi> fl, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_rules_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_rules_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ipmr_seq_read(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_sk_ioctl(Ptr<runtime.sock> sk, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_update_thresholds(Ptr<MrDefinitions.mr_table> mrt, Ptr<MrDefinitions.mr_mfc> cache, String ttls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipmr_vif_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ipmr_vif_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipmr_vif_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ipmr_result")
    @NotUsableInJava
    public static class ipmr_result
    extends Struct {
        public Ptr<MrDefinitions.mr_table> mrt;
    }
}

