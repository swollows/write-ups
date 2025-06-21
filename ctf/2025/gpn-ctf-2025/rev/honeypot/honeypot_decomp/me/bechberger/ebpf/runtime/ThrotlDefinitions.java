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
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BlkgDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ThrotlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_add_bio_tg(Ptr<runtime.bio> bio2, Ptr<throtl_qnode> qn, Ptr<throtl_grp> tg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_charge_bio(Ptr<throtl_grp> tg, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_extend_slice(Ptr<throtl_grp> tg, boolean rw, @Unsigned long jiffy_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int throtl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlkgDefinitions.blkg_policy_data> throtl_pd_alloc(Ptr<runtime.gendisk> disk, Ptr<runtime.blkcg> blkcg2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_pd_free(Ptr<BlkgDefinitions.blkg_policy_data> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_pd_init(Ptr<BlkgDefinitions.blkg_policy_data> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_pd_online(Ptr<BlkgDefinitions.blkg_policy_data> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_pending_timer_fn(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.bio> throtl_pop_queued(Ptr<ListDefinitions.list_head> queued, Ptr<Ptr<throtl_grp>> tg_to_put) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_qnode_add_bio(Ptr<runtime.bio> bio2, Ptr<throtl_qnode> qn, Ptr<ListDefinitions.list_head> queued) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean throtl_schedule_next_dispatch(Ptr<throtl_service_queue> sq, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_schedule_pending_timer(Ptr<throtl_service_queue> sq, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_start_new_slice(Ptr<throtl_grp> tg, boolean rw, boolean clear_carryover) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_start_new_slice_with_credit(Ptr<throtl_grp> tg, boolean rw, @Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void throtl_trim_slice(Ptr<throtl_grp> tg, boolean rw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct throtl_service_queue")
    @NotUsableInJava
    public static class throtl_service_queue
    extends Struct {
        public Ptr<throtl_service_queue> parent_sq;
        public ListDefinitions.list_head @Size(value=2) [] queued;
        public @Unsigned int @Size(value=2) [] nr_queued;
        public RbDefinitions.rb_root_cached pending_tree;
        public @Unsigned int nr_pending;
        public @Unsigned long first_pending_disptime;
        public TimerDefinitions.timer_list pending_timer;
    }

    @Type(noCCodeGeneration=true, cType="struct throtl_grp")
    @NotUsableInJava
    public static class throtl_grp
    extends Struct {
        public BlkgDefinitions.blkg_policy_data pd;
        public RbDefinitions.rb_node rb_node;
        public Ptr<throtl_data> td;
        public throtl_service_queue service_queue;
        public throtl_qnode @Size(value=2) [] qnode_on_self;
        public throtl_qnode @Size(value=2) [] qnode_on_parent;
        public @Unsigned long disptime;
        public @Unsigned int flags;
        public boolean @Size(value=2) [] has_rules_bps;
        public boolean @Size(value=2) [] has_rules_iops;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=2) [] bps;
        public @Unsigned int @Size(value=2) [] iops;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=2) [] bytes_disp;
        public @Unsigned int @Size(value=2) [] io_disp;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=2) [] last_bytes_disp;
        public @Unsigned int @Size(value=2) [] last_io_disp;
        public long @Size(value=2) [] carryover_bytes;
        public int @Size(value=2) [] carryover_ios;
        public @Unsigned long last_check_time;
        public @Unsigned long @Size(value=2) [] slice_start;
        public @Unsigned long @Size(value=2) [] slice_end;
        public BlkgDefinitions.blkg_rwstat stat_bytes;
        public BlkgDefinitions.blkg_rwstat stat_ios;
    }

    @Type(noCCodeGeneration=true, cType="struct throtl_qnode")
    @NotUsableInJava
    public static class throtl_qnode
    extends Struct {
        public ListDefinitions.list_head node;
        public BioDefinitions.bio_list bios;
        public Ptr<throtl_grp> tg;
    }

    @Type(noCCodeGeneration=true, cType="struct throtl_data")
    @NotUsableInJava
    public static class throtl_data
    extends Struct {
        public throtl_service_queue service_queue;
        public Ptr<RequestDefinitions.request_queue> queue;
        public @Unsigned int @Size(value=2) [] nr_queued;
        public @Unsigned int throtl_slice;
        public misc.work_struct dispatch_work;
        public boolean track_bio_latency;
    }
}

