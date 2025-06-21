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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.IovaDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.KsmDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MqueueDefinitions;
import me.bechberger.ebpf.runtime.NhDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.PudDefinitions;
import me.bechberger.ebpf.runtime.RtDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.VirtnetDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WatchDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RemoveDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __remove_instance(Ptr<TraceDefinitions.trace_array> tr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __remove_subdev(Ptr<runtime.device> dev, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_and_add_spares(Ptr<runtime.mddev> mddev2, Ptr<MdDefinitions.md_rdev> _this) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int remove_device_exclusive_entry(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_entity_load_avg(Ptr<SchedDefinitions.sched_entity> se) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_iommu_group(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_iter(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_kmmio_fault_pages(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean remove_migration_pte(Ptr<runtime.folio> folio2, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_migration_ptes(Ptr<runtime.folio> src, Ptr<runtime.folio> dst, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_p4d_table(Ptr<misc.p4d_t> p4d_start, @Unsigned long addr2, @Unsigned long end, Ptr<misc.vmem_altmap> altmap, boolean direct) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_pagetable(@Unsigned long start, @Unsigned long end, boolean direct, Ptr<misc.vmem_altmap> altmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_partial(Ptr<KmemDefinitions.kmem_cache_node> n, Ptr<runtime.slab> slab2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_pmd_table(Ptr<PmdDefinitions.pmd_t> pmd_start, @Unsigned long addr2, @Unsigned long end, boolean direct, Ptr<misc.vmem_altmap> altmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_pud_table(Ptr<PudDefinitions.pud_t> pud_start, @Unsigned long addr2, @Unsigned long end, Ptr<misc.vmem_altmap> altmap, boolean direct) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_securityfs_measurement_lists(Ptr<Ptr<runtime.dentry>> lists) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="remove_vm_area((const void*)$arg1)")
    public static Ptr<VmDefinitions.vm_struct> remove_vm_area(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_waiter(Ptr<RtDefinitions.rt_mutex_base> lock, Ptr<RtDefinitions.rt_mutex_waiter> waiter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __remove_mapping(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2, boolean reclaimed, Ptr<MemDefinitions.mem_cgroup> target_memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __remove_memory(@Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __remove_pages(@Unsigned long pfn, @Unsigned long nr_pages, Ptr<misc.vmem_altmap> altmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_compat_control_link(Ptr<DrmDefinitions.drm_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_dev_resource(Ptr<runtime.resource> avail, Ptr<PciDefinitions.pci_dev> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_free_mem_region(Ptr<?> _res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_hugetlb_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2, boolean adjust_surplus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="remove_id_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long remove_id_store(Ptr<DeviceDefinitions.device_driver> driver, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_inode_buffers(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long remove_mapping(Ptr<misc.address_space> mapping, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_memory(@Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_memory_blocks_and_altmaps(@Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_one(Ptr<runtime.dentry> victim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_pfn_range_from_zone(Ptr<runtime.zone> zone2, @Unsigned long start_pfn, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.folio> remove_pool_hugetlb_folio(Ptr<runtime.hstate> h, Ptr<misc.nodemask_t> nodes_allowed, boolean acct_surplus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_resource(Ptr<runtime.resource> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_siblinginfo(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_vma(Ptr<VmDefinitions.vm_area_struct> vma, boolean unreachable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_wait_queue(Ptr<WaitDefinitions.wait_queue_head> wq_head, Ptr<WaitDefinitions.wait_queue_entry> wq_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __remove_hrtimer(Ptr<runtime.hrtimer> timer, Ptr<HrtimerDefinitions.hrtimer_clock_base> base, char newstate, int reprogram) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __remove_inode_hash(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __remove_nexthop(Ptr<runtime.net> net2, Ptr<runtime.nexthop> nh, Ptr<misc.nl_info> nlinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __remove_pending(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_lblk_t") int lblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_all(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_arg_zero(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="remove_files($arg1, (const struct attribute_group*)$arg2)")
    public static void remove_files(Ptr<KernfsDefinitions.kernfs_node> parent, Ptr<AttributeDefinitions.attribute_group> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long remove_id_show(Ptr<DeviceDefinitions.device_driver> driver, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_inode_hugepages(Ptr<runtime.inode> inode2, @OriginalName(value="loff_t") long lstart, @OriginalName(value="loff_t") long lend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_iova(Ptr<IovaDefinitions.iova_domain> iovad, Ptr<runtime.iova> iova2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_nexthop(Ptr<runtime.net> net2, Ptr<runtime.nexthop> nh, Ptr<misc.nl_info> nlinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_nh_grp_entry(Ptr<runtime.net> net2, Ptr<NhDefinitions.nh_grp_entry> nhge, Ptr<misc.nl_info> nlinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="remove_proc_entry((const u8*)$arg1, $arg2)")
    public static void remove_proc_entry(String name, Ptr<ProcDefinitions.proc_dir_entry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="remove_proc_subtree((const u8*)$arg1, $arg2)")
    public static int remove_proc_subtree(String name, Ptr<ProcDefinitions.proc_dir_entry> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="remove_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long remove_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_vq_common(Ptr<VirtnetDefinitions.virtnet_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_watch_from_object(Ptr<WatchDefinitions.watch_list> wlist, Ptr<WatchDefinitions.watch_queue> wq, @Unsigned long id, boolean all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean remove_xps_queue(Ptr<misc.xps_dev_maps> dev_maps, Ptr<misc.xps_dev_maps> old_maps, int tci, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_all_stable_nodes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_common(Ptr<VirtioDefinitions.virtio_balloon> vb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_cpu_dev_symlink(Ptr<CpufreqDefinitions.cpufreq_policy> policy, int cpu2, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_event_file_dir(Ptr<TraceDefinitions.trace_event_file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_hist_vars(Ptr<HistDefinitions.hist_trigger_data> hist_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_memory_block(Ptr<MemoryDefinitions.memory_block> memory) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_memory_block_devices(@Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_migration_pmd(Ptr<PageDefinitions.page_vma_mapped_walk> pvmw, Ptr<runtime.page> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_node_from_stable_tree(Ptr<KsmDefinitions.ksm_stable_node> stable_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_notification(Ptr<MqueueDefinitions.mqueue_inode_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_percpu_irq(@Unsigned int irq, Ptr<runtime.irqaction> act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_rmap_item_from_tree(Ptr<KsmDefinitions.ksm_rmap_item> rmap_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int remove_stable_node(Ptr<KsmDefinitions.ksm_stable_node> stable_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void remove_vqs(Ptr<misc.ports_device> portdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int start; long long unsigned int end; }")
    @NotUsableInJava
    public static class remove_of_arg_of_uffd_msg
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
    }
}

