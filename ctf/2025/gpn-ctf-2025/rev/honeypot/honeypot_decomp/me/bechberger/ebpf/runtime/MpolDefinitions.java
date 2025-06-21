/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class MpolDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mempolicy> __mpol_dup(Ptr<runtime.mempolicy> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __mpol_equal(Ptr<runtime.mempolicy> a, Ptr<runtime.mempolicy> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mpol_put(Ptr<runtime.mempolicy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpol_free_shared_policy(Ptr<misc.shared_policy> sp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpol_misplaced(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_fault> vmf, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mempolicy> mpol_new(@Unsigned short mode, @Unsigned short flags, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpol_new_nodemask($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2)")
    public static int mpol_new_nodemask(Ptr<runtime.mempolicy> pol, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpol_new_preferred($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2)")
    public static int mpol_new_preferred(Ptr<runtime.mempolicy> pol, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpol_parse_str(String str, Ptr<Ptr<runtime.mempolicy>> mpol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpol_put_task_policy(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpol_rebind_default($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2)")
    public static void mpol_rebind_default(Ptr<runtime.mempolicy> pol, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpol_rebind_mm(Ptr<MmDefinitions.mm_struct> mm, Ptr<misc.nodemask_t> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpol_rebind_nodemask($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2)")
    public static void mpol_rebind_nodemask(Ptr<runtime.mempolicy> pol, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpol_rebind_policy($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2)")
    public static void mpol_rebind_policy(Ptr<runtime.mempolicy> pol, Ptr<misc.nodemask_t> newmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpol_rebind_preferred($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2)")
    public static void mpol_rebind_preferred(Ptr<runtime.mempolicy> pol, Ptr<misc.nodemask_t> nodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpol_rebind_task($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2)")
    public static void mpol_rebind_task(Ptr<TaskDefinitions.task_struct> tsk, Ptr<misc.nodemask_t> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpol_relative_nodemask($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2, (const struct {\n  long unsigned int bits[16];\n}*)$arg3)")
    public static void mpol_relative_nodemask(Ptr<misc.nodemask_t> ret, Ptr<misc.nodemask_t> orig, Ptr<misc.nodemask_t> rel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpol_set_nodemask($arg1, (const struct {\n  long unsigned int bits[16];\n}*)$arg2, $arg3)")
    public static int mpol_set_nodemask(Ptr<runtime.mempolicy> pol, Ptr<misc.nodemask_t> nodes, Ptr<misc.nodemask_scratch> nsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpol_set_shared_policy(Ptr<misc.shared_policy> sp, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<runtime.mempolicy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpol_shared_policy_init(Ptr<misc.shared_policy> sp, Ptr<runtime.mempolicy> mpol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.mempolicy> mpol_shared_policy_lookup(Ptr<misc.shared_policy> sp, @Unsigned long idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpol_to_str(String buffer, int maxlen, Ptr<runtime.mempolicy> pol) {
        throw new MethodIsBPFRelatedFunction();
    }
}

