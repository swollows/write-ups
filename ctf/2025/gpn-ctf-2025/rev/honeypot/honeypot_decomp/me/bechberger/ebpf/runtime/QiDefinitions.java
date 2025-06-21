/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class QiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int qi_check_fault(Ptr<IntelDefinitions.intel_iommu> iommu, int index2, int wait_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_flush_context(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short did, @Unsigned short sid, char fm, @Unsigned long type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_flush_dev_iotlb(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short sid, @Unsigned short pfsid, @Unsigned short qdep, @Unsigned long addr2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_flush_dev_iotlb_pasid(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short sid, @Unsigned short pfsid, @Unsigned int pasid, @Unsigned short qdep, @Unsigned long addr2, @Unsigned int size_order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_flush_iotlb(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short did, @Unsigned long addr2, @Unsigned int size_order, @Unsigned long type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_flush_pasid_cache(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short did, @Unsigned long granu, @Unsigned int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_flush_piotlb(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short did, @Unsigned int pasid, @Unsigned long addr2, @Unsigned long npages, boolean ih) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_global_iec(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int qi_submit_sync(Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<qi_desc> desc, @Unsigned int count, @Unsigned long options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_batch_add_dev_iotlb(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short sid, @Unsigned short pfsid, @Unsigned short qdep, @Unsigned long addr2, @Unsigned int mask, Ptr<qi_batch> batch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_batch_add_pasid_dev_iotlb(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short sid, @Unsigned short pfsid, @Unsigned int pasid, @Unsigned short qdep, @Unsigned long addr2, @Unsigned int size_order, Ptr<qi_batch> batch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qi_batch_flush_descs(Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<qi_batch> batch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct qi_batch")
    @NotUsableInJava
    public static class qi_batch
    extends Struct {
        public qi_desc @Size(value=16) [] descs;
        public @Unsigned int index;
    }

    @Type(noCCodeGeneration=true, cType="struct qi_desc")
    @NotUsableInJava
    public static class qi_desc
    extends Struct {
        public @Unsigned long qw0;
        public @Unsigned long qw1;
        public @Unsigned long qw2;
        public @Unsigned long qw3;
    }
}

