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
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class HufDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)HUF_getErrorName($arg1))")
    public static String HUF_getErrorName(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int HUF_isError(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_readStats($arg1, $arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7)")
    public static @Unsigned long HUF_readStats(Ptr<@OriginalName(value="BYTE") Character> huffWeight, @Unsigned long hwSize, Ptr<@Unsigned Integer> rankStats, Ptr<@Unsigned Integer> nbSymbolsPtr, Ptr<@Unsigned Integer> tableLogPtr, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_readStats_body_bmi2($arg1, $arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7, $arg8, $arg9)")
    public static @Unsigned long HUF_readStats_body_bmi2(Ptr<@OriginalName(value="BYTE") Character> huffWeight, @Unsigned long hwSize, Ptr<@Unsigned Integer> rankStats, Ptr<@Unsigned Integer> nbSymbolsPtr, Ptr<@Unsigned Integer> tableLogPtr, Ptr<?> src, @Unsigned long srcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_readStats_body_default($arg1, $arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7, $arg8, $arg9)")
    public static @Unsigned long HUF_readStats_body_default(Ptr<@OriginalName(value="BYTE") Character> huffWeight, @Unsigned long hwSize, Ptr<@Unsigned Integer> rankStats, Ptr<@Unsigned Integer> nbSymbolsPtr, Ptr<@Unsigned Integer> tableLogPtr, Ptr<?> src, @Unsigned long srcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_readStats_wksp($arg1, $arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7, $arg8, $arg9, $arg10)")
    public static @Unsigned long HUF_readStats_wksp(Ptr<@OriginalName(value="BYTE") Character> huffWeight, @Unsigned long hwSize, Ptr<@Unsigned Integer> rankStats, Ptr<@Unsigned Integer> nbSymbolsPtr, Ptr<@Unsigned Integer> tableLogPtr, Ptr<?> src, @Unsigned long srcSize, Ptr<?> workSpace, @Unsigned long wkspSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_buildCTable_wksp($arg1, (const unsigned int*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long HUF_buildCTable_wksp(Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, Ptr<@Unsigned Integer> count, @Unsigned int maxSymbolValue, @Unsigned int maxNbBits, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int HUF_buildTree(Ptr<misc.nodeElt_s> huffNode, @Unsigned int maxSymbolValue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long HUF_closeCStream(Ptr<runtime.HUF_CStream_t> bitC) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress1X_repeat($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11, $arg12, $arg13)")
    public static @Unsigned long HUF_compress1X_repeat(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, @Unsigned int maxSymbolValue, @Unsigned int huffLog, Ptr<?> workSpace, @Unsigned long wkspSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> hufTable, Ptr<@OriginalName(value="HUF_repeat") misc.repeatMode_of_ZSTD_hufCTables_t> repeat, int preferRepeat, int bmi2, @Unsigned int suspectUncompressible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress1X_usingCTable($arg1, $arg2, (const void*)$arg3, $arg4, (const long unsigned int*)$arg5)")
    public static @Unsigned long HUF_compress1X_usingCTable(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress1X_usingCTable_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, (const long unsigned int*)$arg5, $arg6)")
    public static @Unsigned long HUF_compress1X_usingCTable_bmi2(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress1X_usingCTable_internal_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, (const long unsigned int*)$arg5)")
    public static @Unsigned long HUF_compress1X_usingCTable_internal_bmi2(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress1X_usingCTable_internal_default($arg1, $arg2, (const void*)$arg3, $arg4, (const long unsigned int*)$arg5)")
    public static @Unsigned long HUF_compress1X_usingCTable_internal_default(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress1X_wksp($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static @Unsigned long HUF_compress1X_wksp(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, @Unsigned int maxSymbolValue, @Unsigned int huffLog, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress4X_repeat($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11, $arg12, $arg13)")
    public static @Unsigned long HUF_compress4X_repeat(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, @Unsigned int maxSymbolValue, @Unsigned int huffLog, Ptr<?> workSpace, @Unsigned long wkspSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> hufTable, Ptr<@OriginalName(value="HUF_repeat") misc.repeatMode_of_ZSTD_hufCTables_t> repeat, int preferRepeat, int bmi2, @Unsigned int suspectUncompressible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress4X_usingCTable($arg1, $arg2, (const void*)$arg3, $arg4, (const long unsigned int*)$arg5)")
    public static @Unsigned long HUF_compress4X_usingCTable(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress4X_usingCTable_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, (const long unsigned int*)$arg5, $arg6)")
    public static @Unsigned long HUF_compress4X_usingCTable_bmi2(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress4X_usingCTable_internal($arg1, $arg2, (const void*)$arg3, $arg4, (const long unsigned int*)$arg5, $arg6)")
    public static @Unsigned long HUF_compress4X_usingCTable_internal(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress4X_wksp($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static @Unsigned long HUF_compress4X_wksp(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, @Unsigned int maxSymbolValue, @Unsigned int huffLog, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long HUF_compressBound(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compressCTable_internal((const u8*)$arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6, (const long unsigned int*)$arg7, (const int)$arg8)")
    public static @Unsigned long HUF_compressCTable_internal(Ptr<@OriginalName(value="BYTE") Character> ostart, Ptr<@OriginalName(value="BYTE") Character> op, Ptr<@OriginalName(value="BYTE") Character> oend, Ptr<?> src, @Unsigned long srcSize,  @OriginalName(value="HUF_nbStreams_e") runtime.HUF nbStreams, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_compress_internal($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11, $arg12, (const int)$arg13, $arg14)")
    public static @Unsigned long HUF_compress_internal(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> src, @Unsigned long srcSize, @Unsigned int maxSymbolValue, @Unsigned int huffLog,  @OriginalName(value="HUF_nbStreams_e") runtime.HUF nbStreams, Ptr<?> workSpace, @Unsigned long wkspSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> oldHufTable, Ptr<@OriginalName(value="HUF_repeat") misc.repeatMode_of_ZSTD_hufCTables_t> repeat, int preferRepeat, int bmi2, @Unsigned int suspectUncompressible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_estimateCompressedSize((const long unsigned int*)$arg1, (const unsigned int*)$arg2, $arg3)")
    public static @Unsigned long HUF_estimateCompressedSize(Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, Ptr<@Unsigned Integer> count, @Unsigned int maxSymbolValue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_getNbBitsFromCTable((const long unsigned int*)$arg1, $arg2)")
    public static @Unsigned int HUF_getNbBitsFromCTable(Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, @Unsigned int symbolValue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int HUF_optimalTableLog(@Unsigned int maxTableLog, @Unsigned long srcSize, @Unsigned int maxSymbolValue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_readCTable($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static @Unsigned long HUF_readCTable(Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, Ptr<@Unsigned Integer> maxSymbolValuePtr, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned Integer> hasZeroWeights) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int HUF_setMaxHeight(Ptr<misc.nodeElt_s> huffNode, @Unsigned int lastNonNull, @Unsigned int maxNbBits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void HUF_simpleQuickSort(Ptr<misc.nodeElt_s> arr, int low, int high) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_validateCTable((const long unsigned int*)$arg1, (const unsigned int*)$arg2, $arg3)")
    public static int HUF_validateCTable(Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, Ptr<@Unsigned Integer> count, @Unsigned int maxSymbolValue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_writeCTable($arg1, $arg2, (const long unsigned int*)$arg3, $arg4, $arg5)")
    public static @Unsigned long HUF_writeCTable(Ptr<?> dst, @Unsigned long maxDstSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, @Unsigned int maxSymbolValue, @Unsigned int huffLog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_writeCTable_wksp($arg1, $arg2, (const long unsigned int*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long HUF_writeCTable_wksp(Ptr<?> dst, @Unsigned long maxDstSize, Ptr<@Unsigned @OriginalName(value="HUF_CElt") Long> CTable, @Unsigned int maxSymbolValue, @Unsigned int huffLog, Ptr<?> workspace2, @Unsigned long workspaceSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X1_DCtx_wksp($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long HUF_decompress1X1_DCtx_wksp(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DCtx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X1_DCtx_wksp_bmi2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static @Unsigned long HUF_decompress1X1_DCtx_wksp_bmi2(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> dctx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X1_usingDTable($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress1X1_usingDTable(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X1_usingDTable_internal_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress1X1_usingDTable_internal_bmi2(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X1_usingDTable_internal_default($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress1X1_usingDTable_internal_default(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X2_DCtx_wksp($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long HUF_decompress1X2_DCtx_wksp(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DCtx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X2_usingDTable($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress1X2_usingDTable(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X2_usingDTable_internal_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress1X2_usingDTable_internal_bmi2(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X2_usingDTable_internal_default($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress1X2_usingDTable_internal_default(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X_DCtx_wksp($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long HUF_decompress1X_DCtx_wksp(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> dctx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X_usingDTable($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress1X_usingDTable(Ptr<?> dst, @Unsigned long maxDstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress1X_usingDTable_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5, $arg6)")
    public static @Unsigned long HUF_decompress1X_usingDTable_bmi2(Ptr<?> dst, @Unsigned long maxDstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X1_DCtx_wksp($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long HUF_decompress4X1_DCtx_wksp(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> dctx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X1_DCtx_wksp_bmi2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static @Unsigned long HUF_decompress4X1_DCtx_wksp_bmi2(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> dctx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X1_usingDTable($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress4X1_usingDTable(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X1_usingDTable_internal_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress4X1_usingDTable_internal_bmi2(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X1_usingDTable_internal_default($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress4X1_usingDTable_internal_default(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X2_DCtx_wksp($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long HUF_decompress4X2_DCtx_wksp(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> dctx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X2_DCtx_wksp_bmi2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static @Unsigned long HUF_decompress4X2_DCtx_wksp_bmi2(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> dctx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X2_usingDTable($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress4X2_usingDTable(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X2_usingDTable_internal_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress4X2_usingDTable_internal_bmi2(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X2_usingDTable_internal_default($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress4X2_usingDTable_internal_default(Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X_hufOnly_wksp($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long HUF_decompress4X_hufOnly_wksp(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> dctx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X_hufOnly_wksp_bmi2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static @Unsigned long HUF_decompress4X_hufOnly_wksp_bmi2(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> dctx, Ptr<?> dst, @Unsigned long dstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<?> workSpace, @Unsigned long wkspSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X_usingDTable($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5)")
    public static @Unsigned long HUF_decompress4X_usingDTable(Ptr<?> dst, @Unsigned long maxDstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_decompress4X_usingDTable_bmi2($arg1, $arg2, (const void*)$arg3, $arg4, (const unsigned int*)$arg5, $arg6)")
    public static @Unsigned long HUF_decompress4X_usingDTable_bmi2(Ptr<?> dst, @Unsigned long maxDstSize, Ptr<?> cSrc, @Unsigned long cSrcSize, Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_fillDTableX2($arg1, (const unsigned int)$arg2, (const struct {\n  u8 symbol;\n}*)$arg3, (const unsigned int*)$arg4, $arg5, (const unsigned int)$arg6, (const unsigned int)$arg7)")
    public static void HUF_fillDTableX2(Ptr<runtime.HUF_DEltX2> DTable, @Unsigned int targetLog, Ptr<misc.sortedSymbol_t> sortedList, Ptr<@Unsigned Integer> rankStart, Ptr<@Unsigned int @Size(value=13) @OriginalName(value="rankValCol_t") []> rankValOrigin, @Unsigned int maxWeight, @Unsigned int nbBitsBaseline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_fillDTableX2ForWeight($arg1, (const struct {\n  u8 symbol;\n}*)$arg2, (const struct {\n  u8 symbol;\n}*)$arg3, $arg4, $arg5, $arg6, (const int)$arg7)")
    public static void HUF_fillDTableX2ForWeight(Ptr<runtime.HUF_DEltX2> DTableRank, Ptr<misc.sortedSymbol_t> begin, Ptr<misc.sortedSymbol_t> end, @Unsigned int nbBits, @Unsigned int tableLog, @Unsigned short baseSeq, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_readDTableX1_wksp($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long HUF_readDTableX1_wksp(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable, Ptr<?> src, @Unsigned long srcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_readDTableX1_wksp_bmi2($arg1, (const void*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long HUF_readDTableX1_wksp_bmi2(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable, Ptr<?> src, @Unsigned long srcSize, Ptr<?> workSpace, @Unsigned long wkspSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_readDTableX2_wksp($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long HUF_readDTableX2_wksp(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable, Ptr<?> src, @Unsigned long srcSize, Ptr<?> workSpace, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="HUF_readDTableX2_wksp_bmi2($arg1, (const void*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long HUF_readDTableX2_wksp_bmi2(Ptr<@Unsigned @OriginalName(value="HUF_DTable") Integer> DTable, Ptr<?> src, @Unsigned long srcSize, Ptr<?> workSpace, @Unsigned long wkspSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int HUF_selectDecoder(@Unsigned long dstSize, @Unsigned long cSrcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int count[256]; long unsigned int CTable[257]; union { struct { nodeElt_s huffNodeTbl[512]; struct { short unsigned int base; short unsigned int curr; } rankPosition[192]; } buildCTable_wksp; struct { struct { unsigned int CTable[59]; unsigned int scratchBuffer[41]; unsigned int count[13]; short int norm[13]; } wksp; u8 bitsToWeight[13]; u8 huffWeight[255]; } writeCTable_wksp; unsigned int hist_wksp[1024]; }; }")
    @NotUsableInJava
    public static class HUF_compress_tables_t
    extends Struct {
        public @Unsigned int @Size(value=256) [] count;
        public @Unsigned @OriginalName(value="HUF_CElt") long @Size(value=257) [] CTable;
        public misc.wksps_of_HUF_compress_tables_t wksps;
    }

    @Type(noCCodeGeneration=true, cType="struct { nodeElt_s huffNodeTbl[512]; struct { short unsigned int base; short unsigned int curr; } rankPosition[192]; }")
    @NotUsableInJava
    public static class HUF_buildCTable_wksp_tables
    extends Struct {
        public misc.nodeElt_s @Size(value=512) @OriginalName(value="huffNodeTable") [] huffNodeTbl;
        public runtime.rankPos @Size(value=192) [] rankPosition;
    }
}

