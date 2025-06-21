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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PtDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pt_addr_filters_init(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_buffer_free_aux(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pt_buffer_reset_markers(Ptr<pt_buffer> buf, Ptr<PerfDefinitions.perf_output_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_buffer_reset_offsets(Ptr<pt_buffer> buf, @Unsigned long head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pt_buffer_setup_aux(Ptr<PerfDefinitions.perf_event> event2, Ptr<Ptr<?>> pages, int nr_pages, boolean snapshot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pt_cap_show(Ptr<runtime.device> cdev2, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_config_buffer(Ptr<pt_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pt_event_add(Ptr<PerfDefinitions.perf_event> event2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_event_addr_filters_sync(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pt_event_addr_filters_validate(Ptr<ListDefinitions.list_head> filters) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_event_del(Ptr<PerfDefinitions.perf_event> event2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_event_destroy(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pt_event_init(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_event_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pt_event_snapshot_aux(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_output_handle> handle, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_event_start(Ptr<PerfDefinitions.perf_event> event2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_event_stop(Ptr<PerfDefinitions.perf_event> event2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pt_event_valid(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_handle_status(Ptr<pt> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pt_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pt_pmu_hw_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_read_offset(Ptr<pt_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_regs_to_gdb_regs(Ptr<@Unsigned Long> gdb_regs, Ptr<pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pt_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pt_timing_attr_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_topa_dump(Ptr<pt_buffer> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.topa_entry> pt_topa_entry_for_page(Ptr<pt_buffer> buf, @Unsigned int pg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pt_update_head(Ptr<pt> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pt_dump_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pt")
    @NotUsableInJava
    public static class pt
    extends Struct {
        public PerfDefinitions.perf_output_handle handle;
        public pt_filters filters;
        public int handle_nmi;
        public int vmx_on;
        public @Unsigned long output_base;
        public @Unsigned long output_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct pt_info")
    @NotUsableInJava
    public static class pt_info
    extends Struct {
        public int pi_nblocks;
        public @Unsigned int pi_blkoff;
    }

    @Type(noCCodeGeneration=true, cType="struct pt_regs_offset")
    @NotUsableInJava
    public static class pt_regs_offset
    extends Struct {
        public String name;
        public int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct pt_address_range")
    @NotUsableInJava
    public static class pt_address_range
    extends Struct {
        public @Unsigned long msr_a;
        public @Unsigned long msr_b;
        public @Unsigned int reg_off;
    }

    @Type(noCCodeGeneration=true, cType="struct pt_cap_desc")
    @NotUsableInJava
    public static class pt_cap_desc
    extends Struct {
        public String name;
        public @Unsigned int leaf;
        public char reg;
        public @Unsigned int mask;
    }

    @Type(noCCodeGeneration=true, cType="struct pt_filters")
    @NotUsableInJava
    public static class pt_filters
    extends Struct {
        public pt_filter @Size(value=4) [] filter;
        public @Unsigned int nr_filters;
    }

    @Type(noCCodeGeneration=true, cType="struct pt_filter")
    @NotUsableInJava
    public static class pt_filter
    extends Struct {
        public @Unsigned long msr_a;
        public @Unsigned long msr_b;
        public @Unsigned long config;
    }

    @Type(noCCodeGeneration=true, cType="struct pt_buffer")
    @NotUsableInJava
    public static class pt_buffer
    extends Struct {
        public ListDefinitions.list_head tables;
        public Ptr<runtime.topa> first;
        public Ptr<runtime.topa> last;
        public Ptr<runtime.topa> cur;
        public @Unsigned int cur_idx;
        public @Unsigned long output_off;
        public @Unsigned long nr_pages;
        public LocalDefinitions.local_t data_size;
        public misc.local64_t head;
        public boolean snapshot;
        public boolean single;
        public boolean wrapped;
        public long stop_pos;
        public long intr_pos;
        public Ptr<misc.topa_entry> stop_te;
        public Ptr<misc.topa_entry> intr_te;
        public Ptr<Ptr<?>> data_pages;
    }

    @Type(noCCodeGeneration=true, cType="struct pt_pmu")
    @NotUsableInJava
    public static class pt_pmu
    extends Struct {
        public runtime.pmu pmu;
        public @Unsigned int @Size(value=8) [] caps;
        public boolean vmx;
        public boolean branch_en_always_on;
        public @Unsigned long max_nonturbo_ratio;
        public @Unsigned int tsc_art_num;
        public @Unsigned int tsc_art_den;
    }

    @Type(noCCodeGeneration=true, cType="enum pt_capabilities")
    public static enum pt_capabilities implements Enum<pt_capabilities>,
    TypedEnum<pt_capabilities, Integer>
    {
        PT_CAP_max_subleaf,
        PT_CAP_cr3_filtering,
        PT_CAP_psb_cyc,
        PT_CAP_ip_filtering,
        PT_CAP_mtc,
        PT_CAP_ptwrite,
        PT_CAP_power_event_trace,
        PT_CAP_event_trace,
        PT_CAP_tnt_disable,
        PT_CAP_topa_output,
        PT_CAP_topa_multiple_entries,
        PT_CAP_single_range_output,
        PT_CAP_output_subsys,
        PT_CAP_payloads_lip,
        PT_CAP_num_address_ranges,
        PT_CAP_mtc_periods,
        PT_CAP_cycle_thresholds,
        PT_CAP_psb_periods;

    }

    @Type(noCCodeGeneration=true, cType="enum pt_level")
    public static enum pt_level implements Enum<pt_level>,
    TypedEnum<pt_level, Integer>
    {
        PT_PGD,
        PT_P4D,
        PT_PUD,
        PT_PMD,
        PT_PTE;

    }

    @Type(noCCodeGeneration=true, cType="struct pt_regs")
    @NotUsableInJava
    public static class pt_regs
    extends Struct {
        public @Unsigned long r15;
        public @Unsigned long r14;
        public @Unsigned long r13;
        public @Unsigned long r12;
        public @Unsigned long bp;
        public @Unsigned long bx;
        public @Unsigned long r11;
        public @Unsigned long r10;
        public @Unsigned long r9;
        public @Unsigned long r8;
        public @Unsigned long ax;
        public @Unsigned long cx;
        public @Unsigned long dx;
        public @Unsigned long si;
        public @Unsigned long di;
        public @Unsigned long orig_ax;
        public @Unsigned long ip;
        @InlineUnion(value=88)
        public @InlineUnion(value=88) @Unsigned short cs;
        @InlineUnion(value=88)
        public @InlineUnion(value=88) @Unsigned long csx;
        @InlineUnion(value=88)
        public  @InlineUnion(value=88) FredDefinitions.fred_cs fred_cs;
        public @Unsigned long flags;
        public @Unsigned long sp;
        @InlineUnion(value=89)
        public @InlineUnion(value=89) @Unsigned short ss;
        @InlineUnion(value=89)
        public @InlineUnion(value=89) @Unsigned long ssx;
        @InlineUnion(value=89)
        public  @InlineUnion(value=89) FredDefinitions.fred_ss fred_ss;
    }
}

