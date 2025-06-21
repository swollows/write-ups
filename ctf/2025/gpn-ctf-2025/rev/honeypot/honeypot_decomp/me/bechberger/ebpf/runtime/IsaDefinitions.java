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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IsaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int isa_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="isa_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int isa_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int isa_bus_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void isa_bus_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int isa_bus_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void isa_bus_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int isa_bus_suspend(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void isa_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int isa_register_driver(Ptr<isa_driver> isa_driver2, @Unsigned int ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void isa_unregister_driver(Ptr<isa_driver> isa_driver2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct isa_dev")
    @NotUsableInJava
    public static class isa_dev
    extends Struct {
        public runtime.device dev;
        public Ptr<runtime.device> next;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct isa_driver")
    @NotUsableInJava
    public static class isa_driver
    extends Struct {
        public Ptr<?> match;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public DeviceDefinitions.device_driver driver;
        public Ptr<runtime.device> devices;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int base_address; short unsigned int reserved1; unsigned int reserved2; }")
    @NotUsableInJava
    public static class isa_of_interface_path_of_edd_device_params
    extends Struct {
        public @Unsigned short base_address;
        public @Unsigned short reserved1;
        public @Unsigned int reserved2;
    }
}

