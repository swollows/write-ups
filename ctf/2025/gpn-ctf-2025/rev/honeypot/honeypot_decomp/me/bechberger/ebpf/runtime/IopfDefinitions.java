/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class IopfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iopf_free_group(Ptr<iopf_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iopf_group_response(Ptr<iopf_group> group, IommuDefinitions.iommu_page_response_code status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iopf_put_dev_fault_param(Ptr<IommuDefinitions.iommu_fault_param> fault_param) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iopf_queue_add_device(Ptr<iopf_queue> queue, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iopf_queue_alloc((const u8*)$arg1)")
    public static Ptr<iopf_queue> iopf_queue_alloc(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iopf_queue_discard_partial(Ptr<iopf_queue> queue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iopf_queue_flush_dev(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iopf_queue_free(Ptr<iopf_queue> queue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iopf_queue_remove_device(Ptr<iopf_queue> queue, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct iopf_queue")
    @NotUsableInJava
    public static class iopf_queue
    extends Struct {
        public Ptr<WorkqueueDefinitions.workqueue_struct> wq;
        public ListDefinitions.list_head devices;
        public runtime.mutex lock;
    }

    @Type(noCCodeGeneration=true, cType="struct iopf_group")
    @NotUsableInJava
    public static class iopf_group
    extends Struct {
        public iopf_fault last_fault;
        public ListDefinitions.list_head faults;
        public @Unsigned long fault_count;
        public ListDefinitions.list_head pending_node;
        public misc.work_struct work;
        public Ptr<IommuDefinitions.iommu_attach_handle> attach_handle;
        public Ptr<IommuDefinitions.iommu_fault_param> fault_param;
        public ListDefinitions.list_head node;
        public @Unsigned int cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct iopf_fault")
    @NotUsableInJava
    public static class iopf_fault
    extends Struct {
        public IommuDefinitions.iommu_fault fault;
        public ListDefinitions.list_head list;
    }
}

