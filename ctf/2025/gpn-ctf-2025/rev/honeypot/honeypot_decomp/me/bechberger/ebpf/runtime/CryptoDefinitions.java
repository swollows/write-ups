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
import me.bechberger.ebpf.runtime.AeadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LskcipherDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.ShashDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkcipherDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CryptoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__crypto_xor($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void __crypto_xor(Ptr<Character> dst, Ptr<Character> src1, Ptr<Character> src2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.acomp_req> crypto_acomp_scomp_alloc_ctx(Ptr<misc.acomp_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_acomp_scomp_free_ctx(Ptr<misc.acomp_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_aead_decrypt(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_aead_encrypt(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_aead_exit_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_aead_free_instance(Ptr<crypto_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_aead_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_aead_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_aead_setauthsize(Ptr<crypto_aead> tfm, @Unsigned int authsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_aead_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_aead_setkey(Ptr<crypto_aead> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_aead_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_aead((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_aead> crypto_alloc_aead(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_kpp((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_kpp> crypto_alloc_kpp(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_lskcipher((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_lskcipher> crypto_alloc_lskcipher(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_shash((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_shash> crypto_alloc_shash(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_cbc_create(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_cbc_decrypt($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int crypto_cbc_decrypt(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int len, Ptr<Character> iv, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_cbc_decrypt_inplace(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, @Unsigned int nbytes, Ptr<Character> iv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_cbc_decrypt_segment($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_cbc_decrypt_segment(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int nbytes, Ptr<Character> oiv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_cbc_encrypt($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int crypto_cbc_encrypt(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int len, Ptr<Character> iv, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_cbc_encrypt_inplace(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, @Unsigned int nbytes, Ptr<Character> oiv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_cbc_encrypt_segment($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_cbc_encrypt_segment(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int nbytes, Ptr<Character> iv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_cbc_module_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_cbc_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_shash> crypto_clone_shash(Ptr<crypto_shash> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_comp_compress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_comp_compress(Ptr<crypto_comp> comp, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_comp_decompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_comp_decompress(Ptr<crypto_comp> comp, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_ecdh_shared_secret($arg1, $arg2, (const long long unsigned int*)$arg3, (const long long unsigned int*)$arg4, $arg5)")
    public static int crypto_ecdh_shared_secret(@Unsigned int curve_id, @Unsigned int ndigits, Ptr<@Unsigned Long> private_key, Ptr<@Unsigned Long> public_key2, Ptr<@Unsigned Long> secret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_exit_scomp_ops_async(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_gcm_base_create(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_gcm_create(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_gcm_create_common($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static int crypto_gcm_create_common(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb, String ctr_name, String ghash_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_gcm_decrypt(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_gcm_encrypt(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_gcm_exit_tfm(Ptr<crypto_aead> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_gcm_free(Ptr<AeadDefinitions.aead_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_gcm_init_common(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_gcm_init_tfm(Ptr<crypto_aead> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_gcm_module_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_gcm_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_gcm_setauthsize(Ptr<crypto_aead> tfm, @Unsigned int authsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_gcm_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_gcm_setkey(Ptr<crypto_aead> aead, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_gcm_verify(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_grab_aead($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int crypto_grab_aead(Ptr<crypto_aead_spawn> spawn, Ptr<crypto_instance> inst, String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_grab_kpp($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int crypto_grab_kpp(Ptr<crypto_kpp_spawn> spawn, Ptr<crypto_instance> inst, String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_grab_lskcipher($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int crypto_grab_lskcipher(Ptr<crypto_lskcipher_spawn> spawn, Ptr<crypto_instance> inst, String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_grab_shash($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int crypto_grab_shash(Ptr<crypto_shash_spawn> spawn, Ptr<crypto_instance> inst, String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_has_aead((const u8*)$arg1, $arg2, $arg3)")
    public static int crypto_has_aead(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_has_kpp((const u8*)$arg1, $arg2, $arg3)")
    public static int crypto_has_kpp(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_has_shash((const u8*)$arg1, $arg2, $arg3)")
    public static int crypto_has_shash(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_init_lskcipher_ops_sg(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_init_scomp_ops_async(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_kpp_exit_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_kpp_free_instance(Ptr<crypto_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_kpp_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_kpp_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_kpp_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_lskcipher_crypt_sg($arg1, (int (*)(struct crypto_lskcipher*, const u8*, u8*, unsigned int, u8*, unsigned int))$arg2)")
    public static int crypto_lskcipher_crypt_sg(Ptr<SkcipherDefinitions.skcipher_request> req2, Ptr<?> crypt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_lskcipher_crypt_unaligned($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (int (*)(struct crypto_lskcipher*, const u8*, u8*, unsigned int, u8*, unsigned int))$arg6)")
    public static int crypto_lskcipher_crypt_unaligned(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int len, Ptr<Character> iv, Ptr<?> crypt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_lskcipher_decrypt($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_lskcipher_decrypt(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int len, Ptr<Character> iv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_lskcipher_decrypt_sg(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_lskcipher_encrypt($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_lskcipher_encrypt(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int len, Ptr<Character> iv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_lskcipher_encrypt_sg(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_lskcipher_exit_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_lskcipher_exit_tfm_sg(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_lskcipher_free_instance(Ptr<crypto_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_lskcipher_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_lskcipher_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_lskcipher_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_lskcipher_setkey(Ptr<crypto_lskcipher> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_lskcipher_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_aead(Ptr<AeadDefinitions.aead_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_aeads(Ptr<AeadDefinitions.aead_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_kpp(Ptr<misc.kpp_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_lskcipher(Ptr<LskcipherDefinitions.lskcipher_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_lskciphers(Ptr<LskcipherDefinitions.lskcipher_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_scomp(Ptr<misc.scomp_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_scomps(Ptr<misc.scomp_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_shash(Ptr<ShashDefinitions.shash_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_shashes(Ptr<ShashDefinitions.shash_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4106_create(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AeadDefinitions.aead_request> crypto_rfc4106_crypt(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4106_decrypt(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4106_encrypt(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_rfc4106_exit_tfm(Ptr<crypto_aead> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_rfc4106_free(Ptr<AeadDefinitions.aead_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4106_init_tfm(Ptr<crypto_aead> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4106_setauthsize(Ptr<crypto_aead> parent, @Unsigned int authsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_rfc4106_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_rfc4106_setkey(Ptr<crypto_aead> parent, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4543_copy_src_to_dst(Ptr<AeadDefinitions.aead_request> req2, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4543_create(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4543_crypt(Ptr<AeadDefinitions.aead_request> req2, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4543_decrypt(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4543_encrypt(Ptr<AeadDefinitions.aead_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_rfc4543_exit_tfm(Ptr<crypto_aead> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_rfc4543_free(Ptr<AeadDefinitions.aead_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4543_init_tfm(Ptr<crypto_aead> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc4543_setauthsize(Ptr<crypto_aead> parent, @Unsigned int authsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_rfc4543_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_rfc4543_setkey(Ptr<crypto_aead> parent, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_scomp_free_scratches() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_scomp_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_scomp_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_scomp_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_sha256_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sha256_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crypto_sha256_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sha256_update($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_sha256_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_shash_digest($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crypto_shash_digest(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_shash_exit_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_shash_export(Ptr<ShashDefinitions.shash_desc> desc, Ptr<?> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_shash_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_shash_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crypto_shash_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_shash_free_instance(Ptr<crypto_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_shash_import($arg1, (const void*)$arg2)")
    public static int crypto_shash_import(Ptr<ShashDefinitions.shash_desc> desc, Ptr<?> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_shash_init(Ptr<ShashDefinitions.shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_shash_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_shash_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_shash_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_shash_setkey(Ptr<crypto_shash> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_shash_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_shash_tfm_digest($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crypto_shash_tfm_digest(Ptr<crypto_shash> tfm, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_shash_update($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_shash_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_aead(Ptr<AeadDefinitions.aead_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_aeads(Ptr<AeadDefinitions.aead_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_kpp(Ptr<misc.kpp_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_lskcipher(Ptr<LskcipherDefinitions.lskcipher_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_lskciphers(Ptr<LskcipherDefinitions.lskcipher_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_scomp(Ptr<misc.scomp_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_scomps(Ptr<misc.scomp_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_shash(Ptr<ShashDefinitions.shash_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_shashes(Ptr<ShashDefinitions.shash_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_acomp_exit_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int crypto_acomp_extsize(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_acomp_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_acomp_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_acomp_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ahash_digest(Ptr<misc.ahash_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_ahash_exit_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ahash_export(Ptr<misc.ahash_request> req2, Ptr<?> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int crypto_ahash_extsize(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ahash_final(Ptr<misc.ahash_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ahash_finup(Ptr<misc.ahash_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_ahash_free_instance(Ptr<crypto_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_ahash_import($arg1, (const void*)$arg2)")
    public static int crypto_ahash_import(Ptr<misc.ahash_request> req2, Ptr<?> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ahash_init(Ptr<misc.ahash_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ahash_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ahash_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_ahash_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_ahash_setkey(Ptr<crypto_ahash> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_ahash_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ahash_update(Ptr<misc.ahash_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_acomp((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_acomp> crypto_alloc_acomp(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_acomp_node((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<crypto_acomp> crypto_alloc_acomp_node(String alg_name, @Unsigned int type2, @Unsigned int mask, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_ahash((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_ahash> crypto_alloc_ahash(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_sig((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_sig> crypto_alloc_sig(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_cipher_decrypt_one($arg1, $arg2, (const u8*)$arg3)")
    public static void crypto_cipher_decrypt_one(Ptr<crypto_cipher> tfm, Ptr<Character> dst, Ptr<Character> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_cipher_encrypt_one($arg1, $arg2, (const u8*)$arg3)")
    public static void crypto_cipher_encrypt_one(Ptr<crypto_cipher> tfm, Ptr<Character> dst, Ptr<Character> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_cipher_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_cipher_setkey(Ptr<crypto_cipher> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_ahash> crypto_clone_ahash(Ptr<crypto_ahash> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_cipher> crypto_clone_cipher(Ptr<crypto_cipher> cipher) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_exit_ahash_using_shash(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_exit_proc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_free_cb(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_sync_skcipher> crypto_get_default_null_skcipher() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_grab_ahash($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int crypto_grab_ahash(Ptr<crypto_ahash_spawn> spawn, Ptr<crypto_instance> inst, String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_has_ahash((const u8*)$arg1, $arg2, $arg3)")
    public static int crypto_has_ahash(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_hash_walk_done(Ptr<crypto_hash_walk> walk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_hash_walk_first(Ptr<misc.ahash_request> req2, Ptr<crypto_hash_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_init_proc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_kfunc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_null_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_null_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_put_default_null_skcipher() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_acomp(Ptr<misc.acomp_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_acomps(Ptr<misc.acomp_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_ahash(Ptr<misc.ahash_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_ahashes(Ptr<misc.ahash_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sha512_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crypto_sha512_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sha512_update($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_sha512_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_sig_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_sig_maxsize(Ptr<crypto_sig> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_sig_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sig_set_privkey($arg1, (const void*)$arg2, $arg3)")
    public static int crypto_sig_set_privkey(Ptr<crypto_sig> tfm, Ptr<?> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sig_set_pubkey($arg1, (const void*)$arg2, $arg3)")
    public static int crypto_sig_set_pubkey(Ptr<crypto_sig> tfm, Ptr<?> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_sig_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sig_sign($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_sig_sign(Ptr<crypto_sig> tfm, Ptr<?> src, @Unsigned int slen, Ptr<?> dst, @Unsigned int dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sig_verify($arg1, (const void*)$arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int crypto_sig_verify(Ptr<crypto_sig> tfm, Ptr<?> src, @Unsigned int slen, Ptr<?> digest, @Unsigned int dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_acomp(Ptr<misc.acomp_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_acomps(Ptr<misc.acomp_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_ahash(Ptr<misc.ahash_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_ahashes(Ptr<misc.ahash_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__crypto_alg_lookup((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_alg> __crypto_alg_lookup(String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_tfm> __crypto_alloc_tfm(Ptr<crypto_alg> alg, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_tfm> __crypto_alloc_tfmgfp(Ptr<crypto_alg> alg, @Unsigned int type2, @Unsigned int mask, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__crypto_lookup_template((const u8*)$arg1)")
    public static Ptr<crypto_template> __crypto_lookup_template(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_larval> __crypto_register_alg(Ptr<crypto_alg> alg, Ptr<ListDefinitions.list_head> algs_to_put) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_aes_decrypt($arg1, $arg2, (const u8*)$arg3)")
    public static void crypto_aes_decrypt(Ptr<crypto_tfm> tfm, Ptr<Character> out, Ptr<Character> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_aes_encrypt($arg1, $arg2, (const u8*)$arg3)")
    public static void crypto_aes_encrypt(Ptr<crypto_tfm> tfm, Ptr<Character> out, Ptr<Character> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_aes_set_key($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_aes_set_key(Ptr<crypto_tfm> tfm, Ptr<Character> in_key, @Unsigned int key_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int crypto_alg_extsize(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_alg_finish_registration(Ptr<crypto_alg> alg, Ptr<ListDefinitions.list_head> algs_to_put) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alg_lookup((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_alg> crypto_alg_lookup(String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alg_mod_lookup((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_alg> crypto_alg_mod_lookup(String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_alg_put(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alg_tested((const u8*)$arg1, $arg2)")
    public static void crypto_alg_tested(String name, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_algapi_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_algapi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_base((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_tfm> crypto_alloc_base(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_rng((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_rng> crypto_alloc_rng(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_skcipher((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_skcipher> crypto_alloc_skcipher(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_sync_skcipher((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_sync_skcipher> crypto_alloc_sync_skcipher(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_tfm_node((const u8*)$arg1, (const struct crypto_type*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<?> crypto_alloc_tfm_node(String alg_name, Ptr<crypto_type> frontend, @Unsigned int type2, @Unsigned int mask, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)crypto_attr_alg_name($arg1))")
    public static String crypto_attr_alg_name(Ptr<runtime.rtattr> rta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_check_alg(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_check_attr_type(Ptr<Ptr<runtime.rtattr>> tb, @Unsigned int type2, Ptr<@Unsigned Integer> mask_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_clone_tfm((const struct crypto_type*)$arg1, $arg2)")
    public static Ptr<?> crypto_clone_tfm(Ptr<crypto_type> frontend, Ptr<crypto_tfm> otfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_create_tfm_node($arg1, (const struct crypto_type*)$arg2, $arg3)")
    public static Ptr<?> crypto_create_tfm_node(Ptr<crypto_alg> alg, Ptr<crypto_type> frontend, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_cts_create(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_cts_decrypt(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_cts_decrypt_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_cts_encrypt(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_cts_encrypt_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_cts_exit_tfm(Ptr<crypto_skcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_cts_free(Ptr<SkcipherDefinitions.skcipher_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_cts_init_tfm(Ptr<crypto_skcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_cts_module_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_cts_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_cts_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_cts_setkey(Ptr<crypto_skcipher> parent, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_del_default_rng() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_async_request> crypto_dequeue_request(Ptr<crypto_queue> queue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_destroy_instance(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_destroy_instance_workfn(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_destroy_tfm(Ptr<?> mem, Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_drop_spawn(Ptr<crypto_spawn> spawn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_ecdh_decode_key((const u8*)$arg1, $arg2, $arg3)")
    public static int crypto_ecdh_decode_key(String buf, @Unsigned int len, Ptr<ecdh> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_ecdh_encode_key($arg1, $arg2, (const struct ecdh*)$arg3)")
    public static int crypto_ecdh_encode_key(String buf, @Unsigned int len, Ptr<ecdh> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_ecdh_key_len((const struct ecdh*)$arg1)")
    public static @Unsigned int crypto_ecdh_key_len(Ptr<ecdh> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_enqueue_request(Ptr<crypto_queue> queue, Ptr<crypto_async_request> request2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_enqueue_request_head(Ptr<crypto_queue> queue, Ptr<crypto_async_request> request2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_find_alg((const u8*)$arg1, (const struct crypto_type*)$arg2, $arg3, $arg4)")
    public static Ptr<crypto_alg> crypto_find_alg(String alg_name, Ptr<crypto_type> frontend, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_attr_type> crypto_get_attr_type(Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_get_default_rng() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_grab_skcipher($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int crypto_grab_skcipher(Ptr<crypto_skcipher_spawn> spawn, Ptr<crypto_instance> inst, String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_grab_spawn($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int crypto_grab_spawn(Ptr<crypto_spawn> spawn, Ptr<crypto_instance> inst, String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_has_alg((const u8*)$arg1, $arg2, $arg3)")
    public static int crypto_has_alg(String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_has_skcipher((const u8*)$arg1, $arg2, $arg3)")
    public static int crypto_has_skcipher(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_inc(Ptr<Character> a, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_init_queue(Ptr<crypto_queue> queue, @Unsigned int max_qlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_inst_setname($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_inst_setname(Ptr<crypto_instance> inst, String name, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_larval_alloc((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_larval> crypto_larval_alloc(String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_larval_destroy(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_larval_kill(Ptr<crypto_larval> larval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_alg> crypto_larval_wait(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_lookup_template((const u8*)$arg1)")
    public static Ptr<crypto_template> crypto_lookup_template(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_alg> crypto_mod_get(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_mod_put(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_probing_notify(@Unsigned long val, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_put_default_rng() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_alg(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_algs(Ptr<crypto_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_instance(Ptr<crypto_template> tmpl, Ptr<crypto_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_rng(Ptr<misc.rng_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_rngs(Ptr<misc.rng_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_skcipher(Ptr<SkcipherDefinitions.skcipher_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_skciphers(Ptr<SkcipherDefinitions.skcipher_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_template(Ptr<crypto_template> tmpl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_templates(Ptr<crypto_template> tmpls, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_remove_final(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_remove_instance(Ptr<crypto_instance> inst, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_remove_spawns(Ptr<crypto_alg> alg, Ptr<ListDefinitions.list_head> list, Ptr<crypto_alg> nalg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_req_done(Ptr<?> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rng_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rng_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_rng_reset($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_rng_reset(Ptr<crypto_rng> tfm, Ptr<Character> seed, @Unsigned int slen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_rng_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_schedule_test(Ptr<crypto_larval> larval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_sha3_final(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_sha3_init(Ptr<ShashDefinitions.shash_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sha3_update($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_sha3_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_shoot_alg(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_skcipher_decrypt(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_skcipher_encrypt(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_skcipher_exit_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_skcipher_export(Ptr<SkcipherDefinitions.skcipher_request> req2, Ptr<?> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int crypto_skcipher_extsize(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_skcipher_free_instance(Ptr<crypto_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_skcipher_import($arg1, (const void*)$arg2)")
    public static int crypto_skcipher_import(Ptr<SkcipherDefinitions.skcipher_request> req2, Ptr<?> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_skcipher_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_skcipher_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_skcipher_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_skcipher_setkey(Ptr<crypto_skcipher> tfm, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_skcipher_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_alg> crypto_spawn_alg(Ptr<crypto_spawn> spawn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<crypto_tfm> crypto_spawn_tfm(Ptr<crypto_spawn> spawn, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> crypto_spawn_tfm2(Ptr<crypto_spawn> spawn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_type_has_alg((const u8*)$arg1, (const struct crypto_type*)$arg2, $arg3, $arg4)")
    public static int crypto_type_has_alg(String name, Ptr<crypto_type> frontend, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_alg(Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_algs(Ptr<crypto_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_instance(Ptr<crypto_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_unregister_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_rng(Ptr<misc.rng_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_rngs(Ptr<misc.rng_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_skcipher(Ptr<SkcipherDefinitions.skcipher_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_skciphers(Ptr<SkcipherDefinitions.skcipher_alg> algs, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_template(Ptr<crypto_template> tmpl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_templates(Ptr<crypto_template> tmpls, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__crypto_dh_decode_key((const u8*)$arg1, $arg2, $arg3)")
    public static int __crypto_dh_decode_key(String buf, @Unsigned int len, Ptr<dh> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__crypto_memneq((const void*)$arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long __crypto_memneq(Ptr<?> a, Ptr<?> b, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_akcipher_exit_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_akcipher_free_instance(Ptr<crypto_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_akcipher_init_tfm(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_akcipher_report(Ptr<SkDefinitions.sk_buff> skb, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_akcipher_show(Ptr<SeqDefinitions.seq_file> m, Ptr<crypto_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_akcipher_sync_decrypt($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_akcipher_sync_decrypt(Ptr<crypto_akcipher> tfm, Ptr<?> src, @Unsigned int slen, Ptr<?> dst, @Unsigned int dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_akcipher_sync_encrypt($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_akcipher_sync_encrypt(Ptr<crypto_akcipher> tfm, Ptr<?> src, @Unsigned int slen, Ptr<?> dst, @Unsigned int dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_akcipher_sync_post(Ptr<crypto_akcipher_sync_data> data, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_akcipher_sync_prep(Ptr<crypto_akcipher_sync_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_alloc_akcipher((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<crypto_akcipher> crypto_alloc_akcipher(String alg_name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ctr_create(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ctr_crypt(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_ctr_module_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ctr_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_dh_decode_key((const u8*)$arg1, $arg2, $arg3)")
    public static int crypto_dh_decode_key(String buf, @Unsigned int len, Ptr<dh> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_dh_encode_key($arg1, $arg2, (const struct dh*)$arg3)")
    public static int crypto_dh_encode_key(String buf, @Unsigned int len, Ptr<dh> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_dh_key_len((const struct dh*)$arg1)")
    public static @Unsigned int crypto_dh_key_len(Ptr<dh> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ecb_create(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_ecb_decrypt2($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int crypto_ecb_decrypt2(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int len, Ptr<Character> iv, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_ecb_encrypt2($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int crypto_ecb_encrypt2(Ptr<crypto_lskcipher> tfm, Ptr<Character> src, Ptr<Character> dst, @Unsigned int len, Ptr<Character> iv, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_ecb_module_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_ecb_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_exit_akcipher_ops_sig(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_grab_akcipher($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int crypto_grab_akcipher(Ptr<crypto_akcipher_spawn> spawn, Ptr<crypto_instance> inst, String name, @Unsigned int type2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_init_akcipher_ops_sig(Ptr<crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_kdf108_ctr_generate($arg1, (const struct kvec*)$arg2, $arg3, $arg4, $arg5)")
    public static int crypto_kdf108_ctr_generate(Ptr<crypto_shash> kmd, Ptr<runtime.kvec> info2, @Unsigned int info_nvec, Ptr<Character> dst, @Unsigned int dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_kdf108_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_kdf108_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_kdf108_setkey($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int crypto_kdf108_setkey(Ptr<crypto_shash> kmd, Ptr<Character> key2, @Unsigned long keylen, Ptr<Character> ikm, @Unsigned long ikmlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_register_akcipher(Ptr<misc.akcipher_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc3686_create(Ptr<crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc3686_crypt(Ptr<SkcipherDefinitions.skcipher_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_rfc3686_exit_tfm(Ptr<crypto_skcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_rfc3686_free(Ptr<SkcipherDefinitions.skcipher_instance> inst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crypto_rfc3686_init_tfm(Ptr<crypto_skcipher> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_rfc3686_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_rfc3686_setkey(Ptr<crypto_skcipher> parent, Ptr<Character> key2, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sha1_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int crypto_sha1_finup(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crypto_sha1_update($arg1, (const u8*)$arg2, $arg3)")
    public static int crypto_sha1_update(Ptr<ShashDefinitions.shash_desc> desc, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crypto_unregister_akcipher(Ptr<misc.akcipher_alg> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ecdh")
    @NotUsableInJava
    public static class ecdh
    extends Struct {
        public String key;
        public @Unsigned short key_size;
    }

    @Type(noCCodeGeneration=true, cType="struct dh")
    @NotUsableInJava
    public static class dh
    extends Struct {
        public Ptr<?> key;
        public Ptr<?> p;
        public Ptr<?> g;
        public @Unsigned int key_size;
        public @Unsigned int p_size;
        public @Unsigned int g_size;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_report_rng")
    @NotUsableInJava
    public static class crypto_report_rng
    extends Struct {
        public char @Size(value=64) [] type;
        public @Unsigned int seedsize;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_cts_reqctx")
    @NotUsableInJava
    public static class crypto_cts_reqctx
    extends Struct {
        public runtime.scatterlist @Size(value=2) [] sg;
        public @Unsigned int offset;
        public SkcipherDefinitions.skcipher_request subreq;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_cts_ctx")
    @NotUsableInJava
    public static class crypto_cts_ctx
    extends Struct {
        public Ptr<crypto_skcipher> child;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_queue")
    @NotUsableInJava
    public static class crypto_queue
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<ListDefinitions.list_head> backlog;
        public @Unsigned int qlen;
        public @Unsigned int max_qlen;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_acomp_ctx")
    @NotUsableInJava
    public static class crypto_acomp_ctx
    extends Struct {
        public Ptr<crypto_acomp> acomp;
        public Ptr<misc.acomp_req> req;
        public crypto_wait wait;
        public Ptr<Character> buffer;
        public runtime.mutex mutex;
        public boolean is_sleepable;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_report_acomp")
    @NotUsableInJava
    public static class crypto_report_acomp
    extends Struct {
        public char @Size(value=64) [] type;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_hash_walk")
    @NotUsableInJava
    public static class crypto_hash_walk
    extends Struct {
        public String data;
        public @Unsigned int offset;
        public @Unsigned int flags;
        public Ptr<runtime.page> pg;
        public @Unsigned int entrylen;
        public @Unsigned int total;
        public Ptr<runtime.scatterlist> sg;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_aes_ctx")
    @NotUsableInJava
    public static class crypto_aes_ctx
    extends Struct {
        public @Unsigned int @Size(value=60) [] key_enc;
        public @Unsigned int @Size(value=60) [] key_dec;
        public @Unsigned int key_length;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_sig")
    @NotUsableInJava
    public static class crypto_sig
    extends Struct {
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_rng")
    @NotUsableInJava
    public static class crypto_rng
    extends Struct {
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_gcm_req_priv_ctx")
    @NotUsableInJava
    public static class crypto_gcm_req_priv_ctx
    extends Struct {
        public char @Size(value=16) [] iv;
        public char @Size(value=16) [] auth_tag;
        public char @Size(value=16) [] iauth_tag;
        public runtime.scatterlist @Size(value=3) [] src;
        public runtime.scatterlist @Size(value=3) [] dst;
        public runtime.scatterlist sg;
        public crypto_gcm_ghash_ctx ghash_ctx;
        public UDefinitions.u_of_crypto_gcm_req_priv_ctx u;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_gcm_ghash_ctx")
    @NotUsableInJava
    public static class crypto_gcm_ghash_ctx
    extends Struct {
        public @Unsigned int cryptlen;
        public Ptr<runtime.scatterlist> src;
        public Ptr<?> complete;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_rfc4543_req_ctx")
    @NotUsableInJava
    public static class crypto_rfc4543_req_ctx
    extends Struct {
        public AeadDefinitions.aead_request subreq;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_rfc4543_ctx")
    @NotUsableInJava
    public static class crypto_rfc4543_ctx
    extends Struct {
        public Ptr<crypto_aead> child;
        public Ptr<crypto_sync_skcipher> _null;
        public char @Size(value=4) [] nonce;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_rfc4543_instance_ctx")
    @NotUsableInJava
    public static class crypto_rfc4543_instance_ctx
    extends Struct {
        public crypto_aead_spawn aead;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_rfc4106_req_ctx")
    @NotUsableInJava
    public static class crypto_rfc4106_req_ctx
    extends Struct {
        public runtime.scatterlist @Size(value=3) [] src;
        public runtime.scatterlist @Size(value=3) [] dst;
        public AeadDefinitions.aead_request subreq;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_rfc4106_ctx")
    @NotUsableInJava
    public static class crypto_rfc4106_ctx
    extends Struct {
        public Ptr<crypto_aead> child;
        public char @Size(value=4) [] nonce;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_gcm_ctx")
    @NotUsableInJava
    public static class crypto_gcm_ctx
    extends Struct {
        public Ptr<crypto_skcipher> ctr;
        public Ptr<crypto_ahash> ghash;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_ahash_spawn")
    @NotUsableInJava
    public static class crypto_ahash_spawn
    extends Struct {
        public crypto_spawn base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_ahash")
    @NotUsableInJava
    public static class crypto_ahash
    extends Struct {
        public boolean using_shash;
        public @Unsigned int statesize;
        public @Unsigned int reqsize;
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_report_comp")
    @NotUsableInJava
    public static class crypto_report_comp
    extends Struct {
        public char @Size(value=64) [] type;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_acomp")
    @NotUsableInJava
    public static class crypto_acomp
    extends Struct {
        public Ptr<?> compress;
        public Ptr<?> decompress;
        public Ptr<?> dst_free;
        public @Unsigned int reqsize;
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_report_kpp")
    @NotUsableInJava
    public static class crypto_report_kpp
    extends Struct {
        public char @Size(value=64) [] type;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_kpp_spawn")
    @NotUsableInJava
    public static class crypto_kpp_spawn
    extends Struct {
        public crypto_spawn base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_shash_spawn")
    @NotUsableInJava
    public static class crypto_shash_spawn
    extends Struct {
        public crypto_spawn base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_report_hash")
    @NotUsableInJava
    public static class crypto_report_hash
    extends Struct {
        public char @Size(value=64) [] type;
        public @Unsigned int blocksize;
        public @Unsigned int digestsize;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_report_blkcipher")
    @NotUsableInJava
    public static class crypto_report_blkcipher
    extends Struct {
        public char @Size(value=64) [] type;
        public char @Size(value=64) [] geniv;
        public @Unsigned int blocksize;
        public @Unsigned int min_keysize;
        public @Unsigned int max_keysize;
        public @Unsigned int ivsize;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_report_aead")
    @NotUsableInJava
    public static class crypto_report_aead
    extends Struct {
        public char @Size(value=64) [] type;
        public char @Size(value=64) [] geniv;
        public @Unsigned int blocksize;
        public @Unsigned int maxauthsize;
        public @Unsigned int ivsize;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_aead_spawn")
    @NotUsableInJava
    public static class crypto_aead_spawn
    extends Struct {
        public crypto_spawn base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_comp")
    @NotUsableInJava
    public static class crypto_comp
    extends Struct {
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_kpp")
    @NotUsableInJava
    public static class crypto_kpp
    extends Struct {
        public @Unsigned int reqsize;
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_scomp")
    @NotUsableInJava
    public static class crypto_scomp
    extends Struct {
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_rfc3686_req_ctx")
    @NotUsableInJava
    public static class crypto_rfc3686_req_ctx
    extends Struct {
        public char @Size(value=16) [] iv;
        public SkcipherDefinitions.skcipher_request subreq;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_rfc3686_ctx")
    @NotUsableInJava
    public static class crypto_rfc3686_ctx
    extends Struct {
        public Ptr<crypto_skcipher> child;
        public char @Size(value=4) [] nonce;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_skcipher_spawn")
    @NotUsableInJava
    public static class crypto_skcipher_spawn
    extends Struct {
        public crypto_spawn base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_lskcipher_spawn")
    @NotUsableInJava
    public static class crypto_lskcipher_spawn
    extends Struct {
        public crypto_spawn base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_cipher_spawn")
    @NotUsableInJava
    public static class crypto_cipher_spawn
    extends Struct {
        public crypto_spawn base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_cipher")
    @NotUsableInJava
    public static class crypto_cipher
    extends Struct {
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_test_param")
    @NotUsableInJava
    public static class crypto_test_param
    extends Struct {
        public char @Size(value=128) [] driver;
        public char @Size(value=128) [] alg;
        public @Unsigned int type;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_larval")
    @NotUsableInJava
    public static class crypto_larval
    extends Struct {
        public crypto_alg alg;
        public Ptr<crypto_alg> adult;
        public runtime.completion completion;
        public @Unsigned int mask;
        public boolean test_started;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_attr_type")
    @NotUsableInJava
    public static class crypto_attr_type
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int mask;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_attr_alg")
    @NotUsableInJava
    public static class crypto_attr_alg
    extends Struct {
        public char @Size(value=128) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_akcipher_sync_data")
    @NotUsableInJava
    public static class crypto_akcipher_sync_data
    extends Struct {
        public Ptr<crypto_akcipher> tfm;
        public Ptr<?> src;
        public Ptr<?> dst;
        public @Unsigned int slen;
        public @Unsigned int dlen;
        public Ptr<misc.akcipher_request> req;
        public crypto_wait cwait;
        public runtime.scatterlist sg;
        public Ptr<Character> buf;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_report_akcipher")
    @NotUsableInJava
    public static class crypto_report_akcipher
    extends Struct {
        public char @Size(value=64) [] type;
    }

    @Type(noCCodeGeneration=true, cType="enum crypto_attr_type_t")
    public static enum crypto_attr_type_t implements Enum<crypto_attr_type_t>,
    TypedEnum<crypto_attr_type_t, Integer>
    {
        CRYPTOCFGA_UNSPEC,
        CRYPTOCFGA_PRIORITY_VAL,
        CRYPTOCFGA_REPORT_LARVAL,
        CRYPTOCFGA_REPORT_HASH,
        CRYPTOCFGA_REPORT_BLKCIPHER,
        CRYPTOCFGA_REPORT_AEAD,
        CRYPTOCFGA_REPORT_COMPRESS,
        CRYPTOCFGA_REPORT_RNG,
        CRYPTOCFGA_REPORT_CIPHER,
        CRYPTOCFGA_REPORT_AKCIPHER,
        CRYPTOCFGA_REPORT_KPP,
        CRYPTOCFGA_REPORT_ACOMP,
        CRYPTOCFGA_STAT_LARVAL,
        CRYPTOCFGA_STAT_HASH,
        CRYPTOCFGA_STAT_BLKCIPHER,
        CRYPTOCFGA_STAT_AEAD,
        CRYPTOCFGA_STAT_COMPRESS,
        CRYPTOCFGA_STAT_RNG,
        CRYPTOCFGA_STAT_CIPHER,
        CRYPTOCFGA_STAT_AKCIPHER,
        CRYPTOCFGA_STAT_KPP,
        CRYPTOCFGA_STAT_ACOMP,
        __CRYPTOCFGA_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct crypto_akcipher_spawn")
    @NotUsableInJava
    public static class crypto_akcipher_spawn
    extends Struct {
        public crypto_spawn base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_akcipher")
    @NotUsableInJava
    public static class crypto_akcipher
    extends Struct {
        public @Unsigned int reqsize;
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_sync_skcipher")
    @NotUsableInJava
    public static class crypto_sync_skcipher
    extends Struct {
        public crypto_skcipher base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_aead")
    @NotUsableInJava
    public static class crypto_aead
    extends Struct {
        public @Unsigned int authsize;
        public @Unsigned int reqsize;
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_lskcipher")
    @NotUsableInJava
    public static class crypto_lskcipher
    extends Struct {
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_skcipher")
    @NotUsableInJava
    public static class crypto_skcipher
    extends Struct {
        public @Unsigned int reqsize;
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_wait")
    @NotUsableInJava
    public static class crypto_wait
    extends Struct {
        public runtime.completion completion;
        public int err;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_async_request")
    @NotUsableInJava
    public static class crypto_async_request
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="crypto_completion_t") Ptr<?> complete;
        public Ptr<?> data;
        public Ptr<crypto_tfm> tfm;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_template")
    @NotUsableInJava
    public static class crypto_template
    extends Struct {
        public ListDefinitions.list_head list;
        public misc.hlist_head instances;
        public Ptr<runtime.module> module;
        public Ptr<?> create;
        public char @Size(value=128) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_spawn")
    @NotUsableInJava
    public static class crypto_spawn
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<crypto_alg> alg;
        @InlineUnion(value=5369)
        public @InlineUnion(value=5369) Ptr<crypto_instance> inst;
        @InlineUnion(value=5369)
        public @InlineUnion(value=5369) Ptr<crypto_spawn> next;
        public Ptr<crypto_type> frontend;
        public @Unsigned int mask;
        public boolean dead;
        public boolean registered;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_instance")
    @NotUsableInJava
    public static class crypto_instance
    extends Struct {
        public crypto_alg alg;
        public Ptr<crypto_template> tmpl;
        @InlineUnion(value=5360)
        public  @InlineUnion(value=5360) misc.hlist_node list;
        @InlineUnion(value=5360)
        public @InlineUnion(value=5360) Ptr<crypto_spawn> spawns;
        public misc.work_struct free_work;
        public Ptr<?> @Size(value=0) [] __ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_shash")
    @NotUsableInJava
    public static class crypto_shash
    extends Struct {
        public @Unsigned int descsize;
        public crypto_tfm base;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_type")
    @NotUsableInJava
    public static class crypto_type
    extends Struct {
        public Ptr<?> ctxsize;
        public Ptr<?> extsize;
        public Ptr<?> init_tfm;
        public Ptr<?> show;
        public Ptr<?> report;
        public Ptr<?> free;
        public @Unsigned int type;
        public @Unsigned int maskclear;
        public @Unsigned int maskset;
        public @Unsigned int tfmsize;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_alg")
    @NotUsableInJava
    public static class crypto_alg
    extends Struct {
        public ListDefinitions.list_head cra_list;
        public ListDefinitions.list_head cra_users;
        public @Unsigned int cra_flags;
        public @Unsigned int cra_blocksize;
        public @Unsigned int cra_ctxsize;
        public @Unsigned int cra_alignmask;
        public int cra_priority;
        public  @OriginalName(value="refcount_t") misc.refcount_struct cra_refcnt;
        public char @Size(value=128) [] cra_name;
        public char @Size(value=128) [] cra_driver_name;
        public Ptr<crypto_type> cra_type;
        public misc.cra_u_of_crypto_alg cra_u;
        public Ptr<?> cra_init;
        public Ptr<?> cra_exit;
        public Ptr<?> cra_destroy;
        public Ptr<runtime.module> cra_module;
    }

    @Type(noCCodeGeneration=true, cType="struct crypto_tfm")
    @NotUsableInJava
    public static class crypto_tfm
    extends Struct {
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned int crt_flags;
        public int node;
        public Ptr<?> exit;
        public Ptr<crypto_alg> __crt_alg;
        public Ptr<?> @Size(value=0) [] __crt_ctx;
    }
}

