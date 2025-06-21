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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TpacketDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PacketDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__packet_rcv_has_room((const struct packet_sock*)$arg1, (const struct sk_buff*)$arg2)")
    public static int __packet_rcv_has_room(Ptr<packet_sock> po, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_bind_spkt(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_create(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_dev_mc(Ptr<NetDefinitions.net_device> dev, Ptr<packet_mclist> i, int what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="packet_do_bind($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int packet_do_bind(Ptr<runtime.sock> sk, String name, int ifindex, @Unsigned @OriginalName(value="__be16") short proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void packet_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_getname(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int peer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_getname_spkt(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int peer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_getsockopt(Ptr<runtime.socket> sock2, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_mc_add(Ptr<runtime.sock> sk, Ptr<packet_mreq_max> mreq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void packet_mm_close(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void packet_mm_open(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_mmap(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void packet_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_notifier(Ptr<misc.notifier_block> _this, @Unsigned long msg, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void packet_parse_headers(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int packet_poll(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_rcv(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_rcv_fanout(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_rcv_spkt(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void packet_rcv_try_clear_pressure(Ptr<packet_sock> po) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="packet_read_pending((const struct packet_ring_buffer*)$arg1)")
    public static @Unsigned int packet_read_pending(Ptr<packet_ring_buffer> rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_release(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_sendmsg_spkt(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> packet_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> packet_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void packet_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_set_ring(Ptr<runtime.sock> sk, Ptr<TpacketDefinitions.tpacket_req_u> req_u, int closing, int tx_ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_setsockopt(Ptr<runtime.socket> sock2, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int packet_snd(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void packet_sock_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void packet_sock_flag_set(Ptr<packet_sock> po, packet_sock_flags flag, boolean val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="packet_xmit((const struct packet_sock*)$arg1, $arg2)")
    public static int packet_xmit(Ptr<packet_sock> po, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct packet_skb_cb")
    @NotUsableInJava
    public static class packet_skb_cb
    extends Struct {
        public misc.sa_of_packet_skb_cb sa;
    }

    @Type(noCCodeGeneration=true, cType="struct packet_mreq_max")
    @NotUsableInJava
    public static class packet_mreq_max
    extends Struct {
        public int mr_ifindex;
        public @Unsigned short mr_type;
        public @Unsigned short mr_alen;
        public char @Size(value=32) [] mr_address;
    }

    @Type(noCCodeGeneration=true, cType="enum packet_sock_flags")
    public static enum packet_sock_flags implements Enum<packet_sock_flags>,
    TypedEnum<packet_sock_flags, Integer>
    {
        PACKET_SOCK_ORIGDEV,
        PACKET_SOCK_AUXDATA,
        PACKET_SOCK_TX_HAS_OFF,
        PACKET_SOCK_TP_LOSS,
        PACKET_SOCK_RUNNING,
        PACKET_SOCK_PRESSURE,
        PACKET_SOCK_QDISC_BYPASS;

    }

    @Type(noCCodeGeneration=true, cType="struct packet_sock")
    @NotUsableInJava
    public static class packet_sock
    extends Struct {
        public runtime.sock sk;
        public Ptr<packet_fanout> fanout;
        public TpacketDefinitions.tpacket_stats_u stats;
        public packet_ring_buffer rx_ring;
        public packet_ring_buffer tx_ring;
        public int copy_thresh;
        public  @OriginalName(value="spinlock_t") runtime.spinlock bind_lock;
        public runtime.mutex pg_vec_lock;
        public @Unsigned long flags;
        public int ifindex;
        public char vnet_hdr_sz;
        public @Unsigned @OriginalName(value="__be16") short num;
        public Ptr<packet_rollover> rollover;
        public Ptr<packet_mclist> mclist;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t mapped;
        public TpacketDefinitions.tpacket_versions tp_version;
        public @Unsigned int tp_hdrlen;
        public @Unsigned int tp_reserve;
        public @Unsigned int tp_tstamp;
        public runtime.completion skb_completion;
        public Ptr<NetDefinitions.net_device> cached_dev;
        public packet_type prot_hook;
        public AtomicDefinitions.atomic_t tp_drops;
    }

    @Type(noCCodeGeneration=true, cType="struct packet_rollover")
    @NotUsableInJava
    public static class packet_rollover
    extends Struct {
        public int sock;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t num;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t num_huge;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t num_failed;
        public @Unsigned int @Size(value=16) [] history;
    }

    @Type(noCCodeGeneration=true, cType="struct packet_fanout")
    @NotUsableInJava
    public static class packet_fanout
    extends Struct {
        public misc.possible_net_t net;
        public @Unsigned int num_members;
        public @Unsigned int max_num_members;
        public @Unsigned short id;
        public char type;
        public char flags;
        @InlineUnion(value=66632)
        public @InlineUnion(value=66632) AtomicDefinitions.atomic_t rr_cur;
        @InlineUnion(value=66632)
        public @InlineUnion(value=66632) Ptr<BpfDefinitions.bpf_prog> bpf_prog;
        public ListDefinitions.list_head list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @OriginalName(value="refcount_t") misc.refcount_struct sk_ref;
        public packet_type prot_hook;
        public Ptr<runtime.sock> @Size(value=0) [] arr;
    }

    @Type(noCCodeGeneration=true, cType="struct packet_ring_buffer")
    @NotUsableInJava
    public static class packet_ring_buffer
    extends Struct {
        public Ptr<runtime.pgv> pg_vec;
        public @Unsigned int head;
        public @Unsigned int frames_per_block;
        public @Unsigned int frame_size;
        public @Unsigned int frame_max;
        public @Unsigned int pg_vec_order;
        public @Unsigned int pg_vec_pages;
        public @Unsigned int pg_vec_len;
        public Ptr<@Unsigned Integer> pending_refcnt;
        @InlineUnion(value=66629)
        public @InlineUnion(value=66629) Ptr<@Unsigned Long> rx_owner_map;
        @InlineUnion(value=66629)
        public @InlineUnion(value=66629) TpacketDefinitions.tpacket_kbdq_core prb_bdqc;
    }

    @Type(noCCodeGeneration=true, cType="struct packet_mclist")
    @NotUsableInJava
    public static class packet_mclist
    extends Struct {
        public Ptr<packet_mclist> next;
        public int ifindex;
        public int count;
        public @Unsigned short type;
        public @Unsigned short alen;
        public char @Size(value=32) [] addr;
    }

    @Type(noCCodeGeneration=true, cType="struct packet_offload")
    @NotUsableInJava
    public static class packet_offload
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short type;
        public @Unsigned short priority;
        public misc.offload_callbacks callbacks;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct packet_type")
    @NotUsableInJava
    public static class packet_type
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short type;
        public boolean ignore_outgoing;
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public Ptr<?> func;
        public Ptr<?> list_func;
        public Ptr<?> id_match;
        public Ptr<runtime.net> af_packet_net;
        public Ptr<?> af_packet_priv;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct packet_command")
    @NotUsableInJava
    public static class packet_command
    extends Struct {
        public char @Size(value=12) [] cmd;
        public String buffer;
        public @Unsigned int buflen;
        public int stat;
        public Ptr<ScsiDefinitions.scsi_sense_hdr> sshdr;
        public char data_direction;
        public int quiet;
        public int timeout;
        public Ptr<?> @Size(value=1) [] reserved;
    }
}

