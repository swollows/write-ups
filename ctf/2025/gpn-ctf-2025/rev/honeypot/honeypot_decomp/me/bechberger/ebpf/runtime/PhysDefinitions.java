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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PhysDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long phys_p4d_init(Ptr<misc.p4d_t> p4d_page, @Unsigned long paddr, @Unsigned long paddr_end, @Unsigned long page_size_mask,  @OriginalName(value="pgprot_t") runtime.pgprot prot, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long phys_pmd_init(Ptr<PmdDefinitions.pmd_t> pmd_page, @Unsigned long paddr, @Unsigned long paddr_end, @Unsigned long page_size_mask,  @OriginalName(value="pgprot_t") runtime.pgprot prot, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long phys_pte_init(Ptr<PteDefinitions.pte_t> pte_page, @Unsigned long paddr, @Unsigned long paddr_end,  @OriginalName(value="pgprot_t") runtime.pgprot prot, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long phys_pud_init(Ptr<PudDefinitions.pud_t> pud_page, @Unsigned long paddr, @Unsigned long paddr_end, @Unsigned long page_size_mask,  @OriginalName(value="pgprot_t") runtime.pgprot _prot, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phys_to_target_node(@Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phys_addr_show(Ptr<EfiDefinitions.efi_runtime_map_entry> entry, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phys_mem_access_prot_allowed(Ptr<runtime.file> file2, @Unsigned long pfn, @Unsigned long size, Ptr< @OriginalName(value="pgprot_t") runtime.pgprot> vma_prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int phys_package_first_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phys_port_id_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phys_port_name_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phys_switch_id_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean phys_mem_access_encrypted(@Unsigned long phys_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phys_device_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long phys_index_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="pgprot_t") runtime.pgprot phys_mem_access_prot(Ptr<runtime.file> file2, @Unsigned long pfn, @Unsigned long size,  @OriginalName(value="pgprot_t") runtime.pgprot vma_prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct page *page; long unsigned int offset; }")
    @NotUsableInJava
    public static class phys_of_dst_of_skcipher_walk_and_src_of_skcipher_walk
    extends Struct {
        public Ptr<runtime.page> page;
        public @Unsigned long offset;
    }
}

