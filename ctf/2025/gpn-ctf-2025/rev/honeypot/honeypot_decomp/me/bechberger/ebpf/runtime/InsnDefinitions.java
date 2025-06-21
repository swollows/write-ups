/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class InsnDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean insn_decode_from_regs(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs, String buf, int buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static insn_mmio_type insn_decode_mmio(Ptr<runtime.insn> insn2, Ptr<Integer> bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_fetch_from_user(Ptr<PtDefinitions.pt_regs> regs, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_fetch_from_user_inatomic(Ptr<PtDefinitions.pt_regs> regs, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> insn_get_addr_ref(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_code_seg_params(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_effective_ip(Ptr<PtDefinitions.pt_regs> regs, Ptr<@Unsigned Long> ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_modrm_reg_off(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> insn_get_modrm_reg_ptr(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_modrm_rm_off(Ptr<runtime.insn> insn2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long insn_get_seg_base(Ptr<PtDefinitions.pt_regs> regs, int seg_reg_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean insn_has_rep_prefix(Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="insn_def_regno((const struct bpf_insn*)$arg1)")
    public static int insn_def_regno(Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="insn_decode($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int insn_decode(Ptr<runtime.insn> insn2, Ptr<?> kaddr, int buf_len, insn_mode m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_displacement(Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_immediate(Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_length(Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_modrm(Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_opcode(Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_prefixes(Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_get_sib(Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="insn_init($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static void insn_init(Ptr<runtime.insn> insn2, Ptr<?> kaddr, int buf_len, int x86_64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int insn_rip_relative(Ptr<runtime.insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum insn_type")
    public static enum insn_type implements Enum<insn_type>,
    TypedEnum<insn_type, Integer>
    {
        CALL,
        NOP,
        JMP,
        RET,
        JCC;

    }

    @Type(noCCodeGeneration=true, cType="enum insn_mmio_type")
    public static enum insn_mmio_type implements Enum<insn_mmio_type>,
    TypedEnum<insn_mmio_type, Integer>
    {
        INSN_MMIO_DECODE_FAILED,
        INSN_MMIO_WRITE,
        INSN_MMIO_WRITE_IMM,
        INSN_MMIO_READ,
        INSN_MMIO_READ_ZERO_EXTEND,
        INSN_MMIO_READ_SIGN_EXTEND,
        INSN_MMIO_MOVS;

    }

    @Type(noCCodeGeneration=true, cType="enum insn_mode")
    public static enum insn_mode implements Enum<insn_mode>,
    TypedEnum<insn_mode, Integer>
    {
        INSN_MODE_32,
        INSN_MODE_64,
        INSN_MODE_KERN,
        INSN_NUM_MODES;

    }

    @Type(noCCodeGeneration=true, cType="struct insn_field")
    @NotUsableInJava
    public static class insn_field
    extends Struct {
        @InlineUnion(value=2753)
        public @InlineUnion(value=2753) @OriginalName(value="insn_value_t") int value;
        @InlineUnion(value=2753)
        public @InlineUnion(value=2753) @OriginalName(value="insn_byte_t") char @Size(value=4) [] bytes;
        public char got;
        public char nbytes;
    }
}

