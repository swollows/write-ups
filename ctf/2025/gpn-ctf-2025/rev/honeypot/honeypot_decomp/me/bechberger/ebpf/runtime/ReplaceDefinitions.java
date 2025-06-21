/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NhDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class ReplaceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int replace_mm_exe_file(Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.file> new_exe_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __replace_page(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<runtime.page> old_page, Ptr<runtime.page> new_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __replace_profile(Ptr<AaDefinitions.aa_profile> old, Ptr<AaDefinitions.aa_profile> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int replace_anon_vma_name(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<AnonDefinitions.anon_vma_name> anon_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int replace_fd(@Unsigned int fd2, Ptr<runtime.file> file2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int replace_intsrc_all(Ptr<misc.mpc_table> mpc, @Unsigned long mpc_new_phys, @Unsigned long mpc_new_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="replace_nexthop($arg1, $arg2, $arg3, (const struct nh_config*)$arg4, $arg5)")
    public static int replace_nexthop(Ptr<runtime.net> net2, Ptr<runtime.nexthop> old, Ptr<runtime.nexthop> _new, Ptr<NhDefinitions.nh_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="replace_nexthop_grp($arg1, $arg2, $arg3, (const struct nh_config*)$arg4, $arg5)")
    public static int replace_nexthop_grp(Ptr<runtime.net> net2, Ptr<runtime.nexthop> old, Ptr<runtime.nexthop> _new, Ptr<NhDefinitions.nh_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void replace_nexthop_grp_res(Ptr<NhDefinitions.nh_group> oldg, Ptr<NhDefinitions.nh_group> newg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int replace_nexthop_single(Ptr<runtime.net> net2, Ptr<runtime.nexthop> old, Ptr<runtime.nexthop> _new, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int replace_nexthop_single_notify(Ptr<runtime.net> net2, Ptr<runtime.nexthop> group_nh, Ptr<runtime.nexthop> old, Ptr<NhDefinitions.nh_info> oldi, Ptr<NhDefinitions.nh_info> newi, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void replace_chunk(Ptr<AuditDefinitions.audit_chunk> _new, Ptr<AuditDefinitions.audit_chunk> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int replace_page(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<runtime.page> page2, Ptr<runtime.page> kpage, PteDefinitions.pte_t orig_pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void replace_page_cache_folio(Ptr<runtime.folio> old, Ptr<runtime.folio> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long replace_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }
}

