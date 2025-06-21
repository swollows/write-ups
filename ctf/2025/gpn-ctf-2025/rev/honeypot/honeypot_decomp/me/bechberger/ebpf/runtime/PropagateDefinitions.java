/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.IocDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class PropagateDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void propagate_entity_cfs_rq(Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int propagate_has_child_subreaper(Ptr<TaskDefinitions.task_struct> p, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int propagate_exception(Ptr<DevDefinitions.dev_cgroup> devcg_root, Ptr<DevDefinitions.dev_exception_item> ex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void propagate_protected_usage(Ptr<PageDefinitions.page_counter> c, @Unsigned long usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __propagate_weights(Ptr<IocDefinitions.ioc_gq> iocg, @Unsigned int active, @Unsigned int inuse, boolean save, Ptr<IocDefinitions.ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="propagate_liveness($arg1, (const struct bpf_verifier_state*)$arg2, $arg3)")
    public static int propagate_liveness(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_verifier_state> vstate, Ptr<BpfDefinitions.bpf_verifier_state> vparent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="propagate_precision($arg1, (const struct bpf_verifier_state*)$arg2)")
    public static int propagate_precision(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_verifier_state> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void propagate_weights(Ptr<IocDefinitions.ioc_gq> iocg, @Unsigned int active, @Unsigned int inuse, boolean save, Ptr<IocDefinitions.ioc_now> now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int propagate_mnt(Ptr<runtime.mount> dest_mnt, Ptr<runtime.mountpoint> dest_mp, Ptr<runtime.mount> source_mnt, Ptr<misc.hlist_head> tree_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int propagate_mount_busy(Ptr<runtime.mount> mnt, int refcnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void propagate_mount_unlock(Ptr<runtime.mount> mnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int propagate_one(Ptr<runtime.mount> m, Ptr<runtime.mountpoint> dest_mp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int propagate_umount(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }
}

