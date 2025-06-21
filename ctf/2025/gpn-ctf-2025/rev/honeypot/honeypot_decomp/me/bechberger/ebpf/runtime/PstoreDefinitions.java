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
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.KmsgDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PstoreDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="pstore_compress((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static int pstore_compress(Ptr<?> in, Ptr<?> out, @Unsigned int inlen, @Unsigned int outlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_dowork(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_dump(Ptr<KmsgDefinitions.kmsg_dumper> dumper, Ptr<KmsgDefinitions.kmsg_dump_detail> detail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_get_backend_records(Ptr<pstore_info> psi, Ptr<runtime.dentry> root, int quiet) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pstore_name_to_type((const u8*)$arg1)")
    public static pstore_type_id pstore_name_to_type(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_record_init(Ptr<pstore_record> record, Ptr<pstore_info> psinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_register(Ptr<pstore_info> psi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_set_kmsg_bytes(int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_timefunc(Ptr<TimerDefinitions.timer_list> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pstore_type_to_name($arg1))")
    public static String pstore_type_to_name(pstore_type_id type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_unregister(Ptr<pstore_info> psi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pstore_write_user_compat($arg1, (const u8*)$arg2)")
    public static int pstore_write_user_compat(Ptr<pstore_record> record, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_exit_fs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long pstore_file_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long off, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_file_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pstore_file_read(Ptr<runtime.file> file2, String userbuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<?> data, int silent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pstore_ftrace_seq_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_ftrace_seq_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pstore_ftrace_seq_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_ftrace_seq_stop(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_get_records(int quiet) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_init_fs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pstore_kill_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_mkfile(Ptr<runtime.dentry> root, Ptr<pstore_record> record) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pstore_mount($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<runtime.dentry> pstore_mount(Ptr<FileDefinitions.file_system_type> fs_type, int flags, String dev_name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_put_backend_records(Ptr<pstore_info> psi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_remount(Ptr<SuperDefinitions.super_block> sb, Ptr<Integer> flags, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pstore_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pstore_ftrace_seq_data")
    @NotUsableInJava
    public static class pstore_ftrace_seq_data
    extends Struct {
        public Ptr<?> ptr;
        public @Unsigned long off;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct pstore_private")
    @NotUsableInJava
    public static class pstore_private
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.dentry> dentry;
        public Ptr<pstore_record> record;
        public @Unsigned long total_size;
    }

    @Type(noCCodeGeneration=true, cType="struct pstore_ftrace_record")
    @NotUsableInJava
    public static class pstore_ftrace_record
    extends Struct {
        public @Unsigned long ip;
        public @Unsigned long parent_ip;
        public @Unsigned long ts;
    }

    @Type(noCCodeGeneration=true, cType="struct pstore_info")
    @NotUsableInJava
    public static class pstore_info
    extends Struct {
        public Ptr<runtime.module> owner;
        public String name;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock buf_lock;
        public String buf;
        public @Unsigned long bufsize;
        public runtime.mutex read_mutex;
        public int flags;
        public int max_reason;
        public Ptr<?> data;
        public Ptr<?> open;
        public Ptr<?> close;
        public Ptr<?> read;
        public Ptr<?> write;
        public Ptr<?> write_user;
        public Ptr<?> erase;
    }

    @Type(noCCodeGeneration=true, cType="struct pstore_record")
    @NotUsableInJava
    public static class pstore_record
    extends Struct {
        public Ptr<pstore_info> psi;
        public pstore_type_id type;
        public @Unsigned long id;
        public runtime.timespec64 time;
        public String buf;
        public @OriginalName(value="ssize_t") long size;
        public @OriginalName(value="ssize_t") long ecc_notice_size;
        public Ptr<?> priv;
        public int count;
        public KmsgDefinitions.kmsg_dump_reason reason;
        public @Unsigned int part;
        public boolean compressed;
    }

    @Type(noCCodeGeneration=true, cType="enum pstore_type_id")
    public static enum pstore_type_id implements Enum<pstore_type_id>,
    TypedEnum<pstore_type_id, Integer>
    {
        PSTORE_TYPE_DMESG,
        PSTORE_TYPE_MCE,
        PSTORE_TYPE_CONSOLE,
        PSTORE_TYPE_FTRACE,
        PSTORE_TYPE_PPC_RTAS,
        PSTORE_TYPE_PPC_OF,
        PSTORE_TYPE_PPC_COMMON,
        PSTORE_TYPE_PMSG,
        PSTORE_TYPE_PPC_OPAL,
        PSTORE_TYPE_MAX;

    }
}

