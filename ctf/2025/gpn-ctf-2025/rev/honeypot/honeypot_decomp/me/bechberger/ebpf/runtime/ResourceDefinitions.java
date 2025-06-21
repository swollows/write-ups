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
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ResourceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long resource_in_use_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="resource_string($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static String resource_string(String buf, String end, Ptr<runtime.resource> res, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long resource_alignment(Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean resource_is_exclusive(Ptr<runtime.resource> root, @Unsigned long addr2, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<resource_entry> resource_list_create_entry(Ptr<runtime.resource> res, @Unsigned long extra_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void resource_list_free(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long resource_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__resource_resize_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long __resource_resize_store(Ptr<runtime.device> dev, int n, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="resource_alignment_show((const struct bus_type*)$arg1, $arg2)")
    public static @OriginalName(value="ssize_t") long resource_alignment_show(Ptr<BusDefinitions.bus_type> bus, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="resource_alignment_store((const struct bus_type*)$arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long resource_alignment_store(Ptr<BusDefinitions.bus_type> bus, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="resource_init_named($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static void resource_init_named(Ptr<runtime.resource> r, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long size, String name, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short resource_resize_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct resource_constraint")
    @NotUsableInJava
    public static class resource_constraint
    extends Struct {
        public @Unsigned @OriginalName(value="resource_size_t") long min;
        public @Unsigned @OriginalName(value="resource_size_t") long max;
        public @Unsigned @OriginalName(value="resource_size_t") long align;
        public @OriginalName(value="resource_alignf") Ptr<?> alignf;
        public Ptr<?> alignf_data;
    }

    @Type(noCCodeGeneration=true, cType="struct resource_win")
    @NotUsableInJava
    public static class resource_win
    extends Struct {
        public runtime.resource res;
        public @Unsigned @OriginalName(value="resource_size_t") long offset;
    }

    @Type(noCCodeGeneration=true, cType="struct resource_table")
    @NotUsableInJava
    public static class resource_table
    extends Struct {
        public @Unsigned int ver;
        public @Unsigned int num;
        public @Unsigned int @Size(value=2) [] reserved;
        public @Unsigned int @Size(value=0) [] offset;
    }

    @Type(noCCodeGeneration=true, cType="struct resource_entry")
    @NotUsableInJava
    public static class resource_entry
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<runtime.resource> res;
        public @Unsigned @OriginalName(value="resource_size_t") long offset;
        public runtime.resource __res;
    }
}

