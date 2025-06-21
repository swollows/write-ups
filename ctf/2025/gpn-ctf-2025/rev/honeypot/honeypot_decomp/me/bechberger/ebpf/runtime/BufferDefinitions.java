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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.MigrateDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.SpliceDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BufferDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __buffer_migrate_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> dst, Ptr<runtime.folio> src, MigrateDefinitions.migrate_mode mode, boolean check_refs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int buffer_migrate_folio(Ptr<misc.address_space> mapping, Ptr<runtime.folio> dst, Ptr<runtime.folio> src, MigrateDefinitions.migrate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int buffer_migrate_folio_norefs(Ptr<misc.address_space> mapping, Ptr<runtime.folio> dst, Ptr<runtime.folio> src, MigrateDefinitions.migrate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long buffer_percent_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="buffer_percent_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long buffer_percent_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean buffer_pipe_buf_get(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void buffer_pipe_buf_release(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void buffer_ref_release(Ptr<buffer_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void buffer_spd_release(Ptr<SpliceDefinitions.splice_pipe_desc> spd, @Unsigned int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long buffer_subbuf_size_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="buffer_subbuf_size_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long buffer_subbuf_size_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void buffer_check_dirty_writeback(Ptr<runtime.folio> folio2, Ptr<@OriginalName(value="bool") Boolean> dirty, Ptr<@OriginalName(value="bool") Boolean> writeback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int buffer_exit_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void buffer_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct buffer_ref")
    @NotUsableInJava
    public static class buffer_ref
    extends Struct {
        public Ptr<TraceDefinitions.trace_buffer> buffer;
        public Ptr<?> page;
        public int cpu;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcount;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int type; unsigned int length; u8 *pointer; }")
    @NotUsableInJava
    public static class buffer_of_acpi_object
    extends Struct {
        public @Unsigned @OriginalName(value="acpi_object_type") int type;
        public @Unsigned int length;
        public Ptr<Character> pointer;
    }

    @Type(noCCodeGeneration=true, cType="struct buffer_head")
    @NotUsableInJava
    public static class buffer_head
    extends Struct {
        public @Unsigned long b_state;
        public Ptr<buffer_head> b_this_page;
        @InlineUnion(value=10368)
        public @InlineUnion(value=10368) Ptr<runtime.page> b_page;
        @InlineUnion(value=10368)
        public @InlineUnion(value=10368) Ptr<runtime.folio> b_folio;
        public @Unsigned @OriginalName(value="sector_t") long b_blocknr;
        public @Unsigned long b_size;
        public String b_data;
        public Ptr<BlockDefinitions.block_device> b_bdev;
        public Ptr<?> b_end_io;
        public Ptr<?> b_private;
        public ListDefinitions.list_head b_assoc_buffers;
        public Ptr<misc.address_space> b_assoc_map;
        public AtomicDefinitions.atomic_t b_count;
        public  @OriginalName(value="spinlock_t") runtime.spinlock b_uptodate_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct buffer_page")
    @NotUsableInJava
    public static class buffer_page
    extends Struct {
        public ListDefinitions.list_head list;
        public LocalDefinitions.local_t write;
        public @Unsigned int read;
        public LocalDefinitions.local_t entries;
        public @Unsigned long real_end;
        public @Unsigned int order;
        public @Unsigned int id;
        public @Unsigned int range;
        public Ptr<buffer_data_page> page;
    }

    @Type(noCCodeGeneration=true, cType="struct buffer_data_read_page")
    @NotUsableInJava
    public static class buffer_data_read_page
    extends Struct {
        public @Unsigned int order;
        public Ptr<buffer_data_page> data;
    }

    @Type(noCCodeGeneration=true, cType="struct buffer_data_page")
    @NotUsableInJava
    public static class buffer_data_page
    extends Struct {
        public @Unsigned long time_stamp;
        public LocalDefinitions.local_t commit;
        public char @Size(value=0) [] data;
    }
}

