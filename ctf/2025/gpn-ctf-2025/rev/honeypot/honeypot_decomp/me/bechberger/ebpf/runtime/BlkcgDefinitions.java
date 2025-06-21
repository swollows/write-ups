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
import me.bechberger.ebpf.runtime.BioDefinitions;
import me.bechberger.ebpf.runtime.BlkgDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BlkcgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="blkcg_activate_policy($arg1, (const struct blkcg_policy*)$arg2)")
    public static int blkcg_activate_policy(Ptr<runtime.gendisk> disk, Ptr<blkcg_policy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_add_delay(Ptr<blkcg_gq> blkg, @Unsigned long now, @Unsigned long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> blkcg_css_alloc(Ptr<CgroupDefinitions.cgroup_subsys_state> parent_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_css_free(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_css_offline(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkcg_css_online(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blkcg_deactivate_policy($arg1, (const struct blkcg_policy*)$arg2)")
    public static void blkcg_deactivate_policy(Ptr<runtime.gendisk> disk, Ptr<blkcg_policy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_exit(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_exit_disk(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_fill_root_iostats() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_free_all_cpd(Ptr<blkcg_policy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> blkcg_get_cgwb_list(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkcg_init_disk(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_iostat_update(Ptr<blkcg_gq> blkg, Ptr<BlkgDefinitions.blkg_iostat> cur, Ptr<BlkgDefinitions.blkg_iostat> last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_maybe_throttle_blkg(Ptr<blkcg_gq> blkg, boolean use_memdelay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_maybe_throttle_current() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_pin_online(Ptr<CgroupDefinitions.cgroup_subsys_state> blkcg_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blkcg_policy_enabled($arg1, (const struct blkcg_policy*)$arg2)")
    public static boolean blkcg_policy_enabled(Ptr<RequestDefinitions.request_queue> q, Ptr<blkcg_policy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkcg_policy_register(Ptr<blkcg_policy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_policy_unregister(Ptr<blkcg_policy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="blkcg_print_blkgs($arg1, $arg2, (long long unsigned int (*)(struct seq_file*, struct blkg_policy_data*, int))$arg3, (const struct blkcg_policy*)$arg4, $arg5, $arg6)")
    public static void blkcg_print_blkgs(Ptr<SeqDefinitions.seq_file> sf, Ptr<runtime.blkcg> blkcg2, Ptr<?> prfill, Ptr<blkcg_policy> pol, int data, boolean show_total) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkcg_print_stat(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkcg_punt_bio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_punt_bio_submit(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkcg_reset_stats(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cftype2, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_rstat_flush(Ptr<CgroupDefinitions.cgroup_subsys_state> css, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_scale_delay(Ptr<blkcg_gq> blkg, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_schedule_throttle(Ptr<runtime.gendisk> disk, boolean use_memdelay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_unpin_online(Ptr<CgroupDefinitions.cgroup_subsys_state> blkcg_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String blkcg_get_fc_appid(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int blkcg_set_fc_appid(String app_id, @Unsigned long cgrp_id, @Unsigned long app_id_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void blkcg_set_ioprio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct blkcg_policy")
    @NotUsableInJava
    public static class blkcg_policy
    extends Struct {
        public int plid;
        public Ptr<runtime.cftype> dfl_cftypes;
        public Ptr<runtime.cftype> legacy_cftypes;
        public Ptr<?> cpd_alloc_fn;
        public Ptr<?> cpd_free_fn;
        public Ptr<?> pd_alloc_fn;
        public Ptr<?> pd_init_fn;
        public Ptr<?> pd_online_fn;
        public Ptr<?> pd_offline_fn;
        public Ptr<?> pd_free_fn;
        public Ptr<?> pd_reset_stats_fn;
        public Ptr<?> pd_stat_fn;
    }

    @Type(noCCodeGeneration=true, cType="struct blkcg_policy_data")
    @NotUsableInJava
    public static class blkcg_policy_data
    extends Struct {
        public Ptr<runtime.blkcg> blkcg;
        public int plid;
    }

    @Type(noCCodeGeneration=true, cType="struct blkcg_gq")
    @NotUsableInJava
    public static class blkcg_gq
    extends Struct {
        public Ptr<RequestDefinitions.request_queue> q;
        public ListDefinitions.list_head q_node;
        public misc.hlist_node blkcg_node;
        public Ptr<runtime.blkcg> blkcg;
        public Ptr<blkcg_gq> parent;
        public PercpuDefinitions.percpu_ref refcnt;
        public boolean online;
        public Ptr<BlkgDefinitions.blkg_iostat_set> iostat_cpu;
        public BlkgDefinitions.blkg_iostat_set iostat;
        public Ptr<BlkgDefinitions.blkg_policy_data> @Size(value=6) [] pd;
        public  @OriginalName(value="spinlock_t") runtime.spinlock async_bio_lock;
        public BioDefinitions.bio_list async_bios;
        @InlineUnion(value=14180)
        public  @InlineUnion(value=14180) misc.work_struct async_bio_work;
        @InlineUnion(value=14180)
        public  @InlineUnion(value=14180) misc.work_struct free_work;
        public AtomicDefinitions.atomic_t use_delay;
        public misc.atomic64_t delay_nsec;
        public misc.atomic64_t delay_start;
        public @Unsigned long last_delay;
        public int last_use;
        public misc.callback_head callback_head;
    }
}

