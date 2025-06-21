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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class ExtconDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_alloc_muex(Ptr<extcon_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void extcon_class_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_class_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="extcon_dev_allocate((const unsigned int*)$arg1)")
    public static Ptr<extcon_dev> extcon_dev_allocate(Ptr<@Unsigned Integer> supported_cable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void extcon_dev_free(Ptr<extcon_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_dev_register(Ptr<extcon_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void extcon_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void extcon_dev_unregister(Ptr<extcon_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<extcon_dev> extcon_find_edev_by_node(Ptr<DeviceDefinitions.device_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<extcon_dev> extcon_get_edev_by_phandle(Ptr<runtime.device> dev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)extcon_get_edev_name($arg1))")
    public static String extcon_get_edev_name(Ptr<extcon_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="extcon_get_extcon_dev((const u8*)$arg1)")
    public static Ptr<extcon_dev> extcon_get_extcon_dev(String extcon_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_get_property(Ptr<extcon_dev> edev, @Unsigned int id, @Unsigned int prop, Ptr<extcon_property_value> prop_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_get_property_capability(Ptr<extcon_dev> edev, @Unsigned int id, @Unsigned int prop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="extcon_get_state($arg1, (const unsigned int)$arg2)")
    public static int extcon_get_state(Ptr<extcon_dev> edev, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_register_notifier(Ptr<extcon_dev> edev, @Unsigned int id, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_register_notifier_all(Ptr<extcon_dev> edev, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_set_property(Ptr<extcon_dev> edev, @Unsigned int id, @Unsigned int prop, extcon_property_value prop_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_set_property_capability(Ptr<extcon_dev> edev, @Unsigned int id, @Unsigned int prop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_set_property_sync(Ptr<extcon_dev> edev, @Unsigned int id, @Unsigned int prop, extcon_property_value prop_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_set_state(Ptr<extcon_dev> edev, @Unsigned int id, boolean state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_set_state_sync(Ptr<extcon_dev> edev, @Unsigned int id, boolean state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_sync(Ptr<extcon_dev> edev, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_unregister_notifier(Ptr<extcon_dev> edev, @Unsigned int id, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int extcon_unregister_notifier_all(Ptr<extcon_dev> edev, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct extcon_dev_notifier_devres")
    @NotUsableInJava
    public static class extcon_dev_notifier_devres
    extends Struct {
        public Ptr<extcon_dev> edev;
        public @Unsigned int id;
        public Ptr<misc.notifier_block> nb;
    }

    @Type(noCCodeGeneration=true, cType="struct __extcon_info")
    @NotUsableInJava
    public static class __extcon_info
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int id;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct extcon_cable")
    @NotUsableInJava
    public static class extcon_cable
    extends Struct {
        public Ptr<extcon_dev> edev;
        public int cable_index;
        public AttributeDefinitions.attribute_group attr_g;
        public DeviceDefinitions.device_attribute attr_name;
        public DeviceDefinitions.device_attribute attr_state;
        public Ptr<runtime.attribute> @Size(value=3) [] attrs;
        public extcon_property_value @Size(value=3) [] usb_propval;
        public extcon_property_value @Size(value=1) [] chg_propval;
        public extcon_property_value @Size(value=1) [] jack_propval;
        public extcon_property_value @Size(value=2) [] disp_propval;
        public @Unsigned long @Size(value=1) [] usb_bits;
        public @Unsigned long @Size(value=1) [] chg_bits;
        public @Unsigned long @Size(value=1) [] jack_bits;
        public @Unsigned long @Size(value=1) [] disp_bits;
    }

    @Type(noCCodeGeneration=true, cType="struct extcon_dev")
    @NotUsableInJava
    public static class extcon_dev
    extends Struct {
        public String name;
        public Ptr<@Unsigned Integer> supported_cable;
        public Ptr<@Unsigned Integer> mutually_exclusive;
        public runtime.device dev;
        public @Unsigned int id;
        public RawDefinitions.raw_notifier_head nh_all;
        public Ptr<RawDefinitions.raw_notifier_head> nh;
        public ListDefinitions.list_head entry;
        public int max_supported;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int state;
        public DeviceDefinitions.device_type extcon_dev_type;
        public Ptr<extcon_cable> cables;
        public AttributeDefinitions.attribute_group attr_g_muex;
        public Ptr<Ptr<runtime.attribute>> attrs_muex;
        public Ptr<DeviceDefinitions.device_attribute> d_attrs_muex;
    }

    @Type(noCCodeGeneration=true, cType="union extcon_property_value")
    @NotUsableInJava
    public static class extcon_property_value
    extends Union {
        public int intval;
    }
}

