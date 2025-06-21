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
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class KobjectDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kobject_del(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_add($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static int kobject_add(Ptr<runtime.kobject> kobj, Ptr<runtime.kobject> parent, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kobject_add_internal(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kobject_cleanup(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_create_and_add((const u8*)$arg1, $arg2)")
    public static Ptr<runtime.kobject> kobject_create_and_add(String name, Ptr<runtime.kobject> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kobject_del(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kobject> kobject_get(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_get_ownership((const struct kobject*)$arg1, $arg2, $arg3)")
    public static void kobject_get_ownership(Ptr<runtime.kobject> kobj, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_get_path((const struct kobject*)$arg1, $arg2)")
    public static String kobject_get_path(Ptr<runtime.kobject> kobj, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.kobject> kobject_get_unless_zero(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_init($arg1, (const struct kobj_type*)$arg2)")
    public static void kobject_init(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_type> ktype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_init_and_add($arg1, (const struct kobj_type*)$arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static int kobject_init_and_add(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_type> ktype, Ptr<runtime.kobject> parent, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kobject_move(Ptr<runtime.kobject> kobj, Ptr<runtime.kobject> new_parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)kobject_namespace((const struct kobject*)$arg1))")
    public static Ptr<?> kobject_namespace(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kobject_put(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_rename($arg1, (const u8*)$arg2)")
    public static int kobject_rename(Ptr<runtime.kobject> kobj, String new_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_set_name($arg1, (const u8*)$arg2, $arg3_)")
    public static int kobject_set_name(Ptr<runtime.kobject> kobj, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_set_name_vargs($arg1, (const u8*)$arg2, $arg3)")
    public static int kobject_set_name_vargs(Ptr<runtime.kobject> kobj, String fmt, Ptr<misc.__va_list_tag> vargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_action_args((const u8*)$arg1, $arg2, $arg3)")
    public static int kobject_action_args(String buf, @Unsigned long count, Ptr<Ptr<KobjDefinitions.kobj_uevent_env>> ret_env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_synth_uevent($arg1, (const u8*)$arg2, $arg3)")
    public static int kobject_synth_uevent(Ptr<runtime.kobject> kobj, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kobject_uevent(Ptr<runtime.kobject> kobj, kobject_action action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kobject_uevent_env(Ptr<runtime.kobject> kobj, kobject_action action, Ptr<String> envp_ext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kobject_uevent_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kobject_uevent_net_broadcast($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static int kobject_uevent_net_broadcast(Ptr<runtime.kobject> kobj, Ptr<KobjDefinitions.kobj_uevent_env> env, String action_string, String devpath) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum kobject_action")
    public static enum kobject_action implements Enum<kobject_action>,
    TypedEnum<kobject_action, Integer>
    {
        KOBJ_ADD,
        KOBJ_REMOVE,
        KOBJ_CHANGE,
        KOBJ_MOVE,
        KOBJ_ONLINE,
        KOBJ_OFFLINE,
        KOBJ_BIND,
        KOBJ_UNBIND;

    }
}

