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
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.DbcDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EspintcpDefinitions;
import me.bechberger.ebpf.runtime.EvtchnDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.PathDefinitions;
import me.bechberger.ebpf.runtime.PortDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SquashfsDefinitions;
import me.bechberger.ebpf.runtime.StackDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class HandleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn __handle_irq_event_percpu(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int __handle_mm_fault(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __handle_sysrq(char key2, boolean check_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_bad_irq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_button_press_event(Ptr<runtime.slot> p_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_conflicting_encoders(Ptr<DrmDefinitions.drm_atomic_state> state2, boolean disable_conflicting_encoders) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_dock(Ptr<misc.dock_station> ds, int dock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_eject_request(Ptr<misc.dock_station> ds, @Unsigned int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_futex_death(Ptr<@Unsigned Integer> uaddr, Ptr<TaskDefinitions.task_struct> curr, boolean pi, boolean pending_op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn handle_irq_event(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn handle_irq_event_percpu(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int handle_mm_fault(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long address, @Unsigned int flags, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="handle_onexec((const struct cred*)$arg1, $arg2, $arg3, $arg4, (const struct linux_binprm*)$arg5, $arg6, $arg7, $arg8)")
    public static Ptr<AaDefinitions.aa_label> handle_onexec(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_label> label, Ptr<AaDefinitions.aa_label> onexec, boolean stack, Ptr<LinuxDefinitions.linux_binprm> bprm, String buffer, Ptr<PathDefinitions.path_cond> cond, Ptr<@OriginalName(value="bool") Boolean> unsafe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_pmi_common(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int handle_pte_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_sysrq(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_to_path(int mountdirfd, Ptr<FileDefinitions.file_handle> ufh, Ptr<runtime.path> path2, @Unsigned int o_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn handle_twl4030_pih(int irq, Ptr<?> devid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn handle_twl4030_sih(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int handle_userfault(Ptr<VmDefinitions.vm_fault> vmf, @Unsigned long reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="handle_zstd_error($arg1, (void (*)(u8*))$arg2)")
    public static int handle_zstd_error(@Unsigned long ret, Ptr<?> error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)handle_dots($arg1, $arg2))")
    public static String handle_dots(Ptr<runtime.nameidata> nd, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_edge_irq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_fasteoi_irq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_fasteoi_nmi(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_level_irq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_nested_irq(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_percpu_devid_fasteoi_nmi(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_percpu_devid_irq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_percpu_irq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="handle_policy_update($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long handle_policy_update(Ptr<runtime.file> file2, String ubuf, @Unsigned long len, misc.setid_type policy_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_poweroff(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_simple_irq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_spurious_interrupt(char vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_switch(Ptr<?> data, boolean preempt, Ptr<TaskDefinitions.task_struct> p, Ptr<TaskDefinitions.task_struct> n, @Unsigned int prev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn handle_threaded_wake_irq(int irq, Ptr<?> _wirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_untracked_irq(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_wakeup(Ptr<?> data, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_cmd_completion(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_event_cmd> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_ctrl_cmd(String cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_esc(Ptr<TtyDefinitions.tty_struct> tty, Ptr<VcDefinitions.vc_data> vc2, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_esp(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int handle_ioapic_add(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> context2, Ptr<Ptr<?>> rv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_irq_desc(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_irq_for_port(@Unsigned @OriginalName(value="evtchn_port_t") int port2, Ptr<EvtchnDefinitions.evtchn_loop_ctrl> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> handle_next_page(Ptr<SquashfsDefinitions.squashfs_page_actor> actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_nonesp(Ptr<EspintcpDefinitions.espintcp_ctx> ctx, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_overflow(Ptr<misc.overflow_data> data, Ptr<?> lhs, Ptr<?> rhs, char op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_port_status(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_trb> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_signal(Ptr<runtime.ksignal> ksig, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="handle_to_device($arg1, (void (*)(void*))$arg2)")
    public static Ptr<AcpiDefinitions.acpi_device> handle_to_device(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_tx_event(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_interrupter> ir, Ptr<XhciDefinitions.xhci_transfer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="handle_vcpu_hotplug_event($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void handle_vcpu_hotplug_event(Ptr<XenbusDefinitions.xenbus_watch> watch2, String path2, String token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean handle_bug(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_bus_lock(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_control_message(Ptr<VirtioDefinitions.virtio_device> vdev, Ptr<misc.ports_device> portdev, Ptr<PortDefinitions.port_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_cpuid(Ptr<PtDefinitions.pt_regs> regs, Ptr<misc.ve_info> ve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int handle_diacr(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_ep_halt_changes(Ptr<XhciDefinitions.xhci_dbc> dbc, Ptr<DbcDefinitions.dbc_ep> dep, boolean halted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean handle_guest_split_lock(@Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean handle_in(Ptr<PtDefinitions.pt_regs> regs, int size, int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_incoming_queue(Ptr<misc.netfront_queue> queue, Ptr<SkDefinitions.sk_buff_head> rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_io(Ptr<PtDefinitions.pt_regs> regs, Ptr<misc.ve_info> ve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handle_mmio(Ptr<PtDefinitions.pt_regs> regs, Ptr<misc.ve_info> ve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="handle_notify_limits($arg1, (int (*)(struct regulator_dev*, int, int, _Bool))$arg2, $arg3)")
    public static int handle_notify_limits(Ptr<RegulatorDefinitions.regulator_dev> rdev, Ptr<?> set, Ptr<misc.notification_limit> limits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="handle_remove((const u8*)$arg1, $arg2)")
    public static int handle_remove(String nodename, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_softirqs(boolean ksirqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_stack_overflow(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long fault_address, Ptr<StackDefinitions.stack_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handle_update(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean handle_user_split_lock(Ptr<PtDefinitions.pt_regs> regs, long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean handle_vc_boot_ghcb(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean handle_xfd_event(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct handle_to_path_ctx")
    @NotUsableInJava
    public static class handle_to_path_ctx
    extends Struct {
        public runtime.path root;
        public handle_to_path_flags flags;
        public @Unsigned int fh_flags;
    }

    @Type(noCCodeGeneration=true, cType="enum handle_to_path_flags")
    public static enum handle_to_path_flags implements Enum<handle_to_path_flags>,
    TypedEnum<handle_to_path_flags, Integer>
    {
        HANDLE_CHECK_PERMS,
        HANDLE_CHECK_SUBTREE;

    }

    @Type(noCCodeGeneration=true, cType="union handle_parts")
    @NotUsableInJava
    public static class handle_parts
    extends Union {
        public @Unsigned @OriginalName(value="depot_stack_handle_t") int handle;
        public AnonDefinitions.anon_member_of_handle_parts anon1;
    }
}

