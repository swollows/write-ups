/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.SplitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class HfiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hfi_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hfi_disable_instance(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hfi_enable_instance(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hfi_set_hw_table(Ptr<hfi_instance> hfi_instance2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hfi_syscore_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hfi_syscore_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hfi_update_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hfi_cpu_info")
    @NotUsableInJava
    public static class hfi_cpu_info
    extends Struct {
        public short index;
        public Ptr<hfi_instance> hfi_instance;
    }

    @Type(noCCodeGeneration=true, cType="struct hfi_features")
    @NotUsableInJava
    public static class hfi_features
    extends Struct {
        public @Unsigned long nr_table_pages;
        public @Unsigned int cpu_stride;
        public @Unsigned int hdr_size;
    }

    @Type(noCCodeGeneration=true, cType="struct hfi_instance")
    @NotUsableInJava
    public static class hfi_instance
    extends Struct {
        @InlineUnion(value=95492)
        public @InlineUnion(value=95492) Ptr<?> local_table;
        @InlineUnion(value=95492)
        public @InlineUnion(value=95492) Ptr<@Unsigned Long> timestamp;
        public Ptr<?> hdr;
        public Ptr<?> data;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpus;
        public Ptr<?> hw_table;
        public DelayedDefinitions.delayed_work update_work;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock table_lock;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock event_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct hfi_cpu_data")
    @NotUsableInJava
    public static class hfi_cpu_data
    extends Struct {
        public char perf_cap;
        public char ee_cap;
    }

    @Type(noCCodeGeneration=true, cType="union hfi_capabilities")
    @NotUsableInJava
    public static class hfi_capabilities
    extends Union {
        public SplitDefinitions.split_of_hfi_capabilities split;
        public char bits;
    }
}

