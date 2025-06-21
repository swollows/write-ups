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
import me.bechberger.ebpf.runtime.SquashfsDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class Lz4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_fast((const u8*)$arg1, $arg2, $arg3)")
    public static int LZ4_decompress_fast(String source, String dest, int originalSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_fast_continue($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int LZ4_decompress_fast_continue(Ptr<LZ4_streamDecode_t> LZ4_streamDecode, String source, String dest, int originalSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_fast_extDict((const u8*)$arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int LZ4_decompress_fast_extDict(String source, String dest, int originalSize, Ptr<?> dictStart, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_fast_usingDict((const u8*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int LZ4_decompress_fast_usingDict(String source, String dest, int originalSize, String dictStart, int dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_safe((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int LZ4_decompress_safe(String source, String dest, int compressedSize, int maxDecompressedSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_safe_continue($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int LZ4_decompress_safe_continue(Ptr<LZ4_streamDecode_t> LZ4_streamDecode, String source, String dest, int compressedSize, int maxOutputSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_safe_forceExtDict((const u8*)$arg1, $arg2, $arg3, $arg4, (const void*)$arg5, $arg6)")
    public static int LZ4_decompress_safe_forceExtDict(String source, String dest, int compressedSize, int maxOutputSize, Ptr<?> dictStart, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_safe_partial((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int LZ4_decompress_safe_partial(String src, String dst, int compressedSize, int targetOutputSize, int dstCapacity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_safe_usingDict((const u8*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int LZ4_decompress_safe_usingDict(String source, String dest, int compressedSize, int maxOutputSize, String dictStart, int dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_safe_withPrefix64k((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int LZ4_decompress_safe_withPrefix64k(String source, String dest, int compressedSize, int maxOutputSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_decompress_safe_withSmallPrefix((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int LZ4_decompress_safe_withSmallPrefix(String source, String dest, int compressedSize, int maxOutputSize, @Unsigned long prefixSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="LZ4_setStreamDecode($arg1, (const u8*)$arg2, $arg3)")
    public static int LZ4_setStreamDecode(Ptr<LZ4_streamDecode_t> LZ4_streamDecode, String dictionary2, int dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lz4_free(Ptr<?> strm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> lz4_init(Ptr<SquashfsDefinitions.squashfs_sb_info> msblk, Ptr<?> buff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lz4_uncompress(Ptr<SquashfsDefinitions.squashfs_sb_info> msblk, Ptr<?> strm, Ptr<runtime.bio> bio2, int offset, int length, Ptr<SquashfsDefinitions.squashfs_page_actor> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union { long long unsigned int table[4]; struct { const u8*; long unsigned int extDictSize; const u8*; long unsigned int prefixSize; } internal_donotuse; }")
    @NotUsableInJava
    public static class LZ4_streamDecode_t
    extends Union {
        public @Unsigned long @Size(value=4) [] table;
        public LZ4_streamDecode_t_internal internal_donotuse;
    }

    @Type(noCCodeGeneration=true, cType="struct { const u8*; long unsigned int extDictSize; const u8*; long unsigned int prefixSize; }")
    @NotUsableInJava
    public static class LZ4_streamDecode_t_internal
    extends Struct {
        public Ptr<@OriginalName(value="uint8_t") Character> externalDict;
        public @Unsigned long extDictSize;
        public Ptr<@OriginalName(value="uint8_t") Character> prefixEnd;
        public @Unsigned long prefixSize;
    }

    @Type(noCCodeGeneration=true, cType="struct lz4_comp_opts")
    @NotUsableInJava
    public static class lz4_comp_opts
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int version;
        public @Unsigned @OriginalName(value="__le32") int flags;
    }
}

