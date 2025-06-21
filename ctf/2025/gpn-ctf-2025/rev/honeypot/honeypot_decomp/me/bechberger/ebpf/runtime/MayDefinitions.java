/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class MayDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="may_change_ptraced_domain((const struct cred*)$arg1, $arg2, (const u8**)$arg3)")
    public static int may_change_ptraced_domain(Ptr<runtime.cred> to_cred, Ptr<AaDefinitions.aa_label> to_label, Ptr<String> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean may_mount() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int may_umount(Ptr<runtime.vfsmount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int may_umount_tree(Ptr<runtime.vfsmount> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="may_context_mount_inode_relabel($arg1, $arg2, (const struct cred*)$arg3)")
    public static int may_context_mount_inode_relabel(@Unsigned int sid, Ptr<misc.superblock_security_struct> sbsec, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int may_delete(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> victim, boolean isdir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean may_enter_fs(Ptr<runtime.folio> folio2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int may_link(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, int kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="may_linkat($arg1, (const struct path*)$arg2)")
    public static int may_linkat(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="may_open($arg1, (const struct path*)$arg2, $arg3, $arg4)")
    public static int may_open(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, int acc_mode, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="may_open_dev((const struct path*)$arg1)")
    public static boolean may_open_dev(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int may_rename(Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int may_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, @Unsigned int ia_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean may_setgroups() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="may_access_direct_pkt_data($arg1, (const struct bpf_call_arg_meta*)$arg2, $arg3)")
    public static boolean may_access_direct_pkt_data(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_call_arg_meta> meta, BpfDefinitions.bpf_access_type t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean may_expand_vm(Ptr<MmDefinitions.mm_struct> mm, @Unsigned @OriginalName(value="vm_flags_t") long flags, @Unsigned long npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean may_update_sockmap(Ptr<BpfDefinitions.bpf_verifier_env> env, int func_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int may_write_xattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

