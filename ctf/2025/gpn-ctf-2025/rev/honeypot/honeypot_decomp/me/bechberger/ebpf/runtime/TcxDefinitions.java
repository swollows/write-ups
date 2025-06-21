/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TcxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="tcx_link_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int tcx_link_attach(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcx_link_dealloc(Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcx_link_detach(Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcx_link_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void tcx_link_fdinfo(Ptr<BpfDefinitions.bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcx_link_fill_info((const struct bpf_link*)$arg1, $arg2)")
    public static int tcx_link_fill_info(Ptr<BpfDefinitions.bpf_link> link2, Ptr<BpfDefinitions.bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcx_link_prog_attach(Ptr<BpfDefinitions.bpf_link> link2, @Unsigned int flags, @Unsigned int id_or_fd, @Unsigned long revision) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcx_link_release(Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcx_link_update(Ptr<BpfDefinitions.bpf_link> link2, Ptr<BpfDefinitions.bpf_prog> nprog, Ptr<BpfDefinitions.bpf_prog> oprog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcx_prog_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int tcx_prog_attach(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcx_prog_detach((const union bpf_attr*)$arg1, $arg2)")
    public static int tcx_prog_detach(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tcx_prog_query((const union bpf_attr*)$arg1, $arg2)")
    public static int tcx_prog_query(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcx_uninstall(Ptr<NetDefinitions.net_device> dev, boolean ingress) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcx_dec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcx_inc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tcx_link")
    @NotUsableInJava
    public static class tcx_link
    extends Struct {
        public BpfDefinitions.bpf_link link;
        public Ptr<NetDefinitions.net_device> dev;
        public @Unsigned int location;
    }

    @Type(noCCodeGeneration=true, cType="struct tcx_entry")
    @NotUsableInJava
    public static class tcx_entry
    extends Struct {
        public Ptr<runtime.mini_Qdisc> miniq;
        public BpfDefinitions.bpf_mprog_bundle bundle;
        public @Unsigned int miniq_active;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum tcx_action_base")
    public static enum tcx_action_base implements Enum<tcx_action_base>,
    TypedEnum<tcx_action_base, Integer>
    {
        TCX_NEXT,
        TCX_PASS,
        TCX_DROP,
        TCX_REDIRECT;

    }
}

