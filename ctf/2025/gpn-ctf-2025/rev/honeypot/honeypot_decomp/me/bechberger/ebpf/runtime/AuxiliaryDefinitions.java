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
import me.bechberger.ebpf.runtime.SysfsDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AuxiliaryDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__auxiliary_device_add($arg1, (const u8*)$arg2)")
    public static int __auxiliary_device_add(Ptr<auxiliary_device> auxdev, String modname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__auxiliary_driver_register($arg1, $arg2, (const u8*)$arg3)")
    public static int __auxiliary_driver_register(Ptr<auxiliary_driver> auxdrv, Ptr<runtime.module> owner, String modname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void auxiliary_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int auxiliary_bus_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void auxiliary_bus_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void auxiliary_bus_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int auxiliary_device_init(Ptr<auxiliary_device> auxdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void auxiliary_driver_unregister(Ptr<auxiliary_driver> auxdrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="auxiliary_find_device($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<auxiliary_device> auxiliary_find_device(Ptr<runtime.device> start, Ptr<?> data, @OriginalName(value="device_match_t") Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="auxiliary_match($arg1, (const struct device_driver*)$arg2)")
    public static int auxiliary_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct auxiliary_device_id*)auxiliary_match_id((const struct auxiliary_device_id*)$arg1, (const struct auxiliary_device*)$arg2))")
    public static Ptr<auxiliary_device_id> auxiliary_match_id(Ptr<auxiliary_device_id> id, Ptr<auxiliary_device> auxdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="auxiliary_uevent((const struct device*)$arg1, $arg2)")
    public static int auxiliary_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int auxiliary_device_sysfs_irq_add(Ptr<auxiliary_device> auxdev, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void auxiliary_device_sysfs_irq_remove(Ptr<auxiliary_device> auxdev, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct auxiliary_driver")
    @NotUsableInJava
    public static class auxiliary_driver
    extends Struct {
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public String name;
        public DeviceDefinitions.device_driver driver;
        public Ptr<auxiliary_device_id> id_table;
    }

    @Type(noCCodeGeneration=true, cType="struct auxiliary_device_id")
    @NotUsableInJava
    public static class auxiliary_device_id
    extends Struct {
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }

    @Type(noCCodeGeneration=true, cType="struct auxiliary_irq_info")
    @NotUsableInJava
    public static class auxiliary_irq_info
    extends Struct {
        public DeviceDefinitions.device_attribute sysfs_attr;
        public char @Size(value=11) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct auxiliary_device")
    @NotUsableInJava
    public static class auxiliary_device
    extends Struct {
        public runtime.device dev;
        public String name;
        public @Unsigned int id;
        public SysfsDefinitions.sysfs_of_auxiliary_device sysfs;
    }
}

