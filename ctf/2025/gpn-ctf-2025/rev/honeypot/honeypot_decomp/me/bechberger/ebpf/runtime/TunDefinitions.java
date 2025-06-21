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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.RtnlDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TunDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __tun_build_skb(Ptr<tun_file> tfile, Ptr<PageDefinitions.page_frag> alloc_frag, String buf, int buflen, int len, int pad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __tun_chr_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2, int ifreq_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tun_detach(Ptr<tun_file> tfile, boolean clean) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tun_set_ebpf(Ptr<tun_struct> tun, Ptr<Ptr<tun_prog>> prog_p, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> tun_build_skb(Ptr<tun_struct> tun, Ptr<tun_file> tfile, Ptr<IovDefinitions.iov_iter> from, Ptr<VirtioDefinitions.virtio_net_hdr> hdr, int len, Ptr<Integer> skb_xdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_chr_close(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long tun_chr_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_chr_fasync(int fd2, Ptr<runtime.file> file2, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long tun_chr_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_chr_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int tun_chr_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tun_chr_read_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_chr_show_fdinfo(Ptr<SeqDefinitions.seq_file> m, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tun_chr_write_iter(Ptr<runtime.kiocb> iocb2, Ptr<IovDefinitions.iov_iter> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_detach_all(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_device_event(Ptr<misc.notifier_block> unused, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tun_do_read(Ptr<tun_struct> tun, Ptr<tun_file> tfile, Ptr<IovDefinitions.iov_iter> to, int noblock, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tun_fill_info($arg1, (const struct net_device*)$arg2)")
    public static int tun_fill_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tun_flags_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_flow_cleanup(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_flow_delete(Ptr<tun_struct> tun, Ptr<tun_flow_entry> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_flow_flush(Ptr<tun_struct> tun) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_flow_update(Ptr<tun_struct> tun, @Unsigned int rxhash, Ptr<tun_file> tfile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_free_netdev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_get_channels(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_channels> channels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_get_coalesce(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_coalesce> ec, Ptr<KernelDefinitions.kernel_ethtool_coalesce> kernel_coal, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_get_drvinfo(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_drvinfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_get_iff(Ptr<tun_struct> tun, Ptr<runtime.ifreq> ifr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_get_link_ksettings(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_link_ksettings> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tun_get_msglevel(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tun_get_size((const struct net_device*)$arg1)")
    public static @Unsigned long tun_get_size(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.socket> tun_get_socket(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ptr_ring> tun_get_tx_ring(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tun_get_user(Ptr<tun_struct> tun, Ptr<tun_file> tfile, Ptr<?> msg_control, Ptr<IovDefinitions.iov_iter> from, int noblock, boolean more) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tun_napi_alloc_frags($arg1, $arg2, (const struct iov_iter*)$arg3)")
    public static Ptr<SkDefinitions.sk_buff> tun_napi_alloc_frags(Ptr<tun_file> tfile, @Unsigned long len, Ptr<IovDefinitions.iov_iter> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_napi_poll(Ptr<NapiDefinitions.napi_struct> napi, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_net_change_carrier(Ptr<NetDefinitions.net_device> dev, boolean new_carrier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_net_close(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netdev_features_t") long tun_net_fix_features(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_net_get_stats64(Ptr<NetDefinitions.net_device> dev, Ptr<RtnlDefinitions.rtnl_link_stats64> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_net_init(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_net_mclist(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_net_open(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_net_uninit(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx tun_net_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_peek_len(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_prog_free(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_ptr_free(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_queue_purge(Ptr<tun_file> tfile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> m, @Unsigned long total_len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tun_ring_recv(Ptr<tun_file> tfile, int noblock, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short tun_select_queue(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> sb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> m, @Unsigned long total_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_set_coalesce(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_coalesce> ec, Ptr<KernelDefinitions.kernel_ethtool_coalesce> kernel_coal, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_set_ebpf(Ptr<tun_struct> tun, Ptr<Ptr<tun_prog>> prog_p, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_set_headroom(Ptr<NetDefinitions.net_device> dev, int new_hr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_set_iff(Ptr<runtime.net> net2, Ptr<runtime.file> file2, Ptr<runtime.ifreq> ifr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tun_set_link_ksettings($arg1, (const struct ethtool_link_ksettings*)$arg2)")
    public static int tun_set_link_ksettings(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_link_ksettings> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_set_msglevel(Ptr<NetDefinitions.net_device> dev, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_setup(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tun_sock_write_space(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_validate(Ptr<Ptr<runtime.nlattr>> tb, Ptr<Ptr<runtime.nlattr>> data, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_xdp(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_bpf> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_xdp_act(Ptr<tun_struct> tun, Ptr<BpfDefinitions.bpf_prog> xdp_prog, Ptr<XdpDefinitions.xdp_buff> xdp2, @Unsigned int act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_xdp_one(Ptr<tun_struct> tun, Ptr<tun_file> tfile, Ptr<XdpDefinitions.xdp_buff> xdp2, Ptr<Integer> flush, Ptr<tun_page> tpage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tun_xdp_xmit(Ptr<NetDefinitions.net_device> dev, int n, Ptr<Ptr<XdpDefinitions.xdp_frame>> frames, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tun_security_struct")
    @NotUsableInJava
    public static class tun_security_struct
    extends Struct {
        public @Unsigned int sid;
    }

    @Type(noCCodeGeneration=true, cType="struct tun_prog")
    @NotUsableInJava
    public static class tun_prog
    extends Struct {
        public misc.callback_head rcu;
        public Ptr<BpfDefinitions.bpf_prog> prog;
    }

    @Type(noCCodeGeneration=true, cType="struct tun_flow_entry")
    @NotUsableInJava
    public static class tun_flow_entry
    extends Struct {
        public misc.hlist_node hash_link;
        public misc.callback_head rcu;
        public Ptr<tun_struct> tun;
        public @Unsigned int rxhash;
        public @Unsigned int rps_rxhash;
        public int queue_index;
        public @Unsigned long updated;
    }

    @Type(noCCodeGeneration=true, cType="struct tun_page")
    @NotUsableInJava
    public static class tun_page
    extends Struct {
        public Ptr<runtime.page> page;
        public int count;
    }

    @Type(noCCodeGeneration=true, cType="struct tun_struct")
    @NotUsableInJava
    public static class tun_struct
    extends Struct {
        public Ptr<tun_file> @Size(value=256) [] tfiles;
        public @Unsigned int numqueues;
        public @Unsigned int flags;
        public misc.kuid_t owner;
        public misc.kgid_t group;
        public Ptr<NetDefinitions.net_device> dev;
        public @Unsigned @OriginalName(value="netdev_features_t") long set_features;
        public int align;
        public int vnet_hdr_sz;
        public int sndbuf;
        public misc.tap_filter txflt;
        public SockDefinitions.sock_fprog fprog;
        public boolean filter_attached;
        public @Unsigned int msg_enable;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.hlist_head @Size(value=1024) [] flows;
        public TimerDefinitions.timer_list flow_gc_timer;
        public @Unsigned long ageing_time;
        public @Unsigned int numdisabled;
        public ListDefinitions.list_head disabled;
        public Ptr<?> security;
        public @Unsigned int flow_count;
        public @Unsigned int rx_batched;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t rx_frame_errors;
        public Ptr<BpfDefinitions.bpf_prog> xdp_prog;
        public Ptr<tun_prog> steering_prog;
        public Ptr<tun_prog> filter_prog;
        public EthtoolDefinitions.ethtool_link_ksettings link_ksettings;
        public Ptr<runtime.file> file;
        public Ptr<runtime.ifreq> ifr;
    }

    @Type(noCCodeGeneration=true, cType="struct tun_file")
    @NotUsableInJava
    public static class tun_file
    extends Struct {
        public runtime.sock sk;
        public runtime.socket socket;
        public Ptr<tun_struct> tun;
        public Ptr<misc.fasync_struct> fasync;
        public @Unsigned int flags;
        @InlineUnion(value=32819)
        public @InlineUnion(value=32819) @Unsigned short queue_index;
        @InlineUnion(value=32819)
        public @InlineUnion(value=32819) @Unsigned int ifindex;
        public NapiDefinitions.napi_struct napi;
        public boolean napi_enabled;
        public boolean napi_frags_enabled;
        public runtime.mutex napi_mutex;
        public ListDefinitions.list_head next;
        public Ptr<tun_struct> detached;
        public misc.ptr_ring tx_ring;
        public XdpDefinitions.xdp_rxq_info xdp_rxq;
    }

    @Type(noCCodeGeneration=true, cType="struct tun_xdp_hdr")
    @NotUsableInJava
    public static class tun_xdp_hdr
    extends Struct {
        public int buflen;
        public VirtioDefinitions.virtio_net_hdr gso;
    }

    @Type(noCCodeGeneration=true, cType="struct tun_msg_ctl")
    @NotUsableInJava
    public static class tun_msg_ctl
    extends Struct {
        public @Unsigned short type;
        public @Unsigned short num;
        public Ptr<?> ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct tun_filter")
    @NotUsableInJava
    public static class tun_filter
    extends Struct {
        public @Unsigned short flags;
        public @Unsigned short count;
        public char @Size(value=0) [] addr;
    }

    @Type(noCCodeGeneration=true, cType="struct tun_pi")
    @NotUsableInJava
    public static class tun_pi
    extends Struct {
        public @Unsigned short flags;
        public @Unsigned @OriginalName(value="__be16") short proto;
    }
}

