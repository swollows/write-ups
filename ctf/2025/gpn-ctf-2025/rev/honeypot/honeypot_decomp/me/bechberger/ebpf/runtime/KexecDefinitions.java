/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KexecDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_add_buffer(Ptr<kexec_buf> kbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_calculate_store_digests(Ptr<runtime.kimage> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kexec_crash_loaded_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kexec_crash_size_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kexec_crash_size_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long kexec_crash_size_store(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_image_post_load_cleanup_default(Ptr<runtime.kimage> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_image_probe_default(Ptr<runtime.kimage> image, Ptr<?> buf, @Unsigned long buf_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kexec_kernel_verify_pe_sig((const u8*)$arg1, $arg2)")
    public static int kexec_kernel_verify_pe_sig(String kernel, @Unsigned long kernel_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_load_purgatory(Ptr<runtime.kimage> image, Ptr<kexec_buf> kbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long kexec_loaded_show(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_locate_mem_hole(Ptr<kexec_buf> kbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kexec_mark_crashkres(boolean protect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_mark_range(@Unsigned long start, @Unsigned long end, boolean protect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kexec_purgatory_get_set_symbol($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int kexec_purgatory_get_set_symbol(Ptr<runtime.kimage> image, String name, Ptr<?> buf, @Unsigned int size, boolean get_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kexec_purgatory_get_symbol_addr($arg1, (const u8*)$arg2)")
    public static Ptr<?> kexec_purgatory_get_symbol_addr(Ptr<runtime.kimage> image, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_purgatory_setup_sechdrs(Ptr<misc.purgatory_info> pi, Ptr<kexec_buf> kbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_crash_loaded() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_should_crash(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kexec_core_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kexec_enter_virtual_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kexec_limit_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int kexec_limit_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kexec_load_permitted(int kexec_image_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kexec_entry64_regs")
    @NotUsableInJava
    public static class kexec_entry64_regs
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long rax;
        public @Unsigned @OriginalName(value="uint64_t") long rcx;
        public @Unsigned @OriginalName(value="uint64_t") long rdx;
        public @Unsigned @OriginalName(value="uint64_t") long rbx;
        public @Unsigned @OriginalName(value="uint64_t") long rsp;
        public @Unsigned @OriginalName(value="uint64_t") long rbp;
        public @Unsigned @OriginalName(value="uint64_t") long rsi;
        public @Unsigned @OriginalName(value="uint64_t") long rdi;
        public @Unsigned @OriginalName(value="uint64_t") long r8;
        public @Unsigned @OriginalName(value="uint64_t") long r9;
        public @Unsigned @OriginalName(value="uint64_t") long r10;
        public @Unsigned @OriginalName(value="uint64_t") long r11;
        public @Unsigned @OriginalName(value="uint64_t") long r12;
        public @Unsigned @OriginalName(value="uint64_t") long r13;
        public @Unsigned @OriginalName(value="uint64_t") long r14;
        public @Unsigned @OriginalName(value="uint64_t") long r15;
        public @Unsigned @OriginalName(value="uint64_t") long rip;
    }

    @Type(noCCodeGeneration=true, cType="struct kexec_sha_region")
    @NotUsableInJava
    public static class kexec_sha_region
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct kexec_buf")
    @NotUsableInJava
    public static class kexec_buf
    extends Struct {
        public Ptr<runtime.kimage> image;
        public Ptr<?> buffer;
        public @Unsigned long bufsz;
        public @Unsigned long mem;
        public @Unsigned long memsz;
        public @Unsigned long buf_align;
        public @Unsigned long buf_min;
        public @Unsigned long buf_max;
        public boolean top_down;
    }

    @Type(noCCodeGeneration=true, cType="struct kexec_load_limit")
    @NotUsableInJava
    public static class kexec_load_limit
    extends Struct {
        public runtime.mutex mutex;
        public int limit;
    }

    @Type(noCCodeGeneration=true, cType="struct kexec_file_ops")
    @NotUsableInJava
    public static class kexec_file_ops
    extends Struct {
        public Ptr<?> probe;
        public Ptr<?> load;
        public Ptr<?> cleanup;
        public Ptr<?> verify_sig;
    }

    @Type(noCCodeGeneration=true, cType="struct kexec_segment")
    @NotUsableInJava
    public static class kexec_segment
    extends Struct {
        @InlineUnion(value=7906)
        public @InlineUnion(value=7906) Ptr<?> buf;
        @InlineUnion(value=7906)
        public @InlineUnion(value=7906) Ptr<?> kbuf;
        public @Unsigned long bufsz;
        public @Unsigned long mem;
        public @Unsigned long memsz;
    }
}

