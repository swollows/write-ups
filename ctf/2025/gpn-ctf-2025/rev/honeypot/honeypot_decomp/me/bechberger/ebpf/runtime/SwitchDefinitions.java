/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class SwitchDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switch_mm(Ptr<MmDefinitions.mm_struct> prev, Ptr<MmDefinitions.mm_struct> next, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switch_mm_irqs_off(Ptr<MmDefinitions.mm_struct> unused, Ptr<MmDefinitions.mm_struct> next, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switch_task_namespaces(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.nsproxy> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> __switch_to(Ptr<TaskDefinitions.task_struct> prev_p, Ptr<TaskDefinitions.task_struct> next_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switch_fpu_return() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __switch_to_xtra(Ptr<TaskDefinitions.task_struct> prev_p, Ptr<TaskDefinitions.task_struct> next_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switch_ldt(Ptr<MmDefinitions.mm_struct> prev, Ptr<MmDefinitions.mm_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __switch_to_asm() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switch_class(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> next) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switch_gdt_and_percpu_base(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum switch_power_state")
    public static enum switch_power_state implements Enum<switch_power_state>,
    TypedEnum<switch_power_state, Integer>
    {
        DRM_SWITCH_POWER_ON,
        DRM_SWITCH_POWER_OFF,
        DRM_SWITCH_POWER_CHANGING,
        DRM_SWITCH_POWER_DYNAMIC_OFF;

    }
}

