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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PortDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.PpsDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SystemDefinitions;
import me.bechberger.ebpf.runtime.TypeDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PtpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="ptp_convert_timestamp((const long long int*)$arg1, $arg2)")
    public static @OriginalName(value="ktime_t") long ptp_convert_timestamp(Ptr<@OriginalName(value="ktime_t") Long> hwtstamp, int vclock_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_get_vclocks_index(int pclock_index, Ptr<Ptr<Integer>> vclock_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_vclock_adjfine(Ptr<ptp_clock_info> ptp, long scaled_ppm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_vclock_adjtime(Ptr<ptp_clock_info> ptp, long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_vclock_getcrosststamp(Ptr<ptp_clock_info> ptp, Ptr<SystemDefinitions.system_device_crosststamp> xtstamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_vclock_gettime(Ptr<ptp_clock_info> ptp, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_vclock_gettimex(Ptr<ptp_clock_info> ptp, Ptr<runtime.timespec64> ts, Ptr<ptp_system_timestamp> sts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ptp_vclock_read((const struct cyclecounter*)$arg1)")
    public static @Unsigned long ptp_vclock_read(Ptr<runtime.cyclecounter> cc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ptp_vclock_refresh(Ptr<ptp_clock_info> ptp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ptp_vclock> ptp_vclock_register(Ptr<ptp_clock> pclock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ptp_vclock_settime($arg1, (const struct timespec64*)$arg2)")
    public static int ptp_vclock_settime(Ptr<ptp_clock_info> ptp, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptp_vclock_unregister(Ptr<ptp_vclock> vclock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptp_aux_kworker(Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptp_cancel_worker_sync(Ptr<ptp_clock> ptp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_clock_adjtime(Ptr<PosixDefinitions.posix_clock> pc, Ptr<KernelDefinitions.__kernel_timex> tx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_clock_getres(Ptr<PosixDefinitions.posix_clock> pc, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_clock_gettime(Ptr<PosixDefinitions.posix_clock> pc, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_clock_index(Ptr<ptp_clock> ptp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ptp_clock> ptp_clock_register(Ptr<ptp_clock_info> info2, Ptr<runtime.device> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptp_clock_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ptp_clock_settime($arg1, (const struct timespec64*)$arg2)")
    public static int ptp_clock_settime(Ptr<PosixDefinitions.posix_clock> pc, Ptr<runtime.timespec64> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_clock_unregister(Ptr<ptp_clock> ptp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptp_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_find_pin(Ptr<ptp_clock> ptp, ptp_pin_function func, @Unsigned int chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_find_pin_unlocked(Ptr<ptp_clock> ptp, ptp_pin_function func, @Unsigned int chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_getcycles64(Ptr<ptp_clock_info> info2, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_schedule_worker(Ptr<ptp_clock> ptp, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptp_classifier_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ptp_classify_raw((const struct sk_buff*)$arg1)")
    public static @Unsigned int ptp_classify_raw(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_disable_pinfunc(Ptr<ptp_clock_info> ops, ptp_pin_function func, @Unsigned int chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ptp_ioctl(Ptr<PosixDefinitions.posix_clock_context> pccontext, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ptp_msg_is_sync(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_open(Ptr<PosixDefinitions.posix_clock_context> pccontext, @Unsigned @OriginalName(value="fmode_t") int fmode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ptp_header> ptp_parse_header(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int ptp_poll(Ptr<PosixDefinitions.posix_clock_context> pccontext, Ptr<runtime.file> fp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ptp_read(Ptr<PosixDefinitions.posix_clock_context> pccontext, @Unsigned @OriginalName(value="uint") int rdflags, String buf, @Unsigned long cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_release(Ptr<PosixDefinitions.posix_clock_context> pccontext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_set_pinfunc(Ptr<ptp_clock> ptp, @Unsigned int pin, ptp_pin_function func, @Unsigned int chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ptp_cleanup_pin_groups(Ptr<ptp_clock> ptp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short ptp_is_attribute_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ptp_pin_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ptp_pin_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ptp_pin_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ptp_populate_pin_groups(Ptr<ptp_clock> ptp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_sys_offset_precise")
    @NotUsableInJava
    public static class ptp_sys_offset_precise
    extends Struct {
        public ptp_clock_time device;
        public ptp_clock_time sys_realtime;
        public ptp_clock_time sys_monoraw;
        public @Unsigned int @Size(value=4) [] rsv;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_sys_offset_extended")
    @NotUsableInJava
    public static class ptp_sys_offset_extended
    extends Struct {
        public @Unsigned int n_samples;
        public @OriginalName(value="__kernel_clockid_t") int clockid;
        public @Unsigned int @Size(value=2) [] rsv;
        public ptp_clock_time @Size(value=75) [] ts;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_sys_offset")
    @NotUsableInJava
    public static class ptp_sys_offset
    extends Struct {
        public @Unsigned int n_samples;
        public @Unsigned int @Size(value=3) [] rsv;
        public ptp_clock_time @Size(value=51) [] ts;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_clock_caps")
    @NotUsableInJava
    public static class ptp_clock_caps
    extends Struct {
        public int max_adj;
        public int n_alarm;
        public int n_ext_ts;
        public int n_per_out;
        public int pps;
        public int n_pins;
        public int cross_timestamping;
        public int adjust_phase;
        public int max_phase_adj;
        public int @Size(value=11) [] rsv;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_clock_event")
    @NotUsableInJava
    public static class ptp_clock_event
    extends Struct {
        public int type;
        public int index;
        @InlineUnion(value=65696)
        public @InlineUnion(value=65696) @Unsigned long timestamp;
        @InlineUnion(value=65696)
        public @InlineUnion(value=65696) long offset;
        @InlineUnion(value=65696)
        public  @InlineUnion(value=65696) PpsDefinitions.pps_event_time pps_times;
    }

    @Type(noCCodeGeneration=true, cType="enum ptp_clock_events")
    public static enum ptp_clock_events implements Enum<ptp_clock_events>,
    TypedEnum<ptp_clock_events, Integer>
    {
        PTP_CLOCK_ALARM,
        PTP_CLOCK_EXTTS,
        PTP_CLOCK_EXTOFF,
        PTP_CLOCK_PPS,
        PTP_CLOCK_PPSUSR;

    }

    @Type(noCCodeGeneration=true, cType="struct ptp_header")
    @NotUsableInJava
    public static class ptp_header
    extends Struct {
        public char tsmt;
        public char ver;
        public @Unsigned @OriginalName(value="__be16") short message_length;
        public char domain_number;
        public char reserved1;
        public char @Size(value=2) [] flag_field;
        public @Unsigned @OriginalName(value="__be64") long correction;
        public @Unsigned @OriginalName(value="__be32") int reserved2;
        public PortDefinitions.port_identity source_port_identity;
        public @Unsigned @OriginalName(value="__be16") short sequence_id;
        public char control;
        public char log_message_interval;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_vclock")
    @NotUsableInJava
    public static class ptp_vclock
    extends Struct {
        public Ptr<ptp_clock> pclock;
        public ptp_clock_info info;
        public Ptr<ptp_clock> clock;
        public misc.hlist_node vclock_hash_node;
        public runtime.cyclecounter cc;
        public runtime.timecounter tc;
        public runtime.mutex lock;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_clock")
    @NotUsableInJava
    public static class ptp_clock
    extends Struct {
        public PosixDefinitions.posix_clock clock;
        public runtime.device dev;
        public Ptr<ptp_clock_info> info;
        public @Unsigned @OriginalName(value="dev_t") int devid;
        public int index;
        public Ptr<PpsDefinitions.pps_device> pps_source;
        public long dialed_frequency;
        public ListDefinitions.list_head tsevqs;
        public  @OriginalName(value="spinlock_t") runtime.spinlock tsevqs_lock;
        public runtime.mutex pincfg_mux;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head tsev_wq;
        public int defunct;
        public Ptr<DeviceDefinitions.device_attribute> pin_dev_attr;
        public Ptr<Ptr<runtime.attribute>> pin_attr;
        public AttributeDefinitions.attribute_group pin_attr_group;
        public Ptr<AttributeDefinitions.attribute_group> @Size(value=2) [] pin_attr_groups;
        public Ptr<KthreadDefinitions.kthread_worker> kworker;
        public KthreadDefinitions.kthread_delayed_work aux_work;
        public @Unsigned int max_vclocks;
        public @Unsigned int n_vclocks;
        public Ptr<Integer> vclock_index;
        public runtime.mutex n_vclocks_mux;
        public boolean is_virtual_clock;
        public boolean has_cycles;
        public Ptr<runtime.dentry> debugfs_root;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_clock_info")
    @NotUsableInJava
    public static class ptp_clock_info
    extends Struct {
        public Ptr<runtime.module> owner;
        public char @Size(value=32) [] name;
        public int max_adj;
        public int n_alarm;
        public int n_ext_ts;
        public int n_per_out;
        public int n_pins;
        public int pps;
        public Ptr<ptp_pin_desc> pin_config;
        public Ptr<?> adjfine;
        public Ptr<?> adjphase;
        public Ptr<?> getmaxphase;
        public Ptr<?> adjtime;
        public Ptr<?> gettime64;
        public Ptr<?> gettimex64;
        public Ptr<?> getcrosststamp;
        public Ptr<?> settime64;
        public Ptr<?> getcycles64;
        public Ptr<?> getcyclesx64;
        public Ptr<?> getcrosscycles;
        public Ptr<?> enable;
        public Ptr<?> verify;
        public Ptr<?> do_aux_work;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_system_timestamp")
    @NotUsableInJava
    public static class ptp_system_timestamp
    extends Struct {
        public runtime.timespec64 pre_ts;
        public runtime.timespec64 post_ts;
        public @OriginalName(value="clockid_t") int clockid;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_clock_request")
    @NotUsableInJava
    public static class ptp_clock_request
    extends Struct {
        public TypeDefinitions.type_of_ptp_clock_request type;
        @InlineUnion(value=22137)
        public @InlineUnion(value=22137) ptp_extts_request extts;
        @InlineUnion(value=22137)
        public @InlineUnion(value=22137) ptp_perout_request perout;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_extts_event")
    @NotUsableInJava
    public static class ptp_extts_event
    extends Struct {
        public ptp_clock_time t;
        public @Unsigned int index;
        public @Unsigned int flags;
        public @Unsigned int @Size(value=2) [] rsv;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_pin_desc")
    @NotUsableInJava
    public static class ptp_pin_desc
    extends Struct {
        public char @Size(value=64) [] name;
        public @Unsigned int index;
        public @Unsigned int func;
        public @Unsigned int chan;
        public @Unsigned int @Size(value=5) [] rsv;
    }

    @Type(noCCodeGeneration=true, cType="enum ptp_pin_function")
    public static enum ptp_pin_function implements Enum<ptp_pin_function>,
    TypedEnum<ptp_pin_function, Integer>
    {
        PTP_PF_NONE,
        PTP_PF_EXTTS,
        PTP_PF_PEROUT,
        PTP_PF_PHYSYNC;

    }

    @Type(noCCodeGeneration=true, cType="struct ptp_perout_request")
    @NotUsableInJava
    public static class ptp_perout_request
    extends Struct {
        @InlineUnion(value=22117)
        public @InlineUnion(value=22117) ptp_clock_time start;
        @InlineUnion(value=22117)
        public @InlineUnion(value=22117) ptp_clock_time phase;
        public ptp_clock_time period;
        public @Unsigned int index;
        public @Unsigned int flags;
        @InlineUnion(value=22118)
        public @InlineUnion(value=22118) ptp_clock_time on;
        @InlineUnion(value=22118)
        public @InlineUnion(value=22118) @Unsigned int @Size(value=4) [] rsv;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_extts_request")
    @NotUsableInJava
    public static class ptp_extts_request
    extends Struct {
        public @Unsigned int index;
        public @Unsigned int flags;
        public @Unsigned int @Size(value=2) [] rsv;
    }

    @Type(noCCodeGeneration=true, cType="struct ptp_clock_time")
    @NotUsableInJava
    public static class ptp_clock_time
    extends Struct {
        public long sec;
        public @Unsigned int nsec;
        public @Unsigned int reserved;
    }
}

