/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.OriginalNames;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.HtabDefinitions;
import me.bechberger.ebpf.runtime.ImaDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LookupDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mount> __lookup_mnt(Ptr<runtime.vfsmount> mnt, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MntDefinitions.mnt_namespace> __lookup_next_mnt_ns(Ptr<MntDefinitions.mnt_namespace> mntns, boolean previous) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_bdev((const u8*)$arg1, $arg2)")
    public static int lookup_bdev(String pathname, Ptr<@Unsigned @OriginalName(value="dev_t") Integer> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_mnt((const struct path*)$arg1)")
    public static Ptr<runtime.vfsmount> lookup_mnt(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mountpoint> lookup_mountpoint(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short lookup_swap_cgroup_id(misc.swp_entry_t ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lookup_symbol_name(@Unsigned long addr2, String symname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__lookup_slow((const struct qstr*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.dentry> __lookup_slow(Ptr<runtime.qstr> name, Ptr<runtime.dentry> dir, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> _lookup_address_cpa(Ptr<misc.cpa_data> cpa, @Unsigned long address, Ptr<@Unsigned Integer> level, Ptr<@OriginalName(value="bool") Boolean> nx, Ptr<@OriginalName(value="bool") Boolean> rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> lookup_address(@Unsigned long address, Ptr<@Unsigned Integer> level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> lookup_address_in_pgd(Ptr<misc.pgd_t> pgd, @Unsigned long address, Ptr<@Unsigned Integer> level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PteDefinitions.pte_t> lookup_address_in_pgd_attr(Ptr<misc.pgd_t> pgd, @Unsigned long address, Ptr<@Unsigned Integer> level, Ptr<@OriginalName(value="bool") Boolean> nx, Ptr<@OriginalName(value="bool") Boolean> rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> lookup_bh_lru(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long block, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_dcache((const struct qstr*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.dentry> lookup_dcache(Ptr<runtime.qstr> name, Ptr<runtime.dentry> dir, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HtabDefinitions.htab_elem> lookup_elem_raw(Ptr<misc.hlist_nulls_head> head, @Unsigned int hash2, Ptr<?> key2, @Unsigned int key_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> lookup_fast(Ptr<runtime.nameidata> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lookup_module_symbol_name(@Unsigned long addr2, String symname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HtabDefinitions.htab_elem> lookup_nulls_elem_raw(Ptr<misc.hlist_nulls_head> head, @Unsigned int hash2, Ptr<?> key2, @Unsigned int key_size, @Unsigned int n_buckets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_one($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.dentry> lookup_one(Ptr<MntDefinitions.mnt_idmap> idmap, String name, Ptr<runtime.dentry> base, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_one_common($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int lookup_one_common(Ptr<MntDefinitions.mnt_idmap> idmap, String name, Ptr<runtime.dentry> base, int len, Ptr<runtime.qstr> _this) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_one_len((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.dentry> lookup_one_len(String name, Ptr<runtime.dentry> base, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_one_len_unlocked((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.dentry> lookup_one_len_unlocked(String name, Ptr<runtime.dentry> base, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_one_positive_unlocked($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.dentry> lookup_one_positive_unlocked(Ptr<MntDefinitions.mnt_idmap> idmap, String name, Ptr<runtime.dentry> base, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_one_qstr_excl((const struct qstr*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.dentry> lookup_one_qstr_excl(Ptr<runtime.qstr> name, Ptr<runtime.dentry> base, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_one_unlocked($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.dentry> lookup_one_unlocked(Ptr<MntDefinitions.mnt_idmap> idmap, String name, Ptr<runtime.dentry> base, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PmdDefinitions.pmd_t> lookup_pmd_address(@Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_positive_unlocked((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.dentry> lookup_positive_unlocked(String name, Ptr<runtime.dentry> base, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> lookup_resource(Ptr<runtime.resource> root, @Unsigned @OriginalName(value="resource_size_t") long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.sem_undo> lookup_undo(Ptr<misc.sem_undo_list> ulp, int semid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> lookup_user_key(@OriginalName(value="key_serial_t") int id, @Unsigned long lflags, KeyDefinitions.key_need_perm need_perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_user_key_possessed((const struct key*)$arg1, (const struct key_match_data*)$arg2)")
    public static boolean lookup_user_key_possessed(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_match_data> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__lookup_profile($arg1, (const u8*)$arg2)")
    public static Ptr<AaDefinitions.aa_profile> __lookup_profile(Ptr<AaDefinitions.aa_policy> base, String hname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_constant((const struct constant_table*)$arg1, (const u8*)$arg2, $arg3)")
    public static int lookup_constant(Ptr<misc.constant_table> tbl, String name, int not_found) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> lookup_fdget_rcu(@Unsigned int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kioctx> lookup_ioctx(@Unsigned long ctx_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static PageDefinitions.page_cache_mode lookup_memtype(@Unsigned long paddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_subflow_by_saddr((const struct list_head*)$arg1, (const struct mptcp_addr_info*)$arg2)")
    public static boolean lookup_subflow_by_saddr(Ptr<ListDefinitions.list_head> list, Ptr<MptcpDefinitions.mptcp_addr_info> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lookup_template_desc((const u8*)$arg1)")
    public static Ptr<ImaDefinitions.ima_template_desc> lookup_template_desc(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct lookup_args")
    @NotUsableInJava
    public static class lookup_args
    extends Struct {
        public int offset;
        public Ptr<In6Definitions.in6_addr> addr;
    }
}

