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
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.X86Definitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MsrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="msr_build_context((const unsigned int*)$arg1, (const int)$arg2)")
    public static int msr_build_context(Ptr<@Unsigned Integer> msr_id, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msr_clear_bit(@Unsigned int msr2, char bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msr_initialize_bdw((const struct dmi_system_id*)$arg1)")
    public static int msr_initialize_bdw(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msr_read(@Unsigned int msr2, Ptr<runtime.msr> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="msr_save_cpuid_features((const struct x86_cpu_id*)$arg1)")
    public static int msr_save_cpuid_features(Ptr<X86Definitions.x86_cpu_id> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msr_set_bit(@Unsigned int msr2, char bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msr_to_offset(@Unsigned int msr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msr_event_add(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msr_event_del(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msr_event_init(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msr_event_start(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msr_event_stop(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void msr_event_update(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int msr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long msr_read_counter(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct msr_enumeration")
    @NotUsableInJava
    public static class msr_enumeration
    extends Struct {
        public @Unsigned int msr_no;
        public @Unsigned int feature;
    }

    @Type(noCCodeGeneration=true, cType="struct msr_data")
    @NotUsableInJava
    public static class msr_data
    extends Struct {
        public boolean host_initiated;
        public @Unsigned int index;
        public @Unsigned long data;
    }

    @Type(noCCodeGeneration=true, cType="struct msr_bitmap_range")
    @NotUsableInJava
    public static class msr_bitmap_range
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int nmsrs;
        public @Unsigned int base;
        public Ptr<@Unsigned Long> bitmap;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 error; u8 pad[7]; unsigned int reason; unsigned int index; long long unsigned int data; }")
    @NotUsableInJava
    public static class msr_of_anon_member_of_kvm_run
    extends Struct {
        public char error;
        public char @Size(value=7) [] pad;
        public @Unsigned int reason;
        public @Unsigned int index;
        public @Unsigned long data;
    }

    @Type(noCCodeGeneration=true, cType="struct msr_info_completion")
    @NotUsableInJava
    public static class msr_info_completion
    extends Struct {
        public msr_info msr;
        public runtime.completion done;
    }

    @Type(noCCodeGeneration=true, cType="struct msr_regs_info")
    @NotUsableInJava
    public static class msr_regs_info
    extends Struct {
        public Ptr<@Unsigned Integer> regs;
        public int err;
    }

    @Type(noCCodeGeneration=true, cType="struct msr_info")
    @NotUsableInJava
    public static class msr_info
    extends Struct {
        public @Unsigned int msr_no;
        public runtime.msr reg;
        public Ptr<runtime.msr> msrs;
        public int err;
    }

    @Type(noCCodeGeneration=true, cType="struct msr_param")
    @NotUsableInJava
    public static class msr_param
    extends Struct {
        public Ptr<RdtDefinitions.rdt_resource> res;
        public Ptr<RdtDefinitions.rdt_ctrl_domain> dom;
        public @Unsigned int low;
        public @Unsigned int high;
    }
}

