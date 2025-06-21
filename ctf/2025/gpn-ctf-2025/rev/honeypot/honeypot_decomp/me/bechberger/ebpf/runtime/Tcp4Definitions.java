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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Tcp4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp4_proc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp4_proc_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp4_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp4_proc_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp4_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tcp4_check_fraglist_gro(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tcp4_gro_complete(Ptr<SkDefinitions.sk_buff> skb, int thoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp4_gro_receive(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tcp4_gso_segment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tcp4_ao_context")
    @NotUsableInJava
    public static class tcp4_ao_context
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int saddr;
        public @Unsigned @OriginalName(value="__be32") int daddr;
        public @Unsigned @OriginalName(value="__be16") short sport;
        public @Unsigned @OriginalName(value="__be16") short dport;
        public @Unsigned @OriginalName(value="__be32") int sisn;
        public @Unsigned @OriginalName(value="__be32") int disn;
    }

    @Type(noCCodeGeneration=true, cType="struct tcp4_pseudohdr")
    @NotUsableInJava
    public static class tcp4_pseudohdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int saddr;
        public @Unsigned @OriginalName(value="__be32") int daddr;
        public char pad;
        public char protocol;
        public @Unsigned @OriginalName(value="__be16") short len;
    }
}

