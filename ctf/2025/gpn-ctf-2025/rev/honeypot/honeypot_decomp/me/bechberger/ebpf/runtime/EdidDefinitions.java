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
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class EdidDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edid_checksum(String edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edid_is_ascii_block(String block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edid_is_monitor_block(String block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edid_is_serial_block(String block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edid_is_timing_block(String block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edid_block_check((const void*)$arg1, $arg2)")
    public static edid_block_status edid_block_check(Ptr<?> _block, boolean is_base_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edid_block_dump((const u8*)$arg1, (const void*)$arg2, $arg3)")
    public static void edid_block_dump(String level, Ptr<?> block, int block_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static edid_block_status edid_block_read(Ptr<?> block, @Unsigned int block_num, Ptr<?> read_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edid_block_status_print($arg1, (const struct edid*)$arg2, $arg3)")
    public static void edid_block_status_print(edid_block_status status, Ptr<runtime.edid> block, int block_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.edid> edid_filter_invalid_blocks(Ptr<runtime.edid> edid2, Ptr<@Unsigned Long> alloc_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edid_header_fix(Ptr<?> edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edid_hfeeodb_extension_block_count((const struct edid*)$arg1)")
    public static int edid_hfeeodb_extension_block_count(Ptr<runtime.edid> edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edid_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edid_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long edid_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum edid_block_status")
    public static enum edid_block_status implements Enum<edid_block_status>,
    TypedEnum<edid_block_status, Integer>
    {
        EDID_BLOCK_OK,
        EDID_BLOCK_READ_FAIL,
        EDID_BLOCK_NULL,
        EDID_BLOCK_ZERO,
        EDID_BLOCK_HEADER_CORRUPT,
        EDID_BLOCK_HEADER_REPAIR,
        EDID_BLOCK_HEADER_FIXED,
        EDID_BLOCK_CHECKSUM,
        EDID_BLOCK_VERSION;

    }

    @Type(noCCodeGeneration=true, cType="struct edid_quirk")
    @NotUsableInJava
    public static class edid_quirk
    extends Struct {
        public DrmDefinitions.drm_edid_ident ident;
        public @Unsigned int quirks;
    }

    @Type(noCCodeGeneration=true, cType="struct edid_info")
    @NotUsableInJava
    public static class edid_info
    extends Struct {
        public char @Size(value=128) [] dummy;
    }
}

