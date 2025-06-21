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
import me.bechberger.ebpf.runtime.EventfdDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VmpressureDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static vmpressure_levels vmpressure_calc_level(@Unsigned long scanned, @Unsigned long reclaimed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmpressure_cleanup(Ptr<runtime.vmpressure> vmpr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmpressure_init(Ptr<runtime.vmpressure> vmpr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmpressure_prio(@Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<MemDefinitions.mem_cgroup> memcg, int prio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vmpressure_register_event($arg1, $arg2, (const u8*)$arg3)")
    public static int vmpressure_register_event(Ptr<MemDefinitions.mem_cgroup> memcg, Ptr<EventfdDefinitions.eventfd_ctx> eventfd, String args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmpressure_unregister_event(Ptr<MemDefinitions.mem_cgroup> memcg, Ptr<EventfdDefinitions.eventfd_ctx> eventfd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmpressure_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemDefinitions.mem_cgroup> vmpressure_to_memcg(Ptr<runtime.vmpressure> vmpr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vmpressure_event")
    @NotUsableInJava
    public static class vmpressure_event
    extends Struct {
        public Ptr<EventfdDefinitions.eventfd_ctx> efd;
        public vmpressure_levels level;
        public vmpressure_modes mode;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="enum vmpressure_modes")
    public static enum vmpressure_modes implements Enum<vmpressure_modes>,
    TypedEnum<vmpressure_modes, Integer>
    {
        VMPRESSURE_NO_PASSTHROUGH,
        VMPRESSURE_HIERARCHY,
        VMPRESSURE_LOCAL,
        VMPRESSURE_NUM_MODES;

    }

    @Type(noCCodeGeneration=true, cType="enum vmpressure_levels")
    public static enum vmpressure_levels implements Enum<vmpressure_levels>,
    TypedEnum<vmpressure_levels, Integer>
    {
        VMPRESSURE_LOW,
        VMPRESSURE_MEDIUM,
        VMPRESSURE_CRITICAL,
        VMPRESSURE_NUM_LEVELS;

    }
}

