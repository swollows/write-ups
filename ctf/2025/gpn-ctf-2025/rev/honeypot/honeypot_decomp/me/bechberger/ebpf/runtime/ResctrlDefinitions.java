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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ResctrlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int resctrl_arch_get_num_closid(Ptr<RdtDefinitions.rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_arch_offline_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_arch_online_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int resctrl_arch_system_num_rmid_idx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void resctrl_cpu_detect(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void resctrl_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_arch_set_cdp_enabled(resctrl_res_level l, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void resctrl_offline_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void resctrl_offline_ctrl_domain(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_ctrl_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void resctrl_offline_mon_domain(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_mon_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void resctrl_online_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_online_ctrl_domain(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_ctrl_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_online_mon_domain(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_mon_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void resctrl_arch_reset_rmid(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_mon_domain> d, @Unsigned int unused, @Unsigned int rmid, resctrl_event_id eventid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void resctrl_arch_reset_rmid_all(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_mon_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_arch_rmid_read(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_mon_domain> d, @Unsigned int unused, @Unsigned int rmid, resctrl_event_id eventid, Ptr<@Unsigned Long> val, Ptr<?> ignored) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_find_cleanest_closid() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int resctrl_arch_get_config(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_ctrl_domain> d, @Unsigned int closid, resctrl_conf_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_arch_update_domains(Ptr<RdtDefinitions.rdt_resource> r, @Unsigned int closid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int resctrl_arch_update_one(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_ctrl_domain> d, @Unsigned int closid, resctrl_conf_type t, @Unsigned int cfg_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct resctrl_pqr_state")
    @NotUsableInJava
    public static class resctrl_pqr_state
    extends Struct {
        public @Unsigned int cur_rmid;
        public @Unsigned int cur_closid;
        public @Unsigned int default_rmid;
        public @Unsigned int default_closid;
    }

    @Type(noCCodeGeneration=true, cType="enum resctrl_res_level")
    public static enum resctrl_res_level implements Enum<resctrl_res_level>,
    TypedEnum<resctrl_res_level, Integer>
    {
        RDT_RESOURCE_L3,
        RDT_RESOURCE_L2,
        RDT_RESOURCE_MBA,
        RDT_RESOURCE_SMBA,
        RDT_NUM_RESOURCES;

    }

    @Type(noCCodeGeneration=true, cType="struct resctrl_schema")
    @NotUsableInJava
    public static class resctrl_schema
    extends Struct {
        public ListDefinitions.list_head list;
        public char @Size(value=8) [] name;
        public resctrl_conf_type conf_type;
        public Ptr<RdtDefinitions.rdt_resource> res;
        public @Unsigned int num_closid;
    }

    @Type(noCCodeGeneration=true, cType="enum resctrl_scope")
    public static enum resctrl_scope implements Enum<resctrl_scope>,
    TypedEnum<resctrl_scope, Integer>
    {
        RESCTRL_L2_CACHE,
        RESCTRL_L3_CACHE,
        RESCTRL_L3_NODE;

    }

    @Type(noCCodeGeneration=true, cType="struct resctrl_membw")
    @NotUsableInJava
    public static class resctrl_membw
    extends Struct {
        public @Unsigned int min_bw;
        public @Unsigned int bw_gran;
        public @Unsigned int delay_linear;
        public boolean arch_needs_linear;
        public misc.membw_throttle_mode throttle_mode;
        public boolean mba_sc;
        public Ptr<@Unsigned Integer> mb_map;
    }

    @Type(noCCodeGeneration=true, cType="struct resctrl_cache")
    @NotUsableInJava
    public static class resctrl_cache
    extends Struct {
        public @Unsigned int cbm_len;
        public @Unsigned int min_cbm_bits;
        public @Unsigned int shareable_bits;
        public boolean arch_has_sparse_bitmasks;
        public boolean arch_has_per_cpu_cfg;
    }

    @Type(noCCodeGeneration=true, cType="enum resctrl_domain_type")
    public static enum resctrl_domain_type implements Enum<resctrl_domain_type>,
    TypedEnum<resctrl_domain_type, Integer>
    {
        RESCTRL_CTRL_DOMAIN,
        RESCTRL_MON_DOMAIN;

    }

    @Type(noCCodeGeneration=true, cType="struct resctrl_staged_config")
    @NotUsableInJava
    public static class resctrl_staged_config
    extends Struct {
        public @Unsigned int new_ctrl;
        public boolean have_new_ctrl;
    }

    @Type(noCCodeGeneration=true, cType="enum resctrl_event_id")
    public static enum resctrl_event_id implements Enum<resctrl_event_id>,
    TypedEnum<resctrl_event_id, Integer>
    {
        QOS_L3_OCCUP_EVENT_ID,
        QOS_L3_MBM_TOTAL_EVENT_ID,
        QOS_L3_MBM_LOCAL_EVENT_ID;

    }

    @Type(noCCodeGeneration=true, cType="enum resctrl_conf_type")
    public static enum resctrl_conf_type implements Enum<resctrl_conf_type>,
    TypedEnum<resctrl_conf_type, Integer>
    {
        CDP_NONE,
        CDP_CODE,
        CDP_DATA;

    }
}

