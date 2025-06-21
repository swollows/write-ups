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
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VgaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_switcheroo_client_fb_set(Ptr<PciDefinitions.pci_dev> pdev, Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vga_switcheroo_client_probe_defer(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switcheroo_debugfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vga_switcheroo_debugfs_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long vga_switcheroo_debugfs_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_switcheroo_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_switcheroo_fini_domain_pm_ops(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static vga_switcheroo_state vga_switcheroo_get_client_state(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static vga_switcheroo_handler_flags_t vga_switcheroo_handler_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switcheroo_init_domain_pm_ops(Ptr<runtime.device> dev, Ptr<DevDefinitions.dev_pm_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switcheroo_lock_ddc(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_switcheroo_power_switch(Ptr<PciDefinitions.pci_dev> pdev, vga_switcheroo_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switcheroo_process_delayed_switch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vga_switcheroo_register_audio_client($arg1, (const struct vga_switcheroo_client_ops*)$arg2, $arg3)")
    public static int vga_switcheroo_register_audio_client(Ptr<PciDefinitions.pci_dev> pdev, Ptr<vga_switcheroo_client_ops> ops, Ptr<PciDefinitions.pci_dev> vga_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vga_switcheroo_register_client($arg1, (const struct vga_switcheroo_client_ops*)$arg2, $arg3)")
    public static int vga_switcheroo_register_client(Ptr<PciDefinitions.pci_dev> pdev, Ptr<vga_switcheroo_client_ops> ops, boolean driver_power_control) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vga_switcheroo_register_handler((const struct vga_switcheroo_handler*)$arg1, $arg2)")
    public static int vga_switcheroo_register_handler(Ptr<vga_switcheroo_handler> handler, vga_switcheroo_handler_flags_t handler_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switcheroo_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switcheroo_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switcheroo_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switcheroo_unlock_ddc(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_switcheroo_unregister_client(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_switcheroo_unregister_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switchoff(Ptr<vga_switcheroo_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switchon(Ptr<vga_switcheroo_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switchto_stage1(Ptr<vga_switcheroo_client> new_client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_switchto_stage2(Ptr<vga_switcheroo_client> new_client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __vga_put(Ptr<vga_device> vgadev, @Unsigned int rsrc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __vga_set_legacy_decoding(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned int decodes, boolean userspace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vga_device> __vga_tryget(Ptr<vga_device> vgadev, @Unsigned int rsrc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_arb_device_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int vga_arb_fpoll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_arb_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vga_arb_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_arb_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vga_arb_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long vga_arb_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vga_arbiter_add_pci_device(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_arbiter_notify_clients() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vga_client_register($arg1, (unsigned int (*)(struct pci_dev*, _Bool))$arg2)")
    public static int vga_client_register(Ptr<PciDefinitions.pci_dev> pdev, Ptr<?> set_decode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PciDefinitions.pci_dev> vga_default_device() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_get(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned int rsrc, int interruptible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vga_is_boot_device(Ptr<vga_device> vgadev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_put(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned int rsrc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vga_remove_vgacon(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_set_default_device(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_set_legacy_decoding(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned int decodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_update_device_decodes(Ptr<vga_device> vgadev, @Unsigned int new_decodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vga_set_palette($arg1, (const u8*)$arg2)")
    public static void vga_set_palette(Ptr<VcDefinitions.vc_data> vc2, String table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vga_vesa_unblank(Ptr<vgastate> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vgastate")
    @NotUsableInJava
    public static class vgastate
    extends Struct {
        public Ptr<?> vgabase;
        public @Unsigned long membase;
        public @Unsigned int memsize;
        public @Unsigned int flags;
        public @Unsigned int depth;
        public @Unsigned int num_attr;
        public @Unsigned int num_crtc;
        public @Unsigned int num_gfx;
        public @Unsigned int num_seq;
        public Ptr<?> vidstate;
    }

    @Type(noCCodeGeneration=true, cType="struct vga_arb_private")
    @NotUsableInJava
    public static class vga_arb_private
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<PciDefinitions.pci_dev> target;
        public vga_arb_user_card @Size(value=16) [] cards;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct vga_arb_user_card")
    @NotUsableInJava
    public static class vga_arb_user_card
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> pdev;
        public @Unsigned int mem_cnt;
        public @Unsigned int io_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct vga_device")
    @NotUsableInJava
    public static class vga_device
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<PciDefinitions.pci_dev> pdev;
        public @Unsigned int decodes;
        public @Unsigned int owns;
        public @Unsigned int locks;
        public @Unsigned int io_lock_cnt;
        public @Unsigned int mem_lock_cnt;
        public @Unsigned int io_norm_cnt;
        public @Unsigned int mem_norm_cnt;
        public boolean bridge_has_one_vga;
        public boolean is_firmware_default;
        public Ptr<?> set_decode;
    }

    @Type(noCCodeGeneration=true, cType="struct vga_switcheroo_client")
    @NotUsableInJava
    public static class vga_switcheroo_client
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> pdev;
        public Ptr<FbDefinitions.fb_info> fb_info;
        public vga_switcheroo_state pwr_state;
        public Ptr<vga_switcheroo_client_ops> ops;
        public vga_switcheroo_client_id id;
        public boolean active;
        public boolean driver_power_control;
        public ListDefinitions.list_head list;
        public Ptr<PciDefinitions.pci_dev> vga_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct vga_switcheroo_client_ops")
    @NotUsableInJava
    public static class vga_switcheroo_client_ops
    extends Struct {
        public Ptr<?> set_gpu_state;
        public Ptr<?> reprobe;
        public Ptr<?> can_switch;
        public Ptr<?> gpu_bound;
    }

    @Type(noCCodeGeneration=true, cType="struct vga_switcheroo_handler")
    @NotUsableInJava
    public static class vga_switcheroo_handler
    extends Struct {
        public Ptr<?> init;
        public Ptr<?> switchto;
        public Ptr<?> switch_ddc;
        public Ptr<?> power_state;
        public Ptr<?> get_client_id;
    }

    @Type(noCCodeGeneration=true, cType="enum vga_switcheroo_client_id")
    public static enum vga_switcheroo_client_id implements Enum<vga_switcheroo_client_id>,
    TypedEnum<vga_switcheroo_client_id, Integer>
    {
        VGA_SWITCHEROO_UNKNOWN_ID,
        VGA_SWITCHEROO_IGD,
        VGA_SWITCHEROO_DIS,
        VGA_SWITCHEROO_MAX_CLIENTS;

    }

    @Type(noCCodeGeneration=true, cType="enum vga_switcheroo_state")
    public static enum vga_switcheroo_state implements Enum<vga_switcheroo_state>,
    TypedEnum<vga_switcheroo_state, Integer>
    {
        VGA_SWITCHEROO_OFF,
        VGA_SWITCHEROO_ON,
        VGA_SWITCHEROO_NOT_FOUND;

    }

    @Type(noCCodeGeneration=true, cType="enum vga_switcheroo_handler_flags_t")
    public static enum vga_switcheroo_handler_flags_t implements Enum<vga_switcheroo_handler_flags_t>,
    TypedEnum<vga_switcheroo_handler_flags_t, Integer>
    {
        VGA_SWITCHEROO_CAN_SWITCH_DDC,
        VGA_SWITCHEROO_NEEDS_EDP_CONFIG;

    }
}

