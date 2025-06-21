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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DevresDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__devres_alloc_node($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static Ptr<?> __devres_alloc_node(@OriginalName(value="dr_release_t") Ptr<?> release, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp, int nid, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devres_add(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devres_close_group(Ptr<runtime.device> dev, Ptr<?> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devres_destroy(Ptr<runtime.device> dev, @OriginalName(value="dr_release_t") Ptr<?> release, @OriginalName(value="dr_match_t") Ptr<?> match, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devres_find(Ptr<runtime.device> dev, @OriginalName(value="dr_release_t") Ptr<?> release, @OriginalName(value="dr_match_t") Ptr<?> match, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devres_for_each_res($arg1, $arg2, $arg3, $arg4, (void (*)(struct device*, void*, void*))$arg5, $arg6)")
    public static void devres_for_each_res(Ptr<runtime.device> dev, @OriginalName(value="dr_release_t") Ptr<?> release, @OriginalName(value="dr_match_t") Ptr<?> match, Ptr<?> match_data, Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devres_free(Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devres_get(Ptr<runtime.device> dev, Ptr<?> new_res, @OriginalName(value="dr_match_t") Ptr<?> match, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devres_open_group(Ptr<runtime.device> dev, Ptr<?> id, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devres_release(Ptr<runtime.device> dev, @OriginalName(value="dr_release_t") Ptr<?> release, @OriginalName(value="dr_match_t") Ptr<?> match, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devres_release_all(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devres_release_group(Ptr<runtime.device> dev, Ptr<?> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devres_remove(Ptr<runtime.device> dev, @OriginalName(value="dr_release_t") Ptr<?> release, @OriginalName(value="dr_match_t") Ptr<?> match, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devres_remove_group(Ptr<runtime.device> dev, Ptr<?> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct devres_group")
    @NotUsableInJava
    public static class devres_group
    extends Struct {
        public devres_node @Size(value=2) [] node;
        public Ptr<?> id;
        public int color;
    }

    @Type(noCCodeGeneration=true, cType="struct devres_node")
    @NotUsableInJava
    public static class devres_node
    extends Struct {
        public ListDefinitions.list_head entry;
        public @OriginalName(value="dr_release_t") Ptr<?> release;
        public String name;
        public @Unsigned long size;
    }
}

