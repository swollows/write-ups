/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ReadDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class StrpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __strp_recv(Ptr<ReadDefinitions.read_descriptor_t> desc, Ptr<SkDefinitions.sk_buff> orig_skb, @Unsigned int orig_offset, @Unsigned long orig_len, @Unsigned long max_msg_size, long timeo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __strp_unpause(Ptr<runtime.strparser> strp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_abort_strp(Ptr<runtime.strparser> strp, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_check_rcv(Ptr<runtime.strparser> strp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_data_ready(Ptr<runtime.strparser> strp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int strp_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_done(Ptr<runtime.strparser> strp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="strp_init($arg1, $arg2, (const struct strp_callbacks*)$arg3)")
    public static int strp_init(Ptr<runtime.strparser> strp, Ptr<runtime.sock> sk, Ptr<strp_callbacks> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_msg_timeout(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int strp_process(Ptr<runtime.strparser> strp, Ptr<SkDefinitions.sk_buff> orig_skb, @Unsigned int orig_offset, @Unsigned long orig_len, @Unsigned long max_msg_size, long timeo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int strp_read_sock(Ptr<runtime.strparser> strp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int strp_recv(Ptr<ReadDefinitions.read_descriptor_t> desc, Ptr<SkDefinitions.sk_buff> orig_skb, @Unsigned int orig_offset, @Unsigned long orig_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_sock_lock(Ptr<runtime.strparser> strp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_sock_unlock(Ptr<runtime.strparser> strp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_stop(Ptr<runtime.strparser> strp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_unpause(Ptr<runtime.strparser> strp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void strp_work(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct _strp_msg")
    @NotUsableInJava
    public static class _strp_msg
    extends Struct {
        public strp_msg strp;
        public int accum_len;
    }

    @Type(noCCodeGeneration=true, cType="struct strp_msg")
    @NotUsableInJava
    public static class strp_msg
    extends Struct {
        public int full_len;
        public int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct strp_callbacks")
    @NotUsableInJava
    public static class strp_callbacks
    extends Struct {
        public Ptr<?> parse_msg;
        public Ptr<?> rcv_msg;
        public Ptr<?> read_sock_done;
        public Ptr<?> abort_parser;
        public Ptr<?> lock;
        public Ptr<?> unlock;
    }

    @Type(noCCodeGeneration=true, cType="struct strp_stats")
    @NotUsableInJava
    public static class strp_stats
    extends Struct {
        public @Unsigned long msgs;
        public @Unsigned long bytes;
        public @Unsigned int mem_fail;
        public @Unsigned int need_more_hdr;
        public @Unsigned int msg_too_big;
        public @Unsigned int msg_timeouts;
        public @Unsigned int bad_hdr_len;
    }
}

