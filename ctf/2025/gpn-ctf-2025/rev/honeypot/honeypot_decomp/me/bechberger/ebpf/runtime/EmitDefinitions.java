/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class EmitDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int emit_atomic(Ptr<Ptr<Character>> pprog, char atomic_op, @Unsigned int dst_reg, @Unsigned int src_reg, short off, char bpf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int emit_bpf_dispatcher(Ptr<Ptr<Character>> pprog, int a, int b, Ptr<Long> progs, Ptr<Character> image, Ptr<Character> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_bpf_tail_call_direct(Ptr<BpfDefinitions.bpf_prog> bpf_prog2, Ptr<BpfDefinitions.bpf_jit_poke_descriptor> poke, Ptr<Ptr<Character>> pprog, Ptr<Character> ip, Ptr<@OriginalName(value="bool") Boolean> callee_regs_used, @Unsigned int stack_depth, Ptr<misc.jit_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_bpf_tail_call_indirect(Ptr<BpfDefinitions.bpf_prog> bpf_prog2, Ptr<Ptr<Character>> pprog, Ptr<@OriginalName(value="bool") Boolean> callee_regs_used, @Unsigned int stack_depth, Ptr<Character> ip, Ptr<misc.jit_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_cfi(Ptr<Ptr<Character>> pprog, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_indirect_jump(Ptr<Ptr<Character>> pprog, int reg, Ptr<Character> ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_insn_suffix(Ptr<Ptr<Character>> pprog, @Unsigned int ptr_reg, @Unsigned int val_reg, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_ldx(Ptr<Ptr<Character>> pprog, @Unsigned int size, @Unsigned int dst_reg, @Unsigned int src_reg, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="emit_mov_imm32($arg1, $arg2, $arg3, (const unsigned int)$arg4)")
    public static void emit_mov_imm32(Ptr<Ptr<Character>> pprog, boolean sign_propagate, @Unsigned int dst_reg, @Unsigned int imm32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="emit_mov_imm64($arg1, $arg2, (const unsigned int)$arg3, (const unsigned int)$arg4)")
    public static void emit_mov_imm64(Ptr<Ptr<Character>> pprog, @Unsigned int dst_reg, @Unsigned int imm32_hi, @Unsigned int imm32_lo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_mov_reg(Ptr<Ptr<Character>> pprog, boolean is64, @Unsigned int dst_reg, @Unsigned int src_reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_movsx_reg(Ptr<Ptr<Character>> pprog, int num_bits, boolean is64, @Unsigned int dst_reg, @Unsigned int src_reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_prologue(Ptr<Ptr<Character>> pprog, @Unsigned int stack_depth, boolean ebpf_from_cbpf, boolean tail_call_reachable, boolean is_subprog, boolean is_exception_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_return(Ptr<Ptr<Character>> pprog, Ptr<Character> ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void emit_stx(Ptr<Ptr<Character>> pprog, @Unsigned int size, @Unsigned int dst_reg, @Unsigned int src_reg, int off) {
        throw new MethodIsBPFRelatedFunction();
    }
}

