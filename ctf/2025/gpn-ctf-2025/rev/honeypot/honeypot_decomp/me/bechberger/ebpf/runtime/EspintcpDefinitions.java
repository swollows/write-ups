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
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EspintcpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void espintcp_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void espintcp_data_ready(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void espintcp_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void espintcp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int espintcp_init_sk(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int espintcp_parse(Ptr<runtime.strparser> strp, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int espintcp_poll(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int espintcp_push_msgs(Ptr<runtime.sock> sk, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int espintcp_push_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int espintcp_queue_out(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void espintcp_rcv(Ptr<runtime.strparser> strp, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int espintcp_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void espintcp_release(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int espintcp_sendmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int espintcp_sendskmsg_locked(Ptr<runtime.sock> sk, Ptr<espintcp_msg> emsg, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void espintcp_tx_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void espintcp_write_space(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct espintcp_ctx")
    @NotUsableInJava
    public static class espintcp_ctx
    extends Struct {
        public runtime.strparser strp;
        public SkDefinitions.sk_buff_head ike_queue;
        public SkDefinitions.sk_buff_head out_queue;
        public espintcp_msg partial;
        public Ptr<?> saved_data_ready;
        public Ptr<?> saved_write_space;
        public Ptr<?> saved_destruct;
        public misc.work_struct work;
        public boolean tx_running;
    }

    @Type(noCCodeGeneration=true, cType="struct espintcp_msg")
    @NotUsableInJava
    public static class espintcp_msg
    extends Struct {
        public Ptr<SkDefinitions.sk_buff> skb;
        public SkDefinitions.sk_msg skmsg;
        public int offset;
        public int len;
    }
}

