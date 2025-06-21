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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FuseDefinitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.Ipv4Definitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NeighDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SctpDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.StackDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.ZoneDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class InDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int in_lock_functions(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long in_tx_cp_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long in_tx_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="in_aton((const u8*)$arg1)")
    public static @Unsigned @OriginalName(value="__be32") int in_aton(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int in_dev_dump_addr(Ptr<in_device> in_dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<Integer> s_ip_idx, Ptr<InetDefinitions.inet_fill_args> fillargs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void in_dev_finish_destroy(Ptr<in_device> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void in_dev_free_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int in_egroup_p(misc.kgid_t grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int in_group_p(misc.kgid_t grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long in_use_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="in_userns((const struct user_namespace*)$arg1, (const struct user_namespace*)$arg2)")
    public static boolean in_userns(Ptr<UserDefinitions.user_namespace> ancestor, Ptr<UserDefinitions.user_namespace> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean in_entry_stack(Ptr<@Unsigned Long> stack, Ptr<StackDefinitions.stack_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="in_group_or_capable($arg1, (const struct inode*)$arg2, $arg3)")
    public static boolean in_group_or_capable(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, @OriginalName(value="vfsgid_t") misc.kgid_t vfsgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean in_rbtree_lock_required_cb(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean in_rcu_cs(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int in_sched_functions(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean in_task_stack(Ptr<@Unsigned Long> stack, Ptr<TaskDefinitions.task_struct> task2, Ptr<StackDefinitions.stack_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int in_gate_area(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int in_gate_area_no_mm(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void in_intr(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct in_validator_info")
    @NotUsableInJava
    public static class in_validator_info
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int ivi_addr;
        public Ptr<in_device> ivi_dev;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
    }

    @Type(noCCodeGeneration=true, cType="union { u8 status; struct { long long unsigned int sector; u8 status; } zone_append; }")
    @NotUsableInJava
    public static class in_hdr_of_virtblk_req
    extends Union {
        public char status;
        public ZoneDefinitions.zone_append_of_in_hdr_of_virtblk_req zone_append;
    }

    @Type(noCCodeGeneration=true, cType="struct in_pktinfo")
    @NotUsableInJava
    public static class in_pktinfo
    extends Struct {
        public int ipi_ifindex;
        public in_addr ipi_spec_dst;
        public in_addr ipi_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct in_ifaddr")
    @NotUsableInJava
    public static class in_ifaddr
    extends Struct {
        public misc.hlist_node hash;
        public Ptr<in_ifaddr> ifa_next;
        public Ptr<in_device> ifa_dev;
        public misc.callback_head callback_head;
        public @Unsigned @OriginalName(value="__be32") int ifa_local;
        public @Unsigned @OriginalName(value="__be32") int ifa_address;
        public @Unsigned @OriginalName(value="__be32") int ifa_mask;
        public @Unsigned int ifa_rt_priority;
        public @Unsigned @OriginalName(value="__be32") int ifa_broadcast;
        public char ifa_scope;
        public char ifa_prefixlen;
        public char ifa_proto;
        public @Unsigned int ifa_flags;
        public char @Size(value=16) [] ifa_label;
        public @Unsigned int ifa_valid_lft;
        public @Unsigned int ifa_preferred_lft;
        public @Unsigned long ifa_cstamp;
        public @Unsigned long ifa_tstamp;
    }

    @Type(noCCodeGeneration=true, cType="struct in_device")
    @NotUsableInJava
    public static class in_device
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public int dead;
        public Ptr<in_ifaddr> ifa_list;
        public Ptr<IpDefinitions.ip_mc_list> mc_list;
        public Ptr<Ptr<IpDefinitions.ip_mc_list>> mc_hash;
        public int mc_count;
        public  @OriginalName(value="spinlock_t") runtime.spinlock mc_tomb_lock;
        public Ptr<IpDefinitions.ip_mc_list> mc_tomb;
        public @Unsigned long mr_v1_seen;
        public @Unsigned long mr_v2_seen;
        public @Unsigned long mr_maxdelay;
        public @Unsigned long mr_qi;
        public @Unsigned long mr_qri;
        public char mr_qrv;
        public char mr_gq_running;
        public @Unsigned int mr_ifc_count;
        public TimerDefinitions.timer_list mr_gq_timer;
        public TimerDefinitions.timer_list mr_ifc_timer;
        public Ptr<NeighDefinitions.neigh_parms> arp_parms;
        public Ipv4Definitions.ipv4_devconf cnf;
        public misc.callback_head callback_head;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct __genradix tree; struct sctp_stream_in type[0]; }")
    @NotUsableInJava
    public static class in_of_sctp_stream
    extends Struct {
        public runtime.__genradix tree;
        public SctpDefinitions.sctp_stream_in @Size(value=0) [] type;
    }

    @Type(noCCodeGeneration=true, cType="struct in_addr")
    @NotUsableInJava
    public static class in_addr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int s_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct fuse_in_header h; }")
    @NotUsableInJava
    public static class in_of_fuse_req
    extends Struct {
        public FuseDefinitions.fuse_in_header h;
    }
}

