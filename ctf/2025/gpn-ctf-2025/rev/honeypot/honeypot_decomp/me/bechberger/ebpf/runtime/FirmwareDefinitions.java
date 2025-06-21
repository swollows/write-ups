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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FwDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FirmwareDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int firmware_fallback_platform(Ptr<FwDefinitions.fw_priv> fw_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int firmware_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_is_builtin((const struct firmware*)$arg1)")
    public static boolean firmware_is_builtin(Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_request_builtin($arg1, (const u8*)$arg2)")
    public static boolean firmware_request_builtin(Ptr<runtime.firmware> fw, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_request_builtin_buf($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static boolean firmware_request_builtin_buf(Ptr<runtime.firmware> fw, String name, Ptr<?> buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_fallback_sysfs($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int firmware_fallback_sysfs(Ptr<runtime.firmware> fw, String name, Ptr<runtime.device> device2, @Unsigned int opt_flags, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void firmware_class_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int firmware_class_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long firmware_id_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_request_cache($arg1, (const u8*)$arg2)")
    public static int firmware_request_cache(Ptr<runtime.device> device2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_request_nowait_nowarn($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (void (*)(const struct firmware*, void*))$arg6)")
    public static int firmware_request_nowait_nowarn(Ptr<runtime.module> module2, String name, Ptr<runtime.device> device2, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<?> context2, Ptr<?> cont) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_request_nowarn((const struct firmware**)$arg1, (const u8*)$arg2, $arg3)")
    public static int firmware_request_nowarn(Ptr<Ptr<runtime.firmware>> firmware2, String name, Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_request_platform((const struct firmware**)$arg1, (const u8*)$arg2, $arg3)")
    public static int firmware_request_platform(Ptr<Ptr<runtime.firmware>> firmware2, String name, Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long firmware_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long firmware_start_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long firmware_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_upload_register($arg1, $arg2, (const u8*)$arg3, (const struct fw_upload_ops*)$arg4, $arg5)")
    public static Ptr<FwDefinitions.fw_upload> firmware_upload_register(Ptr<runtime.module> module2, Ptr<runtime.device> parent, String name, Ptr<FwDefinitions.fw_upload_ops> ops, Ptr<?> dd_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void firmware_upload_unregister(Ptr<FwDefinitions.fw_upload> fw_upload2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long firmware_data_read(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buffer, @OriginalName(value="loff_t") long offset, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long firmware_data_write(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buffer, @OriginalName(value="loff_t") long offset, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long firmware_loading_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_loading_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long firmware_loading_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_map_add_early($arg1, $arg2, (const u8*)$arg3)")
    public static int firmware_map_add_early(@Unsigned long start, @Unsigned long end, String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_map_add_entry($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int firmware_map_add_entry(@Unsigned long start, @Unsigned long end, String type2, Ptr<firmware_map_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_map_add_hotplug($arg1, $arg2, (const u8*)$arg3)")
    public static int firmware_map_add_hotplug(@Unsigned long start, @Unsigned long end, String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_map_remove($arg1, $arg2, (const u8*)$arg3)")
    public static int firmware_map_remove(@Unsigned long start, @Unsigned long end, String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int firmware_memmap_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void firmware_rw(Ptr<FwDefinitions.fw_priv> fw_priv2, String buffer, @OriginalName(value="loff_t") long offset, @Unsigned long count, boolean read2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void firmware_rw_data(Ptr<FwDefinitions.fw_priv> fw_priv2, String buffer, @OriginalName(value="loff_t") long offset, @Unsigned long count, boolean read2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="firmware_uevent((const struct device*)$arg1, $arg2)")
    public static int firmware_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct firmware_work")
    @NotUsableInJava
    public static class firmware_work
    extends Struct {
        public misc.work_struct work;
        public Ptr<runtime.module> module;
        public String name;
        public Ptr<runtime.device> device;
        public Ptr<?> context;
        public Ptr<?> cont;
        public @Unsigned int opt_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct firmware_cache")
    @NotUsableInJava
    public static class firmware_cache
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head head;
        public int state;
        public  @OriginalName(value="spinlock_t") runtime.spinlock name_lock;
        public ListDefinitions.list_head fw_names;
        public DelayedDefinitions.delayed_work work;
        public misc.notifier_block pm_notify;
    }

    @Type(noCCodeGeneration=true, cType="struct firmware_map_entry")
    @NotUsableInJava
    public static class firmware_map_entry
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
        public String type;
        public ListDefinitions.list_head list;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct firmware_fallback_config")
    @NotUsableInJava
    public static class firmware_fallback_config
    extends Struct {
        public @Unsigned int force_sysfs_fallback;
        public @Unsigned int ignore_sysfs_fallback;
        public int old_timeout;
        public int loading_timeout;
    }
}

