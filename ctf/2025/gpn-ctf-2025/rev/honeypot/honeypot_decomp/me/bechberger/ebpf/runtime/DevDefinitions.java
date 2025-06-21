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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.DataDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DlDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.FreqDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GroDefinitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.OppDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PcpuDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.RpmDefinitions;
import me.bechberger.ebpf.runtime.RtnlDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WakeDefinitions;
import me.bechberger.ebpf.runtime.WakeupDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="_dev_pm_opp_cpumask_remove_table((const struct cpumask*)$arg1, $arg2)")
    public static void _dev_pm_opp_cpumask_remove_table(Ptr<runtime.cpumask> cpumask2, int last_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dev_add_physical_location(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_disable_change(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_eth_ioctl(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.ifreq> ifr, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_forward_change(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_get_hwtstamp_phylib(Ptr<NetDefinitions.net_device> dev, Ptr<KernelDefinitions.kernel_hwtstamp_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_ifconf(Ptr<runtime.net> net2, Ptr<ifconf> uifc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_ifsioc(Ptr<runtime.net> net2, Ptr<runtime.ifreq> ifr, Ptr<?> data, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_ioctl(Ptr<runtime.net> net2, @Unsigned int cmd, Ptr<runtime.ifreq> ifr, Ptr<?> data, Ptr<@OriginalName(value="bool") Boolean> need_copyout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_iommu_free(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_iommu> dev_iommu_get(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_iommu_priv_set(Ptr<runtime.device> dev, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_load($arg1, (const u8*)$arg2)")
    public static void dev_load(Ptr<runtime.net> net2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_memalloc_noio(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_domain_attach(Ptr<runtime.device> dev, boolean power_on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> dev_pm_domain_attach_by_id(Ptr<runtime.device> dev, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_pm_domain_attach_by_name($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.device> dev_pm_domain_attach_by_name(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_pm_domain_attach_list($arg1, (const struct dev_pm_domain_attach_data*)$arg2, $arg3)")
    public static int dev_pm_domain_attach_list(Ptr<runtime.device> dev, Ptr<dev_pm_domain_attach_data> data, Ptr<Ptr<dev_pm_domain_list>> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_domain_detach(Ptr<runtime.device> dev, boolean power_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_domain_detach_list(Ptr<dev_pm_domain_list> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_domain_set(Ptr<runtime.device> dev, Ptr<dev_pm_domain> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_domain_set_performance_state(Ptr<runtime.device> dev, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_domain_start(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_genpd_add_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dev_pm_genpd_get_hwmode(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long dev_pm_genpd_get_next_hrtimer(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_genpd_remove_notifier(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_genpd_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_genpd_set_hwmode(Ptr<runtime.device> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_genpd_set_next_wakeup(Ptr<runtime.device> dev, @OriginalName(value="ktime_t") long next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_genpd_set_performance_state(Ptr<runtime.device> dev, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_genpd_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_genpd_synced_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_get_subsys_data(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_pm_opp_cpumask_remove_table((const struct cpumask*)$arg1)")
    public static void dev_pm_opp_cpumask_remove_table(Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_opp_free_cpufreq_table(Ptr<runtime.device> dev, Ptr<Ptr<CpufreqDefinitions.cpufreq_frequency_table>> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_get_sharing_cpus(Ptr<runtime.device> cpu_dev2, Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_init_cpufreq_table(Ptr<runtime.device> dev, Ptr<Ptr<CpufreqDefinitions.cpufreq_frequency_table>> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_pm_opp_set_sharing_cpus($arg1, (const struct cpumask*)$arg2)")
    public static int dev_pm_opp_set_sharing_cpus(Ptr<runtime.device> cpu_dev2, Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_put_subsys_data(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_hwtstamp(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.ifreq> ifr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_hwtstamp_phylib(Ptr<NetDefinitions.net_device> dev, Ptr<KernelDefinitions.kernel_hwtstamp_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> dev_to_genpd_dev(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_update_dte(Ptr<IommuDefinitions.iommu_dev_data> dev_data, boolean set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dev_exception_clean(Ptr<dev_cgroup> dev_cgroup2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dev_flush(Ptr<ListDefinitions.list_head> flush_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_dtab_netdev> __dev_map_alloc_node(Ptr<runtime.net> net2, Ptr<BpfDefinitions.bpf_dtab> dtab, Ptr<BpfDefinitions.bpf_devmap_val> val, @Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dev_map_entry_free(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __dev_map_hash_update_elem(Ptr<runtime.net> net2, Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __dev_map_update_elem(Ptr<runtime.net> net2, Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_pm_set_dedicated_wake_irq(Ptr<runtime.device> dev, int irq, @Unsigned int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dev_sort_resources(Ptr<PciDefinitions.pci_dev> dev, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_add_offload(Ptr<PacketDefinitions.packet_offload> po) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_dax_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dev_dax_resize(Ptr<DaxDefinitions.dax_region> dax_region2, Ptr<dev_dax> dev_dax2, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_dax_shrink(Ptr<dev_dax> dev_dax2, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short dev_dax_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_dmabuf_uninstall(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_exception_add(Ptr<dev_cgroup> dev_cgroup2, Ptr<dev_exception_item> ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_exception_rm(Ptr<dev_cgroup> dev_cgroup2, Ptr<dev_exception_item> ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_exceptions_copy(Ptr<ListDefinitions.list_head> dest, Ptr<ListDefinitions.list_head> orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_get_regmap($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.regmap> dev_get_regmap(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_get_regmap_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_get_regmap_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static GroDefinitions.gro_result dev_gro_receive(Ptr<NapiDefinitions.napi_struct> napi, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dev_hash_map_redirect(Ptr<BpfDefinitions.bpf_map> map2, @Unsigned long ifindex, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dev_id_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_is_pnp((const struct device*)$arg1)")
    public static boolean dev_is_pnp(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_lstats_read(Ptr<NetDefinitions.net_device> dev, Ptr<@Unsigned Long> packets, Ptr<@Unsigned Long> bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> dev_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_alloc_check(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_bpf_prog_run(Ptr<BpfDefinitions.bpf_prog> xdp_prog, Ptr<Ptr<XdpDefinitions.xdp_frame>> frames, int n, Ptr<NetDefinitions.net_device> tx_dev, Ptr<NetDefinitions.net_device> rx_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dev_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_enqueue(Ptr<BpfDefinitions.bpf_dtab_netdev> dst, Ptr<XdpDefinitions.xdp_frame> xdpf, Ptr<NetDefinitions.net_device> dev_rx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_enqueue_multi(Ptr<XdpDefinitions.xdp_frame> xdpf, Ptr<NetDefinitions.net_device> dev_rx, Ptr<BpfDefinitions.bpf_map> map2, boolean exclude_ingress) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_generic_redirect(Ptr<BpfDefinitions.bpf_dtab_netdev> dst, Ptr<SkDefinitions.sk_buff> skb, Ptr<BpfDefinitions.bpf_prog> xdp_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dev_map_hash_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_hash_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dev_map_hash_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dev_map_hash_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dev_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long dev_map_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_notification(Ptr<misc.notifier_block> notifier, @Unsigned @OriginalName(value="ulong") long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dev_map_redirect(Ptr<BpfDefinitions.bpf_map> map2, @Unsigned long ifindex, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_map_redirect_multi(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<BpfDefinitions.bpf_prog> xdp_prog, Ptr<BpfDefinitions.bpf_map> map2, boolean exclude_ingress) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long dev_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pagemap_percpu_release(Ptr<PercpuDefinitions.percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_arm_wake_irq(Ptr<WakeDefinitions.wake_irq> wirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_attach_wake_irq(Ptr<runtime.device> dev, Ptr<WakeDefinitions.wake_irq> wirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_clear_wake_irq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_disable_wake_irq_check(Ptr<runtime.device> dev, boolean cond_disable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_disarm_wake_irq(Ptr<WakeDefinitions.wake_irq> wirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_enable_wake_irq_check(Ptr<runtime.device> dev, boolean can_change_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_enable_wake_irq_complete(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_add_dynamic(Ptr<runtime.device> dev, Ptr<dev_pm_opp_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_adjust_voltage(Ptr<runtime.device> dev, @Unsigned long freq, @Unsigned long u_volt, @Unsigned long u_volt_min, @Unsigned long u_volt_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_opp_clear_config(int token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_config_clks_simple(Ptr<runtime.device> dev, Ptr<OppDefinitions.opp_table> opp_table2, Ptr<dev_pm_opp> opp, Ptr<?> data, boolean scaling_down) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_disable(Ptr<runtime.device> dev, @Unsigned long freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_enable(Ptr<runtime.device> dev, @Unsigned long freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_bw_ceil(Ptr<runtime.device> dev, Ptr<@Unsigned Integer> bw, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_bw_floor(Ptr<runtime.device> dev, Ptr<@Unsigned Integer> bw, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_freq_ceil(Ptr<runtime.device> dev, Ptr<@Unsigned Long> freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_freq_ceil_indexed(Ptr<runtime.device> dev, Ptr<@Unsigned Long> freq, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_freq_exact(Ptr<runtime.device> dev, @Unsigned long freq, boolean available) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_freq_exact_indexed(Ptr<runtime.device> dev, @Unsigned long freq, @Unsigned int index2, boolean available) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_freq_floor(Ptr<runtime.device> dev, Ptr<@Unsigned Long> freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_freq_floor_indexed(Ptr<runtime.device> dev, Ptr<@Unsigned Long> freq, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_level_ceil(Ptr<runtime.device> dev, Ptr<@Unsigned Integer> level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_level_exact(Ptr<runtime.device> dev, @Unsigned int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_find_level_floor(Ptr<runtime.device> dev, Ptr<@Unsigned Integer> level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_opp_get(Ptr<dev_pm_opp> opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dev_pm_opp_get_freq_indexed(Ptr<dev_pm_opp> opp, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dev_pm_opp_get_level(Ptr<dev_pm_opp> opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dev_pm_opp_get_max_clock_latency(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dev_pm_opp_get_max_transition_latency(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dev_pm_opp_get_max_volt_latency(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_get_opp_count(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<OppDefinitions.opp_table> dev_pm_opp_get_opp_table(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dev_pm_opp_get_power(Ptr<dev_pm_opp> opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dev_pm_opp_get_required_pstate(Ptr<dev_pm_opp> opp, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_get_supplies(Ptr<dev_pm_opp> opp, Ptr<dev_pm_opp_supply> supplies) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dev_pm_opp_get_suspend_opp_freq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dev_pm_opp_get_voltage(Ptr<dev_pm_opp> opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dev_pm_opp_is_turbo(Ptr<dev_pm_opp> opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_opp_put(Ptr<dev_pm_opp> opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_opp_put_opp_table(Ptr<OppDefinitions.opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_register_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_opp_remove(Ptr<runtime.device> dev, @Unsigned long freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_opp_remove_all_dynamic(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_opp_remove_table(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_set_config(Ptr<runtime.device> dev, Ptr<dev_pm_opp_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_set_opp(Ptr<runtime.device> dev, Ptr<dev_pm_opp> opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_set_rate(Ptr<runtime.device> dev, @Unsigned long target_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_sync_regulators(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_unregister_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_opp_xlate_performance_state(Ptr<OppDefinitions.opp_table> src_table, Ptr<OppDefinitions.opp_table> dst_table, @Unsigned int pstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dev_pm_opp> dev_pm_opp_xlate_required_opp(Ptr<OppDefinitions.opp_table> src_table, Ptr<OppDefinitions.opp_table> dst_table, Ptr<dev_pm_opp> src_opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_set_dedicated_wake_irq(Ptr<runtime.device> dev, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_set_dedicated_wake_irq_reverse(Ptr<runtime.device> dev, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_set_wake_irq(Ptr<runtime.device> dev, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dev_port_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_remove_offload(Ptr<PacketDefinitions.packet_offload> po) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_xdp_enqueue(Ptr<NetDefinitions.net_device> dev, Ptr<XdpDefinitions.xdp_frame> xdpf, Ptr<NetDefinitions.net_device> dev_rx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dev_alloc_name($arg1, (const u8*)$arg2, $arg3)")
    public static int __dev_alloc_name(Ptr<runtime.net> net2, String name, String res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_change_flags(Ptr<NetDefinitions.net_device> dev, @Unsigned int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dev_change_net_namespace($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int __dev_change_net_namespace(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.net> net2, String pat, int new_ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dev_close_many(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_direct_xmit(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short queue_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_ethtool(Ptr<runtime.net> net2, Ptr<runtime.ifreq> ifr, Ptr<?> useraddr, @Unsigned int ethcmd, Ptr<EthtoolDefinitions.ethtool_devlink_compat> devlink_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_forward_skb(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_forward_skb2(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, boolean check_mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FwnodeDefinitions.fwnode_handle> __dev_fwnode(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct fwnode_handle*)__dev_fwnode_const((const struct device*)$arg1))")
    public static Ptr<FwnodeDefinitions.fwnode_handle> __dev_fwnode_const(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> __dev_get_by_flags(Ptr<runtime.net> net2, @Unsigned short if_flags, @Unsigned short mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> __dev_get_by_index(Ptr<runtime.net> net2, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dev_get_by_name($arg1, (const u8*)$arg2)")
    public static Ptr<NetDefinitions.net_device> __dev_get_by_name(Ptr<runtime.net> net2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dev_notify_flags($arg1, $arg2, $arg3, $arg4, (const struct nlmsghdr*)$arg5)")
    public static void __dev_notify_flags(Ptr<NetDefinitions.net_device> dev, @Unsigned int old_flags, @Unsigned int gchanges, @Unsigned int portid, Ptr<runtime.nlmsghdr> nlh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_open(Ptr<NetDefinitions.net_device> dev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_pm_qos_add_request(Ptr<runtime.device> dev, Ptr<dev_pm_qos_request> req2, dev_pm_qos_req_type type2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PmDefinitions.pm_qos_flags_status __dev_pm_qos_flags(Ptr<runtime.device> dev, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_pm_qos_remove_request(Ptr<dev_pm_qos_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_pm_qos_resume_latency(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_pm_qos_update_request(Ptr<dev_pm_qos_request> req2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dev_printk((const u8*)$arg1, (const struct device*)$arg2, $arg3)")
    public static void __dev_printk(String level, Ptr<runtime.device> dev, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_queue_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> sb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dev_remove_pack(Ptr<PacketDefinitions.packet_type> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_set_allmulti(Ptr<NetDefinitions.net_device> dev, int inc, boolean notify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_set_mtu(Ptr<NetDefinitions.net_device> dev, int new_mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_set_promiscuity(Ptr<NetDefinitions.net_device> dev, int inc, boolean notify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dev_set_rx_mode(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dev_status(Ptr<misc.mapped_device> md, Ptr<DmDefinitions.dm_ioctl> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dev_xmit_skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.Qdisc> q, Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_queue> txq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_dev_alert((const struct device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void _dev_alert(Ptr<runtime.device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_dev_crit((const struct device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void _dev_crit(Ptr<runtime.device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_dev_emerg((const struct device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void _dev_emerg(Ptr<runtime.device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_dev_err((const struct device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void _dev_err(Ptr<runtime.device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_dev_info((const struct device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void _dev_info(Ptr<runtime.device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_dev_notice((const struct device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void _dev_notice(Ptr<runtime.device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_dev_printk((const u8*)$arg1, (const struct device*)$arg2, (const u8*)$arg3, $arg4_)")
    public static void _dev_printk(String level, Ptr<runtime.device> dev, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_dev_warn((const struct device*)$arg1, (const u8*)$arg2, $arg3_)")
    public static void _dev_warn(Ptr<runtime.device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_add_pack(Ptr<PacketDefinitions.packet_type> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_alloc_name($arg1, (const u8*)$arg2)")
    public static int dev_alloc_name(Ptr<NetDefinitions.net_device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_arm_poll(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dev_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dev_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short dev_bin_attrs_are_visible(Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_cache_fw_image(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_change_carrier(Ptr<NetDefinitions.net_device> dev, boolean new_carrier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_change_flags(Ptr<NetDefinitions.net_device> dev, @Unsigned int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_change_name($arg1, (const u8*)$arg2)")
    public static int dev_change_name(Ptr<NetDefinitions.net_device> dev, String newname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_change_proto_down(Ptr<NetDefinitions.net_device> dev, boolean proto_down) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_change_proto_down_reason(Ptr<NetDefinitions.net_device> dev, @Unsigned long mask, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_change_tx_queue_len(Ptr<NetDefinitions.net_device> dev, @Unsigned long new_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_change_xdp_fd(Ptr<NetDefinitions.net_device> dev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, int fd2, int expected_fd, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_close(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_close_many(Ptr<ListDefinitions.list_head> head, boolean unlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_coredump_put(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_coredumpm_timeout($arg1, $arg2, $arg3, $arg4, $arg5, (long int (*)(u8*, long long int, long unsigned int, void*, long unsigned int))$arg6, (void (*)(void*))$arg7, $arg8)")
    public static void dev_coredumpm_timeout(Ptr<runtime.device> dev, Ptr<runtime.module> owner, Ptr<?> data, @Unsigned long datalen, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<?> read2, Ptr<?> free, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_coredumpsg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> table, @Unsigned long datalen, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_coredumpv(Ptr<runtime.device> dev, Ptr<?> data, @Unsigned long datalen, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_cpu_dead(@Unsigned int oldcpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_create(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_create_fw_entry(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_disable_lro(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dev_driver_string((const struct device*)$arg1))")
    public static String dev_driver_string(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_err_probe((const struct device*)$arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static int dev_err_probe(Ptr<runtime.device> dev, int err, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_ethtool(Ptr<runtime.net> net2, Ptr<runtime.ifreq> ifr, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_fetch_sw_netstats($arg1, (const struct pcpu_sw_netstats*)$arg2)")
    public static void dev_fetch_sw_netstats(Ptr<RtnlDefinitions.rtnl_link_stats64> s2, Ptr<PcpuDefinitions.pcpu_sw_netstats> netstats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_fill_forward_path((const struct net_device*)$arg1, (const u8*)$arg2, $arg3)")
    public static int dev_fill_forward_path(Ptr<NetDefinitions.net_device> dev, Ptr<Character> daddr, Ptr<NetDefinitions.net_device_path_stack> stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_fill_metadata_dst(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_forward_skb(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_forward_skb_nomtu(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_get_alias((const struct net_device*)$arg1, $arg2, $arg3)")
    public static int dev_get_alias(Ptr<NetDefinitions.net_device> dev, String name, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> dev_get_by_index(Ptr<runtime.net> net2, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> dev_get_by_index_rcu(Ptr<runtime.net> net2, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_get_by_name($arg1, (const u8*)$arg2)")
    public static Ptr<NetDefinitions.net_device> dev_get_by_name(Ptr<runtime.net> net2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_get_by_name_rcu($arg1, (const u8*)$arg2)")
    public static Ptr<NetDefinitions.net_device> dev_get_by_name_rcu(Ptr<runtime.net> net2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> dev_get_by_napi_id(@Unsigned int napi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_get_flags((const struct net_device*)$arg1)")
    public static @Unsigned int dev_get_flags(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_get_iflink((const struct net_device*)$arg1)")
    public static int dev_get_iflink(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_get_mac_address(Ptr<runtime.sockaddr> sa, Ptr<runtime.net> net2, String dev_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_get_min_mp_channel_count((const struct net_device*)$arg1)")
    public static @Unsigned int dev_get_min_mp_channel_count(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_get_phys_port_id(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_phys_item_id> ppid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_get_phys_port_name(Ptr<NetDefinitions.net_device> dev, String name, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_get_port_parent_id(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_phys_item_id> ppid, boolean recurse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RtnlDefinitions.rtnl_link_stats64> dev_get_stats(Ptr<NetDefinitions.net_device> dev, Ptr<RtnlDefinitions.rtnl_link_stats64> storage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_get_tstats64(Ptr<NetDefinitions.net_device> dev, Ptr<RtnlDefinitions.rtnl_link_stats64> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_getbyhwaddr_rcu($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<NetDefinitions.net_device> dev_getbyhwaddr_rcu(Ptr<runtime.net> net2, @Unsigned short type2, String ha) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> dev_getfirstbyhwtype(Ptr<runtime.net> net2, @Unsigned short type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> dev_hard_start_xmit(Ptr<SkDefinitions.sk_buff> first, Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_queue> txq, Ptr<Integer> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_index_reserve(Ptr<runtime.net> net2, @Unsigned int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetdevDefinitions.netdev_queue> dev_ingress_queue_create(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dev_is_best_effort(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_kfree_skb_any_reason(Ptr<SkDefinitions.sk_buff> skb, SkbDefinitions.skb_drop_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_kfree_skb_irq_reason(Ptr<SkDefinitions.sk_buff> skb, SkbDefinitions.skb_drop_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_loopback_xmit(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_mce_log(Ptr<misc.notifier_block> nb, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_mcelog_init_device() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dev_nit_active(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_open(Ptr<NetDefinitions.net_device> dev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short dev_pick_tx_zero(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> sb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_add_ancestor_request(Ptr<runtime.device> dev, Ptr<dev_pm_qos_request> req2, dev_pm_qos_req_type type2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_add_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> notifier, dev_pm_qos_req_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_add_request(Ptr<runtime.device> dev, Ptr<dev_pm_qos_request> req2, dev_pm_qos_req_type type2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_constraints_allocate(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_qos_constraints_destroy(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_expose_flags(Ptr<runtime.device> dev, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_expose_latency_limit(Ptr<runtime.device> dev, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_expose_latency_tolerance(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PmDefinitions.pm_qos_flags_status dev_pm_qos_flags(Ptr<runtime.device> dev, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_get_user_latency_tolerance(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_qos_hide_flags(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_qos_hide_latency_limit(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_pm_qos_hide_latency_tolerance(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_read_value(Ptr<runtime.device> dev, dev_pm_qos_req_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_remove_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> notifier, dev_pm_qos_req_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_remove_request(Ptr<dev_pm_qos_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_update_flags(Ptr<runtime.device> dev, int mask, boolean set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_update_request(Ptr<dev_pm_qos_request> req2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_pm_qos_update_user_latency_tolerance(Ptr<runtime.device> dev, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_pre_changeaddr_notify($arg1, (const u8*)$arg2, $arg3)")
    public static int dev_pre_changeaddr_notify(Ptr<NetDefinitions.net_device> dev, String addr2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_printk_emit($arg1, (const struct device*)$arg2, (const u8*)$arg3, $arg4_)")
    public static int dev_printk_emit(int level, Ptr<runtime.device> dev, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_qdisc_enqueue(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.Qdisc> q, Ptr<Ptr<SkDefinitions.sk_buff>> to_free, Ptr<NetdevDefinitions.netdev_queue> txq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_queue_xmit_nit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_remove(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_remove_pack(Ptr<PacketDefinitions.packet_type> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_rename(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_set_alias($arg1, (const u8*)$arg2, $arg3)")
    public static int dev_set_alias(Ptr<NetDefinitions.net_device> dev, String alias, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_allmulti(Ptr<NetDefinitions.net_device> dev, int inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_geometry(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_set_group(Ptr<NetDefinitions.net_device> dev, int new_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_mac_address(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.sockaddr> sa, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_mac_address_user(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.sockaddr> sa, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_mtu(Ptr<NetDefinitions.net_device> dev, int new_mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_mtu_ext(Ptr<NetDefinitions.net_device> dev, int new_mtu, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_set_name($arg1, (const u8*)$arg2, $arg3_)")
    public static int dev_set_name(Ptr<runtime.device> dev, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_promiscuity(Ptr<NetDefinitions.net_device> dev, int inc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_set_rx_mode(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_set_threaded(Ptr<NetDefinitions.net_device> dev, boolean threaded) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dev_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_status(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short dev_string_attrs_are_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_suspend(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_uevent((const struct kobject*)$arg1, $arg2)")
    public static int dev_uevent(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_uevent_filter((const struct kobject*)$arg1)")
    public static int dev_uevent_filter(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)dev_uevent_name((const struct kobject*)$arg1))")
    public static String dev_uevent_name(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_valid_name((const u8*)$arg1)")
    public static boolean dev_valid_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_validate_mtu(Ptr<NetDefinitions.net_device> dev, int new_mtu, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_vprintk_emit($arg1, (const struct device*)$arg2, (const u8*)$arg3, $arg4)")
    public static int dev_vprintk_emit(int level, Ptr<runtime.device> dev, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_wait(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_xdp_attach(Ptr<NetDefinitions.net_device> dev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<BpfDefinitions.bpf_xdp_link> link2, Ptr<BpfDefinitions.bpf_prog> new_prog, Ptr<BpfDefinitions.bpf_prog> old_prog, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_xdp_install(Ptr<NetDefinitions.net_device> dev, BpfDefinitions.bpf_xdp_mode mode, @OriginalName(value="bpf_op_t") Ptr<?> bpf_op, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, @Unsigned int flags, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char dev_xdp_prog_count(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dev_xdp_prog_id(Ptr<NetDefinitions.net_device> dev, BpfDefinitions.bpf_xdp_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_xdp_propagate(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_bpf> bpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dev_mc_add($arg1, (const u8*)$arg2, $arg3)")
    public static int __dev_mc_add(Ptr<NetDefinitions.net_device> dev, String addr2, boolean global) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_activate(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_addr_add($arg1, (const u8*)$arg2, $arg3)")
    public static int dev_addr_add(Ptr<NetDefinitions.net_device> dev, String addr2, char addr_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_addr_check(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_addr_del($arg1, (const u8*)$arg2, $arg3)")
    public static int dev_addr_del(Ptr<NetDefinitions.net_device> dev, String addr2, char addr_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_addr_flush(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_addr_init(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_addr_mod($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static void dev_addr_mod(Ptr<NetDefinitions.net_device> dev, @Unsigned int offset, Ptr<?> addr2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_deactivate(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_deactivate_many(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Qdisc> dev_graft_qdisc(Ptr<NetdevDefinitions.netdev_queue> dev_queue, Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_init_scheduler(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_mc_add($arg1, (const u8*)$arg2)")
    public static int dev_mc_add(Ptr<NetDefinitions.net_device> dev, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_mc_add_excl($arg1, (const u8*)$arg2)")
    public static int dev_mc_add_excl(Ptr<NetDefinitions.net_device> dev, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_mc_add_global($arg1, (const u8*)$arg2)")
    public static int dev_mc_add_global(Ptr<NetDefinitions.net_device> dev, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_mc_del($arg1, (const u8*)$arg2)")
    public static int dev_mc_del(Ptr<NetDefinitions.net_device> dev, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_mc_del_global($arg1, (const u8*)$arg2)")
    public static int dev_mc_del_global(Ptr<NetDefinitions.net_device> dev, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_mc_flush(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_mc_init(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_mc_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_mc_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_mc_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_mc_sync(Ptr<NetDefinitions.net_device> to, Ptr<NetDefinitions.net_device> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_mc_sync_multiple(Ptr<NetDefinitions.net_device> to, Ptr<NetDefinitions.net_device> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_mc_unsync(Ptr<NetDefinitions.net_device> to, Ptr<NetDefinitions.net_device> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dev_pm_skip_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dev_pm_skip_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_proc_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_proc_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_qdisc_change_real_num_tx(Ptr<NetDefinitions.net_device> dev, @Unsigned int new_real_tx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_qdisc_change_tx_queue_len(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_rescan_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dev_rescan_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_reset_queue(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_queue> dev_queue, Ptr<?> _unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dev_seq_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_seq_printf_stats(Ptr<SeqDefinitions.seq_file> seq, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dev_seq_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_seq_stop(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_shutdown(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long dev_trans_start(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_uc_add($arg1, (const u8*)$arg2)")
    public static int dev_uc_add(Ptr<NetDefinitions.net_device> dev, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_uc_add_excl($arg1, (const u8*)$arg2)")
    public static int dev_uc_add_excl(Ptr<NetDefinitions.net_device> dev, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dev_uc_del($arg1, (const u8*)$arg2)")
    public static int dev_uc_del(Ptr<NetDefinitions.net_device> dev, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_uc_flush(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_uc_init(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_uc_sync(Ptr<NetDefinitions.net_device> to, Ptr<NetDefinitions.net_device> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_uc_sync_multiple(Ptr<NetDefinitions.net_device> to, Ptr<NetDefinitions.net_device> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_uc_unsync(Ptr<NetDefinitions.net_device> to, Ptr<NetDefinitions.net_device> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dev_update_qos_constraint(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dev_watchdog(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ifconf")
    @NotUsableInJava
    public static class ifconf
    extends Struct {
        public int ifc_len;
        public misc.ifc_ifcu_of_ifconf ifc_ifcu;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_kfree_skb_cb")
    @NotUsableInJava
    public static class dev_kfree_skb_cb
    extends Struct {
        public SkbDefinitions.skb_drop_reason reason;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_header")
    @NotUsableInJava
    public static class dev_header
    extends Struct {
        public @Unsigned int len;
        public @Unsigned int prop_count;
        public EfiDefinitions.efi_dev_path @Size(value=0) [] path;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_opp_data")
    @NotUsableInJava
    public static class dev_pm_opp_data
    extends Struct {
        public boolean turbo;
        public @Unsigned int level;
        public @Unsigned long freq;
        public @Unsigned long u_volt;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_opp_config")
    @NotUsableInJava
    public static class dev_pm_opp_config
    extends Struct {
        public Ptr<String> clk_names;
        public @OriginalName(value="config_clks_t") Ptr<?> config_clks;
        public String prop_name;
        public @OriginalName(value="config_regulators_t") Ptr<?> config_regulators;
        public Ptr<@Unsigned Integer> supported_hw;
        public @Unsigned int supported_hw_count;
        public Ptr<String> regulator_names;
        public Ptr<String> genpd_names;
        public Ptr<Ptr<Ptr<runtime.device>>> virt_devs;
        public Ptr<Ptr<runtime.device>> required_devs;
    }

    @Type(noCCodeGeneration=true, cType="enum dev_pm_opp_event")
    public static enum dev_pm_opp_event implements Enum<dev_pm_opp_event>,
    TypedEnum<dev_pm_opp_event, Integer>
    {
        OPP_EVENT_ADD,
        OPP_EVENT_REMOVE,
        OPP_EVENT_ENABLE,
        OPP_EVENT_DISABLE,
        OPP_EVENT_ADJUST_VOLTAGE;

    }

    @Type(noCCodeGeneration=true, cType="struct dev_dax_data")
    @NotUsableInJava
    public static class dev_dax_data
    extends Struct {
        public Ptr<DaxDefinitions.dax_region> dax_region;
        public Ptr<dev_pagemap> pgmap;
        public @Unsigned @OriginalName(value="resource_size_t") long size;
        public int id;
        public boolean memmap_on_memory;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_dax")
    @NotUsableInJava
    public static class dev_dax
    extends Struct {
        public Ptr<DaxDefinitions.dax_region> region;
        public Ptr<DaxDefinitions.dax_device> dax_dev;
        public @Unsigned int align;
        public int target_node;
        public boolean dyn_id;
        public int id;
        public runtime.ida ida;
        public runtime.device dev;
        public Ptr<dev_pagemap> pgmap;
        public boolean memmap_on_memory;
        public int nr_range;
        public Ptr<dev_dax_range> ranges;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_dax_range")
    @NotUsableInJava
    public static class dev_dax_range
    extends Struct {
        public @Unsigned long pgoff;
        public runtime.range range;
        public Ptr<DaxDefinitions.dax_mapping> mapping;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_cgroup")
    @NotUsableInJava
    public static class dev_cgroup
    extends Struct {
        public CgroupDefinitions.cgroup_subsys_state css;
        public ListDefinitions.list_head exceptions;
        public misc.devcg_behavior behavior;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_exception_item")
    @NotUsableInJava
    public static class dev_exception_item
    extends Struct {
        public @Unsigned int major;
        public @Unsigned int minor;
        public short type;
        public short access;
        public ListDefinitions.list_head list;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_opp_icc_bw")
    @NotUsableInJava
    public static class dev_pm_opp_icc_bw
    extends Struct {
        public @Unsigned int avg;
        public @Unsigned int peak;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_opp")
    @NotUsableInJava
    public static class dev_pm_opp
    extends Struct {
        public ListDefinitions.list_head node;
        public runtime.kref kref;
        public boolean available;
        public boolean dynamic;
        public boolean turbo;
        public boolean suspend;
        public boolean removed;
        public Ptr<@Unsigned Long> rates;
        public @Unsigned int level;
        public Ptr<dev_pm_opp_supply> supplies;
        public Ptr<dev_pm_opp_icc_bw> bandwidth;
        public @Unsigned long clock_latency_ns;
        public Ptr<Ptr<dev_pm_opp>> required_opps;
        public Ptr<OppDefinitions.opp_table> opp_table;
        public Ptr<DeviceDefinitions.device_node> np;
        public Ptr<runtime.dentry> dentry;
        public String of_name;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_opp_supply")
    @NotUsableInJava
    public static class dev_pm_opp_supply
    extends Struct {
        public @Unsigned long u_volt;
        public @Unsigned long u_volt_min;
        public @Unsigned long u_volt_max;
        public @Unsigned long u_amp;
        public @Unsigned long u_watt;
    }

    @Type(noCCodeGeneration=true, cType="enum dev_type")
    public static enum dev_type implements Enum<dev_type>,
    TypedEnum<dev_type, Integer>
    {
        DEV_UNKNOWN,
        DEV_X1,
        DEV_X2,
        DEV_X4,
        DEV_X8,
        DEV_X16,
        DEV_X32,
        DEV_X64;

    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_domain_list")
    @NotUsableInJava
    public static class dev_pm_domain_list
    extends Struct {
        public Ptr<Ptr<runtime.device>> pd_devs;
        public Ptr<Ptr<DeviceDefinitions.device_link>> pd_links;
        public @Unsigned int num_pds;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_domain_attach_data")
    @NotUsableInJava
    public static class dev_pm_domain_attach_data
    extends Struct {
        public Ptr<String> pd_names;
        public @Unsigned int num_pd_names;
        public @Unsigned int pd_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pasid_info")
    @NotUsableInJava
    public static class dev_pasid_info
    extends Struct {
        public ListDefinitions.list_head link_domain;
        public Ptr<runtime.device> dev;
        public @Unsigned @OriginalName(value="ioasid_t") int pasid;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_ext_attribute")
    @NotUsableInJava
    public static class dev_ext_attribute
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public Ptr<?> var;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int lower_dw; unsigned int upper_dw; }")
    @NotUsableInJava
    public static class dev_serial_num_of_cper_sec_prot_err
    extends Struct {
        public @Unsigned int lower_dw;
        public @Unsigned int upper_dw;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_table_entry")
    @NotUsableInJava
    public static class dev_table_entry
    extends Struct {
        public @Unsigned long @Size(value=4) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_power_governor")
    @NotUsableInJava
    public static class dev_power_governor
    extends Struct {
        public Ptr<?> power_down_ok;
        public Ptr<?> suspend_ok;
    }

    @Type(noCCodeGeneration=true, cType="enum dev_prop_type")
    public static enum dev_prop_type implements Enum<dev_prop_type>,
    TypedEnum<dev_prop_type, Integer>
    {
        DEV_PROP_U8,
        DEV_PROP_U16,
        DEV_PROP_U32,
        DEV_PROP_U64,
        DEV_PROP_STRING,
        DEV_PROP_REF;

    }

    @Type(noCCodeGeneration=true, cType="struct dev_pin_info")
    @NotUsableInJava
    public static class dev_pin_info
    extends Struct {
        public Ptr<runtime.pinctrl> p;
        public Ptr<PinctrlDefinitions.pinctrl_state> default_state;
        public Ptr<PinctrlDefinitions.pinctrl_state> init_state;
        public Ptr<PinctrlDefinitions.pinctrl_state> sleep_state;
        public Ptr<PinctrlDefinitions.pinctrl_state> idle_state;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_printk_info")
    @NotUsableInJava
    public static class dev_printk_info
    extends Struct {
        public char @Size(value=16) [] subsystem;
        public char @Size(value=48) [] device;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_qos_request")
    @NotUsableInJava
    public static class dev_pm_qos_request
    extends Struct {
        public dev_pm_qos_req_type type;
        public DataDefinitions.data_of_dev_pm_qos_request data;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="enum dev_pm_qos_req_type")
    public static enum dev_pm_qos_req_type implements Enum<dev_pm_qos_req_type>,
    TypedEnum<dev_pm_qos_req_type, Integer>
    {
        DEV_PM_QOS_RESUME_LATENCY,
        DEV_PM_QOS_LATENCY_TOLERANCE,
        DEV_PM_QOS_MIN_FREQUENCY,
        DEV_PM_QOS_MAX_FREQUENCY,
        DEV_PM_QOS_FLAGS;

    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_qos")
    @NotUsableInJava
    public static class dev_pm_qos
    extends Struct {
        public PmDefinitions.pm_qos_constraints resume_latency;
        public PmDefinitions.pm_qos_constraints latency_tolerance;
        public FreqDefinitions.freq_constraints freq;
        public PmDefinitions.pm_qos_flags flags;
        public Ptr<dev_pm_qos_request> resume_latency_req;
        public Ptr<dev_pm_qos_request> latency_tolerance_req;
        public Ptr<dev_pm_qos_request> flags_req;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_ifalias")
    @NotUsableInJava
    public static class dev_ifalias
    extends Struct {
        public misc.callback_head rcuhead;
        public char @Size(value=0) [] ifalias;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_iommu")
    @NotUsableInJava
    public static class dev_iommu
    extends Struct {
        public runtime.mutex lock;
        public Ptr<IommuDefinitions.iommu_fault_param> fault_param;
        public Ptr<IommuDefinitions.iommu_fwspec> fwspec;
        public Ptr<IommuDefinitions.iommu_device> iommu_dev;
        public Ptr<?> priv;
        public @Unsigned int max_pasids;
        public @Unsigned int attach_deferred;
        public @Unsigned int pci_32bit_workaround;
        public @Unsigned int require_direct;
        public @Unsigned int shadow_on_flush;
    }

    @Type(noCCodeGeneration=true, cType="enum dev_dma_attr")
    public static enum dev_dma_attr implements Enum<dev_dma_attr>,
    TypedEnum<dev_dma_attr, Integer>
    {
        DEV_DMA_NOT_SUPPORTED,
        DEV_DMA_NON_COHERENT,
        DEV_DMA_COHERENT;

    }

    @Type(noCCodeGeneration=true, cType="struct dev_pagemap_ops")
    @NotUsableInJava
    public static class dev_pagemap_ops
    extends Struct {
        public Ptr<?> page_free;
        public Ptr<?> migrate_to_ram;
        public Ptr<?> memory_failure;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_msi_info")
    @NotUsableInJava
    public static class dev_msi_info
    extends Struct {
        public Ptr<IrqDefinitions.irq_domain> domain;
        public Ptr<MsiDefinitions.msi_device_data> data;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_links_info")
    @NotUsableInJava
    public static class dev_links_info
    extends Struct {
        public ListDefinitions.list_head suppliers;
        public ListDefinitions.list_head consumers;
        public ListDefinitions.list_head defer_sync;
        public DlDefinitions.dl_dev_state status;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_archdata")
    @NotUsableInJava
    public static class dev_archdata
    extends Struct {
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_domain")
    @NotUsableInJava
    public static class dev_pm_domain
    extends Struct {
        public dev_pm_ops ops;
        public Ptr<?> start;
        public Ptr<?> detach;
        public Ptr<?> activate;
        public Ptr<?> sync;
        public Ptr<?> dismiss;
        public Ptr<?> set_performance_state;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_info")
    @NotUsableInJava
    public static class dev_pm_info
    extends Struct {
        public  @OriginalName(value="pm_message_t") PmDefinitions.pm_message power_state;
        public boolean can_wakeup;
        public boolean async_suspend;
        public boolean in_dpm_list;
        public boolean is_prepared;
        public boolean is_suspended;
        public boolean is_noirq_suspended;
        public boolean is_late_suspended;
        public boolean no_pm;
        public boolean early_init;
        public boolean direct_complete;
        public @Unsigned int driver_flags;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head entry;
        public runtime.completion completion;
        public Ptr<WakeupDefinitions.wakeup_source> wakeup;
        public boolean wakeup_path;
        public boolean syscore;
        public boolean no_pm_callbacks;
        public boolean async_in_progress;
        public boolean must_resume;
        public boolean may_skip_resume;
        public runtime.hrtimer suspend_timer;
        public @Unsigned long timer_expires;
        public misc.work_struct work;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait_queue;
        public Ptr<WakeDefinitions.wake_irq> wakeirq;
        public AtomicDefinitions.atomic_t usage_count;
        public AtomicDefinitions.atomic_t child_count;
        public @Unsigned int disable_depth;
        public boolean idle_notification;
        public boolean request_pending;
        public boolean deferred_resume;
        public boolean needs_force_resume;
        public boolean runtime_auto;
        public boolean ignore_children;
        public boolean no_callbacks;
        public boolean irq_safe;
        public boolean use_autosuspend;
        public boolean timer_autosuspends;
        public boolean memalloc_noio;
        public @Unsigned int links_count;
        public RpmDefinitions.rpm_request request;
        public RpmDefinitions.rpm_status runtime_status;
        public RpmDefinitions.rpm_status last_status;
        public int runtime_error;
        public int autosuspend_delay;
        public @Unsigned long last_busy;
        public @Unsigned long active_time;
        public @Unsigned long suspended_time;
        public @Unsigned long accounting_timestamp;
        public Ptr<PmDefinitions.pm_subsys_data> subsys_data;
        public Ptr<?> set_latency_tolerance;
        public Ptr<dev_pm_qos> qos;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pm_ops")
    @NotUsableInJava
    public static class dev_pm_ops
    extends Struct {
        public Ptr<?> prepare;
        public Ptr<?> complete;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> freeze;
        public Ptr<?> thaw;
        public Ptr<?> poweroff;
        public Ptr<?> restore;
        public Ptr<?> suspend_late;
        public Ptr<?> resume_early;
        public Ptr<?> freeze_late;
        public Ptr<?> thaw_early;
        public Ptr<?> poweroff_late;
        public Ptr<?> restore_early;
        public Ptr<?> suspend_noirq;
        public Ptr<?> resume_noirq;
        public Ptr<?> freeze_noirq;
        public Ptr<?> thaw_noirq;
        public Ptr<?> poweroff_noirq;
        public Ptr<?> restore_noirq;
        public Ptr<?> runtime_suspend;
        public Ptr<?> runtime_resume;
        public Ptr<?> runtime_idle;
    }

    @Type(noCCodeGeneration=true, cType="struct dev_pagemap")
    @NotUsableInJava
    public static class dev_pagemap
    extends Struct {
        public misc.vmem_altmap altmap;
        public PercpuDefinitions.percpu_ref ref;
        public runtime.completion done;
        public MemoryDefinitions.memory_type type;
        public @Unsigned int flags;
        public @Unsigned long vmemmap_shift;
        public Ptr<dev_pagemap_ops> ops;
        public Ptr<?> owner;
        public int nr_range;
        @InlineUnion(value=1602)
        public  @InlineUnion(value=1602) runtime.range range;
        @InlineUnion(value=1602)
        public  @InlineUnion(value=1602) AnonDefinitions.anon_member_of_anon_member_of_dev_pagemap anon9$1;
    }
}

