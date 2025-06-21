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
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AttributeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int attribute_container_add_attrs(Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int attribute_container_add_class_device(Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="attribute_container_add_device($arg1, (int (*)(struct attribute_container*, struct device*, struct device*))$arg2)")
    public static void attribute_container_add_device(Ptr<runtime.device> dev, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void attribute_container_class_device_del(Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<attribute_container> attribute_container_classdev_to_container(Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="attribute_container_device_trigger($arg1, (int (*)(struct attribute_container*, struct device*, struct device*))$arg2)")
    public static void attribute_container_device_trigger(Ptr<runtime.device> dev, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="attribute_container_device_trigger_safe($arg1, (int (*)(struct attribute_container*, struct device*, struct device*))$arg2, (int (*)(struct attribute_container*, struct device*, struct device*))$arg3)")
    public static int attribute_container_device_trigger_safe(Ptr<runtime.device> dev, Ptr<?> fn, Ptr<?> undo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> attribute_container_find_class_device(Ptr<attribute_container> cont, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int attribute_container_register(Ptr<attribute_container> cont) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void attribute_container_release(Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void attribute_container_remove_attrs(Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="attribute_container_remove_device($arg1, (void (*)(struct attribute_container*, struct device*, struct device*))$arg2)")
    public static void attribute_container_remove_device(Ptr<runtime.device> dev, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int attribute_container_unregister(Ptr<attribute_container> cont) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long attribute_show(Ptr<EfiDefinitions.efi_runtime_map_entry> entry, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct attribute_container")
    @NotUsableInJava
    public static class attribute_container
    extends Struct {
        public ListDefinitions.list_head node;
        public runtime.klist containers;
        public Ptr<runtime._class> _class;
        public Ptr<attribute_group> grp;
        public Ptr<Ptr<DeviceDefinitions.device_attribute>> attrs;
        public Ptr<?> match;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct attribute_group")
    @NotUsableInJava
    public static class attribute_group
    extends Struct {
        public String name;
        public Ptr<?> is_visible;
        public Ptr<?> is_bin_visible;
        public Ptr<Ptr<runtime.attribute>> attrs;
        public Ptr<Ptr<misc.bin_attribute>> bin_attrs;
    }
}

