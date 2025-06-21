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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.ProtoDefinitions;
import me.bechberger.ebpf.runtime.ScmDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TomoyoDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class UnixDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __unix_gc(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __unix_walk_scc(Ptr<unix_vertex> vertex, Ptr<@Unsigned Long> last_index, Ptr<SkDefinitions.sk_buff_head> hitlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_add_edges(Ptr<ScmDefinitions.scm_fp_list> fpl, Ptr<unix_sock> receiver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_collect_skb(Ptr<ListDefinitions.list_head> scc, Ptr<SkDefinitions.sk_buff_head> hitlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_del_edges(Ptr<ScmDefinitions.scm_fp_list> fpl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_destroy_fpl(Ptr<ScmDefinitions.scm_fp_list> fpl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_gc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<unix_sock> unix_get_socket(Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_prepare_fpl(Ptr<ScmDefinitions.scm_fp_list> fpl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean unix_scc_cyclic(Ptr<ListDefinitions.list_head> scc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_update_edges(Ptr<unix_sock> receiver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean unix_vertex_dead(Ptr<unix_vertex> vertex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_bpf_build_proto() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_bpf_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_dgram_bpf_update_proto(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_psock> psock, boolean restore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_stream_bpf_update_proto(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_psock> psock, boolean restore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_sysctl_register(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_sysctl_unregister(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __unix_dgram_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __unix_set_addr_hash(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<unix_address> addr2, @Unsigned int hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __unix_stream_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_accept(Ptr<runtime.socket> sock2, Ptr<runtime.socket> newsock, Ptr<ProtoDefinitions.proto_accept_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_autobind(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_bind_bsd(Ptr<runtime.sock> sk, Ptr<misc.sockaddr_un> sunaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean unix_bpf_bypass_getsockopt(int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_compat_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_copy_addr(Ptr<runtime.msghdr> msg, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_create(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> unix_create1(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, int kern, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<unix_address> unix_create_addr(Ptr<misc.sockaddr_un> sunaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_destruct_scm(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_dgram_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int alen, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_dgram_disconnected(Ptr<runtime.sock> sk, Ptr<runtime.sock> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_dgram_peer_wake_me(Ptr<runtime.sock> sk, Ptr<runtime.sock> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_dgram_peer_wake_relay(Ptr<@OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry> q, @Unsigned int mode, int flags, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int unix_dgram_poll(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_dgram_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_dgram_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> unix_find_other(Ptr<runtime.net> net2, Ptr<misc.sockaddr_un> sunaddr, int addr_len, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> unix_get_first(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_getname(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int peer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long unix_inq_len(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_mkname_bsd(Ptr<misc.sockaddr_un> sunaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long unix_outq_len(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> unix_peer_get(Ptr<runtime.sock> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int unix_poll(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_read_skb(Ptr<runtime.sock> sk, @OriginalName(value="skb_read_actor_t") Ptr<?> recv_actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_release(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_release_sock(Ptr<runtime.sock> sk, int embrion) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_scm_to_skb(Ptr<ScmDefinitions.scm_cookie> scm, Ptr<SkDefinitions.sk_buff> skb, boolean send_fds) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> unix_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> unix_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_seqpacket_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_seqpacket_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_shutdown(Ptr<runtime.socket> sock2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_sock_destructor(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_socketpair(Ptr<runtime.socket> socka, Ptr<runtime.socket> sockb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_state_double_lock(Ptr<runtime.sock> sk1, Ptr<runtime.sock> sk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_stream_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long unix_stream_data_wait(Ptr<runtime.sock> sk, long timeo, Ptr<SkDefinitions.sk_buff> last, @Unsigned int last_len, boolean freezable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_stream_read_actor(Ptr<SkDefinitions.sk_buff> skb, int skip, int chunk, Ptr<unix_stream_read_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_stream_read_generic(Ptr<unix_stream_read_state> state2, boolean freezable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_stream_read_skb(Ptr<runtime.sock> sk, @OriginalName(value="skb_read_actor_t") Ptr<?> recv_actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_stream_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_stream_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int unix_stream_splice_actor(Ptr<SkDefinitions.sk_buff> skb, int skip, int chunk, Ptr<unix_stream_read_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long unix_stream_splice_read(Ptr<runtime.socket> sock2, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned long size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_unhash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long unix_wait_for_peer(Ptr<runtime.sock> other, long timeo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void unix_write_space(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum unix_vertex_index")
    public static enum unix_vertex_index implements Enum<unix_vertex_index>,
    TypedEnum<unix_vertex_index, Integer>
    {
        UNIX_VERTEX_INDEX_MARK1,
        UNIX_VERTEX_INDEX_MARK2,
        UNIX_VERTEX_INDEX_START;

    }

    @Type(noCCodeGeneration=true, cType="struct unix_stream_read_state")
    @NotUsableInJava
    public static class unix_stream_read_state
    extends Struct {
        public Ptr<?> recv_actor;
        public Ptr<runtime.socket> socket;
        public Ptr<runtime.msghdr> msg;
        public Ptr<PipeDefinitions.pipe_inode_info> pipe;
        public @Unsigned long size;
        public int flags;
        public @Unsigned int splice_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct unix_skb_parms")
    @NotUsableInJava
    public static class unix_skb_parms
    extends Struct {
        public Ptr<runtime.pid> pid;
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public Ptr<ScmDefinitions.scm_fp_list> fp;
        public @Unsigned int secid;
        public @Unsigned int consumed;
    }

    @Type(noCCodeGeneration=true, cType="struct unix_address")
    @NotUsableInJava
    public static class unix_address
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public int len;
        public misc.sockaddr_un @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct unix_sock")
    @NotUsableInJava
    public static class unix_sock
    extends Struct {
        public runtime.sock sk;
        public Ptr<unix_address> addr;
        public runtime.path path;
        public runtime.mutex iolock;
        public runtime.mutex bindlock;
        public Ptr<runtime.sock> peer;
        public Ptr<runtime.sock> listener;
        public Ptr<unix_vertex> vertex;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.socket_wq peer_wq;
        public @OriginalName(value="wait_queue_entry_t") WaitDefinitions.wait_queue_entry peer_wake;
        public ScmDefinitions.scm_stat scm_stat;
        public Ptr<SkDefinitions.sk_buff> oob_skb;
    }

    @Type(noCCodeGeneration=true, cType="struct unix_vertex")
    @NotUsableInJava
    public static class unix_vertex
    extends Struct {
        public ListDefinitions.list_head edges;
        public ListDefinitions.list_head entry;
        public ListDefinitions.list_head scc_entry;
        public @Unsigned long out_degree;
        public @Unsigned long index;
        public @Unsigned long scc_index;
    }

    @Type(noCCodeGeneration=true, cType="struct unix_edge")
    @NotUsableInJava
    public static class unix_edge
    extends Struct {
        public Ptr<unix_sock> predecessor;
        public Ptr<unix_sock> successor;
        public ListDefinitions.list_head vertex_entry;
        public ListDefinitions.list_head stack_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct { const struct tomoyo_path_info*; u8 protocol; u8 operation; }")
    @NotUsableInJava
    public static class unix_network_of_param_of_tomoyo_request_info
    extends Struct {
        public Ptr<TomoyoDefinitions.tomoyo_path_info> address;
        public char protocol;
        public char operation;
    }

    @Type(noCCodeGeneration=true, cType="struct unix_table")
    @NotUsableInJava
    public static class unix_table
    extends Struct {
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> locks;
        public Ptr<misc.hlist_head> buckets;
    }
}

