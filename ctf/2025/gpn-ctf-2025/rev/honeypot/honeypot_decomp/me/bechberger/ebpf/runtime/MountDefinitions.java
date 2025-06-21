/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TomoyoDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MountDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mount_setattr_prepare(Ptr<mount_kattr> kattr, Ptr<runtime.mount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mount_subtree($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.dentry> mount_subtree(Ptr<runtime.vfsmount> m, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mount_too_revealing((const struct super_block*)$arg1, $arg2)")
    public static boolean mount_too_revealing(Ptr<SuperDefinitions.super_block> sb, Ptr<Integer> new_mnt_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mount_nodev_root(String root_device_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mount_root(String root_device_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mount_root_generic(String name, String pretty_name, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.vfsmount> mount_one_hugetlbfs(Ptr<runtime.hstate> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mount_bdev($arg1, $arg2, (const u8*)$arg3, $arg4, (int (*)(struct super_block*, void*, int))$arg5)")
    public static Ptr<runtime.dentry> mount_bdev(Ptr<FileDefinitions.file_system_type> fs_type, int flags, String dev_name, Ptr<?> data, Ptr<?> fill_super) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mount_capable(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mount_nodev($arg1, $arg2, $arg3, (int (*)(struct super_block*, void*, int))$arg4)")
    public static Ptr<runtime.dentry> mount_nodev(Ptr<FileDefinitions.file_system_type> fs_type, int flags, Ptr<?> data, Ptr<?> fill_super) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mount_param(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mount_single($arg1, $arg2, $arg3, (int (*)(struct super_block*, void*, int))$arg4)")
    public static Ptr<runtime.dentry> mount_single(Ptr<FileDefinitions.file_system_type> fs_type, int flags, Ptr<?> data, Ptr<?> fill_super) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mount_opts")
    @NotUsableInJava
    public static class mount_opts
    extends Struct {
        public int token;
        public int mount_opt;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct mount_kattr")
    @NotUsableInJava
    public static class mount_kattr
    extends Struct {
        public @Unsigned int attr_set;
        public @Unsigned int attr_clr;
        public @Unsigned int propagation;
        public @Unsigned int lookup_flags;
        public boolean recurse;
        public Ptr<UserDefinitions.user_namespace> mnt_userns;
        public Ptr<MntDefinitions.mnt_idmap> mnt_idmap;
    }

    @Type(noCCodeGeneration=true, cType="struct mount_attr")
    @NotUsableInJava
    public static class mount_attr
    extends Struct {
        public @Unsigned long attr_set;
        public @Unsigned long attr_clr;
        public @Unsigned long propagation;
        public @Unsigned long userns_fd;
    }

    @Type(noCCodeGeneration=true, cType="struct { const struct tomoyo_path_info*; const struct tomoyo_path_info*; const struct tomoyo_path_info*; long unsigned int flags; int need_dev; }")
    @NotUsableInJava
    public static class mount_of_param_of_tomoyo_request_info
    extends Struct {
        public Ptr<TomoyoDefinitions.tomoyo_path_info> type;
        public Ptr<TomoyoDefinitions.tomoyo_path_info> dir;
        public Ptr<TomoyoDefinitions.tomoyo_path_info> dev;
        public @Unsigned long flags;
        public int need_dev;
    }
}

