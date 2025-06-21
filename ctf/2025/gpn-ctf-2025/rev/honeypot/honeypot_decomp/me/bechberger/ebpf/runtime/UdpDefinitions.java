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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class UdpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_set_peek_off(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __udp_gso_segment(Ptr<SkDefinitions.sk_buff> gso_skb, @Unsigned @OriginalName(value="netdev_features_t") long features, boolean is_ipv6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_gro_complete(Ptr<SkDefinitions.sk_buff> skb, int nhoff, @OriginalName(value="udp_lookup_t") Ptr<?> lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> udp_gro_receive(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.udphdr> uh, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> udp_gro_receive_segment(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_lib_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_lib_hash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __udp_disconnect(Ptr<runtime.sock> sk, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __udp_enqueue_schedule_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_abort(Ptr<runtime.sock> sk, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_bpf_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_bpf_update_proto(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_psock> psock, boolean restore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_bpf_v4_build_proto() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_cmsg_send(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<@Unsigned Short> gso_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_destroy_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_destruct_common(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_destruct_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_disconnect(Ptr<runtime.sock> sk, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp_ehashfn((const struct net*)$arg1, (const unsigned int)$arg2, (const short unsigned int)$arg3, (const unsigned int)$arg4, (const short unsigned int)$arg5)")
    public static @Unsigned int udp_ehashfn(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int laddr, @Unsigned short lport, @Unsigned @OriginalName(value="__be32") int faddr, @Unsigned @OriginalName(value="__be16") short fport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_encap_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_encap_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_err(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int udp_flow_hashrnd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_flush_pending_frames(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> udp_get_first(Ptr<SeqDefinitions.seq_file> seq, int start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> udp_get_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_getsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_init_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_ioctl(Ptr<runtime.sock> sk, int cmd, Ptr<Integer> karg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_lib_get_port(Ptr<runtime.sock> sk, @Unsigned short snum, @Unsigned int hash2_nulladdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_lib_getsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp_lib_lport_inuse($arg1, $arg2, (const struct udp_hslot*)$arg3, $arg4, $arg5, $arg6)")
    public static int udp_lib_lport_inuse(Ptr<runtime.net> net2, @Unsigned short num, Ptr<udp_hslot> hslot, Ptr<@Unsigned Long> bitmap2, Ptr<runtime.sock> sk, @Unsigned int log) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_lib_lport_inuse2(Ptr<runtime.net> net2, @Unsigned short num, Ptr<udp_hslot> hslot2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_lib_rehash(Ptr<runtime.sock> sk, @Unsigned short newhash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp_lib_setsockopt($arg1, $arg2, $arg3, $arg4, $arg5, (int (*)(struct sock*))$arg6)")
    public static int udp_lib_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen, Ptr<?> push_pending_frames) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_lib_unhash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_msg_wait_data(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_psock> psock, long timeo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_pernet_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_pernet_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int udp_poll(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_pre_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_push_pending_frames(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_queue_rcv_one_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_queue_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_read_skb(Ptr<runtime.sock> sk, @OriginalName(value="skb_read_actor_t") Ptr<?> recv_actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_recvmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_rmem_release(Ptr<runtime.sock> sk, int size, int partial, boolean rx_queue_lock_held) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_send_skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi4> fl4, Ptr<InetDefinitions.inet_cork> cork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_sendmsg(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> udp_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> udp_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_set_csum(boolean nocheck, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be32") int daddr, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean udp_sk_rx_dst_set(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_skb_destructor(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_splice_eof(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp_table_init($arg1, (const u8*)$arg2)")
    public static void udp_table_init(Ptr<udp_table> table, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_unicast_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.udphdr> uh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_v4_early_demux(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_v4_get_port(Ptr<runtime.sock> sk, @Unsigned short snum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_v4_rehash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_v6_early_demux(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_v6_get_port(Ptr<runtime.sock> sk, @Unsigned short snum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_v6_push_pending_frames(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp_v6_rehash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp_v6_send_skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi6> fl6, Ptr<InetDefinitions.inet_cork> cork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct udp_iter_state")
    @NotUsableInJava
    public static class udp_iter_state
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public int bucket;
    }

    @Type(noCCodeGeneration=true, cType="struct udp_seq_afinfo")
    @NotUsableInJava
    public static class udp_seq_afinfo
    extends Struct {
        public @Unsigned @OriginalName(value="sa_family_t") short family;
        public Ptr<udp_table> udp_table;
    }

    @Type(noCCodeGeneration=true, cType="struct udp_dev_scratch")
    @NotUsableInJava
    public static class udp_dev_scratch
    extends Struct {
        public @Unsigned int _tsize_state;
        public @Unsigned short len;
        public boolean is_linear;
        public boolean csum_unnecessary;
    }

    @Type(noCCodeGeneration=true, cType="struct udp_skb_cb")
    @NotUsableInJava
    public static class udp_skb_cb
    extends Struct {
        public AnonDefinitions.anon_member_of_ipfrag_skb_cb_and_header_of_anon_member_of_tcp_skb_cb_and_header_of_sock_exterr_skb header;
        public @Unsigned short cscov;
        public char partial_cov;
    }

    @Type(noCCodeGeneration=true, cType="struct udp_tunnel_nic_ops")
    @NotUsableInJava
    public static class udp_tunnel_nic_ops
    extends Struct {
        public Ptr<?> get_port;
        public Ptr<?> set_port_priv;
        public Ptr<?> add_port;
        public Ptr<?> del_port;
        public Ptr<?> reset_ntf;
        public Ptr<?> dump_size;
        public Ptr<?> dump_write;
    }

    @Type(noCCodeGeneration=true, cType="struct udp_tunnel_nic_table_info")
    @NotUsableInJava
    public static class udp_tunnel_nic_table_info
    extends Struct {
        public @Unsigned int n_entries;
        public @Unsigned int tunnel_types;
    }

    @Type(noCCodeGeneration=true, cType="struct udp_tunnel_nic_shared")
    @NotUsableInJava
    public static class udp_tunnel_nic_shared
    extends Struct {
        public @OriginalName(value="udp_tunnel_nic") Ptr<?> udp_tunnel_nic_info;
        public ListDefinitions.list_head devices;
    }

    @Type(noCCodeGeneration=true, cType="enum udp_tunnel_nic_info_flags")
    public static enum udp_tunnel_nic_info_flags implements Enum<udp_tunnel_nic_info_flags>,
    TypedEnum<udp_tunnel_nic_info_flags, Integer>
    {
        UDP_TUNNEL_NIC_INFO_MAY_SLEEP,
        UDP_TUNNEL_NIC_INFO_OPEN_ONLY,
        UDP_TUNNEL_NIC_INFO_IPV4_ONLY,
        UDP_TUNNEL_NIC_INFO_STATIC_IANA_VXLAN;

    }

    @Type(noCCodeGeneration=true, cType="struct udp_tunnel_info")
    @NotUsableInJava
    public static class udp_tunnel_info
    extends Struct {
        public @Unsigned short type;
        public @Unsigned @OriginalName(value="sa_family_t") short sa_family;
        public @Unsigned @OriginalName(value="__be16") short port;
        public char hw_priv;
    }

    @Type(noCCodeGeneration=true, cType="enum udp_parsable_tunnel_type")
    public static enum udp_parsable_tunnel_type implements Enum<udp_parsable_tunnel_type>,
    TypedEnum<udp_parsable_tunnel_type, Integer>
    {
        UDP_TUNNEL_TYPE_VXLAN,
        UDP_TUNNEL_TYPE_GENEVE,
        UDP_TUNNEL_TYPE_VXLAN_GPE;

    }

    @Type(noCCodeGeneration=true, cType="struct udp_sock")
    @NotUsableInJava
    public static class udp_sock
    extends Struct {
        public InetDefinitions.inet_sock inet;
        public @Unsigned long udp_flags;
        public int pending;
        public char encap_type;
        public @Unsigned short len;
        public @Unsigned short gso_size;
        public @Unsigned short pcslen;
        public @Unsigned short pcrlen;
        public Ptr<?> encap_rcv;
        public Ptr<?> encap_err_rcv;
        public Ptr<?> encap_err_lookup;
        public Ptr<?> encap_destroy;
        public Ptr<?> gro_receive;
        public Ptr<?> gro_complete;
        public SkDefinitions.sk_buff_head reader_queue;
        public int forward_deficit;
        public int forward_threshold;
        public boolean peeking_with_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct udp_hslot")
    @NotUsableInJava
    public static class udp_hslot
    extends Struct {
        public misc.hlist_head head;
        public int count;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct udp_table")
    @NotUsableInJava
    public static class udp_table
    extends Struct {
        public Ptr<udp_hslot> hash;
        public Ptr<udp_hslot> hash2;
        public @Unsigned int mask;
        public @Unsigned int log;
    }

    @Type(noCCodeGeneration=true, cType="struct udp_tunnel_nic_info")
    @NotUsableInJava
    public static class udp_tunnel_nic_info
    extends Struct {
        public Ptr<?> set_port;
        public Ptr<?> unset_port;
        public Ptr<?> sync_table;
        public Ptr<udp_tunnel_nic_shared> shared;
        public @Unsigned int flags;
        public udp_tunnel_nic_table_info @Size(value=4) [] tables;
    }

    @Type(noCCodeGeneration=true, cType="enum udp_conntrack")
    public static enum udp_conntrack implements Enum<udp_conntrack>,
    TypedEnum<udp_conntrack, Integer>
    {
        UDP_CT_UNREPLIED,
        UDP_CT_REPLIED,
        UDP_CT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct udp_mib")
    @NotUsableInJava
    public static class udp_mib
    extends Struct {
        public @Unsigned long @Size(value=10) [] mibs;
    }
}

