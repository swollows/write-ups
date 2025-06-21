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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ShashDefinitions;
import me.bechberger.ebpf.runtime.SkcipherDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class EcryptfsDefinitions {
    public static final @Unsigned int ecryptfs_opt_sig = 0;
    public static final @Unsigned int ecryptfs_opt_ecryptfs_sig = 1;
    public static final @Unsigned int ecryptfs_opt_cipher = 2;
    public static final @Unsigned int ecryptfs_opt_ecryptfs_cipher = 3;
    public static final @Unsigned int ecryptfs_opt_ecryptfs_key_bytes = 4;
    public static final @Unsigned int ecryptfs_opt_passthrough = 5;
    public static final @Unsigned int ecryptfs_opt_xattr_metadata = 6;
    public static final @Unsigned int ecryptfs_opt_encrypted_view = 7;
    public static final @Unsigned int ecryptfs_opt_fnek_sig = 8;
    public static final @Unsigned int ecryptfs_opt_fn_cipher = 9;
    public static final @Unsigned int ecryptfs_opt_fn_cipher_key_bytes = 10;
    public static final @Unsigned int ecryptfs_opt_unlink_sigs = 11;
    public static final @Unsigned int ecryptfs_opt_mount_auth_tok_only = 12;
    public static final @Unsigned int ecryptfs_opt_check_dev_ruid = 13;
    public static final @Unsigned int ecryptfs_opt_err = 14;

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="sector_t") long ecryptfs_bmap(Ptr<misc.address_space> mapping, @Unsigned @OriginalName(value="sector_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ecryptfs_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_copy_up_encrypted_with_header(Ptr<runtime.page> page2, Ptr<ecryptfs_crypt_stat> crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long ecryptfs_dir_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_dir_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_dir_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_dump_auth_tok(Ptr<ecryptfs_auth_tok> auth_tok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_dump_hex(String data, int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_exorcise_daemon(Ptr<ecryptfs_daemon> daemon2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_fasync(int fd2, Ptr<runtime.file> file2, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_filldir($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static boolean ecryptfs_filldir(Ptr<misc.dir_context> ctx, String lower_name, int lower_namelen, @OriginalName(value="loff_t") long offset, @Unsigned long ino, @Unsigned int d_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_find_daemon_by_euid(Ptr<Ptr<ecryptfs_daemon>> daemon2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_flush(Ptr<runtime.file> file2, @OriginalName(value="fl_owner_t") Ptr<?> td2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_fsync(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> ecryptfs_get_locked_page(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_init_messaging() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_msg_ctx_alloc_to_free(Ptr<ecryptfs_msg_ctx> msg_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_process_response(Ptr<ecryptfs_daemon> daemon2, Ptr<ecryptfs_message> msg, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_read_folio(Ptr<runtime.file> file2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ecryptfs_read_update_atime(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_release_messaging() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_send_message(String data, int data_len, Ptr<Ptr<ecryptfs_msg_ctx>> msg_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_spawn_daemon(Ptr<Ptr<ecryptfs_daemon>> daemon2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ecryptfs_splice_read_update_atime(Ptr<runtime.file> in, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ecryptfs_unlocked_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_wait_for_response(Ptr<ecryptfs_msg_ctx> msg_ctx, Ptr<Ptr<ecryptfs_message>> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_write_begin(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, Ptr<Ptr<runtime.folio>> foliop, Ptr<Ptr<?>> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_write_end(Ptr<runtime.file> file2, Ptr<misc.address_space> mapping, @OriginalName(value="loff_t") long pos, @Unsigned int len, @Unsigned int copied, Ptr<runtime.folio> folio2, Ptr<?> fsdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_write_inode_size_to_metadata(Ptr<runtime.inode> ecryptfs_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_writepage(Ptr<runtime.page> page2, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ecryptfs_printk((const u8*)$arg1, $arg2_)")
    public static void __ecryptfs_printk(String fmt, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_add_new_key_tfm(Ptr<Ptr<ecryptfs_key_tfm>> key_tfm, String cipher_name, @Unsigned long key_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_cipher_code_to_string(String str, char cipher_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char ecryptfs_code_for_cipher_string(String cipher_name, @Unsigned long key_bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_compute_root_iv(Ptr<ecryptfs_crypt_stat> crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_copy_filename($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int ecryptfs_copy_filename(Ptr<String> copied_name, Ptr<@Unsigned Long> copied_name_size, String name, @Unsigned long name_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_copy_mount_wide_flags_to_inode_flags(Ptr<ecryptfs_crypt_stat> crypt_stat, Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_crypto_api_algify_cipher_name(Ptr<String> algified_name, String cipher_name, String chaining_modifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_d_release(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_d_revalidate(Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_decode_and_decrypt_filename($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int ecryptfs_decode_and_decrypt_filename(Ptr<String> plaintext_name, Ptr<@Unsigned Long> plaintext_name_size, Ptr<SuperDefinitions.super_block> sb, String name, @Unsigned long name_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_decrypt_page(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_dentry_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_derive_iv(String iv, Ptr<ecryptfs_crypt_stat> crypt_stat, @OriginalName(value="loff_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_destroy_crypt_stat(Ptr<ecryptfs_crypt_stat> crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_destroy_crypto() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_destroy_mount_crypt_stat(Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_encode_for_filename(String dst, Ptr<@Unsigned Long> dst_size, String src, @Unsigned long src_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_encrypt_and_encode_filename($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int ecryptfs_encrypt_and_encode_filename(Ptr<String> encoded_name, Ptr<@Unsigned Long> encoded_name_size, Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat, String name, @Unsigned long name_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_encrypt_filename(Ptr<ecryptfs_filename> filename2, Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_encrypt_page(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_free_kmem_caches() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_from_hex(String dst, String src, int dst_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_get_lower_file(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_get_tfm_and_mutex_for_cipher_name(Ptr<Ptr<CryptoDefinitions.crypto_skcipher>> tfm, Ptr<Ptr<runtime.mutex>> tfm_mutex, String cipher_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_i_size_init((const u8*)$arg1, $arg2)")
    public static void ecryptfs_i_size_init(String page_virt, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_init_crypt_ctx(Ptr<ecryptfs_crypt_stat> crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_init_crypt_stat(Ptr<ecryptfs_crypt_stat> crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_init_crypto() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_kill_block_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_mount($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<runtime.dentry> ecryptfs_mount(Ptr<FileDefinitions.file_system_type> fs_type, int flags, String dev_name, Ptr<?> raw_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_new_file_context(Ptr<runtime.inode> ecryptfs_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_parse_options(Ptr<ecryptfs_sb_info> sbi, String options, Ptr<@Unsigned @OriginalName(value="uid_t") Integer> check_ruid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_put_lower_file(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_read_and_validate_header_region(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_read_and_validate_xattr_region(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_read_headers_virt(String page_virt, Ptr<ecryptfs_crypt_stat> crypt_stat, Ptr<runtime.dentry> ecryptfs_dentry, int validate_header_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_read_metadata(Ptr<runtime.dentry> ecryptfs_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_read_xattr_region(String page_virt, Ptr<runtime.inode> ecryptfs_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_set_default_sizes(Ptr<ecryptfs_crypt_stat> crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_set_f_namelen(Ptr<Long> namelen, long lower_namelen, Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_tfm_exists(String cipher_name, Ptr<Ptr<ecryptfs_key_tfm>> key_tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_write_crypt_stat_flags(String page_virt, Ptr<ecryptfs_crypt_stat> crypt_stat, Ptr<@Unsigned Long> written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_write_header_metadata(String virt, Ptr<ecryptfs_crypt_stat> crypt_stat, Ptr<@Unsigned Long> written) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_write_metadata(Ptr<runtime.dentry> ecryptfs_dentry, Ptr<runtime.inode> ecryptfs_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_add_global_auth_tok(Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat, String sig, @Unsigned int global_auth_tok_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_add_keysig(Ptr<ecryptfs_crypt_stat> crypt_stat, String sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> ecryptfs_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_destroy_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_evict_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_find_global_auth_tok_for_sig(Ptr<Ptr<runtime.key>> auth_tok_key, Ptr<Ptr<ecryptfs_auth_tok>> auth_tok, Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat, String sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_generate_key_packet_set(String dest_base, Ptr<ecryptfs_crypt_stat> crypt_stat, Ptr<runtime.dentry> ecryptfs_dentry, Ptr<@Unsigned Long> len, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_keyring_auth_tok_for_sig(Ptr<Ptr<runtime.key>> auth_tok_key, Ptr<Ptr<ecryptfs_auth_tok>> auth_tok, String sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_parse_packet_length(String data, Ptr<@Unsigned Long> size, Ptr<@Unsigned Long> length_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_parse_packet_set(Ptr<ecryptfs_crypt_stat> crypt_stat, String src, Ptr<runtime.dentry> ecryptfs_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_parse_tag_70_packet(Ptr<String> filename2, Ptr<@Unsigned Long> filename_size, Ptr<@Unsigned Long> packet_size, Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat, String data, @Unsigned long max_packet_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_statfs(Ptr<runtime.dentry> dentry2, Ptr<runtime.kstatfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_write_packet_length(String dest, @Unsigned long size, Ptr<@Unsigned Long> packet_size_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_write_tag_70_packet(String dest, Ptr<@Unsigned Long> remaining_bytes, Ptr<@Unsigned Long> packet_size, Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat, String filename2, @Unsigned long filename_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> __ecryptfs_get_inode(Ptr<runtime.inode> lower_inode, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_create(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> directory_inode, Ptr<runtime.dentry> ecryptfs_dentry, @Unsigned @OriginalName(value="umode_t") short mode, boolean excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_destroy_ecryptfs_miscdev() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_destroy_kthread() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_do_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_fileattr_get(Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_fileattr_set(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.fileattr> fa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_fill_auth_tok($arg1, (const u8*)$arg2)")
    public static int ecryptfs_fill_auth_tok(Ptr<ecryptfs_auth_tok> auth_tok, String key_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PosixDefinitions.posix_acl> ecryptfs_get_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Character> ecryptfs_get_auth_tok_key(Ptr<ecryptfs_auth_tok> auth_tok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> ecryptfs_get_inode(Ptr<runtime.inode> lower_inode, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ecryptfs_get_link($arg1, $arg2, $arg3))")
    public static String ecryptfs_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ecryptfs_get_versions(Ptr<Integer> major, Ptr<Integer> minor, Ptr<Integer> file_version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int ecryptfs_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_getattr_link($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int ecryptfs_getattr_link(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_getxattr_lower($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long ecryptfs_getxattr_lower(Ptr<runtime.dentry> lower_dentry, Ptr<runtime.inode> lower_inode, String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_init_ecryptfs_miscdev() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_init_kthread() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_initialize_file(Ptr<runtime.dentry> ecryptfs_dentry, Ptr<runtime.inode> ecryptfs_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_inode_set(Ptr<runtime.inode> inode2, Ptr<?> opaque) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_inode_test(Ptr<runtime.inode> inode2, Ptr<?> lower_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ecryptfs_listxattr(Ptr<runtime.dentry> dentry2, String list, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> ecryptfs_lookup(Ptr<runtime.inode> ecryptfs_dir_inode, Ptr<runtime.dentry> ecryptfs_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_miscdev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int ecryptfs_miscdev_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ecryptfs_miscdev_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_miscdev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_miscdev_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ecryptfs_miscdev_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_mkdir(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_permission(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_privileged_open($arg1, $arg2, $arg3, (const struct cred*)$arg4)")
    public static int ecryptfs_privileged_open(Ptr<Ptr<runtime.file>> lower_file, Ptr<runtime.dentry> lower_dentry, Ptr<runtime.vfsmount> lower_mnt, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_read_lower(String data, @OriginalName(value="loff_t") long offset, @Unsigned long size, Ptr<runtime.inode> ecryptfs_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_read_lower_page_segment(Ptr<runtime.page> page_for_ecryptfs, @Unsigned long page_index, @Unsigned long offset_in_page, @Unsigned long size, Ptr<runtime.inode> ecryptfs_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String ecryptfs_readlink_lower(Ptr<runtime.dentry> dentry2, Ptr<@Unsigned Long> bufsiz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_rename(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_send_miscdev(String data, @Unsigned long data_size, Ptr<ecryptfs_msg_ctx> msg_ctx, char msg_type, @Unsigned short msg_flags, Ptr<ecryptfs_daemon> daemon2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<PosixDefinitions.posix_acl> acl, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> ia) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_setxattr($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int ecryptfs_setxattr(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_symlink($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int ecryptfs_symlink(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String symname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_threadfn(Ptr<?> ignored) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_truncate(Ptr<runtime.dentry> dentry2, @OriginalName(value="loff_t") long new_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_write(Ptr<runtime.inode> ecryptfs_inode, String data, @OriginalName(value="loff_t") long offset, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_write_lower(Ptr<runtime.inode> ecryptfs_inode, String data, @OriginalName(value="loff_t") long offset, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ecryptfs_write_lower_page_segment(Ptr<runtime.inode> ecryptfs_inode, Ptr<runtime.page> page_for_lower, @Unsigned long offset_in_page, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_xattr_get((const struct xattr_handler*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int ecryptfs_xattr_get(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, String name, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ecryptfs_xattr_set((const struct xattr_handler*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const void*)$arg6, $arg7, $arg8)")
    public static int ecryptfs_xattr_set(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_parse_tag_70_packet_silly_stack")
    @NotUsableInJava
    public static class ecryptfs_parse_tag_70_packet_silly_stack
    extends Struct {
        public char cipher_code;
        public @Unsigned long max_packet_size;
        public @Unsigned long packet_size_len;
        public @Unsigned long parsed_tag_70_packet_size;
        public @Unsigned long block_aligned_filename_size;
        public @Unsigned long block_size;
        public @Unsigned long i;
        public Ptr<runtime.mutex> tfm_mutex;
        public String decrypted_filename;
        public Ptr<ecryptfs_auth_tok> auth_tok;
        public runtime.scatterlist @Size(value=2) [] src_sg;
        public runtime.scatterlist @Size(value=2) [] dst_sg;
        public Ptr<CryptoDefinitions.crypto_skcipher> skcipher_tfm;
        public Ptr<SkcipherDefinitions.skcipher_request> skcipher_req;
        public char @Size(value=17) [] fnek_sig_hex;
        public char @Size(value=16) [] iv;
        public char @Size(value=32) [] cipher_string;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_write_tag_70_packet_silly_stack")
    @NotUsableInJava
    public static class ecryptfs_write_tag_70_packet_silly_stack
    extends Struct {
        public char cipher_code;
        public @Unsigned long max_packet_size;
        public @Unsigned long packet_size_len;
        public @Unsigned long block_aligned_filename_size;
        public @Unsigned long block_size;
        public @Unsigned long i;
        public @Unsigned long j;
        public @Unsigned long num_rand_bytes;
        public Ptr<runtime.mutex> tfm_mutex;
        public String block_aligned_filename;
        public Ptr<ecryptfs_auth_tok> auth_tok;
        public runtime.scatterlist @Size(value=2) [] src_sg;
        public runtime.scatterlist @Size(value=2) [] dst_sg;
        public Ptr<CryptoDefinitions.crypto_skcipher> skcipher_tfm;
        public Ptr<SkcipherDefinitions.skcipher_request> skcipher_req;
        public char @Size(value=16) [] iv;
        public char @Size(value=16) [] hash;
        public char @Size(value=16) [] tmp_hash;
        public Ptr<CryptoDefinitions.crypto_shash> hash_tfm;
        public Ptr<ShashDefinitions.shash_desc> hash_desc;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_auth_tok_list_item")
    @NotUsableInJava
    public static class ecryptfs_auth_tok_list_item
    extends Struct {
        public char @Size(value=64) [] encrypted_session_key;
        public ListDefinitions.list_head list;
        public ecryptfs_auth_tok auth_tok;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_key_record")
    @NotUsableInJava
    public static class ecryptfs_key_record
    extends Struct {
        public char type;
        public @Unsigned long enc_key_size;
        public char @Size(value=8) [] sig;
        public char @Size(value=512) [] enc_key;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_cipher_code_str_map_elem")
    @NotUsableInJava
    public static class ecryptfs_cipher_code_str_map_elem
    extends Struct {
        public char @Size(value=16) [] cipher_str;
        public char cipher_code;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_flag_map_elem")
    @NotUsableInJava
    public static class ecryptfs_flag_map_elem
    extends Struct {
        public @Unsigned int file_flag;
        public @Unsigned int local_flag;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_filename")
    @NotUsableInJava
    public static class ecryptfs_filename
    extends Struct {
        public ListDefinitions.list_head crypt_stat_list;
        public @Unsigned int flags;
        public @Unsigned int seq_no;
        public String filename;
        public String encrypted_filename;
        public @Unsigned long filename_size;
        public @Unsigned long encrypted_filename_size;
        public char @Size(value=16) [] fnek_sig;
        public char @Size(value=57) [] dentry_name;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_key_sig")
    @NotUsableInJava
    public static class ecryptfs_key_sig
    extends Struct {
        public ListDefinitions.list_head crypt_stat_list;
        public char @Size(value=17) [] keysig;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_cache_info")
    @NotUsableInJava
    public static class ecryptfs_cache_info
    extends Struct {
        public Ptr<Ptr<KmemDefinitions.kmem_cache>> cache;
        public String name;
        public @Unsigned long size;
        public @Unsigned @OriginalName(value="slab_flags_t") int flags;
        public Ptr<?> ctor;
    }

    @Type(noCCodeGeneration=true, cType="enum ecryptfs_opt")
    public static enum ecryptfs_opt implements Enum<ecryptfs_opt>,
    TypedEnum<ecryptfs_opt, Integer>
    {
        ecryptfs_opt_sig,
        ecryptfs_opt_ecryptfs_sig,
        ecryptfs_opt_cipher,
        ecryptfs_opt_ecryptfs_cipher,
        ecryptfs_opt_ecryptfs_key_bytes,
        ecryptfs_opt_passthrough,
        ecryptfs_opt_xattr_metadata,
        ecryptfs_opt_encrypted_view,
        ecryptfs_opt_fnek_sig,
        ecryptfs_opt_fn_cipher,
        ecryptfs_opt_fn_cipher_key_bytes,
        ecryptfs_opt_unlink_sigs,
        ecryptfs_opt_mount_auth_tok_only,
        ecryptfs_opt_check_dev_ruid,
        ecryptfs_opt_err;

    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_key_tfm")
    @NotUsableInJava
    public static class ecryptfs_key_tfm
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_skcipher> key_tfm;
        public @Unsigned long key_size;
        public runtime.mutex key_tfm_mutex;
        public ListDefinitions.list_head key_tfm_list;
        public char @Size(value=32) [] cipher_name;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_global_auth_tok")
    @NotUsableInJava
    public static class ecryptfs_global_auth_tok
    extends Struct {
        public @Unsigned int flags;
        public ListDefinitions.list_head mount_crypt_stat_list;
        public Ptr<runtime.key> global_auth_tok_key;
        public char @Size(value=17) [] sig;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_getdents_callback")
    @NotUsableInJava
    public static class ecryptfs_getdents_callback
    extends Struct {
        public misc.dir_context ctx;
        public Ptr<misc.dir_context> caller;
        public Ptr<SuperDefinitions.super_block> sb;
        public int filldir_called;
        public int entries_written;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_auth_tok")
    @NotUsableInJava
    public static class ecryptfs_auth_tok
    extends Struct {
        public @Unsigned short version;
        public @Unsigned short token_type;
        public @Unsigned int flags;
        public ecryptfs_session_key session_key;
        public char @Size(value=32) [] reserved;
        public misc.token_of_ecryptfs_auth_tok token;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_private_key")
    @NotUsableInJava
    public static class ecryptfs_private_key
    extends Struct {
        public @Unsigned int key_size;
        public @Unsigned int data_len;
        public char @Size(value=17) [] signature;
        public char @Size(value=17) [] pki_type;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="enum ecryptfs_token_types")
    public static enum ecryptfs_token_types implements Enum<ecryptfs_token_types>,
    TypedEnum<ecryptfs_token_types, Integer>
    {
        ECRYPTFS_PASSWORD,
        ECRYPTFS_PRIVATE_KEY;

    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_password")
    @NotUsableInJava
    public static class ecryptfs_password
    extends Struct {
        public @Unsigned int password_bytes;
        public int hash_algo;
        public @Unsigned int hash_iterations;
        public @Unsigned int session_key_encryption_key_bytes;
        public @Unsigned int flags;
        public char @Size(value=64) [] session_key_encryption_key;
        public char @Size(value=17) [] signature;
        public char @Size(value=8) [] salt;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_session_key")
    @NotUsableInJava
    public static class ecryptfs_session_key
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int encrypted_key_size;
        public @Unsigned int decrypted_key_size;
        public char @Size(value=512) [] encrypted_key;
        public char @Size(value=64) [] decrypted_key;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_daemon")
    @NotUsableInJava
    public static class ecryptfs_daemon
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int num_queued_msg_ctx;
        public Ptr<runtime.file> file;
        public runtime.mutex mux;
        public ListDefinitions.list_head msg_ctx_out_queue;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public misc.hlist_node euid_chain;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_msg_ctx")
    @NotUsableInJava
    public static class ecryptfs_msg_ctx
    extends Struct {
        public char state;
        public char type;
        public @Unsigned int index;
        public @Unsigned int counter;
        public @Unsigned long msg_size;
        public Ptr<ecryptfs_message> msg;
        public Ptr<TaskDefinitions.task_struct> task;
        public ListDefinitions.list_head node;
        public ListDefinitions.list_head daemon_out_list;
        public runtime.mutex mux;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_message")
    @NotUsableInJava
    public static class ecryptfs_message
    extends Struct {
        public @Unsigned int index;
        public @Unsigned int data_len;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_kthread_ctl")
    @NotUsableInJava
    public static class ecryptfs_kthread_ctl
    extends Struct {
        public @Unsigned int flags;
        public runtime.mutex mux;
        public ListDefinitions.list_head req_list;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_open_req")
    @NotUsableInJava
    public static class ecryptfs_open_req
    extends Struct {
        public Ptr<Ptr<runtime.file>> lower_file;
        public runtime.path path;
        public runtime.completion done;
        public ListDefinitions.list_head kthread_ctl_list;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_file_info")
    @NotUsableInJava
    public static class ecryptfs_file_info
    extends Struct {
        public Ptr<runtime.file> wfi_file;
        public Ptr<ecryptfs_crypt_stat> crypt_stat;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_sb_info")
    @NotUsableInJava
    public static class ecryptfs_sb_info
    extends Struct {
        public Ptr<SuperDefinitions.super_block> wsi_sb;
        public ecryptfs_mount_crypt_stat mount_crypt_stat;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_dentry_info")
    @NotUsableInJava
    public static class ecryptfs_dentry_info
    extends Struct {
        public runtime.path lower_path;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_inode_info")
    @NotUsableInJava
    public static class ecryptfs_inode_info
    extends Struct {
        public runtime.inode vfs_inode;
        public Ptr<runtime.inode> wii_inode;
        public runtime.mutex lower_file_mutex;
        public AtomicDefinitions.atomic_t lower_file_count;
        public Ptr<runtime.file> lower_file;
        public ecryptfs_crypt_stat crypt_stat;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_mount_crypt_stat")
    @NotUsableInJava
    public static class ecryptfs_mount_crypt_stat
    extends Struct {
        public @Unsigned int flags;
        public ListDefinitions.list_head global_auth_tok_list;
        public runtime.mutex global_auth_tok_list_mutex;
        public @Unsigned long global_default_cipher_key_size;
        public @Unsigned long global_default_fn_cipher_key_bytes;
        public char @Size(value=32) [] global_default_cipher_name;
        public char @Size(value=32) [] global_default_fn_cipher_name;
        public char @Size(value=17) [] global_default_fnek_sig;
    }

    @Type(noCCodeGeneration=true, cType="struct ecryptfs_crypt_stat")
    @NotUsableInJava
    public static class ecryptfs_crypt_stat
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int file_version;
        public @Unsigned long iv_bytes;
        public @Unsigned long metadata_size;
        public @Unsigned long extent_size;
        public @Unsigned long key_size;
        public @Unsigned long extent_shift;
        public @Unsigned int extent_mask;
        public Ptr<ecryptfs_mount_crypt_stat> mount_crypt_stat;
        public Ptr<CryptoDefinitions.crypto_skcipher> tfm;
        public Ptr<CryptoDefinitions.crypto_shash> hash_tfm;
        public char @Size(value=32) [] cipher;
        public char @Size(value=64) [] key;
        public char @Size(value=16) [] root_iv;
        public ListDefinitions.list_head keysig_list;
        public runtime.mutex keysig_list_mutex;
        public runtime.mutex cs_tfm_mutex;
        public runtime.mutex cs_mutex;
    }
}

