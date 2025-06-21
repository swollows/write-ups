/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ArchDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HwDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hw_breakpoint_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hw_protection_shutdown((const u8*)$arg1, $arg2, $arg3)")
    public static void __hw_protection_shutdown(String reason, int ms_until_forced, boolean shutdown2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hw_breakpoint_add(Ptr<PerfDefinitions.perf_event> bp, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hw_breakpoint_del(Ptr<PerfDefinitions.perf_event> bp, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hw_breakpoint_event_init(Ptr<PerfDefinitions.perf_event> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hw_breakpoint_is_used() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hw_breakpoint_start(Ptr<PerfDefinitions.perf_event> bp, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hw_breakpoint_stop(Ptr<PerfDefinitions.perf_event> bp, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hw_failure_emergency_poweroff_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hw_break_release_slot(int breakno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hw_break_reserve_slot(int breakno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hw_breakpoint_arch_parse($arg1, (const struct perf_event_attr*)$arg2, $arg3)")
    public static int hw_breakpoint_arch_parse(Ptr<PerfDefinitions.perf_event> bp, Ptr<PerfDefinitions.perf_event_attr> attr2, Ptr<ArchDefinitions.arch_hw_breakpoint> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hw_breakpoint_exceptions_notify(Ptr<misc.notifier_block> unused, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hw_breakpoint_pmu_read(Ptr<PerfDefinitions.perf_event> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hw_breakpoint_restore() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hw_addr_add_ex($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int __hw_addr_add_ex(Ptr<NetdevDefinitions.netdev_hw_addr_list> list, String addr2, int addr_len, char addr_type, boolean global, boolean sync2, int sync_count, boolean exclusive) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hw_addr_create((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<NetdevDefinitions.netdev_hw_addr> __hw_addr_create(String addr2, int addr_len, char addr_type, boolean global, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hw_addr_del_entry(Ptr<NetdevDefinitions.netdev_hw_addr_list> list, Ptr<NetdevDefinitions.netdev_hw_addr> ha, boolean global, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hw_addr_del_ex($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int __hw_addr_del_ex(Ptr<NetdevDefinitions.netdev_hw_addr_list> list, String addr2, int addr_len, char addr_type, boolean global, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hw_addr_init(Ptr<NetdevDefinitions.netdev_hw_addr_list> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hw_addr_insert(Ptr<NetdevDefinitions.netdev_hw_addr_list> list, Ptr<NetdevDefinitions.netdev_hw_addr> _new, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hw_addr_ref_sync_dev($arg1, $arg2, (int (*)(struct net_device*, const u8*, int))$arg3, (int (*)(struct net_device*, const u8*, int))$arg4)")
    public static int __hw_addr_ref_sync_dev(Ptr<NetdevDefinitions.netdev_hw_addr_list> list, Ptr<NetDefinitions.net_device> dev, Ptr<?> sync2, Ptr<?> unsync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hw_addr_ref_unsync_dev($arg1, $arg2, (int (*)(struct net_device*, const u8*, int))$arg3)")
    public static void __hw_addr_ref_unsync_dev(Ptr<NetdevDefinitions.netdev_hw_addr_list> list, Ptr<NetDefinitions.net_device> dev, Ptr<?> unsync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hw_addr_sync(Ptr<NetdevDefinitions.netdev_hw_addr_list> to_list, Ptr<NetdevDefinitions.netdev_hw_addr_list> from_list, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hw_addr_sync_dev($arg1, $arg2, (int (*)(struct net_device*, const u8*))$arg3, (int (*)(struct net_device*, const u8*))$arg4)")
    public static int __hw_addr_sync_dev(Ptr<NetdevDefinitions.netdev_hw_addr_list> list, Ptr<NetDefinitions.net_device> dev, Ptr<?> sync2, Ptr<?> unsync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hw_addr_sync_multiple(Ptr<NetdevDefinitions.netdev_hw_addr_list> to_list, Ptr<NetdevDefinitions.netdev_hw_addr_list> from_list, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hw_addr_sync_one(Ptr<NetdevDefinitions.netdev_hw_addr_list> to_list, Ptr<NetdevDefinitions.netdev_hw_addr> ha, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hw_addr_unsync(Ptr<NetdevDefinitions.netdev_hw_addr_list> to_list, Ptr<NetdevDefinitions.netdev_hw_addr_list> from_list, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hw_addr_unsync_dev($arg1, $arg2, (int (*)(struct net_device*, const u8*))$arg3)")
    public static void __hw_addr_unsync_dev(Ptr<NetdevDefinitions.netdev_hw_addr_list> list, Ptr<NetDefinitions.net_device> dev, Ptr<?> unsync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long hw_nmi_get_sample_period(int watchdog_thresh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hw_params_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hw_params_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hw_perf_event_destroy(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hw_perf_lbr_event_destroy(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hw_state_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hw_breakpoint")
    @NotUsableInJava
    public static class hw_breakpoint
    extends Struct {
        public @Unsigned int enabled;
        public @Unsigned long addr;
        public int len;
        public int type;
        public Ptr<Ptr<PerfDefinitions.perf_event>> pev;
    }

    @Type(noCCodeGeneration=true, cType="enum hw_event_mc_err_type")
    public static enum hw_event_mc_err_type implements Enum<hw_event_mc_err_type>,
    TypedEnum<hw_event_mc_err_type, Integer>
    {
        HW_EVENT_ERR_CORRECTED,
        HW_EVENT_ERR_UNCORRECTED,
        HW_EVENT_ERR_DEFERRED,
        HW_EVENT_ERR_FATAL,
        HW_EVENT_ERR_INFO;

    }

    @Type(noCCodeGeneration=true, cType="struct { long long unsigned int hardware_exit_reason; }")
    @NotUsableInJava
    public static class hw_of_anon_member_of_kvm_run
    extends Struct {
        public @Unsigned long hardware_exit_reason;
    }

    @Type(noCCodeGeneration=true, cType="struct hw_port_info")
    @NotUsableInJava
    public static class hw_port_info
    extends Struct {
        public Ptr<NetDefinitions.net_device> lower_dev;
        public @Unsigned int port_id;
    }

    @Type(noCCodeGeneration=true, cType="struct hw_perf_event")
    @NotUsableInJava
    public static class hw_perf_event
    extends Struct {
        @InlineUnion(value=2060)
        public  @InlineUnion(value=2060) AnonDefinitions.anon_member_of_anon_member_of_hw_perf_event anon0$0;
        @InlineUnion(value=2060)
        public  @InlineUnion(value=2060) AnonDefinitions.anon_member_of_anon_member_of_hw_perf_event anon0$1;
        @InlineUnion(value=2060)
        public  @InlineUnion(value=2060) AnonDefinitions.anon_member_of_anon_member_of_hw_perf_event anon0$2;
        @InlineUnion(value=2060)
        public  @InlineUnion(value=2060) AnonDefinitions.anon_member_of_anon_member_of_hw_perf_event anon0$3;
        @InlineUnion(value=2060)
        public  @InlineUnion(value=2060) AnonDefinitions.anon_member_of_anon_member_of_hw_perf_event anon0$4;
        @InlineUnion(value=2060)
        public  @InlineUnion(value=2060) AnonDefinitions.anon_member_of_anon_member_of_hw_perf_event anon0$5;
        @InlineUnion(value=2060)
        public  @InlineUnion(value=2060) AnonDefinitions.anon_member_of_anon_member_of_hw_perf_event anon0$6;
        public Ptr<TaskDefinitions.task_struct> target;
        public Ptr<?> addr_filters;
        public @Unsigned long addr_filters_gen;
        public int state;
        public misc.local64_t prev_count;
        public @Unsigned long sample_period;
        @InlineUnion(value=2063)
        public  @InlineUnion(value=2063) AnonDefinitions.anon_member_of_anon_member_of_hw_perf_event anon7$0;
        @InlineUnion(value=2063)
        public  @InlineUnion(value=2063) AnonDefinitions.anon_member_of_anon_member_of_hw_perf_event anon7$1;
        public @Unsigned long interrupts_seq;
        public @Unsigned long interrupts;
        public @Unsigned long freq_time_stamp;
        public @Unsigned long freq_count_stamp;
    }

    @Type(noCCodeGeneration=true, cType="struct hw_perf_event_extra")
    @NotUsableInJava
    public static class hw_perf_event_extra
    extends Struct {
        public @Unsigned long config;
        public @Unsigned int reg;
        public int alloc;
        public int idx;
    }
}

