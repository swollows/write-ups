/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.IbDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RdmaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdma_dim(Ptr<runtime.dim> dim2, @Unsigned long completions) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rdma_user_mmap_entry")
    @NotUsableInJava
    public static class rdma_user_mmap_entry
    extends Struct {
        public runtime.kref ref;
        public Ptr<IbDefinitions.ib_ucontext> ucontext;
        public @Unsigned long start_pgoff;
        public @Unsigned long npages;
        public boolean driver_removed;
    }

    @Type(noCCodeGeneration=true, cType="struct rdma_netdev_alloc_params")
    @NotUsableInJava
    public static class rdma_netdev_alloc_params
    extends Struct {
        public @Unsigned long sizeof_priv;
        public @Unsigned int txqs;
        public @Unsigned int rxqs;
        public Ptr<?> param;
        public Ptr<?> initialize_rdma_netdev;
    }

    @Type(noCCodeGeneration=true, cType="enum rdma_netdev_t")
    public static enum rdma_netdev_t implements Enum<rdma_netdev_t>,
    TypedEnum<rdma_netdev_t, Integer>
    {
        RDMA_NETDEV_OPA_VNIC,
        RDMA_NETDEV_IPOIB;

    }

    @Type(noCCodeGeneration=true, cType="enum rdma_ah_attr_type")
    public static enum rdma_ah_attr_type implements Enum<rdma_ah_attr_type>,
    TypedEnum<rdma_ah_attr_type, Integer>
    {
        RDMA_AH_ATTR_TYPE_UNDEFINED,
        RDMA_AH_ATTR_TYPE_IB,
        RDMA_AH_ATTR_TYPE_ROCE,
        RDMA_AH_ATTR_TYPE_OPA;

    }

    @Type(noCCodeGeneration=true, cType="struct rdma_ah_attr")
    @NotUsableInJava
    public static class rdma_ah_attr
    extends Struct {
        public IbDefinitions.ib_global_route grh;
        public char sl;
        public char static_rate;
        public @Unsigned int port_num;
        public char ah_flags;
        public rdma_ah_attr_type type;
        @InlineUnion(value=26199)
        public @InlineUnion(value=26199) IbDefinitions.ib_ah_attr ib;
        @InlineUnion(value=26199)
        public @InlineUnion(value=26199) misc.roce_ah_attr roce;
        @InlineUnion(value=26199)
        public @InlineUnion(value=26199) misc.opa_ah_attr opa;
    }

    @Type(noCCodeGeneration=true, cType="struct rdma_ah_init_attr")
    @NotUsableInJava
    public static class rdma_ah_init_attr
    extends Struct {
        public Ptr<rdma_ah_attr> ah_attr;
        public @Unsigned int flags;
        public Ptr<NetDefinitions.net_device> xmit_slave;
    }

    @Type(noCCodeGeneration=true, cType="struct rdma_stat_desc")
    @NotUsableInJava
    public static class rdma_stat_desc
    extends Struct {
        public String name;
        public @Unsigned int flags;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="enum rdma_link_layer")
    public static enum rdma_link_layer implements Enum<rdma_link_layer>,
    TypedEnum<rdma_link_layer, Integer>
    {
        IB_LINK_LAYER_UNSPECIFIED,
        IB_LINK_LAYER_INFINIBAND,
        IB_LINK_LAYER_ETHERNET;

    }

    @Type(noCCodeGeneration=true, cType="enum rdma_driver_id")
    public static enum rdma_driver_id implements Enum<rdma_driver_id>,
    TypedEnum<rdma_driver_id, Integer>
    {
        RDMA_DRIVER_UNKNOWN,
        RDMA_DRIVER_MLX5,
        RDMA_DRIVER_MLX4,
        RDMA_DRIVER_CXGB3,
        RDMA_DRIVER_CXGB4,
        RDMA_DRIVER_MTHCA,
        RDMA_DRIVER_BNXT_RE,
        RDMA_DRIVER_OCRDMA,
        RDMA_DRIVER_NES,
        RDMA_DRIVER_I40IW,
        RDMA_DRIVER_IRDMA,
        RDMA_DRIVER_VMW_PVRDMA,
        RDMA_DRIVER_QEDR,
        RDMA_DRIVER_HNS,
        RDMA_DRIVER_USNIC,
        RDMA_DRIVER_RXE,
        RDMA_DRIVER_HFI1,
        RDMA_DRIVER_QIB,
        RDMA_DRIVER_EFA,
        RDMA_DRIVER_SIW,
        RDMA_DRIVER_ERDMA,
        RDMA_DRIVER_MANA;

    }

    @Type(noCCodeGeneration=true, cType="struct rdma_counter")
    @NotUsableInJava
    public static class rdma_counter
    extends Struct {
        public rdma_restrack_entry res;
        public Ptr<IbDefinitions.ib_device> device;
        public @Unsigned @OriginalName(value="uint32_t") int id;
        public runtime.kref kref;
        public rdma_counter_mode mode;
        public runtime.mutex lock;
        public Ptr<rdma_hw_stats> stats;
        public @Unsigned int port;
    }

    @Type(noCCodeGeneration=true, cType="struct rdma_hw_stats")
    @NotUsableInJava
    public static class rdma_hw_stats
    extends Struct {
        public runtime.mutex lock;
        public @Unsigned long timestamp;
        public @Unsigned long lifespan;
        public Ptr<rdma_stat_desc> descs;
        public Ptr<@Unsigned Long> is_disabled;
        public int num_counters;
        public @Unsigned long @Size(value=0) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct rdma_port_counter")
    @NotUsableInJava
    public static class rdma_port_counter
    extends Struct {
        public rdma_counter_mode mode;
        public Ptr<rdma_hw_stats> hstats;
        public @Unsigned int num_counters;
        public runtime.mutex lock;
    }

    @Type(noCCodeGeneration=true, cType="struct rdma_counter_mode")
    @NotUsableInJava
    public static class rdma_counter_mode
    extends Struct {
        public rdma_nl_counter_mode mode;
        public rdma_nl_counter_mask mask;
        public misc.auto_mode_param param;
    }

    @Type(noCCodeGeneration=true, cType="struct rdma_link_ops")
    @NotUsableInJava
    public static class rdma_link_ops
    extends Struct {
        public ListDefinitions.list_head list;
        public String type;
        public Ptr<?> newlink;
    }

    @Type(noCCodeGeneration=true, cType="struct rdma_restrack_entry")
    @NotUsableInJava
    public static class rdma_restrack_entry
    extends Struct {
        public boolean valid;
        public char no_track;
        public runtime.kref kref;
        public runtime.completion comp;
        public Ptr<TaskDefinitions.task_struct> task;
        public String kern_name;
        public rdma_restrack_type type;
        public boolean user;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="enum rdma_restrack_type")
    public static enum rdma_restrack_type implements Enum<rdma_restrack_type>,
    TypedEnum<rdma_restrack_type, Integer>
    {
        RDMA_RESTRACK_PD,
        RDMA_RESTRACK_CQ,
        RDMA_RESTRACK_QP,
        RDMA_RESTRACK_CM_ID,
        RDMA_RESTRACK_MR,
        RDMA_RESTRACK_CTX,
        RDMA_RESTRACK_COUNTER,
        RDMA_RESTRACK_SRQ,
        RDMA_RESTRACK_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum rdma_nl_name_assign_type")
    public static enum rdma_nl_name_assign_type implements Enum<rdma_nl_name_assign_type>,
    TypedEnum<rdma_nl_name_assign_type, Integer>
    {
        RDMA_NAME_ASSIGN_TYPE_UNKNOWN,
        RDMA_NAME_ASSIGN_TYPE_USER;

    }

    @Type(noCCodeGeneration=true, cType="enum rdma_nl_dev_type")
    public static enum rdma_nl_dev_type implements Enum<rdma_nl_dev_type>,
    TypedEnum<rdma_nl_dev_type, Integer>
    {
        RDMA_DEVICE_TYPE_SMI;

    }

    @Type(noCCodeGeneration=true, cType="enum rdma_nl_counter_mask")
    public static enum rdma_nl_counter_mask implements Enum<rdma_nl_counter_mask>,
    TypedEnum<rdma_nl_counter_mask, Integer>
    {
        RDMA_COUNTER_MASK_QP_TYPE,
        RDMA_COUNTER_MASK_PID;

    }

    @Type(noCCodeGeneration=true, cType="enum rdma_nl_counter_mode")
    public static enum rdma_nl_counter_mode implements Enum<rdma_nl_counter_mode>,
    TypedEnum<rdma_nl_counter_mode, Integer>
    {
        RDMA_COUNTER_MODE_NONE,
        RDMA_COUNTER_MODE_AUTO,
        RDMA_COUNTER_MODE_MANUAL,
        RDMA_COUNTER_MODE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct rdma_cgroup")
    @NotUsableInJava
    public static class rdma_cgroup
    extends Struct {
        public CgroupDefinitions.cgroup_subsys_state css;
        public ListDefinitions.list_head rpools;
    }
}

