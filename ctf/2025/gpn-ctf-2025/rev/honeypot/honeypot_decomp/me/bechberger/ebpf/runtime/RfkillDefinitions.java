/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.LedDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RfkillDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__rfkill_switch_all((const enum rfkill_type)$arg1, $arg2)")
    public static void __rfkill_switch_all(rfkill_type type2, boolean blocked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rfkill_alloc((const u8*)$arg1, $arg2, (const enum rfkill_type)$arg3, (const struct rfkill_ops*)$arg4, $arg5)")
    public static Ptr<runtime.rfkill> rfkill_alloc(String name, Ptr<runtime.device> parent, rfkill_type type2, Ptr<rfkill_ops> ops, Ptr<?> ops_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rfkill_blocked(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_destroy(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rfkill_dev_uevent((const struct device*)$arg1, $arg2)")
    public static int rfkill_dev_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_epo() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rfkill_find_type((const u8*)$arg1)")
    public static rfkill_type rfkill_find_type(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long rfkill_fop_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rfkill_fop_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int rfkill_fop_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rfkill_fop_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rfkill_fop_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rfkill_fop_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long rfkill_fop_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rfkill_get_global_sw_state((const enum rfkill_type)$arg1)")
    public static boolean rfkill_get_global_sw_state(rfkill_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)rfkill_get_led_trigger_name($arg1))")
    public static String rfkill_get_led_trigger_name(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_global_led_trigger_unregister() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_global_led_trigger_worker(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rfkill_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_init_sw_state(Ptr<runtime.rfkill> rfkill2, boolean blocked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rfkill_is_epo_lock_active() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rfkill_led_trigger_activate(Ptr<LedDefinitions.led_classdev> led) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_led_trigger_event(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_pause_polling(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_poll(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rfkill_register(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_remove_epo_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_restore_states() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rfkill_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_resume_polling(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_send_events(Ptr<runtime.rfkill> rfkill2, rfkill_operation op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_set_block(Ptr<runtime.rfkill> rfkill2, boolean blocked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rfkill_set_hw_state_reason(Ptr<runtime.rfkill> rfkill2, boolean blocked, rfkill_hard_block_reasons reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rfkill_set_led_trigger_name($arg1, (const u8*)$arg2)")
    public static void rfkill_set_led_trigger_name(Ptr<runtime.rfkill> rfkill2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_set_states(Ptr<runtime.rfkill> rfkill2, boolean sw, boolean hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rfkill_set_sw_state(Ptr<runtime.rfkill> rfkill2, boolean blocked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rfkill_soft_blocked(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rfkill_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_switch_all(rfkill_type type2, boolean blocked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_sync(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_sync_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_uevent_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_unregister(Ptr<runtime.rfkill> rfkill2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rfkill_connect($arg1, $arg2, (const struct input_device_id*)$arg3)")
    public static int rfkill_connect(Ptr<InputDefinitions.input_handler> handler, Ptr<InputDefinitions.input_dev> dev, Ptr<InputDefinitions.input_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_disconnect(Ptr<InputDefinitions.input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_handler_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rfkill_handler_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_op_handler(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_schedule_global_op(rfkill_sched_op op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_schedule_ratelimited() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_schedule_toggle(rfkill_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rfkill_start(Ptr<InputDefinitions.input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rfkill_data")
    @NotUsableInJava
    public static class rfkill_data
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head events;
        public runtime.mutex mtx;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head read_wait;
        public boolean input_handler;
    }

    @Type(noCCodeGeneration=true, cType="struct rfkill_int_event")
    @NotUsableInJava
    public static class rfkill_int_event
    extends Struct {
        public ListDefinitions.list_head list;
        public rfkill_event_ext ev;
    }

    @Type(noCCodeGeneration=true, cType="struct rfkill_ops")
    @NotUsableInJava
    public static class rfkill_ops
    extends Struct {
        public Ptr<?> poll;
        public Ptr<?> query;
        public Ptr<?> set_block;
    }

    @Type(noCCodeGeneration=true, cType="enum rfkill_user_states")
    public static enum rfkill_user_states implements Enum<rfkill_user_states>,
    TypedEnum<rfkill_user_states, Integer>
    {
        RFKILL_USER_STATE_SOFT_BLOCKED,
        RFKILL_USER_STATE_UNBLOCKED,
        RFKILL_USER_STATE_HARD_BLOCKED;

    }

    @Type(noCCodeGeneration=true, cType="struct rfkill_event_ext")
    @NotUsableInJava
    public static class rfkill_event_ext
    extends Struct {
        public @Unsigned int idx;
        public char type;
        public char op;
        public char soft;
        public char hard;
        public char hard_block_reasons;
    }

    @Type(noCCodeGeneration=true, cType="enum rfkill_hard_block_reasons")
    public static enum rfkill_hard_block_reasons implements Enum<rfkill_hard_block_reasons>,
    TypedEnum<rfkill_hard_block_reasons, Integer>
    {
        RFKILL_HARD_BLOCK_SIGNAL,
        RFKILL_HARD_BLOCK_NOT_OWNER;

    }

    @Type(noCCodeGeneration=true, cType="enum rfkill_operation")
    public static enum rfkill_operation implements Enum<rfkill_operation>,
    TypedEnum<rfkill_operation, Integer>
    {
        RFKILL_OP_ADD,
        RFKILL_OP_DEL,
        RFKILL_OP_CHANGE,
        RFKILL_OP_CHANGE_ALL;

    }

    @Type(noCCodeGeneration=true, cType="enum rfkill_sched_op")
    public static enum rfkill_sched_op implements Enum<rfkill_sched_op>,
    TypedEnum<rfkill_sched_op, Integer>
    {
        RFKILL_GLOBAL_OP_EPO,
        RFKILL_GLOBAL_OP_RESTORE,
        RFKILL_GLOBAL_OP_UNLOCK,
        RFKILL_GLOBAL_OP_UNBLOCK;

    }

    @Type(noCCodeGeneration=true, cType="enum rfkill_input_master_mode")
    public static enum rfkill_input_master_mode implements Enum<rfkill_input_master_mode>,
    TypedEnum<rfkill_input_master_mode, Integer>
    {
        RFKILL_INPUT_MASTER_UNLOCK,
        RFKILL_INPUT_MASTER_RESTORE,
        RFKILL_INPUT_MASTER_UNBLOCKALL,
        NUM_RFKILL_INPUT_MASTER_MODES;

    }

    @Type(noCCodeGeneration=true, cType="enum rfkill_type")
    public static enum rfkill_type implements Enum<rfkill_type>,
    TypedEnum<rfkill_type, Integer>
    {
        RFKILL_TYPE_ALL,
        RFKILL_TYPE_WLAN,
        RFKILL_TYPE_BLUETOOTH,
        RFKILL_TYPE_UWB,
        RFKILL_TYPE_WIMAX,
        RFKILL_TYPE_WWAN,
        RFKILL_TYPE_GPS,
        RFKILL_TYPE_FM,
        RFKILL_TYPE_NFC,
        NUM_RFKILL_TYPES;

    }
}

