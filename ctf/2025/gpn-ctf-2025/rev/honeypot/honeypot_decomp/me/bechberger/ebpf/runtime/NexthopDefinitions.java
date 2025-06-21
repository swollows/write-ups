/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NhDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NexthopDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FibDefinitions.fib_nh_common> nexthop_fib_nhc(Ptr<runtime.nexthop> nh, int nhsel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nexthop_num_path((const struct nexthop*)$arg1)")
    public static @Unsigned int nexthop_num_path(Ptr<runtime.nexthop> nh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __nexthop_replace_notify(Ptr<runtime.net> net2, Ptr<runtime.nexthop> nh, Ptr<misc.nl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nexthop> nexthop_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nexthop_bucket_set_hw_flags(Ptr<runtime.net> net2, @Unsigned int id, @Unsigned short bucket_index, boolean offload, boolean trap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nexthop> nexthop_create(Ptr<runtime.net> net2, Ptr<NhDefinitions.nh_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nexthop> nexthop_create_group(Ptr<runtime.net> net2, Ptr<NhDefinitions.nh_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nexthop> nexthop_find_by_id(Ptr<runtime.net> net2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nexthop> nexthop_find_group_resilient(Ptr<runtime.net> net2, @Unsigned int id, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nexthop_flush_dev(Ptr<NetDefinitions.net_device> dev, @Unsigned long event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nexthop_for_each_fib6_nh($arg1, (int (*)(struct fib6_nh*, void*))$arg2, $arg3)")
    public static int nexthop_for_each_fib6_nh(Ptr<runtime.nexthop> nh, Ptr<?> cb, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nexthop_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nexthop_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nexthop_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nexthop_net_exit_batch_rtnl(Ptr<ListDefinitions.list_head> net_list, Ptr<ListDefinitions.list_head> dev_to_kill) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nexthop_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nexthop_notify(int event2, Ptr<runtime.nexthop> nh, Ptr<misc.nl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nexthop_res_grp_activity_update(Ptr<runtime.net> net2, @Unsigned int id, @Unsigned short num_buckets, Ptr<@Unsigned Long> activity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nexthop> nexthop_select_path(Ptr<runtime.nexthop> nh, int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nexthop> nexthop_select_path_hthr(Ptr<NhDefinitions.nh_group> nhg, int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nexthop_set_hw_flags(Ptr<runtime.net> net2, @Unsigned int id, boolean offload, boolean trap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum nexthop_event_type")
    public static enum nexthop_event_type implements Enum<nexthop_event_type>,
    TypedEnum<nexthop_event_type, Integer>
    {
        NEXTHOP_EVENT_DEL,
        NEXTHOP_EVENT_REPLACE,
        NEXTHOP_EVENT_RES_TABLE_PRE_REPLACE,
        NEXTHOP_EVENT_BUCKET_REPLACE,
        NEXTHOP_EVENT_HW_STATS_REPORT_DELTA;

    }

    @Type(noCCodeGeneration=true, cType="struct nexthop_grp")
    @NotUsableInJava
    public static class nexthop_grp
    extends Struct {
        public @Unsigned int id;
        public char weight;
        public char weight_high;
        public @Unsigned short resvd2;
    }
}

