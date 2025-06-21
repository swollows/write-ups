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
import me.bechberger.ebpf.runtime.NewDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SwsuspDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swsusp_show_speed(@OriginalName(value="ktime_t") long start, @OriginalName(value="ktime_t") long stop, @Unsigned int nr_pages, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_check(boolean exclusive) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swsusp_close() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_header_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_read(Ptr<@Unsigned Integer> flags_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_swap_in_use() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_unmark() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_write(@Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swsusp_arch_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_arch_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swsusp_free() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_page_is_forbidden(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_page_is_free(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int swsusp_save() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swsusp_set_page_forbidden(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swsusp_set_page_free(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void swsusp_unset_page_free(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct swsusp_extent")
    @NotUsableInJava
    public static class swsusp_extent
    extends Struct {
        public RbDefinitions.rb_node node;
        public @Unsigned long start;
        public @Unsigned long end;
    }

    @Type(noCCodeGeneration=true, cType="struct swsusp_header")
    @NotUsableInJava
    public static class swsusp_header
    extends Struct {
        public char @Size(value=4056) [] reserved;
        public @Unsigned int hw_sig;
        public @Unsigned int crc32;
        public @Unsigned @OriginalName(value="sector_t") long image;
        public @Unsigned int flags;
        public char @Size(value=10) [] orig_sig;
        public char @Size(value=10) [] sig;
    }

    @Type(noCCodeGeneration=true, cType="struct swsusp_info")
    @NotUsableInJava
    public static class swsusp_info
    extends Struct {
        public NewDefinitions.new_utsname uts;
        public @Unsigned int version_code;
        public @Unsigned long num_physpages;
        public int cpus;
        public @Unsigned long image_pages;
        public @Unsigned long pages;
        public @Unsigned long size;
    }
}

