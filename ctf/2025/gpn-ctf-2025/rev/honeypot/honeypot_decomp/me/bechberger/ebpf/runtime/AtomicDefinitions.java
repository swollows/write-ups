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
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.GenDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AtomicDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atomic_dec_and_mutex_lock(Ptr<atomic_t> cnt, Ptr<runtime.mutex> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atomic_remove_fb(Ptr<DrmDefinitions.drm_framebuffer> fb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _atomic_dec_and_lock(Ptr<atomic_t> atomic, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _atomic_dec_and_lock_irqsave(Ptr<atomic_t> atomic, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _atomic_dec_and_raw_lock(Ptr<atomic_t> atomic, Ptr< @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _atomic_dec_and_raw_lock_irqsave(Ptr<atomic_t> atomic, Ptr< @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock> lock, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atomic_pool_expand(Ptr<GenDefinitions.gen_pool> pool, @Unsigned long pool_size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void atomic_pool_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atomic_notifier_call_chain(Ptr<atomic_notifier_head> nh, @Unsigned long val, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean atomic_notifier_call_chain_is_empty(Ptr<atomic_notifier_head> nh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atomic_notifier_chain_register(Ptr<atomic_notifier_head> nh, Ptr<misc.notifier_block> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atomic_notifier_chain_register_unique_prio(Ptr<atomic_notifier_head> nh, Ptr<misc.notifier_block> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atomic_notifier_chain_unregister(Ptr<atomic_notifier_head> nh, Ptr<misc.notifier_block> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct atomic_notifier_head")
    @NotUsableInJava
    public static class atomic_notifier_head
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<misc.notifier_block> head;
    }

    @Type(noCCodeGeneration=true, cType="struct { int counter; }")
    @NotUsableInJava
    public static class atomic_t
    extends Struct {
        public int counter;
    }
}

