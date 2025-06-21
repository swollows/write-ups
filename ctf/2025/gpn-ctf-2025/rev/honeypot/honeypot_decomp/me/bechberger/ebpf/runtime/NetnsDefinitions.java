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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.IcmpDefinitions;
import me.bechberger.ebpf.runtime.Icmpv6Definitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.Ioam6Definitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.Ipv4Definitions;
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LocalDefinitions;
import me.bechberger.ebpf.runtime.MptcpDefinitions;
import me.bechberger.ebpf.runtime.NfDefinitions;
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.PingDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.Rt6Definitions;
import me.bechberger.ebpf.runtime.Seg6Definitions;
import me.bechberger.ebpf.runtime.SysctlDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TcpDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UdpDefinitions;
import me.bechberger.ebpf.runtime.UnixDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NetnsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netns_bpf_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netns_bpf_link_create((const union bpf_attr*)$arg1, $arg2)")
    public static int netns_bpf_link_create(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netns_bpf_pernet_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netns_bpf_pernet_pre_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netns_bpf_prog_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int netns_bpf_prog_attach(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netns_bpf_prog_detach((const union bpf_attr*)$arg1, $arg2)")
    public static int netns_bpf_prog_detach(Ptr<BpfDefinitions.bpf_attr> attr2, BpfDefinitions.bpf_prog_type ptype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netns_bpf_prog_query((const union bpf_attr*)$arg1, $arg2)")
    public static int netns_bpf_prog_query(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NsDefinitions.ns_common> netns_get(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netns_install(Ptr<runtime.nsset> nsset2, Ptr<NsDefinitions.ns_common> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netns_ip_rt_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<UserDefinitions.user_namespace> netns_owner(Ptr<NsDefinitions.ns_common> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netns_put(Ptr<NsDefinitions.ns_common> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int netns_ino; unsigned int attach_type; }")
    @NotUsableInJava
    public static class netns_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned int netns_ino;
        public @Unsigned int attach_type;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_mctp")
    @NotUsableInJava
    public static class netns_mctp
    extends Struct {
        public ListDefinitions.list_head routes;
        public runtime.mutex bind_lock;
        public misc.hlist_head binds;
        public  @OriginalName(value="spinlock_t") runtime.spinlock keys_lock;
        public misc.hlist_head keys;
        public @Unsigned int default_net;
        public runtime.mutex neigh_lock;
        public ListDefinitions.list_head neighbours;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_bpf")
    @NotUsableInJava
    public static class netns_bpf
    extends Struct {
        public Ptr<BpfDefinitions.bpf_prog_array> @Size(value=2) [] run_array;
        public Ptr<BpfDefinitions.bpf_prog> @Size(value=2) [] progs;
        public ListDefinitions.list_head @Size(value=2) [] links;
    }

    @Type(noCCodeGeneration=true, cType="enum netns_bpf_attach_type")
    public static enum netns_bpf_attach_type implements Enum<netns_bpf_attach_type>,
    TypedEnum<netns_bpf_attach_type, Integer>
    {
        NETNS_BPF_INVALID,
        NETNS_BPF_FLOW_DISSECTOR,
        NETNS_BPF_SK_LOOKUP,
        MAX_NETNS_BPF_ATTACH_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="struct netns_smc")
    @NotUsableInJava
    public static class netns_smc
    extends Struct {
        public @OriginalName(value="smc_stats") Ptr<?> smc_stats;
        public runtime.mutex mutex_fback_rsn;
        public @OriginalName(value="smc_stats_rsn") Ptr<?> fback_rsn;
        public boolean limit_smc_hs;
        public Ptr<misc.ctl_table_header> smc_hdr;
        public @Unsigned int sysctl_autocorking_size;
        public @Unsigned int sysctl_smcr_buf_type;
        public int sysctl_smcr_testlink_time;
        public int sysctl_wmem;
        public int sysctl_rmem;
        public int sysctl_max_links_per_lgr;
        public int sysctl_max_conns_per_lgr;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_xdp")
    @NotUsableInJava
    public static class netns_xdp
    extends Struct {
        public runtime.mutex lock;
        public misc.hlist_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_can")
    @NotUsableInJava
    public static class netns_can
    extends Struct {
        public Ptr<ProcDefinitions.proc_dir_entry> proc_dir;
        public Ptr<ProcDefinitions.proc_dir_entry> pde_stats;
        public Ptr<ProcDefinitions.proc_dir_entry> pde_reset_stats;
        public Ptr<ProcDefinitions.proc_dir_entry> pde_rcvlist_all;
        public Ptr<ProcDefinitions.proc_dir_entry> pde_rcvlist_fil;
        public Ptr<ProcDefinitions.proc_dir_entry> pde_rcvlist_inv;
        public Ptr<ProcDefinitions.proc_dir_entry> pde_rcvlist_sff;
        public Ptr<ProcDefinitions.proc_dir_entry> pde_rcvlist_eff;
        public Ptr<ProcDefinitions.proc_dir_entry> pde_rcvlist_err;
        public Ptr<ProcDefinitions.proc_dir_entry> bcmproc_dir;
        public @OriginalName(value="can_dev_rcv_lists") Ptr<?> rx_alldev_list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock rcvlists_lock;
        public TimerDefinitions.timer_list stattimer;
        public @OriginalName(value="can_pkg_stats") Ptr<?> pkg_stats;
        public @OriginalName(value="can_rcv_lists_stats") Ptr<?> rcv_lists_stats;
        public misc.hlist_head cgw_list;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_mpls")
    @NotUsableInJava
    public static class netns_mpls
    extends Struct {
        public int ip_ttl_propagate;
        public int default_ttl;
        public @Unsigned long platform_labels;
        public Ptr<@OriginalName(value="mpls_route") Ptr<?>> platform_label;
        public Ptr<misc.ctl_table_header> ctl;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_xfrm")
    @NotUsableInJava
    public static class netns_xfrm
    extends Struct {
        public ListDefinitions.list_head state_all;
        public Ptr<misc.hlist_head> state_bydst;
        public Ptr<misc.hlist_head> state_bysrc;
        public Ptr<misc.hlist_head> state_byspi;
        public Ptr<misc.hlist_head> state_byseq;
        public @Unsigned int state_hmask;
        public @Unsigned int state_num;
        public misc.work_struct state_hash_work;
        public ListDefinitions.list_head policy_all;
        public Ptr<misc.hlist_head> policy_byidx;
        public @Unsigned int policy_idx_hmask;
        public @Unsigned int idx_generator;
        public XfrmDefinitions.xfrm_policy_hash @Size(value=3) [] policy_bydst;
        public @Unsigned int @Size(value=6) [] policy_count;
        public misc.work_struct policy_hash_work;
        public XfrmDefinitions.xfrm_policy_hthresh policy_hthresh;
        public ListDefinitions.list_head inexact_bins;
        public Ptr<runtime.sock> nlsk;
        public Ptr<runtime.sock> nlsk_stash;
        public @Unsigned int sysctl_aevent_etime;
        public @Unsigned int sysctl_aevent_rseqth;
        public int sysctl_larval_drop;
        public @Unsigned int sysctl_acq_expires;
        public char @Size(value=3) [] policy_default;
        public Ptr<misc.ctl_table_header> sysctl_hdr;
        public DstDefinitions.dst_ops xfrm4_dst_ops;
        public DstDefinitions.dst_ops xfrm6_dst_ops;
        public  @OriginalName(value="spinlock_t") runtime.spinlock xfrm_state_lock;
        public  @OriginalName(value="seqcount_spinlock_t") misc.seqcount_spinlock xfrm_state_hash_generation;
        public  @OriginalName(value="seqcount_spinlock_t") misc.seqcount_spinlock xfrm_policy_hash_generation;
        public  @OriginalName(value="spinlock_t") runtime.spinlock xfrm_policy_lock;
        public runtime.mutex xfrm_cfg_mutex;
        public DelayedDefinitions.delayed_work nat_keepalive_work;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_nftables")
    @NotUsableInJava
    public static class netns_nftables
    extends Struct {
        public char gencursor;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_ft")
    @NotUsableInJava
    public static class netns_ft
    extends Struct {
        public Ptr<NfDefinitions.nf_flow_table_stat> stat;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_ct")
    @NotUsableInJava
    public static class netns_ct
    extends Struct {
        public boolean ecache_dwork_pending;
        public char sysctl_log_invalid;
        public char sysctl_events;
        public char sysctl_acct;
        public char sysctl_tstamp;
        public char sysctl_checksum;
        public Ptr<IpDefinitions.ip_conntrack_stat> stat;
        public Ptr<NfDefinitions.nf_ct_event_notifier> nf_conntrack_event_cb;
        public NfDefinitions.nf_ip_net nf_ct_proto;
        public AtomicDefinitions.atomic_t labels_used;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_nf")
    @NotUsableInJava
    public static class netns_nf
    extends Struct {
        public Ptr<ProcDefinitions.proc_dir_entry> proc_netfilter;
        public Ptr<NfDefinitions.nf_logger> @Size(value=11) [] nf_loggers;
        public Ptr<misc.ctl_table_header> nf_log_dir_header;
        public Ptr<misc.ctl_table_header> nf_lwtnl_dir_header;
        public Ptr<NfDefinitions.nf_hook_entries> @Size(value=5) [] hooks_ipv4;
        public Ptr<NfDefinitions.nf_hook_entries> @Size(value=5) [] hooks_ipv6;
        public Ptr<NfDefinitions.nf_hook_entries> @Size(value=3) [] hooks_arp;
        public Ptr<NfDefinitions.nf_hook_entries> @Size(value=5) [] hooks_bridge;
        public @Unsigned int defrag_ipv4_users;
        public @Unsigned int defrag_ipv6_users;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_sctp")
    @NotUsableInJava
    public static class netns_sctp
    extends Struct {
        public @OriginalName(value="sctp_mib") Ptr<?> sctp_statistics;
        public Ptr<ProcDefinitions.proc_dir_entry> proc_net_sctp;
        public Ptr<misc.ctl_table_header> sysctl_header;
        public Ptr<runtime.sock> ctl_sock;
        public Ptr<runtime.sock> udp4_sock;
        public Ptr<runtime.sock> udp6_sock;
        public int udp_port;
        public int encap_port;
        public ListDefinitions.list_head local_addr_list;
        public ListDefinitions.list_head addr_waitq;
        public TimerDefinitions.timer_list addr_wq_timer;
        public ListDefinitions.list_head auto_asconf_splist;
        public  @OriginalName(value="spinlock_t") runtime.spinlock addr_wq_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock local_addr_lock;
        public @Unsigned int rto_initial;
        public @Unsigned int rto_min;
        public @Unsigned int rto_max;
        public int rto_alpha;
        public int rto_beta;
        public int max_burst;
        public int cookie_preserve_enable;
        public String sctp_hmac_alg;
        public @Unsigned int valid_cookie_life;
        public @Unsigned int sack_timeout;
        public @Unsigned int hb_interval;
        public @Unsigned int probe_interval;
        public int max_retrans_association;
        public int max_retrans_path;
        public int max_retrans_init;
        public int pf_retrans;
        public int ps_retrans;
        public int pf_enable;
        public int pf_expose;
        public int sndbuf_policy;
        public int rcvbuf_policy;
        public int default_auto_asconf;
        public int addip_enable;
        public int addip_noauth;
        public int prsctp_enable;
        public int reconf_enable;
        public int auth_enable;
        public int intl_enable;
        public int ecn_enable;
        public int scope_policy;
        public int rwnd_upd_shift;
        public @Unsigned long max_autoclose;
        public int l3mdev_accept;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_ieee802154_lowpan")
    @NotUsableInJava
    public static class netns_ieee802154_lowpan
    extends Struct {
        public netns_sysctl_lowpan sysctl;
        public Ptr<runtime.fqdir> fqdir;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_sysctl_lowpan")
    @NotUsableInJava
    public static class netns_sysctl_lowpan
    extends Struct {
        public Ptr<misc.ctl_table_header> frags_hdr;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_nexthop")
    @NotUsableInJava
    public static class netns_nexthop
    extends Struct {
        public RbDefinitions.rb_root rb_root;
        public Ptr<misc.hlist_head> devhash;
        public @Unsigned int seq;
        public @Unsigned int last_id_allocated;
        public misc.blocking_notifier_head notifier_chain;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_ipv6")
    @NotUsableInJava
    public static class netns_ipv6
    extends Struct {
        public DstDefinitions.dst_ops ip6_dst_ops;
        public netns_sysctl_ipv6 sysctl;
        public Ptr<Ipv6Definitions.ipv6_devconf> devconf_all;
        public Ptr<Ipv6Definitions.ipv6_devconf> devconf_dflt;
        public Ptr<InetDefinitions.inet_peer_base> peers;
        public Ptr<runtime.fqdir> fqdir;
        public Ptr<Fib6Definitions.fib6_info> fib6_null_entry;
        public Ptr<Rt6Definitions.rt6_info> ip6_null_entry;
        public Ptr<Rt6Definitions.rt6_statistics> rt6_stats;
        public TimerDefinitions.timer_list ip6_fib_timer;
        public Ptr<misc.hlist_head> fib_table_hash;
        public Ptr<Fib6Definitions.fib6_table> fib6_main_tbl;
        public ListDefinitions.list_head fib6_walkers;
        public misc.rwlock_t fib6_walker_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock fib6_gc_lock;
        public AtomicDefinitions.atomic_t ip6_rt_gc_expire;
        public @Unsigned long ip6_rt_last_gc;
        public char flowlabel_has_excl;
        public boolean fib6_has_custom_rules;
        public @Unsigned int fib6_rules_require_fldissect;
        public @Unsigned int fib6_routes_require_src;
        public Ptr<Rt6Definitions.rt6_info> ip6_prohibit_entry;
        public Ptr<Rt6Definitions.rt6_info> ip6_blk_hole_entry;
        public Ptr<Fib6Definitions.fib6_table> fib6_local_tbl;
        public Ptr<FibDefinitions.fib_rules_ops> fib6_rules_ops;
        public Ptr<runtime.sock> ndisc_sk;
        public Ptr<runtime.sock> tcp_sk;
        public Ptr<runtime.sock> igmp_sk;
        public Ptr<runtime.sock> mc_autojoin_sk;
        public Ptr<misc.hlist_head> inet6_addr_lst;
        public  @OriginalName(value="spinlock_t") runtime.spinlock addrconf_hash_lock;
        public DelayedDefinitions.delayed_work addr_chk_work;
        public ListDefinitions.list_head mr6_tables;
        public Ptr<FibDefinitions.fib_rules_ops> mr6_rules_ops;
        public AtomicDefinitions.atomic_t dev_addr_genid;
        public AtomicDefinitions.atomic_t fib6_sernum;
        public Ptr<Seg6Definitions.seg6_pernet_data> seg6_data;
        public Ptr<FibDefinitions.fib_notifier_ops> notifier_ops;
        public Ptr<FibDefinitions.fib_notifier_ops> ip6mr_notifier_ops;
        public @Unsigned int ipmr_seq;
        public misc.ip6addrlbl_table_of_netns_ipv6 ip6addrlbl_table;
        public Ptr<Ioam6Definitions.ioam6_pernet_data> ioam6_data;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_sysctl_ipv6")
    @NotUsableInJava
    public static class netns_sysctl_ipv6
    extends Struct {
        public Ptr<misc.ctl_table_header> hdr;
        public Ptr<misc.ctl_table_header> route_hdr;
        public Ptr<misc.ctl_table_header> icmp_hdr;
        public Ptr<misc.ctl_table_header> frags_hdr;
        public Ptr<misc.ctl_table_header> xfrm6_hdr;
        public int flush_delay;
        public int ip6_rt_max_size;
        public int ip6_rt_gc_min_interval;
        public int ip6_rt_gc_timeout;
        public int ip6_rt_gc_interval;
        public int ip6_rt_gc_elasticity;
        public int ip6_rt_mtu_expires;
        public int ip6_rt_min_advmss;
        public @Unsigned int multipath_hash_fields;
        public char multipath_hash_policy;
        public char bindv6only;
        public char flowlabel_consistency;
        public char auto_flowlabels;
        public int icmpv6_time;
        public char icmpv6_echo_ignore_all;
        public char icmpv6_echo_ignore_multicast;
        public char icmpv6_echo_ignore_anycast;
        public @Unsigned long @Size(value=4) [] icmpv6_ratemask;
        public Ptr<@Unsigned Long> icmpv6_ratemask_ptr;
        public char anycast_src_echo_reply;
        public char ip_nonlocal_bind;
        public char fwmark_reflect;
        public char flowlabel_state_ranges;
        public int idgen_retries;
        public int idgen_delay;
        public int flowlabel_reflect;
        public int max_dst_opts_cnt;
        public int max_hbh_opts_cnt;
        public int max_dst_opts_len;
        public int max_hbh_opts_len;
        public int seg6_flowlabel;
        public @Unsigned int ioam6_id;
        public @Unsigned long ioam6_id_wide;
        public char skip_notify_on_dev_down;
        public char fib_notify_on_flag_change;
        public char icmpv6_error_anycast_as_unicast;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_ipv4")
    @NotUsableInJava
    public static class netns_ipv4
    extends Struct {
        public char @Size(value=0) [] __cacheline_group_begin__netns_ipv4_read_tx;
        public char sysctl_tcp_early_retrans;
        public char sysctl_tcp_tso_win_divisor;
        public char sysctl_tcp_tso_rtt_log;
        public char sysctl_tcp_autocorking;
        public int sysctl_tcp_min_snd_mss;
        public @Unsigned int sysctl_tcp_notsent_lowat;
        public int sysctl_tcp_limit_output_bytes;
        public int sysctl_tcp_min_rtt_wlen;
        public int @Size(value=3) [] sysctl_tcp_wmem;
        public char sysctl_ip_fwd_use_pmtu;
        public char @Size(value=0) [] __cacheline_group_end__netns_ipv4_read_tx;
        public char @Size(value=0) [] __cacheline_group_begin__netns_ipv4_read_txrx;
        public char sysctl_tcp_moderate_rcvbuf;
        public char @Size(value=0) [] __cacheline_group_end__netns_ipv4_read_txrx;
        public char @Size(value=0) [] __cacheline_group_begin__netns_ipv4_read_rx;
        public char sysctl_ip_early_demux;
        public char sysctl_tcp_early_demux;
        public int sysctl_tcp_reordering;
        public int @Size(value=3) [] sysctl_tcp_rmem;
        public char @Size(value=0) [] __cacheline_group_end__netns_ipv4_read_rx;
        public InetDefinitions.inet_timewait_death_row tcp_death_row;
        public Ptr<UdpDefinitions.udp_table> udp_table;
        public Ptr<misc.ctl_table_header> forw_hdr;
        public Ptr<misc.ctl_table_header> frags_hdr;
        public Ptr<misc.ctl_table_header> ipv4_hdr;
        public Ptr<misc.ctl_table_header> route_hdr;
        public Ptr<misc.ctl_table_header> xfrm4_hdr;
        public Ptr<Ipv4Definitions.ipv4_devconf> devconf_all;
        public Ptr<Ipv4Definitions.ipv4_devconf> devconf_dflt;
        public Ptr<IpDefinitions.ip_ra_chain> ra_chain;
        public runtime.mutex ra_mutex;
        public Ptr<FibDefinitions.fib_rules_ops> rules_ops;
        public Ptr<FibDefinitions.fib_table> fib_main;
        public Ptr<FibDefinitions.fib_table> fib_default;
        public @Unsigned int fib_rules_require_fldissect;
        public boolean fib_has_custom_rules;
        public boolean fib_has_custom_local_routes;
        public boolean fib_offload_disabled;
        public char sysctl_tcp_shrink_window;
        public AtomicDefinitions.atomic_t fib_num_tclassid_users;
        public Ptr<misc.hlist_head> fib_table_hash;
        public Ptr<runtime.sock> fibnl;
        public Ptr<runtime.sock> mc_autojoin_sk;
        public Ptr<InetDefinitions.inet_peer_base> peers;
        public Ptr<runtime.fqdir> fqdir;
        public char sysctl_icmp_echo_ignore_all;
        public char sysctl_icmp_echo_enable_probe;
        public char sysctl_icmp_echo_ignore_broadcasts;
        public char sysctl_icmp_ignore_bogus_error_responses;
        public char sysctl_icmp_errors_use_inbound_ifaddr;
        public int sysctl_icmp_ratelimit;
        public int sysctl_icmp_ratemask;
        public int sysctl_icmp_msgs_per_sec;
        public int sysctl_icmp_msgs_burst;
        public AtomicDefinitions.atomic_t icmp_global_credit;
        public @Unsigned int icmp_global_stamp;
        public @Unsigned int ip_rt_min_pmtu;
        public int ip_rt_mtu_expires;
        public int ip_rt_min_advmss;
        public LocalDefinitions.local_ports ip_local_ports;
        public char sysctl_tcp_ecn;
        public char sysctl_tcp_ecn_fallback;
        public char sysctl_ip_default_ttl;
        public char sysctl_ip_no_pmtu_disc;
        public char sysctl_ip_fwd_update_priority;
        public char sysctl_ip_nonlocal_bind;
        public char sysctl_ip_autobind_reuse;
        public char sysctl_ip_dynaddr;
        public char sysctl_raw_l3mdev_accept;
        public char sysctl_udp_early_demux;
        public char sysctl_nexthop_compat_mode;
        public char sysctl_fwmark_reflect;
        public char sysctl_tcp_fwmark_accept;
        public char sysctl_tcp_l3mdev_accept;
        public char sysctl_tcp_mtu_probing;
        public int sysctl_tcp_mtu_probe_floor;
        public int sysctl_tcp_base_mss;
        public int sysctl_tcp_probe_threshold;
        public @Unsigned int sysctl_tcp_probe_interval;
        public int sysctl_tcp_keepalive_time;
        public int sysctl_tcp_keepalive_intvl;
        public char sysctl_tcp_keepalive_probes;
        public char sysctl_tcp_syn_retries;
        public char sysctl_tcp_synack_retries;
        public char sysctl_tcp_syncookies;
        public char sysctl_tcp_migrate_req;
        public char sysctl_tcp_comp_sack_nr;
        public char sysctl_tcp_backlog_ack_defer;
        public char sysctl_tcp_pingpong_thresh;
        public char sysctl_tcp_retries1;
        public char sysctl_tcp_retries2;
        public char sysctl_tcp_orphan_retries;
        public char sysctl_tcp_tw_reuse;
        public int sysctl_tcp_fin_timeout;
        public char sysctl_tcp_sack;
        public char sysctl_tcp_window_scaling;
        public char sysctl_tcp_timestamps;
        public int sysctl_tcp_rto_min_us;
        public char sysctl_tcp_recovery;
        public char sysctl_tcp_thin_linear_timeouts;
        public char sysctl_tcp_slow_start_after_idle;
        public char sysctl_tcp_retrans_collapse;
        public char sysctl_tcp_stdurg;
        public char sysctl_tcp_rfc1337;
        public char sysctl_tcp_abort_on_overflow;
        public char sysctl_tcp_fack;
        public int sysctl_tcp_max_reordering;
        public int sysctl_tcp_adv_win_scale;
        public char sysctl_tcp_dsack;
        public char sysctl_tcp_app_win;
        public char sysctl_tcp_frto;
        public char sysctl_tcp_nometrics_save;
        public char sysctl_tcp_no_ssthresh_metrics_save;
        public char sysctl_tcp_workaround_signed_windows;
        public int sysctl_tcp_challenge_ack_limit;
        public char sysctl_tcp_min_tso_segs;
        public char sysctl_tcp_reflect_tos;
        public int sysctl_tcp_invalid_ratelimit;
        public int sysctl_tcp_pacing_ss_ratio;
        public int sysctl_tcp_pacing_ca_ratio;
        public @Unsigned int sysctl_tcp_child_ehash_entries;
        public @Unsigned long sysctl_tcp_comp_sack_delay_ns;
        public @Unsigned long sysctl_tcp_comp_sack_slack_ns;
        public int sysctl_max_syn_backlog;
        public int sysctl_tcp_fastopen;
        public Ptr<TcpDefinitions.tcp_congestion_ops> tcp_congestion_control;
        public Ptr<TcpDefinitions.tcp_fastopen_context> tcp_fastopen_ctx;
        public @Unsigned int sysctl_tcp_fastopen_blackhole_timeout;
        public AtomicDefinitions.atomic_t tfo_active_disable_times;
        public @Unsigned long tfo_active_disable_stamp;
        public @Unsigned int tcp_challenge_timestamp;
        public @Unsigned int tcp_challenge_count;
        public char sysctl_tcp_plb_enabled;
        public char sysctl_tcp_plb_idle_rehash_rounds;
        public char sysctl_tcp_plb_rehash_rounds;
        public char sysctl_tcp_plb_suspend_rto_sec;
        public int sysctl_tcp_plb_cong_thresh;
        public int sysctl_udp_wmem_min;
        public int sysctl_udp_rmem_min;
        public char sysctl_fib_notify_on_flag_change;
        public char sysctl_tcp_syn_linear_timeouts;
        public char sysctl_udp_l3mdev_accept;
        public char sysctl_igmp_llm_reports;
        public int sysctl_igmp_max_memberships;
        public int sysctl_igmp_max_msf;
        public int sysctl_igmp_qrv;
        public PingDefinitions.ping_group_range ping_group_range;
        public AtomicDefinitions.atomic_t dev_addr_genid;
        public @Unsigned int sysctl_udp_child_hash_entries;
        public Ptr<@Unsigned Long> sysctl_local_reserved_ports;
        public int sysctl_ip_prot_sock;
        public ListDefinitions.list_head mr_tables;
        public Ptr<FibDefinitions.fib_rules_ops> mr_rules_ops;
        public SysctlDefinitions.sysctl_fib_multipath_hash_seed sysctl_fib_multipath_hash_seed;
        public @Unsigned int sysctl_fib_multipath_hash_fields;
        public char sysctl_fib_multipath_use_neigh;
        public char sysctl_fib_multipath_hash_policy;
        public Ptr<FibDefinitions.fib_notifier_ops> notifier_ops;
        public @Unsigned int fib_seq;
        public Ptr<FibDefinitions.fib_notifier_ops> ipmr_notifier_ops;
        public @Unsigned int ipmr_seq;
        public AtomicDefinitions.atomic_t rt_genid;
        public misc.siphash_key_t ip_id_key;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_packet")
    @NotUsableInJava
    public static class netns_packet
    extends Struct {
        public runtime.mutex sklist_lock;
        public misc.hlist_head sklist;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_unix")
    @NotUsableInJava
    public static class netns_unix
    extends Struct {
        public UnixDefinitions.unix_table table;
        public int sysctl_max_dgram_qlen;
        public Ptr<misc.ctl_table_header> ctl;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_mib")
    @NotUsableInJava
    public static class netns_mib
    extends Struct {
        public Ptr<misc.ipstats_mib> ip_statistics;
        public Ptr<misc.ipstats_mib> ipv6_statistics;
        public Ptr<TcpDefinitions.tcp_mib> tcp_statistics;
        public Ptr<LinuxDefinitions.linux_mib> net_statistics;
        public Ptr<UdpDefinitions.udp_mib> udp_statistics;
        public Ptr<UdpDefinitions.udp_mib> udp_stats_in6;
        public Ptr<LinuxDefinitions.linux_xfrm_mib> xfrm_statistics;
        public Ptr<LinuxDefinitions.linux_tls_mib> tls_statistics;
        public Ptr<MptcpDefinitions.mptcp_mib> mptcp_statistics;
        public Ptr<UdpDefinitions.udp_mib> udplite_statistics;
        public Ptr<UdpDefinitions.udp_mib> udplite_stats_in6;
        public Ptr<IcmpDefinitions.icmp_mib> icmp_statistics;
        public Ptr<misc.icmpmsg_mib> icmpmsg_statistics;
        public Ptr<Icmpv6Definitions.icmpv6_mib> icmpv6_statistics;
        public Ptr<misc.icmpv6msg_mib> icmpv6msg_statistics;
        public Ptr<ProcDefinitions.proc_dir_entry> proc_net_devsnmp6;
    }

    @Type(noCCodeGeneration=true, cType="struct netns_core")
    @NotUsableInJava
    public static class netns_core
    extends Struct {
        public Ptr<misc.ctl_table_header> sysctl_hdr;
        public int sysctl_somaxconn;
        public int sysctl_optmem_max;
        public char sysctl_txrehash;
        public Ptr<misc.prot_inuse> prot_inuse;
        public Ptr<runtime.cpumask> rps_default_mask;
    }
}

