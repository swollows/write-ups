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
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Fib4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib4_notifier_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_notifier_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_rule_action(Ptr<FibDefinitions.fib_rule> rule, Ptr<runtime.flowi> flp, int flags, Ptr<FibDefinitions.fib_lookup_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_rule_compare(Ptr<FibDefinitions.fib_rule> rule, Ptr<FibDefinitions.fib_rule_hdr> frh, Ptr<Ptr<runtime.nlattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_rule_configure(Ptr<FibDefinitions.fib_rule> rule, Ptr<SkDefinitions.sk_buff> skb, Ptr<FibDefinitions.fib_rule_hdr> frh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fib4_rule_default((const struct fib_rule*)$arg1)")
    public static boolean fib4_rule_default(Ptr<FibDefinitions.fib_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_rule_delete(Ptr<FibDefinitions.fib_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_rule_fill(Ptr<FibDefinitions.fib_rule> rule, Ptr<SkDefinitions.sk_buff> skb, Ptr<FibDefinitions.fib_rule_hdr> frh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib4_rule_flush_cache(Ptr<FibDefinitions.fib_rules_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_rule_match(Ptr<FibDefinitions.fib_rule> rule, Ptr<runtime.flowi> fl, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long fib4_rule_nlmsg_payload(Ptr<FibDefinitions.fib_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fib4_rule_suppress(Ptr<FibDefinitions.fib_rule> rule, int flags, Ptr<FibDefinitions.fib_lookup_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_rules_dump(Ptr<runtime.net> net2, Ptr<misc.notifier_block> nb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fib4_rules_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fib4_rules_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fib4_rules_seq_read(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int fib4_seq_read(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fib4_rule")
    @NotUsableInJava
    public static class fib4_rule
    extends Struct {
        public FibDefinitions.fib_rule common;
        public char dst_len;
        public char src_len;
        public @OriginalName(value="dscp_t") char dscp;
        public char dscp_full;
        public @Unsigned @OriginalName(value="__be32") int src;
        public @Unsigned @OriginalName(value="__be32") int srcmask;
        public @Unsigned @OriginalName(value="__be32") int dst;
        public @Unsigned @OriginalName(value="__be32") int dstmask;
        public @Unsigned int tclassid;
    }
}

