/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class DevptsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.pts_fs_info> devpts_acquire(Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devpts_fill_super(Ptr<SuperDefinitions.super_block> s2, Ptr<?> data, int silent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devpts_get_priv(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devpts_kill_index(Ptr<misc.pts_fs_info> fsi, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devpts_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.vfsmount> devpts_mntget(Ptr<runtime.file> filp, Ptr<misc.pts_fs_info> fsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devpts_mount($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<runtime.dentry> devpts_mount(Ptr<FileDefinitions.file_system_type> fs_type, int flags, String dev_name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devpts_new_index(Ptr<misc.pts_fs_info> fsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devpts_pty_kill(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> devpts_pty_new(Ptr<misc.pts_fs_info> fsi, int index2, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devpts_release(Ptr<misc.pts_fs_info> fsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devpts_remount(Ptr<SuperDefinitions.super_block> sb, Ptr<Integer> flags, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devpts_show_options(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }
}

