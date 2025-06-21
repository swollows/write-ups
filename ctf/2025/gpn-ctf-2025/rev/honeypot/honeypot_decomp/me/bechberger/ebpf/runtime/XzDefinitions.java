/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.TypeDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class XzDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xz_dec_lzma2> xz_dec_lzma2_create(xz_mode mode, @Unsigned @OriginalName(value="uint32_t") int dict_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xz_dec_lzma2_end(Ptr<xz_dec_lzma2> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static xz_ret xz_dec_lzma2_reset(Ptr<xz_dec_lzma2> s2, @OriginalName(value="uint8_t") char props) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static xz_ret xz_dec_lzma2_run(Ptr<xz_dec_lzma2> s2, Ptr<xz_buf> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xz_dec_microlzma> xz_dec_microlzma_alloc(xz_mode mode, @Unsigned @OriginalName(value="uint32_t") int dict_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xz_dec_microlzma_end(Ptr<xz_dec_microlzma> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xz_dec_microlzma_reset(Ptr<xz_dec_microlzma> s2, @Unsigned @OriginalName(value="uint32_t") int comp_size, @Unsigned @OriginalName(value="uint32_t") int uncomp_size, int uncomp_size_is_exact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static xz_ret xz_dec_microlzma_run(Ptr<xz_dec_microlzma> s_ptr, Ptr<xz_buf> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xz_dec_bcj> xz_dec_bcj_create(boolean single_call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static xz_ret xz_dec_bcj_reset(Ptr<xz_dec_bcj> s2, @OriginalName(value="uint8_t") char id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static xz_ret xz_dec_bcj_run(Ptr<xz_dec_bcj> s2, Ptr<xz_dec_lzma2> lzma2, Ptr<xz_buf> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xz_dec_end(Ptr<xz_dec> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xz_dec> xz_dec_init(xz_mode mode, @Unsigned @OriginalName(value="uint32_t") int dict_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xz_dec_reset(Ptr<xz_dec> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static xz_ret xz_dec_run(Ptr<xz_dec> s2, Ptr<xz_buf> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xz_dec_bcj")
    @NotUsableInJava
    public static class xz_dec_bcj
    extends Struct {
        public TypeDefinitions.type_of_xz_dec_bcj type;
        public xz_ret ret;
        public boolean single_call;
        public @Unsigned @OriginalName(value="uint32_t") int pos;
        public @Unsigned @OriginalName(value="uint32_t") int x86_prev_mask;
        public Ptr<@OriginalName(value="uint8_t") Character> out;
        public @Unsigned long out_pos;
        public @Unsigned long out_size;
        public misc.temp_of_xz_dec_bcj temp;
    }

    @Type(noCCodeGeneration=true, cType="struct xz_dec")
    @NotUsableInJava
    public static class xz_dec
    extends Struct {
        public misc.sequence_of_xz_dec sequence;
        public @Unsigned @OriginalName(value="uint32_t") int pos;
        public @Unsigned @OriginalName(value="vli_type") long vli;
        public @Unsigned long in_start;
        public @Unsigned long out_start;
        public @Unsigned @OriginalName(value="uint32_t") int crc32;
        public xz_check check_type;
        public xz_mode mode;
        public boolean allow_buf_error;
        public BlockDefinitions.block_header_of_xz_dec block_header;
        public BlockDefinitions.block_of_xz_dec block;
        public misc.index_of_xz_dec index;
        public misc.temp_of_xz_dec temp;
        public Ptr<xz_dec_lzma2> lzma2;
        public Ptr<xz_dec_bcj> bcj;
        public boolean bcj_active;
    }

    @Type(noCCodeGeneration=true, cType="struct xz_dec_hash")
    @NotUsableInJava
    public static class xz_dec_hash
    extends Struct {
        public @Unsigned @OriginalName(value="vli_type") long unpadded;
        public @Unsigned @OriginalName(value="vli_type") long uncompressed;
        public @Unsigned @OriginalName(value="uint32_t") int crc32;
    }

    @Type(noCCodeGeneration=true, cType="enum xz_check")
    public static enum xz_check implements Enum<xz_check>,
    TypedEnum<xz_check, Integer>
    {
        XZ_CHECK_NONE,
        XZ_CHECK_CRC32,
        XZ_CHECK_CRC64,
        XZ_CHECK_SHA256;

    }

    @Type(noCCodeGeneration=true, cType="struct xz_dec_microlzma")
    @NotUsableInJava
    public static class xz_dec_microlzma
    extends Struct {
        public xz_dec_lzma2 s;
    }

    @Type(noCCodeGeneration=true, cType="struct xz_dec_lzma2")
    @NotUsableInJava
    public static class xz_dec_lzma2
    extends Struct {
        public misc.rc_dec rc;
        public runtime.dictionary dict;
        public misc.lzma2_dec lzma2;
        public misc.lzma_dec lzma;
        public misc.temp_of_xz_dec_lzma2 temp;
    }

    @Type(noCCodeGeneration=true, cType="struct xz_buf")
    @NotUsableInJava
    public static class xz_buf
    extends Struct {
        public Ptr<@OriginalName(value="uint8_t") Character> in;
        public @Unsigned long in_pos;
        public @Unsigned long in_size;
        public Ptr<@OriginalName(value="uint8_t") Character> out;
        public @Unsigned long out_pos;
        public @Unsigned long out_size;
    }

    @Type(noCCodeGeneration=true, cType="enum xz_ret")
    public static enum xz_ret implements Enum<xz_ret>,
    TypedEnum<xz_ret, Integer>
    {
        XZ_OK,
        XZ_STREAM_END,
        XZ_UNSUPPORTED_CHECK,
        XZ_MEM_ERROR,
        XZ_MEMLIMIT_ERROR,
        XZ_FORMAT_ERROR,
        XZ_OPTIONS_ERROR,
        XZ_DATA_ERROR,
        XZ_BUF_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="enum xz_mode")
    public static enum xz_mode implements Enum<xz_mode>,
    TypedEnum<xz_mode, Integer>
    {
        XZ_SINGLE,
        XZ_PREALLOC,
        XZ_DYNALLOC;

    }
}

