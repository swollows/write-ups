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
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.EarlyDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MsgDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SnapshotDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LoadDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_elf_binary(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_elf_library(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="load_idt((const struct desc_ptr*)$arg1)")
    public static void load_idt(Ptr<DescDefinitions.desc_ptr> dtr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_image_and_restore() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="load_moklist_certs((const _Bool)$arg1)")
    public static int load_moklist_certs(boolean load_db) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="load_nls((const u8*)$arg1)")
    public static Ptr<misc.nls_table> load_nls(String charset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.nls_table> load_nls_default() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_uefi_certs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_compressed_image(Ptr<SwapDefinitions.swap_map_handle> handle, Ptr<SnapshotDefinitions.snapshot_handle> snapshot, @Unsigned int nr_to_read) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_image(Ptr<SwapDefinitions.swap_map_handle> handle, Ptr<SnapshotDefinitions.snapshot_handle> snapshot, @Unsigned int nr_to_read) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_ramdisk(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_revocation_certificate_list() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_ucode_ap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_ucode_bsp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_current_idt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="load_link_ksettings_from_user($arg1, (const void*)$arg2)")
    public static int load_link_ksettings_from_user(Ptr<EthtoolDefinitions.ethtool_link_ksettings> to, Ptr<?> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_mm_ldt(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_script(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_trampoline_pgtable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_ucode_intel_ap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_ucode_intel_bsp(Ptr<EarlyDefinitions.early_load_data> ed2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_direct_gdt(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_fixmap_gdt(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_module_cert(Ptr<runtime.key> keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="load_msg((const void*)$arg1, $arg2)")
    public static Ptr<MsgDefinitions.msg_msg> load_msg(Ptr<?> src, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> load_self2_seq_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_self2_seq_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> load_self2_seq_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> load_self_seq_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_self_seq_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> load_self_seq_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_seq_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int load_system_certificate_list() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_ucode_amd_ap(@Unsigned int cpuid_1_eax2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void load_ucode_amd_bsp(Ptr<EarlyDefinitions.early_load_data> ed2, @Unsigned int cpuid_1_eax2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct load_info")
    @NotUsableInJava
    public static class load_info
    extends Struct {
        public String name;
        public Ptr<runtime.module> mod;
        public Ptr<@OriginalName(value="Elf64_Ehdr") misc.elf64_hdr> hdr;
        public @Unsigned long len;
        public Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs;
        public String secstrings;
        public String strtab;
        public @Unsigned long symoffs;
        public @Unsigned long stroffs;
        public @Unsigned long init_typeoffs;
        public @Unsigned long core_typeoffs;
        public boolean sig_ok;
        public @Unsigned long mod_kallsyms_init_off;
        public Ptr<Ptr<runtime.page>> pages;
        public @Unsigned int max_pages;
        public @Unsigned int used_pages;
        public misc.index_of_load_info index;
    }

    @Type(noCCodeGeneration=true, cType="struct load_weight")
    @NotUsableInJava
    public static class load_weight
    extends Struct {
        public @Unsigned long weight;
        public @Unsigned int inv_weight;
    }
}

