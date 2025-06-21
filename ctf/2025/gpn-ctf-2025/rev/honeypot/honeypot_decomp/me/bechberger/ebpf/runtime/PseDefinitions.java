/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EthnlDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PseDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pse_cleanup_data(Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pse_fill_reply($arg1, (const struct ethnl_req_info*)$arg2, (const struct ethnl_reply_data*)$arg3)")
    public static int pse_fill_reply(Ptr<SkDefinitions.sk_buff> skb, Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pse_prepare_data((const struct ethnl_req_info*)$arg1, $arg2, (const struct genl_info*)$arg3)")
    public static int pse_prepare_data(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pse_reply_size((const struct ethnl_req_info*)$arg1, (const struct ethnl_reply_data*)$arg2)")
    public static int pse_reply_size(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pse_control_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pse_control_put(Ptr<pse_control> psec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pse_controller_register(Ptr<pse_controller_dev> pcdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pse_controller_unregister(Ptr<pse_controller_dev> pcdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pse_ethtool_get_status(Ptr<pse_control> psec, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<pse_control_status> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pse_ethtool_set_config($arg1, $arg2, (const struct pse_control_config*)$arg3)")
    public static int pse_ethtool_set_config(Ptr<pse_control> psec, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<pse_control_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pse_ethtool_set_pw_limit($arg1, $arg2, (const unsigned int)$arg3)")
    public static int pse_ethtool_set_pw_limit(Ptr<pse_control> psec, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, @Unsigned int pw_limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pse_has_c33(Ptr<pse_control> psec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pse_has_podl(Ptr<pse_control> psec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pse_pi_disable(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pse_pi_enable(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pse_pi_get_current_limit(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pse_pi_get_voltage(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pse_pi_is_enabled(Ptr<RegulatorDefinitions.regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pse_pi_set_current_limit(Ptr<RegulatorDefinitions.regulator_dev> rdev, int min_uA, int max_uA) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pse_control")
    @NotUsableInJava
    public static class pse_control
    extends Struct {
        public Ptr<pse_controller_dev> pcdev;
        public Ptr<runtime.regulator> ps;
        public ListDefinitions.list_head list;
        public @Unsigned int id;
        public runtime.kref refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct pse_pi")
    @NotUsableInJava
    public static class pse_pi
    extends Struct {
        public pse_pi_pairset @Size(value=2) [] pairset;
        public Ptr<DeviceDefinitions.device_node> np;
        public Ptr<RegulatorDefinitions.regulator_dev> rdev;
        public boolean admin_state_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct pse_pi_pairset")
    @NotUsableInJava
    public static class pse_pi_pairset
    extends Struct {
        public pse_pi_pairset_pinout pinout;
        public Ptr<DeviceDefinitions.device_node> np;
    }

    @Type(noCCodeGeneration=true, cType="enum pse_pi_pairset_pinout")
    public static enum pse_pi_pairset_pinout implements Enum<pse_pi_pairset_pinout>,
    TypedEnum<pse_pi_pairset_pinout, Integer>
    {
        ALTERNATIVE_A,
        ALTERNATIVE_B;

    }

    @Type(noCCodeGeneration=true, cType="struct pse_controller_dev")
    @NotUsableInJava
    public static class pse_controller_dev
    extends Struct {
        public Ptr<pse_controller_ops> ops;
        public Ptr<runtime.module> owner;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head pse_control_head;
        public Ptr<runtime.device> dev;
        public int of_pse_n_cells;
        public @Unsigned int nr_lines;
        public runtime.mutex lock;
        public EthtoolDefinitions.ethtool_pse_types types;
        public Ptr<pse_pi> pi;
        public boolean no_of_pse_pi;
    }

    @Type(noCCodeGeneration=true, cType="struct pse_controller_ops")
    @NotUsableInJava
    public static class pse_controller_ops
    extends Struct {
        public Ptr<?> ethtool_get_status;
        public Ptr<?> setup_pi_matrix;
        public Ptr<?> pi_is_enabled;
        public Ptr<?> pi_enable;
        public Ptr<?> pi_disable;
        public Ptr<?> pi_get_voltage;
        public Ptr<?> pi_get_current_limit;
        public Ptr<?> pi_set_current_limit;
    }

    @Type(noCCodeGeneration=true, cType="struct pse_reply_data")
    @NotUsableInJava
    public static class pse_reply_data
    extends Struct {
        public EthnlDefinitions.ethnl_reply_data base;
        public pse_control_status status;
    }

    @Type(noCCodeGeneration=true, cType="struct pse_control_status")
    @NotUsableInJava
    public static class pse_control_status
    extends Struct {
        public EthtoolDefinitions.ethtool_podl_pse_admin_state podl_admin_state;
        public EthtoolDefinitions.ethtool_podl_pse_pw_d_status podl_pw_status;
        public EthtoolDefinitions.ethtool_c33_pse_admin_state c33_admin_state;
        public EthtoolDefinitions.ethtool_c33_pse_pw_d_status c33_pw_status;
        public @Unsigned int c33_pw_class;
        public @Unsigned int c33_actual_pw;
        public EthtoolDefinitions.ethtool_c33_pse_ext_state_info c33_ext_state_info;
        public @Unsigned int c33_avail_pw_limit;
        public Ptr<EthtoolDefinitions.ethtool_c33_pse_pw_limit_range> c33_pw_limit_ranges;
        public @Unsigned int c33_pw_limit_nb_ranges;
    }

    @Type(noCCodeGeneration=true, cType="struct pse_control_config")
    @NotUsableInJava
    public static class pse_control_config
    extends Struct {
        public EthtoolDefinitions.ethtool_podl_pse_admin_state podl_admin_control;
        public EthtoolDefinitions.ethtool_c33_pse_admin_state c33_admin_control;
    }
}

