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
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FseDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long FSE_buildCTable_raw(Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> ct, @Unsigned int nbBits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long FSE_buildCTable_rle(Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> ct, @OriginalName(value="BYTE") char symbolValue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_buildCTable_wksp($arg1, (const short int*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long FSE_buildCTable_wksp(Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> ct, Ptr<Short> normalizedCounter, @Unsigned int maxSymbolValue, @Unsigned int tableLog, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_buildDTable_internal($arg1, (const short int*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long FSE_buildDTable_internal(Ptr<@Unsigned @OriginalName(value="FSE_DTable") Integer> dt, Ptr<Short> normalizedCounter, @Unsigned int maxSymbolValue, @Unsigned int tableLog, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long FSE_buildDTable_raw(Ptr<@Unsigned @OriginalName(value="FSE_DTable") Integer> dt, @Unsigned int nbBits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long FSE_buildDTable_rle(Ptr<@Unsigned @OriginalName(value="FSE_DTable") Integer> dt, @OriginalName(value="BYTE") char symbolValue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_buildDTable_wksp($arg1, (const short int*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long FSE_buildDTable_wksp(Ptr<@Unsigned @OriginalName(value="FSE_DTable") Integer> dt, Ptr<Short> normalizedCounter, @Unsigned int maxSymbolValue, @Unsigned int tableLog, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long FSE_compressBound(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_compress_usingCTable($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long FSE_compress_usingCTable(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> ct) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_compress_usingCTable_generic($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5, (const unsigned int)$arg6)")
    public static @Unsigned long FSE_compress_usingCTable_generic(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> ct, @Unsigned int fast) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> FSE_createCTable(@Unsigned int maxSymbolValue, @Unsigned int tableLog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned @OriginalName(value="FSE_DTable") Integer> FSE_createDTable(@Unsigned int tableLog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_decompress_usingDTable($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long FSE_decompress_usingDTable(Ptr<?> dst, @Unsigned long originalSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="FSE_DTable") Integer> dt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_decompress_wksp($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long FSE_decompress_wksp(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> cSrc, @Unsigned long cSrcSize, @Unsigned int maxLog, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_decompress_wksp_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static @Unsigned long FSE_decompress_wksp_bmi2(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> cSrc, @Unsigned long cSrcSize, @Unsigned int maxLog, Ptr<?> workSpace, @Unsigned long wkspSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_decompress_wksp_body_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long FSE_decompress_wksp_body_bmi2(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> cSrc, @Unsigned long cSrcSize, @Unsigned int maxLog, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_decompress_wksp_body_default($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long FSE_decompress_wksp_body_default(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> cSrc, @Unsigned long cSrcSize, @Unsigned int maxLog, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void FSE_freeCTable(Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> ct) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void FSE_freeDTable(Ptr<@Unsigned @OriginalName(value="FSE_DTable") Integer> dt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)FSE_getErrorName($arg1))")
    public static String FSE_getErrorName(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int FSE_isError(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_normalizeCount($arg1, $arg2, (const unsigned int*)$arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long FSE_normalizeCount(Ptr<Short> normalizedCounter, @Unsigned int tableLog, Ptr<@Unsigned Integer> count, @Unsigned long total, @Unsigned int maxSymbolValue, @Unsigned int useLowProbCount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_normalizeM2($arg1, $arg2, (const unsigned int*)$arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long FSE_normalizeM2(Ptr<Short> norm, @Unsigned int tableLog, Ptr<@Unsigned Integer> count, @Unsigned long total, @Unsigned int maxSymbolValue, short lowProbCount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int FSE_optimalTableLog(@Unsigned int maxTableLog, @Unsigned long srcSize, @Unsigned int maxSymbolValue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int FSE_optimalTableLog_internal(@Unsigned int maxTableLog, @Unsigned long srcSize, @Unsigned int maxSymbolValue, @Unsigned int minus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_readNCount($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long FSE_readNCount(Ptr<Short> normalizedCounter, Ptr<@Unsigned Integer> maxSVPtr, Ptr<@Unsigned Integer> tableLogPtr, Ptr<?> headerBuffer, @Unsigned long hbSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_readNCount_bmi2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static @Unsigned long FSE_readNCount_bmi2(Ptr<Short> normalizedCounter, Ptr<@Unsigned Integer> maxSVPtr, Ptr<@Unsigned Integer> tableLogPtr, Ptr<?> headerBuffer, @Unsigned long hbSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_readNCount_body_bmi2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long FSE_readNCount_body_bmi2(Ptr<Short> normalizedCounter, Ptr<@Unsigned Integer> maxSVPtr, Ptr<@Unsigned Integer> tableLogPtr, Ptr<?> headerBuffer, @Unsigned long hbSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_readNCount_body_default($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long FSE_readNCount_body_default(Ptr<Short> normalizedCounter, Ptr<@Unsigned Integer> maxSVPtr, Ptr<@Unsigned Integer> tableLogPtr, Ptr<?> headerBuffer, @Unsigned long hbSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int FSE_versionNumber() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_writeNCount($arg1, $arg2, (const short int*)$arg3, $arg4, $arg5)")
    public static @Unsigned long FSE_writeNCount(Ptr<?> buffer, @Unsigned long bufferSize, Ptr<Short> normalizedCounter, @Unsigned int maxSymbolValue, @Unsigned int tableLog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="FSE_writeNCount_generic($arg1, $arg2, (const short int*)$arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long FSE_writeNCount_generic(Ptr<?> header, @Unsigned long headerBufferSize, Ptr<Short> normalizedCounter, @Unsigned int maxSymbolValue, @Unsigned int tableLog, @Unsigned int writeIsSafe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int newState; u8 symbol; u8 nbBits; }")
    @NotUsableInJava
    public static class FSE_decode_t
    extends Struct {
        public @Unsigned short newState;
        public char symbol;
        public char nbBits;
    }

    @Type(noCCodeGeneration=true, cType="struct { int deltaFindState; unsigned int deltaNbBits; }")
    @NotUsableInJava
    public static class FSE_symbolCompressionTransform
    extends Struct {
        public int deltaFindState;
        public @Unsigned int deltaNbBits;
    }
}

