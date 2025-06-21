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
import me.bechberger.ebpf.runtime.ConfigfsDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ConfigDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="config_group_find_item($arg1, (const u8*)$arg2)")
    public static Ptr<config_item> config_group_find_item(Ptr<config_group> group, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void config_group_init(Ptr<config_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="config_group_init_type_name($arg1, (const u8*)$arg2, (const struct config_item_type*)$arg3)")
    public static void config_group_init_type_name(Ptr<config_group> group, String name, Ptr<config_item_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void config_item_cleanup(Ptr<config_item> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<config_item> config_item_get(Ptr<config_item> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<config_item> config_item_get_unless_zero(Ptr<config_item> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="config_item_init_type_name($arg1, (const u8*)$arg2, (const struct config_item_type*)$arg3)")
    public static void config_item_init_type_name(Ptr<config_item> item, String name, Ptr<config_item_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void config_item_put(Ptr<config_item> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="config_item_set_name($arg1, (const u8*)$arg2, $arg3_)")
    public static int config_item_set_name(Ptr<config_item> item, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void config_intr(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long config_table_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void config_work_handler(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct config_s")
    @NotUsableInJava
    public static class config_s
    extends Struct {
        public @Unsigned @OriginalName(value="ush") short good_length;
        public @Unsigned @OriginalName(value="ush") short max_lazy;
        public @Unsigned @OriginalName(value="ush") short nice_length;
        public @Unsigned @OriginalName(value="ush") short max_chain;
        public @OriginalName(value="compress_func") Ptr<?> func;
    }

    @Type(noCCodeGeneration=true, cType="struct config_item_type")
    @NotUsableInJava
    public static class config_item_type
    extends Struct {
        public Ptr<runtime.module> ct_owner;
        public Ptr<ConfigfsDefinitions.configfs_item_operations> ct_item_ops;
        public Ptr<ConfigfsDefinitions.configfs_group_operations> ct_group_ops;
        public Ptr<Ptr<ConfigfsDefinitions.configfs_attribute>> ct_attrs;
        public Ptr<Ptr<ConfigfsDefinitions.configfs_bin_attribute>> ct_bin_attrs;
    }

    @Type(noCCodeGeneration=true, cType="struct config_group")
    @NotUsableInJava
    public static class config_group
    extends Struct {
        public config_item cg_item;
        public ListDefinitions.list_head cg_children;
        public Ptr<ConfigfsDefinitions.configfs_subsystem> cg_subsys;
        public ListDefinitions.list_head default_groups;
        public ListDefinitions.list_head group_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct config_item")
    @NotUsableInJava
    public static class config_item
    extends Struct {
        public String ci_name;
        public char @Size(value=20) [] ci_namebuf;
        public runtime.kref ci_kref;
        public ListDefinitions.list_head ci_entry;
        public Ptr<config_item> ci_parent;
        public Ptr<config_group> ci_group;
        public Ptr<config_item_type> ci_type;
        public Ptr<runtime.dentry> ci_dentry;
    }
}

