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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.RtnlDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PppDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ppp_channel_push(Ptr<channel> pch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ppp_xmit_process(Ptr<runtime.ppp> ppp2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_ccp_closed(Ptr<runtime.ppp> ppp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_ccp_peek(Ptr<runtime.ppp> ppp2, Ptr<SkDefinitions.sk_buff> skb, int inbound) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_channel_index(Ptr<ppp_channel> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_channel_push(Ptr<channel> pch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ppp_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ppp_decompress_frame(Ptr<runtime.ppp> ppp2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_destroy_channel(Ptr<channel> pch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_destroy_interface(Ptr<runtime.ppp> ppp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ppp_dev_configure($arg1, $arg2, (const struct ppp_config*)$arg3)")
    public static int ppp_dev_configure(Ptr<runtime.net> src_net, Ptr<NetDefinitions.net_device> dev, Ptr<ppp_config> conf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_dev_init(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String ppp_dev_name(Ptr<ppp_channel> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_dev_priv_destructor(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_dev_uninit(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_disconnect_channel(Ptr<channel> pch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_fill_forward_path(Ptr<NetDefinitions.net_device_path_ctx> ctx, Ptr<NetDefinitions.net_device_path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<channel> ppp_find_channel(Ptr<ppp_net> pn2, int unit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_get_stats64(Ptr<NetDefinitions.net_device> dev, Ptr<RtnlDefinitions.rtnl_link_stats64> stats64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_input(Ptr<ppp_channel> chan, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_input_error(Ptr<ppp_channel> chan, int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ppp_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_mp_explode(Ptr<runtime.ppp> ppp2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ppp_mp_reconstruct(Ptr<runtime.ppp> ppp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_net_siocdevprivate(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.ifreq> ifr, Ptr<?> addr2, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_nl_dellink(Ptr<NetDefinitions.net_device> dev, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ppp_nl_fill_info($arg1, (const struct net_device*)$arg2)")
    public static int ppp_nl_fill_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ppp_nl_get_link_net((const struct net_device*)$arg1)")
    public static Ptr<runtime.net> ppp_nl_get_link_net(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ppp_nl_get_size((const struct net_device*)$arg1)")
    public static @Unsigned long ppp_nl_get_size(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_nl_newlink(Ptr<runtime.net> src_net, Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<runtime.nlattr>> tb, Ptr<Ptr<runtime.nlattr>> data, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_nl_validate(Ptr<Ptr<runtime.nlattr>> tb, Ptr<Ptr<runtime.nlattr>> data, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_output_wakeup(Ptr<ppp_channel> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int ppp_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_push(Ptr<runtime.ppp> ppp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ppp_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_receive_frame(Ptr<runtime.ppp> ppp2, Ptr<SkDefinitions.sk_buff> skb, Ptr<channel> pch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_receive_mp_frame(Ptr<runtime.ppp> ppp2, Ptr<SkDefinitions.sk_buff> skb, Ptr<channel> pch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_receive_nonmp_frame(Ptr<runtime.ppp> ppp2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_register_channel(Ptr<ppp_channel> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_register_compressor(Ptr<runtime.compressor> cp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_register_net_channel(Ptr<runtime.net> net2, Ptr<ppp_channel> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_release(Ptr<runtime.inode> unused, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_send_frame(Ptr<runtime.ppp> ppp2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_set_compress(Ptr<runtime.ppp> ppp2, Ptr<ppp_option_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_setup(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx ppp_start_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_unbridge_channels(Ptr<channel> pch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_unit_number(Ptr<ppp_channel> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ppp_unit_register(Ptr<runtime.ppp> ppp2, int unit, boolean ifname_is_set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_unregister_channel(Ptr<ppp_channel> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_unregister_compressor(Ptr<runtime.compressor> cp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ppp_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ppp_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ppp_xmit_process(Ptr<runtime.ppp> ppp2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct channel")
    @NotUsableInJava
    public static class channel
    extends Struct {
        public ppp_file file;
        public ListDefinitions.list_head list;
        public Ptr<ppp_channel> chan;
        public misc.rw_semaphore chan_sem;
        public  @OriginalName(value="spinlock_t") runtime.spinlock downl;
        public Ptr<runtime.ppp> ppp;
        public Ptr<runtime.net> chan_net;
        public @OriginalName(value="netns_tracker") misc.lockdep_map_p ns_tracker;
        public ListDefinitions.list_head clist;
        public misc.rwlock_t upl;
        public Ptr<channel> bridge;
        public char avail;
        public char had_frag;
        public @Unsigned int lastseq;
        public int speed;
    }

    @Type(noCCodeGeneration=true, cType="struct compstat")
    @NotUsableInJava
    public static class compstat
    extends Struct {
        public @Unsigned int unc_bytes;
        public @Unsigned int unc_packets;
        public @Unsigned int comp_bytes;
        public @Unsigned int comp_packets;
        public @Unsigned int inc_bytes;
        public @Unsigned int inc_packets;
        public @Unsigned int in_count;
        public @Unsigned int bytes_out;
        public double ratio;
    }

    @Type(noCCodeGeneration=true, cType="struct pppstat")
    @NotUsableInJava
    public static class pppstat
    extends Struct {
        public @Unsigned int ppp_discards;
        public @Unsigned int ppp_ibytes;
        public @Unsigned int ppp_ioctects;
        public @Unsigned int ppp_ipackets;
        public @Unsigned int ppp_ierrors;
        public @Unsigned int ppp_ilqrs;
        public @Unsigned int ppp_obytes;
        public @Unsigned int ppp_ooctects;
        public @Unsigned int ppp_opackets;
        public @Unsigned int ppp_oerrors;
        public @Unsigned int ppp_olqrs;
    }

    @Type(noCCodeGeneration=true, cType="struct vjstat")
    @NotUsableInJava
    public static class vjstat
    extends Struct {
        public @Unsigned int vjs_packets;
        public @Unsigned int vjs_compressed;
        public @Unsigned int vjs_searches;
        public @Unsigned int vjs_misses;
        public @Unsigned int vjs_uncompressedin;
        public @Unsigned int vjs_compressedin;
        public @Unsigned int vjs_errorin;
        public @Unsigned int vjs_tossed;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_mp_skb_parm")
    @NotUsableInJava
    public static class ppp_mp_skb_parm
    extends Struct {
        public @Unsigned int sequence;
        public char BEbits;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_option_data32")
    @NotUsableInJava
    public static class ppp_option_data32
    extends Struct {
        public @Unsigned @OriginalName(value="compat_uptr_t") int ptr;
        public @Unsigned int length;
        public @OriginalName(value="compat_int_t") int transmit;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_net")
    @NotUsableInJava
    public static class ppp_net
    extends Struct {
        public runtime.idr units_idr;
        public runtime.mutex all_ppp_mutex;
        public ListDefinitions.list_head all_channels;
        public ListDefinitions.list_head new_channels;
        public int last_channel_index;
        public  @OriginalName(value="spinlock_t") runtime.spinlock all_channels_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_config")
    @NotUsableInJava
    public static class ppp_config
    extends Struct {
        public Ptr<runtime.file> file;
        public int unit;
        public boolean ifname_is_set;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_link_stats")
    @NotUsableInJava
    public static class ppp_link_stats
    extends Struct {
        public @Unsigned long rx_packets;
        public @Unsigned long tx_packets;
        public @Unsigned long rx_bytes;
        public @Unsigned long tx_bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_file")
    @NotUsableInJava
    public static class ppp_file
    extends Struct {
        public misc.kind_of_ppp_file kind;
        public SkDefinitions.sk_buff_head xq;
        public SkDefinitions.sk_buff_head rq;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head rwait;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public int hdrlen;
        public int index;
        public int dead;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_channel")
    @NotUsableInJava
    public static class ppp_channel
    extends Struct {
        public Ptr<?> _private;
        public Ptr<ppp_channel_ops> ops;
        public int mtu;
        public int hdrlen;
        public Ptr<?> ppp;
        public int speed;
        public int latency;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_channel_ops")
    @NotUsableInJava
    public static class ppp_channel_ops
    extends Struct {
        public Ptr<?> start_xmit;
        public Ptr<?> ioctl;
        public Ptr<?> fill_forward_path;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_option_data")
    @NotUsableInJava
    public static class ppp_option_data
    extends Struct {
        public Ptr<Character> ptr;
        public @Unsigned int length;
        public int transmit;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_idle64")
    @NotUsableInJava
    public static class ppp_idle64
    extends Struct {
        public long xmit_idle;
        public long recv_idle;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_idle32")
    @NotUsableInJava
    public static class ppp_idle32
    extends Struct {
        public int xmit_idle;
        public int recv_idle;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_comp_stats")
    @NotUsableInJava
    public static class ppp_comp_stats
    extends Struct {
        public compstat c;
        public compstat d;
    }

    @Type(noCCodeGeneration=true, cType="struct ppp_stats")
    @NotUsableInJava
    public static class ppp_stats
    extends Struct {
        public pppstat p;
        public vjstat vj;
    }
}

