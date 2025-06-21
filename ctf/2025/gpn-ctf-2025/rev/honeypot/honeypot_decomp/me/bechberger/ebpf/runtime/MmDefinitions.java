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
import me.bechberger.ebpf.runtime.EthnlDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VdsoDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_compute_batch(int overcommit_policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mm_compute_batch_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mm_compute_batch_notifier(Ptr<misc.notifier_block> self, @Unsigned long action, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_core_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mm_fill_reply($arg1, (const struct ethnl_req_info*)$arg2, (const struct ethnl_reply_data*)$arg3)")
    public static int mm_fill_reply(Ptr<SkDefinitions.sk_buff> skb, Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mm_prepare_data((const struct ethnl_req_info*)$arg1, $arg2, (const struct genl_info*)$arg3)")
    public static int mm_prepare_data(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mm_reply_size((const struct ethnl_req_info*)$arg1, (const struct ethnl_reply_data*)$arg2)")
    public static int mm_reply_size(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mm_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_trace_rss_stat(Ptr<mm_struct> mm, int member) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mm_struct> mm_access(Ptr<TaskDefinitions.task_struct> task2, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mm_struct> mm_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_cache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_drop_all_locks(Ptr<mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mm_struct> mm_init(Ptr<mm_struct> mm, Ptr<TaskDefinitions.task_struct> p, Ptr<UserDefinitions.user_namespace> user_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_init_cid(Ptr<mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_release(Ptr<TaskDefinitions.task_struct> tsk, Ptr<mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mm_take_all_locks(Ptr<mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mm_populate(@Unsigned long start, @Unsigned long len, int ignore_errors) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mm_account_pinned_pages(Ptr<runtime.mmpin> mmp, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PmdDefinitions.pmd_t> mm_alloc_pmd(Ptr<mm_struct> mm, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mm_cid_get(Ptr<runtime.rq> rq2, Ptr<mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PmdDefinitions.pmd_t> mm_find_pmd(Ptr<mm_struct> mm, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mm_get_unmapped_area(Ptr<mm_struct> mm, Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long mm_get_unmapped_area_vmflags(Ptr<mm_struct> mm, Ptr<runtime.file> filp, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags, @Unsigned @OriginalName(value="vm_flags_t") long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_unaccount_pinned_pages(Ptr<runtime.mmpin> mmp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_update_next_owner(Ptr<mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> mm_get_huge_zero_folio(Ptr<mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_pasid_drop(Ptr<mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mm_put_huge_zero_folio(Ptr<mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mm_struct__safe_rcu_or_null")
    @NotUsableInJava
    public static class mm_struct__safe_rcu_or_null
    extends Struct {
        public Ptr<runtime.file> exe_file;
    }

    @Type(noCCodeGeneration=true, cType="enum mm_cid_state")
    public static enum mm_cid_state implements Enum<mm_cid_state>,
    TypedEnum<mm_cid_state, Integer>
    {
        MM_CID_UNSET,
        MM_CID_LAZY_PUT;

    }

    @Type(noCCodeGeneration=true, cType="struct mm_reply_data")
    @NotUsableInJava
    public static class mm_reply_data
    extends Struct {
        public EthnlDefinitions.ethnl_reply_data base;
        public EthtoolDefinitions.ethtool_mm_state state;
        public EthtoolDefinitions.ethtool_mm_stats stats;
    }

    @Type(noCCodeGeneration=true, cType="struct mm_slot")
    @NotUsableInJava
    public static class mm_slot
    extends Struct {
        public misc.hlist_node hash;
        public ListDefinitions.list_head mm_node;
        public Ptr<mm_struct> mm;
    }

    @Type(noCCodeGeneration=true, cType="struct mm_walk")
    @NotUsableInJava
    public static class mm_walk
    extends Struct {
        public Ptr<mm_walk_ops> ops;
        public Ptr<mm_struct> mm;
        public Ptr<misc.pgd_t> pgd;
        public Ptr<VmDefinitions.vm_area_struct> vma;
        public PageDefinitions.page_walk_action action;
        public boolean no_vma;
        public Ptr<?> _private;
    }

    @Type(noCCodeGeneration=true, cType="struct mm_walk_ops")
    @NotUsableInJava
    public static class mm_walk_ops
    extends Struct {
        public Ptr<?> pgd_entry;
        public Ptr<?> p4d_entry;
        public Ptr<?> pud_entry;
        public Ptr<?> pmd_entry;
        public Ptr<?> pte_entry;
        public Ptr<?> pte_hole;
        public Ptr<?> hugetlb_entry;
        public Ptr<?> test_walk;
        public Ptr<?> pre_vma;
        public Ptr<?> post_vma;
        public PageDefinitions.page_walk_lock walk_lock;
    }

    @Type(noCCodeGeneration=true, cType="enum mm_io_opcode")
    public static enum mm_io_opcode implements Enum<mm_io_opcode>,
    TypedEnum<mm_io_opcode, Integer>
    {
        MMIO_READ,
        MMIO_WRITE,
        MMIO_PROBE,
        MMIO_UNPROBE,
        MMIO_UNKNOWN_OP;

    }

    @Type(noCCodeGeneration=true, cType="struct mm_cid")
    @NotUsableInJava
    public static class mm_cid
    extends Struct {
        public @Unsigned long time;
        public int cid;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int ctx_id; struct { long long int counter; } tlb_gen; struct rw_semaphore ldt_usr_sem; struct ldt_struct *ldt; long unsigned int flags; struct mutex lock; void *vdso; const struct vdso_image*; struct { int counter; } perf_rdpmc_allowed; short unsigned int pkey_allocation_map; short int execute_only_pkey; }")
    @NotUsableInJava
    public static class mm_context_t
    extends Struct {
        public @Unsigned long ctx_id;
        public misc.atomic64_t tlb_gen;
        public misc.rw_semaphore ldt_usr_sem;
        public Ptr<misc.ldt_struct> ldt;
        public @Unsigned long flags;
        public runtime.mutex lock;
        public Ptr<?> vdso;
        public Ptr<VdsoDefinitions.vdso_image> vdso_image;
        public AtomicDefinitions.atomic_t perf_rdpmc_allowed;
        public @Unsigned short pkey_allocation_map;
        public short execute_only_pkey;
    }

    @Type(noCCodeGeneration=true, cType="struct mm_struct")
    @NotUsableInJava
    public static class mm_struct
    extends Struct {
        public AnonDefinitions.anon_member_of_mm_struct anon0;
        public @Unsigned long @Size(value=0) [] cpu_bitmap;
    }
}

