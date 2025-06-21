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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmaDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class UserfaultfdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_continue(Ptr<userfaultfd_ctx> ctx, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_copy(Ptr<userfaultfd_ctx> ctx, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void userfaultfd_ctx_put(Ptr<userfaultfd_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long userfaultfd_ctx_read(Ptr<userfaultfd_ctx> ctx, int no_wait, Ptr<misc.uffd_msg> msg, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long userfaultfd_dev_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void userfaultfd_event_wait_completion(Ptr<userfaultfd_ctx> ctx, Ptr<userfaultfd_wait_queue> ewq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long userfaultfd_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_move(Ptr<userfaultfd_ctx> ctx, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_poison(Ptr<userfaultfd_ctx> ctx, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int userfaultfd_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long userfaultfd_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_register(Ptr<userfaultfd_ctx> ctx, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean userfaultfd_remove(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void userfaultfd_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void userfaultfd_unmap_complete(Ptr<MmDefinitions.mm_struct> mm, Ptr<ListDefinitions.list_head> uf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_unmap_prep(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end, Ptr<ListDefinitions.list_head> unmaps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_unregister(Ptr<userfaultfd_ctx> ctx, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_wake_function(Ptr<@OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry> wq, @Unsigned int mode, int wake_flags, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean userfaultfd_wp_async(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean userfaultfd_wp_unpopulated(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_writeprotect(Ptr<userfaultfd_ctx> ctx, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_zeropage(Ptr<userfaultfd_ctx> ctx, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> userfaultfd_clear_vma(Ptr<VmaDefinitions.vma_iterator> vmi, Ptr<VmDefinitions.vm_area_struct> prev, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int userfaultfd_register_range(Ptr<userfaultfd_ctx> ctx, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long vm_flags, @Unsigned long start, @Unsigned long end, boolean wp_async) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void userfaultfd_release_all(Ptr<MmDefinitions.mm_struct> mm, Ptr<userfaultfd_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void userfaultfd_release_new(Ptr<userfaultfd_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void userfaultfd_reset_ctx(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void userfaultfd_set_ctx(Ptr<VmDefinitions.vm_area_struct> vma, Ptr<userfaultfd_ctx> ctx, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct userfaultfd_wake_range")
    @NotUsableInJava
    public static class userfaultfd_wake_range
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct userfaultfd_wait_queue")
    @NotUsableInJava
    public static class userfaultfd_wait_queue
    extends Struct {
        public misc.uffd_msg msg;
        public @OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry wq;
        public Ptr<userfaultfd_ctx> ctx;
        public boolean waken;
    }

    @Type(noCCodeGeneration=true, cType="struct userfaultfd_unmap_ctx")
    @NotUsableInJava
    public static class userfaultfd_unmap_ctx
    extends Struct {
        public Ptr<userfaultfd_ctx> ctx;
        public @Unsigned long start;
        public @Unsigned long end;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct userfaultfd_fork_ctx")
    @NotUsableInJava
    public static class userfaultfd_fork_ctx
    extends Struct {
        public Ptr<userfaultfd_ctx> orig;
        public Ptr<userfaultfd_ctx> _new;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct userfaultfd_ctx")
    @NotUsableInJava
    public static class userfaultfd_ctx
    extends Struct {
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head fault_pending_wqh;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head fault_wqh;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head fd_wqh;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head event_wqh;
        public @OriginalName(value="seqcount_spinlock_t") misc.seqcount_spinlock refile_seq;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public @Unsigned int flags;
        public @Unsigned int features;
        public boolean released;
        public misc.rw_semaphore map_changing_lock;
        public AtomicDefinitions.atomic_t mmap_changing;
        public Ptr<MmDefinitions.mm_struct> mm;
    }
}

