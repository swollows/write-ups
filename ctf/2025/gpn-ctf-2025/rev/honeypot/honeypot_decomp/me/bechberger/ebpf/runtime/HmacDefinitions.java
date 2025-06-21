/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.ShashDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class HmacDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmac_clone_tfm(Ptr<CryptoDefinitions.crypto_shash> dst, Ptr<CryptoDefinitions.crypto_shash> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmac_create(Ptr<CryptoDefinitions.crypto_template> tmpl, Ptr<Ptr<runtime.rtattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hmac_exit_tfm(Ptr<CryptoDefinitions.crypto_shash> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmac_export(Ptr<ShashDefinitions.shash_desc> pdesc, Ptr<?> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmac_final(Ptr<ShashDefinitions.shash_desc> pdesc, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hmac_finup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int hmac_finup(Ptr<ShashDefinitions.shash_desc> pdesc, Ptr<Character> data, @Unsigned int nbytes, Ptr<Character> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hmac_import($arg1, (const void*)$arg2)")
    public static int hmac_import(Ptr<ShashDefinitions.shash_desc> pdesc, Ptr<?> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmac_init(Ptr<ShashDefinitions.shash_desc> pdesc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmac_init_tfm(Ptr<CryptoDefinitions.crypto_shash> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hmac_module_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hmac_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hmac_setkey($arg1, (const u8*)$arg2, $arg3)")
    public static int hmac_setkey(Ptr<CryptoDefinitions.crypto_shash> parent, Ptr<Character> inkey, @Unsigned int keylen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hmac_update($arg1, (const u8*)$arg2, $arg3)")
    public static int hmac_update(Ptr<ShashDefinitions.shash_desc> pdesc, Ptr<Character> data, @Unsigned int nbytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hmac_add_misc(Ptr<ShashDefinitions.shash_desc> desc, Ptr<runtime.inode> inode2, char type2, String digest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hmac_ctx")
    @NotUsableInJava
    public static class hmac_ctx
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_shash> hash;
        public char @Size(value=0) [] pads;
    }
}

