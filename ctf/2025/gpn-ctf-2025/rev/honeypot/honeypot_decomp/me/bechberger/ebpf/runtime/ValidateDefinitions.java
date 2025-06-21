/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NlaDefinitions;
import me.bechberger.ebpf.runtime.NvdimmDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class ValidateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int validate_dimm(Ptr<NvdimmDefinitions.nvdimm_drvdata> ndd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="validate_dsm($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int validate_dsm(@OriginalName(value="acpi_handle") Ptr<?> handle, String uuid, int rev, Ptr<@OriginalName(value="guid_t") misc.uuid_t> dsm_guid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void validate_encoder_possible_clones(Ptr<DrmDefinitions.drm_encoder> encoder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int validate_hardware_logical_block_alignment(Ptr<DmDefinitions.dm_table> t, Ptr<QueueDefinitions.queue_limits> limits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int validate_hardware_zoned(Ptr<DmDefinitions.dm_table> t, boolean zoned, @Unsigned int zone_sectors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int validate_nsset(Ptr<runtime.nsset> nsset2, Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int validate_page_before_insert(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int validate_prctl_map_addr(Ptr<misc.prctl_mm_map> prctl_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int validate_probe_symbol(String symbol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long validate_show(Ptr<KmemDefinitions.kmem_cache> s2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void validate_slab(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<runtime.slab> slab2, Ptr<@Unsigned Long> obj_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long validate_slab_cache(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="validate_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long validate_store(Ptr<KmemDefinitions.kmem_cache> s2, String buf, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void validate_coredump_safety() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> validate_xmit_xfrm(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features, Ptr<@OriginalName(value="bool") Boolean> again) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int validate_change(Ptr<runtime.cpuset> cur, Ptr<runtime.cpuset> trial) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="validate_constant_table((const struct constant_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static boolean validate_constant_table(Ptr<misc.constant_table> tbl, @Unsigned long tbl_size, int low, int high, int special) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.mapping_status validate_data_csum(Ptr<runtime.sock> ssk, Ptr<SkDefinitions.sk_buff> skb, boolean csum_reqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> validate_xmit_skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<@OriginalName(value="bool") Boolean> again) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> validate_xmit_skb_list(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<@OriginalName(value="bool") Boolean> again) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean validate_ascii_string(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> var_name, int match, Ptr<Character> buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean validate_boot_order(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> var_name, int match, Ptr<Character> buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean validate_independent_components(@Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int validate_linkmsg(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean validate_load_option(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> var_name, int match, Ptr<Character> buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="validate_nla((const struct nlattr*)$arg1, $arg2, (const struct nla_policy*)$arg3, $arg4, $arg5, $arg6)")
    public static int validate_nla(Ptr<runtime.nlattr> nla, int maxtype, Ptr<NlaDefinitions.nla_policy> policy, @Unsigned int validate, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean validate_uint16(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> var_name, int match, Ptr<Character> buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }
}

