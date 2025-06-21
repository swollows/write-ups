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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CtDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.InsnDefinitions;
import me.bechberger.ebpf.runtime.JumpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class StaticDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __static_call_init(Ptr<runtime.module> mod, Ptr<static_call_site> start, Ptr<static_call_site> stop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __static_call_return0() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __static_call_update(Ptr<static_call_key> key2, Ptr<?> tramp, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void static_call_del_module(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void static_call_force_reinit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int static_call_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int static_call_module_notify(Ptr<misc.notifier_block> nb, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="static_call_site_cmp((const void*)$arg1, (const void*)$arg2)")
    public static int static_call_site_cmp(Ptr<?> _a, Ptr<?> _b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void static_call_site_swap(Ptr<?> _a, Ptr<?> _b, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int static_call_text_reserved(Ptr<?> start, Ptr<?> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __static_key_deferred_flush(Ptr<?> key2, Ptr<DelayedDefinitions.delayed_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __static_key_slow_dec_cpuslocked(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __static_key_slow_dec_deferred(Ptr<static_key> key2, Ptr<DelayedDefinitions.delayed_work> work, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean static_dev_dax(Ptr<DevDefinitions.dev_dax> dev_dax2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int static_key_count(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean static_key_dec_not_one(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void static_key_disable(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void static_key_disable_cpuslocked(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void static_key_enable(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void static_key_enable_cpuslocked(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean static_key_fast_inc_not_disabled(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void static_key_slow_dec(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void static_key_slow_dec_cpuslocked(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean static_key_slow_inc(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean static_key_slow_inc_cpuslocked(Ptr<static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="pgprot_t") runtime.pgprot static_protections( @OriginalName(value="pgprot_t") runtime.pgprot prot, @Unsigned long start, @Unsigned long pfn, @Unsigned long npg, @Unsigned long lpsize, int warnlvl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __static_call_fixup(Ptr<?> tramp, char op, Ptr<?> dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __static_call_transform(Ptr<?> insn2, InsnDefinitions.insn_type type2, Ptr<?> func, boolean modinit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __static_call_validate(Ptr<Character> insn2, boolean tail, boolean tramp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct static_tree_desc_s")
    @NotUsableInJava
    public static class static_tree_desc_s
    extends Struct {
        public Ptr<CtDefinitions.ct_data_s> static_tree;
        public Ptr<Integer> extra_bits;
        public int extra_base;
        public int elems;
        public int max_length;
    }

    @Type(noCCodeGeneration=true, cType="struct static_key_deferred")
    @NotUsableInJava
    public static class static_key_deferred
    extends Struct {
        public static_key key;
        public @Unsigned long timeout;
        public DelayedDefinitions.delayed_work work;
    }

    @Type(noCCodeGeneration=true, cType="struct static_key_mod")
    @NotUsableInJava
    public static class static_key_mod
    extends Struct {
        public Ptr<static_key_mod> next;
        public Ptr<JumpDefinitions.jump_entry> entries;
        public Ptr<runtime.module> mod;
    }

    @Type(noCCodeGeneration=true, cType="struct static_call_tramp_key")
    @NotUsableInJava
    public static class static_call_tramp_key
    extends Struct {
        public int tramp;
        public int key;
    }

    @Type(noCCodeGeneration=true, cType="struct static_key_false_deferred")
    @NotUsableInJava
    public static class static_key_false_deferred
    extends Struct {
        public static_key_false key;
        public @Unsigned long timeout;
        public DelayedDefinitions.delayed_work work;
    }

    @Type(noCCodeGeneration=true, cType="struct static_call_key")
    @NotUsableInJava
    public static class static_call_key
    extends Struct {
        public Ptr<?> func;
        @InlineUnion(value=479)
        public @InlineUnion(value=479) @Unsigned long type;
        @InlineUnion(value=479)
        public @InlineUnion(value=479) Ptr<static_call_mod> mods;
        @InlineUnion(value=479)
        public @InlineUnion(value=479) Ptr<static_call_site> sites;
    }

    @Type(noCCodeGeneration=true, cType="struct static_call_mod")
    @NotUsableInJava
    public static class static_call_mod
    extends Struct {
        public Ptr<static_call_mod> next;
        public Ptr<runtime.module> mod;
        public Ptr<static_call_site> sites;
    }

    @Type(noCCodeGeneration=true, cType="struct static_call_site")
    @NotUsableInJava
    public static class static_call_site
    extends Struct {
        public int addr;
        public int key;
    }

    @Type(noCCodeGeneration=true, cType="struct static_key_false")
    @NotUsableInJava
    public static class static_key_false
    extends Struct {
        public static_key key;
    }

    @Type(noCCodeGeneration=true, cType="struct static_key_true")
    @NotUsableInJava
    public static class static_key_true
    extends Struct {
        public static_key key;
    }

    @Type(noCCodeGeneration=true, cType="struct static_key")
    @NotUsableInJava
    public static class static_key
    extends Struct {
        public AtomicDefinitions.atomic_t enabled;
        @InlineUnion(value=445)
        public @InlineUnion(value=445) @Unsigned long type;
        @InlineUnion(value=445)
        public @InlineUnion(value=445) Ptr<JumpDefinitions.jump_entry> entries;
        @InlineUnion(value=445)
        public @InlineUnion(value=445) Ptr<static_key_mod> next;
    }
}

