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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.MmcDefinitions;
import me.bechberger.ebpf.runtime.PrDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_busy_poweroff_notify_cb(Ptr<?> cb_data, Ptr<@OriginalName(value="bool") Boolean> busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sd_cache_enabled(Ptr<MmcDefinitions.mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_flush_cache(Ptr<MmcDefinitions.mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sd_get_host_max_current(Ptr<MmcDefinitions.mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_parse_ext_reg(Ptr<MmcDefinitions.mmc_card> card, Ptr<Character> gen_info_buf, Ptr<@Unsigned Short> next_ext_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_read_ext_regs(Ptr<MmcDefinitions.mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short sd_std_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_write_ext_reg(Ptr<MmcDefinitions.mmc_card> card, char fno, char page2, @Unsigned short offset, char reg_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sd_check_events(Ptr<runtime.gendisk> disk, @Unsigned int clearing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sd_completed_bytes(Ptr<ScsiDefinitions.scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_config_atomic(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_config_discard(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<QueueDefinitions.queue_limits> lim, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_config_write_same(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_default_probe(@Unsigned @OriginalName(value="dev_t") int devt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_degenerate(Ptr<SchedDefinitions.sched_domain> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_done(Ptr<ScsiDefinitions.scsi_cmnd> SCpnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_eh_action(Ptr<ScsiDefinitions.scsi_cmnd> scmd, int eh_disp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_eh_reset(Ptr<ScsiDefinitions.scsi_cmnd> scmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_flags_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_flags_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_get_unique_id(Ptr<runtime.gendisk> disk, Ptr<Character> id, BlkDefinitions.blk_unique_id type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_getgeo(Ptr<BlockDefinitions.block_device> bdev, Ptr<misc.hd_geometry> geo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sd_init($arg1, (const struct cpumask*)$arg2, $arg3, $arg4)")
    public static Ptr<SchedDefinitions.sched_domain> sd_init(Ptr<SchedDefinitions.sched_domain_topology_level> tl, Ptr<runtime.cpumask> cpu_map, Ptr<SchedDefinitions.sched_domain> child, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char sd_init_command(Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_ioctl(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="blk_mode_t") int mode, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sd_is_perm_stream(Ptr<ScsiDefinitions.scsi_disk> sdkp, @Unsigned int stream_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_major(int major_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)sd_numa_mask($arg1))")
    public static Ptr<runtime.cpumask> sd_numa_mask(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_open(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="blk_mode_t") int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_pr_clear(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_pr_preempt(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long old_key, @Unsigned long new_key, PrDefinitions.pr_type type2, boolean abort) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_pr_read_keys(Ptr<BlockDefinitions.block_device> bdev, Ptr<PrDefinitions.pr_keys> keys_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_pr_read_reservation(Ptr<BlockDefinitions.block_device> bdev, Ptr<PrDefinitions.pr_held_reservation> rsv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_pr_register(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long old_key, @Unsigned long new_key, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_pr_release(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long key2, PrDefinitions.pr_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_pr_reserve(Ptr<BlockDefinitions.block_device> bdev, @Unsigned long key2, PrDefinitions.pr_type type2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sd_print_result((const struct scsi_disk*)$arg1, (const u8*)$arg2, $arg3)")
    public static void sd_print_result(Ptr<ScsiDefinitions.scsi_disk> sdkp, String msg, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_print_sense_hdr(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<ScsiDefinitions.scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_read_app_tag_own(Ptr<ScsiDefinitions.scsi_disk> sdkp, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_read_block_zero(Ptr<ScsiDefinitions.scsi_disk> sdkp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_read_cache_type(Ptr<ScsiDefinitions.scsi_disk> sdkp, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_read_capacity(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<QueueDefinitions.queue_limits> lim, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_read_cpr(Ptr<ScsiDefinitions.scsi_disk> sdkp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_read_io_hints(Ptr<ScsiDefinitions.scsi_disk> sdkp, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_read_write_protect_flag(Ptr<ScsiDefinitions.scsi_disk> sdkp, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_release(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_rescan(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_resume_common(Ptr<runtime.device> dev, boolean runtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_resume_runtime(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_resume_system(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_revalidate_disk(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_scsi_to_pr_err(Ptr<ScsiDefinitions.scsi_sense_hdr> sshdr, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_sec_submit(Ptr<?> data, @Unsigned short spsp, char secp, Ptr<?> buffer, @Unsigned long len, boolean send2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> sd_set_special_bvec(Ptr<runtime.request> rq2, @Unsigned int data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char sd_setup_protect_cmnd(Ptr<ScsiDefinitions.scsi_cmnd> scmd, @Unsigned int dix, @Unsigned int dif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char sd_setup_read_write_cmnd(Ptr<ScsiDefinitions.scsi_cmnd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char sd_setup_write_same10_cmnd(Ptr<ScsiDefinitions.scsi_cmnd> cmd, boolean unmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char sd_setup_write_same16_cmnd(Ptr<ScsiDefinitions.scsi_cmnd> cmd, boolean unmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_spinup_disk(Ptr<ScsiDefinitions.scsi_disk> sdkp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_start_stop_device(Ptr<ScsiDefinitions.scsi_disk> sdkp, int start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_suspend_runtime(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_suspend_system(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_sync_cache(Ptr<ScsiDefinitions.scsi_disk> sdkp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_uninit_command(Ptr<ScsiDefinitions.scsi_cmnd> SCpnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_unlock_native_capacity(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sd_validate_opt_xfer_size(Ptr<ScsiDefinitions.scsi_disk> sdkp, @Unsigned int dev_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_zbc_check_capacity(Ptr<ScsiDefinitions.scsi_disk> sdkp, String buf, Ptr<@Unsigned Integer> zblocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_zbc_check_zoned_characteristics(Ptr<ScsiDefinitions.scsi_disk> sdkp, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sd_zbc_complete(Ptr<ScsiDefinitions.scsi_cmnd> cmd, @Unsigned int good_bytes, Ptr<ScsiDefinitions.scsi_sense_hdr> sshdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_zbc_do_report_zones(Ptr<ScsiDefinitions.scsi_disk> sdkp, String buf, @Unsigned int buflen, @Unsigned @OriginalName(value="sector_t") long lba, boolean partial) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sd_zbc_parse_report($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int sd_zbc_parse_report(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<Character> buf, @Unsigned int idx, @OriginalName(value="report_zones_cb") Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_zbc_read_zones(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<QueueDefinitions.queue_limits> lim, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_zbc_report_zones(Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned int nr_zones, @OriginalName(value="report_zones_cb") Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_zbc_revalidate_zones(Ptr<ScsiDefinitions.scsi_disk> sdkp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="blk_status_t") char sd_zbc_setup_zone_mgmt_cmnd(Ptr<ScsiDefinitions.scsi_cmnd> cmd, char op, boolean all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sd_app_op_cond_cb(Ptr<?> cb_data, Ptr<@OriginalName(value="bool") Boolean> busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sd_dif_config_host(Ptr<ScsiDefinitions.scsi_disk> sdkp, Ptr<QueueDefinitions.queue_limits> lim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sd_flag_debug")
    @NotUsableInJava
    public static class sd_flag_debug
    extends Struct {
        public @Unsigned int meta_flags;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct sd_data")
    @NotUsableInJava
    public static class sd_data
    extends Struct {
        public Ptr<Ptr<SchedDefinitions.sched_domain>> sd;
        public Ptr<Ptr<SchedDefinitions.sched_domain_shared>> sds;
        public Ptr<Ptr<SchedDefinitions.sched_group>> sg;
        public Ptr<Ptr<SchedDefinitions.sched_group_capacity>> sgc;
    }

    @Type(noCCodeGeneration=true, cType="struct sd_busy_data")
    @NotUsableInJava
    public static class sd_busy_data
    extends Struct {
        public Ptr<MmcDefinitions.mmc_card> card;
        public Ptr<Character> reg_buf;
    }

    @Type(noCCodeGeneration=true, cType="struct sd_lb_stats")
    @NotUsableInJava
    public static class sd_lb_stats
    extends Struct {
        public Ptr<SchedDefinitions.sched_group> busiest;
        public Ptr<SchedDefinitions.sched_group> local;
        public @Unsigned long total_load;
        public @Unsigned long total_capacity;
        public @Unsigned long avg_load;
        public @Unsigned int prefer_sibling;
        public SgDefinitions.sg_lb_stats busiest_stat;
        public SgDefinitions.sg_lb_stats local_stat;
    }

    @Type(noCCodeGeneration=true, cType="struct sd_flow_limit")
    @NotUsableInJava
    public static class sd_flow_limit
    extends Struct {
        public @Unsigned long count;
        public @Unsigned int num_buckets;
        public @Unsigned int history_head;
        public @Unsigned short @Size(value=128) [] history;
        public char @Size(value=0) [] buckets;
    }

    @Type(noCCodeGeneration=true, cType="struct sd_app_op_cond_busy_data")
    @NotUsableInJava
    public static class sd_app_op_cond_busy_data
    extends Struct {
        public Ptr<MmcDefinitions.mmc_host> host;
        public @Unsigned int ocr;
        public Ptr<MmcDefinitions.mmc_command> cmd;
    }

    @Type(noCCodeGeneration=true, cType="struct sd_ext_reg")
    @NotUsableInJava
    public static class sd_ext_reg
    extends Struct {
        public char fno;
        public char page;
        public @Unsigned short offset;
        public char rev;
        public char feature_enabled;
        public char feature_support;
    }

    @Type(noCCodeGeneration=true, cType="struct sd_switch_caps")
    @NotUsableInJava
    public static class sd_switch_caps
    extends Struct {
        public @Unsigned int hs_max_dtr;
        public @Unsigned int uhs_max_dtr;
        public @Unsigned int sd3_bus_mode;
        public @Unsigned int sd3_drv_type;
        public @Unsigned int sd3_curr_limit;
    }

    @Type(noCCodeGeneration=true, cType="struct sd_ssr")
    @NotUsableInJava
    public static class sd_ssr
    extends Struct {
        public @Unsigned int au;
        public @Unsigned int erase_timeout;
        public @Unsigned int erase_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct sd_scr")
    @NotUsableInJava
    public static class sd_scr
    extends Struct {
        public char sda_vsn;
        public char sda_spec3;
        public char sda_spec4;
        public char sda_specx;
        public char bus_widths;
        public char cmds;
    }
}

