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
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SerioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__serio_register_driver($arg1, $arg2, (const u8*)$arg3)")
    public static int __serio_register_driver(Ptr<serio_driver> drv, Ptr<runtime.module> owner, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __serio_register_port(Ptr<runtime.serio> serio2, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serio_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int serio_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_close(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_destroy_port(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_disconnect_port(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serio_driver_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_driver_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_handle_event(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn serio_interrupt(Ptr<runtime.serio> serio2, char data, @Unsigned int dfl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serio_match_port((const struct serio_device_id*)$arg1, $arg2)")
    public static int serio_match_port(Ptr<serio_device_id> ids, Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serio_open(Ptr<runtime.serio> serio2, Ptr<serio_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serio_queue_event(Ptr<?> object, Ptr<runtime.module> owner, serio_event_type event_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_reconnect(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_reconnect_subtree(Ptr<runtime.serio> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_release_port(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_remove_duplicate_events(Ptr<?> object, serio_event_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_remove_pending_events(Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_rescan(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serio_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serio_set_bind_mode($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long serio_set_bind_mode(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long serio_show_bind_mode(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long serio_show_description(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serio_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serio_uevent((const struct device*)$arg1, $arg2)")
    public static int serio_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_unregister_child_port(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_unregister_driver(Ptr<serio_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serio_unregister_port(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct serio_event")
    @NotUsableInJava
    public static class serio_event
    extends Struct {
        public serio_event_type type;
        public Ptr<?> object;
        public Ptr<runtime.module> owner;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="enum serio_event_type")
    public static enum serio_event_type implements Enum<serio_event_type>,
    TypedEnum<serio_event_type, Integer>
    {
        SERIO_RESCAN_PORT,
        SERIO_RECONNECT_PORT,
        SERIO_RECONNECT_SUBTREE,
        SERIO_REGISTER_PORT,
        SERIO_ATTACH_DRIVER;

    }

    @Type(noCCodeGeneration=true, cType="struct serio_driver")
    @NotUsableInJava
    public static class serio_driver
    extends Struct {
        public String description;
        public Ptr<serio_device_id> id_table;
        public boolean manual_bind;
        public Ptr<?> write_wakeup;
        public Ptr<?> interrupt;
        public Ptr<?> connect;
        public Ptr<?> reconnect;
        public Ptr<?> fast_reconnect;
        public Ptr<?> disconnect;
        public Ptr<?> cleanup;
        public DeviceDefinitions.device_driver driver;
    }

    @Type(noCCodeGeneration=true, cType="struct serio_device_id")
    @NotUsableInJava
    public static class serio_device_id
    extends Struct {
        public char type;
        public char extra;
        public char id;
        public char proto;
    }
}

