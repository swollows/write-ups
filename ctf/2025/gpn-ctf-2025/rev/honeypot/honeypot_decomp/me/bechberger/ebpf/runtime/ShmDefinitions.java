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
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ShmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __shm_close(Ptr<shm_file_data> sfd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __shm_open(Ptr<shm_file_data> sfd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shm_close(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shm_destroy(Ptr<IpcDefinitions.ipc_namespace> ns, Ptr<misc.shmid_kernel> shp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shm_destroy_orphaned(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shm_exit_ns(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long shm_fallocate(Ptr<runtime.file> file2, int mode, @OriginalName(value="loff_t") long offset, @OriginalName(value="loff_t") long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int shm_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shm_fsync(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mempolicy> shm_get_policy(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<@Unsigned Long> ilx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shm_get_unmapped_area(Ptr<runtime.file> file2, @Unsigned long addr2, @Unsigned long len, @Unsigned long pgoff, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shm_init_ns(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shm_may_split(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shm_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shm_more_checks(Ptr<misc.kern_ipc_perm> ipcp, Ptr<IpcDefinitions.ipc_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shm_open(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long shm_pagesize(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void shm_rcu_free(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shm_release(Ptr<runtime.inode> ino, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shm_set_policy(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<runtime.mempolicy> mpol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int shm_try_destroy_orphaned(int id, Ptr<?> p, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct shm_file_data")
    @NotUsableInJava
    public static class shm_file_data
    extends Struct {
        public int id;
        public Ptr<IpcDefinitions.ipc_namespace> ns;
        public Ptr<runtime.file> file;
        public Ptr<VmDefinitions.vm_operations_struct> vm_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct shm_info")
    @NotUsableInJava
    public static class shm_info
    extends Struct {
        public int used_ids;
        public @Unsigned @OriginalName(value="__kernel_ulong_t") long shm_tot;
        public @Unsigned @OriginalName(value="__kernel_ulong_t") long shm_rss;
        public @Unsigned @OriginalName(value="__kernel_ulong_t") long shm_swp;
        public @Unsigned @OriginalName(value="__kernel_ulong_t") long swap_attempts;
        public @Unsigned @OriginalName(value="__kernel_ulong_t") long swap_successes;
    }
}

