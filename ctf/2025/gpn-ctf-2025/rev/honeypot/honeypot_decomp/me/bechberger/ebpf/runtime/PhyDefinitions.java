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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EthnlDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LedDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MacsecDefinitions;
import me.bechberger.ebpf.runtime.MdioDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PseDefinitions;
import me.bechberger.ebpf.runtime.SfpDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class PhyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_modify(Ptr<phy_device> phydev, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_modify_mmd(Ptr<phy_device> phydev, int devad, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_modify_mmd_changed(Ptr<phy_device> phydev, int devad, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_package_read_mmd(Ptr<phy_device> phydev, @Unsigned int addr_offset, int devad, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_package_write_mmd(Ptr<phy_device> phydev, @Unsigned int addr_offset, int devad, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_read_mmd(Ptr<phy_device> phydev, int devad, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_write_mmd(Ptr<phy_device> phydev, int devad, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_write_page(Ptr<phy_device> phydev, int page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_check_downshift(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)phy_duplex_to_str($arg1))")
    public static String phy_duplex_to_str(@Unsigned int duplex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_interface_num_ports( @OriginalName(value="phy_interface_t") misc.interface_of_phy_device_and_interface_of_phylink_link_state _interface) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct phy_setting*)phy_lookup_setting($arg1, $arg2, (const long unsigned int*)$arg3, $arg4))")
    public static Ptr<phy_setting> phy_lookup_setting(int speed, int duplex, Ptr<@Unsigned Long> mask, boolean exact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_modify(Ptr<phy_device> phydev, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_modify_changed(Ptr<phy_device> phydev, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_modify_mmd(Ptr<phy_device> phydev, int devad, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_modify_mmd_changed(Ptr<phy_device> phydev, int devad, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_modify_paged(Ptr<phy_device> phydev, int page2, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_modify_paged_changed(Ptr<phy_device> phydev, int page2, @Unsigned int regnum, @Unsigned short mask, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_module_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_package_read_mmd(Ptr<phy_device> phydev, @Unsigned int addr_offset, int devad, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_package_write_mmd(Ptr<phy_device> phydev, @Unsigned int addr_offset, int devad, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)phy_rate_matching_to_str($arg1))")
    public static String phy_rate_matching_to_str(int rate_matching) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_read_mmd(Ptr<phy_device> phydev, int devad, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_read_paged(Ptr<phy_device> phydev, int page2, @Unsigned int regnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_resolve_aneg_linkmode(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_resolve_aneg_pause(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_restore_page(Ptr<phy_device> phydev, int oldpage, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_save_page(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_select_page(Ptr<phy_device> phydev, int page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_set_max_speed(Ptr<phy_device> phydev, @Unsigned int max_speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_speed_down_core(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)phy_speed_to_str($arg1))")
    public static String phy_speed_to_str(int speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long phy_speeds(Ptr<@Unsigned Integer> speeds, @Unsigned long size, Ptr<@Unsigned Long> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_write_mmd(Ptr<phy_device> phydev, int devad, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_write_paged(Ptr<phy_device> phydev, int page2, @Unsigned int regnum, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_hwtstamp_get(Ptr<phy_device> phydev, Ptr<KernelDefinitions.kernel_hwtstamp_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_hwtstamp_set(Ptr<phy_device> phydev, Ptr<KernelDefinitions.kernel_hwtstamp_config> config, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _phy_start_aneg(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static phy_state_work _phy_state_machine(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_aneg_done(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_calibrate(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_check_link_status(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean phy_check_valid(int speed, int duplex, Ptr<@Unsigned Long> features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_config_aneg(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_configure(Ptr<runtime.phy> phy2, Ptr<phy_configure_opts> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_core_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_core_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_create($arg1, $arg2, (const struct phy_ops*)$arg3)")
    public static Ptr<runtime.phy> phy_create(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> node2, Ptr<phy_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_create_lookup($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int phy_create_lookup(Ptr<runtime.phy> phy2, String con_id, String dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_destroy(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_disable_interrupts(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_do_ioctl(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.ifreq> ifr, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_do_ioctl_running(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.ifreq> ifr, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_error(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_get_eee(Ptr<phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_keee> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_get_link_ksettings(Ptr<NetDefinitions.net_device> ndev, Ptr<EthtoolDefinitions.ethtool_link_ksettings> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_get_plca_cfg(Ptr<phy_device> phydev, Ptr<phy_plca_cfg> plca_cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_get_plca_status(Ptr<phy_device> phydev, Ptr<phy_plca_status> plca_st) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_get_sset_count(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_get_stats(Ptr<phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_stats> stats, Ptr<@Unsigned Long> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_get_strings(Ptr<phy_device> phydev, Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_ethtool_get_wol(Ptr<phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_wolinfo> wol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_ethtool_ksettings_get(Ptr<phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_link_ksettings> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_ethtool_ksettings_set($arg1, (const struct ethtool_link_ksettings*)$arg2)")
    public static int phy_ethtool_ksettings_set(Ptr<phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_link_ksettings> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_nway_reset(Ptr<NetDefinitions.net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_set_eee(Ptr<phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_keee> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_ethtool_set_link_ksettings($arg1, (const struct ethtool_link_ksettings*)$arg2)")
    public static int phy_ethtool_set_link_ksettings(Ptr<NetDefinitions.net_device> ndev, Ptr<EthtoolDefinitions.ethtool_link_ksettings> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_ethtool_set_plca_cfg($arg1, (const struct phy_plca_cfg*)$arg2, $arg3)")
    public static int phy_ethtool_set_plca_cfg(Ptr<phy_device> phydev, Ptr<phy_plca_cfg> plca_cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_ethtool_set_wol(Ptr<phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_wolinfo> wol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_free_interrupt(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_get($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.phy> phy_get(Ptr<runtime.device> dev, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_get_eee_err(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_get_rate_matching(Ptr<phy_device> phydev,  @OriginalName(value="phy_interface_t") misc.interface_of_phy_device_and_interface_of_phylink_link_state iface) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_init_eee(Ptr<phy_device> phydev, boolean clk_stop_enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn phy_interrupt(int irq, Ptr<?> phy_dat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_mac_interrupt(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_mii_ioctl(Ptr<phy_device> phydev, Ptr<runtime.ifreq> ifr, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_notify_connect(Ptr<runtime.phy> phy2, int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_notify_disconnect(Ptr<runtime.phy> phy2, int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_pm_runtime_allow(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_pm_runtime_forbid(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_pm_runtime_get(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_pm_runtime_get_sync(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_pm_runtime_put(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_pm_runtime_put_sync(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_power_off(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_power_on(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_print_status(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_process_state_change(Ptr<phy_device> phydev, phy_state old_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_put(Ptr<runtime.device> dev, Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_queue_state_machine(Ptr<phy_device> phydev, @Unsigned long jiffies) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_remove_lookup($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void phy_remove_lookup(Ptr<runtime.phy> phy2, String con_id, String dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_request_interrupt(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_reset(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_restart_aneg(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_set_media(Ptr<runtime.phy> phy2, phy_media media) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_set_mode_ext(Ptr<runtime.phy> phy2, phy_mode mode, int submode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_set_speed(Ptr<runtime.phy> phy2, int speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_speed_down(Ptr<phy_device> phydev, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_speed_up(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_start(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_start_aneg(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_start_cable_test(Ptr<phy_device> phydev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_start_cable_test_tdr($arg1, $arg2, (const struct phy_tdr_config*)$arg3)")
    public static int phy_start_cable_test_tdr(Ptr<phy_device> phydev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<phy_tdr_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_start_machine(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_state_machine(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_stop(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_stop_machine(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int phy_supported_speeds(Ptr<phy_device> phy2, Ptr<@Unsigned Integer> speeds, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_trigger_machine(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_validate(Ptr<runtime.phy> phy2, phy_mode mode, int submode, Ptr<phy_configure_opts> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_led_trigger_change_speed(Ptr<phy_device> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_led_trigger_no_link(Ptr<phy_device> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_led_triggers_register(Ptr<phy_device> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_led_triggers_unregister(Ptr<phy_device> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_link_topo_add_phy(Ptr<NetDefinitions.net_device> dev, Ptr<phy_device> phy2, phy_upstream upt, Ptr<?> upstream) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_link_topo_del_phy(Ptr<NetDefinitions.net_device> dev, Ptr<phy_device> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __phy_resume(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_advertise_eee_all(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_advertise_supported(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_attach($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<phy_device> phy_attach(Ptr<NetDefinitions.net_device> dev, String bus_id,  @OriginalName(value="phy_interface_t") misc.interface_of_phy_device_and_interface_of_phylink_link_state _interface) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_attach_direct(Ptr<NetDefinitions.net_device> dev, Ptr<phy_device> phydev, @Unsigned int flags,  @OriginalName(value="phy_interface_t") misc.interface_of_phy_device_and_interface_of_phylink_link_state _interface) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_attached_info(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String phy_attached_info_irq(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_attached_print($arg1, (const u8*)$arg2, $arg3_)")
    public static void phy_attached_print(Ptr<phy_device> phydev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int phy_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_c45_probe_present(Ptr<misc.mii_bus> bus, int prtad, int devad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_connect($arg1, (const u8*)$arg2, (void (*)(struct net_device*))$arg3, $arg4)")
    public static Ptr<phy_device> phy_connect(Ptr<NetDefinitions.net_device> dev, String bus_id, Ptr<?> handler,  @OriginalName(value="phy_interface_t") misc.interface_of_phy_device_and_interface_of_phylink_link_state _interface) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_connect_direct($arg1, $arg2, (void (*)(struct net_device*))$arg3, $arg4)")
    public static int phy_connect_direct(Ptr<NetDefinitions.net_device> dev, Ptr<phy_device> phydev, Ptr<?> handler,  @OriginalName(value="phy_interface_t") misc.interface_of_phy_device_and_interface_of_phylink_link_state _interface) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_copy_pause_bits(Ptr<@Unsigned Long> dst, Ptr<@Unsigned Long> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_detach(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phy_dev_flags_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<phy_device> phy_device_create(Ptr<misc.mii_bus> bus, int addr2, @Unsigned int phy_id, boolean is_c45, Ptr<phy_c45_device_ids> c45_ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_device_free(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_device_register(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_device_remove(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_disconnect(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean phy_driver_is_genphy(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean phy_driver_is_genphy_10g(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_driver_register(Ptr<phy_driver> new_driver, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_driver_unregister(Ptr<phy_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_drivers_register(Ptr<phy_driver> new_driver, int n, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_drivers_unregister(Ptr<phy_driver> drv, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<phy_device> phy_find_first(Ptr<misc.mii_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_get_c45_ids(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_get_internal_delay($arg1, $arg2, (const int*)$arg3, $arg4, $arg5)")
    public static int phy_get_internal_delay(Ptr<phy_device> phydev, Ptr<runtime.device> dev, Ptr<Integer> delay_values, int size, boolean is_rx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_get_pause(Ptr<phy_device> phydev, Ptr<@OriginalName(value="bool") Boolean> tx_pause, Ptr<@OriginalName(value="bool") Boolean> rx_pause) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phy_has_fixups_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phy_id_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_init_hw(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phy_interface_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_link_change(Ptr<phy_device> phydev, boolean up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_loopback(Ptr<phy_device> phydev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_mdio_device_free(Ptr<MdioDefinitions.mdio_device> mdiodev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_mdio_device_remove(Ptr<MdioDefinitions.mdio_device> mdiodev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_mipi_dphy_config_validate(Ptr<phy_configure_opts_mipi_dphy> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_mipi_dphy_get_default_config(@Unsigned long pixel_clock, @Unsigned int bpp, @Unsigned int lanes, Ptr<phy_configure_opts_mipi_dphy> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_mipi_dphy_get_default_config_for_hsclk(@Unsigned long hs_clk_rate, @Unsigned int lanes, Ptr<phy_configure_opts_mipi_dphy> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_package_join(Ptr<phy_device> phydev, int base_addr, @Unsigned long priv_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_package_leave(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_register_fixup((const u8*)$arg1, $arg2, $arg3, (int (*)(struct phy_device*))$arg4)")
    public static int phy_register_fixup(String bus_id, @Unsigned int phy_uid, @Unsigned int phy_uid_mask, Ptr<?> run) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_register_fixup_for_id((const u8*)$arg1, (int (*)(struct phy_device*))$arg2)")
    public static int phy_register_fixup_for_id(String bus_id, Ptr<?> run) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_register_fixup_for_uid($arg1, $arg2, (int (*)(struct phy_device*))$arg3)")
    public static int phy_register_fixup_for_uid(@Unsigned int phy_uid, @Unsigned int phy_uid_mask, Ptr<?> run) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_remove_link_mode(Ptr<phy_device> phydev, @Unsigned int link_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_request_driver_module(Ptr<phy_device> dev, @Unsigned int phy_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_reset_after_clk_enable(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_resume(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_scan_fixups(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_set_asym_pause(Ptr<phy_device> phydev, boolean rx, boolean tx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_set_sym_pause(Ptr<phy_device> phydev, boolean rx, boolean tx, boolean autoneg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_sfp_attach(Ptr<?> upstream, Ptr<SfpDefinitions.sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_sfp_connect_phy(Ptr<?> upstream, Ptr<phy_device> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_sfp_detach(Ptr<?> upstream, Ptr<SfpDefinitions.sfp_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_sfp_disconnect_phy(Ptr<?> upstream, Ptr<phy_device> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_sfp_probe($arg1, (const struct sfp_upstream_ops*)$arg2)")
    public static int phy_sfp_probe(Ptr<phy_device> phydev, Ptr<SfpDefinitions.sfp_upstream_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phy_standalone_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_support_asym_pause(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_support_eee(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void phy_support_sym_pause(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_suspend(Ptr<phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_unregister_fixup((const u8*)$arg1, $arg2, $arg3)")
    public static int phy_unregister_fixup(String bus_id, @Unsigned int phy_uid, @Unsigned int phy_uid_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="phy_unregister_fixup_for_id((const u8*)$arg1)")
    public static int phy_unregister_fixup_for_id(String bus_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phy_unregister_fixup_for_uid(@Unsigned int phy_uid, @Unsigned int phy_uid_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean phy_validate_pause(Ptr<phy_device> phydev, Ptr<EthtoolDefinitions.ethtool_pauseparam> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum phy_state_work")
    public static enum phy_state_work implements Enum<phy_state_work>,
    TypedEnum<phy_state_work, Integer>
    {
        PHY_STATE_WORK_NONE,
        PHY_STATE_WORK_ANEG,
        PHY_STATE_WORK_SUSPEND;

    }

    @Type(noCCodeGeneration=true, cType="struct phy_lookup")
    @NotUsableInJava
    public static class phy_lookup
    extends Struct {
        public ListDefinitions.list_head node;
        public String dev_id;
        public String con_id;
        public Ptr<runtime.phy> phy;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_provider")
    @NotUsableInJava
    public static class phy_provider
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<DeviceDefinitions.device_node> children;
        public Ptr<runtime.module> owner;
        public ListDefinitions.list_head list;
        public Ptr<?> of_xlate;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_req_info")
    @NotUsableInJava
    public static class phy_req_info
    extends Struct {
        public EthnlDefinitions.ethnl_req_info base;
        public Ptr<phy_device_node> pdn;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_device_node")
    @NotUsableInJava
    public static class phy_device_node
    extends Struct {
        public phy_upstream upstream_type;
        public AnonDefinitions.anon_member_of_macsec_context_and_upstream_of_phy_device_node upstream;
        public Ptr<SfpDefinitions.sfp_bus> parent_sfp_bus;
        public Ptr<phy_device> phy;
    }

    @Type(noCCodeGeneration=true, cType="enum phy_tunable_id")
    public static enum phy_tunable_id implements Enum<phy_tunable_id>,
    TypedEnum<phy_tunable_id, Integer>
    {
        ETHTOOL_PHY_ID_UNSPEC,
        ETHTOOL_PHY_DOWNSHIFT,
        ETHTOOL_PHY_FAST_LINK_DOWN,
        ETHTOOL_PHY_EDPD,
        __ETHTOOL_PHY_TUNABLE_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="struct phy_devm")
    @NotUsableInJava
    public static class phy_devm
    extends Struct {
        public Ptr<UsbDefinitions.usb_phy> phy;
        public Ptr<misc.notifier_block> nb;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_attrs")
    @NotUsableInJava
    public static class phy_attrs
    extends Struct {
        public @Unsigned int bus_width;
        public @Unsigned int max_link_rate;
        public phy_mode mode;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_ops")
    @NotUsableInJava
    public static class phy_ops
    extends Struct {
        public Ptr<?> init;
        public Ptr<?> exit;
        public Ptr<?> power_on;
        public Ptr<?> power_off;
        public Ptr<?> set_mode;
        public Ptr<?> set_media;
        public Ptr<?> set_speed;
        public Ptr<?> configure;
        public Ptr<?> validate;
        public Ptr<?> reset;
        public Ptr<?> calibrate;
        public Ptr<?> connect;
        public Ptr<?> disconnect;
        public Ptr<?> release;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="union phy_configure_opts")
    @NotUsableInJava
    public static class phy_configure_opts
    extends Union {
        public phy_configure_opts_mipi_dphy mipi_dphy;
        public phy_configure_opts_dp dp;
        public phy_configure_opts_lvds lvds;
    }

    @Type(noCCodeGeneration=true, cType="enum phy_media")
    public static enum phy_media implements Enum<phy_media>,
    TypedEnum<phy_media, Integer>
    {
        PHY_MEDIA_DEFAULT,
        PHY_MEDIA_SR,
        PHY_MEDIA_DAC;

    }

    @Type(noCCodeGeneration=true, cType="enum phy_mode")
    public static enum phy_mode implements Enum<phy_mode>,
    TypedEnum<phy_mode, Integer>
    {
        PHY_MODE_INVALID,
        PHY_MODE_USB_HOST,
        PHY_MODE_USB_HOST_LS,
        PHY_MODE_USB_HOST_FS,
        PHY_MODE_USB_HOST_HS,
        PHY_MODE_USB_HOST_SS,
        PHY_MODE_USB_DEVICE,
        PHY_MODE_USB_DEVICE_LS,
        PHY_MODE_USB_DEVICE_FS,
        PHY_MODE_USB_DEVICE_HS,
        PHY_MODE_USB_DEVICE_SS,
        PHY_MODE_USB_OTG,
        PHY_MODE_UFS_HS_A,
        PHY_MODE_UFS_HS_B,
        PHY_MODE_PCIE,
        PHY_MODE_ETHERNET,
        PHY_MODE_MIPI_DPHY,
        PHY_MODE_SATA,
        PHY_MODE_LVDS,
        PHY_MODE_DP;

    }

    @Type(noCCodeGeneration=true, cType="struct phy_configure_opts_lvds")
    @NotUsableInJava
    public static class phy_configure_opts_lvds
    extends Struct {
        public @Unsigned int bits_per_lane_and_dclk_cycle;
        public @Unsigned long differential_clk_rate;
        public @Unsigned int lanes;
        public boolean is_slave;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_configure_opts_dp")
    @NotUsableInJava
    public static class phy_configure_opts_dp
    extends Struct {
        public @Unsigned int link_rate;
        public @Unsigned int lanes;
        public @Unsigned int @Size(value=4) [] voltage;
        public @Unsigned int @Size(value=4) [] pre;
        public char ssc;
        public char set_rate;
        public char set_lanes;
        public char set_voltages;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_setting")
    @NotUsableInJava
    public static class phy_setting
    extends Struct {
        public @Unsigned int speed;
        public char duplex;
        public char bit;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_fixup")
    @NotUsableInJava
    public static class phy_fixup
    extends Struct {
        public ListDefinitions.list_head list;
        public char @Size(value=64) [] bus_id;
        public @Unsigned int phy_uid;
        public @Unsigned int phy_uid_mask;
        public Ptr<?> run;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_led_trigger")
    @NotUsableInJava
    public static class phy_led_trigger
    extends Struct {
        public LedDefinitions.led_trigger trigger;
        public char @Size(value=76) [] name;
        public @Unsigned int speed;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_driver")
    @NotUsableInJava
    public static class phy_driver
    extends Struct {
        public MdioDefinitions.mdio_driver_common mdiodrv;
        public @Unsigned int phy_id;
        public String name;
        public @Unsigned int phy_id_mask;
        public Ptr<@Unsigned Long> features;
        public @Unsigned int flags;
        public Ptr<?> driver_data;
        public Ptr<?> soft_reset;
        public Ptr<?> config_init;
        public Ptr<?> probe;
        public Ptr<?> get_features;
        public Ptr<?> get_rate_matching;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> config_aneg;
        public Ptr<?> aneg_done;
        public Ptr<?> read_status;
        public Ptr<?> config_intr;
        public Ptr<?> handle_interrupt;
        public Ptr<?> remove;
        public Ptr<?> match_phy_device;
        public Ptr<?> set_wol;
        public Ptr<?> get_wol;
        public Ptr<?> link_change_notify;
        public Ptr<?> read_mmd;
        public Ptr<?> write_mmd;
        public Ptr<?> read_page;
        public Ptr<?> write_page;
        public Ptr<?> module_info;
        public Ptr<?> module_eeprom;
        public Ptr<?> cable_test_start;
        public Ptr<?> cable_test_tdr_start;
        public Ptr<?> cable_test_get_status;
        public Ptr<?> get_sset_count;
        public Ptr<?> get_strings;
        public Ptr<?> get_stats;
        public Ptr<?> get_tunable;
        public Ptr<?> set_tunable;
        public Ptr<?> set_loopback;
        public Ptr<?> get_sqi;
        public Ptr<?> get_sqi_max;
        public Ptr<?> get_plca_cfg;
        public Ptr<?> set_plca_cfg;
        public Ptr<?> get_plca_status;
        public Ptr<?> led_brightness_set;
        public Ptr<?> led_blink_set;
        public Ptr<?> led_hw_is_supported;
        public Ptr<?> led_hw_control_set;
        public Ptr<?> led_hw_control_get;
        public Ptr<?> led_polarity_set;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_c45_device_ids")
    @NotUsableInJava
    public static class phy_c45_device_ids
    extends Struct {
        public @Unsigned int devices_in_package;
        public @Unsigned int mmds_present;
        public @Unsigned int @Size(value=32) [] device_ids;
    }

    @Type(noCCodeGeneration=true, cType="enum phy_state")
    public static enum phy_state implements Enum<phy_state>,
    TypedEnum<phy_state, Integer>
    {
        PHY_DOWN,
        PHY_READY,
        PHY_HALTED,
        PHY_ERROR,
        PHY_UP,
        PHY_RUNNING,
        PHY_NOLINK,
        PHY_CABLETEST;

    }

    @Type(noCCodeGeneration=true, cType="struct phy_tdr_config")
    @NotUsableInJava
    public static class phy_tdr_config
    extends Struct {
        public @Unsigned int first;
        public @Unsigned int last;
        public @Unsigned int step;
        public @OriginalName(value="s8") byte pair;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_plca_status")
    @NotUsableInJava
    public static class phy_plca_status
    extends Struct {
        public boolean pst;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_plca_cfg")
    @NotUsableInJava
    public static class phy_plca_cfg
    extends Struct {
        public int version;
        public int enabled;
        public int node_id;
        public int node_cnt;
        public int to_tmr;
        public int burst_cnt;
        public int burst_tmr;
    }

    @Type(noCCodeGeneration=true, cType="enum phy_upstream")
    public static enum phy_upstream implements Enum<phy_upstream>,
    TypedEnum<phy_upstream, Integer>
    {
        PHY_UPSTREAM_MAC,
        PHY_UPSTREAM_PHY;

    }

    @Type(noCCodeGeneration=true, cType="struct phy_device")
    @NotUsableInJava
    public static class phy_device
    extends Struct {
        public MdioDefinitions.mdio_device mdio;
        public Ptr<phy_driver> drv;
        public Ptr<DeviceDefinitions.device_link> devlink;
        public @Unsigned int phyindex;
        public @Unsigned int phy_id;
        public phy_c45_device_ids c45_ids;
        public @Unsigned int is_c45;
        public @Unsigned int is_internal;
        public @Unsigned int is_pseudo_fixed_link;
        public @Unsigned int is_gigabit_capable;
        public @Unsigned int has_fixups;
        public @Unsigned int suspended;
        public @Unsigned int suspended_by_mdio_bus;
        public @Unsigned int sysfs_links;
        public @Unsigned int loopback_enabled;
        public @Unsigned int downshifted_rate;
        public @Unsigned int is_on_sfp_module;
        public @Unsigned int mac_managed_pm;
        public @Unsigned int wol_enabled;
        public @Unsigned int autoneg;
        public @Unsigned int link;
        public @Unsigned int autoneg_complete;
        public @Unsigned int interrupts;
        public @Unsigned int irq_suspended;
        public @Unsigned int irq_rerun;
        public @Unsigned int default_timestamp;
        public int rate_matching;
        public phy_state state;
        public @Unsigned int dev_flags;
        public  @OriginalName(value="phy_interface_t") misc.interface_of_phy_device_and_interface_of_phylink_link_state _interface;
        public @Unsigned long @Size(value=1) [] possible_interfaces;
        public int speed;
        public int duplex;
        public int port;
        public int pause;
        public int asym_pause;
        public char master_slave_get;
        public char master_slave_set;
        public char master_slave_state;
        public @Unsigned long @Size(value=2) [] supported;
        public @Unsigned long @Size(value=2) [] advertising;
        public @Unsigned long @Size(value=2) [] lp_advertising;
        public @Unsigned long @Size(value=2) [] adv_old;
        public @Unsigned long @Size(value=2) [] supported_eee;
        public @Unsigned long @Size(value=2) [] advertising_eee;
        public boolean eee_enabled;
        public @Unsigned long @Size(value=1) [] host_interfaces;
        public @Unsigned int eee_broken_modes;
        public boolean enable_tx_lpi;
        public misc.eee_config eee_cfg;
        public Ptr<phy_led_trigger> phy_led_triggers;
        public @Unsigned int phy_num_led_triggers;
        public Ptr<phy_led_trigger> last_triggered;
        public Ptr<phy_led_trigger> led_link_trigger;
        public ListDefinitions.list_head leds;
        public int irq;
        public Ptr<?> priv;
        public Ptr<phy_package_shared> shared;
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<?> ehdr;
        public Ptr<runtime.nlattr> nest;
        public DelayedDefinitions.delayed_work state_queue;
        public runtime.mutex lock;
        public boolean sfp_bus_attached;
        public Ptr<SfpDefinitions.sfp_bus> sfp_bus;
        public @OriginalName(value="phylink") Ptr<?> phylink;
        public Ptr<NetDefinitions.net_device> attached_dev;
        public Ptr<misc.mii_timestamper> mii_ts;
        public Ptr<PseDefinitions.pse_control> psec;
        public char mdix;
        public char mdix_ctrl;
        public int pma_extable;
        public @Unsigned int link_down_events;
        public Ptr<?> phy_link_change;
        public Ptr<?> adjust_link;
        public Ptr<MacsecDefinitions.macsec_ops> macsec_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_link_topology")
    @NotUsableInJava
    public static class phy_link_topology
    extends Struct {
        public runtime.xarray phys;
        public @Unsigned int next_phy_index;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_package_shared")
    @NotUsableInJava
    public static class phy_package_shared
    extends Struct {
        public char base_addr;
        public Ptr<DeviceDefinitions.device_node> np;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned long flags;
        public @Unsigned long priv_size;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct phy_configure_opts_mipi_dphy")
    @NotUsableInJava
    public static class phy_configure_opts_mipi_dphy
    extends Struct {
        public @Unsigned int clk_miss;
        public @Unsigned int clk_post;
        public @Unsigned int clk_pre;
        public @Unsigned int clk_prepare;
        public @Unsigned int clk_settle;
        public @Unsigned int clk_term_en;
        public @Unsigned int clk_trail;
        public @Unsigned int clk_zero;
        public @Unsigned int d_term_en;
        public @Unsigned int eot;
        public @Unsigned int hs_exit;
        public @Unsigned int hs_prepare;
        public @Unsigned int hs_settle;
        public @Unsigned int hs_skip;
        public @Unsigned int hs_trail;
        public @Unsigned int hs_zero;
        public @Unsigned int init;
        public @Unsigned int lpx;
        public @Unsigned int ta_get;
        public @Unsigned int ta_go;
        public @Unsigned int ta_sure;
        public @Unsigned int wakeup;
        public @Unsigned long hs_clk_rate;
        public @Unsigned long lp_clk_rate;
        public char lanes;
    }
}

