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
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PfifoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pfifo_enqueue(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.Qdisc> sch, Ptr<Ptr<SkDefinitions.sk_buff>> to_free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pfifo_tail_enqueue(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.Qdisc> sch, Ptr<Ptr<SkDefinitions.sk_buff>> to_free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pfifo_fast_change_tx_queue_len(Ptr<runtime.Qdisc> sch, @Unsigned int new_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> pfifo_fast_dequeue(Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pfifo_fast_destroy(Ptr<runtime.Qdisc> sch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pfifo_fast_dump(Ptr<runtime.Qdisc> qdisc, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pfifo_fast_enqueue(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.Qdisc> qdisc, Ptr<Ptr<SkDefinitions.sk_buff>> to_free) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pfifo_fast_init(Ptr<runtime.Qdisc> qdisc, Ptr<runtime.nlattr> opt, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> pfifo_fast_peek(Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pfifo_fast_reset(Ptr<runtime.Qdisc> qdisc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pfifo_fast_priv")
    @NotUsableInJava
    public static class pfifo_fast_priv
    extends Struct {
        public SkbDefinitions.skb_array @Size(value=3) [] q;
    }
}

