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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class TextDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__text_poke($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static Ptr<?> __text_poke(Ptr<?> func, Ptr<?> addr2, Ptr<?> src, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<?> text_poke(Ptr<?> addr2, Ptr<?> opcode, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke_bp($arg1, (const void*)$arg2, $arg3, (const void*)$arg4)")
    public static void text_poke_bp(Ptr<?> addr2, Ptr<?> opcode, @Unsigned long len, Ptr<?> emulate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void text_poke_bp_batch(Ptr<text_poke_loc> tp, @Unsigned int nr_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke_copy($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<?> text_poke_copy(Ptr<?> addr2, Ptr<?> opcode, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke_copy_locked($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static Ptr<?> text_poke_copy_locked(Ptr<?> addr2, Ptr<?> opcode, @Unsigned long len, boolean core_ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke_early($arg1, (const void*)$arg2, $arg3)")
    public static void text_poke_early(Ptr<?> addr2, Ptr<?> opcode, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void text_poke_finish() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void text_poke_flush(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke_kgdb($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<?> text_poke_kgdb(Ptr<?> addr2, Ptr<?> opcode, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke_loc_init($arg1, $arg2, (const void*)$arg3, $arg4, (const void*)$arg5)")
    public static void text_poke_loc_init(Ptr<text_poke_loc> tp, Ptr<?> addr2, Ptr<?> opcode, @Unsigned long len, Ptr<?> emulate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke_memcpy($arg1, (const void*)$arg2, $arg3)")
    public static void text_poke_memcpy(Ptr<?> dst, Ptr<?> src, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke_memset($arg1, (const void*)$arg2, $arg3)")
    public static void text_poke_memset(Ptr<?> dst, Ptr<?> src, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="text_poke_queue($arg1, (const void*)$arg2, $arg3, (const void*)$arg4)")
    public static void text_poke_queue(Ptr<?> addr2, Ptr<?> opcode, @Unsigned long len, Ptr<?> emulate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> text_poke_set(Ptr<?> addr2, int c, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void text_poke_sync() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct text_poke_loc")
    @NotUsableInJava
    public static class text_poke_loc
    extends Struct {
        public int rel_addr;
        public int disp;
        public char len;
        public char opcode;
        public char @Size(value=5) [] text;
        public char old;
    }

    @Type(noCCodeGeneration=true, cType="union text_poke_insn")
    @NotUsableInJava
    public static class text_poke_insn
    extends Union {
        public char @Size(value=5) [] text;
        public AnonDefinitions.anon_member_of_text_poke_insn anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int font_height; short unsigned int cursor_x; short unsigned int cursor_y; short unsigned int rows; short unsigned int columns; }")
    @NotUsableInJava
    public static class text_mode_3_of_u_of_dom0_vga_console_info
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short font_height;
        public @Unsigned @OriginalName(value="uint16_t") short cursor_x;
        public @Unsigned @OriginalName(value="uint16_t") short cursor_y;
        public @Unsigned @OriginalName(value="uint16_t") short rows;
        public @Unsigned @OriginalName(value="uint16_t") short columns;
    }
}

