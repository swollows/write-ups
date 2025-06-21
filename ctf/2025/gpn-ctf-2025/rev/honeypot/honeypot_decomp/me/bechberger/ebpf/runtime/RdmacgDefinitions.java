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
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RdmaDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RdmacgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> rdmacg_css_alloc(Ptr<CgroupDefinitions.cgroup_subsys_state> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdmacg_css_free(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdmacg_css_offline(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdmacg_register_device(Ptr<rdmacg_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdmacg_resource_read(Ptr<SeqDefinitions.seq_file> sf, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rdmacg_resource_set_max(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdmacg_try_charge(Ptr<Ptr<RdmaDefinitions.rdma_cgroup>> rdmacg, Ptr<rdmacg_device> device2, rdmacg_resource_type index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdmacg_uncharge(Ptr<RdmaDefinitions.rdma_cgroup> cg, Ptr<rdmacg_device> device2, rdmacg_resource_type index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdmacg_uncharge_hierarchy(Ptr<RdmaDefinitions.rdma_cgroup> cg, Ptr<rdmacg_device> device2, Ptr<RdmaDefinitions.rdma_cgroup> stop_cg, rdmacg_resource_type index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdmacg_unregister_device(Ptr<rdmacg_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rdmacg_resource_pool")
    @NotUsableInJava
    public static class rdmacg_resource_pool
    extends Struct {
        public Ptr<rdmacg_device> device;
        public rdmacg_resource @Size(value=2) [] resources;
        public ListDefinitions.list_head cg_node;
        public ListDefinitions.list_head dev_node;
        public @Unsigned long usage_sum;
        public int num_max_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct rdmacg_resource")
    @NotUsableInJava
    public static class rdmacg_resource
    extends Struct {
        public int max;
        public int usage;
    }

    @Type(noCCodeGeneration=true, cType="enum rdmacg_file_type")
    public static enum rdmacg_file_type implements Enum<rdmacg_file_type>,
    TypedEnum<rdmacg_file_type, Integer>
    {
        RDMACG_RESOURCE_TYPE_MAX,
        RDMACG_RESOURCE_TYPE_STAT;

    }

    @Type(noCCodeGeneration=true, cType="enum rdmacg_resource_type")
    public static enum rdmacg_resource_type implements Enum<rdmacg_resource_type>,
    TypedEnum<rdmacg_resource_type, Integer>
    {
        RDMACG_RESOURCE_HCA_HANDLE,
        RDMACG_RESOURCE_HCA_OBJECT,
        RDMACG_RESOURCE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct rdmacg_device")
    @NotUsableInJava
    public static class rdmacg_device
    extends Struct {
        public ListDefinitions.list_head dev_node;
        public ListDefinitions.list_head rpools;
        public String name;
    }
}

