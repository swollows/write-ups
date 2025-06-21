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
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DcbnlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="dcbnl_app_table_setdel($arg1, $arg2, (int (*)(struct net_device*, struct dcb_app*))$arg3)")
    public static int dcbnl_app_table_setdel(Ptr<runtime.nlattr> attr2, Ptr<NetDefinitions.net_device> netdev, Ptr<?> setdel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_bcn_getcfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_bcn_setcfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_build_peer_app(Ptr<NetDefinitions.net_device> netdev, Ptr<SkDefinitions.sk_buff> skb, int app_nested_type, int app_info_type, int app_entry_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_cee_fill(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_cee_get(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_cee_notify(Ptr<NetDefinitions.net_device> dev, int event2, int cmd, @Unsigned int seq, @Unsigned int portid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_cee_pg_fill(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, int dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getapp(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getapptrust(Ptr<NetDefinitions.net_device> netdev, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getcap(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getdcbx(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getfeatcfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getnumtcs(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getperm_hwaddr(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getpfccfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getpfcstate(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_getstate(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_ieee_del(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_ieee_fill(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_ieee_get(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_ieee_notify(Ptr<NetDefinitions.net_device> dev, int event2, int cmd, @Unsigned int seq, @Unsigned int portid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_ieee_set(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_netdevice_event(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> dcbnl_newmsg(int type2, char cmd, @Unsigned int port2, @Unsigned int seq, @Unsigned int flags, Ptr<Ptr<runtime.nlmsghdr>> nlhp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_notify(Ptr<NetDefinitions.net_device> dev, int event2, int cmd, @Unsigned int seq, @Unsigned int portid, int dcbx_ver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_pgrx_getcfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_pgrx_setcfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_pgtx_getcfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_pgtx_setcfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_setall(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_setapp(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_setdcbx(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_setfeatcfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_setnumtcs(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_setpfccfg(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_setpfcstate(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dcbnl_setstate(Ptr<NetDefinitions.net_device> netdev, Ptr<runtime.nlmsghdr> nlh, @Unsigned int seq, Ptr<Ptr<runtime.nlattr>> tb, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_featcfg_attrs")
    public static enum dcbnl_featcfg_attrs implements Enum<dcbnl_featcfg_attrs>,
    TypedEnum<dcbnl_featcfg_attrs, Integer>
    {
        DCB_FEATCFG_ATTR_UNDEFINED,
        DCB_FEATCFG_ATTR_ALL,
        DCB_FEATCFG_ATTR_PG,
        DCB_FEATCFG_ATTR_PFC,
        DCB_FEATCFG_ATTR_APP,
        __DCB_FEATCFG_ATTR_ENUM_MAX,
        DCB_FEATCFG_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_app_attrs")
    public static enum dcbnl_app_attrs implements Enum<dcbnl_app_attrs>,
    TypedEnum<dcbnl_app_attrs, Integer>
    {
        DCB_APP_ATTR_UNDEFINED,
        DCB_APP_ATTR_IDTYPE,
        DCB_APP_ATTR_ID,
        DCB_APP_ATTR_PRIORITY,
        __DCB_APP_ATTR_ENUM_MAX,
        DCB_APP_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_bcn_attrs")
    public static enum dcbnl_bcn_attrs implements Enum<dcbnl_bcn_attrs>,
    TypedEnum<dcbnl_bcn_attrs, Integer>
    {
        DCB_BCN_ATTR_UNDEFINED,
        DCB_BCN_ATTR_RP_0,
        DCB_BCN_ATTR_RP_1,
        DCB_BCN_ATTR_RP_2,
        DCB_BCN_ATTR_RP_3,
        DCB_BCN_ATTR_RP_4,
        DCB_BCN_ATTR_RP_5,
        DCB_BCN_ATTR_RP_6,
        DCB_BCN_ATTR_RP_7,
        DCB_BCN_ATTR_RP_ALL,
        DCB_BCN_ATTR_BCNA_0,
        DCB_BCN_ATTR_BCNA_1,
        DCB_BCN_ATTR_ALPHA,
        DCB_BCN_ATTR_BETA,
        DCB_BCN_ATTR_GD,
        DCB_BCN_ATTR_GI,
        DCB_BCN_ATTR_TMAX,
        DCB_BCN_ATTR_TD,
        DCB_BCN_ATTR_RMIN,
        DCB_BCN_ATTR_W,
        DCB_BCN_ATTR_RD,
        DCB_BCN_ATTR_RU,
        DCB_BCN_ATTR_WRTT,
        DCB_BCN_ATTR_RI,
        DCB_BCN_ATTR_C,
        DCB_BCN_ATTR_ALL,
        __DCB_BCN_ATTR_ENUM_MAX,
        DCB_BCN_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_numtcs_attrs")
    public static enum dcbnl_numtcs_attrs implements Enum<dcbnl_numtcs_attrs>,
    TypedEnum<dcbnl_numtcs_attrs, Integer>
    {
        DCB_NUMTCS_ATTR_UNDEFINED,
        DCB_NUMTCS_ATTR_ALL,
        DCB_NUMTCS_ATTR_PG,
        DCB_NUMTCS_ATTR_PFC,
        __DCB_NUMTCS_ATTR_ENUM_MAX,
        DCB_NUMTCS_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_cap_attrs")
    public static enum dcbnl_cap_attrs implements Enum<dcbnl_cap_attrs>,
    TypedEnum<dcbnl_cap_attrs, Integer>
    {
        DCB_CAP_ATTR_UNDEFINED,
        DCB_CAP_ATTR_ALL,
        DCB_CAP_ATTR_PG,
        DCB_CAP_ATTR_PFC,
        DCB_CAP_ATTR_UP2TC,
        DCB_CAP_ATTR_PG_TCS,
        DCB_CAP_ATTR_PFC_TCS,
        DCB_CAP_ATTR_GSP,
        DCB_CAP_ATTR_BCN,
        DCB_CAP_ATTR_DCBX,
        __DCB_CAP_ATTR_ENUM_MAX,
        DCB_CAP_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_tc_attrs")
    public static enum dcbnl_tc_attrs implements Enum<dcbnl_tc_attrs>,
    TypedEnum<dcbnl_tc_attrs, Integer>
    {
        DCB_TC_ATTR_PARAM_UNDEFINED,
        DCB_TC_ATTR_PARAM_PGID,
        DCB_TC_ATTR_PARAM_UP_MAPPING,
        DCB_TC_ATTR_PARAM_STRICT_PRIO,
        DCB_TC_ATTR_PARAM_BW_PCT,
        DCB_TC_ATTR_PARAM_ALL,
        __DCB_TC_ATTR_PARAM_ENUM_MAX,
        DCB_TC_ATTR_PARAM_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_pg_attrs")
    public static enum dcbnl_pg_attrs implements Enum<dcbnl_pg_attrs>,
    TypedEnum<dcbnl_pg_attrs, Integer>
    {
        DCB_PG_ATTR_UNDEFINED,
        DCB_PG_ATTR_TC_0,
        DCB_PG_ATTR_TC_1,
        DCB_PG_ATTR_TC_2,
        DCB_PG_ATTR_TC_3,
        DCB_PG_ATTR_TC_4,
        DCB_PG_ATTR_TC_5,
        DCB_PG_ATTR_TC_6,
        DCB_PG_ATTR_TC_7,
        DCB_PG_ATTR_TC_MAX,
        DCB_PG_ATTR_TC_ALL,
        DCB_PG_ATTR_BW_ID_0,
        DCB_PG_ATTR_BW_ID_1,
        DCB_PG_ATTR_BW_ID_2,
        DCB_PG_ATTR_BW_ID_3,
        DCB_PG_ATTR_BW_ID_4,
        DCB_PG_ATTR_BW_ID_5,
        DCB_PG_ATTR_BW_ID_6,
        DCB_PG_ATTR_BW_ID_7,
        DCB_PG_ATTR_BW_ID_MAX,
        DCB_PG_ATTR_BW_ID_ALL,
        __DCB_PG_ATTR_ENUM_MAX,
        DCB_PG_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_pfc_up_attrs")
    public static enum dcbnl_pfc_up_attrs implements Enum<dcbnl_pfc_up_attrs>,
    TypedEnum<dcbnl_pfc_up_attrs, Integer>
    {
        DCB_PFC_UP_ATTR_UNDEFINED,
        DCB_PFC_UP_ATTR_0,
        DCB_PFC_UP_ATTR_1,
        DCB_PFC_UP_ATTR_2,
        DCB_PFC_UP_ATTR_3,
        DCB_PFC_UP_ATTR_4,
        DCB_PFC_UP_ATTR_5,
        DCB_PFC_UP_ATTR_6,
        DCB_PFC_UP_ATTR_7,
        DCB_PFC_UP_ATTR_ALL,
        __DCB_PFC_UP_ATTR_ENUM_MAX,
        DCB_PFC_UP_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_attrs")
    public static enum dcbnl_attrs implements Enum<dcbnl_attrs>,
    TypedEnum<dcbnl_attrs, Integer>
    {
        DCB_ATTR_UNDEFINED,
        DCB_ATTR_IFNAME,
        DCB_ATTR_STATE,
        DCB_ATTR_PFC_STATE,
        DCB_ATTR_PFC_CFG,
        DCB_ATTR_NUM_TC,
        DCB_ATTR_PG_CFG,
        DCB_ATTR_SET_ALL,
        DCB_ATTR_PERM_HWADDR,
        DCB_ATTR_CAP,
        DCB_ATTR_NUMTCS,
        DCB_ATTR_BCN,
        DCB_ATTR_APP,
        DCB_ATTR_IEEE,
        DCB_ATTR_DCBX,
        DCB_ATTR_FEATCFG,
        DCB_ATTR_CEE,
        __DCB_ATTR_ENUM_MAX,
        DCB_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dcbnl_commands")
    public static enum dcbnl_commands implements Enum<dcbnl_commands>,
    TypedEnum<dcbnl_commands, Integer>
    {
        DCB_CMD_UNDEFINED,
        DCB_CMD_GSTATE,
        DCB_CMD_SSTATE,
        DCB_CMD_PGTX_GCFG,
        DCB_CMD_PGTX_SCFG,
        DCB_CMD_PGRX_GCFG,
        DCB_CMD_PGRX_SCFG,
        DCB_CMD_PFC_GCFG,
        DCB_CMD_PFC_SCFG,
        DCB_CMD_SET_ALL,
        DCB_CMD_GPERM_HWADDR,
        DCB_CMD_GCAP,
        DCB_CMD_GNUMTCS,
        DCB_CMD_SNUMTCS,
        DCB_CMD_PFC_GSTATE,
        DCB_CMD_PFC_SSTATE,
        DCB_CMD_BCN_GCFG,
        DCB_CMD_BCN_SCFG,
        DCB_CMD_GAPP,
        DCB_CMD_SAPP,
        DCB_CMD_IEEE_SET,
        DCB_CMD_IEEE_GET,
        DCB_CMD_GDCBX,
        DCB_CMD_SDCBX,
        DCB_CMD_GFEATCFG,
        DCB_CMD_SFEATCFG,
        DCB_CMD_CEE_GET,
        DCB_CMD_IEEE_DEL,
        __DCB_CMD_ENUM_MAX,
        DCB_CMD_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct dcbnl_rtnl_ops")
    @NotUsableInJava
    public static class dcbnl_rtnl_ops
    extends Struct {
        public Ptr<?> ieee_getets;
        public Ptr<?> ieee_setets;
        public Ptr<?> ieee_getmaxrate;
        public Ptr<?> ieee_setmaxrate;
        public Ptr<?> ieee_getqcn;
        public Ptr<?> ieee_setqcn;
        public Ptr<?> ieee_getqcnstats;
        public Ptr<?> ieee_getpfc;
        public Ptr<?> ieee_setpfc;
        public Ptr<?> ieee_getapp;
        public Ptr<?> ieee_setapp;
        public Ptr<?> ieee_delapp;
        public Ptr<?> ieee_peer_getets;
        public Ptr<?> ieee_peer_getpfc;
        public Ptr<?> getstate;
        public Ptr<?> setstate;
        public Ptr<?> getpermhwaddr;
        public Ptr<?> setpgtccfgtx;
        public Ptr<?> setpgbwgcfgtx;
        public Ptr<?> setpgtccfgrx;
        public Ptr<?> setpgbwgcfgrx;
        public Ptr<?> getpgtccfgtx;
        public Ptr<?> getpgbwgcfgtx;
        public Ptr<?> getpgtccfgrx;
        public Ptr<?> getpgbwgcfgrx;
        public Ptr<?> setpfccfg;
        public Ptr<?> getpfccfg;
        public Ptr<?> setall;
        public Ptr<?> getcap;
        public Ptr<?> getnumtcs;
        public Ptr<?> setnumtcs;
        public Ptr<?> getpfcstate;
        public Ptr<?> setpfcstate;
        public Ptr<?> getbcncfg;
        public Ptr<?> setbcncfg;
        public Ptr<?> getbcnrp;
        public Ptr<?> setbcnrp;
        public Ptr<?> setapp;
        public Ptr<?> getapp;
        public Ptr<?> getfeatcfg;
        public Ptr<?> setfeatcfg;
        public Ptr<?> getdcbx;
        public Ptr<?> setdcbx;
        public Ptr<?> peer_getappinfo;
        public Ptr<?> peer_getapptable;
        public Ptr<?> cee_peer_getpg;
        public Ptr<?> cee_peer_getpfc;
        public Ptr<?> dcbnl_getbuffer;
        public Ptr<?> dcbnl_setbuffer;
        public Ptr<?> dcbnl_setapptrust;
        public Ptr<?> dcbnl_getapptrust;
        public Ptr<?> dcbnl_setrewr;
        public Ptr<?> dcbnl_delrewr;
    }

    @Type(noCCodeGeneration=true, cType="struct dcbnl_buffer")
    @NotUsableInJava
    public static class dcbnl_buffer
    extends Struct {
        public char @Size(value=8) [] prio2buffer;
        public @Unsigned int @Size(value=8) [] buffer_size;
        public @Unsigned int total_size;
    }
}

