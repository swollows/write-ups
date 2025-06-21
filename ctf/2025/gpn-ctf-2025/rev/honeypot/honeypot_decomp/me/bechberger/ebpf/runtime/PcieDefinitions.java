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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PcieDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="pcie_cap_has_lnkctl((const struct pci_dev*)$arg1)")
    public static boolean pcie_cap_has_lnkctl(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcie_cap_has_lnkctl2((const struct pci_dev*)$arg1)")
    public static boolean pcie_cap_has_lnkctl2(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcie_cap_has_rtctl((const struct pci_dev*)$arg1)")
    public static boolean pcie_cap_has_rtctl(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_capability_clear_and_set_dword(Ptr<PciDefinitions.pci_dev> dev, int pos, @Unsigned int clear, @Unsigned int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_capability_clear_and_set_word_locked(Ptr<PciDefinitions.pci_dev> dev, int pos, @Unsigned short clear, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_capability_clear_and_set_word_unlocked(Ptr<PciDefinitions.pci_dev> dev, int pos, @Unsigned short clear, @Unsigned short set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_capability_read_dword(Ptr<PciDefinitions.pci_dev> dev, int pos, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_capability_read_word(Ptr<PciDefinitions.pci_dev> dev, int pos, Ptr<@Unsigned Short> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_capability_reg_implemented(Ptr<PciDefinitions.pci_dev> dev, int pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_capability_write_dword(Ptr<PciDefinitions.pci_dev> dev, int pos, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_capability_write_word(Ptr<PciDefinitions.pci_dev> dev, int pos, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_hp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_pme_can_wakeup(Ptr<PciDefinitions.pci_dev> dev, Ptr<?> ign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_pme_check_wakeup(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_pme_from_pci_bridge(Ptr<PciDefinitions.pci_bus> bus, char devfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_pme_handle_request(Ptr<PciDefinitions.pci_dev> port2, @Unsigned short req_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_pme_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_pme_interrupt_enable(Ptr<PciDefinitions.pci_dev> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn pcie_pme_irq(int irq, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_pme_probe(Ptr<pcie_device> srv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_pme_remove(Ptr<pcie_device> srv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_pme_resume(Ptr<pcie_device> srv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_pme_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_pme_suspend(Ptr<pcie_device> srv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_pme_walk_bus(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_pme_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_device_iter(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_device_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_device_resume_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_device_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_device_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_enable_irq_vec(Ptr<PciDefinitions.pci_dev> dev, Ptr<Integer> irqs, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> pcie_port_find_device(Ptr<PciDefinitions.pci_dev> dev, @Unsigned int service) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_probe_service(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_remove_service(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_runtime_idle(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_service_register(Ptr<pcie_port_service_driver> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_port_service_unregister(Ptr<pcie_port_service_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_port_shutdown_service(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pci_ers_result_t") int pcie_portdrv_error_detected(Ptr<PciDefinitions.pci_dev> dev, @Unsigned @OriginalName(value="pci_channel_state_t") int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_portdrv_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pci_ers_result_t") int pcie_portdrv_mmio_enabled(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcie_portdrv_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int pcie_portdrv_probe(Ptr<PciDefinitions.pci_dev> dev, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_portdrv_remove(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_portdrv_shutdown(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pci_ers_result_t") int pcie_portdrv_slot_reset(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_rootport_aspm_quirk(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcie_do_recovery($arg1, $arg2, (unsigned int (*)(struct pci_dev*))$arg3)")
    public static @Unsigned @OriginalName(value="pci_ers_result_t") int pcie_do_recovery(Ptr<PciDefinitions.pci_dev> dev, @Unsigned @OriginalName(value="pci_channel_state_t") int state2, Ptr<?> reset_subordinates) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_failed_link_retrain(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_link_rcec(Ptr<PciDefinitions.pci_dev> rcec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcie_port_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int pcie_port_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcie_walk_rcec($arg1, (int (*)(struct pci_dev*, void*))$arg2, $arg3)")
    public static void pcie_walk_rcec(Ptr<PciDefinitions.pci_dev> rcec, Ptr<?> cb, Ptr<?> userdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_aer_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_aer_is_native(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_bus_configure_set(Ptr<PciDefinitions.pci_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_bus_configure_settings(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_find_smpss(Ptr<PciDefinitions.pci_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_ptm_enabled(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_relaxed_ordering_enabled(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_report_downtraining(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_update_link_speed(Ptr<PciDefinitions.pci_bus> bus, @Unsigned short linksta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pcie_print_link_status(Ptr<PciDefinitions.pci_dev> dev, boolean verbose) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_aspm_cap_init(Ptr<pcie_link_state> link2, int blacklist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_aspm_check_latency(Ptr<PciDefinitions.pci_dev> endpoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_aspm_configure_common_clock(Ptr<pcie_link_state> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_aspm_disable(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_aspm_enabled(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_aspm_exit_link_state(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcie_aspm_get_policy($arg1, (const struct kernel_param*)$arg2)")
    public static int pcie_aspm_get_policy(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_aspm_init_link_state(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_aspm_pm_state_change(Ptr<PciDefinitions.pci_dev> pdev, boolean locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_aspm_powersave_config_link(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pcie_aspm_set_policy((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int pcie_aspm_set_policy(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_aspm_support_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pcie_bandwidth_available(Ptr<PciDefinitions.pci_dev> dev, Ptr<Ptr<PciDefinitions.pci_dev>> limiting_dev, Ptr<PciDefinitions.pci_bus_speed> speed, Ptr<pcie_link_width> width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_clear_device_status(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_clear_hotplug_events(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_clear_root_pme_status(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_config_aspm_link(Ptr<pcie_link_state> link2, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pcie_dev_attrs_are_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_disable_interrupt(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_disable_notification(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_do_write_cmd(Ptr<runtime.controller> ctrl, @Unsigned short cmd, @Unsigned short mask, boolean wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_dpc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_enable_interrupt(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_flr(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_get_mps(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_get_readrq(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PciDefinitions.pci_bus_speed pcie_get_speed_cap(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static pcie_link_width pcie_get_width_cap(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.controller> pcie_init(Ptr<pcie_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_init_notification(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_link_speed_mbps(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_no_aspm() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_port_pm_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_print_link_status(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_read_tlp_log(Ptr<PciDefinitions.pci_dev> dev, int where, Ptr<pcie_tlp_log> tlp_log) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_reset_flr(Ptr<PciDefinitions.pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_retrain_link(Ptr<PciDefinitions.pci_dev> pdev, boolean use_lt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_set_clkpm(Ptr<pcie_link_state> link2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_set_mps(Ptr<PciDefinitions.pci_dev> dev, int mps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_set_readrq(Ptr<PciDefinitions.pci_dev> dev, int rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_shutdown_notification(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_update_aspm_capable(Ptr<pcie_link_state> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcie_wait_cmd(Ptr<runtime.controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_wait_for_link(Ptr<PciDefinitions.pci_dev> pdev, boolean active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pcie_wait_for_link_delay(Ptr<PciDefinitions.pci_dev> pdev, boolean active, int delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcie_wait_for_link_status(Ptr<PciDefinitions.pci_dev> pdev, boolean use_lt, boolean active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pcie_pme_service_data")
    @NotUsableInJava
    public static class pcie_pme_service_data
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<pcie_device> srv;
        public misc.work_struct work;
        public boolean noirq;
    }

    @Type(noCCodeGeneration=true, cType="struct pcie_port_service_driver")
    @NotUsableInJava
    public static class pcie_port_service_driver
    extends Struct {
        public String name;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> suspend;
        public Ptr<?> resume_noirq;
        public Ptr<?> resume;
        public Ptr<?> runtime_suspend;
        public Ptr<?> runtime_resume;
        public Ptr<?> slot_reset;
        public int port_type;
        public @Unsigned int service;
        public DeviceDefinitions.device_driver driver;
    }

    @Type(noCCodeGeneration=true, cType="struct pcie_device")
    @NotUsableInJava
    public static class pcie_device
    extends Struct {
        public int irq;
        public Ptr<PciDefinitions.pci_dev> port;
        public @Unsigned int service;
        public Ptr<?> priv_data;
        public runtime.device device;
    }

    @Type(noCCodeGeneration=true, cType="struct pcie_link_state")
    @NotUsableInJava
    public static class pcie_link_state
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> pdev;
        public Ptr<PciDefinitions.pci_dev> downstream;
        public Ptr<pcie_link_state> root;
        public Ptr<pcie_link_state> parent;
        public ListDefinitions.list_head sibling;
        public @Unsigned int aspm_support;
        public @Unsigned int aspm_enabled;
        public @Unsigned int aspm_capable;
        public @Unsigned int aspm_default;
        public @Unsigned int aspm_disable;
        public @Unsigned int clkpm_capable;
        public @Unsigned int clkpm_enabled;
        public @Unsigned int clkpm_default;
        public @Unsigned int clkpm_disable;
    }

    @Type(noCCodeGeneration=true, cType="struct pcie_tlp_log")
    @NotUsableInJava
    public static class pcie_tlp_log
    extends Struct {
        public @Unsigned int @Size(value=4) [] dw;
    }

    @Type(noCCodeGeneration=true, cType="enum pcie_bus_config_types")
    public static enum pcie_bus_config_types implements Enum<pcie_bus_config_types>,
    TypedEnum<pcie_bus_config_types, Integer>
    {
        PCIE_BUS_TUNE_OFF,
        PCIE_BUS_DEFAULT,
        PCIE_BUS_SAFE,
        PCIE_BUS_PERFORMANCE,
        PCIE_BUS_PEER2PEER;

    }

    @Type(noCCodeGeneration=true, cType="enum pcie_link_width")
    public static enum pcie_link_width implements Enum<pcie_link_width>,
    TypedEnum<pcie_link_width, Integer>
    {
        PCIE_LNK_WIDTH_RESRV,
        PCIE_LNK_X1,
        PCIE_LNK_X2,
        PCIE_LNK_X4,
        PCIE_LNK_X8,
        PCIE_LNK_X12,
        PCIE_LNK_X16,
        PCIE_LNK_X32,
        PCIE_LNK_WIDTH_UNKNOWN;

    }

    @Type(noCCodeGeneration=true, cType="enum pcie_reset_state")
    public static enum pcie_reset_state implements Enum<pcie_reset_state>,
    TypedEnum<pcie_reset_state, Integer>
    {
        pcie_deassert_reset,
        pcie_warm_reset,
        pcie_hot_reset;

    }
}

