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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SysfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysfs_add_battery(Ptr<AcpiDefinitions.acpi_battery> battery) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_add_bin_file_mode_ns($arg1, (const struct bin_attribute*)$arg2, $arg3, $arg4, $arg5, (const void*)$arg6)")
    public static int sysfs_add_bin_file_mode_ns(Ptr<KernfsDefinitions.kernfs_node> parent, Ptr<misc.bin_attribute> battr, @Unsigned @OriginalName(value="umode_t") short mode, misc.kuid_t uid, misc.kgid_t gid, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_add_file_mode_ns($arg1, (const struct attribute*)$arg2, $arg3, $arg4, $arg5, (const void*)$arg6)")
    public static int sysfs_add_file_mode_ns(Ptr<KernfsDefinitions.kernfs_node> parent, Ptr<runtime.attribute> attr2, @Unsigned @OriginalName(value="umode_t") short mode, misc.kuid_t uid, misc.kgid_t gid, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_add_file_to_group($arg1, (const struct attribute*)$arg2, (const u8*)$arg3)")
    public static int sysfs_add_file_to_group(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sysfs_bin_attr_simple_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sysfs_blk_trace_attr_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_blk_trace_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long sysfs_blk_trace_attr_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_break_active_protection($arg1, (const struct attribute*)$arg2)")
    public static Ptr<KernfsDefinitions.kernfs_node> sysfs_break_active_protection(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysfs_change_owner(Ptr<runtime.kobject> kobj, misc.kuid_t kuid, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_chmod_file($arg1, (const struct attribute*)$arg2, $arg3)")
    public static int sysfs_chmod_file(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_bin_file($arg1, (const struct bin_attribute*)$arg2)")
    public static int sysfs_create_bin_file(Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_file_ns($arg1, (const struct attribute*)$arg2, (const void*)$arg3)")
    public static int sysfs_create_file_ns(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_files($arg1, (const struct attribute**)$arg2)")
    public static int sysfs_create_files(Ptr<runtime.kobject> kobj, Ptr<Ptr<runtime.attribute>> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_emit($arg1, (const u8*)$arg2, $arg3_)")
    public static int sysfs_emit(String buf, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_emit_at($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static int sysfs_emit_at(String buf, int at, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_file_change_owner($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int sysfs_file_change_owner(Ptr<runtime.kobject> kobj, String name, misc.kuid_t kuid, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysfs_fs_context_free(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysfs_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_get_uname((const u8*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long sysfs_get_uname(String buf, String dst, @Unsigned long cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysfs_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long sysfs_kf_bin_llseek(Ptr<KernfsDefinitions.kernfs_open_file> of, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysfs_kf_bin_mmap(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysfs_kf_bin_open(Ptr<KernfsDefinitions.kernfs_open_file> of) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sysfs_kf_bin_read(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long count, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sysfs_kf_bin_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long count, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sysfs_kf_read(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long count, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysfs_kf_seq_show(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long sysfs_kf_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long count, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysfs_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_link_change_owner($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int sysfs_link_change_owner(Ptr<runtime.kobject> kobj, Ptr<runtime.kobject> targ, String name, misc.kuid_t kuid, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_notify($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void sysfs_notify(Ptr<runtime.kobject> kobj, String dir, String attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysfs_remove_battery(Ptr<AcpiDefinitions.acpi_battery> battery) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_bin_file($arg1, (const struct bin_attribute*)$arg2)")
    public static void sysfs_remove_bin_file(Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_file_from_group($arg1, (const struct attribute*)$arg2, (const u8*)$arg3)")
    public static void sysfs_remove_file_from_group(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_file_ns($arg1, (const struct attribute*)$arg2, (const void*)$arg3)")
    public static void sysfs_remove_file_ns(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_file_self($arg1, (const struct attribute*)$arg2)")
    public static boolean sysfs_remove_file_self(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_files($arg1, (const struct attribute**)$arg2)")
    public static void sysfs_remove_files(Ptr<runtime.kobject> kobj, Ptr<Ptr<runtime.attribute>> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysfs_slab_add(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_slab_alias($arg1, (const u8*)$arg2)")
    public static int sysfs_slab_alias(Ptr<KmemDefinitions.kmem_cache> s2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysfs_slab_release(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysfs_slab_unlink(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysfs_unbreak_active_protection(Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_link($arg1, $arg2, (const u8*)$arg3)")
    public static int sysfs_create_link(Ptr<runtime.kobject> kobj, Ptr<runtime.kobject> target, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_link_nowarn($arg1, $arg2, (const u8*)$arg3)")
    public static int sysfs_create_link_nowarn(Ptr<runtime.kobject> kobj, Ptr<runtime.kobject> target, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_link_sd($arg1, $arg2, (const u8*)$arg3)")
    public static int sysfs_create_link_sd(Ptr<KernfsDefinitions.kernfs_node> kn, Ptr<runtime.kobject> target, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_delete_link($arg1, $arg2, (const u8*)$arg3)")
    public static void sysfs_delete_link(Ptr<runtime.kobject> kobj, Ptr<runtime.kobject> targ, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_do_create_link_sd($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int sysfs_do_create_link_sd(Ptr<KernfsDefinitions.kernfs_node> parent, Ptr<runtime.kobject> target_kobj, String name, int warn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_format_mac($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long sysfs_format_mac(String buf, String addr2, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_link($arg1, (const u8*)$arg2)")
    public static void sysfs_remove_link(Ptr<runtime.kobject> kobj, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_rename_link_ns($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const void*)$arg5)")
    public static int sysfs_rename_link_ns(Ptr<runtime.kobject> kobj, Ptr<runtime.kobject> targ, String old, String _new, Ptr<?> new_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__sysfs_match_string((const u8**)$arg1, $arg2, (const u8*)$arg3)")
    public static int __sysfs_match_string(Ptr<String> array, @Unsigned long n, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_add_link_to_group($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4)")
    public static int sysfs_add_link_to_group(Ptr<runtime.kobject> kobj, String group_name, Ptr<runtime.kobject> target, String link_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_group($arg1, (const struct attribute_group*)$arg2)")
    public static int sysfs_create_group(Ptr<runtime.kobject> kobj, Ptr<AttributeDefinitions.attribute_group> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_groups($arg1, (const struct attribute_group**)$arg2)")
    public static int sysfs_create_groups(Ptr<runtime.kobject> kobj, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_group_change_owner($arg1, (const struct attribute_group*)$arg2, $arg3, $arg4)")
    public static int sysfs_group_change_owner(Ptr<runtime.kobject> kobj, Ptr<AttributeDefinitions.attribute_group> grp, misc.kuid_t kuid, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_groups_change_owner($arg1, (const struct attribute_group**)$arg2, $arg3, $arg4)")
    public static int sysfs_groups_change_owner(Ptr<runtime.kobject> kobj, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups, misc.kuid_t kuid, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_merge_group($arg1, (const struct attribute_group*)$arg2)")
    public static int sysfs_merge_group(Ptr<runtime.kobject> kobj, Ptr<AttributeDefinitions.attribute_group> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_group($arg1, (const struct attribute_group*)$arg2)")
    public static void sysfs_remove_group(Ptr<runtime.kobject> kobj, Ptr<AttributeDefinitions.attribute_group> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_groups($arg1, (const struct attribute_group**)$arg2)")
    public static void sysfs_remove_groups(Ptr<runtime.kobject> kobj, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_link_from_group($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void sysfs_remove_link_from_group(Ptr<runtime.kobject> kobj, String group_name, String link_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_streq((const u8*)$arg1, (const u8*)$arg2)")
    public static boolean sysfs_streq(String s1, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_unmerge_group($arg1, (const struct attribute_group*)$arg2)")
    public static void sysfs_unmerge_group(Ptr<runtime.kobject> kobj, Ptr<AttributeDefinitions.attribute_group> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_update_group($arg1, (const struct attribute_group*)$arg2)")
    public static int sysfs_update_group(Ptr<runtime.kobject> kobj, Ptr<AttributeDefinitions.attribute_group> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_update_groups($arg1, (const struct attribute_group**)$arg2)")
    public static int sysfs_update_groups(Ptr<runtime.kobject> kobj, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysfs_wi_release(Ptr<runtime.kobject> wi_kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_add_group($arg1, (const struct attribute_group*)$arg2)")
    public static int sysfs_add_group(Ptr<runtime.kobject> kobj, Ptr<AttributeDefinitions.attribute_group> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_dir_ns($arg1, (const void*)$arg2)")
    public static int sysfs_create_dir_ns(Ptr<runtime.kobject> kobj, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_create_mount_point($arg1, (const u8*)$arg2)")
    public static int sysfs_create_mount_point(Ptr<runtime.kobject> parent_kobj, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_move_dir_ns($arg1, $arg2, (const void*)$arg3)")
    public static int sysfs_move_dir_ns(Ptr<runtime.kobject> kobj, Ptr<runtime.kobject> new_parent_kobj, Ptr<?> new_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysfs_remove_dir(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_remove_mount_point($arg1, (const u8*)$arg2)")
    public static void sysfs_remove_mount_point(Ptr<runtime.kobject> parent_kobj, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_rename_dir_ns($arg1, (const u8*)$arg2, (const void*)$arg3)")
    public static int sysfs_rename_dir_ns(Ptr<runtime.kobject> kobj, String new_name, Ptr<?> new_ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysfs_warn_dup($arg1, (const u8*)$arg2)")
    public static void sysfs_warn_dup(Ptr<KernfsDefinitions.kernfs_node> parent, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct xarray irqs; struct mutex lock; _Bool irq_dir_exists; }")
    @NotUsableInJava
    public static class sysfs_of_auxiliary_device
    extends Struct {
        public runtime.xarray irqs;
        public runtime.mutex lock;
        public boolean irq_dir_exists;
    }

    @Type(noCCodeGeneration=true, cType="struct sysfs_ops")
    @NotUsableInJava
    public static class sysfs_ops
    extends Struct {
        public Ptr<?> show;
        public Ptr<?> store;
    }
}

