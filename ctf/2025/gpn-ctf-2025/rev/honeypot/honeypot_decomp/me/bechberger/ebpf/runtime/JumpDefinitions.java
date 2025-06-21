/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.StaticDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class JumpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __jump_label_update(Ptr<StaticDefinitions.static_key> key2, Ptr<jump_entry> entry, Ptr<jump_entry> stop, boolean init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jump_label_add_module(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="jump_label_cmp((const void*)$arg1, (const void*)$arg2)")
    public static int jump_label_cmp(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_del_module(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jump_label_init_module() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_init_ro() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static jump_label_type jump_label_init_type(Ptr<jump_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jump_label_module_notify(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_rate_limit(Ptr<StaticDefinitions.static_key_deferred> key2, @Unsigned long rl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_swap(Ptr<?> a, Ptr<?> b, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int jump_label_text_reserved(Ptr<?> start, Ptr<?> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_update(Ptr<StaticDefinitions.static_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_update_timeout(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static jump_label_patch __jump_label_patch(Ptr<jump_entry> entry, jump_label_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void jump_label_transform(Ptr<jump_entry> entry, jump_label_type type2, int init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct jump_label_patch")
    @NotUsableInJava
    public static class jump_label_patch
    extends Struct {
        public Ptr<?> code;
        public int size;
    }

    @Type(noCCodeGeneration=true, cType="enum jump_label_type")
    public static enum jump_label_type implements Enum<jump_label_type>,
    TypedEnum<jump_label_type, Integer>
    {
        JUMP_LABEL_NOP,
        JUMP_LABEL_JMP;

    }

    @Type(noCCodeGeneration=true, cType="struct jump_entry")
    @NotUsableInJava
    public static class jump_entry
    extends Struct {
        public int code;
        public int target;
        public long key;
    }
}

