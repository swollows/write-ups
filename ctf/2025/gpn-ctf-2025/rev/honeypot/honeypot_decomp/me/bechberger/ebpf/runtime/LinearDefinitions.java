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
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LinearDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="linear_range_get_max_value((const struct linear_range*)$arg1)")
    public static @Unsigned int linear_range_get_max_value(Ptr<linear_range> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="linear_range_get_selector_high((const struct linear_range*)$arg1, $arg2, $arg3, $arg4)")
    public static int linear_range_get_selector_high(Ptr<linear_range> r, @Unsigned int val, Ptr<@Unsigned Integer> selector, Ptr<@OriginalName(value="bool") Boolean> found) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="linear_range_get_selector_low((const struct linear_range*)$arg1, $arg2, $arg3, $arg4)")
    public static int linear_range_get_selector_low(Ptr<linear_range> r, @Unsigned int val, Ptr<@Unsigned Integer> selector, Ptr<@OriginalName(value="bool") Boolean> found) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="linear_range_get_selector_low_array((const struct linear_range*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int linear_range_get_selector_low_array(Ptr<linear_range> r, int ranges, @Unsigned int val, Ptr<@Unsigned Integer> selector, Ptr<@OriginalName(value="bool") Boolean> found) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="linear_range_get_selector_within((const struct linear_range*)$arg1, $arg2, $arg3)")
    public static void linear_range_get_selector_within(Ptr<linear_range> r, @Unsigned int val, Ptr<@Unsigned Integer> selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="linear_range_get_value((const struct linear_range*)$arg1, $arg2, $arg3)")
    public static int linear_range_get_value(Ptr<linear_range> r, @Unsigned int selector, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="linear_range_get_value_array((const struct linear_range*)$arg1, $arg2, $arg3, $arg4)")
    public static int linear_range_get_value_array(Ptr<linear_range> r, int ranges, @Unsigned int selector, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="linear_range_values_in_range((const struct linear_range*)$arg1)")
    public static @Unsigned int linear_range_values_in_range(Ptr<linear_range> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="linear_range_values_in_range_array((const struct linear_range*)$arg1, $arg2)")
    public static @Unsigned int linear_range_values_in_range_array(Ptr<linear_range> r, int ranges) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int linear_ctr(Ptr<DmDefinitions.dm_target> ti, @Unsigned int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long linear_dax_direct_access(Ptr<DmDefinitions.dm_target> ti, @Unsigned long pgoff, long nr_pages, DaxDefinitions.dax_access_mode mode, Ptr<Ptr<?>> kaddr, Ptr< @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long linear_dax_recovery_write(Ptr<DmDefinitions.dm_target> ti, @Unsigned long pgoff, Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int linear_dax_zero_page_range(Ptr<DmDefinitions.dm_target> ti, @Unsigned long pgoff, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void linear_dtr(Ptr<DmDefinitions.dm_target> ti) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int linear_iterate_devices(Ptr<DmDefinitions.dm_target> ti, @OriginalName(value="iterate_devices_callout_fn") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int linear_map(Ptr<DmDefinitions.dm_target> ti, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int linear_prepare_ioctl(Ptr<DmDefinitions.dm_target> ti, Ptr<Ptr<BlockDefinitions.block_device>> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int linear_report_zones(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_report_zones_args> args, @Unsigned int nr_zones) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void linear_status(Ptr<DmDefinitions.dm_target> ti,  @OriginalName(value="status_type_t") runtime.STATUSTYPE type2, @Unsigned int status_flags, String result, @Unsigned int maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct linear_c")
    @NotUsableInJava
    public static class linear_c
    extends Struct {
        public Ptr<DmDefinitions.dm_dev> dev;
        public @Unsigned @OriginalName(value="sector_t") long start;
    }

    @Type(noCCodeGeneration=true, cType="struct linear_range")
    @NotUsableInJava
    public static class linear_range
    extends Struct {
        public @Unsigned int min;
        public @Unsigned int min_sel;
        public @Unsigned int max_sel;
        public @Unsigned int step;
    }
}

