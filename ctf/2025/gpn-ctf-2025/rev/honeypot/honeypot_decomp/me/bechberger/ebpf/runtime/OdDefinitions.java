/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.PolicyDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class OdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PolicyDefinitions.policy_dbs_info> od_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int od_dbs_update(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void od_exit(Ptr<misc.dbs_data> dbs_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void od_free(Ptr<PolicyDefinitions.policy_dbs_info> policy_dbs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int od_init(Ptr<misc.dbs_data> dbs_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="od_register_powersave_bias_handler((unsigned int (*)(struct cpufreq_policy*, unsigned int, unsigned int))$arg1, $arg2)")
    public static void od_register_powersave_bias_handler(Ptr<?> f, @Unsigned int powersave_bias) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void od_set_powersave_bias(@Unsigned int powersave_bias) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void od_start(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void od_unregister_powersave_bias_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct od_dbs_tuners")
    @NotUsableInJava
    public static class od_dbs_tuners
    extends Struct {
        public @Unsigned int powersave_bias;
    }

    @Type(noCCodeGeneration=true, cType="struct od_policy_dbs_info")
    @NotUsableInJava
    public static class od_policy_dbs_info
    extends Struct {
        public PolicyDefinitions.policy_dbs_info policy_dbs;
        public @Unsigned int freq_lo;
        public @Unsigned int freq_lo_delay_us;
        public @Unsigned int freq_hi_delay_us;
        public @Unsigned int sample_type;
    }

    @Type(noCCodeGeneration=true, cType="struct od_ops")
    @NotUsableInJava
    public static class od_ops
    extends Struct {
        public Ptr<?> powersave_bias_target;
    }
}

