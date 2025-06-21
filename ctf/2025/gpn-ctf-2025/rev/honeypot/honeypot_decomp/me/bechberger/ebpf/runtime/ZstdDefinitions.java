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
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SquashfsDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ZstdDefinitions {
    public static final @Unsigned int ZSTD_error_no_error = 0;
    public static final @Unsigned int ZSTD_error_GENERIC = 1;
    public static final @Unsigned int ZSTD_error_prefix_unknown = 10;
    public static final @Unsigned int ZSTD_error_version_unsupported = 12;
    public static final @Unsigned int ZSTD_error_frameParameter_unsupported = 14;
    public static final @Unsigned int ZSTD_error_frameParameter_windowTooLarge = 16;
    public static final @Unsigned int ZSTD_error_corruption_detected = 20;
    public static final @Unsigned int ZSTD_error_checksum_wrong = 22;
    public static final @Unsigned int ZSTD_error_dictionary_corrupted = 30;
    public static final @Unsigned int ZSTD_error_dictionary_wrong = 32;
    public static final @Unsigned int ZSTD_error_dictionaryCreation_failed = 34;
    public static final @Unsigned int ZSTD_error_parameter_unsupported = 40;
    public static final @Unsigned int ZSTD_error_parameter_outOfBound = 42;
    public static final @Unsigned int ZSTD_error_tableLog_tooLarge = 44;
    public static final @Unsigned int ZSTD_error_maxSymbolValue_tooLarge = 46;
    public static final @Unsigned int ZSTD_error_maxSymbolValue_tooSmall = 48;
    public static final @Unsigned int ZSTD_error_stage_wrong = 60;
    public static final @Unsigned int ZSTD_error_init_missing = 62;
    public static final @Unsigned int ZSTD_error_memory_allocation = 64;
    public static final @Unsigned int ZSTD_error_workSpace_tooSmall = 66;
    public static final @Unsigned int ZSTD_error_dstSize_tooSmall = 70;
    public static final @Unsigned int ZSTD_error_srcSize_wrong = 72;
    public static final @Unsigned int ZSTD_error_dstBuffer_null = 74;
    public static final @Unsigned int ZSTD_error_frameIndex_tooLarge = 100;
    public static final @Unsigned int ZSTD_error_seekableIO = 102;
    public static final @Unsigned int ZSTD_error_dstBuffer_wrong = 104;
    public static final @Unsigned int ZSTD_error_srcBuffer_wrong = 105;
    public static final @Unsigned int ZSTD_error_maxCode = 120;
    public static final @Unsigned int ZSTD_dtlm_fast = 0;
    public static final @Unsigned int ZSTD_dtlm_full = 1;
    public static final @Unsigned int ZSTD_defaultDisallowed = 0;
    public static final @Unsigned int ZSTD_defaultAllowed = 1;
    public static final @Unsigned int ZSTD_dlm_byCopy = 0;
    public static final @Unsigned int ZSTD_dlm_byRef = 1;
    public static final @Unsigned int ZSTD_reset_session_only = 1;
    public static final @Unsigned int ZSTD_reset_parameters = 2;
    public static final @Unsigned int ZSTD_reset_session_and_parameters = 3;
    public static final @Unsigned int ZSTD_d_windowLogMax = 100;
    public static final @Unsigned int ZSTD_d_experimentalParam1 = 1000;
    public static final @Unsigned int ZSTD_d_experimentalParam2 = 1001;
    public static final @Unsigned int ZSTD_d_experimentalParam3 = 1002;
    public static final @Unsigned int ZSTD_d_experimentalParam4 = 1003;
    public static final @Unsigned int ZSTD_lo_isRegularOffset = 0;
    public static final @Unsigned int ZSTD_lo_isLongOffset = 1;
    public static final @Unsigned int ZSTD_c_compressionLevel = 100;
    public static final @Unsigned int ZSTD_c_windowLog = 101;
    public static final @Unsigned int ZSTD_c_hashLog = 102;
    public static final @Unsigned int ZSTD_c_chainLog = 103;
    public static final @Unsigned int ZSTD_c_searchLog = 104;
    public static final @Unsigned int ZSTD_c_minMatch = 105;
    public static final @Unsigned int ZSTD_c_targetLength = 106;
    public static final @Unsigned int ZSTD_c_strategy = 107;
    public static final @Unsigned int ZSTD_c_enableLongDistanceMatching = 160;
    public static final @Unsigned int ZSTD_c_ldmHashLog = 161;
    public static final @Unsigned int ZSTD_c_ldmMinMatch = 162;
    public static final @Unsigned int ZSTD_c_ldmBucketSizeLog = 163;
    public static final @Unsigned int ZSTD_c_ldmHashRateLog = 164;
    public static final @Unsigned int ZSTD_c_contentSizeFlag = 200;
    public static final @Unsigned int ZSTD_c_checksumFlag = 201;
    public static final @Unsigned int ZSTD_c_dictIDFlag = 202;
    public static final @Unsigned int ZSTD_c_nbWorkers = 400;
    public static final @Unsigned int ZSTD_c_jobSize = 401;
    public static final @Unsigned int ZSTD_c_overlapLog = 402;
    public static final @Unsigned int ZSTD_c_experimentalParam1 = 500;
    public static final @Unsigned int ZSTD_c_experimentalParam2 = 10;
    public static final @Unsigned int ZSTD_c_experimentalParam3 = 1000;
    public static final @Unsigned int ZSTD_c_experimentalParam4 = 1001;
    public static final @Unsigned int ZSTD_c_experimentalParam5 = 1002;
    public static final @Unsigned int ZSTD_c_experimentalParam6 = 1003;
    public static final @Unsigned int ZSTD_c_experimentalParam7 = 1004;
    public static final @Unsigned int ZSTD_c_experimentalParam8 = 1005;
    public static final @Unsigned int ZSTD_c_experimentalParam9 = 1006;
    public static final @Unsigned int ZSTD_c_experimentalParam10 = 1007;
    public static final @Unsigned int ZSTD_c_experimentalParam11 = 1008;
    public static final @Unsigned int ZSTD_c_experimentalParam12 = 1009;
    public static final @Unsigned int ZSTD_c_experimentalParam13 = 1010;
    public static final @Unsigned int ZSTD_c_experimentalParam14 = 1011;
    public static final @Unsigned int ZSTD_c_experimentalParam15 = 1012;
    public static final @Unsigned int ZSTD_e_continue = 0;
    public static final @Unsigned int ZSTD_e_flush = 1;
    public static final @Unsigned int ZSTD_e_end = 2;
    public static final @Unsigned int ZSTD_cpm_noAttachDict = 0;
    public static final @Unsigned int ZSTD_cpm_attachDict = 1;
    public static final @Unsigned int ZSTD_cpm_createCDict = 2;
    public static final @Unsigned int ZSTD_cpm_unknown = 3;
    public static final @Unsigned int ZSTD_resetTarget_CDict = 0;
    public static final @Unsigned int ZSTD_resetTarget_CCtx = 1;

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_buildCTable($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const u8*)$arg8, $arg9, (const short int*)$arg10, $arg11, $arg12, (const unsigned int*)$arg13, $arg14, $arg15, $arg16)")
    public static @Unsigned long ZSTD_buildCTable(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> nextCTable, @Unsigned int FSELog, @OriginalName(value="symbolEncodingType_e") misc.hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t type2, Ptr<@Unsigned Integer> count, @Unsigned int max, Ptr<@OriginalName(value="BYTE") Character> codeTable, @Unsigned long nbSeq, Ptr<Short> defaultNorm, @Unsigned int defaultNormLog, @Unsigned int defaultMax, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> prevCTable, @Unsigned long prevCTableSize, Ptr<?> entropyWorkspace, @Unsigned long entropyWorkspaceSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_buildFSETable($arg1, (const short int*)$arg2, $arg3, (const unsigned int*)$arg4, (const u8*)$arg5, $arg6, $arg7, $arg8, $arg9)")
    public static void ZSTD_buildFSETable(Ptr<ZSTD_seqSymbol> dt, Ptr<Short> normalizedCounter, @Unsigned int maxSymbolValue, Ptr<@Unsigned Integer> baseValue, Ptr<Character> nbAdditionalBits, @Unsigned int tableLog, Ptr<?> wksp, @Unsigned long wkspSize, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_buildFSETable_body_bmi2($arg1, (const short int*)$arg2, $arg3, (const unsigned int*)$arg4, (const u8*)$arg5, $arg6, $arg7, $arg8)")
    public static void ZSTD_buildFSETable_body_bmi2(Ptr<ZSTD_seqSymbol> dt, Ptr<Short> normalizedCounter, @Unsigned int maxSymbolValue, Ptr<@Unsigned Integer> baseValue, Ptr<Character> nbAdditionalBits, @Unsigned int tableLog, Ptr<?> wksp, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_buildFSETable_body_default($arg1, (const short int*)$arg2, $arg3, (const unsigned int*)$arg4, (const u8*)$arg5, $arg6, $arg7, $arg8)")
    public static void ZSTD_buildFSETable_body_default(Ptr<ZSTD_seqSymbol> dt, Ptr<Short> normalizedCounter, @Unsigned int maxSymbolValue, Ptr<@Unsigned Integer> baseValue, Ptr<Character> nbAdditionalBits, @Unsigned int tableLog, Ptr<?> wksp, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_checkContinuity($arg1, (const void*)$arg2, $arg3)")
    public static void ZSTD_checkContinuity(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_dictMatchState($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_dictMatchState(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_dictMatchState_4($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_dictMatchState_4(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_dictMatchState_5($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_dictMatchState_5(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_dictMatchState_6($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_dictMatchState_6(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_dictMatchState_7($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_dictMatchState_7(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_extDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_extDict(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_extDict_generic($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const unsigned int)$arg6)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_extDict_generic(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize, @Unsigned int mls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_noDict_4($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_noDict_4(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_noDict_5($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_noDict_5(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_noDict_6($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_noDict_6(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_doubleFast_noDict_7($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_doubleFast_noDict_7(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressLiterals((const struct {\n  long unsigned int CTable[257];\n  repeatMode_of_ZSTD_hufCTables_t repeatMode;\n}*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const void*)$arg7, $arg8, $arg9, $arg10, (const int)$arg11, $arg12)")
    public static @Unsigned long ZSTD_compressLiterals(Ptr<ZSTD_hufCTables_t> prevHuf, Ptr<ZSTD_hufCTables_t> nextHuf, @OriginalName(value="ZSTD_strategy") misc.strategy_of_ZSTD_compressionParameters strategy, int disableLiteralCompression, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, Ptr<?> entropyWorkspace, @Unsigned long entropyWorkspaceSize, int bmi2, @Unsigned int suspectUncompressible) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressRleLiteralsBlock($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static @Unsigned long ZSTD_compressRleLiteralsBlock(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_copyDCtx($arg1, (const ZSTD_DCtx_s*)$arg2)")
    public static void ZSTD_copyDCtx(Ptr<runtime.ZSTD_DCtx_s> dstDCtx, Ptr<runtime.ZSTD_DCtx_s> srcDCtx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_copyDDictParameters($arg1, (const ZSTD_DDict_s*)$arg2)")
    public static void ZSTD_copyDDictParameters(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_count((const u8*)$arg1, (const u8*)$arg2, (const const u8*)$arg3)")
    public static @Unsigned long ZSTD_count(Ptr<@OriginalName(value="BYTE") Character> pIn, Ptr<@OriginalName(value="BYTE") Character> pMatch, Ptr<@OriginalName(value="BYTE") Character> pInLimit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_count_2segments((const u8*)$arg1, (const u8*)$arg2, (const u8*)$arg3, (const u8*)$arg4, (const u8*)$arg5)")
    public static @Unsigned long ZSTD_count_2segments(Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> match, Ptr<@OriginalName(value="BYTE") Character> iEnd, Ptr<@OriginalName(value="BYTE") Character> mEnd, Ptr<@OriginalName(value="BYTE") Character> iStart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ZSTD_DCtx_s> ZSTD_createDCtx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ZSTD_DCtx_s> ZSTD_createDCtx_advanced(ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_createDDict((const void*)$arg1, $arg2)")
    public static Ptr<runtime.ZSTD_DDict_s> ZSTD_createDDict(Ptr<?> dict, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_createDDict_advanced((const void*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<runtime.ZSTD_DDict_s> ZSTD_createDDict_advanced(Ptr<?> dict, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictLoadMethod_e") ZSTD_dlm_by dictLoadMethod, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType, ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_createDDict_byReference((const void*)$arg1, $arg2)")
    public static Ptr<runtime.ZSTD_DDict_s> ZSTD_createDDict_byReference(Ptr<?> dictBuffer, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> ZSTD_createDStream() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> ZSTD_createDStream_advanced(ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_crossEntropyCost((const short int*)$arg1, $arg2, (const unsigned int*)$arg3, (const unsigned int)$arg4)")
    public static @Unsigned long ZSTD_crossEntropyCost(Ptr<Short> norm, @Unsigned int accuracyLog, Ptr<@Unsigned Integer> count, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ZSTD_bounds ZSTD_dParam_getBounds(@OriginalName(value="ZSTD_dParameter") ZSTD_d dParam) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decodeFrameHeader($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long ZSTD_decodeFrameHeader(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> src, @Unsigned long headerSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decodeLiteralsBlock($arg1, (const void*)$arg2, $arg3, $arg4, $arg5, (const streaming_operation)$arg6)")
    public static @Unsigned long ZSTD_decodeLiteralsBlock(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> src, @Unsigned long srcSize, Ptr<?> dst, @Unsigned long dstCapacity, misc.streaming_operation streaming) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decodeSeqHeaders($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static @Unsigned long ZSTD_decodeSeqHeaders(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<Integer> nbSeqPtr, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_decodingBufferSize_min(@Unsigned long windowSize, @Unsigned long frameContentSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompress($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static @Unsigned long ZSTD_decompress(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_decompressBegin(Ptr<runtime.ZSTD_DCtx_s> dctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressBegin_usingDDict($arg1, (const ZSTD_DDict_s*)$arg2)")
    public static @Unsigned long ZSTD_decompressBegin_usingDDict(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressBegin_usingDict($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long ZSTD_decompressBegin_usingDict(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dict, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressBlock($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_decompressBlock(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressBlock_internal($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const int)$arg6, (const streaming_operation)$arg7)")
    public static @Unsigned long ZSTD_decompressBlock_internal(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, int frame, misc.streaming_operation streaming) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressBound((const void*)$arg1, $arg2)")
    public static @Unsigned long ZSTD_decompressBound(Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressContinue($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_decompressContinue(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressContinueStream($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_decompressContinueStream(Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> zds, Ptr<String> op, String oend, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressDCtx($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_decompressDCtx(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressFrame($arg1, $arg2, $arg3, (const void**)$arg4, $arg5)")
    public static @Unsigned long ZSTD_decompressFrame(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<Ptr<?>> srcPtr, Ptr<@Unsigned Long> srcSizePtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressMultiFrame($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const void*)$arg6, $arg7, (const ZSTD_DDict_s*)$arg8)")
    public static @Unsigned long ZSTD_decompressMultiFrame(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, Ptr<?> dict, @Unsigned long dictSize, Ptr<runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_decompressStream(Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> zds, Ptr<ZSTD_outBuffer_s> output, Ptr<ZSTD_inBuffer_s> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompressStream_simpleArgs($arg1, $arg2, $arg3, $arg4, (const void*)$arg5, $arg6, $arg7)")
    public static @Unsigned long ZSTD_decompressStream_simpleArgs(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<@Unsigned Long> dstPos, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned Long> srcPos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompress_usingDDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const ZSTD_DDict_s*)$arg6)")
    public static @Unsigned long ZSTD_decompress_usingDDict(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, Ptr<runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_decompress_usingDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const void*)$arg6, $arg7)")
    public static @Unsigned long ZSTD_decompress_usingDict(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, Ptr<?> dict, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_encodeSequences($arg1, $arg2, (const unsigned int*)$arg3, (const u8*)$arg4, (const unsigned int*)$arg5, (const u8*)$arg6, (const unsigned int*)$arg7, (const u8*)$arg8, (const seqDef_s*)$arg9, $arg10, $arg11, $arg12)")
    public static @Unsigned long ZSTD_encodeSequences(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> CTable_MatchLength, Ptr<@OriginalName(value="BYTE") Character> mlCodeTable, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> CTable_OffsetBits, Ptr<@OriginalName(value="BYTE") Character> ofCodeTable, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> CTable_LitLength, Ptr<@OriginalName(value="BYTE") Character> llCodeTable, Ptr<misc.seqDef_s> sequences, @Unsigned long nbSeq, int longOffsets, int bmi2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_encodeSequences_bmi2($arg1, $arg2, (const unsigned int*)$arg3, (const u8*)$arg4, (const unsigned int*)$arg5, (const u8*)$arg6, (const unsigned int*)$arg7, (const u8*)$arg8, (const seqDef_s*)$arg9, $arg10, $arg11)")
    public static @Unsigned long ZSTD_encodeSequences_bmi2(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> CTable_MatchLength, Ptr<@OriginalName(value="BYTE") Character> mlCodeTable, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> CTable_OffsetBits, Ptr<@OriginalName(value="BYTE") Character> ofCodeTable, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> CTable_LitLength, Ptr<@OriginalName(value="BYTE") Character> llCodeTable, Ptr<misc.seqDef_s> sequences, @Unsigned long nbSeq, int longOffsets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_encodeSequences_default($arg1, $arg2, (const unsigned int*)$arg3, (const u8*)$arg4, (const unsigned int*)$arg5, (const u8*)$arg6, (const unsigned int*)$arg7, (const u8*)$arg8, (const seqDef_s*)$arg9, $arg10, $arg11)")
    public static @Unsigned long ZSTD_encodeSequences_default(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> CTable_MatchLength, Ptr<@OriginalName(value="BYTE") Character> mlCodeTable, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> CTable_OffsetBits, Ptr<@OriginalName(value="BYTE") Character> ofCodeTable, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> CTable_LitLength, Ptr<@OriginalName(value="BYTE") Character> llCodeTable, Ptr<misc.seqDef_s> sequences, @Unsigned long nbSeq, int longOffsets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_estimateDCtxSize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_estimateDDictSize(@Unsigned long dictSize, @OriginalName(value="ZSTD_dictLoadMethod_e") ZSTD_dlm_by dictLoadMethod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_estimateDStreamSize(@Unsigned long windowSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_estimateDStreamSize_fromFrame((const void*)$arg1, $arg2)")
    public static @Unsigned long ZSTD_estimateDStreamSize_fromFrame(Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_execSequenceEnd($arg1, (const u8*)$arg2, $arg3, (const u8**)$arg4, (const const u8*)$arg5, (const const u8*)$arg6, (const const u8*)$arg7, (const const u8*)$arg8)")
    public static @Unsigned long ZSTD_execSequenceEnd(Ptr<@OriginalName(value="BYTE") Character> op, Ptr<@OriginalName(value="BYTE") Character> oend, SeqDefinitions.seq_t sequence, Ptr<Ptr<@OriginalName(value="BYTE") Character>> litPtr, Ptr<@OriginalName(value="BYTE") Character> litLimit, Ptr<@OriginalName(value="BYTE") Character> prefixStart, Ptr<@OriginalName(value="BYTE") Character> virtualStart, Ptr<@OriginalName(value="BYTE") Character> dictEnd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_execSequenceEndSplitLitBuffer($arg1, (const u8*)$arg2, (const const u8*)$arg3, $arg4, (const u8**)$arg5, (const const u8*)$arg6, (const const u8*)$arg7, (const const u8*)$arg8, (const const u8*)$arg9)")
    public static @Unsigned long ZSTD_execSequenceEndSplitLitBuffer(Ptr<@OriginalName(value="BYTE") Character> op, Ptr<@OriginalName(value="BYTE") Character> oend, Ptr<@OriginalName(value="BYTE") Character> oend_w, SeqDefinitions.seq_t sequence, Ptr<Ptr<@OriginalName(value="BYTE") Character>> litPtr, Ptr<@OriginalName(value="BYTE") Character> litLimit, Ptr<@OriginalName(value="BYTE") Character> prefixStart, Ptr<@OriginalName(value="BYTE") Character> virtualStart, Ptr<@OriginalName(value="BYTE") Character> dictEnd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_fillDoubleHashTable($arg1, (const void*)$arg2, $arg3)")
    public static void ZSTD_fillDoubleHashTable(Ptr<ZSTD_matchState_t> ms, Ptr<?> end, @OriginalName(value="ZSTD_dictTableLoadMethod_e") ZSTD_dtlm_f dtlm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_findDecompressedSize((const void*)$arg1, $arg2)")
    public static @Unsigned long ZSTD_findDecompressedSize(Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_findFrameCompressedSize((const void*)$arg1, $arg2)")
    public static @Unsigned long ZSTD_findFrameCompressedSize(Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_findFrameSizeInfo((const void*)$arg1, $arg2)")
    public static ZSTD_frameSizeInfo ZSTD_findFrameSizeInfo(Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_frameHeaderSize((const void*)$arg1, $arg2)")
    public static @Unsigned long ZSTD_frameHeaderSize(Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_frameHeaderSize_internal((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned long ZSTD_frameHeaderSize_internal(Ptr<?> src, @Unsigned long srcSize, @OriginalName(value="ZSTD_format_e") misc.format_of_ZSTD_CCtx_params_and_format_of_ZSTD_CCtx_params_s_and_format_of_ZSTD_DCtx format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_freeDCtx(Ptr<runtime.ZSTD_DCtx_s> dctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_freeDDict(Ptr<runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_freeDStream(Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> zds) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_fseBitCost((const unsigned int*)$arg1, (const unsigned int*)$arg2, (const unsigned int)$arg3)")
    public static @Unsigned long ZSTD_fseBitCost(Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> ctable, Ptr<@Unsigned Integer> count, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getDecompressedSize((const void*)$arg1, $arg2)")
    public static @Unsigned long ZSTD_getDecompressedSize(Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getDictID_fromDDict((const ZSTD_DDict_s*)$arg1)")
    public static @Unsigned int ZSTD_getDictID_fromDDict(Ptr<runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getDictID_fromDict((const void*)$arg1, $arg2)")
    public static @Unsigned int ZSTD_getDictID_fromDict(Ptr<?> dict, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getDictID_fromFrame((const void*)$arg1, $arg2)")
    public static @Unsigned int ZSTD_getDictID_fromFrame(Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getFrameContentSize((const void*)$arg1, $arg2)")
    public static @Unsigned long ZSTD_getFrameContentSize(Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getFrameHeader($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long ZSTD_getFrameHeader(Ptr<ZSTD_frameHeader> zfhPtr, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getFrameHeader_advanced($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static @Unsigned long ZSTD_getFrameHeader_advanced(Ptr<ZSTD_frameHeader> zfhPtr, Ptr<?> src, @Unsigned long srcSize, @OriginalName(value="ZSTD_format_e") misc.format_of_ZSTD_CCtx_params_and_format_of_ZSTD_CCtx_params_s_and_format_of_ZSTD_DCtx format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getcBlockSize((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned long ZSTD_getcBlockSize(Ptr<?> src, @Unsigned long srcSize, Ptr<misc.blockProperties_t> bpPtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ZSTD_hash4(@Unsigned int u, @Unsigned int h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_hash5(@Unsigned long u, @Unsigned int h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_hash6(@Unsigned long u, @Unsigned int h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_initDCtx_internal(Ptr<runtime.ZSTD_DCtx_s> dctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initDDict_internal($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_initDDict_internal(Ptr<runtime.ZSTD_DDict_s> ddict, Ptr<?> dict, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictLoadMethod_e") ZSTD_dlm_by dictLoadMethod, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_initDStream(Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> zds) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initDStream_usingDDict($arg1, (const ZSTD_DDict_s*)$arg2)")
    public static @Unsigned long ZSTD_initDStream_usingDDict(Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> dctx, Ptr<runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initDStream_usingDict($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long ZSTD_initDStream_usingDict(Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> zds, Ptr<?> dict, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initFseState($arg1, $arg2, (const struct {\n  short unsigned int nextState;\n  u8 nbAdditionalBits;\n  u8 nbBits;\n  unsigned int baseValue;\n}*)$arg3)")
    public static void ZSTD_initFseState(Ptr<ZSTD_fseState> DStatePtr, Ptr<runtime.BIT_DStream_t> bitD, Ptr<ZSTD_seqSymbol> dt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ZSTD_DCtx_s> ZSTD_initStaticDCtx(Ptr<?> workspace2, @Unsigned long workspaceSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const ZSTD_DDict_s*)ZSTD_initStaticDDict($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6))")
    public static Ptr<runtime.ZSTD_DDict_s> ZSTD_initStaticDDict(Ptr<?> sBuffer, @Unsigned long sBufferSize, Ptr<?> dict, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictLoadMethod_e") ZSTD_dlm_by dictLoadMethod, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> ZSTD_initStaticDStream(Ptr<?> workspace2, @Unsigned long workspaceSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_insertBlock($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long ZSTD_insertBlock(Ptr<runtime.ZSTD_DCtx_s> dctx, Ptr<?> blockStart, @Unsigned long blockSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_isFrame((const void*)$arg1, $arg2)")
    public static @Unsigned int ZSTD_isFrame(Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_isSkippableFrame((const void*)$arg1, $arg2)")
    public static @Unsigned int ZSTD_isSkippableFrame(Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_ldm_adjustParameters($arg1, (const struct {\n  unsigned int windowLog;\n  unsigned int chainLog;\n  unsigned int hashLog;\n  unsigned int searchLog;\n  unsigned int minMatch;\n  unsigned int targetLength;\n  strategy_of_ZSTD_compressionParameters strategy;\n}*)$arg2)")
    public static void ZSTD_ldm_adjustParameters(Ptr<misc.ldmParams_t> params, Ptr<ZSTD_compressionParameters> cParams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_ldm_blockCompress($arg1, $arg2, $arg3, $arg4, $arg5, (const void*)$arg6, $arg7)")
    public static @Unsigned long ZSTD_ldm_blockCompress(Ptr<misc.rawSeqStore_t> rawSeqStore, Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, @OriginalName(value="ZSTD_paramSwitch_e") misc.enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s useRowMatchFinder, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_ldm_fillHashTable($arg1, (const u8*)$arg2, (const u8*)$arg3, (const struct {\n  enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s enableLdm;\n  unsigned int hashLog;\n  unsigned int bucketSizeLog;\n  unsigned int minMatchLength;\n  unsigned int hashRateLog;\n  unsigned int windowLog;\n}*)$arg4)")
    public static void ZSTD_ldm_fillHashTable(Ptr<misc.ldmState_t> ldmState, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iend, Ptr<misc.ldmParams_t> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_ldm_gear_feed($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_ldm_gear_feed(Ptr<misc.ldmRollingHashState_t> state2, Ptr<@OriginalName(value="BYTE") Character> data, @Unsigned long size, Ptr<@Unsigned Long> splits, Ptr<@Unsigned Integer> numSplits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_ldm_gear_init($arg1, (const struct {\n  enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s enableLdm;\n  unsigned int hashLog;\n  unsigned int bucketSizeLog;\n  unsigned int minMatchLength;\n  unsigned int hashRateLog;\n  unsigned int windowLog;\n}*)$arg2)")
    public static void ZSTD_ldm_gear_init(Ptr<misc.ldmRollingHashState_t> state2, Ptr<misc.ldmParams_t> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_ldm_generateSequences($arg1, $arg2, (const struct {\n  enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s enableLdm;\n  unsigned int hashLog;\n  unsigned int bucketSizeLog;\n  unsigned int minMatchLength;\n  unsigned int hashRateLog;\n  unsigned int windowLog;\n}*)$arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_ldm_generateSequences(Ptr<misc.ldmState_t> ldmState, Ptr<misc.rawSeqStore_t> sequences, Ptr<misc.ldmParams_t> params, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_ldm_generateSequences_internal($arg1, $arg2, (const struct {\n  enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s enableLdm;\n  unsigned int hashLog;\n  unsigned int bucketSizeLog;\n  unsigned int minMatchLength;\n  unsigned int hashRateLog;\n  unsigned int windowLog;\n}*)$arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_ldm_generateSequences_internal(Ptr<misc.ldmState_t> ldmState, Ptr<misc.rawSeqStore_t> rawSeqStore, Ptr<misc.ldmParams_t> params, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_ldm_getMaxNbSeq(misc.ldmParams_t params, @Unsigned long maxChunkSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_ldm_getTableSize(misc.ldmParams_t params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_ldm_insertEntry($arg1, (const long unsigned int)$arg2, (const struct {\n  unsigned int offset;\n  unsigned int checksum;\n})$arg3, (const struct {\n  enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s enableLdm;\n  unsigned int hashLog;\n  unsigned int bucketSizeLog;\n  unsigned int minMatchLength;\n  unsigned int hashRateLog;\n  unsigned int windowLog;\n})$arg4)")
    public static void ZSTD_ldm_insertEntry(Ptr<misc.ldmState_t> ldmState, @Unsigned long hash2, misc.ldmEntry_t entry, misc.ldmParams_t ldmParams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_ldm_skipRawSeqStoreBytes(Ptr<misc.rawSeqStore_t> rawSeqStore, @Unsigned long nbBytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_ldm_skipSequences($arg1, $arg2, (const unsigned int)$arg3)")
    public static void ZSTD_ldm_skipSequences(Ptr<misc.rawSeqStore_t> rawSeqStore, @Unsigned long srcSize, @Unsigned int minMatch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_loadDEntropy($arg1, (const const void*)$arg2, (const long unsigned int)$arg3)")
    public static @Unsigned long ZSTD_loadDEntropy(Ptr<ZSTD_entropyDTables_t> entropy, Ptr<?> dict, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="ZSTD_nextInputType_e") runtime.ZSTDnit ZSTD_nextInputType(Ptr<runtime.ZSTD_DCtx_s> dctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_nextSrcSizeToDecompress(Ptr<runtime.ZSTD_DCtx_s> dctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_noCompressLiterals($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static @Unsigned long ZSTD_noCompressLiterals(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_readSkippableFrame($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_readSkippableFrame(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<@Unsigned Integer> magicVariant, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_resetDStream(Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> dctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_safecopy($arg1, (const const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void ZSTD_safecopy(Ptr<@OriginalName(value="BYTE") Character> op, Ptr<@OriginalName(value="BYTE") Character> oend_w, Ptr<@OriginalName(value="BYTE") Character> ip, @OriginalName(value="ptrdiff_t") long length,  @OriginalName(value="ZSTD_overlap_e") runtime.ZSTD ovtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_safecopyDstBeforeSrc($arg1, (const u8*)$arg2, $arg3)")
    public static void ZSTD_safecopyDstBeforeSrc(Ptr<@OriginalName(value="BYTE") Character> op, Ptr<@OriginalName(value="BYTE") Character> ip, @OriginalName(value="ptrdiff_t") long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_safecopyLiterals($arg1, (const u8*)$arg2, (const const u8*)$arg3, (const u8*)$arg4)")
    public static void ZSTD_safecopyLiterals(Ptr<@OriginalName(value="BYTE") Character> op, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iend, Ptr<@OriginalName(value="BYTE") Character> ilimit_w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_selectEncodingType($arg1, (const unsigned int*)$arg2, (const unsigned int)$arg3, (const long unsigned int)$arg4, $arg5, (const unsigned int)$arg6, (const unsigned int*)$arg7, (const short int*)$arg8, $arg9, (const ZSTD_default)$arg10, (const strategy_of_ZSTD_compressionParameters)$arg11)")
    public static @OriginalName(value="symbolEncodingType_e") misc.hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t ZSTD_selectEncodingType(Ptr<@OriginalName(value="FSE_repeat") misc.litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t> repeatMode, Ptr<@Unsigned Integer> count, @Unsigned int max, @Unsigned long mostFrequent, @Unsigned long nbSeq, @Unsigned int FSELog, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> prevCTable, Ptr<Short> defaultNorm, @Unsigned int defaultNormLog, @OriginalName(value="ZSTD_defaultPolicy_e") ZSTD_default isDefaultAllowed, @OriginalName(value="ZSTD_strategy") misc.strategy_of_ZSTD_compressionParameters strategy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_sizeof_DCtx((const ZSTD_DCtx_s*)$arg1)")
    public static @Unsigned long ZSTD_sizeof_DCtx(Ptr<runtime.ZSTD_DCtx_s> dctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_sizeof_DDict((const ZSTD_DDict_s*)$arg1)")
    public static @Unsigned long ZSTD_sizeof_DDict(Ptr<runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_sizeof_DStream((const ZSTD_DCtx_s*)$arg1)")
    public static @Unsigned long ZSTD_sizeof_DStream(Ptr< @OriginalName(value="ZSTD_DStream") runtime.ZSTD_DCtx_s> dctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="zstd_dctx") runtime.ZSTD_DCtx_s> zstd_create_dctx_advanced(@OriginalName(value="zstd_custom_mem") ZSTD_customMem custom_mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_create_ddict_byreference((const void*)$arg1, $arg2, $arg3)")
    public static @NotUsableInJava Ptr< @OriginalName(value="zstd_ddict") runtime.ZSTD_DDict_s> zstd_create_ddict_byreference(Ptr<?> dict, @Unsigned long dict_size, @OriginalName(value="zstd_custom_mem") ZSTD_customMem custom_mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_dctx_workspace_bound() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_decompress_dctx($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long zstd_decompress_dctx(Ptr< @OriginalName(value="zstd_dctx") runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dst_capacity, Ptr<?> src, @Unsigned long src_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_decompress_stream(Ptr< @OriginalName(value="zstd_dstream") runtime.ZSTD_DCtx_s> dstream, Ptr<@OriginalName(value="zstd_out_buffer") ZSTD_outBuffer_s> output, Ptr<@OriginalName(value="zstd_in_buffer") ZSTD_inBuffer_s> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_decompress_using_ddict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const ZSTD_DDict_s*)$arg6)")
    public static @Unsigned long zstd_decompress_using_ddict(Ptr< @OriginalName(value="zstd_dctx") runtime.ZSTD_DCtx_s> dctx, Ptr<?> dst, @Unsigned long dst_capacity, Ptr<?> src, @Unsigned long src_size, Ptr< @OriginalName(value="zstd_ddict") runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_dstream_workspace_bound(@Unsigned long max_window_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_find_frame_compressed_size((const void*)$arg1, $arg2)")
    public static @Unsigned long zstd_find_frame_compressed_size(Ptr<?> src, @Unsigned long src_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_free_dctx(Ptr< @OriginalName(value="zstd_dctx") runtime.ZSTD_DCtx_s> dctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_free_ddict(Ptr< @OriginalName(value="zstd_ddict") runtime.ZSTD_DDict_s> ddict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="zstd_error_code") ZSTD_error zstd_get_error_code(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)zstd_get_error_name($arg1))")
    public static String zstd_get_error_name(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_get_frame_header($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long zstd_get_frame_header(Ptr<@OriginalName(value="zstd_frame_header") ZSTD_frameHeader> header, Ptr<?> src, @Unsigned long src_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="zstd_dctx") runtime.ZSTD_DCtx_s> zstd_init_dctx(Ptr<?> workspace2, @Unsigned long workspace_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="zstd_dstream") runtime.ZSTD_DCtx_s> zstd_init_dstream(@Unsigned long max_window_size, Ptr<?> workspace2, @Unsigned long workspace_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int zstd_is_error(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_reset_dstream(Ptr< @OriginalName(value="zstd_dstream") runtime.ZSTD_DCtx_s> dstream) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ZSTD_compressionParameters ZSTD_adjustCParams(ZSTD_compressionParameters cPar, @Unsigned long srcSize, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ZSTD_compressionParameters ZSTD_adjustCParams_internal(ZSTD_compressionParameters cPar, @Unsigned long srcSize, @Unsigned long dictSize, @OriginalName(value="ZSTD_cParamMode_e") ZSTD_cpm mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_dictMatchState_3($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_dictMatchState_3(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_dictMatchState_4($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_dictMatchState_4(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_dictMatchState_5($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_dictMatchState_5(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_dictMatchState_6($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_dictMatchState_6(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_extDict_3($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_extDict_3(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_extDict_4($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_extDict_4(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_extDict_5($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_extDict_5(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_extDict_6($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_extDict_6(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_noDict_3($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_noDict_3(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_noDict_4($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_noDict_4(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_noDict_5($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_noDict_5(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_btGetAllMatches_noDict_6($arg1, $arg2, $arg3, (const u8*)$arg4, (const const u8*)$arg5, (const unsigned int*)$arg6, (const unsigned int)$arg7, (const unsigned int)$arg8)")
    public static @Unsigned int ZSTD_btGetAllMatches_noDict_6(Ptr<ZSTD_match_t> matches, Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iHighLimit, Ptr<@Unsigned Integer> rep, @Unsigned int ll0, @Unsigned int lengthToBeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_buildBlockEntropyStats($arg1, (const struct {\n  struct {\n    long unsigned int CTable[257];\n    repeatMode_of_ZSTD_hufCTables_t repeatMode;\n  } huf;\n  struct {\n    unsigned int offcodeCTable[193];\n    unsigned int matchlengthCTable[363];\n    unsigned int litlengthCTable[329];\n    litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode;\n    litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode;\n    litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode;\n  } fse;\n}*)$arg2, $arg3, (const ZSTD_CCtx_params_s*)$arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long ZSTD_buildBlockEntropyStats(Ptr<misc.seqStore_t> seqStorePtr, Ptr<ZSTD_entropyCTables_t> prevEntropy, Ptr<ZSTD_entropyCTables_t> nextEntropy, Ptr<runtime.ZSTD_CCtx_params_s> cctxParams, Ptr<ZSTD_entropyCTablesMetadata_t> entropyMetadata, Ptr<?> workspace2, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_buildBlockEntropyStats_literals((const void*)$arg1, $arg2, (const struct {\n  long unsigned int CTable[257];\n  repeatMode_of_ZSTD_hufCTables_t repeatMode;\n}*)$arg3, $arg4, $arg5, (const int)$arg6, $arg7, $arg8)")
    public static @Unsigned long ZSTD_buildBlockEntropyStats_literals(Ptr<?> src, @Unsigned long srcSize, Ptr<ZSTD_hufCTables_t> prevHuf, Ptr<ZSTD_hufCTables_t> nextHuf, Ptr<ZSTD_hufCTablesMetadata_t> hufMetadata, int literalsCompressionIsDisabled, Ptr<?> workspace2, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_buildEntropyStatisticsAndEstimateSubBlockSize(Ptr<misc.seqStore_t> seqStore, Ptr<runtime.ZSTD_CCtx_s> zc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_buildSeqStore($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned long ZSTD_buildSeqStore(Ptr<runtime.ZSTD_CCtx_s> zc, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static ZSTD_bounds ZSTD_cParam_getBounds(@OriginalName(value="ZSTD_cParameter") ZSTD_c param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_checkCParams(ZSTD_compressionParameters cParams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_clearAllDicts(Ptr<runtime.ZSTD_CCtx_s> cctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compress($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_compress(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compress2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compress2(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_compressBegin(Ptr<runtime.ZSTD_CCtx_s> cctx, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBegin_advanced($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBegin_advanced(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dict, @Unsigned long dictSize, ZSTD_parameters params, @Unsigned long pledgedSrcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBegin_advanced_internal($arg1, (const void*)$arg2, $arg3, $arg4, $arg5, (const ZSTD_CDict_s*)$arg6, (const ZSTD_CCtx_params_s*)$arg7, $arg8)")
    public static @Unsigned long ZSTD_compressBegin_advanced_internal(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dict, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType, @OriginalName(value="ZSTD_dictTableLoadMethod_e") ZSTD_dtlm_f dtlm, Ptr<runtime.ZSTD_CDict_s> cdict, Ptr<runtime.ZSTD_CCtx_params_s> params, @Unsigned long pledgedSrcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBegin_internal($arg1, (const void*)$arg2, $arg3, $arg4, $arg5, (const ZSTD_CDict_s*)$arg6, (const ZSTD_CCtx_params_s*)$arg7, $arg8, $arg9)")
    public static @Unsigned long ZSTD_compressBegin_internal(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dict, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType, @OriginalName(value="ZSTD_dictTableLoadMethod_e") ZSTD_dtlm_f dtlm, Ptr<runtime.ZSTD_CDict_s> cdict, Ptr<runtime.ZSTD_CCtx_params_s> params, @Unsigned long pledgedSrcSize, @OriginalName(value="ZSTD_buffered_policy_e") misc.bufferedPolicy_of_ZSTD_CCtx_and_bufferedPolicy_of_ZSTD_CCtx_s zbuff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBegin_usingCDict($arg1, (const ZSTD_CDict_s*)$arg2)")
    public static @Unsigned long ZSTD_compressBegin_usingCDict(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<runtime.ZSTD_CDict_s> cdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBegin_usingCDict_advanced((const ZSTD_CCtx_s*)$arg1, (const const ZSTD_CDict_s*)$arg2, (const struct {\n  int contentSizeFlag;\n  int checksumFlag;\n  int noDictIDFlag;\n})$arg3, (const long long unsigned int)$arg4)")
    public static @Unsigned long ZSTD_compressBegin_usingCDict_advanced(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<runtime.ZSTD_CDict_s> cdict, ZSTD_frameParameters fParams, @Unsigned long pledgedSrcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBegin_usingCDict_internal((const ZSTD_CCtx_s*)$arg1, (const const ZSTD_CDict_s*)$arg2, (const struct {\n  int contentSizeFlag;\n  int checksumFlag;\n  int noDictIDFlag;\n})$arg3, (const long long unsigned int)$arg4)")
    public static @Unsigned long ZSTD_compressBegin_usingCDict_internal(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<runtime.ZSTD_CDict_s> cdict, ZSTD_frameParameters fParams, @Unsigned long pledgedSrcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBegin_usingDict($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static @Unsigned long ZSTD_compressBegin_usingDict(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dict, @Unsigned long dictSize, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btopt($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btopt(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btopt_dictMatchState($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btopt_dictMatchState(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btopt_extDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btopt_extDict(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btultra($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btultra(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btultra2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btultra2(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btultra_dictMatchState($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btultra_dictMatchState(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btultra_extDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btultra_extDict(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_internal($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static @Unsigned long ZSTD_compressBlock_internal(Ptr<runtime.ZSTD_CCtx_s> zc, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, @Unsigned int frame) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_opt0($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const ZSTD)$arg6)")
    public static @Unsigned long ZSTD_compressBlock_opt0(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize,  @OriginalName(value="ZSTD_dictMode_e") runtime.ZSTD dictMode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_opt2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const ZSTD)$arg6)")
    public static @Unsigned long ZSTD_compressBlock_opt2(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize,  @OriginalName(value="ZSTD_dictMode_e") runtime.ZSTD dictMode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_splitBlock_internal($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long ZSTD_compressBlock_splitBlock_internal(Ptr<runtime.ZSTD_CCtx_s> zc, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long blockSize, @Unsigned int lastBlock, @Unsigned int nbSeq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_compressBound(@Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressCCtx($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static @Unsigned long ZSTD_compressCCtx(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressContinue($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressContinue(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressContinue_internal($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @Unsigned long ZSTD_compressContinue_internal(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, @Unsigned int frame, @Unsigned int lastFrameChunk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressEnd($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressEnd(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressSeqStore_singleBlock($arg1, (const struct {\n  seqDef_s *sequencesStart;\n  seqDef_s *sequences;\n  u8 *litStart;\n  u8 *lit;\n  u8 *llCode;\n  u8 *mlCode;\n  u8 *ofCode;\n  long unsigned int maxNbSeq;\n  long unsigned int maxNbLit;\n  longLengthType_of_seqStore_t longLengthType;\n  unsigned int longLengthPos;\n}*)$arg2, (const repcodes_s*)$arg3, (const repcodes_s*)$arg4, $arg5, $arg6, (const void*)$arg7, $arg8, $arg9, $arg10)")
    public static @Unsigned long ZSTD_compressSeqStore_singleBlock(Ptr<runtime.ZSTD_CCtx_s> zc, Ptr<misc.seqStore_t> seqStore, Ptr<@OriginalName(value="repcodes_t") misc.repcodes_s> dRep, Ptr<@OriginalName(value="repcodes_t") misc.repcodes_s> cRep, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, @Unsigned int lastBlock, @Unsigned int isPartition) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressSequences((const ZSTD_CCtx_s*)$arg1, $arg2, $arg3, (const struct {\n  unsigned int offset;\n  unsigned int litLength;\n  unsigned int matchLength;\n  unsigned int rep;\n}*)$arg4, $arg5, (const void*)$arg6, $arg7)")
    public static @Unsigned long ZSTD_compressSequences(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<runtime.ZSTD_Sequence> inSeqs, @Unsigned long inSeqsSize, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressSequences_internal($arg1, $arg2, $arg3, (const struct {\n  unsigned int offset;\n  unsigned int litLength;\n  unsigned int matchLength;\n  unsigned int rep;\n}*)$arg4, $arg5, (const void*)$arg6, $arg7)")
    public static @Unsigned long ZSTD_compressSequences_internal(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<runtime.ZSTD_Sequence> inSeqs, @Unsigned long inSeqsSize, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_compressStream(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, Ptr<ZSTD_outBuffer_s> output, Ptr<ZSTD_inBuffer_s> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_compressStream2(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<ZSTD_outBuffer_s> output, Ptr<ZSTD_inBuffer_s> input, @OriginalName(value="ZSTD_EndDirective") ZSTD_e endOp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressStream2_simpleArgs($arg1, $arg2, $arg3, $arg4, (const void*)$arg5, $arg6, $arg7, $arg8)")
    public static @Unsigned long ZSTD_compressStream2_simpleArgs(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<@Unsigned Long> dstPos, Ptr<?> src, @Unsigned long srcSize, Ptr<@Unsigned Long> srcPos, @OriginalName(value="ZSTD_EndDirective") ZSTD_e endOp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressStream_generic($arg1, $arg2, $arg3, (const ZSTD_e)$arg4)")
    public static @Unsigned long ZSTD_compressStream_generic(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, Ptr<ZSTD_outBuffer_s> output, Ptr<ZSTD_inBuffer_s> input, @OriginalName(value="ZSTD_EndDirective") ZSTD_e flushMode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compress_advanced($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const void*)$arg6, $arg7, $arg8)")
    public static @Unsigned long ZSTD_compress_advanced(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, Ptr<?> dict, @Unsigned long dictSize, ZSTD_parameters params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compress_advanced_internal($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const void*)$arg6, $arg7, (const ZSTD_CCtx_params_s*)$arg8)")
    public static @Unsigned long ZSTD_compress_advanced_internal(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, Ptr<?> dict, @Unsigned long dictSize, Ptr<runtime.ZSTD_CCtx_params_s> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compress_frameChunk($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static @Unsigned long ZSTD_compress_frameChunk(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, @Unsigned int lastFrameChunk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compress_insertDictionary($arg1, $arg2, $arg3, $arg4, (const ZSTD_CCtx_params_s*)$arg5, (const void*)$arg6, $arg7, $arg8, $arg9, $arg10)")
    public static @Unsigned long ZSTD_compress_insertDictionary(Ptr<ZSTD_compressedBlockState_t> bs, Ptr<ZSTD_matchState_t> ms, Ptr<misc.ldmState_t> ls, Ptr<ZSTD_cwksp> ws, Ptr<runtime.ZSTD_CCtx_params_s> params, Ptr<?> dict, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType, @OriginalName(value="ZSTD_dictTableLoadMethod_e") ZSTD_dtlm_f dtlm, Ptr<?> workspace2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compress_usingCDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const ZSTD_CDict_s*)$arg6)")
    public static @Unsigned long ZSTD_compress_usingCDict(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, Ptr<runtime.ZSTD_CDict_s> cdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compress_usingCDict_advanced($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const ZSTD_CDict_s*)$arg6, $arg7)")
    public static @Unsigned long ZSTD_compress_usingCDict_advanced(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, Ptr<runtime.ZSTD_CDict_s> cdict, ZSTD_frameParameters fParams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compress_usingDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const void*)$arg6, $arg7, $arg8)")
    public static @Unsigned long ZSTD_compress_usingDict(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, Ptr<?> dict, @Unsigned long dictSize, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_copyBlockSequences(Ptr<runtime.ZSTD_CCtx_s> zc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_copyCCtx($arg1, (const ZSTD_CCtx_s*)$arg2, $arg3)")
    public static @Unsigned long ZSTD_copyCCtx(Ptr<runtime.ZSTD_CCtx_s> dstCCtx, Ptr<runtime.ZSTD_CCtx_s> srcCCtx, @Unsigned long pledgedSrcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_copyCCtx_internal($arg1, (const ZSTD_CCtx_s*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_copyCCtx_internal(Ptr<runtime.ZSTD_CCtx_s> dstCCtx, Ptr<runtime.ZSTD_CCtx_s> srcCCtx, ZSTD_frameParameters fParams, @Unsigned long pledgedSrcSize, @OriginalName(value="ZSTD_buffered_policy_e") misc.bufferedPolicy_of_ZSTD_CCtx_and_bufferedPolicy_of_ZSTD_CCtx_s zbuff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_copySequencesToSeqStoreExplicitBlockDelim($arg1, $arg2, (const const struct {\n  unsigned int offset;\n  unsigned int litLength;\n  unsigned int matchLength;\n  unsigned int rep;\n}*)$arg3, $arg4, (const void*)$arg5, $arg6)")
    public static @Unsigned long ZSTD_copySequencesToSeqStoreExplicitBlockDelim(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<ZSTD_sequencePosition> seqPos, Ptr<runtime.ZSTD_Sequence> inSeqs, @Unsigned long inSeqsSize, Ptr<?> src, @Unsigned long blockSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_copySequencesToSeqStoreNoBlockDelim($arg1, $arg2, (const const struct {\n  unsigned int offset;\n  unsigned int litLength;\n  unsigned int matchLength;\n  unsigned int rep;\n}*)$arg3, $arg4, (const void*)$arg5, $arg6)")
    public static @Unsigned long ZSTD_copySequencesToSeqStoreNoBlockDelim(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<ZSTD_sequencePosition> seqPos, Ptr<runtime.ZSTD_Sequence> inSeqs, @Unsigned long inSeqsSize, Ptr<?> src, @Unsigned long blockSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ZSTD_CCtx_s> ZSTD_createCCtx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ZSTD_CCtx_params_s> ZSTD_createCCtxParams() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ZSTD_CCtx_s> ZSTD_createCCtx_advanced(ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_createCDict((const void*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.ZSTD_CDict_s> ZSTD_createCDict(Ptr<?> dict, @Unsigned long dictSize, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_createCDict_advanced((const void*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<runtime.ZSTD_CDict_s> ZSTD_createCDict_advanced(Ptr<?> dictBuffer, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictLoadMethod_e") ZSTD_dlm_by dictLoadMethod, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType, ZSTD_compressionParameters cParams, ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_createCDict_advanced2((const void*)$arg1, $arg2, $arg3, $arg4, (const ZSTD_CCtx_params_s*)$arg5, $arg6)")
    public static Ptr<runtime.ZSTD_CDict_s> ZSTD_createCDict_advanced2(Ptr<?> dict, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictLoadMethod_e") ZSTD_dlm_by dictLoadMethod, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType, Ptr<runtime.ZSTD_CCtx_params_s> originalCctxParams, ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_createCDict_byReference((const void*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.ZSTD_CDict_s> ZSTD_createCDict_byReference(Ptr<?> dict, @Unsigned long dictSize, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> ZSTD_createCStream() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> ZSTD_createCStream_advanced(ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ZSTD_cycleLog(@Unsigned int hashLog, @OriginalName(value="ZSTD_strategy") misc.strategy_of_ZSTD_compressionParameters strat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ZSTD_defaultCLevel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_deriveBlockSplitsHelper($arg1, $arg2, $arg3, $arg4, (const struct {\n  seqDef_s *sequencesStart;\n  seqDef_s *sequences;\n  u8 *litStart;\n  u8 *lit;\n  u8 *llCode;\n  u8 *mlCode;\n  u8 *ofCode;\n  long unsigned int maxNbSeq;\n  long unsigned int maxNbLit;\n  longLengthType_of_seqStore_t longLengthType;\n  unsigned int longLengthPos;\n}*)$arg5)")
    public static void ZSTD_deriveBlockSplitsHelper(Ptr<runtime.seqStoreSplits> splits, @Unsigned long startIdx, @Unsigned long endIdx, Ptr<runtime.ZSTD_CCtx_s> zc, Ptr<misc.seqStore_t> origSeqStore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_deriveSeqStoreChunk($arg1, (const struct {\n  seqDef_s *sequencesStart;\n  seqDef_s *sequences;\n  u8 *litStart;\n  u8 *lit;\n  u8 *llCode;\n  u8 *mlCode;\n  u8 *ofCode;\n  long unsigned int maxNbSeq;\n  long unsigned int maxNbLit;\n  longLengthType_of_seqStore_t longLengthType;\n  unsigned int longLengthPos;\n}*)$arg2, $arg3, $arg4)")
    public static void ZSTD_deriveSeqStoreChunk(Ptr<misc.seqStore_t> resultSeqStore, Ptr<misc.seqStore_t> originalSeqStore, @Unsigned long startIdx, @Unsigned long endIdx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_endStream(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, Ptr<ZSTD_outBuffer_s> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_estimateCCtxSize(int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_estimateCCtxSize_usingCCtxParams((const ZSTD_CCtx_params_s*)$arg1)")
    public static @Unsigned long ZSTD_estimateCCtxSize_usingCCtxParams(Ptr<runtime.ZSTD_CCtx_params_s> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_estimateCCtxSize_usingCCtxParams_internal((const struct {\n  unsigned int windowLog;\n  unsigned int chainLog;\n  unsigned int hashLog;\n  unsigned int searchLog;\n  unsigned int minMatch;\n  unsigned int targetLength;\n  strategy_of_ZSTD_compressionParameters strategy;\n}*)$arg1, (const struct {\n  enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s enableLdm;\n  unsigned int hashLog;\n  unsigned int bucketSizeLog;\n  unsigned int minMatchLength;\n  unsigned int hashRateLog;\n  unsigned int windowLog;\n}*)$arg2, (const int)$arg3, (const enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s)$arg4, (const long unsigned int)$arg5, (const long unsigned int)$arg6, (const long long unsigned int)$arg7)")
    public static @Unsigned long ZSTD_estimateCCtxSize_usingCCtxParams_internal(Ptr<ZSTD_compressionParameters> cParams, Ptr<misc.ldmParams_t> ldmParams, int isStatic, @OriginalName(value="ZSTD_paramSwitch_e") misc.enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s useRowMatchFinder, @Unsigned long buffInSize, @Unsigned long buffOutSize, @Unsigned long pledgedSrcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_estimateCCtxSize_usingCParams(ZSTD_compressionParameters cParams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_estimateCDictSize(@Unsigned long dictSize, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_estimateCDictSize_advanced(@Unsigned long dictSize, ZSTD_compressionParameters cParams, @OriginalName(value="ZSTD_dictLoadMethod_e") ZSTD_dlm_by dictLoadMethod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_estimateCStreamSize(int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_estimateCStreamSize_usingCCtxParams((const ZSTD_CCtx_params_s*)$arg1)")
    public static @Unsigned long ZSTD_estimateCStreamSize_usingCCtxParams(Ptr<runtime.ZSTD_CCtx_params_s> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_estimateCStreamSize_usingCParams(ZSTD_compressionParameters cParams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_flushStream(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, Ptr<ZSTD_outBuffer_s> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_freeCCtx(Ptr<runtime.ZSTD_CCtx_s> cctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_freeCCtxParams(Ptr<runtime.ZSTD_CCtx_params_s> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_freeCDict(Ptr<runtime.ZSTD_CDict_s> cdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_freeCStream(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_generateSequences($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_generateSequences(Ptr<runtime.ZSTD_CCtx_s> zc, Ptr<runtime.ZSTD_Sequence> outSeqs, @Unsigned long outSeqsSize, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getBlockSize((const ZSTD_CCtx_s*)$arg1)")
    public static @Unsigned long ZSTD_getBlockSize(Ptr<runtime.ZSTD_CCtx_s> cctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_getDictID_fromCDict((const ZSTD_CDict_s*)$arg1)")
    public static @Unsigned int ZSTD_getDictID_fromCDict(Ptr<runtime.ZSTD_CDict_s> cdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct {\n  seqDef_s *sequencesStart;\n  seqDef_s *sequences;\n  u8 *litStart;\n  u8 *lit;\n  u8 *llCode;\n  u8 *mlCode;\n  u8 *ofCode;\n  long unsigned int maxNbSeq;\n  long unsigned int maxNbLit;\n  longLengthType_of_seqStore_t longLengthType;\n  unsigned int longLengthPos;\n}*)ZSTD_getSeqStore((const ZSTD_CCtx_s*)$arg1))")
    public static Ptr<misc.seqStore_t> ZSTD_getSeqStore(Ptr<runtime.ZSTD_CCtx_s> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initCDict_internal($arg1, (const void*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned long ZSTD_initCDict_internal(Ptr<runtime.ZSTD_CDict_s> cdict, Ptr<?> dictBuffer, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictLoadMethod_e") ZSTD_dlm_by dictLoadMethod, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType, runtime.ZSTD_CCtx_params_s params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_initCStream(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initCStream_advanced($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_initCStream_advanced(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, Ptr<?> dict, @Unsigned long dictSize, ZSTD_parameters params, @Unsigned long pss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initCStream_internal($arg1, (const void*)$arg2, $arg3, (const ZSTD_CDict_s*)$arg4, (const ZSTD_CCtx_params_s*)$arg5, $arg6)")
    public static @Unsigned long ZSTD_initCStream_internal(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, Ptr<?> dict, @Unsigned long dictSize, Ptr<runtime.ZSTD_CDict_s> cdict, Ptr<runtime.ZSTD_CCtx_params_s> params, @Unsigned long pledgedSrcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_initCStream_srcSize(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, int compressionLevel, @Unsigned long pss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initCStream_usingCDict($arg1, (const ZSTD_CDict_s*)$arg2)")
    public static @Unsigned long ZSTD_initCStream_usingCDict(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, Ptr<runtime.ZSTD_CDict_s> cdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initCStream_usingCDict_advanced($arg1, (const ZSTD_CDict_s*)$arg2, $arg3, $arg4)")
    public static @Unsigned long ZSTD_initCStream_usingCDict_advanced(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, Ptr<runtime.ZSTD_CDict_s> cdict, ZSTD_frameParameters fParams, @Unsigned long pledgedSrcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_initCStream_usingDict($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static @Unsigned long ZSTD_initCStream_usingDict(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, Ptr<?> dict, @Unsigned long dictSize, int compressionLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ZSTD_CCtx_s> ZSTD_initStaticCCtx(Ptr<?> workspace2, @Unsigned long workspaceSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const ZSTD_CDict_s*)ZSTD_initStaticCDict($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7))")
    public static Ptr<runtime.ZSTD_CDict_s> ZSTD_initStaticCDict(Ptr<?> workspace2, @Unsigned long workspaceSize, Ptr<?> dict, @Unsigned long dictSize, @OriginalName(value="ZSTD_dictLoadMethod_e") ZSTD_dlm_by dictLoadMethod, @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType, ZSTD_compressionParameters cParams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> ZSTD_initStaticCStream(Ptr<?> workspace2, @Unsigned long workspaceSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_insertAndFindFirstIndexHash3((const ZSTD_matchState_t*)$arg1, $arg2, (const const u8*)$arg3)")
    public static @Unsigned int ZSTD_insertAndFindFirstIndexHash3(Ptr<ZSTD_matchState_t> ms, Ptr<@Unsigned Integer> nextToUpdate3, Ptr<@OriginalName(value="BYTE") Character> ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_insertBt1((const ZSTD_matchState_t*)$arg1, (const const u8*)$arg2, (const const u8*)$arg3, (const unsigned int)$arg4, (const unsigned int)$arg5, (const int)$arg6)")
    public static @Unsigned int ZSTD_insertBt1(Ptr<ZSTD_matchState_t> ms, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iend, @Unsigned int target, @Unsigned int mls, int extDict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_invalidateRepCodes(Ptr<runtime.ZSTD_CCtx_s> cctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_isRLE((const u8*)$arg1, $arg2)")
    public static int ZSTD_isRLE(Ptr<@OriginalName(value="BYTE") Character> src, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_loadCEntropy($arg1, $arg2, (const const void*)$arg3, $arg4)")
    public static @Unsigned long ZSTD_loadCEntropy(Ptr<ZSTD_compressedBlockState_t> bs, Ptr<?> workspace2, Ptr<?> dict, @Unsigned long dictSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_loadDictionaryContent($arg1, $arg2, $arg3, (const ZSTD_CCtx_params_s*)$arg4, (const void*)$arg5, $arg6, $arg7)")
    public static @Unsigned long ZSTD_loadDictionaryContent(Ptr<ZSTD_matchState_t> ms, Ptr<misc.ldmState_t> ls, Ptr<ZSTD_cwksp> ws, Ptr<runtime.ZSTD_CCtx_params_s> params, Ptr<?> src, @Unsigned long srcSize, @OriginalName(value="ZSTD_dictTableLoadMethod_e") ZSTD_dtlm_f dtlm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static runtime.ZSTD_CCtx_params_s ZSTD_makeCCtxParamsFromCParams(ZSTD_compressionParameters cParams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ZSTD_maxCLevel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_mergeBlockDelimiters(Ptr<runtime.ZSTD_Sequence> sequences, @Unsigned long seqsSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ZSTD_minCLevel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_optLdm_processMatchCandidate(Ptr<ZSTD_optLdm_t> optLdm, Ptr<ZSTD_match_t> matches, Ptr<@Unsigned Integer> nbMatches, @Unsigned int currPosInBlock, @Unsigned int remainingBytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_optLdm_skipRawSeqStoreBytes(Ptr<misc.rawSeqStore_t> rawSeqStore, @Unsigned long nbBytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_opt_getNextMatchAndUpdateSeqStore(Ptr<ZSTD_optLdm_t> optLdm, @Unsigned int currPosInBlock, @Unsigned int blockBytesRemaining) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_overflowCorrectIfNeeded($arg1, $arg2, (const ZSTD_CCtx_params_s*)$arg3, (const void*)$arg4, (const void*)$arg5)")
    public static void ZSTD_overflowCorrectIfNeeded(Ptr<ZSTD_matchState_t> ms, Ptr<ZSTD_cwksp> ws, Ptr<runtime.ZSTD_CCtx_params_s> params, Ptr<?> ip, Ptr<?> iend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_referenceExternalSequences(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<runtime.rawSeq> seq, @Unsigned long nbSeq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_rescaleFreqs((const struct {\n  unsigned int *litFreq;\n  unsigned int *litLengthFreq;\n  unsigned int *matchLengthFreq;\n  unsigned int *offCodeFreq;\n  struct {\n  unsigned int off;\n  unsigned int len;\n} *matchTable;\n  struct {\n  int price;\n  unsigned int off;\n  unsigned int mlen;\n  unsigned int litlen;\n  unsigned int rep[3];\n} *priceTable;\n  unsigned int litSum;\n  unsigned int litLengthSum;\n  unsigned int matchLengthSum;\n  unsigned int offCodeSum;\n  unsigned int litSumBasePrice;\n  unsigned int litLengthSumBasePrice;\n  unsigned int matchLengthSumBasePrice;\n  unsigned int offCodeSumBasePrice;\n  priceType_of_optState_t priceType;\nconst struct {\n  struct {\n    long unsigned int CTable[257];\n    repeatMode_of_ZSTD_hufCTables_t repeatMode;\n  } huf;\n  struct {\n    unsigned int offcodeCTable[193];\n    unsigned int matchlengthCTable[363];\n    unsigned int litlengthCTable[329];\n    litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode;\n    litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode;\n    litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode;\n  } fse;\n}*;\n  enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s literalCompressionMode;\n}*)$arg1, (const const u8*)$arg2, (const long unsigned int)$arg3, (const int)$arg4)")
    public static void ZSTD_rescaleFreqs(Ptr<misc.optState_t> optPtr, Ptr<@OriginalName(value="BYTE") Character> src, @Unsigned long srcSize, int optLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_resetCCtx_byCopyingCDict($arg1, (const ZSTD_CDict_s*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_resetCCtx_byCopyingCDict(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<runtime.ZSTD_CDict_s> cdict, runtime.ZSTD_CCtx_params_s params, @Unsigned long pledgedSrcSize, @OriginalName(value="ZSTD_buffered_policy_e") misc.bufferedPolicy_of_ZSTD_CCtx_and_bufferedPolicy_of_ZSTD_CCtx_s zbuff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_resetCCtx_internal($arg1, (const ZSTD_CCtx_params_s*)$arg2, (const long long unsigned int)$arg3, (const long unsigned int)$arg4, (const ZSTDcrp)$arg5, (const bufferedPolicy_of_ZSTD_CCtx_and_bufferedPolicy_of_ZSTD_CCtx_s)$arg6)")
    public static @Unsigned long ZSTD_resetCCtx_internal(Ptr<runtime.ZSTD_CCtx_s> zc, Ptr<runtime.ZSTD_CCtx_params_s> params, @Unsigned long pledgedSrcSize, @Unsigned long loadedDictSize,  @OriginalName(value="ZSTD_compResetPolicy_e") runtime.ZSTDcrp crp, @OriginalName(value="ZSTD_buffered_policy_e") misc.bufferedPolicy_of_ZSTD_CCtx_and_bufferedPolicy_of_ZSTD_CCtx_s zbuff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_resetCCtx_usingCDict($arg1, (const ZSTD_CDict_s*)$arg2, (const ZSTD_CCtx_params_s*)$arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_resetCCtx_usingCDict(Ptr<runtime.ZSTD_CCtx_s> cctx, Ptr<runtime.ZSTD_CDict_s> cdict, Ptr<runtime.ZSTD_CCtx_params_s> params, @Unsigned long pledgedSrcSize, @OriginalName(value="ZSTD_buffered_policy_e") misc.bufferedPolicy_of_ZSTD_CCtx_and_bufferedPolicy_of_ZSTD_CCtx_s zbuff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_resetCStream(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs, @Unsigned long pss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_resetSeqStore(Ptr<misc.seqStore_t> ssPtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_reset_compressedBlockState(Ptr<ZSTD_compressedBlockState_t> bs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_reset_matchState($arg1, $arg2, (const struct {\n  unsigned int windowLog;\n  unsigned int chainLog;\n  unsigned int hashLog;\n  unsigned int searchLog;\n  unsigned int minMatch;\n  unsigned int targetLength;\n  strategy_of_ZSTD_compressionParameters strategy;\n}*)$arg3, (const enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s)$arg4, (const ZSTDcrp)$arg5, (const ZSTDirp)$arg6, (const ZSTD_resetTarget_C)$arg7)")
    public static @Unsigned long ZSTD_reset_matchState(Ptr<ZSTD_matchState_t> ms, Ptr<ZSTD_cwksp> ws, Ptr<ZSTD_compressionParameters> cParams, @OriginalName(value="ZSTD_paramSwitch_e") misc.enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s useRowMatchFinder,  @OriginalName(value="ZSTD_compResetPolicy_e") runtime.ZSTDcrp crp,  @OriginalName(value="ZSTD_indexResetPolicy_e") runtime.ZSTDirp forceResetIndex, @OriginalName(value="ZSTD_resetTarget_e") ZSTD_resetTarget_C forWho) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ZSTD_blockCompressor") Ptr<?> ZSTD_selectBlockCompressor(@OriginalName(value="ZSTD_strategy") misc.strategy_of_ZSTD_compressionParameters strat, @OriginalName(value="ZSTD_paramSwitch_e") misc.enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s useRowMatchFinder,  @OriginalName(value="ZSTD_dictMode_e") runtime.ZSTD dictMode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_seqToCodes((const struct {\n  seqDef_s *sequencesStart;\n  seqDef_s *sequences;\n  u8 *litStart;\n  u8 *lit;\n  u8 *llCode;\n  u8 *mlCode;\n  u8 *ofCode;\n  long unsigned int maxNbSeq;\n  long unsigned int maxNbLit;\n  longLengthType_of_seqStore_t longLengthType;\n  unsigned int longLengthPos;\n}*)$arg1)")
    public static void ZSTD_seqToCodes(Ptr<misc.seqStore_t> seqStorePtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_setBasePrices(Ptr<misc.optState_t> optPtr, int optLevel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_sizeof_CCtx((const ZSTD_CCtx_s*)$arg1)")
    public static @Unsigned long ZSTD_sizeof_CCtx(Ptr<runtime.ZSTD_CCtx_s> cctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_sizeof_CDict((const ZSTD_CDict_s*)$arg1)")
    public static @Unsigned long ZSTD_sizeof_CDict(Ptr<runtime.ZSTD_CDict_s> cdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_sizeof_CStream((const ZSTD_CCtx_s*)$arg1)")
    public static @Unsigned long ZSTD_sizeof_CStream(Ptr< @OriginalName(value="ZSTD_CStream") runtime.ZSTD_CCtx_s> zcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_sizeof_matchState((const const struct {\n  unsigned int windowLog;\n  unsigned int chainLog;\n  unsigned int hashLog;\n  unsigned int searchLog;\n  unsigned int minMatch;\n  unsigned int targetLength;\n  strategy_of_ZSTD_compressionParameters strategy;\n}*)$arg1, (const enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s)$arg2, (const unsigned int)$arg3, (const unsigned int)$arg4)")
    public static @Unsigned long ZSTD_sizeof_matchState(Ptr<ZSTD_compressionParameters> cParams, @OriginalName(value="ZSTD_paramSwitch_e") misc.enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s useRowMatchFinder, @Unsigned int enableDedicatedDictSearch, @Unsigned int forCCtx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_toFlushNow(Ptr<runtime.ZSTD_CCtx_s> cctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_updateStats((const struct {\n  unsigned int *litFreq;\n  unsigned int *litLengthFreq;\n  unsigned int *matchLengthFreq;\n  unsigned int *offCodeFreq;\n  struct {\n  unsigned int off;\n  unsigned int len;\n} *matchTable;\n  struct {\n  int price;\n  unsigned int off;\n  unsigned int mlen;\n  unsigned int litlen;\n  unsigned int rep[3];\n} *priceTable;\n  unsigned int litSum;\n  unsigned int litLengthSum;\n  unsigned int matchLengthSum;\n  unsigned int offCodeSum;\n  unsigned int litSumBasePrice;\n  unsigned int litLengthSumBasePrice;\n  unsigned int matchLengthSumBasePrice;\n  unsigned int offCodeSumBasePrice;\n  priceType_of_optState_t priceType;\nconst struct {\n  struct {\n    long unsigned int CTable[257];\n    repeatMode_of_ZSTD_hufCTables_t repeatMode;\n  } huf;\n  struct {\n    unsigned int offcodeCTable[193];\n    unsigned int matchlengthCTable[363];\n    unsigned int litlengthCTable[329];\n    litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode;\n    litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode;\n    litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode;\n  } fse;\n}*;\n  enableLdm_of_ldmParams_t_and_literalCompressionMode_of_ZSTD_CCtx_params_and_literalCompressionMode_of_ZSTD_CCtx_params_s literalCompressionMode;\n}*)$arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void ZSTD_updateStats(Ptr<misc.optState_t> optPtr, @Unsigned int litLength, Ptr<@OriginalName(value="BYTE") Character> literals, @Unsigned int offsetCode, @Unsigned int matchLength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_updateTree($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void ZSTD_updateTree(Ptr<ZSTD_matchState_t> ms, Ptr<@OriginalName(value="BYTE") Character> ip, Ptr<@OriginalName(value="BYTE") Character> iend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_writeFrameHeader($arg1, $arg2, (const ZSTD_CCtx_params_s*)$arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_writeFrameHeader(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<runtime.ZSTD_CCtx_params_s> params, @Unsigned long pledgedSrcSize, @Unsigned int dictID) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ZSTD_writeLastEmptyBlock(Ptr<?> dst, @Unsigned long dstCapacity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_writeSkippableFrame($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static @Unsigned long ZSTD_writeSkippableFrame(Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, @Unsigned int magicVariant) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btlazy2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btlazy2(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btlazy2_dictMatchState($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btlazy2_dictMatchState(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_btlazy2_extDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_btlazy2_extDict(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_greedy($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_greedy(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_greedy_dedicatedDictSearch($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_greedy_dedicatedDictSearch(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_greedy_dedicatedDictSearch_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_greedy_dedicatedDictSearch_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_greedy_dictMatchState($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_greedy_dictMatchState(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_greedy_dictMatchState_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_greedy_dictMatchState_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_greedy_extDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_greedy_extDict(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_greedy_extDict_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_greedy_extDict_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_greedy_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_greedy_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy2($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy2(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy2_dedicatedDictSearch($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy2_dedicatedDictSearch(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy2_dedicatedDictSearch_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy2_dedicatedDictSearch_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy2_dictMatchState($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy2_dictMatchState(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy2_dictMatchState_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy2_dictMatchState_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy2_extDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy2_extDict(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy2_extDict_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy2_extDict_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy2_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy2_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy_dedicatedDictSearch($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy_dedicatedDictSearch(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy_dedicatedDictSearch_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy_dedicatedDictSearch_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy_dictMatchState($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy_dictMatchState(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy_dictMatchState_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy_dictMatchState_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy_extDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy_extDict(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy_extDict_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy_extDict_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_lazy_row($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_lazy_row(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_dedicatedDictSearch_lazy_loadDictionary($arg1, (const const u8*)$arg2)")
    public static void ZSTD_dedicatedDictSearch_lazy_loadDictionary(Ptr<ZSTD_matchState_t> ms, Ptr<@OriginalName(value="BYTE") Character> ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_insertAndFindFirstIndex($arg1, (const u8*)$arg2)")
    public static @Unsigned int ZSTD_insertAndFindFirstIndex(Ptr<ZSTD_matchState_t> ms, Ptr<@OriginalName(value="BYTE") Character> ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_insertDUBT1((const ZSTD_matchState_t*)$arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, (const ZSTD)$arg6)")
    public static void ZSTD_insertDUBT1(Ptr<ZSTD_matchState_t> ms, @Unsigned int curr, Ptr<@OriginalName(value="BYTE") Character> inputEnd, @Unsigned int nbCompares, @Unsigned int btLow,  @OriginalName(value="ZSTD_dictMode_e") runtime.ZSTD dictMode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_row_update((const ZSTD_matchState_t*)$arg1, (const u8*)$arg2)")
    public static void ZSTD_row_update(Ptr<ZSTD_matchState_t> ms, Ptr<@OriginalName(value="BYTE") Character> ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_cctx_init($arg1, (const struct {\n  struct {\n    unsigned int windowLog;\n    unsigned int chainLog;\n    unsigned int hashLog;\n    unsigned int searchLog;\n    unsigned int minMatch;\n    unsigned int targetLength;\n    strategy_of_ZSTD_compressionParameters strategy;\n  } cParams;\n  struct {\n    int contentSizeFlag;\n    int checksumFlag;\n    int noDictIDFlag;\n  } fParams;\n}*)$arg2, $arg3)")
    public static @Unsigned long zstd_cctx_init(Ptr< @OriginalName(value="zstd_cctx") runtime.ZSTD_CCtx_s> cctx, Ptr<@OriginalName(value="zstd_parameters") ZSTD_parameters> parameters, @Unsigned long pledged_src_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_cctx_workspace_bound((const struct {\n  unsigned int windowLog;\n  unsigned int chainLog;\n  unsigned int hashLog;\n  unsigned int searchLog;\n  unsigned int minMatch;\n  unsigned int targetLength;\n  strategy_of_ZSTD_compressionParameters strategy;\n}*)$arg1)")
    public static @Unsigned long zstd_cctx_workspace_bound(Ptr<@OriginalName(value="zstd_compression_parameters") ZSTD_compressionParameters> cparams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_compress_bound(@Unsigned long src_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_compress_cctx($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const struct {\n  struct {\n    unsigned int windowLog;\n    unsigned int chainLog;\n    unsigned int hashLog;\n    unsigned int searchLog;\n    unsigned int minMatch;\n    unsigned int targetLength;\n    strategy_of_ZSTD_compressionParameters strategy;\n  } cParams;\n  struct {\n    int contentSizeFlag;\n    int checksumFlag;\n    int noDictIDFlag;\n  } fParams;\n}*)$arg6)")
    public static @Unsigned long zstd_compress_cctx(Ptr< @OriginalName(value="zstd_cctx") runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dst_capacity, Ptr<?> src, @Unsigned long src_size, Ptr<@OriginalName(value="zstd_parameters") ZSTD_parameters> parameters) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_compress_stream(Ptr< @OriginalName(value="zstd_cstream") runtime.ZSTD_CCtx_s> cstream, Ptr<@OriginalName(value="zstd_out_buffer") ZSTD_outBuffer_s> output, Ptr<@OriginalName(value="zstd_in_buffer") ZSTD_inBuffer_s> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_compress_using_cdict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const ZSTD_CDict_s*)$arg6)")
    public static @Unsigned long zstd_compress_using_cdict(Ptr< @OriginalName(value="zstd_cctx") runtime.ZSTD_CCtx_s> cctx, Ptr<?> dst, @Unsigned long dst_capacity, Ptr<?> src, @Unsigned long src_size, Ptr<runtime.ZSTD_CDict_s> cdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="zstd_cctx") runtime.ZSTD_CCtx_s> zstd_create_cctx_advanced(@OriginalName(value="zstd_custom_mem") ZSTD_customMem custom_mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_create_cdict_byreference((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static @NotUsableInJava Ptr< @OriginalName(value="zstd_cdict") runtime.ZSTD_CDict_s> zstd_create_cdict_byreference(Ptr<?> dict, @Unsigned long dict_size, @OriginalName(value="zstd_compression_parameters") ZSTD_compressionParameters cparams, @OriginalName(value="zstd_custom_mem") ZSTD_customMem custom_mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_cstream_workspace_bound((const struct {\n  unsigned int windowLog;\n  unsigned int chainLog;\n  unsigned int hashLog;\n  unsigned int searchLog;\n  unsigned int minMatch;\n  unsigned int targetLength;\n  strategy_of_ZSTD_compressionParameters strategy;\n}*)$arg1)")
    public static @Unsigned long zstd_cstream_workspace_bound(Ptr<@OriginalName(value="zstd_compression_parameters") ZSTD_compressionParameters> cparams) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zstd_default_clevel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_end_stream(Ptr< @OriginalName(value="zstd_cstream") runtime.ZSTD_CCtx_s> cstream, Ptr<@OriginalName(value="zstd_out_buffer") ZSTD_outBuffer_s> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_flush_stream(Ptr< @OriginalName(value="zstd_cstream") runtime.ZSTD_CCtx_s> cstream, Ptr<@OriginalName(value="zstd_out_buffer") ZSTD_outBuffer_s> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void zstd_free(Ptr<?> strm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_free_cctx(Ptr< @OriginalName(value="zstd_cctx") runtime.ZSTD_CCtx_s> cctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_free_cdict(Ptr< @OriginalName(value="zstd_cdict") runtime.ZSTD_CDict_s> cdict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> zstd_init(Ptr<SquashfsDefinitions.squashfs_sb_info> msblk, Ptr<?> buff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr< @OriginalName(value="zstd_cctx") runtime.ZSTD_CCtx_s> zstd_init_cctx(Ptr<?> workspace2, @Unsigned long workspace_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="zstd_init_cstream((const struct {\n  struct {\n    unsigned int windowLog;\n    unsigned int chainLog;\n    unsigned int hashLog;\n    unsigned int searchLog;\n    unsigned int minMatch;\n    unsigned int targetLength;\n    strategy_of_ZSTD_compressionParameters strategy;\n  } cParams;\n  struct {\n    int contentSizeFlag;\n    int checksumFlag;\n    int noDictIDFlag;\n  } fParams;\n}*)$arg1, $arg2, $arg3, $arg4)")
    public static @NotUsableInJava Ptr< @OriginalName(value="zstd_cstream") runtime.ZSTD_CCtx_s> zstd_init_cstream(Ptr<@OriginalName(value="zstd_parameters") ZSTD_parameters> parameters, @Unsigned long pledged_src_size, Ptr<?> workspace2, @Unsigned long workspace_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zstd_max_clevel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zstd_min_clevel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long zstd_reset_cstream(Ptr< @OriginalName(value="zstd_cstream") runtime.ZSTD_CCtx_s> cstream, @Unsigned long pledged_src_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int zstd_uncompress(Ptr<SquashfsDefinitions.squashfs_sb_info> msblk, Ptr<?> strm, Ptr<runtime.bio> bio2, int offset, int length, Ptr<SquashfsDefinitions.squashfs_page_actor> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_dictMatchState($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_dictMatchState(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_dictMatchState_4_0($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_dictMatchState_4_0(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_dictMatchState_5_0($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_dictMatchState_5_0(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_dictMatchState_6_0($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_dictMatchState_6_0(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_dictMatchState_7_0($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_dictMatchState_7_0(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_extDict($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_extDict(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_extDict_generic($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, (const unsigned int)$arg6, (const unsigned int)$arg7)")
    public static @Unsigned long ZSTD_compressBlock_fast_extDict_generic(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize, @Unsigned int mls, @Unsigned int hasStep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_noDict_4_0($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_noDict_4_0(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_noDict_4_1($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_noDict_4_1(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_noDict_5_0($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_noDict_5_0(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_noDict_5_1($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_noDict_5_1(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_noDict_6_0($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_noDict_6_0(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_noDict_6_1($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_noDict_6_1(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_noDict_7_0($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_noDict_7_0(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressBlock_fast_noDict_7_1($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned long ZSTD_compressBlock_fast_noDict_7_1(Ptr<ZSTD_matchState_t> ms, Ptr<misc.seqStore_t> seqStore, Ptr<@Unsigned Integer> rep, Ptr<?> src, @Unsigned long srcSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressSubBlock_multi((const struct {\n  seqDef_s *sequencesStart;\n  seqDef_s *sequences;\n  u8 *litStart;\n  u8 *lit;\n  u8 *llCode;\n  u8 *mlCode;\n  u8 *ofCode;\n  long unsigned int maxNbSeq;\n  long unsigned int maxNbLit;\n  longLengthType_of_seqStore_t longLengthType;\n  unsigned int longLengthPos;\n}*)$arg1, (const struct {\n  struct {\n    struct {\n      long unsigned int CTable[257];\n      repeatMode_of_ZSTD_hufCTables_t repeatMode;\n    } huf;\n    struct {\n      unsigned int offcodeCTable[193];\n      unsigned int matchlengthCTable[363];\n      unsigned int litlengthCTable[329];\n      litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode;\n      litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode;\n      litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode;\n    } fse;\n  } entropy;\n  unsigned int rep[3];\n}*)$arg2, $arg3, (const struct {\n  struct {\n    hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t hType;\n    u8 hufDesBuffer[128];\n    long unsigned int hufDesSize;\n  } hufMetadata;\n  struct {\n    hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t llType;\n    hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t ofType;\n    hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t mlType;\n    u8 fseTablesBuffer[133];\n    long unsigned int fseTablesSize;\n    long unsigned int lastCountSize;\n  } fseMetadata;\n}*)$arg4, (const ZSTD_CCtx_params_s*)$arg5, $arg6, $arg7, (const void*)$arg8, $arg9, (const int)$arg10, $arg11, $arg12, $arg13)")
    public static @Unsigned long ZSTD_compressSubBlock_multi(Ptr<misc.seqStore_t> seqStorePtr, Ptr<ZSTD_compressedBlockState_t> prevCBlock, Ptr<ZSTD_compressedBlockState_t> nextCBlock, Ptr<ZSTD_entropyCTablesMetadata_t> entropyMetadata, Ptr<runtime.ZSTD_CCtx_params_s> cctxParams, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, int bmi2, @Unsigned int lastBlock, Ptr<?> workspace2, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_compressSuperBlock($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static @Unsigned long ZSTD_compressSuperBlock(Ptr<runtime.ZSTD_CCtx_s> zc, Ptr<?> dst, @Unsigned long dstCapacity, Ptr<?> src, @Unsigned long srcSize, @Unsigned int lastBlock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ZSTD_customCalloc(@Unsigned long size, ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ZSTD_customFree(Ptr<?> ptr, ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ZSTD_customMalloc(@Unsigned long size, ZSTD_customMem customMem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_estimateSubBlockSize_symbolType($arg1, (const u8*)$arg2, $arg3, $arg4, (const unsigned int*)$arg5, (const u8*)$arg6, (const short int*)$arg7, $arg8, $arg9, $arg10, $arg11)")
    public static @Unsigned long ZSTD_estimateSubBlockSize_symbolType(@OriginalName(value="symbolEncodingType_e") misc.hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t type2, Ptr<@OriginalName(value="BYTE") Character> codeTable, @Unsigned int maxCode, @Unsigned long nbSeq, Ptr<@Unsigned @OriginalName(value="FSE_CTable") Integer> fseCTable, Ptr<Character> additionalBits, Ptr<Short> defaultNorm, @Unsigned int defaultNormLog, @Unsigned int defaultMax, Ptr<?> workspace2, @Unsigned long wkspSize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ZSTD_fillHashTable($arg1, (const const void*)$arg2, $arg3)")
    public static void ZSTD_fillHashTable(Ptr<ZSTD_matchState_t> ms, Ptr<?> end, @OriginalName(value="ZSTD_dictTableLoadMethod_e") ZSTD_dtlm_f dtlm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ZSTD_ErrorCode") ZSTD_error ZSTD_getErrorCode(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ZSTD_getErrorName($arg1))")
    public static String ZSTD_getErrorName(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ZSTD_getErrorString($arg1))")
    public static String ZSTD_getErrorString(@OriginalName(value="ZSTD_ErrorCode") ZSTD_error code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ZSTD_isError(@Unsigned long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ZSTD_versionNumber() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ZSTD_versionString())")
    public static String ZSTD_versionString() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { struct { unsigned int offset; unsigned int litLength; unsigned int matchLength; } *seq; long unsigned int pos; long unsigned int posInSequence; long unsigned int size; long unsigned int capacity; } seqStore; unsigned int startPosInBlock; unsigned int endPosInBlock; unsigned int offset; }")
    @NotUsableInJava
    public static class ZSTD_optLdm_t
    extends Struct {
        public misc.rawSeqStore_t seqStore;
        public @Unsigned int startPosInBlock;
        public @Unsigned int endPosInBlock;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int idx; unsigned int posInSequence; long unsigned int posInSrc; }")
    @NotUsableInJava
    public static class ZSTD_sequencePosition
    extends Struct {
        public @Unsigned int idx;
        public @Unsigned int posInSequence;
        public @Unsigned long posInSrc;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int LLtype; unsigned int Offtype; unsigned int MLtype; long unsigned int size; long unsigned int lastCountSize; }")
    @NotUsableInJava
    public static class ZSTD_symbolEncodingTypeStats_t
    extends Struct {
        public @Unsigned int LLtype;
        public @Unsigned int Offtype;
        public @Unsigned int MLtype;
        public @Unsigned long size;
        public @Unsigned long lastCountSize;
    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_resetTarget_C")
    public static enum ZSTD_resetTarget_C implements Enum<ZSTD_resetTarget_C>,
    TypedEnum<ZSTD_resetTarget_C, Integer>
    {
        ZSTD_resetTarget_CDict,
        ZSTD_resetTarget_CCtx;

    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_cpm")
    public static enum ZSTD_cpm implements Enum<ZSTD_cpm>,
    TypedEnum<ZSTD_cpm, Integer>
    {
        ZSTD_cpm_noAttachDict,
        ZSTD_cpm_attachDict,
        ZSTD_cpm_createCDict,
        ZSTD_cpm_unknown;

    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int ingested; long long unsigned int consumed; long long unsigned int produced; long long unsigned int flushed; unsigned int currentJobID; unsigned int nbActiveWorkers; }")
    @NotUsableInJava
    public static class ZSTD_frameProgression
    extends Struct {
        public @Unsigned long ingested;
        public @Unsigned long consumed;
        public @Unsigned long produced;
        public @Unsigned long flushed;
        public @Unsigned int currentJobID;
        public @Unsigned int nbActiveWorkers;
    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_e")
    public static enum ZSTD_e implements Enum<ZSTD_e>,
    TypedEnum<ZSTD_e, Integer>
    {
        ZSTD_e_continue,
        ZSTD_e_flush,
        ZSTD_e_end;

    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_c")
    public static enum ZSTD_c implements Enum<ZSTD_c>,
    TypedEnum<ZSTD_c, Integer>
    {
        ZSTD_c_compressionLevel,
        ZSTD_c_windowLog,
        ZSTD_c_hashLog,
        ZSTD_c_chainLog,
        ZSTD_c_searchLog,
        ZSTD_c_minMatch,
        ZSTD_c_targetLength,
        ZSTD_c_strategy,
        ZSTD_c_enableLongDistanceMatching,
        ZSTD_c_ldmHashLog,
        ZSTD_c_ldmMinMatch,
        ZSTD_c_ldmBucketSizeLog,
        ZSTD_c_ldmHashRateLog,
        ZSTD_c_contentSizeFlag,
        ZSTD_c_checksumFlag,
        ZSTD_c_dictIDFlag,
        ZSTD_c_nbWorkers,
        ZSTD_c_jobSize,
        ZSTD_c_overlapLog,
        ZSTD_c_experimentalParam1,
        ZSTD_c_experimentalParam2,
        ZSTD_c_experimentalParam3,
        ZSTD_c_experimentalParam4,
        ZSTD_c_experimentalParam5,
        ZSTD_c_experimentalParam6,
        ZSTD_c_experimentalParam7,
        ZSTD_c_experimentalParam8,
        ZSTD_c_experimentalParam9,
        ZSTD_c_experimentalParam10,
        ZSTD_c_experimentalParam11,
        ZSTD_c_experimentalParam12,
        ZSTD_c_experimentalParam13,
        ZSTD_c_experimentalParam14,
        ZSTD_c_experimentalParam15;

    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_lo_is")
    public static enum ZSTD_lo_is implements Enum<ZSTD_lo_is>,
    TypedEnum<ZSTD_lo_is, Integer>
    {
        ZSTD_lo_isRegularOffset,
        ZSTD_lo_isLongOffset;

    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int state; const struct { short unsigned int nextState; u8 nbAdditionalBits; u8 nbBits; unsigned int baseValue; }*; }")
    @NotUsableInJava
    public static class ZSTD_fseState
    extends Struct {
        public @Unsigned long state;
        public Ptr<ZSTD_seqSymbol> table;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int fastMode; unsigned int tableLog; }")
    @NotUsableInJava
    public static class ZSTD_seqSymbol_header
    extends Struct {
        public @Unsigned int fastMode;
        public @Unsigned int tableLog;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int compressedSize; long long unsigned int decompressedBound; }")
    @NotUsableInJava
    public static class ZSTD_frameSizeInfo
    extends Struct {
        public @Unsigned long compressedSize;
        public @Unsigned long decompressedBound;
    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_d")
    public static enum ZSTD_d implements Enum<ZSTD_d>,
    TypedEnum<ZSTD_d, Integer>
    {
        ZSTD_d_windowLogMax,
        ZSTD_d_experimentalParam1,
        ZSTD_d_experimentalParam2,
        ZSTD_d_experimentalParam3,
        ZSTD_d_experimentalParam4;

    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_reset")
    public static enum ZSTD_reset implements Enum<ZSTD_reset>,
    TypedEnum<ZSTD_reset, Integer>
    {
        ZSTD_reset_session_only,
        ZSTD_reset_parameters,
        ZSTD_reset_session_and_parameters;

    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int error; int lowerBound; int upperBound; }")
    @NotUsableInJava
    public static class ZSTD_bounds
    extends Struct {
        public @Unsigned long error;
        public int lowerBound;
        public int upperBound;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int f1c; unsigned int f1d; unsigned int f7b; unsigned int f7c; }")
    @NotUsableInJava
    public static class ZSTD_cpuid_t
    extends Struct {
        public @Unsigned int f1c;
        public @Unsigned int f1d;
        public @Unsigned int f7b;
        public @Unsigned int f7c;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { short unsigned int nextState; u8 nbAdditionalBits; u8 nbBits; unsigned int baseValue; } LLTable[513]; struct { short unsigned int nextState; u8 nbAdditionalBits; u8 nbBits; unsigned int baseValue; } OFTable[257]; struct { short unsigned int nextState; u8 nbAdditionalBits; u8 nbBits; unsigned int baseValue; } MLTable[513]; unsigned int hufTable[4097]; unsigned int rep[3]; unsigned int workspace[157]; }")
    @NotUsableInJava
    public static class ZSTD_entropyDTables_t
    extends Struct {
        public ZSTD_seqSymbol @Size(value=513) [] LLTable;
        public ZSTD_seqSymbol @Size(value=257) [] OFTable;
        public ZSTD_seqSymbol @Size(value=513) [] MLTable;
        public @Unsigned @OriginalName(value="HUF_DTable") int @Size(value=4097) [] hufTable;
        public @Unsigned int @Size(value=3) [] rep;
        public @Unsigned int @Size(value=157) [] workspace;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int nextState; u8 nbAdditionalBits; u8 nbBits; unsigned int baseValue; }")
    @NotUsableInJava
    public static class ZSTD_seqSymbol
    extends Struct {
        public @Unsigned short nextState;
        public @OriginalName(value="BYTE") char nbAdditionalBits;
        public @OriginalName(value="BYTE") char nbBits;
        public @Unsigned int baseValue;
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int frameContentSize; long long unsigned int windowSize; unsigned int blockSizeMax; frameType_of_ZSTD_frameHeader frameType; unsigned int headerSize; unsigned int dictID; unsigned int checksumFlag; }")
    @NotUsableInJava
    public static class ZSTD_frameHeader
    extends Struct {
        public @Unsigned long frameContentSize;
        public @Unsigned long windowSize;
        public @Unsigned int blockSizeMax;
        public @OriginalName(value="ZSTD_frameType_e") misc.frameType_of_ZSTD_frameHeader frameType;
        public @Unsigned int headerSize;
        public @Unsigned int dictID;
        public @Unsigned int checksumFlag;
    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_dlm_by")
    public static enum ZSTD_dlm_by implements Enum<ZSTD_dlm_by>,
    TypedEnum<ZSTD_dlm_by, Integer>
    {
        ZSTD_dlm_byCopy,
        ZSTD_dlm_byRef;

    }

    @Type(noCCodeGeneration=true, cType="struct ZSTD_outBuffer_s")
    @NotUsableInJava
    public static class ZSTD_outBuffer_s
    extends Struct {
        public Ptr<?> dst;
        public @Unsigned long size;
        public @Unsigned long pos;
    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_default")
    public static enum ZSTD_default implements Enum<ZSTD_default>,
    TypedEnum<ZSTD_default, Integer>
    {
        ZSTD_defaultDisallowed,
        ZSTD_defaultAllowed;

    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_dtlm_f")
    public static enum ZSTD_dtlm_f implements Enum<ZSTD_dtlm_f>,
    TypedEnum<ZSTD_dtlm_f, Integer>
    {
        ZSTD_dtlm_fast,
        ZSTD_dtlm_full;

    }

    @Type(noCCodeGeneration=true, cType="struct { struct { seqDef_s *sequencesStart; seqDef_s *sequences; u8 *litStart; u8 *lit; u8 *llCode; u8 *mlCode; u8 *ofCode; long unsigned int maxNbSeq; long unsigned int maxNbLit; longLengthType_of_seqStore_t longLengthType; unsigned int longLengthPos; } fullSeqStoreChunk; struct { seqDef_s *sequencesStart; seqDef_s *sequences; u8 *litStart; u8 *lit; u8 *llCode; u8 *mlCode; u8 *ofCode; long unsigned int maxNbSeq; long unsigned int maxNbLit; longLengthType_of_seqStore_t longLengthType; unsigned int longLengthPos; } firstHalfSeqStore; struct { seqDef_s *sequencesStart; seqDef_s *sequences; u8 *litStart; u8 *lit; u8 *llCode; u8 *mlCode; u8 *ofCode; long unsigned int maxNbSeq; long unsigned int maxNbLit; longLengthType_of_seqStore_t longLengthType; unsigned int longLengthPos; } secondHalfSeqStore; struct { seqDef_s *sequencesStart; seqDef_s *sequences; u8 *litStart; u8 *lit; u8 *llCode; u8 *mlCode; u8 *ofCode; long unsigned int maxNbSeq; long unsigned int maxNbLit; longLengthType_of_seqStore_t longLengthType; unsigned int longLengthPos; } currSeqStore; struct { seqDef_s *sequencesStart; seqDef_s *sequences; u8 *litStart; u8 *lit; u8 *llCode; u8 *mlCode; u8 *ofCode; long unsigned int maxNbSeq; long unsigned int maxNbLit; longLengthType_of_seqStore_t longLengthType; unsigned int longLengthPos; } nextSeqStore; unsigned int partitions[196]; struct { struct { hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t hType; u8 hufDesBuffer[128]; long unsigned int hufDesSize; } hufMetadata; struct { hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t llType; hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t ofType; hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t mlType; u8 fseTablesBuffer[133]; long unsigned int fseTablesSize; long unsigned int lastCountSize; } fseMetadata; } entropyMetadata; }")
    @NotUsableInJava
    public static class ZSTD_blockSplitCtx
    extends Struct {
        public misc.seqStore_t fullSeqStoreChunk;
        public misc.seqStore_t firstHalfSeqStore;
        public misc.seqStore_t secondHalfSeqStore;
        public misc.seqStore_t currSeqStore;
        public misc.seqStore_t nextSeqStore;
        public @Unsigned int @Size(value=196) [] partitions;
        public ZSTD_entropyCTablesMetadata_t entropyMetadata;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { struct { struct { long unsigned int CTable[257]; repeatMode_of_ZSTD_hufCTables_t repeatMode; } huf; struct { unsigned int offcodeCTable[193]; unsigned int matchlengthCTable[363]; unsigned int litlengthCTable[329]; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode; } fse; } entropy; unsigned int rep[3]; } *prevCBlock; struct { struct { struct { long unsigned int CTable[257]; repeatMode_of_ZSTD_hufCTables_t repeatMode; } huf; struct { unsigned int offcodeCTable[193]; unsigned int matchlengthCTable[363]; unsigned int litlengthCTable[329]; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode; } fse; } entropy; unsigned int rep[3]; } *nextCBlock; ZSTD_matchState_t matchState; }")
    @NotUsableInJava
    public static class ZSTD_blockState_t
    extends Struct {
        public Ptr<ZSTD_compressedBlockState_t> prevCBlock;
        public Ptr<ZSTD_compressedBlockState_t> nextCBlock;
        public ZSTD_matchState_t matchState;
    }

    @Type(noCCodeGeneration=true, cType="struct ZSTD_matchState_t")
    @NotUsableInJava
    public static class ZSTD_matchState_t
    extends Struct {
        public ZSTD_window_t window;
        public @Unsigned int loadedDictEnd;
        public @Unsigned int nextToUpdate;
        public @Unsigned int hashLog3;
        public @Unsigned int rowHashLog;
        public Ptr<@Unsigned Short> tagTable;
        public @Unsigned int @Size(value=8) [] hashCache;
        public Ptr<@Unsigned Integer> hashTable;
        public Ptr<@Unsigned Integer> hashTable3;
        public Ptr<@Unsigned Integer> chainTable;
        public @Unsigned int forceNonContiguous;
        public int dedicatedDictSearch;
        public misc.optState_t opt;
        public Ptr<ZSTD_matchState_t> dictMatchState;
        public ZSTD_compressionParameters cParams;
        public Ptr<misc.rawSeqStore_t> ldmSeqStore;
    }

    @Type(noCCodeGeneration=true, cType="struct { const u8*; const u8*; const u8*; unsigned int dictLimit; unsigned int lowLimit; unsigned int nbOverflowCorrections; }")
    @NotUsableInJava
    public static class ZSTD_window_t
    extends Struct {
        public Ptr<@OriginalName(value="BYTE") Character> nextSrc;
        public Ptr<@OriginalName(value="BYTE") Character> base;
        public Ptr<@OriginalName(value="BYTE") Character> dictBase;
        public @Unsigned int dictLimit;
        public @Unsigned int lowLimit;
        public @Unsigned int nbOverflowCorrections;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { struct { long unsigned int CTable[257]; repeatMode_of_ZSTD_hufCTables_t repeatMode; } huf; struct { unsigned int offcodeCTable[193]; unsigned int matchlengthCTable[363]; unsigned int litlengthCTable[329]; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode; } fse; } entropy; unsigned int rep[3]; }")
    @NotUsableInJava
    public static class ZSTD_compressedBlockState_t
    extends Struct {
        public ZSTD_entropyCTables_t entropy;
        public @Unsigned int @Size(value=3) [] rep;
    }

    @Type(noCCodeGeneration=true, cType="struct { int price; unsigned int off; unsigned int mlen; unsigned int litlen; unsigned int rep[3]; }")
    @NotUsableInJava
    public static class ZSTD_optimal_t
    extends Struct {
        public int price;
        public @Unsigned int off;
        public @Unsigned int mlen;
        public @Unsigned int litlen;
        public @Unsigned int @Size(value=3) [] rep;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int off; unsigned int len; }")
    @NotUsableInJava
    public static class ZSTD_match_t
    extends Struct {
        public @Unsigned int off;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t hType; u8 hufDesBuffer[128]; long unsigned int hufDesSize; } hufMetadata; struct { hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t llType; hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t ofType; hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t mlType; u8 fseTablesBuffer[133]; long unsigned int fseTablesSize; long unsigned int lastCountSize; } fseMetadata; }")
    @NotUsableInJava
    public static class ZSTD_entropyCTablesMetadata_t
    extends Struct {
        public ZSTD_hufCTablesMetadata_t hufMetadata;
        public ZSTD_fseCTablesMetadata_t fseMetadata;
    }

    @Type(noCCodeGeneration=true, cType="struct { hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t llType; hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t ofType; hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t mlType; u8 fseTablesBuffer[133]; long unsigned int fseTablesSize; long unsigned int lastCountSize; }")
    @NotUsableInJava
    public static class ZSTD_fseCTablesMetadata_t
    extends Struct {
        public @OriginalName(value="symbolEncodingType_e") misc.hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t llType;
        public @OriginalName(value="symbolEncodingType_e") misc.hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t ofType;
        public @OriginalName(value="symbolEncodingType_e") misc.hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t mlType;
        public @OriginalName(value="BYTE") char @Size(value=133) [] fseTablesBuffer;
        public @Unsigned long fseTablesSize;
        public @Unsigned long lastCountSize;
    }

    @Type(noCCodeGeneration=true, cType="struct { hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t hType; u8 hufDesBuffer[128]; long unsigned int hufDesSize; }")
    @NotUsableInJava
    public static class ZSTD_hufCTablesMetadata_t
    extends Struct {
        public @OriginalName(value="symbolEncodingType_e") misc.hType_of_ZSTD_hufCTablesMetadata_t_and_llType_of_ZSTD_fseCTablesMetadata_t_and_mlType_of_ZSTD_fseCTablesMetadata_t hType;
        public @OriginalName(value="BYTE") char @Size(value=128) [] hufDesBuffer;
        public @Unsigned long hufDesSize;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { long unsigned int CTable[257]; repeatMode_of_ZSTD_hufCTables_t repeatMode; } huf; struct { unsigned int offcodeCTable[193]; unsigned int matchlengthCTable[363]; unsigned int litlengthCTable[329]; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode; } fse; }")
    @NotUsableInJava
    public static class ZSTD_entropyCTables_t
    extends Struct {
        public ZSTD_hufCTables_t huf;
        public ZSTD_fseCTables_t fse;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int offcodeCTable[193]; unsigned int matchlengthCTable[363]; unsigned int litlengthCTable[329]; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode; litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode; }")
    @NotUsableInJava
    public static class ZSTD_fseCTables_t
    extends Struct {
        public @Unsigned @OriginalName(value="FSE_CTable") int @Size(value=193) [] offcodeCTable;
        public @Unsigned @OriginalName(value="FSE_CTable") int @Size(value=363) [] matchlengthCTable;
        public @Unsigned @OriginalName(value="FSE_CTable") int @Size(value=329) [] litlengthCTable;
        public @OriginalName(value="FSE_repeat") misc.litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t offcode_repeatMode;
        public @OriginalName(value="FSE_repeat") misc.litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t matchlength_repeatMode;
        public @OriginalName(value="FSE_repeat") misc.litlength_repeatMode_of_ZSTD_fseCTables_t_and_matchlength_repeatMode_of_ZSTD_fseCTables_t_and_offcode_repeatMode_of_ZSTD_fseCTables_t litlength_repeatMode;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int CTable[257]; repeatMode_of_ZSTD_hufCTables_t repeatMode; }")
    @NotUsableInJava
    public static class ZSTD_hufCTables_t
    extends Struct {
        public @Unsigned @OriginalName(value="HUF_CElt") long @Size(value=257) [] CTable;
        public @OriginalName(value="HUF_repeat") misc.repeatMode_of_ZSTD_hufCTables_t repeatMode;
    }

    @Type(noCCodeGeneration=true, cType="struct { void *dictBuffer; const void*; long unsigned int dictSize; dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType; ZSTD_CDict_s *cdict; }")
    @NotUsableInJava
    public static class ZSTD_localDict
    extends Struct {
        public Ptr<?> dictBuffer;
        public Ptr<?> dict;
        public @Unsigned long dictSize;
        public @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType;
        public Ptr<runtime.ZSTD_CDict_s> cdict;
    }

    @Type(noCCodeGeneration=true, cType="struct ZSTD_prefixDict_s")
    @NotUsableInJava
    public static class ZSTD_prefixDict_s
    extends Struct {
        public Ptr<?> dict;
        public @Unsigned long dictSize;
        public @OriginalName(value="ZSTD_dictContentType_e") misc.dictContentType_of_ZSTD_CDict_and_dictContentType_of_ZSTD_CDict_s_and_dictContentType_of_ZSTD_localDict dictContentType;
    }

    @Type(noCCodeGeneration=true, cType="struct { void *workspace; void *workspaceEnd; void *objectEnd; void *tableEnd; void *tableValidEnd; void *allocStart; u8 allocFailed; int workspaceOversizedDuration; phase_of_ZSTD_cwksp phase; isStatic_of_ZSTD_cwksp isStatic; }")
    @NotUsableInJava
    public static class ZSTD_cwksp
    extends Struct {
        public Ptr<?> workspace;
        public Ptr<?> workspaceEnd;
        public Ptr<?> objectEnd;
        public Ptr<?> tableEnd;
        public Ptr<?> tableValidEnd;
        public Ptr<?> allocStart;
        public @OriginalName(value="BYTE") char allocFailed;
        public int workspaceOversizedDuration;
        public @OriginalName(value="ZSTD_cwksp_alloc_phase_e") misc.phase_of_ZSTD_cwksp phase;
        public @OriginalName(value="ZSTD_cwksp_static_alloc_e") misc.isStatic_of_ZSTD_cwksp isStatic;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int litLength; unsigned int matchLength; }")
    @NotUsableInJava
    public static class ZSTD_sequenceLength
    extends Struct {
        public @Unsigned int litLength;
        public @Unsigned int matchLength;
    }

    @Type(noCCodeGeneration=true, cType="struct ZSTD_inBuffer_s")
    @NotUsableInJava
    public static class ZSTD_inBuffer_s
    extends Struct {
        public Ptr<?> src;
        public @Unsigned long size;
        public @Unsigned long pos;
    }

    @Type(noCCodeGeneration=true, cType="enum ZSTD_error")
    public static enum ZSTD_error implements Enum<ZSTD_error>,
    TypedEnum<ZSTD_error, Integer>
    {
        ZSTD_error_no_error,
        ZSTD_error_GENERIC,
        ZSTD_error_prefix_unknown,
        ZSTD_error_version_unsupported,
        ZSTD_error_frameParameter_unsupported,
        ZSTD_error_frameParameter_windowTooLarge,
        ZSTD_error_corruption_detected,
        ZSTD_error_checksum_wrong,
        ZSTD_error_dictionary_corrupted,
        ZSTD_error_dictionary_wrong,
        ZSTD_error_dictionaryCreation_failed,
        ZSTD_error_parameter_unsupported,
        ZSTD_error_parameter_outOfBound,
        ZSTD_error_tableLog_tooLarge,
        ZSTD_error_maxSymbolValue_tooLarge,
        ZSTD_error_maxSymbolValue_tooSmall,
        ZSTD_error_stage_wrong,
        ZSTD_error_init_missing,
        ZSTD_error_memory_allocation,
        ZSTD_error_workSpace_tooSmall,
        ZSTD_error_dstSize_tooSmall,
        ZSTD_error_srcSize_wrong,
        ZSTD_error_dstBuffer_null,
        ZSTD_error_frameIndex_tooLarge,
        ZSTD_error_seekableIO,
        ZSTD_error_dstBuffer_wrong,
        ZSTD_error_srcBuffer_wrong,
        ZSTD_error_maxCode;

    }

    @Type(noCCodeGeneration=true, cType="struct { void* (*customAlloc)(void*, long unsigned int); void (*customFree)(void*, void*); void *opaque; }")
    @NotUsableInJava
    public static class ZSTD_customMem
    extends Struct {
        public @OriginalName(value="ZSTD_allocFunction") Ptr<?> customAlloc;
        public @OriginalName(value="ZSTD_freeFunction") Ptr<?> customFree;
        public Ptr<?> opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { unsigned int windowLog; unsigned int chainLog; unsigned int hashLog; unsigned int searchLog; unsigned int minMatch; unsigned int targetLength; strategy_of_ZSTD_compressionParameters strategy; } cParams; struct { int contentSizeFlag; int checksumFlag; int noDictIDFlag; } fParams; }")
    @NotUsableInJava
    public static class ZSTD_parameters
    extends Struct {
        public ZSTD_compressionParameters cParams;
        public ZSTD_frameParameters fParams;
    }

    @Type(noCCodeGeneration=true, cType="struct { int contentSizeFlag; int checksumFlag; int noDictIDFlag; }")
    @NotUsableInJava
    public static class ZSTD_frameParameters
    extends Struct {
        public int contentSizeFlag;
        public int checksumFlag;
        public int noDictIDFlag;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int windowLog; unsigned int chainLog; unsigned int hashLog; unsigned int searchLog; unsigned int minMatch; unsigned int targetLength; strategy_of_ZSTD_compressionParameters strategy; }")
    @NotUsableInJava
    public static class ZSTD_compressionParameters
    extends Struct {
        public @Unsigned int windowLog;
        public @Unsigned int chainLog;
        public @Unsigned int hashLog;
        public @Unsigned int searchLog;
        public @Unsigned int minMatch;
        public @Unsigned int targetLength;
        public @OriginalName(value="ZSTD_strategy") misc.strategy_of_ZSTD_compressionParameters strategy;
    }
}

