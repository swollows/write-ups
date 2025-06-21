/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.ActionDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.CmdlineDefinitions;
import me.bechberger.ebpf.runtime.DdebugDefinitions;
import me.bechberger.ebpf.runtime.EcryptfsDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FilterDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.IpeDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.ProbeDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.ResctrlDefinitions;
import me.bechberger.ebpf.runtime.Seg6Definitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SynthDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TraceprobeDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.UsbdevfsDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class ParseDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="_parse_integer((const u8*)$arg1, $arg2, $arg3)")
    public static @Unsigned int _parse_integer(String s2, @Unsigned int base, Ptr<@Unsigned Long> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)_parse_integer_fixup_radix((const u8*)$arg1, $arg2))")
    public static String _parse_integer_fixup_radix(String s2, Ptr<@Unsigned Integer> base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_parse_integer_limit((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned int _parse_integer_limit(String s2, @Unsigned int base, Ptr<@Unsigned Long> p, @Unsigned long max_chars) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_acpi(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_acpi_bgrt(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_acpi_skip_timer_override(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_acpi_use_timer_override(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_args((const u8*)$arg1, $arg2, (const struct kernel_param*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static String parse_args(String doing, String args, Ptr<KernelDefinitions.kernel_param> params, @Unsigned int num, short min_level, short max_level, Ptr<?> arg2, @OriginalName(value="parse_unknown_fn") Ptr<?> unknown) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_compat_uts_machine(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_early_options(String cmdline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_early_param() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_efi_signature_list((const u8*)$arg1, (const void*)$arg2, $arg3, (void (const u8*, const void*, long unsigned int)* (*)(const struct {\n  u8 b[16];\n}*))$arg4)")
    public static int parse_efi_signature_list(String source, Ptr<?> data, @Unsigned long size, Ptr<?> get_handler_for_guid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_hardened_usercopy(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_histogram((const u8*)$arg1, $arg2, $arg3)")
    public static int parse_histogram(String h, Ptr<@Unsigned Integer> n_histogram_entries, Ptr<Ptr<@Unsigned Long>> histogram_boundaries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_linerange($arg1, (const u8*)$arg2)")
    public static int parse_linerange(Ptr<DdebugDefinitions.ddebug_query> query2, String first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_mount_options(String data, int op, Ptr<misc.pts_mount_opts> opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_mtrr_chunk_size_opt(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_mtrr_gran_size_opt(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_mtrr_spare_reg(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_no_kvmclock(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_no_kvmclock_vsyscall(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_noapic(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_one($arg1, $arg2, (const u8*)$arg3, (const struct kernel_param*)$arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static int parse_one(String param2, String val, String doing, Ptr<KernelDefinitions.kernel_param> params, @Unsigned int num_params, short min_level, short max_level, Ptr<?> arg2, @OriginalName(value="parse_unknown_fn") Ptr<?> handle_unknown) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_option_str((const u8*)$arg1, (const u8*)$arg2)")
    public static boolean parse_option_str(String str, String option) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_parts(Ptr<Ptr<CmdlineDefinitions.cmdline_parts>> parts, String bdevdef) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_pcc_subspace($arg1, (const long unsigned int)$arg2)")
    public static int parse_pcc_subspace(Ptr<AcpiDefinitions.acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_pci(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_resource(String c, Ptr<Integer> intval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String parse_slub_debug_flags(String str, Ptr<@Unsigned @OriginalName(value="slab_flags_t") Integer> flags, Ptr<String> slabs, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_subpart(Ptr<Ptr<CmdlineDefinitions.cmdline_subpart>> subpart, String partdef) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SynthDefinitions.synth_field> parse_synth_field(int argc, Ptr<String> argv, Ptr<Integer> consumed, Ptr<Integer> field_version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean parse_topology_leaf(Ptr<misc.topo_scan> tscan, @Unsigned int leaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_trust_bootloader(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_trust_cpu(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_usbdevfs_streams(Ptr<UsbDefinitions.usb_dev_state> ps, Ptr<UsbdevfsDefinitions.usbdevfs_streams> streams, Ptr<@Unsigned Integer> num_streams_ret, Ptr<@Unsigned Integer> num_eps_ret, Ptr<Ptr<Ptr<UsbDefinitions.usb_host_endpoint>>> eps_ret, Ptr<Ptr<UsbDefinitions.usb_interface>> intf_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_xen_msr_safe(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_xen_timer_slop(String ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int parse_csi2_resource(Ptr<AcpiDefinitions.acpi_resource> res, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_direct_gbpages_off(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_direct_gbpages_on(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_disable_apic_timer(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_dmar_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_lapic(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_lapic_timer_c2_ok(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_memmap_one(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_memmap_opt(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_memopt(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_monolithic_mount_data(Ptr<FsDefinitions.fs_context> fc, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_action(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_bpf(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_counters(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_flavors(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_iif(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_nh4(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_nh6(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_oif(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_srh(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_table(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nla_vrftable(Ptr<Ptr<runtime.nlattr>> attrs, Ptr<Seg6Definitions.seg6_local_lwt> slwt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nolapic_timer(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nopvspin(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_property(String t, Ptr<IpeDefinitions.ipe_rule> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_ras_param(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_rule(String line2, Ptr<IpeDefinitions.ipe_parsed_policy> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_topology_amd(Ptr<misc.topo_scan> tscan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_xen_legacy_crash(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__parse_crashkernel($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static int __parse_crashkernel(String cmdline, @Unsigned long system_ram, Ptr<@Unsigned Long> crash_size, Ptr<@Unsigned Long> crash_base, String suffix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_alloc_mptable_opt(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_amd_iommu_dump(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_amd_iommu_intr(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_amd_iommu_options(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_apply_sb_mount_options(Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_fs_context> m_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_bsd(Ptr<misc.parsed_partitions> state2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned @OriginalName(value="sector_t") long size, int origin, String flavour, int max_partitions) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_crashkernel(String cmdline, @Unsigned long system_ram, Ptr<@Unsigned Long> crash_size, Ptr<@Unsigned Long> crash_base, Ptr<@Unsigned Long> low_size, Ptr<@OriginalName(value="bool") Boolean> high) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_crashkernel_dummy(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_crashkernel_mem(String cmdline, @Unsigned long system_ram, Ptr<@Unsigned Long> crash_size, Ptr<@Unsigned Long> crash_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_crashkernel_suffix($arg1, $arg2, (const u8*)$arg3)")
    public static int parse_crashkernel_suffix(String cmdline, Ptr<@Unsigned Long> crash_size, String suffix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_discovery_table(Ptr<PciDefinitions.pci_dev> dev, int die, @Unsigned int bar_offset, Ptr<@OriginalName(value="bool") Boolean> parsed, Ptr<Integer> ignore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_efi_setup(@Unsigned long phys_addr, @Unsigned int data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_entry(String str, Ptr<TraceDefinitions.trace_event_call> call, Ptr<Ptr<?>> pentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_extended(Ptr<misc.parsed_partitions> state2, @Unsigned @OriginalName(value="sector_t") long first_sector, @Unsigned @OriginalName(value="sector_t") long first_size, @Unsigned int disksig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_freebsd(Ptr<misc.parsed_partitions> state2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned @OriginalName(value="sector_t") long size, int origin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_gart_mem(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_grep((const u8*)$arg1)")
    public static void parse_grep(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_int_array_user((const u8*)$arg1, $arg2, $arg3)")
    public static int parse_int_array_user(String from, @Unsigned long count, Ptr<Ptr<Integer>> array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_ivrs_acpihid(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_ivrs_hpet(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_ivrs_ioapic(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_mem_block_size(String ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_memtest(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.ucode_state parse_microcode_blobs(int cpu2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_minix(Ptr<misc.parsed_partitions> state2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned @OriginalName(value="sector_t") long size, int origin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_netbsd(Ptr<misc.parsed_partitions> state2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned @OriginalName(value="sector_t") long size, int origin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_nopv(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_openbsd(Ptr<misc.parsed_partitions> state2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned @OriginalName(value="sector_t") long size, int origin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_pmtmr(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_pred((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int parse_pred(String str, Ptr<?> data, int pos, Ptr<FilterDefinitions.filter_parse_error> pe, Ptr<Ptr<FilterDefinitions.filter_pred>> pred_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_rcu_nocb_poll(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_solaris_x86(Ptr<misc.parsed_partitions> state2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned @OriginalName(value="sector_t") long size, int origin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_tag_3_packet(Ptr<EcryptfsDefinitions.ecryptfs_crypt_stat> crypt_stat, String data, Ptr<ListDefinitions.list_head> auth_tok_list, Ptr<Ptr<EcryptfsDefinitions.ecryptfs_auth_tok>> new_auth_tok, Ptr<@Unsigned Long> packet_size, @Unsigned long max_packet_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_tag_65_packet(Ptr<EcryptfsDefinitions.ecryptfs_session_key> session_key, Ptr<Character> cipher_code, Ptr<EcryptfsDefinitions.ecryptfs_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_tag_67_packet(Ptr<EcryptfsDefinitions.ecryptfs_key_record> key_rec, Ptr<EcryptfsDefinitions.ecryptfs_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_unixware(Ptr<misc.parsed_partitions> state2, @Unsigned @OriginalName(value="sector_t") long offset, @Unsigned @OriginalName(value="sector_t") long size, int origin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_xen_emul_unplug(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_action_params(Ptr<TraceDefinitions.trace_array> tr, String params, Ptr<ActionDefinitions.action_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_actions(Ptr<HistDefinitions.hist_trigger_data> hist_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_affn_scope((const u8*)$arg1)")
    public static int parse_affn_scope(String val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_and_check_status(Ptr<OpalDefinitions.opal_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_assignment(Ptr<TraceDefinitions.trace_array> tr, String str, Ptr<HistDefinitions.hist_trigger_attrs> attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HistDefinitions.hist_field> parse_atom(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TraceDefinitions.trace_event_file> file2, String str, Ptr<@Unsigned Long> flags, String var_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_btf_arg(String varname, Ptr<Ptr<misc.fetch_insn>> pcode, Ptr<misc.fetch_insn> end, Ptr<TraceprobeDefinitions.traceprobe_parse_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="parse_btf_field($arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5)")
    public static int parse_btf_field(String fieldname, Ptr<BtfDefinitions.btf_type> type2, Ptr<Ptr<misc.fetch_insn>> pcode, Ptr<misc.fetch_insn> end, Ptr<TraceprobeDefinitions.traceprobe_parse_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_build_id(Ptr<runtime.freader> r, String build_id, Ptr<@Unsigned Integer> size, @OriginalName(value="loff_t") long note_off, @Unsigned @OriginalName(value="Elf32_Word") int note_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_bw(Ptr<RdtDefinitions.rdt_parse_data> data, Ptr<ResctrlDefinitions.resctrl_schema> s2, Ptr<RdtDefinitions.rdt_ctrl_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_cbm(Ptr<RdtDefinitions.rdt_parse_data> data, Ptr<ResctrlDefinitions.resctrl_schema> s2, Ptr<RdtDefinitions.rdt_ctrl_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_cec_param(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_crash_elf32_headers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_crash_elf64_headers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_efi_cmdline(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HistDefinitions.hist_field> parse_expr(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TraceDefinitions.trace_event_file> file2, String str, @Unsigned long flags, String var_name, Ptr<@Unsigned Integer> n_subexprs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HistDefinitions.hist_trigger_attrs> parse_hist_trigger_attrs(Ptr<TraceDefinitions.trace_array> tr, String trigger_str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_legacy(Ptr<misc.topo_scan> tscan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_line(String line2, Ptr<ResctrlDefinitions.resctrl_schema> s2, Ptr<runtime.rdtgroup> rdtgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_no_kvmapf(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_no_stealacc(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String parse_probe_arg_type(String arg2, Ptr<ProbeDefinitions.probe_arg> parg, Ptr<TraceprobeDefinitions.traceprobe_parse_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void parse_topology(Ptr<misc.topo_scan> tscan, boolean early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HistDefinitions.hist_field> parse_unary(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<TraceDefinitions.trace_event_file> file2, String str, @Unsigned long flags, String var_name, Ptr<@Unsigned Integer> n_subexprs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int parse_var_defs(Ptr<HistDefinitions.hist_trigger_data> hist_data) {
        throw new MethodIsBPFRelatedFunction();
    }
}

