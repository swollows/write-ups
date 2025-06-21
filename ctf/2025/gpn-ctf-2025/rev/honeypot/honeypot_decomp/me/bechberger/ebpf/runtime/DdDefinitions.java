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
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.DeadlineDefinitions;
import me.bechberger.ebpf.runtime.ElevatorDefinitions;
import me.bechberger.ebpf.runtime.ElvDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> __dd_dispatch_request(Ptr<DeadlineDefinitions.deadline_data> dd, Ptr<dd_per_prio> per_prio, @Unsigned long latest_start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dd_async_depth_show(Ptr<?> data, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dd_bio_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.bio> bio2, @Unsigned int nr_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dd_depth_updated(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.request> dd_dispatch_request(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dd_exit_sched(Ptr<ElevatorDefinitions.elevator_queue> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dd_finish_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dd_has_work(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dd_init_hctx(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, @Unsigned int hctx_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dd_init_sched(Ptr<RequestDefinitions.request_queue> q, Ptr<ElevatorDefinitions.elevator_type> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dd_insert_requests(Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx, Ptr<ListDefinitions.list_head> list, @Unsigned @OriginalName(value="blk_insert_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dd_limit_depth(@Unsigned @OriginalName(value="blk_opf_t") int opf, Ptr<BlkDefinitions.blk_mq_alloc_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dd_merged_requests(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> req2, Ptr<runtime.request> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dd_owned_by_driver_show(Ptr<?> data, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dd_prepare_request(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dd_queued_show(Ptr<?> data, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dd_request_merge(Ptr<RequestDefinitions.request_queue> q, Ptr<Ptr<runtime.request>> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dd_request_merged(Ptr<RequestDefinitions.request_queue> q, Ptr<runtime.request> req2, ElvDefinitions.elv_merge type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dd_per_prio")
    @NotUsableInJava
    public static class dd_per_prio
    extends Struct {
        public ListDefinitions.list_head dispatch;
        public RbDefinitions.rb_root @Size(value=2) [] sort_list;
        public ListDefinitions.list_head @Size(value=2) [] fifo_list;
        public @Unsigned @OriginalName(value="sector_t") long @Size(value=2) [] latest_pos;
        public IoDefinitions.io_stats_per_prio stats;
    }

    @Type(noCCodeGeneration=true, cType="enum dd_prio")
    public static enum dd_prio implements Enum<dd_prio>,
    TypedEnum<dd_prio, Integer>
    {
        DD_RT_PRIO,
        DD_BE_PRIO,
        DD_IDLE_PRIO,
        DD_PRIO_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dd_data_dir")
    public static enum dd_data_dir implements Enum<dd_data_dir>,
    TypedEnum<dd_data_dir, Integer>
    {
        DD_READ,
        DD_WRITE;

    }
}

