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
import me.bechberger.ebpf.runtime.ImaDefinitions;
import me.bechberger.ebpf.runtime.IntegrityDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class EvmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evm_file_release(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evm_inode_alloc_security(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_copy_up_xattr($arg1, (const u8*)$arg2)")
    public static int evm_inode_copy_up_xattr(Ptr<runtime.dentry> src, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_init_security($arg1, $arg2, (const struct qstr*)$arg3, $arg4, $arg5)")
    public static int evm_inode_init_security(Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> qstr2, Ptr<runtime.xattr> xattrs, Ptr<Integer> xattr_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_post_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static void evm_inode_post_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_post_removexattr($arg1, (const u8*)$arg2)")
    public static void evm_inode_post_removexattr(Ptr<runtime.dentry> dentry2, String xattr_name2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_post_set_acl($arg1, (const u8*)$arg2, $arg3)")
    public static void evm_inode_post_set_acl(Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evm_inode_post_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, int ia_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_post_setxattr($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static void evm_inode_post_setxattr(Ptr<runtime.dentry> dentry2, String xattr_name2, Ptr<?> xattr_value, @Unsigned long xattr_value_len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int evm_inode_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_removexattr($arg1, $arg2, (const u8*)$arg3)")
    public static int evm_inode_removexattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String xattr_name2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_set_acl($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int evm_inode_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evm_inode_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_inode_setxattr($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int evm_inode_setxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String xattr_name2, Ptr<?> xattr_value, @Unsigned long xattr_value_len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean evm_metadata_changed(Ptr<runtime.inode> inode2, Ptr<runtime.inode> metadata_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void evm_post_path_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_protected_xattr((const u8*)$arg1)")
    public static int evm_protected_xattr(String req_xattr_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_protected_xattr_common((const u8*)$arg1, $arg2)")
    public static int evm_protected_xattr_common(String req_xattr_name, boolean all_xattrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_protected_xattr_if_enabled((const u8*)$arg1)")
    public static int evm_protected_xattr_if_enabled(String req_xattr_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evm_read_protected_xattrs(Ptr<runtime.dentry> dentry2, Ptr<Character> buffer, int buffer_size, char type2, boolean canonical_fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_revalidate_status((const u8*)$arg1)")
    public static boolean evm_revalidate_status(String xattr_name2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evm_set_fixmode(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static IntegrityDefinitions.integrity_status evm_verify_current_integrity(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_verify_hmac($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static IntegrityDefinitions.integrity_status evm_verify_hmac(Ptr<runtime.dentry> dentry2, String xattr_name2, String xattr_value, @Unsigned long xattr_value_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_verifyxattr($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static IntegrityDefinitions.integrity_status evm_verifyxattr(Ptr<runtime.dentry> dentry2, String xattr_name2, Ptr<?> xattr_value, @Unsigned long xattr_value_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_calc_hash($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int evm_calc_hash(Ptr<runtime.dentry> dentry2, String req_xattr_name, String req_xattr_value, @Unsigned long req_xattr_value_len, char type2, Ptr<evm_digest> data, Ptr<evm_iint_cache> iint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_calc_hmac($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static int evm_calc_hmac(Ptr<runtime.dentry> dentry2, String req_xattr_name, String req_xattr_value, @Unsigned long req_xattr_value_len, Ptr<evm_digest> data, Ptr<evm_iint_cache> iint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_calc_hmac_or_hash($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int evm_calc_hmac_or_hash(Ptr<runtime.dentry> dentry2, String req_xattr_name, String req_xattr_value, @Unsigned long req_xattr_value_len, @OriginalName(value="uint8_t") char type2, Ptr<evm_digest> data, Ptr<evm_iint_cache> iint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_init_hmac($arg1, (const struct xattr*)$arg2, $arg3)")
    public static int evm_init_hmac(Ptr<runtime.inode> inode2, Ptr<runtime.xattr> xattrs, String hmac_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evm_init_key() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evm_set_key(Ptr<?> key2, @Unsigned long keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_update_evmxattr($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static int evm_update_evmxattr(Ptr<runtime.dentry> dentry2, String xattr_name2, String xattr_value, @Unsigned long xattr_value_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int evm_init_secfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long evm_read_key(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_write_key($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long evm_write_key(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="evm_write_xattrs($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long evm_write_xattrs(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct evm_digest")
    @NotUsableInJava
    public static class evm_digest
    extends Struct {
        public ImaDefinitions.ima_digest_data_hdr hdr;
        public char @Size(value=64) [] digest;
    }

    @Type(noCCodeGeneration=true, cType="struct evm_iint_cache")
    @NotUsableInJava
    public static class evm_iint_cache
    extends Struct {
        public @Unsigned long flags;
        public IntegrityDefinitions.integrity_status evm_status;
        public IntegrityDefinitions.integrity_inode_attributes metadata_inode;
    }

    @Type(noCCodeGeneration=true, cType="struct evm_xattr")
    @NotUsableInJava
    public static class evm_xattr
    extends Struct {
        public evm_ima_xattr_data_hdr data;
        public char @Size(value=20) [] digest;
    }

    @Type(noCCodeGeneration=true, cType="struct evm_ima_xattr_data")
    @NotUsableInJava
    public static class evm_ima_xattr_data
    extends Struct {
        @InlineUnion(value=13616)
        public  @InlineUnion(value=13616) AnonDefinitions.anon_member_of_anon_member_of_evm_ima_xattr_data anon0$0;
        @InlineUnion(value=13616)
        public @InlineUnion(value=13616) evm_ima_xattr_data_hdr hdr;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct evm_ima_xattr_data_hdr")
    @NotUsableInJava
    public static class evm_ima_xattr_data_hdr
    extends Struct {
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="enum evm_ima_xattr_type")
    public static enum evm_ima_xattr_type implements Enum<evm_ima_xattr_type>,
    TypedEnum<evm_ima_xattr_type, Integer>
    {
        IMA_XATTR_DIGEST,
        EVM_XATTR_HMAC,
        EVM_IMA_XATTR_DIGSIG,
        IMA_XATTR_DIGEST_NG,
        EVM_XATTR_PORTABLE_DIGSIG,
        IMA_VERITY_DIGSIG,
        IMA_XATTR_LAST;

    }
}

