/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class VmallocDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __vmalloc_area_node(Ptr<VmDefinitions.vm_struct> area, @Unsigned @OriginalName(value="gfp_t") int gfp_mask,  @OriginalName(value="pgprot_t") runtime.pgprot prot, @Unsigned int page_shift, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__vmalloc_node_noprof($arg1, $arg2, $arg3, $arg4, (const void*)$arg5)")
    public static Ptr<?> __vmalloc_node_noprof(@Unsigned long size, @Unsigned long align, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int node2, Ptr<?> caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__vmalloc_node_range_noprof($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, (const void*)$arg9)")
    public static Ptr<?> __vmalloc_node_range_noprof(@Unsigned long size, @Unsigned long align, @Unsigned long start, @Unsigned long end, @Unsigned @OriginalName(value="gfp_t") int gfp_mask,  @OriginalName(value="pgprot_t") runtime.pgprot prot, @Unsigned long vm_flags, int node2, Ptr<?> caller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __vmalloc_noprof(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vmalloc_dump_obj(Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vmalloc_huge_noprof(@Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmalloc_info_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmalloc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vmalloc_node_noprof(@Unsigned long size, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vmalloc_noprof(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vmalloc_nr_pages() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vmalloc_to_page((const void*)$arg1)")
    public static Ptr<runtime.page> vmalloc_to_page(Ptr<?> vmalloc_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vmalloc_to_pfn((const void*)$arg1)")
    public static @Unsigned long vmalloc_to_pfn(Ptr<?> vmalloc_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vmalloc_user_noprof(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __vmalloc_array_noprof(@Unsigned long n, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vmalloc_array_noprof(@Unsigned long n, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }
}

