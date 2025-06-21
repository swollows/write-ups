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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.CipsoDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DmarDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.GnttabDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.VdsoDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class MapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> __map_dma_buf(Ptr<DmaDefinitions.dma_buf_attachment> attach, DmaDefinitions.dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean map_pte(Ptr<PageDefinitions.page_vma_mapped_walk> pvmw, Ptr<Ptr< @OriginalName(value="spinlock_t") runtime.spinlock>> ptlp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> map_udmabuf(Ptr<DmaDefinitions.dma_buf_attachment> at, DmaDefinitions.dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long map_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int map_id_down(Ptr<misc.uid_gid_map> map2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int map_id_range_down(Ptr<misc.uid_gid_map> map2, @Unsigned int id, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int map_id_up(Ptr<misc.uid_gid_map> map2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_iommu(Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<DmarDefinitions.dmar_drhd_unit> drhd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_cpuid_t") int map_madt_entry(Ptr<AcpiDefinitions.acpi_table_madt> madt, int type2, @Unsigned int acpi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_cpuid_t") int map_mat_entry(@OriginalName(value="acpi_handle") Ptr<?> handle, int type2, @Unsigned int acpi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void map_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_request(Ptr<DmDefinitions.dm_rq_target_io> tio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> map_seq_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> map_seq_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void map_seq_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="map_write($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static @OriginalName(value="ssize_t") long map_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos, int cap_setid, Ptr<misc.uid_gid_map> map2, Ptr<misc.uid_gid_map> parent_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __map_bio(Ptr<runtime.bio> clone) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __map_region(Ptr<EfiDefinitions.efi_memory_desc_t> md, @Unsigned long va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void map_gru_high(int max_pnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void map_high(String id, @Unsigned long base, int pshift, int bshift, int max_pnode, map_type map_type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_kptr_match_type(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BtfDefinitions.btf_field> kptr_field, Ptr<BpfDefinitions.bpf_reg_state> reg, @Unsigned int regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_ldt_struct(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.ldt_struct> ldt, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void map_ldt_struct_to_user(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void map_mmioh_high(int min_pnode, int max_pnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void map_mmr_high(int max_pnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int map_old_perms(@Unsigned int old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_properties() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_set_for_each_callback_args(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> caller, Ptr<BpfDefinitions.bpf_func_state> callee) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void map_add_var() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="map_check_btf($arg1, $arg2, (const struct btf*)$arg3, $arg4, $arg5)")
    public static int map_check_btf(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_token> token, Ptr<runtime.btf> btf2, @Unsigned int btf_key_id, @Unsigned int btf_value_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="map_check_no_btf((const struct bpf_map*)$arg1, (const struct btf*)$arg2, (const struct btf_type*)$arg3, (const struct btf_type*)$arg4)")
    public static int map_check_no_btf(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.btf> btf2, Ptr<BtfDefinitions.btf_type> key_type2, Ptr<BtfDefinitions.btf_type> value_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_create(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_delete_elem(Ptr<BpfDefinitions.bpf_attr> attr2, @OriginalName(value="bpfptr_t") misc.sockptr_t uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_files_d_revalidate(Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_files_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="map_freeze((const union bpf_attr*)$arg1)")
    public static int map_freeze(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_get_next_key(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_lookup_and_delete_elem(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_lookup_elem(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_ring_apply(Ptr<PteDefinitions.pte_t> pte, @Unsigned long addr2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_tboot_page(@Unsigned long vaddr, @Unsigned long pfn,  @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int map_update_elem(Ptr<BpfDefinitions.bpf_attr> attr2, @OriginalName(value="bpfptr_t") misc.sockptr_t uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="map_vdso((const struct vdso_image*)$arg1, $arg2)")
    public static int map_vdso(Ptr<VdsoDefinitions.vdso_image> image, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="map_vdso_once((const struct vdso_image*)$arg1, $arg2)")
    public static int map_vdso_once(Ptr<VdsoDefinitions.vdso_image> image, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void map_vsyscall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct bpf_map *ptr; int uid; }")
    @NotUsableInJava
    public static class map_of_bpf_kfunc_call_arg_meta
    extends Struct {
        public Ptr<BpfDefinitions.bpf_map> ptr;
        public int uid;
    }

    @Type(noCCodeGeneration=true, cType="enum map_type")
    public static enum map_type implements Enum<map_type>,
    TypedEnum<map_type, Integer>
    {
        map_wb,
        map_uc;

    }

    @Type(noCCodeGeneration=true, cType="struct map_iter")
    @NotUsableInJava
    public static class map_iter
    extends Struct {
        public Ptr<?> key;
        public boolean done;
    }

    @Type(noCCodeGeneration=true, cType="struct map_attribute")
    @NotUsableInJava
    public static class map_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
    }

    @Type(noCCodeGeneration=true, cType="struct map_range")
    @NotUsableInJava
    public static class map_range
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned int page_size_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct map_balloon_pages")
    @NotUsableInJava
    public static class map_balloon_pages
    extends Struct {
        public Ptr<@Unsigned @OriginalName(value="xen_pfn_t") Long> pfns;
        public @Unsigned int idx;
    }

    @Type(noCCodeGeneration=true, cType="union map_info")
    @NotUsableInJava
    public static class map_info
    extends Union {
        public Ptr<?> ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct map_ring_valloc")
    @NotUsableInJava
    public static class map_ring_valloc
    extends Struct {
        public Ptr<XenbusDefinitions.xenbus_map_node> node;
        public @Unsigned long @Size(value=16) [] addrs;
        public @Unsigned @OriginalName(value="phys_addr_t") long @Size(value=16) [] phys_addrs;
        public GnttabDefinitions.gnttab_map_grant_ref @Size(value=16) [] map;
        public GnttabDefinitions.gnttab_unmap_grant_ref @Size(value=16) [] unmap;
        public @Unsigned int idx;
    }

    @Type(noCCodeGeneration=true, cType="union { struct cipso_v4_std_map_tbl *std; }")
    @NotUsableInJava
    public static class map_of_cipso_v4_doi
    extends Union {
        public Ptr<CipsoDefinitions.cipso_v4_std_map_tbl> std;
    }

    @Type(noCCodeGeneration=true, cType="struct map_files_info")
    @NotUsableInJava
    public static class map_files_info
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned @OriginalName(value="fmode_t") int mode;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int map_fd; }")
    @NotUsableInJava
    public static class map_of_bpf_iter_link_info
    extends Struct {
        public @Unsigned int map_fd;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int map_id; }")
    @NotUsableInJava
    public static class map_of_anon_member_of_iter_of_anon_member_of_bpf_link_info_and_struct_ops_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned int map_id;
    }
}

