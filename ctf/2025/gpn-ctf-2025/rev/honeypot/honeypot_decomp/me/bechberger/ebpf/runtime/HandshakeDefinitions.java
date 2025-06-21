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
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HandshakeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handshake_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="handshake_genl_notify($arg1, (const struct handshake_proto*)$arg2, $arg3)")
    public static int handshake_genl_notify(Ptr<runtime.net> net2, Ptr<handshake_proto> proto2, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nlmsghdr> handshake_genl_put(Ptr<SkDefinitions.sk_buff> msg, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handshake_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handshake_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handshake_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handshake_nl_accept_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handshake_nl_done_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<handshake_net> handshake_pernet(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handshake_complete(Ptr<handshake_req> req2, @Unsigned int status, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="handshake_req_alloc((const struct handshake_proto*)$arg1, $arg2)")
    public static Ptr<handshake_req> handshake_req_alloc(Ptr<handshake_proto> proto2, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean handshake_req_cancel(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handshake_req_destroy(Ptr<handshake_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handshake_req_hash_destroy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handshake_req_hash_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<handshake_req> handshake_req_hash_lookup(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<handshake_req> handshake_req_next(Ptr<handshake_net> hn, int _class2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> handshake_req_private(Ptr<handshake_req> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int handshake_req_submit(Ptr<runtime.socket> sock2, Ptr<handshake_req> req2, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void handshake_sk_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct handshake_net")
    @NotUsableInJava
    public static class handshake_net
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock hn_lock;
        public int hn_pending;
        public int hn_pending_max;
        public ListDefinitions.list_head hn_requests;
        public @Unsigned long hn_flags;
    }

    @Type(noCCodeGeneration=true, cType="enum handshake_auth")
    public static enum handshake_auth implements Enum<handshake_auth>,
    TypedEnum<handshake_auth, Integer>
    {
        HANDSHAKE_AUTH_UNSPEC,
        HANDSHAKE_AUTH_UNAUTH,
        HANDSHAKE_AUTH_PSK,
        HANDSHAKE_AUTH_X509;

    }

    @Type(noCCodeGeneration=true, cType="enum handshake_msg_type")
    public static enum handshake_msg_type implements Enum<handshake_msg_type>,
    TypedEnum<handshake_msg_type, Integer>
    {
        HANDSHAKE_MSG_TYPE_UNSPEC,
        HANDSHAKE_MSG_TYPE_CLIENTHELLO,
        HANDSHAKE_MSG_TYPE_SERVERHELLO;

    }

    @Type(noCCodeGeneration=true, cType="enum handshake_handler_class")
    public static enum handshake_handler_class implements Enum<handshake_handler_class>,
    TypedEnum<handshake_handler_class, Integer>
    {
        HANDSHAKE_HANDLER_CLASS_NONE,
        HANDSHAKE_HANDLER_CLASS_TLSHD,
        HANDSHAKE_HANDLER_CLASS_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct handshake_proto")
    @NotUsableInJava
    public static class handshake_proto
    extends Struct {
        public int hp_handler_class;
        public @Unsigned long hp_privsize;
        public @Unsigned long hp_flags;
        public Ptr<?> hp_accept;
        public Ptr<?> hp_done;
        public Ptr<?> hp_destroy;
    }

    @Type(noCCodeGeneration=true, cType="struct handshake_req")
    @NotUsableInJava
    public static class handshake_req
    extends Struct {
        public ListDefinitions.list_head hr_list;
        public misc.rhash_head hr_rhash;
        public @Unsigned long hr_flags;
        public Ptr<handshake_proto> hr_proto;
        public Ptr<runtime.sock> hr_sk;
        public Ptr<?> hr_odestruct;
        public char @Size(value=0) [] hr_priv;
    }
}

