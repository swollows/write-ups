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
import me.bechberger.ebpf.runtime.CtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DeflateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> deflate_alloc_ctx(Ptr<CryptoDefinitions.crypto_scomp> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int deflate_comp_init(Ptr<deflate_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="deflate_compress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int deflate_compress(Ptr<CryptoDefinitions.crypto_tfm> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="deflate_decompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int deflate_decompress(Ptr<CryptoDefinitions.crypto_tfm> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void deflate_exit(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static BlockDefinitions.block_state deflate_fast(Ptr<deflate_state> s2, int flush) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void deflate_free_ctx(Ptr<CryptoDefinitions.crypto_scomp> tfm, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int deflate_init(Ptr<CryptoDefinitions.crypto_tfm> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void deflate_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int deflate_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="deflate_scompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int deflate_scompress(Ptr<CryptoDefinitions.crypto_scomp> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="deflate_sdecompress($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int deflate_sdecompress(Ptr<CryptoDefinitions.crypto_scomp> tfm, Ptr<Character> src, @Unsigned int slen, Ptr<Character> dst, Ptr<@Unsigned Integer> dlen, Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static BlockDefinitions.block_state deflate_slow(Ptr<deflate_state> s2, int flush) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static BlockDefinitions.block_state deflate_stored(Ptr<deflate_state> s2, int flush) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct deflate_workspace")
    @NotUsableInJava
    public static class deflate_workspace
    extends Struct {
        public deflate_state deflate_memory;
        public Ptr<@OriginalName(value="Byte") Character> window_memory;
        public Ptr<@Unsigned @OriginalName(value="Pos") Short> prev_memory;
        public Ptr<@Unsigned @OriginalName(value="Pos") Short> head_memory;
        public String overlay_memory;
    }

    @Type(noCCodeGeneration=true, cType="struct deflate_state")
    @NotUsableInJava
    public static class deflate_state
    extends Struct {
        public @OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm;
        public int status;
        public Ptr<@OriginalName(value="Byte") Character> pending_buf;
        public @Unsigned @OriginalName(value="ulg") long pending_buf_size;
        public Ptr<@OriginalName(value="Byte") Character> pending_out;
        public int pending;
        public int noheader;
        public @OriginalName(value="Byte") char data_type;
        public @OriginalName(value="Byte") char method;
        public int last_flush;
        public @Unsigned @OriginalName(value="uInt") int w_size;
        public @Unsigned @OriginalName(value="uInt") int w_bits;
        public @Unsigned @OriginalName(value="uInt") int w_mask;
        public Ptr<@OriginalName(value="Byte") Character> window;
        public @Unsigned @OriginalName(value="ulg") long window_size;
        public Ptr<@Unsigned @OriginalName(value="Pos") Short> prev;
        public Ptr<@Unsigned @OriginalName(value="Pos") Short> head;
        public @Unsigned @OriginalName(value="uInt") int ins_h;
        public @Unsigned @OriginalName(value="uInt") int hash_size;
        public @Unsigned @OriginalName(value="uInt") int hash_bits;
        public @Unsigned @OriginalName(value="uInt") int hash_mask;
        public @Unsigned @OriginalName(value="uInt") int hash_shift;
        public long block_start;
        public @Unsigned @OriginalName(value="uInt") int match_length;
        public @Unsigned @OriginalName(value="IPos") int prev_match;
        public int match_available;
        public @Unsigned @OriginalName(value="uInt") int strstart;
        public @Unsigned @OriginalName(value="uInt") int match_start;
        public @Unsigned @OriginalName(value="uInt") int lookahead;
        public @Unsigned @OriginalName(value="uInt") int prev_length;
        public @Unsigned @OriginalName(value="uInt") int max_chain_length;
        public @Unsigned @OriginalName(value="uInt") int max_lazy_match;
        public int level;
        public int strategy;
        public @Unsigned @OriginalName(value="uInt") int good_match;
        public int nice_match;
        public CtDefinitions.ct_data_s @Size(value=573) [] dyn_ltree;
        public CtDefinitions.ct_data_s @Size(value=61) [] dyn_dtree;
        public CtDefinitions.ct_data_s @Size(value=39) [] bl_tree;
        public misc.tree_desc_s l_desc;
        public misc.tree_desc_s d_desc;
        public misc.tree_desc_s bl_desc;
        public @Unsigned @OriginalName(value="ush") short @Size(value=16) [] bl_count;
        public int @Size(value=573) [] heap;
        public int heap_len;
        public int heap_max;
        public @OriginalName(value="uch") char @Size(value=573) [] depth;
        public Ptr<@OriginalName(value="uch") Character> l_buf;
        public @Unsigned @OriginalName(value="uInt") int lit_bufsize;
        public @Unsigned @OriginalName(value="uInt") int last_lit;
        public Ptr<@Unsigned @OriginalName(value="ush") Short> d_buf;
        public @Unsigned @OriginalName(value="ulg") long opt_len;
        public @Unsigned @OriginalName(value="ulg") long static_len;
        public @Unsigned @OriginalName(value="ulg") long compressed_len;
        public @Unsigned @OriginalName(value="uInt") int matches;
        public int last_eob_len;
        public @Unsigned @OriginalName(value="ush") short bi_buf;
        public int bi_valid;
    }

    @Type(noCCodeGeneration=true, cType="struct deflate_ctx")
    @NotUsableInJava
    public static class deflate_ctx
    extends Struct {
        public misc.z_stream_s comp_stream;
        public misc.z_stream_s decomp_stream;
    }
}

