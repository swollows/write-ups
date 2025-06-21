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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.DataDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TransportDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class AtaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__ata_scsi_find_dev($arg1, (const struct scsi_device*)$arg2)")
    public static Ptr<ata_device> __ata_scsi_find_dev(Ptr<ata_port> ap, Ptr<ScsiDefinitions.scsi_device> scsidev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ata_scsi_queuecmd(Ptr<ScsiDefinitions.scsi_cmnd> scmd, Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_change_queue_depth(Ptr<ata_port> ap, Ptr<ScsiDefinitions.scsi_device> sdev, int queue_depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_cmd_ioctl(Ptr<ScsiDefinitions.scsi_device> scsidev, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_analyze_ncq_error(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_eh_get_ncq_success_sense(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ata_device> ata_find_dev(Ptr<ata_port> ap, @Unsigned int devno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_gen_ata_sense(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_gen_passthru_sense(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_generic_init_one($arg1, (const struct pci_device_id*)$arg2)")
    public static int ata_generic_init_one(Ptr<PciDefinitions.pci_dev> dev, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_generic_pci_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_generic_pci_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_msense_caching(Ptr<@Unsigned Short> id, Ptr<Character> buf, boolean changeable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_msense_control(Ptr<ata_device> dev, Ptr<Character> buf, char spg, boolean changeable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_msense_control_spgt2(Ptr<ata_device> dev, Ptr<Character> buf, char spg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_ncq_prio_enable(Ptr<ata_port> ap, Ptr<ScsiDefinitions.scsi_device> sdev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ata_ncq_prio_enable_show(Ptr<runtime.device> device2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_ncq_prio_enable_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ata_ncq_prio_enable_store(Ptr<runtime.device> device2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_ncq_prio_enabled(Ptr<ata_port> ap, Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<@OriginalName(value="bool") Boolean> enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_ncq_prio_supported(Ptr<ata_port> ap, Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<@OriginalName(value="bool") Boolean> supported) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ata_ncq_prio_supported_show(Ptr<runtime.device> device2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_qc_complete_multiple(Ptr<ata_port> ap, @Unsigned long qc_active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sas_device_configure(Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<QueueDefinitions.queue_limits> lim, Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sas_queuecmd(Ptr<ScsiDefinitions.scsi_cmnd> cmd, Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sas_scsi_ioctl(Ptr<ata_port> ap, Ptr<ScsiDefinitions.scsi_device> scsidev, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ata_scsi_activity_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_scsi_activity_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ata_scsi_activity_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_scsi_add_hosts($arg1, (const struct scsi_host_template*)$arg2)")
    public static int ata_scsi_add_hosts(Ptr<ata_host> host, Ptr<ScsiDefinitions.scsi_host_template> sht) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_scsi_change_queue_depth(Ptr<ScsiDefinitions.scsi_device> sdev, int queue_depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_scsi_dev_config(Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<QueueDefinitions.queue_limits> lim, Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_dev_rescan(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_scsi_device_configure(Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_scsi_dma_need_drain(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ata_scsi_em_message_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_scsi_em_message_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ata_scsi_em_message_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ata_scsi_em_message_type_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_scsi_find_dev($arg1, (const struct scsi_device*)$arg2)")
    public static Ptr<ata_device> ata_scsi_find_dev(Ptr<ata_port> ap, Ptr<ScsiDefinitions.scsi_device> scsidev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_flush_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_handle_link_detach(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_hotplug(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_scsi_ioctl(Ptr<ScsiDefinitions.scsi_device> scsidev, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ata_scsi_lpm_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_scsi_lpm_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ata_scsi_lpm_store(Ptr<runtime.device> device2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_media_change_notify(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_mode_select_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_scsi_offline_dev(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ata_scsi_park_show(Ptr<runtime.device> device2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_scsi_park_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ata_scsi_park_store(Ptr<runtime.device> device2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_pass_thru(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_qc_complete(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ata_queued_cmd> ata_scsi_qc_new(Ptr<ata_device> dev, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_scsi_queuecmd(Ptr<runtime.Scsi_Host> shost, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_report_zones_complete(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_rw_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_scan_host(Ptr<ata_port> ap, int sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_sdev_config(Ptr<ScsiDefinitions.scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_security_inout_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_scsi_sense_is_valid(char sk, char asc, char ascq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_set_passthru_sense_fields(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_set_sense(Ptr<ata_device> dev, Ptr<ScsiDefinitions.scsi_cmnd> cmd, char sk, char asc, char ascq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_scsi_set_sense_information($arg1, $arg2, (const struct ata_taskfile*)$arg3)")
    public static void ata_scsi_set_sense_information(Ptr<ata_device> dev, Ptr<ScsiDefinitions.scsi_cmnd> cmd, Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_simulate(Ptr<ata_device> dev, Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_scsi_slave_alloc(Ptr<ScsiDefinitions.scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_slave_destroy(Ptr<ScsiDefinitions.scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_start_stop_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_unlock_native_capacity(Ptr<ScsiDefinitions.scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_scsi_user_scan(Ptr<runtime.Scsi_Host> shost, @Unsigned int channel2, @Unsigned int id, @Unsigned long lun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_var_len_cdb_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_verify_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_write_same_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_zbc_in_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsi_zbc_out_xlat(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_inq_80(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_inq_83(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_inq_89(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_inq_b0(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_inq_b1(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_inq_b9(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_inq_std(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_maint_in(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_mode_sense(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_scsiop_read_cap(Ptr<ata_scsi_args> args, Ptr<Character> rbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_slave_link_init(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_std_bios_param(Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long capacity, Ptr<Integer> geom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_task_ioctl(Ptr<ScsiDefinitions.scsi_device> scsidev, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_tf_from_fis((const u8*)$arg1, $arg2)")
    public static void ata_tf_from_fis(Ptr<Character> fis, Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_tf_init(Ptr<ata_device> dev, Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_tf_to_fis((const struct ata_taskfile*)$arg1, $arg2, $arg3, $arg4)")
    public static void ata_tf_to_fis(Ptr<ata_taskfile> tf, char pmp, int is_cmd, Ptr<Character> fis) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_to_sense_error(char drv_stat, char drv_err, Ptr<Character> sk, Ptr<Character> asc, Ptr<Character> ascq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ata_eh_qc_complete(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ata_ehi_push_desc($arg1, (const u8*)$arg2, $arg3_)")
    public static void __ata_ehi_push_desc(Ptr<ata_eh_info> ehi, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ata_port_freeze(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_disable(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_do_eh(Ptr<ata_port> ap, @OriginalName(value="ata_prereset_fn_t") Ptr<?> prereset, @OriginalName(value="ata_reset_fn_t") Ptr<?> softreset, @OriginalName(value="ata_reset_fn_t") Ptr<?> hardreset, @OriginalName(value="ata_postreset_fn_t") Ptr<?> postreset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_do_link_abort(Ptr<ata_port> ap, Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_do_reset(Ptr<ata_link> link2, @OriginalName(value="ata_reset_fn_t") Ptr<?> reset, Ptr<@Unsigned Integer> classes, @Unsigned long deadline, boolean clear_classes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_about_to_do(Ptr<ata_link> link2, Ptr<ata_device> dev, @Unsigned int action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_acquire(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_eh_analyze_tf(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_autopsy(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_eh_categorize_error(@Unsigned int eflags, @Unsigned int err_mask, Ptr<Integer> xfer_ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_clear_action(Ptr<ata_link> link2, Ptr<ata_device> dev, Ptr<ata_eh_info> ehi, @Unsigned int action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ScsiDefinitions.scsi_disposition ata_eh_decide_disposition(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_detach_dev(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_dev_disable(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_done(Ptr<ata_link> link2, Ptr<ata_device> dev, @Unsigned int action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_fastdrain_timerfn(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_finish(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_freeze_port(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_get_success_sense(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_eh_handle_dev_fail(Ptr<ata_device> dev, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_handle_port_resume(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_handle_port_suspend(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_link_autopsy(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_link_report(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_eh_maybe_retry_flush(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_park_issue_cmd(Ptr<ata_device> dev, int park) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_qc_complete(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_qc_retry(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_eh_recover(Ptr<ata_port> ap, @OriginalName(value="ata_prereset_fn_t") Ptr<?> prereset, @OriginalName(value="ata_reset_fn_t") Ptr<?> softreset, @OriginalName(value="ata_reset_fn_t") Ptr<?> hardreset, @OriginalName(value="ata_postreset_fn_t") Ptr<?> postreset, Ptr<Ptr<ata_link>> r_failed_link) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_release(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_report(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_eh_request_sense(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_eh_reset(Ptr<ata_link> link2, int classify, @OriginalName(value="ata_prereset_fn_t") Ptr<?> prereset, @OriginalName(value="ata_reset_fn_t") Ptr<?> softreset, @OriginalName(value="ata_reset_fn_t") Ptr<?> hardreset, @OriginalName(value="ata_postreset_fn_t") Ptr<?> postreset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_eh_revalidate_and_attach(Ptr<ata_link> link2, Ptr<Ptr<ata_device>> r_failed_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_eh_schedule_probe(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_scsidone(Ptr<ScsiDefinitions.scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_eh_set_lpm(Ptr<ata_link> link2, ata_lpm_policy policy, Ptr<Ptr<ata_device>> r_failed_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_eh_speed_down(Ptr<ata_device> dev, @Unsigned int eflags, @Unsigned int err_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_thaw_port(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_eh_unload(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_ehi_clear_desc(Ptr<ata_eh_info> ehi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_ehi_push_desc($arg1, (const u8*)$arg2, $arg3_)")
    public static void ata_ehi_push_desc(Ptr<ata_eh_info> ehi, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_ering_map($arg1, (int (*)(struct ata_ering_entry*, void*))$arg2, $arg3)")
    public static int ata_ering_map(Ptr<ata_ering> ering, Ptr<?> map_fn, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ata_get_cmd_name($arg1))")
    public static String ata_get_cmd_name(char command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_internal_cmd_timed_out(Ptr<ata_device> dev, char cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_internal_cmd_timeout(Ptr<ata_device> dev, char cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_link_abort(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_link_nr_enabled(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_port_abort(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_port_desc($arg1, (const u8*)$arg2, $arg3_)")
    public static void ata_port_desc(Ptr<ata_port> ap, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_port_freeze(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_port_pbar_desc($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static void ata_port_pbar_desc(Ptr<ata_port> ap, int bar, @OriginalName(value="ssize_t") long offset, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_port_schedule_eh(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_port_wait_eh(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_qc_schedule_eh(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_cmd_error_handler(Ptr<runtime.Scsi_Host> host, Ptr<ata_port> ap, Ptr<ListDefinitions.list_head> eh_work_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_error(Ptr<runtime.Scsi_Host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_scsi_port_error_handler(Ptr<runtime.Scsi_Host> host, Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_set_mode(Ptr<ata_link> link2, Ptr<Ptr<ata_device>> r_failed_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_std_end_eh(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_std_error_handler(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_std_sched_eh(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ata_qc_complete(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_acpi_ap_notify_dock(Ptr<AcpiDefinitions.acpi_device> adev, @Unsigned int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_acpi_ap_uevent(Ptr<AcpiDefinitions.acpi_device> adev, @Unsigned int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_acpi_bind_dev(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_acpi_bind_port(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_acpi_cbl_80wire($arg1, (const struct ata_acpi_gtm*)$arg2)")
    public static int ata_acpi_cbl_80wire(Ptr<ata_port> ap, Ptr<ata_acpi_gtm> gtm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_acpi_dev_notify_dock(Ptr<AcpiDefinitions.acpi_device> adev, @Unsigned int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_acpi_dev_uevent(Ptr<AcpiDefinitions.acpi_device> adev, @Unsigned int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_acpi_dissociate(Ptr<ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_acpi_gtf_to_tf($arg1, (const struct ata_acpi_gtf*)$arg2, $arg3)")
    public static void ata_acpi_gtf_to_tf(Ptr<ata_device> dev, Ptr<ata_acpi_gtf> gtf, Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_acpi_gtm_xfermask($arg1, (const struct ata_acpi_gtm*)$arg2)")
    public static @Unsigned int ata_acpi_gtm_xfermask(Ptr<ata_device> dev, Ptr<ata_acpi_gtm> gtm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_acpi_handle_hotplug(Ptr<ata_port> ap, Ptr<ata_device> dev, @Unsigned int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_acpi_on_devcfg(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_acpi_on_disable(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_acpi_on_resume(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_acpi_run_tf($arg1, (const struct ata_acpi_gtf*)$arg2, (const struct ata_acpi_gtf*)$arg3)")
    public static int ata_acpi_run_tf(Ptr<ata_device> dev, Ptr<ata_acpi_gtf> gtf, Ptr<ata_acpi_gtf> prev_gtf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_acpi_set_state(Ptr<ata_port> ap,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_acpi_stm($arg1, (const struct ata_acpi_gtm*)$arg2)")
    public static int ata_acpi_stm(Ptr<ata_port> ap, Ptr<ata_acpi_gtm> stm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_build_rw_tf(Ptr<ata_queued_cmd> qc, @Unsigned long block, @Unsigned int n_block, @Unsigned int tf_flags, int cdl, int _class2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_cable_40wire(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_cable_80wire(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_cable_ignore(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_cable_sata(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_cable_unknown(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="acpi_handle") Ptr<?> ata_dev_acpi_handle(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_dev_classify((const struct ata_taskfile*)$arg1)")
    public static @Unsigned int ata_dev_classify(Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_cleanup_cdl_resources(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_config_cdl(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_dev_config_ncq(Ptr<ata_device> dev, String desc, @Unsigned long desc_sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_config_ncq_non_data(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_config_ncq_send_recv(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_dev_configure(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_free_resources(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_dev_get_GTF(Ptr<ata_device> dev, Ptr<Ptr<ata_acpi_gtf>> gtf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_init(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ata_device> ata_dev_next(Ptr<ata_device> dev, Ptr<ata_link> link2, ata_dev_iter_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ata_device> ata_dev_pair(Ptr<ata_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ata_link> ata_dev_phys_link(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_dev_power_init_tf(Ptr<ata_device> dev, Ptr<ata_taskfile> tf, boolean set_active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_dev_power_is_active(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_power_set_active(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_power_set_standby(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_dev_quirks((const struct ata_device*)$arg1)")
    public static @Unsigned int ata_dev_quirks(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_dev_read_id(Ptr<ata_device> dev, Ptr<@Unsigned Integer> p_class, @Unsigned int flags, Ptr<@Unsigned Short> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_dev_reread_id(Ptr<ata_device> dev, @Unsigned int readid_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_dev_revalidate(Ptr<ata_device> dev, @Unsigned int new_class, @Unsigned int readid_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_dev_same_device($arg1, $arg2, (const short unsigned int*)$arg3)")
    public static int ata_dev_same_device(Ptr<ata_device> dev, @Unsigned int new_class, Ptr<@Unsigned Short> new_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_dev_set_feature(Ptr<ata_device> dev, char subcmd, char action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_dev_set_mode(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dev_xfermask(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_devres_release(Ptr<runtime.device> gendev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_do_dev_read_id(Ptr<ata_device> dev, Ptr<ata_taskfile> tf, Ptr<@Unsigned @OriginalName(value="__le16") Short> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_do_set_mode(Ptr<ata_link> link2, Ptr<Ptr<ata_device>> r_failed_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_down_xfermask_limit(Ptr<ata_device> dev, @Unsigned int sel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_dummy_error_handler(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_dummy_qc_issue(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_exec_internal($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned int ata_exec_internal(Ptr<ata_device> dev, Ptr<ata_taskfile> tf, Ptr<Character> cdb, DmaDefinitions.dma_data_direction dma_dir, Ptr<?> buf, @Unsigned int buflen, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_finalize_port_ops(Ptr<ata_port_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_force_cbl(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_force_link_limits(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_host_activate($arg1, $arg2, $arg3, $arg4, (const struct scsi_host_template*)$arg5)")
    public static int ata_host_activate(Ptr<ata_host> host, int irq, @OriginalName(value="irq_handler_t") Ptr<?> irq_handler, @Unsigned long irq_flags, Ptr<ScsiDefinitions.scsi_host_template> sht) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ata_host> ata_host_alloc(Ptr<runtime.device> dev, int n_ports) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_host_alloc_pinfo($arg1, (const struct ata_port_info**)$arg2, $arg3)")
    public static Ptr<ata_host> ata_host_alloc_pinfo(Ptr<runtime.device> dev, Ptr<Ptr<ata_port_info>> ppi, int n_ports) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_host_detach(Ptr<ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_host_get(Ptr<ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_host_init(Ptr<ata_host> host, Ptr<runtime.device> dev, Ptr<ata_port_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_host_put(Ptr<ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_host_register($arg1, (const struct scsi_host_template*)$arg2)")
    public static int ata_host_register(Ptr<ata_host> host, Ptr<ScsiDefinitions.scsi_host_template> sht) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_host_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_host_resume(Ptr<ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_host_start(Ptr<ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_host_stop(Ptr<runtime.device> gendev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_host_suspend(Ptr<ata_host> host,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message mesg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_hpa_resize(Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_id_c_string((const short unsigned int*)$arg1, $arg2, $arg3, $arg4)")
    public static void ata_id_c_string(Ptr<@Unsigned Short> id, String s2, @Unsigned int ofs, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_id_n_sectors((const short unsigned int*)$arg1)")
    public static @Unsigned long ata_id_n_sectors(Ptr<@Unsigned Short> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_id_string((const short unsigned int*)$arg1, $arg2, $arg3, $arg4)")
    public static void ata_id_string(Ptr<@Unsigned Short> id, String s2, @Unsigned int ofs, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_id_xfermask((const short unsigned int*)$arg1)")
    public static @Unsigned int ata_id_xfermask(Ptr<@Unsigned Short> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_identify_page_supported(Ptr<ata_device> dev, char page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_link_init(Ptr<ata_port> ap, Ptr<ata_link> link2, int pmp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ata_link> ata_link_next(Ptr<ata_link> link2, Ptr<ata_port> ap, ata_link_iter_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_link_offline(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_link_online(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ata_mode_string($arg1))")
    public static String ata_mode_string(@Unsigned int xfer_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_msleep(Ptr<ata_port> ap, @Unsigned int msecs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_pack_xfermask(@Unsigned int pio_mask, @Unsigned int mwdma_mask, @Unsigned int udma_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_parse_force_one($arg1, $arg2, (const u8**)$arg3)")
    public static int ata_parse_force_one(Ptr<String> cur, Ptr<ata_force_ent> force_ent, Ptr<String> reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_pci_device_do_resume(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_pci_device_do_suspend(Ptr<PciDefinitions.pci_dev> pdev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message mesg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_pci_device_resume(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_pci_device_suspend(Ptr<PciDefinitions.pci_dev> pdev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message mesg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_pci_remove_one(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_pci_shutdown_one(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_phys_link_offline(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_phys_link_online(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_pio_need_iordy((const struct ata_device*)$arg1)")
    public static @Unsigned int ata_pio_need_iordy(Ptr<ata_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_platform_remove_one(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ata_port> ata_port_alloc(Ptr<ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_port_detach(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_port_free(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_port_pm_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_port_pm_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_port_pm_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_port_pm_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_port_probe(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_port_request_pm(Ptr<ata_port> ap,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message mesg, @Unsigned int action, @Unsigned int ehi_flags, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_port_runtime_idle(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_port_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_port_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_print_version((const struct device*)$arg1, (const u8*)$arg2)")
    public static void ata_print_version(Ptr<runtime.device> dev, String version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_qc_complete(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_qc_complete_internal(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_qc_free(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ata_qc_get_active(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_qc_issue(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_ratelimit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_read_log_page(Ptr<ata_device> dev, char log, char page2, Ptr<?> buf, @Unsigned int sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sas_port_resume(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sas_port_suspend(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_set_max_sectors(Ptr<ata_device> dev, @Unsigned long new_sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_set_rwcmd_protocol(Ptr<ata_device> dev, Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sg_init(Ptr<ata_queued_cmd> qc, Ptr<runtime.scatterlist> sg2, @Unsigned int n_elem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_std_postreset(Ptr<ata_link> link2, Ptr<@Unsigned Integer> classes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_std_prereset(Ptr<ata_link> link2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_std_qc_defer(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_tf_read_block((const struct ata_taskfile*)$arg1, $arg2)")
    public static @Unsigned long ata_tf_read_block(Ptr<ata_taskfile> tf, Ptr<ata_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_tf_to_lba((const struct ata_taskfile*)$arg1)")
    public static @Unsigned long ata_tf_to_lba(Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_tf_to_lba48((const struct ata_taskfile*)$arg1)")
    public static @Unsigned long ata_tf_to_lba48(Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char ata_timing_cycle2mode(@Unsigned int xfer_shift, int cycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_unpack_xfermask(@Unsigned int xfer_mask, Ptr<@Unsigned Integer> pio_mask, Ptr<@Unsigned Integer> mwdma_mask, Ptr<@Unsigned Integer> udma_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_wait_after_reset($arg1, $arg2, (int (*)(struct ata_link*))$arg3)")
    public static int ata_wait_after_reset(Ptr<ata_link> link2, @Unsigned long deadline, Ptr<?> check_ready) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_wait_ready($arg1, $arg2, (int (*)(struct ata_link*))$arg3)")
    public static int ata_wait_ready(Ptr<ata_link> link2, @Unsigned long deadline, Ptr<?> check_ready) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_wait_register(Ptr<ata_port> ap, Ptr<?> reg, @Unsigned int mask, @Unsigned int val, @Unsigned int interval2, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char ata_xfer_mask2mode(@Unsigned int xfer_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_xfer_mode2mask(char xfer_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_xfer_mode2shift(char xfer_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __ata_sff_port_intr(Ptr<ata_port> ap, Ptr<ata_queued_cmd> qc, boolean hsmv_on_idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ScsiDefinitions.scsi_transport_template> ata_attach_transport() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ata_completion_errors ata_bmdma_dumb_qc_prep(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_bmdma_error_handler(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn ata_bmdma_interrupt(int irq, Ptr<?> dev_instance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_bmdma_irq_clear(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_bmdma_nodma($arg1, (const u8*)$arg2)")
    public static void ata_bmdma_nodma(Ptr<ata_host> host, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_bmdma_port_intr(Ptr<ata_port> ap, Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_bmdma_port_start(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_bmdma_port_start32(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_bmdma_post_internal_cmd(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_bmdma_qc_issue(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ata_completion_errors ata_bmdma_qc_prep(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_bmdma_setup(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_bmdma_start(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char ata_bmdma_status(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_bmdma_stop(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ata_devchk(Ptr<ata_port> ap, @Unsigned int device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_hsm_qc_complete(Ptr<ata_queued_cmd> qc, int in_wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_pci_bmdma_clear_simplex(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_pci_bmdma_init(Ptr<ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_pci_bmdma_init_one($arg1, (const struct ata_port_info**)$arg2, (const struct scsi_host_template*)$arg3, $arg4, $arg5)")
    public static int ata_pci_bmdma_init_one(Ptr<PciDefinitions.pci_dev> pdev, Ptr<Ptr<ata_port_info>> ppi, Ptr<ScsiDefinitions.scsi_host_template> sht, Ptr<?> host_priv, int hflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_pci_bmdma_prepare_host($arg1, (const struct ata_port_info**)$arg2, $arg3)")
    public static int ata_pci_bmdma_prepare_host(Ptr<PciDefinitions.pci_dev> pdev, Ptr<Ptr<ata_port_info>> ppi, Ptr<Ptr<ata_host>> r_host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_pci_init_one($arg1, (const struct ata_port_info**)$arg2, (const struct scsi_host_template*)$arg3, $arg4, $arg5, $arg6)")
    public static int ata_pci_init_one(Ptr<PciDefinitions.pci_dev> pdev, Ptr<Ptr<ata_port_info>> ppi, Ptr<ScsiDefinitions.scsi_host_template> sht, Ptr<?> host_priv, int hflags, boolean bmdma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_pci_sff_activate_host($arg1, $arg2, (const struct scsi_host_template*)$arg3)")
    public static int ata_pci_sff_activate_host(Ptr<ata_host> host, @OriginalName(value="irq_handler_t") Ptr<?> irq_handler, Ptr<ScsiDefinitions.scsi_host_template> sht) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_pci_sff_init_host(Ptr<ata_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_pci_sff_init_one($arg1, (const struct ata_port_info**)$arg2, (const struct scsi_host_template*)$arg3, $arg4, $arg5)")
    public static int ata_pci_sff_init_one(Ptr<PciDefinitions.pci_dev> pdev, Ptr<Ptr<ata_port_info>> ppi, Ptr<ScsiDefinitions.scsi_host_template> sht, Ptr<?> host_priv, int hflag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_pci_sff_prepare_host($arg1, (const struct ata_port_info**)$arg2, $arg3)")
    public static int ata_pci_sff_prepare_host(Ptr<PciDefinitions.pci_dev> pdev, Ptr<Ptr<ata_port_info>> ppi, Ptr<Ptr<ata_host>> r_host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_pio_sector(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_pio_sectors(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_pio_xfer(Ptr<ata_queued_cmd> qc, Ptr<runtime.page> page2, @Unsigned int offset, @Unsigned long xfer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_port_classify($arg1, (const struct ata_taskfile*)$arg2)")
    public static @Unsigned int ata_port_classify(Ptr<ata_port> ap, Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_release_transport(Ptr<ScsiDefinitions.scsi_transport_template> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sff_check_ready(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char ata_sff_check_status(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_sff_data_xfer(Ptr<ata_queued_cmd> qc, String buf, @Unsigned int buflen, int rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_sff_data_xfer32(Ptr<ata_queued_cmd> qc, String buf, @Unsigned int buflen, int rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_sff_dev_classify(Ptr<ata_device> dev, int present, Ptr<Character> r_err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_dev_select(Ptr<ata_port> ap, @Unsigned int device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_dma_pause(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_drain_fifo(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_error_handler(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_sff_exec_command($arg1, (const struct ata_taskfile*)$arg2)")
    public static void ata_sff_exec_command(Ptr<ata_port> ap, Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_flush_pio_task(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_freeze(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sff_hsm_move(Ptr<ata_port> ap, Ptr<ata_queued_cmd> qc, char status, int in_wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sff_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn ata_sff_interrupt(int irq, Ptr<?> dev_instance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_irq_on(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_lost_interrupt(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_pause(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_pio_task(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_port_init(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_sff_port_intr(Ptr<ata_port> ap, Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_postreset(Ptr<ata_link> link2, Ptr<@Unsigned Integer> classes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sff_prereset(Ptr<ata_link> link2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_qc_fill_rtf(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ata_sff_qc_issue(Ptr<ata_queued_cmd> qc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_queue_delayed_work(Ptr<DelayedDefinitions.delayed_work> dwork, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_queue_pio_task(Ptr<ata_link> link2, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_queue_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sff_softreset(Ptr<ata_link> link2, Ptr<@Unsigned Integer> classes, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_std_ports(Ptr<ata_ioports> ioaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_sff_tf_load($arg1, (const struct ata_taskfile*)$arg2)")
    public static void ata_sff_tf_load(Ptr<ata_port> ap, Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_tf_read(Ptr<ata_port> ap, Ptr<ata_taskfile> tf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_sff_thaw(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sff_wait_after_reset(Ptr<ata_link> link2, @Unsigned int devmask, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_sff_wait_ready(Ptr<ata_link> link2, @Unsigned long deadline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_show_ering(Ptr<ata_ering_entry> ent, Ptr<?> void_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_tdev_match(Ptr<AttributeDefinitions.attribute_container> cont, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_tdev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_tf_to_host($arg1, (const struct ata_taskfile*)$arg2, $arg3)")
    public static void ata_tf_to_host(Ptr<ata_port> ap, Ptr<ata_taskfile> tf, @Unsigned int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_timing_compute(Ptr<ata_device> adev, @Unsigned short speed, Ptr<ata_timing> t, int T, int UT) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct ata_timing*)ata_timing_find_mode($arg1))")
    public static Ptr<ata_timing> ata_timing_find_mode(char xfer_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ata_timing_merge((const struct ata_timing*)$arg1, (const struct ata_timing*)$arg2, $arg3, $arg4)")
    public static void ata_timing_merge(Ptr<ata_timing> a, Ptr<ata_timing> b, Ptr<ata_timing> m, @Unsigned int what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_tlink_add(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_tlink_delete(Ptr<ata_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_tlink_match(Ptr<AttributeDefinitions.attribute_container> cont, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_tlink_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_tport_add(Ptr<runtime.device> parent, Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_tport_delete(Ptr<ata_port> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ata_tport_match(Ptr<AttributeDefinitions.attribute_container> cont, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ata_tport_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ata_acpi_hotplug_context")
    @NotUsableInJava
    public static class ata_acpi_hotplug_context
    extends Struct {
        public AcpiDefinitions.acpi_hotplug_context hp;
        public DataDefinitions.data_of_ata_acpi_hotplug_context data;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_acpi_gtf")
    @NotUsableInJava
    public static class ata_acpi_gtf
    extends Struct {
        public char @Size(value=7) [] tf;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_dev_quirks_entry")
    @NotUsableInJava
    public static class ata_dev_quirks_entry
    extends Struct {
        public String model_num;
        public String model_rev;
        public @Unsigned int quirks;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_xfer_ent")
    @NotUsableInJava
    public static class ata_xfer_ent
    extends Struct {
        public int shift;
        public int bits;
        public char base;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_force_ent")
    @NotUsableInJava
    public static class ata_force_ent
    extends Struct {
        public int port;
        public int device;
        public ata_force_param param;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_force_param")
    @NotUsableInJava
    public static class ata_force_param
    extends Struct {
        public String name;
        public char cbl;
        public char spd_limit;
        public @Unsigned int xfer_mask;
        public @Unsigned int quirk_on;
        public @Unsigned int quirk_off;
        public @Unsigned short lflags_on;
        public @Unsigned short lflags_off;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_eh_cmd_timeout_ent")
    @NotUsableInJava
    public static class ata_eh_cmd_timeout_ent
    extends Struct {
        public Ptr<Character> commands;
        public Ptr<@Unsigned Integer> timeouts;
    }

    @Type(noCCodeGeneration=true, cType="enum ata_lpm_hints")
    public static enum ata_lpm_hints implements Enum<ata_lpm_hints>,
    TypedEnum<ata_lpm_hints, Integer>
    {
        ATA_LPM_EMPTY,
        ATA_LPM_HIPM,
        ATA_LPM_WAKE_ONLY;

    }

    @Type(noCCodeGeneration=true, cType="enum ata_xfer_mask")
    public static enum ata_xfer_mask implements Enum<ata_xfer_mask>,
    TypedEnum<ata_xfer_mask, Integer>
    {
        ATA_MASK_PIO,
        ATA_MASK_MWDMA,
        ATA_MASK_UDMA;

    }

    @Type(noCCodeGeneration=true, cType="struct ata_scsi_args")
    @NotUsableInJava
    public static class ata_scsi_args
    extends Struct {
        public Ptr<ata_device> dev;
        public Ptr<@Unsigned Short> id;
        public Ptr<ScsiDefinitions.scsi_cmnd> cmd;
    }

    @Type(noCCodeGeneration=true, cType="enum ata_link_iter_mode")
    public static enum ata_link_iter_mode implements Enum<ata_link_iter_mode>,
    TypedEnum<ata_link_iter_mode, Integer>
    {
        ATA_LITER_EDGE,
        ATA_LITER_HOST_FIRST,
        ATA_LITER_PMP_FIRST;

    }

    @Type(noCCodeGeneration=true, cType="struct ata_timing")
    @NotUsableInJava
    public static class ata_timing
    extends Struct {
        public @Unsigned short mode;
        public @Unsigned short setup;
        public @Unsigned short act8b;
        public @Unsigned short rec8b;
        public @Unsigned short cyc8b;
        public @Unsigned short active;
        public @Unsigned short recover;
        public @Unsigned short dmack_hold;
        public @Unsigned short cycle;
        public @Unsigned short udma;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_port_info")
    @NotUsableInJava
    public static class ata_port_info
    extends Struct {
        public @Unsigned long flags;
        public @Unsigned long link_flags;
        public @Unsigned int pio_mask;
        public @Unsigned int mwdma_mask;
        public @Unsigned int udma_mask;
        public Ptr<ata_port_operations> port_ops;
        public Ptr<?> private_data;
    }

    @Type(noCCodeGeneration=true, cType="enum ata_prot_flags")
    public static enum ata_prot_flags implements Enum<ata_prot_flags>,
    TypedEnum<ata_prot_flags, Integer>
    {
        ATA_PROT_FLAG_PIO,
        ATA_PROT_FLAG_DMA,
        ATA_PROT_FLAG_NCQ,
        ATA_PROT_FLAG_ATAPI,
        ATA_PROT_UNKNOWN,
        ATA_PROT_NODATA,
        ATA_PROT_PIO,
        ATA_PROT_DMA,
        ATA_PROT_NCQ_NODATA,
        ATA_PROT_NCQ,
        ATAPI_PROT_NODATA,
        ATAPI_PROT_PIO,
        ATAPI_PROT_DMA;

    }

    @Type(noCCodeGeneration=true, cType="struct ata_show_ering_arg")
    @NotUsableInJava
    public static class ata_show_ering_arg
    extends Struct {
        public String buf;
        public int written;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_internal")
    @NotUsableInJava
    public static class ata_internal
    extends Struct {
        public ScsiDefinitions.scsi_transport_template t;
        public DeviceDefinitions.device_attribute @Size(value=3) [] private_port_attrs;
        public DeviceDefinitions.device_attribute @Size(value=3) [] private_link_attrs;
        public DeviceDefinitions.device_attribute @Size(value=9) [] private_dev_attrs;
        public TransportDefinitions.transport_container link_attr_cont;
        public TransportDefinitions.transport_container dev_attr_cont;
        public Ptr<DeviceDefinitions.device_attribute> @Size(value=4) [] link_attrs;
        public Ptr<DeviceDefinitions.device_attribute> @Size(value=4) [] port_attrs;
        public Ptr<DeviceDefinitions.device_attribute> @Size(value=10) [] dev_attrs;
    }

    @Type(noCCodeGeneration=true, cType="enum ata_dev_iter_mode")
    public static enum ata_dev_iter_mode implements Enum<ata_dev_iter_mode>,
    TypedEnum<ata_dev_iter_mode, Integer>
    {
        ATA_DITER_ENABLED,
        ATA_DITER_ENABLED_REVERSE,
        ATA_DITER_ALL,
        ATA_DITER_ALL_REVERSE;

    }

    @Type(noCCodeGeneration=true, cType="struct ata_acpi_gtm")
    @NotUsableInJava
    public static class ata_acpi_gtm
    extends Struct {
        public ata_acpi_drive @Size(value=2) [] drive;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_acpi_drive")
    @NotUsableInJava
    public static class ata_acpi_drive
    extends Struct {
        public @Unsigned int pio;
        public @Unsigned int dma;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_eh_context")
    @NotUsableInJava
    public static class ata_eh_context
    extends Struct {
        public ata_eh_info i;
        public int @Size(value=2) [] tries;
        public int @Size(value=16) [] cmd_timeout_idx;
        public @Unsigned int @Size(value=2) [] classes;
        public @Unsigned int did_probe_mask;
        public @Unsigned int unloaded_mask;
        public @Unsigned int saved_ncq_enabled;
        public char @Size(value=2) [] saved_xfer_mode;
        public @Unsigned long last_reset;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_eh_info")
    @NotUsableInJava
    public static class ata_eh_info
    extends Struct {
        public Ptr<ata_device> dev;
        public @Unsigned int serror;
        public @Unsigned int err_mask;
        public @Unsigned int action;
        public @Unsigned int @Size(value=2) [] dev_action;
        public @Unsigned int flags;
        public @Unsigned int probe_mask;
        public char @Size(value=80) [] desc;
        public int desc_len;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_cdl")
    @NotUsableInJava
    public static class ata_cdl
    extends Struct {
        public char @Size(value=512) [] desc_log_buf;
        public char @Size(value=1024) [] ncq_sense_log_buf;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_cpr_log")
    @NotUsableInJava
    public static class ata_cpr_log
    extends Struct {
        public char nr_cpr;
        public ata_cpr @Size(value=0) [] cpr;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_cpr")
    @NotUsableInJava
    public static class ata_cpr
    extends Struct {
        public char num;
        public char num_storage_elements;
        public @Unsigned long start_lba;
        public @Unsigned long num_lbas;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_ering")
    @NotUsableInJava
    public static class ata_ering
    extends Struct {
        public int cursor;
        public ata_ering_entry @Size(value=32) [] ring;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_ering_entry")
    @NotUsableInJava
    public static class ata_ering_entry
    extends Struct {
        public @Unsigned int eflags;
        public @Unsigned int err_mask;
        public @Unsigned long timestamp;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_port_stats")
    @NotUsableInJava
    public static class ata_port_stats
    extends Struct {
        public @Unsigned long unhandled_irq;
        public @Unsigned long idle_irq;
        public @Unsigned long rw_reqbuf;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_device")
    @NotUsableInJava
    public static class ata_device
    extends Struct {
        public Ptr<ata_link> link;
        public @Unsigned int devno;
        public @Unsigned int quirks;
        public @Unsigned long flags;
        public Ptr<ScsiDefinitions.scsi_device> sdev;
        public Ptr<?> private_data;
        public Ptr<AcpiDefinitions.acpi_object> gtf_cache;
        public @Unsigned int gtf_filter;
        public Ptr<?> zpodd;
        public runtime.device tdev;
        public @Unsigned long n_sectors;
        public @Unsigned long n_native_sectors;
        public @Unsigned int _class;
        public @Unsigned long unpark_deadline;
        public char pio_mode;
        public char dma_mode;
        public char xfer_mode;
        public @Unsigned int xfer_shift;
        public @Unsigned int multi_count;
        public @Unsigned int max_sectors;
        public @Unsigned int cdb_len;
        public @Unsigned int pio_mask;
        public @Unsigned int mwdma_mask;
        public @Unsigned int udma_mask;
        public @Unsigned short cylinders;
        public @Unsigned short heads;
        public @Unsigned short sectors;
        @InlineUnion(value=19799)
        public @InlineUnion(value=19799) @Unsigned short @Size(value=256) [] id;
        @InlineUnion(value=19799)
        public @InlineUnion(value=19799) @Unsigned int @Size(value=128) [] gscr;
        public char @Size(value=8) [] devslp_timing;
        public char @Size(value=20) [] ncq_send_recv_cmds;
        public char @Size(value=64) [] ncq_non_data_cmds;
        public @Unsigned int zac_zoned_cap;
        public @Unsigned int zac_zones_optimal_open;
        public @Unsigned int zac_zones_optimal_nonseq;
        public @Unsigned int zac_zones_max_open;
        public Ptr<ata_cpr_log> cpr_log;
        public Ptr<ata_cdl> cdl;
        public int spdn_cnt;
        public ata_ering ering;
        public char @Size(value=512) [] sector_buf;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_port")
    @NotUsableInJava
    public static class ata_port
    extends Struct {
        public Ptr<runtime.Scsi_Host> scsi_host;
        public Ptr<ata_port_operations> ops;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
        public @Unsigned long flags;
        public @Unsigned int pflags;
        public @Unsigned int print_id;
        public @Unsigned int port_no;
        public ata_ioports ioaddr;
        public char ctl;
        public char last_ctl;
        public Ptr<ata_link> sff_pio_task_link;
        public DelayedDefinitions.delayed_work sff_pio_task;
        public Ptr<ata_bmdma_prd> bmdma_prd;
        public @Unsigned @OriginalName(value="dma_addr_t") long bmdma_prd_dma;
        public @Unsigned int pio_mask;
        public @Unsigned int mwdma_mask;
        public @Unsigned int udma_mask;
        public @Unsigned int cbl;
        public ata_queued_cmd @Size(value=33) [] qcmd;
        public @Unsigned long qc_active;
        public int nr_active_links;
        public ata_link link;
        public Ptr<ata_link> slave_link;
        public int nr_pmp_links;
        public Ptr<ata_link> pmp_link;
        public Ptr<ata_link> excl_link;
        public ata_port_stats stats;
        public Ptr<ata_host> host;
        public Ptr<runtime.device> dev;
        public runtime.device tdev;
        public runtime.mutex scsi_scan_mutex;
        public DelayedDefinitions.delayed_work hotplug_task;
        public DelayedDefinitions.delayed_work scsi_rescan_task;
        public @Unsigned int hsm_task_state;
        public ListDefinitions.list_head eh_done_q;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head eh_wait_q;
        public int eh_tries;
        public runtime.completion park_req_pending;
        public  @OriginalName(value="pm_message_t") PmDefinitions.pm_message pm_mesg;
        public ata_lpm_policy target_lpm_policy;
        public TimerDefinitions.timer_list fastdrain_timer;
        public @Unsigned int fastdrain_cnt;
        public @Unsigned @OriginalName(value="async_cookie_t") long cookie;
        public int em_message_type;
        public Ptr<?> private_data;
        public ata_acpi_gtm __acpi_init_gtm;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_port_operations")
    @NotUsableInJava
    public static class ata_port_operations
    extends Struct {
        public Ptr<?> qc_defer;
        public Ptr<?> check_atapi_dma;
        public Ptr<?> qc_prep;
        public Ptr<?> qc_issue;
        public Ptr<?> qc_fill_rtf;
        public Ptr<?> qc_ncq_fill_rtf;
        public Ptr<?> cable_detect;
        public Ptr<?> mode_filter;
        public Ptr<?> set_piomode;
        public Ptr<?> set_dmamode;
        public Ptr<?> set_mode;
        public Ptr<?> read_id;
        public Ptr<?> dev_config;
        public Ptr<?> freeze;
        public Ptr<?> thaw;
        public @OriginalName(value="ata_prereset_fn_t") Ptr<?> prereset;
        public @OriginalName(value="ata_reset_fn_t") Ptr<?> softreset;
        public @OriginalName(value="ata_reset_fn_t") Ptr<?> hardreset;
        public @OriginalName(value="ata_postreset_fn_t") Ptr<?> postreset;
        public @OriginalName(value="ata_prereset_fn_t") Ptr<?> pmp_prereset;
        public @OriginalName(value="ata_reset_fn_t") Ptr<?> pmp_softreset;
        public @OriginalName(value="ata_reset_fn_t") Ptr<?> pmp_hardreset;
        public @OriginalName(value="ata_postreset_fn_t") Ptr<?> pmp_postreset;
        public Ptr<?> error_handler;
        public Ptr<?> lost_interrupt;
        public Ptr<?> post_internal_cmd;
        public Ptr<?> sched_eh;
        public Ptr<?> end_eh;
        public Ptr<?> scr_read;
        public Ptr<?> scr_write;
        public Ptr<?> pmp_attach;
        public Ptr<?> pmp_detach;
        public Ptr<?> set_lpm;
        public Ptr<?> port_suspend;
        public Ptr<?> port_resume;
        public Ptr<?> port_start;
        public Ptr<?> port_stop;
        public Ptr<?> host_stop;
        public Ptr<?> sff_dev_select;
        public Ptr<?> sff_set_devctl;
        public Ptr<?> sff_check_status;
        public Ptr<?> sff_check_altstatus;
        public Ptr<?> sff_tf_load;
        public Ptr<?> sff_tf_read;
        public Ptr<?> sff_exec_command;
        public Ptr<?> sff_data_xfer;
        public Ptr<?> sff_irq_on;
        public Ptr<?> sff_irq_check;
        public Ptr<?> sff_irq_clear;
        public Ptr<?> sff_drain_fifo;
        public Ptr<?> bmdma_setup;
        public Ptr<?> bmdma_start;
        public Ptr<?> bmdma_stop;
        public Ptr<?> bmdma_status;
        public Ptr<?> em_show;
        public Ptr<?> em_store;
        public Ptr<?> sw_activity_show;
        public Ptr<?> sw_activity_store;
        public Ptr<?> transmit_led_message;
        public Ptr<ata_port_operations> inherits;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_host")
    @NotUsableInJava
    public static class ata_host
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<runtime.device> dev;
        public Ptr<Ptr<?>> iomap;
        public @Unsigned int n_ports;
        public @Unsigned int n_tags;
        public Ptr<?> private_data;
        public Ptr<ata_port_operations> ops;
        public @Unsigned long flags;
        public runtime.kref kref;
        public runtime.mutex eh_mutex;
        public Ptr<TaskDefinitions.task_struct> eh_owner;
        public Ptr<ata_port> simplex_claimed;
        public Ptr<ata_port> @Size(value=0) [] ports;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_ioports")
    @NotUsableInJava
    public static class ata_ioports
    extends Struct {
        public Ptr<?> cmd_addr;
        public Ptr<?> data_addr;
        public Ptr<?> error_addr;
        public Ptr<?> feature_addr;
        public Ptr<?> nsect_addr;
        public Ptr<?> lbal_addr;
        public Ptr<?> lbam_addr;
        public Ptr<?> lbah_addr;
        public Ptr<?> device_addr;
        public Ptr<?> status_addr;
        public Ptr<?> command_addr;
        public Ptr<?> altstatus_addr;
        public Ptr<?> ctl_addr;
        public Ptr<?> bmdma_addr;
        public Ptr<?> scr_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_taskfile")
    @NotUsableInJava
    public static class ata_taskfile
    extends Struct {
        public @Unsigned long flags;
        public char protocol;
        public char ctl;
        public char hob_feature;
        public char hob_nsect;
        public char hob_lbal;
        public char hob_lbam;
        public char hob_lbah;
        @InlineUnion(value=19777)
        public @InlineUnion(value=19777) char error;
        @InlineUnion(value=19777)
        public @InlineUnion(value=19777) char feature;
        public char nsect;
        public char lbal;
        public char lbam;
        public char lbah;
        public char device;
        @InlineUnion(value=19778)
        public @InlineUnion(value=19778) char status;
        @InlineUnion(value=19778)
        public @InlineUnion(value=19778) char command;
        public @Unsigned int auxiliary;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_link")
    @NotUsableInJava
    public static class ata_link
    extends Struct {
        public Ptr<ata_port> ap;
        public int pmp;
        public runtime.device tdev;
        public @Unsigned int active_tag;
        public @Unsigned int sactive;
        public @Unsigned int flags;
        public @Unsigned int saved_scontrol;
        public @Unsigned int hw_sata_spd_limit;
        public @Unsigned int sata_spd_limit;
        public @Unsigned int sata_spd;
        public ata_lpm_policy lpm_policy;
        public ata_eh_info eh_info;
        public ata_eh_context eh_context;
        public ata_device @Size(value=2) [] device;
        public @Unsigned long last_lpm_change;
    }

    @Type(noCCodeGeneration=true, cType="struct ata_queued_cmd")
    @NotUsableInJava
    public static class ata_queued_cmd
    extends Struct {
        public Ptr<ata_port> ap;
        public Ptr<ata_device> dev;
        public Ptr<ScsiDefinitions.scsi_cmnd> scsicmd;
        public Ptr<?> scsidone;
        public ata_taskfile tf;
        public char @Size(value=16) [] cdb;
        public @Unsigned long flags;
        public @Unsigned int tag;
        public @Unsigned int hw_tag;
        public @Unsigned int n_elem;
        public @Unsigned int orig_n_elem;
        public int dma_dir;
        public @Unsigned int sect_size;
        public @Unsigned int nbytes;
        public @Unsigned int extrabytes;
        public @Unsigned int curbytes;
        public runtime.scatterlist sgent;
        public Ptr<runtime.scatterlist> sg;
        public Ptr<runtime.scatterlist> cursg;
        public @Unsigned int cursg_ofs;
        public @Unsigned int err_mask;
        public ata_taskfile result_tf;
        public @OriginalName(value="ata_qc_cb_t") Ptr<?> complete_fn;
        public Ptr<?> private_data;
        public Ptr<?> lldd_task;
    }

    @Type(noCCodeGeneration=true, cType="enum ata_lpm_policy")
    public static enum ata_lpm_policy implements Enum<ata_lpm_policy>,
    TypedEnum<ata_lpm_policy, Integer>
    {
        ATA_LPM_UNKNOWN,
        ATA_LPM_MAX_POWER,
        ATA_LPM_MED_POWER,
        ATA_LPM_MED_POWER_WITH_DIPM,
        ATA_LPM_MIN_POWER_WITH_PARTIAL,
        ATA_LPM_MIN_POWER;

    }

    @Type(noCCodeGeneration=true, cType="enum ata_completion_errors")
    public static enum ata_completion_errors implements Enum<ata_completion_errors>,
    TypedEnum<ata_completion_errors, Integer>
    {
        AC_ERR_OK,
        AC_ERR_DEV,
        AC_ERR_HSM,
        AC_ERR_TIMEOUT,
        AC_ERR_MEDIA,
        AC_ERR_ATA_BUS,
        AC_ERR_HOST_BUS,
        AC_ERR_SYSTEM,
        AC_ERR_INVALID,
        AC_ERR_OTHER,
        AC_ERR_NODEV_HINT,
        AC_ERR_NCQ;

    }

    @Type(noCCodeGeneration=true, cType="struct ata_bmdma_prd")
    @NotUsableInJava
    public static class ata_bmdma_prd
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int addr;
        public @Unsigned @OriginalName(value="__le32") int flags_len;
    }

    @Type(noCCodeGeneration=true, cType="enum ata_quirks")
    public static enum ata_quirks implements Enum<ata_quirks>,
    TypedEnum<ata_quirks, Integer>
    {
        __ATA_QUIRK_DIAGNOSTIC,
        __ATA_QUIRK_NODMA,
        __ATA_QUIRK_NONCQ,
        __ATA_QUIRK_MAX_SEC_128,
        __ATA_QUIRK_BROKEN_HPA,
        __ATA_QUIRK_DISABLE,
        __ATA_QUIRK_HPA_SIZE,
        __ATA_QUIRK_IVB,
        __ATA_QUIRK_STUCK_ERR,
        __ATA_QUIRK_BRIDGE_OK,
        __ATA_QUIRK_ATAPI_MOD16_DMA,
        __ATA_QUIRK_FIRMWARE_WARN,
        __ATA_QUIRK_1_5_GBPS,
        __ATA_QUIRK_NOSETXFER,
        __ATA_QUIRK_BROKEN_FPDMA_AA,
        __ATA_QUIRK_DUMP_ID,
        __ATA_QUIRK_MAX_SEC_LBA48,
        __ATA_QUIRK_ATAPI_DMADIR,
        __ATA_QUIRK_NO_NCQ_TRIM,
        __ATA_QUIRK_NOLPM,
        __ATA_QUIRK_WD_BROKEN_LPM,
        __ATA_QUIRK_ZERO_AFTER_TRIM,
        __ATA_QUIRK_NO_DMA_LOG,
        __ATA_QUIRK_NOTRIM,
        __ATA_QUIRK_MAX_SEC_1024,
        __ATA_QUIRK_MAX_TRIM_128M,
        __ATA_QUIRK_NO_NCQ_ON_ATI,
        __ATA_QUIRK_NO_ID_DEV_LOG,
        __ATA_QUIRK_NO_LOG_DIR,
        __ATA_QUIRK_NO_FUA,
        __ATA_QUIRK_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct { u8 device; u8 reserved1; short unsigned int reserved2; unsigned int reserved3; long long unsigned int reserved4; }")
    @NotUsableInJava
    public static class ata_of_device_path_of_edd_device_params_and_sata_of_device_path_of_edd_device_params
    extends Struct {
        public char device;
        public char reserved1;
        public @Unsigned short reserved2;
        public @Unsigned int reserved3;
        public @Unsigned long reserved4;
    }
}

