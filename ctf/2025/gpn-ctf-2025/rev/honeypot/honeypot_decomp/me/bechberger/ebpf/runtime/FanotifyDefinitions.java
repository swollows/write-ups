/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.FsnotifyDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MempoolDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FanotifyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="fanotify_alloc_event($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, (const struct qstr*)$arg6, $arg7, $arg8)")
    public static Ptr<fanotify_event> fanotify_alloc_event(Ptr<FsnotifyDefinitions.fsnotify_group> group, @Unsigned int mask, Ptr<?> data, int data_type, Ptr<runtime.inode> dir, Ptr<runtime.qstr> file_name, Ptr<KernelDefinitions.__kernel_fsid_t> fsid, @Unsigned int match_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fanotify_alloc_name_event($arg1, $arg2, (const struct qstr*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static Ptr<fanotify_event> fanotify_alloc_name_event(Ptr<runtime.inode> dir, Ptr<KernelDefinitions.__kernel_fsid_t> fsid, Ptr<runtime.qstr> name, Ptr<runtime.inode> child, Ptr<runtime.dentry> moved, Ptr<@Unsigned Integer> hash2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fanotify_encode_fh(Ptr<fanotify_fh> fh, Ptr<runtime.inode> inode2, @Unsigned int fh_len, Ptr<@Unsigned Integer> hash2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fanotify_fh_equal(Ptr<fanotify_fh> fh1, Ptr<fanotify_fh> fh2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fanotify_free_event(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<FsnotifyDefinitions.fsnotify_event> fsn_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fanotify_free_group_priv(Ptr<FsnotifyDefinitions.fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fanotify_free_mark(Ptr<FsnotifyDefinitions.fsnotify_mark> fsn_mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fanotify_freeing_mark(Ptr<FsnotifyDefinitions.fsnotify_mark> mark, Ptr<FsnotifyDefinitions.fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fanotify_get_response(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<fanotify_perm_event> event2, Ptr<FsnotifyDefinitions.fsnotify_iter_info> iter_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fanotify_handle_event($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, (const struct qstr*)$arg6, $arg7, $arg8)")
    public static int fanotify_handle_event(Ptr<FsnotifyDefinitions.fsnotify_group> group, @Unsigned int mask, Ptr<?> data, int data_type, Ptr<runtime.inode> dir, Ptr<runtime.qstr> file_name, @Unsigned int cookie, Ptr<FsnotifyDefinitions.fsnotify_iter_info> iter_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fanotify_info_copy_name($arg1, (const struct qstr*)$arg2)")
    public static void fanotify_info_copy_name(Ptr<fanotify_info> info2, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fanotify_info_equal(Ptr<fanotify_info> info1, Ptr<fanotify_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fanotify_insert_event(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<FsnotifyDefinitions.fsnotify_event> fsn_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fanotify_merge(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<FsnotifyDefinitions.fsnotify_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fanotify_should_merge(Ptr<fanotify_event> old, Ptr<fanotify_event> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fanotify_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<FsnotifyDefinitions.fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fanotify_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fanotify_add_mark(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<?> obj, @Unsigned int obj_type, @Unsigned int mask, @Unsigned int fan_flags, Ptr<misc.fan_fsid> fsid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FsnotifyDefinitions.fsnotify_mark> fanotify_add_new_mark(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<?> obj, @Unsigned int obj_type, @Unsigned int fan_flags, Ptr<misc.fan_fsid> fsid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long fanotify_event_len(@Unsigned int info_mode, Ptr<fanotify_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fanotify_find_path($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int fanotify_find_path(int dfd, String filename2, Ptr<runtime.path> path2, @Unsigned int flags, @Unsigned long mask, @Unsigned int obj_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fanotify_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int fanotify_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fanotify_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fanotify_release(Ptr<runtime.inode> ignored, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fanotify_remove_mark(Ptr<FsnotifyDefinitions.fsnotify_group> group, Ptr<?> obj, @Unsigned int obj_type, @Unsigned int mask, @Unsigned int flags, @Unsigned int umask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fanotify_user_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fanotify_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long fanotify_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_mark")
    @NotUsableInJava
    public static class fanotify_mark
    extends Struct {
        public FsnotifyDefinitions.fsnotify_mark fsn_mark;
        public KernelDefinitions.__kernel_fsid_t fsid;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_perm_event")
    @NotUsableInJava
    public static class fanotify_perm_event
    extends Struct {
        public fanotify_event fae;
        public runtime.path path;
        public @Unsigned int response;
        public @Unsigned short state;
        public int fd;
        @InlineUnion(value=10183)
        public @InlineUnion(value=10183) fanotify_response_info_header hdr;
        @InlineUnion(value=10183)
        public @InlineUnion(value=10183) fanotify_response_info_audit_rule audit_rule;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_path_event")
    @NotUsableInJava
    public static class fanotify_path_event
    extends Struct {
        public fanotify_event fae;
        public runtime.path path;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_error_event")
    @NotUsableInJava
    public static class fanotify_error_event
    extends Struct {
        public fanotify_event fae;
        public int error;
        public @Unsigned int err_count;
        public KernelDefinitions.__kernel_fsid_t fsid;
        public AnonDefinitions.anon_member_of_fanotify_error_event anon4;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_name_event")
    @NotUsableInJava
    public static class fanotify_name_event
    extends Struct {
        public fanotify_event fae;
        public KernelDefinitions.__kernel_fsid_t fsid;
        public fanotify_info info;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_fid_event")
    @NotUsableInJava
    public static class fanotify_fid_event
    extends Struct {
        public fanotify_event fae;
        public KernelDefinitions.__kernel_fsid_t fsid;
        public AnonDefinitions.anon_member_of_fanotify_fid_event anon2;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_event")
    @NotUsableInJava
    public static class fanotify_event
    extends Struct {
        public FsnotifyDefinitions.fsnotify_event fse;
        public misc.hlist_node merge_list;
        public @Unsigned int mask;
        public AnonDefinitions.anon_member_of_fanotify_event anon3;
        public Ptr<runtime.pid> pid;
    }

    @Type(noCCodeGeneration=true, cType="enum fanotify_event_type")
    public static enum fanotify_event_type implements Enum<fanotify_event_type>,
    TypedEnum<fanotify_event_type, Integer>
    {
        FANOTIFY_EVENT_TYPE_FID,
        FANOTIFY_EVENT_TYPE_FID_NAME,
        FANOTIFY_EVENT_TYPE_PATH,
        FANOTIFY_EVENT_TYPE_PATH_PERM,
        FANOTIFY_EVENT_TYPE_OVERFLOW,
        FANOTIFY_EVENT_TYPE_FS_ERROR,
        __FANOTIFY_EVENT_TYPE_NUM;

    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_info")
    @NotUsableInJava
    public static class fanotify_info
    extends Struct {
        public char dir_fh_totlen;
        public char dir2_fh_totlen;
        public char file_fh_totlen;
        public char name_len;
        public char name2_len;
        public char @Size(value=3) [] pad;
        public char @Size(value=0) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_fh")
    @NotUsableInJava
    public static class fanotify_fh
    extends Struct {
        public char type;
        public char len;
        public char flags;
        public char pad;
        public char @Size(value=0) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_response_info_audit_rule")
    @NotUsableInJava
    public static class fanotify_response_info_audit_rule
    extends Struct {
        public fanotify_response_info_header hdr;
        public @Unsigned int rule_number;
        public @Unsigned int subj_trust;
        public @Unsigned int obj_trust;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_response_info_header")
    @NotUsableInJava
    public static class fanotify_response_info_header
    extends Struct {
        public char type;
        public char pad;
        public @Unsigned short len;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_response")
    @NotUsableInJava
    public static class fanotify_response
    extends Struct {
        public int fd;
        public @Unsigned int response;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_event_info_error")
    @NotUsableInJava
    public static class fanotify_event_info_error
    extends Struct {
        public fanotify_event_info_header hdr;
        public int error;
        public @Unsigned int error_count;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_event_info_pidfd")
    @NotUsableInJava
    public static class fanotify_event_info_pidfd
    extends Struct {
        public fanotify_event_info_header hdr;
        public int pidfd;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_event_info_fid")
    @NotUsableInJava
    public static class fanotify_event_info_fid
    extends Struct {
        public fanotify_event_info_header hdr;
        public KernelDefinitions.__kernel_fsid_t fsid;
        public char @Size(value=0) [] handle;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_event_info_header")
    @NotUsableInJava
    public static class fanotify_event_info_header
    extends Struct {
        public char info_type;
        public char pad;
        public @Unsigned short len;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_event_metadata")
    @NotUsableInJava
    public static class fanotify_event_metadata
    extends Struct {
        public @Unsigned int event_len;
        public char vers;
        public char reserved;
        public @Unsigned short metadata_len;
        public @Unsigned long mask;
        public int fd;
        public int pid;
    }

    @Type(noCCodeGeneration=true, cType="struct fanotify_group_private_data")
    @NotUsableInJava
    public static class fanotify_group_private_data
    extends Struct {
        public Ptr<misc.hlist_head> merge_hash;
        public ListDefinitions.list_head access_list;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head access_waitq;
        public int flags;
        public int f_flags;
        public Ptr<runtime.ucounts> ucounts;
        public @OriginalName(value="mempool_t") MempoolDefinitions.mempool_s error_events_pool;
    }
}

