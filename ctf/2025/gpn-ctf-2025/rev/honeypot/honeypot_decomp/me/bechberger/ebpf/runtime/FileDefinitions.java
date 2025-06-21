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
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TpmDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FileDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlockDefinitions.block_device> file_bdev(Ptr<runtime.file> bdev_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_caps_disable(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="file_dentry_name($arg1, $arg2, (const struct file*)$arg3, $arg4, (const u8*)$arg5)")
    public static String file_dentry_name(String buf, String end, Ptr<runtime.file> f, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_f_owner_allocate(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void file_f_owner_release(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="file_ns_capable((const struct file*)$arg1, $arg2, $arg3)")
    public static boolean file_ns_capable(Ptr<runtime.file> file2, Ptr<UserDefinitions.user_namespace> ns, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> file_open_name(Ptr<runtime.filename> name, int flags, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="file_open_root((const struct path*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.file> file_open_root(Ptr<runtime.path> root, String filename2, int flags, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String file_path(Ptr<runtime.file> filp, String buf, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="file_has_perm((const struct cred*)$arg1, $arg2, $arg3)")
    public static int file_has_perm(Ptr<runtime.cred> cred2, Ptr<runtime.file> file2, @Unsigned int av) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="file_init_path($arg1, (const struct path*)$arg2, (const struct file_operations*)$arg3)")
    public static void file_init_path(Ptr<runtime.file> file2, Ptr<runtime.path> path2, Ptr<file_operations> fop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_map_prot_check(Ptr<runtime.file> file2, @Unsigned long prot, int shared) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void file_ra_state_init(Ptr<file_ra_state> ra, Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> file_close_fd(@Unsigned int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.file> file_close_fd_locked(Ptr<misc.files_struct> files, @Unsigned int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_modified(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_remove_privs(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_remove_privs_flags(Ptr<runtime.file> file2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="blk_mode_t") int file_to_blk_mode(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_update_time(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__file_path_perm((const u8*)$arg1, (const struct cred*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int __file_path_perm(String op, Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_label> label, Ptr<AaDefinitions.aa_label> flabel, Ptr<runtime.file> file2, @Unsigned int request2, @Unsigned int denied, boolean in_atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void file_audit_cb(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<?> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_check_and_advance_wb_err(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_fdatawait_range(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start_byte, @OriginalName(value="loff_t") long end_byte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int file_write_and_wait_range(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long lend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct file_security_struct")
    @NotUsableInJava
    public static class file_security_struct
    extends Struct {
        public @Unsigned int sid;
        public @Unsigned int fown_sid;
        public @Unsigned int isid;
        public @Unsigned int pseqno;
    }

    @Type(noCCodeGeneration=true, cType="struct file_region")
    @NotUsableInJava
    public static class file_region
    extends Struct {
        public ListDefinitions.list_head link;
        public long from;
        public long to;
        public Ptr<PageDefinitions.page_counter> reservation_counter;
        public Ptr<CgroupDefinitions.cgroup_subsys_state> css;
    }

    @Type(noCCodeGeneration=true, cType="struct file_priv")
    @NotUsableInJava
    public static class file_priv
    extends Struct {
        public Ptr<TpmDefinitions.tpm_chip> chip;
        public Ptr<TpmDefinitions.tpm_space> space;
        public runtime.mutex buffer_mutex;
        public TimerDefinitions.timer_list user_read_timer;
        public misc.work_struct timeout_work;
        public misc.work_struct async_work;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head async_wait;
        public @OriginalName(value="ssize_t") long response_length;
        public boolean response_read;
        public boolean command_enqueued;
        public char @Size(value=4096) [] data_buffer;
    }

    @Type(noCCodeGeneration=true, cType="enum file_time_flags")
    public static enum file_time_flags implements Enum<file_time_flags>,
    TypedEnum<file_time_flags, Integer>
    {
        S_ATIME,
        S_MTIME,
        S_CTIME,
        S_VERSION;

    }

    @Type(noCCodeGeneration=true, cType="struct file_lock_list_struct")
    @NotUsableInJava
    public static class file_lock_list_struct
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.hlist_head hlist;
    }

    @Type(noCCodeGeneration=true, cType="struct file_handle")
    @NotUsableInJava
    public static class file_handle
    extends Struct {
        public @Unsigned int handle_bytes;
        public int handle_type;
        public char @Size(value=0) [] f_handle;
    }

    @Type(noCCodeGeneration=true, cType="struct file_lock_core")
    @NotUsableInJava
    public static class file_lock_core
    extends Struct {
        public Ptr<file_lock_core> flc_blocker;
        public ListDefinitions.list_head flc_list;
        public misc.hlist_node flc_link;
        public ListDefinitions.list_head flc_blocked_requests;
        public ListDefinitions.list_head flc_blocked_member;
        public @OriginalName(value="fl_owner_t") Ptr<?> flc_owner;
        public @Unsigned int flc_flags;
        public char flc_type;
        public @OriginalName(value="pid_t") int flc_pid;
        public int flc_link_cpu;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head flc_wait;
        public Ptr<runtime.file> flc_file;
    }

    @Type(noCCodeGeneration=true, cType="struct file_lock_operations")
    @NotUsableInJava
    public static class file_lock_operations
    extends Struct {
        public Ptr<?> fl_copy_lock;
        public Ptr<?> fl_release_private;
    }

    @Type(noCCodeGeneration=true, cType="struct file_lease")
    @NotUsableInJava
    public static class file_lease
    extends Struct {
        public file_lock_core c;
        public Ptr<misc.fasync_struct> fl_fasync;
        public @Unsigned long fl_break_time;
        public @Unsigned long fl_downgrade_time;
        public Ptr<misc.lease_manager_operations> fl_lmops;
    }

    @Type(noCCodeGeneration=true, cType="struct file_lock")
    @NotUsableInJava
    public static class file_lock
    extends Struct {
        public file_lock_core c;
        public @OriginalName(value="loff_t") long fl_start;
        public @OriginalName(value="loff_t") long fl_end;
        public Ptr<file_lock_operations> fl_ops;
        public Ptr<LockDefinitions.lock_manager_operations> fl_lmops;
        public misc.fl_u_of_file_lock fl_u;
    }

    @Type(noCCodeGeneration=true, cType="struct file_lock_context")
    @NotUsableInJava
    public static class file_lock_context
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock flc_lock;
        public ListDefinitions.list_head flc_flock;
        public ListDefinitions.list_head flc_posix;
        public ListDefinitions.list_head flc_lease;
    }

    @Type(noCCodeGeneration=true, cType="struct file_dedupe_range")
    @NotUsableInJava
    public static class file_dedupe_range
    extends Struct {
        public @Unsigned long src_offset;
        public @Unsigned long src_length;
        public @Unsigned short dest_count;
        public @Unsigned short reserved1;
        public @Unsigned int reserved2;
        public file_dedupe_range_info @Size(value=0) [] info;
    }

    @Type(noCCodeGeneration=true, cType="struct file_dedupe_range_info")
    @NotUsableInJava
    public static class file_dedupe_range_info
    extends Struct {
        public long dest_fd;
        public @Unsigned long dest_offset;
        public @Unsigned long bytes_deduped;
        public int status;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct file_clone_range")
    @NotUsableInJava
    public static class file_clone_range
    extends Struct {
        public long src_fd;
        public @Unsigned long src_offset;
        public @Unsigned long src_length;
        public @Unsigned long dest_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct file_ra_state")
    @NotUsableInJava
    public static class file_ra_state
    extends Struct {
        public @Unsigned long start;
        public @Unsigned int size;
        public @Unsigned int async_size;
        public @Unsigned int ra_pages;
        public @Unsigned int mmap_miss;
        public @OriginalName(value="loff_t") long prev_pos;
    }

    @Type(noCCodeGeneration=true, cType="struct file_operations")
    @NotUsableInJava
    public static class file_operations
    extends Struct {
        public Ptr<runtime.module> owner;
        public @Unsigned @OriginalName(value="fop_flags_t") int fop_flags;
        public Ptr<?> llseek;
        public Ptr<?> read;
        public Ptr<?> write;
        public Ptr<?> read_iter;
        public Ptr<?> write_iter;
        public Ptr<?> iopoll;
        public Ptr<?> iterate_shared;
        public Ptr<?> poll;
        public Ptr<?> unlocked_ioctl;
        public Ptr<?> compat_ioctl;
        public Ptr<?> mmap;
        public Ptr<?> open;
        public Ptr<?> flush;
        public Ptr<?> release;
        public Ptr<?> fsync;
        public Ptr<?> fasync;
        public Ptr<?> lock;
        public Ptr<?> get_unmapped_area;
        public Ptr<?> check_flags;
        public Ptr<?> flock;
        public Ptr<?> splice_write;
        public Ptr<?> splice_read;
        public Ptr<?> splice_eof;
        public Ptr<?> setlease;
        public Ptr<?> fallocate;
        public Ptr<?> show_fdinfo;
        public Ptr<?> copy_file_range;
        public Ptr<?> remap_file_range;
        public Ptr<?> fadvise;
        public Ptr<?> uring_cmd;
        public Ptr<?> uring_cmd_iopoll;
    }

    @Type(noCCodeGeneration=true, cType="struct file_system_type")
    @NotUsableInJava
    public static class file_system_type
    extends Struct {
        public String name;
        public int fs_flags;
        public Ptr<?> init_fs_context;
        public Ptr<FsDefinitions.fs_parameter_spec> parameters;
        public Ptr<?> mount;
        public Ptr<?> kill_sb;
        public Ptr<runtime.module> owner;
        public Ptr<file_system_type> next;
        public misc.hlist_head fs_supers;
        public LockDefinitions.lock_class_key s_lock_key;
        public LockDefinitions.lock_class_key s_umount_key;
        public LockDefinitions.lock_class_key s_vfs_rename_key;
        public LockDefinitions.lock_class_key @Size(value=3) [] s_writers_key;
        public LockDefinitions.lock_class_key i_lock_key;
        public LockDefinitions.lock_class_key i_mutex_key;
        public LockDefinitions.lock_class_key invalidate_lock_key;
        public LockDefinitions.lock_class_key i_mutex_dir_key;
    }
}

