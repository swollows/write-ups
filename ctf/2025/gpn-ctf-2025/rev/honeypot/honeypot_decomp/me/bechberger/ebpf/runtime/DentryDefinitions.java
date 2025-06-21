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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LruDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DentryDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__dentry_path((const struct dentry*)$arg1, $arg2)")
    public static String __dentry_path(Ptr<runtime.dentry> d, Ptr<misc.prepend_buffer> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dentry_create((const struct path*)$arg1, $arg2, $arg3, (const struct cred*)$arg4)")
    public static Ptr<runtime.file> dentry_create(Ptr<runtime.path> path2, int flags, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dentry_name($arg1, $arg2, (const struct dentry*)$arg3, $arg4, (const u8*)$arg5)")
    public static String dentry_name(String buf, String end, Ptr<runtime.dentry> d, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dentry_open((const struct path*)$arg1, $arg2, (const struct cred*)$arg3)")
    public static Ptr<runtime.file> dentry_open(Ptr<runtime.path> path2, int flags, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dentry_path((const struct dentry*)$arg1, $arg2, $arg3)")
    public static String dentry_path(Ptr<runtime.dentry> dentry2, String buf, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dentry_path_raw((const struct dentry*)$arg1, $arg2, $arg3)")
    public static String dentry_path_raw(Ptr<runtime.dentry> dentry2, String buf, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dentry_needs_remove_privs(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> __dentry_kill(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dentry_free(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static LruDefinitions.lru_status dentry_lru_isolate(Ptr<ListDefinitions.list_head> item, Ptr<ListDefinitions.list_lru_one> lru, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lru_lock, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static LruDefinitions.lru_status dentry_lru_isolate_shrink(Ptr<ListDefinitions.list_head> item, Ptr<ListDefinitions.list_lru_one> lru, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lru_lock, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dentry_unlink_inode(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dentry_info_args")
    @NotUsableInJava
    public static class dentry_info_args
    extends Struct {
        public int parent_ino;
        public int dname_len;
        public int ino;
        public int inode_len;
        public String dname;
    }

    @Type(noCCodeGeneration=true, cType="struct dentry_stat_t")
    @NotUsableInJava
    public static class dentry_stat_t
    extends Struct {
        public long nr_dentry;
        public long nr_unused;
        public long age_limit;
        public long want_pages;
        public long nr_negative;
        public long dummy;
    }

    @Type(noCCodeGeneration=true, cType="enum dentry_d_lock_class")
    public static enum dentry_d_lock_class implements Enum<dentry_d_lock_class>,
    TypedEnum<dentry_d_lock_class, Integer>
    {
        DENTRY_D_LOCK_NORMAL,
        DENTRY_D_LOCK_NESTED;

    }

    @Type(noCCodeGeneration=true, cType="struct dentry_operations")
    @NotUsableInJava
    public static class dentry_operations
    extends Struct {
        public Ptr<?> d_revalidate;
        public Ptr<?> d_weak_revalidate;
        public Ptr<?> d_hash;
        public Ptr<?> d_compare;
        public Ptr<?> d_delete;
        public Ptr<?> d_init;
        public Ptr<?> d_release;
        public Ptr<?> d_prune;
        public Ptr<?> d_iput;
        public Ptr<?> d_dname;
        public Ptr<?> d_automount;
        public Ptr<?> d_manage;
        public Ptr<?> d_real;
    }
}

