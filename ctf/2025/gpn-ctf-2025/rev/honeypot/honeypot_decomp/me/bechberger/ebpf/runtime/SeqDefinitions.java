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
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class SeqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_con_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static void seq_con_printf(Ptr<seq_file> seq, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> seq_next(Ptr<seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_open_net(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_release_net(Ptr<runtime.inode> ino, Ptr<runtime.file> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_show(Ptr<seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> seq_start(Ptr<seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seq_stop(Ptr<seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="SEQ_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static void SEQ_printf(Ptr<seq_file> m, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__seq_open_private($arg1, (const struct seq_operations*)$arg2, $arg3)")
    public static Ptr<?> __seq_open_private(Ptr<runtime.file> f, Ptr<seq_operations> ops, int psize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__seq_puts($arg1, (const u8*)$arg2)")
    public static void __seq_puts(Ptr<seq_file> m, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_bprintf($arg1, (const u8*)$arg2, (const unsigned int*)$arg3)")
    public static void seq_bprintf(Ptr<seq_file> m, String f, Ptr<@Unsigned Integer> binary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_dentry($arg1, $arg2, (const u8*)$arg3)")
    public static int seq_dentry(Ptr<seq_file> m, Ptr<runtime.dentry> dentry2, String esc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_escape_mem($arg1, (const u8*)$arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static void seq_escape_mem(Ptr<seq_file> m, String src, @Unsigned long len, @Unsigned int flags, String esc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seq_file_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_file_path($arg1, $arg2, (const u8*)$arg3)")
    public static int seq_file_path(Ptr<seq_file> m, Ptr<runtime.file> file2, String esc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_hex_dump($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7, $arg8)")
    public static void seq_hex_dump(Ptr<seq_file> m, String prefix_str, int prefix_type, int rowsize, int groupsize, Ptr<?> buf, @Unsigned long len, boolean ascii) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_node> seq_hlist_next(Ptr<?> v, Ptr<misc.hlist_head> head, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_node> seq_hlist_next_percpu(Ptr<?> v, Ptr<misc.hlist_head> head, Ptr<Integer> cpu2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_node> seq_hlist_next_rcu(Ptr<?> v, Ptr<misc.hlist_head> head, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_node> seq_hlist_start(Ptr<misc.hlist_head> head, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_node> seq_hlist_start_head(Ptr<misc.hlist_head> head, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_node> seq_hlist_start_head_rcu(Ptr<misc.hlist_head> head, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_node> seq_hlist_start_percpu(Ptr<misc.hlist_head> head, Ptr<Integer> cpu2, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.hlist_node> seq_hlist_start_rcu(Ptr<misc.hlist_head> head, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> seq_list_next(Ptr<?> v, Ptr<ListDefinitions.list_head> head, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> seq_list_next_rcu(Ptr<?> v, Ptr<ListDefinitions.list_head> head, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> seq_list_start(Ptr<ListDefinitions.list_head> head, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> seq_list_start_head(Ptr<ListDefinitions.list_head> head, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> seq_list_start_head_rcu(Ptr<ListDefinitions.list_head> head, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> seq_list_start_rcu(Ptr<ListDefinitions.list_head> head, @OriginalName(value="loff_t") long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long seq_lseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_open($arg1, (const struct seq_operations*)$arg2)")
    public static int seq_open(Ptr<runtime.file> file2, Ptr<seq_operations> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_open_private($arg1, (const struct seq_operations*)$arg2, $arg3)")
    public static int seq_open_private(Ptr<runtime.file> filp, Ptr<seq_operations> ops, int psize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seq_pad(Ptr<seq_file> m, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_path($arg1, (const struct path*)$arg2, (const u8*)$arg3)")
    public static int seq_path(Ptr<seq_file> m, Ptr<runtime.path> path2, String esc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_path_root($arg1, (const struct path*)$arg2, (const struct path*)$arg3, (const u8*)$arg4)")
    public static int seq_path_root(Ptr<seq_file> m, Ptr<runtime.path> path2, Ptr<runtime.path> root, String esc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_print_delegate_opts($arg1, (const u8*)$arg2, (const struct btf*)$arg3, (const struct btf_type*)$arg4, (const u8*)$arg5, $arg6, $arg7)")
    public static void seq_print_delegate_opts(Ptr<seq_file> m, String opt_name, Ptr<runtime.btf> btf2, Ptr<BtfDefinitions.btf_type> enum_t, String prefix, @Unsigned long delegate_msk, @Unsigned long any_msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static void seq_printf(Ptr<seq_file> m, String f, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_put_decimal_ll($arg1, (const u8*)$arg2, $arg3)")
    public static void seq_put_decimal_ll(Ptr<seq_file> m, String delimiter, long num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_put_decimal_ull($arg1, (const u8*)$arg2, $arg3)")
    public static void seq_put_decimal_ull(Ptr<seq_file> m, String delimiter, @Unsigned long num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_put_decimal_ull_width($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void seq_put_decimal_ull_width(Ptr<seq_file> m, String delimiter, @Unsigned long num, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_put_hex_ll($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void seq_put_hex_ll(Ptr<seq_file> m, String delimiter, @Unsigned long v, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void seq_putc(Ptr<seq_file> m, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long seq_read(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long seq_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_release_private(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_vprintf($arg1, (const u8*)$arg2, $arg3)")
    public static void seq_vprintf(Ptr<seq_file> m, String f, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_write($arg1, (const void*)$arg2, $arg3)")
    public static int seq_write(Ptr<seq_file> seq, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_fdinfo_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_compress_max_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_compress_max_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_compress_min_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_compress_min_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_level_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_level_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_name_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_name_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_nsstacked_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_nsstacked_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_stacked_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_ns_stacked_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_print_ip_sym(Ptr<TraceDefinitions.trace_seq> s2, @Unsigned long ip, @Unsigned long sym_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_print_user_ip(Ptr<TraceDefinitions.trace_seq> s2, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long ip, @Unsigned long sym_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_profile_attach_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_profile_attach_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_profile_hash_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_profile_hash_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_profile_mode_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_profile_mode_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_profile_name_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_profile_name_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_profile_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_rawdata_abi_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_rawdata_abi_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_rawdata_compressed_size_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_rawdata_compressed_size_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_rawdata_hash_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_rawdata_hash_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_rawdata_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_rawdata_revision_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_rawdata_revision_show(Ptr<seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_show_profile(Ptr<seq_file> f, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_buf_bprintf($arg1, (const u8*)$arg2, (const unsigned int*)$arg3)")
    public static int seq_buf_bprintf(Ptr<seq_buf> s2, String fmt, Ptr<@Unsigned Integer> binary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_buf_do_printk($arg1, (const u8*)$arg2)")
    public static void seq_buf_do_printk(Ptr<seq_buf> s2, String lvl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_buf_hex_dump($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int seq_buf_hex_dump(Ptr<seq_buf> s2, String prefix_str, int prefix_type, int rowsize, int groupsize, Ptr<?> buf, @Unsigned long len, boolean ascii) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_buf_path($arg1, (const struct path*)$arg2, (const u8*)$arg3)")
    public static int seq_buf_path(Ptr<seq_buf> s2, Ptr<runtime.path> path2, String esc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_buf_print_seq(Ptr<seq_file> m, Ptr<seq_buf> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_buf_printf($arg1, (const u8*)$arg2, $arg3_)")
    public static int seq_buf_printf(Ptr<seq_buf> s2, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_buf_putc(Ptr<seq_buf> s2, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_buf_putmem($arg1, (const void*)$arg2, $arg3)")
    public static int seq_buf_putmem(Ptr<seq_buf> s2, Ptr<?> mem, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_buf_putmem_hex($arg1, (const void*)$arg2, $arg3)")
    public static int seq_buf_putmem_hex(Ptr<seq_buf> s2, Ptr<?> mem, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_buf_puts($arg1, (const u8*)$arg2)")
    public static int seq_buf_puts(Ptr<seq_buf> s2, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int seq_buf_to_user(Ptr<seq_buf> s2, String ubuf, @Unsigned long start, int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="seq_buf_vprintf($arg1, (const u8*)$arg2, $arg3)")
    public static int seq_buf_vprintf(Ptr<seq_buf> s2, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union { struct { unsigned int low; unsigned int hi; } output; struct { unsigned int low; unsigned int hi; } input; }")
    @NotUsableInJava
    public static class seq_of_xfrm_skb_cb
    extends Union {
        public misc.output_of_seq_of_xfrm_skb_cb_and_seq_of_xfrm_offload output;
        public InputDefinitions.input_of_seq_of_xfrm_skb_cb input;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int litLength; long unsigned int matchLength; long unsigned int offset; }")
    @NotUsableInJava
    public static class seq_t
    extends Struct {
        public @Unsigned long litLength;
        public @Unsigned long matchLength;
        public @Unsigned long offset;
    }

    @Type(noCCodeGeneration=true, cType="struct seq_net_private")
    @NotUsableInJava
    public static class seq_net_private
    extends Struct {
        public Ptr<runtime.net> net;
        public  @OriginalName(value="netns_tracker") misc.lockdep_map_p ns_tracker;
    }

    @Type(noCCodeGeneration=true, cType="struct seq_buf")
    @NotUsableInJava
    public static class seq_buf
    extends Struct {
        public String buffer;
        public @Unsigned long size;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct seq_file")
    @NotUsableInJava
    public static class seq_file
    extends Struct {
        public String buf;
        public @Unsigned long size;
        public @Unsigned long from;
        public @Unsigned long count;
        public @Unsigned long pad_until;
        public @OriginalName(value="loff_t") long index;
        public @OriginalName(value="loff_t") long read_pos;
        public runtime.mutex lock;
        public Ptr<seq_operations> op;
        public int poll_event;
        public Ptr<runtime.file> file;
        public Ptr<?> _private;
    }

    @Type(noCCodeGeneration=true, cType="struct seq_operations")
    @NotUsableInJava
    public static class seq_operations
    extends Struct {
        public Ptr<?> start;
        public Ptr<?> stop;
        public Ptr<?> next;
        public Ptr<?> show;
    }
}

