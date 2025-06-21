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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MntDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __mnt_is_readonly(Ptr<runtime.vfsmount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_add_to_ns(Ptr<mnt_namespace> ns, Ptr<runtime.mount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_change_mountpoint(Ptr<runtime.mount> parent, Ptr<runtime.mountpoint> mp, Ptr<runtime.mount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mnt_clone_internal((const struct path*)$arg1)")
    public static Ptr<runtime.vfsmount> mnt_clone_internal(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_drop_write(Ptr<runtime.vfsmount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_drop_write_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mnt_get_count(Ptr<runtime.mount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mnt_get_write_access(Ptr<runtime.vfsmount> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mnt_get_write_access_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mnt_get_writers(Ptr<runtime.mount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_make_shortterm(Ptr<runtime.vfsmount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mnt_may_suid(Ptr<runtime.vfsmount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_ns_release(Ptr<mnt_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_ns_tree_add(Ptr<mnt_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_put_write_access(Ptr<runtime.vfsmount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_put_write_access_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_release_group_id(Ptr<runtime.mount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_set_expiry(Ptr<runtime.vfsmount> mnt, Ptr<ListDefinitions.list_head> expiry_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_set_mountpoint(Ptr<runtime.mount> mnt, Ptr<runtime.mountpoint> mp, Ptr<runtime.mount> child_mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mnt_want_write(Ptr<runtime.vfsmount> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mnt_want_write_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_warn_timestamp_expiry(Ptr<runtime.path> mountpoint2, Ptr<runtime.vfsmount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mnt_idmap> mnt_idmap_get(Ptr<mnt_idmap> idmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_idmap_put(Ptr<mnt_idmap> idmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mnt_pin_kill(Ptr<runtime.mount> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mnt_idmap")
    @NotUsableInJava
    public static class mnt_idmap
    extends Struct {
        public misc.uid_gid_map uid_map;
        public misc.uid_gid_map gid_map;
        public  @OriginalName(value="refcount_t") misc.refcount_struct count;
    }

    @Type(noCCodeGeneration=true, cType="struct mnt_ns_info")
    @NotUsableInJava
    public static class mnt_ns_info
    extends Struct {
        public @Unsigned int size;
        public @Unsigned int nr_mounts;
        public @Unsigned long mnt_ns_id;
    }

    @Type(noCCodeGeneration=true, cType="enum mnt_tree_flags_t")
    public static enum mnt_tree_flags_t implements Enum<mnt_tree_flags_t>,
    TypedEnum<mnt_tree_flags_t, Integer>
    {
        MNT_TREE_MOVE,
        MNT_TREE_BENEATH;

    }

    @Type(noCCodeGeneration=true, cType="struct mnt_id_req")
    @NotUsableInJava
    public static class mnt_id_req
    extends Struct {
        public @Unsigned int size;
        public @Unsigned int spare;
        public @Unsigned long mnt_id;
        public @Unsigned long param;
        public @Unsigned long mnt_ns_id;
    }

    @Type(noCCodeGeneration=true, cType="struct { const u8*; const u8*; const u8*; const u8*; long unsigned int flags; }")
    @NotUsableInJava
    public static class mnt_of_anon_member_of_apparmor_audit_data
    extends Struct {
        public String src_name;
        public String type;
        public String trans;
        public String data;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct mnt_pcp")
    @NotUsableInJava
    public static class mnt_pcp
    extends Struct {
        public int mnt_count;
        public int mnt_writers;
    }

    @Type(noCCodeGeneration=true, cType="struct mnt_namespace")
    @NotUsableInJava
    public static class mnt_namespace
    extends Struct {
        public NsDefinitions.ns_common ns;
        public Ptr<runtime.mount> root;
        public RbDefinitions.rb_root mounts;
        public Ptr<UserDefinitions.user_namespace> user_ns;
        public Ptr<runtime.ucounts> ucounts;
        public @Unsigned long seq;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head poll;
        public @Unsigned long event;
        public @Unsigned int nr_mounts;
        public @Unsigned int pending_mounts;
        public RbDefinitions.rb_node mnt_ns_tree_node;
        public  @OriginalName(value="refcount_t") misc.refcount_struct passive;
    }
}

