/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ArchDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PseudoDefinitions;
import me.bechberger.ebpf.runtime.ResctrlDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RdtDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __rdt_get_mem_config_amd(Ptr<rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rdt_cpu_has(int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_ctrl_update(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<rdt_domain_hdr> rdt_find_domain(Ptr<ListDefinitions.list_head> h, int id, Ptr<Ptr<ListDefinitions.list_head>> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_get_cache_alloc_cfg(int idx, Ptr<rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_pseudo_lock_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_pseudo_lock_release() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_bit_usage_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_bw_gran_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_default_ctrl_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_delay_linear_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_domain_reconfigure_cdp(Ptr<rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_fs_context_free(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_has_sparse_bitmasks_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_last_cmd_clear() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdt_last_cmd_printf((const u8*)$arg1, $arg2_)")
    public static void rdt_last_cmd_printf(String fmt, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdt_last_cmd_puts((const u8*)$arg1)")
    public static void rdt_last_cmd_puts(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_last_cmd_status_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_min_bw_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_min_cbm_bits_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_mon_features_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_move_group_tasks(Ptr<runtime.rdtgroup> from, Ptr<runtime.rdtgroup> to, Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_num_closids_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_num_rmids_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_shareable_bits_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_staged_configs_clear() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_thread_throttle_mode_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdt_get_mon_l3_config(Ptr<rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdt_put_mon_l3_config() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum rdt_param")
    public static enum rdt_param implements Enum<rdt_param>,
    TypedEnum<rdt_param, Integer>
    {
        Opt_cdp,
        Opt_cdpl2,
        Opt_mba_mbps,
        Opt_debug,
        nr__rdt_params;

    }

    @Type(noCCodeGeneration=true, cType="struct rdt_fs_context")
    @NotUsableInJava
    public static class rdt_fs_context
    extends Struct {
        public KernfsDefinitions.kernfs_fs_context kfc;
        public boolean enable_cdpl2;
        public boolean enable_cdpl3;
        public boolean enable_mba_mbps;
        public boolean enable_debug;
    }

    @Type(noCCodeGeneration=true, cType="struct rdt_options")
    @NotUsableInJava
    public static class rdt_options
    extends Struct {
        public String name;
        public int flag;
        public boolean force_off;
        public boolean force_on;
    }

    @Type(noCCodeGeneration=true, cType="struct rdt_hw_mon_domain")
    @NotUsableInJava
    public static class rdt_hw_mon_domain
    extends Struct {
        public rdt_mon_domain d_resctrl;
        public Ptr<ArchDefinitions.arch_mbm_state> arch_mbm_total;
        public Ptr<ArchDefinitions.arch_mbm_state> arch_mbm_local;
    }

    @Type(noCCodeGeneration=true, cType="struct rdt_hw_resource")
    @NotUsableInJava
    public static class rdt_hw_resource
    extends Struct {
        public rdt_resource r_resctrl;
        public @Unsigned int num_closid;
        public @Unsigned int msr_base;
        public Ptr<?> msr_update;
        public @Unsigned int mon_scale;
        public @Unsigned int mbm_width;
        public @Unsigned int mbm_cfg_mask;
        public boolean cdp_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct rdt_hw_ctrl_domain")
    @NotUsableInJava
    public static class rdt_hw_ctrl_domain
    extends Struct {
        public rdt_ctrl_domain d_resctrl;
        public Ptr<@Unsigned Integer> ctrl_val;
    }

    @Type(noCCodeGeneration=true, cType="enum rdt_group_type")
    public static enum rdt_group_type implements Enum<rdt_group_type>,
    TypedEnum<rdt_group_type, Integer>
    {
        RDTCTRL_GROUP,
        RDTMON_GROUP,
        RDT_NUM_GROUP;

    }

    @Type(noCCodeGeneration=true, cType="struct rdt_parse_data")
    @NotUsableInJava
    public static class rdt_parse_data
    extends Struct {
        public Ptr<runtime.rdtgroup> rdtgrp;
        public String buf;
    }

    @Type(noCCodeGeneration=true, cType="struct rdt_resource")
    @NotUsableInJava
    public static class rdt_resource
    extends Struct {
        public int rid;
        public boolean alloc_capable;
        public boolean mon_capable;
        public int num_rmid;
        public ResctrlDefinitions.resctrl_scope ctrl_scope;
        public ResctrlDefinitions.resctrl_scope mon_scope;
        public ResctrlDefinitions.resctrl_cache cache;
        public ResctrlDefinitions.resctrl_membw membw;
        public ListDefinitions.list_head ctrl_domains;
        public ListDefinitions.list_head mon_domains;
        public String name;
        public int data_width;
        public @Unsigned int default_ctrl;
        public String format_str;
        public Ptr<?> parse_ctrlval;
        public ListDefinitions.list_head evt_list;
        public @Unsigned long fflags;
        public boolean cdp_capable;
    }

    @Type(noCCodeGeneration=true, cType="struct rdt_mon_domain")
    @NotUsableInJava
    public static class rdt_mon_domain
    extends Struct {
        public rdt_domain_hdr hdr;
        public Ptr<runtime.cacheinfo> ci;
        public Ptr<@Unsigned Long> rmid_busy_llc;
        public Ptr<misc.mbm_state> mbm_total;
        public Ptr<misc.mbm_state> mbm_local;
        public DelayedDefinitions.delayed_work mbm_over;
        public DelayedDefinitions.delayed_work cqm_limbo;
        public int mbm_work_cpu;
        public int cqm_work_cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct rdt_ctrl_domain")
    @NotUsableInJava
    public static class rdt_ctrl_domain
    extends Struct {
        public rdt_domain_hdr hdr;
        public Ptr<PseudoDefinitions.pseudo_lock_region> plr;
        public ResctrlDefinitions.resctrl_staged_config @Size(value=3) [] staged_config;
        public Ptr<@Unsigned Integer> mbps_val;
    }

    @Type(noCCodeGeneration=true, cType="struct rdt_domain_hdr")
    @NotUsableInJava
    public static class rdt_domain_hdr
    extends Struct {
        public ListDefinitions.list_head list;
        public int id;
        public ResctrlDefinitions.resctrl_domain_type type;
        public runtime.cpumask cpu_mask;
    }
}

