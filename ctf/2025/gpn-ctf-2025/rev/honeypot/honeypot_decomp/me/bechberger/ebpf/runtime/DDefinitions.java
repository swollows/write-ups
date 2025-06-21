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
import me.bechberger.ebpf.runtime.DentryDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class DDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__d_path((const struct path*)$arg1, (const struct path*)$arg2, $arg3, $arg4)")
    public static String __d_path(Ptr<runtime.path> path2, Ptr<runtime.path> root, String buf, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_absolute_path((const struct path*)$arg1, $arg2, $arg3)")
    public static String d_absolute_path(Ptr<runtime.path> path2, String buf, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_path((const struct path*)$arg1, $arg2, $arg3)")
    public static String d_path(Ptr<runtime.path> path2, String buf, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ___d_drop(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __d_add(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__d_alloc($arg1, (const struct qstr*)$arg2)")
    public static Ptr<runtime.dentry> __d_alloc(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __d_drop(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __d_free(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __d_free_external(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __d_instantiate(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__d_lookup((const struct dentry*)$arg1, (const struct qstr*)$arg2)")
    public static Ptr<runtime.dentry> __d_lookup(Ptr<runtime.dentry> parent, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__d_lookup_rcu((const struct dentry*)$arg1, (const struct qstr*)$arg2, $arg3)")
    public static Ptr<runtime.dentry> __d_lookup_rcu(Ptr<runtime.dentry> parent, Ptr<runtime.qstr> name, Ptr<@Unsigned Integer> seqp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__d_lookup_rcu_op_compare((const struct dentry*)$arg1, (const struct qstr*)$arg2, $arg3)")
    public static Ptr<runtime.dentry> __d_lookup_rcu_op_compare(Ptr<runtime.dentry> parent, Ptr<runtime.qstr> name, Ptr<@Unsigned Integer> seqp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> __d_lookup_unhash(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __d_lookup_unhash_wake(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __d_move(Ptr<runtime.dentry> dentry2, Ptr<runtime.dentry> target, boolean exchange) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> __d_obtain_alias(Ptr<runtime.inode> inode2, boolean disconnected) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __d_rehash(Ptr<runtime.dentry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_add(Ptr<runtime.dentry> entry, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_add_ci(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_alloc($arg1, (const struct qstr*)$arg2)")
    public static Ptr<runtime.dentry> d_alloc(Ptr<runtime.dentry> parent, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_alloc_anon(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_alloc_cursor(Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_alloc_name($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.dentry> d_alloc_name(Ptr<runtime.dentry> parent, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_alloc_parallel($arg1, (const struct qstr*)$arg2, $arg3)")
    public static Ptr<runtime.dentry> d_alloc_parallel(Ptr<runtime.dentry> parent, Ptr<runtime.qstr> name, Ptr<@OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head> wq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_alloc_pseudo($arg1, (const struct qstr*)$arg2)")
    public static Ptr<runtime.dentry> d_alloc_pseudo(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_ancestor(Ptr<runtime.dentry> p1, Ptr<runtime.dentry> p2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_delete(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_drop(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_exact_alias(Ptr<runtime.dentry> entry, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_exchange(Ptr<runtime.dentry> dentry1, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_find_alias(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_find_alias_rcu(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_find_any_alias(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int d_flags_for_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_genocide(Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static d_walk_ret d_genocide_kill(Ptr<?> data, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_hash_and_lookup(Ptr<runtime.dentry> dir, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_instantiate(Ptr<runtime.dentry> entry, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_instantiate_new(Ptr<runtime.dentry> entry, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_invalidate(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_lookup((const struct dentry*)$arg1, (const struct qstr*)$arg2)")
    public static Ptr<runtime.dentry> d_lookup(Ptr<runtime.dentry> parent, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_lru_add(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_lru_del(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_make_root(Ptr<runtime.inode> root_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_mark_dontcache(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_mark_tmpfile(Ptr<runtime.file> file2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_move(Ptr<runtime.dentry> dentry2, Ptr<runtime.dentry> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_namespace_path((const struct path*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static int d_namespace_path(Ptr<runtime.path> path2, String buf, Ptr<String> name, int flags, String disconnected) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_obtain_alias(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_obtain_root(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ino_t") long d_parent_ino(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_prune_aliases(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_rehash(Ptr<runtime.dentry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_same_name((const struct dentry*)$arg1, (const struct dentry*)$arg2, (const struct qstr*)$arg3)")
    public static boolean d_same_name(Ptr<runtime.dentry> dentry2, Ptr<runtime.dentry> parent, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_set_d_op($arg1, (const struct dentry_operations*)$arg2)")
    public static void d_set_d_op(Ptr<runtime.dentry> dentry2, Ptr<DentryDefinitions.dentry_operations> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int d_set_mounted(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> d_splice_alias(Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void d_tmpfile(Ptr<runtime.file> file2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="d_walk($arg1, $arg2, (enum d_walk_ret (*)(void*, struct dentry*))$arg3)")
    public static void d_walk(Ptr<runtime.dentry> parent, Ptr<?> data, Ptr<?> enter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct d_partition")
    @NotUsableInJava
    public static class d_partition
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int p_res;
        public char p_fstype;
        public char @Size(value=3) [] p_res2;
        public @Unsigned @OriginalName(value="__le32") int p_offset;
        public @Unsigned @OriginalName(value="__le32") int p_size;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int unit_pages; }")
    @NotUsableInJava
    public static class d_of_anon_member_of_memory_group
    extends Struct {
        public @Unsigned long unit_pages;
    }

    @Type(noCCodeGeneration=true, cType="enum d_walk_ret")
    public static enum d_walk_ret implements Enum<d_walk_ret>,
    TypedEnum<d_walk_ret, Integer>
    {
        D_WALK_CONTINUE,
        D_WALK_QUIT,
        D_WALK_NORETRY,
        D_WALK_SKIP;

    }

    @Type(noCCodeGeneration=true, cType="enum d_real_type")
    public static enum d_real_type implements Enum<d_real_type>,
    TypedEnum<d_real_type, Integer>
    {
        D_REAL_DATA,
        D_REAL_METADATA;

    }

    @Type(noCCodeGeneration=true, cType="union { struct hlist_node d_alias; struct hlist_bl_node d_in_lookup_hash; struct callback_head d_rcu; }")
    @NotUsableInJava
    public static class d_u_of_dentry
    extends Union {
        public misc.hlist_node d_alias;
        public misc.hlist_bl_node d_in_lookup_hash;
        public misc.callback_head d_rcu;
    }
}

