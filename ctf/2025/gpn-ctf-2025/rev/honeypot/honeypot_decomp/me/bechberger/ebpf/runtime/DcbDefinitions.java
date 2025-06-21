/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DcbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="dcb_app_add($arg1, (const struct dcb_app*)$arg2, $arg3)")
    public static int dcb_app_add(Ptr<ListDefinitions.list_head> list, Ptr<dcb_app> app, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dcb_app_lookup((const struct dcb_app*)$arg1, $arg2, $arg3)")
    public static Ptr<dcb_app_type> dcb_app_lookup(Ptr<dcb_app> app, int ifindex, int prio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcb_delrewr(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_app> del) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcb_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char dcb_getapp(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_app> app) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short dcb_getrewr(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_app> app) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dcb_getrewr_prio_dscp_mask_map((const struct net_device*)$arg1, $arg2)")
    public static void dcb_getrewr_prio_dscp_mask_map(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_ieee_app_prio_map> p_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dcb_getrewr_prio_pcp_mask_map((const struct net_device*)$arg1, $arg2)")
    public static void dcb_getrewr_prio_pcp_mask_map(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_rewr_prio_pcp_map> p_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcb_ieee_delapp(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_app> del) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dcb_ieee_getapp_default_prio_mask((const struct net_device*)$arg1)")
    public static char dcb_ieee_getapp_default_prio_mask(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dcb_ieee_getapp_dscp_prio_mask_map((const struct net_device*)$arg1, $arg2)")
    public static void dcb_ieee_getapp_dscp_prio_mask_map(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_ieee_app_dscp_map> p_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char dcb_ieee_getapp_mask(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_app> app) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dcb_ieee_getapp_prio_dscp_mask_map((const struct net_device*)$arg1, $arg2)")
    public static void dcb_ieee_getapp_prio_dscp_mask_map(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_ieee_app_prio_map> p_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcb_ieee_setapp(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_app> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcb_setapp(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_app> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcb_setrewr(Ptr<NetDefinitions.net_device> dev, Ptr<dcb_app> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dcb_ieee_app_dscp_map")
    @NotUsableInJava
    public static class dcb_ieee_app_dscp_map
    extends Struct {
        public char @Size(value=64) [] map;
    }

    @Type(noCCodeGeneration=true, cType="struct dcb_ieee_app_prio_map")
    @NotUsableInJava
    public static class dcb_ieee_app_prio_map
    extends Struct {
        public @Unsigned long @Size(value=8) [] map;
    }

    @Type(noCCodeGeneration=true, cType="struct dcb_rewr_prio_pcp_map")
    @NotUsableInJava
    public static class dcb_rewr_prio_pcp_map
    extends Struct {
        public @Unsigned short @Size(value=8) [] map;
    }

    @Type(noCCodeGeneration=true, cType="struct dcb_app_type")
    @NotUsableInJava
    public static class dcb_app_type
    extends Struct {
        public int ifindex;
        public dcb_app app;
        public ListDefinitions.list_head list;
        public char dcbx;
    }

    @Type(noCCodeGeneration=true, cType="enum dcb_general_attr_values")
    public static enum dcb_general_attr_values implements Enum<dcb_general_attr_values>,
    TypedEnum<dcb_general_attr_values, Integer>
    {
        DCB_ATTR_VALUE_UNDEFINED;

    }

    @Type(noCCodeGeneration=true, cType="struct dcb_peer_app_info")
    @NotUsableInJava
    public static class dcb_peer_app_info
    extends Struct {
        public char willing;
        public char error;
    }

    @Type(noCCodeGeneration=true, cType="struct dcb_app")
    @NotUsableInJava
    public static class dcb_app
    extends Struct {
        public char selector;
        public char priority;
        public @Unsigned short protocol;
    }
}

