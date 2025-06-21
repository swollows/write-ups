/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class LabelDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long label_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AaDefinitions.aa_label> __label_insert(Ptr<AaDefinitions.aa_labelset> ls, Ptr<AaDefinitions.aa_label> label, boolean replace) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __label_remove(Ptr<AaDefinitions.aa_label> label, Ptr<AaDefinitions.aa_label> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AaDefinitions.aa_label> __label_update(Ptr<AaDefinitions.aa_label> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void label_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void label_free_switch(Ptr<AaDefinitions.aa_label> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AaDefinitions.aa_label> label_merge_insert(Ptr<AaDefinitions.aa_label> _new, Ptr<AaDefinitions.aa_label> a, Ptr<AaDefinitions.aa_label> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)label_modename($arg1, $arg2, $arg3))")
    public static String label_modename(Ptr<AaDefinitions.aa_ns> ns, Ptr<AaDefinitions.aa_label> label, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum label_flags")
    public static enum label_flags implements Enum<label_flags>,
    TypedEnum<label_flags, Integer>
    {
        FLAG_HAT,
        FLAG_UNCONFINED,
        FLAG_NULL,
        FLAG_IX_ON_NAME_ERROR,
        FLAG_IMMUTIBLE,
        FLAG_USER_DEFINED,
        FLAG_NO_LIST_REF,
        FLAG_NS_COUNT,
        FLAG_IN_TREE,
        FLAG_PROFILE,
        FLAG_EXPLICIT,
        FLAG_STALE,
        FLAG_RENAMED,
        FLAG_REVOKED,
        FLAG_DEBUG1,
        FLAG_DEBUG2;

    }

    @Type(noCCodeGeneration=true, cType="struct label_it")
    @NotUsableInJava
    public static class label_it
    extends Struct {
        public int i;
        public int j;
    }

    @Type(noCCodeGeneration=true, cType="enum label_initialized")
    public static enum label_initialized implements Enum<label_initialized>,
    TypedEnum<label_initialized, Integer>
    {
        LABEL_INVALID,
        LABEL_INITIALIZED,
        LABEL_PENDING;

    }
}

