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
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fs_context> fs_context_for_mount(Ptr<FileDefinitions.file_system_type> fs_type, @Unsigned int sb_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fs_context> fs_context_for_reconfigure(Ptr<runtime.dentry> dentry2, @Unsigned int sb_flags, @Unsigned int sb_flags_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fs_context> fs_context_for_submount(Ptr<FileDefinitions.file_system_type> type2, Ptr<runtime.dentry> reference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fs_names_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__fs_parse($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int __fs_parse(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> desc, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char fs_ftype_to_dtype(@Unsigned int filetype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fs_lookup_param(Ptr<fs_context> fc, Ptr<fs_parameter> param2, boolean want_bdev, @Unsigned int flags, Ptr<runtime.path> _path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short fs_nonleaf_hit_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short fs_nonleaf_lookup_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_blob($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_blob(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_blockdev($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_blockdev(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_bool($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_bool(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_enum($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_enum(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_fd($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_fd(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_gid($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_gid(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_path($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_path(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_s32($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_s32(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_string($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_string(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_u32($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_u32(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_u64($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_u64(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_param_is_uid($arg1, (const struct fs_parameter_spec*)$arg2, $arg3, $arg4)")
    public static int fs_param_is_uid(Ptr<misc.p_log> log, Ptr<fs_parameter_spec> p, Ptr<fs_parameter> param2, Ptr<fs_parse_result> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char fs_umode_to_dtype(@Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char fs_umode_to_ftype(@Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_validate_description((const u8*)$arg1, (const struct fs_parameter_spec*)$arg2)")
    public static boolean fs_validate_description(String name, Ptr<fs_parameter_spec> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fs_add_slot(Ptr<PciDefinitions.pci_slot> pci_slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fs_bdev_freeze(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fs_bdev_mark_dead(Ptr<BlockDefinitions.block_device> bdev, boolean surprise) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fs_bdev_sync(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fs_bdev_thaw(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_dax_get_by_bdev($arg1, $arg2, $arg3, (const struct dax_holder_operations*)$arg4)")
    public static Ptr<DaxDefinitions.dax_device> fs_dax_get_by_bdev(Ptr<BlockDefinitions.block_device> bdev, Ptr<@Unsigned Long> start_off, Ptr<?> holder, Ptr<DaxDefinitions.dax_holder_operations> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fs_index((const u8*)$arg1)")
    public static int fs_index(String __name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fs_name(@Unsigned int index2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fs_put_dax(Ptr<DaxDefinitions.dax_device> dax_dev, Ptr<?> holder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fs_quota_statv")
    @NotUsableInJava
    public static class fs_quota_statv
    extends Struct {
        public byte qs_version;
        public char qs_pad1;
        public @Unsigned short qs_flags;
        public @Unsigned int qs_incoredqs;
        public fs_qfilestatv qs_uquota;
        public fs_qfilestatv qs_gquota;
        public fs_qfilestatv qs_pquota;
        public int qs_btimelimit;
        public int qs_itimelimit;
        public int qs_rtbtimelimit;
        public @Unsigned short qs_bwarnlimit;
        public @Unsigned short qs_iwarnlimit;
        public @Unsigned short qs_rtbwarnlimit;
        public @Unsigned short qs_pad3;
        public @Unsigned int qs_pad4;
        public @Unsigned long @Size(value=7) [] qs_pad2;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_qfilestatv")
    @NotUsableInJava
    public static class fs_qfilestatv
    extends Struct {
        public @Unsigned long qfs_ino;
        public @Unsigned long qfs_nblks;
        public @Unsigned int qfs_nextents;
        public @Unsigned int qfs_pad;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_quota_stat")
    @NotUsableInJava
    public static class fs_quota_stat
    extends Struct {
        public byte qs_version;
        public @Unsigned short qs_flags;
        public byte qs_pad;
        public @OriginalName(value="fs_qfilestat_t") fs_qfilestat qs_uquota;
        public @OriginalName(value="fs_qfilestat_t") fs_qfilestat qs_gquota;
        public @Unsigned int qs_incoredqs;
        public int qs_btimelimit;
        public int qs_itimelimit;
        public int qs_rtbtimelimit;
        public @Unsigned short qs_bwarnlimit;
        public @Unsigned short qs_iwarnlimit;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_qfilestat")
    @NotUsableInJava
    public static class fs_qfilestat
    extends Struct {
        public @Unsigned long qfs_ino;
        public @Unsigned long qfs_nblks;
        public @Unsigned int qfs_nextents;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_disk_quota")
    @NotUsableInJava
    public static class fs_disk_quota
    extends Struct {
        public byte d_version;
        public byte d_flags;
        public @Unsigned short d_fieldmask;
        public @Unsigned int d_id;
        public @Unsigned long d_blk_hardlimit;
        public @Unsigned long d_blk_softlimit;
        public @Unsigned long d_ino_hardlimit;
        public @Unsigned long d_ino_softlimit;
        public @Unsigned long d_bcount;
        public @Unsigned long d_icount;
        public int d_itimer;
        public int d_btimer;
        public @Unsigned short d_iwarns;
        public @Unsigned short d_bwarns;
        public byte d_itimer_hi;
        public byte d_btimer_hi;
        public byte d_rtbtimer_hi;
        public byte d_padding2;
        public @Unsigned long d_rtb_hardlimit;
        public @Unsigned long d_rtb_softlimit;
        public @Unsigned long d_rtbcount;
        public int d_rtbtimer;
        public @Unsigned short d_rtbwarns;
        public short d_padding3;
        public char @Size(value=8) [] d_padding4;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_error_report")
    @NotUsableInJava
    public static class fs_error_report
    extends Struct {
        public int error;
        public Ptr<runtime.inode> inode;
        public Ptr<SuperDefinitions.super_block> sb;
    }

    @Type(noCCodeGeneration=true, cType="struct { const u8*; struct { unsigned int val; } ouid; }")
    @NotUsableInJava
    public static class fs_of_anon_member_of_anon_member_of_anon_member_of_apparmor_audit_data
    extends Struct {
        public String target;
        public misc.kuid_t ouid;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_struct")
    @NotUsableInJava
    public static class fs_struct
    extends Struct {
        public int users;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @OriginalName(value="seqcount_spinlock_t") misc.seqcount_spinlock seq;
        public int umask;
        public int in_exec;
        public runtime.path root;
        public runtime.path pwd;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_sysfs_path")
    @NotUsableInJava
    public static class fs_sysfs_path
    extends Struct {
        public char len;
        public char @Size(value=128) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_pin")
    @NotUsableInJava
    public static class fs_pin
    extends Struct {
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public int done;
        public misc.hlist_node s_list;
        public misc.hlist_node m_list;
        public Ptr<?> kill;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_parse_result")
    @NotUsableInJava
    public static class fs_parse_result
    extends Struct {
        public boolean negated;
        @InlineUnion(value=4818)
        public @InlineUnion(value=4818) boolean _boolean;
        @InlineUnion(value=4818)
        public @InlineUnion(value=4818) int int_32;
        @InlineUnion(value=4818)
        public @InlineUnion(value=4818) @Unsigned int uint_32;
        @InlineUnion(value=4818)
        public @InlineUnion(value=4818) @Unsigned long uint_64;
        @InlineUnion(value=4818)
        public @InlineUnion(value=4818) misc.kuid_t uid;
        @InlineUnion(value=4818)
        public @InlineUnion(value=4818) misc.kgid_t gid;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_context_operations")
    @NotUsableInJava
    public static class fs_context_operations
    extends Struct {
        public Ptr<?> free;
        public Ptr<?> dup;
        public Ptr<?> parse_param;
        public Ptr<?> parse_monolithic;
        public Ptr<?> get_tree;
        public Ptr<?> reconfigure;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_parameter")
    @NotUsableInJava
    public static class fs_parameter
    extends Struct {
        public String key;
        public fs_value_type type;
        @InlineUnion(value=4742)
        public @InlineUnion(value=4742) String string;
        @InlineUnion(value=4742)
        public @InlineUnion(value=4742) Ptr<?> blob;
        @InlineUnion(value=4742)
        public @InlineUnion(value=4742) Ptr<runtime.filename> name;
        @InlineUnion(value=4742)
        public @InlineUnion(value=4742) Ptr<runtime.file> file;
        public @Unsigned long size;
        public int dirfd;
    }

    @Type(noCCodeGeneration=true, cType="enum fs_value_type")
    public static enum fs_value_type implements Enum<fs_value_type>,
    TypedEnum<fs_value_type, Integer>
    {
        fs_value_is_undefined,
        fs_value_is_flag,
        fs_value_is_string,
        fs_value_is_blob,
        fs_value_is_filename,
        fs_value_is_file;

    }

    @Type(noCCodeGeneration=true, cType="enum fs_context_phase")
    public static enum fs_context_phase implements Enum<fs_context_phase>,
    TypedEnum<fs_context_phase, Integer>
    {
        FS_CONTEXT_CREATE_PARAMS,
        FS_CONTEXT_CREATING,
        FS_CONTEXT_AWAITING_MOUNT,
        FS_CONTEXT_AWAITING_RECONF,
        FS_CONTEXT_RECONF_PARAMS,
        FS_CONTEXT_RECONFIGURING,
        FS_CONTEXT_FAILED;

    }

    @Type(noCCodeGeneration=true, cType="enum fs_context_purpose")
    public static enum fs_context_purpose implements Enum<fs_context_purpose>,
    TypedEnum<fs_context_purpose, Integer>
    {
        FS_CONTEXT_FOR_MOUNT,
        FS_CONTEXT_FOR_SUBMOUNT,
        FS_CONTEXT_FOR_RECONFIGURE;

    }

    @Type(noCCodeGeneration=true, cType="struct fs_context")
    @NotUsableInJava
    public static class fs_context
    extends Struct {
        public Ptr<fs_context_operations> ops;
        public runtime.mutex uapi_mutex;
        public Ptr<FileDefinitions.file_system_type> fs_type;
        public Ptr<?> fs_private;
        public Ptr<?> sget_key;
        public Ptr<runtime.dentry> root;
        public Ptr<UserDefinitions.user_namespace> user_ns;
        public Ptr<runtime.net> net_ns;
        public Ptr<runtime.cred> cred;
        public misc.p_log log;
        public String source;
        public Ptr<?> security;
        public Ptr<?> s_fs_info;
        public @Unsigned int sb_flags;
        public @Unsigned int sb_flags_mask;
        public @Unsigned int s_iflags;
        public fs_context_purpose purpose;
        public fs_context_phase phase;
        public boolean need_free;
        public boolean global;
        public boolean oldapi;
        public boolean exclusive;
    }

    @Type(noCCodeGeneration=true, cType="struct fs_parameter_spec")
    @NotUsableInJava
    public static class fs_parameter_spec
    extends Struct {
        public String name;
        public Ptr<?> type;
        public char opt;
        public @Unsigned short flags;
        public Ptr<?> data;
    }
}

