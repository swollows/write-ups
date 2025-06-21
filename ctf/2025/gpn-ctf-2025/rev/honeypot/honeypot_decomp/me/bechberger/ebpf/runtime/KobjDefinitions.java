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
import me.bechberger.ebpf.runtime.SysfsDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KobjDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kobj_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobj_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long kobj_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct kobj_ns_type_operations*)kobj_child_ns_ops((const struct kobject*)$arg1))")
    public static Ptr<kobj_ns_type_operations> kobj_child_ns_ops(Ptr<runtime.kobject> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kobj_ns_current_may_mount(kobj_ns_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kobj_ns_drop(kobj_ns_type type2, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kobj_ns_grab_current(kobj_ns_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)kobj_ns_initial($arg1))")
    public static Ptr<?> kobj_ns_initial(kobj_ns_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)kobj_ns_netlink($arg1, $arg2))")
    public static Ptr<?> kobj_ns_netlink(kobj_ns_type type2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct kobj_ns_type_operations*)kobj_ns_ops((const struct kobject*)$arg1))")
    public static Ptr<kobj_ns_type_operations> kobj_ns_ops(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobj_ns_type_register((const struct kobj_ns_type_operations*)$arg1)")
    public static int kobj_ns_type_register(Ptr<kobj_ns_type_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kobj_ns_type_registered(kobj_ns_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.hstate> kobj_to_hstate(Ptr<runtime.kobject> kobj, Ptr<Integer> nidp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kobject> kobj_lookup(Ptr<kobj_map> domain, @Unsigned @OriginalName(value="dev_t") int dev, Ptr<Integer> index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<kobj_map> kobj_map_init(Ptr<?> base_probe, Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kobj_unmap(Ptr<kobj_map> domain, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned long range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct probe")
    @NotUsableInJava
    public static class probe
    extends Struct {
        public Ptr<probe> next;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long range;
        public Ptr<runtime.module> owner;
        public Ptr<?> get;
        public Ptr<?> lock;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct kobj_map")
    @NotUsableInJava
    public static class kobj_map
    extends Struct {
        public Ptr<probe> @Size(value=255) [] probes;
        public Ptr<runtime.mutex> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct kobj_attribute")
    @NotUsableInJava
    public static class kobj_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct kobj_uevent_env")
    @NotUsableInJava
    public static class kobj_uevent_env
    extends Struct {
        public String @Size(value=3) [] argv;
        public String @Size(value=64) [] envp;
        public int envp_idx;
        public char @Size(value=2048) [] buf;
        public int buflen;
    }

    @Type(noCCodeGeneration=true, cType="struct kobj_type")
    @NotUsableInJava
    public static class kobj_type
    extends Struct {
        public Ptr<?> release;
        public Ptr<SysfsDefinitions.sysfs_ops> sysfs_ops;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> default_groups;
        public Ptr<?> child_ns_type;
        public Ptr<?> namespace;
        public Ptr<?> get_ownership;
    }

    @Type(noCCodeGeneration=true, cType="struct kobj_ns_type_operations")
    @NotUsableInJava
    public static class kobj_ns_type_operations
    extends Struct {
        public kobj_ns_type type;
        public Ptr<?> current_may_mount;
        public Ptr<?> grab_current_ns;
        public Ptr<?> netlink_ns;
        public Ptr<?> initial_ns;
        public Ptr<?> drop_ns;
    }

    @Type(noCCodeGeneration=true, cType="enum kobj_ns_type")
    public static enum kobj_ns_type implements Enum<kobj_ns_type>,
    TypedEnum<kobj_ns_type, Integer>
    {
        KOBJ_NS_TYPE_NONE,
        KOBJ_NS_TYPE_NET,
        KOBJ_NS_TYPES;

    }
}

