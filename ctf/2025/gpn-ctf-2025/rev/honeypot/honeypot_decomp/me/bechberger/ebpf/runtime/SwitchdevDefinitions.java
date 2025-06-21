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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SwitchdevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__switchdev_handle_fdb_event_to_device($arg1, $arg2, $arg3, (const struct switchdev_notifier_fdb_info*)$arg4, (_Bool (*)(const struct net_device*))$arg5, (_Bool (*)(const struct net_device*, const struct net_device*))$arg6, (int (*)(struct net_device*, struct net_device*, long unsigned int, const void*, const struct switchdev_notifier_fdb_info*))$arg7)")
    public static int __switchdev_handle_fdb_event_to_device(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> orig_dev, @Unsigned long event2, Ptr<switchdev_notifier_fdb_info> fdb_info, Ptr<?> check_cb, Ptr<?> foreign_dev_check_cb, Ptr<?> mod_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__switchdev_handle_port_attr_set($arg1, $arg2, (_Bool (*)(const struct net_device*))$arg3, (int (*)(struct net_device*, const void*, const struct switchdev_attr*, struct netlink_ext_ack*))$arg4)")
    public static int __switchdev_handle_port_attr_set(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_notifier_port_attr_info> port_attr_info, Ptr<?> check_cb, Ptr<?> set_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__switchdev_handle_port_obj_add($arg1, $arg2, (_Bool (*)(const struct net_device*))$arg3, (_Bool (*)(const struct net_device*, const struct net_device*))$arg4, (int (*)(struct net_device*, const void*, const struct switchdev_obj*, struct netlink_ext_ack*))$arg5)")
    public static int __switchdev_handle_port_obj_add(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_notifier_port_obj_info> port_obj_info, Ptr<?> check_cb, Ptr<?> foreign_dev_check_cb, Ptr<?> add_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__switchdev_handle_port_obj_del($arg1, $arg2, (_Bool (*)(const struct net_device*))$arg3, (_Bool (*)(const struct net_device*, const struct net_device*))$arg4, (int (*)(struct net_device*, const void*, const struct switchdev_obj*))$arg5)")
    public static int __switchdev_handle_port_obj_del(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_notifier_port_obj_info> port_obj_info, Ptr<?> check_cb, Ptr<?> foreign_dev_check_cb, Ptr<?> del_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_bridge_port_offload($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int switchdev_bridge_port_offload(Ptr<NetDefinitions.net_device> brport_dev, Ptr<NetDefinitions.net_device> dev, Ptr<?> ctx, Ptr<misc.notifier_block> atomic_nb, Ptr<misc.notifier_block> blocking_nb, boolean tx_fwd_offload, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_bridge_port_replay($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static int switchdev_bridge_port_replay(Ptr<NetDefinitions.net_device> brport_dev, Ptr<NetDefinitions.net_device> dev, Ptr<?> ctx, Ptr<misc.notifier_block> atomic_nb, Ptr<misc.notifier_block> blocking_nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_bridge_port_unoffload($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static void switchdev_bridge_port_unoffload(Ptr<NetDefinitions.net_device> brport_dev, Ptr<?> ctx, Ptr<misc.notifier_block> atomic_nb, Ptr<misc.notifier_block> blocking_nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_deferred_enqueue($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int switchdev_deferred_enqueue(Ptr<NetDefinitions.net_device> dev, Ptr<?> data, @Unsigned long data_len, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switchdev_deferred_process() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switchdev_deferred_process_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_handle_fdb_event_to_device($arg1, $arg2, (const struct switchdev_notifier_fdb_info*)$arg3, (_Bool (*)(const struct net_device*))$arg4, (_Bool (*)(const struct net_device*, const struct net_device*))$arg5, (int (*)(struct net_device*, struct net_device*, long unsigned int, const void*, const struct switchdev_notifier_fdb_info*))$arg6)")
    public static int switchdev_handle_fdb_event_to_device(Ptr<NetDefinitions.net_device> dev, @Unsigned long event2, Ptr<switchdev_notifier_fdb_info> fdb_info, Ptr<?> check_cb, Ptr<?> foreign_dev_check_cb, Ptr<?> mod_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_handle_port_attr_set($arg1, $arg2, (_Bool (*)(const struct net_device*))$arg3, (int (*)(struct net_device*, const void*, const struct switchdev_attr*, struct netlink_ext_ack*))$arg4)")
    public static int switchdev_handle_port_attr_set(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_notifier_port_attr_info> port_attr_info, Ptr<?> check_cb, Ptr<?> set_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_handle_port_obj_add($arg1, $arg2, (_Bool (*)(const struct net_device*))$arg3, (int (*)(struct net_device*, const void*, const struct switchdev_obj*, struct netlink_ext_ack*))$arg4)")
    public static int switchdev_handle_port_obj_add(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_notifier_port_obj_info> port_obj_info, Ptr<?> check_cb, Ptr<?> add_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_handle_port_obj_add_foreign($arg1, $arg2, (_Bool (*)(const struct net_device*))$arg3, (_Bool (*)(const struct net_device*, const struct net_device*))$arg4, (int (*)(struct net_device*, const void*, const struct switchdev_obj*, struct netlink_ext_ack*))$arg5)")
    public static int switchdev_handle_port_obj_add_foreign(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_notifier_port_obj_info> port_obj_info, Ptr<?> check_cb, Ptr<?> foreign_dev_check_cb, Ptr<?> add_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_handle_port_obj_del($arg1, $arg2, (_Bool (*)(const struct net_device*))$arg3, (int (*)(struct net_device*, const void*, const struct switchdev_obj*))$arg4)")
    public static int switchdev_handle_port_obj_del(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_notifier_port_obj_info> port_obj_info, Ptr<?> check_cb, Ptr<?> del_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_handle_port_obj_del_foreign($arg1, $arg2, (_Bool (*)(const struct net_device*))$arg3, (_Bool (*)(const struct net_device*, const struct net_device*))$arg4, (int (*)(struct net_device*, const void*, const struct switchdev_obj*))$arg5)")
    public static int switchdev_handle_port_obj_del_foreign(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_notifier_port_obj_info> port_obj_info, Ptr<?> check_cb, Ptr<?> foreign_dev_check_cb, Ptr<?> del_cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int switchdev_lower_dev_walk(Ptr<NetDefinitions.net_device> lower_dev, Ptr<NetdevDefinitions.netdev_nested_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void switchdev_obj_id_to_helpful_msg(Ptr<NetDefinitions.net_device> dev, switchdev_obj_id obj_id, int err, boolean add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_port_attr_set($arg1, (const struct switchdev_attr*)$arg2, $arg3)")
    public static int switchdev_port_attr_set(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_attr> attr2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_port_attr_set_deferred($arg1, (const void*)$arg2)")
    public static void switchdev_port_attr_set_deferred(Ptr<NetDefinitions.net_device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_port_obj_act_is_deferred($arg1, $arg2, (const struct switchdev_obj*)$arg3)")
    public static boolean switchdev_port_obj_act_is_deferred(Ptr<NetDefinitions.net_device> dev, switchdev_notifier_type nt, Ptr<switchdev_obj> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_port_obj_add($arg1, (const struct switchdev_obj*)$arg2, $arg3)")
    public static int switchdev_port_obj_add(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_obj> obj, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_port_obj_add_deferred($arg1, (const void*)$arg2)")
    public static void switchdev_port_obj_add_deferred(Ptr<NetDefinitions.net_device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_port_obj_del($arg1, (const struct switchdev_obj*)$arg2)")
    public static int switchdev_port_obj_del(Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_obj> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_port_obj_del_deferred($arg1, (const void*)$arg2)")
    public static void switchdev_port_obj_del_deferred(Ptr<NetDefinitions.net_device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="switchdev_port_obj_notify($arg1, $arg2, (const struct switchdev_obj*)$arg3, $arg4)")
    public static int switchdev_port_obj_notify(switchdev_notifier_type nt, Ptr<NetDefinitions.net_device> dev, Ptr<switchdev_obj> obj, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_nested_priv")
    @NotUsableInJava
    public static class switchdev_nested_priv
    extends Struct {
        public Ptr<?> check_cb;
        public Ptr<?> foreign_dev_check_cb;
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<NetDefinitions.net_device> lower_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_deferred_item")
    @NotUsableInJava
    public static class switchdev_deferred_item
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public Ptr<?> func;
        public @Unsigned long @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_notifier_brport_info")
    @NotUsableInJava
    public static class switchdev_notifier_brport_info
    extends Struct {
        public switchdev_notifier_info info;
        public switchdev_brport brport;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_notifier_port_attr_info")
    @NotUsableInJava
    public static class switchdev_notifier_port_attr_info
    extends Struct {
        public switchdev_notifier_info info;
        public Ptr<switchdev_attr> attr;
        public boolean handled;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_notifier_port_obj_info")
    @NotUsableInJava
    public static class switchdev_notifier_port_obj_info
    extends Struct {
        public switchdev_notifier_info info;
        public Ptr<switchdev_obj> obj;
        public boolean handled;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_notifier_fdb_info")
    @NotUsableInJava
    public static class switchdev_notifier_fdb_info
    extends Struct {
        public switchdev_notifier_info info;
        public String addr;
        public @Unsigned short vid;
        public char added_by_user;
        public char is_local;
        public char locked;
        public char offloaded;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_notifier_info")
    @NotUsableInJava
    public static class switchdev_notifier_info
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<NetlinkDefinitions.netlink_ext_ack> extack;
        public Ptr<?> ctx;
    }

    @Type(noCCodeGeneration=true, cType="enum switchdev_notifier_type")
    public static enum switchdev_notifier_type implements Enum<switchdev_notifier_type>,
    TypedEnum<switchdev_notifier_type, Integer>
    {
        SWITCHDEV_FDB_ADD_TO_BRIDGE,
        SWITCHDEV_FDB_DEL_TO_BRIDGE,
        SWITCHDEV_FDB_ADD_TO_DEVICE,
        SWITCHDEV_FDB_DEL_TO_DEVICE,
        SWITCHDEV_FDB_OFFLOADED,
        SWITCHDEV_FDB_FLUSH_TO_BRIDGE,
        SWITCHDEV_PORT_OBJ_ADD,
        SWITCHDEV_PORT_OBJ_DEL,
        SWITCHDEV_PORT_ATTR_SET,
        SWITCHDEV_VXLAN_FDB_ADD_TO_BRIDGE,
        SWITCHDEV_VXLAN_FDB_DEL_TO_BRIDGE,
        SWITCHDEV_VXLAN_FDB_ADD_TO_DEVICE,
        SWITCHDEV_VXLAN_FDB_DEL_TO_DEVICE,
        SWITCHDEV_VXLAN_FDB_OFFLOADED,
        SWITCHDEV_BRPORT_OFFLOADED,
        SWITCHDEV_BRPORT_UNOFFLOADED,
        SWITCHDEV_BRPORT_REPLAY;

    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_brport")
    @NotUsableInJava
    public static class switchdev_brport
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<?> ctx;
        public Ptr<misc.notifier_block> atomic_nb;
        public Ptr<misc.notifier_block> blocking_nb;
        public boolean tx_fwd_offload;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_attr")
    @NotUsableInJava
    public static class switchdev_attr
    extends Struct {
        public Ptr<NetDefinitions.net_device> orig_dev;
        public switchdev_attr_id id;
        public @Unsigned int flags;
        public Ptr<?> complete_priv;
        public Ptr<?> complete;
        public UDefinitions.u_of_switchdev_attr u;
    }

    @Type(noCCodeGeneration=true, cType="enum switchdev_attr_id")
    public static enum switchdev_attr_id implements Enum<switchdev_attr_id>,
    TypedEnum<switchdev_attr_id, Integer>
    {
        SWITCHDEV_ATTR_ID_UNDEFINED,
        SWITCHDEV_ATTR_ID_PORT_STP_STATE,
        SWITCHDEV_ATTR_ID_PORT_MST_STATE,
        SWITCHDEV_ATTR_ID_PORT_BRIDGE_FLAGS,
        SWITCHDEV_ATTR_ID_PORT_PRE_BRIDGE_FLAGS,
        SWITCHDEV_ATTR_ID_PORT_MROUTER,
        SWITCHDEV_ATTR_ID_BRIDGE_AGEING_TIME,
        SWITCHDEV_ATTR_ID_BRIDGE_VLAN_FILTERING,
        SWITCHDEV_ATTR_ID_BRIDGE_VLAN_PROTOCOL,
        SWITCHDEV_ATTR_ID_BRIDGE_MC_DISABLED,
        SWITCHDEV_ATTR_ID_BRIDGE_MROUTER,
        SWITCHDEV_ATTR_ID_BRIDGE_MST,
        SWITCHDEV_ATTR_ID_MRP_PORT_ROLE,
        SWITCHDEV_ATTR_ID_VLAN_MSTI;

    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_obj_ring_role_mrp")
    @NotUsableInJava
    public static class switchdev_obj_ring_role_mrp
    extends Struct {
        public switchdev_obj obj;
        public char ring_role;
        public @Unsigned int ring_id;
        public char sw_backup;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_obj_mrp")
    @NotUsableInJava
    public static class switchdev_obj_mrp
    extends Struct {
        public switchdev_obj obj;
        public Ptr<NetDefinitions.net_device> p_port;
        public Ptr<NetDefinitions.net_device> s_port;
        public @Unsigned int ring_id;
        public @Unsigned short prio;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_obj_port_mdb")
    @NotUsableInJava
    public static class switchdev_obj_port_mdb
    extends Struct {
        public switchdev_obj obj;
        public char @Size(value=6) [] addr;
        public @Unsigned short vid;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_obj_port_vlan")
    @NotUsableInJava
    public static class switchdev_obj_port_vlan
    extends Struct {
        public switchdev_obj obj;
        public @Unsigned short flags;
        public @Unsigned short vid;
        public boolean changed;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_obj")
    @NotUsableInJava
    public static class switchdev_obj
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<NetDefinitions.net_device> orig_dev;
        public switchdev_obj_id id;
        public @Unsigned int flags;
        public Ptr<?> complete_priv;
        public Ptr<?> complete;
    }

    @Type(noCCodeGeneration=true, cType="enum switchdev_obj_id")
    public static enum switchdev_obj_id implements Enum<switchdev_obj_id>,
    TypedEnum<switchdev_obj_id, Integer>
    {
        SWITCHDEV_OBJ_ID_UNDEFINED,
        SWITCHDEV_OBJ_ID_PORT_VLAN,
        SWITCHDEV_OBJ_ID_PORT_MDB,
        SWITCHDEV_OBJ_ID_HOST_MDB,
        SWITCHDEV_OBJ_ID_MRP,
        SWITCHDEV_OBJ_ID_RING_TEST_MRP,
        SWITCHDEV_OBJ_ID_RING_ROLE_MRP,
        SWITCHDEV_OBJ_ID_RING_STATE_MRP,
        SWITCHDEV_OBJ_ID_IN_TEST_MRP,
        SWITCHDEV_OBJ_ID_IN_ROLE_MRP,
        SWITCHDEV_OBJ_ID_IN_STATE_MRP;

    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_vlan_msti")
    @NotUsableInJava
    public static class switchdev_vlan_msti
    extends Struct {
        public @Unsigned short vid;
        public @Unsigned short msti;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_brport_flags")
    @NotUsableInJava
    public static class switchdev_brport_flags
    extends Struct {
        public @Unsigned long val;
        public @Unsigned long mask;
    }

    @Type(noCCodeGeneration=true, cType="struct switchdev_mst_state")
    @NotUsableInJava
    public static class switchdev_mst_state
    extends Struct {
        public @Unsigned short msti;
        public char state;
    }
}

