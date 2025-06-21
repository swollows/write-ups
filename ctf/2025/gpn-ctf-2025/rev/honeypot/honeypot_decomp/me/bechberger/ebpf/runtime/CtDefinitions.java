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
import me.bechberger.ebpf.runtime.CtxDefinitions;
import me.bechberger.ebpf.runtime.DlDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CtDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ct_user_enter(CtxDefinitions.ctx_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ct_user_exit(CtxDefinitions.ctx_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_cpu_track_user(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_idle_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_idle_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_irq_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_irq_enter_irqson() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_irq_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_irq_exit_irqson() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_kernel_enter_state(int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_kernel_exit_state(int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_nmi_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_nmi_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_user_enter(CtxDefinitions.ctx_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ct_user_exit(CtxDefinitions.ctx_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ct_data_s")
    @NotUsableInJava
    public static class ct_data_s
    extends Struct {
        public misc.fc_of_ct_data_and_fc_of_ct_data_s fc;
        public DlDefinitions.dl_of_ct_data_and_dl_of_ct_data_s dl;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int cookie; unsigned int mark; unsigned int labels[4]; _Bool orig_dir; }")
    @NotUsableInJava
    public static class ct_metadata_of_anon_member_of_flow_action_entry
    extends Struct {
        public @Unsigned long cookie;
        public @Unsigned int mark;
        public @Unsigned int @Size(value=4) [] labels;
        public boolean orig_dir;
    }

    @Type(noCCodeGeneration=true, cType="struct { int action; short unsigned int zone; nf_flowtable *flow_table; }")
    @NotUsableInJava
    public static class ct_of_anon_member_of_flow_action_entry
    extends Struct {
        public int action;
        public @Unsigned short zone;
        public @OriginalName(value="nf_flowtable") Ptr<?> flow_table;
    }

    @Type(noCCodeGeneration=true, cType="enum ct_dccp_states")
    public static enum ct_dccp_states implements Enum<ct_dccp_states>,
    TypedEnum<ct_dccp_states, Integer>
    {
        CT_DCCP_NONE,
        CT_DCCP_REQUEST,
        CT_DCCP_RESPOND,
        CT_DCCP_PARTOPEN,
        CT_DCCP_OPEN,
        CT_DCCP_CLOSEREQ,
        CT_DCCP_CLOSING,
        CT_DCCP_TIMEWAIT,
        CT_DCCP_IGNORE,
        CT_DCCP_INVALID,
        __CT_DCCP_MAX;

    }
}

