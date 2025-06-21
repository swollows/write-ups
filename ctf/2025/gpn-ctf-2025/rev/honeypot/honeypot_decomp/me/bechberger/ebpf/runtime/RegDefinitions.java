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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RegDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)reg_type_str($arg1, $arg2))")
    public static String reg_type_str(Ptr<BpfDefinitions.bpf_verifier_env> env, BpfDefinitions.bpf_reg_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reg_event_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="reg_generate_netlink_event((const u8*)$arg1, $arg2)")
    public static int reg_generate_netlink_event(String reg_name, @Unsigned long event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="reg_vif_get_iflink((const struct net_device*)$arg1)")
    public static int reg_vif_get_iflink(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reg_vif_setup(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx reg_vif_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __reg_deduce_mixed_bounds(Ptr<BpfDefinitions.bpf_reg_state> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="reg_bounds_sanity_check($arg1, $arg2, (const u8*)$arg3)")
    public static int reg_bounds_sanity_check(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, String ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reg_bounds_sync(Ptr<BpfDefinitions.bpf_reg_state> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="reg_btf_record((const struct bpf_reg_state*)$arg1)")
    public static Ptr<BtfDefinitions.btf_record> reg_btf_record(Ptr<BpfDefinitions.bpf_reg_state> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reg_set_min_max(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> true_reg1, Ptr<BpfDefinitions.bpf_reg_state> true_reg2, Ptr<BpfDefinitions.bpf_reg_state> false_reg1, Ptr<BpfDefinitions.bpf_reg_state> false_reg2, char opcode, boolean is_jmp32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum reg_arg_type")
    public static enum reg_arg_type implements Enum<reg_arg_type>,
    TypedEnum<reg_arg_type, Integer>
    {
        SRC_OP,
        DST_OP,
        DST_OP_NO_MARK;

    }

    @Type(noCCodeGeneration=true, cType="enum reg_type")
    public static enum reg_type implements Enum<reg_type>,
    TypedEnum<reg_type, Integer>
    {
        REG_TYPE_RM,
        REG_TYPE_REG,
        REG_TYPE_INDEX,
        REG_TYPE_BASE;

    }

    @Type(noCCodeGeneration=true, cType="struct reg_field")
    @NotUsableInJava
    public static class reg_field
    extends Struct {
        public @Unsigned int reg;
        public @Unsigned int lsb;
        public @Unsigned int msb;
        public @Unsigned int id_size;
        public @Unsigned int id_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct reg_genl_event")
    @NotUsableInJava
    public static class reg_genl_event
    extends Struct {
        public char @Size(value=32) [] reg_name;
        public @Unsigned @OriginalName(value="uint64_t") long event;
    }

    @Type(noCCodeGeneration=true, cType="struct reg_sequence")
    @NotUsableInJava
    public static class reg_sequence
    extends Struct {
        public @Unsigned int reg;
        public @Unsigned int def;
        public @Unsigned int delay_us;
    }

    @Type(noCCodeGeneration=true, cType="struct reg_default")
    @NotUsableInJava
    public static class reg_default
    extends Struct {
        public @Unsigned int reg;
        public @Unsigned int def;
    }
}

