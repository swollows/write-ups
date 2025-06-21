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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.CdromDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.LedDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SdDefinitions;
import me.bechberger.ebpf.runtime.SdioDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WakeupDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MmcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmc_select_powerclass(Ptr<mmc_card> card, @Unsigned int bus_width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean _mmc_cache_enabled(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _mmc_flush_cache(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _mmc_hw_reset(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _mmc_resume(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _mmc_sd_suspend(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _mmc_suspend(Ptr<mmc_host> host, boolean is_suspend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_add_card_debugfs(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_add_host_debugfs(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_alive(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_attach_mmc(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_attach_sd(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_caps2_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_caps2_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_caps_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_caps_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_caps_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_cid_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_clock_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_clock_opt_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_clock_opt_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_cmdq_en_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_compare_ext_csds(Ptr<mmc_card> card, @Unsigned int bus_width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_csd_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_date_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_decode_csd(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_decode_ext_csd(Ptr<mmc_card> card, Ptr<Character> ext_csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_detect(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_device_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_dsr_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_enhanced_area_offset_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_enhanced_area_size_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_enhanced_rpmb_supported_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_erase_size_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_err_state_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_err_state_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_err_stats_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_err_stats_show(Ptr<SeqDefinitions.seq_file> file2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmc_err_stats_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long mmc_err_stats_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_ffu_capable_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmc_fixup_device($arg1, (const struct mmc_fixup*)$arg2)")
    public static void mmc_fixup_device(Ptr<mmc_card> card, Ptr<mmc_fixup> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_fwrev_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_hs200_to_hs400(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_hs400_to_hs200(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_hwrev_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_init_card(Ptr<mmc_host> host, @Unsigned int ocr, Ptr<mmc_card> oldcard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ios_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ios_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_life_time_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_manfid_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_name_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_ocr_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_oemid_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_pre_eol_info_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_preferred_erase_size_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_prv_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_raw_rpmb_size_mult_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_rca_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_read_ssr(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_rel_sectors_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_remove(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_remove_card_debugfs(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_remove_host_debugfs(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_resume(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_rev_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_revision_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_scr_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_alive(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_sd_detect(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_get_cid(Ptr<mmc_host> host, @Unsigned int ocr, Ptr<@Unsigned Integer> cid, Ptr<@Unsigned Integer> rocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_get_csd(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mmc_sd_get_max_clock(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_hw_reset(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_init_card(Ptr<mmc_host> host, @Unsigned int ocr, Ptr<mmc_card> oldcard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_init_uhs_card(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_sd_remove(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_resume(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_runtime_resume(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_runtime_suspend(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_setup_card(Ptr<mmc_host> host, Ptr<mmc_card> card, boolean reinit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_suspend(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_switch_hs(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_select_bus_width(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_select_driver_type(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_select_hs200(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_select_hs400(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_select_hs400es(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_serial_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_set_bus_speed(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_shutdown(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sleep_busy_cb(Ptr<?> cb_data, Ptr<@OriginalName(value="bool") Boolean> busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_ssr_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_suspend(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_vendor_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mmc_wp_grp_size_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmc_claim_host(Ptr<mmc_host> host, Ptr<mmc_ctx> ctx, Ptr<AtomicDefinitions.atomic_t> abort) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mmc_start_request(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mmc_stop_host(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _mmc_detect_card_removed(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _mmc_detect_change(Ptr<mmc_host> host, @Unsigned long delay, boolean cd_irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmc_attach_bus($arg1, (const struct mmc_bus_ops*)$arg2)")
    public static void mmc_attach_bus(Ptr<mmc_host> host, Ptr<mmc_bus_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_attach_sdio(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mmc_calc_max_discard(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_can_discard(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_can_erase(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_can_sanitize(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_can_secure_erase_trim(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_can_trim(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_card_alternative_gpt_sector(Ptr<mmc_card> card, Ptr<@Unsigned @OriginalName(value="sector_t") Long> gpt_sector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mmc_card_is_blockaddr(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_command_done(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_cqe_post_req(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_cqe_recovery(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_cqe_request_done(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_cqe_start_req(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_crypto_prepare_req(Ptr<mmc_queue_req> mqrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_crypto_set_initial_state(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_crypto_setup_queue(Ptr<RequestDefinitions.request_queue> q, Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_detach_bus(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_detect_card_removed(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_detect_change(Ptr<mmc_host> host, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mmc_do_calc_max_discard(Ptr<mmc_card> card, @Unsigned int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_do_erase(Ptr<mmc_card> card, @Unsigned int from, @Unsigned int to, @Unsigned int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_erase(Ptr<mmc_card> card, @Unsigned int from, @Unsigned int nr, @Unsigned int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_erase_group_aligned(Ptr<mmc_card> card, @Unsigned int from, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_execute_tuning(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_get_card(Ptr<mmc_card> card, Ptr<mmc_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_host_set_uhs_voltage(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_hw_reset(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_init_erase(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mmc_is_req_done(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mmc_mmc_erase_timeout(Ptr<mmc_card> card, @Unsigned int arg2, @Unsigned int qty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_mrq_pr_debug(Ptr<mmc_host> host, Ptr<mmc_request> mrq, boolean cqe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_mrq_prep(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DeviceDefinitions.device_node> mmc_of_find_child_device(Ptr<mmc_host> host, @Unsigned int func_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_power_cycle(Ptr<mmc_host> host, @Unsigned int ocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_power_off(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_power_up(Ptr<mmc_host> host, @Unsigned int ocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_put_card(Ptr<mmc_card> card, Ptr<mmc_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_release_host(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_request_done(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_rescan(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_rescan_try_freq(Ptr<mmc_host> host, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_alive(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_sdio_detect(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_hw_reset(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_init_card(Ptr<mmc_host> host, @Unsigned int ocr, Ptr<mmc_card> oldcard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_pre_suspend(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_reinit_card(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_sdio_remove(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_resume(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_runtime_resume(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_runtime_suspend(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_suspend(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_sw_reset(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sdio_switch_hs(Ptr<mmc_card> card, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_select_drive_strength(Ptr<mmc_card> card, @Unsigned int max_dtr, int card_drv_type, Ptr<Integer> drv_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mmc_select_voltage(Ptr<mmc_host> host, @Unsigned int ocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_set_blocklen(Ptr<mmc_card> card, @Unsigned int blocklen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_set_bus_mode(Ptr<mmc_host> host, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_set_bus_width(Ptr<mmc_host> host, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_set_chip_select(Ptr<mmc_host> host, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_set_clock(Ptr<mmc_host> host, @Unsigned int hz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmc_set_data_timeout($arg1, (const struct mmc_card*)$arg2)")
    public static void mmc_set_data_timeout(Ptr<mmc_data> data, Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_set_driver_type(Ptr<mmc_host> host, @Unsigned int drv_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_set_initial_signal_voltage(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_set_initial_state(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_set_signal_voltage(Ptr<mmc_host> host, int signal_voltage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_set_timing(Ptr<mmc_host> host, @Unsigned int timing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_set_uhs_voltage(Ptr<mmc_host> host, @Unsigned int ocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_start_host(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_start_request(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_stop_host(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sw_reset(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mmc_vddrange_to_ocrmask(int vdd_min, int vdd_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_wait_done(Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_wait_for_cmd(Ptr<mmc_host> host, Ptr<mmc_command> cmd, int retries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_wait_for_req(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_wait_for_req_done(Ptr<mmc_host> host, Ptr<mmc_request> mrq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__mmc_poll_for_busy($arg1, $arg2, $arg3, (int (*)(void*, _Bool*))$arg4, $arg5)")
    public static int __mmc_poll_for_busy(Ptr<mmc_host> host, @Unsigned int period_us, @Unsigned int timeout_ms, Ptr<?> busy_cb, Ptr<?> cb_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmc_send_op_cond_cb(Ptr<?> cb_data, Ptr<@OriginalName(value="bool") Boolean> busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmc_send_status(Ptr<mmc_card> card, Ptr<@Unsigned Integer> status, @Unsigned int retries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmc_switch(Ptr<mmc_card> card, char set, char index2, char value, @Unsigned int timeout_ms, char timing, boolean send_status, boolean retry_crc_err, @Unsigned int retries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_add_card(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmc_alloc_card($arg1, (const struct device_type*)$arg2)")
    public static Ptr<mmc_card> mmc_alloc_card(Ptr<mmc_host> host, Ptr<DeviceDefinitions.device_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_bus_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_bus_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_bus_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_bus_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_bus_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_bus_test(Ptr<mmc_card> card, char bus_width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmc_bus_uevent((const struct device*)$arg1, $arg2)")
    public static int mmc_bus_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_busy_cb(Ptr<?> cb_data, Ptr<@OriginalName(value="bool") Boolean> busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_can_ext_csd(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_cmdq_disable(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_cmdq_enable(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_deselect_cards(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_get_ext_csd(Ptr<mmc_card> card, Ptr<Ptr<Character>> new_ext_csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_go_idle(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_interrupt_hpi(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_io_rw_direct(Ptr<mmc_card> card, int write2, @Unsigned int fn, @Unsigned int addr2, char in, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_io_rw_direct_host(Ptr<mmc_host> host, int write2, @Unsigned int fn, @Unsigned int addr2, char in, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_io_rw_extended(Ptr<mmc_card> card, int write2, @Unsigned int fn, @Unsigned int addr2, int incr_addr, Ptr<Character> buf, @Unsigned int blocks, @Unsigned int blksz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl(Ptr<CdromDefinitions.cdrom_device_info> cdi, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_last_written(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_next_writable(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_pause_resume(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<PacketDefinitions.packet_command> cgc, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_play_blk(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_play_msf(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_read_audio(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_read_data(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2, Ptr<PacketDefinitions.packet_command> cgc, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_start_stop(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<PacketDefinitions.packet_command> cgc, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_subchannel(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_cdrom_volume(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2, Ptr<PacketDefinitions.packet_command> cgc, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_dvd_auth(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_ioctl_dvd_read_struct(Ptr<CdromDefinitions.cdrom_device_info> cdi, Ptr<?> arg2, Ptr<PacketDefinitions.packet_command> cgc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_poll_for_busy(Ptr<mmc_card> card, @Unsigned int timeout_ms, boolean retry_crc_err, mmc_busy_cmd busy_cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mmc_prepare_busy_cmd(Ptr<mmc_host> host, Ptr<mmc_command> cmd, @Unsigned int timeout_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_register_bus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_register_driver(Ptr<mmc_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_regulator_disable_vqmmc(Ptr<mmc_host> mmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_regulator_enable_vqmmc(Ptr<mmc_host> mmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_regulator_get_supply(Ptr<mmc_host> mmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_regulator_set_ocr(Ptr<mmc_host> mmc, Ptr<runtime.regulator> supply, @Unsigned short vdd_bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_regulator_set_voltage_if_supported(Ptr<runtime.regulator> regulator2, int min_uV, int target_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_regulator_set_vqmmc(Ptr<mmc_host> mmc, Ptr<mmc_ios> ios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_release_card(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_remove_card(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_run_bkops(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sanitize(Ptr<mmc_card> card, @Unsigned int timeout_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_select_card(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_abort_tuning(Ptr<mmc_host> host, @Unsigned int opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_adtc_data(Ptr<mmc_card> card, Ptr<mmc_host> host, @Unsigned int opcode, @Unsigned int args, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_bus_test(Ptr<mmc_card> card, Ptr<mmc_host> host, char opcode, char len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_cid(Ptr<mmc_host> host, Ptr<@Unsigned Integer> cid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_csd(Ptr<mmc_card> card, Ptr<@Unsigned Integer> csd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_cxd_native(Ptr<mmc_host> host, @Unsigned int arg2, Ptr<@Unsigned Integer> cxd, int opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_io_op_cond(Ptr<mmc_host> host, @Unsigned int ocr, Ptr<@Unsigned Integer> rocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_op_cond(Ptr<mmc_host> host, @Unsigned int ocr, Ptr<@Unsigned Integer> rocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_status(Ptr<mmc_card> card, Ptr<@Unsigned Integer> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_tuning(Ptr<mmc_host> host, @Unsigned int opcode, Ptr<Integer> cmd_error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_set_dsr(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_set_relative_addr(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_spi_read_ocr(Ptr<mmc_host> host, int highcap, Ptr<@Unsigned Integer> ocrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_spi_send_cxd(Ptr<mmc_host> host, Ptr<@Unsigned Integer> cxd, @Unsigned int opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_spi_set_crc(Ptr<mmc_host> host, int use_crc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_switch(Ptr<mmc_card> card, char set, char index2, char value, @Unsigned int timeout_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_switch_status(Ptr<mmc_card> card, boolean crc_err_fatal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_switch_status_error(Ptr<mmc_host> host, @Unsigned int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_unregister_bus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_unregister_driver(Ptr<mmc_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mmc_send_if_cond(Ptr<mmc_host> host, @Unsigned int ocr, char pcie_bits, Ptr<@Unsigned Integer> resp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_add_host(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mmc_host> mmc_alloc_host(int extra, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_app_cmd(Ptr<mmc_host> host, Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_app_sd_status(Ptr<mmc_card> card, Ptr<?> ssr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_app_send_scr(Ptr<mmc_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_app_set_bus_width(Ptr<mmc_card> card, int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mmc_can_gpio_cd(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mmc_can_gpio_ro(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_free_host(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_gpio_alloc(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn mmc_gpio_cd_irqt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_gpio_get_cd(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_gpio_get_ro(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_gpio_set_cd_irq(Ptr<mmc_host> host, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_gpio_set_cd_isr(Ptr<mmc_host> host, @OriginalName(value="irq_handler_t") Ptr<?> isr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_gpio_set_cd_wake(Ptr<mmc_host> host, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmc_gpiod_request_cd($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int mmc_gpiod_request_cd(Ptr<mmc_host> host, String con_id, @Unsigned int idx, boolean override_active_level, @Unsigned int debounce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_gpiod_request_cd_irq(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmc_gpiod_request_ro($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int mmc_gpiod_request_ro(Ptr<mmc_host> host, String con_id, @Unsigned int idx, @Unsigned int debounce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_gpiod_set_cd_config(Ptr<mmc_host> host, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_host_class_complete(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_host_class_prepare(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_host_classdev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_host_classdev_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_of_parse(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_of_parse_clk_phase(Ptr<runtime.device> dev, Ptr<mmc_clk_phase_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mmc_of_parse_timing_phase($arg1, (const u8*)$arg2, $arg3)")
    public static void mmc_of_parse_timing_phase(Ptr<runtime.device> dev, String prop, Ptr<mmc_clk_phase> phase) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_of_parse_voltage(Ptr<mmc_host> host, Ptr<@Unsigned Integer> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_register_host_class() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_remove_host(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_retune(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_retune_disable(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_retune_enable(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_retune_hold(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_retune_pause(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_retune_release(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_retune_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_retune_timer_stop(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_retune_unpause(Ptr<mmc_host> host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_sd_switch(Ptr<mmc_card> card, boolean mode, int group, char value, Ptr<Character> resp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_app_op_cond(Ptr<mmc_host> host, @Unsigned int ocr, Ptr<@Unsigned Integer> rocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_if_cond(Ptr<mmc_host> host, @Unsigned int ocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_if_cond_pcie(Ptr<mmc_host> host, @Unsigned int ocr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_send_relative_addr(Ptr<mmc_host> host, Ptr<@Unsigned Integer> rca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mmc_unregister_host_class() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mmc_wait_for_app_cmd(Ptr<mmc_host> host, Ptr<mmc_card> card, Ptr<mmc_command> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_op_cond_busy_data")
    @NotUsableInJava
    public static class mmc_op_cond_busy_data
    extends Struct {
        public Ptr<mmc_host> host;
        public @Unsigned int ocr;
        public Ptr<mmc_command> cmd;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_busy_data")
    @NotUsableInJava
    public static class mmc_busy_data
    extends Struct {
        public Ptr<mmc_card> card;
        public boolean retry_crc_err;
        public mmc_busy_cmd busy_cmd;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_driver")
    @NotUsableInJava
    public static class mmc_driver
    extends Struct {
        public DeviceDefinitions.device_driver drv;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_queue_req")
    @NotUsableInJava
    public static class mmc_queue_req
    extends Struct {
        public mmc_blk_request brq;
        public Ptr<runtime.scatterlist> sg;
        public mmc_drv_op drv_op;
        public int drv_op_result;
        public Ptr<?> drv_op_data;
        public @Unsigned int ioc_count;
        public int retries;
    }

    @Type(noCCodeGeneration=true, cType="enum mmc_drv_op")
    public static enum mmc_drv_op implements Enum<mmc_drv_op>,
    TypedEnum<mmc_drv_op, Integer>
    {
        MMC_DRV_OP_IOCTL,
        MMC_DRV_OP_IOCTL_RPMB,
        MMC_DRV_OP_BOOT_WP,
        MMC_DRV_OP_GET_CARD_STATUS,
        MMC_DRV_OP_GET_EXT_CSD;

    }

    @Type(noCCodeGeneration=true, cType="struct mmc_blk_request")
    @NotUsableInJava
    public static class mmc_blk_request
    extends Struct {
        public mmc_request mrq;
        public mmc_command sbc;
        public mmc_command cmd;
        public mmc_command stop;
        public mmc_data data;
    }

    @Type(noCCodeGeneration=true, cType="enum mmc_issue_type")
    public static enum mmc_issue_type implements Enum<mmc_issue_type>,
    TypedEnum<mmc_issue_type, Integer>
    {
        MMC_ISSUE_SYNC,
        MMC_ISSUE_DCMD,
        MMC_ISSUE_ASYNC,
        MMC_ISSUE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum mmc_busy_cmd")
    public static enum mmc_busy_cmd implements Enum<mmc_busy_cmd>,
    TypedEnum<mmc_busy_cmd, Integer>
    {
        MMC_BUSY_CMD6,
        MMC_BUSY_ERASE,
        MMC_BUSY_HPI,
        MMC_BUSY_EXTR_SINGLE,
        MMC_BUSY_IO;

    }

    @Type(noCCodeGeneration=true, cType="struct mmc_fixup")
    @NotUsableInJava
    public static class mmc_fixup
    extends Struct {
        public String name;
        public @Unsigned long rev_start;
        public @Unsigned long rev_end;
        public @Unsigned int manfid;
        public @Unsigned short oemid;
        public @Unsigned short year;
        public char month;
        public @Unsigned short cis_vendor;
        public @Unsigned short cis_device;
        public @Unsigned int ext_csd_rev;
        public String of_compatible;
        public Ptr<?> vendor_fixup;
        public int data;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_gpio")
    @NotUsableInJava
    public static class mmc_gpio
    extends Struct {
        public Ptr<GpioDefinitions.gpio_desc> ro_gpio;
        public Ptr<GpioDefinitions.gpio_desc> cd_gpio;
        public @OriginalName(value="irq_handler_t") Ptr<?> cd_gpio_isr;
        public String ro_label;
        public String cd_label;
        public @Unsigned int cd_debounce_delay_ms;
        public int cd_irq;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_pwrseq_ops")
    @NotUsableInJava
    public static class mmc_pwrseq_ops
    extends Struct {
        public Ptr<?> pre_power_on;
        public Ptr<?> post_power_on;
        public Ptr<?> power_off;
        public Ptr<?> reset;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_bus_ops")
    @NotUsableInJava
    public static class mmc_bus_ops
    extends Struct {
        public Ptr<?> remove;
        public Ptr<?> detect;
        public Ptr<?> pre_suspend;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> runtime_suspend;
        public Ptr<?> runtime_resume;
        public Ptr<?> alive;
        public Ptr<?> shutdown;
        public Ptr<?> hw_reset;
        public Ptr<?> sw_reset;
        public Ptr<?> cache_enabled;
        public Ptr<?> flush_cache;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_pwrseq")
    @NotUsableInJava
    public static class mmc_pwrseq
    extends Struct {
        public Ptr<mmc_pwrseq_ops> ops;
        public Ptr<runtime.device> dev;
        public ListDefinitions.list_head pwrseq_node;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_ctx")
    @NotUsableInJava
    public static class mmc_ctx
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> task;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_supply")
    @NotUsableInJava
    public static class mmc_supply
    extends Struct {
        public Ptr<runtime.regulator> vmmc;
        public Ptr<runtime.regulator> vqmmc;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_slot")
    @NotUsableInJava
    public static class mmc_slot
    extends Struct {
        public int cd_irq;
        public boolean cd_wake_enabled;
        public Ptr<?> handler_priv;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_cqe_ops")
    @NotUsableInJava
    public static class mmc_cqe_ops
    extends Struct {
        public Ptr<?> cqe_enable;
        public Ptr<?> cqe_disable;
        public Ptr<?> cqe_request;
        public Ptr<?> cqe_post_req;
        public Ptr<?> cqe_off;
        public Ptr<?> cqe_wait_for_idle;
        public Ptr<?> cqe_timeout;
        public Ptr<?> cqe_recovery_start;
        public Ptr<?> cqe_recovery_finish;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_host_ops")
    @NotUsableInJava
    public static class mmc_host_ops
    extends Struct {
        public Ptr<?> post_req;
        public Ptr<?> pre_req;
        public Ptr<?> request;
        public Ptr<?> request_atomic;
        public Ptr<?> set_ios;
        public Ptr<?> get_ro;
        public Ptr<?> get_cd;
        public Ptr<?> enable_sdio_irq;
        public Ptr<?> ack_sdio_irq;
        public Ptr<?> init_card;
        public Ptr<?> start_signal_voltage_switch;
        public Ptr<?> card_busy;
        public Ptr<?> execute_tuning;
        public Ptr<?> prepare_hs400_tuning;
        public Ptr<?> execute_hs400_tuning;
        public Ptr<?> prepare_sd_hs_tuning;
        public Ptr<?> execute_sd_hs_tuning;
        public Ptr<?> hs400_prepare_ddr;
        public Ptr<?> hs400_downgrade;
        public Ptr<?> hs400_complete;
        public Ptr<?> hs400_enhanced_strobe;
        public Ptr<?> select_drive_strength;
        public Ptr<?> card_hw_reset;
        public Ptr<?> card_event;
        public Ptr<?> multi_io_quirk;
        public Ptr<?> init_sd_express;
    }

    @Type(noCCodeGeneration=true, cType="enum mmc_err_stat")
    public static enum mmc_err_stat implements Enum<mmc_err_stat>,
    TypedEnum<mmc_err_stat, Integer>
    {
        MMC_ERR_CMD_TIMEOUT,
        MMC_ERR_CMD_CRC,
        MMC_ERR_DAT_TIMEOUT,
        MMC_ERR_DAT_CRC,
        MMC_ERR_AUTO_CMD,
        MMC_ERR_ADMA,
        MMC_ERR_TUNING,
        MMC_ERR_CMDQ_RED,
        MMC_ERR_CMDQ_GCE,
        MMC_ERR_CMDQ_ICCE,
        MMC_ERR_REQ_TIMEOUT,
        MMC_ERR_CMDQ_REQ_TIMEOUT,
        MMC_ERR_ICE_CFG,
        MMC_ERR_CTRL_TIMEOUT,
        MMC_ERR_UNEXPECTED_IRQ,
        MMC_ERR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct mmc_clk_phase_map")
    @NotUsableInJava
    public static class mmc_clk_phase_map
    extends Struct {
        public mmc_clk_phase @Size(value=11) [] phase;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_clk_phase")
    @NotUsableInJava
    public static class mmc_clk_phase
    extends Struct {
        public boolean valid;
        public @Unsigned short in_deg;
        public @Unsigned short out_deg;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_ios")
    @NotUsableInJava
    public static class mmc_ios
    extends Struct {
        public @Unsigned int clock;
        public @Unsigned short vdd;
        public @Unsigned int power_delay_ms;
        public char bus_mode;
        public char chip_select;
        public char power_mode;
        public char bus_width;
        public char timing;
        public char signal_voltage;
        public char drv_type;
        public boolean enhanced_strobe;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_card")
    @NotUsableInJava
    public static class mmc_card
    extends Struct {
        public Ptr<mmc_host> host;
        public runtime.device dev;
        public @Unsigned int ocr;
        public @Unsigned int rca;
        public @Unsigned int type;
        public @Unsigned int state;
        public @Unsigned int quirks;
        public @Unsigned int quirk_max_rate;
        public boolean written_flag;
        public boolean reenable_cmdq;
        public @Unsigned int erase_size;
        public @Unsigned int erase_shift;
        public @Unsigned int pref_erase;
        public @Unsigned int eg_boundary;
        public @Unsigned int erase_arg;
        public char erased_byte;
        public @Unsigned int wp_grp_size;
        public @Unsigned int @Size(value=4) [] raw_cid;
        public @Unsigned int @Size(value=4) [] raw_csd;
        public @Unsigned int @Size(value=2) [] raw_scr;
        public @Unsigned int @Size(value=16) [] raw_ssr;
        public mmc_cid cid;
        public mmc_csd csd;
        public mmc_ext_csd ext_csd;
        public SdDefinitions.sd_scr scr;
        public SdDefinitions.sd_ssr ssr;
        public SdDefinitions.sd_switch_caps sw_caps;
        public SdDefinitions.sd_ext_reg ext_power;
        public SdDefinitions.sd_ext_reg ext_perf;
        public @Unsigned int sdio_funcs;
        public AtomicDefinitions.atomic_t sdio_funcs_probed;
        public SdioDefinitions.sdio_cccr cccr;
        public SdioDefinitions.sdio_cis cis;
        public Ptr<SdioDefinitions.sdio_func> @Size(value=7) [] sdio_func;
        public Ptr<SdioDefinitions.sdio_func> sdio_single_irq;
        public char major_rev;
        public char minor_rev;
        public @Unsigned int num_info;
        public Ptr<String> info;
        public Ptr<SdioDefinitions.sdio_func_tuple> tuples;
        public @Unsigned int sd_bus_speed;
        public @Unsigned int mmc_avail_type;
        public @Unsigned int drive_strength;
        public Ptr<runtime.dentry> debugfs_root;
        public mmc_part @Size(value=7) [] part;
        public @Unsigned int nr_parts;
        public Ptr<WorkqueueDefinitions.workqueue_struct> complete_wq;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_part")
    @NotUsableInJava
    public static class mmc_part
    extends Struct {
        public @Unsigned long size;
        public @Unsigned int part_cfg;
        public char @Size(value=20) [] name;
        public boolean force_ro;
        public @Unsigned int area_type;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_ext_csd")
    @NotUsableInJava
    public static class mmc_ext_csd
    extends Struct {
        public char rev;
        public char erase_group_def;
        public char sec_feature_support;
        public char rel_sectors;
        public char rel_param;
        public boolean enhanced_rpmb_supported;
        public char part_config;
        public char cache_ctrl;
        public char rst_n_function;
        public @Unsigned int part_time;
        public @Unsigned int sa_timeout;
        public @Unsigned int generic_cmd6_time;
        public @Unsigned int power_off_longtime;
        public char power_off_notification;
        public @Unsigned int hs_max_dtr;
        public @Unsigned int hs200_max_dtr;
        public @Unsigned int sectors;
        public @Unsigned int hc_erase_size;
        public @Unsigned int hc_erase_timeout;
        public @Unsigned int sec_trim_mult;
        public @Unsigned int sec_erase_mult;
        public @Unsigned int trim_timeout;
        public boolean partition_setting_completed;
        public @Unsigned long enhanced_area_offset;
        public @Unsigned int enhanced_area_size;
        public @Unsigned int cache_size;
        public boolean hpi_en;
        public boolean hpi;
        public @Unsigned int hpi_cmd;
        public boolean bkops;
        public boolean man_bkops_en;
        public boolean auto_bkops_en;
        public @Unsigned int data_sector_size;
        public @Unsigned int data_tag_unit_size;
        public @Unsigned int boot_ro_lock;
        public boolean boot_ro_lockable;
        public boolean ffu_capable;
        public boolean cmdq_en;
        public boolean cmdq_support;
        public @Unsigned int cmdq_depth;
        public char @Size(value=8) [] fwrev;
        public char raw_exception_status;
        public char raw_partition_support;
        public char raw_rpmb_size_mult;
        public char raw_erased_mem_count;
        public char strobe_support;
        public char raw_ext_csd_structure;
        public char raw_card_type;
        public char raw_driver_strength;
        public char out_of_int_time;
        public char raw_pwr_cl_52_195;
        public char raw_pwr_cl_26_195;
        public char raw_pwr_cl_52_360;
        public char raw_pwr_cl_26_360;
        public char raw_s_a_timeout;
        public char raw_hc_erase_gap_size;
        public char raw_erase_timeout_mult;
        public char raw_hc_erase_grp_size;
        public char raw_boot_mult;
        public char raw_sec_trim_mult;
        public char raw_sec_erase_mult;
        public char raw_sec_feature_support;
        public char raw_trim_mult;
        public char raw_pwr_cl_200_195;
        public char raw_pwr_cl_200_360;
        public char raw_pwr_cl_ddr_52_195;
        public char raw_pwr_cl_ddr_52_360;
        public char raw_pwr_cl_ddr_200_360;
        public char raw_bkops_status;
        public char @Size(value=4) [] raw_sectors;
        public char pre_eol_info;
        public char device_life_time_est_typ_a;
        public char device_life_time_est_typ_b;
        public @Unsigned int feature_support;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_csd")
    @NotUsableInJava
    public static class mmc_csd
    extends Struct {
        public char structure;
        public char mmca_vsn;
        public @Unsigned short cmdclass;
        public @Unsigned short taac_clks;
        public @Unsigned int taac_ns;
        public @Unsigned int c_size;
        public @Unsigned int r2w_factor;
        public @Unsigned int max_dtr;
        public @Unsigned int erase_size;
        public @Unsigned int wp_grp_size;
        public @Unsigned int read_blkbits;
        public @Unsigned int write_blkbits;
        public @Unsigned int capacity;
        public @Unsigned int read_partial;
        public @Unsigned int read_misalign;
        public @Unsigned int write_partial;
        public @Unsigned int write_misalign;
        public @Unsigned int dsr_imp;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_cid")
    @NotUsableInJava
    public static class mmc_cid
    extends Struct {
        public @Unsigned int manfid;
        public char @Size(value=8) [] prod_name;
        public char prv;
        public @Unsigned int serial;
        public @Unsigned short oemid;
        public @Unsigned short year;
        public char hwrev;
        public char fwrev;
        public char month;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_host")
    @NotUsableInJava
    public static class mmc_host
    extends Struct {
        public Ptr<runtime.device> parent;
        public runtime.device class_dev;
        public int index;
        public Ptr<mmc_host_ops> ops;
        public Ptr<mmc_pwrseq> pwrseq;
        public @Unsigned int f_min;
        public @Unsigned int f_max;
        public @Unsigned int f_init;
        public @Unsigned int ocr_avail;
        public @Unsigned int ocr_avail_sdio;
        public @Unsigned int ocr_avail_sd;
        public @Unsigned int ocr_avail_mmc;
        public Ptr<WakeupDefinitions.wakeup_source> ws;
        public @Unsigned int max_current_330;
        public @Unsigned int max_current_300;
        public @Unsigned int max_current_180;
        public @Unsigned int caps;
        public @Unsigned int caps2;
        public int fixed_drv_type;
        public @Unsigned @OriginalName(value="mmc_pm_flag_t") int pm_caps;
        public @Unsigned int max_seg_size;
        public @Unsigned short max_segs;
        public @Unsigned short unused;
        public @Unsigned int max_req_size;
        public @Unsigned int max_blk_size;
        public @Unsigned int max_blk_count;
        public @Unsigned int max_busy_timeout;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public mmc_ios ios;
        public @Unsigned int use_spi_crc;
        public @Unsigned int claimed;
        public @Unsigned int doing_init_tune;
        public @Unsigned int can_retune;
        public @Unsigned int doing_retune;
        public @Unsigned int retune_now;
        public @Unsigned int retune_paused;
        public @Unsigned int retune_crc_disable;
        public @Unsigned int can_dma_map_merge;
        public @Unsigned int vqmmc_enabled;
        public int rescan_disable;
        public int rescan_entered;
        public int need_retune;
        public int hold_retune;
        public @Unsigned int retune_period;
        public TimerDefinitions.timer_list retune_timer;
        public boolean trigger_card_event;
        public Ptr<mmc_card> card;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wq;
        public Ptr<mmc_ctx> claimer;
        public int claim_cnt;
        public mmc_ctx default_ctx;
        public DelayedDefinitions.delayed_work detect;
        public int detect_change;
        public mmc_slot slot;
        public Ptr<mmc_bus_ops> bus_ops;
        public @Unsigned int sdio_irqs;
        public Ptr<TaskDefinitions.task_struct> sdio_irq_thread;
        public misc.work_struct sdio_irq_work;
        public boolean sdio_irq_pending;
        public AtomicDefinitions.atomic_t sdio_irq_thread_abort;
        public @Unsigned @OriginalName(value="mmc_pm_flag_t") int pm_flags;
        public Ptr<LedDefinitions.led_trigger> led;
        public boolean regulator_enabled;
        public mmc_supply supply;
        public Ptr<runtime.dentry> debugfs_root;
        public Ptr<mmc_request> ongoing_mrq;
        public @Unsigned int actual_clock;
        public @Unsigned int slotno;
        public int dsr_req;
        public @Unsigned int dsr;
        public Ptr<mmc_cqe_ops> cqe_ops;
        public Ptr<?> cqe_private;
        public int cqe_qdepth;
        public boolean cqe_enabled;
        public boolean cqe_on;
        public BlkDefinitions.blk_crypto_profile crypto_profile;
        public boolean hsq_enabled;
        public int hsq_depth;
        public @Unsigned int @Size(value=15) [] err_stats;
        public @Unsigned long @Size(value=0) [] _private;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_request")
    @NotUsableInJava
    public static class mmc_request
    extends Struct {
        public Ptr<mmc_command> sbc;
        public Ptr<mmc_command> cmd;
        public Ptr<mmc_data> data;
        public Ptr<mmc_command> stop;
        public runtime.completion completion;
        public runtime.completion cmd_completion;
        public Ptr<?> done;
        public Ptr<?> recovery_notifier;
        public Ptr<mmc_host> host;
        public boolean cap_cmd_during_tfr;
        public int tag;
        public Ptr<BioDefinitions.bio_crypt_ctx> crypto_ctx;
        public int crypto_key_slot;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_data")
    @NotUsableInJava
    public static class mmc_data
    extends Struct {
        public @Unsigned int timeout_ns;
        public @Unsigned int timeout_clks;
        public @Unsigned int blksz;
        public @Unsigned int blocks;
        public @Unsigned int blk_addr;
        public int error;
        public @Unsigned int flags;
        public @Unsigned int bytes_xfered;
        public Ptr<mmc_command> stop;
        public Ptr<mmc_request> mrq;
        public @Unsigned int sg_len;
        public int sg_count;
        public Ptr<runtime.scatterlist> sg;
        public int host_cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct mmc_command")
    @NotUsableInJava
    public static class mmc_command
    extends Struct {
        public @Unsigned int opcode;
        public @Unsigned int arg;
        public @Unsigned int @Size(value=4) [] resp;
        public @Unsigned int flags;
        public @Unsigned int retries;
        public int error;
        public @Unsigned int busy_timeout;
        public Ptr<mmc_data> data;
        public Ptr<mmc_request> mrq;
    }
}

