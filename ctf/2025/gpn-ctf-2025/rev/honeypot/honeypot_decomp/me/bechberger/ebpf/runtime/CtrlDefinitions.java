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
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CtrlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ctrl_alt_del() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ctrl_build_family_msg((const struct genl_family*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<SkDefinitions.sk_buff> ctrl_build_family_msg(Ptr<GenlDefinitions.genl_family> family, @Unsigned int portid, int seq, char cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ctrl_dumpfamily(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ctrl_dumppolicy(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ctrl_dumppolicy_done(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ctrl_dumppolicy_prep(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ctrl_dumppolicy_put_op(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<GenlDefinitions.genl_split_ops> doit, Ptr<GenlDefinitions.genl_split_ops> dumpit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ctrl_dumppolicy_start(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ctrl_fill_info((const struct genl_family*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int ctrl_fill_info(Ptr<GenlDefinitions.genl_family> family, @Unsigned int portid, @Unsigned int seq, @Unsigned int flags, Ptr<SkDefinitions.sk_buff> skb, char cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ctrl_getfamily(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ctrl_dump_policy_ctx")
    @NotUsableInJava
    public static class ctrl_dump_policy_ctx
    extends Struct {
        public Ptr<NetlinkDefinitions.netlink_policy_dump_state> state;
        public Ptr<GenlDefinitions.genl_family> rt;
        public Ptr<GenlDefinitions.genl_op_iter> op_iter;
        public @Unsigned int op;
        public @Unsigned short fam_id;
        public char dump_map;
        public char single_op;
    }

    @Type(noCCodeGeneration=true, cType="enum ctrl_register")
    public static enum ctrl_register implements Enum<ctrl_register>,
    TypedEnum<ctrl_register, Integer>
    {
        CTRL_IN,
        CTRL_OUT;

    }

    @Type(noCCodeGeneration=true, cType="struct ctrl_pos")
    @NotUsableInJava
    public static class ctrl_pos
    extends Struct {
        public @Unsigned long refaulted;
        public @Unsigned long total;
        public int gain;
    }

    @Type(noCCodeGeneration=true, cType="enum ctrl_offsets")
    public static enum ctrl_offsets implements Enum<ctrl_offsets>,
    TypedEnum<ctrl_offsets, Integer>
    {
        BASE_OFFSET,
        SLOT_AVAIL1,
        SLOT_AVAIL2,
        SLOT_CONFIG,
        SEC_BUS_CONFIG,
        MSI_CTRL,
        PROG_INTERFACE,
        CMD,
        CMD_STATUS,
        INTR_LOC,
        SERR_LOC,
        SERR_INTR_ENABLE,
        SLOT1;

    }

    @Type(noCCodeGeneration=true, cType="struct { struct pid *pgrp; struct pid *session; spinlock lock; u8 pktstatus; _Bool packet; }")
    @NotUsableInJava
    public static class ctrl_of_tty_struct
    extends Struct {
        public Ptr<runtime.pid> pgrp;
        public Ptr<runtime.pid> session;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public char pktstatus;
        public boolean packet;
    }
}

