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
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.SysDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class LegacyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void legacy_pic_int_noop(int unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int legacy_pic_irq_pending_noop(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void legacy_pic_noop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void legacy_pic_pcat_compat() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int legacy_pic_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void legacy_pic_uint_noop(@Unsigned int unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int legacy_fs_context_dup(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_context> src_fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void legacy_fs_context_free(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int legacy_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int legacy_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int legacy_parse_monolithic(Ptr<FsDefinitions.fs_context> fc, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int legacy_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int legacy_pm_power_off(Ptr<SysDefinitions.sys_off_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void legacy_pty_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int legacy_reconfigure(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct _legacy_mbr")
    @NotUsableInJava
    public static class _legacy_mbr
    extends Struct {
        public char @Size(value=440) [] boot_code;
        public @Unsigned @OriginalName(value="__le32") int unique_mbr_signature;
        public @Unsigned @OriginalName(value="__le16") short unknown;
        public @OriginalName(value="gpt_mbr_record") misc._gpt_mbr_record @Size(value=4) [] partition_record;
        public @Unsigned @OriginalName(value="__le16") short signature;
    }

    @Type(noCCodeGeneration=true, cType="struct legacy_fs_context")
    @NotUsableInJava
    public static class legacy_fs_context
    extends Struct {
        public String legacy_data;
        public @Unsigned long data_size;
        public legacy_fs_param param_type;
    }

    @Type(noCCodeGeneration=true, cType="enum legacy_fs_param")
    public static enum legacy_fs_param implements Enum<legacy_fs_param>,
    TypedEnum<legacy_fs_param, Integer>
    {
        LEGACY_FS_UNSET_PARAMS,
        LEGACY_FS_MONOLITHIC_PARAMS,
        LEGACY_FS_INDIVIDUAL_PARAMS;

    }

    @Type(noCCodeGeneration=true, cType="struct legacy_pic")
    @NotUsableInJava
    public static class legacy_pic
    extends Struct {
        public int nr_legacy_irqs;
        public Ptr<IrqDefinitions.irq_chip> chip;
        public Ptr<?> mask;
        public Ptr<?> unmask;
        public Ptr<?> mask_all;
        public Ptr<?> restore_mask;
        public Ptr<?> init;
        public Ptr<?> probe;
        public Ptr<?> irq_pending;
        public Ptr<?> make_irq;
    }
}

