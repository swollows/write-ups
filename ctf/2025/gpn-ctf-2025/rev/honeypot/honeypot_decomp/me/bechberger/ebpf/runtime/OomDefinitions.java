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
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class OomDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__oom_kill_process($arg1, (const u8*)$arg2)")
    public static void __oom_kill_process(Ptr<TaskDefinitions.task_struct> victim, String message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __oom_reap_task_mm(Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long oom_badness(Ptr<TaskDefinitions.task_struct> p, @Unsigned long totalpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean oom_cpuset_eligible(Ptr<TaskDefinitions.task_struct> start, Ptr<oom_control> oc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int oom_evaluate_task(Ptr<TaskDefinitions.task_struct> task2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int oom_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int oom_kill_memcg_member(Ptr<TaskDefinitions.task_struct> task2, Ptr<?> message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="oom_kill_process($arg1, (const u8*)$arg2)")
    public static void oom_kill_process(Ptr<oom_control> oc, String message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean oom_killer_disable(long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void oom_killer_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int oom_reaper(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long oom_adj_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="oom_adj_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long oom_adj_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long oom_score_adj_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="oom_score_adj_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long oom_score_adj_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct oom_control")
    @NotUsableInJava
    public static class oom_control
    extends Struct {
        public Ptr<runtime.zonelist> zonelist;
        public Ptr<misc.nodemask_t> nodemask;
        public Ptr<MemDefinitions.mem_cgroup> memcg;
        public @Unsigned @OriginalName(value="gfp_t") int gfp_mask;
        public int order;
        public @Unsigned long totalpages;
        public Ptr<TaskDefinitions.task_struct> chosen;
        public long chosen_points;
        public oom_constraint constraint;
    }

    @Type(noCCodeGeneration=true, cType="enum oom_constraint")
    public static enum oom_constraint implements Enum<oom_constraint>,
    TypedEnum<oom_constraint, Integer>
    {
        CONSTRAINT_NONE,
        CONSTRAINT_CPUSET,
        CONSTRAINT_MEMORY_POLICY,
        CONSTRAINT_MEMCG;

    }
}

