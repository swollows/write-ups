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
import me.bechberger.ebpf.runtime.HvDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Union;

public final class CpumaskDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__cpumask_to_vpset($arg1, (const struct cpumask*)$arg2, (_Bool (*)(int))$arg3)")
    public static int __cpumask_to_vpset(Ptr<HvDefinitions.hv_vpset> vpset, Ptr<runtime.cpumask> cpus, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpumask_any_and_distribute((const struct cpumask*)$arg1, (const struct cpumask*)$arg2)")
    public static @Unsigned int cpumask_any_and_distribute(Ptr<runtime.cpumask> src1p, Ptr<runtime.cpumask> src2p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpumask_any_distribute((const struct cpumask*)$arg1)")
    public static @Unsigned int cpumask_any_distribute(Ptr<runtime.cpumask> srcp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpumask_kfunc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cpumask_local_spread(@Unsigned int i, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpumask_next_wrap($arg1, (const struct cpumask*)$arg2, $arg3, $arg4)")
    public static @Unsigned int cpumask_next_wrap(int n, Ptr<runtime.cpumask> mask, int start, boolean wrap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpumask_any_housekeeping((const struct cpumask*)$arg1, $arg2)")
    public static @Unsigned int cpumask_any_housekeeping(Ptr<runtime.cpumask> mask, int exclude_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpumask_isolated_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpumask_requested_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cpumask_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpumask_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long cpumask_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union cpumask_rcuhead")
    @NotUsableInJava
    public static class cpumask_rcuhead
    extends Union {
        public  @OriginalName(value="cpumask_t") runtime.cpumask cpumask;
        public misc.callback_head rcu;
    }
}

