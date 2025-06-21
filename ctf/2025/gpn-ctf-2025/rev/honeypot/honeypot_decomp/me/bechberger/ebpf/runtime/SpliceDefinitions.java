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
import me.bechberger.ebpf.runtime.BalanceDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SpliceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __splice_from_pipe(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<splice_desc> sd, Ptr<?> actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long splice_direct_to_actor(Ptr<runtime.file> in, Ptr<splice_desc> sd, Ptr<?> actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long splice_file_range(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> opos, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int splice_file_range_actor(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<splice_desc> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long splice_file_to_pipe(Ptr<runtime.file> in, Ptr<PipeDefinitions.pipe_inode_info> opipe, Ptr<@OriginalName(value="loff_t") Long> offset, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long splice_from_pipe(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long len, @Unsigned int flags, Ptr<?> actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int splice_from_pipe_next(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<splice_desc> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="splice_grow_spd((const struct pipe_inode_info*)$arg1, $arg2)")
    public static int splice_grow_spd(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<splice_pipe_desc> spd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int splice_pipe_to_pipe(Ptr<PipeDefinitions.pipe_inode_info> ipipe, Ptr<PipeDefinitions.pipe_inode_info> opipe, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void splice_shrink_spd(Ptr<splice_pipe_desc> spd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long splice_to_pipe(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<splice_pipe_desc> spd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long splice_to_socket(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long splice_write_null(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __splice_segment(Ptr<runtime.page> page2, @Unsigned int poff, @Unsigned int plen, Ptr<@Unsigned Integer> off, Ptr<@Unsigned Integer> len, Ptr<splice_pipe_desc> spd, boolean linear, Ptr<runtime.sock> sk, Ptr<PipeDefinitions.pipe_inode_info> pipe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BalanceDefinitions.balance_callback> splice_balance_callbacks(Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long splice_folio_into_pipe(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.folio> folio2, @OriginalName(value="loff_t") long fpos, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct splice_pipe_desc")
    @NotUsableInJava
    public static class splice_pipe_desc
    extends Struct {
        public Ptr<Ptr<runtime.page>> pages;
        public Ptr<misc.partial_page> partial;
        public int nr_pages;
        public @Unsigned int nr_pages_max;
        public Ptr<PipeDefinitions.pipe_buf_operations> ops;
        public Ptr<?> spd_release;
    }

    @Type(noCCodeGeneration=true, cType="struct splice_desc")
    @NotUsableInJava
    public static class splice_desc
    extends Struct {
        public @Unsigned long total_len;
        public @Unsigned int len;
        public @Unsigned int flags;
        public UDefinitions.u_of_splice_desc u;
        public Ptr<?> splice_eof;
        public @OriginalName(value="loff_t") long pos;
        public Ptr<@OriginalName(value="loff_t") Long> opos;
        public @Unsigned long num_spliced;
        public boolean need_wakeup;
    }
}

