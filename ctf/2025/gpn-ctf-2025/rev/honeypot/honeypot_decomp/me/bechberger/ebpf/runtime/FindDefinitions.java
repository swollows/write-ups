/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.OriginalNames;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AerDefinitions;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AsymmetricDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.CssDefinitions;
import me.bechberger.ebpf.runtime.DDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DevfreqDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.EhciDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.FolioDefinitions;
import me.bechberger.ebpf.runtime.FreeDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.HashDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.IovaDefinitions;
import me.bechberger.ebpf.runtime.IpcDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.KeyringDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.LandlockDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.ModDefinitions;
import me.bechberger.ebpf.runtime.NfDefinitions;
import me.bechberger.ebpf.runtime.OppDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.PmdDefinitions;
import me.bechberger.ebpf.runtime.ResourceDefinitions;
import me.bechberger.ebpf.runtime.SchedDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SynthDefinitions;
import me.bechberger.ebpf.runtime.SyscallDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.VmapDefinitions;
import me.bechberger.ebpf.runtime.XbcDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FindDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_logger($arg1, (const u8*)$arg2)")
    public static Ptr<NfDefinitions.nf_logger> __find_logger(int pf, String str_logger) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TraceDefinitions.trace_entry> __find_next_entry(Ptr<TraceDefinitions.trace_iterator> iter2, Ptr<Integer> ent_cpu, Ptr<@Unsigned Long> missing_events, Ptr<@Unsigned Long> ent_ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_nth_and_andnot_bit((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, $arg4, $arg5)")
    public static @Unsigned long __find_nth_and_andnot_bit(Ptr<@Unsigned Long> addr1, Ptr<@Unsigned Long> addr2, Ptr<@Unsigned Long> addr3, @Unsigned long size, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_nth_and_bit((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static @Unsigned long __find_nth_and_bit(Ptr<@Unsigned Long> addr1, Ptr<@Unsigned Long> addr2, @Unsigned long size, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_nth_andnot_bit((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static @Unsigned long __find_nth_andnot_bit(Ptr<@Unsigned Long> addr1, Ptr<@Unsigned Long> addr2, @Unsigned long size, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_nth_bit((const long unsigned int*)$arg1, $arg2, $arg3)")
    public static @Unsigned long __find_nth_bit(Ptr<@Unsigned Long> addr2, @Unsigned long size, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __find_tracepoint_cb(Ptr<runtime.tracepoint> tp, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __find_tracepoint_module_cb(Ptr<runtime.tracepoint> tp, Ptr<runtime.module> mod, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_first_and_and_bit((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, (const long unsigned int*)$arg3, $arg4)")
    public static @Unsigned long _find_first_and_and_bit(Ptr<@Unsigned Long> addr1, Ptr<@Unsigned Long> addr2, Ptr<@Unsigned Long> addr3, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_first_and_bit((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3)")
    public static @Unsigned long _find_first_and_bit(Ptr<@Unsigned Long> addr1, Ptr<@Unsigned Long> addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_first_bit((const long unsigned int*)$arg1, $arg2)")
    public static @Unsigned long _find_first_bit(Ptr<@Unsigned Long> addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_first_zero_bit((const long unsigned int*)$arg1, $arg2)")
    public static @Unsigned long _find_first_zero_bit(Ptr<@Unsigned Long> addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_last_bit((const long unsigned int*)$arg1, $arg2)")
    public static @Unsigned long _find_last_bit(Ptr<@Unsigned Long> addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_next_and_bit((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static @Unsigned long _find_next_and_bit(Ptr<@Unsigned Long> addr1, Ptr<@Unsigned Long> addr2, @Unsigned long nbits, @Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_next_andnot_bit((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static @Unsigned long _find_next_andnot_bit(Ptr<@Unsigned Long> addr1, Ptr<@Unsigned Long> addr2, @Unsigned long nbits, @Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_next_bit((const long unsigned int*)$arg1, $arg2, $arg3)")
    public static @Unsigned long _find_next_bit(Ptr<@Unsigned Long> addr2, @Unsigned long nbits, @Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_next_or_bit((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static @Unsigned long _find_next_or_bit(Ptr<@Unsigned Long> addr1, Ptr<@Unsigned Long> addr2, @Unsigned long nbits, @Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_next_zero_bit((const long unsigned int*)$arg1, $arg2, $arg3)")
    public static @Unsigned long _find_next_zero_bit(Ptr<@Unsigned Long> addr2, @Unsigned long nbits, @Unsigned long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_attach((const struct linux_binprm*)$arg1, $arg2, $arg3, (const u8*)$arg4, (const u8**)$arg5)")
    public static Ptr<AaDefinitions.aa_label> find_attach(Ptr<LinuxDefinitions.linux_binprm> bprm, Ptr<AaDefinitions.aa_ns> ns, Ptr<ListDefinitions.list_head> head, String name, Ptr<String> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_battery((const struct dmi_header*)$arg1, $arg2)")
    public static void find_battery(Ptr<DmiDefinitions.dmi_header> dm, Ptr<?> _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_energy_efficient_cpu(Ptr<TaskDefinitions.task_struct> p, int prev_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_exported_symbol_in_section((const struct symsearch*)$arg1, $arg2, $arg3)")
    public static boolean find_exported_symbol_in_section(Ptr<symsearch> syms, Ptr<runtime.module> owner, Ptr<find_symbol_arg> fsa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_irq_entry(int ioapic_idx, int pin, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_isa_irq_apic(int irq, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_isa_irq_pin(int irq, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemDefinitions.mem_ctl_info> find_mci_by_dev(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_module((const u8*)$arg1)")
    public static Ptr<runtime.module> find_module(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_module_all((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.module> find_module_all(String name, @Unsigned long len, boolean even_unformed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_module_sections(Ptr<runtime.module> mod, Ptr<LoadDefinitions.load_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_next_clump8($arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static @Unsigned long find_next_clump8(Ptr<@Unsigned Long> clump, Ptr<@Unsigned Long> addr2, @Unsigned long size, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_nls((const u8*)$arg1)")
    public static Ptr<misc.nls_table> find_nls(String charset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_resume_device() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct landlock_rule*)find_rule((const const struct landlock_ruleset*)$arg1, (const const struct dentry*)$arg2))")
    public static Ptr<LandlockDefinitions.landlock_rule> find_rule(Ptr<LandlockDefinitions.landlock_ruleset> domain, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_sec((const struct load_info*)$arg1, (const u8*)$arg2)")
    public static @Unsigned int find_sec(Ptr<LoadDefinitions.load_info> info2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_service_iter(Ptr<runtime.device> device2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean find_symbol(Ptr<find_symbol_arg> fsa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_synth_event((const u8*)$arg1)")
    public static Ptr<SynthDefinitions.synth_event> find_synth_event(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)find_table($arg1, (const struct firmware*)$arg2))")
    public static Ptr<?> find_table(Ptr<runtime.device> dev, Ptr<runtime.firmware> fw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_trace_kprobe((const u8*)$arg1, (const u8*)$arg2)")
    public static Ptr<TraceDefinitions.trace_kprobe> find_trace_kprobe(String event2, String group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmapDefinitions.vmap_area> find_unlink_vmap_area(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_vm_area((const void*)$arg1)")
    public static Ptr<VmDefinitions.vm_struct> find_vm_area(Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmapDefinitions.vmap_area> find_vmap_area(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmapDefinitions.vmap_node> find_vmap_area_exceed_addr_lock(@Unsigned long addr2, Ptr<Ptr<VmapDefinitions.vmap_area>> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void find_zone_movable_pfns_for_nodes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> __find_get_block(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long block, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BufferDefinitions.buffer_head> __find_get_block_slow(Ptr<BlockDefinitions.block_device> bdev, @Unsigned @OriginalName(value="sector_t") long block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_governor((const u8*)$arg1)")
    public static Ptr<ThermalDefinitions.thermal_governor> __find_governor(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_interface($arg1, (const void*)$arg2)")
    public static int __find_interface(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_kallsyms_symbol_value($arg1, (const u8*)$arg2)")
    public static @Unsigned long __find_kallsyms_symbol_value(Ptr<runtime.module> mod, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __find_resource_space(Ptr<runtime.resource> root, Ptr<runtime.resource> old, Ptr<runtime.resource> _new, @Unsigned @OriginalName(value="resource_size_t") long size, Ptr<ResourceDefinitions.resource_constraint> constraint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevDefinitions.dev_pm_opp> _find_freq_ceil(Ptr<OppDefinitions.opp_table> opp_table2, Ptr<@Unsigned Long> freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_find_key($arg1, $arg2, $arg3, $arg4, (long unsigned int (*)(struct dev_pm_opp*, int))$arg5, (_Bool (*)(struct dev_pm_opp**, struct dev_pm_opp*, long unsigned int, long unsigned int))$arg6, (_Bool (*)(struct opp_table*))$arg7)")
    public static Ptr<DevDefinitions.dev_pm_opp> _find_key(Ptr<runtime.device> dev, Ptr<@Unsigned Long> key2, int index2, boolean available, Ptr<?> read2, Ptr<?> compare, Ptr<?> _assert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<OppDefinitions.opp_table> _find_opp_table(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<OppDefinitions.opp_table> _find_opp_table_unlocked(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_acceptable_alias($arg1, (int (*)(void*, struct dentry*))$arg2, $arg3)")
    public static Ptr<runtime.dentry> find_acceptable_alias(Ptr<runtime.dentry> result, Ptr<?> acceptable, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.sem_undo> find_alloc_undo(Ptr<IpcDefinitions.ipc_namespace> ns, int semid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_bpffs_btf_enums(Ptr<misc.bpffs_btf_enums> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.bug_entry> find_bug(@Unsigned long bugaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> find_bus_resource_of_type(Ptr<PciDefinitions.pci_bus> bus, @Unsigned long type_mask, @Unsigned long type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_candidate($arg1, (const struct {\n  long unsigned int bits[1];\n}*)$arg2, $arg3, $arg4)")
    public static Ptr<DmaDefinitions.dma_chan> find_candidate(Ptr<DmaDefinitions.dma_device> device2, Ptr<DmaDefinitions.dma_cap_mask_t> mask, @OriginalName(value="dma_filter_fn") Ptr<?> fn, Ptr<?> fn_param) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.compressor> find_compressor(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SchedDefinitions.sched_domain> find_descended_sibling(Ptr<SchedDefinitions.sched_domain> sd, Ptr<SchedDefinitions.sched_domain> sibling) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long find_first_fitting_seq(@Unsigned long start_seq, @Unsigned long max_seq, @Unsigned long size, boolean syslog, boolean time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct font_desc*)find_font((const u8*)$arg1))")
    public static Ptr<misc.font_desc> find_font(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)find_kallsyms_symbol($arg1, $arg2, $arg3, $arg4))")
    public static String find_kallsyms_symbol(Ptr<runtime.module> mod, @Unsigned long addr2, Ptr<@Unsigned Long> size, Ptr<@Unsigned Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_kallsyms_symbol_value($arg1, (const u8*)$arg2)")
    public static @Unsigned long find_kallsyms_symbol_value(Ptr<runtime.module> mod, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_key_to_update($arg1, (const struct keyring_index_key*)$arg2)")
    public static @OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> find_key_to_update(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> keyring_ref, Ptr<KeyringDefinitions.keyring_index_key> index_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_keyring_by_name((const u8*)$arg1, $arg2)")
    public static Ptr<runtime.key> find_keyring_by_name(String name, boolean uid_keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> find_lock_task_mm(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.key> find_master_key_user(Ptr<FscryptDefinitions.fscrypt_master_key> mk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<XbcDefinitions.xbc_node> find_match_node(Ptr<XbcDefinitions.xbc_node> node2, String k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int find_mboard_resource(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> context2, Ptr<Ptr<?>> rv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AnonDefinitions.anon_vma> find_mergeable_anon_vma(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_next_iomem_res(@Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long end, @Unsigned long flags, @Unsigned long desc, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean find_numa_distance(int distance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_probe_event((const u8*)$arg1, (const u8*)$arg2)")
    public static Ptr<TraceDefinitions.trace_uprobe> find_probe_event(String event2, String group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PciDefinitions.pci_serial_quirk> find_quirk(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_resource_space(Ptr<runtime.resource> root, Ptr<runtime.resource> _new, @Unsigned @OriginalName(value="resource_size_t") long size, Ptr<ResourceDefinitions.resource_constraint> constraint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Jbd2Definitions.jbd2_revoke_record_s> find_revoke_record(Ptr< @OriginalName(value="journal_t") JournalDefinitions.journal_s> journal, @Unsigned long blocknr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_sort_method((const struct dmi_system_id*)$arg1)")
    public static int find_sort_method(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SyscallDefinitions.syscall_metadata> find_syscall_meta(@Unsigned long syscall2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> find_timens_vvar_page(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<UserDefinitions.user_struct> find_user(misc.kuid_t uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_valid_gpt(Ptr<misc.parsed_partitions> state2, Ptr<Ptr<@OriginalName(value="gpt_header") misc._gpt_header>> gpt, Ptr<Ptr<@OriginalName(value="gpt_entry") misc._gpt_entry>> ptes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_child($arg1, (const u8*)$arg2)")
    public static Ptr<AaDefinitions.aa_profile> __find_child(Ptr<ListDefinitions.list_head> head, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HashDefinitions.hash_cell> __find_device_hash_cell(Ptr<DmDefinitions.dm_ioctl> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.btf> __find_kfunc_desc_btf(Ptr<BpfDefinitions.bpf_verifier_env> env, short offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long __find_max_addr(@Unsigned @OriginalName(value="phys_addr_t") long limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.pci2phy_map> __find_pci2phy_map(int segment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __find_rr_leaf(Ptr<Fib6Definitions.fib6_info> f6i_start, Ptr<Fib6Definitions.fib6_info> nomatch, @Unsigned int metric, Ptr<Fib6Definitions.fib6_result> res, Ptr<Ptr<Fib6Definitions.fib6_info>> cont, int oif, int strict, Ptr<@OriginalName(value="bool") Boolean> do_rr, Ptr<Integer> mpri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.uprobe> find_active_uprobe_rcu(@Unsigned long bp_vaddr, Ptr<Integer> is_swbp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> find_alive_thread(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_components(Ptr<misc.aggregate_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemoryDefinitions.memory_tier> find_create_memory_tier(Ptr<MemoryDefinitions.memory_dev_type> memtype2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_device_iter(Ptr<PciDefinitions.pci_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FibDefinitions.fib_nh_exception> find_exception(Ptr<FibDefinitions.fib_nh_common> nhc, @Unsigned @OriginalName(value="__be32") int daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> find_extend_vma_locked(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pid> find_ge_pid(int nr, Ptr<PidDefinitions.pid_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pid> find_get_pid(@OriginalName(value="pid_t") int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> find_get_task_by_vpid(@OriginalName(value="pid_t") int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void find_good_pkt_pointers(Ptr<BpfDefinitions.bpf_verifier_state> vstate, Ptr<BpfDefinitions.bpf_reg_state> dst_reg, BpfDefinitions.bpf_reg_type type2, boolean range_right_open) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_gtf2((const struct detailed_timing*)$arg1, $arg2)")
    public static void find_gtf2(Ptr<misc.detailed_timing> descriptor, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_inode($arg1, $arg2, (int (*)(struct inode*, void*))$arg3, $arg4, $arg5)")
    public static Ptr<runtime.inode> find_inode(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.hlist_head> head, Ptr<?> test2, Ptr<?> data, boolean is_inode_hash_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> find_inode_by_ino_rcu(Ptr<SuperDefinitions.super_block> sb, @Unsigned long ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> find_inode_fast(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.hlist_head> head, @Unsigned long ino, boolean is_inode_hash_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_inode_nowait($arg1, $arg2, (int (*)(struct inode*, long unsigned int, void*))$arg3, $arg4)")
    public static Ptr<runtime.inode> find_inode_nowait(Ptr<SuperDefinitions.super_block> sb, @Unsigned long hashval, Ptr<?> match, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_inode_rcu($arg1, $arg2, (int (*)(struct inode*, void*))$arg3, $arg4)")
    public static Ptr<runtime.inode> find_inode_rcu(Ptr<SuperDefinitions.super_block> sb, @Unsigned long hashval, Ptr<?> test2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.iova> find_iova(Ptr<IovaDefinitions.iova_domain> iovad, @Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean find_match(Ptr<Fib6Definitions.fib6_nh> nh, @Unsigned int fib6_flags, int oif, int strict, Ptr<Integer> mpri, Ptr<@OriginalName(value="bool") Boolean> do_rr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<KernfsDefinitions.kernfs_node> find_next_ancestor(Ptr<KernfsDefinitions.kernfs_node> child, Ptr<KernfsDefinitions.kernfs_node> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_num_cache_leaves(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PciDefinitions.pci_root_info> find_pci_root_info(int node2, int link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pid> find_pid_ns(int nr, Ptr<PidDefinitions.pid_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_pmd_or_thp_or_none(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long address, Ptr<Ptr<PmdDefinitions.pmd_t>> pmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_verifier_state> find_prev_entry(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_verifier_state> cur, int insn_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean find_source_device(Ptr<PciDefinitions.pci_dev> parent, Ptr<AerDefinitions.aer_err_info> e_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> find_task_by_pid_ns(@OriginalName(value="pid_t") int nr, Ptr<PidDefinitions.pid_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> find_task_by_vpid(@OriginalName(value="pid_t") int vnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EhciDefinitions.ehci_tt> find_tt(Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> find_vma(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> find_vma_intersection(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start_addr, @Unsigned long end_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<VmDefinitions.vm_area_struct> find_vma_prev(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long addr2, Ptr<Ptr<VmDefinitions.vm_area_struct>> pprev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pid> find_vpid(int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_acq_core($arg1, (const struct xfrm_mark*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg8, (const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg9, $arg10)")
    public static Ptr<XfrmDefinitions.xfrm_state> __find_acq_core(Ptr<runtime.net> net2, Ptr<XfrmDefinitions.xfrm_mark> m, @Unsigned short family, char mode, @Unsigned int reqid, @Unsigned int if_id, char proto2, Ptr<XfrmDefinitions.xfrm_address_t> daddr, Ptr<XfrmDefinitions.xfrm_address_t> saddr, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__find_event_file($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static Ptr<TraceDefinitions.trace_event_file> __find_event_file(Ptr<TraceDefinitions.trace_array> tr, String system, String event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_and_lock_process_key((const u8*)$arg1, (const u8*)$arg2, $arg3, (const struct fscrypt_key**)$arg4)")
    public static Ptr<runtime.key> find_and_lock_process_key(String prefix, Ptr<Character> descriptor, @Unsigned int min_keysize, Ptr<Ptr<FscryptDefinitions.fscrypt_key>> payload_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_asymmetric_key($arg1, (const struct asymmetric_key_id*)$arg2, (const struct asymmetric_key_id*)$arg3, (const struct asymmetric_key_id*)$arg4, $arg5)")
    public static Ptr<runtime.key> find_asymmetric_key(Ptr<runtime.key> keyring, Ptr<AsymmetricDefinitions.asymmetric_key_id> id_0, Ptr<AsymmetricDefinitions.asymmetric_key_id> id_1, Ptr<AsymmetricDefinitions.asymmetric_key_id> id_2, boolean partial) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void find_blobs_in_containers(Ptr<misc.cpio_data> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_child_checks(Ptr<AcpiDefinitions.acpi_device> adev, boolean check_children) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CssDefinitions.css_set> find_css_set(Ptr<CssDefinitions.css_set> old_cset, Ptr<runtime.cgroup> cgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_devfreq_governor((const u8*)$arg1)")
    public static Ptr<DevfreqDefinitions.devfreq_governor> find_devfreq_governor(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ScxDefinitions.scx_dispatch_q> find_dsq_for_dispatch(Ptr<runtime.rq> rq2, @Unsigned long dsq_id, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nlattr> find_dump_kind(Ptr<Ptr<runtime.nlattr>> nla) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short find_equiv_id(Ptr<misc.equiv_cpu_table> et, @Unsigned int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_event_file($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static Ptr<TraceDefinitions.trace_event_file> find_event_file(Ptr<TraceDefinitions.trace_array> tr, String system, String event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HistDefinitions.hist_field> find_event_var(Ptr<HistDefinitions.hist_trigger_data> hist_data, String system, String event_name, String var_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CssDefinitions.css_set> find_existing_css_set(Ptr<CssDefinitions.css_set> old_cset, Ptr<runtime.cgroup> cgrp, Ptr<Ptr<CgroupDefinitions.cgroup_subsys_state>> template) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct fetch_type*)find_fetch_type((const u8*)$arg1, $arg2))")
    public static Ptr<misc.fetch_type> find_fetch_type(String type2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_first_swap(Ptr<@Unsigned @OriginalName(value="dev_t") Integer> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_event_context> find_get_context(Ptr<TaskDefinitions.task_struct> task2, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int find_get_entries(Ptr<misc.address_space> mapping, Ptr<@Unsigned Long> start, @Unsigned long end, Ptr<FolioDefinitions.folio_batch> fbatch, Ptr<@Unsigned Long> indices) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_event_pmu_context> find_get_pmu_context(Ptr<runtime.pmu> pmu2, Ptr<PerfDefinitions.perf_event_context> ctx, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_group_orlov($arg1, $arg2, $arg3, $arg4, (const struct qstr*)$arg5)")
    public static int find_group_orlov(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> parent, Ptr<@Unsigned @OriginalName(value="ext4_group_t") Integer> group, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<runtime.qstr> qstr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_group_other(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.inode> parent, Ptr<@Unsigned @OriginalName(value="ext4_group_t") Integer> group, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_guid_info((const struct {\n  u8 b[16];\n}*)$arg1, $arg2)")
    public static Ptr<?> find_guid_info(Ptr<@OriginalName(value="guid_t") misc.uuid_t> guid, char mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_inode_bit(Ptr<SuperDefinitions.super_block> sb, @Unsigned @OriginalName(value="ext4_group_t") int group, Ptr<BufferDefinitions.buffer_head> bitmap2, Ptr<@Unsigned Long> ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.logic_pio_hwaddr> find_io_range_by_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long find_large_buddy(@Unsigned long start_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_later_rq(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String find_link(int major, int minor, int ino, @Unsigned @OriginalName(value="umode_t") short mode, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int find_lock_entries(Ptr<misc.address_space> mapping, Ptr<@Unsigned Long> start, @Unsigned long end, Ptr<FolioDefinitions.folio_batch> fbatch, Ptr<@Unsigned Long> indices) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rq> find_lock_later_rq(Ptr<TaskDefinitions.task_struct> task2, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rq> find_lock_lowest_rq(Ptr<TaskDefinitions.task_struct> task2, Ptr<runtime.rq> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_lowest_rq(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemoryDefinitions.memory_block> find_memory_block(@Unsigned long section_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_mergeable($arg1, $arg2, $arg3, (const u8*)$arg4, (void (*)(void*))$arg5)")
    public static Ptr<KmemDefinitions.kmem_cache> find_mergeable(@Unsigned int size, @Unsigned int align, @Unsigned @OriginalName(value="slab_flags_t") int flags, String name, Ptr<?> ctor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_named_trigger((const u8*)$arg1)")
    public static Ptr<EventDefinitions.event_trigger_data> find_named_trigger(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_next_best_node(int node2, Ptr<misc.nodemask_t> used_node_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> find_oprom(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="find_or_insert_direct_key($arg1, (const u8*)$arg2, (const struct fscrypt_inode_info*)$arg3)")
    public static Ptr<FscryptDefinitions.fscrypt_direct_key> find_or_insert_direct_key(Ptr<FscryptDefinitions.fscrypt_direct_key> to_insert, Ptr<Character> raw_key, Ptr<FscryptDefinitions.fscrypt_inode_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ucode_patch> find_patch(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_psb_table(Ptr<misc.powernow_k8_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)find_stub_func_proto((const struct btf*)$arg1, (const u8*)$arg2, (const u8*)$arg3))")
    public static Ptr<BtfDefinitions.btf_type> find_stub_func_proto(Ptr<runtime.btf> btf2, String st_op_name, String member_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static DDefinitions.d_walk_ret find_submount(Ptr<?> _data, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int find_suitable_fallback(Ptr<FreeDefinitions.free_area> area, @Unsigned int order, int migratetype2, boolean only_stealable, Ptr<@OriginalName(value="bool") Boolean> can_steal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<HistDefinitions.hist_field> find_synthetic_field_var(Ptr<HistDefinitions.hist_trigger_data> target_hist_data, String system, String event_name, String field_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ScxDefinitions.scx_dispatch_q> find_user_dsq(@Unsigned long dsq_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TraceDefinitions.trace_event_file> find_var_file(Ptr<TraceDefinitions.trace_array> tr, String system, String event_name, String var_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct symsearch")
    @NotUsableInJava
    public static class symsearch
    extends Struct {
        public Ptr<KernelDefinitions.kernel_symbol> start;
        public Ptr<KernelDefinitions.kernel_symbol> stop;
        public Ptr<Integer> crcs;
        public ModDefinitions.mod_license license;
    }

    @Type(noCCodeGeneration=true, cType="struct find_interface_arg")
    @NotUsableInJava
    public static class find_interface_arg
    extends Struct {
        public int minor;
        public Ptr<DeviceDefinitions.device_driver> drv;
    }

    @Type(noCCodeGeneration=true, cType="struct __find_tracepoint_cb_data")
    @NotUsableInJava
    public static class __find_tracepoint_cb_data
    extends Struct {
        public String tp_name;
        public Ptr<runtime.tracepoint> tpoint;
        public Ptr<runtime.module> mod;
    }

    @Type(noCCodeGeneration=true, cType="struct find_child_walk_data")
    @NotUsableInJava
    public static class find_child_walk_data
    extends Struct {
        public Ptr<AcpiDefinitions.acpi_device> adev;
        public @Unsigned long address;
        public int score;
        public boolean check_sta;
        public boolean check_children;
    }

    @Type(noCCodeGeneration=true, cType="struct find_symbol_arg")
    @NotUsableInJava
    public static class find_symbol_arg
    extends Struct {
        public String name;
        public boolean gplok;
        public boolean warn;
        public Ptr<runtime.module> owner;
        public Ptr<Integer> crc;
        public Ptr<KernelDefinitions.kernel_symbol> sym;
        public ModDefinitions.mod_license license;
    }
}

