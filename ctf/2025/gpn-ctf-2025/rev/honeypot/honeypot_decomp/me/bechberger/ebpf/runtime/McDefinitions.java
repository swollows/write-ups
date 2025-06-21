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
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class McDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mc_attr_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mc_cpu_down_prep(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mc_cpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mc_debug_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mc_percpu_init(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mc_poll_banks_default() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mc_queue_handle(@Unsigned @OriginalName(value="uint32_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct callback")
    @NotUsableInJava
    public static class callback
    extends Struct {
        public Ptr<?> fn;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct mc_info")
    @NotUsableInJava
    public static class mc_info
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int mi_nentries;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
        public @Unsigned @OriginalName(value="uint64_t") long @Size(value=95) [] mi_data;
    }

    @Type(noCCodeGeneration=true, cType="struct mc_debug_data")
    @NotUsableInJava
    public static class mc_debug_data
    extends Struct {
        public misc.multicall_entry @Size(value=32) [] entries;
        public Ptr<?> @Size(value=32) [] caller;
        public @Unsigned long @Size(value=32) [] argsz;
        public Ptr<@Unsigned Long> @Size(value=32) [] args;
    }

    @Type(noCCodeGeneration=true, cType="struct mc_buffer")
    @NotUsableInJava
    public static class mc_buffer
    extends Struct {
        public @Unsigned int mcidx;
        public @Unsigned int argidx;
        public @Unsigned int cbidx;
        public misc.multicall_entry @Size(value=32) [] entries;
        public char @Size(value=512) [] args;
        public callback @Size(value=32) [] callbacks;
    }

    @Type(noCCodeGeneration=true, cType="struct mc_subled")
    @NotUsableInJava
    public static class mc_subled
    extends Struct {
        public @Unsigned int color_index;
        public @Unsigned int brightness;
        public @Unsigned int intensity;
        public @Unsigned int channel;
    }
}

