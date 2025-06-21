/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ForDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void for_each_companion(Ptr<PciDefinitions.pci_dev> pdev, Ptr<UsbDefinitions.usb_hcd> hcd, @OriginalName(value="companion_fn") Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="for_each_kernel_tracepoint((void (*)(struct tracepoint*, void*))$arg1, $arg2)")
    public static void for_each_kernel_tracepoint(Ptr<?> fct, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="for_each_module_tracepoint((void (*)(struct tracepoint*, struct module*, void*))$arg1, $arg2)")
    public static void for_each_module_tracepoint(Ptr<?> fct, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="for_each_thermal_cooling_device((int (*)(struct thermal_cooling_device*, void*))$arg1, $arg2)")
    public static int for_each_thermal_cooling_device(Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="for_each_thermal_governor((int (*)(struct thermal_governor*, void*))$arg1, $arg2)")
    public static int for_each_thermal_governor(Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="for_each_thermal_zone((int (*)(struct thermal_zone_device*, void*))$arg1, $arg2)")
    public static int for_each_thermal_zone(Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="for_each_tracepoint_in_module($arg1, (void (*)(struct tracepoint*, struct module*, void*))$arg2, $arg3)")
    public static void for_each_tracepoint_in_module(Ptr<runtime.module> mod, Ptr<?> fct, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int for_each_memory_block(Ptr<?> arg2, @OriginalName(value="walk_memory_blocks_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int for_each_memory_block_cb(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="for_each_thermal_trip($arg1, (int (*)(struct thermal_trip*, void*))$arg2, $arg3)")
    public static int for_each_thermal_trip(Ptr<ThermalDefinitions.thermal_zone_device> tz, Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct for_each_memory_block_cb_data")
    @NotUsableInJava
    public static class for_each_memory_block_cb_data
    extends Struct {
        public @OriginalName(value="walk_memory_blocks_func_t") Ptr<?> func;
        public Ptr<?> arg;
    }
}

