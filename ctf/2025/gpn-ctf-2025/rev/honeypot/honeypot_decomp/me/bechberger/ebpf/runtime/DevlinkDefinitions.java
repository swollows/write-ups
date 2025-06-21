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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.IbDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class DevlinkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __devlink_compat_running_version(Ptr<runtime.devlink> devlink2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __devlink_flash_update_notify(Ptr<runtime.devlink> devlink2, devlink_command cmd, Ptr<devlink_flash_notify> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devlink_health_reporter_create($arg1, (const struct devlink_health_reporter_ops*)$arg2, $arg3, $arg4)")
    public static Ptr<devlink_health_reporter> __devlink_health_reporter_create(Ptr<runtime.devlink> devlink2, Ptr<devlink_health_reporter_ops> ops, @Unsigned long graceful_period, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __devlink_reload_stats_update(Ptr<runtime.devlink> devlink2, Ptr<@Unsigned Integer> reload_stats, devlink_reload_limit limit, @Unsigned int actions_performed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_compat_flash_update($arg1, (const u8*)$arg2)")
    public static int devlink_compat_flash_update(Ptr<runtime.devlink> devlink2, String file_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_compat_running_version(Ptr<runtime.devlink> devlink2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_dpipe_action_put(Ptr<SkDefinitions.sk_buff> skb, Ptr<devlink_dpipe_action> action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_dpipe_entry_clear(Ptr<devlink_dpipe_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_dpipe_entry_ctx_append(Ptr<devlink_dpipe_dump_ctx> dump_ctx, Ptr<devlink_dpipe_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_dpipe_entry_ctx_close(Ptr<devlink_dpipe_dump_ctx> dump_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_dpipe_entry_ctx_prepare(Ptr<devlink_dpipe_dump_ctx> dump_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_dpipe_entry_put(Ptr<SkDefinitions.sk_buff> skb, Ptr<devlink_dpipe_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_dpipe_match_put(Ptr<SkDefinitions.sk_buff> skb, Ptr<devlink_dpipe_match> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_dpipe_send_and_alloc_skb(Ptr<Ptr<SkDefinitions.sk_buff>> pskb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_dpipe_table_counter_enabled($arg1, (const u8*)$arg2)")
    public static boolean devlink_dpipe_table_counter_enabled(Ptr<runtime.devlink> devlink2, String table_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_dpipe_table_put(Ptr<SkDefinitions.sk_buff> skb, Ptr<devlink_dpipe_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_dpipe_value_put(Ptr<SkDefinitions.sk_buff> skb, Ptr<devlink_dpipe_value> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_flash_component_lookup_cb((const u8*)$arg1, $arg2, $arg3)")
    public static void devlink_flash_component_lookup_cb(String version_name, devlink_info_version_type version_type, Ptr<?> version_cb_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_flash_update_status_notify($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void devlink_flash_update_status_notify(Ptr<runtime.devlink> devlink2, String status_msg, String component2, @Unsigned long done, @Unsigned long total) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_flash_update_timeout_notify($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void devlink_flash_update_timeout_notify(Ptr<runtime.devlink> devlink2, String status_msg, String component2, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_fmsg_arr_pair_nest_end(Ptr<devlink_fmsg> fmsg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_arr_pair_nest_start($arg1, (const u8*)$arg2)")
    public static void devlink_fmsg_arr_pair_nest_start(Ptr<devlink_fmsg> fmsg, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_fmsg_binary_pair_nest_end(Ptr<devlink_fmsg> fmsg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_binary_pair_nest_start($arg1, (const u8*)$arg2)")
    public static void devlink_fmsg_binary_pair_nest_start(Ptr<devlink_fmsg> fmsg, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_binary_pair_put($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4)")
    public static void devlink_fmsg_binary_pair_put(Ptr<devlink_fmsg> fmsg, String name, Ptr<?> value, @Unsigned int value_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_binary_put($arg1, (const void*)$arg2, $arg3)")
    public static void devlink_fmsg_binary_put(Ptr<devlink_fmsg> fmsg, Ptr<?> value, @Unsigned short value_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_bool_pair_put($arg1, (const u8*)$arg2, $arg3)")
    public static void devlink_fmsg_bool_pair_put(Ptr<devlink_fmsg> fmsg, String name, boolean value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_fmsg_nest_common(Ptr<devlink_fmsg> fmsg, int attrtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_fmsg_obj_nest_end(Ptr<devlink_fmsg> fmsg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_fmsg_obj_nest_start(Ptr<devlink_fmsg> fmsg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_fmsg_pair_nest_end(Ptr<devlink_fmsg> fmsg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_pair_nest_start($arg1, (const u8*)$arg2)")
    public static void devlink_fmsg_pair_nest_start(Ptr<devlink_fmsg> fmsg, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_fmsg_prepare_skb(Ptr<devlink_fmsg> fmsg, Ptr<SkDefinitions.sk_buff> skb, Ptr<Integer> start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_put_name($arg1, (const u8*)$arg2)")
    public static void devlink_fmsg_put_name(Ptr<devlink_fmsg> fmsg, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_put_value($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static void devlink_fmsg_put_value(Ptr<devlink_fmsg> fmsg, Ptr<?> value, @Unsigned short value_len, char value_nla_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_string_pair_put($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static void devlink_fmsg_string_pair_put(Ptr<devlink_fmsg> fmsg, String name, String value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_string_put($arg1, (const u8*)$arg2)")
    public static void devlink_fmsg_string_put(Ptr<devlink_fmsg> fmsg, String value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_u32_pair_put($arg1, (const u8*)$arg2, $arg3)")
    public static void devlink_fmsg_u32_pair_put(Ptr<devlink_fmsg> fmsg, String name, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_fmsg_u32_put(Ptr<devlink_fmsg> fmsg, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_u64_pair_put($arg1, (const u8*)$arg2, $arg3)")
    public static void devlink_fmsg_u64_pair_put(Ptr<devlink_fmsg> fmsg, String name, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_fmsg_u8_pair_put($arg1, (const u8*)$arg2, $arg3)")
    public static void devlink_fmsg_u8_pair_put(Ptr<devlink_fmsg> fmsg, String name, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_health_do_dump(Ptr<devlink_health_reporter> reporter, Ptr<?> priv_ctx, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_health_report($arg1, (const u8*)$arg2, $arg3)")
    public static int devlink_health_report(Ptr<devlink_health_reporter> reporter, String msg, Ptr<?> priv_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_health_reporter_create($arg1, (const struct devlink_health_reporter_ops*)$arg2, $arg3, $arg4)")
    public static Ptr<devlink_health_reporter> devlink_health_reporter_create(Ptr<runtime.devlink> devlink2, Ptr<devlink_health_reporter_ops> ops, @Unsigned long graceful_period, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_health_reporter_destroy(Ptr<devlink_health_reporter> reporter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<devlink_health_reporter> devlink_health_reporter_get_from_attrs(Ptr<runtime.devlink> devlink2, Ptr<Ptr<runtime.nlattr>> attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devlink_health_reporter_priv(Ptr<devlink_health_reporter> reporter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_health_reporter_recover(Ptr<devlink_health_reporter> reporter, Ptr<?> priv_ctx, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_health_reporter_recovery_done(Ptr<devlink_health_reporter> reporter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_health_reporter_state_update(Ptr<devlink_health_reporter> reporter, devlink_health_reporter_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_info_board_serial_number_put($arg1, (const u8*)$arg2)")
    public static int devlink_info_board_serial_number_put(Ptr<devlink_info_req> req2, String bsn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_info_serial_number_put($arg1, (const u8*)$arg2)")
    public static int devlink_info_serial_number_put(Ptr<devlink_info_req> req2, String sn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_info_version_fixed_put($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int devlink_info_version_fixed_put(Ptr<devlink_info_req> req2, String version_name, String version_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_info_version_put($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5)")
    public static int devlink_info_version_put(Ptr<devlink_info_req> req2, int attr2, String version_name, String version_value, devlink_info_version_type version_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_info_version_running_put($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int devlink_info_version_running_put(Ptr<devlink_info_req> req2, String version_name, String version_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_info_version_running_put_ext($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static int devlink_info_version_running_put_ext(Ptr<devlink_info_req> req2, String version_name, String version_value, devlink_info_version_type version_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_info_version_stored_put($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int devlink_info_version_stored_put(Ptr<devlink_info_req> req2, String version_name, String version_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_info_version_stored_put_ext($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static int devlink_info_version_stored_put_ext(Ptr<devlink_info_req> req2, String version_name, String version_value, devlink_info_version_type version_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_is_reload_failed((const struct devlink*)$arg1)")
    public static boolean devlink_is_reload_failed(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_linecard_activate(Ptr<devlink_linecard> linecard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_linecard_deactivate(Ptr<devlink_linecard> linecard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int devlink_linecard_index(Ptr<devlink_linecard> linecard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_linecard_nested_dl_set(Ptr<devlink_linecard> linecard, Ptr<runtime.devlink> nested_devlink) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_linecard_notify(Ptr<devlink_linecard> linecard, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_linecard_provision_clear(Ptr<devlink_linecard> linecard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_linecard_provision_fail(Ptr<devlink_linecard> linecard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_linecard_provision_set($arg1, (const u8*)$arg2)")
    public static void devlink_linecard_provision_set(Ptr<devlink_linecard> linecard, String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_linecard_rel_cleanup_cb(Ptr<runtime.devlink> devlink2, @Unsigned int linecard_index, @Unsigned int rel_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_linecard_rel_notify_cb(Ptr<runtime.devlink> devlink2, @Unsigned int linecard_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_linecard_type_set($arg1, (const u8*)$arg2, $arg3)")
    public static int devlink_linecard_type_set(Ptr<devlink_linecard> linecard, String type2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_linecard_types_init(Ptr<devlink_linecard> linecard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_linecards_notify_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_linecards_notify_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_dpipe_entries_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_dpipe_headers_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_dpipe_table_counters_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_dpipe_table_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_eswitch_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_eswitch_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, devlink_command cmd, @Unsigned int portid, @Unsigned int seq, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_flash_update_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_flash_update_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, devlink_command cmd, Ptr<devlink_flash_notify> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_get_dumpit(Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_diagnose_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_dump_clear_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_dump_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<devlink_health_reporter> reporter, devlink_command cmd, @Unsigned int portid, @Unsigned int seq, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_recover_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_health_reporter_test_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_info_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_info_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_info_get_dumpit(Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_linecard_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<devlink_linecard> linecard, devlink_command cmd, @Unsigned int portid, @Unsigned int seq, int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_linecard_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_linecard_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_linecard_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_linecard_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_put_handle(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_reload_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_selftests_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, @Unsigned int portid, @Unsigned int seq, int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_selftests_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_selftests_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_selftests_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_selftests_run_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_notify(Ptr<runtime.devlink> devlink2, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_notify_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_notify_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_port_health_reporter_create($arg1, (const struct devlink_health_reporter_ops*)$arg2, $arg3, $arg4)")
    public static Ptr<devlink_health_reporter> devlink_port_health_reporter_create(Ptr<devlink_port> port2, Ptr<devlink_health_reporter_ops> ops, @Unsigned long graceful_period, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_recover_notify(Ptr<devlink_health_reporter> reporter, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_rel_cleanup_cb(Ptr<runtime.devlink> devlink2, @Unsigned int obj_index, @Unsigned int rel_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_rel_notify_cb(Ptr<runtime.devlink> devlink2, @Unsigned int obj_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_reload(Ptr<runtime.devlink> devlink2, Ptr<runtime.net> dest_net, devlink_reload_action action, devlink_reload_limit limit, Ptr<@Unsigned Integer> actions_performed, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean devlink_reload_action_is_supported(Ptr<runtime.devlink> devlink2, devlink_reload_action action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_reload_actions_valid((const struct devlink_ops*)$arg1)")
    public static boolean devlink_reload_actions_valid(Ptr<devlink_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean devlink_reload_limit_is_supported(Ptr<runtime.devlink> devlink2, devlink_reload_limit limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_reload_stats_put(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, boolean is_remote) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_remote_reload_actions_performed(Ptr<runtime.devlink> devlink2, devlink_reload_limit limit, @Unsigned int actions_performed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_param_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_param_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_param_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_param_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_param_value_fill_one(Ptr<SkDefinitions.sk_buff> msg, devlink_param_type type2, devlink_param_cmode cmode, devlink_param_value val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_param_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_param_get_dumpit(Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_param_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_rate_del_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_rate_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<devlink_rate> devlink_rate2, devlink_command cmd, @Unsigned int portid, @Unsigned int seq, int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_rate_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_rate_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_rate_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_rate_new_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_rate_parent_node_set(Ptr<devlink_rate> devlink_rate2, Ptr<GenlDefinitions.genl_info> info2, Ptr<runtime.nlattr> nla_parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_rate_set($arg1, (const struct devlink_ops*)$arg2, $arg3)")
    public static int devlink_nl_rate_set(Ptr<devlink_rate> devlink_rate2, Ptr<devlink_ops> ops, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_rate_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_occ_max_clear_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_occ_snapshot_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_pool_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_pool_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_pool_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_pool_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_port_pool_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_port_pool_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_port_pool_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_port_pool_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_tc_pool_bind_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_tc_pool_bind_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_tc_pool_bind_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_sb_tc_pool_bind_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_param_cmode_is_supported((const struct devlink_param*)$arg1, $arg2)")
    public static boolean devlink_param_cmode_is_supported(Ptr<devlink_param> param2, devlink_param_cmode cmode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_param_find_by_name($arg1, (const u8*)$arg2)")
    public static Ptr<devlink_param_item> devlink_param_find_by_name(Ptr<runtime.xarray> params, String param_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_param_unregister($arg1, (const struct devlink_param*)$arg2)")
    public static void devlink_param_unregister(Ptr<runtime.devlink> devlink2, Ptr<devlink_param> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_params_driverinit_load_new(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_params_notify(Ptr<runtime.devlink> devlink2, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_params_notify_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_params_notify_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_params_register($arg1, (const struct devlink_param*)$arg2, $arg3)")
    public static int devlink_params_register(Ptr<runtime.devlink> devlink2, Ptr<devlink_param> params, @Unsigned long params_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_params_unregister($arg1, (const struct devlink_param*)$arg2, $arg3)")
    public static void devlink_params_unregister(Ptr<runtime.devlink> devlink2, Ptr<devlink_param> params, @Unsigned long params_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<devlink_rate> devlink_rate_get_from_info(Ptr<runtime.devlink> devlink2, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<devlink_rate> devlink_rate_node_get_from_attrs(Ptr<runtime.devlink> devlink2, Ptr<Ptr<runtime.nlattr>> attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_rate_nodes_check(Ptr<runtime.devlink> devlink2, @Unsigned short mode, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_rate_notify(Ptr<devlink_rate> devlink_rate2, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_rate_set_ops_supported((const struct devlink_ops*)$arg1, $arg2, $arg3)")
    public static boolean devlink_rate_set_ops_supported(Ptr<devlink_ops> ops, Ptr<GenlDefinitions.genl_info> info2, devlink_rate_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_rates_notify_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_rates_notify_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_sb_register(Ptr<runtime.devlink> devlink2, @Unsigned int sb_index, @Unsigned int size, @Unsigned short ingress_pools_count, @Unsigned short egress_pools_count, @Unsigned short ingress_tc_count, @Unsigned short egress_tc_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_sb_unregister(Ptr<runtime.devlink> devlink2, @Unsigned int sb_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __devlink_port_phys_port_name_get(Ptr<devlink_port> devlink_port2, String name, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __devlink_port_type_set(Ptr<devlink_port> devlink_port2, devlink_port_type type2, Ptr<?> type_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __devlink_trap_action_set(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_item> trap_item, devlink_trap_action trap_action, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_add_symlinks(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_class_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_compat_phys_port_name_get(Ptr<NetDefinitions.net_device> dev, String name, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_compat_switch_id_get(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_phys_item_id> ppid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.devlink> devlink_get_from_attrs_lock(Ptr<runtime.net> net2, Ptr<Ptr<runtime.nlattr>> attrs, boolean dev_lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_dumpit(Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<?> dump_one) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_msg_reply_and_new(Ptr<Ptr<SkDefinitions.sk_buff>> msg, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_notify_filter(Ptr<runtime.sock> dsk, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_notify_filter_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_attrs_put(Ptr<SkDefinitions.sk_buff> msg, Ptr<devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_del_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<devlink_port> devlink_port2, devlink_command cmd, @Unsigned int portid, @Unsigned int seq, int flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_function_attrs_put(Ptr<SkDefinitions.sk_buff> msg, Ptr<devlink_port> port2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_handle_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long devlink_nl_port_handle_size(Ptr<devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_new_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_split_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_port_unsplit_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_post_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static void devlink_nl_post_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_post_doit_dev_lock((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static void devlink_nl_post_doit_dev_lock(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_pre_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static int devlink_nl_pre_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_pre_doit_dev_lock((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static int devlink_nl_pre_doit_dev_lock(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_pre_doit_port((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static int devlink_nl_pre_doit_port(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_pre_doit_port_optional((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static int devlink_nl_pre_doit_port_optional(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_put_nested_handle(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.net> net2, Ptr<runtime.devlink> devlink2, int attrtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_resource_dump_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_resource_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_nl_sock_priv_destroy(Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_nl_sock_priv_init(Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_trap_fill($arg1, $arg2, (const struct devlink_trap_item*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int devlink_nl_trap_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_item> trap_item, devlink_command cmd, @Unsigned int portid, @Unsigned int seq, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_trap_group_fill($arg1, $arg2, (const struct devlink_trap_group_item*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int devlink_nl_trap_group_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_group_item> group_item, devlink_command cmd, @Unsigned int portid, @Unsigned int seq, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_group_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_group_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_group_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_group_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_nl_trap_policer_fill($arg1, $arg2, (const struct devlink_trap_policer_item*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int devlink_nl_trap_policer_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_policer_item> policer_item, devlink_command cmd, @Unsigned int portid, @Unsigned int seq, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_policer_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_policer_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_policer_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_policer_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_trap_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_attrs_pci_pf_set(Ptr<devlink_port> devlink_port2, @Unsigned int controller2, @Unsigned short pf, boolean external) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_attrs_pci_sf_set(Ptr<devlink_port> devlink_port2, @Unsigned int controller2, @Unsigned short pf, @Unsigned int sf, boolean external) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_attrs_pci_vf_set(Ptr<devlink_port> devlink_port2, @Unsigned int controller2, @Unsigned short pf, @Unsigned short vf, boolean external) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_attrs_set(Ptr<devlink_port> devlink_port2, Ptr<devlink_port_attrs> attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_fini(Ptr<devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_port_fn_caps_fill(Ptr<devlink_port> devlink_port2, Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<@OriginalName(value="bool") Boolean> msg_updated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_port_function_set($arg1, (const struct nlattr*)$arg2, $arg3)")
    public static int devlink_port_function_set(Ptr<devlink_port> port2, Ptr<runtime.nlattr> attr2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_port_function_validate(Ptr<devlink_port> devlink_port2, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<devlink_port> devlink_port_get_by_index(Ptr<runtime.devlink> devlink2, @Unsigned int port_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<devlink_port> devlink_port_get_from_attrs(Ptr<runtime.devlink> devlink2, Ptr<Ptr<runtime.nlattr>> attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<devlink_port> devlink_port_get_from_info(Ptr<runtime.devlink> devlink2, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_init(Ptr<runtime.devlink> devlink2, Ptr<devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_linecard_set(Ptr<devlink_port> devlink_port2, Ptr<devlink_linecard> linecard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_port_netdevice_event(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_notify(Ptr<devlink_port> devlink_port2, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_port_register_with_ops($arg1, $arg2, $arg3, (const struct devlink_port_ops*)$arg4)")
    public static int devlink_port_register_with_ops(Ptr<runtime.devlink> devlink2, Ptr<devlink_port> devlink_port2, @Unsigned int port_index, Ptr<devlink_port_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_rel_cleanup_cb(Ptr<runtime.devlink> devlink2, @Unsigned int port_index, @Unsigned int rel_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_rel_notify_cb(Ptr<runtime.devlink> devlink2, @Unsigned int port_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_type_clear(Ptr<devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_type_eth_set(Ptr<devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_type_ib_set(Ptr<devlink_port> devlink_port2, Ptr<IbDefinitions.ib_device> ibdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_type_warn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_port_unregister(Ptr<devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_ports_notify(Ptr<runtime.devlink> devlink2, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_ports_notify_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_ports_notify_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_remove_symlinks(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<devlink_resource> devlink_resource_find(Ptr<runtime.devlink> devlink2, Ptr<devlink_resource> resource2, @Unsigned long resource_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_resource_occ_get_register(Ptr<runtime.devlink> devlink2, @Unsigned long resource_id, Ptr<?> occ_get, Ptr<?> occ_get_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_resource_occ_get_unregister(Ptr<runtime.devlink> devlink2, @Unsigned long resource_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_resource_register($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (const struct devlink_resource_size_params*)$arg6)")
    public static int devlink_resource_register(Ptr<runtime.devlink> devlink2, String resource_name, @Unsigned long resource_size, @Unsigned long resource_id, @Unsigned long parent_resource_id, Ptr<devlink_resource_size_params> size_params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_resources_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_resources_validate(Ptr<runtime.devlink> devlink2, Ptr<devlink_resource> resource2, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devlink_trap_ctx_priv(Ptr<?> trap_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_group_notify($arg1, (const struct devlink_trap_group_item*)$arg2, $arg3)")
    public static void devlink_trap_group_notify(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_group_item> group_item, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_group_register($arg1, (const struct devlink_trap_group*)$arg2)")
    public static int devlink_trap_group_register(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_group_unregister($arg1, (const struct devlink_trap_group*)$arg2)")
    public static void devlink_trap_group_unregister(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_trap_groups_notify_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_trap_groups_notify_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_groups_register($arg1, (const struct devlink_trap_group*)$arg2, $arg3)")
    public static int devlink_trap_groups_register(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_group> groups, @Unsigned long groups_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_groups_unregister($arg1, (const struct devlink_trap_group*)$arg2, $arg3)")
    public static void devlink_trap_groups_unregister(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_group> groups, @Unsigned long groups_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_notify($arg1, (const struct devlink_trap_item*)$arg2, $arg3)")
    public static void devlink_trap_notify(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_item> trap_item, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_policer_notify($arg1, (const struct devlink_trap_policer_item*)$arg2, $arg3)")
    public static void devlink_trap_policer_notify(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_policer_item> policer_item, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_policer_unregister($arg1, (const struct devlink_trap_policer*)$arg2)")
    public static void devlink_trap_policer_unregister(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap_policer> policer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_trap_policers_notify_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_trap_policers_notify_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_register($arg1, (const struct devlink_trap*)$arg2, $arg3)")
    public static int devlink_trap_register(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap> trap, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_report($arg1, $arg2, $arg3, $arg4, (const struct flow_action_cookie*)$arg5)")
    public static void devlink_trap_report(Ptr<runtime.devlink> devlink2, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> trap_ctx, Ptr<devlink_port> in_devlink_port, Ptr<FlowDefinitions.flow_action_cookie> fa_cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_trap_stats_read(Ptr<devlink_stats> trap_stats, Ptr<devlink_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_trap_unregister($arg1, (const struct devlink_trap*)$arg2)")
    public static void devlink_trap_unregister(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap> trap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_traps_notify_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_traps_notify_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_traps_register($arg1, (const struct devlink_trap*)$arg2, $arg3, $arg4)")
    public static int devlink_traps_register(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap> traps, @Unsigned long traps_count, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_traps_unregister($arg1, (const struct devlink_trap*)$arg2, $arg3)")
    public static void devlink_traps_unregister(Ptr<runtime.devlink> devlink2, Ptr<devlink_trap> traps, @Unsigned long traps_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __devlink_region_snapshot_create(Ptr<devlink_region> region2, Ptr<Character> data, @Unsigned int snapshot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __devlink_snapshot_id_decrement(Ptr<runtime.devlink> devlink2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_alloc_ns((const struct devlink_ops*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<runtime.devlink> devlink_alloc_ns(Ptr<devlink_ops> ops, @Unsigned long priv_size, Ptr<runtime.net> net2, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_free(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_net((const struct devlink*)$arg1)")
    public static Ptr<runtime.net> devlink_net(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_region_del_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_region_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_region_get_dump_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, Ptr<NetlinkDefinitions.netlink_callback> cb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_region_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_region_new_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_nl_region_notify(Ptr<devlink_region> region2, Ptr<devlink_snapshot> snapshot, devlink_command cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> devlink_nl_region_notify_build(Ptr<devlink_region> region2, Ptr<devlink_snapshot> snapshot, devlink_command cmd, @Unsigned int portid, @Unsigned int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_nl_region_read_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_pernet_pre_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_port_region_create($arg1, (const struct devlink_port_region_ops*)$arg2, $arg3, $arg4)")
    public static Ptr<devlink_region> devlink_port_region_create(Ptr<devlink_port> port2, Ptr<devlink_port_region_ops> ops, @Unsigned int region_max_snapshots, @Unsigned long region_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devlink_priv(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_put(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_region_create($arg1, (const struct devlink_region_ops*)$arg2, $arg3, $arg4)")
    public static Ptr<devlink_region> devlink_region_create(Ptr<runtime.devlink> devlink2, Ptr<devlink_region_ops> ops, @Unsigned int region_max_snapshots, @Unsigned long region_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_region_destroy(Ptr<devlink_region> region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_region_direct_fill(Ptr<?> cb_priv, Ptr<Character> chunk, @Unsigned int chunk_size, @Unsigned long curr_offset, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_region_port_direct_fill(Ptr<?> cb_priv, Ptr<Character> chunk, @Unsigned int chunk_size, @Unsigned long curr_offset, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_region_snapshot_create(Ptr<devlink_region> region2, Ptr<Character> data, @Unsigned int snapshot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_region_snapshot_del(Ptr<devlink_region> region2, Ptr<devlink_snapshot> snapshot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_region_snapshot_fill(Ptr<?> cb_priv, Ptr<Character> chunk, @Unsigned int chunk_size, @Unsigned long curr_offset, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_region_snapshot_id_get(Ptr<runtime.devlink> devlink2, Ptr<@Unsigned Integer> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_region_snapshot_id_put(Ptr<runtime.devlink> devlink2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_regions_notify_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_regions_notify_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_rel_devlink_handle_put(Ptr<SkDefinitions.sk_buff> msg, Ptr<runtime.devlink> devlink2, @Unsigned int rel_index, int attrtype, Ptr<@OriginalName(value="bool") Boolean> msg_updated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devlink_rel_nested_in_add(Ptr<@Unsigned Integer> rel_index, @Unsigned int devlink_index, @Unsigned int obj_index, Ptr<?> notify_cb, Ptr<?> cleanup_cb, Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_rel_nested_in_clear(@Unsigned int rel_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_rel_nested_in_notify(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_rel_nested_in_notify_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_rel_nested_in_notify_work_schedule(Ptr<devlink_rel> rel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_release(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devlink_to_dev((const struct devlink*)$arg1)")
    public static Ptr<runtime.device> devlink_to_dev(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.devlink> devlink_try_get(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devlink_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_trap_item")
    @NotUsableInJava
    public static class devlink_trap_item
    extends Struct {
        public Ptr<devlink_trap> trap;
        public Ptr<devlink_trap_group_item> group_item;
        public ListDefinitions.list_head list;
        public devlink_trap_action action;
        public Ptr<devlink_stats> stats;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_trap_group_item")
    @NotUsableInJava
    public static class devlink_trap_group_item
    extends Struct {
        public Ptr<devlink_trap_group> group;
        public Ptr<devlink_trap_policer_item> policer_item;
        public ListDefinitions.list_head list;
        public Ptr<devlink_stats> stats;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_trap_policer_item")
    @NotUsableInJava
    public static class devlink_trap_policer_item
    extends Struct {
        public Ptr<devlink_trap_policer> policer;
        public @Unsigned long rate;
        public @Unsigned long burst;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_stats")
    @NotUsableInJava
    public static class devlink_stats
    extends Struct {
        public misc.u64_stats_t rx_bytes;
        public misc.u64_stats_t rx_packets;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_trap_group_generic_id")
    public static enum devlink_trap_group_generic_id implements Enum<devlink_trap_group_generic_id>,
    TypedEnum<devlink_trap_group_generic_id, Integer>
    {
        DEVLINK_TRAP_GROUP_GENERIC_ID_L2_DROPS,
        DEVLINK_TRAP_GROUP_GENERIC_ID_L3_DROPS,
        DEVLINK_TRAP_GROUP_GENERIC_ID_L3_EXCEPTIONS,
        DEVLINK_TRAP_GROUP_GENERIC_ID_BUFFER_DROPS,
        DEVLINK_TRAP_GROUP_GENERIC_ID_TUNNEL_DROPS,
        DEVLINK_TRAP_GROUP_GENERIC_ID_ACL_DROPS,
        DEVLINK_TRAP_GROUP_GENERIC_ID_STP,
        DEVLINK_TRAP_GROUP_GENERIC_ID_LACP,
        DEVLINK_TRAP_GROUP_GENERIC_ID_LLDP,
        DEVLINK_TRAP_GROUP_GENERIC_ID_MC_SNOOPING,
        DEVLINK_TRAP_GROUP_GENERIC_ID_DHCP,
        DEVLINK_TRAP_GROUP_GENERIC_ID_NEIGH_DISCOVERY,
        DEVLINK_TRAP_GROUP_GENERIC_ID_BFD,
        DEVLINK_TRAP_GROUP_GENERIC_ID_OSPF,
        DEVLINK_TRAP_GROUP_GENERIC_ID_BGP,
        DEVLINK_TRAP_GROUP_GENERIC_ID_VRRP,
        DEVLINK_TRAP_GROUP_GENERIC_ID_PIM,
        DEVLINK_TRAP_GROUP_GENERIC_ID_UC_LB,
        DEVLINK_TRAP_GROUP_GENERIC_ID_LOCAL_DELIVERY,
        DEVLINK_TRAP_GROUP_GENERIC_ID_EXTERNAL_DELIVERY,
        DEVLINK_TRAP_GROUP_GENERIC_ID_IPV6,
        DEVLINK_TRAP_GROUP_GENERIC_ID_PTP_EVENT,
        DEVLINK_TRAP_GROUP_GENERIC_ID_PTP_GENERAL,
        DEVLINK_TRAP_GROUP_GENERIC_ID_ACL_SAMPLE,
        DEVLINK_TRAP_GROUP_GENERIC_ID_ACL_TRAP,
        DEVLINK_TRAP_GROUP_GENERIC_ID_PARSER_ERROR_DROPS,
        DEVLINK_TRAP_GROUP_GENERIC_ID_EAPOL,
        __DEVLINK_TRAP_GROUP_GENERIC_ID_MAX,
        DEVLINK_TRAP_GROUP_GENERIC_ID_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_trap_generic_id")
    public static enum devlink_trap_generic_id implements Enum<devlink_trap_generic_id>,
    TypedEnum<devlink_trap_generic_id, Integer>
    {
        DEVLINK_TRAP_GENERIC_ID_SMAC_MC,
        DEVLINK_TRAP_GENERIC_ID_VLAN_TAG_MISMATCH,
        DEVLINK_TRAP_GENERIC_ID_INGRESS_VLAN_FILTER,
        DEVLINK_TRAP_GENERIC_ID_INGRESS_STP_FILTER,
        DEVLINK_TRAP_GENERIC_ID_EMPTY_TX_LIST,
        DEVLINK_TRAP_GENERIC_ID_PORT_LOOPBACK_FILTER,
        DEVLINK_TRAP_GENERIC_ID_BLACKHOLE_ROUTE,
        DEVLINK_TRAP_GENERIC_ID_TTL_ERROR,
        DEVLINK_TRAP_GENERIC_ID_TAIL_DROP,
        DEVLINK_TRAP_GENERIC_ID_NON_IP_PACKET,
        DEVLINK_TRAP_GENERIC_ID_UC_DIP_MC_DMAC,
        DEVLINK_TRAP_GENERIC_ID_DIP_LB,
        DEVLINK_TRAP_GENERIC_ID_SIP_MC,
        DEVLINK_TRAP_GENERIC_ID_SIP_LB,
        DEVLINK_TRAP_GENERIC_ID_CORRUPTED_IP_HDR,
        DEVLINK_TRAP_GENERIC_ID_IPV4_SIP_BC,
        DEVLINK_TRAP_GENERIC_ID_IPV6_MC_DIP_RESERVED_SCOPE,
        DEVLINK_TRAP_GENERIC_ID_IPV6_MC_DIP_INTERFACE_LOCAL_SCOPE,
        DEVLINK_TRAP_GENERIC_ID_MTU_ERROR,
        DEVLINK_TRAP_GENERIC_ID_UNRESOLVED_NEIGH,
        DEVLINK_TRAP_GENERIC_ID_RPF,
        DEVLINK_TRAP_GENERIC_ID_REJECT_ROUTE,
        DEVLINK_TRAP_GENERIC_ID_IPV4_LPM_UNICAST_MISS,
        DEVLINK_TRAP_GENERIC_ID_IPV6_LPM_UNICAST_MISS,
        DEVLINK_TRAP_GENERIC_ID_NON_ROUTABLE,
        DEVLINK_TRAP_GENERIC_ID_DECAP_ERROR,
        DEVLINK_TRAP_GENERIC_ID_OVERLAY_SMAC_MC,
        DEVLINK_TRAP_GENERIC_ID_INGRESS_FLOW_ACTION_DROP,
        DEVLINK_TRAP_GENERIC_ID_EGRESS_FLOW_ACTION_DROP,
        DEVLINK_TRAP_GENERIC_ID_STP,
        DEVLINK_TRAP_GENERIC_ID_LACP,
        DEVLINK_TRAP_GENERIC_ID_LLDP,
        DEVLINK_TRAP_GENERIC_ID_IGMP_QUERY,
        DEVLINK_TRAP_GENERIC_ID_IGMP_V1_REPORT,
        DEVLINK_TRAP_GENERIC_ID_IGMP_V2_REPORT,
        DEVLINK_TRAP_GENERIC_ID_IGMP_V3_REPORT,
        DEVLINK_TRAP_GENERIC_ID_IGMP_V2_LEAVE,
        DEVLINK_TRAP_GENERIC_ID_MLD_QUERY,
        DEVLINK_TRAP_GENERIC_ID_MLD_V1_REPORT,
        DEVLINK_TRAP_GENERIC_ID_MLD_V2_REPORT,
        DEVLINK_TRAP_GENERIC_ID_MLD_V1_DONE,
        DEVLINK_TRAP_GENERIC_ID_IPV4_DHCP,
        DEVLINK_TRAP_GENERIC_ID_IPV6_DHCP,
        DEVLINK_TRAP_GENERIC_ID_ARP_REQUEST,
        DEVLINK_TRAP_GENERIC_ID_ARP_RESPONSE,
        DEVLINK_TRAP_GENERIC_ID_ARP_OVERLAY,
        DEVLINK_TRAP_GENERIC_ID_IPV6_NEIGH_SOLICIT,
        DEVLINK_TRAP_GENERIC_ID_IPV6_NEIGH_ADVERT,
        DEVLINK_TRAP_GENERIC_ID_IPV4_BFD,
        DEVLINK_TRAP_GENERIC_ID_IPV6_BFD,
        DEVLINK_TRAP_GENERIC_ID_IPV4_OSPF,
        DEVLINK_TRAP_GENERIC_ID_IPV6_OSPF,
        DEVLINK_TRAP_GENERIC_ID_IPV4_BGP,
        DEVLINK_TRAP_GENERIC_ID_IPV6_BGP,
        DEVLINK_TRAP_GENERIC_ID_IPV4_VRRP,
        DEVLINK_TRAP_GENERIC_ID_IPV6_VRRP,
        DEVLINK_TRAP_GENERIC_ID_IPV4_PIM,
        DEVLINK_TRAP_GENERIC_ID_IPV6_PIM,
        DEVLINK_TRAP_GENERIC_ID_UC_LB,
        DEVLINK_TRAP_GENERIC_ID_LOCAL_ROUTE,
        DEVLINK_TRAP_GENERIC_ID_EXTERNAL_ROUTE,
        DEVLINK_TRAP_GENERIC_ID_IPV6_UC_DIP_LINK_LOCAL_SCOPE,
        DEVLINK_TRAP_GENERIC_ID_IPV6_DIP_ALL_NODES,
        DEVLINK_TRAP_GENERIC_ID_IPV6_DIP_ALL_ROUTERS,
        DEVLINK_TRAP_GENERIC_ID_IPV6_ROUTER_SOLICIT,
        DEVLINK_TRAP_GENERIC_ID_IPV6_ROUTER_ADVERT,
        DEVLINK_TRAP_GENERIC_ID_IPV6_REDIRECT,
        DEVLINK_TRAP_GENERIC_ID_IPV4_ROUTER_ALERT,
        DEVLINK_TRAP_GENERIC_ID_IPV6_ROUTER_ALERT,
        DEVLINK_TRAP_GENERIC_ID_PTP_EVENT,
        DEVLINK_TRAP_GENERIC_ID_PTP_GENERAL,
        DEVLINK_TRAP_GENERIC_ID_FLOW_ACTION_SAMPLE,
        DEVLINK_TRAP_GENERIC_ID_FLOW_ACTION_TRAP,
        DEVLINK_TRAP_GENERIC_ID_EARLY_DROP,
        DEVLINK_TRAP_GENERIC_ID_VXLAN_PARSING,
        DEVLINK_TRAP_GENERIC_ID_LLC_SNAP_PARSING,
        DEVLINK_TRAP_GENERIC_ID_VLAN_PARSING,
        DEVLINK_TRAP_GENERIC_ID_PPPOE_PPP_PARSING,
        DEVLINK_TRAP_GENERIC_ID_MPLS_PARSING,
        DEVLINK_TRAP_GENERIC_ID_ARP_PARSING,
        DEVLINK_TRAP_GENERIC_ID_IP_1_PARSING,
        DEVLINK_TRAP_GENERIC_ID_IP_N_PARSING,
        DEVLINK_TRAP_GENERIC_ID_GRE_PARSING,
        DEVLINK_TRAP_GENERIC_ID_UDP_PARSING,
        DEVLINK_TRAP_GENERIC_ID_TCP_PARSING,
        DEVLINK_TRAP_GENERIC_ID_IPSEC_PARSING,
        DEVLINK_TRAP_GENERIC_ID_SCTP_PARSING,
        DEVLINK_TRAP_GENERIC_ID_DCCP_PARSING,
        DEVLINK_TRAP_GENERIC_ID_GTP_PARSING,
        DEVLINK_TRAP_GENERIC_ID_ESP_PARSING,
        DEVLINK_TRAP_GENERIC_ID_BLACKHOLE_NEXTHOP,
        DEVLINK_TRAP_GENERIC_ID_DMAC_FILTER,
        DEVLINK_TRAP_GENERIC_ID_EAPOL,
        DEVLINK_TRAP_GENERIC_ID_LOCKED_PORT,
        __DEVLINK_TRAP_GENERIC_ID_MAX,
        DEVLINK_TRAP_GENERIC_ID_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_resource")
    @NotUsableInJava
    public static class devlink_resource
    extends Struct {
        public String name;
        public @Unsigned long id;
        public @Unsigned long size;
        public @Unsigned long size_new;
        public boolean size_valid;
        public Ptr<devlink_resource> parent;
        public devlink_resource_size_params size_params;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head resource_list;
        public Ptr<?> occ_get;
        public Ptr<?> occ_get_priv;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_resource_size_params")
    @NotUsableInJava
    public static class devlink_resource_size_params
    extends Struct {
        public @Unsigned long size_min;
        public @Unsigned long size_max;
        public @Unsigned long size_granularity;
        public devlink_resource_unit unit;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_resource_unit")
    public static enum devlink_resource_unit implements Enum<devlink_resource_unit>,
    TypedEnum<devlink_resource_unit, Integer>
    {
        DEVLINK_RESOURCE_UNIT_ENTRY;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_port_fn_attr_cap")
    public static enum devlink_port_fn_attr_cap implements Enum<devlink_port_fn_attr_cap>,
    TypedEnum<devlink_port_fn_attr_cap, Integer>
    {
        DEVLINK_PORT_FN_ATTR_CAP_ROCE_BIT,
        DEVLINK_PORT_FN_ATTR_CAP_MIGRATABLE_BIT,
        DEVLINK_PORT_FN_ATTR_CAP_IPSEC_CRYPTO_BIT,
        DEVLINK_PORT_FN_ATTR_CAP_IPSEC_PACKET_BIT,
        __DEVLINK_PORT_FN_ATTR_CAPS_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_nl_sock_priv")
    @NotUsableInJava
    public static class devlink_nl_sock_priv
    extends Struct {
        public Ptr<devlink_obj_desc> flt;
        public  @OriginalName(value="spinlock_t") runtime.spinlock flt_lock;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_param_generic_id")
    public static enum devlink_param_generic_id implements Enum<devlink_param_generic_id>,
    TypedEnum<devlink_param_generic_id, Integer>
    {
        DEVLINK_PARAM_GENERIC_ID_INT_ERR_RESET,
        DEVLINK_PARAM_GENERIC_ID_MAX_MACS,
        DEVLINK_PARAM_GENERIC_ID_ENABLE_SRIOV,
        DEVLINK_PARAM_GENERIC_ID_REGION_SNAPSHOT,
        DEVLINK_PARAM_GENERIC_ID_IGNORE_ARI,
        DEVLINK_PARAM_GENERIC_ID_MSIX_VEC_PER_PF_MAX,
        DEVLINK_PARAM_GENERIC_ID_MSIX_VEC_PER_PF_MIN,
        DEVLINK_PARAM_GENERIC_ID_FW_LOAD_POLICY,
        DEVLINK_PARAM_GENERIC_ID_RESET_DEV_ON_DRV_PROBE,
        DEVLINK_PARAM_GENERIC_ID_ENABLE_ROCE,
        DEVLINK_PARAM_GENERIC_ID_ENABLE_REMOTE_DEV_RESET,
        DEVLINK_PARAM_GENERIC_ID_ENABLE_ETH,
        DEVLINK_PARAM_GENERIC_ID_ENABLE_RDMA,
        DEVLINK_PARAM_GENERIC_ID_ENABLE_VNET,
        DEVLINK_PARAM_GENERIC_ID_ENABLE_IWARP,
        DEVLINK_PARAM_GENERIC_ID_IO_EQ_SIZE,
        DEVLINK_PARAM_GENERIC_ID_EVENT_EQ_SIZE,
        __DEVLINK_PARAM_GENERIC_ID_MAX,
        DEVLINK_PARAM_GENERIC_ID_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_param_item")
    @NotUsableInJava
    public static class devlink_param_item
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<devlink_param> param;
        public devlink_param_value driverinit_value;
        public boolean driverinit_value_valid;
        public devlink_param_value driverinit_value_new;
        public boolean driverinit_value_new_valid;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_param")
    @NotUsableInJava
    public static class devlink_param
    extends Struct {
        public @Unsigned int id;
        public String name;
        public boolean generic;
        public devlink_param_type type;
        public @Unsigned long supported_cmodes;
        public Ptr<?> get;
        public Ptr<?> set;
        public Ptr<?> validate;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_param_type")
    public static enum devlink_param_type implements Enum<devlink_param_type>,
    TypedEnum<devlink_param_type, Integer>
    {
        DEVLINK_PARAM_TYPE_U8,
        DEVLINK_PARAM_TYPE_U16,
        DEVLINK_PARAM_TYPE_U32,
        DEVLINK_PARAM_TYPE_STRING,
        DEVLINK_PARAM_TYPE_BOOL;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_sb")
    @NotUsableInJava
    public static class devlink_sb
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned int index;
        public @Unsigned int size;
        public @Unsigned short ingress_pools_count;
        public @Unsigned short egress_pools_count;
        public @Unsigned short ingress_tc_count;
        public @Unsigned short egress_tc_count;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_linecard_type")
    @NotUsableInJava
    public static class devlink_linecard_type
    extends Struct {
        public String type;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_linecard_ops")
    @NotUsableInJava
    public static class devlink_linecard_ops
    extends Struct {
        public Ptr<?> provision;
        public Ptr<?> unprovision;
        public Ptr<?> same_provision;
        public Ptr<?> types_count;
        public Ptr<?> types_get;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_linecard")
    @NotUsableInJava
    public static class devlink_linecard
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.devlink> devlink;
        public @Unsigned int index;
        public Ptr<devlink_linecard_ops> ops;
        public Ptr<?> priv;
        public devlink_linecard_state state;
        public runtime.mutex state_lock;
        public String type;
        public Ptr<devlink_linecard_type> types;
        public @Unsigned int types_count;
        public @Unsigned int rel_index;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_linecard_state")
    public static enum devlink_linecard_state implements Enum<devlink_linecard_state>,
    TypedEnum<devlink_linecard_state, Integer>
    {
        DEVLINK_LINECARD_STATE_UNSPEC,
        DEVLINK_LINECARD_STATE_UNPROVISIONED,
        DEVLINK_LINECARD_STATE_UNPROVISIONING,
        DEVLINK_LINECARD_STATE_PROVISIONING,
        DEVLINK_LINECARD_STATE_PROVISIONING_FAILED,
        DEVLINK_LINECARD_STATE_PROVISIONED,
        DEVLINK_LINECARD_STATE_ACTIVE,
        __DEVLINK_LINECARD_STATE_MAX,
        DEVLINK_LINECARD_STATE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_fmsg_item")
    @NotUsableInJava
    public static class devlink_fmsg_item
    extends Struct {
        public ListDefinitions.list_head list;
        public int attrtype;
        public char nla_type;
        public @Unsigned short len;
        public int @Size(value=0) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_fmsg")
    @NotUsableInJava
    public static class devlink_fmsg
    extends Struct {
        public ListDefinitions.list_head item_list;
        public int err;
        public boolean putting_binary;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_health_reporter")
    @NotUsableInJava
    public static class devlink_health_reporter
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> priv;
        public Ptr<devlink_health_reporter_ops> ops;
        public Ptr<runtime.devlink> devlink;
        public Ptr<devlink_port> devlink_port;
        public Ptr<devlink_fmsg> dump_fmsg;
        public @Unsigned long graceful_period;
        public boolean auto_recover;
        public boolean auto_dump;
        public char health_state;
        public @Unsigned long dump_ts;
        public @Unsigned long dump_real_ts;
        public @Unsigned long error_count;
        public @Unsigned long recovery_count;
        public @Unsigned long last_recovery_ts;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_health_reporter_ops")
    @NotUsableInJava
    public static class devlink_health_reporter_ops
    extends Struct {
        public String name;
        public Ptr<?> recover;
        public Ptr<?> dump;
        public Ptr<?> diagnose;
        public Ptr<?> test;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_health_reporter_state")
    public static enum devlink_health_reporter_state implements Enum<devlink_health_reporter_state>,
    TypedEnum<devlink_health_reporter_state, Integer>
    {
        DEVLINK_HEALTH_REPORTER_STATE_HEALTHY,
        DEVLINK_HEALTH_REPORTER_STATE_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_table_ops")
    @NotUsableInJava
    public static class devlink_dpipe_table_ops
    extends Struct {
        public Ptr<?> actions_dump;
        public Ptr<?> matches_dump;
        public Ptr<?> entries_dump;
        public Ptr<?> counters_set_update;
        public Ptr<?> size_get;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_table")
    @NotUsableInJava
    public static class devlink_dpipe_table
    extends Struct {
        public Ptr<?> priv;
        public ListDefinitions.list_head list;
        public String name;
        public boolean counters_enabled;
        public boolean counter_control_extern;
        public boolean resource_valid;
        public @Unsigned long resource_id;
        public @Unsigned long resource_units;
        public Ptr<devlink_dpipe_table_ops> table_ops;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_dump_ctx")
    @NotUsableInJava
    public static class devlink_dpipe_dump_ctx
    extends Struct {
        public Ptr<GenlDefinitions.genl_info> info;
        public devlink_command cmd;
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<runtime.nlattr> nest;
        public Ptr<?> hdr;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_entry")
    @NotUsableInJava
    public static class devlink_dpipe_entry
    extends Struct {
        public @Unsigned long index;
        public Ptr<devlink_dpipe_value> match_values;
        public @Unsigned int match_values_count;
        public Ptr<devlink_dpipe_value> action_values;
        public @Unsigned int action_values_count;
        public @Unsigned long counter;
        public boolean counter_valid;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_value")
    @NotUsableInJava
    public static class devlink_dpipe_value
    extends Struct {
        @InlineUnion(value=34875)
        public @InlineUnion(value=34875) Ptr<devlink_dpipe_action> action;
        @InlineUnion(value=34875)
        public @InlineUnion(value=34875) Ptr<devlink_dpipe_match> match;
        public @Unsigned int mapping_value;
        public boolean mapping_valid;
        public @Unsigned int value_size;
        public Ptr<?> value;
        public Ptr<?> mask;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_action")
    @NotUsableInJava
    public static class devlink_dpipe_action
    extends Struct {
        public devlink_dpipe_action_type type;
        public @Unsigned int header_index;
        public Ptr<devlink_dpipe_header> header;
        public @Unsigned int field_id;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_match")
    @NotUsableInJava
    public static class devlink_dpipe_match
    extends Struct {
        public devlink_dpipe_match_type type;
        public @Unsigned int header_index;
        public Ptr<devlink_dpipe_header> header;
        public @Unsigned int field_id;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_dpipe_header_id")
    public static enum devlink_dpipe_header_id implements Enum<devlink_dpipe_header_id>,
    TypedEnum<devlink_dpipe_header_id, Integer>
    {
        DEVLINK_DPIPE_HEADER_ETHERNET,
        DEVLINK_DPIPE_HEADER_IPV4,
        DEVLINK_DPIPE_HEADER_IPV6;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_dpipe_field_ipv6_id")
    public static enum devlink_dpipe_field_ipv6_id implements Enum<devlink_dpipe_field_ipv6_id>,
    TypedEnum<devlink_dpipe_field_ipv6_id, Integer>
    {
        DEVLINK_DPIPE_FIELD_IPV6_DST_IP;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_dpipe_field_ipv4_id")
    public static enum devlink_dpipe_field_ipv4_id implements Enum<devlink_dpipe_field_ipv4_id>,
    TypedEnum<devlink_dpipe_field_ipv4_id, Integer>
    {
        DEVLINK_DPIPE_FIELD_IPV4_DST_IP;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_dpipe_field_ethernet_id")
    public static enum devlink_dpipe_field_ethernet_id implements Enum<devlink_dpipe_field_ethernet_id>,
    TypedEnum<devlink_dpipe_field_ethernet_id, Integer>
    {
        DEVLINK_DPIPE_FIELD_ETHERNET_DST_MAC;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_dpipe_action_type")
    public static enum devlink_dpipe_action_type implements Enum<devlink_dpipe_action_type>,
    TypedEnum<devlink_dpipe_action_type, Integer>
    {
        DEVLINK_DPIPE_ACTION_TYPE_FIELD_MODIFY;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_dpipe_match_type")
    public static enum devlink_dpipe_match_type implements Enum<devlink_dpipe_match_type>,
    TypedEnum<devlink_dpipe_match_type, Integer>
    {
        DEVLINK_DPIPE_MATCH_TYPE_FIELD_EXACT;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_flash_component_lookup_ctx")
    @NotUsableInJava
    public static class devlink_flash_component_lookup_ctx
    extends Struct {
        public String lookup_name;
        public boolean lookup_name_found;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_reload_combination")
    @NotUsableInJava
    public static class devlink_reload_combination
    extends Struct {
        public devlink_reload_action action;
        public devlink_reload_limit limit;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_info_version_type")
    public static enum devlink_info_version_type implements Enum<devlink_info_version_type>,
    TypedEnum<devlink_info_version_type, Integer>
    {
        DEVLINK_INFO_VERSION_TYPE_NONE,
        DEVLINK_INFO_VERSION_TYPE_COMPONENT;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_info_req")
    @NotUsableInJava
    public static class devlink_info_req
    extends Struct {
        public Ptr<SkDefinitions.sk_buff> msg;
        public Ptr<?> version_cb;
        public Ptr<?> version_cb_priv;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_flash_notify")
    @NotUsableInJava
    public static class devlink_flash_notify
    extends Struct {
        public String status_msg;
        public String component;
        public @Unsigned long done;
        public @Unsigned long total;
        public @Unsigned long timeout;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_attr_selftest_result")
    public static enum devlink_attr_selftest_result implements Enum<devlink_attr_selftest_result>,
    TypedEnum<devlink_attr_selftest_result, Integer>
    {
        DEVLINK_ATTR_SELFTEST_RESULT_UNSPEC,
        DEVLINK_ATTR_SELFTEST_RESULT,
        DEVLINK_ATTR_SELFTEST_RESULT_ID,
        DEVLINK_ATTR_SELFTEST_RESULT_STATUS,
        __DEVLINK_ATTR_SELFTEST_RESULT_MAX,
        DEVLINK_ATTR_SELFTEST_RESULT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_param_gset_ctx")
    @NotUsableInJava
    public static class devlink_param_gset_ctx
    extends Struct {
        public devlink_param_value val;
        public devlink_param_cmode cmode;
    }

    @Type(noCCodeGeneration=true, cType="union devlink_param_value")
    @NotUsableInJava
    public static class devlink_param_value
    extends Union {
        public char vu8;
        public @Unsigned short vu16;
        public @Unsigned int vu32;
        public char @Size(value=32) [] vstr;
        public boolean vbool;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_param_cmode")
    public static enum devlink_param_cmode implements Enum<devlink_param_cmode>,
    TypedEnum<devlink_param_cmode, Integer>
    {
        DEVLINK_PARAM_CMODE_RUNTIME,
        DEVLINK_PARAM_CMODE_DRIVERINIT,
        DEVLINK_PARAM_CMODE_PERMANENT,
        __DEVLINK_PARAM_CMODE_MAX,
        DEVLINK_PARAM_CMODE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_snapshot")
    @NotUsableInJava
    public static class devlink_snapshot
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<devlink_region> region;
        public Ptr<Character> data;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_region")
    @NotUsableInJava
    public static class devlink_region
    extends Struct {
        public Ptr<runtime.devlink> devlink;
        public Ptr<devlink_port> port;
        public ListDefinitions.list_head list;
        @InlineUnion(value=26642)
        public @InlineUnion(value=26642) Ptr<devlink_region_ops> ops;
        @InlineUnion(value=26642)
        public @InlineUnion(value=26642) Ptr<devlink_port_region_ops> port_ops;
        public runtime.mutex snapshot_lock;
        public ListDefinitions.list_head snapshot_list;
        public @Unsigned int max_snapshots;
        public @Unsigned int cur_snapshots;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_obj_desc")
    @NotUsableInJava
    public static class devlink_obj_desc
    extends Struct {
        public misc.callback_head rcu;
        public String bus_name;
        public String dev_name;
        public @Unsigned int port_index;
        public boolean port_index_valid;
        public long @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_nl_dump_state")
    @NotUsableInJava
    public static class devlink_nl_dump_state
    extends Struct {
        public @Unsigned long instance;
        public int idx;
        @InlineUnion(value=26637)
        public  @InlineUnion(value=26637) AnonDefinitions.anon_member_of_anon_member_of_devlink_nl_dump_state anon2$0;
        @InlineUnion(value=26637)
        public  @InlineUnion(value=26637) AnonDefinitions.anon_member_of_anon_member_of_devlink_nl_dump_state anon2$1;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_multicast_groups")
    public static enum devlink_multicast_groups implements Enum<devlink_multicast_groups>,
    TypedEnum<devlink_multicast_groups, Integer>
    {
        DEVLINK_MCGRP_CONFIG;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_port_region_ops")
    @NotUsableInJava
    public static class devlink_port_region_ops
    extends Struct {
        public String name;
        public Ptr<?> destructor;
        public Ptr<?> snapshot;
        public Ptr<?> read;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_region_ops")
    @NotUsableInJava
    public static class devlink_region_ops
    extends Struct {
        public String name;
        public Ptr<?> destructor;
        public Ptr<?> snapshot;
        public Ptr<?> read;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_attr")
    public static enum devlink_attr implements Enum<devlink_attr>,
    TypedEnum<devlink_attr, Integer>
    {
        DEVLINK_ATTR_UNSPEC,
        DEVLINK_ATTR_BUS_NAME,
        DEVLINK_ATTR_DEV_NAME,
        DEVLINK_ATTR_PORT_INDEX,
        DEVLINK_ATTR_PORT_TYPE,
        DEVLINK_ATTR_PORT_DESIRED_TYPE,
        DEVLINK_ATTR_PORT_NETDEV_IFINDEX,
        DEVLINK_ATTR_PORT_NETDEV_NAME,
        DEVLINK_ATTR_PORT_IBDEV_NAME,
        DEVLINK_ATTR_PORT_SPLIT_COUNT,
        DEVLINK_ATTR_PORT_SPLIT_GROUP,
        DEVLINK_ATTR_SB_INDEX,
        DEVLINK_ATTR_SB_SIZE,
        DEVLINK_ATTR_SB_INGRESS_POOL_COUNT,
        DEVLINK_ATTR_SB_EGRESS_POOL_COUNT,
        DEVLINK_ATTR_SB_INGRESS_TC_COUNT,
        DEVLINK_ATTR_SB_EGRESS_TC_COUNT,
        DEVLINK_ATTR_SB_POOL_INDEX,
        DEVLINK_ATTR_SB_POOL_TYPE,
        DEVLINK_ATTR_SB_POOL_SIZE,
        DEVLINK_ATTR_SB_POOL_THRESHOLD_TYPE,
        DEVLINK_ATTR_SB_THRESHOLD,
        DEVLINK_ATTR_SB_TC_INDEX,
        DEVLINK_ATTR_SB_OCC_CUR,
        DEVLINK_ATTR_SB_OCC_MAX,
        DEVLINK_ATTR_ESWITCH_MODE,
        DEVLINK_ATTR_ESWITCH_INLINE_MODE,
        DEVLINK_ATTR_DPIPE_TABLES,
        DEVLINK_ATTR_DPIPE_TABLE,
        DEVLINK_ATTR_DPIPE_TABLE_NAME,
        DEVLINK_ATTR_DPIPE_TABLE_SIZE,
        DEVLINK_ATTR_DPIPE_TABLE_MATCHES,
        DEVLINK_ATTR_DPIPE_TABLE_ACTIONS,
        DEVLINK_ATTR_DPIPE_TABLE_COUNTERS_ENABLED,
        DEVLINK_ATTR_DPIPE_ENTRIES,
        DEVLINK_ATTR_DPIPE_ENTRY,
        DEVLINK_ATTR_DPIPE_ENTRY_INDEX,
        DEVLINK_ATTR_DPIPE_ENTRY_MATCH_VALUES,
        DEVLINK_ATTR_DPIPE_ENTRY_ACTION_VALUES,
        DEVLINK_ATTR_DPIPE_ENTRY_COUNTER,
        DEVLINK_ATTR_DPIPE_MATCH,
        DEVLINK_ATTR_DPIPE_MATCH_VALUE,
        DEVLINK_ATTR_DPIPE_MATCH_TYPE,
        DEVLINK_ATTR_DPIPE_ACTION,
        DEVLINK_ATTR_DPIPE_ACTION_VALUE,
        DEVLINK_ATTR_DPIPE_ACTION_TYPE,
        DEVLINK_ATTR_DPIPE_VALUE,
        DEVLINK_ATTR_DPIPE_VALUE_MASK,
        DEVLINK_ATTR_DPIPE_VALUE_MAPPING,
        DEVLINK_ATTR_DPIPE_HEADERS,
        DEVLINK_ATTR_DPIPE_HEADER,
        DEVLINK_ATTR_DPIPE_HEADER_NAME,
        DEVLINK_ATTR_DPIPE_HEADER_ID,
        DEVLINK_ATTR_DPIPE_HEADER_FIELDS,
        DEVLINK_ATTR_DPIPE_HEADER_GLOBAL,
        DEVLINK_ATTR_DPIPE_HEADER_INDEX,
        DEVLINK_ATTR_DPIPE_FIELD,
        DEVLINK_ATTR_DPIPE_FIELD_NAME,
        DEVLINK_ATTR_DPIPE_FIELD_ID,
        DEVLINK_ATTR_DPIPE_FIELD_BITWIDTH,
        DEVLINK_ATTR_DPIPE_FIELD_MAPPING_TYPE,
        DEVLINK_ATTR_PAD,
        DEVLINK_ATTR_ESWITCH_ENCAP_MODE,
        DEVLINK_ATTR_RESOURCE_LIST,
        DEVLINK_ATTR_RESOURCE,
        DEVLINK_ATTR_RESOURCE_NAME,
        DEVLINK_ATTR_RESOURCE_ID,
        DEVLINK_ATTR_RESOURCE_SIZE,
        DEVLINK_ATTR_RESOURCE_SIZE_NEW,
        DEVLINK_ATTR_RESOURCE_SIZE_VALID,
        DEVLINK_ATTR_RESOURCE_SIZE_MIN,
        DEVLINK_ATTR_RESOURCE_SIZE_MAX,
        DEVLINK_ATTR_RESOURCE_SIZE_GRAN,
        DEVLINK_ATTR_RESOURCE_UNIT,
        DEVLINK_ATTR_RESOURCE_OCC,
        DEVLINK_ATTR_DPIPE_TABLE_RESOURCE_ID,
        DEVLINK_ATTR_DPIPE_TABLE_RESOURCE_UNITS,
        DEVLINK_ATTR_PORT_FLAVOUR,
        DEVLINK_ATTR_PORT_NUMBER,
        DEVLINK_ATTR_PORT_SPLIT_SUBPORT_NUMBER,
        DEVLINK_ATTR_PARAM,
        DEVLINK_ATTR_PARAM_NAME,
        DEVLINK_ATTR_PARAM_GENERIC,
        DEVLINK_ATTR_PARAM_TYPE,
        DEVLINK_ATTR_PARAM_VALUES_LIST,
        DEVLINK_ATTR_PARAM_VALUE,
        DEVLINK_ATTR_PARAM_VALUE_DATA,
        DEVLINK_ATTR_PARAM_VALUE_CMODE,
        DEVLINK_ATTR_REGION_NAME,
        DEVLINK_ATTR_REGION_SIZE,
        DEVLINK_ATTR_REGION_SNAPSHOTS,
        DEVLINK_ATTR_REGION_SNAPSHOT,
        DEVLINK_ATTR_REGION_SNAPSHOT_ID,
        DEVLINK_ATTR_REGION_CHUNKS,
        DEVLINK_ATTR_REGION_CHUNK,
        DEVLINK_ATTR_REGION_CHUNK_DATA,
        DEVLINK_ATTR_REGION_CHUNK_ADDR,
        DEVLINK_ATTR_REGION_CHUNK_LEN,
        DEVLINK_ATTR_INFO_DRIVER_NAME,
        DEVLINK_ATTR_INFO_SERIAL_NUMBER,
        DEVLINK_ATTR_INFO_VERSION_FIXED,
        DEVLINK_ATTR_INFO_VERSION_RUNNING,
        DEVLINK_ATTR_INFO_VERSION_STORED,
        DEVLINK_ATTR_INFO_VERSION_NAME,
        DEVLINK_ATTR_INFO_VERSION_VALUE,
        DEVLINK_ATTR_SB_POOL_CELL_SIZE,
        DEVLINK_ATTR_FMSG,
        DEVLINK_ATTR_FMSG_OBJ_NEST_START,
        DEVLINK_ATTR_FMSG_PAIR_NEST_START,
        DEVLINK_ATTR_FMSG_ARR_NEST_START,
        DEVLINK_ATTR_FMSG_NEST_END,
        DEVLINK_ATTR_FMSG_OBJ_NAME,
        DEVLINK_ATTR_FMSG_OBJ_VALUE_TYPE,
        DEVLINK_ATTR_FMSG_OBJ_VALUE_DATA,
        DEVLINK_ATTR_HEALTH_REPORTER,
        DEVLINK_ATTR_HEALTH_REPORTER_NAME,
        DEVLINK_ATTR_HEALTH_REPORTER_STATE,
        DEVLINK_ATTR_HEALTH_REPORTER_ERR_COUNT,
        DEVLINK_ATTR_HEALTH_REPORTER_RECOVER_COUNT,
        DEVLINK_ATTR_HEALTH_REPORTER_DUMP_TS,
        DEVLINK_ATTR_HEALTH_REPORTER_GRACEFUL_PERIOD,
        DEVLINK_ATTR_HEALTH_REPORTER_AUTO_RECOVER,
        DEVLINK_ATTR_FLASH_UPDATE_FILE_NAME,
        DEVLINK_ATTR_FLASH_UPDATE_COMPONENT,
        DEVLINK_ATTR_FLASH_UPDATE_STATUS_MSG,
        DEVLINK_ATTR_FLASH_UPDATE_STATUS_DONE,
        DEVLINK_ATTR_FLASH_UPDATE_STATUS_TOTAL,
        DEVLINK_ATTR_PORT_PCI_PF_NUMBER,
        DEVLINK_ATTR_PORT_PCI_VF_NUMBER,
        DEVLINK_ATTR_STATS,
        DEVLINK_ATTR_TRAP_NAME,
        DEVLINK_ATTR_TRAP_ACTION,
        DEVLINK_ATTR_TRAP_TYPE,
        DEVLINK_ATTR_TRAP_GENERIC,
        DEVLINK_ATTR_TRAP_METADATA,
        DEVLINK_ATTR_TRAP_GROUP_NAME,
        DEVLINK_ATTR_RELOAD_FAILED,
        DEVLINK_ATTR_HEALTH_REPORTER_DUMP_TS_NS,
        DEVLINK_ATTR_NETNS_FD,
        DEVLINK_ATTR_NETNS_PID,
        DEVLINK_ATTR_NETNS_ID,
        DEVLINK_ATTR_HEALTH_REPORTER_AUTO_DUMP,
        DEVLINK_ATTR_TRAP_POLICER_ID,
        DEVLINK_ATTR_TRAP_POLICER_RATE,
        DEVLINK_ATTR_TRAP_POLICER_BURST,
        DEVLINK_ATTR_PORT_FUNCTION,
        DEVLINK_ATTR_INFO_BOARD_SERIAL_NUMBER,
        DEVLINK_ATTR_PORT_LANES,
        DEVLINK_ATTR_PORT_SPLITTABLE,
        DEVLINK_ATTR_PORT_EXTERNAL,
        DEVLINK_ATTR_PORT_CONTROLLER_NUMBER,
        DEVLINK_ATTR_FLASH_UPDATE_STATUS_TIMEOUT,
        DEVLINK_ATTR_FLASH_UPDATE_OVERWRITE_MASK,
        DEVLINK_ATTR_RELOAD_ACTION,
        DEVLINK_ATTR_RELOAD_ACTIONS_PERFORMED,
        DEVLINK_ATTR_RELOAD_LIMITS,
        DEVLINK_ATTR_DEV_STATS,
        DEVLINK_ATTR_RELOAD_STATS,
        DEVLINK_ATTR_RELOAD_STATS_ENTRY,
        DEVLINK_ATTR_RELOAD_STATS_LIMIT,
        DEVLINK_ATTR_RELOAD_STATS_VALUE,
        DEVLINK_ATTR_REMOTE_RELOAD_STATS,
        DEVLINK_ATTR_RELOAD_ACTION_INFO,
        DEVLINK_ATTR_RELOAD_ACTION_STATS,
        DEVLINK_ATTR_PORT_PCI_SF_NUMBER,
        DEVLINK_ATTR_RATE_TYPE,
        DEVLINK_ATTR_RATE_TX_SHARE,
        DEVLINK_ATTR_RATE_TX_MAX,
        DEVLINK_ATTR_RATE_NODE_NAME,
        DEVLINK_ATTR_RATE_PARENT_NODE_NAME,
        DEVLINK_ATTR_REGION_MAX_SNAPSHOTS,
        DEVLINK_ATTR_LINECARD_INDEX,
        DEVLINK_ATTR_LINECARD_STATE,
        DEVLINK_ATTR_LINECARD_TYPE,
        DEVLINK_ATTR_LINECARD_SUPPORTED_TYPES,
        DEVLINK_ATTR_NESTED_DEVLINK,
        DEVLINK_ATTR_SELFTESTS,
        DEVLINK_ATTR_RATE_TX_PRIORITY,
        DEVLINK_ATTR_RATE_TX_WEIGHT,
        DEVLINK_ATTR_REGION_DIRECT,
        __DEVLINK_ATTR_MAX,
        DEVLINK_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_command")
    public static enum devlink_command implements Enum<devlink_command>,
    TypedEnum<devlink_command, Integer>
    {
        DEVLINK_CMD_UNSPEC,
        DEVLINK_CMD_GET,
        DEVLINK_CMD_SET,
        DEVLINK_CMD_NEW,
        DEVLINK_CMD_DEL,
        DEVLINK_CMD_PORT_GET,
        DEVLINK_CMD_PORT_SET,
        DEVLINK_CMD_PORT_NEW,
        DEVLINK_CMD_PORT_DEL,
        DEVLINK_CMD_PORT_SPLIT,
        DEVLINK_CMD_PORT_UNSPLIT,
        DEVLINK_CMD_SB_GET,
        DEVLINK_CMD_SB_SET,
        DEVLINK_CMD_SB_NEW,
        DEVLINK_CMD_SB_DEL,
        DEVLINK_CMD_SB_POOL_GET,
        DEVLINK_CMD_SB_POOL_SET,
        DEVLINK_CMD_SB_POOL_NEW,
        DEVLINK_CMD_SB_POOL_DEL,
        DEVLINK_CMD_SB_PORT_POOL_GET,
        DEVLINK_CMD_SB_PORT_POOL_SET,
        DEVLINK_CMD_SB_PORT_POOL_NEW,
        DEVLINK_CMD_SB_PORT_POOL_DEL,
        DEVLINK_CMD_SB_TC_POOL_BIND_GET,
        DEVLINK_CMD_SB_TC_POOL_BIND_SET,
        DEVLINK_CMD_SB_TC_POOL_BIND_NEW,
        DEVLINK_CMD_SB_TC_POOL_BIND_DEL,
        DEVLINK_CMD_SB_OCC_SNAPSHOT,
        DEVLINK_CMD_SB_OCC_MAX_CLEAR,
        DEVLINK_CMD_ESWITCH_GET,
        DEVLINK_CMD_ESWITCH_SET,
        DEVLINK_CMD_DPIPE_TABLE_GET,
        DEVLINK_CMD_DPIPE_ENTRIES_GET,
        DEVLINK_CMD_DPIPE_HEADERS_GET,
        DEVLINK_CMD_DPIPE_TABLE_COUNTERS_SET,
        DEVLINK_CMD_RESOURCE_SET,
        DEVLINK_CMD_RESOURCE_DUMP,
        DEVLINK_CMD_RELOAD,
        DEVLINK_CMD_PARAM_GET,
        DEVLINK_CMD_PARAM_SET,
        DEVLINK_CMD_PARAM_NEW,
        DEVLINK_CMD_PARAM_DEL,
        DEVLINK_CMD_REGION_GET,
        DEVLINK_CMD_REGION_SET,
        DEVLINK_CMD_REGION_NEW,
        DEVLINK_CMD_REGION_DEL,
        DEVLINK_CMD_REGION_READ,
        DEVLINK_CMD_PORT_PARAM_GET,
        DEVLINK_CMD_PORT_PARAM_SET,
        DEVLINK_CMD_PORT_PARAM_NEW,
        DEVLINK_CMD_PORT_PARAM_DEL,
        DEVLINK_CMD_INFO_GET,
        DEVLINK_CMD_HEALTH_REPORTER_GET,
        DEVLINK_CMD_HEALTH_REPORTER_SET,
        DEVLINK_CMD_HEALTH_REPORTER_RECOVER,
        DEVLINK_CMD_HEALTH_REPORTER_DIAGNOSE,
        DEVLINK_CMD_HEALTH_REPORTER_DUMP_GET,
        DEVLINK_CMD_HEALTH_REPORTER_DUMP_CLEAR,
        DEVLINK_CMD_FLASH_UPDATE,
        DEVLINK_CMD_FLASH_UPDATE_END,
        DEVLINK_CMD_FLASH_UPDATE_STATUS,
        DEVLINK_CMD_TRAP_GET,
        DEVLINK_CMD_TRAP_SET,
        DEVLINK_CMD_TRAP_NEW,
        DEVLINK_CMD_TRAP_DEL,
        DEVLINK_CMD_TRAP_GROUP_GET,
        DEVLINK_CMD_TRAP_GROUP_SET,
        DEVLINK_CMD_TRAP_GROUP_NEW,
        DEVLINK_CMD_TRAP_GROUP_DEL,
        DEVLINK_CMD_TRAP_POLICER_GET,
        DEVLINK_CMD_TRAP_POLICER_SET,
        DEVLINK_CMD_TRAP_POLICER_NEW,
        DEVLINK_CMD_TRAP_POLICER_DEL,
        DEVLINK_CMD_HEALTH_REPORTER_TEST,
        DEVLINK_CMD_RATE_GET,
        DEVLINK_CMD_RATE_SET,
        DEVLINK_CMD_RATE_NEW,
        DEVLINK_CMD_RATE_DEL,
        DEVLINK_CMD_LINECARD_GET,
        DEVLINK_CMD_LINECARD_SET,
        DEVLINK_CMD_LINECARD_NEW,
        DEVLINK_CMD_LINECARD_DEL,
        DEVLINK_CMD_SELFTESTS_GET,
        DEVLINK_CMD_SELFTESTS_RUN,
        DEVLINK_CMD_NOTIFY_FILTER_SET,
        __DEVLINK_CMD_MAX,
        DEVLINK_CMD_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_rel")
    @NotUsableInJava
    public static class devlink_rel
    extends Struct {
        public @Unsigned int index;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public @Unsigned int devlink_index;
        public misc.nested_in_of_devlink_rel nested_in;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dev_stats")
    @NotUsableInJava
    public static class devlink_dev_stats
    extends Struct {
        public @Unsigned int @Size(value=6) [] reload_stats;
        public @Unsigned int @Size(value=6) [] remote_reload_stats;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_ops")
    @NotUsableInJava
    public static class devlink_ops
    extends Struct {
        public @Unsigned int supported_flash_update_params;
        public @Unsigned long reload_actions;
        public @Unsigned long reload_limits;
        public Ptr<?> reload_down;
        public Ptr<?> reload_up;
        public Ptr<?> sb_pool_get;
        public Ptr<?> sb_pool_set;
        public Ptr<?> sb_port_pool_get;
        public Ptr<?> sb_port_pool_set;
        public Ptr<?> sb_tc_pool_bind_get;
        public Ptr<?> sb_tc_pool_bind_set;
        public Ptr<?> sb_occ_snapshot;
        public Ptr<?> sb_occ_max_clear;
        public Ptr<?> sb_occ_port_pool_get;
        public Ptr<?> sb_occ_tc_port_bind_get;
        public Ptr<?> eswitch_mode_get;
        public Ptr<?> eswitch_mode_set;
        public Ptr<?> eswitch_inline_mode_get;
        public Ptr<?> eswitch_inline_mode_set;
        public Ptr<?> eswitch_encap_mode_get;
        public Ptr<?> eswitch_encap_mode_set;
        public Ptr<?> info_get;
        public Ptr<?> flash_update;
        public Ptr<?> trap_init;
        public Ptr<?> trap_fini;
        public Ptr<?> trap_action_set;
        public Ptr<?> trap_group_init;
        public Ptr<?> trap_group_set;
        public Ptr<?> trap_group_action_set;
        public Ptr<?> trap_drop_counter_get;
        public Ptr<?> trap_policer_init;
        public Ptr<?> trap_policer_fini;
        public Ptr<?> trap_policer_set;
        public Ptr<?> trap_policer_counter_get;
        public Ptr<?> port_new;
        public Ptr<?> rate_leaf_tx_share_set;
        public Ptr<?> rate_leaf_tx_max_set;
        public Ptr<?> rate_leaf_tx_priority_set;
        public Ptr<?> rate_leaf_tx_weight_set;
        public Ptr<?> rate_node_tx_share_set;
        public Ptr<?> rate_node_tx_max_set;
        public Ptr<?> rate_node_tx_priority_set;
        public Ptr<?> rate_node_tx_weight_set;
        public Ptr<?> rate_node_new;
        public Ptr<?> rate_node_del;
        public Ptr<?> rate_leaf_parent_set;
        public Ptr<?> rate_node_parent_set;
        public Ptr<?> selftest_check;
        public Ptr<?> selftest_run;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_trap")
    @NotUsableInJava
    public static class devlink_trap
    extends Struct {
        public devlink_trap_type type;
        public devlink_trap_action init_action;
        public boolean generic;
        public @Unsigned short id;
        public String name;
        public @Unsigned short init_group_id;
        public @Unsigned int metadata_cap;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_trap_group")
    @NotUsableInJava
    public static class devlink_trap_group
    extends Struct {
        public String name;
        public @Unsigned short id;
        public boolean generic;
        public @Unsigned int init_policer_id;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_trap_policer")
    @NotUsableInJava
    public static class devlink_trap_policer
    extends Struct {
        public @Unsigned int id;
        public @Unsigned long init_rate;
        public @Unsigned long init_burst;
        public @Unsigned long max_rate;
        public @Unsigned long min_rate;
        public @Unsigned long max_burst;
        public @Unsigned long min_burst;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_trap_metadata")
    @NotUsableInJava
    public static class devlink_trap_metadata
    extends Struct {
        public String trap_name;
        public String trap_group_name;
        public Ptr<NetDefinitions.net_device> input_dev;
        public  @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public Ptr<FlowDefinitions.flow_action_cookie> fa_cookie;
        public devlink_trap_type trap_type;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_flash_update_params")
    @NotUsableInJava
    public static class devlink_flash_update_params
    extends Struct {
        public Ptr<runtime.firmware> fw;
        public String component;
        public @Unsigned int overwrite_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_headers")
    @NotUsableInJava
    public static class devlink_dpipe_headers
    extends Struct {
        public Ptr<Ptr<devlink_dpipe_header>> headers;
        public @Unsigned int headers_count;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_header")
    @NotUsableInJava
    public static class devlink_dpipe_header
    extends Struct {
        public String name;
        public @Unsigned int id;
        public Ptr<devlink_dpipe_field> fields;
        public @Unsigned int fields_count;
        public boolean global;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_dpipe_field")
    @NotUsableInJava
    public static class devlink_dpipe_field
    extends Struct {
        public String name;
        public @Unsigned int id;
        public @Unsigned int bitwidth;
        public devlink_dpipe_field_mapping_type mapping_type;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_sb_pool_info")
    @NotUsableInJava
    public static class devlink_sb_pool_info
    extends Struct {
        public devlink_sb_pool_type pool_type;
        public @Unsigned int size;
        public devlink_sb_threshold_type threshold_type;
        public @Unsigned int cell_size;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_port_new_attrs")
    @NotUsableInJava
    public static class devlink_port_new_attrs
    extends Struct {
        public devlink_port_flavour flavour;
        public @Unsigned int port_index;
        public @Unsigned int controller;
        public @Unsigned int sfnum;
        public @Unsigned short pfnum;
        public char port_index_valid;
        public char controller_valid;
        public char sfnum_valid;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_port_function_attr")
    public static enum devlink_port_function_attr implements Enum<devlink_port_function_attr>,
    TypedEnum<devlink_port_function_attr, Integer>
    {
        DEVLINK_PORT_FUNCTION_ATTR_UNSPEC,
        DEVLINK_PORT_FUNCTION_ATTR_HW_ADDR,
        DEVLINK_PORT_FN_ATTR_STATE,
        DEVLINK_PORT_FN_ATTR_OPSTATE,
        DEVLINK_PORT_FN_ATTR_CAPS,
        DEVLINK_PORT_FN_ATTR_DEVLINK,
        DEVLINK_PORT_FN_ATTR_MAX_IO_EQS,
        __DEVLINK_PORT_FUNCTION_ATTR_MAX,
        DEVLINK_PORT_FUNCTION_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_dpipe_field_mapping_type")
    public static enum devlink_dpipe_field_mapping_type implements Enum<devlink_dpipe_field_mapping_type>,
    TypedEnum<devlink_dpipe_field_mapping_type, Integer>
    {
        DEVLINK_DPIPE_FIELD_MAPPING_TYPE_NONE,
        DEVLINK_DPIPE_FIELD_MAPPING_TYPE_IFINDEX;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_reload_limit")
    public static enum devlink_reload_limit implements Enum<devlink_reload_limit>,
    TypedEnum<devlink_reload_limit, Integer>
    {
        DEVLINK_RELOAD_LIMIT_UNSPEC,
        DEVLINK_RELOAD_LIMIT_NO_RESET,
        __DEVLINK_RELOAD_LIMIT_MAX,
        DEVLINK_RELOAD_LIMIT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_reload_action")
    public static enum devlink_reload_action implements Enum<devlink_reload_action>,
    TypedEnum<devlink_reload_action, Integer>
    {
        DEVLINK_RELOAD_ACTION_UNSPEC,
        DEVLINK_RELOAD_ACTION_DRIVER_REINIT,
        DEVLINK_RELOAD_ACTION_FW_ACTIVATE,
        __DEVLINK_RELOAD_ACTION_MAX,
        DEVLINK_RELOAD_ACTION_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_trap_type")
    public static enum devlink_trap_type implements Enum<devlink_trap_type>,
    TypedEnum<devlink_trap_type, Integer>
    {
        DEVLINK_TRAP_TYPE_DROP,
        DEVLINK_TRAP_TYPE_EXCEPTION,
        DEVLINK_TRAP_TYPE_CONTROL;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_trap_action")
    public static enum devlink_trap_action implements Enum<devlink_trap_action>,
    TypedEnum<devlink_trap_action, Integer>
    {
        DEVLINK_TRAP_ACTION_DROP,
        DEVLINK_TRAP_ACTION_TRAP,
        DEVLINK_TRAP_ACTION_MIRROR;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_selftest_status")
    public static enum devlink_selftest_status implements Enum<devlink_selftest_status>,
    TypedEnum<devlink_selftest_status, Integer>
    {
        DEVLINK_SELFTEST_STATUS_SKIP,
        DEVLINK_SELFTEST_STATUS_PASS,
        DEVLINK_SELFTEST_STATUS_FAIL;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_attr_selftest_id")
    public static enum devlink_attr_selftest_id implements Enum<devlink_attr_selftest_id>,
    TypedEnum<devlink_attr_selftest_id, Integer>
    {
        DEVLINK_ATTR_SELFTEST_ID_UNSPEC,
        DEVLINK_ATTR_SELFTEST_ID_FLASH,
        __DEVLINK_ATTR_SELFTEST_ID_MAX,
        DEVLINK_ATTR_SELFTEST_ID_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_eswitch_encap_mode")
    public static enum devlink_eswitch_encap_mode implements Enum<devlink_eswitch_encap_mode>,
    TypedEnum<devlink_eswitch_encap_mode, Integer>
    {
        DEVLINK_ESWITCH_ENCAP_MODE_NONE,
        DEVLINK_ESWITCH_ENCAP_MODE_BASIC;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_sb_threshold_type")
    public static enum devlink_sb_threshold_type implements Enum<devlink_sb_threshold_type>,
    TypedEnum<devlink_sb_threshold_type, Integer>
    {
        DEVLINK_SB_THRESHOLD_TYPE_STATIC,
        DEVLINK_SB_THRESHOLD_TYPE_DYNAMIC;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_sb_pool_type")
    public static enum devlink_sb_pool_type implements Enum<devlink_sb_pool_type>,
    TypedEnum<devlink_sb_pool_type, Integer>
    {
        DEVLINK_SB_POOL_TYPE_INGRESS,
        DEVLINK_SB_POOL_TYPE_EGRESS;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_port_ops")
    @NotUsableInJava
    public static class devlink_port_ops
    extends Struct {
        public Ptr<?> port_split;
        public Ptr<?> port_unsplit;
        public Ptr<?> port_type_set;
        public Ptr<?> port_del;
        public Ptr<?> port_fn_hw_addr_get;
        public Ptr<?> port_fn_hw_addr_set;
        public Ptr<?> port_fn_roce_get;
        public Ptr<?> port_fn_roce_set;
        public Ptr<?> port_fn_migratable_get;
        public Ptr<?> port_fn_migratable_set;
        public Ptr<?> port_fn_state_get;
        public Ptr<?> port_fn_state_set;
        public Ptr<?> port_fn_ipsec_crypto_get;
        public Ptr<?> port_fn_ipsec_crypto_set;
        public Ptr<?> port_fn_ipsec_packet_get;
        public Ptr<?> port_fn_ipsec_packet_set;
        public Ptr<?> port_fn_max_io_eqs_get;
        public Ptr<?> port_fn_max_io_eqs_set;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_rate")
    @NotUsableInJava
    public static class devlink_rate
    extends Struct {
        public ListDefinitions.list_head list;
        public devlink_rate_type type;
        public Ptr<runtime.devlink> devlink;
        public Ptr<?> priv;
        public @Unsigned long tx_share;
        public @Unsigned long tx_max;
        public Ptr<devlink_rate> parent;
        @InlineUnion(value=23333)
        public @InlineUnion(value=23333) Ptr<devlink_port> devlink_port;
        @InlineUnion(value=23333)
        public  @InlineUnion(value=23333) AnonDefinitions.anon_member_of_anon_member_of_devlink_rate anon7$1;
        public @Unsigned int tx_priority;
        public @Unsigned int tx_weight;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_port_attrs")
    @NotUsableInJava
    public static class devlink_port_attrs
    extends Struct {
        public char split;
        public char splittable;
        public @Unsigned int lanes;
        public devlink_port_flavour flavour;
        public NetdevDefinitions.netdev_phys_item_id switch_id;
        @InlineUnion(value=23330)
        public @InlineUnion(value=23330) devlink_port_phys_attrs phys;
        @InlineUnion(value=23330)
        public @InlineUnion(value=23330) devlink_port_pci_pf_attrs pci_pf;
        @InlineUnion(value=23330)
        public @InlineUnion(value=23330) devlink_port_pci_vf_attrs pci_vf;
        @InlineUnion(value=23330)
        public @InlineUnion(value=23330) devlink_port_pci_sf_attrs pci_sf;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_port_pci_sf_attrs")
    @NotUsableInJava
    public static class devlink_port_pci_sf_attrs
    extends Struct {
        public @Unsigned int controller;
        public @Unsigned int sf;
        public @Unsigned short pf;
        public char external;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_port_pci_vf_attrs")
    @NotUsableInJava
    public static class devlink_port_pci_vf_attrs
    extends Struct {
        public @Unsigned int controller;
        public @Unsigned short pf;
        public @Unsigned short vf;
        public char external;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_port_pci_pf_attrs")
    @NotUsableInJava
    public static class devlink_port_pci_pf_attrs
    extends Struct {
        public @Unsigned int controller;
        public @Unsigned short pf;
        public char external;
    }

    @Type(noCCodeGeneration=true, cType="struct devlink_port_phys_attrs")
    @NotUsableInJava
    public static class devlink_port_phys_attrs
    extends Struct {
        public @Unsigned int port_number;
        public @Unsigned int split_subport_number;
    }

    @Type(noCCodeGeneration=true, cType="enum devlink_port_fn_opstate")
    public static enum devlink_port_fn_opstate implements Enum<devlink_port_fn_opstate>,
    TypedEnum<devlink_port_fn_opstate, Integer>
    {
        DEVLINK_PORT_FN_OPSTATE_DETACHED,
        DEVLINK_PORT_FN_OPSTATE_ATTACHED;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_port_fn_state")
    public static enum devlink_port_fn_state implements Enum<devlink_port_fn_state>,
    TypedEnum<devlink_port_fn_state, Integer>
    {
        DEVLINK_PORT_FN_STATE_INACTIVE,
        DEVLINK_PORT_FN_STATE_ACTIVE;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_rate_type")
    public static enum devlink_rate_type implements Enum<devlink_rate_type>,
    TypedEnum<devlink_rate_type, Integer>
    {
        DEVLINK_RATE_TYPE_LEAF,
        DEVLINK_RATE_TYPE_NODE;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_port_flavour")
    public static enum devlink_port_flavour implements Enum<devlink_port_flavour>,
    TypedEnum<devlink_port_flavour, Integer>
    {
        DEVLINK_PORT_FLAVOUR_PHYSICAL,
        DEVLINK_PORT_FLAVOUR_CPU,
        DEVLINK_PORT_FLAVOUR_DSA,
        DEVLINK_PORT_FLAVOUR_PCI_PF,
        DEVLINK_PORT_FLAVOUR_PCI_VF,
        DEVLINK_PORT_FLAVOUR_VIRTUAL,
        DEVLINK_PORT_FLAVOUR_UNUSED,
        DEVLINK_PORT_FLAVOUR_PCI_SF;

    }

    @Type(noCCodeGeneration=true, cType="enum devlink_port_type")
    public static enum devlink_port_type implements Enum<devlink_port_type>,
    TypedEnum<devlink_port_type, Integer>
    {
        DEVLINK_PORT_TYPE_NOTSET,
        DEVLINK_PORT_TYPE_AUTO,
        DEVLINK_PORT_TYPE_ETH,
        DEVLINK_PORT_TYPE_IB;

    }

    @Type(noCCodeGeneration=true, cType="struct devlink_port")
    @NotUsableInJava
    public static class devlink_port
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head region_list;
        public Ptr<runtime.devlink> devlink;
        public Ptr<devlink_port_ops> ops;
        public @Unsigned int index;
        public  @OriginalName(value="spinlock_t") runtime.spinlock type_lock;
        public devlink_port_type type;
        public devlink_port_type desired_type;
        @InlineUnion(value=23340)
        public  @InlineUnion(value=23340) TypeDefinitions.type_eth_of_anon_member_of_devlink_port type_eth;
        @InlineUnion(value=23340)
        public  @InlineUnion(value=23340) TypeDefinitions.type_ib_of_anon_member_of_devlink_port type_ib;
        public devlink_port_attrs attrs;
        public char attrs_set;
        public char switch_port;
        public char registered;
        public char initialized;
        public DelayedDefinitions.delayed_work type_warn_dw;
        public ListDefinitions.list_head reporter_list;
        public Ptr<devlink_rate> devlink_rate;
        public Ptr<devlink_linecard> linecard;
        public @Unsigned int rel_index;
    }
}

