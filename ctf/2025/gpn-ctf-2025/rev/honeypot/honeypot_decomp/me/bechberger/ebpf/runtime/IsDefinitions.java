/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.ChargerDefinitions;
import me.bechberger.ebpf.runtime.CoreDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.KprobeDefinitions;
import me.bechberger.ebpf.runtime.LandlockDefinitions;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.Pkcs7Definitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class IsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __is_local_mountpoint(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __is_module_percpu_address(@Unsigned long addr2, Ptr<@Unsigned Long> can_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_access_to_paths_allowed((const const struct landlock_ruleset*)$arg1, (const const struct path*)$arg2, (const short unsigned int)$arg3, (const short unsigned int[16]*)$arg4, (const const struct dentry*)$arg5, (const short unsigned int)$arg6, (const short unsigned int[16]*)$arg7, (const const struct dentry*)$arg8)")
    public static boolean is_access_to_paths_allowed(Ptr<LandlockDefinitions.landlock_ruleset> domain, Ptr<runtime.path> path2, @Unsigned @OriginalName(value="access_mask_t") short access_request_parent1, Ptr<@Unsigned @OriginalName(value="layer_mask_t") short @Size(value=16) []> layer_masks_parent1, Ptr<runtime.dentry> dentry_child1, @Unsigned @OriginalName(value="access_mask_t") short access_request_parent2, Ptr<@Unsigned @OriginalName(value="layer_mask_t") short @Size(value=16) []> layer_masks_parent2, Ptr<runtime.dentry> dentry_child2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_acpi_data_node((const struct fwnode_handle*)$arg1)")
    public static boolean is_acpi_data_node(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_acpi_device_node((const struct fwnode_handle*)$arg1)")
    public static boolean is_acpi_device_node(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_acpi_graph_node($arg1, (const u8*)$arg2)")
    public static boolean is_acpi_graph_node(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_bpf_text_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_dock_device(Ptr<AcpiDefinitions.acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_dx_dir(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_hpet_capable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_hpet_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_intel_pt_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_masked_device_ioctl((const unsigned int)$arg1)")
    public static boolean is_masked_device_ioctl(@Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_mba_sc(Ptr<RdtDefinitions.rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_mddev_idle(Ptr<runtime.mddev> mddev2, int init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_migration_entry_dirty(misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_migration_entry_young(misc.swp_entry_t entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_module_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_module_percpu_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_module_text_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_nd_btt(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_nvdimm((const struct device*)$arg1)")
    public static boolean is_nvdimm(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_path_reachable($arg1, $arg2, (const struct path*)$arg3)")
    public static boolean is_path_reachable(Ptr<runtime.mount> mnt, Ptr<runtime.dentry> dentry2, Ptr<runtime.path> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_pmd_migration_entry(PmdDefinitions.pmd_t pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_raw_hwpoison_page_in_hugepage(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_swiotlb_active(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_swiotlb_allocated() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_tracing_stopped() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_unsupported_hmac_fs(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_vmalloc_addr((const void*)$arg1)")
    public static boolean is_vmalloc_addr(Ptr<?> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_vmalloc_or_module_addr((const void*)$arg1)")
    public static int is_vmalloc_or_module_addr(Ptr<?> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __is_insn_slot_addr(Ptr<KprobeDefinitions.kprobe_insn_cache> c, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_acpi_reserved(@Unsigned long start, @Unsigned long end, misc.e820_type not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_bad_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_binary_blacklisted((const u8*)$arg1, $arg2)")
    public static int is_binary_blacklisted(Ptr<Character> hash2, @Unsigned long hash_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_bound_to_driver(Ptr<runtime.device> dev, Ptr<?> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_cfi_preamble_symbol(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_console_locked() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_empty_dir_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_ftrace_trampoline(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_gpt_valid(Ptr<misc.parsed_partitions> state2, @Unsigned long lba, Ptr<Ptr<@OriginalName(value="gpt_header") misc._gpt_header>> gpt, Ptr<Ptr<@OriginalName(value="gpt_entry") misc._gpt_entry>> ptes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_hash_blacklisted((const u8*)$arg1, $arg2, $arg3)")
    public static int is_hash_blacklisted(Ptr<Character> hash2, @Unsigned long hash_len, misc.blacklist_hash_type hash_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_hugetlb_entry_hwpoisoned(PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_hugetlb_entry_migration(PteDefinitions.pte_t pte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_key_on_revocation_list(Ptr<Pkcs7Definitions.pkcs7_message> pkcs7) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_mmconf_reserved($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static boolean is_mmconf_reserved(@OriginalName(value="check_reserved_t") Ptr<?> is_reserved, Ptr<PciDefinitions.pci_mmcfg_region> cfg, Ptr<runtime.device> dev, String method) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_nd_dax((const struct device*)$arg1)")
    public static boolean is_nd_dax(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_seen(Ptr<misc.ctl_table_set> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_valid_dst(Ptr<BpfDefinitions.bpf_dtab_netdev> obj, Ptr<XdpDefinitions.xdp_frame> xdpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_virtio_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __is_kernel_percpu_address(@Unsigned long addr2, Ptr<@Unsigned Long> can_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_acquire_function($arg1, (const struct bpf_map*)$arg2)")
    public static boolean is_acquire_function(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_branch_taken(Ptr<BpfDefinitions.bpf_reg_state> reg1, Ptr<BpfDefinitions.bpf_reg_state> reg2, char opcode, boolean is_jmp32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_completed(char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_copy_from_user(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_current_pgrp_orphaned() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_early_ioremap_ptep(Ptr<PteDefinitions.pte_t> ptep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_hibernate_resume_dev(@Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_ima_appraise_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_kernel_percpu_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_kfunc_arg_const_mem_size((const struct btf*)$arg1, (const struct btf_param*)$arg2, (const struct bpf_reg_state*)$arg3)")
    public static boolean is_kfunc_arg_const_mem_size(Ptr<runtime.btf> btf2, Ptr<BtfDefinitions.btf_param> arg2, Ptr<BpfDefinitions.bpf_reg_state> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_kfunc_arg_scalar_with_name((const struct btf*)$arg1, (const struct btf_param*)$arg2, (const u8*)$arg3)")
    public static boolean is_kfunc_arg_scalar_with_name(Ptr<runtime.btf> btf2, Ptr<BtfDefinitions.btf_param> arg2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_module_sig_enforced() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_namespace_uuid_busy(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_nd_pfn(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_nvdimm_bus_locked(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_printk_legacy_deferred() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_ptr_cast_function(BpfDefinitions.bpf_func_id func_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_rb((const struct detailed_timing*)$arg1, $arg2)")
    public static void is_rb(Ptr<misc.detailed_timing> descriptor, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_refcount_suitable(Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_rlimit_overlimit(Ptr<runtime.ucounts> ucounts2, misc.rlimit_type type2, @Unsigned long rlimit2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_scalar_branch_taken(Ptr<BpfDefinitions.bpf_reg_state> reg1, Ptr<BpfDefinitions.bpf_reg_state> reg2, char opcode, boolean is_jmp32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_skb_forwardable((const struct net_device*)$arg1, (const struct sk_buff*)$arg2)")
    public static boolean is_skb_forwardable(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_state_visited(Ptr<BpfDefinitions.bpf_verifier_env> env, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_swbp_insn(Ptr<@OriginalName(value="uprobe_opcode_t") Character> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_sync_callback_calling_insn(Ptr<BpfDefinitions.bpf_insn> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_trap_insn(Ptr<@OriginalName(value="uprobe_opcode_t") Character> insn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_usb_device_driver((const struct device_driver*)$arg1)")
    public static boolean is_usb_device_driver(Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_uuid_busy(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_uv_hubbed(int uvtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_uv_system() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_valid_gup_args(Ptr<Ptr<runtime.page>> pages, Ptr<Integer> locked, Ptr<@Unsigned Integer> gup_flags_p, @Unsigned int to_set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_volatile_reg(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_batt_present(Ptr<ChargerDefinitions.charger_manager> cm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_callthunk(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_charging(Ptr<ChargerDefinitions.charger_manager> cm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_coretext((const struct core_text*)$arg1, $arg2)")
    public static boolean is_coretext(Ptr<CoreDefinitions.core_text> ct, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_descending($arg1, (const u8*)$arg2)")
    public static int is_descending(Ptr<TraceDefinitions.trace_array> tr, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_ext_pwr_online(Ptr<ChargerDefinitions.charger_manager> cm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_flush_rq(Ptr<runtime.request> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_free_buddy_page((const struct page*)$arg1)")
    public static boolean is_free_buddy_page(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_named_trigger(Ptr<EventDefinitions.event_trigger_data> test2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_nd_pmem((const struct device*)$arg1)")
    public static boolean is_nd_pmem(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_nd_volatile((const struct device*)$arg1)")
    public static boolean is_nd_volatile(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_nvdimm_bus(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_nvdimm_sync(Ptr<NdDefinitions.nd_region> nd_region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_prefetch(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_private_mmio_noop(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="is_software_node((const struct fwnode_handle*)$arg1)")
    public static boolean is_software_node(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_subdir(Ptr<runtime.dentry> new_dentry, Ptr<runtime.dentry> old_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int is_valid_bugaddr(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean is_var_ref(String var_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }
}

