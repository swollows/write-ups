/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UserfaultfdDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MoveDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_addr_to_kernel(Ptr<?> uaddr, int ulen, Ptr<KernelDefinitions.__kernel_sockaddr_storage> kaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_addr_to_user(Ptr<KernelDefinitions.__kernel_sockaddr_storage> kaddr, int klen, Ptr<?> uaddr, Ptr<Integer> ulen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_module(Ptr<runtime.module> mod, Ptr<LoadDefinitions.load_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_pages_and_store_status(int node2, Ptr<ListDefinitions.list_head> pagelist, Ptr<Integer> status, int start, int i, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void move_right(String buf, String end, @Unsigned int len, @Unsigned int spaces) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_to_new_folio(Ptr<runtime.folio> dst, Ptr<runtime.folio> src, MigrateDefinitions.migrate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int move_folios_to_lru(Ptr<runtime.lruvec> lruvec2, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void move_freelist_tail(Ptr<ListDefinitions.list_head> freelist, Ptr<runtime.page> freepage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_hugetlb_page_tables(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<VmDefinitions.vm_area_struct> new_vma, @Unsigned long old_addr, @Unsigned long new_addr, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void move_hugetlb_state(Ptr<runtime.folio> old_folio, Ptr<runtime.folio> new_folio, int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> move_iter(Ptr<TimerDefinitions.timer_list_iter> iter2, @OriginalName(value="loff_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void move_master_key_secret(Ptr<FscryptDefinitions.fscrypt_master_key_secret> dst, Ptr<FscryptDefinitions.fscrypt_master_key_secret> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void move_pfn_range_to_zone(Ptr<runtime.zone> zone2, @Unsigned long start_pfn, @Unsigned long nr_pages, Ptr<misc.vmem_altmap> altmap, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_expired_inodes(Ptr<ListDefinitions.list_head> delaying_queue, Ptr<ListDefinitions.list_head> dispatch_queue, @Unsigned long dirtied_before) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long move_pages(Ptr<UserfaultfdDefinitions.userfaultfd_ctx> ctx, @Unsigned long dst_start, @Unsigned long src_start, @Unsigned long len, @Unsigned long mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_pages_pte(Ptr<MmDefinitions.mm_struct> mm, Ptr<PmdDefinitions.pmd_t> dst_pmd, Ptr<PmdDefinitions.pmd_t> src_pmd, Ptr<VmDefinitions.vm_area_struct> dst_vma, Ptr<VmDefinitions.vm_area_struct> src_vma, @Unsigned long dst_addr, @Unsigned long src_addr, @Unsigned long mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rq> move_queued_task(Ptr<runtime.rq> rq2, Ptr<RqDefinitions.rq_flags> rf, Ptr<TaskDefinitions.task_struct> p, int new_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __move_freepages_block(Ptr<runtime.zone> zone2, @Unsigned long start_pfn, int old_mt, int new_mt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_freepages_block(Ptr<runtime.zone> zone2, Ptr<runtime.page> page2, int old_mt, int new_mt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean move_freepages_block_isolate(Ptr<runtime.zone> zone2, Ptr<runtime.page> page2, int migratetype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean move_huge_pmd(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long old_addr, @Unsigned long new_addr, Ptr<PmdDefinitions.pmd_t> old_pmd, Ptr<PmdDefinitions.pmd_t> new_pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long move_page_tables(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long old_addr, Ptr<VmDefinitions.vm_area_struct> new_vma, @Unsigned long new_addr, @Unsigned long len, boolean need_rmap_locks, boolean for_stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int move_pages_huge_pmd(Ptr<MmDefinitions.mm_struct> mm, Ptr<PmdDefinitions.pmd_t> dst_pmd, Ptr<PmdDefinitions.pmd_t> src_pmd, PmdDefinitions.pmd_t dst_pmdval, Ptr<VmDefinitions.vm_area_struct> dst_vma, Ptr<VmDefinitions.vm_area_struct> src_vma, @Unsigned long dst_addr, @Unsigned long src_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void move_remote_task_to_local_dsq(Ptr<TaskDefinitions.task_struct> p, @Unsigned long enq_flags, Ptr<runtime.rq> src_rq, Ptr<runtime.rq> dst_rq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void move_to_next_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long move_vma(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long old_addr, @Unsigned long old_len, @Unsigned long new_len, @Unsigned long new_addr, Ptr<@OriginalName(value="bool") Boolean> locked, @Unsigned long flags, Ptr<VmDefinitions.vm_userfaultfd_ctx> uf, Ptr<ListDefinitions.list_head> uf_unmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct move_extent")
    @NotUsableInJava
    public static class move_extent
    extends Struct {
        public @Unsigned int reserved;
        public @Unsigned int donor_fd;
        public @Unsigned long orig_start;
        public @Unsigned long donor_start;
        public @Unsigned long len;
        public @Unsigned long moved_len;
    }
}

