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
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TrustedDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<trusted_key_options> trusted_options_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trusted_shash_release() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trusted_tpm_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trusted_tpm_get_random(String key2, @Unsigned long key_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trusted_tpm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trusted_tpm_seal(Ptr<trusted_key_payload> p, String datablob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trusted_tpm_send(String cmd, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trusted_tpm_unseal(Ptr<trusted_key_payload> p, String datablob) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trusted_destroy(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trusted_instantiate(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<trusted_key_payload> trusted_payload_alloc(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void trusted_rcu_free(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="trusted_read((const struct key*)$arg1, $arg2, $arg3)")
    public static long trusted_read(Ptr<runtime.key> key2, String buffer, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int trusted_update(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct trusted_key_options")
    @NotUsableInJava
    public static class trusted_key_options
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short keytype;
        public @Unsigned @OriginalName(value="uint32_t") int keyhandle;
        public char @Size(value=20) [] keyauth;
        public @Unsigned @OriginalName(value="uint32_t") int blobauth_len;
        public char @Size(value=20) [] blobauth;
        public @Unsigned @OriginalName(value="uint32_t") int pcrinfo_len;
        public char @Size(value=64) [] pcrinfo;
        public int pcrlock;
        public @Unsigned @OriginalName(value="uint32_t") int hash;
        public @Unsigned @OriginalName(value="uint32_t") int policydigest_len;
        public char @Size(value=64) [] policydigest;
        public @Unsigned @OriginalName(value="uint32_t") int policyhandle;
    }

    @Type(noCCodeGeneration=true, cType="struct trusted_key_source")
    @NotUsableInJava
    public static class trusted_key_source
    extends Struct {
        public String name;
        public Ptr<trusted_key_ops> ops;
    }

    @Type(noCCodeGeneration=true, cType="struct trusted_key_ops")
    @NotUsableInJava
    public static class trusted_key_ops
    extends Struct {
        public char migratable;
        public Ptr<?> init;
        public Ptr<?> seal;
        public Ptr<?> unseal;
        public Ptr<?> get_random;
        public Ptr<?> exit;
    }

    @Type(noCCodeGeneration=true, cType="struct trusted_key_payload")
    @NotUsableInJava
    public static class trusted_key_payload
    extends Struct {
        public misc.callback_head rcu;
        public @Unsigned int key_len;
        public @Unsigned int blob_len;
        public char migratable;
        public char old_format;
        public char @Size(value=129) [] key;
        public char @Size(value=512) [] blob;
    }
}

