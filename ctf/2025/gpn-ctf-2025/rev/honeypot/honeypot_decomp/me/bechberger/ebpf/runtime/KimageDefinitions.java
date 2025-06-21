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
import me.bechberger.ebpf.runtime.KexecDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KimageDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kimage_alloc_init(Ptr<Ptr<runtime.kimage>> rimage, @Unsigned long entry, @Unsigned long nr_segments, Ptr<KexecDefinitions.kexec_segment> segments, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kimage_file_post_load_cleanup(Ptr<runtime.kimage> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kimage_file_prepare_segments($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int kimage_file_prepare_segments(Ptr<runtime.kimage> image, int kernel_fd, int initrd_fd, String cmdline_ptr, @Unsigned long cmdline_len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kimage_crash_copy_vmcoreinfo(Ptr<runtime.kimage> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kimage_add_entry(Ptr<runtime.kimage> image, @Unsigned @OriginalName(value="kimage_entry_t") long entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> kimage_alloc_control_pages(Ptr<runtime.kimage> image, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> kimage_alloc_crash_control_pages(Ptr<runtime.kimage> image, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> kimage_alloc_normal_control_pages(Ptr<runtime.kimage> image, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> kimage_alloc_page(Ptr<runtime.kimage> image, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned long destination) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> kimage_alloc_pages(@Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kimage_free(Ptr<runtime.kimage> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kimage_free_page_list(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kimage_free_pages(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kimage_is_destination_range(Ptr<runtime.kimage> image, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kimage_load_crash_segment(Ptr<runtime.kimage> image, Ptr<KexecDefinitions.kexec_segment> segment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kimage_load_normal_segment(Ptr<runtime.kimage> image, Ptr<KexecDefinitions.kexec_segment> segment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kimage_load_segment(Ptr<runtime.kimage> image, Ptr<KexecDefinitions.kexec_segment> segment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kimage_terminate(Ptr<runtime.kimage> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kimage_arch")
    @NotUsableInJava
    public static class kimage_arch
    extends Struct {
        public Ptr<misc.p4d_t> p4d;
        public Ptr<PudDefinitions.pud_t> pud;
        public Ptr<PmdDefinitions.pmd_t> pmd;
        public Ptr<PteDefinitions.pte_t> pte;
    }
}

