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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.XskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class XdpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdp_test_run_batch(Ptr<xdp_test_data> xdp2, Ptr<BpfDefinitions.bpf_prog> prog, @Unsigned int repeat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_test_run_init_page(@Unsigned @OriginalName(value="netmem_ref") long netmem, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __xdp_build_skb_from_frame(Ptr<xdp_frame> xdpf, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xdp_mem_allocator_rcu_free(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xdp_mem_allocator> __xdp_reg_mem_model(Ptr<xdp_mem_info> mem, xdp_mem_type type2, Ptr<?> allocator) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __xdp_return(Ptr<?> data, Ptr<xdp_mem_info> mem, boolean napi_direct, Ptr<xdp_buff> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xdp_rxq_info_reg(Ptr<xdp_rxq_info> xdp_rxq, Ptr<NetDefinitions.net_device> dev, @Unsigned int queue_index, @Unsigned int napi_id, @Unsigned int frag_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdp_alloc_skb_bulk(Ptr<Ptr<?>> skbs, int n_skb, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_attachment_setup(Ptr<xdp_attachment_info> info2, Ptr<NetdevDefinitions.netdev_bpf> bpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> xdp_build_skb_from_frame(Ptr<xdp_frame> xdpf, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xdp_frame> xdp_convert_zc_to_xdp_frame(Ptr<xdp_buff> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_features_clear_redirect_target(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_features_set_redirect_target(Ptr<NetDefinitions.net_device> dev, boolean support_sg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_flush_frame_bulk(Ptr<xdp_frame_bulk> bq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> xdp_linearize_page(Ptr<misc.receive_queue> rq2, Ptr<Integer> num_buf, Ptr<runtime.page> p, int offset, int page_off, Ptr<@Unsigned Integer> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xdp_mem_id_cmp($arg1, (const void*)$arg2)")
    public static int xdp_mem_id_cmp(Ptr<RhashtableDefinitions.rhashtable_compare_arg> arg2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xdp_mem_id_hashfn((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned int xdp_mem_id_hashfn(Ptr<?> data, @Unsigned int len, @Unsigned int seed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdp_metadata_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdp_reg_mem_model(Ptr<xdp_mem_info> mem, xdp_mem_type type2, Ptr<?> allocator) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_return_buff(Ptr<xdp_buff> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_return_frame(Ptr<xdp_frame> xdpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_return_frame_bulk(Ptr<xdp_frame> xdpf, Ptr<xdp_frame_bulk> bq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_return_frame_rx_napi(Ptr<xdp_frame> xdpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xdp_rxq_info_is_reg(Ptr<xdp_rxq_info> xdp_rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdp_rxq_info_reg_mem_model(Ptr<xdp_rxq_info> xdp_rxq, xdp_mem_type type2, Ptr<?> allocator) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_rxq_info_unreg(Ptr<xdp_rxq_info> xdp_rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_rxq_info_unreg_mem_model(Ptr<xdp_rxq_info> xdp_rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_rxq_info_unused(Ptr<xdp_rxq_info> xdp_rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_set_features_flag(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="xdp_features_t") int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_unreg_mem_model(Ptr<xdp_mem_info> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xdp_warn((const u8*)$arg1, (const u8*)$arg2, (const int)$arg3)")
    public static void xdp_warn(String msg, String func, int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xdp_btf_struct_access($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4)")
    public static int xdp_btf_struct_access(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<BpfDefinitions.bpf_reg_state> reg, int off, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xdp_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int xdp_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_do_flush() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdp_do_generic_redirect(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<xdp_buff> xdp2, Ptr<BpfDefinitions.bpf_prog> xdp_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdp_do_redirect(Ptr<NetDefinitions.net_device> dev, Ptr<xdp_buff> xdp2, Ptr<BpfDefinitions.bpf_prog> xdp_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdp_do_redirect_frame(Ptr<NetDefinitions.net_device> dev, Ptr<xdp_buff> xdp2, Ptr<xdp_frame> xdpf, Ptr<BpfDefinitions.bpf_prog> xdp_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)xdp_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> xdp_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_get_umem(Ptr<xdp_umem> umem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xdp_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean xdp_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xdp_master_redirect(Ptr<xdp_buff> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_put_umem(Ptr<xdp_umem> umem, boolean defer_cleanup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xdp_umem> xdp_umem_create(Ptr<xdp_umem_reg> mr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdp_umem_release_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_attachment_info")
    @NotUsableInJava
    public static class xdp_attachment_info
    extends Struct {
        public Ptr<BpfDefinitions.bpf_prog> prog;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_frame_bulk")
    @NotUsableInJava
    public static class xdp_frame_bulk
    extends Struct {
        public int count;
        public Ptr<?> xa;
        public Ptr<?> @Size(value=16) [] q;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_bulk_queue")
    @NotUsableInJava
    public static class xdp_bulk_queue
    extends Struct {
        public Ptr<?> @Size(value=8) [] q;
        public ListDefinitions.list_head flush_node;
        public Ptr<BpfDefinitions.bpf_cpu_map_entry> obj;
        public @Unsigned int count;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_dev_bulk_queue")
    @NotUsableInJava
    public static class xdp_dev_bulk_queue
    extends Struct {
        public Ptr<xdp_frame> @Size(value=16) [] q;
        public ListDefinitions.list_head flush_node;
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<NetDefinitions.net_device> dev_rx;
        public Ptr<BpfDefinitions.bpf_prog> xdp_prog;
        public @Unsigned int count;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_rxtx_ring")
    @NotUsableInJava
    public static class xdp_rxtx_ring
    extends Struct {
        public xdp_ring ptrs;
        public xdp_desc @Size(value=0) [] desc;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_mmap_offsets_v1")
    @NotUsableInJava
    public static class xdp_mmap_offsets_v1
    extends Struct {
        public xdp_ring_offset_v1 rx;
        public xdp_ring_offset_v1 tx;
        public xdp_ring_offset_v1 fr;
        public xdp_ring_offset_v1 cr;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_ring_offset_v1")
    @NotUsableInJava
    public static class xdp_ring_offset_v1
    extends Struct {
        public @Unsigned long producer;
        public @Unsigned long consumer;
        public @Unsigned long desc;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_options")
    @NotUsableInJava
    public static class xdp_options
    extends Struct {
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_statistics")
    @NotUsableInJava
    public static class xdp_statistics
    extends Struct {
        public @Unsigned long rx_dropped;
        public @Unsigned long rx_invalid_descs;
        public @Unsigned long tx_invalid_descs;
        public @Unsigned long rx_ring_full;
        public @Unsigned long rx_fill_ring_empty_descs;
        public @Unsigned long tx_ring_empty_descs;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_mmap_offsets")
    @NotUsableInJava
    public static class xdp_mmap_offsets
    extends Struct {
        public xdp_ring_offset rx;
        public xdp_ring_offset tx;
        public xdp_ring_offset fr;
        public xdp_ring_offset cr;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_ring_offset")
    @NotUsableInJava
    public static class xdp_ring_offset
    extends Struct {
        public @Unsigned long producer;
        public @Unsigned long consumer;
        public @Unsigned long desc;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_test_data")
    @NotUsableInJava
    public static class xdp_test_data
    extends Struct {
        public Ptr<xdp_buff> orig_ctx;
        public xdp_rxq_info rxq;
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<PageDefinitions.page_pool> pp;
        public Ptr<Ptr<xdp_frame>> frames;
        public Ptr<Ptr<SkDefinitions.sk_buff>> skbs;
        public xdp_mem_info mem;
        public @Unsigned int batch_size;
        public @Unsigned int frame_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_page_head")
    @NotUsableInJava
    public static class xdp_page_head
    extends Struct {
        public xdp_buff orig_ctx;
        public xdp_buff ctx;
        @InlineUnion(value=34225)
        public  @InlineUnion(value=34225) AnonDefinitions.anon_member_of_anon_member_of_xdp_page_head anon2$0;
        @InlineUnion(value=34225)
        public  @InlineUnion(value=34225) AnonDefinitions.anon_member_of_anon_member_of_gsb_buffer_and_anon_member_of_anon_member_of_xdp_page_head anon2$1;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_mem_allocator")
    @NotUsableInJava
    public static class xdp_mem_allocator
    extends Struct {
        public xdp_mem_info mem;
        @InlineUnion(value=29217)
        public @InlineUnion(value=29217) Ptr<?> allocator;
        @InlineUnion(value=29217)
        public @InlineUnion(value=29217) Ptr<PageDefinitions.page_pool> page_pool;
        public misc.rhash_head node;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_cpumap_stats")
    @NotUsableInJava
    public static class xdp_cpumap_stats
    extends Struct {
        public @Unsigned int redirect;
        public @Unsigned int pass;
        public @Unsigned int drop;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_umem_ring")
    @NotUsableInJava
    public static class xdp_umem_ring
    extends Struct {
        public xdp_ring ptrs;
        public @Unsigned long @Size(value=0) [] desc;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_ring")
    @NotUsableInJava
    public static class xdp_ring
    extends Struct {
        public @Unsigned int producer;
        public @Unsigned int pad1;
        public @Unsigned int consumer;
        public @Unsigned int pad2;
        public @Unsigned int flags;
        public @Unsigned int pad3;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_umem_reg")
    @NotUsableInJava
    public static class xdp_umem_reg
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned long len;
        public @Unsigned int chunk_size;
        public @Unsigned int headroom;
        public @Unsigned int flags;
        public @Unsigned int tx_metadata_len;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_buff_xsk")
    @NotUsableInJava
    public static class xdp_buff_xsk
    extends Struct {
        public xdp_buff xdp;
        public char @Size(value=24) [] cb;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
        public @Unsigned @OriginalName(value="dma_addr_t") long frame_dma;
        public Ptr<XskDefinitions.xsk_buff_pool> pool;
        public @Unsigned long orig_addr;
        public ListDefinitions.list_head free_list_node;
        public ListDefinitions.list_head xskb_list_node;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_sock")
    @NotUsableInJava
    public static class xdp_sock
    extends Struct {
        public runtime.sock sk;
        public Ptr<XskDefinitions.xsk_queue> rx;
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<xdp_umem> umem;
        public ListDefinitions.list_head flush_node;
        public Ptr<XskDefinitions.xsk_buff_pool> pool;
        public @Unsigned short queue_id;
        public boolean zc;
        public boolean sg;
        public misc.state_of_xdp_sock state;
        public Ptr<XskDefinitions.xsk_queue> tx;
        public ListDefinitions.list_head tx_list;
        public @Unsigned int tx_budget_spent;
        public  @OriginalName(value="spinlock_t") runtime.spinlock rx_lock;
        public @Unsigned long rx_dropped;
        public @Unsigned long rx_queue_full;
        public Ptr<SkDefinitions.sk_buff> skb;
        public ListDefinitions.list_head map_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock map_list_lock;
        public runtime.mutex mutex;
        public Ptr<XskDefinitions.xsk_queue> fq_tmp;
        public Ptr<XskDefinitions.xsk_queue> cq_tmp;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_umem")
    @NotUsableInJava
    public static class xdp_umem
    extends Struct {
        public Ptr<?> addrs;
        public @Unsigned long size;
        public @Unsigned int headroom;
        public @Unsigned int chunk_size;
        public @Unsigned int chunks;
        public @Unsigned int npgs;
        public Ptr<UserDefinitions.user_struct> user;
        public @OriginalName(value="refcount_t") misc.refcount_struct users;
        public char flags;
        public char tx_metadata_len;
        public boolean zc;
        public Ptr<Ptr<runtime.page>> pgs;
        public int id;
        public ListDefinitions.list_head xsk_dma_list;
        public misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_desc")
    @NotUsableInJava
    public static class xdp_desc
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned int len;
        public @Unsigned int options;
    }

    @Type(noCCodeGeneration=true, cType="enum xdp_buff_flags")
    public static enum xdp_buff_flags implements Enum<xdp_buff_flags>,
    TypedEnum<xdp_buff_flags, Integer>
    {
        XDP_FLAGS_HAS_FRAGS,
        XDP_FLAGS_FRAGS_PF_MEMALLOC;

    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int headroom; short unsigned int pad[2]; }")
    @NotUsableInJava
    public static class xdp_of_u_of_xen_netif_extra_info
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short headroom;
        public @Unsigned @OriginalName(value="uint16_t") short @Size(value=2) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="enum xdp_mem_type")
    public static enum xdp_mem_type implements Enum<xdp_mem_type>,
    TypedEnum<xdp_mem_type, Integer>
    {
        MEM_TYPE_PAGE_SHARED,
        MEM_TYPE_PAGE_ORDER0,
        MEM_TYPE_PAGE_POOL,
        MEM_TYPE_XSK_BUFF_POOL,
        MEM_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum xdp_action")
    public static enum xdp_action implements Enum<xdp_action>,
    TypedEnum<xdp_action, Integer>
    {
        XDP_ABORTED,
        XDP_DROP,
        XDP_PASS,
        XDP_TX,
        XDP_REDIRECT;

    }

    @Type(noCCodeGeneration=true, cType="enum xdp_rx_metadata")
    public static enum xdp_rx_metadata implements Enum<xdp_rx_metadata>,
    TypedEnum<xdp_rx_metadata, Integer>
    {
        XDP_METADATA_KFUNC_RX_TIMESTAMP,
        XDP_METADATA_KFUNC_RX_HASH,
        XDP_METADATA_KFUNC_RX_VLAN_TAG,
        MAX_XDP_METADATA_KFUNC;

    }

    @Type(noCCodeGeneration=true, cType="enum xdp_rss_hash_type")
    public static enum xdp_rss_hash_type implements Enum<xdp_rss_hash_type>,
    TypedEnum<xdp_rss_hash_type, Integer>
    {
        XDP_RSS_L3_IPV4,
        XDP_RSS_L3_IPV6,
        XDP_RSS_L3_DYNHDR,
        XDP_RSS_L4,
        XDP_RSS_L4_TCP,
        XDP_RSS_L4_UDP,
        XDP_RSS_L4_SCTP,
        XDP_RSS_L4_IPSEC,
        XDP_RSS_L4_ICMP,
        XDP_RSS_TYPE_NONE,
        XDP_RSS_TYPE_L2,
        XDP_RSS_TYPE_L3_IPV4,
        XDP_RSS_TYPE_L3_IPV6,
        XDP_RSS_TYPE_L3_IPV4_OPT,
        XDP_RSS_TYPE_L3_IPV6_EX,
        XDP_RSS_TYPE_L4_ANY,
        XDP_RSS_TYPE_L4_IPV4_TCP,
        XDP_RSS_TYPE_L4_IPV4_UDP,
        XDP_RSS_TYPE_L4_IPV4_SCTP,
        XDP_RSS_TYPE_L4_IPV4_IPSEC,
        XDP_RSS_TYPE_L4_IPV4_ICMP,
        XDP_RSS_TYPE_L4_IPV6_TCP,
        XDP_RSS_TYPE_L4_IPV6_UDP,
        XDP_RSS_TYPE_L4_IPV6_SCTP,
        XDP_RSS_TYPE_L4_IPV6_IPSEC,
        XDP_RSS_TYPE_L4_IPV6_ICMP,
        XDP_RSS_TYPE_L4_IPV6_TCP_EX,
        XDP_RSS_TYPE_L4_IPV6_UDP_EX,
        XDP_RSS_TYPE_L4_IPV6_SCTP_EX;

    }

    @Type(noCCodeGeneration=true, cType="struct xdp_txq_info")
    @NotUsableInJava
    public static class xdp_txq_info
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_rxq_info")
    @NotUsableInJava
    public static class xdp_rxq_info
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @Unsigned int queue_index;
        public @Unsigned int reg_state;
        public xdp_mem_info mem;
        public @Unsigned int napi_id;
        public @Unsigned int frag_size;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_mem_info")
    @NotUsableInJava
    public static class xdp_mem_info
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_buff")
    @NotUsableInJava
    public static class xdp_buff
    extends Struct {
        public Ptr<?> data;
        public Ptr<?> data_end;
        public Ptr<?> data_meta;
        public Ptr<?> data_hard_start;
        public Ptr<xdp_rxq_info> rxq;
        public Ptr<xdp_txq_info> txq;
        public @Unsigned int frame_sz;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_frame")
    @NotUsableInJava
    public static class xdp_frame
    extends Struct {
        public Ptr<?> data;
        public @Unsigned short len;
        public @Unsigned short headroom;
        public @Unsigned int metasize;
        public xdp_mem_info mem;
        public Ptr<NetDefinitions.net_device> dev_rx;
        public @Unsigned int frame_sz;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_md")
    @NotUsableInJava
    public static class xdp_md
    extends Struct {
        public @Unsigned int data;
        public @Unsigned int data_end;
        public @Unsigned int data_meta;
        public @Unsigned int ingress_ifindex;
        public @Unsigned int rx_queue_index;
        public @Unsigned int egress_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="struct xdp_metadata_ops")
    @NotUsableInJava
    public static class xdp_metadata_ops
    extends Struct {
        public Ptr<?> xmo_rx_timestamp;
        public Ptr<?> xmo_rx_hash;
        public Ptr<?> xmo_rx_vlan_tag;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int ifindex; }")
    @NotUsableInJava
    public static class xdp_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned int ifindex;
    }
}

