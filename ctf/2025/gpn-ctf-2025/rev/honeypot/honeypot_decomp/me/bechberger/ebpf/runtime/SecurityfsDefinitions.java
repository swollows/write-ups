/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.InodeDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class SecurityfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="securityfs_create_dentry((const u8*)$arg1, $arg2, $arg3, $arg4, (const struct file_operations*)$arg5, (const struct inode_operations*)$arg6)")
    public static Ptr<runtime.dentry> securityfs_create_dentry(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<?> data, Ptr<FileDefinitions.file_operations> fops, Ptr<InodeDefinitions.inode_operations> iops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="securityfs_create_dir((const u8*)$arg1, $arg2)")
    public static Ptr<runtime.dentry> securityfs_create_dir(String name, Ptr<runtime.dentry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="securityfs_create_file((const u8*)$arg1, $arg2, $arg3, $arg4, (const struct file_operations*)$arg5)")
    public static Ptr<runtime.dentry> securityfs_create_file(String name, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.dentry> parent, Ptr<?> data, Ptr<FileDefinitions.file_operations> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="securityfs_create_symlink((const u8*)$arg1, $arg2, (const u8*)$arg3, (const struct inode_operations*)$arg4)")
    public static Ptr<runtime.dentry> securityfs_create_symlink(String name, Ptr<runtime.dentry> parent, String target, Ptr<InodeDefinitions.inode_operations> iops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int securityfs_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void securityfs_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int securityfs_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int securityfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int securityfs_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void securityfs_recursive_remove(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void securityfs_remove(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

