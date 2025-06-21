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
import me.bechberger.ebpf.runtime.BlkgDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IocgDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class IocDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_clear_queue(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IoDefinitions.io_cq> ioc_create_icq(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_destroy_icq(Ptr<IoDefinitions.io_cq> icq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IoDefinitions.io_cq> ioc_find_get_icq(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IoDefinitions.io_cq> ioc_lookup_icq(Ptr<RequestDefinitions.request_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_release_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioc_check_iocgs(Ptr<runtime.ioc> ioc2, Ptr<ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ioc_cost_model_prfill(Ptr<SeqDefinitions.seq_file> sf, Ptr<BlkgDefinitions.blkg_policy_data> pd, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioc_cost_model_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ioc_cost_model_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String input, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlkcgDefinitions.blkcg_policy_data> ioc_cpd_alloc(@Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_cpd_free(Ptr<BlkcgDefinitions.blkcg_policy_data> cpd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_forgive_debts(Ptr<runtime.ioc> ioc2, @Unsigned long usage_us_sum, int nr_debtors, Ptr<ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_lat_stat(Ptr<runtime.ioc> ioc2, Ptr<@Unsigned Integer> missed_ppm_ar, Ptr<@Unsigned Integer> rq_wait_pct_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlkgDefinitions.blkg_policy_data> ioc_pd_alloc(Ptr<runtime.gendisk> disk, Ptr<runtime.blkcg> blkcg2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_pd_free(Ptr<BlkgDefinitions.blkg_policy_data> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_pd_init(Ptr<BlkgDefinitions.blkg_policy_data> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_pd_stat(Ptr<BlkgDefinitions.blkg_policy_data> pd, Ptr<SeqDefinitions.seq_file> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ioc_qos_prfill(Ptr<SeqDefinitions.seq_file> sf, Ptr<BlkgDefinitions.blkg_policy_data> pd, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioc_qos_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ioc_qos_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String input, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ioc_refresh_params_disk(Ptr<runtime.ioc> ioc2, boolean force, Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_rqos_done(Ptr<RqDefinitions.rq_qos> rqos, Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_rqos_done_bio(Ptr<RqDefinitions.rq_qos> rqos, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_rqos_exit(Ptr<RqDefinitions.rq_qos> rqos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_rqos_merge(Ptr<RqDefinitions.rq_qos> rqos, Ptr<runtime.request> rq2, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_rqos_queue_depth_changed(Ptr<RqDefinitions.rq_qos> rqos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_rqos_throttle(Ptr<RqDefinitions.rq_qos> rqos, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_start_period(Ptr<runtime.ioc> ioc2, Ptr<ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ioc_timer_fn(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ioc_weight_prfill(Ptr<SeqDefinitions.seq_file> sf, Ptr<BlkgDefinitions.blkg_policy_data> pd, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioc_weight_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ioc_weight_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ioc_now")
    @NotUsableInJava
    public static class ioc_now
    extends Struct {
        public @Unsigned long now_ns;
        public @Unsigned long now;
        public @Unsigned long vnow;
    }

    @Type(noCCodeGeneration=true, cType="struct ioc_cgrp")
    @NotUsableInJava
    public static class ioc_cgrp
    extends Struct {
        public BlkcgDefinitions.blkcg_policy_data cpd;
        public @Unsigned int dfl_weight;
    }

    @Type(noCCodeGeneration=true, cType="struct ioc_gq")
    @NotUsableInJava
    public static class ioc_gq
    extends Struct {
        public BlkgDefinitions.blkg_policy_data pd;
        public Ptr<runtime.ioc> ioc;
        public @Unsigned int cfg_weight;
        public @Unsigned int weight;
        public @Unsigned int active;
        public @Unsigned int inuse;
        public @Unsigned int last_inuse;
        public long saved_margin;
        public @Unsigned @OriginalName(value="sector_t") long cursor;
        public misc.atomic64_t vtime;
        public misc.atomic64_t done_vtime;
        public @Unsigned long abs_vdebt;
        public @Unsigned long delay;
        public @Unsigned long delay_at;
        public misc.atomic64_t active_period;
        public ListDefinitions.list_head active_list;
        public @Unsigned long child_active_sum;
        public @Unsigned long child_inuse_sum;
        public @Unsigned long child_adjusted_sum;
        public int hweight_gen;
        public @Unsigned int hweight_active;
        public @Unsigned int hweight_inuse;
        public @Unsigned int hweight_donating;
        public @Unsigned int hweight_after_donation;
        public ListDefinitions.list_head walk_list;
        public ListDefinitions.list_head surplus_list;
        public WaitDefinitions.wait_queue_head waitq;
        public runtime.hrtimer waitq_timer;
        public @Unsigned long activated_at;
        public Ptr<IocgDefinitions.iocg_pcpu_stat> pcpu_stat;
        public IocgDefinitions.iocg_stat stat;
        public IocgDefinitions.iocg_stat last_stat;
        public @Unsigned long last_stat_abs_vusage;
        public @Unsigned long usage_delta_us;
        public @Unsigned long wait_since;
        public @Unsigned long indebt_since;
        public @Unsigned long indelay_since;
        public int level;
        public Ptr<ioc_gq> @Size(value=0) [] ancestors;
    }

    @Type(noCCodeGeneration=true, cType="struct ioc_pcpu_stat")
    @NotUsableInJava
    public static class ioc_pcpu_stat
    extends Struct {
        public ioc_missed @Size(value=2) [] missed;
        public misc.local64_t rq_wait_ns;
        public @Unsigned long last_rq_wait_ns;
    }

    @Type(noCCodeGeneration=true, cType="struct ioc_missed")
    @NotUsableInJava
    public static class ioc_missed
    extends Struct {
        public LocalDefinitions.local_t nr_met;
        public LocalDefinitions.local_t nr_missed;
        public @Unsigned int last_met;
        public @Unsigned int last_missed;
    }

    @Type(noCCodeGeneration=true, cType="struct ioc_margins")
    @NotUsableInJava
    public static class ioc_margins
    extends Struct {
        public long min;
        public long low;
        public long target;
    }

    @Type(noCCodeGeneration=true, cType="struct ioc_params")
    @NotUsableInJava
    public static class ioc_params
    extends Struct {
        public @Unsigned int @Size(value=6) [] qos;
        public @Unsigned long @Size(value=6) [] i_lcoefs;
        public @Unsigned long @Size(value=6) [] lcoefs;
        public @Unsigned int too_fast_vrate_pct;
        public @Unsigned int too_slow_vrate_pct;
    }

    @Type(noCCodeGeneration=true, cType="enum ioc_running")
    public static enum ioc_running implements Enum<ioc_running>,
    TypedEnum<ioc_running, Integer>
    {
        IOC_IDLE,
        IOC_RUNNING,
        IOC_STOP;

    }
}

