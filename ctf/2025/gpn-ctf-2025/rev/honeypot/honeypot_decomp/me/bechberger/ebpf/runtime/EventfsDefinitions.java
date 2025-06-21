/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.TracefsDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EventfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="eventfs_create_dir((const u8*)$arg1, $arg2, (const struct eventfs_entry*)$arg3, $arg4, $arg5)")
    public static Ptr<eventfs_inode> eventfs_create_dir(String name, Ptr<eventfs_inode> parent, Ptr<eventfs_entry> entries, int size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eventfs_create_events_dir((const u8*)$arg1, $arg2, (const struct eventfs_entry*)$arg3, $arg4, $arg5)")
    public static Ptr<eventfs_inode> eventfs_create_events_dir(String name, Ptr<runtime.dentry> parent, Ptr<eventfs_entry> entries, int size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eventfs_d_release(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> eventfs_get_inode(Ptr<runtime.dentry> dentry2, Ptr<eventfs_attr> attr2, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<eventfs_inode> ei) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eventfs_iterate(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eventfs_remount(Ptr<TracefsDefinitions.tracefs_inode> ti, boolean update_uid, boolean update_gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eventfs_remove_dir(Ptr<eventfs_inode> ei) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eventfs_remove_events_dir(Ptr<eventfs_inode> ei) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eventfs_remove_rec(Ptr<eventfs_inode> ei, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> eventfs_root_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eventfs_set_attr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eventfs_set_attrs(Ptr<eventfs_inode> ei, boolean update_uid, misc.kuid_t uid, boolean update_gid, misc.kgid_t gid, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct eventfs_root_inode")
    @NotUsableInJava
    public static class eventfs_root_inode
    extends Struct {
        public eventfs_inode ei;
        public Ptr<runtime.dentry> events_dir;
    }

    @Type(noCCodeGeneration=true, cType="struct eventfs_inode")
    @NotUsableInJava
    public static class eventfs_inode
    extends Struct {
        @InlineUnion(value=1859)
        public @InlineUnion(value=1859) ListDefinitions.list_head list;
        @InlineUnion(value=1859)
        public @InlineUnion(value=1859) misc.callback_head rcu;
        public ListDefinitions.list_head children;
        public Ptr<eventfs_entry> entries;
        public String name;
        public Ptr<eventfs_attr> entry_attrs;
        public Ptr<?> data;
        public eventfs_attr attr;
        public runtime.kref kref;
        public @Unsigned int is_freed;
        public @Unsigned int is_events;
        public @Unsigned int nr_entries;
        public @Unsigned int ino;
    }

    @Type(noCCodeGeneration=true, cType="struct eventfs_attr")
    @NotUsableInJava
    public static class eventfs_attr
    extends Struct {
        public int mode;
        public misc.kuid_t uid;
        public misc.kgid_t gid;
    }

    @Type(noCCodeGeneration=true, cType="struct eventfs_entry")
    @NotUsableInJava
    public static class eventfs_entry
    extends Struct {
        public String name;
        public @OriginalName(value="eventfs_callback") Ptr<?> callback;
        public @OriginalName(value="eventfs_release") Ptr<?> release;
    }
}

