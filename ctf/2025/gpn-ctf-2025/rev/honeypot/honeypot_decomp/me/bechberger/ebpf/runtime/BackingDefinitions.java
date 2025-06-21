/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BdiDefinitions;
import me.bechberger.ebpf.runtime.InodeDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BackingDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void backing_aio_complete_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int backing_aio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void backing_aio_put(Ptr<backing_aio> aio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void backing_aio_queue_completion(Ptr<runtime.kiocb> iocb2, long res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void backing_aio_rw_complete(Ptr<runtime.kiocb> iocb2, long res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int backing_file_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<backing_file_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="backing_file_open((const struct path*)$arg1, $arg2, (const struct path*)$arg3, (const struct cred*)$arg4)")
    public static Ptr<runtime.file> backing_file_open(Ptr<runtime.path> user_path, int flags, Ptr<runtime.path> real_path, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long backing_file_read_iter(Ptr<runtime.file> file2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<runtime.kiocb> iocb2, int flags, Ptr<backing_file_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long backing_file_splice_read(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags, Ptr<backing_file_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long backing_file_splice_write(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long len, @Unsigned int flags, Ptr<backing_file_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.path> backing_file_user_path(Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long backing_file_write_iter(Ptr<runtime.file> file2, Ptr<IovDefinitions.iov_iter> iter2, Ptr<runtime.kiocb> iocb2, int flags, Ptr<backing_file_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<InodeDefinitions.inode_security_struct> backing_inode_security(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="backing_tmpfile_open((const struct path*)$arg1, $arg2, (const struct path*)$arg3, $arg4, (const struct cred*)$arg5)")
    public static Ptr<runtime.file> backing_tmpfile_open(Ptr<runtime.path> user_path, int flags, Ptr<runtime.path> real_parentpath, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct backing_aio")
    @NotUsableInJava
    public static class backing_aio
    extends Struct {
        public runtime.kiocb iocb;
        public @OriginalName(value="refcount_t") misc.refcount_struct ref;
        public Ptr<runtime.kiocb> orig_iocb;
        public Ptr<?> end_write;
        public misc.work_struct work;
        public long res;
    }

    @Type(noCCodeGeneration=true, cType="struct backing_file_ctx")
    @NotUsableInJava
    public static class backing_file_ctx
    extends Struct {
        public Ptr<runtime.cred> cred;
        public Ptr<runtime.file> user_file;
        public Ptr<?> accessed;
        public Ptr<?> end_write;
    }

    @Type(noCCodeGeneration=true, cType="struct backing_file")
    @NotUsableInJava
    public static class backing_file
    extends Struct {
        public runtime.file file;
        public runtime.path user_path;
    }

    @Type(noCCodeGeneration=true, cType="struct backing_dev_info")
    @NotUsableInJava
    public static class backing_dev_info
    extends Struct {
        public @Unsigned long id;
        public RbDefinitions.rb_node rb_node;
        public ListDefinitions.list_head bdi_list;
        public @Unsigned long ra_pages;
        public @Unsigned long io_pages;
        public runtime.kref refcnt;
        public @Unsigned int capabilities;
        public @Unsigned int min_ratio;
        public @Unsigned int max_ratio;
        public @Unsigned int max_prop_frac;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t tot_write_bandwidth;
        public @Unsigned long last_bdp_sleep;
        public BdiDefinitions.bdi_writeback wb;
        public ListDefinitions.list_head wb_list;
        public runtime.xarray cgwb_tree;
        public runtime.mutex cgwb_release_mutex;
        public misc.rw_semaphore wb_switch_rwsem;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wb_waitq;
        public Ptr<runtime.device> dev;
        public char @Size(value=64) [] dev_name;
        public Ptr<runtime.device> owner;
        public TimerDefinitions.timer_list laptop_mode_wb_timer;
        public Ptr<runtime.dentry> debug_dir;
    }
}

