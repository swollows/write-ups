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
import me.bechberger.ebpf.runtime.BootDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SnpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_memcpy(Ptr<?> dst, Ptr<?> src, @Unsigned long sz, @Unsigned long paddr, boolean decrypt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __snp_enable(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __snp_fixup_e820_tables(@Unsigned long pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<rmpentry> __snp_lookup_rmpentry(@Unsigned long pfn, Ptr<Integer> level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_dump_hva_rmpentry(@Unsigned long hva) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_enable(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_fixup_e820_tables() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_leak_pages(@Unsigned long pfn, @Unsigned int npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snp_lookup_rmpentry(@Unsigned long pfn, Ptr<@OriginalName(value="bool") Boolean> assigned, Ptr<Integer> level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean snp_probe_rmptable_info() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snp_rmptable_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_abort() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_accept_memory(@Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snp_cpuid(Ptr<runtime.ghcb> ghcb2, Ptr<misc.es_em_ctxt> ctxt, Ptr<misc.cpuid_leaf> leaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snp_cpuid_postprocess(Ptr<runtime.ghcb> ghcb2, Ptr<misc.es_em_ctxt> ctxt, Ptr<misc.cpuid_leaf> leaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_dmi_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean snp_init(Ptr<BootDefinitions.boot_params> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snp_init_platform_device() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snp_issue_guest_request(@Unsigned long exit_code, Ptr<snp_req_data> input, Ptr<snp_guest_request_ioctl> rio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int snp_issue_svsm_attest_req(@Unsigned long call_id, Ptr<misc.svsm_call> call, Ptr<misc.svsm_attest_call> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_register_ghcb_early(@Unsigned long paddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_set_memory_private(@Unsigned long vaddr, @Unsigned long npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_set_memory_shared(@Unsigned long vaddr, @Unsigned long npages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_set_wakeup_secondary_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void snp_update_svsm_ca() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rmpentry")
    @NotUsableInJava
    public static class rmpentry
    extends Struct {
        @InlineUnion(value=89885)
        public  @InlineUnion(value=89885) AnonDefinitions.anon_member_of_anon_member_of_rmpentry anon0$0;
        @InlineUnion(value=89885)
        public @InlineUnion(value=89885) @Unsigned long lo;
        public @Unsigned long hi;
    }

    @Type(noCCodeGeneration=true, cType="struct snp_cpuid_table")
    @NotUsableInJava
    public static class snp_cpuid_table
    extends Struct {
        public @Unsigned int count;
        public @Unsigned int __reserved1;
        public @Unsigned long __reserved2;
        public snp_cpuid_fn @Size(value=64) [] fn;
    }

    @Type(noCCodeGeneration=true, cType="struct snp_cpuid_fn")
    @NotUsableInJava
    public static class snp_cpuid_fn
    extends Struct {
        public @Unsigned int eax_in;
        public @Unsigned int ecx_in;
        public @Unsigned long xcr0_in;
        public @Unsigned long xss_in;
        public @Unsigned int eax;
        public @Unsigned int ebx;
        public @Unsigned int ecx;
        public @Unsigned int edx;
        public @Unsigned long __reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct snp_secrets_page")
    @NotUsableInJava
    public static class snp_secrets_page
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int imien;
        public @Unsigned int rsvd1;
        public @Unsigned int fms;
        public @Unsigned int rsvd2;
        public char @Size(value=16) [] gosvw;
        public char @Size(value=32) [] vmpck0;
        public char @Size(value=32) [] vmpck1;
        public char @Size(value=32) [] vmpck2;
        public char @Size(value=32) [] vmpck3;
        public misc.secrets_os_area os_area;
        public char @Size(value=64) [] vmsa_tweak_bitmap;
        public @Unsigned long svsm_base;
        public @Unsigned long svsm_size;
        public @Unsigned long svsm_caa;
        public @Unsigned int svsm_max_version;
        public char svsm_guest_vmpl;
        public char @Size(value=3) [] rsvd3;
        public char @Size(value=3744) [] rsvd4;
    }

    @Type(noCCodeGeneration=true, cType="struct snp_req_data")
    @NotUsableInJava
    public static class snp_req_data
    extends Struct {
        public @Unsigned long req_gpa;
        public @Unsigned long resp_gpa;
        public @Unsigned long data_gpa;
        public @Unsigned int data_npages;
    }

    @Type(noCCodeGeneration=true, cType="struct snp_psc_desc")
    @NotUsableInJava
    public static class snp_psc_desc
    extends Struct {
        public misc.psc_hdr hdr;
        public misc.psc_entry @Size(value=64) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct snp_guest_request_ioctl")
    @NotUsableInJava
    public static class snp_guest_request_ioctl
    extends Struct {
        public char msg_version;
        public @Unsigned long req_data;
        public @Unsigned long resp_data;
        @InlineUnion(value=2902)
        public @InlineUnion(value=2902) @Unsigned long exitinfo2;
        @InlineUnion(value=2902)
        public  @InlineUnion(value=2902) AnonDefinitions.anon_member_of_anon_member_of_snp_guest_request_ioctl anon3$1;
    }
}

