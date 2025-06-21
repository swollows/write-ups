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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PolicyDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class FscryptDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__fscrypt_fname_encrypted_size((const union fscrypt_policy*)$arg1, $arg2, $arg3, $arg4)")
    public static boolean __fscrypt_fname_encrypted_size(Ptr<fscrypt_policy> policy, @Unsigned int orig_len, @Unsigned int max_len, Ptr<@Unsigned Integer> encrypted_len_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_d_revalidate(Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_derive_dirhash_key($arg1, (const struct fscrypt_master_key*)$arg2)")
    public static int fscrypt_derive_dirhash_key(Ptr<fscrypt_inode_info> ci, Ptr<fscrypt_master_key> mk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_destroy_prepared_key(Ptr<SuperDefinitions.super_block> sb, Ptr<fscrypt_prepared_key> prep_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_drop_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_fname_alloc_buffer(@Unsigned int max_encrypted_len, Ptr<fscrypt_str> crypto_str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_fname_disk_to_usr((const struct inode*)$arg1, $arg2, $arg3, (const struct fscrypt_str*)$arg4, $arg5)")
    public static int fscrypt_fname_disk_to_usr(Ptr<runtime.inode> inode2, @Unsigned int hash2, @Unsigned int minor_hash, Ptr<fscrypt_str> iname, Ptr<fscrypt_str> oname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_fname_encrypt((const struct inode*)$arg1, (const struct qstr*)$arg2, $arg3, $arg4)")
    public static int fscrypt_fname_encrypt(Ptr<runtime.inode> inode2, Ptr<runtime.qstr> iname, Ptr<Character> out, @Unsigned int olen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_fname_encrypted_size((const struct inode*)$arg1, $arg2, $arg3, $arg4)")
    public static boolean fscrypt_fname_encrypted_size(Ptr<runtime.inode> inode2, @Unsigned int orig_len, @Unsigned int max_len, Ptr<@Unsigned Integer> encrypted_len_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_fname_free_buffer(Ptr<fscrypt_str> crypto_str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_fname_siphash((const struct inode*)$arg1, (const struct qstr*)$arg2)")
    public static @Unsigned long fscrypt_fname_siphash(Ptr<runtime.inode> dir, Ptr<runtime.qstr> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_get_encryption_info(Ptr<runtime.inode> inode2, boolean allow_unsupported) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_hash_inode_number($arg1, (const struct fscrypt_master_key*)$arg2)")
    public static void fscrypt_hash_inode_number(Ptr<fscrypt_inode_info> ci, Ptr<fscrypt_master_key> mk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_match_name((const struct fscrypt_name*)$arg1, (const u8*)$arg2, $arg3)")
    public static boolean fscrypt_match_name(Ptr<fscrypt_name> fname2, Ptr<Character> de_name, @Unsigned int de_name_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_prepare_key($arg1, (const u8*)$arg2, (const struct fscrypt_inode_info*)$arg3)")
    public static int fscrypt_prepare_key(Ptr<fscrypt_prepared_key> prep_key, Ptr<Character> raw_key, Ptr<fscrypt_inode_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_prepare_new_inode(Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2, Ptr<@OriginalName(value="bool") Boolean> encrypt_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_put_encryption_info(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_set_per_file_enc_key($arg1, (const u8*)$arg2)")
    public static int fscrypt_set_per_file_enc_key(Ptr<fscrypt_inode_info> ci, Ptr<Character> raw_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_setup_encryption_info($arg1, (const union fscrypt_policy*)$arg2, (const u8*)$arg3, $arg4)")
    public static int fscrypt_setup_encryption_info(Ptr<runtime.inode> inode2, Ptr<fscrypt_policy> policy, Ptr<Character> nonce, boolean need_dirhash_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_setup_filename($arg1, (const struct qstr*)$arg2, $arg3, $arg4)")
    public static int fscrypt_setup_filename(Ptr<runtime.inode> dir, Ptr<runtime.qstr> iname, int lookup, Ptr<fscrypt_name> fname2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_setup_v2_file_key(Ptr<fscrypt_inode_info> ci, Ptr<fscrypt_master_key> mk, boolean need_dirhash_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_add_test_dummy_key(Ptr<SuperDefinitions.super_block> sb, Ptr<fscrypt_key_specifier> key_spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> fscrypt_alloc_bounce_page(@Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_crypt_data_unit((const struct fscrypt_inode_info*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int fscrypt_crypt_data_unit(Ptr<fscrypt_inode_info> ci,  @OriginalName(value="fscrypt_direction_t") runtime.FS rw, @Unsigned long index2, Ptr<runtime.page> src_page, Ptr<runtime.page> dest_page, @Unsigned int len, @Unsigned int offs, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fscrypt_decrypt_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_decrypt_block_inplace((const struct inode*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int fscrypt_decrypt_block_inplace(Ptr<runtime.inode> inode2, Ptr<runtime.page> page2, @Unsigned int len, @Unsigned int offs, @Unsigned long lblk_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_decrypt_pagecache_blocks(Ptr<runtime.folio> folio2, @Unsigned long len, @Unsigned long offs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_destroy_hkdf(Ptr<fscrypt_hkdf> hkdf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_destroy_keyring(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_encrypt_block_inplace((const struct inode*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int fscrypt_encrypt_block_inplace(Ptr<runtime.inode> inode2, Ptr<runtime.page> page2, @Unsigned int len, @Unsigned int offs, @Unsigned long lblk_num, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> fscrypt_encrypt_pagecache_blocks(Ptr<runtime.page> page2, @Unsigned int len, @Unsigned int offs, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_enqueue_decrypt_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_find_master_key($arg1, (const struct fscrypt_key_specifier*)$arg2)")
    public static Ptr<fscrypt_master_key> fscrypt_find_master_key(Ptr<SuperDefinitions.super_block> sb, Ptr<fscrypt_key_specifier> mk_spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_free_bounce_page(Ptr<runtime.page> bounce_page) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_free_master_key(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_generate_iv($arg1, $arg2, (const struct fscrypt_inode_info*)$arg3)")
    public static void fscrypt_generate_iv(Ptr<fscrypt_iv> iv, @Unsigned long index2, Ptr<fscrypt_inode_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_get_test_dummy_key_identifier(Ptr<Character> key_identifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_get_test_dummy_secret(Ptr<fscrypt_master_key_secret> secret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_hkdf_expand((const struct fscrypt_hkdf*)$arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static int fscrypt_hkdf_expand(Ptr<fscrypt_hkdf> hkdf, char context2, Ptr<Character> info2, @Unsigned int infolen, Ptr<Character> okm, @Unsigned int okmlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_init_hkdf($arg1, (const u8*)$arg2, $arg3)")
    public static int fscrypt_init_hkdf(Ptr<fscrypt_hkdf> hkdf, Ptr<Character> master_key, @Unsigned int master_key_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_init_keyring() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_initialize(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_ioctl_add_key(Ptr<runtime.file> filp, Ptr<?> _uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_ioctl_get_key_status(Ptr<runtime.file> filp, Ptr<?> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_ioctl_remove_key(Ptr<runtime.file> filp, Ptr<?> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_ioctl_remove_key_all_users(Ptr<runtime.file> filp, Ptr<?> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_msg((const struct inode*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4_)")
    public static void fscrypt_msg(Ptr<runtime.inode> inode2, String level, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_provisioning_key_describe((const struct key*)$arg1, $arg2)")
    public static void fscrypt_provisioning_key_describe(Ptr<runtime.key> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_provisioning_key_destroy(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_provisioning_key_free_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_provisioning_key_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_put_master_key(Ptr<fscrypt_master_key> mk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_put_master_key_activeref(Ptr<SuperDefinitions.super_block> sb, Ptr<fscrypt_master_key> mk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_user_key_describe((const struct key*)$arg1, $arg2)")
    public static void fscrypt_user_key_describe(Ptr<runtime.key> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_user_key_instantiate(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_verify_key_added($arg1, (const u8*)$arg2)")
    public static int fscrypt_verify_key_added(Ptr<SuperDefinitions.super_block> sb, Ptr<Character> identifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_zeroout_range((const struct inode*)$arg1, $arg2, $arg3, $arg4)")
    public static int fscrypt_zeroout_range(Ptr<runtime.inode> inode2, @Unsigned long lblk, @Unsigned @OriginalName(value="sector_t") long pblk, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_zeroout_range_inline_crypt((const struct inode*)$arg1, $arg2, $arg3, $arg4)")
    public static int fscrypt_zeroout_range_inline_crypt(Ptr<runtime.inode> inode2, @Unsigned long lblk, @Unsigned @OriginalName(value="sector_t") long pblk, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__fscrypt_encrypt_symlink($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int __fscrypt_encrypt_symlink(Ptr<runtime.inode> inode2, String target, @Unsigned int len, Ptr<fscrypt_str> disk_link) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fscrypt_prepare_link(Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fscrypt_prepare_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, Ptr<fscrypt_name> fname2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fscrypt_prepare_readdir(Ptr<runtime.inode> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fscrypt_prepare_rename(Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fscrypt_prepare_setattr(Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_context_for_new_inode(Ptr<?> ctx, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_dummy_policies_equal((const struct fscrypt_dummy_policy*)$arg1, (const struct fscrypt_dummy_policy*)$arg2)")
    public static boolean fscrypt_dummy_policies_equal(Ptr<fscrypt_dummy_policy> p1, Ptr<fscrypt_dummy_policy> p2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_file_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const union fscrypt_policy*)fscrypt_get_dummy_policy($arg1))")
    public static Ptr<fscrypt_policy> fscrypt_get_dummy_policy(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_get_policy(Ptr<runtime.inode> inode2, Ptr<fscrypt_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)fscrypt_get_symlink($arg1, (const void*)$arg2, $arg3, $arg4))")
    public static String fscrypt_get_symlink(Ptr<runtime.inode> inode2, Ptr<?> caddr, @Unsigned int max_size, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_has_permitted_context(Ptr<runtime.inode> parent, Ptr<runtime.inode> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_ioctl_get_nonce(Ptr<runtime.file> filp, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_ioctl_get_policy(Ptr<runtime.file> filp, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_ioctl_get_policy_ex(Ptr<runtime.file> filp, Ptr<?> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_ioctl_set_policy($arg1, (const void*)$arg2)")
    public static int fscrypt_ioctl_set_policy(Ptr<runtime.file> filp, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_new_context($arg1, (const union fscrypt_policy*)$arg2, (const u8*)$arg3)")
    public static int fscrypt_new_context(Ptr<fscrypt_context> ctx_u, Ptr<fscrypt_policy> policy_u, Ptr<Character> nonce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_parse_test_dummy_encryption((const struct fs_parameter*)$arg1, $arg2)")
    public static int fscrypt_parse_test_dummy_encryption(Ptr<FsDefinitions.fs_parameter> param2, Ptr<fscrypt_dummy_policy> dummy_policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_policies_equal((const union fscrypt_policy*)$arg1, (const union fscrypt_policy*)$arg2)")
    public static boolean fscrypt_policies_equal(Ptr<fscrypt_policy> policy1, Ptr<fscrypt_policy> policy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_policy_from_context($arg1, (const union fscrypt_context*)$arg2, $arg3)")
    public static int fscrypt_policy_from_context(Ptr<fscrypt_policy> policy_u, Ptr<fscrypt_context> ctx_u, int ctx_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const union fscrypt_policy*)fscrypt_policy_to_inherit($arg1))")
    public static Ptr<fscrypt_policy> fscrypt_policy_to_inherit(Ptr<runtime.inode> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_policy_to_key_spec((const union fscrypt_policy*)$arg1, $arg2)")
    public static int fscrypt_policy_to_key_spec(Ptr<fscrypt_policy> policy, Ptr<fscrypt_key_specifier> key_spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_prepare_lookup_partial(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_prepare_setflags(Ptr<runtime.inode> inode2, @Unsigned int oldflags, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_prepare_symlink($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int fscrypt_prepare_symlink(Ptr<runtime.inode> dir, String target, @Unsigned int len, @Unsigned int max_len, Ptr<fscrypt_str> disk_link) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_set_context(Ptr<runtime.inode> inode2, Ptr<?> fs_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_show_test_dummy_encryption(Ptr<SeqDefinitions.seq_file> seq, char sep, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_supported_policy((const union fscrypt_policy*)$arg1, (const struct inode*)$arg2)")
    public static boolean fscrypt_supported_policy(Ptr<fscrypt_policy> policy_u, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_supported_v2_policy((const struct fscrypt_policy_v2*)$arg1, (const struct inode*)$arg2)")
    public static boolean fscrypt_supported_v2_policy(Ptr<fscrypt_policy_v2> policy, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_symlink_getattr((const struct path*)$arg1, $arg2)")
    public static int fscrypt_symlink_getattr(Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__fscrypt_inode_uses_inline_crypto((const struct inode*)$arg1)")
    public static boolean __fscrypt_inode_uses_inline_crypto(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_destroy_inline_crypt_key(Ptr<SuperDefinitions.super_block> sb, Ptr<fscrypt_prepared_key> prep_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fscrypt_dio_supported(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_generate_dun((const struct fscrypt_inode_info*)$arg1, $arg2, $arg3)")
    public static void fscrypt_generate_dun(Ptr<fscrypt_inode_info> ci, @Unsigned long lblk_num, Ptr<@Unsigned Long> dun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<BlockDefinitions.block_device>> fscrypt_get_devices(Ptr<SuperDefinitions.super_block> sb, Ptr<@Unsigned Integer> num_devs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_get_direct_key((const struct fscrypt_inode_info*)$arg1, (const u8*)$arg2)")
    public static Ptr<fscrypt_direct_key> fscrypt_get_direct_key(Ptr<fscrypt_inode_info> ci, Ptr<Character> raw_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_get_dun_bytes((const struct fscrypt_inode_info*)$arg1)")
    public static @Unsigned int fscrypt_get_dun_bytes(Ptr<fscrypt_inode_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_limit_io_blocks((const struct inode*)$arg1, $arg2, $arg3)")
    public static @Unsigned long fscrypt_limit_io_blocks(Ptr<runtime.inode> inode2, @Unsigned long lblk, @Unsigned long nr_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_mergeable_bio($arg1, (const struct inode*)$arg2, $arg3)")
    public static boolean fscrypt_mergeable_bio(Ptr<runtime.bio> bio2, Ptr<runtime.inode> inode2, @Unsigned long next_lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_mergeable_bio_bh($arg1, (const struct buffer_head*)$arg2)")
    public static boolean fscrypt_mergeable_bio_bh(Ptr<runtime.bio> bio2, Ptr<BufferDefinitions.buffer_head> next_bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_prepare_inline_crypt_key($arg1, (const u8*)$arg2, (const struct fscrypt_inode_info*)$arg3)")
    public static int fscrypt_prepare_inline_crypt_key(Ptr<fscrypt_prepared_key> prep_key, Ptr<Character> raw_key, Ptr<fscrypt_inode_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fscrypt_put_direct_key(Ptr<fscrypt_direct_key> dk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_select_encryption_impl(Ptr<fscrypt_inode_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_set_bio_crypt_ctx($arg1, (const struct inode*)$arg2, $arg3, $arg4)")
    public static void fscrypt_set_bio_crypt_ctx(Ptr<runtime.bio> bio2, Ptr<runtime.inode> inode2, @Unsigned long first_lblk, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_set_bio_crypt_ctx_bh($arg1, (const struct buffer_head*)$arg2, $arg3)")
    public static void fscrypt_set_bio_crypt_ctx_bh(Ptr<runtime.bio> bio2, Ptr<BufferDefinitions.buffer_head> first_bh, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fscrypt_setup_v1_file_key($arg1, (const u8*)$arg2)")
    public static int fscrypt_setup_v1_file_key(Ptr<fscrypt_inode_info> ci, Ptr<Character> raw_master_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fscrypt_setup_v1_file_key_via_subscribed_keyrings(Ptr<fscrypt_inode_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_get_policy_ex_arg")
    @NotUsableInJava
    public static class fscrypt_get_policy_ex_arg
    extends Struct {
        public @Unsigned long policy_size;
        public PolicyDefinitions.policy_of_fscrypt_get_policy_ex_arg policy;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_symlink_data")
    @NotUsableInJava
    public static class fscrypt_symlink_data
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short len;
        public char @Size(value=0) [] encrypted_path;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_get_key_status_arg")
    @NotUsableInJava
    public static class fscrypt_get_key_status_arg
    extends Struct {
        public fscrypt_key_specifier key_spec;
        public @Unsigned int @Size(value=6) [] __reserved;
        public @Unsigned int status;
        public @Unsigned int status_flags;
        public @Unsigned int user_count;
        public @Unsigned int @Size(value=13) [] __out_reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_remove_key_arg")
    @NotUsableInJava
    public static class fscrypt_remove_key_arg
    extends Struct {
        public fscrypt_key_specifier key_spec;
        public @Unsigned int removal_status_flags;
        public @Unsigned int @Size(value=5) [] __reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_add_key_arg")
    @NotUsableInJava
    public static class fscrypt_add_key_arg
    extends Struct {
        public fscrypt_key_specifier key_spec;
        public @Unsigned int raw_size;
        public @Unsigned int key_id;
        public @Unsigned int @Size(value=8) [] __reserved;
        public char @Size(value=0) [] raw;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_provisioning_key_payload")
    @NotUsableInJava
    public static class fscrypt_provisioning_key_payload
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int __reserved;
        public char @Size(value=0) [] raw;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_keyring")
    @NotUsableInJava
    public static class fscrypt_keyring
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.hlist_head @Size(value=128) [] key_hashtable;
    }

    @Type(noCCodeGeneration=true, cType="union fscrypt_context")
    @NotUsableInJava
    public static class fscrypt_context
    extends Union {
        public char version;
        public fscrypt_context_v1 v1;
        public fscrypt_context_v2 v2;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_context_v2")
    @NotUsableInJava
    public static class fscrypt_context_v2
    extends Struct {
        public char version;
        public char contents_encryption_mode;
        public char filenames_encryption_mode;
        public char flags;
        public char log2_data_unit_size;
        public char @Size(value=3) [] __reserved;
        public char @Size(value=16) [] master_key_identifier;
        public char @Size(value=16) [] nonce;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_context_v1")
    @NotUsableInJava
    public static class fscrypt_context_v1
    extends Struct {
        public char version;
        public char contents_encryption_mode;
        public char filenames_encryption_mode;
        public char flags;
        public char @Size(value=8) [] master_key_descriptor;
        public char @Size(value=16) [] nonce;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_nokey_name")
    @NotUsableInJava
    public static class fscrypt_nokey_name
    extends Struct {
        public @Unsigned int @Size(value=2) [] dirhash;
        public char @Size(value=149) [] bytes;
        public char @Size(value=32) [] sha256;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_name")
    @NotUsableInJava
    public static class fscrypt_name
    extends Struct {
        public Ptr<runtime.qstr> usr_fname;
        public fscrypt_str disk_name;
        public @Unsigned int hash;
        public @Unsigned int minor_hash;
        public fscrypt_str crypto_buf;
        public boolean is_nokey_name;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_str")
    @NotUsableInJava
    public static class fscrypt_str
    extends Struct {
        public String name;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_dummy_policy")
    @NotUsableInJava
    public static class fscrypt_dummy_policy
    extends Struct {
        public Ptr<fscrypt_policy> policy;
    }

    @Type(noCCodeGeneration=true, cType="union fscrypt_iv")
    @NotUsableInJava
    public static class fscrypt_iv
    extends Union {
        public AnonDefinitions.anon_member_of_fscrypt_iv anon0;
        public char @Size(value=32) [] raw;
        public @Unsigned @OriginalName(value="__le64") long @Size(value=4) [] dun;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_master_key_secret")
    @NotUsableInJava
    public static class fscrypt_master_key_secret
    extends Struct {
        public fscrypt_hkdf hkdf;
        public @Unsigned int size;
        public char @Size(value=64) [] raw;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_hkdf")
    @NotUsableInJava
    public static class fscrypt_hkdf
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_shash> hmac_tfm;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_direct_key")
    @NotUsableInJava
    public static class fscrypt_direct_key
    extends Struct {
        public Ptr<SuperDefinitions.super_block> dk_sb;
        public misc.hlist_node dk_node;
        public @OriginalName(value="refcount_t") misc.refcount_struct dk_refcount;
        public Ptr<fscrypt_mode> dk_mode;
        public fscrypt_prepared_key dk_key;
        public char @Size(value=8) [] dk_descriptor;
        public char @Size(value=64) [] dk_raw;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_master_key")
    @NotUsableInJava
    public static class fscrypt_master_key
    extends Struct {
        public misc.hlist_node mk_node;
        public misc.rw_semaphore mk_sem;
        public @OriginalName(value="refcount_t") misc.refcount_struct mk_active_refs;
        public @OriginalName(value="refcount_t") misc.refcount_struct mk_struct_refs;
        public misc.callback_head mk_rcu_head;
        public fscrypt_master_key_secret mk_secret;
        public fscrypt_key_specifier mk_spec;
        public Ptr<runtime.key> mk_users;
        public ListDefinitions.list_head mk_decrypted_inodes;
        public  @OriginalName(value="spinlock_t") runtime.spinlock mk_decrypted_inodes_lock;
        public fscrypt_prepared_key @Size(value=11) [] mk_direct_keys;
        public fscrypt_prepared_key @Size(value=11) [] mk_iv_ino_lblk_64_keys;
        public fscrypt_prepared_key @Size(value=11) [] mk_iv_ino_lblk_32_keys;
        public misc.siphash_key_t mk_ino_hash_key;
        public boolean mk_ino_hash_key_initialized;
        public boolean mk_present;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_mode")
    @NotUsableInJava
    public static class fscrypt_mode
    extends Struct {
        public String friendly_name;
        public String cipher_str;
        public int keysize;
        public int security_strength;
        public int ivsize;
        public int logged_cryptoapi_impl;
        public int logged_blk_crypto_native;
        public int logged_blk_crypto_fallback;
        public BlkDefinitions.blk_crypto_mode_num blk_crypto_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_prepared_key")
    @NotUsableInJava
    public static class fscrypt_prepared_key
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_skcipher> tfm;
        public Ptr<BlkDefinitions.blk_crypto_key> blk_key;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_key_specifier")
    @NotUsableInJava
    public static class fscrypt_key_specifier
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int __reserved;
        public UDefinitions.u_of_fscrypt_key_specifier u;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_policy_v2")
    @NotUsableInJava
    public static class fscrypt_policy_v2
    extends Struct {
        public char version;
        public char contents_encryption_mode;
        public char filenames_encryption_mode;
        public char flags;
        public char log2_data_unit_size;
        public char @Size(value=3) [] __reserved;
        public char @Size(value=16) [] master_key_identifier;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_key")
    @NotUsableInJava
    public static class fscrypt_key
    extends Struct {
        public @Unsigned int mode;
        public char @Size(value=64) [] raw;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_policy_v1")
    @NotUsableInJava
    public static class fscrypt_policy_v1
    extends Struct {
        public char version;
        public char contents_encryption_mode;
        public char filenames_encryption_mode;
        public char flags;
        public char @Size(value=8) [] master_key_descriptor;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_inode_info")
    @NotUsableInJava
    public static class fscrypt_inode_info
    extends Struct {
        public fscrypt_prepared_key ci_enc_key;
        public char ci_owns_key;
        public char ci_inlinecrypt;
        public char ci_dirhash_key_initialized;
        public char ci_data_unit_bits;
        public char ci_data_units_per_block_bits;
        public @Unsigned int ci_hashed_ino;
        public Ptr<fscrypt_mode> ci_mode;
        public Ptr<runtime.inode> ci_inode;
        public Ptr<fscrypt_master_key> ci_master_key;
        public ListDefinitions.list_head ci_master_key_link;
        public Ptr<fscrypt_direct_key> ci_direct_key;
        public misc.siphash_key_t ci_dirhash_key;
        public fscrypt_policy ci_policy;
        public char @Size(value=16) [] ci_nonce;
    }

    @Type(noCCodeGeneration=true, cType="union fscrypt_policy")
    @NotUsableInJava
    public static class fscrypt_policy
    extends Union {
        public char version;
        public fscrypt_policy_v1 v1;
        public fscrypt_policy_v2 v2;
    }

    @Type(noCCodeGeneration=true, cType="struct fscrypt_operations")
    @NotUsableInJava
    public static class fscrypt_operations
    extends Struct {
        public @Unsigned int needs_bounce_pages;
        public @Unsigned int has_32bit_inodes;
        public @Unsigned int supports_subblock_data_units;
        public String legacy_key_prefix;
        public Ptr<?> get_context;
        public Ptr<?> set_context;
        public Ptr<?> get_dummy_policy;
        public Ptr<?> empty_dir;
        public Ptr<?> has_stable_inodes;
        public Ptr<?> get_devices;
    }
}

