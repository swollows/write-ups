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
import me.bechberger.ebpf.runtime.DebugDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class BtsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bts_event_start(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bts_buffer_free_aux(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bts_buffer_reset(Ptr<bts_buffer> buf, Ptr<PerfDefinitions.perf_output_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> bts_buffer_setup_aux(Ptr<PerfDefinitions.perf_event> event2, Ptr<Ptr<?>> pages, int nr_pages, boolean overwrite) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bts_event_add(Ptr<PerfDefinitions.perf_event> event2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bts_event_del(Ptr<PerfDefinitions.perf_event> event2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bts_event_destroy(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bts_event_init(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bts_event_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bts_event_start(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bts_event_stop(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bts_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bts_update(Ptr<bts_ctx> bts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct bts_buffer")
    @NotUsableInJava
    public static class bts_buffer
    extends Struct {
        public @Unsigned long real_size;
        public @Unsigned int nr_pages;
        public @Unsigned int nr_bufs;
        public @Unsigned int cur_buf;
        public boolean snapshot;
        public LocalDefinitions.local_t data_size;
        public LocalDefinitions.local_t head;
        public @Unsigned long end;
        public Ptr<Ptr<?>> data_pages;
        public bts_phys @Size(value=0) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct bts_phys")
    @NotUsableInJava
    public static class bts_phys
    extends Struct {
        public Ptr<runtime.page> page;
        public @Unsigned long size;
        public @Unsigned long offset;
        public @Unsigned long displacement;
    }

    @Type(noCCodeGeneration=true, cType="struct bts_ctx")
    @NotUsableInJava
    public static class bts_ctx
    extends Struct {
        public PerfDefinitions.perf_output_handle handle;
        public DebugDefinitions.debug_store ds_back;
        public int state;
    }

    @Type(noCCodeGeneration=true, cType="struct bts_record")
    @NotUsableInJava
    public static class bts_record
    extends Struct {
        public @Unsigned long from;
        public @Unsigned long to;
        public @Unsigned long flags;
    }
}

