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
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SfpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sfp_add_phy(Ptr<sfp_bus> bus, Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_bus_add_upstream($arg1, $arg2, (const struct sfp_upstream_ops*)$arg3)")
    public static int sfp_bus_add_upstream(Ptr<sfp_bus> bus, Ptr<?> upstream, Ptr<sfp_upstream_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_bus_del_upstream(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_bus_find_fwnode((const struct fwnode_handle*)$arg1)")
    public static Ptr<sfp_bus> sfp_bus_find_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_bus_get((const struct fwnode_handle*)$arg1)")
    public static Ptr<sfp_bus> sfp_bus_get(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_bus_put(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sfp_get_module_eeprom(Ptr<sfp_bus> bus, Ptr<EthtoolDefinitions.ethtool_eeprom> ee, Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_get_module_eeprom_by_page($arg1, (const struct ethtool_module_eeprom*)$arg2, $arg3)")
    public static int sfp_get_module_eeprom_by_page(Ptr<sfp_bus> bus, Ptr<EthtoolDefinitions.ethtool_module_eeprom> page2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sfp_get_module_info(Ptr<sfp_bus> bus, Ptr<EthtoolDefinitions.ethtool_modinfo> modinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)sfp_get_name($arg1))")
    public static String sfp_get_name(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_link_down(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_link_up(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_may_have_phy($arg1, (const struct sfp_eeprom_id*)$arg2)")
    public static boolean sfp_may_have_phy(Ptr<sfp_bus> bus, Ptr<sfp_eeprom_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_module_insert($arg1, (const struct sfp_eeprom_id*)$arg2, (const struct sfp_quirk*)$arg3)")
    public static int sfp_module_insert(Ptr<sfp_bus> bus, Ptr<sfp_eeprom_id> id, Ptr<sfp_quirk> quirk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_module_remove(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sfp_module_start(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_module_stop(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_parse_port($arg1, (const struct sfp_eeprom_id*)$arg2, $arg3)")
    public static int sfp_parse_port(Ptr<sfp_bus> bus, Ptr<sfp_eeprom_id> id, Ptr<@Unsigned Long> support) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_parse_support($arg1, (const struct sfp_eeprom_id*)$arg2, $arg3, $arg4)")
    public static void sfp_parse_support(Ptr<sfp_bus> bus, Ptr<sfp_eeprom_id> id, Ptr<@Unsigned Long> support, Ptr<@Unsigned Long> interfaces) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sfp_register_bus(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_register_socket($arg1, $arg2, (const struct sfp_socket_ops*)$arg3)")
    public static Ptr<sfp_bus> sfp_register_socket(Ptr<runtime.device> dev, @OriginalName(value="sfp") Ptr<?> sfp, Ptr<sfp_socket_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_remove_phy(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sfp_select_interface($arg1, (const long unsigned int*)$arg2)")
    public static  @OriginalName(value="phy_interface_t") misc.interface_of_phy_device_and_interface_of_phylink_link_state sfp_select_interface(Ptr<sfp_bus> bus, Ptr<@Unsigned Long> link_modes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_unregister_bus(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_unregister_socket(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_upstream_set_signal_rate(Ptr<sfp_bus> bus, @Unsigned int rate_kbd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_upstream_start(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sfp_upstream_stop(Ptr<sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sfp_socket_ops")
    @NotUsableInJava
    public static class sfp_socket_ops
    extends Struct {
        public Ptr<?> attach;
        public Ptr<?> detach;
        public Ptr<?> start;
        public Ptr<?> stop;
        public Ptr<?> set_signal_rate;
        public Ptr<?> module_info;
        public Ptr<?> module_eeprom;
        public Ptr<?> module_eeprom_by_page;
    }

    @Type(noCCodeGeneration=true, cType="struct sfp_quirk")
    @NotUsableInJava
    public static class sfp_quirk
    extends Struct {
        public String vendor;
        public String part;
        public Ptr<?> modes;
        public Ptr<?> fixup;
    }

    @Type(noCCodeGeneration=true, cType="struct sfp_bus")
    @NotUsableInJava
    public static class sfp_bus
    extends Struct {
        public runtime.kref kref;
        public ListDefinitions.list_head node;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public Ptr<sfp_socket_ops> socket_ops;
        public Ptr<runtime.device> sfp_dev;
        public @OriginalName(value="sfp") Ptr<?> sfp;
        public Ptr<sfp_quirk> sfp_quirk;
        public Ptr<sfp_upstream_ops> upstream_ops;
        public Ptr<?> upstream;
        public Ptr<PhyDefinitions.phy_device> phydev;
        public boolean registered;
        public boolean started;
    }

    @Type(noCCodeGeneration=true, cType="struct sfp_upstream_ops")
    @NotUsableInJava
    public static class sfp_upstream_ops
    extends Struct {
        public Ptr<?> attach;
        public Ptr<?> detach;
        public Ptr<?> module_insert;
        public Ptr<?> module_remove;
        public Ptr<?> module_start;
        public Ptr<?> module_stop;
        public Ptr<?> link_down;
        public Ptr<?> link_up;
        public Ptr<?> connect_phy;
        public Ptr<?> disconnect_phy;
    }

    @Type(noCCodeGeneration=true, cType="struct sfp_eeprom_id")
    @NotUsableInJava
    public static class sfp_eeprom_id
    extends Struct {
        public sfp_eeprom_base base;
        public sfp_eeprom_ext ext;
    }

    @Type(noCCodeGeneration=true, cType="struct sfp_eeprom_ext")
    @NotUsableInJava
    public static class sfp_eeprom_ext
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short options;
        public char br_max;
        public char br_min;
        public char @Size(value=16) [] vendor_sn;
        public char @Size(value=8) [] datecode;
        public char diagmon;
        public char enhopts;
        public char sff8472_compliance;
        public char cc_ext;
    }

    @Type(noCCodeGeneration=true, cType="struct sfp_eeprom_base")
    @NotUsableInJava
    public static class sfp_eeprom_base
    extends Struct {
        public char phys_id;
        public char phys_ext_id;
        public char connector;
        public char if_1x_copper_passive;
        public char if_1x_copper_active;
        public char if_1x_lx;
        public char if_1x_sx;
        public char e10g_base_sr;
        public char e10g_base_lr;
        public char e10g_base_lrm;
        public char e10g_base_er;
        public char sonet_oc3_short_reach;
        public char sonet_oc3_smf_intermediate_reach;
        public char sonet_oc3_smf_long_reach;
        public char unallocated_5_3;
        public char sonet_oc12_short_reach;
        public char sonet_oc12_smf_intermediate_reach;
        public char sonet_oc12_smf_long_reach;
        public char unallocated_5_7;
        public char sonet_oc48_short_reach;
        public char sonet_oc48_intermediate_reach;
        public char sonet_oc48_long_reach;
        public char sonet_reach_bit2;
        public char sonet_reach_bit1;
        public char sonet_oc192_short_reach;
        public char escon_smf_1310_laser;
        public char escon_mmf_1310_led;
        public char e1000_base_sx;
        public char e1000_base_lx;
        public char e1000_base_cx;
        public char e1000_base_t;
        public char e100_base_lx;
        public char e100_base_fx;
        public char e_base_bx10;
        public char e_base_px;
        public char fc_tech_electrical_inter_enclosure;
        public char fc_tech_lc;
        public char fc_tech_sa;
        public char fc_ll_m;
        public char fc_ll_l;
        public char fc_ll_i;
        public char fc_ll_s;
        public char fc_ll_v;
        public char unallocated_8_0;
        public char unallocated_8_1;
        public char sfp_ct_passive;
        public char sfp_ct_active;
        public char fc_tech_ll;
        public char fc_tech_sl;
        public char fc_tech_sn;
        public char fc_tech_electrical_intra_enclosure;
        public char fc_media_sm;
        public char unallocated_9_1;
        public char fc_media_m5;
        public char fc_media_m6;
        public char fc_media_tv;
        public char fc_media_mi;
        public char fc_media_tp;
        public char fc_media_tw;
        public char fc_speed_100;
        public char unallocated_10_1;
        public char fc_speed_200;
        public char fc_speed_3200;
        public char fc_speed_400;
        public char fc_speed_1600;
        public char fc_speed_800;
        public char fc_speed_1200;
        public char encoding;
        public char br_nominal;
        public char rate_id;
        public char @Size(value=6) [] link_len;
        public char @Size(value=16) [] vendor_name;
        public char extended_cc;
        public char @Size(value=3) [] vendor_oui;
        public char @Size(value=16) [] vendor_pn;
        public char @Size(value=4) [] vendor_rev;
        @InlineUnion(value=20919)
        public @InlineUnion(value=20919) @Unsigned @OriginalName(value="__be16") short optical_wavelength;
        @InlineUnion(value=20919)
        public @InlineUnion(value=20919) @Unsigned @OriginalName(value="__be16") short cable_compliance;
        @InlineUnion(value=20919)
        public  @InlineUnion(value=20919) misc.passive_of_anon_member_of_sfp_eeprom_base passive;
        @InlineUnion(value=20919)
        public  @InlineUnion(value=20919) ActiveDefinitions.active_of_anon_member_of_sfp_eeprom_base active;
        public char reserved62;
        public char cc_base;
    }
}

