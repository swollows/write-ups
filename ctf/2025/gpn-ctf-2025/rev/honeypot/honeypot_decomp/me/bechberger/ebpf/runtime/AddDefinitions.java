/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BootDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CmdlineDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FirmwareDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.HugetlbDefinitions;
import me.bechberger.ebpf.runtime.ImaDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.LandlockDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmcDefinitions;
import me.bechberger.ebpf.runtime.ModuleDefinitions;
import me.bechberger.ebpf.runtime.MpDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NlaDefinitions;
import me.bechberger.ebpf.runtime.OhciDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.OppDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PolicyDefinitions;
import me.bechberger.ebpf.runtime.PowerDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.VirtnetDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WatchDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class AddDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __add_badblock_range(Ptr<runtime.badblocks> bb, @Unsigned long ns_offset, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __add_to_kill(Ptr<TaskDefinitions.task_struct> tsk, Ptr<runtime.page> p, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<ListDefinitions.list_head> to_kill2, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_addr($arg1, (const struct in6_addr*)$arg2, $arg3, $arg4, $arg5)")
    public static void add_addr(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<In6Definitions.in6_addr> addr2, int plen, int scope, char proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_bootloader_randomness((const void*)$arg1, $arg2)")
    public static void add_bootloader_randomness(Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_bound_rdev(Ptr<MdDefinitions.md_rdev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_device_randomness((const void*)$arg1, $arg2)")
    public static void add_device_randomness(Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_disk_randomness(Ptr<runtime.gendisk> disk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_dock_dependent_device(Ptr<misc.dock_station> ds, Ptr<AcpiDefinitions.acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_dquot_ref(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_e820_entry(Ptr<BootDefinitions.boot_params> params, Ptr<misc.e820_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_hwgenerator_randomness((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static void add_hwgenerator_randomness(Ptr<?> buf, @Unsigned long len, @Unsigned long entropy, boolean sleep_after) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_input_randomness(@Unsigned int type2, @Unsigned int code2, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_interrupt_randomness(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_mem_pool(Ptr<IoDefinitions.io_tlb_mem> mem, Ptr<IoDefinitions.io_tlb_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_mm_counter(Ptr<MmDefinitions.mm_struct> mm, int member, long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_named_array((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int add_named_array(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_pages(int nid, @Unsigned long start_pfn, @Unsigned long nr_pages, Ptr<misc.mhp_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_part(int slot2, Ptr<CmdlineDefinitions.cmdline_subpart> subpart, Ptr<misc.parsed_partitions> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_pcspkr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean add_pin_to_irq_node(Ptr<MpDefinitions.mp_chip_data> data, int node2, int apic2, int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_policy($arg1, (const struct nla_policy*)$arg2, $arg3)")
    public static int add_policy(Ptr<Ptr<NetlinkDefinitions.netlink_policy_dump_state>> statep, Ptr<NlaDefinitions.nla_policy> policy, @Unsigned int maxtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_quirk(Ptr<MmcDefinitions.mmc_card> card, int data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_quirk_sd(Ptr<MmcDefinitions.mmc_card> card, int data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_rtc_cmos() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_rule_net_port($arg1, (const const void*)$arg2)")
    public static int add_rule_net_port(Ptr<LandlockDefinitions.landlock_ruleset> ruleset, Ptr<?> rule_attr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_rule_path_beneath((const struct landlock_ruleset*)$arg1, (const const void*)$arg2)")
    public static int add_rule_path_beneath(Ptr<LandlockDefinitions.landlock_ruleset> ruleset, Ptr<?> rule_attr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_sysfs_param($arg1, (const struct kernel_param*)$arg2, (const u8*)$arg3)")
    public static int add_sysfs_param(Ptr<ModuleDefinitions.module_kobject> mk, Ptr<KernelDefinitions.kernel_param> kp, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_taint(@Unsigned int flag, misc.lockdep_ok lockdep_ok2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_taint_module(Ptr<runtime.module> mod, @Unsigned int flag, misc.lockdep_ok lockdep_ok2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_timer_randomness(Ptr<TimerDefinitions.timer_rand_state> state2, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_to_done_list(Ptr<OhciDefinitions.ohci_hcd> ohci, Ptr<runtime.td> td2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_to_kill_ksm(Ptr<TaskDefinitions.task_struct> tsk, Ptr<runtime.page> p, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<ListDefinitions.list_head> to_kill2, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_to_machine_keyring((const u8*)$arg1, (const void*)$arg2, $arg3)")
    public static void add_to_machine_keyring(String source, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_to_page_cache_lru(Ptr<runtime.page> page2, Ptr<misc.address_space> mapping, @Unsigned long index2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long add_to_pipe(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<PipeDefinitions.pipe_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_to_platform_keyring((const u8*)$arg1, (const void*)$arg2, $arg3)")
    public static void add_to_platform_keyring(String source, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_tracer_options(Ptr<TraceDefinitions.trace_array> tr, Ptr<runtime.tracer> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_transaction_credits(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, int blocks, int rsv_blocks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_v4_addrs(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_vmfork_randomness((const void*)$arg1, $arg2)")
    public static void add_vmfork_randomness(Ptr<?> unique_vm_id, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __add_hash_entry(Ptr<FtraceDefinitions.ftrace_hash> hash2, Ptr<FtraceDefinitions.ftrace_func_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __add_memory(int nid, @Unsigned long start, @Unsigned long size, @OriginalName(value="mhp_t") int mhp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __add_pages(int nid, @Unsigned long pfn, @Unsigned long nr_pages, Ptr<misc.mhp_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_add_opp_dev((const struct device*)$arg1, $arg2)")
    public static Ptr<OppDefinitions.opp_device> _add_opp_dev(Ptr<runtime.device> dev, Ptr<OppDefinitions.opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<OppDefinitions.opp_table> _add_opp_table_indexed(Ptr<runtime.device> dev, int index2, boolean getclk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long add_addr_generate_hmac(@Unsigned long key1, @Unsigned long key2, Ptr<MptcpDefinitions.mptcp_addr_info> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_encrypt_protection_map() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FtraceDefinitions.ftrace_func_entry> add_hash_entry(Ptr<FtraceDefinitions.ftrace_hash> hash2, @Unsigned long ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_hugetlb_folio(Ptr<runtime.hstate> h, Ptr<runtime.folio> folio2, boolean adjust_surplus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_kallsyms($arg1, (const struct load_info*)$arg2)")
    public static void add_kallsyms(Ptr<runtime.module> mod, Ptr<LoadDefinitions.load_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_key_to_revocation_list((const u8*)$arg1, $arg2)")
    public static int add_key_to_revocation_list(String data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_limit_rate_quirk(Ptr<MmcDefinitions.mmc_card> card, int data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_master_key(Ptr<SuperDefinitions.super_block> sb, Ptr<FscryptDefinitions.fscrypt_master_key_secret> secret, Ptr<FscryptDefinitions.fscrypt_key_specifier> key_spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_master_key_user(Ptr<FscryptDefinitions.fscrypt_master_key> mk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_memory(int nid, @Unsigned long start, @Unsigned long size, @OriginalName(value="mhp_t") int mhp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_memory_driver_managed($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int add_memory_driver_managed(int nid, @Unsigned long start, @Unsigned long size, String resource_name, @OriginalName(value="mhp_t") int mhp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_memory_resource(int nid, Ptr<runtime.resource> res, @OriginalName(value="mhp_t") int mhp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_new_gdb(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_new_gdb_meta_bg(Ptr<SuperDefinitions.super_block> sb, Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BlockDefinitions.block_device> add_partition(Ptr<runtime.gendisk> disk, int partno, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, int flags, Ptr<misc.partition_meta_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_preferred_console((const u8*)$arg1, (const short int)$arg2, $arg3)")
    public static int add_preferred_console(String name, short idx, String options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long add_reservation_in_range(Ptr<misc.resv_map> resv, long f, long t, Ptr<HugetlbDefinitions.hugetlb_cgroup> h_cg, Ptr<runtime.hstate> h, Ptr<Long> regions_needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_rules(Ptr<ImaDefinitions.ima_rule_entry> entries, int count, PolicyDefinitions.policy_rule_list policy_rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EfiDefinitions.efi_runtime_map_entry> add_sysfs_runtime_map_entry(Ptr<runtime.kobject> kobj, int nr, Ptr<EfiDefinitions.efi_memory_desc_t> md) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_timer(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_timer_global(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_timer_local(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_timer_on(Ptr<TimerDefinitions.timer_list> timer, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_to_list(Ptr<ListDefinitions.list_head> head, Ptr<PciDefinitions.pci_dev> dev, Ptr<runtime.resource> res, @Unsigned @OriginalName(value="resource_size_t") long add_size, @Unsigned @OriginalName(value="resource_size_t") long min_align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean add_to_swap(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_to_swap_cache(Ptr<runtime.folio> folio2, misc.swp_entry_t entry, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<Ptr<?>> shadowp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_uevent_var($arg1, (const u8*)$arg2, $arg3_)")
    public static int add_uevent_var(Ptr<KobjDefinitions.kobj_uevent_env> env, String format, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_wait_queue(Ptr<WaitDefinitions.wait_queue_head> wq_head, Ptr<WaitDefinitions.wait_queue_entry> wq_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_wait_queue_exclusive(Ptr<WaitDefinitions.wait_queue_head> wq_head, Ptr<WaitDefinitions.wait_queue_entry> wq_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_wait_queue_priority(Ptr<WaitDefinitions.wait_queue_head> wq_head, Ptr<WaitDefinitions.wait_queue_entry> wq_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __add_profile(Ptr<ListDefinitions.list_head> list, Ptr<AaDefinitions.aa_profile> profile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_acpi_hid_device(Ptr<Character> hid, Ptr<Character> uid, Ptr<@Unsigned Integer> devid, boolean cmd_line) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_alternate_cea_modes($arg1, (const struct drm_edid*)$arg2)")
    public static int add_alternate_cea_modes(Ptr<DrmDefinitions.drm_connector> connector, Ptr<DrmDefinitions.drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_cea_modes($arg1, (const struct drm_edid*)$arg2)")
    public static int add_cea_modes(Ptr<DrmDefinitions.drm_connector> connector, Ptr<DrmDefinitions.drm_edid> drm_edid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_dirent_to_buf(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<Ext4Definitions.ext4_filename> fname2, Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_dir_entry_2> de, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_kfunc_call(Ptr<BpfDefinitions.bpf_verifier_env> env, @Unsigned int func_id, short offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_notes_attrs($arg1, (const struct load_info*)$arg2)")
    public static int add_notes_attrs(Ptr<runtime.module> mod, Ptr<LoadDefinitions.load_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_recvbuf_big(Ptr<VirtnetDefinitions.virtnet_info> vi, Ptr<misc.receive_queue> rq2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_sect_attrs($arg1, (const struct load_info*)$arg2)")
    public static int add_sect_attrs(Ptr<runtime.module> mod, Ptr<LoadDefinitions.load_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_softcursor(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_special_device(char type2, char id, Ptr<@Unsigned Integer> devid, boolean cmd_line) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_subprog(Ptr<BpfDefinitions.bpf_verifier_env> env, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_subprog_and_kfunc(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_watch_to_object(Ptr<runtime.watch> watch2, Ptr<WatchDefinitions.watch_list> wlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_weighted_interleave_group(Ptr<runtime.kobject> root_kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_boot_memory_block(@Unsigned long base_section_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Character> add_bytestring_header(Ptr<Integer> err, Ptr<OpalDefinitions.opal_dev> cmd, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_cpu_dev_symlink(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int cpu2, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_del_listener($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int add_del_listener(@OriginalName(value="pid_t") int pid2, Ptr<runtime.cpumask> mask, int isadd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_hole(Ptr<DrmDefinitions.drm_mm_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_map_entry(@Unsigned long start, @Unsigned long end, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_map_entry_at(@Unsigned long start, @Unsigned long end, char type2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_memory_block(@Unsigned long block_id, @Unsigned long state2, Ptr<misc.vmem_altmap> altmap, Ptr<MemoryDefinitions.memory_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_port(Ptr<misc.ports_device> portdev, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_prop_uevent((const struct device*)$arg1, $arg2, $arg3, $arg4)")
    public static int add_prop_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env, PowerDefinitions.power_supply_property prop, String prop_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_range(Ptr<runtime.range> range2, int az, int nr_range, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_range_with_merge(Ptr<runtime.range> range2, int az, int nr_range, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_setting($arg1, $arg2, (const struct pinctrl_map*)$arg3)")
    public static int add_setting(Ptr<runtime.pinctrl> p, Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<PinctrlDefinitions.pinctrl_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_swap_count_continuation(misc.swp_entry_t entry, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_swap_extent(Ptr<SwapDefinitions.swap_info_struct> sis, @Unsigned long start_page, @Unsigned long nr_pages, @Unsigned @OriginalName(value="sector_t") long start_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_sysfs_fw_map_entry(Ptr<FirmwareDefinitions.firmware_map_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_system_zone(Ptr<Ext4Definitions.ext4_system_blocks> system_blks, @Unsigned @OriginalName(value="ext4_fsblk_t") long start_blk, @Unsigned int count, @Unsigned int ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_to_avail_list(Ptr<SwapDefinitions.swap_info_struct> si) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_to_key(String compound_key, Ptr<?> key2, Ptr<HistDefinitions.hist_field> key_field, Ptr<?> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_to_secondary_keyring((const u8*)$arg1, (const void*)$arg2, $arg3)")
    public static void add_to_secondary_keyring(String source, Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="add_token_bytestring($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void add_token_bytestring(Ptr<Integer> err, Ptr<OpalDefinitions.opal_dev> cmd, Ptr<Character> bytestring, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_token_u64(Ptr<Integer> err, Ptr<OpalDefinitions.opal_dev> cmd, @Unsigned long number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void add_token_u8(Ptr<Integer> err, Ptr<OpalDefinitions.opal_dev> cmd, char tok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_user_to_lr(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int add_user_to_lr_ace(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }
}

