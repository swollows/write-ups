/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NhDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmapDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class InsertDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int insert_pfn(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2,  @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn,  @OriginalName(value="pgprot_t") runtime.pgprot prot, boolean mkwrite) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void insert_vmap_area(Ptr<VmapDefinitions.vmap_area> va, Ptr<RbDefinitions.rb_root> root, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> __insert_resource(Ptr<runtime.resource> parent, Ptr<runtime.resource> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insert_extent(Ptr<misc.uid_gid_map> map2, Ptr<misc.uid_gid_extent> extent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insert_resource(Ptr<runtime.resource> parent, Ptr<runtime.resource> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> insert_resource_conflict(Ptr<runtime.resource> parent, Ptr<runtime.resource> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void insert_resource_expand_to_fit(Ptr<runtime.resource> root, Ptr<runtime.resource> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insert_revoke_hash(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long blocknr, @Unsigned @OriginalName(value="tid_t") int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String insert_space_after_semis(String args, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __insert_inode_hash(Ptr<runtime.inode> inode2, @Unsigned long hashval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __insert_pending(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk, Ptr<Ptr<misc.pending_reservation>> prealloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void insert_char(Ptr<VcDefinitions.vc_data> vc2, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insert_entry(Ptr<misc.ctl_table_header> head, Ptr<misc.ctl_table> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insert_header(Ptr<misc.ctl_dir> dir, Ptr<misc.ctl_table_header> header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insert_inode_locked(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="insert_inode_locked4($arg1, $arg2, (int (*)(struct inode*, void*))$arg3, $arg4)")
    public static int insert_inode_locked4(Ptr<runtime.inode> inode2, @Unsigned long hashval, Ptr<?> test2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insert_nexthop(Ptr<runtime.net> net2, Ptr<runtime.nexthop> new_nh, Ptr<NhDefinitions.nh_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insert_stat(Ptr<RbDefinitions.rb_root> root, Ptr<?> stat2, @OriginalName(value="cmp_func_t") Ptr<?> cmp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insert_vm_struct(Ptr<MmDefinitions.mm_struct> mm, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void insert_pfn_pmd(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PmdDefinitions.pmd_t> pmd,  @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn,  @OriginalName(value="pgprot_t") runtime.pgprot prot, boolean write2, @OriginalName(value="pgtable_t") Ptr<runtime.page> pgtable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void insert_pfn_pud(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PudDefinitions.pud_t> pud,  @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void insert_work(Ptr<misc.pool_workqueue> pwq, Ptr<misc.work_struct> work, Ptr<ListDefinitions.list_head> head, @Unsigned int extra_flags) {
        throw new MethodIsBPFRelatedFunction();
    }
}

