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
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IoremapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioremap_page_range(@Unsigned long addr2, @Unsigned long end, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr,  @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __ioremap_caller(@Unsigned @OriginalName(value="resource_size_t") long phys_addr, @Unsigned long size, PageDefinitions.page_cache_mode pcm, Ptr<?> caller, boolean encrypted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __ioremap_check_ram(Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ioremap_collect_map_flags(Ptr<runtime.resource> res, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ioremap_cache(@Unsigned @OriginalName(value="resource_size_t") long phys_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ioremap_change_attr(@Unsigned long vaddr, @Unsigned long size, PageDefinitions.page_cache_mode pcm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ioremap_encrypted(@Unsigned @OriginalName(value="resource_size_t") long phys_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ioremap_prot(@Unsigned @OriginalName(value="resource_size_t") long phys_addr, @Unsigned long size, @Unsigned long prot_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ioremap_uc(@Unsigned @OriginalName(value="resource_size_t") long phys_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ioremap_wc(@Unsigned @OriginalName(value="resource_size_t") long phys_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ioremap_wt(@Unsigned @OriginalName(value="resource_size_t") long phys_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ioremap_desc")
    @NotUsableInJava
    public static class ioremap_desc
    extends Struct {
        public @Unsigned int flags;
    }
}

