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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EisaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="eisa_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int eisa_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eisa_bus_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eisa_bus_uevent((const struct device*)$arg1, $arg2)")
    public static int eisa_bus_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eisa_driver_register(Ptr<eisa_driver> edrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eisa_driver_unregister(Ptr<eisa_driver> edrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eisa_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eisa_init_device(Ptr<eisa_root_device> root, Ptr<eisa_device> edev, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eisa_name_device(Ptr<eisa_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eisa_probe(Ptr<eisa_root_device> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eisa_register_device(Ptr<eisa_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eisa_release_resources(Ptr<eisa_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eisa_request_resources(Ptr<eisa_root_device> root, Ptr<eisa_device> edev, int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eisa_root_register(Ptr<eisa_root_device> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct eisa_device_info")
    @NotUsableInJava
    public static class eisa_device_info
    extends Struct {
        public eisa_device_id id;
        public char @Size(value=50) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct eisa_driver")
    @NotUsableInJava
    public static class eisa_driver
    extends Struct {
        public Ptr<eisa_device_id> id_table;
        public DeviceDefinitions.device_driver driver;
    }

    @Type(noCCodeGeneration=true, cType="struct eisa_device")
    @NotUsableInJava
    public static class eisa_device
    extends Struct {
        public eisa_device_id id;
        public int slot;
        public int state;
        public @Unsigned long base_addr;
        public runtime.resource @Size(value=4) [] res;
        public @Unsigned long dma_mask;
        public runtime.device dev;
        public char @Size(value=50) [] pretty_name;
    }

    @Type(noCCodeGeneration=true, cType="struct eisa_device_id")
    @NotUsableInJava
    public static class eisa_device_id
    extends Struct {
        public char @Size(value=8) [] sig;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }

    @Type(noCCodeGeneration=true, cType="struct eisa_root_device")
    @NotUsableInJava
    public static class eisa_root_device
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<runtime.resource> res;
        public @Unsigned long bus_base_addr;
        public int slots;
        public int force_probe;
        public @Unsigned long dma_mask;
        public int bus_nr;
        public runtime.resource eisa_root_res;
    }
}

