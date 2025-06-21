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
import me.bechberger.ebpf.runtime.KvmDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class SDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> s_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> s_options_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int s_options_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> s_options_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void s_options_stop(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int s_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> s_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void s_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> s_mode_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int s_mode_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> s_mode_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void s_mode_stop(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 head[96]; struct crypto_instance base; }")
    @NotUsableInJava
    public static class s_of_anon_member_of_ahash_instance
    extends Struct {
        public char @Size(value=96) [] head;
        public CryptoDefinitions.crypto_instance base;
    }

    @Type(noCCodeGeneration=true, cType="enum s_alloc")
    public static enum s_alloc implements Enum<s_alloc>,
    TypedEnum<s_alloc, Integer>
    {
        sa_rootdomain,
        sa_sd,
        sa_sd_storage,
        sa_none;

    }

    @Type(noCCodeGeneration=true, cType="struct s_data")
    @NotUsableInJava
    public static class s_data
    extends Struct {
        public Ptr<Ptr<SchedDefinitions.sched_domain>> sd;
        public Ptr<misc.root_domain> rd;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 head[48]; struct crypto_instance base; }")
    @NotUsableInJava
    public static class s_of_anon_member_of_kpp_instance
    extends Struct {
        public char @Size(value=48) [] head;
        public CryptoDefinitions.crypto_instance base;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 head[104]; struct crypto_instance base; }")
    @NotUsableInJava
    public static class s_of_anon_member_of_shash_instance
    extends Struct {
        public char @Size(value=104) [] head;
        public CryptoDefinitions.crypto_instance base;
    }

    @Type(noCCodeGeneration=true, cType="union { struct kvm_sync_regs regs; u8 padding[2048]; }")
    @NotUsableInJava
    public static class s_of_kvm_run
    extends Union {
        public KvmDefinitions.kvm_sync_regs regs;
        public char @Size(value=2048) [] padding;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int len; struct callback_head rcu; }")
    @NotUsableInJava
    public static class s_of_anon_member_of_net_generic
    extends Struct {
        public @Unsigned int len;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int max_pages; }")
    @NotUsableInJava
    public static class s_of_anon_member_of_memory_group
    extends Struct {
        public @Unsigned long max_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 head[88]; struct crypto_instance base; }")
    @NotUsableInJava
    public static class s_of_anon_member_of_skcipher_instance
    extends Struct {
        public char @Size(value=88) [] head;
        public CryptoDefinitions.crypto_instance base;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 head[72]; struct crypto_instance base; }")
    @NotUsableInJava
    public static class s_of_anon_member_of_akcipher_instance
    extends Struct {
        public char @Size(value=72) [] head;
        public CryptoDefinitions.crypto_instance base;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 head[64]; struct crypto_instance base; }")
    @NotUsableInJava
    public static class s_of_anon_member_of_aead_instance_and_s_of_anon_member_of_lskcipher_instance
    extends Struct {
        public char @Size(value=64) [] head;
        public CryptoDefinitions.crypto_instance base;
    }
}

