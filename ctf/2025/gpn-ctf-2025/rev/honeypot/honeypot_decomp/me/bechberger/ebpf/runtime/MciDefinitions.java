/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class MciDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mci_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short mci_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mci_ce_count_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mci_ce_noinfo_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mci_ctl_name_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mci_max_location_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mci_reset_counters_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long mci_reset_counters_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mci_sdram_scrub_rate_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mci_sdram_scrub_rate_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long mci_sdram_scrub_rate_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mci_seconds_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mci_size_mb_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mci_ue_count_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mci_ue_noinfo_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> mattr, String data) {
        throw new MethodIsBPFRelatedFunction();
    }
}

