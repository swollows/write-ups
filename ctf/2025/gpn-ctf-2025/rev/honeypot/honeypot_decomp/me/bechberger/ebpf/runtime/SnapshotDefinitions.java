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
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.RingDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.TracingDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SnapshotDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snapshot_raw_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long snapshot_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snapshot_device_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long snapshot_ioctl(Ptr<runtime.file> filp, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snapshot_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long snapshot_read(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> offp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snapshot_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="snapshot_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long snapshot_write(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> offp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int snapshot_additional_pages(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snapshot_count_trigger(Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long snapshot_get_image_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_trigger_ops> snapshot_get_trigger_ops(String cmd, String param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snapshot_image_loaded(Ptr<snapshot_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snapshot_read_next(Ptr<snapshot_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snapshot_trigger(Ptr<EventDefinitions.event_trigger_data> data, Ptr<TraceDefinitions.trace_buffer> buffer, Ptr<?> rec, Ptr<RingDefinitions.ring_buffer_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snapshot_trigger_print(Ptr<SeqDefinitions.seq_file> m, Ptr<EventDefinitions.event_trigger_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snapshot_write_finalize(Ptr<snapshot_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snapshot_write_next(Ptr<snapshot_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct snapshot_data")
    @NotUsableInJava
    public static class snapshot_data
    extends Struct {
        public snapshot_handle handle;
        public int swap;
        public int mode;
        public boolean frozen;
        public boolean ready;
        public boolean platform_support;
        public boolean free_bitmaps;
        public @Unsigned @OriginalName(value="dev_t") int dev;
    }

    @Type(noCCodeGeneration=true, cType="struct snapshot_context")
    @NotUsableInJava
    public static class snapshot_context
    extends Struct {
        public Ptr<TracingDefinitions.tracing_map_elt> elt;
        public Ptr<?> key;
    }

    @Type(noCCodeGeneration=true, cType="struct snapshot_handle")
    @NotUsableInJava
    public static class snapshot_handle
    extends Struct {
        public @Unsigned int cur;
        public Ptr<?> buffer;
        public int sync_read;
    }
}

