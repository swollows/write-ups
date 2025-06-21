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
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RamfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ramfs_create(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ramfs_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ramfs_free_fc(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ramfs_get_inode($arg1, (const struct inode*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.inode> ramfs_get_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> dir, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ramfs_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ramfs_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ramfs_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ramfs_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ramfs_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ramfs_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ramfs_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ramfs_symlink($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int ramfs_symlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String symname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ramfs_tmpfile(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ramfs_mmu_get_unmapped_area(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum ramfs_param")
    public static enum ramfs_param implements Enum<ramfs_param>,
    TypedEnum<ramfs_param, Integer>
    {
        Opt_mode;

    }

    @Type(noCCodeGeneration=true, cType="struct ramfs_fs_info")
    @NotUsableInJava
    public static class ramfs_fs_info
    extends Struct {
        public ramfs_mount_opts mount_opts;
    }

    @Type(noCCodeGeneration=true, cType="struct ramfs_mount_opts")
    @NotUsableInJava
    public static class ramfs_mount_opts
    extends Struct {
        public @Unsigned @OriginalName(value="umode_t") short mode;
    }
}

