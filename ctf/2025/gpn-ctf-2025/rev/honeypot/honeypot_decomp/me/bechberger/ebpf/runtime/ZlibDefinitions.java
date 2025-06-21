/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeflateDefinitions;
import me.bechberger.ebpf.runtime.SquashfsDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class ZlibDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_deflate(@OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm, int flush) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_deflateEnd(@OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_deflateInit2(@OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm, int level, int method, int windowBits, int memLevel, int strategy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_deflateReset(@OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_deflate_dfltcc_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_deflate_workspacesize(int windowBits, int memLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_inflate(@OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm, int flush) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_inflateEnd(@OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_inflateIncomp(Ptr<misc.z_stream_s> z) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_inflateInit2(@OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm, int windowBits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_inflateReset(@OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zlib_inflate_blob($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int zlib_inflate_blob(Ptr<?> gunzip_buf, @Unsigned int sz, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_inflate_table(runtime.codetype type2, Ptr<@Unsigned Short> lens, @Unsigned int codes, Ptr<Ptr<runtime.code>> table, Ptr<@Unsigned Integer> bits, Ptr<@Unsigned Short> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_inflate_workspacesize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zlib_updatewindow(@OriginalName(value="z_streamp") Ptr<misc.z_stream_s> strm, @Unsigned int out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zlib_tr_align(Ptr<DeflateDefinitions.deflate_state> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ulg") long zlib_tr_flush_block(Ptr<DeflateDefinitions.deflate_state> s2, String buf, @Unsigned @OriginalName(value="ulg") long stored_len, int eof) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zlib_tr_init(Ptr<DeflateDefinitions.deflate_state> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zlib_tr_stored_block(Ptr<DeflateDefinitions.deflate_state> s2, String buf, @Unsigned @OriginalName(value="ulg") long stored_len, int eof) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zlib_tr_stored_type_only(Ptr<DeflateDefinitions.deflate_state> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_tr_tally(Ptr<DeflateDefinitions.deflate_state> s2, @Unsigned int dist, @Unsigned int lc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zlib_free(Ptr<?> strm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> zlib_init(Ptr<SquashfsDefinitions.squashfs_sb_info> dummy, Ptr<?> buff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zlib_uncompress(Ptr<SquashfsDefinitions.squashfs_sb_info> msblk, Ptr<?> strm, Ptr<runtime.bio> bio2, int offset, int length, Ptr<SquashfsDefinitions.squashfs_page_actor> output) {
        throw new MethodIsBPFRelatedFunction();
    }
}

