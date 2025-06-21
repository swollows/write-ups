/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.ZsDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ObjDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int obj_cgroup_charge(Ptr<obj_cgroup> objcg, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void obj_cgroup_charge_zswap(Ptr<obj_cgroup> objcg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean obj_cgroup_may_zswap(Ptr<obj_cgroup> objcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void obj_cgroup_release(Ptr<PercpuDefinitions.percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void obj_cgroup_uncharge(Ptr<obj_cgroup> objcg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void obj_cgroup_uncharge_pages(Ptr<obj_cgroup> objcg, @Unsigned int nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void obj_cgroup_uncharge_zswap(Ptr<obj_cgroup> objcg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void obj_free(int class_size, @Unsigned long obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long obj_malloc(Ptr<ZsDefinitions.zs_pool> pool, Ptr<runtime.zspage> zspage2, @Unsigned long handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int size; void *head; void *data; u8 safe[32]; }")
    @NotUsableInJava
    public static class obj_of_btf_show
    extends Struct {
        public @Unsigned int size;
        public Ptr<?> head;
        public Ptr<?> data;
        public char @Size(value=32) [] safe;
    }

    @Type(noCCodeGeneration=true, cType="struct obj_cgroup")
    @NotUsableInJava
    public static class obj_cgroup
    extends Struct {
        public PercpuDefinitions.percpu_ref refcnt;
        public Ptr<MemDefinitions.mem_cgroup> memcg;
        public AtomicDefinitions.atomic_t nr_charged_bytes;
        @InlineUnion(value=1859)
        public @InlineUnion(value=1859) ListDefinitions.list_head list;
        @InlineUnion(value=1859)
        public @InlineUnion(value=1859) misc.callback_head rcu;
    }
}

