/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.Raw6Definitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class Rawv6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_bind(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rawv6_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rawv6_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_getsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_init_sk(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_ioctl(Ptr<runtime.sock> sk, int cmd, Ptr<Integer> karg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_mh_filter_register(Ptr<?> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_mh_filter_unregister(Ptr<?> filter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_push_pending_frames(Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6, Ptr<Raw6Definitions.raw6_sock> rp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_rcv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rawv6_send_hdrinc($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct sockcm_cookie*)$arg7)")
    public static int rawv6_send_hdrinc(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, int length, Ptr<runtime.flowi6> fl6, Ptr<Ptr<DstDefinitions.dst_entry>> dstp, @Unsigned int flags, Ptr<misc.sockcm_cookie> sockc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_sendmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rawv6_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }
}

