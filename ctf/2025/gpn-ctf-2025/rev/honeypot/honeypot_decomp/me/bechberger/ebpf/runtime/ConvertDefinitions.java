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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.McDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ConvertDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void convert_skb_to___skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.__sk_buff> __skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int convert_log(Ptr<McDefinitions.mc_info> mi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int convert_ctx_accesses(Ptr<BpfDefinitions.bpf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int convert_from_xrgb8888(@Unsigned int color, @Unsigned int format) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long convert_ip_to_linear(Ptr<TaskDefinitions.task_struct> child, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __convert_from_fxsr(Ptr<UserDefinitions.user_i387_ia32_struct> env, Ptr<TaskDefinitions.task_struct> tsk, Ptr<misc.fxregs_state> fxsave) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean convert_bpf_extensions(Ptr<SockDefinitions.sock_filter> fp, Ptr<Ptr<BpfDefinitions.bpf_insn>> insnp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean convert_bpf_ld_abs(Ptr<SockDefinitions.sock_filter> fp, Ptr<Ptr<BpfDefinitions.bpf_insn>> insnp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void convert_from_fxsr(Ptr<UserDefinitions.user_i387_ia32_struct> env, Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ext4Definitions.ext4_ext_path> convert_initialized_extent(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<Ext4Definitions.ext4_map_blocks> map2, Ptr<Ext4Definitions.ext4_ext_path> path2, Ptr<@Unsigned Integer> allocated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="convert_legacy_settings_to_link_ksettings($arg1, (const struct ethtool_cmd*)$arg2)")
    public static boolean convert_legacy_settings_to_link_ksettings(Ptr<EthtoolDefinitions.ethtool_link_ksettings> link_ksettings, Ptr<EthtoolDefinitions.ethtool_cmd> legacy_settings) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void convert_pfn_mfn(Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="convert_to_fxsr($arg1, (const struct user_i387_ia32_struct*)$arg2)")
    public static void convert_to_fxsr(Ptr<misc.fxregs_state> fxsave, Ptr<UserDefinitions.user_i387_ia32_struct> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct convert_context_args")
    @NotUsableInJava
    public static class convert_context_args
    extends Struct {
        public Ptr<runtime.policydb> oldp;
        public Ptr<runtime.policydb> newp;
    }
}

