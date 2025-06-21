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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.BlkifDefinitions;
import me.bechberger.ebpf.runtime.BootDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CcDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.KprobeDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.OpalDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SetupDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_acpi_sci(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_aliases(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_balloon_gfn(@Unsigned long gfn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_bdev_allow_write_mounted(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_boot_config() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_command_line(String command_line) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long setup_data_data_read(Ptr<runtime.file> fp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_file_encryption_key(Ptr<FscryptDefinitions.fscrypt_inode_info> ci, boolean need_dirhash_key, Ptr<Ptr<FscryptDefinitions.fscrypt_master_key>> mk_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_hparams(@Unsigned long gfn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_initial_init_mm(Ptr<?> start_code, Ptr<?> end_code, Ptr<?> end_data, Ptr<?> brk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_io_tlb_npages(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="setup_modinfo_srcversion($arg1, (const u8*)$arg2)")
    public static void setup_modinfo_srcversion(Ptr<runtime.module> mod, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="setup_modinfo_version($arg1, (const u8*)$arg2)")
    public static void setup_modinfo_version(Ptr<runtime.module> mod, String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_noreplace_smp(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_nr_node_ids() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> setup_object(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_per_mode_enc_key(Ptr<FscryptDefinitions.fscrypt_inode_info> ci, Ptr<FscryptDefinitions.fscrypt_master_key> mk, Ptr<FscryptDefinitions.fscrypt_prepared_key> keys, char hkdf_context, boolean include_fs_uuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_profiling_timer(@Unsigned int mult) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_sched_thermal_decay_shift(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int setup_sgl(Ptr<runtime.__kfifo> fifo, Ptr<runtime.scatterlist> sgl, int nents, @Unsigned int len, @Unsigned int off, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_signal_shadow_stack(Ptr<runtime.ksignal> ksig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_slub_debug(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_slub_max_order(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_slub_min_objects(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_slub_min_order(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_storage_paranoia(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_tick_nohz(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_unknown_nmi_panic(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_apicpmtimer(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_autogroup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_bios_corruption_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_boot_APIC_clock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_clear_cpu_cap(@Unsigned int feature) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_cpu_local_masks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_disableapic(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_hest_disable(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_local_APIC() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_log_buf(int early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_memhp_default_state(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean setup_mq_sysctls(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_new_flex_group_blocks(Ptr<SuperDefinitions.super_block> sb, Ptr<Ext4Definitions.ext4_new_flex_group_data> flex_gd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_nolapic(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_nox2apic(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_pebs_adaptive_sample_data(Ptr<PerfDefinitions.perf_event> event2, Ptr<PtDefinitions.pt_regs> iregs, Ptr<?> __pebs, Ptr<PerfDefinitions.perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_pebs_fixed_sample_data(Ptr<PerfDefinitions.perf_event> event2, Ptr<PtDefinitions.pt_regs> iregs, Ptr<?> __pebs, Ptr<PerfDefinitions.perf_sample_data> data, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_pebs_time(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_sample_data> data, @Unsigned long tsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_print_fatal_signals(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_psi(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_relax_domain_level(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_secondary_APIC_clock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_swap_account(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_acpi_rsdp(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_arg_pages(Ptr<LinuxDefinitions.linux_binprm> bprm, @Unsigned long stack_top, int executable_stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_backlog_napi_threads(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_bert_disable(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_boot_parameters(Ptr<runtime.kimage> image, Ptr<BootDefinitions.boot_params> params, @Unsigned long params_load_addr, @Unsigned int efi_map_offset, @Unsigned int efi_map_sz, @Unsigned int setup_data_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_cpu_entry_area(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_cpu_entry_areas() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_cpu_watcher(Ptr<misc.notifier_block> notifier, @Unsigned long event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_e820_entries(Ptr<BootDefinitions.boot_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_earlycon(String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_func_entry(Ptr<BpfDefinitions.bpf_verifier_env> env, int subprog, int callsite, @OriginalName(value="set_callee_state_fn") Ptr<?> set_callee_state_cb, Ptr<BpfDefinitions.bpf_verifier_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_hrtimer_hres(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_irqremap(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_new_exec(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_nointremap(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_nr_cpu_ids() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_numabalancing(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_possible_cpus(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_preempt_mode(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_real_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int setup_res(Ptr<AcpiDefinitions.acpi_resource> acpi_res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_resched_latency_warn_ms(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_schedstats(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_show_lapic(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="setup_sysctl_set($arg1, $arg2, (int (*)(struct ctl_table_set*))$arg3)")
    public static void setup_sysctl_set(Ptr<misc.ctl_table_set> set, Ptr<misc.ctl_table_root> root, Ptr<?> is_seen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean setup_userns_sysctls(Ptr<UserDefinitions.user_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_vcpu_hotplug_event() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="setup_vq($arg1, $arg2, $arg3, (void (*)(struct virtqueue*))$arg4, (const u8*)$arg5, $arg6, $arg7)")
    public static Ptr<runtime.virtqueue> setup_vq(Ptr<VirtioDefinitions.virtio_pci_device> vp_dev, Ptr<VirtioDefinitions.virtio_pci_vq_info> info2, @Unsigned int index2, Ptr<?> callback2, String name, boolean ctx, @Unsigned short msix_vec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __setup_irq(@Unsigned int irq, Ptr<IrqDefinitions.irq_desc> desc, Ptr<runtime.irqaction> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _setup_polling(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_add_efi_memmap(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_arch(Ptr<String> cmdline_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_bdev_super(Ptr<SuperDefinitions.super_block> sb, int sb_flags, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_blkring(Ptr<XenbusDefinitions.xenbus_device> dev, Ptr<misc.blkfront_ring_info> rinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_clearcpuid(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SwapDefinitions.swap_cluster_info> setup_clusters(Ptr<SwapDefinitions.swap_info_struct> si, Ptr<SwapDefinitions.swap_header> swap_header2, @Unsigned long maxpages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="setup_cpuid_table((const struct cc_blob_sev_info*)$arg1)")
    public static void setup_cpuid_table(Ptr<CcDefinitions.cc_blob_sev_info> cc_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_detour_execution(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs, int reenter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_disable_pku(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_early_printk(String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_efi_kvm_sev_migration() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_elfcorehdr(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_erst_disable(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_forced_irqthreads(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_ghcb() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_init_pkru(String opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean setup_ipc_sysctls(Ptr<IpcDefinitions.ipc_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_irq_thread(Ptr<runtime.irqaction> _new, @Unsigned int irq, boolean secondary) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_kmalloc_cache_index_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_locking_range(Ptr<OpalDefinitions.opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_min_slab_ratio() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_min_unmapped_ratio() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_netfront(Ptr<XenbusDefinitions.xenbus_device> dev, Ptr<misc.netfront_queue> queue, @Unsigned int feature_split_evtchn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_node_to_cpumask_map() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_noefi(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_pcp_cacheinfo(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_per_cpu_areas() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_per_cpu_pageset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_per_zone_lowmem_reserve() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_per_zone_wmarks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_percpu_irq(@Unsigned int irq, Ptr<runtime.irqaction> act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_singlestep(Ptr<runtime.kprobe> p, Ptr<PtDefinitions.pt_regs> regs, Ptr<KprobeDefinitions.kprobe_ctlblk> kcb, int reenter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_slab_merge(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_slab_nomerge(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_swap_info(Ptr<SwapDefinitions.swap_info_struct> si, int prio, String swap_map, Ptr<SwapDefinitions.swap_cluster_info> cluster_info, Ptr<@Unsigned Long> zeromap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_thp_anon(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_trace_event(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_trace_triggers(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_transparent_hugepage(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_userpte(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int setup_vmw_sched_clock(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void setup_zone_pageset(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct setup_rw_req")
    @NotUsableInJava
    public static class setup_rw_req
    extends Struct {
        public @Unsigned int grant_idx;
        public Ptr<BlkifDefinitions.blkif_request_segment> segments;
        public Ptr<misc.blkfront_ring_info> rinfo;
        public Ptr<BlkifDefinitions.blkif_request> ring_req;
        public @Unsigned @OriginalName(value="grant_ref_t") int gref_head;
        public @Unsigned int id;
        public boolean need_copy;
        public @Unsigned int bvec_off;
        public String bvec_data;
        public boolean require_extra_req;
        public Ptr<BlkifDefinitions.blkif_request> extra_ring_req;
    }

    @Type(noCCodeGeneration=true, cType="struct setup_indirect")
    @NotUsableInJava
    public static class setup_indirect
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int reserved;
        public @Unsigned long len;
        public @Unsigned long addr;
    }

    @Type(noCCodeGeneration=true, cType="struct setup_header")
    @NotUsableInJava
    public static class setup_header
    extends Struct {
        public char setup_sects;
        public @Unsigned short root_flags;
        public @Unsigned int syssize;
        public @Unsigned short ram_size;
        public @Unsigned short vid_mode;
        public @Unsigned short root_dev;
        public @Unsigned short boot_flag;
        public @Unsigned short jump;
        public @Unsigned int header;
        public @Unsigned short version;
        public @Unsigned int realmode_swtch;
        public @Unsigned short start_sys_seg;
        public @Unsigned short kernel_version;
        public char type_of_loader;
        public char loadflags;
        public @Unsigned short setup_move_size;
        public @Unsigned int code32_start;
        public @Unsigned int ramdisk_image;
        public @Unsigned int ramdisk_size;
        public @Unsigned int bootsect_kludge;
        public @Unsigned short heap_end_ptr;
        public char ext_loader_ver;
        public char ext_loader_type;
        public @Unsigned int cmd_line_ptr;
        public @Unsigned int initrd_addr_max;
        public @Unsigned int kernel_alignment;
        public char relocatable_kernel;
        public char min_alignment;
        public @Unsigned short xloadflags;
        public @Unsigned int cmdline_size;
        public @Unsigned int hardware_subarch;
        public @Unsigned long hardware_subarch_data;
        public @Unsigned int payload_offset;
        public @Unsigned int payload_length;
        public @Unsigned long setup_data;
        public @Unsigned long pref_address;
        public @Unsigned int init_size;
        public @Unsigned int handover_offset;
        public @Unsigned int kernel_info_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct setup_data")
    @NotUsableInJava
    public static class setup_data
    extends Struct {
        public @Unsigned long next;
        public @Unsigned int type;
        public @Unsigned int len;
        public char @Size(value=0) [] data;
    }
}

