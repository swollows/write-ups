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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HteDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_edge_setup(Ptr<runtime.line> line2, @Unsigned long eflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hte_req_ts(Ptr<hte_ts_desc> desc, @OriginalName(value="hte_ts_cb_t") Ptr<?> cb, @OriginalName(value="hte_ts_sec_cb_t") Ptr<?> tcb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _hte_devm_unregister_chip(Ptr<?> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_disable_ts(Ptr<hte_ts_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hte_do_cb_work(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_enable_ts(Ptr<hte_ts_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hte_get_clk_src_info((const struct hte_ts_desc*)$arg1, $arg2)")
    public static int hte_get_clk_src_info(Ptr<hte_ts_desc> desc, Ptr<hte_clk_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hte_init_line_attr($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int hte_init_line_attr(Ptr<hte_ts_desc> desc, @Unsigned int line_id, @Unsigned long edge_flags, String name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hte_push_ts_ns((const struct hte_chip*)$arg1, $arg2, $arg3)")
    public static int hte_push_ts_ns(Ptr<hte_chip> chip, @Unsigned int xlated_id, Ptr<hte_ts_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_register_chip(Ptr<hte_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_request_ts_ns(Ptr<hte_ts_desc> desc, @OriginalName(value="hte_ts_cb_t") Ptr<?> cb, @OriginalName(value="hte_ts_sec_cb_t") Ptr<?> tcb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_subsys_dbgfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_ts_dis_en_common(Ptr<hte_ts_desc> desc, boolean en) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_ts_get(Ptr<runtime.device> dev, Ptr<hte_ts_desc> desc, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_ts_put(Ptr<hte_ts_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hte_unregister_chip(Ptr<hte_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hte_ts_info")
    @NotUsableInJava
    public static class hte_ts_info
    extends Struct {
        public @Unsigned int xlated_id;
        public @Unsigned long flags;
        public @Unsigned long hte_cb_flags;
        public @Unsigned long seq;
        public String line_name;
        public boolean free_attr_name;
        public @OriginalName(value="hte_ts_cb_t") Ptr<?> cb;
        public @OriginalName(value="hte_ts_sec_cb_t") Ptr<?> tcb;
        public AtomicDefinitions.atomic_t dropped_ts;
        public  @OriginalName(value="spinlock_t") runtime.spinlock slock;
        public misc.work_struct cb_work;
        public runtime.mutex req_mlock;
        public Ptr<runtime.dentry> ts_dbg_root;
        public Ptr<hte_device> gdev;
        public Ptr<?> cl_data;
    }

    @Type(noCCodeGeneration=true, cType="struct hte_device")
    @NotUsableInJava
    public static class hte_device
    extends Struct {
        public @Unsigned int nlines;
        public AtomicDefinitions.atomic_t ts_req;
        public Ptr<runtime.device> sdev;
        public Ptr<runtime.dentry> dbg_root;
        public ListDefinitions.list_head list;
        public Ptr<hte_chip> chip;
        public Ptr<runtime.module> owner;
        public hte_ts_info @Size(value=0) [] ei;
    }

    @Type(noCCodeGeneration=true, cType="struct hte_chip")
    @NotUsableInJava
    public static class hte_chip
    extends Struct {
        public String name;
        public Ptr<runtime.device> dev;
        public Ptr<hte_ops> ops;
        public @Unsigned int nlines;
        public Ptr<?> xlate_of;
        public Ptr<?> xlate_plat;
        public Ptr<?> match_from_linedata;
        public char of_hte_n_cells;
        public Ptr<hte_device> gdev;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct hte_ops")
    @NotUsableInJava
    public static class hte_ops
    extends Struct {
        public Ptr<?> request;
        public Ptr<?> release;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> get_clk_src_info;
    }

    @Type(noCCodeGeneration=true, cType="struct hte_clk_info")
    @NotUsableInJava
    public static class hte_clk_info
    extends Struct {
        public @Unsigned long hz;
        public @OriginalName(value="clockid_t") int type;
    }

    @Type(noCCodeGeneration=true, cType="struct hte_ts_desc")
    @NotUsableInJava
    public static class hte_ts_desc
    extends Struct {
        public hte_line_attr attr;
        public Ptr<?> hte_data;
    }

    @Type(noCCodeGeneration=true, cType="struct hte_line_attr")
    @NotUsableInJava
    public static class hte_line_attr
    extends Struct {
        public @Unsigned int line_id;
        public Ptr<?> line_data;
        public @Unsigned long edge_flags;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct hte_ts_data")
    @NotUsableInJava
    public static class hte_ts_data
    extends Struct {
        public @Unsigned long tsc;
        public @Unsigned long seq;
        public int raw_level;
    }

    @Type(noCCodeGeneration=true, cType="enum hte_return")
    public static enum hte_return implements Enum<hte_return>,
    TypedEnum<hte_return, Integer>
    {
        HTE_CB_HANDLED,
        HTE_RUN_SECOND_CB;

    }

    @Type(noCCodeGeneration=true, cType="enum hte_edge")
    public static enum hte_edge implements Enum<hte_edge>,
    TypedEnum<hte_edge, Integer>
    {
        HTE_EDGE_NO_SETUP,
        HTE_RISING_EDGE_TS,
        HTE_FALLING_EDGE_TS;

    }
}

