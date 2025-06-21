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
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.VirtnetDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class XskDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xsk_generic_xmit(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xsk_map_flush(Ptr<ListDefinitions.list_head> flush_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xsk_map_redirect(Ptr<XdpDefinitions.xdp_sock> xs, Ptr<XdpDefinitions.xdp_buff> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xsk_rcv(Ptr<XdpDefinitions.xdp_sock> xs, Ptr<XdpDefinitions.xdp_buff> xdp2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xsk_rcv_zc(Ptr<XdpDefinitions.xdp_sock> xs, Ptr<XdpDefinitions.xdp_buff_xsk> xskb, @Unsigned int len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> xsk_build_skb(Ptr<XdpDefinitions.xdp_sock> xs, Ptr<XdpDefinitions.xdp_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> xsk_build_skb_zerocopy(Ptr<XdpDefinitions.xdp_sock> xs, Ptr<XdpDefinitions.xdp_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_clear_pool_at_qid(Ptr<NetDefinitions.net_device> dev, @Unsigned short queue_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_clear_rx_need_wakeup(Ptr<xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_clear_tx_need_wakeup(Ptr<xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_consume_skb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xsk_copy_xdp(Ptr<?> to, Ptr<Ptr<?>> from, @Unsigned int to_len, Ptr<@Unsigned Integer> from_len, Ptr<Ptr<@OriginalName(value="skb_frag_t") SkbDefinitions.skb_frag>> frag2, @Unsigned int rem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_create(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_destruct_skb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_generic_rcv(Ptr<XdpDefinitions.xdp_sock> xs, Ptr<XdpDefinitions.xdp_buff> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xsk_buff_pool> xsk_get_pool_from_qid(Ptr<NetDefinitions.net_device> dev, @Unsigned short queue_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_getsockopt(Ptr<runtime.socket> sock2, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_mmap(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_notifier(Ptr<misc.notifier_block> _this, @Unsigned long msg, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int xsk_poll(Ptr<runtime.file> file2, Ptr<runtime.socket> sock2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_rcv_check(Ptr<XdpDefinitions.xdp_sock> xs, Ptr<XdpDefinitions.xdp_buff> xdp2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> m, @Unsigned long len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_reg_pool_at_qid(Ptr<NetDefinitions.net_device> dev, Ptr<xsk_buff_pool> pool, @Unsigned short queue_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_release(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> m, @Unsigned long total_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_set_rx_need_wakeup(Ptr<xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_set_tx_need_wakeup(Ptr<xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_setsockopt(Ptr<runtime.socket> sock2, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_tx_completed(Ptr<xsk_buff_pool> pool, @Unsigned int nb_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xsk_tx_peek_desc(Ptr<xsk_buff_pool> pool, Ptr<XdpDefinitions.xdp_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xsk_tx_peek_release_desc_batch(Ptr<xsk_buff_pool> pool, @Unsigned int nb_pkts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_tx_release(Ptr<xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xsk_uses_need_wakeup(Ptr<xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> xsk_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long xsk_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_map_gen_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_insn> insn_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_map_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xsk_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xsk_map_lookup_elem_sys_only(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xsk_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long xsk_map_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xsk_map_meta_equal((const struct bpf_map*)$arg1, (const struct bpf_map*)$arg2)")
    public static boolean xsk_map_meta_equal(Ptr<BpfDefinitions.bpf_map> meta0, Ptr<BpfDefinitions.bpf_map> meta1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long xsk_map_redirect(Ptr<BpfDefinitions.bpf_map> map2, @Unsigned long index2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_map_sock_delete(Ptr<XdpDefinitions.xdp_sock> xs, Ptr<Ptr<XdpDefinitions.xdp_sock>> map_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_map_try_sock_delete(Ptr<xsk_map> map2, Ptr<XdpDefinitions.xdp_sock> xs, Ptr<Ptr<XdpDefinitions.xdp_sock>> map_entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long xsk_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xsk_append_merge_buffer(Ptr<VirtnetDefinitions.virtnet_info> vi, Ptr<misc.receive_queue> rq2, Ptr<SkDefinitions.sk_buff> head_skb, @Unsigned int num_buf, Ptr<VirtioDefinitions.virtio_net_hdr_mrg_rxbuf> hdr, Ptr<VirtnetDefinitions.virtnet_rq_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> xsk_construct_skb(Ptr<misc.receive_queue> rq2, Ptr<XdpDefinitions.xdp_buff> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xsk_drop_follow_bufs(Ptr<NetDefinitions.net_device> dev, Ptr<misc.receive_queue> rq2, @Unsigned int num_buf, Ptr<VirtnetDefinitions.virtnet_rq_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xsk_map_node")
    @NotUsableInJava
    public static class xsk_map_node
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<xsk_map> map;
        public Ptr<Ptr<XdpDefinitions.xdp_sock>> map_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct xsk_map")
    @NotUsableInJava
    public static class xsk_map
    extends Struct {
        public BpfDefinitions.bpf_map map;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public AtomicDefinitions.atomic_t count;
        public Ptr<XdpDefinitions.xdp_sock> @Size(value=0) [] xsk_map;
    }

    @Type(noCCodeGeneration=true, cType="struct xsk_tx_metadata")
    @NotUsableInJava
    public static class xsk_tx_metadata
    extends Struct {
        public @Unsigned long flags;
        @InlineUnion(value=35258)
        public  @InlineUnion(value=35258) AnonDefinitions.anon_member_of_anon_member_of_anon_member_of_anon_member_of_sk_buff_and_headers_of_anon_member_of_sk_buff_and_request_of_anon_member_of_xsk_tx_metadata request;
        @InlineUnion(value=35258)
        public @InlineUnion(value=35258) misc.completion_of_anon_member_of_xsk_tx_metadata completion;
    }

    @Type(noCCodeGeneration=true, cType="struct xsk_cb_desc")
    @NotUsableInJava
    public static class xsk_cb_desc
    extends Struct {
        public Ptr<?> src;
        public char off;
        public char bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct xsk_dma_map")
    @NotUsableInJava
    public static class xsk_dma_map
    extends Struct {
        public Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_pages;
        public Ptr<runtime.device> dev;
        public Ptr<NetDefinitions.net_device> netdev;
        public @OriginalName(value="refcount_t") misc.refcount_struct users;
        public ListDefinitions.list_head list;
        public @Unsigned int dma_pages_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct xsk_queue")
    @NotUsableInJava
    public static class xsk_queue
    extends Struct {
        public @Unsigned int ring_mask;
        public @Unsigned int nentries;
        public @Unsigned int cached_prod;
        public @Unsigned int cached_cons;
        public Ptr<XdpDefinitions.xdp_ring> ring;
        public @Unsigned long invalid_descs;
        public @Unsigned long queue_empty_descs;
        public @Unsigned long ring_vmalloc_size;
    }

    @Type(noCCodeGeneration=true, cType="struct xsk_buff_pool")
    @NotUsableInJava
    public static class xsk_buff_pool
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<NetDefinitions.net_device> netdev;
        public ListDefinitions.list_head xsk_tx_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock xsk_tx_list_lock;
        public @OriginalName(value="refcount_t") misc.refcount_struct users;
        public Ptr<XdpDefinitions.xdp_umem> umem;
        public misc.work_struct work;
        public ListDefinitions.list_head free_list;
        public ListDefinitions.list_head xskb_list;
        public @Unsigned int heads_cnt;
        public @Unsigned short queue_id;
        public Ptr<xsk_queue> fq;
        public Ptr<xsk_queue> cq;
        public Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_pages;
        public Ptr<XdpDefinitions.xdp_buff_xsk> heads;
        public Ptr<XdpDefinitions.xdp_desc> tx_descs;
        public @Unsigned long chunk_mask;
        public @Unsigned long addrs_cnt;
        public @Unsigned int free_list_cnt;
        public @Unsigned int dma_pages_cnt;
        public @Unsigned int free_heads_cnt;
        public @Unsigned int headroom;
        public @Unsigned int chunk_size;
        public @Unsigned int chunk_shift;
        public @Unsigned int frame_len;
        public char tx_metadata_len;
        public char cached_need_wakeup;
        public boolean uses_need_wakeup;
        public boolean unaligned;
        public boolean tx_sw_csum;
        public Ptr<?> addrs;
        public  @OriginalName(value="spinlock_t") runtime.spinlock cq_lock;
        public Ptr<XdpDefinitions.xdp_buff_xsk> @Size(value=0) [] free_heads;
    }

    @Type(noCCodeGeneration=true, cType="struct xsk_tx_metadata_compl")
    @NotUsableInJava
    public static class xsk_tx_metadata_compl
    extends Struct {
        public Ptr<@Unsigned Long> tx_timestamp;
    }

    @Type(noCCodeGeneration=true, cType="struct xsk_tx_metadata_ops")
    @NotUsableInJava
    public static class xsk_tx_metadata_ops
    extends Struct {
        public Ptr<?> tmo_request_timestamp;
        public Ptr<?> tmo_fill_timestamp;
        public Ptr<?> tmo_request_checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct xsk_buff_pool *pool; short unsigned int queue_id; }")
    @NotUsableInJava
    public static class xsk_of_anon_member_of_netdev_bpf
    extends Struct {
        public Ptr<xsk_buff_pool> pool;
        public @Unsigned short queue_id;
    }
}

