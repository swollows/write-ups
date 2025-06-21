/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class VirtscsiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __virtscsi_add_cmd(Ptr<runtime.virtqueue> vq, Ptr<VirtioDefinitions.virtio_scsi_cmd> cmd, @Unsigned long req_size, @Unsigned long resp_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_abort(Ptr<ScsiDefinitions.scsi_cmnd> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_add_cmd(Ptr<VirtioDefinitions.virtio_scsi_vq> vq, Ptr<VirtioDefinitions.virtio_scsi_cmd> cmd, @Unsigned long req_size, @Unsigned long resp_size, boolean kick) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_change_queue_depth(Ptr<ScsiDefinitions.scsi_device> sdev, int qdepth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtscsi_commit_rqs(Ptr<runtime.Scsi_Host> shost, @Unsigned short hwq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtscsi_complete_cmd(Ptr<VirtioDefinitions.virtio_scsi> vscsi, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtscsi_ctrl_done(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_device_alloc(Ptr<ScsiDefinitions.scsi_device> sdevice) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_device_reset(Ptr<ScsiDefinitions.scsi_cmnd> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ScsiDefinitions.scsi_timeout_action virtscsi_eh_timed_out(Ptr<ScsiDefinitions.scsi_cmnd> scmnd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtscsi_event_done(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_freeze(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtscsi_handle_event(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_init(Ptr<VirtioDefinitions.virtio_device> vdev, Ptr<VirtioDefinitions.virtio_scsi> vscsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_kick_event(Ptr<VirtioDefinitions.virtio_scsi> vscsi, Ptr<VirtioDefinitions.virtio_scsi_event_node> event_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtscsi_map_queues(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_mq_poll(Ptr<runtime.Scsi_Host> shost, @Unsigned int queue_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_probe(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_queuecommand(Ptr<runtime.Scsi_Host> shost, Ptr<ScsiDefinitions.scsi_cmnd> sc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtscsi_remove(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtscsi_req_done(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_rescan_hotunplug(Ptr<VirtioDefinitions.virtio_scsi> vscsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_restore(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtscsi_tmf(Ptr<VirtioDefinitions.virtio_scsi> vscsi, Ptr<VirtioDefinitions.virtio_scsi_cmd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }
}

