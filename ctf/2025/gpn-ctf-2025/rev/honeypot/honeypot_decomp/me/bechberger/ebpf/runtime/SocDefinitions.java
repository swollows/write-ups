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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SocDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short soc_attribute_mode(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int soc_bus_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct soc_device_attribute*)soc_device_match((const struct soc_device_attribute*)$arg1))")
    public static Ptr<soc_device_attribute> soc_device_match(Ptr<soc_device_attribute> matches) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="soc_device_match_attr((const struct soc_device_attribute*)$arg1, (const struct soc_device_attribute*)$arg2)")
    public static int soc_device_match_attr(Ptr<soc_device_attribute> attr2, Ptr<soc_device_attribute> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int soc_device_match_one(Ptr<runtime.device> dev, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<soc_device> soc_device_register(Ptr<soc_device_attribute> soc_dev_attr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> soc_device_to_device(Ptr<soc_device> soc_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void soc_device_unregister(Ptr<soc_device> soc_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long soc_info_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void soc_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct soc_device")
    @NotUsableInJava
    public static class soc_device
    extends Struct {
        public runtime.device dev;
        public Ptr<soc_device_attribute> attr;
        public int soc_dev_num;
    }

    @Type(noCCodeGeneration=true, cType="struct soc_device_attribute")
    @NotUsableInJava
    public static class soc_device_attribute
    extends Struct {
        public String machine;
        public String family;
        public String revision;
        public String serial_number;
        public String soc_id;
        public Ptr<?> data;
        public Ptr<AttributeDefinitions.attribute_group> custom_attr_group;
    }
}

