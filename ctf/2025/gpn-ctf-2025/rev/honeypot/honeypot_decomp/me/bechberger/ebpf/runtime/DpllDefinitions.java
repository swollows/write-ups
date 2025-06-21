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
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DpllDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__dpll_pin_register($arg1, $arg2, (const struct dpll_pin_ops*)$arg3, $arg4, $arg5)")
    public static int __dpll_pin_register(Ptr<dpll_device> dpll, Ptr<dpll_pin> pin, Ptr<dpll_pin_ops> ops, Ptr<?> priv, Ptr<?> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dpll_pin_unregister($arg1, $arg2, (const struct dpll_pin_ops*)$arg3, $arg4, $arg5)")
    public static void __dpll_pin_unregister(Ptr<dpll_device> dpll, Ptr<dpll_pin> pin, Ptr<dpll_pin_ops> ops, Ptr<?> priv, Ptr<?> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dpll_device> dpll_device_get(@Unsigned long clock_id, @Unsigned int device_idx, Ptr<runtime.module> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dpll_device> dpll_device_get_by_id(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpll_device_put(Ptr<dpll_device> dpll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_device_register($arg1, $arg2, (const struct dpll_device_ops*)$arg3, $arg4)")
    public static int dpll_device_register(Ptr<dpll_device> dpll, dpll_type type2, Ptr<dpll_device_ops> ops, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_device_unregister($arg1, (const struct dpll_device_ops*)$arg2, $arg3)")
    public static void dpll_device_unregister(Ptr<dpll_device> dpll, Ptr<dpll_device_ops> ops, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpll_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpll_netdev_pin_clear(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpll_netdev_pin_set(Ptr<NetDefinitions.net_device> dev, Ptr<dpll_pin> dpll_pin2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_pin_get($arg1, $arg2, $arg3, (const struct dpll_pin_properties*)$arg4)")
    public static Ptr<dpll_pin> dpll_pin_get(@Unsigned long clock_id, @Unsigned int pin_idx, Ptr<runtime.module> module2, Ptr<dpll_pin_properties> prop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dpll_pin_on_dpll_priv(Ptr<dpll_device> dpll, Ptr<dpll_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dpll_pin_on_pin_priv(Ptr<dpll_pin> parent, Ptr<dpll_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_pin_on_pin_register($arg1, $arg2, (const struct dpll_pin_ops*)$arg3, $arg4)")
    public static int dpll_pin_on_pin_register(Ptr<dpll_pin> parent, Ptr<dpll_pin> pin, Ptr<dpll_pin_ops> ops, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_pin_on_pin_unregister($arg1, $arg2, (const struct dpll_pin_ops*)$arg3, $arg4)")
    public static void dpll_pin_on_pin_unregister(Ptr<dpll_pin> parent, Ptr<dpll_pin> pin, Ptr<dpll_pin_ops> ops, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_pin_prop_dup((const struct dpll_pin_properties*)$arg1, $arg2)")
    public static int dpll_pin_prop_dup(Ptr<dpll_pin_properties> src, Ptr<dpll_pin_properties> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpll_pin_put(Ptr<dpll_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_pin_register($arg1, $arg2, (const struct dpll_pin_ops*)$arg3, $arg4)")
    public static int dpll_pin_register(Ptr<dpll_device> dpll, Ptr<dpll_pin> pin, Ptr<dpll_pin_ops> ops, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_pin_unregister($arg1, $arg2, (const struct dpll_pin_ops*)$arg3, $arg4)")
    public static void dpll_pin_unregister(Ptr<dpll_device> dpll, Ptr<dpll_pin> pin, Ptr<dpll_pin_ops> ops, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dpll_priv(Ptr<dpll_device> dpll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_xa_ref_dpll_add($arg1, $arg2, (const struct dpll_pin_ops*)$arg3, $arg4, $arg5)")
    public static int dpll_xa_ref_dpll_add(Ptr<runtime.xarray> xa_dplls, Ptr<dpll_device> dpll, Ptr<dpll_pin_ops> ops, Ptr<?> priv, Ptr<?> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dpll_pin_ref> dpll_xa_ref_dpll_first(Ptr<runtime.xarray> xa_refs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_xa_ref_pin_add($arg1, $arg2, (const struct dpll_pin_ops*)$arg3, $arg4, $arg5)")
    public static int dpll_xa_ref_pin_add(Ptr<runtime.xarray> xa_pins, Ptr<dpll_pin> pin, Ptr<dpll_pin_ops> ops, Ptr<?> priv, Ptr<?> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_xa_ref_pin_del($arg1, $arg2, (const struct dpll_pin_ops*)$arg3, $arg4, $arg5)")
    public static int dpll_xa_ref_pin_del(Ptr<runtime.xarray> xa_pins, Ptr<dpll_pin> pin, Ptr<dpll_pin_ops> ops, Ptr<?> priv, Ptr<?> cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_cmd_pin_get_one(Ptr<SkDefinitions.sk_buff> msg, Ptr<dpll_pin> pin, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_device_change_ntf(Ptr<dpll_device> dpll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_device_create_ntf(Ptr<dpll_device> dpll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_device_delete_ntf(Ptr<dpll_device> dpll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_device_event_send(dpll_cmd event2, Ptr<dpll_device> dpll) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dpll_device> dpll_device_find_from_nlattr(Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_device_get_one(Ptr<dpll_device> dpll, Ptr<SkDefinitions.sk_buff> msg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_lock_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static int dpll_lock_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_msg_add_pin_dplls(Ptr<SkDefinitions.sk_buff> msg, Ptr<dpll_pin> pin, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_msg_add_pin_esync(Ptr<SkDefinitions.sk_buff> msg, Ptr<dpll_pin> pin, Ptr<dpll_pin_ref> ref, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_msg_add_pin_freq(Ptr<SkDefinitions.sk_buff> msg, Ptr<dpll_pin> pin, Ptr<dpll_pin_ref> ref, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_msg_add_pin_parents(Ptr<SkDefinitions.sk_buff> msg, Ptr<dpll_pin> pin, Ptr<dpll_pin_ref> dpll_ref, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_netdev_add_pin_handle($arg1, (const struct net_device*)$arg2)")
    public static int dpll_netdev_add_pin_handle(Ptr<SkDefinitions.sk_buff> msg, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_netdev_pin_handle_size((const struct net_device*)$arg1)")
    public static @Unsigned long dpll_netdev_pin_handle_size(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_nl_device_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_nl_device_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_nl_device_id_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_nl_device_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_nl_pin_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_nl_pin_get_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_nl_pin_id_get_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_nl_pin_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dpll_pin_available(Ptr<dpll_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_pin_change_ntf(Ptr<dpll_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_pin_create_ntf(Ptr<dpll_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_pin_delete_ntf(Ptr<dpll_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_pin_esync_set(Ptr<dpll_pin> pin, Ptr<runtime.nlattr> a, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_pin_event_send(dpll_cmd event2, Ptr<dpll_pin> pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dpll_pin> dpll_pin_find(@Unsigned long clock_id, Ptr<runtime.nlattr> mod_name_attr, dpll_pin_type type2, Ptr<runtime.nlattr> board_label, Ptr<runtime.nlattr> panel_label, Ptr<runtime.nlattr> package_label, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dpll_pin> dpll_pin_find_from_nlattr(Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_pin_freq_set(Ptr<dpll_pin> pin, Ptr<runtime.nlattr> a, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_pin_parent_device_set(Ptr<dpll_pin> pin, Ptr<runtime.nlattr> parent_nest, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_pin_parent_pin_set(Ptr<dpll_pin> pin, Ptr<runtime.nlattr> parent_nest, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpll_pin_phase_adj_set(Ptr<dpll_pin> pin, Ptr<runtime.nlattr> phase_adj_attr, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_pin_post_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static void dpll_pin_post_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_pin_pre_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static int dpll_pin_pre_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_post_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static void dpll_post_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_pre_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static int dpll_pre_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpll_unlock_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static void dpll_unlock_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_pin_registration")
    @NotUsableInJava
    public static class dpll_pin_registration
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<dpll_pin_ops> ops;
        public Ptr<?> priv;
        public Ptr<?> cookie;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_device_registration")
    @NotUsableInJava
    public static class dpll_device_registration
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<dpll_device_ops> ops;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_dump_ctx")
    @NotUsableInJava
    public static class dpll_dump_ctx
    extends Struct {
        public @Unsigned long idx;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_pin_ref")
    @NotUsableInJava
    public static class dpll_pin_ref
    extends Struct {
        @InlineUnion(value=23105)
        public @InlineUnion(value=23105) Ptr<dpll_device> dpll;
        @InlineUnion(value=23105)
        public @InlineUnion(value=23105) Ptr<dpll_pin> pin;
        public ListDefinitions.list_head registration_list;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcount;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_pin_properties")
    @NotUsableInJava
    public static class dpll_pin_properties
    extends Struct {
        public String board_label;
        public String panel_label;
        public String package_label;
        public dpll_pin_type type;
        public @Unsigned long capabilities;
        public @Unsigned int freq_supported_num;
        public Ptr<dpll_pin_frequency> freq_supported;
        public dpll_pin_phase_adjust_range phase_range;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_pin_phase_adjust_range")
    @NotUsableInJava
    public static class dpll_pin_phase_adjust_range
    extends Struct {
        public int min;
        public int max;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_pin_frequency")
    @NotUsableInJava
    public static class dpll_pin_frequency
    extends Struct {
        public @Unsigned long min;
        public @Unsigned long max;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_pin_esync")
    @NotUsableInJava
    public static class dpll_pin_esync
    extends Struct {
        public @Unsigned long freq;
        public Ptr<dpll_pin_frequency> range;
        public char range_num;
        public char pulse;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_pin_ops")
    @NotUsableInJava
    public static class dpll_pin_ops
    extends Struct {
        public Ptr<?> frequency_set;
        public Ptr<?> frequency_get;
        public Ptr<?> direction_set;
        public Ptr<?> direction_get;
        public Ptr<?> state_on_pin_get;
        public Ptr<?> state_on_dpll_get;
        public Ptr<?> state_on_pin_set;
        public Ptr<?> state_on_dpll_set;
        public Ptr<?> prio_get;
        public Ptr<?> prio_set;
        public Ptr<?> phase_offset_get;
        public Ptr<?> phase_adjust_get;
        public Ptr<?> phase_adjust_set;
        public Ptr<?> ffo_get;
        public Ptr<?> esync_set;
        public Ptr<?> esync_get;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_device")
    @NotUsableInJava
    public static class dpll_device
    extends Struct {
        public @Unsigned int id;
        public @Unsigned int device_idx;
        public @Unsigned long clock_id;
        public Ptr<runtime.module> module;
        public dpll_type type;
        public runtime.xarray pin_refs;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public ListDefinitions.list_head registration_list;
    }

    @Type(noCCodeGeneration=true, cType="struct dpll_device_ops")
    @NotUsableInJava
    public static class dpll_device_ops
    extends Struct {
        public Ptr<?> mode_get;
        public Ptr<?> lock_status_get;
        public Ptr<?> temp_get;
    }

    @Type(noCCodeGeneration=true, cType="enum dpll_cmd")
    public static enum dpll_cmd implements Enum<dpll_cmd>,
    TypedEnum<dpll_cmd, Integer>
    {
        DPLL_CMD_DEVICE_ID_GET,
        DPLL_CMD_DEVICE_GET,
        DPLL_CMD_DEVICE_SET,
        DPLL_CMD_DEVICE_CREATE_NTF,
        DPLL_CMD_DEVICE_DELETE_NTF,
        DPLL_CMD_DEVICE_CHANGE_NTF,
        DPLL_CMD_PIN_ID_GET,
        DPLL_CMD_PIN_GET,
        DPLL_CMD_PIN_SET,
        DPLL_CMD_PIN_CREATE_NTF,
        DPLL_CMD_PIN_DELETE_NTF,
        DPLL_CMD_PIN_CHANGE_NTF,
        __DPLL_CMD_MAX,
        DPLL_CMD_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_a_pin")
    public static enum dpll_a_pin implements Enum<dpll_a_pin>,
    TypedEnum<dpll_a_pin, Integer>
    {
        DPLL_A_PIN_ID,
        DPLL_A_PIN_PARENT_ID,
        DPLL_A_PIN_MODULE_NAME,
        DPLL_A_PIN_PAD,
        DPLL_A_PIN_CLOCK_ID,
        DPLL_A_PIN_BOARD_LABEL,
        DPLL_A_PIN_PANEL_LABEL,
        DPLL_A_PIN_PACKAGE_LABEL,
        DPLL_A_PIN_TYPE,
        DPLL_A_PIN_DIRECTION,
        DPLL_A_PIN_FREQUENCY,
        DPLL_A_PIN_FREQUENCY_SUPPORTED,
        DPLL_A_PIN_FREQUENCY_MIN,
        DPLL_A_PIN_FREQUENCY_MAX,
        DPLL_A_PIN_PRIO,
        DPLL_A_PIN_STATE,
        DPLL_A_PIN_CAPABILITIES,
        DPLL_A_PIN_PARENT_DEVICE,
        DPLL_A_PIN_PARENT_PIN,
        DPLL_A_PIN_PHASE_ADJUST_MIN,
        DPLL_A_PIN_PHASE_ADJUST_MAX,
        DPLL_A_PIN_PHASE_ADJUST,
        DPLL_A_PIN_PHASE_OFFSET,
        DPLL_A_PIN_FRACTIONAL_FREQUENCY_OFFSET,
        DPLL_A_PIN_ESYNC_FREQUENCY,
        DPLL_A_PIN_ESYNC_FREQUENCY_SUPPORTED,
        DPLL_A_PIN_ESYNC_PULSE,
        __DPLL_A_PIN_MAX,
        DPLL_A_PIN_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_a")
    public static enum dpll_a implements Enum<dpll_a>,
    TypedEnum<dpll_a, Integer>
    {
        DPLL_A_ID,
        DPLL_A_MODULE_NAME,
        DPLL_A_PAD,
        DPLL_A_CLOCK_ID,
        DPLL_A_MODE,
        DPLL_A_MODE_SUPPORTED,
        DPLL_A_LOCK_STATUS,
        DPLL_A_TEMP,
        DPLL_A_TYPE,
        DPLL_A_LOCK_STATUS_ERROR,
        __DPLL_A_MAX,
        DPLL_A_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_pin_capabilities")
    public static enum dpll_pin_capabilities implements Enum<dpll_pin_capabilities>,
    TypedEnum<dpll_pin_capabilities, Integer>
    {
        DPLL_PIN_CAPABILITIES_DIRECTION_CAN_CHANGE,
        DPLL_PIN_CAPABILITIES_PRIORITY_CAN_CHANGE,
        DPLL_PIN_CAPABILITIES_STATE_CAN_CHANGE;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_pin_state")
    public static enum dpll_pin_state implements Enum<dpll_pin_state>,
    TypedEnum<dpll_pin_state, Integer>
    {
        DPLL_PIN_STATE_CONNECTED,
        DPLL_PIN_STATE_DISCONNECTED,
        DPLL_PIN_STATE_SELECTABLE,
        __DPLL_PIN_STATE_MAX,
        DPLL_PIN_STATE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_pin_direction")
    public static enum dpll_pin_direction implements Enum<dpll_pin_direction>,
    TypedEnum<dpll_pin_direction, Integer>
    {
        DPLL_PIN_DIRECTION_INPUT,
        DPLL_PIN_DIRECTION_OUTPUT,
        __DPLL_PIN_DIRECTION_MAX,
        DPLL_PIN_DIRECTION_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_pin_type")
    public static enum dpll_pin_type implements Enum<dpll_pin_type>,
    TypedEnum<dpll_pin_type, Integer>
    {
        DPLL_PIN_TYPE_MUX,
        DPLL_PIN_TYPE_EXT,
        DPLL_PIN_TYPE_SYNCE_ETH_PORT,
        DPLL_PIN_TYPE_INT_OSCILLATOR,
        DPLL_PIN_TYPE_GNSS,
        __DPLL_PIN_TYPE_MAX,
        DPLL_PIN_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_type")
    public static enum dpll_type implements Enum<dpll_type>,
    TypedEnum<dpll_type, Integer>
    {
        DPLL_TYPE_PPS,
        DPLL_TYPE_EEC,
        __DPLL_TYPE_MAX,
        DPLL_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_lock_status_error")
    public static enum dpll_lock_status_error implements Enum<dpll_lock_status_error>,
    TypedEnum<dpll_lock_status_error, Integer>
    {
        DPLL_LOCK_STATUS_ERROR_NONE,
        DPLL_LOCK_STATUS_ERROR_UNDEFINED,
        DPLL_LOCK_STATUS_ERROR_MEDIA_DOWN,
        DPLL_LOCK_STATUS_ERROR_FRACTIONAL_FREQUENCY_OFFSET_TOO_HIGH,
        __DPLL_LOCK_STATUS_ERROR_MAX,
        DPLL_LOCK_STATUS_ERROR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_lock_status")
    public static enum dpll_lock_status implements Enum<dpll_lock_status>,
    TypedEnum<dpll_lock_status, Integer>
    {
        DPLL_LOCK_STATUS_UNLOCKED,
        DPLL_LOCK_STATUS_LOCKED,
        DPLL_LOCK_STATUS_LOCKED_HO_ACQ,
        DPLL_LOCK_STATUS_HOLDOVER,
        __DPLL_LOCK_STATUS_MAX,
        DPLL_LOCK_STATUS_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum dpll_mode")
    public static enum dpll_mode implements Enum<dpll_mode>,
    TypedEnum<dpll_mode, Integer>
    {
        DPLL_MODE_MANUAL,
        DPLL_MODE_AUTOMATIC,
        __DPLL_MODE_MAX,
        DPLL_MODE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct dpll_pin")
    @NotUsableInJava
    public static class dpll_pin
    extends Struct {
        public @Unsigned int id;
        public @Unsigned int pin_idx;
        public @Unsigned long clock_id;
        public Ptr<runtime.module> module;
        public runtime.xarray dpll_refs;
        public runtime.xarray parent_refs;
        public dpll_pin_properties prop;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public misc.callback_head rcu;
    }
}

