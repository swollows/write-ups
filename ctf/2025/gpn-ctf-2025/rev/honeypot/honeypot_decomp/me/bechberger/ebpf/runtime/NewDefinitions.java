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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KmallocDefinitions;
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class NewDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="new_dev_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long new_dev_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long new_level_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="new_level_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long new_level_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long new_offset_show(Ptr<MdDefinitions.md_rdev> rdev, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="new_offset_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long new_offset_store(Ptr<MdDefinitions.md_rdev> rdev, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int new_userfaultfd(int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> new_vmap_block(@Unsigned int order, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ConfigfsDefinitions.configfs_fragment> new_fragment() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="new_id_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long new_id_store(Ptr<DeviceDefinitions.device_driver> driver, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="new_idmap_permitted((const struct file*)$arg1, $arg2, $arg3, $arg4)")
    public static boolean new_idmap_permitted(Ptr<runtime.file> file2, Ptr<UserDefinitions.user_namespace> ns, int cap_setid, Ptr<misc.uid_gid_map> new_map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="new_policy($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long new_policy(Ptr<runtime.file> f, String data, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="new_dir($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<misc.ctl_dir> new_dir(Ptr<misc.ctl_table_set> set, String name, int namelen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long new_id_show(Ptr<DeviceDefinitions.device_driver> driver, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> new_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> new_inode_pseudo(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ctl_table_header> new_links(Ptr<misc.ctl_dir> dir, Ptr<misc.ctl_table_header> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="new_device_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long new_device_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void new_kmalloc_cache(int idx, KmallocDefinitions.kmalloc_cache_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct new_utsname")
    @NotUsableInJava
    public static class new_utsname
    extends Struct {
        public char @Size(value=65) [] sysname;
        public char @Size(value=65) [] nodename;
        public char @Size(value=65) [] release;
        public char @Size(value=65) [] version;
        public char @Size(value=65) [] machine;
        public char @Size(value=65) [] domainname;
    }
}

