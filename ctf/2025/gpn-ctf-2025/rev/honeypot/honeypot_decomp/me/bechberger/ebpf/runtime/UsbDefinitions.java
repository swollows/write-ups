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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.EpDefinitions;
import me.bechberger.ebpf.runtime.ExtconDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GenDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class UsbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_amd_dev_put() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_amd_find_chipset_info() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_amd_hang_symptom_quirk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_amd_prefetch_quirk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_amd_pt_check_port(Ptr<runtime.device> device2, int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_amd_quirk_pll(int disable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_amd_quirk_pll_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_amd_quirk_pll_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_amd_quirk_pll_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_asmedia_modifyflowcontrol(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_asmedia_wait_write(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_authorize_device(Ptr<usb_device> usb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_clear_port_feature(Ptr<usb_device> hdev, int port1, int feature) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_deauthorize_device(Ptr<usb_device> usb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_deregister_dev(Ptr<usb_interface> intf, Ptr<usb_class_driver> class_driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_device_is_owned(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_device_supports_lpm(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_devio_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_devio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_disable_link_state(Ptr<usb_hcd> hcd, Ptr<usb_device> udev, misc.usb3_link_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_disable_lpm(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_disable_ltm(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_disable_remote_wakeup(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_disable_xhci_ports(Ptr<PciDefinitions.pci_dev> xhci_pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_disconnect(Ptr<Ptr<usb_device>> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_enable_intel_xhci_ports(Ptr<PciDefinitions.pci_dev> xhci_pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_enable_link_state(Ptr<usb_hcd> hcd, Ptr<usb_device> udev, misc.usb3_link_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_enable_lpm(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_enable_ltm(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_ep0_reinit(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="acpi_handle") Ptr<?> usb_get_hub_port_acpi_handle(Ptr<usb_device> hdev, int port1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_amd_remote_wakeup_quirk(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_hcd_pci_probe($arg1, (const struct hc_driver*)$arg2)")
    public static int usb_hcd_pci_probe(Ptr<PciDefinitions.pci_dev> dev, Ptr<misc.hc_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_pci_remove(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_pci_shutdown(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hub_adjust_deviceremovable(Ptr<usb_device> hdev, Ptr<usb_hub_descriptor> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hub_claim_port(Ptr<usb_device> hdev, @Unsigned int port1, Ptr<usb_dev_state> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hub_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hub_clear_tt_buffer(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_device> usb_hub_find_child(Ptr<usb_device> hdev, int port1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hub_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hub_port_status(Ptr<usb_hub> hub, int port1, Ptr<@Unsigned Short> status, Ptr<@Unsigned Short> change) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hub_release_all_ports(Ptr<usb_device> hdev, Ptr<usb_dev_state> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hub_release_port(Ptr<usb_device> hdev, @Unsigned int port1, Ptr<usb_dev_state> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hub_set_port_power(Ptr<usb_device> hdev, Ptr<usb_hub> hub, int port1, boolean set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_hub> usb_hub_to_struct_hub(Ptr<usb_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_kick_hub_wq(Ptr<usb_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_led_activity(usb_led_event ev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_major_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_major_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_new_device(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_port_disable(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_port_is_power_on(Ptr<usb_hub> hub, @Unsigned int portstatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_port_resume(Ptr<usb_device> udev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_port_suspend(Ptr<usb_device> udev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_queue_reset_device(Ptr<usb_interface> iface) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_register_dev(Ptr<usb_interface> intf, Ptr<usb_class_driver> class_driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_remote_wakeup(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_remove_device(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_req_set_sel(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_reset_and_verify_device(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_reset_device(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_root_hub_lost_power(Ptr<usb_device> rhdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_set_device_initiated_lpm(Ptr<usb_device> udev, misc.usb3_link_state state2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_set_device_state(Ptr<usb_device> udev, usb_device_state new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_set_lpm_parameters(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_set_lpm_timeout(Ptr<usb_device> udev, misc.usb3_link_state state2, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_unlocked_disable_lpm(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_unlocked_enable_lpm(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int usb_wakeup_enabled_descendants(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_wakeup_notification(Ptr<usb_device> hdev, @Unsigned int portnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __usb_get_extra_descriptor(String buffer, @Unsigned int size, char type2, Ptr<Ptr<?>> ptr, @Unsigned long minsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __usb_queue_reset_device(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __usb_wireless_status_intf(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_acpi_add_usb4_devlink(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_acpi_bus_match(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AcpiDefinitions.acpi_device> usb_acpi_find_companion(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AcpiDefinitions.acpi_device> usb_acpi_get_companion_for_port(Ptr<usb_port> port_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_acpi_port_lpm_incapable(Ptr<usb_device> hdev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_acpi_power_manageable(Ptr<usb_device> hdev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_acpi_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_acpi_set_power_state(Ptr<usb_device> hdev, int index2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_acpi_unregister() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> usb_alloc_coherent(Ptr<usb_device> dev, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_device> usb_alloc_dev(Ptr<usb_device> parent, Ptr<usb_bus> bus, @Unsigned int port1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_altnum_to_altsetting((const struct usb_interface*)$arg1, $arg2)")
    public static Ptr<usb_host_interface> usb_altnum_to_altsetting(Ptr<usb_interface> intf, @Unsigned int altnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_api_blocking_completion(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_authorize_interface(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_bulk_msg(Ptr<usb_device> usb_dev, @Unsigned int pipe2, Ptr<?> data, int len, Ptr<Integer> actual_length, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_bus_notify(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String usb_cache_string(Ptr<usb_device> udev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_check_bulk_endpoints((const struct usb_interface*)$arg1, (const u8*)$arg2)")
    public static boolean usb_check_bulk_endpoints(Ptr<usb_interface> intf, Ptr<Character> ep_addrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_check_int_endpoints((const struct usb_interface*)$arg1, (const u8*)$arg2)")
    public static boolean usb_check_int_endpoints(Ptr<usb_interface> intf, Ptr<Character> ep_addrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_clear_halt(Ptr<usb_device> dev, int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_control_msg(Ptr<usb_device> dev, @Unsigned int pipe2, char request2, char requesttype, @Unsigned short value, @Unsigned short index2, Ptr<?> data, @Unsigned short size, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_control_msg_recv(Ptr<usb_device> dev, char endpoint, char request2, char requesttype, @Unsigned short value, @Unsigned short index2, Ptr<?> driver_data, @Unsigned short size, int timeout, @Unsigned @OriginalName(value="gfp_t") int memflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_control_msg_send($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const void*)$arg7, $arg8, $arg9, $arg10)")
    public static int usb_control_msg_send(Ptr<usb_device> dev, char endpoint, char request2, char requesttype, @Unsigned short value, @Unsigned short index2, Ptr<?> driver_data, @Unsigned short size, int timeout, @Unsigned @OriginalName(value="gfp_t") int memflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_deauthorize_interface(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)usb_decode_ctrl($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7))")
    public static String usb_decode_ctrl(String str, @Unsigned long size, char bRequestType, char bRequest, @Unsigned short wValue, @Unsigned short wIndex, @Unsigned short wLength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_decode_ctrl_generic(String str, @Unsigned long size, char bRequestType, char bRequest, @Unsigned short wValue, @Unsigned short wIndex, @Unsigned short wLength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_decode_ctrl_standard(String str, @Unsigned long size, char bRequestType, char bRequest, @Unsigned short wValue, @Unsigned short wIndex, @Unsigned short wLength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_dev_complete(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_dev_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_dev_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_dev_prepare(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_dev_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_dev_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_dev_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_dev_thaw(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_dev_uevent((const struct device*)$arg1, $arg2)")
    public static int usb_dev_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long usb_device_dump(Ptr<String> buffer, Ptr<@Unsigned Long> nbytes, Ptr<@OriginalName(value="loff_t") Long> skip_bytes, Ptr<@OriginalName(value="loff_t") Long> file_offset, Ptr<usb_device> usbdev, Ptr<usb_bus> bus, int level, int index2, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long usb_device_read(Ptr<runtime.file> file2, String buf, @Unsigned long nbytes, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_disable_device(Ptr<usb_device> dev, int skip_ep0) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_disable_device_endpoints(Ptr<usb_device> dev, int skip_ep0) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_disable_endpoint(Ptr<usb_device> dev, @Unsigned int epaddr, boolean reset_hardware) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_disable_interface(Ptr<usb_device> dev, Ptr<usb_interface> intf, boolean reset_hardware) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_disabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_driver_set_configuration(Ptr<usb_device> udev, int config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_dump_config($arg1, $arg2, $arg3, (const struct usb_host_config*)$arg4, $arg5)")
    public static String usb_dump_config(int speed, String start, String end, Ptr<usb_host_config> config, int active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String usb_dump_desc(String start, String end, Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_enable_endpoint(Ptr<usb_device> dev, Ptr<usb_host_endpoint> ep, boolean reset_ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_enable_interface(Ptr<usb_device> dev, Ptr<usb_interface> intf, boolean reset_eps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_host_interface> usb_find_alt_setting(Ptr<usb_host_config> config, @Unsigned int iface_num, @Unsigned int alt_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_find_common_endpoints(Ptr<usb_host_interface> alt, Ptr<Ptr<usb_endpoint_descriptor>> bulk_in, Ptr<Ptr<usb_endpoint_descriptor>> bulk_out, Ptr<Ptr<usb_endpoint_descriptor>> int_in, Ptr<Ptr<usb_endpoint_descriptor>> int_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_find_common_endpoints_reverse(Ptr<usb_host_interface> alt, Ptr<Ptr<usb_endpoint_descriptor>> bulk_in, Ptr<Ptr<usb_endpoint_descriptor>> bulk_out, Ptr<Ptr<usb_endpoint_descriptor>> int_in, Ptr<Ptr<usb_endpoint_descriptor>> int_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_interface> usb_find_interface(Ptr<usb_driver> drv, int minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_for_each_dev($arg1, (int (*)(struct usb_device*, void*))$arg2)")
    public static int usb_for_each_dev(Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_free_coherent(Ptr<usb_device> dev, @Unsigned long size, Ptr<?> addr2, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_get_current_frame_number(Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_get_descriptor(Ptr<usb_device> dev, char type2, char index2, Ptr<?> buf, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_device> usb_get_dev(Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_device_descriptor> usb_get_device_descriptor(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_interface> usb_get_intf(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_get_status(Ptr<usb_device> dev, int recip, int type2, int target, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_get_string(Ptr<usb_device> dev, @Unsigned short langid, char index2, Ptr<?> buf, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_if_uevent((const struct device*)$arg1, $arg2)")
    public static int usb_if_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_ifnum_to_if((const struct usb_device*)$arg1, $arg2)")
    public static Ptr<usb_interface> usb_ifnum_to_if(Ptr<usb_device> dev, @Unsigned int ifnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_init_pool_max() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_interrupt_msg(Ptr<usb_device> usb_dev, @Unsigned int pipe2, Ptr<?> data, int len, Ptr<Integer> actual_length, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> usb_intf_get_dma_device(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_lock_device_for_reset($arg1, (const struct usb_interface*)$arg2)")
    public static int usb_lock_device_for_reset(Ptr<usb_device> udev, Ptr<usb_interface> iface) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_notify_add_bus(Ptr<usb_bus> ubus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_notify_add_device(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_notify_remove_bus(Ptr<usb_bus> ubus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_notify_remove_device(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_put_dev(Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_put_intf(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_register_notify(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_release_dev(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_release_interface(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_reset_configuration(Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_reset_endpoint(Ptr<usb_device> dev, @Unsigned int epaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)usb_role_string($arg1))")
    public static String usb_role_string(usb_role role) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_role_switch_find_by_fwnode((const struct fwnode_handle*)$arg1)")
    public static Ptr<usb_role_switch> usb_role_switch_find_by_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_role_switch> usb_role_switch_get(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> usb_role_switch_get_drvdata(Ptr<usb_role_switch> sw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static usb_role usb_role_switch_get_role(Ptr<usb_role_switch> sw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_role_switch> usb_role_switch_is_parent(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short usb_role_switch_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_role_switch_match((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<?> usb_role_switch_match(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String id, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_role_switch_put(Ptr<usb_role_switch> sw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_role_switch_register($arg1, (const struct usb_role_switch_desc*)$arg2)")
    public static Ptr<usb_role_switch> usb_role_switch_register(Ptr<runtime.device> parent, Ptr<usb_role_switch_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_role_switch_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_role_switch_set_drvdata(Ptr<usb_role_switch> sw, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_role_switch_set_role(Ptr<usb_role_switch> sw, usb_role role) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_role_switch_uevent((const struct device*)$arg1, $arg2)")
    public static int usb_role_switch_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_role_switch_unregister(Ptr<usb_role_switch> sw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_roles_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_roles_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_set_configuration(Ptr<usb_device> dev, int configuration) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_set_interface(Ptr<usb_device> dev, int _interface, int alternate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_set_isoch_delay(Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_set_wireless_status(Ptr<usb_interface> iface, usb_wireless_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_sg_cancel(Ptr<usb_sg_request> io2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_sg_init(Ptr<usb_sg_request> io2, Ptr<usb_device> dev, @Unsigned int pipe2, @Unsigned int period, Ptr<runtime.scatterlist> sg2, int nents, @Unsigned long length, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_sg_wait(Ptr<usb_sg_request> io2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_start_wait_urb(Ptr<runtime.urb> urb2, int timeout, Ptr<Integer> actual_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_string(Ptr<usb_device> dev, int index2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_string_sub(Ptr<usb_device> dev, @Unsigned int langid, @Unsigned int index2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_unregister_notify(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __usb_bus_reprobe_drivers(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __usb_unanchor_urb(Ptr<runtime.urb> urb2, Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.urb> usb_alloc_urb(int iso_packets, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_anchor_empty(Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_anchor_resume_wakeups(Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_anchor_suspend_wakeups(Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_anchor_urb(Ptr<runtime.urb> urb2, Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_autopm_get_interface(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_autopm_get_interface_async(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_autopm_get_interface_no_resume(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_autopm_put_interface(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_autopm_put_interface_async(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_autopm_put_interface_no_suspend(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_autoresume_device(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_autosuspend_device(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_block_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_common_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_common_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_create_sysfs_dev_files(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_create_sysfs_intf_files(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_decode_interval((const struct usb_endpoint_descriptor*)$arg1, $arg2)")
    public static @Unsigned int usb_decode_interval(Ptr<usb_endpoint_descriptor> epd, usb_device_speed speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_deregister(Ptr<usb_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_deregister_device_driver(Ptr<usb_device_driver> udriver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_detect_interface_quirks(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_detect_quirks(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_detect_static_quirks($arg1, (const struct usb_device_id*)$arg2)")
    public static @Unsigned int usb_detect_static_quirks(Ptr<usb_device> udev, Ptr<usb_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_device_match($arg1, (const struct device_driver*)$arg2)")
    public static int usb_device_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct usb_device_id*)usb_device_match_id($arg1, (const struct usb_device_id*)$arg2))")
    public static Ptr<usb_device_id> usb_device_match_id(Ptr<usb_device> udev, Ptr<usb_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_disable_autosuspend(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_disable_usb2_hardware_lpm(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_driver_applicable(Ptr<usb_device> udev, Ptr<usb_device_driver> udrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_driver_claim_interface(Ptr<usb_driver> driver, Ptr<usb_interface> iface, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_driver_release_interface(Ptr<usb_driver> driver, Ptr<usb_interface> iface) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_enable_autosuspend(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_enable_usb2_hardware_lpm(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_endpoint_is_ignored(Ptr<usb_device> udev, Ptr<usb_host_interface> intf, Ptr<usb_endpoint_descriptor> epd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)usb_ep_type_string($arg1))")
    public static String usb_ep_type_string(int ep_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_forced_unbind_intf(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_free_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static usb_dr_mode usb_get_dr_mode(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.urb> usb_get_from_anchor(Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static usb_device_speed usb_get_maximum_speed(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static usb_ssp_rate usb_get_maximum_ssp_rate(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static usb_dr_mode usb_get_role_switch_default_mode(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.urb> usb_get_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hub_create_port_device(Ptr<usb_hub> hub, int port1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hub_remove_port_device(Ptr<usb_hub> hub, int port1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_init_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_kill_anchored_urbs(Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_kill_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_match_device($arg1, (const struct usb_device_id*)$arg2)")
    public static int usb_match_device(Ptr<usb_device> dev, Ptr<usb_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct usb_device_id*)usb_match_dynamic_id($arg1, $arg2))")
    public static Ptr<usb_device_id> usb_match_dynamic_id(Ptr<usb_interface> intf, Ptr<usb_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct usb_device_id*)usb_match_id($arg1, (const struct usb_device_id*)$arg2))")
    public static Ptr<usb_device_id> usb_match_id(Ptr<usb_interface> _interface, Ptr<usb_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_match_one_id($arg1, (const struct usb_device_id*)$arg2)")
    public static int usb_match_one_id(Ptr<usb_interface> _interface, Ptr<usb_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_match_one_id_intf($arg1, $arg2, (const struct usb_device_id*)$arg3)")
    public static int usb_match_one_id_intf(Ptr<usb_device> dev, Ptr<usb_host_interface> intf, Ptr<usb_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)usb_otg_state_string($arg1))")
    public static String usb_otg_state_string(usb_otg_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_pipe_type_check(Ptr<usb_device> dev, @Unsigned int pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_poison_anchored_urbs(Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_poison_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_port_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_port_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_port_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_port_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_probe_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_probe_interface(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_register_device_driver(Ptr<usb_device_driver> new_udriver, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_register_driver($arg1, $arg2, (const u8*)$arg3)")
    public static int usb_register_driver(Ptr<usb_driver> new_driver, Ptr<runtime.module> owner, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_release_quirk_list() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_remove_sysfs_dev_files(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_remove_sysfs_intf_files(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_resume(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_resume_both(Ptr<usb_device> udev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_resume_complete(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_runtime_idle(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_scuttle_anchored_urbs(Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long usb_show_dynids(Ptr<usb_dynids> dynids, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_shutdown_interface(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)usb_speed_string($arg1))")
    public static String usb_speed_string(usb_device_speed speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)usb_state_string($arg1))")
    public static String usb_state_string(usb_device_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_store_new_id($arg1, (const struct usb_device_id*)$arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long usb_store_new_id(Ptr<usb_dynids> dynids, Ptr<usb_device_id> id_table, Ptr<DeviceDefinitions.device_driver> driver, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_submit_urb(Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_suspend(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_suspend_both(Ptr<usb_device> udev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_uevent((const struct device*)$arg1, $arg2)")
    public static int usb_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_unanchor_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_unbind_and_rebind_marked_interfaces(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_unbind_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_unbind_interface(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_unlink_anchored_urbs(Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_unlink_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_unpoison_anchored_urbs(Ptr<usb_anchor> anchor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_unpoison_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_update_wireless_status_attr(Ptr<usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_urb_ep_type_check((const struct urb*)$arg1)")
    public static int usb_urb_ep_type_check(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_wait_anchor_empty_timeout(Ptr<usb_anchor> anchor, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__usb_create_hcd((const struct hc_driver*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static Ptr<usb_hcd> __usb_create_hcd(Ptr<misc.hc_driver> driver, Ptr<runtime.device> sysdev, Ptr<runtime.device> dev, String bus_name, Ptr<usb_hcd> primary_hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __usb_hcd_giveback_urb(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __usb_phy_get_charger_type(Ptr<usb_phy> usb_phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_add_hcd(Ptr<usb_hcd> hcd, @Unsigned int irqnum, @Unsigned long irqflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_add_phy(Ptr<usb_phy> x, usb_phy_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_add_phy_dev(Ptr<usb_phy> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_alloc_streams(Ptr<usb_interface> _interface, Ptr<Ptr<usb_host_endpoint>> eps, @Unsigned int num_eps, @Unsigned int num_streams, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long usb_calc_bus_time(int speed, int is_input, int isoc, int bytecount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_choose_configuration(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_create_ep_devs(Ptr<runtime.device> parent, Ptr<usb_host_endpoint> endpoint, Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_create_hcd((const struct hc_driver*)$arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<usb_hcd> usb_create_hcd(Ptr<misc.hc_driver> driver, Ptr<runtime.device> dev, String bus_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_create_shared_hcd((const struct hc_driver*)$arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<usb_hcd> usb_create_shared_hcd(Ptr<misc.hc_driver> driver, Ptr<runtime.device> dev, String bus_name, Ptr<usb_hcd> primary_hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_deregister_bus(Ptr<usb_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_destroy_configuration(Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_free_streams(Ptr<usb_interface> _interface, Ptr<Ptr<usb_host_endpoint>> eps, @Unsigned int num_eps, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_generic_driver_disconnect(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean usb_generic_driver_match(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_generic_driver_probe(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_generic_driver_resume(Ptr<usb_device> udev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_generic_driver_suspend(Ptr<usb_device> udev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_get_bos_descriptor(Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_get_configuration(Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_hcd> usb_get_hcd(Ptr<usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_phy> usb_get_phy(usb_phy_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_giveback_urb_bh(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hc_died(Ptr<usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_alloc_bandwidth(Ptr<usb_device> udev, Ptr<usb_host_config> new_config, Ptr<usb_host_interface> cur_alt, Ptr<usb_host_interface> new_alt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_check_unlink_urb(Ptr<usb_hcd> hcd, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_disable_endpoint(Ptr<usb_device> udev, Ptr<usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_end_port_resume(Ptr<usb_bus> bus, int portnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_find_raw_port_number(Ptr<usb_hcd> hcd, int port1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_flush_endpoint(Ptr<usb_device> udev, Ptr<usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_get_frame_number(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_giveback_urb(Ptr<usb_hcd> hcd, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn usb_hcd_irq(int irq, Ptr<?> __hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_is_primary_hcd(Ptr<usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_link_urb_to_ep(Ptr<usb_hcd> hcd, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_map_urb_for_dma(Ptr<usb_hcd> hcd, Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_platform_shutdown(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_poll_rh_status(Ptr<usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_reset_endpoint(Ptr<usb_device> udev, Ptr<usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_resume_root_hub(Ptr<usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_setup_local_mem(Ptr<usb_hcd> hcd, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_start_port_resume(Ptr<usb_bus> bus, int portnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_submit_urb(Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_synchronize_unlinks(Ptr<usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_hcd_unlink_urb(Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_unlink_urb_from_ep(Ptr<usb_hcd> hcd, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_unmap_urb_for_dma(Ptr<usb_hcd> hcd, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_hcd_unmap_urb_setup_for_dma(Ptr<usb_hcd> hcd, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_mon_deregister() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_mon_register((const struct usb_mon_operations*)$arg1)")
    public static int usb_mon_register(Ptr<usb_mon_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_parse_configuration(Ptr<usb_device> dev, int cfgidx, Ptr<usb_host_config> config, String buffer, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_parse_endpoint(Ptr<runtime.device> ddev, int cfgno, Ptr<usb_host_config> config, int inum, int asnum, Ptr<usb_host_interface> ifp, int num_ep, String buffer, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_parse_interface(Ptr<runtime.device> ddev, int cfgno, Ptr<usb_host_config> config, String buffer, int size, Ptr<Character> inums, Ptr<Character> nalts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_parse_ss_endpoint_companion(Ptr<runtime.device> ddev, int cfgno, int inum, int asnum, Ptr<usb_host_endpoint> ep, String buffer, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_parse_ssp_isoc_endpoint_companion(Ptr<runtime.device> ddev, int cfgno, int inum, int asnum, Ptr<usb_host_endpoint> ep, String buffer, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_phy_get_charger_current(Ptr<usb_phy> usb_phy2, Ptr<@Unsigned Integer> min, Ptr<@Unsigned Integer> max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_phy_notify_charger_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_phy_roothub> usb_phy_roothub_alloc(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<usb_phy_roothub> usb_phy_roothub_alloc_usb3_phy(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_phy_roothub_calibrate(Ptr<usb_phy_roothub> phy_roothub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_phy_roothub_exit(Ptr<usb_phy_roothub> phy_roothub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_phy_roothub_init(Ptr<usb_phy_roothub> phy_roothub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_phy_roothub_notify_connect(Ptr<usb_phy_roothub> phy_roothub, int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_phy_roothub_notify_disconnect(Ptr<usb_phy_roothub> phy_roothub, int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_phy_roothub_power_off(Ptr<usb_phy_roothub> phy_roothub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_phy_roothub_power_on(Ptr<usb_phy_roothub> phy_roothub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_phy_roothub_resume(Ptr<runtime.device> controller_dev, Ptr<usb_phy_roothub> phy_roothub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_phy_roothub_set_mode(Ptr<usb_phy_roothub> phy_roothub, PhyDefinitions.phy_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int usb_phy_roothub_suspend(Ptr<runtime.device> controller_dev, Ptr<usb_phy_roothub> phy_roothub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_phy_set_charger_current(Ptr<usb_phy> usb_phy2, @Unsigned int mA) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_phy_set_charger_state(Ptr<usb_phy> usb_phy2, usb_charger_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_phy_set_event(Ptr<usb_phy> x, @Unsigned long event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="usb_phy_uevent((const struct device*)$arg1, $arg2)")
    public static int usb_phy_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_put_hcd(Ptr<usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_put_invalidate_rhdev(Ptr<usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_put_phy(Ptr<usb_phy> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_release_bos_descriptor(Ptr<usb_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_release_interface_cache(Ptr<runtime.kref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_remove_ep_devs(Ptr<usb_host_endpoint> endpoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_remove_hcd(Ptr<usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_remove_phy(Ptr<usb_phy> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void usb_stop_hcd(Ptr<usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct usb_debug_descriptor")
    @NotUsableInJava
    public static class usb_debug_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDebugInEndpoint;
        public char bDebugOutEndpoint;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_dynid")
    @NotUsableInJava
    public static class usb_dynid
    extends Struct {
        public ListDefinitions.list_head node;
        public usb_device_id id;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_role_switch")
    @NotUsableInJava
    public static class usb_role_switch
    extends Struct {
        public runtime.device dev;
        public LockDefinitions.lock_class_key key;
        public runtime.mutex lock;
        public Ptr<runtime.module> module;
        public usb_role role;
        public boolean registered;
        public Ptr<runtime.device> usb2_port;
        public Ptr<runtime.device> usb3_port;
        public Ptr<runtime.device> udc;
        public @OriginalName(value="usb_role_switch_set_t") Ptr<?> set;
        public @OriginalName(value="usb_role_switch_get_t") Ptr<?> get;
        public boolean allow_userspace_control;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_parsed_header")
    @NotUsableInJava
    public static class usb_cdc_parsed_header
    extends Struct {
        public Ptr<usb_cdc_union_desc> usb_cdc_union_desc;
        public Ptr<usb_cdc_header_desc> usb_cdc_header_desc;
        public Ptr<usb_cdc_call_mgmt_descriptor> usb_cdc_call_mgmt_descriptor;
        public Ptr<usb_cdc_acm_descriptor> usb_cdc_acm_descriptor;
        public Ptr<usb_cdc_country_functional_desc> usb_cdc_country_functional_desc;
        public Ptr<usb_cdc_network_terminal_desc> usb_cdc_network_terminal_desc;
        public Ptr<usb_cdc_ether_desc> usb_cdc_ether_desc;
        public Ptr<usb_cdc_dmm_desc> usb_cdc_dmm_desc;
        public Ptr<usb_cdc_mdlm_desc> usb_cdc_mdlm_desc;
        public Ptr<usb_cdc_mdlm_detail_desc> usb_cdc_mdlm_detail_desc;
        public Ptr<usb_cdc_obex_desc> usb_cdc_obex_desc;
        public Ptr<usb_cdc_ncm_desc> usb_cdc_ncm_desc;
        public Ptr<usb_cdc_mbim_desc> usb_cdc_mbim_desc;
        public Ptr<usb_cdc_mbim_extended_desc> usb_cdc_mbim_extended_desc;
        public boolean phonet_magic_present;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_mbim_extended_desc")
    @NotUsableInJava
    public static class usb_cdc_mbim_extended_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public @Unsigned @OriginalName(value="__le16") short bcdMBIMExtendedVersion;
        public char bMaxOutstandingCommandMessages;
        public @Unsigned @OriginalName(value="__le16") short wMTU;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_mbim_desc")
    @NotUsableInJava
    public static class usb_cdc_mbim_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public @Unsigned @OriginalName(value="__le16") short bcdMBIMVersion;
        public @Unsigned @OriginalName(value="__le16") short wMaxControlMessage;
        public char bNumberFilters;
        public char bMaxFilterSize;
        public @Unsigned @OriginalName(value="__le16") short wMaxSegmentSize;
        public char bmNetworkCapabilities;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_ncm_desc")
    @NotUsableInJava
    public static class usb_cdc_ncm_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public @Unsigned @OriginalName(value="__le16") short bcdNcmVersion;
        public char bmNetworkCapabilities;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_obex_desc")
    @NotUsableInJava
    public static class usb_cdc_obex_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public @Unsigned @OriginalName(value="__le16") short bcdVersion;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_mdlm_detail_desc")
    @NotUsableInJava
    public static class usb_cdc_mdlm_detail_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public char bGuidDescriptorType;
        public char @Size(value=0) [] bDetailData;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_mdlm_desc")
    @NotUsableInJava
    public static class usb_cdc_mdlm_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public @Unsigned @OriginalName(value="__le16") short bcdVersion;
        public char @Size(value=16) [] bGUID;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_dmm_desc")
    @NotUsableInJava
    public static class usb_cdc_dmm_desc
    extends Struct {
        public char bFunctionLength;
        public char bDescriptorType;
        public char bDescriptorSubtype;
        public @Unsigned short bcdVersion;
        public @Unsigned @OriginalName(value="__le16") short wMaxCommand;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_ether_desc")
    @NotUsableInJava
    public static class usb_cdc_ether_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public char iMACAddress;
        public @Unsigned @OriginalName(value="__le32") int bmEthernetStatistics;
        public @Unsigned @OriginalName(value="__le16") short wMaxSegmentSize;
        public @Unsigned @OriginalName(value="__le16") short wNumberMCFilters;
        public char bNumberPowerFilters;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_network_terminal_desc")
    @NotUsableInJava
    public static class usb_cdc_network_terminal_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public char bEntityId;
        public char iName;
        public char bChannelIndex;
        public char bPhysicalInterface;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_country_functional_desc")
    @NotUsableInJava
    public static class usb_cdc_country_functional_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public char iCountryCodeRelDate;
        public @Unsigned @OriginalName(value="__le16") short wCountyCode0;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_union_desc")
    @NotUsableInJava
    public static class usb_cdc_union_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public char bMasterInterface0;
        public char bSlaveInterface0;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_acm_descriptor")
    @NotUsableInJava
    public static class usb_cdc_acm_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public char bmCapabilities;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_call_mgmt_descriptor")
    @NotUsableInJava
    public static class usb_cdc_call_mgmt_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public char bmCapabilities;
        public char bDataInterface;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_cdc_header_desc")
    @NotUsableInJava
    public static class usb_cdc_header_desc
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDescriptorSubType;
        public @Unsigned @OriginalName(value="__le16") short bcdCDC;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_sg_request")
    @NotUsableInJava
    public static class usb_sg_request
    extends Struct {
        public int status;
        public @Unsigned long bytes;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<usb_device> dev;
        public int pipe;
        public int entries;
        public Ptr<Ptr<runtime.urb>> urbs;
        public int count;
        public runtime.completion complete;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_memory")
    @NotUsableInJava
    public static class usb_memory
    extends Struct {
        public ListDefinitions.list_head memlist;
        public int vma_use_count;
        public int urb_use_count;
        public @Unsigned int size;
        public Ptr<?> mem;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma_handle;
        public @Unsigned long vm_start;
        public Ptr<usb_dev_state> ps;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_dev_state")
    @NotUsableInJava
    public static class usb_dev_state
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<usb_device> dev;
        public Ptr<runtime.file> file;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head async_pending;
        public ListDefinitions.list_head async_completed;
        public ListDefinitions.list_head memory_list;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait_for_resume;
        public @Unsigned int discsignr;
        public Ptr<runtime.pid> disc_pid;
        public Ptr<runtime.cred> cred;
        public  @OriginalName(value="sigval_t") runtime.sigval disccontext;
        public @Unsigned long ifclaimed;
        public @Unsigned int disabled_bulk_eps;
        public @Unsigned long interface_allowed_mask;
        public int not_yet_resumed;
        public boolean suspend_allowed;
        public boolean privileges_dropped;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_class_driver")
    @NotUsableInJava
    public static class usb_class_driver
    extends Struct {
        public String name;
        public Ptr<?> devnode;
        public Ptr<FileDefinitions.file_operations> fops;
        public int minor_base;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_port")
    @NotUsableInJava
    public static class usb_port
    extends Struct {
        public Ptr<usb_device> child;
        public runtime.device dev;
        public Ptr<usb_dev_state> port_owner;
        public Ptr<usb_port> peer;
        public Ptr<misc.typec_connector> connector;
        public Ptr<DevDefinitions.dev_pm_qos_request> req;
        public usb_port_connect_type connect_type;
        public usb_device_state state;
        public Ptr<KernfsDefinitions.kernfs_node> state_kn;
        public @Unsigned @OriginalName(value="usb_port_location_t") int location;
        public runtime.mutex status_lock;
        public @Unsigned int over_current_count;
        public char portnum;
        public @Unsigned int quirks;
        public @Unsigned int early_stop;
        public @Unsigned int ignore_event;
        public @Unsigned int is_superspeed;
        public @Unsigned int usb3_lpm_u1_permit;
        public @Unsigned int usb3_lpm_u2_permit;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_hub")
    @NotUsableInJava
    public static class usb_hub
    extends Struct {
        public Ptr<runtime.device> intfdev;
        public Ptr<usb_device> hdev;
        public runtime.kref kref;
        public Ptr<runtime.urb> urb;
        public Ptr<char @Size(value=8) []> buffer;
        public Ptr<misc.status_of_usb_hub> status;
        public runtime.mutex status_mutex;
        public int error;
        public int nerrors;
        public @Unsigned long @Size(value=1) [] event_bits;
        public @Unsigned long @Size(value=1) [] change_bits;
        public @Unsigned long @Size(value=1) [] removed_bits;
        public @Unsigned long @Size(value=1) [] wakeup_bits;
        public @Unsigned long @Size(value=1) [] power_bits;
        public @Unsigned long @Size(value=1) [] child_usage_bits;
        public @Unsigned long @Size(value=1) [] warm_reset_bits;
        public Ptr<usb_hub_descriptor> descriptor;
        public usb_tt tt;
        public @Unsigned int mA_per_port;
        public @Unsigned int wakeup_enabled_descendants;
        public @Unsigned int limited_power;
        public @Unsigned int quiescing;
        public @Unsigned int disconnected;
        public @Unsigned int in_reset;
        public @Unsigned int quirk_disable_autosuspend;
        public @Unsigned int quirk_check_port_auto_suspend;
        public @Unsigned int has_indicators;
        public char @Size(value=31) [] indicator;
        public DelayedDefinitions.delayed_work leds;
        public DelayedDefinitions.delayed_work init_work;
        public misc.work_struct events;
        public  @OriginalName(value="spinlock_t") runtime.spinlock irq_urb_lock;
        public TimerDefinitions.timer_list irq_urb_retry;
        public Ptr<Ptr<usb_port>> ports;
        public ListDefinitions.list_head onboard_devs;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_tt_clear")
    @NotUsableInJava
    public static class usb_tt_clear
    extends Struct {
        public ListDefinitions.list_head clear_list;
        public @Unsigned int tt;
        public @Unsigned short devinfo;
        public Ptr<usb_hcd> hcd;
        public Ptr<usb_host_endpoint> ep;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_hub_status")
    @NotUsableInJava
    public static class usb_hub_status
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short wHubStatus;
        public @Unsigned @OriginalName(value="__le16") short wHubChange;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_port_status")
    @NotUsableInJava
    public static class usb_port_status
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short wPortStatus;
        public @Unsigned @OriginalName(value="__le16") short wPortChange;
        public @Unsigned @OriginalName(value="__le32") int dwExtPortStatus;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_driver")
    @NotUsableInJava
    public static class usb_driver
    extends Struct {
        public String name;
        public Ptr<?> probe;
        public Ptr<?> disconnect;
        public Ptr<?> unlocked_ioctl;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> reset_resume;
        public Ptr<?> pre_reset;
        public Ptr<?> post_reset;
        public Ptr<?> shutdown;
        public Ptr<usb_device_id> id_table;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> dev_groups;
        public usb_dynids dynids;
        public DeviceDefinitions.device_driver driver;
        public @Unsigned int no_dynamic_id;
        public @Unsigned int supports_autosuspend;
        public @Unsigned int disable_hub_initiated_lpm;
        public @Unsigned int soft_unbind;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_dynids")
    @NotUsableInJava
    public static class usb_dynids
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="enum usb_port_connect_type")
    public static enum usb_port_connect_type implements Enum<usb_port_connect_type>,
    TypedEnum<usb_port_connect_type, Integer>
    {
        USB_PORT_CONNECT_TYPE_UNKNOWN,
        USB_PORT_CONNECT_TYPE_HOT_PLUG,
        USB_PORT_CONNECT_TYPE_HARD_WIRED,
        USB_PORT_NOT_USED;

    }

    @Type(noCCodeGeneration=true, cType="struct usb_set_sel_req")
    @NotUsableInJava
    public static class usb_set_sel_req
    extends Struct {
        public char u1_sel;
        public char u1_pel;
        public @Unsigned @OriginalName(value="__le16") short u2_sel;
        public @Unsigned @OriginalName(value="__le16") short u2_pel;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_qualifier_descriptor")
    @NotUsableInJava
    public static class usb_qualifier_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public @Unsigned @OriginalName(value="__le16") short bcdUSB;
        public char bDeviceClass;
        public char bDeviceSubClass;
        public char bDeviceProtocol;
        public char bMaxPacketSize0;
        public char bNumConfigurations;
        public char bRESERVED;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_string_descriptor")
    @NotUsableInJava
    public static class usb_string_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        @InlineUnion(value=21846)
        public @InlineUnion(value=21846) @Unsigned @OriginalName(value="__le16") short legacy_padding;
        @InlineUnion(value=21846)
        public  @InlineUnion(value=21846) AnonDefinitions.anon_member_of_anon_member_of_usb_string_descriptor anon2$1;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ohci_pdata")
    @NotUsableInJava
    public static class usb_ohci_pdata
    extends Struct {
        public @Unsigned int big_endian_desc;
        public @Unsigned int big_endian_mmio;
        public @Unsigned int no_big_frame_no;
        public @Unsigned int num_ports;
        public Ptr<?> power_on;
        public Ptr<?> power_off;
        public Ptr<?> power_suspend;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ehci_pdata")
    @NotUsableInJava
    public static class usb_ehci_pdata
    extends Struct {
        public int caps_offset;
        public @Unsigned int has_tt;
        public @Unsigned int has_synopsys_hc_bug;
        public @Unsigned int big_endian_desc;
        public @Unsigned int big_endian_mmio;
        public @Unsigned int no_io_watchdog;
        public @Unsigned int reset_on_resume;
        public @Unsigned int dma_mask_64;
        public @Unsigned int spurious_oc;
        public Ptr<?> power_on;
        public Ptr<?> power_off;
        public Ptr<?> power_suspend;
        public Ptr<?> pre_setup;
    }

    @Type(noCCodeGeneration=true, cType="enum usb_dr_mode")
    public static enum usb_dr_mode implements Enum<usb_dr_mode>,
    TypedEnum<usb_dr_mode, Integer>
    {
        USB_DR_MODE_UNKNOWN,
        USB_DR_MODE_HOST,
        USB_DR_MODE_PERIPHERAL,
        USB_DR_MODE_OTG;

    }

    @Type(noCCodeGeneration=true, cType="struct usb_otg_caps")
    @NotUsableInJava
    public static class usb_otg_caps
    extends Struct {
        public @Unsigned short otg_rev;
        public boolean hnp_support;
        public boolean srp_support;
        public boolean adp_support;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_gadget_driver")
    @NotUsableInJava
    public static class usb_gadget_driver
    extends Struct {
        public String function;
        public usb_device_speed max_speed;
        public Ptr<?> bind;
        public Ptr<?> unbind;
        public Ptr<?> setup;
        public Ptr<?> disconnect;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> reset;
        public DeviceDefinitions.device_driver driver;
        public String udc_name;
        public @Unsigned int match_existing_only;
        public boolean is_bound;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_gadget")
    @NotUsableInJava
    public static class usb_gadget
    extends Struct {
        public misc.work_struct work;
        public @OriginalName(value="usb_udc") Ptr<?> udc;
        public Ptr<usb_gadget_ops> ops;
        public Ptr<usb_ep> ep0;
        public ListDefinitions.list_head ep_list;
        public usb_device_speed speed;
        public usb_device_speed max_speed;
        public usb_ssp_rate ssp_rate;
        public usb_ssp_rate max_ssp_rate;
        public usb_device_state state;
        public String name;
        public runtime.device dev;
        public @Unsigned int isoch_delay;
        public @Unsigned int out_epnum;
        public @Unsigned int in_epnum;
        public @Unsigned int mA;
        public Ptr<usb_otg_caps> otg_caps;
        public @Unsigned int sg_supported;
        public @Unsigned int is_otg;
        public @Unsigned int is_a_peripheral;
        public @Unsigned int b_hnp_enable;
        public @Unsigned int a_hnp_support;
        public @Unsigned int a_alt_hnp_support;
        public @Unsigned int hnp_polling_support;
        public @Unsigned int host_request_flag;
        public @Unsigned int quirk_ep_out_aligned_size;
        public @Unsigned int quirk_altset_not_supp;
        public @Unsigned int quirk_stall_not_supp;
        public @Unsigned int quirk_zlp_not_supp;
        public @Unsigned int quirk_avoids_skb_reserve;
        public @Unsigned int is_selfpowered;
        public @Unsigned int deactivated;
        public @Unsigned int connected;
        public @Unsigned int lpm_capable;
        public @Unsigned int wakeup_capable;
        public @Unsigned int wakeup_armed;
        public int irq;
        public int id_number;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_gadget_ops")
    @NotUsableInJava
    public static class usb_gadget_ops
    extends Struct {
        public Ptr<?> get_frame;
        public Ptr<?> wakeup;
        public Ptr<?> func_wakeup;
        public Ptr<?> set_remote_wakeup;
        public Ptr<?> set_selfpowered;
        public Ptr<?> vbus_session;
        public Ptr<?> vbus_draw;
        public Ptr<?> pullup;
        public Ptr<?> ioctl;
        public Ptr<?> get_config_params;
        public Ptr<?> udc_start;
        public Ptr<?> udc_stop;
        public Ptr<?> udc_set_speed;
        public Ptr<?> udc_set_ssp_rate;
        public Ptr<?> udc_async_callbacks;
        public Ptr<?> match_ep;
        public Ptr<?> check_config;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_dcd_config_params")
    @NotUsableInJava
    public static class usb_dcd_config_params
    extends Struct {
        public char bU1devExitLat;
        public @Unsigned @OriginalName(value="__le16") short bU2DevExitLat;
        public char besl_baseline;
        public char besl_deep;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ep_caps")
    @NotUsableInJava
    public static class usb_ep_caps
    extends Struct {
        public @Unsigned int type_control;
        public @Unsigned int type_iso;
        public @Unsigned int type_bulk;
        public @Unsigned int type_int;
        public @Unsigned int dir_in;
        public @Unsigned int dir_out;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ep_ops")
    @NotUsableInJava
    public static class usb_ep_ops
    extends Struct {
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> dispose;
        public Ptr<?> alloc_request;
        public Ptr<?> free_request;
        public Ptr<?> queue;
        public Ptr<?> dequeue;
        public Ptr<?> set_halt;
        public Ptr<?> set_wedge;
        public Ptr<?> fifo_status;
        public Ptr<?> fifo_flush;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ep")
    @NotUsableInJava
    public static class usb_ep
    extends Struct {
        public Ptr<?> driver_data;
        public String name;
        public Ptr<usb_ep_ops> ops;
        public Ptr<usb_endpoint_descriptor> desc;
        public Ptr<usb_ss_ep_comp_descriptor> comp_desc;
        public ListDefinitions.list_head ep_list;
        public usb_ep_caps caps;
        public boolean claimed;
        public boolean enabled;
        public @Unsigned int mult;
        public @Unsigned int maxburst;
        public char address;
        public @Unsigned short maxpacket;
        public @Unsigned short maxpacket_limit;
        public @Unsigned short max_streams;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_request")
    @NotUsableInJava
    public static class usb_request
    extends Struct {
        public Ptr<?> buf;
        public @Unsigned int length;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
        public Ptr<runtime.scatterlist> sg;
        public @Unsigned int num_sgs;
        public @Unsigned int num_mapped_sgs;
        public @Unsigned int stream_id;
        public @Unsigned int is_last;
        public @Unsigned int no_interrupt;
        public @Unsigned int zero;
        public @Unsigned int short_not_ok;
        public @Unsigned int dma_mapped;
        public @Unsigned int sg_was_mapped;
        public Ptr<?> complete;
        public Ptr<?> context;
        public ListDefinitions.list_head list;
        public @Unsigned int frame_number;
        public int status;
        public @Unsigned int actual;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_role_switch_desc")
    @NotUsableInJava
    public static class usb_role_switch_desc
    extends Struct {
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public Ptr<runtime.device> usb2_port;
        public Ptr<runtime.device> usb3_port;
        public Ptr<runtime.device> udc;
        public @OriginalName(value="usb_role_switch_set_t") Ptr<?> set;
        public @OriginalName(value="usb_role_switch_get_t") Ptr<?> get;
        public boolean allow_userspace_control;
        public Ptr<?> driver_data;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="enum usb_role")
    public static enum usb_role implements Enum<usb_role>,
    TypedEnum<usb_role, Integer>
    {
        USB_ROLE_NONE,
        USB_ROLE_HOST,
        USB_ROLE_DEVICE;

    }

    @Type(noCCodeGeneration=true, cType="struct usb_phy_roothub")
    @NotUsableInJava
    public static class usb_phy_roothub
    extends Struct {
        public Ptr<runtime.phy> phy;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_device_driver")
    @NotUsableInJava
    public static class usb_device_driver
    extends Struct {
        public String name;
        public Ptr<?> match;
        public Ptr<?> probe;
        public Ptr<?> disconnect;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> choose_configuration;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> dev_groups;
        public DeviceDefinitions.device_driver driver;
        public Ptr<usb_device_id> id_table;
        public @Unsigned int supports_autosuspend;
        public @Unsigned int generic_subclass;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_device_id")
    @NotUsableInJava
    public static class usb_device_id
    extends Struct {
        public @Unsigned short match_flags;
        public @Unsigned short idVendor;
        public @Unsigned short idProduct;
        public @Unsigned short bcdDevice_lo;
        public @Unsigned short bcdDevice_hi;
        public char bDeviceClass;
        public char bDeviceSubClass;
        public char bDeviceProtocol;
        public char bInterfaceClass;
        public char bInterfaceSubClass;
        public char bInterfaceProtocol;
        public char bInterfaceNumber;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_info;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_dev_cap_header")
    @NotUsableInJava
    public static class usb_dev_cap_header
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDevCapabilityType;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_descriptor_header")
    @NotUsableInJava
    public static class usb_descriptor_header
    extends Struct {
        public char bLength;
        public char bDescriptorType;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_otg")
    @NotUsableInJava
    public static class usb_otg
    extends Struct {
        public char default_a;
        public Ptr<runtime.phy> phy;
        public Ptr<usb_phy> usb_phy;
        public Ptr<usb_bus> host;
        public Ptr<usb_gadget> gadget;
        public usb_otg_state state;
        public Ptr<?> set_host;
        public Ptr<?> set_peripheral;
        public Ptr<?> set_vbus;
        public Ptr<?> start_srp;
        public Ptr<?> start_hnp;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_charger_current")
    @NotUsableInJava
    public static class usb_charger_current
    extends Struct {
        public @Unsigned int sdp_min;
        public @Unsigned int sdp_max;
        public @Unsigned int dcp_min;
        public @Unsigned int dcp_max;
        public @Unsigned int cdp_min;
        public @Unsigned int cdp_max;
        public @Unsigned int aca_min;
        public @Unsigned int aca_max;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_phy_io_ops")
    @NotUsableInJava
    public static class usb_phy_io_ops
    extends Struct {
        public Ptr<?> read;
        public Ptr<?> write;
    }

    @Type(noCCodeGeneration=true, cType="enum usb_otg_state")
    public static enum usb_otg_state implements Enum<usb_otg_state>,
    TypedEnum<usb_otg_state, Integer>
    {
        OTG_STATE_UNDEFINED,
        OTG_STATE_B_IDLE,
        OTG_STATE_B_SRP_INIT,
        OTG_STATE_B_PERIPHERAL,
        OTG_STATE_B_WAIT_ACON,
        OTG_STATE_B_HOST,
        OTG_STATE_A_IDLE,
        OTG_STATE_A_WAIT_VRISE,
        OTG_STATE_A_WAIT_BCON,
        OTG_STATE_A_HOST,
        OTG_STATE_A_SUSPEND,
        OTG_STATE_A_PERIPHERAL,
        OTG_STATE_A_WAIT_VFALL,
        OTG_STATE_A_VBUS_ERR;

    }

    @Type(noCCodeGeneration=true, cType="enum usb_phy_type")
    public static enum usb_phy_type implements Enum<usb_phy_type>,
    TypedEnum<usb_phy_type, Integer>
    {
        USB_PHY_TYPE_UNDEFINED,
        USB_PHY_TYPE_USB2,
        USB_PHY_TYPE_USB3;

    }

    @Type(noCCodeGeneration=true, cType="enum usb_phy_events")
    public static enum usb_phy_events implements Enum<usb_phy_events>,
    TypedEnum<usb_phy_events, Integer>
    {
        USB_EVENT_NONE,
        USB_EVENT_VBUS,
        USB_EVENT_ID,
        USB_EVENT_CHARGER,
        USB_EVENT_ENUMERATED;

    }

    @Type(noCCodeGeneration=true, cType="enum usb_charger_state")
    public static enum usb_charger_state implements Enum<usb_charger_state>,
    TypedEnum<usb_charger_state, Integer>
    {
        USB_CHARGER_DEFAULT,
        USB_CHARGER_PRESENT,
        USB_CHARGER_ABSENT;

    }

    @Type(noCCodeGeneration=true, cType="enum usb_charger_type")
    public static enum usb_charger_type implements Enum<usb_charger_type>,
    TypedEnum<usb_charger_type, Integer>
    {
        UNKNOWN_TYPE,
        SDP_TYPE,
        DCP_TYPE,
        CDP_TYPE,
        ACA_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="struct usb_mon_operations")
    @NotUsableInJava
    public static class usb_mon_operations
    extends Struct {
        public Ptr<?> urb_submit;
        public Ptr<?> urb_submit_error;
        public Ptr<?> urb_complete;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_hub_descriptor")
    @NotUsableInJava
    public static class usb_hub_descriptor
    extends Struct {
        public char bDescLength;
        public char bDescriptorType;
        public char bNbrPorts;
        public @Unsigned @OriginalName(value="__le16") short wHubCharacteristics;
        public char bPwrOn2PwrGood;
        public char bHubContrCurrent;
        public UDefinitions.u_of_usb_hub_descriptor u;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_phy")
    @NotUsableInJava
    public static class usb_phy
    extends Struct {
        public Ptr<runtime.device> dev;
        public String label;
        public @Unsigned int flags;
        public usb_phy_type type;
        public usb_phy_events last_event;
        public Ptr<usb_otg> otg;
        public Ptr<runtime.device> io_dev;
        public Ptr<usb_phy_io_ops> io_ops;
        public Ptr<?> io_priv;
        public Ptr<ExtconDefinitions.extcon_dev> edev;
        public Ptr<ExtconDefinitions.extcon_dev> id_edev;
        public misc.notifier_block vbus_nb;
        public misc.notifier_block id_nb;
        public misc.notifier_block type_nb;
        public usb_charger_type chg_type;
        public usb_charger_state chg_state;
        public usb_charger_current chg_cur;
        public misc.work_struct chg_work;
        public AtomicDefinitions.atomic_notifier_head notifier;
        public @Unsigned short port_status;
        public @Unsigned short port_change;
        public ListDefinitions.list_head head;
        public Ptr<?> init;
        public Ptr<?> shutdown;
        public Ptr<?> set_vbus;
        public Ptr<?> set_power;
        public Ptr<?> set_suspend;
        public Ptr<?> set_wakeup;
        public Ptr<?> notify_connect;
        public Ptr<?> notify_disconnect;
        public Ptr<?> charger_detect;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_hcd")
    @NotUsableInJava
    public static class usb_hcd
    extends Struct {
        public usb_bus self;
        public runtime.kref kref;
        public String product_desc;
        public int speed;
        public char @Size(value=24) [] irq_descr;
        public TimerDefinitions.timer_list rh_timer;
        public Ptr<runtime.urb> status_urb;
        public misc.work_struct wakeup_work;
        public misc.work_struct died_work;
        public Ptr<misc.hc_driver> driver;
        public Ptr<usb_phy> usb_phy;
        public Ptr<usb_phy_roothub> phy_roothub;
        public @Unsigned long flags;
        public usb_dev_authorize_policy dev_policy;
        public @Unsigned int rh_registered;
        public @Unsigned int rh_pollable;
        public @Unsigned int msix_enabled;
        public @Unsigned int msi_enabled;
        public @Unsigned int skip_phy_initialization;
        public @Unsigned int uses_new_polling;
        public @Unsigned int has_tt;
        public @Unsigned int amd_resume_bug;
        public @Unsigned int can_do_streams;
        public @Unsigned int tpl_support;
        public @Unsigned int cant_recv_wakeups;
        public @Unsigned int irq;
        public Ptr<?> regs;
        public @Unsigned @OriginalName(value="resource_size_t") long rsrc_start;
        public @Unsigned @OriginalName(value="resource_size_t") long rsrc_len;
        public @Unsigned int power_budget;
        public misc.giveback_urb_bh high_prio_bh;
        public misc.giveback_urb_bh low_prio_bh;
        public Ptr<runtime.mutex> address0_mutex;
        public Ptr<runtime.mutex> bandwidth_mutex;
        public Ptr<usb_hcd> shared_hcd;
        public Ptr<usb_hcd> primary_hcd;
        public Ptr<DmaDefinitions.dma_pool> @Size(value=4) [] pool;
        public int state;
        public Ptr<GenDefinitions.gen_pool> localmem_pool;
        public @Unsigned long @Size(value=0) [] hcd_priv;
    }

    @Type(noCCodeGeneration=true, cType="enum usb_dev_authorize_policy")
    public static enum usb_dev_authorize_policy implements Enum<usb_dev_authorize_policy>,
    TypedEnum<usb_dev_authorize_policy, Integer>
    {
        USB_DEVICE_AUTHORIZE_NONE,
        USB_DEVICE_AUTHORIZE_ALL,
        USB_DEVICE_AUTHORIZE_INTERNAL;

    }

    @Type(noCCodeGeneration=true, cType="enum usb_led_event")
    public static enum usb_led_event implements Enum<usb_led_event>,
    TypedEnum<usb_led_event, Integer>
    {
        USB_LED_EVENT_HOST,
        USB_LED_EVENT_GADGET;

    }

    @Type(noCCodeGeneration=true, cType="struct usb_anchor")
    @NotUsableInJava
    public static class usb_anchor
    extends Struct {
        public ListDefinitions.list_head urb_list;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public AtomicDefinitions.atomic_t suspend_wakeups;
        public @Unsigned int poisoned;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_iso_packet_descriptor")
    @NotUsableInJava
    public static class usb_iso_packet_descriptor
    extends Struct {
        public @Unsigned int offset;
        public @Unsigned int length;
        public @Unsigned int actual_length;
        public int status;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_tt")
    @NotUsableInJava
    public static class usb_tt
    extends Struct {
        public Ptr<usb_device> hub;
        public int multi;
        public @Unsigned int think_time;
        public Ptr<?> hcpriv;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head clear_list;
        public misc.work_struct clear_work;
    }

    @Type(noCCodeGeneration=true, cType="enum usb_link_tunnel_mode")
    public static enum usb_link_tunnel_mode implements Enum<usb_link_tunnel_mode>,
    TypedEnum<usb_link_tunnel_mode, Integer>
    {
        USB_LINK_UNKNOWN,
        USB_LINK_NATIVE,
        USB_LINK_TUNNELED;

    }

    @Type(noCCodeGeneration=true, cType="struct usb_device")
    @NotUsableInJava
    public static class usb_device
    extends Struct {
        public int devnum;
        public char @Size(value=16) [] devpath;
        public @Unsigned int route;
        public usb_device_state state;
        public usb_device_speed speed;
        public @Unsigned int rx_lanes;
        public @Unsigned int tx_lanes;
        public usb_ssp_rate ssp_rate;
        public Ptr<usb_tt> tt;
        public int ttport;
        public @Unsigned int @Size(value=2) [] toggle;
        public Ptr<usb_device> parent;
        public Ptr<usb_bus> bus;
        public usb_host_endpoint ep0;
        public runtime.device dev;
        public usb_device_descriptor descriptor;
        public Ptr<usb_host_bos> bos;
        public Ptr<usb_host_config> config;
        public Ptr<usb_host_config> actconfig;
        public Ptr<usb_host_endpoint> @Size(value=16) [] ep_in;
        public Ptr<usb_host_endpoint> @Size(value=16) [] ep_out;
        public Ptr<String> rawdescriptors;
        public @Unsigned short bus_mA;
        public char portnum;
        public char level;
        public char devaddr;
        public @Unsigned int can_submit;
        public @Unsigned int persist_enabled;
        public @Unsigned int reset_in_progress;
        public @Unsigned int have_langid;
        public @Unsigned int authorized;
        public @Unsigned int authenticated;
        public @Unsigned int lpm_capable;
        public @Unsigned int lpm_devinit_allow;
        public @Unsigned int usb2_hw_lpm_capable;
        public @Unsigned int usb2_hw_lpm_besl_capable;
        public @Unsigned int usb2_hw_lpm_enabled;
        public @Unsigned int usb2_hw_lpm_allowed;
        public @Unsigned int usb3_lpm_u1_enabled;
        public @Unsigned int usb3_lpm_u2_enabled;
        public int string_langid;
        public String product;
        public String manufacturer;
        public String serial;
        public ListDefinitions.list_head filelist;
        public int maxchild;
        public @Unsigned int quirks;
        public AtomicDefinitions.atomic_t urbnum;
        public @Unsigned long active_duration;
        public @Unsigned long connect_time;
        public @Unsigned int do_remote_wakeup;
        public @Unsigned int reset_resume;
        public @Unsigned int port_is_suspended;
        public usb_link_tunnel_mode tunnel_mode;
        public int slot_id;
        public misc.usb2_lpm_parameters l1_params;
        public misc.usb3_lpm_parameters u1_params;
        public misc.usb3_lpm_parameters u2_params;
        public @Unsigned int lpm_disable_count;
        public @Unsigned short hub_delay;
        public @Unsigned int use_generic_driver;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_bus")
    @NotUsableInJava
    public static class usb_bus
    extends Struct {
        public Ptr<runtime.device> controller;
        public Ptr<runtime.device> sysdev;
        public int busnum;
        public String bus_name;
        public char uses_pio_for_control;
        public char otg_port;
        public @Unsigned int is_b_host;
        public @Unsigned int b_hnp_enable;
        public @Unsigned int no_stop_on_short;
        public @Unsigned int no_sg_constraint;
        public @Unsigned int sg_tablesize;
        public int devnum_next;
        public runtime.mutex devnum_next_mutex;
        public @Unsigned long @Size(value=2) [] devmap;
        public Ptr<usb_device> root_hub;
        public Ptr<usb_bus> hs_companion;
        public int bandwidth_allocated;
        public int bandwidth_int_reqs;
        public int bandwidth_isoc_reqs;
        public @Unsigned int resuming_ports;
        public @OriginalName(value="mon_bus") Ptr<?> mon_bus;
        public int monitored;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_host_bos")
    @NotUsableInJava
    public static class usb_host_bos
    extends Struct {
        public Ptr<usb_bos_descriptor> desc;
        public Ptr<usb_ext_cap_descriptor> ext_cap;
        public Ptr<usb_ss_cap_descriptor> ss_cap;
        public Ptr<usb_ssp_cap_descriptor> ssp_cap;
        public Ptr<usb_ss_container_id_descriptor> ss_id;
        public Ptr<usb_ptm_cap_descriptor> ptm_cap;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_host_config")
    @NotUsableInJava
    public static class usb_host_config
    extends Struct {
        public usb_config_descriptor desc;
        public String string;
        public Ptr<usb_interface_assoc_descriptor> @Size(value=16) [] intf_assoc;
        public Ptr<usb_interface> @Size(value=32) [] _interface;
        public Ptr<usb_interface_cache> @Size(value=32) [] intf_cache;
        public String extra;
        public int extralen;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_interface_cache")
    @NotUsableInJava
    public static class usb_interface_cache
    extends Struct {
        public @Unsigned int num_altsetting;
        public runtime.kref ref;
        public usb_host_interface @Size(value=0) [] altsetting;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_interface")
    @NotUsableInJava
    public static class usb_interface
    extends Struct {
        public Ptr<usb_host_interface> altsetting;
        public Ptr<usb_host_interface> cur_altsetting;
        public @Unsigned int num_altsetting;
        public Ptr<usb_interface_assoc_descriptor> intf_assoc;
        public int minor;
        public usb_interface_condition condition;
        public @Unsigned int sysfs_files_created;
        public @Unsigned int ep_devs_created;
        public @Unsigned int unregistering;
        public @Unsigned int needs_remote_wakeup;
        public @Unsigned int needs_altsetting0;
        public @Unsigned int needs_binding;
        public @Unsigned int resetting_device;
        public @Unsigned int authorized;
        public usb_wireless_status wireless_status;
        public misc.work_struct wireless_status_work;
        public runtime.device dev;
        public Ptr<runtime.device> usb_dev;
        public misc.work_struct reset_ws;
    }

    @Type(noCCodeGeneration=true, cType="enum usb_wireless_status")
    public static enum usb_wireless_status implements Enum<usb_wireless_status>,
    TypedEnum<usb_wireless_status, Integer>
    {
        USB_WIRELESS_STATUS_NA,
        USB_WIRELESS_STATUS_DISCONNECTED,
        USB_WIRELESS_STATUS_CONNECTED;

    }

    @Type(noCCodeGeneration=true, cType="enum usb_interface_condition")
    public static enum usb_interface_condition implements Enum<usb_interface_condition>,
    TypedEnum<usb_interface_condition, Integer>
    {
        USB_INTERFACE_UNBOUND,
        USB_INTERFACE_BINDING,
        USB_INTERFACE_BOUND,
        USB_INTERFACE_UNBINDING;

    }

    @Type(noCCodeGeneration=true, cType="struct usb_host_interface")
    @NotUsableInJava
    public static class usb_host_interface
    extends Struct {
        public usb_interface_descriptor desc;
        public int extralen;
        public String extra;
        public Ptr<usb_host_endpoint> endpoint;
        public String string;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_host_endpoint")
    @NotUsableInJava
    public static class usb_host_endpoint
    extends Struct {
        public usb_endpoint_descriptor desc;
        public usb_ss_ep_comp_descriptor ss_ep_comp;
        public usb_ssp_isoc_ep_comp_descriptor ssp_isoc_ep_comp;
        public ListDefinitions.list_head urb_list;
        public Ptr<?> hcpriv;
        public Ptr<EpDefinitions.ep_device> ep_dev;
        public String extra;
        public int extralen;
        public int enabled;
        public int streams;
    }

    @Type(noCCodeGeneration=true, cType="enum usb_ssp_rate")
    public static enum usb_ssp_rate implements Enum<usb_ssp_rate>,
    TypedEnum<usb_ssp_rate, Integer>
    {
        USB_SSP_GEN_UNKNOWN,
        USB_SSP_GEN_2x1,
        USB_SSP_GEN_1x2,
        USB_SSP_GEN_2x2;

    }

    @Type(noCCodeGeneration=true, cType="enum usb_device_state")
    public static enum usb_device_state implements Enum<usb_device_state>,
    TypedEnum<usb_device_state, Integer>
    {
        USB_STATE_NOTATTACHED,
        USB_STATE_ATTACHED,
        USB_STATE_POWERED,
        USB_STATE_RECONNECTING,
        USB_STATE_UNAUTHENTICATED,
        USB_STATE_DEFAULT,
        USB_STATE_ADDRESS,
        USB_STATE_CONFIGURED,
        USB_STATE_SUSPENDED;

    }

    @Type(noCCodeGeneration=true, cType="enum usb_device_speed")
    public static enum usb_device_speed implements Enum<usb_device_speed>,
    TypedEnum<usb_device_speed, Integer>
    {
        USB_SPEED_UNKNOWN,
        USB_SPEED_LOW,
        USB_SPEED_FULL,
        USB_SPEED_HIGH,
        USB_SPEED_WIRELESS,
        USB_SPEED_SUPER,
        USB_SPEED_SUPER_PLUS;

    }

    @Type(noCCodeGeneration=true, cType="struct usb_ptm_cap_descriptor")
    @NotUsableInJava
    public static class usb_ptm_cap_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDevCapabilityType;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ssp_cap_descriptor")
    @NotUsableInJava
    public static class usb_ssp_cap_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDevCapabilityType;
        public char bReserved;
        public @Unsigned @OriginalName(value="__le32") int bmAttributes;
        public @Unsigned @OriginalName(value="__le16") short wFunctionalitySupport;
        public @Unsigned @OriginalName(value="__le16") short wReserved;
        @InlineUnion(value=21340)
        public @InlineUnion(value=21340) @Unsigned @OriginalName(value="__le32") int legacy_padding;
        @InlineUnion(value=21340)
        public  @InlineUnion(value=21340) AnonDefinitions.anon_member_of_anon_member_of_usb_ssp_cap_descriptor anon7$1;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ss_container_id_descriptor")
    @NotUsableInJava
    public static class usb_ss_container_id_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDevCapabilityType;
        public char bReserved;
        public char @Size(value=16) [] ContainerID;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ss_cap_descriptor")
    @NotUsableInJava
    public static class usb_ss_cap_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDevCapabilityType;
        public char bmAttributes;
        public @Unsigned @OriginalName(value="__le16") short wSpeedSupported;
        public char bFunctionalitySupport;
        public char bU1devExitLat;
        public @Unsigned @OriginalName(value="__le16") short bU2DevExitLat;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ext_cap_descriptor")
    @NotUsableInJava
    public static class usb_ext_cap_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bDevCapabilityType;
        public @Unsigned @OriginalName(value="__le32") int bmAttributes;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_bos_descriptor")
    @NotUsableInJava
    public static class usb_bos_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public @Unsigned @OriginalName(value="__le16") short wTotalLength;
        public char bNumDeviceCaps;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_interface_assoc_descriptor")
    @NotUsableInJava
    public static class usb_interface_assoc_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bFirstInterface;
        public char bInterfaceCount;
        public char bFunctionClass;
        public char bFunctionSubClass;
        public char bFunctionProtocol;
        public char iFunction;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ss_ep_comp_descriptor")
    @NotUsableInJava
    public static class usb_ss_ep_comp_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bMaxBurst;
        public char bmAttributes;
        public @Unsigned @OriginalName(value="__le16") short wBytesPerInterval;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ssp_isoc_ep_comp_descriptor")
    @NotUsableInJava
    public static class usb_ssp_isoc_ep_comp_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public @Unsigned @OriginalName(value="__le16") short wReseved;
        public @Unsigned @OriginalName(value="__le32") int dwBytesPerInterval;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_endpoint_descriptor")
    @NotUsableInJava
    public static class usb_endpoint_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bEndpointAddress;
        public char bmAttributes;
        public @Unsigned @OriginalName(value="__le16") short wMaxPacketSize;
        public char bInterval;
        public char bRefresh;
        public char bSynchAddress;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_interface_descriptor")
    @NotUsableInJava
    public static class usb_interface_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public char bInterfaceNumber;
        public char bAlternateSetting;
        public char bNumEndpoints;
        public char bInterfaceClass;
        public char bInterfaceSubClass;
        public char bInterfaceProtocol;
        public char iInterface;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_config_descriptor")
    @NotUsableInJava
    public static class usb_config_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public @Unsigned @OriginalName(value="__le16") short wTotalLength;
        public char bNumInterfaces;
        public char bConfigurationValue;
        public char iConfiguration;
        public char bmAttributes;
        public char bMaxPower;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_device_descriptor")
    @NotUsableInJava
    public static class usb_device_descriptor
    extends Struct {
        public char bLength;
        public char bDescriptorType;
        public @Unsigned @OriginalName(value="__le16") short bcdUSB;
        public char bDeviceClass;
        public char bDeviceSubClass;
        public char bDeviceProtocol;
        public char bMaxPacketSize0;
        public @Unsigned @OriginalName(value="__le16") short idVendor;
        public @Unsigned @OriginalName(value="__le16") short idProduct;
        public @Unsigned @OriginalName(value="__le16") short bcdDevice;
        public char iManufacturer;
        public char iProduct;
        public char iSerialNumber;
        public char bNumConfigurations;
    }

    @Type(noCCodeGeneration=true, cType="struct usb_ctrlrequest")
    @NotUsableInJava
    public static class usb_ctrlrequest
    extends Struct {
        public char bRequestType;
        public char bRequest;
        public @Unsigned @OriginalName(value="__le16") short wValue;
        public @Unsigned @OriginalName(value="__le16") short wIndex;
        public @Unsigned @OriginalName(value="__le16") short wLength;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int serial_number; long long unsigned int reserved; }")
    @NotUsableInJava
    public static class usb_of_device_path_of_edd_device_params
    extends Struct {
        public @Unsigned long serial_number;
        public @Unsigned long reserved;
    }
}

