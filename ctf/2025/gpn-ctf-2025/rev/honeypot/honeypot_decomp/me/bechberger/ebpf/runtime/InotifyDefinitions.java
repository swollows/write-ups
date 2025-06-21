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
import me.bechberger.ebpf.runtime.FsnotifyDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class InotifyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="inotify_find_inode((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int inotify_find_inode(String dirname, Ptr<runtime.path> path2, @Unsigned int flags, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<inotify_inode_mark> inotify_idr_find(Ptr<FsnotifyDefinitions.fsnotify_group> group, int wd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inotify_ignored_and_remove_idr(Ptr<FsnotifyDefinitions.fsnotify_mark> fsn_mark, Ptr<FsnotifyDefinitions.fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long inotify_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inotify_new_watch(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<runtime.inode> inode2, @Unsigned int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int inotify_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long inotify_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inotify_release(Ptr<runtime.inode> ignored, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inotify_remove_from_idr(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<inotify_inode_mark> i_mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inotify_update_watch(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<runtime.inode> inode2, @Unsigned int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inotify_user_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inotify_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<FsnotifyDefinitions.fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inotify_free_event(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<FsnotifyDefinitions.fsnotify_event> fsn_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inotify_free_group_priv(Ptr<FsnotifyDefinitions.fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inotify_free_mark(Ptr<FsnotifyDefinitions.fsnotify_mark> fsn_mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inotify_freeing_mark(Ptr<FsnotifyDefinitions.fsnotify_mark> fsn_mark, Ptr<FsnotifyDefinitions.fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inotify_handle_inode_event($arg1, $arg2, $arg3, $arg4, (const struct qstr*)$arg5, $arg6)")
    public static int inotify_handle_inode_event(Ptr<FsnotifyDefinitions.fsnotify_mark> inode_mark, @Unsigned int mask, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> name, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inotify_merge(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<FsnotifyDefinitions.fsnotify_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inotify_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct inotify_inode_mark")
    @NotUsableInJava
    public static class inotify_inode_mark
    extends Struct {
        public FsnotifyDefinitions.fsnotify_mark fsn_mark;
        public int wd;
    }

    @Type(noCCodeGeneration=true, cType="struct inotify_event_info")
    @NotUsableInJava
    public static class inotify_event_info
    extends Struct {
        public FsnotifyDefinitions.fsnotify_event fse;
        public @Unsigned int mask;
        public int wd;
        public @Unsigned int sync_cookie;
        public int name_len;
        public char @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct inotify_event")
    @NotUsableInJava
    public static class inotify_event
    extends Struct {
        public int wd;
        public @Unsigned int mask;
        public @Unsigned int cookie;
        public @Unsigned int len;
        public char @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct inotify_group_private_data")
    @NotUsableInJava
    public static class inotify_group_private_data
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock idr_lock;
        public runtime.idr idr;
        public Ptr<runtime.ucounts> ucounts;
    }
}

