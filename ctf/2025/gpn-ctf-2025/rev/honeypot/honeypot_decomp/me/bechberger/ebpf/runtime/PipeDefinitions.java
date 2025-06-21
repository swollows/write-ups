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
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SpliceDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WatchDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PipeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pipe_clear_nowait(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pipe_to_user(Ptr<pipe_inode_info> pipe2, Ptr<pipe_buffer> buf, Ptr<SpliceDefinitions.splice_desc> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pipe_to_null(Ptr<pipe_inode_info> info2, Ptr<pipe_buffer> buf, Ptr<SpliceDefinitions.splice_desc> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pipe_double_lock(Ptr<pipe_inode_info> pipe1, Ptr<pipe_inode_info> pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pipe_fasync(int fd2, Ptr<runtime.file> filp, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pipe_fcntl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pipe_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pipe_is_unprivileged_user() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pipe_lock(Ptr<pipe_inode_info> pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int pipe_poll(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pipe_read(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pipe_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pipe_resize_ring(Ptr<pipe_inode_info> pipe2, @Unsigned int nr_slots) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pipe_to_sg(Ptr<pipe_inode_info> pipe2, Ptr<pipe_buffer> buf, Ptr<SpliceDefinitions.splice_desc> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pipe_unlock(Ptr<pipe_inode_info> pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pipe_wait_readable(Ptr<pipe_inode_info> pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pipe_wait_writable(Ptr<pipe_inode_info> pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pipe_write(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pipe_wait")
    @NotUsableInJava
    public static class pipe_wait
    extends Struct {
        public Ptr<TraceDefinitions.trace_iterator> iter;
        public int wait_index;
    }

    @Type(noCCodeGeneration=true, cType="struct pipe_buf_operations")
    @NotUsableInJava
    public static class pipe_buf_operations
    extends Struct {
        public Ptr<?> confirm;
        public Ptr<?> release;
        public Ptr<?> try_steal;
        public Ptr<?> get;
    }

    @Type(noCCodeGeneration=true, cType="struct pipe_buffer")
    @NotUsableInJava
    public static class pipe_buffer
    extends Struct {
        public Ptr<runtime.page> page;
        public @Unsigned int offset;
        public @Unsigned int len;
        public Ptr<pipe_buf_operations> ops;
        public @Unsigned int flags;
        public @Unsigned long _private;
    }

    @Type(noCCodeGeneration=true, cType="struct pipe_inode_info")
    @NotUsableInJava
    public static class pipe_inode_info
    extends Struct {
        public runtime.mutex mutex;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head rd_wait;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wr_wait;
        public @Unsigned int head;
        public @Unsigned int tail;
        public @Unsigned int max_usage;
        public @Unsigned int ring_size;
        public @Unsigned int nr_accounted;
        public @Unsigned int readers;
        public @Unsigned int writers;
        public @Unsigned int files;
        public @Unsigned int r_counter;
        public @Unsigned int w_counter;
        public boolean poll_usage;
        public boolean note_loss;
        public Ptr<runtime.page> tmp_page;
        public Ptr<misc.fasync_struct> fasync_readers;
        public Ptr<misc.fasync_struct> fasync_writers;
        public Ptr<pipe_buffer> bufs;
        public Ptr<UserDefinitions.user_struct> user;
        public Ptr<WatchDefinitions.watch_queue> watch_queue;
    }
}

