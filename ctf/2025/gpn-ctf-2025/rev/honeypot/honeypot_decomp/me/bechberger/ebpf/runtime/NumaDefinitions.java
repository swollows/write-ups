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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NumaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_add_memblk(int nid, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_add_memblk_to(int nid, @Unsigned long start, @Unsigned long end, Ptr<numa_meminfo> mi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_alloc_distance() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_cleanup_meminfo(Ptr<numa_meminfo> mi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_clear_kernel_node_hotplug() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_fill_memblks(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="numa_memblks_init((int (*)())$arg1, $arg2)")
    public static int numa_memblks_init(Ptr<?> init_func, boolean memblock_force_top_down) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_migrate_check(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_fault> vmf, @Unsigned long addr2, Ptr<Integer> flags, boolean writable, Ptr<Integer> last_cpupid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="numa_nodemask_from_meminfo($arg1, (const struct numa_meminfo*)$arg2)")
    public static void numa_nodemask_from_meminfo(Ptr<misc.nodemask_t> nodemask, Ptr<numa_meminfo> mi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_rebuild_large_mapping(Ptr<VmDefinitions.vm_fault> vmf, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<runtime.folio> folio2, PteDefinitions.pte_t fault_pte, boolean ignore_writable, boolean pte_write_upgrade) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_remove_memblk_from(int idx, Ptr<numa_meminfo> mi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_reset_distance() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_set_distance(int from, int to, int distance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long numa_node_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_default_policy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_init_sysfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_nearest_node(int node2, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_policy_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_add_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_clear_node(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_cpu_node(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="numa_init((int (*)())$arg1)")
    public static int numa_init(Ptr<?> init_func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="numa_node_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long numa_node_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_remove_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void numa_set_node(int cpu2, int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int numa_setup(String opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="numa_zonelist_order_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int numa_zonelist_order_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct numa_maps_private")
    @NotUsableInJava
    public static class numa_maps_private
    extends Struct {
        public ProcDefinitions.proc_maps_private proc_maps;
        public numa_maps md;
    }

    @Type(noCCodeGeneration=true, cType="struct numa_maps")
    @NotUsableInJava
    public static class numa_maps
    extends Struct {
        public @Unsigned long pages;
        public @Unsigned long anon;
        public @Unsigned long active;
        public @Unsigned long writeback;
        public @Unsigned long mapcount_max;
        public @Unsigned long dirty;
        public @Unsigned long swapcache;
        public @Unsigned long @Size(value=1024) [] node;
    }

    @Type(noCCodeGeneration=true, cType="struct numa_meminfo")
    @NotUsableInJava
    public static class numa_meminfo
    extends Struct {
        public int nr_blks;
        public numa_memblk @Size(value=2048) [] blk;
    }

    @Type(noCCodeGeneration=true, cType="struct numa_memblk")
    @NotUsableInJava
    public static class numa_memblk
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
        public int nid;
    }

    @Type(noCCodeGeneration=true, cType="struct numa_stats")
    @NotUsableInJava
    public static class numa_stats
    extends Struct {
        public @Unsigned long load;
        public @Unsigned long runnable;
        public @Unsigned long util;
        public @Unsigned long compute_capacity;
        public @Unsigned int nr_running;
        public @Unsigned int weight;
        public numa_type node_type;
        public int idle_cpu;
    }

    @Type(noCCodeGeneration=true, cType="enum numa_type")
    public static enum numa_type implements Enum<numa_type>,
    TypedEnum<numa_type, Integer>
    {
        node_has_spare,
        node_fully_busy,
        node_overloaded;

    }

    @Type(noCCodeGeneration=true, cType="enum numa_faults_stats")
    public static enum numa_faults_stats implements Enum<numa_faults_stats>,
    TypedEnum<numa_faults_stats, Integer>
    {
        NUMA_MEM,
        NUMA_CPU,
        NUMA_MEMBUF,
        NUMA_CPUBUF;

    }

    @Type(noCCodeGeneration=true, cType="enum numa_topology_type")
    public static enum numa_topology_type implements Enum<numa_topology_type>,
    TypedEnum<numa_topology_type, Integer>
    {
        NUMA_DIRECT,
        NUMA_GLUELESS_MESH,
        NUMA_BACKPLANE;

    }

    @Type(noCCodeGeneration=true, cType="enum numa_vmaskip_reason")
    public static enum numa_vmaskip_reason implements Enum<numa_vmaskip_reason>,
    TypedEnum<numa_vmaskip_reason, Integer>
    {
        NUMAB_SKIP_UNSUITABLE,
        NUMAB_SKIP_SHARED_RO,
        NUMAB_SKIP_INACCESSIBLE,
        NUMAB_SKIP_SCAN_DELAY,
        NUMAB_SKIP_PID_INACTIVE,
        NUMAB_SKIP_IGNORE_PID,
        NUMAB_SKIP_SEQ_COMPLETED;

    }

    @Type(noCCodeGeneration=true, cType="struct numa_group")
    @NotUsableInJava
    public static class numa_group
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public int nr_tasks;
        public @OriginalName(value="pid_t") int gid;
        public int active_nodes;
        public misc.callback_head rcu;
        public @Unsigned long total_faults;
        public @Unsigned long max_faults_cpu;
        public @Unsigned long @Size(value=0) [] faults;
    }

    @Type(noCCodeGeneration=true, cType="enum numa_stat_item")
    public static enum numa_stat_item implements Enum<numa_stat_item>,
    TypedEnum<numa_stat_item, Integer>
    {
        NUMA_HIT,
        NUMA_MISS,
        NUMA_FOREIGN,
        NUMA_INTERLEAVE_HIT,
        NUMA_LOCAL,
        NUMA_OTHER,
        NR_VM_NUMA_EVENT_ITEMS;

    }
}

