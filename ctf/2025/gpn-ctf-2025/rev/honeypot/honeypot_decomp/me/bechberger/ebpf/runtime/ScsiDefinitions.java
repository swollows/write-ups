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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BsgDefinitions;
import me.bechberger.ebpf.runtime.CdromDefinitions;
import me.bechberger.ebpf.runtime.ClassDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.PrDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TransportDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ScsiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_device> __scsi_add_device(Ptr<runtime.Scsi_Host> shost, @Unsigned @OriginalName(value="uint") int channel2, @Unsigned @OriginalName(value="uint") int id, @Unsigned long lun, Ptr<?> hostdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __scsi_scan_target(Ptr<runtime.device> parent, @Unsigned int channel2, @Unsigned int id, @Unsigned long lun, scsi_scan_mode rescan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_add_device(Ptr<runtime.Scsi_Host> host, @Unsigned @OriginalName(value="uint") int channel2, @Unsigned @OriginalName(value="uint") int target, @Unsigned long lun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_add_lun(Ptr<scsi_device> sdev, String inq_result, Ptr<@Unsigned @OriginalName(value="blist_flags_t") Long> bflags, int async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_device> scsi_alloc_sdev(Ptr<scsi_target> starget, @Unsigned long lun, Ptr<?> hostdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_target> scsi_alloc_target(Ptr<runtime.device> parent, int channel2, @Unsigned @OriginalName(value="uint") int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_autopm_get_device(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_autopm_get_host(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_autopm_get_target(Ptr<scsi_target> starget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_autopm_put_device(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_autopm_put_host(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_autopm_put_target(Ptr<scsi_target> starget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_bus_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_bus_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_bus_prepare(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_bus_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_bus_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_bus_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_bus_thaw(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_cdrom_send_packet(Ptr<scsi_device> sdev, boolean open_for_write, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scsi_cmd_allowed(String cmd, boolean open_for_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_complete_async_scans() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_enable_async_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_exit_procfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_exit_sysctl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_forget_host(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_get_cdrom_generic_arg($arg1, (const void*)$arg2)")
    public static int scsi_get_cdrom_generic_arg(Ptr<CdromDefinitions.cdrom_generic_command> cgc, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_init_procfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_init_sysctl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_ioctl(Ptr<scsi_device> sdev, boolean open_for_write, int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_ioctl_block_when_processing_errors(Ptr<scsi_device> sdev, int cmd, boolean ndelay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_is_target_device((const struct device*)$arg1)")
    public static int scsi_is_target_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_probe_and_add_lun(Ptr<scsi_target> starget, @Unsigned long lun, Ptr<@Unsigned @OriginalName(value="blist_flags_t") Long> bflagsp, Ptr<Ptr<scsi_device>> sdevp, scsi_scan_mode rescan, Ptr<?> hostdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_proc_host_add(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_proc_host_rm(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_proc_hostdir_add((const struct scsi_host_template*)$arg1)")
    public static int scsi_proc_hostdir_add(Ptr<scsi_host_template> sht) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_proc_hostdir_rm((const struct scsi_host_template*)$arg1)")
    public static void scsi_proc_hostdir_rm(Ptr<scsi_host_template> sht) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_realloc_sdev_budget_map(Ptr<scsi_device> sdev, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_report_lun_scan(Ptr<scsi_target> starget, @Unsigned @OriginalName(value="blist_flags_t") long bflags, scsi_scan_mode rescan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_rescan_device(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_resume_device(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_runtime_idle(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_sanitize_inquiry_string(String s2, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_scan_channel(Ptr<runtime.Scsi_Host> shost, @Unsigned int channel2, @Unsigned int id, @Unsigned long lun, scsi_scan_mode rescan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_scan_host(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_scan_host_selected(Ptr<runtime.Scsi_Host> shost, @Unsigned int channel2, @Unsigned int id, @Unsigned long lun, scsi_scan_mode rescan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_scan_target(Ptr<runtime.device> parent, @Unsigned int channel2, @Unsigned int id, @Unsigned long lun, scsi_scan_mode rescan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> scsi_seq_next(Ptr<SeqDefinitions.seq_file> sfile, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_seq_show(Ptr<SeqDefinitions.seq_file> sfile, Ptr<?> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> scsi_seq_start(Ptr<SeqDefinitions.seq_file> sfile, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_seq_stop(Ptr<SeqDefinitions.seq_file> sfile, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_set_medium_removal(Ptr<scsi_device> sdev, char state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_target_destroy(Ptr<scsi_target> starget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_target_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_target_reap(Ptr<scsi_target> starget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_template_proc_dir((const struct scsi_host_template*)$arg1)")
    public static Ptr<ProcDefinitions.proc_dir_entry> scsi_template_proc_dir(Ptr<scsi_host_template> sht) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__scsi_format_command($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @Unsigned long __scsi_format_command(String logbuf, @Unsigned long logbuf_len, String cdb, @Unsigned long cdb_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__scsi_print_sense((const struct scsi_device*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void __scsi_print_sense(Ptr<scsi_device> sdev, String name, String sense_buffer, int sense_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String scsi_bios_ptable(Ptr<BlockDefinitions.block_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_build_sense_buffer(int desc, Ptr<Character> buf, char key2, char asc, char ascq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_dev_info_add_list($arg1, (const u8*)$arg2)")
    public static int scsi_dev_info_add_list(scsi_devinfo_key key2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_dev_info_list_add_keyed(int compatible, String vendor, String model, String strflags, @Unsigned @OriginalName(value="blist_flags_t") long flags, scsi_devinfo_key key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_dev_info_list_add_str(String dev_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_dev_info_list_del_keyed(String vendor, String model, scsi_devinfo_key key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_dev_info_list_find((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<scsi_dev_info_list> scsi_dev_info_list_find(String vendor, String model, scsi_devinfo_key key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_dev_info_remove_list(scsi_devinfo_key key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_device_type($arg1))")
    public static String scsi_device_type(@Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_disk_free_disk(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_disk_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_dma_map(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_dma_unmap(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_exit_devinfo() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_extd_sense_format($arg1, $arg2, (const u8**)$arg3))")
    public static String scsi_extd_sense_format(char asc, char ascq, Ptr<String> fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_format_opcode_name($arg1, $arg2, (const u8*)$arg3)")
    public static @Unsigned long scsi_format_opcode_name(String buffer, @Unsigned long buf_len, String cdbp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_get_device_flags($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static @Unsigned @OriginalName(value="blist_flags_t") long scsi_get_device_flags(Ptr<scsi_device> sdev, String vendor, String model) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_get_device_flags_keyed($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static @Unsigned @OriginalName(value="blist_flags_t") long scsi_get_device_flags_keyed(Ptr<scsi_device> sdev, String vendor, String model, scsi_devinfo_key key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_hostbyte_string($arg1))")
    public static String scsi_hostbyte_string(int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_init_devinfo() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_log_print_sense((const struct scsi_device*)$arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static void scsi_log_print_sense(Ptr<scsi_device> sdev, String name, int tag, String sense_buffer, int sense_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_log_print_sense_hdr((const struct scsi_device*)$arg1, (const u8*)$arg2, $arg3, (const struct scsi_sense_hdr*)$arg4)")
    public static void scsi_log_print_sense_hdr(Ptr<scsi_device> sdev, String name, int tag, Ptr<scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String scsi_log_reserve_buffer(Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_mlreturn_string($arg1))")
    public static String scsi_mlreturn_string(int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_normalize_sense((const u8*)$arg1, $arg2, $arg3)")
    public static boolean scsi_normalize_sense(Ptr<Character> sense_buffer, int sb_len, Ptr<scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_opcode_sa_name($arg1, $arg2, (const u8**)$arg3, (const u8**)$arg4)")
    public static boolean scsi_opcode_sa_name(int opcode, int service_action, Ptr<String> cdb_name, Ptr<String> sa_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scsi_partsize(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long capacity, Ptr<Integer> geom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PrDefinitions.pr_type scsi_pr_type_to_block(scsi_pr_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_print_command(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_print_result((const struct scsi_cmnd*)$arg1, (const u8*)$arg2, $arg3)")
    public static void scsi_print_result(Ptr<scsi_cmnd> cmd, String msg, int disposition) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_print_sense((const struct scsi_cmnd*)$arg1)")
    public static void scsi_print_sense(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_print_sense_hdr((const struct scsi_device*)$arg1, (const u8*)$arg2, (const struct scsi_sense_hdr*)$arg3)")
    public static void scsi_print_sense_hdr(Ptr<scsi_device> sdev, String name, Ptr<scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_sense_desc_find((const u8*)$arg1, $arg2, $arg3))")
    public static Ptr<Character> scsi_sense_desc_find(Ptr<Character> sense_buffer, int sb_len, int desc_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_sense_key_string($arg1))")
    public static String scsi_sense_key_string(char key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_set_sense_field_pointer(Ptr<Character> buf, int buf_len, @Unsigned short fp, char bp, boolean cd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_set_sense_information(Ptr<Character> buf, int buf_len, @Unsigned long info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scsi_status_is_good(int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_strcpy_devinfo(String name, String to, @Unsigned long to_length, String from, int compatible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_trace_parse_cdb($arg1, $arg2, $arg3))")
    public static String scsi_trace_parse_cdb(Ptr<TraceDefinitions.trace_seq> p, String cdb, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_device> __scsi_device_lookup(Ptr<runtime.Scsi_Host> shost, @Unsigned @OriginalName(value="uint") int channel2, @Unsigned @OriginalName(value="uint") int id, @Unsigned long lun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_device> __scsi_device_lookup_by_target(Ptr<scsi_target> starget, @Unsigned long lun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_device> __scsi_iterate_devices(Ptr<runtime.Scsi_Host> shost, Ptr<scsi_device> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __scsi_queue_insert(Ptr<scsi_cmnd> cmd, int reason, boolean unbusy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> scsi_alloc_request(Ptr<RequestDefinitions.request_queue> q, @Unsigned @OriginalName(value="blk_opf_t") int opf, @Unsigned @OriginalName(value="blk_mq_req_flags_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char scsi_alloc_sgtables(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_attach_vpd(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_block_requests(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_block_targets(Ptr<runtime.Scsi_Host> shost, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BsgDefinitions.bsg_device> scsi_bsg_register_queue(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_bsg_sg_io_fn(Ptr<RequestDefinitions.request_queue> q, Ptr<SgDefinitions.sg_io_v4> hdr, boolean open_for_write, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_build_sense(Ptr<scsi_cmnd> scmd, int desc, char key2, char asc, char ascq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_cdl_check(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_cdl_enable(Ptr<scsi_device> sdev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_change_queue_depth(Ptr<scsi_device> sdev, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_check_passthrough(Ptr<scsi_cmnd> scmd, Ptr<scsi_failures> failures) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_cleanup_rq(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scsi_cmd_runtime_exceeced(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_commit_rqs(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_complete(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_dec_host_busy(Ptr<runtime.Scsi_Host> shost, Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_device_block(Ptr<scsi_device> sdev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_device> scsi_device_from_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_device_get(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_device> scsi_device_lookup(Ptr<runtime.Scsi_Host> shost, @Unsigned @OriginalName(value="uint") int channel2, @Unsigned @OriginalName(value="uint") int id, @Unsigned long lun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_device> scsi_device_lookup_by_target(Ptr<scsi_target> starget, @Unsigned long lun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_device_max_queue_depth(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_device_put(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_device_quiesce(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_device_resume(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_device_set_state(Ptr<scsi_device> sdev, scsi_device_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_device_unbusy(Ptr<scsi_device> sdev, Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_dispatch_cmd(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_done(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_done_direct(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_done_internal(Ptr<scsi_cmnd> cmd, boolean complete_directly) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scsi_end_request(Ptr<runtime.request> req2, @OriginalName(value="blk_status_t") char error, @Unsigned int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_evt_thread(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_execute_cmd($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const struct scsi_exec_args*)$arg8)")
    public static int scsi_execute_cmd(Ptr<scsi_device> sdev, String cmd, @Unsigned @OriginalName(value="blk_opf_t") int opf, Ptr<?> buffer, @Unsigned int bufflen, int timeout, int ml_retries, Ptr<scsi_exec_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_exit_queue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_failures_reset_retries(Ptr<scsi_failures> failures) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_finish_command(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_free_sgtables(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<scsi_vpd> scsi_get_vpd_buf(Ptr<scsi_device> sdev, char page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_get_vpd_page(Ptr<scsi_device> sdev, char page2, String buf, int buf_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_get_vpd_size(Ptr<scsi_device> sdev, char page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_host_block(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_host_unblock(Ptr<runtime.Scsi_Host> shost, int new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_init_command(Ptr<scsi_device> dev, Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_init_hctx(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<?> data, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_init_limits(Ptr<runtime.Scsi_Host> shost, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_init_sense_cache(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_initialize_rq(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_internal_device_block_nowait(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_internal_device_unblock_nowait(Ptr<scsi_device> sdev, scsi_device_state new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_io_completion(Ptr<scsi_cmnd> cmd, @Unsigned int good_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_io_completion_action(Ptr<scsi_cmnd> cmd, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_kick_sdev_queue(Ptr<scsi_device> sdev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> scsi_kmap_atomic_sg(Ptr<runtime.scatterlist> sgl, int sg_count, Ptr<@Unsigned Long> offset, Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_kunmap_atomic_sg(Ptr<?> virt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_log_completion(Ptr<scsi_cmnd> cmd, int disposition) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_log_send(Ptr<scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_map_queues(Ptr<BlkDefinitions.blk_mq_tag_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_mode_select(Ptr<scsi_device> sdev, int pf, int sp, String buffer, int len, int timeout, int retries, Ptr<scsi_mode_data> data, Ptr<scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_mode_sense(Ptr<scsi_device> sdev, int dbd, int modepage, int subpage, String buffer, int len, int timeout, int retries, Ptr<scsi_mode_data> data, Ptr<scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_mq_exit_request(Ptr<BlkDefinitions.blk_mq_tag_set> set, Ptr<runtime.request> rq2, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_mq_free_tags(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_mq_get_budget(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_mq_get_rq_budget_token(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_mq_init_request(Ptr<BlkDefinitions.blk_mq_tag_set> set, Ptr<runtime.request> rq2, @Unsigned int hctx_idx, @Unsigned int numa_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scsi_mq_lld_busy(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_mq_poll(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<IoDefinitions.io_comp_batch> iob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_mq_put_budget(Ptr<RequestDefinitions.request_queue> q, int budget_token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_mq_requeue_cmd(Ptr<scsi_cmnd> cmd, @Unsigned long msecs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_mq_set_rq_budget_token(Ptr<runtime.request> req2, int token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_mq_setup_tags(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_netlink_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_netlink_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_nl_rcv_msg(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char scsi_prepare_cmd(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_queue_insert(Ptr<scsi_cmnd> cmd, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_queue_rq($arg1, (const struct blk_mq_queue_data*)$arg2)")
    public static @OriginalName(value="blk_status_t") char scsi_queue_rq(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<BlkDefinitions.blk_mq_queue_data> bd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_report_opcode(Ptr<scsi_device> sdev, String buffer, @Unsigned int len, char opcode, @Unsigned short sa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_requeue_run_queue(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char scsi_result_to_blk_status(int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_run_host_queues(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_run_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_run_queue_async(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_start_queue(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_starved_list_run(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_target_queue_ready(Ptr<runtime.Scsi_Host> shost, Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_target_quiesce(Ptr<scsi_target> starget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_target_resume(Ptr<scsi_target> starget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_target_unblock(Ptr<runtime.device> dev, scsi_device_state new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_test_unit_ready(Ptr<scsi_device> sdev, int timeout, int retries, Ptr<scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_track_queue_full(Ptr<scsi_device> sdev, int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_unblock_requests(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_vpd_inquiry(Ptr<scsi_device> sdev, String buffer, char page2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_vpd_lun_id(Ptr<scsi_device> sdev, String id, @Unsigned long id_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_vpd_tpg_id(Ptr<scsi_device> sdev, Ptr<Integer> rel_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__scsi_dh_lookup((const u8*)$arg1)")
    public static Ptr<scsi_device_handler> __scsi_dh_lookup(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __scsi_host_busy_iter_fn(Ptr<runtime.request> req2, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__scsi_host_match($arg1, (const void*)$arg2)")
    public static int __scsi_host_match(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __scsi_register_driver(Ptr<DeviceDefinitions.device_driver> drv, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __scsi_remove_device(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __scsi_report_device_reset(Ptr<scsi_device> sdev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_add_host_with_dma(Ptr<runtime.Scsi_Host> shost, Ptr<runtime.device> dev, Ptr<runtime.device> dma_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_block_when_processing_errors(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int scsi_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> gendrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_bus_uevent((const struct device*)$arg1, $arg2)")
    public static int scsi_bus_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static scsi_disposition scsi_check_sense(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_command_normalize_sense((const struct scsi_cmnd*)$arg1, $arg2)")
    public static boolean scsi_command_normalize_sense(Ptr<scsi_cmnd> cmd, Ptr<scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static scsi_disposition scsi_decide_disposition(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_device_cls_release(Ptr<runtime.device> class_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_device_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_device_state_name($arg1))")
    public static String scsi_device_state_name(scsi_device_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_dh_activate(Ptr<RequestDefinitions.request_queue> q, @OriginalName(value="activate_complete") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_dh_add_device(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_dh_attach($arg1, (const u8*)$arg2)")
    public static int scsi_dh_attach(Ptr<RequestDefinitions.request_queue> q, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_dh_attached_handler_name($arg1, $arg2))")
    public static String scsi_dh_attached_handler_name(Ptr<RequestDefinitions.request_queue> q, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_dh_find_driver($arg1))")
    public static String scsi_dh_find_driver(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_dh_handler_attach(Ptr<scsi_device> sdev, Ptr<scsi_device_handler> scsi_dh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_dh_release_device(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_dh_set_params($arg1, (const u8*)$arg2)")
    public static int scsi_dh_set_params(Ptr<RequestDefinitions.request_queue> q, String params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_eh_bus_device_reset(Ptr<runtime.Scsi_Host> shost, Ptr<ListDefinitions.list_head> work_q, Ptr<ListDefinitions.list_head> done_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_eh_bus_reset(Ptr<runtime.Scsi_Host> shost, Ptr<ListDefinitions.list_head> work_q, Ptr<ListDefinitions.list_head> done_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_eh_done(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_eh_finish_cmd(Ptr<scsi_cmnd> scmd, Ptr<ListDefinitions.list_head> done_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_eh_flush_done_q(Ptr<ListDefinitions.list_head> done_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_eh_get_sense(Ptr<ListDefinitions.list_head> work_q, Ptr<ListDefinitions.list_head> done_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_eh_inc_host_failed(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_eh_prep_cmnd(Ptr<scsi_cmnd> scmd, Ptr<scsi_eh_save> ses, String cmnd, int cmnd_size, @Unsigned int sense_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_eh_ready_devs(Ptr<runtime.Scsi_Host> shost, Ptr<ListDefinitions.list_head> work_q, Ptr<ListDefinitions.list_head> done_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_eh_restore_cmnd(Ptr<scsi_cmnd> scmd, Ptr<scsi_eh_save> ses) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_eh_scmd_add(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_eh_stu(Ptr<runtime.Scsi_Host> shost, Ptr<ListDefinitions.list_head> work_q, Ptr<ListDefinitions.list_head> done_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_eh_target_reset(Ptr<runtime.Scsi_Host> shost, Ptr<ListDefinitions.list_head> work_q, Ptr<ListDefinitions.list_head> done_q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_eh_test_devices(Ptr<ListDefinitions.list_head> cmd_list, Ptr<ListDefinitions.list_head> work_q, Ptr<ListDefinitions.list_head> done_q, int try_stu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_eh_try_stu(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_eh_tur(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_eh_wakeup(Ptr<runtime.Scsi_Host> shost, @Unsigned int busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_error_handler(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_exit_hosts() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_flush_work(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_get_sense_info_fld((const u8*)$arg1, $arg2, $arg3)")
    public static boolean scsi_get_sense_info_fld(Ptr<Character> sense_buffer, int sb_len, Ptr<@Unsigned Long> info_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_handle_queue_full(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_handle_queue_ramp_up(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_host_alloc((const struct scsi_host_template*)$arg1, $arg2)")
    public static Ptr<runtime.Scsi_Host> scsi_host_alloc(Ptr<scsi_host_template> sht, int privsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_host_busy(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_host_busy_iter($arg1, (_Bool (*)(struct scsi_cmnd*, void*))$arg2, $arg3)")
    public static void scsi_host_busy_iter(Ptr<runtime.Scsi_Host> shost, Ptr<?> fn, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scsi_host_check_in_flight(Ptr<runtime.request> rq2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_host_cls_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_host_complete_all_commands(Ptr<runtime.Scsi_Host> shost, scsi_host_status status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_host_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Scsi_Host> scsi_host_get(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.Scsi_Host> scsi_host_lookup(@Unsigned int hostnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_host_put(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_host_set_state(Ptr<runtime.Scsi_Host> shost, scsi_host_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)scsi_host_state_name($arg1))")
    public static String scsi_host_state_name(scsi_host_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_init_hosts() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_ioctl_reset(Ptr<scsi_device> dev, Ptr<Integer> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_is_host_device((const struct device*)$arg1)")
    public static int scsi_is_host_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="scsi_is_sdev_device((const struct device*)$arg1)")
    public static int scsi_is_sdev_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean scsi_noretry_cmd(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_queue_work(Ptr<runtime.Scsi_Host> shost, Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_register_device_handler(Ptr<scsi_device_handler> scsi_dh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_register_interface(Ptr<ClassDefinitions.class_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_remove_device(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_remove_host(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_remove_target(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_report_bus_reset(Ptr<runtime.Scsi_Host> shost, int channel2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_report_device_reset(Ptr<runtime.Scsi_Host> shost, int channel2, int target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_report_sense(Ptr<scsi_device> sdev, Ptr<scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_restart_operations(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_schedule_eh(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short scsi_sdev_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short scsi_sdev_bin_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static scsi_disposition scsi_send_eh_cmnd(Ptr<scsi_cmnd> scmd, String cmnd, int cmnd_size, int timeout, @Unsigned int sense_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_show_rq(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_sysfs_add_host(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_sysfs_add_sdev(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_sysfs_device_initialize(Ptr<scsi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_sysfs_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_sysfs_unregister() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static BlkDefinitions.blk_eh_timer_return scsi_timeout(Ptr<runtime.request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static scsi_disposition scsi_try_bus_reset(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static scsi_disposition scsi_try_host_reset(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static scsi_disposition scsi_try_target_reset(Ptr<scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void scsi_unjam_host(Ptr<runtime.Scsi_Host> shost) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int scsi_unregister_device_handler(Ptr<scsi_device_handler> scsi_dh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_nl_hdr")
    @NotUsableInJava
    public static class scsi_nl_hdr
    extends Struct {
        public char version;
        public char transport;
        public @Unsigned short magic;
        public @Unsigned short msgtype;
        public @Unsigned short msglen;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_vpd_parameters")
    public static enum scsi_vpd_parameters implements Enum<scsi_vpd_parameters>,
    TypedEnum<scsi_vpd_parameters, Integer>
    {
        SCSI_VPD_HEADER_SIZE,
        SCSI_VPD_LIST_SIZE;

    }

    @Type(noCCodeGeneration=true, cType="enum scsi_prot_flags")
    public static enum scsi_prot_flags implements Enum<scsi_prot_flags>,
    TypedEnum<scsi_prot_flags, Integer>
    {
        SCSI_PROT_TRANSFER_PI,
        SCSI_PROT_GUARD_CHECK,
        SCSI_PROT_REF_CHECK,
        SCSI_PROT_REF_INCREMENT,
        SCSI_PROT_IP_CHECKSUM;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_stream_status_header")
    @NotUsableInJava
    public static class scsi_stream_status_header
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int len;
        public @Unsigned short reserved;
        public @Unsigned @OriginalName(value="__be16") short number_of_open_streams;
        public AnonDefinitions.anon_member_of_scsi_stream_status_header anon3;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_stream_status")
    @NotUsableInJava
    public static class scsi_stream_status
    extends Struct {
        public char reserved1;
        public char perm;
        public char reserved2;
        public @Unsigned @OriginalName(value="__be16") short stream_identifier;
        public char rel_lifetime;
        public char reserved3;
        public char @Size(value=3) [] reserved4;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_io_group_descriptor")
    @NotUsableInJava
    public static class scsi_io_group_descriptor
    extends Struct {
        public char ic_enable;
        public char cs_enble;
        public char st_enble;
        public char reserved1;
        public char io_advice_hints_mode;
        public char @Size(value=3) [] reserved2;
        public char lbm_descriptor_type;
        public char rlbsr;
        public char reserved3;
        public char acdlu;
        public char @Size(value=2) [] params;
        public char reserved4;
        public char @Size(value=8) [] reserved5;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_pr_type")
    public static enum scsi_pr_type implements Enum<scsi_pr_type>,
    TypedEnum<scsi_pr_type, Integer>
    {
        SCSI_PR_WRITE_EXCLUSIVE,
        SCSI_PR_EXCLUSIVE_ACCESS,
        SCSI_PR_WRITE_EXCLUSIVE_REG_ONLY,
        SCSI_PR_EXCLUSIVE_ACCESS_REG_ONLY,
        SCSI_PR_WRITE_EXCLUSIVE_ALL_REGS,
        SCSI_PR_EXCLUSIVE_ACCESS_ALL_REGS;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_varlen_cdb_hdr")
    @NotUsableInJava
    public static class scsi_varlen_cdb_hdr
    extends Struct {
        public char opcode;
        public char control;
        public char @Size(value=5) [] misc;
        public char additional_cdb_length;
        public @Unsigned @OriginalName(value="__be16") short service_action;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_dev_info_list_table")
    @NotUsableInJava
    public static class scsi_dev_info_list_table
    extends Struct {
        public ListDefinitions.list_head node;
        public ListDefinitions.list_head scsi_dev_info_list;
        public String name;
        public int key;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_dev_info_list")
    @NotUsableInJava
    public static class scsi_dev_info_list
    extends Struct {
        public ListDefinitions.list_head dev_info_list;
        public char @Size(value=8) [] vendor;
        public char @Size(value=16) [] model;
        public @Unsigned @OriginalName(value="blist_flags_t") long flags;
        public @Unsigned int compatible;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_devinfo_key")
    public static enum scsi_devinfo_key implements Enum<scsi_devinfo_key>,
    TypedEnum<scsi_devinfo_key, Integer>
    {
        SCSI_DEVINFO_GLOBAL,
        SCSI_DEVINFO_SPI;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_proc_entry")
    @NotUsableInJava
    public static class scsi_proc_entry
    extends Struct {
        public ListDefinitions.list_head entry;
        public Ptr<scsi_host_template> sht;
        public Ptr<ProcDefinitions.proc_dir_entry> proc_dir;
        public @Unsigned int present;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_timeouts")
    public static enum scsi_timeouts implements Enum<scsi_timeouts>,
    TypedEnum<scsi_timeouts, Integer>
    {
        SCSI_DEFAULT_EH_TIMEOUT;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_lun")
    @NotUsableInJava
    public static class scsi_lun
    extends Struct {
        public char @Size(value=8) [] scsi_lun;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_idlun")
    @NotUsableInJava
    public static class scsi_idlun
    extends Struct {
        public @Unsigned int dev_id;
        public @Unsigned int host_unique_id;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_ioctl_command")
    @NotUsableInJava
    public static class scsi_ioctl_command
    extends Struct {
        public @Unsigned int inlen;
        public @Unsigned int outlen;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_msg_byte")
    public static enum scsi_msg_byte implements Enum<scsi_msg_byte>,
    TypedEnum<scsi_msg_byte, Integer>
    {
        COMMAND_COMPLETE,
        EXTENDED_MESSAGE,
        SAVE_POINTERS,
        RESTORE_POINTERS,
        DISCONNECT,
        INITIATOR_ERROR,
        ABORT_TASK_SET,
        MESSAGE_REJECT,
        NOP,
        MSG_PARITY_ERROR,
        LINKED_CMD_COMPLETE,
        LINKED_FLG_CMD_COMPLETE,
        TARGET_RESET,
        ABORT_TASK,
        CLEAR_TASK_SET,
        INITIATE_RECOVERY,
        RELEASE_RECOVERY,
        TERMINATE_IO_PROC,
        CLEAR_ACA,
        LOGICAL_UNIT_RESET,
        SIMPLE_QUEUE_TAG,
        HEAD_OF_QUEUE_TAG,
        ORDERED_QUEUE_TAG,
        IGNORE_WIDE_RESIDUE,
        ACA,
        QAS_REQUEST,
        BUS_DEVICE_RESET,
        ABORT;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_cd")
    @NotUsableInJava
    public static class scsi_cd
    extends Struct {
        public @Unsigned int capacity;
        public Ptr<scsi_device> device;
        public @Unsigned int vendor;
        public @Unsigned long ms_offset;
        public @Unsigned int writeable;
        public @Unsigned int use;
        public @Unsigned int xa_flag;
        public @Unsigned int readcd_known;
        public @Unsigned int readcd_cdda;
        public @Unsigned int media_present;
        public int tur_mismatch;
        public boolean tur_changed;
        public boolean get_event_changed;
        public boolean ignore_get_event;
        public CdromDefinitions.cdrom_device_info cdi;
        public runtime.mutex lock;
        public Ptr<runtime.gendisk> disk;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_exec_args")
    @NotUsableInJava
    public static class scsi_exec_args
    extends Struct {
        public String sense;
        public @Unsigned int sense_len;
        public Ptr<scsi_sense_hdr> sshdr;
        public @Unsigned @OriginalName(value="blk_mq_req_flags_t") int req_flags;
        public int scmd_flags;
        public Ptr<Integer> resid;
        public Ptr<scsi_failures> failures;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_failures")
    @NotUsableInJava
    public static class scsi_failures
    extends Struct {
        public int total_allowed;
        public int total_retries;
        public Ptr<scsi_failure> failure_definitions;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_failure")
    @NotUsableInJava
    public static class scsi_failure
    extends Struct {
        public int result;
        public char sense;
        public char asc;
        public char ascq;
        public @OriginalName(value="s8") byte allowed;
        public @OriginalName(value="s8") byte retries;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_mode_data")
    @NotUsableInJava
    public static class scsi_mode_data
    extends Struct {
        public @Unsigned int length;
        public @Unsigned short block_descriptor_length;
        public char medium_type;
        public char device_specific;
        public char header_length;
        public char longlba;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_disk")
    @NotUsableInJava
    public static class scsi_disk
    extends Struct {
        public Ptr<scsi_device> device;
        public runtime.device disk_dev;
        public Ptr<runtime.gendisk> disk;
        public Ptr<OpalDefinitions.opal_dev> opal_dev;
        public misc.zoned_disk_info early_zone_info;
        public misc.zoned_disk_info zone_info;
        public @Unsigned int zones_optimal_open;
        public @Unsigned int zones_optimal_nonseq;
        public @Unsigned int zones_max_open;
        public @Unsigned int zone_starting_lba_gran;
        public AtomicDefinitions.atomic_t openers;
        public @Unsigned @OriginalName(value="sector_t") long capacity;
        public int max_retries;
        public @Unsigned int min_xfer_blocks;
        public @Unsigned int max_xfer_blocks;
        public @Unsigned int opt_xfer_blocks;
        public @Unsigned int max_ws_blocks;
        public @Unsigned int max_unmap_blocks;
        public @Unsigned int unmap_granularity;
        public @Unsigned int unmap_alignment;
        public @Unsigned int max_atomic;
        public @Unsigned int atomic_alignment;
        public @Unsigned int atomic_granularity;
        public @Unsigned int max_atomic_with_boundary;
        public @Unsigned int max_atomic_boundary;
        public @Unsigned int index;
        public @Unsigned int physical_block_size;
        public @Unsigned int max_medium_access_timeouts;
        public @Unsigned int medium_access_timed_out;
        public @Unsigned short permanent_stream_count;
        public char media_present;
        public char write_prot;
        public char protection_type;
        public char provisioning_mode;
        public char zeroing_mode;
        public char nr_actuators;
        public boolean suspended;
        public @Unsigned int ATO;
        public @Unsigned int cache_override;
        public @Unsigned int WCE;
        public @Unsigned int RCD;
        public @Unsigned int DPOFUA;
        public @Unsigned int first_scan;
        public @Unsigned int lbpme;
        public @Unsigned int lbprz;
        public @Unsigned int lbpu;
        public @Unsigned int lbpws;
        public @Unsigned int lbpws10;
        public @Unsigned int lbpvpd;
        public @Unsigned int ws10;
        public @Unsigned int ws16;
        public @Unsigned int rc_basis;
        public @Unsigned int zoned;
        public @Unsigned int urswrz;
        public @Unsigned int security;
        public @Unsigned int ignore_medium_access_errors;
        public @Unsigned int rscs;
        public @Unsigned int use_atomic_write_boundary;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_host_guard_type")
    public static enum scsi_host_guard_type implements Enum<scsi_host_guard_type>,
    TypedEnum<scsi_host_guard_type, Integer>
    {
        SHOST_DIX_GUARD_CRC,
        SHOST_DIX_GUARD_IP;

    }

    @Type(noCCodeGeneration=true, cType="enum scsi_host_prot_capabilities")
    public static enum scsi_host_prot_capabilities implements Enum<scsi_host_prot_capabilities>,
    TypedEnum<scsi_host_prot_capabilities, Integer>
    {
        SHOST_DIF_TYPE1_PROTECTION,
        SHOST_DIF_TYPE2_PROTECTION,
        SHOST_DIF_TYPE3_PROTECTION,
        SHOST_DIX_TYPE0_PROTECTION,
        SHOST_DIX_TYPE1_PROTECTION,
        SHOST_DIX_TYPE2_PROTECTION,
        SHOST_DIX_TYPE3_PROTECTION;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_dh_blist")
    @NotUsableInJava
    public static class scsi_dh_blist
    extends Struct {
        public String vendor;
        public String model;
        public String driver;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_event")
    @NotUsableInJava
    public static class scsi_event
    extends Struct {
        public scsi_device_event evt_type;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_scan_mode")
    public static enum scsi_scan_mode implements Enum<scsi_scan_mode>,
    TypedEnum<scsi_scan_mode, Integer>
    {
        SCSI_SCAN_INITIAL,
        SCSI_SCAN_RESCAN,
        SCSI_SCAN_MANUAL;

    }

    @Type(noCCodeGeneration=true, cType="enum scsi_ml_status")
    public static enum scsi_ml_status implements Enum<scsi_ml_status>,
    TypedEnum<scsi_ml_status, Integer>
    {
        SCSIML_STAT_OK,
        SCSIML_STAT_RESV_CONFLICT,
        SCSIML_STAT_NOSPC,
        SCSIML_STAT_MED_ERROR,
        SCSIML_STAT_TGT_FAILURE,
        SCSIML_STAT_DL_TIMEOUT;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_eh_save")
    @NotUsableInJava
    public static class scsi_eh_save
    extends Struct {
        public int result;
        public @Unsigned int resid_len;
        public int eh_eflags;
        public DmaDefinitions.dma_data_direction data_direction;
        public @Unsigned int underflow;
        public char cmd_len;
        public char prot_op;
        public char @Size(value=32) [] cmnd;
        public scsi_data_buffer sdb;
        public runtime.scatterlist sense_sgl;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_driver")
    @NotUsableInJava
    public static class scsi_driver
    extends Struct {
        public DeviceDefinitions.device_driver gendrv;
        public Ptr<?> resume;
        public Ptr<?> rescan;
        public Ptr<?> init_command;
        public Ptr<?> uninit_command;
        public Ptr<?> done;
        public Ptr<?> eh_action;
        public Ptr<?> eh_reset;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_prot_operations")
    public static enum scsi_prot_operations implements Enum<scsi_prot_operations>,
    TypedEnum<scsi_prot_operations, Integer>
    {
        SCSI_PROT_NORMAL,
        SCSI_PROT_READ_INSERT,
        SCSI_PROT_WRITE_STRIP,
        SCSI_PROT_READ_STRIP,
        SCSI_PROT_WRITE_INSERT,
        SCSI_PROT_READ_PASS,
        SCSI_PROT_WRITE_PASS;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_device_handler")
    @NotUsableInJava
    public static class scsi_device_handler
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.module> module;
        public String name;
        public Ptr<?> check_sense;
        public Ptr<?> attach;
        public Ptr<?> detach;
        public Ptr<?> activate;
        public Ptr<?> prep_fn;
        public Ptr<?> set_params;
        public Ptr<?> rescan;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_disposition")
    public static enum scsi_disposition implements Enum<scsi_disposition>,
    TypedEnum<scsi_disposition, Integer>
    {
        NEEDS_RETRY,
        SUCCESS,
        FAILED,
        QUEUED,
        SOFT_ERROR,
        ADD_TO_MLQUEUE,
        TIMEOUT_ERROR,
        SCSI_RETURN_NOT_HANDLED,
        FAST_IO_FAIL;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_host_busy_iter_data")
    @NotUsableInJava
    public static class scsi_host_busy_iter_data
    extends Struct {
        public Ptr<?> fn;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_cmnd_submitter")
    public static enum scsi_cmnd_submitter implements Enum<scsi_cmnd_submitter>,
    TypedEnum<scsi_cmnd_submitter, Boolean>
    {
        SUBMITTED_BY_BLOCK_LAYER,
        SUBMITTED_BY_SCSI_ERROR_HANDLER,
        SUBMITTED_BY_SCSI_RESET_IOCTL;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_data_buffer")
    @NotUsableInJava
    public static class scsi_data_buffer
    extends Struct {
        public SgDefinitions.sg_table table;
        public @Unsigned int length;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_transport_template")
    @NotUsableInJava
    public static class scsi_transport_template
    extends Struct {
        public TransportDefinitions.transport_container host_attrs;
        public TransportDefinitions.transport_container target_attrs;
        public TransportDefinitions.transport_container device_attrs;
        public Ptr<?> user_scan;
        public int device_size;
        public int device_private_offset;
        public int target_size;
        public int target_private_offset;
        public int host_size;
        public @Unsigned int create_work_queue;
        public Ptr<?> eh_strategy_handler;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_host_state")
    public static enum scsi_host_state implements Enum<scsi_host_state>,
    TypedEnum<scsi_host_state, Integer>
    {
        SHOST_CREATED,
        SHOST_RUNNING,
        SHOST_CANCEL,
        SHOST_DEL,
        SHOST_RECOVERY,
        SHOST_CANCEL_RECOVERY,
        SHOST_DEL_RECOVERY;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_cmnd")
    @NotUsableInJava
    public static class scsi_cmnd
    extends Struct {
        public Ptr<scsi_device> device;
        public ListDefinitions.list_head eh_entry;
        public DelayedDefinitions.delayed_work abort_work;
        public misc.callback_head rcu;
        public int eh_eflags;
        public int budget_token;
        public @Unsigned long jiffies_at_alloc;
        public int retries;
        public int allowed;
        public char prot_op;
        public char prot_type;
        public char prot_flags;
        public scsi_cmnd_submitter submitter;
        public @Unsigned short cmd_len;
        public DmaDefinitions.dma_data_direction sc_data_direction;
        public char @Size(value=32) [] cmnd;
        public scsi_data_buffer sdb;
        public Ptr<scsi_data_buffer> prot_sdb;
        public @Unsigned int underflow;
        public @Unsigned int transfersize;
        public @Unsigned int resid_len;
        public @Unsigned int sense_len;
        public String sense_buffer;
        public int flags;
        public @Unsigned long state;
        public @Unsigned int extra_len;
        public String host_scribble;
        public int result;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_host_template")
    @NotUsableInJava
    public static class scsi_host_template
    extends Struct {
        public @Unsigned int cmd_size;
        public Ptr<?> queuecommand;
        public Ptr<?> commit_rqs;
        public Ptr<runtime.module> module;
        public String name;
        public Ptr<?> info;
        public Ptr<?> ioctl;
        public Ptr<?> compat_ioctl;
        public Ptr<?> init_cmd_priv;
        public Ptr<?> exit_cmd_priv;
        public Ptr<?> eh_abort_handler;
        public Ptr<?> eh_device_reset_handler;
        public Ptr<?> eh_target_reset_handler;
        public Ptr<?> eh_bus_reset_handler;
        public Ptr<?> eh_host_reset_handler;
        public Ptr<?> slave_alloc;
        public Ptr<?> device_configure;
        public Ptr<?> slave_configure;
        public Ptr<?> slave_destroy;
        public Ptr<?> target_alloc;
        public Ptr<?> target_destroy;
        public Ptr<?> scan_finished;
        public Ptr<?> scan_start;
        public Ptr<?> change_queue_depth;
        public Ptr<?> map_queues;
        public Ptr<?> mq_poll;
        public Ptr<?> dma_need_drain;
        public Ptr<?> bios_param;
        public Ptr<?> unlock_native_capacity;
        public Ptr<?> show_info;
        public Ptr<?> write_info;
        public Ptr<?> eh_timed_out;
        public Ptr<?> eh_should_retry_cmd;
        public Ptr<?> host_reset;
        public String proc_name;
        public int can_queue;
        public int this_id;
        public @Unsigned short sg_tablesize;
        public @Unsigned short sg_prot_tablesize;
        public @Unsigned int max_sectors;
        public @Unsigned int max_segment_size;
        public @Unsigned int dma_alignment;
        public @Unsigned long dma_boundary;
        public @Unsigned long virt_boundary_mask;
        public short cmd_per_lun;
        public int tag_alloc_policy;
        public @Unsigned int track_queue_depth;
        public @Unsigned int supported_mode;
        public @Unsigned int emulated;
        public @Unsigned int skip_settle_delay;
        public @Unsigned int no_write_same;
        public @Unsigned int host_tagset;
        public @Unsigned int queuecommand_may_block;
        public @Unsigned int max_host_blocked;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> shost_groups;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> sdev_groups;
        public @Unsigned long vendor_id;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_timeout_action")
    public static enum scsi_timeout_action implements Enum<scsi_timeout_action>,
    TypedEnum<scsi_timeout_action, Integer>
    {
        SCSI_EH_DONE,
        SCSI_EH_RESET_TIMER,
        SCSI_EH_NOT_HANDLED;

    }

    @Type(noCCodeGeneration=true, cType="enum scsi_target_state")
    public static enum scsi_target_state implements Enum<scsi_target_state>,
    TypedEnum<scsi_target_state, Integer>
    {
        STARGET_CREATED,
        STARGET_RUNNING,
        STARGET_REMOVE,
        STARGET_CREATED_REMOVE,
        STARGET_DEL;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_target")
    @NotUsableInJava
    public static class scsi_target
    extends Struct {
        public Ptr<scsi_device> starget_sdev_user;
        public ListDefinitions.list_head siblings;
        public ListDefinitions.list_head devices;
        public runtime.device dev;
        public runtime.kref reap_ref;
        public @Unsigned int channel;
        public @Unsigned int id;
        public @Unsigned int create;
        public @Unsigned int single_lun;
        public @Unsigned int pdt_1f_for_no_lun;
        public @Unsigned int no_report_luns;
        public @Unsigned int expecting_lun_change;
        public AtomicDefinitions.atomic_t target_busy;
        public AtomicDefinitions.atomic_t target_blocked;
        public @Unsigned int can_queue;
        public @Unsigned int max_target_blocked;
        public char scsi_level;
        public scsi_target_state state;
        public Ptr<?> hostdata;
        public @Unsigned long @Size(value=0) [] starget_data;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_device")
    @NotUsableInJava
    public static class scsi_device
    extends Struct {
        public Ptr<runtime.Scsi_Host> host;
        public Ptr<RequestDefinitions.request_queue> request_queue;
        public ListDefinitions.list_head siblings;
        public ListDefinitions.list_head same_target_siblings;
        public runtime.sbitmap budget_map;
        public AtomicDefinitions.atomic_t device_blocked;
        public AtomicDefinitions.atomic_t restarts;
        public  @OriginalName(value="spinlock_t") runtime.spinlock list_lock;
        public ListDefinitions.list_head starved_entry;
        public @Unsigned short queue_depth;
        public @Unsigned short max_queue_depth;
        public @Unsigned short last_queue_full_depth;
        public @Unsigned short last_queue_full_count;
        public @Unsigned long last_queue_full_time;
        public @Unsigned long queue_ramp_up_period;
        public @Unsigned long last_queue_ramp_up;
        public @Unsigned int id;
        public @Unsigned int channel;
        public @Unsigned long lun;
        public @Unsigned int manufacturer;
        public @Unsigned int sector_size;
        public Ptr<?> hostdata;
        public char type;
        public char scsi_level;
        public char inq_periph_qual;
        public runtime.mutex inquiry_mutex;
        public char inquiry_len;
        public String inquiry;
        public String vendor;
        public String model;
        public String rev;
        public Ptr<scsi_vpd> vpd_pg0;
        public Ptr<scsi_vpd> vpd_pg83;
        public Ptr<scsi_vpd> vpd_pg80;
        public Ptr<scsi_vpd> vpd_pg89;
        public Ptr<scsi_vpd> vpd_pgb0;
        public Ptr<scsi_vpd> vpd_pgb1;
        public Ptr<scsi_vpd> vpd_pgb2;
        public Ptr<scsi_vpd> vpd_pgb7;
        public Ptr<scsi_target> sdev_target;
        public @Unsigned @OriginalName(value="blist_flags_t") long sdev_bflags;
        public @Unsigned int eh_timeout;
        public @Unsigned int manage_system_start_stop;
        public @Unsigned int manage_runtime_start_stop;
        public @Unsigned int manage_shutdown;
        public @Unsigned int force_runtime_start_on_system_start;
        public @Unsigned int removable;
        public @Unsigned int changed;
        public @Unsigned int busy;
        public @Unsigned int lockable;
        public @Unsigned int locked;
        public @Unsigned int borken;
        public @Unsigned int disconnect;
        public @Unsigned int soft_reset;
        public @Unsigned int sdtr;
        public @Unsigned int wdtr;
        public @Unsigned int ppr;
        public @Unsigned int tagged_supported;
        public @Unsigned int simple_tags;
        public @Unsigned int was_reset;
        public @Unsigned int expecting_cc_ua;
        public @Unsigned int use_10_for_rw;
        public @Unsigned int use_10_for_ms;
        public @Unsigned int set_dbd_for_ms;
        public @Unsigned int read_before_ms;
        public @Unsigned int no_report_opcodes;
        public @Unsigned int no_write_same;
        public @Unsigned int use_16_for_rw;
        public @Unsigned int use_16_for_sync;
        public @Unsigned int skip_ms_page_8;
        public @Unsigned int skip_ms_page_3f;
        public @Unsigned int skip_vpd_pages;
        public @Unsigned int try_vpd_pages;
        public @Unsigned int use_192_bytes_for_3f;
        public @Unsigned int no_start_on_add;
        public @Unsigned int allow_restart;
        public @Unsigned int start_stop_pwr_cond;
        public @Unsigned int no_uld_attach;
        public @Unsigned int select_no_atn;
        public @Unsigned int fix_capacity;
        public @Unsigned int guess_capacity;
        public @Unsigned int retry_hwerror;
        public @Unsigned int last_sector_bug;
        public @Unsigned int no_read_disc_info;
        public @Unsigned int no_read_capacity_16;
        public @Unsigned int try_rc_10_first;
        public @Unsigned int security_supported;
        public @Unsigned int is_visible;
        public @Unsigned int wce_default_on;
        public @Unsigned int no_dif;
        public @Unsigned int broken_fua;
        public @Unsigned int lun_in_cdb;
        public @Unsigned int unmap_limit_for_ws;
        public @Unsigned int rpm_autosuspend;
        public @Unsigned int ignore_media_change;
        public @Unsigned int silence_suspend;
        public @Unsigned int no_vpd_size;
        public @Unsigned int cdl_supported;
        public @Unsigned int cdl_enable;
        public @Unsigned int queue_stopped;
        public boolean offline_already;
        public AtomicDefinitions.atomic_t disk_events_disable_depth;
        public @Unsigned long @Size(value=1) [] supported_events;
        public @Unsigned long @Size(value=1) [] pending_events;
        public ListDefinitions.list_head event_list;
        public misc.work_struct event_work;
        public @Unsigned int max_device_blocked;
        public AtomicDefinitions.atomic_t iorequest_cnt;
        public AtomicDefinitions.atomic_t iodone_cnt;
        public AtomicDefinitions.atomic_t ioerr_cnt;
        public AtomicDefinitions.atomic_t iotmo_cnt;
        public runtime.device sdev_gendev;
        public runtime.device sdev_dev;
        public misc.work_struct requeue_work;
        public Ptr<scsi_device_handler> handler;
        public Ptr<?> handler_data;
        public @Unsigned long dma_drain_len;
        public Ptr<?> dma_drain_buf;
        public @Unsigned int sg_timeout;
        public @Unsigned int sg_reserved_size;
        public Ptr<BsgDefinitions.bsg_device> bsg_dev;
        public char access_state;
        public runtime.mutex state_mutex;
        public scsi_device_state sdev_state;
        public Ptr<TaskDefinitions.task_struct> quiesced_by;
        public @Unsigned long @Size(value=0) [] sdev_data;
    }

    @Type(noCCodeGeneration=true, cType="struct scsi_vpd")
    @NotUsableInJava
    public static class scsi_vpd
    extends Struct {
        public misc.callback_head rcu;
        public int len;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="enum scsi_device_event")
    public static enum scsi_device_event implements Enum<scsi_device_event>,
    TypedEnum<scsi_device_event, Integer>
    {
        SDEV_EVT_MEDIA_CHANGE,
        SDEV_EVT_INQUIRY_CHANGE_REPORTED,
        SDEV_EVT_CAPACITY_CHANGE_REPORTED,
        SDEV_EVT_SOFT_THRESHOLD_REACHED_REPORTED,
        SDEV_EVT_MODE_PARAMETER_CHANGE_REPORTED,
        SDEV_EVT_LUN_CHANGE_REPORTED,
        SDEV_EVT_ALUA_STATE_CHANGE_REPORTED,
        SDEV_EVT_POWER_ON_RESET_OCCURRED,
        SDEV_EVT_FIRST,
        SDEV_EVT_LAST,
        SDEV_EVT_MAXBITS;

    }

    @Type(noCCodeGeneration=true, cType="enum scsi_device_state")
    public static enum scsi_device_state implements Enum<scsi_device_state>,
    TypedEnum<scsi_device_state, Integer>
    {
        SDEV_CREATED,
        SDEV_RUNNING,
        SDEV_CANCEL,
        SDEV_DEL,
        SDEV_QUIESCE,
        SDEV_OFFLINE,
        SDEV_TRANSPORT_OFFLINE,
        SDEV_BLOCK,
        SDEV_CREATED_BLOCK;

    }

    @Type(noCCodeGeneration=true, cType="enum scsi_host_status")
    public static enum scsi_host_status implements Enum<scsi_host_status>,
    TypedEnum<scsi_host_status, Integer>
    {
        DID_OK,
        DID_NO_CONNECT,
        DID_BUS_BUSY,
        DID_TIME_OUT,
        DID_BAD_TARGET,
        DID_ABORT,
        DID_PARITY,
        DID_ERROR,
        DID_RESET,
        DID_BAD_INTR,
        DID_PASSTHROUGH,
        DID_SOFT_ERROR,
        DID_IMM_RETRY,
        DID_REQUEUE,
        DID_TRANSPORT_DISRUPTED,
        DID_TRANSPORT_FAILFAST,
        DID_TRANSPORT_MARGINAL;

    }

    @Type(noCCodeGeneration=true, cType="struct scsi_sense_hdr")
    @NotUsableInJava
    public static class scsi_sense_hdr
    extends Struct {
        public char response_code;
        public char sense_key;
        public char asc;
        public char ascq;
        public char byte4;
        public char byte5;
        public char byte6;
        public char additional_length;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int id; long long unsigned int lun; short unsigned int reserved1; unsigned int reserved2; }")
    @NotUsableInJava
    public static class scsi_of_device_path_of_edd_device_params
    extends Struct {
        public @Unsigned short id;
        public @Unsigned long lun;
        public @Unsigned short reserved1;
        public @Unsigned int reserved2;
    }
}

