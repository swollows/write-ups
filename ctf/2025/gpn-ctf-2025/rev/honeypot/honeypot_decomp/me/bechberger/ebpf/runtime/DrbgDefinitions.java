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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SkcipherDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DrbgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_alloc_state(Ptr<drbg_state> drbg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drbg_convert_tfm_core((const u8*)$arg1, $arg2, $arg3)")
    public static void drbg_convert_tfm_core(String cra_driver_name, Ptr<Integer> coreref, Ptr<@OriginalName(value="bool") Boolean> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_ctr_df(Ptr<drbg_state> drbg, String df_data, @Unsigned long bytes_to_return, Ptr<ListDefinitions.list_head> seedlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_ctr_generate(Ptr<drbg_state> drbg, String buf, @Unsigned int buflen, Ptr<ListDefinitions.list_head> addtl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_ctr_update(Ptr<drbg_state> drbg, Ptr<ListDefinitions.list_head> seed, int reseed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drbg_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drbg_fill_array($arg1, (const struct drbg_core*)$arg2, $arg3)")
    public static void drbg_fill_array(Ptr<misc.rng_alg> alg, Ptr<drbg_core> core, int pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_fini_hash_kernel(Ptr<drbg_state> drbg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_fini_sym_kernel(Ptr<drbg_state> drbg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_generate(Ptr<drbg_state> drbg, String buf, @Unsigned int buflen, Ptr<drbg_string> addtl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_hash_df(Ptr<drbg_state> drbg, String outval, @Unsigned long outlen, Ptr<ListDefinitions.list_head> entropylist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_hash_generate(Ptr<drbg_state> drbg, String buf, @Unsigned int buflen, Ptr<ListDefinitions.list_head> addtl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_hash_hashgen(Ptr<drbg_state> drbg, String buf, @Unsigned int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_hash_process_addtl(Ptr<drbg_state> drbg, Ptr<ListDefinitions.list_head> addtl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_hash_update(Ptr<drbg_state> drbg, Ptr<ListDefinitions.list_head> seed, int reseed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_hmac_generate(Ptr<drbg_state> drbg, String buf, @Unsigned int buflen, Ptr<ListDefinitions.list_head> addtl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_hmac_update(Ptr<drbg_state> drbg, Ptr<ListDefinitions.list_head> seed, int reseed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_init_hash_kernel(Ptr<drbg_state> drbg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_init_sym_kernel(Ptr<drbg_state> drbg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void drbg_kcapi_cleanup(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_kcapi_init(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drbg_kcapi_random($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int drbg_kcapi_random(Ptr<CryptoDefinitions.crypto_rng> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, @Unsigned int dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drbg_kcapi_seed($arg1, (const u8*)$arg2, $arg3)")
    public static int drbg_kcapi_seed(Ptr<CryptoDefinitions.crypto_rng> tfm, Ptr<Character> seed, @Unsigned int slen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="drbg_kcapi_set_entropy($arg1, (const u8*)$arg2, $arg3)")
    public static void drbg_kcapi_set_entropy(Ptr<CryptoDefinitions.crypto_rng> tfm, Ptr<Character> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_kcapi_sym_ctr(Ptr<drbg_state> drbg, Ptr<Character> inbuf, @Unsigned int inlen, Ptr<Character> outbuf, @Unsigned int outlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_seed(Ptr<drbg_state> drbg, Ptr<drbg_string> pers, boolean reseed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_seed_from_random(Ptr<drbg_state> drbg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int drbg_uninstantiate(Ptr<drbg_state> drbg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum drbg_prefixes")
    public static enum drbg_prefixes implements Enum<drbg_prefixes>,
    TypedEnum<drbg_prefixes, Integer>
    {
        DRBG_PREFIX0,
        DRBG_PREFIX1,
        DRBG_PREFIX2,
        DRBG_PREFIX3;

    }

    @Type(noCCodeGeneration=true, cType="enum drbg_seed_state")
    public static enum drbg_seed_state implements Enum<drbg_seed_state>,
    TypedEnum<drbg_seed_state, Integer>
    {
        DRBG_SEED_STATE_UNSEEDED,
        DRBG_SEED_STATE_PARTIAL,
        DRBG_SEED_STATE_FULL;

    }

    @Type(noCCodeGeneration=true, cType="struct drbg_state")
    @NotUsableInJava
    public static class drbg_state
    extends Struct {
        public runtime.mutex drbg_mutex;
        public String V;
        public String Vbuf;
        public String C;
        public String Cbuf;
        public @Unsigned long reseed_ctr;
        public @Unsigned long reseed_threshold;
        public String scratchpad;
        public String scratchpadbuf;
        public Ptr<?> priv_data;
        public Ptr<CryptoDefinitions.crypto_skcipher> ctr_handle;
        public Ptr<SkcipherDefinitions.skcipher_request> ctr_req;
        public Ptr<Character> outscratchpadbuf;
        public Ptr<Character> outscratchpad;
        public CryptoDefinitions.crypto_wait ctr_wait;
        public runtime.scatterlist sg_in;
        public runtime.scatterlist sg_out;
        public drbg_seed_state seeded;
        public @Unsigned long last_seed_time;
        public boolean pr;
        public boolean fips_primed;
        public String prev;
        public Ptr<CryptoDefinitions.crypto_rng> jent;
        public Ptr<drbg_state_ops> d_ops;
        public Ptr<drbg_core> core;
        public drbg_string test_data;
    }

    @Type(noCCodeGeneration=true, cType="struct drbg_state_ops")
    @NotUsableInJava
    public static class drbg_state_ops
    extends Struct {
        public Ptr<?> update;
        public Ptr<?> generate;
        public Ptr<?> crypto_init;
        public Ptr<?> crypto_fini;
    }

    @Type(noCCodeGeneration=true, cType="struct drbg_core")
    @NotUsableInJava
    public static class drbg_core
    extends Struct {
        public @Unsigned @OriginalName(value="drbg_flag_t") int flags;
        public char statelen;
        public char blocklen_bytes;
        public char @Size(value=128) [] cra_name;
        public char @Size(value=128) [] backend_cra_name;
    }

    @Type(noCCodeGeneration=true, cType="struct drbg_string")
    @NotUsableInJava
    public static class drbg_string
    extends Struct {
        public String buf;
        public @Unsigned long len;
        public ListDefinitions.list_head list;
    }
}

