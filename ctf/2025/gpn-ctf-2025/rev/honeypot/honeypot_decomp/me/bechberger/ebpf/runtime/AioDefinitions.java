/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.EventfdDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aio_complete(Ptr<aio_kiocb> iocb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aio_complete_rw(Ptr<runtime.kiocb> kiocb2, long res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aio_free_ring(Ptr<runtime.kioctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aio_fsync($arg1, (const struct iocb*)$arg2, $arg3)")
    public static int aio_fsync(Ptr<misc.fsync_iocb> req2, Ptr<runtime.iocb> iocb2, boolean datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aio_fsync_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aio_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aio_migrate_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> dst, Ptr<runtime.folio> src, MigrateDefinitions.migrate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aio_poll($arg1, (const struct iocb*)$arg2)")
    public static int aio_poll(Ptr<aio_kiocb> aiocb, Ptr<runtime.iocb> iocb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aio_poll_cancel(Ptr<runtime.kiocb> iocb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aio_poll_complete_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aio_poll_put_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aio_poll_queue_proc(Ptr<runtime.file> file2, Ptr<WaitDefinitions.wait_queue_head> head, Ptr<PollDefinitions.poll_table_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aio_poll_wake(Ptr<WaitDefinitions.wait_queue_entry> wait, @Unsigned int mode, int sync2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aio_prep_rw($arg1, (const struct iocb*)$arg2, $arg3)")
    public static int aio_prep_rw(Ptr<runtime.kiocb> req2, Ptr<runtime.iocb> iocb2, int rw_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aio_read($arg1, (const struct iocb*)$arg2, $arg3, $arg4)")
    public static int aio_read(Ptr<runtime.kiocb> req2, Ptr<runtime.iocb> iocb2, boolean vectored, boolean compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long aio_read_events_ring(Ptr<runtime.kioctx> ctx, Ptr<IoDefinitions.io_event> event2, long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aio_ring_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aio_ring_mremap(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aio_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aio_setup_ring(Ptr<runtime.kioctx> ctx, @Unsigned int nr_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aio_write($arg1, (const struct iocb*)$arg2, $arg3, $arg4)")
    public static int aio_write(Ptr<runtime.kiocb> req2, Ptr<runtime.iocb> iocb2, boolean vectored, boolean compat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct __aio_sigset")
    @NotUsableInJava
    public static class __aio_sigset
    extends Struct {
        public Ptr<misc.sigset_t> sigmask;
        public @Unsigned long sigsetsize;
    }

    @Type(noCCodeGeneration=true, cType="struct aio_poll_table")
    @NotUsableInJava
    public static class aio_poll_table
    extends Struct {
        public PollDefinitions.poll_table_struct pt;
        public Ptr<aio_kiocb> iocb;
        public boolean queued;
        public int error;
    }

    @Type(noCCodeGeneration=true, cType="struct aio_waiter")
    @NotUsableInJava
    public static class aio_waiter
    extends Struct {
        public WaitDefinitions.wait_queue_entry w;
        public @Unsigned long min_nr;
    }

    @Type(noCCodeGeneration=true, cType="struct aio_kiocb")
    @NotUsableInJava
    public static class aio_kiocb
    extends Struct {
        @InlineUnion(value=91539)
        public @InlineUnion(value=91539) Ptr<runtime.file> ki_filp;
        @InlineUnion(value=91539)
        public  @InlineUnion(value=91539) runtime.kiocb rw;
        @InlineUnion(value=91539)
        public @InlineUnion(value=91539) misc.fsync_iocb fsync;
        @InlineUnion(value=91539)
        public @InlineUnion(value=91539) PollDefinitions.poll_iocb poll;
        public Ptr<runtime.kioctx> ki_ctx;
        public Ptr<?> ki_cancel;
        public IoDefinitions.io_event ki_res;
        public ListDefinitions.list_head ki_list;
        public @OriginalName(value="refcount_t") misc.refcount_struct ki_refcnt;
        public Ptr<EventfdDefinitions.eventfd_ctx> ki_eventfd;
    }

    @Type(noCCodeGeneration=true, cType="struct aio_ring")
    @NotUsableInJava
    public static class aio_ring
    extends Struct {
        public @Unsigned int id;
        public @Unsigned int nr;
        public @Unsigned int head;
        public @Unsigned int tail;
        public @Unsigned int magic;
        public @Unsigned int compat_features;
        public @Unsigned int incompat_features;
        public @Unsigned int header_length;
        public IoDefinitions.io_event @Size(value=0) [] io_events;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct work_struct work; }")
    @NotUsableInJava
    public static class aio_of_anon_member_of_iomap_dio
    extends Struct {
        public misc.work_struct work;
    }
}

