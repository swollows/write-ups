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
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EddDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edd_dev_is_type($arg1, (const u8*)$arg2)")
    public static int edd_dev_is_type(Ptr<edd_device> edev, String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_device_register(Ptr<edd_device> edev, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edd_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_has_default_cylinders(Ptr<edd_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_has_default_heads(Ptr<edd_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_has_default_sectors_per_track(Ptr<edd_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_has_edd30(Ptr<edd_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_has_edd_info(Ptr<edd_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_has_legacy_max_cylinder(Ptr<edd_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_has_legacy_max_head(Ptr<edd_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_has_legacy_sectors_per_track(Ptr<edd_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_has_mbr_signature(Ptr<edd_device> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edd_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_default_cylinders(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_default_heads(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_default_sectors_per_track(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_extensions(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_host_bus(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_info_flags(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_interface(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_legacy_max_cylinder(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_legacy_max_head(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_legacy_sectors_per_track(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_mbr_signature(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_raw_data(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_sectors(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edd_show_version(Ptr<edd_device> edev, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct edd_attribute")
    @NotUsableInJava
    public static class edd_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> test;
    }

    @Type(noCCodeGeneration=true, cType="struct edd_device")
    @NotUsableInJava
    public static class edd_device
    extends Struct {
        public @Unsigned int index;
        public @Unsigned int mbr_signature;
        public Ptr<edd_info> info;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct edd_info")
    @NotUsableInJava
    public static class edd_info
    extends Struct {
        public char device;
        public char version;
        public @Unsigned short interface_support;
        public @Unsigned short legacy_max_cylinder;
        public char legacy_max_head;
        public char legacy_sectors_per_track;
        public edd_device_params params;
    }

    @Type(noCCodeGeneration=true, cType="struct edd_device_params")
    @NotUsableInJava
    public static class edd_device_params
    extends Struct {
        public @Unsigned short length;
        public @Unsigned short info_flags;
        public @Unsigned int num_default_cylinders;
        public @Unsigned int num_default_heads;
        public @Unsigned int sectors_per_track;
        public @Unsigned long number_of_sectors;
        public @Unsigned short bytes_per_sector;
        public @Unsigned int dpte_ptr;
        public @Unsigned short key;
        public char device_path_info_length;
        public char reserved2;
        public @Unsigned short reserved3;
        public char @Size(value=4) [] host_bus_type;
        public char @Size(value=8) [] interface_type;
        public misc.interface_path_of_edd_device_params interface_path;
        public DeviceDefinitions.device_path_of_edd_device_params device_path;
        public char reserved4;
        public char checksum;
    }
}

