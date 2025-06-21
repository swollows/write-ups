/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class IterDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int iter_div_u64_rem(@Unsigned long dividend, @Unsigned int divisor, Ptr<@Unsigned Long> remainder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iter_file_splice_write(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.file> out, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iter_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iter_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)iter_state_str($arg1))")
    public static String iter_state_str(BpfDefinitions.bpf_iter_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iter_to_pipe(Ptr<IovDefinitions.iov_iter> from, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)iter_type_str((const struct btf*)$arg1, $arg2))")
    public static String iter_type_str(Ptr<runtime.btf> btf2, @Unsigned int btf_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iter_xarray_populate_pages(Ptr<Ptr<runtime.page>> pages, Ptr<runtime.xarray> xa, @Unsigned long index2, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 spi; u8 frameno; }")
    @NotUsableInJava
    public static class iter_of_bpf_kfunc_call_arg_meta
    extends Struct {
        public char spi;
        public char frameno;
    }

    @Type(noCCodeGeneration=true, cType="enum iter_type")
    public static enum iter_type implements Enum<iter_type>,
    TypedEnum<iter_type, Integer>
    {
        ITER_UBUF,
        ITER_IOVEC,
        ITER_BVEC,
        ITER_KVEC,
        ITER_FOLIOQ,
        ITER_XARRAY,
        ITER_DISCARD;

    }

    @Type(noCCodeGeneration=true, cType="struct { struct btf *btf; unsigned int btf_id; enum bpf_iter_state state; int depth; }")
    @NotUsableInJava
    public static class iter_of_anon_member_of_bpf_reg_state
    extends Struct {
        public Ptr<runtime.btf> btf;
        public @Unsigned int btf_id;
        public BpfDefinitions.bpf_iter_state state;
        public int depth;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int target_name; unsigned int target_name_len; union { struct { unsigned int map_id; } map; }; union { struct { long long unsigned int cgroup_id; unsigned int order; } cgroup; struct { unsigned int tid; unsigned int pid; } task; }; }")
    @NotUsableInJava
    public static class iter_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned long target_name;
        public @Unsigned int target_name_len;
        @InlineUnion(value=3377)
        public  @InlineUnion(value=3377) MapDefinitions.map_of_anon_member_of_iter_of_anon_member_of_bpf_link_info_and_struct_ops_of_anon_member_of_bpf_link_info map;
        @InlineUnion(value=3380)
        public  @InlineUnion(value=3380) CgroupDefinitions.cgroup_of_anon_member_of_iter_of_anon_member_of_bpf_link_info cgroup;
        @InlineUnion(value=3380)
        public @InlineUnion(value=3380) TaskDefinitions.task_of_anon_member_of_iter_of_anon_member_of_bpf_link_info task;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int link_fd; unsigned int flags; }")
    @NotUsableInJava
    public static class iter_create_of_bpf_attr
    extends Struct {
        public @Unsigned int link_fd;
        public @Unsigned int flags;
    }
}

