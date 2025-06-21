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
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.HashDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FsverityDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsverity_enqueue_verify_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsverity_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsverity_init_workqueue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsverity_ioctl_enable($arg1, (const void*)$arg2)")
    public static int fsverity_ioctl_enable(Ptr<runtime.file> filp, Ptr<?> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsverity_msg((const struct inode*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4_)")
    public static void fsverity_msg(Ptr<runtime.inode> inode2, String level, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsverity_verify_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fsverity_verify_blocks(Ptr<runtime.folio> folio2, @Unsigned long len, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fsverity_cleanup_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fsverity_file_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fsverity_prepare_setattr(Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsverity_create_info((const struct inode*)$arg1, $arg2)")
    public static Ptr<fsverity_info> fsverity_create_info(Ptr<runtime.inode> inode2, Ptr<fsverity_descriptor> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsverity_free_info(Ptr<fsverity_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsverity_get_descriptor(Ptr<runtime.inode> inode2, Ptr<Ptr<fsverity_descriptor>> desc_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsverity_init_info_cache() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsverity_init_merkle_tree_params($arg1, (const struct inode*)$arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int fsverity_init_merkle_tree_params(Ptr<misc.merkle_tree_params> params, Ptr<runtime.inode> inode2, @Unsigned int hash_algorithm, @Unsigned int log_blocksize, Ptr<Character> salt2, @Unsigned long salt_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsverity_init_signature() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsverity_set_info(Ptr<runtime.inode> inode2, Ptr<fsverity_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsverity_verify_signature((const struct fsverity_info*)$arg1, (const u8*)$arg2, $arg3)")
    public static int fsverity_verify_signature(Ptr<fsverity_info> vi, Ptr<Character> signature, @Unsigned long sig_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsverity_check_hash_algs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct fsverity_hash_alg*)fsverity_get_hash_alg((const struct inode*)$arg1, $arg2))")
    public static Ptr<fsverity_hash_alg> fsverity_get_hash_alg(Ptr<runtime.inode> inode2, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsverity_hash_block((const struct merkle_tree_params*)$arg1, (const struct inode*)$arg2, (const void*)$arg3, $arg4)")
    public static int fsverity_hash_block(Ptr<misc.merkle_tree_params> params, Ptr<runtime.inode> inode2, Ptr<?> data, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsverity_hash_buffer((const struct fsverity_hash_alg*)$arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int fsverity_hash_buffer(Ptr<fsverity_hash_alg> alg, Ptr<?> data, @Unsigned long size, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsverity_ioctl_read_metadata($arg1, (const void*)$arg2)")
    public static int fsverity_ioctl_read_metadata(Ptr<runtime.file> filp, Ptr<?> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)fsverity_prepare_hash_state((const struct fsverity_hash_alg*)$arg1, (const u8*)$arg2, $arg3))")
    public static Ptr<Character> fsverity_prepare_hash_state(Ptr<fsverity_hash_alg> alg, Ptr<Character> salt2, @Unsigned long salt_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fsverity_read_buffer($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int fsverity_read_buffer(Ptr<?> dst, @Unsigned long offset, int length, Ptr<?> src, @Unsigned long src_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsverity_get_digest(Ptr<runtime.inode> inode2, Ptr<Character> raw_digest, Ptr<Character> alg, Ptr<HashDefinitions.hash_algo> halg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fsverity_init_bpf() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fsverity_ioctl_measure(Ptr<runtime.file> filp, Ptr<?> _uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fsverity_read_metadata_arg")
    @NotUsableInJava
    public static class fsverity_read_metadata_arg
    extends Struct {
        public @Unsigned long metadata_type;
        public @Unsigned long offset;
        public @Unsigned long length;
        public @Unsigned long buf_ptr;
        public @Unsigned long __reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct fsverity_formatted_digest")
    @NotUsableInJava
    public static class fsverity_formatted_digest
    extends Struct {
        public char @Size(value=8) [] magic;
        public @Unsigned @OriginalName(value="__le16") short digest_algorithm;
        public @Unsigned @OriginalName(value="__le16") short digest_size;
        public char @Size(value=0) [] digest;
    }

    @Type(noCCodeGeneration=true, cType="struct fsverity_descriptor")
    @NotUsableInJava
    public static class fsverity_descriptor
    extends Struct {
        public char version;
        public char hash_algorithm;
        public char log_blocksize;
        public char salt_size;
        public @Unsigned @OriginalName(value="__le32") int sig_size;
        public @Unsigned @OriginalName(value="__le64") long data_size;
        public char @Size(value=64) [] root_hash;
        public char @Size(value=32) [] salt;
        public char @Size(value=144) [] __reserved;
        public char @Size(value=0) [] signature;
    }

    @Type(noCCodeGeneration=true, cType="struct fsverity_enable_arg")
    @NotUsableInJava
    public static class fsverity_enable_arg
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int hash_algorithm;
        public @Unsigned int block_size;
        public @Unsigned int salt_size;
        public @Unsigned long salt_ptr;
        public @Unsigned int sig_size;
        public @Unsigned int __reserved1;
        public @Unsigned long sig_ptr;
        public @Unsigned long @Size(value=11) [] __reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct fsverity_hash_alg")
    @NotUsableInJava
    public static class fsverity_hash_alg
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_shash> tfm;
        public String name;
        public @Unsigned int digest_size;
        public @Unsigned int block_size;
        public HashDefinitions.hash_algo algo_id;
    }

    @Type(noCCodeGeneration=true, cType="struct fsverity_digest")
    @NotUsableInJava
    public static class fsverity_digest
    extends Struct {
        public @Unsigned short digest_algorithm;
        public @Unsigned short digest_size;
        public char @Size(value=0) [] digest;
    }

    @Type(noCCodeGeneration=true, cType="struct fsverity_info")
    @NotUsableInJava
    public static class fsverity_info
    extends Struct {
        public misc.merkle_tree_params tree_params;
        public char @Size(value=64) [] root_hash;
        public char @Size(value=64) [] file_digest;
        public Ptr<runtime.inode> inode;
        public Ptr<@Unsigned Long> hash_block_verified;
    }

    @Type(noCCodeGeneration=true, cType="struct fsverity_operations")
    @NotUsableInJava
    public static class fsverity_operations
    extends Struct {
        public Ptr<?> begin_enable_verity;
        public Ptr<?> end_enable_verity;
        public Ptr<?> get_verity_descriptor;
        public Ptr<?> read_merkle_tree_page;
        public Ptr<?> write_merkle_tree_block;
    }
}

