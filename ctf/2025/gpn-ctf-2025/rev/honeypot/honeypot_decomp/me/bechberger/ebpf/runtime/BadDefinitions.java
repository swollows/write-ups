/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class BadDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn bad_chained_irq(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_file_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_atomic_open(Ptr<runtime.inode> inode2, Ptr<runtime.dentry> dentry2, Ptr<runtime.file> file2, @Unsigned int open_flag, @Unsigned @OriginalName(value="umode_t") short create_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_create(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_fiemap(Ptr<runtime.inode> inode2, Ptr<misc.fiemap_extent_info> fieinfo, @Unsigned long start, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> bad_inode_get_acl(Ptr<runtime.inode> inode2, int type2, boolean rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)bad_inode_get_link($arg1, $arg2, $arg3))")
    public static String bad_inode_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bad_inode_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int bad_inode_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bad_inode_listxattr(Ptr<runtime.dentry> dentry2, String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> bad_inode_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_readlink(Ptr<runtime.dentry> dentry2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_rename2(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<PosixDefinitions.posix_acl> acl, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> direntry, Ptr<runtime.iattr> attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bad_inode_symlink($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int bad_inode_symlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String symname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_tmpfile(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bad_inode_update_time(Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bad_srat() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bad_area(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code, @Unsigned long address, Ptr<MmDefinitions.mm_struct> mm, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned int pkey, int si_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bad_area_nosemaphore(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code, @Unsigned long address, @Unsigned int pkey, int si_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bad_area_access_error(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code, @Unsigned long address, Ptr<MmDefinitions.mm_struct> mm, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bad_area_nosemaphore(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bad_page($arg1, (const u8*)$arg2)")
    public static void bad_page(Ptr<runtime.page> page2, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }
}

