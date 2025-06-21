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
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KeyringDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HashDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="hash_one_block($arg1, (const struct merkle_tree_params*)$arg2, $arg3)")
    public static int hash_one_block(Ptr<runtime.inode> inode2, Ptr<misc.merkle_tree_params> params, Ptr<BlockDefinitions.block_buffer> cur) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hash_prepare_alg(Ptr<hash_alg_common> alg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hash_contains_ip(@Unsigned long ip, Ptr<FtraceDefinitions.ftrace_ops_hash> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hash_key_type_and_desc(Ptr<KeyringDefinitions.keyring_index_key> index_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)hash_name($arg1, (const u8*)$arg2, $arg3))")
    public static String hash_name(Ptr<runtime.nameidata> nd, String name, Ptr<@Unsigned Long> lastword) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hash_walk_new_entry(Ptr<CryptoDefinitions.crypto_hash_walk> walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmDefinitions.dm_table> __hash_remove(Ptr<hash_cell> hc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hash_and_copy_to_iter((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned long hash_and_copy_to_iter(Ptr<?> addr2, @Unsigned long bytes, Ptr<?> hashp, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hash_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hash_cell")
    @NotUsableInJava
    public static class hash_cell
    extends Struct {
        public RbDefinitions.rb_node name_node;
        public RbDefinitions.rb_node uuid_node;
        public boolean name_set;
        public boolean uuid_set;
        public String name;
        public String uuid;
        public Ptr<misc.mapped_device> md;
        public Ptr<DmDefinitions.dm_table> new_map;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 type; u8 algorithm; u8 value[4]; }")
    @NotUsableInJava
    public static class hash_of_u_of_xen_netif_extra_info
    extends Struct {
        public @OriginalName(value="uint8_t") char type;
        public @OriginalName(value="uint8_t") char algorithm;
        public @OriginalName(value="uint8_t") char @Size(value=4) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct hash_alg_common")
    @NotUsableInJava
    public static class hash_alg_common
    extends Struct {
        public @Unsigned int digestsize;
        public @Unsigned int statesize;
        public CryptoDefinitions.crypto_alg base;
    }

    @Type(noCCodeGeneration=true, cType="enum hash_algo")
    public static enum hash_algo implements Enum<hash_algo>,
    TypedEnum<hash_algo, Integer>
    {
        HASH_ALGO_MD4,
        HASH_ALGO_MD5,
        HASH_ALGO_SHA1,
        HASH_ALGO_RIPE_MD_160,
        HASH_ALGO_SHA256,
        HASH_ALGO_SHA384,
        HASH_ALGO_SHA512,
        HASH_ALGO_SHA224,
        HASH_ALGO_RIPE_MD_128,
        HASH_ALGO_RIPE_MD_256,
        HASH_ALGO_RIPE_MD_320,
        HASH_ALGO_WP_256,
        HASH_ALGO_WP_384,
        HASH_ALGO_WP_512,
        HASH_ALGO_TGR_128,
        HASH_ALGO_TGR_160,
        HASH_ALGO_TGR_192,
        HASH_ALGO_SM3_256,
        HASH_ALGO_STREEBOG_256,
        HASH_ALGO_STREEBOG_512,
        HASH_ALGO_SHA3_256,
        HASH_ALGO_SHA3_384,
        HASH_ALGO_SHA3_512,
        HASH_ALGO__LAST;

    }
}

