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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ProtoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proto_down_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="proto_down_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long proto_down_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proto_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proto_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proto_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proto_register(Ptr<runtime.proto> prot, int alloc_slab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> proto_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proto_seq_printf(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.proto> proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int proto_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> proto_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proto_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void proto_unregister(Ptr<runtime.proto> prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long proto_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct proto_accept_arg")
    @NotUsableInJava
    public static class proto_accept_arg
    extends Struct {
        public int flags;
        public int err;
        public int is_empty;
        public boolean kern;
    }

    @Type(noCCodeGeneration=true, cType="struct proto_ops")
    @NotUsableInJava
    public static class proto_ops
    extends Struct {
        public int family;
        public Ptr<runtime.module> owner;
        public Ptr<?> release;
        public Ptr<?> bind;
        public Ptr<?> connect;
        public Ptr<?> socketpair;
        public Ptr<?> accept;
        public Ptr<?> getname;
        public Ptr<?> poll;
        public Ptr<?> ioctl;
        public Ptr<?> compat_ioctl;
        public Ptr<?> gettstamp;
        public Ptr<?> listen;
        public Ptr<?> shutdown;
        public Ptr<?> setsockopt;
        public Ptr<?> getsockopt;
        public Ptr<?> show_fdinfo;
        public Ptr<?> sendmsg;
        public Ptr<?> recvmsg;
        public Ptr<?> mmap;
        public Ptr<?> splice_read;
        public Ptr<?> splice_eof;
        public Ptr<?> set_peek_off;
        public Ptr<?> peek_len;
        public Ptr<?> read_sock;
        public Ptr<?> read_skb;
        public Ptr<?> sendmsg_locked;
        public Ptr<?> set_rcvlowat;
    }
}

