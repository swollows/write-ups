/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.HandshakeDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.StrpDefinitions;
import me.bechberger.ebpf.runtime.TxDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class TlsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="tls_client_hello_anon((const struct tls_handshake_args*)$arg1, $arg2)")
    public static int tls_client_hello_anon(Ptr<tls_handshake_args> args, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tls_client_hello_psk((const struct tls_handshake_args*)$arg1, $arg2)")
    public static int tls_client_hello_psk(Ptr<tls_handshake_args> args, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tls_client_hello_x509((const struct tls_handshake_args*)$arg1, $arg2)")
    public static int tls_client_hello_x509(Ptr<tls_handshake_args> args, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tls_handshake_accept(Ptr<HandshakeDefinitions.handshake_req> req2, Ptr<GenlDefinitions.genl_info> info2, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tls_handshake_cancel(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tls_handshake_close(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tls_handshake_done(Ptr<HandshakeDefinitions.handshake_req> req2, @Unsigned int status, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tls_server_hello_psk((const struct tls_handshake_args*)$arg1, $arg2)")
    public static int tls_server_hello_psk(Ptr<tls_handshake_args> args, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tls_server_hello_x509((const struct tls_handshake_args*)$arg1, $arg2)")
    public static int tls_server_hello_x509(Ptr<tls_handshake_args> args, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tls_desc_okay((const struct user_desc*)$arg1)")
    public static boolean tls_desc_okay(Ptr<UserDefinitions.user_desc> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tls_alert_recv((const struct sock*)$arg1, (const struct msghdr*)$arg2, $arg3, $arg4)")
    public static void tls_alert_recv(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<Character> level, Ptr<Character> description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tls_alert_send(Ptr<runtime.socket> sock2, char level, char description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tls_get_record_type((const struct sock*)$arg1, (const struct cmsghdr*)$arg2)")
    public static char tls_get_record_type(Ptr<runtime.sock> sk, Ptr<runtime.cmsghdr> cmsg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tls_sw_context_tx")
    @NotUsableInJava
    public static class tls_sw_context_tx
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_aead> aead_send;
        public CryptoDefinitions.crypto_wait async_wait;
        public TxDefinitions.tx_work tx_work;
        public @OriginalName(value="tls_rec") Ptr<?> open_rec;
        public ListDefinitions.list_head tx_list;
        public AtomicDefinitions.atomic_t encrypt_pending;
        public char async_capable;
        public @Unsigned long tx_bitmask;
    }

    @Type(noCCodeGeneration=true, cType="struct tls_handshake_req")
    @NotUsableInJava
    public static class tls_handshake_req
    extends Struct {
        public Ptr<?> th_consumer_done;
        public Ptr<?> th_consumer_data;
        public int th_type;
        public @Unsigned int th_timeout_ms;
        public int th_auth_mode;
        public String th_peername;
        public @OriginalName(value="key_serial_t") int th_keyring;
        public @OriginalName(value="key_serial_t") int th_certificate;
        public @OriginalName(value="key_serial_t") int th_privkey;
        public @Unsigned int th_num_peerids;
        public @OriginalName(value="key_serial_t") int @Size(value=5) [] th_peerid;
    }

    @Type(noCCodeGeneration=true, cType="struct tls_handshake_args")
    @NotUsableInJava
    public static class tls_handshake_args
    extends Struct {
        public Ptr<runtime.socket> ta_sock;
        public @OriginalName(value="tls_done_func_t") Ptr<?> ta_done;
        public Ptr<?> ta_data;
        public String ta_peername;
        public @Unsigned int ta_timeout_ms;
        public @OriginalName(value="key_serial_t") int ta_keyring;
        public @OriginalName(value="key_serial_t") int ta_my_cert;
        public @OriginalName(value="key_serial_t") int ta_my_privkey;
        public @Unsigned int ta_num_peerids;
        public @OriginalName(value="key_serial_t") int @Size(value=5) [] ta_my_peerids;
    }

    @Type(noCCodeGeneration=true, cType="struct tls_descs")
    @NotUsableInJava
    public static class tls_descs
    extends Struct {
        public DescDefinitions.desc_struct @Size(value=3) [] desc;
    }

    @Type(noCCodeGeneration=true, cType="enum tls_offload_ctx_dir")
    public static enum tls_offload_ctx_dir implements Enum<tls_offload_ctx_dir>,
    TypedEnum<tls_offload_ctx_dir, Integer>
    {
        TLS_OFFLOAD_CTX_DIR_RX,
        TLS_OFFLOAD_CTX_DIR_TX;

    }

    @Type(noCCodeGeneration=true, cType="struct tls_prot_info")
    @NotUsableInJava
    public static class tls_prot_info
    extends Struct {
        public @Unsigned short version;
        public @Unsigned short cipher_type;
        public @Unsigned short prepend_size;
        public @Unsigned short tag_size;
        public @Unsigned short overhead_size;
        public @Unsigned short iv_size;
        public @Unsigned short salt_size;
        public @Unsigned short rec_seq_size;
        public @Unsigned short aad_size;
        public @Unsigned short tail_size;
    }

    @Type(noCCodeGeneration=true, cType="union tls_crypto_context")
    @NotUsableInJava
    public static class tls_crypto_context
    extends Union {
        public tls_crypto_info info;
        @InlineUnion(value=23959)
        public @InlineUnion(value=23959) misc.tls12_crypto_info_aes_gcm_128 aes_gcm_128;
        @InlineUnion(value=23959)
        public @InlineUnion(value=23959) misc.tls12_crypto_info_aes_gcm_256 aes_gcm_256;
        @InlineUnion(value=23959)
        public @InlineUnion(value=23959) misc.tls12_crypto_info_chacha20_poly1305 chacha20_poly1305;
        @InlineUnion(value=23959)
        public @InlineUnion(value=23959) misc.tls12_crypto_info_sm4_gcm sm4_gcm;
        @InlineUnion(value=23959)
        public @InlineUnion(value=23959) misc.tls12_crypto_info_sm4_ccm sm4_ccm;
    }

    @Type(noCCodeGeneration=true, cType="struct tls_context")
    @NotUsableInJava
    public static class tls_context
    extends Struct {
        public tls_prot_info prot_info;
        public char tx_conf;
        public char rx_conf;
        public char zerocopy_sendfile;
        public char rx_no_pad;
        public Ptr<?> push_pending_record;
        public Ptr<?> sk_write_space;
        public Ptr<?> priv_ctx_tx;
        public Ptr<?> priv_ctx_rx;
        public Ptr<NetDefinitions.net_device> netdev;
        public misc.cipher_context tx;
        public misc.cipher_context rx;
        public Ptr<runtime.scatterlist> partially_sent_record;
        public @Unsigned short partially_sent_offset;
        public boolean splicing_pages;
        public boolean pending_open_record_frags;
        public runtime.mutex tx_lock;
        public @Unsigned long flags;
        public Ptr<runtime.proto> sk_proto;
        public Ptr<runtime.sock> sk;
        public Ptr<?> sk_destruct;
        public tls_crypto_context crypto_send;
        public tls_crypto_context crypto_recv;
        public ListDefinitions.list_head list;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct tls_sw_context_rx")
    @NotUsableInJava
    public static class tls_sw_context_rx
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_aead> aead_recv;
        public CryptoDefinitions.crypto_wait async_wait;
        public SkDefinitions.sk_buff_head rx_list;
        public Ptr<?> saved_data_ready;
        public char reader_present;
        public char async_capable;
        public char zc_capable;
        public char reader_contended;
        public tls_strparser strp;
        public AtomicDefinitions.atomic_t decrypt_pending;
        public SkDefinitions.sk_buff_head async_hold;
        public WaitDefinitions.wait_queue_head wq;
    }

    @Type(noCCodeGeneration=true, cType="struct tls_strparser")
    @NotUsableInJava
    public static class tls_strparser
    extends Struct {
        public Ptr<runtime.sock> sk;
        public @Unsigned int mark;
        public @Unsigned int stopped;
        public @Unsigned int copy_mode;
        public @Unsigned int mixed_decrypted;
        public boolean msg_ready;
        public StrpDefinitions.strp_msg stm;
        public Ptr<SkDefinitions.sk_buff> anchor;
        public misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct tls_crypto_info")
    @NotUsableInJava
    public static class tls_crypto_info
    extends Struct {
        public @Unsigned short version;
        public @Unsigned short cipher_type;
    }

    @Type(noCCodeGeneration=true, cType="struct tls_msg")
    @NotUsableInJava
    public static class tls_msg
    extends Struct {
        public char control;
    }
}

