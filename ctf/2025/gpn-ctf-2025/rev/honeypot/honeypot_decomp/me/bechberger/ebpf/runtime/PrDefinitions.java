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
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pr_cont_kernfs_name(Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pr_cont_kernfs_path(Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pr_cont_pool_info(Ptr<misc.worker_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pr_cont_work(boolean comma, Ptr<misc.work_struct> work, Ptr<pr_cont_work_struct> pcwsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pr_cont_work_flush(boolean comma, @OriginalName(value="work_func_t") Ptr<?> func, Ptr<pr_cont_work_struct> pcwsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pr_cont_worker_id(Ptr<runtime.worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum pr_status")
    public static enum pr_status implements Enum<pr_status>,
    TypedEnum<pr_status, Integer>
    {
        PR_STS_SUCCESS,
        PR_STS_IOERR,
        PR_STS_RESERVATION_CONFLICT,
        PR_STS_RETRY_PATH_FAILURE,
        PR_STS_PATH_FAST_FAILED,
        PR_STS_PATH_FAILED;

    }

    @Type(noCCodeGeneration=true, cType="struct pr_held_reservation")
    @NotUsableInJava
    public static class pr_held_reservation
    extends Struct {
        public @Unsigned long key;
        public @Unsigned int generation;
        public pr_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct pr_keys")
    @NotUsableInJava
    public static class pr_keys
    extends Struct {
        public @Unsigned int generation;
        public @Unsigned int num_keys;
        public @Unsigned long @Size(value=0) [] keys;
    }

    @Type(noCCodeGeneration=true, cType="struct pr_clear")
    @NotUsableInJava
    public static class pr_clear
    extends Struct {
        public @Unsigned long key;
        public @Unsigned int flags;
        public @Unsigned int __pad;
    }

    @Type(noCCodeGeneration=true, cType="struct pr_preempt")
    @NotUsableInJava
    public static class pr_preempt
    extends Struct {
        public @Unsigned long old_key;
        public @Unsigned long new_key;
        public @Unsigned int type;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pr_registration")
    @NotUsableInJava
    public static class pr_registration
    extends Struct {
        public @Unsigned long old_key;
        public @Unsigned long new_key;
        public @Unsigned int flags;
        public @Unsigned int __pad;
    }

    @Type(noCCodeGeneration=true, cType="struct pr_reservation")
    @NotUsableInJava
    public static class pr_reservation
    extends Struct {
        public @Unsigned long key;
        public @Unsigned int type;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum pr_type")
    public static enum pr_type implements Enum<pr_type>,
    TypedEnum<pr_type, Integer>
    {
        PR_WRITE_EXCLUSIVE,
        PR_EXCLUSIVE_ACCESS,
        PR_WRITE_EXCLUSIVE_REG_ONLY,
        PR_EXCLUSIVE_ACCESS_REG_ONLY,
        PR_WRITE_EXCLUSIVE_ALL_REGS,
        PR_EXCLUSIVE_ACCESS_ALL_REGS;

    }

    @Type(noCCodeGeneration=true, cType="struct pr_cont_work_struct")
    @NotUsableInJava
    public static class pr_cont_work_struct
    extends Struct {
        public boolean comma;
        public @OriginalName(value="work_func_t") Ptr<?> func;
        public long ctr;
    }

    @Type(noCCodeGeneration=true, cType="struct pr_ops")
    @NotUsableInJava
    public static class pr_ops
    extends Struct {
        public Ptr<?> pr_register;
        public Ptr<?> pr_reserve;
        public Ptr<?> pr_release;
        public Ptr<?> pr_preempt;
        public Ptr<?> pr_clear;
        public Ptr<?> pr_read_keys;
        public Ptr<?> pr_read_reservation;
    }
}

