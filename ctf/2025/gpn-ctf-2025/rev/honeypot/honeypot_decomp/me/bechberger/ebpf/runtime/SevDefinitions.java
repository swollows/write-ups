/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sev_cpuid_hv(@Unsigned int fn, int reg_idx, Ptr<@Unsigned Integer> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sev_cpuid_hv_ghcb(Ptr<runtime.ghcb> ghcb2, Ptr<misc.es_em_ctxt> ctxt, Ptr<misc.cpuid_leaf> leaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __sev_cpuid_hv_msr(Ptr<misc.cpuid_leaf> leaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sev_es_ist_enter(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sev_es_ist_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sev_es_nmi_complete() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.ghcb> __sev_get_ghcb(Ptr<misc.ghcb_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __sev_put_ghcb(Ptr<misc.ghcb_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sev_es_efi_map_ghcbs(Ptr<misc.pgd_t> pgd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result sev_es_ghcb_hv_call(Ptr<runtime.ghcb> ghcb2, Ptr<misc.es_em_ctxt> ctxt, @Unsigned long exit_code, @Unsigned long exit_info_1, @Unsigned long exit_info_2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sev_es_init_vc_handling() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sev_es_play_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sev_es_setup_ap_jump_table(Ptr<misc.real_mode_header> rmh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sev_es_terminate(@Unsigned int set, @Unsigned int reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sev_show_status() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sev_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sev_verify_cbit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sev_config")
    @NotUsableInJava
    public static class sev_config
    extends Struct {
        public @Unsigned long debug;
        public @Unsigned long ghcbs_initialized;
        public @Unsigned long use_cas;
        public @Unsigned long __reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct sev_es_runtime_data")
    @NotUsableInJava
    public static class sev_es_runtime_data
    extends Struct {
        public runtime.ghcb ghcb_page;
        public runtime.ghcb backup_ghcb;
        public boolean ghcb_active;
        public boolean backup_ghcb_active;
        public @Unsigned long dr7;
    }

    @Type(noCCodeGeneration=true, cType="struct sev_es_save_area")
    @NotUsableInJava
    public static class sev_es_save_area
    extends Struct {
        public misc.vmcb_seg es;
        public misc.vmcb_seg cs;
        public misc.vmcb_seg ss;
        public misc.vmcb_seg ds;
        public misc.vmcb_seg fs;
        public misc.vmcb_seg gs;
        public misc.vmcb_seg gdtr;
        public misc.vmcb_seg ldtr;
        public misc.vmcb_seg idtr;
        public misc.vmcb_seg tr;
        public @Unsigned long pl0_ssp;
        public @Unsigned long pl1_ssp;
        public @Unsigned long pl2_ssp;
        public @Unsigned long pl3_ssp;
        public @Unsigned long u_cet;
        public char @Size(value=2) [] reserved_0xc8;
        public char vmpl;
        public char cpl;
        public char @Size(value=4) [] reserved_0xcc;
        public @Unsigned long efer;
        public char @Size(value=104) [] reserved_0xd8;
        public @Unsigned long xss;
        public @Unsigned long cr4;
        public @Unsigned long cr3;
        public @Unsigned long cr0;
        public @Unsigned long dr7;
        public @Unsigned long dr6;
        public @Unsigned long rflags;
        public @Unsigned long rip;
        public @Unsigned long dr0;
        public @Unsigned long dr1;
        public @Unsigned long dr2;
        public @Unsigned long dr3;
        public @Unsigned long dr0_addr_mask;
        public @Unsigned long dr1_addr_mask;
        public @Unsigned long dr2_addr_mask;
        public @Unsigned long dr3_addr_mask;
        public char @Size(value=24) [] reserved_0x1c0;
        public @Unsigned long rsp;
        public @Unsigned long s_cet;
        public @Unsigned long ssp;
        public @Unsigned long isst_addr;
        public @Unsigned long rax;
        public @Unsigned long star;
        public @Unsigned long lstar;
        public @Unsigned long cstar;
        public @Unsigned long sfmask;
        public @Unsigned long kernel_gs_base;
        public @Unsigned long sysenter_cs;
        public @Unsigned long sysenter_esp;
        public @Unsigned long sysenter_eip;
        public @Unsigned long cr2;
        public char @Size(value=32) [] reserved_0x248;
        public @Unsigned long g_pat;
        public @Unsigned long dbgctl;
        public @Unsigned long br_from;
        public @Unsigned long br_to;
        public @Unsigned long last_excp_from;
        public @Unsigned long last_excp_to;
        public char @Size(value=80) [] reserved_0x298;
        public @Unsigned int pkru;
        public @Unsigned int tsc_aux;
        public char @Size(value=24) [] reserved_0x2f0;
        public @Unsigned long rcx;
        public @Unsigned long rdx;
        public @Unsigned long rbx;
        public @Unsigned long reserved_0x320;
        public @Unsigned long rbp;
        public @Unsigned long rsi;
        public @Unsigned long rdi;
        public @Unsigned long r8;
        public @Unsigned long r9;
        public @Unsigned long r10;
        public @Unsigned long r11;
        public @Unsigned long r12;
        public @Unsigned long r13;
        public @Unsigned long r14;
        public @Unsigned long r15;
        public char @Size(value=16) [] reserved_0x380;
        public @Unsigned long guest_exit_info_1;
        public @Unsigned long guest_exit_info_2;
        public @Unsigned long guest_exit_int_info;
        public @Unsigned long guest_nrip;
        public @Unsigned long sev_features;
        public @Unsigned long vintr_ctrl;
        public @Unsigned long guest_exit_code;
        public @Unsigned long virtual_tom;
        public @Unsigned long tlb_id;
        public @Unsigned long pcpu_id;
        public @Unsigned long event_inj;
        public @Unsigned long xcr0;
        public char @Size(value=16) [] reserved_0x3f0;
        public @Unsigned long x87_dp;
        public @Unsigned int mxcsr;
        public @Unsigned short x87_ftw;
        public @Unsigned short x87_fsw;
        public @Unsigned short x87_fcw;
        public @Unsigned short x87_fop;
        public @Unsigned short x87_ds;
        public @Unsigned short x87_cs;
        public @Unsigned long x87_rip;
        public char @Size(value=80) [] fpreg_x87;
        public char @Size(value=256) [] fpreg_xmm;
        public char @Size(value=256) [] fpreg_ymm;
    }

    @Type(noCCodeGeneration=true, cType="struct sev_guest_platform_data")
    @NotUsableInJava
    public static class sev_guest_platform_data
    extends Struct {
        public @Unsigned long secrets_gpa;
    }
}

