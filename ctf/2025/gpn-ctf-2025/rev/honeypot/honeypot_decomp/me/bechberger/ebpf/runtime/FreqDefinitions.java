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
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FreqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void freq_constraints_init(Ptr<freq_constraints> qos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void freq_invariance_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void freq_invariance_set_perf_ratio(@Unsigned long ratio, boolean turbo_disabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int freq_qos_add_notifier(Ptr<freq_constraints> qos, freq_qos_req_type type2, Ptr<misc.notifier_block> notifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int freq_qos_add_request(Ptr<freq_constraints> qos, Ptr<freq_qos_request> req2, freq_qos_req_type type2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int freq_qos_apply(Ptr<freq_qos_request> req2, PmDefinitions.pm_qos_req_action action, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int freq_qos_read_value(Ptr<freq_constraints> qos, freq_qos_req_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int freq_qos_remove_notifier(Ptr<freq_constraints> qos, freq_qos_req_type type2, Ptr<misc.notifier_block> notifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int freq_qos_remove_request(Ptr<freq_qos_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int freq_qos_update_request(Ptr<freq_qos_request> req2, int new_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long freq_step_show(Ptr<misc.gov_attr_set> attr_set, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="freq_step_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long freq_step_store(Ptr<misc.gov_attr_set> attr_set, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct muldiv")
    @NotUsableInJava
    public static class muldiv
    extends Struct {
        public @Unsigned int multiplier;
        public @Unsigned int divider;
    }

    @Type(noCCodeGeneration=true, cType="struct freq_band_range")
    @NotUsableInJava
    public static class freq_band_range
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
    }

    @Type(noCCodeGeneration=true, cType="struct freq_attr")
    @NotUsableInJava
    public static class freq_attr
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct freq_qos_request")
    @NotUsableInJava
    public static class freq_qos_request
    extends Struct {
        public freq_qos_req_type type;
        public misc.plist_node pnode;
        public Ptr<freq_constraints> qos;
    }

    @Type(noCCodeGeneration=true, cType="struct freq_constraints")
    @NotUsableInJava
    public static class freq_constraints
    extends Struct {
        public PmDefinitions.pm_qos_constraints min_freq;
        public misc.blocking_notifier_head min_freq_notifiers;
        public PmDefinitions.pm_qos_constraints max_freq;
        public misc.blocking_notifier_head max_freq_notifiers;
    }

    @Type(noCCodeGeneration=true, cType="enum freq_qos_req_type")
    public static enum freq_qos_req_type implements Enum<freq_qos_req_type>,
    TypedEnum<freq_qos_req_type, Integer>
    {
        FREQ_QOS_MIN,
        FREQ_QOS_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct freq_desc")
    @NotUsableInJava
    public static class freq_desc
    extends Struct {
        public boolean use_msr_plat;
        public muldiv @Size(value=16) [] muldiv;
        public @Unsigned int @Size(value=16) [] freqs;
        public @Unsigned int mask;
    }
}

