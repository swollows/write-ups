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
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DquotDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dquot_alloc_space(Ptr<runtime.inode> inode2, @OriginalName(value="qsize_t") long number, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dquot_drop(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dquot_free_space(Ptr<runtime.inode> inode2, @OriginalName(value="qsize_t") long number, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dquot_initialize(Ptr<runtime.inode> inode2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dquot_transfer(Ptr<runtime.inode> inode2, Ptr<Ptr<runtime.dquot>> transfer_to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_acquire(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_add_inodes(Ptr<runtime.dquot> dquot2, @OriginalName(value="qsize_t") long inodes, Ptr<dquot_warn> warn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_add_space(Ptr<runtime.dquot> dquot2, @OriginalName(value="qsize_t") long space, @OriginalName(value="qsize_t") long rsv_space, @Unsigned int flags, Ptr<dquot_warn> warn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dquot> dquot_alloc(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_alloc_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dquot_claim_space_nodirty(Ptr<runtime.inode> inode2, @OriginalName(value="qsize_t") long number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_commit(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_commit_info(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dquot_decr_inodes(Ptr<runtime.dquot> dquot2, @OriginalName(value="qsize_t") long number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dquot_decr_space(Ptr<runtime.dquot> dquot2, @OriginalName(value="qsize_t") long number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dquot_destroy(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_disable(Ptr<SuperDefinitions.super_block> sb, int type2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dquot_drop(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_file_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dquot_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_get_dqblk(Ptr<SuperDefinitions.super_block> sb, runtime.kqid qid, Ptr<misc.qc_dqblk> di) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_get_next_dqblk(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.kqid> qid, Ptr<misc.qc_dqblk> di) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_get_next_id(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.kqid> qid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_get_state(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.qc_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_initialize(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dquot_initialize_needed(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_load_quota_inode(Ptr<runtime.inode> inode2, int type2, int format_id, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_load_quota_sb(Ptr<SuperDefinitions.super_block> sb, int type2, int format_id, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_mark_dquot_dirty(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_quota_disable(Ptr<SuperDefinitions.super_block> sb, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_quota_enable(Ptr<SuperDefinitions.super_block> sb, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_quota_off(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dquot_quota_on($arg1, $arg2, $arg3, (const struct path*)$arg4)")
    public static int dquot_quota_on(Ptr<SuperDefinitions.super_block> sb, int type2, int format_id, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_quota_on_mount(Ptr<SuperDefinitions.super_block> sb, String qf_name, int format_id, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_quota_sync(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dquot_reclaim_space_nodirty(Ptr<runtime.inode> inode2, @OriginalName(value="qsize_t") long number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_release(Ptr<runtime.dquot> dquot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_resume(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dquot_scan_active($arg1, (int (*)(struct dquot*, long unsigned int))$arg2, $arg3)")
    public static int dquot_scan_active(Ptr<SuperDefinitions.super_block> sb, Ptr<?> fn, @Unsigned long priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_set_dqblk(Ptr<SuperDefinitions.super_block> sb, runtime.kqid qid, Ptr<misc.qc_dqblk> di) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_set_dqinfo(Ptr<SuperDefinitions.super_block> sb, int type2, Ptr<misc.qc_info> ii) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_transfer(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dquot_writeback_dquots(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dquot_warn")
    @NotUsableInJava
    public static class dquot_warn
    extends Struct {
        public Ptr<SuperDefinitions.super_block> w_sb;
        public runtime.kqid w_dq_id;
        public short w_type;
    }

    @Type(noCCodeGeneration=true, cType="struct dquot_operations")
    @NotUsableInJava
    public static class dquot_operations
    extends Struct {
        public Ptr<?> write_dquot;
        public Ptr<?> alloc_dquot;
        public Ptr<?> destroy_dquot;
        public Ptr<?> acquire_dquot;
        public Ptr<?> release_dquot;
        public Ptr<?> mark_dirty;
        public Ptr<?> write_info;
        public Ptr<?> get_reserved_space;
        public Ptr<?> get_projid;
        public Ptr<?> get_inode_usage;
        public Ptr<?> get_next_id;
    }
}

