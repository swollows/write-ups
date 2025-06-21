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
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class FreezerDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void freezer_apply_state(Ptr<runtime.freezer> freezer2, boolean freeze, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void freezer_attach(Ptr<CgroupDefinitions.cgroup_taskset> tset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void freezer_change_state(Ptr<runtime.freezer> freezer2, boolean freeze) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> freezer_css_alloc(Ptr<CgroupDefinitions.cgroup_subsys_state> parent_css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void freezer_css_free(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void freezer_css_offline(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int freezer_css_online(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void freezer_fork(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long freezer_parent_freezing_read(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int freezer_read(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long freezer_self_freezing_read(Ptr<CgroupDefinitions.cgroup_subsys_state> css, Ptr<runtime.cftype> cft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long freezer_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum freezer_state_flags")
    public static enum freezer_state_flags implements Enum<freezer_state_flags>,
    TypedEnum<freezer_state_flags, Integer>
    {
        CGROUP_FREEZER_ONLINE,
        CGROUP_FREEZING_SELF,
        CGROUP_FREEZING_PARENT,
        CGROUP_FROZEN,
        CGROUP_FREEZING;

    }
}

