/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FanotifyDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FsnotifyDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.MountDefinitions;
import me.bechberger.ebpf.runtime.OhciDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UhciDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WbDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class FinishDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="finish_automount($arg1, (const struct path*)$arg2)")
    public static int finish_automount(Ptr<runtime.vfsmount> m, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int finish_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int finish_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int finish_mkwrite_fault(Ptr<VmDefinitions.vm_fault> vmf, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_mount_kattr(Ptr<MountDefinitions.mount_kattr> kattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int finish_no_open(Ptr<runtime.file> file2, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="finish_open($arg1, $arg2, (int (*)(struct inode*, struct file*))$arg3)")
    public static int finish_open(Ptr<runtime.file> file2, Ptr<runtime.dentry> dentry2, Ptr<?> open2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int finish_port_resume(Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_unlinks(Ptr<OhciDefinitions.ohci_hcd> ohci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_urb(Ptr<OhciDefinitions.ohci_hcd> ohci, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __finish_swait(Ptr<misc.swait_queue_head> q, Ptr<misc.swait_queue> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int finish_clean_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_rcuwait(Ptr<runtime.rcuwait> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_swait(Ptr<misc.swait_queue_head> q, Ptr<misc.swait_queue> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_wait(Ptr<WaitDefinitions.wait_queue_head> wq_head, Ptr<WaitDefinitions.wait_queue_entry> wq_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int finish_range(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<MigrateDefinitions.migrate_struct> lb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_reset(Ptr<UhciDefinitions.uhci_hcd> uhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rq> finish_task_switch(Ptr<TaskDefinitions.task_struct> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int finish_td(Ptr<XhciDefinitions.xhci_hcd> xhci, Ptr<XhciDefinitions.xhci_virt_ep> ep, Ptr<XhciDefinitions.xhci_ring> ep_ring, Ptr<XhciDefinitions.xhci_td> td2, @Unsigned int trb_comp_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_writeback_work(Ptr<WbDefinitions.wb_writeback_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_permission_event(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<FanotifyDefinitions.fanotify_perm_event> event2, @Unsigned int response, Ptr<FanotifyDefinitions.fanotify_response_info_audit_rule> friar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void finish_wakeup_event(Ptr<VirtioDefinitions.virtio_balloon> vb) {
        throw new MethodIsBPFRelatedFunction();
    }
}

