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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FfDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.Seg6Definitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class InputDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __input_mt_drop_unused(Ptr<input_dev> dev, Ptr<input_mt> mt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_mt_assign_slots($arg1, $arg2, (const struct input_mt_pos*)$arg3, $arg4, $arg5)")
    public static int input_mt_assign_slots(Ptr<input_dev> dev, Ptr<Integer> slots, Ptr<input_mt_pos> pos, int num_pos, int dmax) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_mt_destroy_slots(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_mt_drop_unused(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_mt_get_slot_by_key(Ptr<input_dev> dev, int key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_mt_init_slots(Ptr<input_dev> dev, @Unsigned int num_slots, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_mt_release_slots(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_mt_report_finger_count(Ptr<input_dev> dev, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_mt_report_pointer_emulation(Ptr<input_dev> dev, boolean use_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean input_mt_report_slot_state(Ptr<input_dev> dev, @Unsigned int tool_type, boolean active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_mt_sync_frame(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __input_release_device(Ptr<input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __input_unregister_device(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_b6(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_b6_encap(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_bpf(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_core(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_dt4(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_dt46(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_dt6(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_dx2(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_dx4(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_dx4_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_dx6(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_dx6_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_t(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_x(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_action_end_x_core(Ptr<SkDefinitions.sk_buff> skb, Ptr<Seg6Definitions.seg6_local_lwt> slwt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_add_uevent_bm_var($arg1, (const u8*)$arg2, (const long unsigned int*)$arg3, $arg4)")
    public static int input_add_uevent_bm_var(Ptr<KobjDefinitions.kobj_uevent_env> env, String name, Ptr<@Unsigned Long> bitmap2, int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_alloc_absinfo(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<input_dev> input_allocate_device() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_attach_handler(Ptr<input_dev> dev, Ptr<input_handler> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_bits_to_string(String buf, int buf_size, @Unsigned long bits, boolean skip_empty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_cleanse_bitmasks(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_close_device(Ptr<input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_copy_abs($arg1, $arg2, (const struct input_dev*)$arg3, $arg4)")
    public static void input_copy_abs(Ptr<input_dev> dst, @Unsigned int dst_axis, Ptr<input_dev> src, @Unsigned int src_axis) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_default_getkeycode(Ptr<input_dev> dev, Ptr<input_keymap_entry> ke) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_default_setkeycode($arg1, (const struct input_keymap_entry*)$arg2, $arg3)")
    public static int input_default_setkeycode(Ptr<input_dev> dev, Ptr<input_keymap_entry> ke, Ptr<@Unsigned Integer> old_keycode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_dev_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_dev_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_dev_release(Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean input_dev_release_keys(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_dev_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_cap_abs(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_cap_ev(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_cap_ff(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_cap_key(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_cap_led(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_cap_msc(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_cap_rel(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_cap_snd(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_cap_sw(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_id_bustype(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_id_product(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_id_vendor(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_id_version(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_modalias(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_name(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_phys(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_properties(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_show_uniq(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_dev_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_dev_toggle(Ptr<input_dev> dev, boolean activate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_dev_uevent((const struct device*)$arg1, $arg2)")
    public static int input_dev_uevent(Ptr<runtime.device> device2, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean input_device_enabled(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> input_devices_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_devices_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> input_devices_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_devnode((const struct device*)$arg1, $arg2)")
    public static String input_devnode(Ptr<runtime.device> dev, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_enable_softrepeat(Ptr<input_dev> dev, int delay, int period) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int input_estimate_events_per_packet(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_event_dispose(Ptr<input_dev> dev, int disposition, @Unsigned int type2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_flush_device(Ptr<input_handle> handle, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_free_device(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_free_minor(@Unsigned int minor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_get_disposition(Ptr<input_dev> dev, @Unsigned int type2, @Unsigned int code2, Ptr<Integer> pval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_get_keycode(Ptr<input_dev> dev, Ptr<input_keymap_entry> ke) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_get_new_minor(int legacy_base, @Unsigned int legacy_num, boolean allow_dynamic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@OriginalName(value="ktime_t") Long> input_get_timestamp(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_grab_device(Ptr<input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_handle_event(Ptr<input_dev> dev, @Unsigned int type2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int input_handle_events_default(Ptr<input_handle> handle, Ptr<input_value> vals, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int input_handle_events_filter(Ptr<input_handle> handle, Ptr<input_value> vals, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int input_handle_events_null(Ptr<input_handle> handle, Ptr<input_value> vals, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_handler_for_each_handle($arg1, $arg2, (int (*)(struct input_handle*, void*))$arg3)")
    public static int input_handler_for_each_handle(Ptr<input_handler> handler, Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> input_handlers_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_handlers_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> input_handlers_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_inject_event(Ptr<input_handle> handle, @Unsigned int type2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_match_device_id((const struct input_dev*)$arg1, (const struct input_device_id*)$arg2)")
    public static boolean input_match_device_id(Ptr<input_dev> dev, Ptr<input_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_open_device(Ptr<input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_pass_values(Ptr<input_dev> dev, Ptr<input_value> vals, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_print_bitmap($arg1, $arg2, (const long unsigned int*)$arg3, $arg4, $arg5)")
    public static int input_print_bitmap(String buf, int buf_size, Ptr<@Unsigned Long> bitmap2, int max, int add_cr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_print_modalias_bits($arg1, $arg2, $arg3, (const long unsigned int*)$arg4, $arg5, $arg6)")
    public static int input_print_modalias_bits(String buf, int size, char name, Ptr<@Unsigned Long> bm, @Unsigned int min_bit, @Unsigned int max_bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_print_modalias_parts($arg1, $arg2, $arg3, (const struct input_dev*)$arg4)")
    public static int input_print_modalias_parts(String buf, int size, int full_len, Ptr<input_dev> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_proc_devices_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int input_proc_devices_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_proc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_proc_handlers_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_register_device(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_register_handle(Ptr<input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_register_handler(Ptr<input_handler> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_release_device(Ptr<input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_repeat_key(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_reset_device(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_scancode_to_scalar((const struct input_keymap_entry*)$arg1, $arg2)")
    public static int input_scancode_to_scalar(Ptr<input_keymap_entry> ke, Ptr<@Unsigned Integer> scancode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_set_abs_params(Ptr<input_dev> dev, @Unsigned int axis, int min, int max, int fuzz, int flat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_set_capability(Ptr<input_dev> dev, @Unsigned int type2, @Unsigned int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_set_keycode($arg1, (const struct input_keymap_entry*)$arg2)")
    public static int input_set_keycode(Ptr<input_dev> dev, Ptr<input_keymap_entry> ke) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_set_timestamp(Ptr<input_dev> dev, @OriginalName(value="ktime_t") long timestamp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_unregister_device(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_unregister_handle(Ptr<input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_unregister_handler(Ptr<input_handler> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_wakeup_procfs_readers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean input_dev_ensure_poller(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_get_poll_interval(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_get_poll_max(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long input_dev_get_poll_min(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_dev_poller_finalize(Ptr<input_dev_poller> poller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_dev_poller_queue_work(Ptr<input_dev_poller> poller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_dev_poller_start(Ptr<input_dev_poller> poller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_dev_poller_stop(Ptr<input_dev_poller> poller) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_dev_poller_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_dev_set_poll_interval($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long input_dev_set_poll_interval(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_event_from_user((const u8*)$arg1, $arg2)")
    public static int input_event_from_user(String buffer, Ptr<input_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_event_to_user($arg1, (const struct input_event*)$arg2)")
    public static int input_event_to_user(String buffer, Ptr<input_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_ff_effect_from_user((const u8*)$arg1, $arg2, $arg3)")
    public static int input_ff_effect_from_user(String buffer, @Unsigned long size, Ptr<FfDefinitions.ff_effect> effect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_get_poll_interval(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short input_poller_attrs_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_set_max_poll_interval(Ptr<input_dev> dev, @Unsigned int interval2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_set_min_poll_interval(Ptr<input_dev> dev, @Unsigned int interval2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_set_poll_interval(Ptr<input_dev> dev, @Unsigned int interval2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="input_setup_polling($arg1, (void (*)(struct input_dev*))$arg2)")
    public static int input_setup_polling(Ptr<input_dev> dev, Ptr<?> poll_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_ff_create(Ptr<input_dev> dev, @Unsigned int max_effects) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void input_ff_destroy(Ptr<input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_ff_erase(Ptr<input_dev> dev, int effect_id, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_ff_event(Ptr<input_dev> dev, @Unsigned int type2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_ff_flush(Ptr<input_dev> dev, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int input_ff_upload(Ptr<input_dev> dev, Ptr<FfDefinitions.ff_effect> effect, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int low; unsigned int hi; }")
    @NotUsableInJava
    public static class input_of_seq_of_xfrm_skb_cb
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int low;
        public @Unsigned @OriginalName(value="__be32") int hi;
    }

    @Type(noCCodeGeneration=true, cType="struct input_mask")
    @NotUsableInJava
    public static class input_mask
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int codes_size;
        public @Unsigned long codes_ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct input_dev_poller")
    @NotUsableInJava
    public static class input_dev_poller
    extends Struct {
        public Ptr<?> poll;
        public @Unsigned int poll_interval;
        public @Unsigned int poll_interval_max;
        public @Unsigned int poll_interval_min;
        public Ptr<input_dev> input;
        public DelayedDefinitions.delayed_work work;
    }

    @Type(noCCodeGeneration=true, cType="struct input_event_compat")
    @NotUsableInJava
    public static class input_event_compat
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int sec;
        public @Unsigned @OriginalName(value="compat_ulong_t") int usec;
        public @Unsigned short type;
        public @Unsigned short code;
        public int value;
    }

    @Type(noCCodeGeneration=true, cType="struct input_event")
    @NotUsableInJava
    public static class input_event
    extends Struct {
        public @Unsigned @OriginalName(value="__kernel_ulong_t") long __sec;
        public @Unsigned @OriginalName(value="__kernel_ulong_t") long __usec;
        public @Unsigned short type;
        public @Unsigned short code;
        public int value;
    }

    @Type(noCCodeGeneration=true, cType="struct input_devres")
    @NotUsableInJava
    public static class input_devres
    extends Struct {
        public Ptr<input_dev> input;
    }

    @Type(noCCodeGeneration=true, cType="struct input_seq_state")
    @NotUsableInJava
    public static class input_seq_state
    extends Struct {
        public @Unsigned short pos;
        public boolean mutex_acquired;
        public int input_devices_state;
    }

    @Type(noCCodeGeneration=true, cType="struct input_mt_pos")
    @NotUsableInJava
    public static class input_mt_pos
    extends Struct {
        public short x;
        public short y;
    }

    @Type(noCCodeGeneration=true, cType="struct input_mt_slot")
    @NotUsableInJava
    public static class input_mt_slot
    extends Struct {
        public int @Size(value=14) [] abs;
        public @Unsigned int frame;
        public @Unsigned int key;
    }

    @Type(noCCodeGeneration=true, cType="struct input_mt")
    @NotUsableInJava
    public static class input_mt
    extends Struct {
        public int trkid;
        public int num_slots;
        public int slot;
        public @Unsigned int flags;
        public @Unsigned int frame;
        public Ptr<Integer> red;
        public input_mt_slot @Size(value=0) [] slots;
    }

    @Type(noCCodeGeneration=true, cType="struct input_handler")
    @NotUsableInJava
    public static class input_handler
    extends Struct {
        public Ptr<?> _private;
        public Ptr<?> event;
        public Ptr<?> events;
        public Ptr<?> filter;
        public Ptr<?> match;
        public Ptr<?> connect;
        public Ptr<?> disconnect;
        public Ptr<?> start;
        public boolean legacy_minors;
        public int minor;
        public String name;
        public Ptr<input_device_id> id_table;
        public ListDefinitions.list_head h_list;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct input_handle")
    @NotUsableInJava
    public static class input_handle
    extends Struct {
        public Ptr<?> _private;
        public int open;
        public String name;
        public Ptr<input_dev> dev;
        public Ptr<input_handler> handler;
        public Ptr<?> handle_events;
        public ListDefinitions.list_head d_node;
        public ListDefinitions.list_head h_node;
    }

    @Type(noCCodeGeneration=true, cType="struct input_dev")
    @NotUsableInJava
    public static class input_dev
    extends Struct {
        public String name;
        public String phys;
        public String uniq;
        public input_id id;
        public @Unsigned long @Size(value=1) [] propbit;
        public @Unsigned long @Size(value=1) [] evbit;
        public @Unsigned long @Size(value=12) [] keybit;
        public @Unsigned long @Size(value=1) [] relbit;
        public @Unsigned long @Size(value=1) [] absbit;
        public @Unsigned long @Size(value=1) [] mscbit;
        public @Unsigned long @Size(value=1) [] ledbit;
        public @Unsigned long @Size(value=1) [] sndbit;
        public @Unsigned long @Size(value=2) [] ffbit;
        public @Unsigned long @Size(value=1) [] swbit;
        public @Unsigned int hint_events_per_packet;
        public @Unsigned int keycodemax;
        public @Unsigned int keycodesize;
        public Ptr<?> keycode;
        public Ptr<?> setkeycode;
        public Ptr<?> getkeycode;
        public Ptr<FfDefinitions.ff_device> ff;
        public Ptr<input_dev_poller> poller;
        public @Unsigned int repeat_key;
        public TimerDefinitions.timer_list timer;
        public int @Size(value=2) [] rep;
        public Ptr<input_mt> mt;
        public Ptr<input_absinfo> absinfo;
        public @Unsigned long @Size(value=12) [] key;
        public @Unsigned long @Size(value=1) [] led;
        public @Unsigned long @Size(value=1) [] snd;
        public @Unsigned long @Size(value=1) [] sw;
        public Ptr<?> open;
        public Ptr<?> close;
        public Ptr<?> flush;
        public Ptr<?> event;
        public Ptr<input_handle> grab;
        public  @OriginalName(value="spinlock_t") runtime.spinlock event_lock;
        public runtime.mutex mutex;
        public @Unsigned int users;
        public boolean going_away;
        public runtime.device dev;
        public ListDefinitions.list_head h_list;
        public ListDefinitions.list_head node;
        public @Unsigned int num_vals;
        public @Unsigned int max_vals;
        public Ptr<input_value> vals;
        public boolean devres_managed;
        public @OriginalName(value="ktime_t") long @Size(value=3) [] timestamp;
        public boolean inhibited;
    }

    @Type(noCCodeGeneration=true, cType="enum input_clock_type")
    public static enum input_clock_type implements Enum<input_clock_type>,
    TypedEnum<input_clock_type, Integer>
    {
        INPUT_CLK_REAL,
        INPUT_CLK_MONO,
        INPUT_CLK_BOOT,
        INPUT_CLK_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct input_value")
    @NotUsableInJava
    public static class input_value
    extends Struct {
        public @Unsigned short type;
        public @Unsigned short code;
        public int value;
    }

    @Type(noCCodeGeneration=true, cType="struct input_device_id")
    @NotUsableInJava
    public static class input_device_id
    extends Struct {
        public @Unsigned @OriginalName(value="kernel_ulong_t") long flags;
        public @Unsigned short bustype;
        public @Unsigned short vendor;
        public @Unsigned short product;
        public @Unsigned short version;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=1) [] evbit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=12) [] keybit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=1) [] relbit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=1) [] absbit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=1) [] mscbit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=1) [] ledbit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=1) [] sndbit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=2) [] ffbit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=1) [] swbit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long @Size(value=1) [] propbit;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_info;
    }

    @Type(noCCodeGeneration=true, cType="struct input_keymap_entry")
    @NotUsableInJava
    public static class input_keymap_entry
    extends Struct {
        public char flags;
        public char len;
        public @Unsigned short index;
        public @Unsigned int keycode;
        public char @Size(value=32) [] scancode;
    }

    @Type(noCCodeGeneration=true, cType="struct input_absinfo")
    @NotUsableInJava
    public static class input_absinfo
    extends Struct {
        public int value;
        public int minimum;
        public int maximum;
        public int fuzz;
        public int flat;
        public int resolution;
    }

    @Type(noCCodeGeneration=true, cType="struct input_id")
    @NotUsableInJava
    public static class input_id
    extends Struct {
        public @Unsigned short bustype;
        public @Unsigned short vendor;
        public @Unsigned short product;
        public @Unsigned short version;
    }
}

