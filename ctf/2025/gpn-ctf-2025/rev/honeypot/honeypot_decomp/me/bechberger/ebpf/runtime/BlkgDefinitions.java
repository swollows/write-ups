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
import me.bechberger.ebpf.runtime.BlkcgDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class BlkgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __blkg_prfill_u64(Ptr<SeqDefinitions.seq_file> sf, Ptr<blkg_policy_data> pd, @Unsigned long v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __blkg_release(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlkcgDefinitions.blkcg_gq> blkg_alloc(Ptr<runtime.blkcg> blkcg2, Ptr<runtime.gendisk> disk, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkg_async_bio_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkg_conf_exit(Ptr<blkg_conf_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkg_conf_init(Ptr<blkg_conf_ctx> ctx, String input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkg_conf_open_bdev(Ptr<blkg_conf_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blkg_conf_prep($arg1, (const struct blkcg_policy*)$arg2, $arg3)")
    public static int blkg_conf_prep(Ptr<runtime.blkcg> blkcg2, Ptr<BlkcgDefinitions.blkcg_policy> pol, Ptr<blkg_conf_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlkcgDefinitions.blkcg_gq> blkg_create(Ptr<runtime.blkcg> blkcg2, Ptr<runtime.gendisk> disk, Ptr<BlkcgDefinitions.blkcg_gq> new_blkg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkg_destroy(Ptr<BlkcgDefinitions.blkcg_gq> blkg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)blkg_dev_name($arg1))")
    public static String blkg_dev_name(Ptr<BlkcgDefinitions.blkcg_gq> blkg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkg_free_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkg_init_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkg_release(Ptr<PercpuDefinitions.percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__blkg_prfill_rwstat($arg1, $arg2, (const struct blkg_rwstat_sample*)$arg3)")
    public static @Unsigned long __blkg_prfill_rwstat(Ptr<SeqDefinitions.seq_file> sf, Ptr<blkg_policy_data> pd, Ptr<blkg_rwstat_sample> rwstat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long blkg_prfill_rwstat(Ptr<SeqDefinitions.seq_file> sf, Ptr<blkg_policy_data> pd, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkg_rwstat_exit(Ptr<blkg_rwstat> rwstat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkg_rwstat_init(Ptr<blkg_rwstat> rwstat, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkg_rwstat_recursive_sum(Ptr<BlkcgDefinitions.blkcg_gq> blkg, Ptr<BlkcgDefinitions.blkcg_policy> pol, int off, Ptr<blkg_rwstat_sample> sum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct blkg_conf_ctx")
    @NotUsableInJava
    public static class blkg_conf_ctx
    extends Struct {
        public String input;
        public String body;
        public Ptr<BlockDefinitions.block_device> bdev;
        public Ptr<BlkcgDefinitions.blkcg_gq> blkg;
    }

    @Type(noCCodeGeneration=true, cType="struct blkg_rwstat_sample")
    @NotUsableInJava
    public static class blkg_rwstat_sample
    extends Struct {
        public @Unsigned long @Size(value=5) [] cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct blkg_rwstat")
    @NotUsableInJava
    public static class blkg_rwstat
    extends Struct {
        public PercpuDefinitions.percpu_counter @Size(value=5) [] cpu_cnt;
        public misc.atomic64_t @Size(value=5) [] aux_cnt;
    }

    @Type(noCCodeGeneration=true, cType="enum blkg_rwstat_type")
    public static enum blkg_rwstat_type implements Enum<blkg_rwstat_type>,
    TypedEnum<blkg_rwstat_type, Integer>
    {
        BLKG_RWSTAT_READ,
        BLKG_RWSTAT_WRITE,
        BLKG_RWSTAT_SYNC,
        BLKG_RWSTAT_ASYNC,
        BLKG_RWSTAT_DISCARD,
        BLKG_RWSTAT_NR,
        BLKG_RWSTAT_TOTAL;

    }

    @Type(noCCodeGeneration=true, cType="struct blkg_policy_data")
    @NotUsableInJava
    public static class blkg_policy_data
    extends Struct {
        public Ptr<BlkcgDefinitions.blkcg_gq> blkg;
        public int plid;
        public boolean online;
    }

    @Type(noCCodeGeneration=true, cType="struct blkg_iostat_set")
    @NotUsableInJava
    public static class blkg_iostat_set
    extends Struct {
        public misc.u64_stats_sync sync;
        public Ptr<BlkcgDefinitions.blkcg_gq> blkg;
        public misc.llist_node lnode;
        public int lqueued;
        public blkg_iostat cur;
        public blkg_iostat last;
    }

    @Type(noCCodeGeneration=true, cType="struct blkg_iostat")
    @NotUsableInJava
    public static class blkg_iostat
    extends Struct {
        public @Unsigned long @Size(value=3) [] bytes;
        public @Unsigned long @Size(value=3) [] ios;
    }

    @Type(noCCodeGeneration=true, cType="enum blkg_iostat_type")
    public static enum blkg_iostat_type implements Enum<blkg_iostat_type>,
    TypedEnum<blkg_iostat_type, Integer>
    {
        BLKG_IOSTAT_READ,
        BLKG_IOSTAT_WRITE,
        BLKG_IOSTAT_DISCARD,
        BLKG_IOSTAT_NR;

    }
}

