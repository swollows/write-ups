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
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.NvdimmDefinitions;
import me.bechberger.ebpf.runtime.SoftwareDefinitions;
import me.bechberger.ebpf.runtime.SplitDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class ToDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NdDefinitions.nd_btt> to_nd_btt(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NvdimmDefinitions.nvdimm_drvdata> to_ndd(Ptr<NdDefinitions.nd_mapping> nd_mapping2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nvdimm> to_nvdimm(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NdDefinitions.nd_dax> to_nd_dax(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void to_compat_ipc64_perm(Ptr<CompatDefinitions.compat_ipc64_perm> to, Ptr<misc.ipc64_perm> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void to_compat_ipc_perm(Ptr<CompatDefinitions.compat_ipc_perm> to, Ptr<misc.ipc64_perm> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NvdimmDefinitions.nvdimm_bus_descriptor> to_nd_desc(Ptr<NvdimmDefinitions.nvdimm_bus> nvdimm_bus2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NdDefinitions.nd_pfn> to_nd_pfn(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> to_nvdimm_bus_dev(Ptr<NvdimmDefinitions.nvdimm_bus> nvdimm_bus2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long to_ratio(@Unsigned long period, @Unsigned long runtime2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="to_nd_device_type((const struct device*)$arg1)")
    public static int to_nd_device_type(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NdDefinitions.nd_pfn> to_nd_pfn_safe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NdDefinitions.nd_region> to_nd_region(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NvdimmDefinitions.nvdimm_bus> to_nvdimm_bus(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void to_shrink_list(Ptr<runtime.dentry> dentry2, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct software_node*)to_software_node((const struct fwnode_handle*)$arg1))")
    public static Ptr<SoftwareDefinitions.software_node> to_software_node(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void to_utf8(Ptr<VcDefinitions.vc_data> vc2, @Unsigned @OriginalName(value="uint") int c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct to_kill")
    @NotUsableInJava
    public static class to_kill
    extends Struct {
        public ListDefinitions.list_head nd;
        public Ptr<TaskDefinitions.task_struct> tsk;
        public @Unsigned long addr;
        public short size_shift;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { long long unsigned int ip; long long unsigned int ip_sign_ext; long long unsigned int reserved; long long unsigned int spec; long long unsigned int valid; } split; long long unsigned int full; }")
    @NotUsableInJava
    public static class to_of_branch_entry
    extends Union {
        public SplitDefinitions.split_of_to_of_branch_entry split;
        public @Unsigned long full;
    }
}

