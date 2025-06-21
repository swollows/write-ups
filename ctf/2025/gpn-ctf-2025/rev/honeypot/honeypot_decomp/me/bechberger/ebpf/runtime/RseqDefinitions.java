/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RseqDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rseq_handle_notify_resume(Ptr<runtime.ksignal> ksig, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rseq_get_rseq_cs(Ptr<TaskDefinitions.task_struct> t, Ptr<rseq_cs> rseq_cs2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rseq_ip_fixup(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rseq_update_cpu_node_id(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rseq_warn_flags((const u8*)$arg1, $arg2)")
    public static boolean rseq_warn_flags(String str, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rseq_cs")
    @NotUsableInJava
    public static class rseq_cs
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int flags;
        public @Unsigned long start_ip;
        public @Unsigned long post_commit_offset;
        public @Unsigned long abort_ip;
    }

    @Type(noCCodeGeneration=true, cType="enum rseq_cs_flags")
    public static enum rseq_cs_flags implements Enum<rseq_cs_flags>,
    TypedEnum<rseq_cs_flags, Integer>
    {
        RSEQ_CS_FLAG_NO_RESTART_ON_PREEMPT,
        RSEQ_CS_FLAG_NO_RESTART_ON_SIGNAL,
        RSEQ_CS_FLAG_NO_RESTART_ON_MIGRATE;

    }

    @Type(noCCodeGeneration=true, cType="enum rseq_flags")
    public static enum rseq_flags implements Enum<rseq_flags>,
    TypedEnum<rseq_flags, Integer>
    {
        RSEQ_FLAG_UNREGISTER;

    }

    @Type(noCCodeGeneration=true, cType="enum rseq_cpu_id_state")
    public static enum rseq_cpu_id_state implements Enum<rseq_cpu_id_state>,
    TypedEnum<rseq_cpu_id_state, Integer>
    {
        RSEQ_CPU_ID_UNINITIALIZED,
        RSEQ_CPU_ID_REGISTRATION_FAILED;

    }

    @Type(noCCodeGeneration=true, cType="enum rseq_event_mask_bits")
    public static enum rseq_event_mask_bits implements Enum<rseq_event_mask_bits>,
    TypedEnum<rseq_event_mask_bits, Integer>
    {
        RSEQ_EVENT_PREEMPT_BIT,
        RSEQ_EVENT_SIGNAL_BIT,
        RSEQ_EVENT_MIGRATE_BIT;

    }

    @Type(noCCodeGeneration=true, cType="enum rseq_cs_flags_bit")
    public static enum rseq_cs_flags_bit implements Enum<rseq_cs_flags_bit>,
    TypedEnum<rseq_cs_flags_bit, Integer>
    {
        RSEQ_CS_FLAG_NO_RESTART_ON_PREEMPT_BIT,
        RSEQ_CS_FLAG_NO_RESTART_ON_SIGNAL_BIT,
        RSEQ_CS_FLAG_NO_RESTART_ON_MIGRATE_BIT;

    }
}

