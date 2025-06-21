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
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SgxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sgx_epc_page> __sgx_alloc_epc_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sgx_encl_ewb(Ptr<sgx_epc_page> epc_page, Ptr<?> va_slot, Ptr<sgx_backing> backing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __sgx_sanitize_pages(Ptr<ListDefinitions.list_head> dirty_page_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sgx_epc_page> sgx_alloc_epc_page(Ptr<?> owner, boolean reclaim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_encl_ewb(Ptr<sgx_epc_page> epc_page, Ptr<sgx_backing> backing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_free_epc_page(Ptr<sgx_epc_page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_ipi_cb(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_mark_page_reclaimable(Ptr<sgx_epc_page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sgx_page_cache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_reclaim_direct() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_reclaim_pages() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sgx_reclaimer_age(Ptr<sgx_epc_page> epc_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_set_attribute(Ptr<@Unsigned Long> allowed_attributes, @Unsigned int attribute_fd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sgx_total_bytes_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_unmark_page_reclaimable(Ptr<sgx_epc_page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_update_lepubkeyhash(Ptr<@Unsigned Long> lepubkeyhash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sgx_virt_einit(Ptr<?> sigstruct, Ptr<?> token, Ptr<?> secs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sgx_compat_ioctl(Ptr<runtime.file> filep, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_drv_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long sgx_get_unmapped_area(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int sgx_vepc_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_vepc_free_page(Ptr<sgx_epc_page> epc_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_vepc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sgx_vepc_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_vepc_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_vepc_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_vepc_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_vepc_remove_page(Ptr<sgx_epc_page> epc_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_virt_ecreate(Ptr<sgx_pageinfo> pageinfo, Ptr<?> secs, Ptr<Integer> trapnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_virt_einit(Ptr<?> sigstruct, Ptr<?> token, Ptr<?> secs, Ptr<@Unsigned Long> lepubkeyhash, Ptr<Integer> trapnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sgx_encl_eldu(Ptr<sgx_encl_page> encl_page, Ptr<sgx_epc_page> epc_page, Ptr<sgx_epc_page> secs_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sgx_encl_get_backing(Ptr<sgx_encl> encl, @Unsigned long page_index, Ptr<sgx_backing> backing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sgx_encl_page> __sgx_encl_load_page(Ptr<sgx_encl> encl, Ptr<sgx_encl_page> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sgx_epc_page> sgx_alloc_va_page(boolean reclaim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sgx_alloc_va_slot(Ptr<sgx_va_page> va_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_encl_alloc_backing(Ptr<sgx_encl> encl, @Unsigned long page_index, Ptr<sgx_backing> backing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const cpumask*)sgx_encl_cpumask($arg1))")
    public static @NotUsableInJava Ptr< @OriginalName(value="cpumask_t") runtime.cpumask> sgx_encl_cpumask(Ptr<sgx_encl> encl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int sgx_encl_eaug_page(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<sgx_encl> encl, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sgx_epc_page> sgx_encl_eldu(Ptr<sgx_encl_page> encl_page, Ptr<sgx_epc_page> secs_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_encl_free_epc_page(Ptr<sgx_epc_page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sgx_encl_page> sgx_encl_load_page(Ptr<sgx_encl> encl, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_encl_may_map(Ptr<sgx_encl> encl, @Unsigned long start, @Unsigned long end, @Unsigned long vm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_encl_mm_add(Ptr<sgx_encl> encl, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sgx_encl_page> sgx_encl_page_alloc(Ptr<sgx_encl> encl, @Unsigned long offset, @Unsigned long secinfo_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_encl_put_backing(Ptr<sgx_backing> backing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_encl_release(Ptr<runtime.kref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_encl_test_and_clear_young(Ptr<MmDefinitions.mm_struct> mm, Ptr<sgx_encl_page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_encl_test_and_clear_young_cb(Ptr<PteDefinitions.pte_t> ptep, @Unsigned long addr2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_free_va_slot(Ptr<sgx_va_page> va_page, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_mmu_notifier_free(Ptr<MmuDefinitions.mmu_notifier> mn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_mmu_notifier_release(Ptr<MmuDefinitions.mmu_notifier> mn2, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sgx_va_page_full(Ptr<sgx_va_page> va_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_vma_access(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<?> buf, int len, int write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int sgx_vma_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_vma_mprotect(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, @Unsigned long newflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_vma_open(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_zap_enclave_ptes(Ptr<sgx_encl> encl, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sgx_encl_add_page(Ptr<sgx_encl> encl, Ptr<sgx_encl_page> encl_page, Ptr<sgx_epc_page> epc_page, Ptr<sgx_secinfo> secinfo, @Unsigned long src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__sgx_get_key_hash($arg1, (const void*)$arg2, $arg3)")
    public static int __sgx_get_key_hash(Ptr<CryptoDefinitions.crypto_shash> tfm, Ptr<?> modulus, Ptr<?> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_encl_add_page(Ptr<sgx_encl> encl, @Unsigned long src, @Unsigned long offset, Ptr<sgx_secinfo> secinfo, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_encl_create(Ptr<sgx_encl> encl, Ptr<sgx_secs> secs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<sgx_va_page> sgx_encl_grow(Ptr<sgx_encl> encl, boolean reclaim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_encl_init(Ptr<sgx_encl> encl, Ptr<sgx_sigstruct> sigstruct, Ptr<?> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sgx_encl_remove_pages(Ptr<sgx_encl> encl, Ptr<sgx_enclave_remove_pages> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sgx_encl_shrink(Ptr<sgx_encl> encl, Ptr<sgx_va_page> va_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_enclave_etrack(Ptr<sgx_encl> encl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sgx_ioc_enclave_add_pages(Ptr<sgx_encl> encl, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sgx_ioc_enclave_init(Ptr<sgx_encl> encl, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sgx_ioc_sgx2_ready(Ptr<sgx_encl> encl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long sgx_ioctl(Ptr<runtime.file> filep, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_vepc")
    @NotUsableInJava
    public static class sgx_vepc
    extends Struct {
        public runtime.xarray page_array;
        public runtime.mutex lock;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_backing")
    @NotUsableInJava
    public static class sgx_backing
    extends Struct {
        public Ptr<runtime.page> contents;
        public Ptr<runtime.page> pcmd;
        public @Unsigned long pcmd_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_encl_mm")
    @NotUsableInJava
    public static class sgx_encl_mm
    extends Struct {
        public Ptr<sgx_encl> encl;
        public Ptr<MmDefinitions.mm_struct> mm;
        public ListDefinitions.list_head list;
        public MmuDefinitions.mmu_notifier mmu_notifier;
    }

    @Type(noCCodeGeneration=true, cType="enum sgx_encl_flags")
    public static enum sgx_encl_flags implements Enum<sgx_encl_flags>,
    TypedEnum<sgx_encl_flags, Integer>
    {
        SGX_ENCL_IOCTL,
        SGX_ENCL_DEBUG,
        SGX_ENCL_CREATED,
        SGX_ENCL_INITIALIZED;

    }

    @Type(noCCodeGeneration=true, cType="struct sgx_va_page")
    @NotUsableInJava
    public static class sgx_va_page
    extends Struct {
        public Ptr<sgx_epc_page> epc_page;
        public @Unsigned long @Size(value=8) [] slots;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_encl")
    @NotUsableInJava
    public static class sgx_encl
    extends Struct {
        public @Unsigned long base;
        public @Unsigned long size;
        public @Unsigned long flags;
        public @Unsigned int page_cnt;
        public @Unsigned int secs_child_cnt;
        public runtime.mutex lock;
        public runtime.xarray page_array;
        public sgx_encl_page secs;
        public @Unsigned long attributes;
        public @Unsigned long attributes_mask;
        public  @OriginalName(value="cpumask_t") runtime.cpumask cpumask;
        public Ptr<runtime.file> backing;
        public runtime.kref refcount;
        public ListDefinitions.list_head va_pages;
        public @Unsigned long mm_list_version;
        public ListDefinitions.list_head mm_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock mm_lock;
        public SrcuDefinitions.srcu_struct srcu;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_epc_section")
    @NotUsableInJava
    public static class sgx_epc_section
    extends Struct {
        public @Unsigned long phys_addr;
        public Ptr<?> virt_addr;
        public Ptr<sgx_epc_page> pages;
        public Ptr<sgx_numa_node> node;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_numa_node")
    @NotUsableInJava
    public static class sgx_numa_node
    extends Struct {
        public ListDefinitions.list_head free_page_list;
        public ListDefinitions.list_head sgx_poison_page_list;
        public @Unsigned long size;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_encl_page")
    @NotUsableInJava
    public static class sgx_encl_page
    extends Struct {
        public @Unsigned long desc;
        public @Unsigned long vm_max_prot_bits;
        public sgx_page_type type;
        public Ptr<sgx_epc_page> epc_page;
        public Ptr<sgx_encl> encl;
        public Ptr<sgx_va_page> va_page;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_epc_page")
    @NotUsableInJava
    public static class sgx_epc_page
    extends Struct {
        public @Unsigned int section;
        public @Unsigned short flags;
        public @Unsigned short poison;
        public Ptr<sgx_encl_page> owner;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_enclave_remove_pages")
    @NotUsableInJava
    public static class sgx_enclave_remove_pages
    extends Struct {
        public @Unsigned long offset;
        public @Unsigned long length;
        public @Unsigned long count;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_enclave_modify_types")
    @NotUsableInJava
    public static class sgx_enclave_modify_types
    extends Struct {
        public @Unsigned long offset;
        public @Unsigned long length;
        public @Unsigned long page_type;
        public @Unsigned long result;
        public @Unsigned long count;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_enclave_restrict_permissions")
    @NotUsableInJava
    public static class sgx_enclave_restrict_permissions
    extends Struct {
        public @Unsigned long offset;
        public @Unsigned long length;
        public @Unsigned long permissions;
        public @Unsigned long result;
        public @Unsigned long count;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_enclave_provision")
    @NotUsableInJava
    public static class sgx_enclave_provision
    extends Struct {
        public @Unsigned long fd;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_enclave_init")
    @NotUsableInJava
    public static class sgx_enclave_init
    extends Struct {
        public @Unsigned long sigstruct;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_enclave_add_pages")
    @NotUsableInJava
    public static class sgx_enclave_add_pages
    extends Struct {
        public @Unsigned long src;
        public @Unsigned long offset;
        public @Unsigned long length;
        public @Unsigned long secinfo;
        public @Unsigned long flags;
        public @Unsigned long count;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_enclave_create")
    @NotUsableInJava
    public static class sgx_enclave_create
    extends Struct {
        public @Unsigned long src;
    }

    @Type(noCCodeGeneration=true, cType="enum sgx_page_flags")
    public static enum sgx_page_flags implements Enum<sgx_page_flags>,
    TypedEnum<sgx_page_flags, Integer>
    {
        SGX_PAGE_MEASURE;

    }

    @Type(noCCodeGeneration=true, cType="struct sgx_sigstruct")
    @NotUsableInJava
    public static class sgx_sigstruct
    extends Struct {
        public sgx_sigstruct_header header;
        public char @Size(value=384) [] modulus;
        public @Unsigned int exponent;
        public char @Size(value=384) [] signature;
        public sgx_sigstruct_body body;
        public char @Size(value=12) [] reserved4;
        public char @Size(value=384) [] q1;
        public char @Size(value=384) [] q2;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_sigstruct_body")
    @NotUsableInJava
    public static class sgx_sigstruct_body
    extends Struct {
        public @Unsigned int miscselect;
        public @Unsigned int misc_mask;
        public char @Size(value=20) [] reserved2;
        public @Unsigned long attributes;
        public @Unsigned long xfrm;
        public @Unsigned long attributes_mask;
        public @Unsigned long xfrm_mask;
        public char @Size(value=32) [] mrenclave;
        public char @Size(value=32) [] reserved3;
        public @Unsigned short isvprodid;
        public @Unsigned short isvsvn;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_sigstruct_header")
    @NotUsableInJava
    public static class sgx_sigstruct_header
    extends Struct {
        public @Unsigned long @Size(value=2) [] header1;
        public @Unsigned int vendor;
        public @Unsigned int date;
        public @Unsigned long @Size(value=2) [] header2;
        public @Unsigned int swdefined;
        public char @Size(value=84) [] reserved1;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_secinfo")
    @NotUsableInJava
    public static class sgx_secinfo
    extends Struct {
        public @Unsigned long flags;
        public char @Size(value=56) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="enum sgx_secinfo_flags")
    public static enum sgx_secinfo_flags implements Enum<sgx_secinfo_flags>,
    TypedEnum<sgx_secinfo_flags, Integer>
    {
        SGX_SECINFO_R,
        SGX_SECINFO_W,
        SGX_SECINFO_X,
        SGX_SECINFO_SECS,
        SGX_SECINFO_TCS,
        SGX_SECINFO_REG,
        SGX_SECINFO_VA,
        SGX_SECINFO_TRIM;

    }

    @Type(noCCodeGeneration=true, cType="enum sgx_page_type")
    public static enum sgx_page_type implements Enum<sgx_page_type>,
    TypedEnum<sgx_page_type, Integer>
    {
        SGX_PAGE_TYPE_SECS,
        SGX_PAGE_TYPE_TCS,
        SGX_PAGE_TYPE_REG,
        SGX_PAGE_TYPE_VA,
        SGX_PAGE_TYPE_TRIM;

    }

    @Type(noCCodeGeneration=true, cType="struct sgx_pageinfo")
    @NotUsableInJava
    public static class sgx_pageinfo
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned long contents;
        public @Unsigned long metadata;
        public @Unsigned long secs;
    }

    @Type(noCCodeGeneration=true, cType="struct sgx_secs")
    @NotUsableInJava
    public static class sgx_secs
    extends Struct {
        public @Unsigned long size;
        public @Unsigned long base;
        public @Unsigned int ssa_frame_size;
        public @Unsigned int miscselect;
        public char @Size(value=24) [] reserved1;
        public @Unsigned long attributes;
        public @Unsigned long xfrm;
        public @Unsigned int @Size(value=8) [] mrenclave;
        public char @Size(value=32) [] reserved2;
        public @Unsigned int @Size(value=8) [] mrsigner;
        public char @Size(value=32) [] reserved3;
        public @Unsigned int @Size(value=16) [] config_id;
        public @Unsigned short isv_prod_id;
        public @Unsigned short isv_svn;
        public @Unsigned short config_svn;
        public char @Size(value=3834) [] reserved4;
    }

    @Type(noCCodeGeneration=true, cType="enum sgx_attribute")
    public static enum sgx_attribute implements Enum<sgx_attribute>,
    TypedEnum<sgx_attribute, Integer>
    {
        SGX_ATTR_INIT,
        SGX_ATTR_DEBUG,
        SGX_ATTR_MODE64BIT,
        SGX_ATTR_PROVISIONKEY,
        SGX_ATTR_EINITTOKENKEY,
        SGX_ATTR_KSS,
        SGX_ATTR_ASYNC_EXIT_NOTIFY;

    }

    @Type(noCCodeGeneration=true, cType="enum sgx_return_code")
    public static enum sgx_return_code implements Enum<sgx_return_code>,
    TypedEnum<sgx_return_code, Integer>
    {
        SGX_EPC_PAGE_CONFLICT,
        SGX_NOT_TRACKED,
        SGX_CHILD_PRESENT,
        SGX_INVALID_EINITTOKEN,
        SGX_PAGE_NOT_MODIFIABLE,
        SGX_UNMASKED_EVENT;

    }

    @Type(noCCodeGeneration=true, cType="enum sgx_encls_function")
    public static enum sgx_encls_function implements Enum<sgx_encls_function>,
    TypedEnum<sgx_encls_function, Integer>
    {
        ECREATE,
        EADD,
        EINIT,
        EREMOVE,
        EDGBRD,
        EDGBWR,
        EEXTEND,
        ELDU,
        EBLOCK,
        EPA,
        EWB,
        ETRACK,
        EAUG,
        EMODPR,
        EMODT;

    }
}

