/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ComponentDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__component_add($arg1, (const struct component_ops*)$arg2, $arg3)")
    public static int __component_add(Ptr<runtime.device> dev, Ptr<component_ops> ops, int subcomponent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__component_match_add($arg1, $arg2, (void (*)(struct device*, void*))$arg3, (int (*)(struct device*, void*))$arg4, (int (*)(struct device*, int, void*))$arg5, $arg6)")
    public static void __component_match_add(Ptr<runtime.device> parent, Ptr<Ptr<component_match>> matchptr, Ptr<?> release, Ptr<?> compare, Ptr<?> compare_typed, Ptr<?> compare_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="component_add($arg1, (const struct component_ops*)$arg2)")
    public static int component_add(Ptr<runtime.device> dev, Ptr<component_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="component_add_typed($arg1, (const struct component_ops*)$arg2, $arg3)")
    public static int component_add_typed(Ptr<runtime.device> dev, Ptr<component_ops> ops, int subcomponent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int component_bind(Ptr<runtime.component> component2, Ptr<misc.aggregate_device> adev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int component_bind_all(Ptr<runtime.device> parent, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int component_compare_dev(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int component_compare_dev_name(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int component_compare_of(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int component_debug_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="component_del($arg1, (const struct component_ops*)$arg2)")
    public static void component_del(Ptr<runtime.device> dev, Ptr<component_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int component_devices_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int component_devices_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="component_master_add_with_match($arg1, (const struct component_master_ops*)$arg2, $arg3)")
    public static int component_master_add_with_match(Ptr<runtime.device> parent, Ptr<component_master_ops> ops, Ptr<component_match> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="component_master_del($arg1, (const struct component_master_ops*)$arg2)")
    public static void component_master_del(Ptr<runtime.device> parent, Ptr<component_master_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="component_match_add_release($arg1, $arg2, (void (*)(struct device*, void*))$arg3, (int (*)(struct device*, void*))$arg4, $arg5)")
    public static void component_match_add_release(Ptr<runtime.device> parent, Ptr<Ptr<component_match>> matchptr, Ptr<?> release, Ptr<?> compare, Ptr<?> compare_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="component_match_add_typed($arg1, $arg2, (int (*)(struct device*, int, void*))$arg3, $arg4)")
    public static void component_match_add_typed(Ptr<runtime.device> parent, Ptr<Ptr<component_match>> matchptr, Ptr<?> compare_typed, Ptr<?> compare_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int component_match_realloc(Ptr<component_match> match, @Unsigned long num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void component_release_of(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void component_unbind(Ptr<runtime.component> component2, Ptr<misc.aggregate_device> adev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void component_unbind_all(Ptr<runtime.device> parent, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct component_match")
    @NotUsableInJava
    public static class component_match
    extends Struct {
        public @Unsigned long alloc;
        public @Unsigned long num;
        public Ptr<component_match_array> compare;
    }

    @Type(noCCodeGeneration=true, cType="struct component_match_array")
    @NotUsableInJava
    public static class component_match_array
    extends Struct {
        public Ptr<?> data;
        public Ptr<?> compare;
        public Ptr<?> compare_typed;
        public Ptr<?> release;
        public Ptr<runtime.component> component;
        public boolean duplicate;
    }

    @Type(noCCodeGeneration=true, cType="struct component_master_ops")
    @NotUsableInJava
    public static class component_master_ops
    extends Struct {
        public Ptr<?> bind;
        public Ptr<?> unbind;
    }

    @Type(noCCodeGeneration=true, cType="struct component_ops")
    @NotUsableInJava
    public static class component_ops
    extends Struct {
        public Ptr<?> bind;
        public Ptr<?> unbind;
    }
}

