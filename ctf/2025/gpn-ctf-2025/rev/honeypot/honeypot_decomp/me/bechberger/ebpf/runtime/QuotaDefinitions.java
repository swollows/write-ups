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
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class QuotaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__quota_error($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4_)")
    public static void __quota_error(Ptr<SuperDefinitions.super_block> sb, String func, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void quota_release_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_getinfo(Ptr<SuperDefinitions.super_block> sb, int type2, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_getnextquota(Ptr<SuperDefinitions.super_block> sb, int type2, @Unsigned @OriginalName(value="qid_t") int id, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_getnextxquota(Ptr<SuperDefinitions.super_block> sb, int type2, @Unsigned @OriginalName(value="qid_t") int id, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_getquota(Ptr<SuperDefinitions.super_block> sb, int type2, @Unsigned @OriginalName(value="qid_t") int id, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_getstate(Ptr<SuperDefinitions.super_block> sb, int type2, Ptr<FsDefinitions.fs_quota_stat> fqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_getstatev(Ptr<SuperDefinitions.super_block> sb, int type2, Ptr<FsDefinitions.fs_quota_statv> fqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_getxquota(Ptr<SuperDefinitions.super_block> sb, int type2, @Unsigned @OriginalName(value="qid_t") int id, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_getxstate(Ptr<SuperDefinitions.super_block> sb, int type2, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_getxstatev(Ptr<SuperDefinitions.super_block> sb, int type2, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_setquota(Ptr<SuperDefinitions.super_block> sb, int type2, @Unsigned @OriginalName(value="qid_t") int id, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_setxquota(Ptr<SuperDefinitions.super_block> sb, int type2, @Unsigned @OriginalName(value="qid_t") int id, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_state_to_flags(Ptr<misc.qc_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void quota_sync_one(Ptr<SuperDefinitions.super_block> sb, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int quota_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="quota_send_warning($arg1, $arg2, (const u8)$arg3)")
    public static void quota_send_warning(runtime.kqid qid, @Unsigned @OriginalName(value="dev_t") int dev, char warntype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct quota_module_name")
    @NotUsableInJava
    public static class quota_module_name
    extends Struct {
        public int qm_fmt_id;
        public String qm_mod_name;
    }

    @Type(noCCodeGeneration=true, cType="struct quota_id")
    @NotUsableInJava
    public static class quota_id
    extends Struct {
        public RbDefinitions.rb_node node;
        public @Unsigned @OriginalName(value="qid_t") int id;
        public @OriginalName(value="qsize_t") long bhardlimit;
        public @OriginalName(value="qsize_t") long bsoftlimit;
        public @OriginalName(value="qsize_t") long ihardlimit;
        public @OriginalName(value="qsize_t") long isoftlimit;
    }

    @Type(noCCodeGeneration=true, cType="struct quota_info")
    @NotUsableInJava
    public static class quota_info
    extends Struct {
        public @Unsigned int flags;
        public misc.rw_semaphore dqio_sem;
        public Ptr<runtime.inode> @Size(value=3) [] files;
        public MemDefinitions.mem_dqinfo @Size(value=3) [] info;
        public Ptr<quota_format_ops> @Size(value=3) [] ops;
    }

    @Type(noCCodeGeneration=true, cType="struct quota_format_ops")
    @NotUsableInJava
    public static class quota_format_ops
    extends Struct {
        public Ptr<?> check_quota_file;
        public Ptr<?> read_file_info;
        public Ptr<?> write_file_info;
        public Ptr<?> free_file_info;
        public Ptr<?> read_dqblk;
        public Ptr<?> commit_dqblk;
        public Ptr<?> release_dqblk;
        public Ptr<?> get_next_id;
    }

    @Type(noCCodeGeneration=true, cType="struct quota_format_type")
    @NotUsableInJava
    public static class quota_format_type
    extends Struct {
        public int qf_fmt_id;
        public Ptr<quota_format_ops> qf_ops;
        public Ptr<runtime.module> qf_owner;
        public Ptr<quota_format_type> qf_next;
    }

    @Type(noCCodeGeneration=true, cType="enum quota_type")
    public static enum quota_type implements Enum<quota_type>,
    TypedEnum<quota_type, Integer>
    {
        USRQUOTA,
        GRPQUOTA,
        PRJQUOTA;

    }
}

