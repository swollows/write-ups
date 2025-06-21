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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PowerDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HidDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hid_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hid_bpf_allocate_data(Ptr<hid_device> hdev, Ptr<Ptr<Character>> data, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hid_bpf_hw_check_params(Ptr<hid_bpf_ctx> ctx, Ptr<Character> buf, Ptr<@Unsigned Long> buf__sz, hid_report_type rtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hid_bpf_input_report(Ptr<hid_bpf_ctx> ctx, hid_report_type type2, Ptr<Character> buf, @Unsigned long size, boolean lock_already_taken) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<hid_bpf_ctx> hid_bpf_allocate_context(@Unsigned int hid_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_allocate_event_data(Ptr<hid_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_connect_device(Ptr<hid_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hid_bpf_destroy_device(Ptr<hid_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_device_init(Ptr<hid_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hid_bpf_disconnect_device(Ptr<hid_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hid_bpf_get_data($arg1, $arg2, (const long unsigned int)$arg3)")
    public static Ptr<Character> hid_bpf_get_data(Ptr<hid_bpf_ctx> ctx, @Unsigned int offset, @Unsigned long rdwr_buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_hw_output_report(Ptr<hid_bpf_ctx> ctx, Ptr<Character> buf, @Unsigned long buf__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_hw_request(Ptr<hid_bpf_ctx> ctx, Ptr<Character> buf, @Unsigned long buf__sz, hid_report_type rtype, hid_class_request reqtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hid_bpf_input_report($arg1, $arg2, $arg3, (const long unsigned int)$arg4)")
    public static int hid_bpf_input_report(Ptr<hid_bpf_ctx> ctx, hid_report_type type2, Ptr<Character> buf, @Unsigned long buf__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_reconnect(Ptr<hid_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hid_bpf_release_context(Ptr<hid_bpf_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hid_bpf_try_input_report($arg1, $arg2, $arg3, (const long unsigned int)$arg4)")
    public static int hid_bpf_try_input_report(Ptr<hid_bpf_ctx> ctx, hid_report_type type2, Ptr<Character> buf, @Unsigned long buf__sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<hid_device> hid_get_device(@Unsigned int hid_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hid_put_device(Ptr<hid_device> hid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hid_bpf_device_event(Ptr<hid_bpf_ctx> ctx, hid_report_type type2, @Unsigned long source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hid_bpf_hw_output_report(Ptr<hid_bpf_ctx> ctx, @Unsigned long source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hid_bpf_hw_request(Ptr<hid_bpf_ctx> ctx, char reportnum, hid_report_type rtype, hid_class_request reqtype, @Unsigned long source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hid_bpf_ops_destroy_device(Ptr<hid_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hid_bpf_rdesc_fixup(Ptr<hid_bpf_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hid_bpf_ops_btf_struct_access($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4)")
    public static int hid_bpf_ops_btf_struct_access(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<BpfDefinitions.bpf_reg_state> reg, int off, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hid_bpf_ops_check_member((const struct btf_type*)$arg1, (const struct btf_member*)$arg2, (const struct bpf_prog*)$arg3)")
    public static int hid_bpf_ops_check_member(Ptr<BtfDefinitions.btf_type> t, Ptr<BtfDefinitions.btf_member> member, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_ops_init(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hid_bpf_ops_init_member((const struct btf_type*)$arg1, (const struct btf_member*)$arg2, $arg3, (const void*)$arg4)")
    public static int hid_bpf_ops_init_member(Ptr<BtfDefinitions.btf_type> t, Ptr<BtfDefinitions.btf_member> member, Ptr<?> kdata, Ptr<?> udata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hid_bpf_ops_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean hid_bpf_ops_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_reg(Ptr<?> kdata, Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hid_bpf_struct_ops_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hid_bpf_unreg(Ptr<?> kdata, Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hid_bpf_ctx_kern")
    @NotUsableInJava
    public static class hid_bpf_ctx_kern
    extends Struct {
        public hid_bpf_ctx ctx;
        public Ptr<Character> data;
        public boolean from_bpf;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_ops")
    @NotUsableInJava
    public static class hid_ops
    extends Struct {
        public Ptr<?> hid_get_report;
        public Ptr<?> hid_hw_raw_request;
        public Ptr<?> hid_hw_output_report;
        public Ptr<?> hid_input_report;
        public Ptr<runtime.module> owner;
        public Ptr<BusDefinitions.bus_type> bus_type;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_uid")
    @NotUsableInJava
    public static class hid_uid
    extends Struct {
        public String hid;
        public String uid;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_bpf_offset_write_range")
    @NotUsableInJava
    public static class hid_bpf_offset_write_range
    extends Struct {
        public String struct_name;
        public @Unsigned int struct_length;
        public @Unsigned int start;
        public @Unsigned int end;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_usage_id")
    @NotUsableInJava
    public static class hid_usage_id
    extends Struct {
        public @Unsigned int usage_hid;
        public @Unsigned int usage_type;
        public @Unsigned int usage_code;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_report_id")
    @NotUsableInJava
    public static class hid_report_id
    extends Struct {
        public @Unsigned int report_type;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_ll_driver")
    @NotUsableInJava
    public static class hid_ll_driver
    extends Struct {
        public Ptr<?> start;
        public Ptr<?> stop;
        public Ptr<?> open;
        public Ptr<?> close;
        public Ptr<?> power;
        public Ptr<?> parse;
        public Ptr<?> request;
        public Ptr<?> wait;
        public Ptr<?> raw_request;
        public Ptr<?> output_report;
        public Ptr<?> idle;
        public Ptr<?> may_wakeup;
        public @Unsigned int max_buffer_size;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_driver")
    @NotUsableInJava
    public static class hid_driver
    extends Struct {
        public String name;
        public Ptr<hid_device_id> id_table;
        public ListDefinitions.list_head dyn_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock dyn_lock;
        public Ptr<?> match;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<hid_report_id> report_table;
        public Ptr<?> raw_event;
        public Ptr<hid_usage_id> usage_table;
        public Ptr<?> event;
        public Ptr<?> report;
        public Ptr<?> report_fixup;
        public Ptr<?> input_mapping;
        public Ptr<?> input_mapped;
        public Ptr<?> input_configured;
        public Ptr<?> feature_mapping;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> reset_resume;
        public DeviceDefinitions.device_driver driver;
    }

    @Type(noCCodeGeneration=true, cType="enum hid_battery_status")
    public static enum hid_battery_status implements Enum<hid_battery_status>,
    TypedEnum<hid_battery_status, Integer>
    {
        HID_BATTERY_UNKNOWN,
        HID_BATTERY_QUERIED,
        HID_BATTERY_REPORTED;

    }

    @Type(noCCodeGeneration=true, cType="enum hid_type")
    public static enum hid_type implements Enum<hid_type>,
    TypedEnum<hid_type, Integer>
    {
        HID_TYPE_OTHER,
        HID_TYPE_USBMOUSE,
        HID_TYPE_USBNONE;

    }

    @Type(noCCodeGeneration=true, cType="struct hid_field_entry")
    @NotUsableInJava
    public static class hid_field_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<hid_field> field;
        public @Unsigned int index;
        public int priority;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_input")
    @NotUsableInJava
    public static class hid_input
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<hid_report> report;
        public Ptr<InputDefinitions.input_dev> input;
        public String name;
        public ListDefinitions.list_head reports;
        public @Unsigned int application;
        public boolean registered;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_field")
    @NotUsableInJava
    public static class hid_field
    extends Struct {
        public @Unsigned int physical;
        public @Unsigned int logical;
        public @Unsigned int application;
        public Ptr<hid_usage> usage;
        public @Unsigned int maxusage;
        public @Unsigned int flags;
        public @Unsigned int report_offset;
        public @Unsigned int report_size;
        public @Unsigned int report_count;
        public @Unsigned int report_type;
        public Ptr<Integer> value;
        public Ptr<Integer> new_value;
        public Ptr<Integer> usages_priorities;
        public int logical_minimum;
        public int logical_maximum;
        public int physical_minimum;
        public int physical_maximum;
        public int unit_exponent;
        public @Unsigned int unit;
        public boolean ignored;
        public Ptr<hid_report> report;
        public @Unsigned int index;
        public Ptr<hid_input> hidinput;
        public @Unsigned short dpad;
        public @Unsigned int slot_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_usage")
    @NotUsableInJava
    public static class hid_usage
    extends Struct {
        public @Unsigned int hid;
        public @Unsigned int collection_index;
        public @Unsigned int usage_index;
        public byte resolution_multiplier;
        public byte wheel_factor;
        public @Unsigned short code;
        public char type;
        public short hat_min;
        public short hat_max;
        public short hat_dir;
        public short wheel_accumulated;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_collection")
    @NotUsableInJava
    public static class hid_collection
    extends Struct {
        public int parent_idx;
        public @Unsigned int type;
        public @Unsigned int usage;
        public @Unsigned int level;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_bpf")
    @NotUsableInJava
    public static class hid_bpf
    extends Struct {
        public Ptr<Character> device_data;
        public @Unsigned int allocated_data;
        public boolean destroyed;
        public Ptr<hid_bpf_ops> rdesc_ops;
        public ListDefinitions.list_head prog_list;
        public runtime.mutex prog_list_lock;
        public SrcuDefinitions.srcu_struct srcu;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_bpf_ops")
    @NotUsableInJava
    public static class hid_bpf_ops
    extends Struct {
        public int hid_id;
        public @Unsigned int flags;
        public ListDefinitions.list_head list;
        public Ptr<?> hid_device_event;
        public Ptr<?> hid_rdesc_fixup;
        public Ptr<?> hid_hw_request;
        public Ptr<?> hid_hw_output_report;
        public Ptr<hid_device> hdev;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_report_enum")
    @NotUsableInJava
    public static class hid_report_enum
    extends Struct {
        public @Unsigned int numbered;
        public ListDefinitions.list_head report_list;
        public Ptr<hid_report> @Size(value=256) [] report_id_hash;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_report")
    @NotUsableInJava
    public static class hid_report
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head hidinput_list;
        public ListDefinitions.list_head field_entry_list;
        public @Unsigned int id;
        public hid_report_type type;
        public @Unsigned int application;
        public Ptr<hid_field> @Size(value=256) [] field;
        public Ptr<hid_field_entry> field_entries;
        public @Unsigned int maxfield;
        public @Unsigned int size;
        public Ptr<hid_device> device;
        public boolean tool_active;
        public @Unsigned int tool;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_device")
    @NotUsableInJava
    public static class hid_device
    extends Struct {
        public Ptr<Character> dev_rdesc;
        public @Unsigned int dev_rsize;
        public Ptr<Character> rdesc;
        public @Unsigned int rsize;
        public Ptr<hid_collection> collection;
        public @Unsigned int collection_size;
        public @Unsigned int maxcollection;
        public @Unsigned int maxapplication;
        public @Unsigned short bus;
        public @Unsigned short group;
        public @Unsigned int vendor;
        public @Unsigned int product;
        public @Unsigned int version;
        public hid_type type;
        public @Unsigned int country;
        public hid_report_enum @Size(value=3) [] report_enum;
        public misc.work_struct led_work;
        public runtime.semaphore driver_input_lock;
        public runtime.device dev;
        public Ptr<hid_driver> driver;
        public Ptr<?> devres_group_id;
        public Ptr<hid_ll_driver> ll_driver;
        public runtime.mutex ll_open_lock;
        public @Unsigned int ll_open_count;
        public Ptr<PowerDefinitions.power_supply> battery;
        public int battery_capacity;
        public int battery_min;
        public int battery_max;
        public int battery_report_type;
        public int battery_report_id;
        public int battery_charge_status;
        public hid_battery_status battery_status;
        public boolean battery_avoid_query;
        public @OriginalName(value="ktime_t") long battery_ratelimit_time;
        public @Unsigned long status;
        public @Unsigned int claimed;
        public @Unsigned int quirks;
        public @Unsigned int initial_quirks;
        public boolean io_started;
        public ListDefinitions.list_head inputs;
        public Ptr<?> hiddev;
        public Ptr<?> hidraw;
        public char @Size(value=128) [] name;
        public char @Size(value=64) [] phys;
        public char @Size(value=64) [] uniq;
        public Ptr<?> driver_data;
        public Ptr<?> ff_init;
        public Ptr<?> hiddev_connect;
        public Ptr<?> hiddev_disconnect;
        public Ptr<?> hiddev_hid_event;
        public Ptr<?> hiddev_report_event;
        public @Unsigned short debug;
        public Ptr<runtime.dentry> debug_dir;
        public Ptr<runtime.dentry> debug_rdesc;
        public Ptr<runtime.dentry> debug_events;
        public ListDefinitions.list_head debug_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock debug_list_lock;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head debug_wait;
        public runtime.kref ref;
        public @Unsigned int id;
        public hid_bpf bpf;
    }

    @Type(noCCodeGeneration=true, cType="struct hid_bpf_ctx")
    @NotUsableInJava
    public static class hid_bpf_ctx
    extends Struct {
        public Ptr<hid_device> hid;
        public @Unsigned int allocated_size;
        @InlineUnion(value=22734)
        public @InlineUnion(value=22734) int retval;
        @InlineUnion(value=22734)
        public @InlineUnion(value=22734) int size;
    }

    @Type(noCCodeGeneration=true, cType="enum hid_class_request")
    public static enum hid_class_request implements Enum<hid_class_request>,
    TypedEnum<hid_class_request, Integer>
    {
        HID_REQ_GET_REPORT,
        HID_REQ_GET_IDLE,
        HID_REQ_GET_PROTOCOL,
        HID_REQ_SET_REPORT,
        HID_REQ_SET_IDLE,
        HID_REQ_SET_PROTOCOL;

    }

    @Type(noCCodeGeneration=true, cType="enum hid_report_type")
    public static enum hid_report_type implements Enum<hid_report_type>,
    TypedEnum<hid_report_type, Integer>
    {
        HID_INPUT_REPORT,
        HID_OUTPUT_REPORT,
        HID_FEATURE_REPORT,
        HID_REPORT_TYPES;

    }

    @Type(noCCodeGeneration=true, cType="struct hid_device_id")
    @NotUsableInJava
    public static class hid_device_id
    extends Struct {
        public @Unsigned short bus;
        public @Unsigned short group;
        public @Unsigned int vendor;
        public @Unsigned int product;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }
}

