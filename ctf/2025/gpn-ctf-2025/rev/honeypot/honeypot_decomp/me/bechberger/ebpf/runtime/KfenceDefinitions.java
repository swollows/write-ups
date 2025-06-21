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
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class KfenceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __kfence_obj_info(Ptr<KmemDefinitions.kmem_obj_info> kpp, Ptr<?> object, Ptr<runtime.slab> slab2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfence_print_object($arg1, (const struct kfence_metadata*)$arg2)")
    public static void kfence_print_object(Ptr<SeqDefinitions.seq_file> seq, Ptr<kfence_metadata> meta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfence_print_stack($arg1, (const struct kfence_metadata*)$arg2, $arg3)")
    public static void kfence_print_stack(Ptr<SeqDefinitions.seq_file> seq, Ptr<kfence_metadata> meta, boolean show_alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfence_report_error($arg1, $arg2, $arg3, (const struct kfence_metadata*)$arg4, $arg5)")
    public static void kfence_report_error(@Unsigned long address, boolean is_write, Ptr<PtDefinitions.pt_regs> regs, Ptr<kfence_metadata> meta, kfence_error_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfence_to_kp_stack((const struct kfence_track*)$arg1, $arg2)")
    public static void kfence_to_kp_stack(Ptr<kfence_track> track2, Ptr<Ptr<?>> kp_stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __kfence_alloc(Ptr<KmemDefinitions.kmem_cache> s2, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kfence_free(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfence_alloc_pool_and_metadata() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kfence_check_canary_callback(Ptr<misc.notifier_block> nb, @Unsigned long reason, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kfence_debugfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> kfence_guarded_alloc(Ptr<KmemDefinitions.kmem_cache> cache, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<@Unsigned Long> stack_entries, @Unsigned long num_stack_entries, @Unsigned int alloc_stack_hash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfence_guarded_free(Ptr<?> addr2, Ptr<kfence_metadata> meta, boolean zombie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kfence_handle_page_fault(@Unsigned long addr2, boolean is_write, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfence_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfence_init_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kfence_init_late() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kfence_init_pool() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfence_ksize((const void*)$arg1)")
    public static @Unsigned long kfence_ksize(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfence_object_start((const void*)$arg1)")
    public static Ptr<?> kfence_object_start(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kfence_protect(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfence_shutdown_cache(Ptr<KmemDefinitions.kmem_cache> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kfence_unprotect(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum kfence_counter_id")
    public static enum kfence_counter_id implements Enum<kfence_counter_id>,
    TypedEnum<kfence_counter_id, Integer>
    {
        KFENCE_COUNTER_ALLOCATED,
        KFENCE_COUNTER_ALLOCS,
        KFENCE_COUNTER_FREES,
        KFENCE_COUNTER_ZOMBIES,
        KFENCE_COUNTER_BUGS,
        KFENCE_COUNTER_SKIP_INCOMPAT,
        KFENCE_COUNTER_SKIP_CAPACITY,
        KFENCE_COUNTER_SKIP_COVERED,
        KFENCE_COUNTER_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="enum kfence_error_type")
    public static enum kfence_error_type implements Enum<kfence_error_type>,
    TypedEnum<kfence_error_type, Integer>
    {
        KFENCE_ERROR_OOB,
        KFENCE_ERROR_UAF,
        KFENCE_ERROR_CORRUPTION,
        KFENCE_ERROR_INVALID,
        KFENCE_ERROR_INVALID_FREE;

    }

    @Type(noCCodeGeneration=true, cType="struct kfence_metadata")
    @NotUsableInJava
    public static class kfence_metadata
    extends Struct {
        public ListDefinitions.list_head list;
        public misc.callback_head callback_head;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public kfence_object_state state;
        public @Unsigned long addr;
        public @Unsigned long size;
        public Ptr<KmemDefinitions.kmem_cache> cache;
        public @Unsigned long unprotected_page;
        public kfence_track alloc_track;
        public kfence_track free_track;
        public @Unsigned int alloc_stack_hash;
        public misc.slabobj_ext obj_exts;
    }

    @Type(noCCodeGeneration=true, cType="struct kfence_track")
    @NotUsableInJava
    public static class kfence_track
    extends Struct {
        public @OriginalName(value="pid_t") int pid;
        public int cpu;
        public @Unsigned long ts_nsec;
        public int num_stack_entries;
        public @Unsigned long @Size(value=64) [] stack_entries;
    }

    @Type(noCCodeGeneration=true, cType="enum kfence_object_state")
    public static enum kfence_object_state implements Enum<kfence_object_state>,
    TypedEnum<kfence_object_state, Integer>
    {
        KFENCE_OBJECT_UNUSED,
        KFENCE_OBJECT_ALLOCATED,
        KFENCE_OBJECT_RCU_FREEING,
        KFENCE_OBJECT_FREED;

    }
}

