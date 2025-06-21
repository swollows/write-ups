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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class UvDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_check_nmi(Ptr<uv_hub_nmi_s> hub_nmi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_handle_nmi(@Unsigned int reason, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_handle_nmi_ping(@Unsigned int reason, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_init_hubless_pch_io(int offset, int mask, int data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> uv_local_mmr_address(@Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_nmi_dump_state(int cpu2, Ptr<PtDefinitions.pt_regs> regs, int master) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_nmi_dump_state_cpu(int cpu2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_nmi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_nmi_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_nmi_setup_common(boolean hubbed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_nmi_setup_hubless() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_nmi_setup_mmrs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_nmi_sync_exit(int master) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_nmi_wait(int master) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_nmi_wait_cpus(int first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_register_nmi_notifier() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_set_in_nmi(int cpu2, Ptr<uv_hub_nmi_s> hub_nmi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_apicid_to_pnode(int apicid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_blade_nr_possible_cpus(int bid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_enable_evt_rtc(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long uv_read_rtc(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_rtc_allocate_timers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_rtc_deallocate_timers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_rtc_find_next_timer(Ptr<uv_rtc_timer_head> head, int pnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_rtc_interrupt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_rtc_next_event(@Unsigned long delta, Ptr<misc.clock_event_device> ced) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_rtc_register_clockevents(Ptr<misc.work_struct> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_rtc_setup_clock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_rtc_shutdown(Ptr<misc.clock_event_device> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_rtc_unset_timer(int cpu2, int force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_setup_intr(int cpu2, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_acpi_madt_oem_check(String _oem_id, String _oem_table_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_domain_activate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> irq_data2, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_domain_alloc(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_domain_deactivate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_domain_free(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long uv_early_read_mmr(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long uv_get_archtype(String buf, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_get_hubless_system() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_hub_type_set(int uvmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_init_hub_info(Ptr<uv_hub_info_s> hi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean uv_is_untracked_pat_range(@Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_noop(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_send_IPI_all(int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_send_IPI_allbutself(int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uv_send_IPI_mask((const struct cpumask*)$arg1, $arg2)")
    public static void uv_send_IPI_mask(Ptr<runtime.cpumask> mask, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uv_send_IPI_mask_allbutself((const struct cpumask*)$arg1, $arg2)")
    public static void uv_send_IPI_mask_allbutself(Ptr<runtime.cpumask> mask, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_send_IPI_one(int cpu2, int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uv_set_irq_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int uv_set_irq_affinity(Ptr<IrqDefinitions.irq_data> data, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_set_system_type(String _oem_id, String _oem_table_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_set_vga_state(Ptr<PciDefinitions.pci_dev> pdev, boolean decode, @Unsigned int command_bits, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_setup_irq(String irq_name, int cpu2, int mmr_blade, @Unsigned long mmr_offset, int limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_setup_proc_files(int hubless) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_stringify(int len, String to, String from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_system_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_system_init_hub() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uv_teardown_irq(@Unsigned int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long uv_undefined(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_wakeup_secondary(@Unsigned int phys_apicid, @Unsigned long start_rip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __uv_bios_call(uv_bios_cmd which, @Unsigned long a1, @Unsigned long a2, @Unsigned long a3, @Unsigned long a4, @Unsigned long a5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_call_irqsave(uv_bios_cmd which, @Unsigned long a1, @Unsigned long a2, @Unsigned long a3, @Unsigned long a4, @Unsigned long a5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_change_memprotect(@Unsigned long paddr, @Unsigned long len, uv_memprotect perms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_enum_objs(@Unsigned long nasid, @Unsigned long size, Ptr<@Unsigned Long> objbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_enum_ports(@Unsigned long nasid, @Unsigned long obj_id, @Unsigned long size, Ptr<@Unsigned Long> portbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_freq_base(@Unsigned long clock_type, Ptr<@Unsigned Long> ticks_per_second) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_get_geoinfo(@Unsigned long nasid, @Unsigned long size, Ptr<@Unsigned Long> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_get_heapsize(@Unsigned long nasid, @Unsigned long size, Ptr<@Unsigned Long> heap_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_get_master_nasid(@Unsigned long size, Ptr<@Unsigned Long> master_nasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_get_pci_topology(@Unsigned long size, Ptr<@Unsigned Long> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_get_sn_info(int fc, Ptr<Integer> uvtype, Ptr<Long> partid, Ptr<Long> coher, Ptr<Long> region2, Ptr<Long> ssn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_bios_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_install_heap(@Unsigned long nasid, @Unsigned long heap_size, Ptr<@Unsigned Long> bios_heap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_bios_mq_watchlist_alloc(@Unsigned long addr2, @Unsigned int mq_size, Ptr<@Unsigned Long> intr_mmr_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_bios_mq_watchlist_free(int blade, int watchlist_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_obj_count(@Unsigned long nasid, @Unsigned long size, Ptr<@Unsigned Long> objcnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long uv_bios_reserved_page_pa(@Unsigned long buf, Ptr<@Unsigned Long> cookie, Ptr<@Unsigned Long> addr2, Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uv_bios_set_legacy_vga_target(boolean decode, int domain, int bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { int lcpu; long long unsigned int expires; }")
    @NotUsableInJava
    public static class AnonymousType388436342C56
    extends Struct {
        public int lcpu;
        public @Unsigned long expires;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int type; unsigned int offset; }")
    @NotUsableInJava
    public static class AnonymousType2079278380C54
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_irq_2_mmr_pnode")
    @NotUsableInJava
    public static class uv_irq_2_mmr_pnode
    extends Struct {
        public @Unsigned long offset;
        public int pnode;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_arch_type_entry")
    @NotUsableInJava
    public static class uv_arch_type_entry
    extends Struct {
        public char @Size(value=8) [] archtype;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_gam_range_entry")
    @NotUsableInJava
    public static class uv_gam_range_entry
    extends Struct {
        public char type;
        public char unused1;
        public @Unsigned short nasid;
        public @Unsigned short sockid;
        public @Unsigned short pnode;
        public @Unsigned int unused2;
        public @Unsigned int limit;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_gam_parameters")
    @NotUsableInJava
    public static class uv_gam_parameters
    extends Struct {
        public @Unsigned long mmr_base;
        public @Unsigned long gru_base;
        public char mmr_shift;
        public char gru_shift;
        public char gpa_shift;
        public char unused1;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_rtc_timer_head")
    @NotUsableInJava
    public static class uv_rtc_timer_head
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public int next_cpu;
        public int ncpus;
        public AnonymousType388436342C56 @Size(value=0) [] cpu;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_cpu_nmi_s")
    @NotUsableInJava
    public static class uv_cpu_nmi_s
    extends Struct {
        public Ptr<uv_hub_nmi_s> hub;
        public int state;
        public int pinging;
        public int queries;
        public int pings;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_hub_nmi_s")
    @NotUsableInJava
    public static class uv_hub_nmi_s
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock nmi_lock;
        public AtomicDefinitions.atomic_t in_nmi;
        public AtomicDefinitions.atomic_t cpu_owner;
        public AtomicDefinitions.atomic_t read_mmr_count;
        public AtomicDefinitions.atomic_t nmi_count;
        public @Unsigned long nmi_value;
        public boolean hub_present;
        public boolean pch_owner;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_cpu_info_s")
    @NotUsableInJava
    public static class uv_cpu_info_s
    extends Struct {
        public Ptr<?> p_uv_hub_info;
        public char blade_cpu_id;
        public Ptr<?> reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_hub_info_s")
    @NotUsableInJava
    public static class uv_hub_info_s
    extends Struct {
        public @Unsigned int hub_type;
        public char hub_revision;
        public @Unsigned long global_mmr_base;
        public @Unsigned long global_mmr_shift;
        public @Unsigned long gpa_mask;
        public Ptr<@Unsigned Short> socket_to_node;
        public Ptr<@Unsigned Short> socket_to_pnode;
        public Ptr<@Unsigned Short> pnode_to_socket;
        public Ptr<uv_gam_range_s> gr_table;
        public @Unsigned short min_socket;
        public @Unsigned short min_pnode;
        public char m_val;
        public char n_val;
        public char gr_table_len;
        public char apic_pnode_shift;
        public char gpa_shift;
        public char nasid_shift;
        public char m_shift;
        public char n_lshift;
        public @Unsigned int gnode_extra;
        public @Unsigned long gnode_upper;
        public @Unsigned long lowmem_remap_top;
        public @Unsigned long lowmem_remap_base;
        public @Unsigned long global_gru_base;
        public @Unsigned long global_gru_shift;
        public @Unsigned short pnode;
        public @Unsigned short pnode_mask;
        public @Unsigned short coherency_domain_number;
        public @Unsigned short numa_blade_id;
        public @Unsigned short nr_possible_cpus;
        public @Unsigned short nr_online_cpus;
        public short memory_nid;
        public Ptr<@Unsigned Short> node_to_socket;
    }

    @Type(noCCodeGeneration=true, cType="struct uv_gam_range_s")
    @NotUsableInJava
    public static class uv_gam_range_s
    extends Struct {
        public @Unsigned int limit;
        public @Unsigned short nasid;
        public @OriginalName(value="s8") byte base;
        public char reserved;
    }

    @Type(noCCodeGeneration=true, cType="enum uv_system_type")
    public static enum uv_system_type implements Enum<uv_system_type>,
    TypedEnum<uv_system_type, Integer>
    {
        UV_NONE,
        UV_LEGACY_APIC,
        UV_X2APIC;

    }

    @Type(noCCodeGeneration=true, cType="enum uv_memprotect")
    public static enum uv_memprotect implements Enum<uv_memprotect>,
    TypedEnum<uv_memprotect, Integer>
    {
        UV_MEMPROT_RESTRICT_ACCESS,
        UV_MEMPROT_ALLOW_AMO,
        UV_MEMPROT_ALLOW_RW;

    }

    @Type(noCCodeGeneration=true, cType="struct uv_systab")
    @NotUsableInJava
    public static class uv_systab
    extends Struct {
        public char @Size(value=4) [] signature;
        public @Unsigned int revision;
        public Ptr<?> function;
        public @Unsigned int size;
        public AnonymousType2079278380C54 @Size(value=1) [] entry;
    }

    @Type(noCCodeGeneration=true, cType="enum uv_bios_cmd")
    public static enum uv_bios_cmd implements Enum<uv_bios_cmd>,
    TypedEnum<uv_bios_cmd, Integer>
    {
        UV_BIOS_COMMON,
        UV_BIOS_GET_SN_INFO,
        UV_BIOS_FREQ_BASE,
        UV_BIOS_WATCHLIST_ALLOC,
        UV_BIOS_WATCHLIST_FREE,
        UV_BIOS_MEMPROTECT,
        UV_BIOS_GET_PARTITION_ADDR,
        UV_BIOS_SET_LEGACY_VGA_TARGET;

    }

    @Type(noCCodeGeneration=true, cType="struct uv_alloc_info")
    @NotUsableInJava
    public static class uv_alloc_info
    extends Struct {
        public int limit;
        public int blade;
        public @Unsigned long offset;
        public String name;
    }
}

