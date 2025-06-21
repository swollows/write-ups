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
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.DDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.IccDefinitions;
import me.bechberger.ebpf.runtime.OpenDefinitions;
import me.bechberger.ebpf.runtime.TomoyoDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PathDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IccDefinitions.icc_path> path_find(Ptr<runtime.device> dev, Ptr<IccDefinitions.icc_node> src, Ptr<IccDefinitions.icc_node> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_is_mountpoint((const struct path*)$arg1)")
    public static boolean path_is_mountpoint(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_is_under((const struct path*)$arg1, (const struct path*)$arg2)")
    public static boolean path_is_under(Ptr<runtime.path> path1, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_mount((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int path_mount(String dev_name, Ptr<runtime.path> path2, String type_page, @Unsigned long flags, Ptr<?> data_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long path_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int path_umount(Ptr<runtime.path> path2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int path_from_stashed(Ptr<Ptr<runtime.dentry>> stashed, Ptr<runtime.vfsmount> mnt, Ptr<?> data, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_get((const struct path*)$arg1)")
    public static void path_get(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int path_lookupat(Ptr<runtime.nameidata> nd, @Unsigned int flags, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_openat($arg1, (const struct open_flags*)$arg2, $arg3)")
    public static Ptr<runtime.file> path_openat(Ptr<runtime.nameidata> nd, Ptr<OpenDefinitions.open_flags> op, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int path_parentat(Ptr<runtime.nameidata> nd, @Unsigned int flags, Ptr<runtime.path> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int path_pts(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_put((const struct path*)$arg1)")
    public static void path_put(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_noexec((const struct path*)$arg1)")
    public static boolean path_noexec(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static DDefinitions.d_walk_ret path_check_mount(Ptr<?> data, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_getxattr((const u8*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long path_getxattr(String pathname, String name, Ptr<?> value, @Unsigned long size, @Unsigned int lookup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_has_submounts((const struct path*)$arg1)")
    public static int path_has_submounts(Ptr<runtime.path> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_listxattr((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long path_listxattr(String pathname, String list, @Unsigned long size, @Unsigned int lookup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_name((const u8*)$arg1, (const struct cred*)$arg2, $arg3, (const struct path*)$arg4, $arg5, $arg6, (const u8**)$arg7, $arg8, $arg9)")
    public static int path_name(String op, Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_label> label, Ptr<runtime.path> path2, int flags, String buffer, Ptr<String> name, Ptr<path_cond> cond, @Unsigned int request2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_removexattr((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static int path_removexattr(String pathname, String name, @Unsigned int lookup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="path_setxattr((const u8*)$arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static int path_setxattr(String pathname, String name, Ptr<?> value, @Unsigned long size, int flags, @Unsigned int lookup_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct path_cond")
    @NotUsableInJava
    public static class path_cond
    extends Struct {
        public misc.kuid_t uid;
        public @Unsigned @OriginalName(value="umode_t") short mode;
    }

    @Type(noCCodeGeneration=true, cType="enum path_flags")
    public static enum path_flags implements Enum<path_flags>,
    TypedEnum<path_flags, Integer>
    {
        PATH_IS_DIR,
        PATH_CONNECT_PATH,
        PATH_CHROOT_REL,
        PATH_CHROOT_NSCONNECT,
        PATH_DELEGATE_DELETED,
        PATH_MEDIATE_DELETED;

    }

    @Type(noCCodeGeneration=true, cType="struct { const struct tomoyo_path_info*; long unsigned int number; u8 operation; }")
    @NotUsableInJava
    public static class path_number_of_param_of_tomoyo_request_info
    extends Struct {
        public Ptr<TomoyoDefinitions.tomoyo_path_info> filename;
        public @Unsigned long number;
        public char operation;
    }

    @Type(noCCodeGeneration=true, cType="struct { const struct tomoyo_path_info*; const struct tomoyo_path_info*; u8 operation; }")
    @NotUsableInJava
    public static class path_of_param_of_tomoyo_request_info
    extends Struct {
        public Ptr<TomoyoDefinitions.tomoyo_path_info> filename;
        public Ptr<TomoyoDefinitions.tomoyo_path_info> matched_path;
        public char operation;
    }
}

