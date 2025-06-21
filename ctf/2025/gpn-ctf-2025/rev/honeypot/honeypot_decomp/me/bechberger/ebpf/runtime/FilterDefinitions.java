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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.HashDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FilterDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean filter_mce(Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="filter_assign_type((const u8*)$arg1)")
    public static int filter_assign_type(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_ats_en_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_ats_en_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_ats_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_ats_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filter_build_regex(Ptr<filter_pred> pred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean filter_chain(Ptr<runtime.uprobe> uprobe2, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="filter_device($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static boolean filter_device(Ptr<HashDefinitions.hash_cell> hc, String pfx_name, String pfx_uuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_domain_en_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_domain_en_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_domain_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_domain_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filter_match_preds(Ptr<EventDefinitions.event_filter> filter, Ptr<?> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_page_table_en_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_page_table_en_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_page_table_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_page_table_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.regex_type filter_parse_regex(String buff, int len, Ptr<String> search2, Ptr<Integer> not) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_pasid_en_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_pasid_en_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_pasid_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_pasid_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int filter_pred_fn_call(Ptr<filter_pred> pred, Ptr<?> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_requester_id_en_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_requester_id_en_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short filter_requester_id_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long filter_requester_id_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void filter_cpuid_features(Ptr<misc.cpuinfo_x86> c, boolean warn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int filter_irq_stacks(Ptr<@Unsigned Long> entries, @Unsigned int nr_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct filter_list")
    @NotUsableInJava
    public static class filter_list
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<EventDefinitions.event_filter> filter;
    }

    @Type(noCCodeGeneration=true, cType="struct filter_parse_error")
    @NotUsableInJava
    public static class filter_parse_error
    extends Struct {
        public int lasterr;
        public int lasterr_pos;
    }

    @Type(noCCodeGeneration=true, cType="struct filter_pred")
    @NotUsableInJava
    public static class filter_pred
    extends Struct {
        public Ptr<runtime.regex> regex;
        public Ptr<runtime.cpumask> mask;
        public Ptr<@Unsigned Short> ops;
        public Ptr<FtraceDefinitions.ftrace_event_field> field;
        public @Unsigned long val;
        public @Unsigned long val2;
        public filter_pred_fn fn_num;
        public int offset;
        public int not;
        public int op;
    }

    @Type(noCCodeGeneration=true, cType="enum filter_pred_fn")
    public static enum filter_pred_fn implements Enum<filter_pred_fn>,
    TypedEnum<filter_pred_fn, Integer>
    {
        FILTER_PRED_FN_NOP,
        FILTER_PRED_FN_64,
        FILTER_PRED_FN_64_CPUMASK,
        FILTER_PRED_FN_S64,
        FILTER_PRED_FN_U64,
        FILTER_PRED_FN_32,
        FILTER_PRED_FN_32_CPUMASK,
        FILTER_PRED_FN_S32,
        FILTER_PRED_FN_U32,
        FILTER_PRED_FN_16,
        FILTER_PRED_FN_16_CPUMASK,
        FILTER_PRED_FN_S16,
        FILTER_PRED_FN_U16,
        FILTER_PRED_FN_8,
        FILTER_PRED_FN_8_CPUMASK,
        FILTER_PRED_FN_S8,
        FILTER_PRED_FN_U8,
        FILTER_PRED_FN_COMM,
        FILTER_PRED_FN_STRING,
        FILTER_PRED_FN_STRLOC,
        FILTER_PRED_FN_STRRELLOC,
        FILTER_PRED_FN_PCHAR_USER,
        FILTER_PRED_FN_PCHAR,
        FILTER_PRED_FN_CPU,
        FILTER_PRED_FN_CPU_CPUMASK,
        FILTER_PRED_FN_CPUMASK,
        FILTER_PRED_FN_CPUMASK_CPU,
        FILTER_PRED_FN_FUNCTION,
        FILTER_PRED_FN_,
        FILTER_PRED_TEST_VISITED;

    }

    @Type(noCCodeGeneration=true, cType="enum filter_op_ids")
    public static enum filter_op_ids implements Enum<filter_op_ids>,
    TypedEnum<filter_op_ids, Integer>
    {
        OP_GLOB,
        OP_NE,
        OP_EQ,
        OP_LE,
        OP_LT,
        OP_GE,
        OP_GT,
        OP_BAND,
        OP_MAX;

    }
}

