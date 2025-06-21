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
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TdxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __tdx_hypercall(Ptr<tdx_module_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tdx_hypercall_failed() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long _tdx_hypercall(@Unsigned long fn, @Unsigned long r12, @Unsigned long r13, @Unsigned long r14, @Unsigned long r15) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tdx_accept_memory(@Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tdx_cache_flush_required() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tdx_early_handle_ve(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tdx_early_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tdx_enc_status_change_finish(@Unsigned long vaddr, int numpages, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tdx_enc_status_change_prepare(@Unsigned long vaddr, int numpages, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tdx_enc_status_changed(@Unsigned long vaddr, int numpages, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tdx_get_ve_info(Ptr<misc.ve_info> ve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tdx_handle_virt_exception(Ptr<PtDefinitions.pt_regs> regs, Ptr<misc.ve_info> ve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tdx_hcall_get_quote(Ptr<Character> buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tdx_kexec_begin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tdx_kexec_finish() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long tdx_kvm_hypercall(@Unsigned int nr, @Unsigned long p1, @Unsigned long p2, @Unsigned long p3, @Unsigned long p4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tdx_map_gpa(@Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long end, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tdx_mcall_get_report0(Ptr<Character> reportdata, Ptr<Character> tdreport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tdx_panic((const u8*)$arg1)")
    public static void tdx_panic(String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tdx_safe_halt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tdx_setup(Ptr<@Unsigned Long> cc_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tdx_tlb_flush_required(boolean _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tdx_module_args")
    @NotUsableInJava
    public static class tdx_module_args
    extends Struct {
        public @Unsigned long rcx;
        public @Unsigned long rdx;
        public @Unsigned long r8;
        public @Unsigned long r9;
        public @Unsigned long r10;
        public @Unsigned long r11;
        public @Unsigned long r12;
        public @Unsigned long r13;
        public @Unsigned long r14;
        public @Unsigned long r15;
        public @Unsigned long rbx;
        public @Unsigned long rdi;
        public @Unsigned long rsi;
    }
}

